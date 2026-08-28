public class fms extends fnd {
   private static final xp a = xp.c("symlink_warning.title.world").a(n.r);
   private static final xp b = xp.a("symlink_warning.message.world", "https://aka.ms/MinecraftSymLinks");
   private static final xp c = xp.c("symlink_warning.title.pack").a(n.r);
   private static final xp d = xp.a("symlink_warning.message.pack", "https://aka.ms/MinecraftSymLinks");
   private final xp r;
   private final String s;
   private final Runnable u;
   private final fkq v = new fkq().b(10);

   public fms(xp $$0, xp $$1, String $$2, Runnable $$3) {
      super($$0);
      this.r = $$1;
      this.s = $$2;
      this.u = $$3;
   }

   public static fnd a(Runnable $$0) {
      return new fms(a, b, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   public static fnd b(Runnable $$0) {
      return new fms(c, d, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.v.c().b();
      fkq.b $$0 = this.v.d(1);
      $$0.a(new fil(this.l, this.p));
      $$0.a(new fhy(this.r, this.p).d(this.n - 50).b(true));
      int $$1 = 120;
      fkq $$2 = new fkq().a(5);
      fkq.b $$3 = $$2.d(3);
      $$3.a(fhe.a(xo.n, $$0x -> ac.k().a(this.s)).b(120, 20).a());
      $$3.a(fhe.a(xo.o, $$0x -> this.m.o.a(this.s)).b(120, 20).a());
      $$3.a(fhe.a(xo.k, $$0x -> this.d()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.v.a(this::c);
   }

   @Override
   protected void c() {
      this.v.a();
      fkp.a(this.v, this.G());
   }

   @Override
   public xp i() {
      return xo.a(super.i(), this.r);
   }

   @Override
   public void d() {
      this.u.run();
   }
}
