public class fob extends fon {
   private static final xe a = xe.c("symlink_warning.title.world").a(n.r);
   private static final xe b = xe.a("symlink_warning.message.world", "https://aka.ms/MinecraftSymLinks");
   private static final xe c = xe.c("symlink_warning.title.pack").a(n.r);
   private static final xe d = xe.a("symlink_warning.message.pack", "https://aka.ms/MinecraftSymLinks");
   private final xe r;
   private final String s;
   private final Runnable u;
   private final flz v = new flz().b(10);

   public fob(xe $$0, xe $$1, String $$2, Runnable $$3) {
      super($$0);
      this.r = $$1;
      this.s = $$2;
      this.u = $$3;
   }

   public static fon a(Runnable $$0) {
      return new fob(a, b, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   public static fon b(Runnable $$0) {
      return new fob(c, d, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.v.c().b();
      flz.b $$0 = this.v.d(1);
      $$0.a(new fju(this.l, this.p));
      $$0.a(new fjh(this.r, this.p).d(this.n - 50).b(true));
      int $$1 = 120;
      flz $$2 = new flz().a(5);
      flz.b $$3 = $$2.d(3);
      $$3.a(fin.a(xd.n, $$0x -> ad.j().a(this.s)).b(120, 20).a());
      $$3.a(fin.a(xd.o, $$0x -> this.m.o.a(this.s)).b(120, 20).a());
      $$3.a(fin.a(xd.k, $$0x -> this.d()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.v.a(this::c);
   }

   @Override
   protected void c() {
      this.v.a();
      fly.a(this.v, this.G());
   }

   @Override
   public xe i() {
      return xd.a(super.i(), this.r);
   }

   @Override
   public void d() {
      this.u.run();
   }
}
