import com.mojang.serialization.MapCodec;

public class drw extends dkl {
   public static final MapCodec<drw> a = b(drw::new);
   public static final int b = 2;
   public static final dyt c = dyk.aF;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final fcr g = dkl.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<drw> a() {
      return a;
   }

   public drw(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(c);
   }

   @Override
   public fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return g;
   }

   public int o(dxu $$0) {
      return $$0.c(c);
   }

   private boolean q(dxu $$0) {
      return this.o($$0) == 2;
   }

   @Override
   public void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      if (!this.q($$0)) {
         $$1.a(null, $$2, axf.yX, axg.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.b(c, Integer.valueOf(this.o($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, axf.yY, axg.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         ckn $$4 = bvq.bj.a($$1, bvp.e);
         if ($$4 != null) {
            fbx $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), bae.h($$1.A.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.B_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(ecq.i, $$2, ecq.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.A.a(300));
   }

   @Override
   public boolean a(dxu $$0, eul $$1) {
      return false;
   }

   public static boolean a(dgm $$0, jh $$1) {
      return $$0.a_($$1.e()).a(axu.cv);
   }
}
