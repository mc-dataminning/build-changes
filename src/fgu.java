public class fgu extends ffz {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final fic e;
   private final fic f;
   private final fic g;

   public fgu(fic $$0) {
      super(fom::c);
      this.e = $$0;
      this.f = $$0.b("plate");
      this.g = $$0.b("handle");
   }

   public static fii a() {
      fik $$0 = new fik();
      fil $$1 = $$0.a();
      $$1.a("plate", fih.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), fie.a);
      $$1.a("handle", fih.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), fie.a);
      return fii.a($$0, 64, 64);
   }

   public fic b() {
      return this.f;
   }

   public fic c() {
      return this.g;
   }

   @Override
   public void a(elp $$0, elt $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.e.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
