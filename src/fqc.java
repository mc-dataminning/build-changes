public class fqc implements fqe<dct> {
   public static final gbi a = new gbi(fzd.e, new aex("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final fic c;

   public fqc(fqf.a $$0) {
      fic $$1 = $$0.a(fib.k);
      this.c = $$1.b("bell_body");
   }

   public static fii b() {
      fik $$0 = new fik();
      fil $$1 = $$0.a();
      fil $$2 = $$1.a("bell_body", fih.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), fie.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fih.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), fie.a(-8.0F, -12.0F, -8.0F));
      return fii.a($$0, 32, 32);
   }

   public void a(dct $$0, float $$1, elp $$2, foe $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      float $$7 = 0.0F;
      float $$8 = 0.0F;
      if ($$0.b) {
         float $$9 = arx.a($$6 / (float) Math.PI) / (4.0F + $$6 / 3.0F);
         if ($$0.c == hc.c) {
            $$7 = -$$9;
         } else if ($$0.c == hc.d) {
            $$7 = $$9;
         } else if ($$0.c == hc.f) {
            $$8 = -$$9;
         } else if ($$0.c == hc.e) {
            $$8 = $$9;
         }
      }

      this.c.e = $$7;
      this.c.g = $$8;
      elt $$10 = a.a($$3, fom::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
