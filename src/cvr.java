import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cvr extends crv<ddt> implements dab {
   public static final MapCodec<cvr> b = b(cvr::new);
   public static final dfx c = cww.aE;
   public static final dfu d = dft.C;
   protected static final eia e = ctc.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final tl f = tl.c("container.enderchest");

   @Override
   public MapCodec<cvr> a() {
      return b;
   }

   protected cvr(dfc.d $$0) {
      super($$0, () -> ddb.d);
      this.k(this.E.b().a(c, ha.c).a(d, Boolean.valueOf(false)));
   }

   @Override
   public cvh.c<? extends ddg> a(dfd $$0, cqb $$1, gw $$2, boolean $$3) {
      return cvh.b::b;
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return e;
   }

   @Override
   public czg b_(dfd $$0) {
      return czg.b;
   }

   @Override
   public dfd a(clt $$0) {
      eag $$1 = $$0.q().b_($$0.a());
      return this.o().a(c, $$0.g().g()).a(d, Boolean.valueOf($$1.a() == eah.c));
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      cga $$6 = $$3.gf();
      dcz $$7 = $$1.c_($$2);
      if ($$6 != null && $$7 instanceof ddt) {
         gw $$8 = $$2.c();
         if ($$1.a_($$8).g($$1, $$8)) {
            return bhe.a($$1.B);
         } else if ($$1.B) {
            return bhe.a;
         } else {
            ddt $$9 = (ddt)$$7;
            $$6.a($$9);
            $$3.a(new bhm(($$1x, $$2x, $$3x) -> cey.a($$1x, $$2x, $$6), f));
            $$3.a(apq.aj);
            car.a($$3, true);
            return bhe.b;
         }
      } else {
         return bhe.a($$1.B);
      }
   }

   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new ddt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcz> dda<T> a(cqb $$0, dfd $$1, ddb<T> $$2) {
      return $$0.B ? a($$2, ddb.d, ddt::a) : null;
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ash $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(iv.X, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(c, d);
   }

   @Override
   public eag c_(dfd $$0) {
      return $$0.c(d) ? eah.c.a(false) : super.c_($$0);
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eah.c, eah.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      dcz $$4 = $$1.c_($$2);
      if ($$4 instanceof ddt) {
         ((ddt)$$4).c();
      }
   }
}
