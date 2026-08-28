import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dgz(dbk d, ka e, Optional<jf<efo>> f) implements dgo {
   public static final MapCodec<dgz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dbk.b.fieldOf("properties").forGetter(dgz::b),
               ka.g.optionalFieldOf("offset", ka.i).forGetter(dgz::c),
               efo.aj.optionalFieldOf("trigger_game_event").forGetter(dgz::d)
            )
            .apply($$0, dgz::new)
   );

   public dgz(dbk $$0) {
      this($$0, ka.i, Optional.of(efo.c));
   }

   @Override
   public void a(arq $$0, int $$1, dfw $$2, bwi $$3, fex $$4) {
      iv $$5 = iv.a((jp)$$4).a(this.e);
      eao $$6 = $$3.dU().a_($$5);
      eao $$7 = this.d.a($$6);
      if ($$6 != $$7 && $$3.dU().a($$5, $$7, 3)) {
         this.f.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dgz> a() {
      return a;
   }

   public dbk b() {
      return this.d;
   }

   public ka c() {
      return this.e;
   }

   public Optional<jf<efo>> d() {
      return this.f;
   }
}
