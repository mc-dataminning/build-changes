import com.mojang.serialization.MapCodec;

public class dnz extends dlv {
   public static final MapCodec<dnz> c = b(dnz::new);
   private static final float d = 0.05F;
   private static final float e = 0.1F;

   @Override
   public MapCodec<dnz> a() {
      return c;
   }

   public dnz(ebd.d $$0) {
      super($$0, kc.c);
   }

   @Override
   public boolean d(ebe $$0) {
      return false;
   }

   protected static boolean a(djx $$0, dla.c $$1) {
      if ($$1 == dla.c.b) {
         return $$0.G_().i() < 0.05F;
      } else {
         return $$1 == dla.c.c ? $$0.G_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, dla.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == dla.c.b) {
            $$1.b($$2, dne.fT.m());
            $$1.a(null, ege.c, $$2);
         } else if ($$3 == dla.c.c) {
            $$1.b($$2, dne.fV.m());
            $$1.a(null, ege.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(exn $$0) {
      return true;
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, exn $$3) {
      if ($$3 == exp.c) {
         ebe $$4 = dne.fT.m();
         $$1.b($$2, $$4);
         $$1.a(ege.c, $$2, ege.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == exp.e) {
         ebe $$5 = dne.fU.m();
         $$1.b($$2, $$5);
         $$1.a(ege.c, $$2, ege.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
