public class fgk extends ffp {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final fhs e;
   private final fhs f;
   private final fhs g;

   public fgk(fhs $$0) {
      super(foc::c);
      this.e = $$0;
      this.f = $$0.b("plate");
      this.g = $$0.b("handle");
   }

   public static fhy a() {
      fia $$0 = new fia();
      fib $$1 = $$0.a();
      $$1.a("plate", fhx.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), fhu.a);
      $$1.a("handle", fhx.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), fhu.a);
      return fhy.a($$0, 64, 64);
   }

   public fhs b() {
      return this.f;
   }

   public fhs c() {
      return this.g;
   }

   @Override
   public void a(elf $$0, elj $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.e.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
