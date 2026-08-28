import com.mojang.serialization.MapCodec;

public class dno extends dlk {
   public static final MapCodec<dno> c = b(dno::new);
   private static final float d = 0.05F;
   private static final float e = 0.1F;

   @Override
   public MapCodec<dno> a() {
      return c;
   }

   public dno(eas.d $$0) {
      super($$0, kc.c);
   }

   @Override
   public boolean d(eat $$0) {
      return false;
   }

   protected static boolean a(djm $$0, dkp.c $$1) {
      if ($$1 == dkp.c.b) {
         return $$0.C_().i() < 0.05F;
      } else {
         return $$1 == dkp.c.c ? $$0.C_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, dkp.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == dkp.c.b) {
            $$1.b($$2, dmt.fT.m());
            $$1.a(null, eft.c, $$2);
         } else if ($$3 == dkp.c.c) {
            $$1.b($$2, dmt.fV.m());
            $$1.a(null, eft.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(ewz $$0) {
      return true;
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, ewz $$3) {
      if ($$3 == exb.c) {
         eat $$4 = dmt.fT.m();
         $$1.b($$2, $$4);
         $$1.a(eft.c, $$2, eft.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == exb.e) {
         eat $$5 = dmt.fU.m();
         $$1.b($$2, $$5);
         $$1.a(eft.c, $$2, eft.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
