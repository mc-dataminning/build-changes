import com.mojang.serialization.MapCodec;

public class dqq extends dkm {
   public static final MapCodec<dqq> a = b(dqq::new);
   public static final dym b = dqt.d;

   @Override
   public MapCodec<dqq> a() {
      return a;
   }

   public dqq(dxu.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a_(dxv $$0, dhi $$1, jh $$2, cpx $$3) {
      e($$0, $$1, $$2);
      super.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dhi $$0, jh $$1, dxv $$2, bvk $$3) {
      if (!$$3.ce()) {
         e($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected btj a(cxp $$0, dxv $$1, dhi $$2, jh $$3, cpx $$4, bti $$5, fbu $$6) {
      if ($$2.C) {
         a($$2, $$3);
      } else {
         e($$1, $$2, $$3);
      }

      return (btj)($$0.h() instanceof cvv && new dbg($$4, $$5, $$0, $$6).b() ? btj.e : btj.a);
   }

   private static void e(dxv $$0, dhi $$1, jh $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean f(dxv $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, cxp $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bsu.a(1, 5));
      }
   }

   @Override
   public void a(dxv $$0, dhi $$1, jh $$2, bam $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(dhi $$0, jh $$1) {
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
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b);
   }
}
