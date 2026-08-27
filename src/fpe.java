public class fpe implements fpg<dci> {
   public static final gak a = new gak(fyf.e, new aep("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final fhj c;

   public fpe(fph.a $$0) {
      fhj $$1 = $$0.a(fhi.k);
      this.c = $$1.b("bell_body");
   }

   public static fhp b() {
      fhr $$0 = new fhr();
      fhs $$1 = $$0.a();
      fhs $$2 = $$1.a("bell_body", fho.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), fhl.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fho.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), fhl.a(-8.0F, -12.0F, -8.0F));
      return fhp.a($$0, 32, 32);
   }

   public void a(dci $$0, float $$1, elh $$2, fng $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      float $$7 = 0.0F;
      float $$8 = 0.0F;
      if ($$0.b) {
         float $$9 = aro.a($$6 / (float) Math.PI) / (4.0F + $$6 / 3.0F);
         if ($$0.c == hb.c) {
            $$7 = -$$9;
         } else if ($$0.c == hb.d) {
            $$7 = $$9;
         } else if ($$0.c == hb.f) {
            $$8 = -$$9;
         } else if ($$0.c == hb.e) {
            $$8 = $$9;
         }
      }

      this.c.e = $$7;
      this.c.g = $$8;
      ell $$10 = a.a($$3, fno::b);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
