public class fbk extends gty {
   private static final wx a = wx.c("mco.selectServer.create");
   private static final wx b = wx.c("mco.configure.world.name");
   private static final wx c = wx.c("mco.configure.world.description");
   private static final int B = 10;
   private static final int C = 210;
   private final ezd D;
   private final fjm E = new fjm(this);
   private fgi F;
   private fgi G;
   private final Runnable H;

   public fbk(ezd $$0, ezz $$1) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1);
   }

   public fbk(ezd $$0, long $$1) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1);
   }

   @Override
   public void aM_() {
      this.E.a(this.l, this.p);
      fjq $$0 = this.E.c(fjq.d()).a(10);
      ffz $$1 = ffz.a(ww.j, $$0x -> this.H.run()).a();
      $$1.j = false;
      this.F = new fgi(this.p, 210, 20, b);
      this.F.b($$1x -> $$1.j = !ayy.h($$1x));
      this.G = new fgi(this.p, 210, 20, c);
      $$0.a(fji.a(this.p, this.F, b));
      $$0.a(fji.a(this.p, this.G, c));
      fjq $$2 = this.E.b(fjq.e().a(10));
      $$2.a($$1);
      $$2.a(ffz.a(ww.k, $$0x -> this.d()).a());
      this.E.a($$1x -> {
         ffx var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aC_() {
      this.b(this.F);
   }

   @Override
   protected void c() {
      this.E.a();
   }

   private void a(ezz $$0) {
      fdb $$1 = new fdb($$0.a, this.F.a(), this.G.a());
      fbx $$2 = fbx.a(this, $$0, $$1, () -> this.m.execute(() -> {
            ezd.g();
            this.m.a(this.D);
         }));
      this.m.a($$2);
   }

   private void a(long $$0) {
      fly $$1 = new fbw($$1x -> {
         if ($$1x == null) {
            this.m.a(this);
         } else {
            this.m.a(new fbp(this, new fcw(this.D, $$0, $$1x, this.F.a(), this.G.a())));
         }
      }, a);
      this.m.a($$1);
   }

   @Override
   public void d() {
      this.m.a(this.D);
   }
}
