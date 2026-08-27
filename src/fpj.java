public class fpj implements fpl<dck> {
   public static final gap a = new gap(fyk.e, new aer("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final fhn c;

   public fpj(fpm.a $$0) {
      fhn $$1 = $$0.a(fhm.k);
      this.c = $$1.b("bell_body");
   }

   public static fht b() {
      fhv $$0 = new fhv();
      fhw $$1 = $$0.a();
      fhw $$2 = $$1.a("bell_body", fhs.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), fhp.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fhs.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), fhp.a(-8.0F, -12.0F, -8.0F));
      return fht.a($$0, 32, 32);
   }

   public void a(dck $$0, float $$1, elg $$2, fnl $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      float $$7 = 0.0F;
      float $$8 = 0.0F;
      if ($$0.b) {
         float $$9 = arp.a($$6 / (float) Math.PI) / (4.0F + $$6 / 3.0F);
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
      elk $$10 = a.a($$3, fnt::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
