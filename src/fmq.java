public class fmq extends fnb {
   private static final xo a = xo.c("symlink_warning.title.world").a(n.r);
   private static final xo b = xo.a("symlink_warning.message.world", "https://aka.ms/MinecraftSymLinks");
   private static final xo c = xo.c("symlink_warning.title.pack").a(n.r);
   private static final xo d = xo.a("symlink_warning.message.pack", "https://aka.ms/MinecraftSymLinks");
   private final xo r;
   private final String s;
   private final Runnable u;
   private final fko v = new fko().b(10);

   public fmq(xo $$0, xo $$1, String $$2, Runnable $$3) {
      super($$0);
      this.r = $$1;
      this.s = $$2;
      this.u = $$3;
   }

   public static fnb a(Runnable $$0) {
      return new fmq(a, b, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   public static fnb b(Runnable $$0) {
      return new fmq(c, d, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.v.c().b();
      fko.b $$0 = this.v.d(1);
      $$0.a(new fij(this.l, this.p));
      $$0.a(new fhw(this.r, this.p).d(this.n - 50).b(true));
      int $$1 = 120;
      fko $$2 = new fko().a(5);
      fko.b $$3 = $$2.d(3);
      $$3.a(fhc.a(xn.n, $$0x -> ac.k().a(this.s)).b(120, 20).a());
      $$3.a(fhc.a(xn.o, $$0x -> this.m.o.a(this.s)).b(120, 20).a());
      $$3.a(fhc.a(xn.k, $$0x -> this.d()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.v.a(this::c);
   }

   @Override
   protected void c() {
      this.v.a();
      fkn.a(this.v, this.G());
   }

   @Override
   public xo i() {
      return xn.a(super.i(), this.r);
   }

   @Override
   public void d() {
      this.u.run();
   }
}
