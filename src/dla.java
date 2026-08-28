import com.mojang.serialization.MapCodec;

public class dla extends dix {
   public static final MapCodec<dla> d = b(dla::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<dla> a() {
      return d;
   }

   public dla(dxm.d $$0) {
      super($$0, kn.c);
   }

   @Override
   public boolean d(dxn $$0) {
      return false;
   }

   protected static boolean a(dha $$0, dic.c $$1) {
      if ($$1 == dic.c.b) {
         return $$0.H_().i() < 0.05F;
      } else {
         return $$1 == dic.c.c ? $$0.H_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dxn $$0, dha $$1, jh $$2, dic.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == dic.c.b) {
            $$1.b($$2, dkg.fI.m());
            $$1.a(null, ecj.c, $$2);
         } else if ($$3 == dic.c.c) {
            $$1.b($$2, dkg.fK.m());
            $$1.a(null, ecj.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(eto $$0) {
      return true;
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, eto $$3) {
      if ($$3 == etq.c) {
         dxn $$4 = dkg.fI.m();
         $$1.b($$2, $$4);
         $$1.a(ecj.c, $$2, ecj.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == etq.e) {
         dxn $$5 = dkg.fJ.m();
         $$1.b($$2, $$5);
         $$1.a(ecj.c, $$2, ecj.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
