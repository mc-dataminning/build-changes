import com.mojang.serialization.MapCodec;

public class dva extends dne {
   public static final MapCodec<dva> a = b(dva::new);
   private static final fgm b = dne.b(16.0, 0.0, 14.0);
   private static final int c = 20;

   @Override
   public MapCodec<dva> a() {
      return a;
   }

   public dva(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected fgm b(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return b;
   }

   @Override
   protected fgm b_(ebg $$0, djd $$1, iw $$2) {
      return fgj.b();
   }

   @Override
   protected fgm c(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return fgj.b();
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      dnl.b($$1, $$2.d(), $$0);
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$4 == jc.b && $$6.a(dng.J)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, ebg $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }

   @Override
   protected float c(ebg $$0, djd $$1, iw $$2) {
      return 0.2F;
   }
}
