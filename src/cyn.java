import com.mojang.serialization.MapCodec;

public class cyn extends cyp {
   public static final MapCodec<cyn> a = b(cyn::new);
   private static final epo b = czf.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   @Override
   public MapCodec<? extends cyn> a() {
      return a;
   }

   protected cyn(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return b;
   }
}
