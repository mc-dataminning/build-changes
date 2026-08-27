public class fho extends fgt {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final fiw e;
   private final fiw f;
   private final fiw g;

   public fho(fiw $$0) {
      super(fpj::c);
      this.e = $$0;
      this.f = $$0.b("plate");
      this.g = $$0.b("handle");
   }

   public static fjc a() {
      fje $$0 = new fje();
      fjf $$1 = $$0.a();
      $$1.a("plate", fjb.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), fiy.a);
      $$1.a("handle", fjb.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), fiy.a);
      return fjc.a($$0, 64, 64);
   }

   public fiw b() {
      return this.f;
   }

   public fiw c() {
      return this.g;
   }

   @Override
   public void a(emh $$0, eml $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.e.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
