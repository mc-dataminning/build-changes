public class fkp extends fju {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final fly e;
   private final fly f;
   private final fly g;

   public fkp(fly $$0) {
      super(fsq::c);
      this.e = $$0;
      this.f = $$0.b("plate");
      this.g = $$0.b("handle");
   }

   public static fme a() {
      fmg $$0 = new fmg();
      fmh $$1 = $$0.a();
      $$1.a("plate", fmd.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), fma.a);
      $$1.a("handle", fmd.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), fma.a);
      return fme.a($$0, 64, 64);
   }

   public fly b() {
      return this.f;
   }

   public fly c() {
      return this.g;
   }

   @Override
   public void a(epd $$0, eph $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.e.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
