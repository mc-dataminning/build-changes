import com.mojang.serialization.MapCodec;

public class dld extends dle {
   public static final MapCodec<dld> a = b(dld::new);
   private static final feq c = dlu.b(12.0, 0.0, 15.0);

   @Override
   public MapCodec<dld> a() {
      return a;
   }

   protected dld(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return c;
   }
}
