public class fgp extends ffu {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final fhx e;
   private final fhx f;
   private final fhx g;

   public fgp(fhx $$0) {
      super(foh::c);
      this.e = $$0;
      this.f = $$0.b("plate");
      this.g = $$0.b("handle");
   }

   public static fid a() {
      fif $$0 = new fif();
      fig $$1 = $$0.a();
      $$1.a("plate", fic.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), fhz.a);
      $$1.a("handle", fic.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), fhz.a);
      return fid.a($$0, 64, 64);
   }

   public fhx b() {
      return this.f;
   }

   public fhx c() {
      return this.g;
   }

   @Override
   public void a(elk $$0, elo $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.e.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
