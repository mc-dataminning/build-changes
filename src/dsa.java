import com.mojang.serialization.MapCodec;

public class dsa extends dvy {
   public static final MapCodec<dsa> a = b(dsa::new);
   public static final int b = 3;
   public static final ebo c = ebe.av;
   private static final ffr[] d = dmm.a(3, $$0 -> dmm.b(16.0, 0.0, (double)(5 + $$0 * 3)));

   @Override
   public MapCodec<dsa> a() {
      return a;
   }

   protected dsa(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(eao $$0, din $$1, iv $$2) {
      return $$0.a(dmo.en);
   }

   @Override
   protected boolean f(eao $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(eao $$0, arq $$1, iv $$2, azv $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   protected czk a(djk $$0, iv $$1, eao $$2, boolean $$3) {
      return new czk(czo.tr);
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(c);
   }
}
