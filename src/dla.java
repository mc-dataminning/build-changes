import com.mojang.serialization.MapCodec;

public class dla extends dix {
   public static final MapCodec<dla> c = b(dla::new);
   private static final float d = 0.05F;
   private static final float e = 0.1F;

   @Override
   public MapCodec<dla> a() {
      return c;
   }

   public dla(dxp.d $$0) {
      super($$0, ko.c);
   }

   @Override
   public boolean d(dxq $$0) {
      return false;
   }

   protected static boolean a(dgz $$0, dic.c $$1) {
      if ($$1 == dic.c.b) {
         return $$0.C_().i() < 0.05F;
      } else {
         return $$1 == dic.c.c ? $$0.C_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, dic.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == dic.c.b) {
            $$1.b($$2, dkg.fP.m());
            $$1.a(null, ecp.c, $$2);
         } else if ($$3 == dic.c.c) {
            $$1.b($$2, dkg.fR.m());
            $$1.a(null, ecp.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(etv $$0) {
      return true;
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, etv $$3) {
      if ($$3 == etx.c) {
         dxq $$4 = dkg.fP.m();
         $$1.b($$2, $$4);
         $$1.a(ecp.c, $$2, ecp.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == etx.e) {
         dxq $$5 = dkg.fQ.m();
         $$1.b($$2, $$5);
         $$1.a(ecp.c, $$2, ecp.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
