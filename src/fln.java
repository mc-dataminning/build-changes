public class fln extends fly {
   private static final wx a = wx.c("symlink_warning.title.world").a(n.r);
   private static final wx b = wx.a("symlink_warning.message.world", "https://aka.ms/MinecraftSymLinks");
   private static final wx c = wx.c("symlink_warning.title.pack").a(n.r);
   private static final wx d = wx.a("symlink_warning.message.pack", "https://aka.ms/MinecraftSymLinks");
   private final wx r;
   private final String s;
   private final Runnable u;
   private final fjl v = new fjl().b(10);

   public fln(wx $$0, wx $$1, String $$2, Runnable $$3) {
      super($$0);
      this.r = $$1;
      this.s = $$2;
      this.u = $$3;
   }

   public static fly a(Runnable $$0) {
      return new fln(a, b, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   public static fly b(Runnable $$0) {
      return new fln(c, d, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.v.c().b();
      fjl.b $$0 = this.v.d(1);
      $$0.a(new fhg(this.l, this.p));
      $$0.a(new fgt(this.r, this.p).d(this.n - 50).b(true));
      int $$1 = 120;
      fjl $$2 = new fjl().a(5);
      fjl.b $$3 = $$2.d(3);
      $$3.a(ffz.a(ww.n, $$0x -> ac.k().a(this.s)).b(120, 20).a());
      $$3.a(ffz.a(ww.o, $$0x -> this.m.o.a(this.s)).b(120, 20).a());
      $$3.a(ffz.a(ww.k, $$0x -> this.d()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.v.a(this::c);
   }

   @Override
   protected void c() {
      this.v.a();
      fjk.a(this.v, this.G());
   }

   @Override
   public wx i() {
      return ww.a(super.i(), this.r);
   }

   @Override
   public void d() {
      this.u.run();
   }
}
