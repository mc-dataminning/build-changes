public class fsm extends frr {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final ftv e;
   private final ftv f;
   private final ftv g;

   public fsm(ftv $$0) {
      super(gaq::c);
      this.e = $$0;
      this.f = $$0.b("plate");
      this.g = $$0.b("handle");
   }

   public static fub a() {
      fud $$0 = new fud();
      fue $$1 = $$0.a();
      $$1.a("plate", fua.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), ftx.a);
      $$1.a("handle", fua.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), ftx.a);
      return fub.a($$0, 64, 64);
   }

   public ftv b() {
      return this.f;
   }

   public ftv c() {
      return this.g;
   }

   @Override
   public void a(ewr $$0, ewv $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.e.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
