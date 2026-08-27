import com.mojang.serialization.MapCodec;

public class dej extends czo {
   public static final MapCodec<dej> a = b(dej::new);
   protected static final epo b = czf.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dej> a() {
      return a;
   }

   public dej(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return b;
   }

   @Override
   protected boolean b(dme $$0, cvk $$1, ib $$2) {
      return $$0.a(aue.aK) || $$0.a(czh.dX) || super.b($$0, $$1, $$2);
   }
}
