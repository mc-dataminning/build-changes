import com.mojang.serialization.MapCodec;

public class dkd extends dfh {
   public static final MapCodec<dkd> a = b(dkd::new);
   protected static final ewj b = dey.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dkd> a() {
      return a;
   }

   public dkd(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return b;
   }

   @Override
   protected boolean b(dsb $$0, dbd $$1, iz $$2) {
      return $$0.a(awo.aL) || $$0.a(dfa.dX) || super.b($$0, $$1, $$2);
   }
}
