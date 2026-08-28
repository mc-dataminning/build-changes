import com.mojang.serialization.MapCodec;

public class dkh extends die {
   public static final MapCodec<dkh> d = b(dkh::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<dkh> a() {
      return d;
   }

   public dkh(dwv.d $$0) {
      super($$0, ko.c);
   }

   @Override
   public boolean d(dww $$0) {
      return false;
   }

   protected static boolean a(dgh $$0, dhj.c $$1) {
      if ($$1 == dhj.c.b) {
         return $$0.H_().i() < 0.05F;
      } else {
         return $$1 == dhj.c.c ? $$0.H_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dww $$0, dgh $$1, ji $$2, dhj.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == dhj.c.b) {
            $$1.b($$2, djn.fP.m());
            $$1.a(null, ebs.c, $$2);
         } else if ($$3 == dhj.c.c) {
            $$1.b($$2, djn.fR.m());
            $$1.a(null, ebs.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(esx $$0) {
      return true;
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, esx $$3) {
      if ($$3 == esz.c) {
         dww $$4 = djn.fP.m();
         $$1.b($$2, $$4);
         $$1.a(ebs.c, $$2, ebs.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == esz.e) {
         dww $$5 = djn.fQ.m();
         $$1.b($$2, $$5);
         $$1.a(ebs.c, $$2, ebs.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
