import com.mojang.serialization.MapCodec;

public class dio extends dey {
   public static final MapCodec<dio> d = b(dio::new);

   @Override
   protected MapCodec<? extends dio> a() {
      return d;
   }

   protected dio(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dsb $$0, dsb $$1, je $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }
}
