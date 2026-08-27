public class fqe implements fqg<dcv> {
   public static final gbk a = new gbk(fzf.e, new aey("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final fie c;

   public fqe(fqh.a $$0) {
      fie $$1 = $$0.a(fid.k);
      this.c = $$1.b("bell_body");
   }

   public static fik b() {
      fim $$0 = new fim();
      fin $$1 = $$0.a();
      fin $$2 = $$1.a("bell_body", fij.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), fig.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fij.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), fig.a(-8.0F, -12.0F, -8.0F));
      return fik.a($$0, 32, 32);
   }

   public void a(dcv $$0, float $$1, elr $$2, fog $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      float $$7 = 0.0F;
      float $$8 = 0.0F;
      if ($$0.b) {
         float $$9 = ary.a($$6 / (float) Math.PI) / (4.0F + $$6 / 3.0F);
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
      elv $$10 = a.a($$3, foo::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
