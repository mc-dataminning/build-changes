public class fpy implements fqa<dcx> {
   public static final gbe a = new gbe(fyz.e, new aez("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final fhx c;

   public fpy(fqb.a $$0) {
      fhx $$1 = $$0.a(fhw.k);
      this.c = $$1.b("bell_body");
   }

   public static fid b() {
      fif $$0 = new fif();
      fig $$1 = $$0.a();
      fig $$2 = $$1.a("bell_body", fic.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), fhz.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fic.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), fhz.a(-8.0F, -12.0F, -8.0F));
      return fid.a($$0, 32, 32);
   }

   public void a(dcx $$0, float $$1, elj $$2, foa $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      float $$7 = 0.0F;
      float $$8 = 0.0F;
      if ($$0.b) {
         float $$9 = asb.a($$6 / (float) Math.PI) / (4.0F + $$6 / 3.0F);
         if ($$0.c == ha.c) {
            $$7 = -$$9;
         } else if ($$0.c == ha.d) {
            $$7 = $$9;
         } else if ($$0.c == ha.f) {
            $$8 = -$$9;
         } else if ($$0.c == ha.e) {
            $$8 = $$9;
         }
      }

      this.c.e = $$7;
      this.c.g = $$8;
      eln $$10 = a.a($$3, foi::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
