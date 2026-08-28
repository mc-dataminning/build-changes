import com.mojang.serialization.MapCodec;

public class dkz extends diw {
   public static final MapCodec<dkz> d = b(dkz::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<dkz> a() {
      return d;
   }

   public dkz(dxn.d $$0) {
      super($$0, kn.c);
   }

   @Override
   public boolean d(dxo $$0) {
      return false;
   }

   protected static boolean a(dgz $$0, dib.c $$1) {
      if ($$1 == dib.c.b) {
         return $$0.H_().i() < 0.05F;
      } else {
         return $$1 == dib.c.c ? $$0.H_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dxo $$0, dgz $$1, jh $$2, dib.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == dib.c.b) {
            $$1.b($$2, dkf.fP.m());
            $$1.a(null, eck.c, $$2);
         } else if ($$3 == dib.c.c) {
            $$1.b($$2, dkf.fR.m());
            $$1.a(null, eck.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(etp $$0) {
      return true;
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, etp $$3) {
      if ($$3 == etr.c) {
         dxo $$4 = dkf.fP.m();
         $$1.b($$2, $$4);
         $$1.a(eck.c, $$2, eck.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == etr.e) {
         dxo $$5 = dkf.fQ.m();
         $$1.b($$2, $$5);
         $$1.a(eck.c, $$2, eck.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
