import com.mojang.serialization.MapCodec;

public class dof extends die {
   public static final MapCodec<dof> a = b(dof::new);
   public static final dwa b = doi.d;

   @Override
   public MapCodec<dof> a() {
      return a;
   }

   public dof(dvi.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a_(dvj $$0, dfb $$1, jh $$2, com $$3) {
      e($$0, $$1, $$2);
      super.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfb $$0, jh $$1, dvj $$2, bue $$3) {
      if (!$$3.cf()) {
         e($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bsd a(cwb $$0, dvj $$1, dfb $$2, jh $$3, com $$4, bsc $$5, ezj $$6) {
      if ($$2.C) {
         a($$2, $$3);
      } else {
         e($$1, $$2, $$3);
      }

      return (bsd)($$0.h() instanceof cuh && new czs($$4, $$5, $$0, $$6).b() ? bsd.e : bsd.a);
   }

   private static void e(dvj $$0, dfb $$1, jh $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean f(dvj $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, cwb $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bro.a(1, 5));
      }
   }

   @Override
   public void a(dvj $$0, dfb $$1, jh $$2, azs $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(dfb $$0, jh $$1) {
      double $$2 = 0.5625;
      azs $$3 = $$0.A;

      for (jm $$4 : jm.values()) {
         jh $$5 = $$1.a($$4);
         if (!$$0.a_($$5).s()) {
            jm.a $$6 = $$4.o();
            double $$7 = $$6 == jm.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == jm.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == jm.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(lm.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b);
   }
}
