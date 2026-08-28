import com.mojang.serialization.MapCodec;

public class dsh extends dnc {
   public static final MapCodec<dsh> a = b(dsh::new);
   private static final fgk b = dnc.b(16.0, 0.0, 14.0);

   @Override
   public MapCodec<dsh> a() {
      return a;
   }

   public dsh(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected fgk b(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return b;
   }

   @Override
   protected fgk b_(ebe $$0, djb $$1, iv $$2) {
      return fgh.b();
   }

   @Override
   protected fgk c(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return fgh.b();
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }

   @Override
   protected float c(ebe $$0, djb $$1, iv $$2) {
      return 0.2F;
   }
}
