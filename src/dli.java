import com.mojang.serialization.MapCodec;

public class dli extends djf {
   public static final MapCodec<dli> d = b(dli::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<dli> a() {
      return d;
   }

   public dli(dxu.d $$0) {
      super($$0, kn.c);
   }

   @Override
   public boolean d(dxv $$0) {
      return false;
   }

   protected static boolean a(dhi $$0, dik.c $$1) {
      if ($$1 == dik.c.b) {
         return $$0.H_().i() < 0.05F;
      } else {
         return $$1 == dik.c.c ? $$0.H_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dxv $$0, dhi $$1, jh $$2, dik.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == dik.c.b) {
            $$1.b($$2, dko.fI.m());
            $$1.a(null, ecr.c, $$2);
         } else if ($$3 == dik.c.c) {
            $$1.b($$2, dko.fK.m());
            $$1.a(null, ecr.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(etw $$0) {
      return true;
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, etw $$3) {
      if ($$3 == ety.c) {
         dxv $$4 = dko.fI.m();
         $$1.b($$2, $$4);
         $$1.a(ecr.c, $$2, ecr.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == ety.e) {
         dxv $$5 = dko.fJ.m();
         $$1.b($$2, $$5);
         $$1.a(ecr.c, $$2, ecr.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
