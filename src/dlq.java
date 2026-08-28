import com.mojang.serialization.MapCodec;

public class dlq extends djn {
   public static final MapCodec<dlq> c = b(dlq::new);
   private static final float d = 0.05F;
   private static final float e = 0.1F;

   @Override
   public MapCodec<dlq> a() {
      return c;
   }

   public dlq(dyl.d $$0) {
      super($$0, kp.c);
   }

   @Override
   public boolean d(dym $$0) {
      return false;
   }

   protected static boolean a(dhp $$0, dis.c $$1) {
      if ($$1 == dis.c.b) {
         return $$0.C_().i() < 0.05F;
      } else {
         return $$1 == dis.c.c ? $$0.C_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, dis.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == dis.c.b) {
            $$1.b($$2, dkw.fP.m());
            $$1.a(null, edm.c, $$2);
         } else if ($$3 == dis.c.c) {
            $$1.b($$2, dkw.fR.m());
            $$1.a(null, edm.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(eus $$0) {
      return true;
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, eus $$3) {
      if ($$3 == euu.c) {
         dym $$4 = dkw.fP.m();
         $$1.b($$2, $$4);
         $$1.a(edm.c, $$2, edm.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == euu.e) {
         dym $$5 = dkw.fQ.m();
         $$1.b($$2, $$5);
         $$1.a(edm.c, $$2, edm.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
