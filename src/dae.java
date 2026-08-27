import com.mojang.serialization.MapCodec;

public class dae extends cvj {
   public static final MapCodec<dae> a = b(dae::new);
   protected static final ekn b = cva.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dae> a() {
      return a;
   }

   public dae(dhh.d $$0) {
      super($$0);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return b;
   }

   @Override
   protected boolean b(dhi $$0, crg $$1, ht $$2) {
      return $$0.a(arg.aK) || $$0.a(cvc.dX) || super.b($$0, $$1, $$2);
   }
}
