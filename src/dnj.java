import com.mojang.serialization.MapCodec;

public class dnj extends dlf {
   public static final MapCodec<dnj> c = b(dnj::new);
   private static final float d = 0.05F;
   private static final float e = 0.1F;

   @Override
   public MapCodec<dnj> a() {
      return c;
   }

   public dnj(ean.d $$0) {
      super($$0, kc.c);
   }

   @Override
   public boolean d(eao $$0) {
      return false;
   }

   protected static boolean a(djh $$0, dkk.c $$1) {
      if ($$1 == dkk.c.b) {
         return $$0.C_().i() < 0.05F;
      } else {
         return $$1 == dkk.c.c ? $$0.C_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(eao $$0, djh $$1, iv $$2, dkk.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == dkk.c.b) {
            $$1.b($$2, dmo.fT.m());
            $$1.a(null, efo.c, $$2);
         } else if ($$3 == dkk.c.c) {
            $$1.b($$2, dmo.fV.m());
            $$1.a(null, efo.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(ewu $$0) {
      return true;
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, ewu $$3) {
      if ($$3 == eww.c) {
         eao $$4 = dmo.fT.m();
         $$1.b($$2, $$4);
         $$1.a(efo.c, $$2, efo.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == eww.e) {
         eao $$5 = dmo.fU.m();
         $$1.b($$2, $$5);
         $$1.a(efo.c, $$2, efo.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
