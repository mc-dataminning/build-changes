import com.mojang.serialization.MapCodec;

public class dfx extends ddu {
   public static final MapCodec<dfx> d = b(dfx::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<dfx> a() {
      return d;
   }

   public dfx(dtb.d $$0) {
      super($$0, jx.c);
   }

   @Override
   public boolean d(dtc $$0) {
      return false;
   }

   protected static boolean a(dca $$0, dcz.c $$1) {
      if ($$1 == dcz.c.b) {
         return $$0.F_().i() < 0.05F;
      } else {
         return $$1 == dcz.c.c ? $$0.F_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dtc $$0, dca $$1, ir $$2, dcz.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == dcz.c.b) {
            $$1.b($$2, dfe.gm.n());
            $$1.a(null, dxv.c, $$2);
         } else if ($$3 == dcz.c.c) {
            $$1.b($$2, dfe.go.n());
            $$1.a(null, dxv.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(epd $$0) {
      return true;
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, epd $$3) {
      if ($$3 == epf.c) {
         dtc $$4 = dfe.gm.n();
         $$1.b($$2, $$4);
         $$1.a(dxv.c, $$2, dxv.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == epf.e) {
         dtc $$5 = dfe.gn.n();
         $$1.b($$2, $$5);
         $$1.a(dxv.c, $$2, dxv.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
