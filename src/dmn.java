import com.mojang.serialization.MapCodec;

public class dmn extends dnq {
   public static final MapCodec<dmn> a = b(dmn::new);
   private static final feq[] b = dlu.a(7, $$0 -> dlu.b(16.0, 0.0, (double)(2 + $$0)));

   @Override
   public MapCodec<dmn> a() {
      return a;
   }

   public dmn(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected dio d() {
      return cyw.vi;
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return b[this.h($$0)];
   }
}
