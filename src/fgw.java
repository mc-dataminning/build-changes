public class fgw extends fhh {
   private static final vu a = vu.c("symlink_warning.title.world").a(n.r);
   private static final vu b = vu.a("symlink_warning.message.world", "https://aka.ms/MinecraftSymLinks");
   private static final vu c = vu.c("symlink_warning.title.pack").a(n.r);
   private static final vu k = vu.a("symlink_warning.message.pack", "https://aka.ms/MinecraftSymLinks");
   private final vu l;
   private final String m;
   private final Runnable n;
   private final feu o = new feu().b(10);

   public fgw(vu $$0, vu $$1, String $$2, Runnable $$3) {
      super($$0);
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
   }

   public static fhh a(Runnable $$0) {
      return new fgw(a, b, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   public static fhh b(Runnable $$0) {
      return new fgw(c, k, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.o.c().b();
      feu.b $$0 = this.o.d(1);
      $$0.a(new fcp(this.e, this.i));
      $$0.a(new fcc(this.l, this.i).c(this.g - 50).b(true));
      int $$1 = 120;
      feu $$2 = new feu().a(5);
      feu.b $$3 = $$2.d(3);
      $$3.a(fbi.a(vt.n, $$0x -> ac.j().a(this.m)).b(120, 20).a());
      $$3.a(fbi.a(vt.o, $$0x -> this.f.o.a(this.m)).b(120, 20).a());
      $$3.a(fbi.a(vt.k, $$0x -> this.d()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.o.a(this::c);
   }

   @Override
   protected void c() {
      this.o.a();
      fet.a(this.o, this.F());
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
