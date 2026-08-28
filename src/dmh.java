import com.mojang.serialization.MapCodec;

public class dmh extends doj {
   public static final MapCodec<dmh> a = b(dmh::new);
   public static final int b = 3;
   public static final ebo c = ebe.av;
   private static final ffr[] g = dmm.a(3, $$0 -> dmm.b(16.0, 0.0, (double)(2 + $$0 * 2)));

   @Override
   public MapCodec<dmh> a() {
      return a;
   }

   public dmh(ean.d $$0) {
      super($$0);
   }

   @Override
   protected ebo b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected djg d() {
      return czo.ww;
   }

   @Override
   protected void b(eao $$0, arq $$1, iv $$2, azv $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(djh $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(c);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return g[this.h($$0)];
   }
}
