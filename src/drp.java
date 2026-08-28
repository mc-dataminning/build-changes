import com.mojang.serialization.MapCodec;

public class drp extends dke {
   public static final MapCodec<drp> a = b(drp::new);
   public static final int b = 2;
   public static final dym c = dyd.aF;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final fcm g = dke.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<drp> a() {
      return a;
   }

   public drp(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(c);
   }

   @Override
   public fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return g;
   }

   public int o(dxn $$0) {
      return $$0.c(c);
   }

   private boolean q(dxn $$0) {
      return this.o($$0) == 2;
   }

   @Override
   public void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      if (!this.q($$0)) {
         $$1.a(null, $$2, axf.yW, axg.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.b(c, Integer.valueOf(this.o($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, axf.yX, axg.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         ckj $$4 = bvm.bj.a($$1, bvl.e);
         if ($$4 != null) {
            fbs $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), bae.h($$1.A.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.B_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(ecj.i, $$2, ecj.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.A.a(300));
   }

   @Override
   public boolean a(dxn $$0, eue $$1) {
      return false;
   }

   public static boolean a(dgf $$0, jh $$1) {
      return $$0.a_($$1.e()).a(axu.cv);
   }
}
