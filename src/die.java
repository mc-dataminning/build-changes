import com.mojang.serialization.MapCodec;

public class die extends dea {
   public static final MapCodec<die> a = b(die::new);
   public static final dpq b = dpp.s;
   public static final dpz e = dpp.aA;

   @Override
   public MapCodec<die> a() {
      return a;
   }

   protected die(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ih.c).a(e, Integer.valueOf(1)).a(b, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if (!$$3.ga().e) {
         return boa.d;
      } else {
         $$1.a($$2, $$0.a(e), 3);
         return boa.a($$1.B);
      }
   }

   @Override
   protected int g(doz $$0) {
      return $$0.c(e) * 2;
   }

   @Override
   public doz a(cuo $$0) {
      doz $$1 = super.a($$0);
      return $$1.a(b, Boolean.valueOf(this.c($$0.q(), $$0.a(), $$1)));
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$1 == ih.a && !this.b($$3, $$5, $$2)) {
         return dca.a.n();
      } else {
         return !$$3.x_() && $$1.o() != $$0.c(aE).o() ? $$0.a(b, Boolean.valueOf(this.c($$3, $$4, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean c(cza $$0, ib $$1, doz $$2) {
      return this.a((czn)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(doz $$0, cyx $$1, ib $$2, axr $$3) {
      if ($$0.c(d)) {
         ih $$4 = $$0.c(aE);
         double $$5 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.v() + 0.4 + ($$3.j() - 0.5) * 0.2;
         double $$7 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         float $$8 = -5.0F;
         if ($$3.h()) {
            $$8 = (float)($$0.c(e) * 2 - 1);
         }

         $$8 /= 16.0F;
         double $$9 = (double)($$8 * (float)$$4.j());
         double $$10 = (double)($$8 * (float)$$4.l());
         $$1.a(kf.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(aE, e, b, d);
   }
}
