import com.mojang.serialization.MapCodec;

public class diy extends dfi {
   public static final MapCodec<diy> d = b(diy::new);

   @Override
   protected MapCodec<? extends diy> a() {
      return d;
   }

   protected diy(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dsl $$0, dsl $$1, jf $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }
}
