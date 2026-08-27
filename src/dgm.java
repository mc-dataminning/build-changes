import com.mojang.serialization.MapCodec;

public class dgm extends cyo {
   public static final MapCodec<dgm> a = b(dgm::new);
   private static final double b = 5.0;
   private static final eol c = cyo.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dgm> a() {
      return a;
   }

   protected dgm(dle.d $$0) {
      super($$0);
   }

   @Override
   protected det b_(dlf $$0) {
      return det.a;
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return c;
   }

   @Override
   protected float d(dlf $$0, cut $$1, hz $$2) {
      return 1.0F;
   }
}
