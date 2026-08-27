import com.mojang.serialization.MapCodec;

public class cvx extends cvz {
   public static final MapCodec<cvx> a = b(cvx::new);
   private static final eml b = cwp.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   @Override
   public MapCodec<? extends cvx> a() {
      return a;
   }

   protected cvx(djf.d $$0) {
      super($$0);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return b;
   }
}
