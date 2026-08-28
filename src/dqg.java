import com.mojang.serialization.MapCodec;

public class dqg extends dmm {
   public static final MapCodec<dqg> d = b(dqg::new);

   @Override
   protected MapCodec<? extends dqg> a() {
      return d;
   }

   protected dqg(ean.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(eao $$0, eao $$1, jb $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }
}
