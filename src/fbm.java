public class fbm extends gty {
   private static final wx a = wx.c("mco.selectServer.create");
   private static final wx b = wx.c("mco.configure.world.name");
   private static final wx c = wx.c("mco.configure.world.description");
   private static final int B = 10;
   private static final int C = 210;
   private final ezf D;
   private final fjn E = new fjn(this);
   private fgj F;
   private fgj G;
   private final Runnable H;

   public fbm(ezf $$0, fab $$1) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1);
   }

   public fbm(ezf $$0, long $$1) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1);
   }

   @Override
   public void aN_() {
      this.E.a(this.l, this.p);
      fjr $$0 = this.E.c(fjr.d()).a(10);
      fga $$1 = fga.a(ww.j, $$0x -> this.H.run()).a();
      $$1.j = false;
      this.F = new fgj(this.p, 210, 20, b);
      this.F.b($$1x -> $$1.j = !aza.h($$1x));
      this.G = new fgj(this.p, 210, 20, c);
      $$0.a(fjj.a(this.p, this.F, b));
      $$0.a(fjj.a(this.p, this.G, c));
      fjr $$2 = this.E.b(fjr.e().a(10));
      $$2.a($$1);
      $$2.a(fga.a(ww.k, $$0x -> this.d()).a());
      this.E.a($$1x -> {
         ffy var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aD_() {
      this.b(this.F);
   }

   @Override
   protected void c() {
      this.E.a();
   }

   private void a(fab $$0) {
      fdd $$1 = new fdd($$0.a, this.F.a(), this.G.a());
      fbz $$2 = fbz.a(this, $$0, $$1, () -> this.m.execute(() -> {
            ezf.g();
            this.m.a(this.D);
         }));
      this.m.a($$2);
   }

   private void a(long $$0) {
      flz $$1 = new fby($$1x -> {
         if ($$1x == null) {
            this.m.a(this);
         } else {
            this.m.a(new fbr(this, new fcy(this.D, $$0, $$1x, this.F.a(), this.G.a())));
         }
      }, a);
      this.m.a($$1);
   }

   @Override
   public void d() {
      this.m.a(this.D);
   }
}
