import com.mojang.serialization.MapCodec;

public class dom extends dku {
   public static final MapCodec<dom> d = b(dom::new);

   @Override
   protected MapCodec<? extends dom> a() {
      return d;
   }

   protected dom(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dym $$0, dym $$1, jo $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }
}
