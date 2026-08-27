public class fns extends fmx {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final fpc e;
   private final fpc f;
   private final fpc g;

   public fns(fpc $$0) {
      super(fvu::c);
      this.e = $$0;
      this.f = $$0.b("plate");
      this.g = $$0.b("handle");
   }

   public static fpi a() {
      fpk $$0 = new fpk();
      fpl $$1 = $$0.a();
      $$1.a("plate", fph.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), fpe.a);
      $$1.a("handle", fph.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), fpe.a);
      return fpi.a($$0, 64, 64);
   }

   public fpc b() {
      return this.f;
   }

   public fpc c() {
      return this.g;
   }

   @Override
   public void a(esa $$0, ese $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.e.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
