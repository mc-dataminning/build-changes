import com.mojang.serialization.MapCodec;

public class dlx extends ddy {
   public static final MapCodec<dlx> a = b(dlx::new);
   private static final double b = 5.0;
   private static final evd c = ddy.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dlx> a() {
      return a;
   }

   protected dlx(dra.d $$0) {
      super($$0);
   }

   @Override
   protected dke a_(drb $$0) {
      return dke.a;
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return c;
   }

   @Override
   protected float d(drb $$0, dad $$1, io $$2) {
      return 1.0F;
   }
}
