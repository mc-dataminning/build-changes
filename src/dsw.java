import com.mojang.serialization.MapCodec;

public class dsw extends dkm {
   public static final MapCodec<dsw> a = b(dsw::new);
   private static final dyu b = dyl.aU;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dsw> a() {
      return a;
   }

   public dsw(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dhi $$0, dxv $$1, fbu $$2, cqq $$3) {
      int $$4 = a((dhj)$$0, $$1, $$2, (bvk)$$3);
      if ($$3.p() instanceof asi $$6) {
         $$6.a(axp.aE);
         ao.M.a($$6, $$3, $$2.g(), $$4);
      }
   }

   private static int a(dhj $$0, dxv $$1, fbu $$2, bvk $$3) {
      int $$4 = a($$2, $$2.g());
      int $$5 = $$3 instanceof cqe ? 20 : 8;
      if (!$$0.T().a($$2.b(), $$1.b())) {
         a($$0, $$1, $$4, $$2.b(), $$5);
      }

      return $$4;
   }

   private static int a(fbu $$0, fby $$1) {
      jm $$2 = $$0.c();
      double $$3 = Math.abs(bae.e($$1.d) - 0.5);
      double $$4 = Math.abs(bae.e($$1.e) - 0.5);
      double $$5 = Math.abs(bae.e($$1.f) - 0.5);
      jm.a $$6 = $$2.o();
      double $$7;
      if ($$6 == jm.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == jm.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, bae.c(15.0 * bae.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(dhj $$0, dxv $$1, int $$2, jh $$3, int $$4) {
      $$0.a($$3, $$1.b(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   protected int a(dxv $$0, dgn $$1, jh $$2, jm $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean f_(dxv $$0) {
      return true;
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b);
   }

   @Override
   protected void b(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      if (!$$1.B_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.T().a($$2, this)) {
            $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 18);
         }
      }
   }
}
