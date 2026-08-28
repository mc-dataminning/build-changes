public class fmu extends fnf {
   private static final xp a = xp.c("symlink_warning.title.world").a(n.r);
   private static final xp b = xp.a("symlink_warning.message.world", "https://aka.ms/MinecraftSymLinks");
   private static final xp c = xp.c("symlink_warning.title.pack").a(n.r);
   private static final xp d = xp.a("symlink_warning.message.pack", "https://aka.ms/MinecraftSymLinks");
   private final xp r;
   private final String s;
   private final Runnable u;
   private final fks v = new fks().b(10);

   public fmu(xp $$0, xp $$1, String $$2, Runnable $$3) {
      super($$0);
      this.r = $$1;
      this.s = $$2;
      this.u = $$3;
   }

   public static fnf a(Runnable $$0) {
      return new fmu(a, b, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   public static fnf b(Runnable $$0) {
      return new fmu(c, d, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.v.c().b();
      fks.b $$0 = this.v.d(1);
      $$0.a(new fin(this.l, this.p));
      $$0.a(new fia(this.r, this.p).d(this.n - 50).b(true));
      int $$1 = 120;
      fks $$2 = new fks().a(5);
      fks.b $$3 = $$2.d(3);
      $$3.a(fhg.a(xo.n, $$0x -> ac.k().a(this.s)).b(120, 20).a());
      $$3.a(fhg.a(xo.o, $$0x -> this.m.o.a(this.s)).b(120, 20).a());
      $$3.a(fhg.a(xo.k, $$0x -> this.d()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.v.a(this::c);
   }

   @Override
   protected void c() {
      this.v.a();
      fkr.a(this.v, this.G());
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
