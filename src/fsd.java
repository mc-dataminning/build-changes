public class fsd extends fri {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final ftm e;
   private final ftm f;
   private final ftm g;

   public fsd(ftm $$0) {
      super(gah::c);
      this.e = $$0;
      this.f = $$0.b("plate");
      this.g = $$0.b("handle");
   }

   public static fts a() {
      ftu $$0 = new ftu();
      ftv $$1 = $$0.a();
      $$1.a("plate", ftr.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), fto.a);
      $$1.a("handle", ftr.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), fto.a);
      return fts.a($$0, 64, 64);
   }

   public ftm b() {
      return this.f;
   }

   public ftm c() {
      return this.g;
   }

   @Override
   public void a(ewi $$0, ewm $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.e.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
