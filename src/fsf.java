public class fsf implements fsh<dep> {
   public static final gdl a = new gdl(gbg.e, new agg("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final fkb c;

   public fsf(fsi.a $$0) {
      fkb $$1 = $$0.a(fka.k);
      this.c = $$1.b("bell_body");
   }

   public static fkh b() {
      fkj $$0 = new fkj();
      fkk $$1 = $$0.a();
      fkk $$2 = $$1.a("bell_body", fkg.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), fkd.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fkg.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), fkd.a(-8.0F, -12.0F, -8.0F));
      return fkh.a($$0, 32, 32);
   }

   public void a(dep $$0, float $$1, enk $$2, fqh $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      float $$7 = 0.0F;
      float $$8 = 0.0F;
      if ($$0.b) {
         float $$9 = ati.a($$6 / (float) Math.PI) / (4.0F + $$6 / 3.0F);
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
      eno $$10 = a.a($$3, fqp::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
