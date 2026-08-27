public class fow extends foa {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final fqf e;
   private final fqf f;
   private final fqf g;

   public fow(fqf $$0) {
      super(fwy::c);
      this.e = $$0;
      this.f = $$0.b("plate");
      this.g = $$0.b("handle");
   }

   public static fql a() {
      fqn $$0 = new fqn();
      fqo $$1 = $$0.a();
      $$1.a("plate", fqk.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), fqh.a);
      $$1.a("handle", fqk.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), fqh.a);
      return fql.a($$0, 64, 64);
   }

   public fqf b() {
      return this.f;
   }

   public fqf c() {
      return this.g;
   }

   @Override
   public void a(etd $$0, eth $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.e.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
