import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record cf(cj.d c, Optional<bo> d) implements bp {
   public static final MapCodec<cf> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aqy.a(cj.d.d, "blocks_set_on_fire", cj.d.c).forGetter(cf::b), aqy.a(bo.a, "entity_struck").forGetter(cf::c)).apply($$0, cf::new)
   );

   public static cf a(cj.d $$0) {
      return new cf($$0, Optional.empty());
   }

   @Override
   public bp.a a() {
      return bp.b.b;
   }

   @Override
   public boolean a(bii $$0, akk $$1, @Nullable ehd $$2) {
      return !($$0 instanceof bix $$3) ? false : this.c.d($$3.m()) && (this.d.isEmpty() || $$3.o().anyMatch($$2x -> this.d.get().a($$1, $$2, $$2x)));
   }

   public cj.d b() {
      return this.c;
   }

   public Optional<bo> c() {
      return this.d;
   }
}
