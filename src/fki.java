public class fki extends fkt {
   private static final ws a = ws.c("symlink_warning.title.world").a(n.r);
   private static final ws b = ws.a("symlink_warning.message.world", "https://aka.ms/MinecraftSymLinks");
   private static final ws c = ws.c("symlink_warning.title.pack").a(n.r);
   private static final ws d = ws.a("symlink_warning.message.pack", "https://aka.ms/MinecraftSymLinks");
   private final ws r;
   private final String s;
   private final Runnable u;
   private final fig v = new fig().b(10);

   public fki(ws $$0, ws $$1, String $$2, Runnable $$3) {
      super($$0);
      this.r = $$1;
      this.s = $$2;
      this.u = $$3;
   }

   public static fkt a(Runnable $$0) {
      return new fki(a, b, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   public static fkt b(Runnable $$0) {
      return new fki(c, d, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.v.c().b();
      fig.b $$0 = this.v.d(1);
      $$0.a(new fgb(this.l, this.p));
      $$0.a(new ffo(this.r, this.p).d(this.n - 50).b(true));
      int $$1 = 120;
      fig $$2 = new fig().a(5);
      fig.b $$3 = $$2.d(3);
      $$3.a(feu.a(wr.n, $$0x -> ac.j().a(this.s)).b(120, 20).a());
      $$3.a(feu.a(wr.o, $$0x -> this.m.o.a(this.s)).b(120, 20).a());
      $$3.a(feu.a(wr.k, $$0x -> this.d()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.v.a(this::c);
   }

   @Override
   protected void c() {
      this.v.a();
      fif.a(this.v, this.G());
   }

   @Override
   public ws i() {
      return wr.a(super.i(), this.r);
   }

   @Override
   public void d() {
      this.u.run();
   }
}
