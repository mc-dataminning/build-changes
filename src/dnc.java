import com.mojang.serialization.MapCodec;

public class dnc extends djl {
   public static final MapCodec<dnc> d = b(dnc::new);

   @Override
   protected MapCodec<? extends dnc> a() {
      return d;
   }

   protected dnc(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dww $$0, dww $$1, jn $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }
}
