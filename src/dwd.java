import com.mojang.serialization.MapCodec;

public class dwd extends dqw {
   public static final MapCodec<dwd> b = b(dwd::new);

   protected dwd(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected MapCodec<? extends dwd> a() {
      return b;
   }

   @Override
   protected fgk c(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return fgh.a();
   }

   @Override
   protected float c(ebe $$0, djb $$1, iv $$2) {
      return 1.0F;
   }

   @Override
   protected boolean e_(ebe $$0) {
      return true;
   }
}
