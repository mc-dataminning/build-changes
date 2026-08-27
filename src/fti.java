public class fti extends fsn {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final fur e;
   private final fur f;
   private final fur g;

   public fti(fur $$0) {
      super(gbm::c);
      this.e = $$0;
      this.f = $$0.b("plate");
      this.g = $$0.b("handle");
   }

   public static fux a() {
      fuz $$0 = new fuz();
      fva $$1 = $$0.a();
      $$1.a("plate", fuw.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), fut.a);
      $$1.a("handle", fuw.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), fut.a);
      return fux.a($$0, 64, 64);
   }

   public fur b() {
      return this.f;
   }

   public fur c() {
      return this.g;
   }

   @Override
   public void a(exn $$0, exr $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.e.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
