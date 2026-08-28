import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record ct(cx.d c, Optional<bz> d) implements ca {
   public static final MapCodec<ct> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cx.d.d.optionalFieldOf("blocks_set_on_fire", cx.d.c).forGetter(ct::b), bz.a.optionalFieldOf("entity_struck").forGetter(ct::c))
            .apply($$0, ct::new)
   );

   public static ct a(cx.d $$0) {
      return new ct($$0, Optional.empty());
   }

   @Override
   public MapCodec<ct> a() {
      return cb.a;
   }

   @Override
   public boolean a(bxe $$0, asb $$1, @Nullable fgc $$2) {
      return !($$0 instanceof bye $$3) ? false : this.c.d($$3.g()) && (this.d.isEmpty() || $$3.j().anyMatch($$2x -> this.d.get().a($$1, $$2, $$2x)));
   }

   public cx.d b() {
      return this.c;
   }

   public Optional<bz> c() {
      return this.d;
   }
}
