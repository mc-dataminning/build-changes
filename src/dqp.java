import com.mojang.serialization.MapCodec;

public class dqp extends dkl {
   public static final MapCodec<dqp> a = b(dqp::new);
   public static final dyl b = dqs.d;

   @Override
   public MapCodec<dqp> a() {
      return a;
   }

   public dqp(dxt.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a_(dxu $$0, dhh $$1, jh $$2, cpw $$3) {
      e($$0, $$1, $$2);
      super.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dhh $$0, jh $$1, dxu $$2, bvj $$3) {
      if (!$$3.ce()) {
         e($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bti a(cxo $$0, dxu $$1, dhh $$2, jh $$3, cpw $$4, bth $$5, fbt $$6) {
      if ($$2.C) {
         a($$2, $$3);
      } else {
         e($$1, $$2, $$3);
      }

      return (bti)($$0.h() instanceof cvu && new dbf($$4, $$5, $$0, $$6).b() ? bti.e : bti.a);
   }

   private static void e(dxu $$0, dhh $$1, jh $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean f(dxu $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(dxu $$0, ash $$1, jh $$2, bam $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, cxo $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bst.a(1, 5));
      }
   }

   @Override
   public void a(dxu $$0, dhh $$1, jh $$2, bam $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(dhh $$0, jh $$1) {
      double $$2 = 0.5625;
      bam $$3 = $$0.A;

      for (jm $$4 : jm.values()) {
         jh $$5 = $$1.a($$4);
         if (!$$0.a_($$5).s()) {
            jm.a $$6 = $$4.o();
            double $$7 = $$6 == jm.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == jm.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == jm.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(ln.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b);
   }
}
