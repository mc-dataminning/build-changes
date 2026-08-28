import com.mojang.serialization.MapCodec;

public class dvm extends doj {
   public static final MapCodec<dvm> a = b(dvm::new);
   public static final int b = 1;
   public static final ebo c = ebe.at;
   private static final ffr[] g = dmm.a(1, $$0 -> dmm.b(6.0, 0.0, (double)(6 + $$0 * 4)));
   private static final int h = 1;

   @Override
   public MapCodec<dvm> a() {
      return a;
   }

   public dvm(ean.d $$0) {
      super($$0);
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(c);
   }

   @Override
   public ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return g[this.h($$0)];
   }

   @Override
   protected ebo b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected djg d() {
      return czo.wt;
   }

   @Override
   public eao b(int $$0) {
      return $$0 == 2 ? dmo.cc.m() : super.b($$0);
   }

   @Override
   public void b(eao $$0, arq $$1, iv $$2, azv $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(djh $$0) {
      return 1;
   }
}
