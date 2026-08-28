import com.mojang.serialization.MapCodec;

public class dkg extends did {
   public static final MapCodec<dkg> d = b(dkg::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<dkg> a() {
      return d;
   }

   public dkg(dwu.d $$0) {
      super($$0, ko.c);
   }

   @Override
   public boolean d(dwv $$0) {
      return false;
   }

   protected static boolean a(dgg $$0, dhi.c $$1) {
      if ($$1 == dhi.c.b) {
         return $$0.H_().i() < 0.05F;
      } else {
         return $$1 == dhi.c.c ? $$0.H_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dwv $$0, dgg $$1, ji $$2, dhi.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == dhi.c.b) {
            $$1.b($$2, djm.fP.m());
            $$1.a(null, ebr.c, $$2);
         } else if ($$3 == dhi.c.c) {
            $$1.b($$2, djm.fR.m());
            $$1.a(null, ebr.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(esw $$0) {
      return true;
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, esw $$3) {
      if ($$3 == esy.c) {
         dwv $$4 = djm.fP.m();
         $$1.b($$2, $$4);
         $$1.a(ebr.c, $$2, ebr.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == esy.e) {
         dwv $$5 = djm.fQ.m();
         $$1.b($$2, $$5);
         $$1.a(ebr.c, $$2, ebr.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
