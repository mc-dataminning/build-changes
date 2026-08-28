import com.mojang.serialization.MapCodec;

public class dsn extends dko implements dkh {
   public static final MapCodec<dsn> a = b(dsn::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dyq c = dyg.av;
   private static final fcr e = dke.b(10.0, 0.0, 8.0);
   private static final fcr f = dke.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dsn> a() {
      return a;
   }

   public dsn(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected cxh a(dhc $$0, ji $$1, dxq $$2, boolean $$3) {
      return new cxh(cxl.xx);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return switch ($$0.c(c)) {
         case 0 -> e;
         case 3 -> fco.b();
         default -> f;
      };
   }

   @Override
   protected boolean f(dxq $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dxq $$0, ard $$1, ji $$2, azh $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.d(), 0) >= 9) {
         dxq $$5 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(ecp.c, $$2, ecp.a.a($$5));
      }
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, bva $$3) {
      if ($$3 instanceof bvy && $$3.aq() != bvi.aa && $$3.aq() != bvi.l) {
         $$3.a($$0, new fbx(0.8F, 0.75, 0.8F));
         if ($$1 instanceof ard $$4 && $$0.c(c) != 0) {
            fbx $$6 = $$3.L_() ? $$3.ah() : $$3.bA().d($$3.ds());
            if ($$6.j() > 0.0) {
               double $$7 = Math.abs($$6.a());
               double $$8 = Math.abs($$6.c());
               if ($$7 >= 0.003F || $$8 >= 0.003F) {
                  $$3.a($$4, $$1.al().u(), 1.0F);
               }
            }

            return;
         }
      }
   }

   @Override
   protected bsy a(cxh $$0, dxq $$1, dgz $$2, ji $$3, cpr $$4, bsx $$5, fbt $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return (bsy)(!$$8 && $$0.a(cxl.sx) ? bsy.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.A.a(2);
         a($$1, $$2, new cxh(cxl.xx, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, awa.Aq, awb.e, 1.0F, 0.8F + $$1.A.i() * 0.4F);
         dxq $$8 = $$0.b(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(ecp.c, $$2, ecp.a.a($$3, $$8));
         return bsy.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean a(dhc $$0, ji $$1, dxq $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(dgz $$0, azh $$1, ji $$2, dxq $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dxq $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.b(c, Integer.valueOf($$4)), 2);
   }
}
