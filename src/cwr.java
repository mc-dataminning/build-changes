import com.mojang.serialization.MapCodec;

public class cwr extends ctc {
   public static final MapCodec<cwr> d = b(cwr::new);

   @Override
   protected MapCodec<? extends cwr> a() {
      return d;
   }

   protected cwr(dfc.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dfd $$0, dfd $$1, ha $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }
}
