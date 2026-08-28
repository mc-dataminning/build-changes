import com.mojang.serialization.MapCodec;

public class duo extends dnq {
   public static final MapCodec<duo> a = b(duo::new);
   public static final int b = 1;
   public static final eao c = eae.at;
   private static final feq[] g = dlu.a(1, $$0 -> dlu.b(6.0, 0.0, (double)(6 + $$0 * 4)));
   private static final int h = 1;

   @Override
   public MapCodec<duo> a() {
      return a;
   }

   public duo(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(c);
   }

   @Override
   public feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return g[this.h($$0)];
   }

   @Override
   protected eao b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected dio d() {
      return cyw.wm;
   }

   @Override
   public dzo b(int $$0) {
      return $$0 == 2 ? dlw.bZ.m() : super.b($$0);
   }

   @Override
   public void b(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dip $$0) {
      return 1;
   }
}
