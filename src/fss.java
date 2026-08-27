public class fss implements fsu<dfb> {
   public static final gdy a = new gdy(gbt.e, new agi("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final fko c;

   public fss(fsv.a $$0) {
      fko $$1 = $$0.a(fkn.k);
      this.c = $$1.b("bell_body");
   }

   public static fku b() {
      fkw $$0 = new fkw();
      fkx $$1 = $$0.a();
      fkx $$2 = $$1.a("bell_body", fkt.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), fkq.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fkt.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), fkq.a(-8.0F, -12.0F, -8.0F));
      return fku.a($$0, 32, 32);
   }

   public void a(dfb $$0, float $$1, enw $$2, fqu $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      float $$7 = 0.0F;
      float $$8 = 0.0F;
      if ($$0.b) {
         float $$9 = atm.a($$6 / (float) Math.PI) / (4.0F + $$6 / 3.0F);
         if ($$0.c == hx.c) {
            $$7 = -$$9;
         } else if ($$0.c == hx.d) {
            $$7 = $$9;
         } else if ($$0.c == hx.f) {
            $$8 = -$$9;
         } else if ($$0.c == hx.e) {
            $$8 = $$9;
         }
      }

      this.c.e = $$7;
      this.c.g = $$8;
      eoa $$10 = a.a($$3, frc::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
