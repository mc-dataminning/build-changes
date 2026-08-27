import com.mojang.serialization.MapCodec;

public class cvv extends ctt {
   public static final MapCodec<cvv> d = b(cvv::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<cvv> a() {
      return d;
   }

   public cvv(dhh.d $$0) {
      super($$0, iy.c);
   }

   @Override
   public boolean d(dhi $$0) {
      return false;
   }

   protected static boolean a(csa $$0, csy.c $$1) {
      if ($$1 == csy.c.b) {
         return $$0.E_().i() < 0.05F;
      } else {
         return $$1 == csy.c.c ? $$0.E_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, csy.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == csy.c.b) {
            $$1.b($$2, cvc.fu.o());
            $$1.a(null, dls.c, $$2);
         } else if ($$3 == csy.c.c) {
            $$1.b($$2, cvc.fw.o());
            $$1.a(null, dls.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(ecr $$0) {
      return true;
   }

   @Override
   protected void a(dhi $$0, csa $$1, ht $$2, ecr $$3) {
      if ($$3 == ect.c) {
         dhi $$4 = cvc.fu.o();
         $$1.b($$2, $$4);
         $$1.a(dls.c, $$2, dls.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == ect.e) {
         dhi $$5 = cvc.fv.o();
         $$1.b($$2, $$5);
         $$1.a(dls.c, $$2, dls.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
