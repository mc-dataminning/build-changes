import com.mojang.serialization.MapCodec;

public class dlc extends dle {
   public static final MapCodec<dlc> a = b(dlc::new);
   private static final feq c = dlu.b(12.0, 0.0, 4.0);

   @Override
   public MapCodec<? extends dlc> a() {
      return a;
   }

   protected dlc(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return c;
   }
}
