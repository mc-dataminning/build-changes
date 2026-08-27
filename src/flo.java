public class flo extends flz {
   private static final wx a = wx.c("symlink_warning.title.world").a(n.r);
   private static final wx b = wx.a("symlink_warning.message.world", "https://aka.ms/MinecraftSymLinks");
   private static final wx c = wx.c("symlink_warning.title.pack").a(n.r);
   private static final wx d = wx.a("symlink_warning.message.pack", "https://aka.ms/MinecraftSymLinks");
   private final wx r;
   private final String s;
   private final Runnable u;
   private final fjm v = new fjm().b(10);

   public flo(wx $$0, wx $$1, String $$2, Runnable $$3) {
      super($$0);
      this.r = $$1;
      this.s = $$2;
      this.u = $$3;
   }

   public static flz a(Runnable $$0) {
      return new flo(a, b, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   public static flz b(Runnable $$0) {
      return new flo(c, d, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.v.c().b();
      fjm.b $$0 = this.v.d(1);
      $$0.a(new fhh(this.l, this.p));
      $$0.a(new fgu(this.r, this.p).d(this.n - 50).b(true));
      int $$1 = 120;
      fjm $$2 = new fjm().a(5);
      fjm.b $$3 = $$2.d(3);
      $$3.a(fga.a(ww.n, $$0x -> ac.k().a(this.s)).b(120, 20).a());
      $$3.a(fga.a(ww.o, $$0x -> this.m.o.a(this.s)).b(120, 20).a());
      $$3.a(fga.a(ww.k, $$0x -> this.d()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.v.a(this::c);
   }

   @Override
   protected void c() {
      this.v.a();
      fjl.a(this.v, this.G());
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
