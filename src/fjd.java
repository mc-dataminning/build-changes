public class fjd extends fjo {
   private static final wg a = wg.c("symlink_warning.title.world").a(n.r);
   private static final wg b = wg.a("symlink_warning.message.world", "https://aka.ms/MinecraftSymLinks");
   private static final wg c = wg.c("symlink_warning.title.pack").a(n.r);
   private static final wg d = wg.a("symlink_warning.message.pack", "https://aka.ms/MinecraftSymLinks");
   private final wg o;
   private final String p;
   private final Runnable q;
   private final fhb r = new fhb().b(10);

   public fjd(wg $$0, wg $$1, String $$2, Runnable $$3) {
      super($$0);
      this.o = $$1;
      this.p = $$2;
      this.q = $$3;
   }

   public static fjo a(Runnable $$0) {
      return new fjd(a, b, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   public static fjo b(Runnable $$0) {
      return new fjd(c, d, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.r.c().b();
      fhb.b $$0 = this.r.d(1);
      $$0.a(new few(this.i, this.m));
      $$0.a(new fej(this.o, this.m).d(this.k - 50).b(true));
      int $$1 = 120;
      fhb $$2 = new fhb().a(5);
      fhb.b $$3 = $$2.d(3);
      $$3.a(fdp.a(wf.n, $$0x -> ac.j().a(this.p)).b(120, 20).a());
      $$3.a(fdp.a(wf.o, $$0x -> this.j.o.a(this.p)).b(120, 20).a());
      $$3.a(fdp.a(wf.k, $$0x -> this.d()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.r.a(this::c);
   }

   @Override
   protected void c() {
      this.r.a();
      fha.a(this.r, this.G());
   }

   @Override
   public wg i() {
      return wf.a(super.i(), this.o);
   }

   @Override
   public void d() {
      this.q.run();
   }
}
