public class fmn extends fmy {
   private static final xl a = xl.c("symlink_warning.title.world").a(n.r);
   private static final xl b = xl.a("symlink_warning.message.world", "https://aka.ms/MinecraftSymLinks");
   private static final xl c = xl.c("symlink_warning.title.pack").a(n.r);
   private static final xl d = xl.a("symlink_warning.message.pack", "https://aka.ms/MinecraftSymLinks");
   private final xl r;
   private final String s;
   private final Runnable u;
   private final fkl v = new fkl().b(10);

   public fmn(xl $$0, xl $$1, String $$2, Runnable $$3) {
      super($$0);
      this.r = $$1;
      this.s = $$2;
      this.u = $$3;
   }

   public static fmy a(Runnable $$0) {
      return new fmn(a, b, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   public static fmy b(Runnable $$0) {
      return new fmn(c, d, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.v.c().b();
      fkl.b $$0 = this.v.d(1);
      $$0.a(new fig(this.l, this.p));
      $$0.a(new fht(this.r, this.p).d(this.n - 50).b(true));
      int $$1 = 120;
      fkl $$2 = new fkl().a(5);
      fkl.b $$3 = $$2.d(3);
      $$3.a(fgz.a(xk.n, $$0x -> ac.k().a(this.s)).b(120, 20).a());
      $$3.a(fgz.a(xk.o, $$0x -> this.m.o.a(this.s)).b(120, 20).a());
      $$3.a(fgz.a(xk.k, $$0x -> this.d()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.v.a(this::c);
   }

   @Override
   protected void c() {
      this.v.a();
      fkk.a(this.v, this.G());
   }

   @Override
   public xl i() {
      return xk.a(super.i(), this.r);
   }

   @Override
   public void d() {
      this.u.run();
   }
}
