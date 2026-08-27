public class ffa extends ffl {
   private static final vq a = vq.c("symlink_warning.title.world").a(n.r);
   private static final vq b = vq.a("symlink_warning.message.world", "https://aka.ms/MinecraftSymLinks");
   private static final vq c = vq.c("symlink_warning.title.pack").a(n.r);
   private static final vq k = vq.a("symlink_warning.message.pack", "https://aka.ms/MinecraftSymLinks");
   private final vq l;
   private final String m;
   private final Runnable n;
   private final fcz o = new fcz().b(10);

   public ffa(vq $$0, vq $$1, String $$2, Runnable $$3) {
      super($$0);
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
   }

   public static ffl a(Runnable $$0) {
      return new ffa(a, b, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   public static ffl b(Runnable $$0) {
      return new ffa(c, k, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   @Override
   protected void aQ_() {
      super.aQ_();
      this.o.c().b();
      fcz.b $$0 = this.o.d(1);
      $$0.a(new fav(this.e, this.i));
      $$0.a(new fai(this.l, this.i).c(this.g - 50).b(true));
      int $$1 = 120;
      fcz $$2 = new fcz().a(5);
      fcz.b $$3 = $$2.d(3);
      $$3.a(ezo.a(vp.n, $$0x -> ac.j().a(this.m)).b(120, 20).a());
      $$3.a(ezo.a(vp.o, $$0x -> this.f.o.a(this.m)).b(120, 20).a());
      $$3.a(ezo.a(vp.k, $$0x -> this.d()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.o.a(this::c);
   }

   @Override
   protected void c() {
      this.o.a();
      fcy.a(this.o, this.F());
   }

   @Override
   public vq i() {
      return vp.a(super.i(), this.l);
   }

   @Override
   public void d() {
      this.n.run();
   }
}
