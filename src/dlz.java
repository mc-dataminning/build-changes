import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlz extends dcq {
   public static final MapCodec<dlz> a = b(dlz::new);
   public static final drk<dpu> b = dqx.bz;
   public static final drb c = dha.aE;

   @Override
   public MapCodec<dlz> a() {
      return a;
   }

   public dlz(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, is.c).a(b, dpu.a));
   }

   @Override
   public bpo a(csz $$0, dqh $$1, dad $$2, in $$3, clh $$4, bpl $$5, etl $$6) {
      if ($$0.d() || $$1.c(b) != dpu.b) {
         return bpo.d;
      } else if ($$2 instanceof aqh $$7) {
         if ($$7.c_($$3) instanceof dpp $$9) {
            dpp.b.a($$7, $$3, $$1, $$9.f(), $$9.b(), $$9.c(), $$4, $$0);
            return bpo.a;
         } else {
            return bpo.d;
         }
      } else {
         return bpo.b;
      }
   }

   @Nullable
   @Override
   public dnm a(in $$0, dqh $$1) {
      return new dpp($$0, $$1);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(c, b);
   }

   @Nullable
   @Override
   public <T extends dnm> dnn<T> a(dad $$0, dqh $$1, dno<T> $$2) {
      return $$0 instanceof aqh $$3
         ? a($$2, dno.R, ($$1x, $$2x, $$3x, $$4) -> dpp.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, dno.R, ($$0x, $$1x, $$2x, $$3x) -> dpp.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dqh a(cwi $$0) {
      return this.n().a(c, $$0.g().g());
   }

   @Override
   public dqh a(dqh $$0, djr $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public djk a_(dqh $$0) {
      return djk.c;
   }
}
