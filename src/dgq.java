import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dgq(dfx d, dfx e, jz f, Optional<ehn> g, enr h, Optional<je<efh>> i) implements dgh {
   public static final MapCodec<dgq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dfx.b.fieldOf("radius").forGetter(dgq::b),
               dfx.b.fieldOf("height").forGetter(dgq::c),
               jz.g.optionalFieldOf("offset", jz.i).forGetter(dgq::d),
               ehn.b.optionalFieldOf("predicate").forGetter(dgq::e),
               enr.a.fieldOf("block_state").forGetter(dgq::f),
               efh.aj.optionalFieldOf("trigger_game_event").forGetter(dgq::g)
            )
            .apply($$0, dgq::new)
   );

   @Override
   public void a(arq $$0, int $$1, dfp $$2, bwf $$3, feq $$4) {
      iu $$5 = iu.a((jo)$$4).a(this.f);
      azv $$6 = $$3.dY();
      int $$7 = (int)this.d.a($$1);
      int $$8 = (int)this.e.a($$1);

      for (iu $$9 : iu.c($$5.b(-$$7, 0, -$$7), $$5.b($$7, Math.min($$8 - 1, 0), $$7))) {
         if ($$9.c($$4.a(), (double)$$9.v() + 0.5, $$4.c()) < (double)azm.h($$7)
            && this.g.map($$2x -> $$2x.test($$0, $$9)).orElse(true)
            && $$0.b($$9, this.h.a($$6, $$9))) {
            this.i.ifPresent($$3x -> $$0.a($$3, $$3x, $$9));
         }
      }
   }

   @Override
   public MapCodec<dgq> a() {
      return a;
   }

   public dfx b() {
      return this.d;
   }

   public dfx c() {
      return this.e;
   }

   public jz d() {
      return this.f;
   }

   public Optional<ehn> e() {
      return this.g;
   }

   public enr f() {
      return this.h;
   }

   public Optional<je<efh>> g() {
      return this.i;
   }
}
