import com.mojang.serialization.MapCodec;

public class dtz extends dlu {
   public static final MapCodec<dtz> a = b(dtz::new);
   private static final feq b = dlu.a(6.0);

   @Override
   public MapCodec<dtz> a() {
      return a;
   }

   protected dtz(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected dsf a_(dzo $$0) {
      return dsf.a;
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return b;
   }

   @Override
   protected float c(dzo $$0, dhv $$1, iu $$2) {
      return 1.0F;
   }
}
