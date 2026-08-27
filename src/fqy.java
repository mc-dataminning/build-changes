public class fqy implements fra<ddv> {
   public static final gce a = new gce(fzz.e, new afw("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final fiw c;

   public fqy(frb.a $$0) {
      fiw $$1 = $$0.a(fiv.k);
      this.c = $$1.b("bell_body");
   }

   public static fjc b() {
      fje $$0 = new fje();
      fjf $$1 = $$0.a();
      fjf $$2 = $$1.a("bell_body", fjb.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), fiy.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fjb.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), fiy.a(-8.0F, -12.0F, -8.0F));
      return fjc.a($$0, 32, 32);
   }

   public void a(ddv $$0, float $$1, emh $$2, fpb $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      float $$7 = 0.0F;
      float $$8 = 0.0F;
      if ($$0.b) {
         float $$9 = asy.a($$6 / (float) Math.PI) / (4.0F + $$6 / 3.0F);
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
      eml $$10 = a.a($$3, fpj::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
