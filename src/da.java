import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record da(de.d c, Optional<bu> d) implements bv {
   public static final MapCodec<da> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(de.d.d.optionalFieldOf("blocks_set_on_fire", de.d.c).forGetter(da::b), bu.a.optionalFieldOf("entity_struck").forGetter(da::c))
            .apply($$0, da::new)
   );

   public static da a(de.d $$0) {
      return new da($$0, Optional.empty());
   }

   @Override
   public MapCodec<da> a() {
      return bw.a;
   }

   @Override
   public boolean a(bsd $$0, aqk $$1, @Nullable evz $$2) {
      return !($$0 instanceof bsx $$3) ? false : this.c.d($$3.s()) && (this.d.isEmpty() || $$3.u().anyMatch($$2x -> this.d.get().a($$1, $$2, $$2x)));
   }

   public de.d b() {
      return this.c;
   }

   public Optional<bu> c() {
      return this.d;
   }
}
