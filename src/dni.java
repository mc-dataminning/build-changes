import com.mojang.serialization.MapCodec;

public class dni extends dhm {
   public static final MapCodec<dni> a = b(dni::new);

   @Override
   public MapCodec<dni> a() {
      return a;
   }

   public dni(dur.d $$0) {
      super($$0);
   }

   @Override
   protected boolean f_(dus $$0) {
      return true;
   }

   @Override
   protected int a(dus $$0, ddo $$1, jf $$2, jk $$3) {
      return 15;
   }
}
