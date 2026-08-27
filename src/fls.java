public class fls implements flu<czl> {
   public static final fwu a = new fwu(fuu.e, new acq("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final fee c;

   public fls(flv.a $$0) {
      fee $$1 = $$0.a(fed.k);
      this.c = $$1.b("bell_body");
   }

   public static fek b() {
      fem $$0 = new fem();
      fen $$1 = $$0.a();
      fen $$2 = $$1.a("bell_body", fej.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), feg.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fej.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), feg.a(-8.0F, -12.0F, -8.0F));
      return fek.a($$0, 32, 32);
   }

   public void a(czl $$0, float $$1, eij $$2, fjx $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      float $$7 = 0.0F;
      float $$8 = 0.0F;
      if ($$0.b) {
         float $$9 = apa.a($$6 / (float) Math.PI) / (4.0F + $$6 / 3.0F);
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
      ein $$10 = a.a($$3, fkf::b);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
