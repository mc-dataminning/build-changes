public class fdb extends fdm {
   private static final vg a = vg.c("symlink_warning.title.world").a(n.r);
   private static final vg b = vg.a("symlink_warning.message.world", "https://aka.ms/MinecraftSymLinks");
   private static final vg c = vg.c("symlink_warning.title.pack").a(n.r);
   private static final vg k = vg.a("symlink_warning.message.pack", "https://aka.ms/MinecraftSymLinks");
   private final vg l;
   private final String m;
   private final Runnable n;
   private final fba o = new fba().b(10);

   public fdb(vg $$0, vg $$1, String $$2, Runnable $$3) {
      super($$0);
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
   }

   public static fdm a(Runnable $$0) {
      return new fdb(a, b, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   public static fdm b(Runnable $$0) {
      return new fdb(c, k, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.o.c().b();
      fba.b $$0 = this.o.d(1);
      $$0.a(new eyy(this.e, this.i));
      $$0.a(new eyl(this.l, this.i).c(this.g - 50).b(true));
      int $$1 = 120;
      fba $$2 = new fba().a(5);
      fba.b $$3 = $$2.d(3);
      $$3.a(exr.a(vf.n, $$0x -> ac.j().a(this.m)).b(120, 20).a());
      $$3.a(exr.a(vf.o, $$0x -> this.f.o.a(this.m)).b(120, 20).a());
      $$3.a(exr.a(vf.k, $$0x -> this.d()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.o.a(this::d);
   }

   @Override
   protected void c() {
      this.o.a();
      faz.a(this.o, this.F());
   }

   @Override
   public vg i() {
      return vf.a(super.i(), this.l);
   }

   @Override
   public void d() {
      this.n.run();
   }
}
