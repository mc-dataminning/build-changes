import com.mojang.serialization.MapCodec;

public class dlp extends dnq {
   public static final MapCodec<dlp> a = b(dlp::new);
   public static final int b = 3;
   public static final eao c = eae.av;
   private static final feq[] g = dlu.a(3, $$0 -> dlu.b(16.0, 0.0, (double)(2 + $$0 * 2)));

   @Override
   public MapCodec<dlp> a() {
      return a;
   }

   public dlp(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected eao b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected dio d() {
      return cyw.wp;
   }

   @Override
   protected void b(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dip $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(c);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return g[this.h($$0)];
   }
}
