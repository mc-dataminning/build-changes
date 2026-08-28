import com.mojang.serialization.MapCodec;

public class dpk extends djk {
   public static final MapCodec<dpk> a = b(dpk::new);

   @Override
   public MapCodec<dpk> a() {
      return a;
   }

   public dpk(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected boolean f_(dwv $$0) {
      return true;
   }

   @Override
   protected int a(dwv $$0, dfl $$1, ji $$2, jn $$3) {
      return 15;
   }
}
