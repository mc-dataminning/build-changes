import com.mojang.serialization.MapCodec;

public class dun extends dmr {
   public static final MapCodec<dun> a = b(dun::new);
   private static final ffw b = dmr.b(16.0, 0.0, 14.0);
   private static final int c = 20;

   @Override
   public MapCodec<dun> a() {
      return a;
   }

   public dun(eas.d $$0) {
      super($$0);
   }

   @Override
   protected ffw b(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return b;
   }

   @Override
   protected ffw b_(eat $$0, diq $$1, iv $$2) {
      return fft.b();
   }

   @Override
   protected ffw c(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return fft.b();
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      dmy.b($$1, $$2.d(), $$0);
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$4 == jb.b && $$6.a(dmt.J)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, eat $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }

   @Override
   protected float c(eat $$0, diq $$1, iv $$2) {
      return 0.2F;
   }
}
