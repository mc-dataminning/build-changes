import com.mojang.serialization.MapCodec;

public class dlc extends dhm {
   public static final MapCodec<dlc> d = b(dlc::new);

   @Override
   protected MapCodec<? extends dlc> a() {
      return d;
   }

   protected dlc(dur.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dus $$0, dus $$1, jk $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }
}
