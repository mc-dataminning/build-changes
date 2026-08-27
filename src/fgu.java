public class fgu extends fhf {
   private static final vu a = vu.c("symlink_warning.title.world").a(n.r);
   private static final vu b = vu.a("symlink_warning.message.world", "https://aka.ms/MinecraftSymLinks");
   private static final vu c = vu.c("symlink_warning.title.pack").a(n.r);
   private static final vu k = vu.a("symlink_warning.message.pack", "https://aka.ms/MinecraftSymLinks");
   private final vu l;
   private final String m;
   private final Runnable n;
   private final fes o = new fes().b(10);

   public fgu(vu $$0, vu $$1, String $$2, Runnable $$3) {
      super($$0);
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
   }

   public static fhf a(Runnable $$0) {
      return new fgu(a, b, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   public static fhf b(Runnable $$0) {
      return new fgu(c, k, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.o.c().b();
      fes.b $$0 = this.o.d(1);
      $$0.a(new fcn(this.e, this.i));
      $$0.a(new fca(this.l, this.i).c(this.g - 50).b(true));
      int $$1 = 120;
      fes $$2 = new fes().a(5);
      fes.b $$3 = $$2.d(3);
      $$3.a(fbg.a(vt.n, $$0x -> ac.j().a(this.m)).b(120, 20).a());
      $$3.a(fbg.a(vt.o, $$0x -> this.f.o.a(this.m)).b(120, 20).a());
      $$3.a(fbg.a(vt.k, $$0x -> this.d()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.o.a(this::c);
   }

   @Override
   protected void c() {
      this.o.a();
      fer.a(this.o, this.F());
   }

   @Override
   public vu i() {
      return vt.a(super.i(), this.l);
   }

   @Override
   public void d() {
      this.n.run();
   }
}
