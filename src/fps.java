public class fps implements fpu<dcj> {
   public static final gay a = new gay(fyt.e, new aer("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final fhs c;

   public fps(fpv.a $$0) {
      fhs $$1 = $$0.a(fhr.k);
      this.c = $$1.b("bell_body");
   }

   public static fhy b() {
      fia $$0 = new fia();
      fib $$1 = $$0.a();
      fib $$2 = $$1.a("bell_body", fhx.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), fhu.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fhx.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), fhu.a(-8.0F, -12.0F, -8.0F));
      return fhy.a($$0, 32, 32);
   }

   public void a(dcj $$0, float $$1, elf $$2, fnu $$3, int $$4, int $$5) {
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
      elj $$10 = a.a($$3, foc::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
