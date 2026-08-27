public class fug implements fui<dgb> {
   public static final gfs a = new gfs(gdn.e, new agt("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final fly c;

   public fug(fuj.a $$0) {
      fly $$1 = $$0.a(flx.k);
      this.c = $$1.b("bell_body");
   }

   public static fme b() {
      fmg $$0 = new fmg();
      fmh $$1 = $$0.a();
      fmh $$2 = $$1.a("bell_body", fmd.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), fma.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fmd.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), fma.a(-8.0F, -12.0F, -8.0F));
      return fme.a($$0, 32, 32);
   }

   public void a(dgb $$0, float $$1, epd $$2, fsi $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      float $$7 = 0.0F;
      float $$8 = 0.0F;
      if ($$0.b) {
         float $$9 = aty.a($$6 / (float) Math.PI) / (4.0F + $$6 / 3.0F);
         if ($$0.c == ia.c) {
            $$7 = -$$9;
         } else if ($$0.c == ia.d) {
            $$7 = $$9;
         } else if ($$0.c == ia.f) {
            $$8 = -$$9;
         } else if ($$0.c == ia.e) {
            $$8 = $$9;
         }
      }

      this.c.e = $$7;
      this.c.g = $$8;
      eph $$10 = a.a($$3, fsq::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
