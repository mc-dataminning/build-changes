import com.mojang.serialization.MapCodec;

public class dvl extends dnc {
   public static final MapCodec<dvl> a = b(dvl::new);
   private static final fgk b = dnc.a(6.0);

   @Override
   public MapCodec<dvl> a() {
      return a;
   }

   protected dvl(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected dtp a_(ebe $$0) {
      return dtp.a;
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return b;
   }

   @Override
   protected float c(ebe $$0, djb $$1, iv $$2) {
      return 1.0F;
   }
}
