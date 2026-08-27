import com.mojang.serialization.MapCodec;

public class cvr extends cvt {
   public static final MapCodec<cvr> a = b(cvr::new);
   private static final emf b = cwj.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   @Override
   public MapCodec<? extends cvr> a() {
      return a;
   }

   protected cvr(diz.d $$0) {
      super($$0);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return b;
   }
}
