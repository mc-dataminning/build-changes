public class fmr extends fnc {
   private static final xo a = xo.c("symlink_warning.title.world").a(n.r);
   private static final xo b = xo.a("symlink_warning.message.world", "https://aka.ms/MinecraftSymLinks");
   private static final xo c = xo.c("symlink_warning.title.pack").a(n.r);
   private static final xo d = xo.a("symlink_warning.message.pack", "https://aka.ms/MinecraftSymLinks");
   private final xo r;
   private final String s;
   private final Runnable u;
   private final fkp v = new fkp().b(10);

   public fmr(xo $$0, xo $$1, String $$2, Runnable $$3) {
      super($$0);
      this.r = $$1;
      this.s = $$2;
      this.u = $$3;
   }

   public static fnc a(Runnable $$0) {
      return new fmr(a, b, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   public static fnc b(Runnable $$0) {
      return new fmr(c, d, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.v.c().b();
      fkp.b $$0 = this.v.d(1);
      $$0.a(new fik(this.l, this.p));
      $$0.a(new fhx(this.r, this.p).d(this.n - 50).b(true));
      int $$1 = 120;
      fkp $$2 = new fkp().a(5);
      fkp.b $$3 = $$2.d(3);
      $$3.a(fhd.a(xn.n, $$0x -> ac.k().a(this.s)).b(120, 20).a());
      $$3.a(fhd.a(xn.o, $$0x -> this.m.o.a(this.s)).b(120, 20).a());
      $$3.a(fhd.a(xn.k, $$0x -> this.d()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.v.a(this::c);
   }

   @Override
   protected void c() {
      this.v.a();
      fko.a(this.v, this.G());
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
