import com.mojang.serialization.MapCodec;

public class dtq extends dno {
   public static final MapCodec<dtq> a = b(dtq::new);

   @Override
   public MapCodec<dtq> a() {
      return a;
   }

   public dtq(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected boolean f_(ebq $$0) {
      return true;
   }

   @Override
   protected int a(ebq $$0, djn $$1, iw $$2, jc $$3) {
      return 15;
   }
}
