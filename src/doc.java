import com.mojang.serialization.MapCodec;

public class doc extends dkl {
   public static final MapCodec<doc> d = b(doc::new);

   @Override
   protected MapCodec<? extends doc> a() {
      return d;
   }

   protected doc(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dxu $$0, dxu $$1, jm $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }
}
