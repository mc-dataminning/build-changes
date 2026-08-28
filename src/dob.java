import com.mojang.serialization.MapCodec;

public class dob extends dlx {
   public static final MapCodec<dob> c = b(dob::new);
   private static final float d = 0.05F;
   private static final float e = 0.1F;

   @Override
   public MapCodec<dob> a() {
      return c;
   }

   public dob(ebf.d $$0) {
      super($$0, kd.c);
   }

   @Override
   public boolean d(ebg $$0) {
      return false;
   }

   protected static boolean a(djz $$0, dlc.c $$1) {
      if ($$1 == dlc.c.b) {
         return $$0.G_().i() < 0.05F;
      } else {
         return $$1 == dlc.c.c ? $$0.G_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, dlc.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == dlc.c.b) {
            $$1.b($$2, dng.fT.m());
            $$1.a(null, egg.c, $$2);
         } else if ($$3 == dlc.c.c) {
            $$1.b($$2, dng.fV.m());
            $$1.a(null, egg.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(exp $$0) {
      return true;
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, exp $$3) {
      if ($$3 == exr.c) {
         ebg $$4 = dng.fT.m();
         $$1.b($$2, $$4);
         $$1.a(egg.c, $$2, egg.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == exr.e) {
         ebg $$5 = dng.fU.m();
         $$1.b($$2, $$5);
         $$1.a(egg.c, $$2, egg.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
