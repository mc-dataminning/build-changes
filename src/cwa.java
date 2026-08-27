import com.mojang.serialization.MapCodec;

public class cwa extends cty {
   public static final MapCodec<cwa> d = b(cwa::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<cwa> a() {
      return d;
   }

   public cwa(dhm.d $$0) {
      super($$0, jc.c);
   }

   @Override
   public boolean d(dhn $$0) {
      return false;
   }

   protected static boolean a(csf $$0, ctd.c $$1) {
      if ($$1 == ctd.c.b) {
         return $$0.F_().i() < 0.05F;
      } else {
         return $$1 == ctd.c.c ? $$0.F_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, ctd.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == ctd.c.b) {
            $$1.b($$2, cvh.fu.o());
            $$1.a(null, dlx.c, $$2);
         } else if ($$3 == ctd.c.c) {
            $$1.b($$2, cvh.fw.o());
            $$1.a(null, dlx.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(ecw $$0) {
      return true;
   }

   @Override
   protected void a(dhn $$0, csf $$1, hx $$2, ecw $$3) {
      if ($$3 == ecy.c) {
         dhn $$4 = cvh.fu.o();
         $$1.b($$2, $$4);
         $$1.a(dlx.c, $$2, dlx.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == ecy.e) {
         dhn $$5 = cvh.fv.o();
         $$1.b($$2, $$5);
         $$1.a(dlx.c, $$2, dlx.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
