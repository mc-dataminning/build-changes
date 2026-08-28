import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dfh(deo d, deo e, kn f, Optional<efs> g, elw h, Optional<js<edm>> i) implements dey {
   public static final MapCodec<dfh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               deo.b.fieldOf("radius").forGetter(dfh::b),
               deo.b.fieldOf("height").forGetter(dfh::c),
               kn.g.optionalFieldOf("offset", kn.i).forGetter(dfh::d),
               efs.b.optionalFieldOf("predicate").forGetter(dfh::e),
               elw.a.fieldOf("block_state").forGetter(dfh::f),
               edm.aj.optionalFieldOf("trigger_game_event").forGetter(dfh::g)
            )
            .apply($$0, dfh::new)
   );

   @Override
   public void a(arn $$0, int $$1, deg $$2, bvs $$3, fcu $$4) {
      jj $$5 = jj.a((kc)$$4).a(this.f);
      azs $$6 = $$3.dY();
      int $$7 = (int)this.d.a($$1);
      int $$8 = (int)this.e.a($$1);

      for (jj $$9 : jj.c($$5.b(-$$7, 0, -$$7), $$5.b($$7, Math.min($$8 - 1, 0), $$7))) {
         if ($$9.c($$4.a(), (double)$$9.v() + 0.5, $$4.c()) < (double)azk.h($$7)
            && this.g.map($$2x -> $$2x.test($$0, $$9)).orElse(true)
            && $$0.b($$9, this.h.a($$6, $$9))) {
            this.i.ifPresent($$3x -> $$0.a($$3, $$3x, $$9));
         }
      }
   }

   @Override
   public MapCodec<dfh> a() {
      return a;
   }

   public deo b() {
      return this.d;
   }

   public deo c() {
      return this.e;
   }

   public kn d() {
      return this.f;
   }

   public Optional<efs> e() {
      return this.g;
   }

   public elw f() {
      return this.h;
   }

   public Optional<js<edm>> g() {
      return this.i;
   }
}
