import com.mojang.serialization.MapCodec;

public class dlh extends dje {
   public static final MapCodec<dlh> d = b(dlh::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<dlh> a() {
      return d;
   }

   public dlh(dxt.d $$0) {
      super($$0, kn.c);
   }

   @Override
   public boolean d(dxu $$0) {
      return false;
   }

   protected static boolean a(dhh $$0, dij.c $$1) {
      if ($$1 == dij.c.b) {
         return $$0.H_().i() < 0.05F;
      } else {
         return $$1 == dij.c.c ? $$0.H_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dxu $$0, dhh $$1, jh $$2, dij.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == dij.c.b) {
            $$1.b($$2, dkn.fI.m());
            $$1.a(null, ecq.c, $$2);
         } else if ($$3 == dij.c.c) {
            $$1.b($$2, dkn.fK.m());
            $$1.a(null, ecq.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(etv $$0) {
      return true;
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, etv $$3) {
      if ($$3 == etx.c) {
         dxu $$4 = dkn.fI.m();
         $$1.b($$2, $$4);
         $$1.a(ecq.c, $$2, ecq.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == etx.e) {
         dxu $$5 = dkn.fJ.m();
         $$1.b($$2, $$5);
         $$1.a(ecq.c, $$2, ecq.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
