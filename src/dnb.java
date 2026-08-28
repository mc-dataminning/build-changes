import com.mojang.serialization.MapCodec;

public class dnb extends djk {
   public static final MapCodec<dnb> d = b(dnb::new);

   @Override
   protected MapCodec<? extends dnb> a() {
      return d;
   }

   protected dnb(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dwv $$0, dwv $$1, jn $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }
}
