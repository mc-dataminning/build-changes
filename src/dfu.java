import com.mojang.serialization.MapCodec;

public class dfu extends dds {
   public static final MapCodec<dfu> d = b(dfu::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<dfu> a() {
      return d;
   }

   public dfu(dsb.d $$0) {
      super($$0, kf.c);
   }

   @Override
   public boolean d(dsc $$0) {
      return false;
   }

   protected static boolean a(dby $$0, dcx.c $$1) {
      if ($$1 == dcx.c.b) {
         return $$0.E_().i() < 0.05F;
      } else {
         return $$1 == dcx.c.c ? $$0.E_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dsc $$0, dby $$1, iz $$2, dcx.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == dcx.c.b) {
            $$1.b($$2, dfb.fu.o());
            $$1.a(null, dwv.c, $$2);
         } else if ($$3 == dcx.c.c) {
            $$1.b($$2, dfb.fw.o());
            $$1.a(null, dwv.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(enu $$0) {
      return true;
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, enu $$3) {
      if ($$3 == enw.c) {
         dsc $$4 = dfb.fu.o();
         $$1.b($$2, $$4);
         $$1.a(dwv.c, $$2, dwv.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == enw.e) {
         dsc $$5 = dfb.fv.o();
         $$1.b($$2, $$5);
         $$1.a(dwv.c, $$2, dwv.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
