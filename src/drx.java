import com.mojang.serialization.MapCodec;

public class drx extends dkm {
   public static final MapCodec<drx> a = b(drx::new);
   public static final int b = 2;
   public static final dyu c = dyl.aF;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final fcs g = dkm.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<drx> a() {
      return a;
   }

   public drx(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(c);
   }

   @Override
   public fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return g;
   }

   public int o(dxv $$0) {
      return $$0.c(c);
   }

   private boolean q(dxv $$0) {
      return this.o($$0) == 2;
   }

   @Override
   public void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if (!this.q($$0)) {
         $$1.a(null, $$2, axf.yX, axg.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.b(c, Integer.valueOf(this.o($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, axf.yY, axg.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         cko $$4 = bvr.bj.a($$1, bvq.e);
         if ($$4 != null) {
            fby $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), bae.h($$1.A.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.B_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(ecr.i, $$2, ecr.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.A.a(300));
   }

   @Override
   public boolean a(dxv $$0, eum $$1) {
      return false;
   }

   public static boolean a(dgn $$0, jh $$1) {
      return $$0.a_($$1.e()).a(axu.cv);
   }
}
