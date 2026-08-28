import com.mojang.serialization.MapCodec;

public class dkj extends dig {
   public static final MapCodec<dkj> d = b(dkj::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<dkj> a() {
      return d;
   }

   public dkj(dwx.d $$0) {
      super($$0, ko.c);
   }

   @Override
   public boolean d(dwy $$0) {
      return false;
   }

   protected static boolean a(dgj $$0, dhl.c $$1) {
      if ($$1 == dhl.c.b) {
         return $$0.H_().i() < 0.05F;
      } else {
         return $$1 == dhl.c.c ? $$0.H_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dwy $$0, dgj $$1, ji $$2, dhl.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == dhl.c.b) {
            $$1.b($$2, djp.fP.m());
            $$1.a(null, ebu.c, $$2);
         } else if ($$3 == dhl.c.c) {
            $$1.b($$2, djp.fR.m());
            $$1.a(null, ebu.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(esz $$0) {
      return true;
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, esz $$3) {
      if ($$3 == etb.c) {
         dwy $$4 = djp.fP.m();
         $$1.b($$2, $$4);
         $$1.a(ebu.c, $$2, ebu.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == etb.e) {
         dwy $$5 = djp.fQ.m();
         $$1.b($$2, $$5);
         $$1.a(ebu.c, $$2, ebu.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
