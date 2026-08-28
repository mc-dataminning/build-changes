import com.mojang.serialization.MapCodec;

public class dly extends dij {
   public static final MapCodec<dly> d = b(dly::new);

   @Override
   protected MapCodec<? extends dly> a() {
      return d;
   }

   protected dly(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dvo $$0, dvo $$1, jm $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }
}
