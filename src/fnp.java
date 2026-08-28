public class fnp extends fnx {
   private static final wy a = wy.c("symlink_warning.title.world").a(n.r);
   private static final wy b = wy.a("symlink_warning.message.world", "https://aka.ms/MinecraftSymLinks");
   private static final wy c = wy.c("symlink_warning.title.pack").a(n.r);
   private static final wy q = wy.a("symlink_warning.message.pack", "https://aka.ms/MinecraftSymLinks");
   private final wy r;
   private final String s;
   private final Runnable u;
   private final fls v = new fls().b(10);

   public fnp(wy $$0, wy $$1, String $$2, Runnable $$3) {
      super($$0);
      this.r = $$1;
      this.s = $$2;
      this.u = $$3;
   }

   public static fnx a(Runnable $$0) {
      return new fnp(a, b, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   public static fnx b(Runnable $$0) {
      return new fnp(c, q, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.v.c().b();
      fls.b $$0 = this.v.d(1);
      $$0.a(new fjn(this.k, this.o));
      $$0.a(new fja(this.r, this.o).d(this.m - 50).b(true));
      int $$1 = 120;
      fls $$2 = new fls().a(5);
      fls.b $$3 = $$2.d(3);
      $$3.a(fig.a(wx.n, $$0x -> ad.k().a(this.s)).b(120, 20).a());
      $$3.a(fig.a(wx.o, $$0x -> this.l.o.a(this.s)).b(120, 20).a());
      $$3.a(fig.a(wx.k, $$0x -> this.d()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.v.a(this::c);
   }

   @Override
   protected void c() {
      this.v.a();
      flr.a(this.v, this.H());
   }

   @Override
   public wy i() {
      return wx.a(super.i(), this.r);
   }

   @Override
   public void d() {
      this.u.run();
   }
}
