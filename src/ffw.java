public class ffw extends fgh {
   private static final vs a = vs.c("symlink_warning.title.world").a(n.r);
   private static final vs b = vs.a("symlink_warning.message.world", "https://aka.ms/MinecraftSymLinks");
   private static final vs c = vs.c("symlink_warning.title.pack").a(n.r);
   private static final vs k = vs.a("symlink_warning.message.pack", "https://aka.ms/MinecraftSymLinks");
   private final vs l;
   private final String m;
   private final Runnable n;
   private final fdv o = new fdv().b(10);

   public ffw(vs $$0, vs $$1, String $$2, Runnable $$3) {
      super($$0);
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
   }

   public static fgh a(Runnable $$0) {
      return new ffw(a, b, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   public static fgh b(Runnable $$0) {
      return new ffw(c, k, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.o.c().b();
      fdv.b $$0 = this.o.d(1);
      $$0.a(new fbr(this.e, this.i));
      $$0.a(new fbe(this.l, this.i).c(this.g - 50).b(true));
      int $$1 = 120;
      fdv $$2 = new fdv().a(5);
      fdv.b $$3 = $$2.d(3);
      $$3.a(fak.a(vr.n, $$0x -> ac.j().a(this.m)).b(120, 20).a());
      $$3.a(fak.a(vr.o, $$0x -> this.f.o.a(this.m)).b(120, 20).a());
      $$3.a(fak.a(vr.k, $$0x -> this.d()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.o.a(this::c);
   }

   @Override
   protected void c() {
      this.o.a();
      fdu.a(this.o, this.F());
   }

   @Override
   public vs i() {
      return vr.a(super.i(), this.l);
   }

   @Override
   public void d() {
      this.n.run();
   }
}
