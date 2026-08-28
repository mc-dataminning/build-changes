import com.mojang.serialization.MapCodec;

public class drs extends dke {
   public static final MapCodec<drs> a = b(drs::new);
   public static final int b = 2;
   public static final dyq c = dyg.aH;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final fcr g = dke.a(14.0, 12.0, 0.0, 16.0);

   @Override
   public MapCodec<drs> a() {
      return a;
   }

   public drs(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(c);
   }

   @Override
   public fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return g;
   }

   public int o(dxq $$0) {
      return $$0.c(c);
   }

   private boolean q(dxq $$0) {
      return this.o($$0) == 2;
   }

   @Override
   public void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if (!this.q($$0)) {
         $$1.a(null, $$2, awa.zw, awb.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.b(c, Integer.valueOf(this.o($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, awa.zx, awb.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         ckj $$4 = bvi.bi.a($$1, bvh.e);
         if ($$4 != null) {
            fbx $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), ayz.h($$1.A.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, dxq $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.w_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(ecp.i, $$2, ecp.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.A.a(300));
   }

   @Override
   public boolean a(dxq $$0, eul $$1) {
      return false;
   }

   public static boolean a(dgf $$0, ji $$1) {
      return $$0.a_($$1.e()).a(awp.cx);
   }
}
