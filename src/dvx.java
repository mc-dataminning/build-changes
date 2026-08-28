import com.mojang.serialization.MapCodec;

public class dvx extends dno {
   public static final MapCodec<dvx> a = b(dvx::new);
   private static final fgw b = dno.a(6.0);

   @Override
   public MapCodec<dvx> a() {
      return a;
   }

   protected dvx(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected dub a_(ebq $$0) {
      return dub.a;
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return b;
   }

   @Override
   protected float c(ebq $$0, djn $$1, iw $$2) {
      return 1.0F;
   }
}
