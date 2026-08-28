import com.mojang.serialization.MapCodec;

public class drs extends dnq {
   public static final MapCodec<drs> a = b(drs::new);
   private static final feq[] b = dlu.a(7, $$0 -> dlu.b(16.0, 0.0, (double)(2 + $$0)));

   @Override
   public MapCodec<drs> a() {
      return a;
   }

   public drs(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected dio d() {
      return cyw.vj;
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return b[this.h($$0)];
   }
}
