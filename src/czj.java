import com.mojang.serialization.MapCodec;

public class czj extends cxh {
   public static final MapCodec<czj> d = b(czj::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<czj> a() {
      return d;
   }

   public czj(dle.d $$0) {
      super($$0, jf.c);
   }

   @Override
   public boolean d(dlf $$0) {
      return false;
   }

   protected static boolean a(cvn $$0, cwm.c $$1) {
      if ($$1 == cwm.c.b) {
         return $$0.F_().i() < 0.05F;
      } else {
         return $$1 == cwm.c.c ? $$0.F_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dlf $$0, cvn $$1, hz $$2, cwm.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == cwm.c.b) {
            $$1.b($$2, cyq.fu.o());
            $$1.a(null, dpp.c, $$2);
         } else if ($$3 == cwm.c.c) {
            $$1.b($$2, cyq.fw.o());
            $$1.a(null, dpp.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(ego $$0) {
      return true;
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, ego $$3) {
      if ($$3 == egq.c) {
         dlf $$4 = cyq.fu.o();
         $$1.b($$2, $$4);
         $$1.a(dpp.c, $$2, dpp.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == egq.e) {
         dlf $$5 = cyq.fv.o();
         $$1.b($$2, $$5);
         $$1.a(dpp.c, $$2, dpp.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
