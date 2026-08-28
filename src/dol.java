import com.mojang.serialization.MapCodec;

public class dol extends dkg {
   public static final MapCodec<dol> a = b(dol::new);
   public static final dwa b = dvz.s;
   public static final dwj e = dvz.aA;

   @Override
   public MapCodec<dol> a() {
      return a;
   }

   protected dol(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jm.c).b(e, Integer.valueOf(1)).b(b, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if (!$$3.gl().e) {
         return bsd.e;
      } else {
         $$1.a($$2, $$0.a(e), 3);
         return bsd.a;
      }
   }

   @Override
   protected int h(dvj $$0) {
      return $$0.c(e) * 2;
   }

   @Override
   public dvj a(czs $$0) {
      dvj $$1 = super.a($$0);
      return $$1.b(b, Boolean.valueOf(this.c($$0.q(), $$0.a(), $$1)));
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$1 == jm.a && !this.b($$3, $$5, $$2)) {
         return dig.a.m();
      } else {
         return !$$3.y_() && $$1.o() != $$0.c(aF).o() ? $$0.b(b, Boolean.valueOf(this.c($$3, $$4, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean c(dfe $$0, jh $$1, dvj $$2) {
      return this.a((dfs)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(dvj $$0, dfb $$1, jh $$2, azs $$3) {
      if ($$0.c(d)) {
         jm $$4 = $$0.c(aF);
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
         $$1.a(lm.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(aF, e, b, d);
   }
}
