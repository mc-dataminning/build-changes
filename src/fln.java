public class fln extends fks {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final fmw e;
   private final fmw f;
   private final fmw g;

   public fln(fmw $$0) {
      super(fto::c);
      this.e = $$0;
      this.f = $$0.b("plate");
      this.g = $$0.b("handle");
   }

   public static fnc a() {
      fne $$0 = new fne();
      fnf $$1 = $$0.a();
      $$1.a("plate", fnb.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), fmy.a);
      $$1.a("handle", fnb.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), fmy.a);
      return fnc.a($$0, 64, 64);
   }

   public fmw b() {
      return this.f;
   }

   public fmw c() {
      return this.g;
   }

   @Override
   public void a(eqa $$0, eqe $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.e.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
