public class fcs extends gvi {
   private static final xp a = xp.c("mco.selectServer.create");
   private static final xp b = xp.c("mco.configure.world.name");
   private static final xp c = xp.c("mco.configure.world.description");
   private static final int B = 10;
   private static final int C = 210;
   private final fal D;
   private final fkt E = new fkt(this);
   private fhp F;
   private fhp G;
   private final Runnable H;

   public fcs(fal $$0, fbh $$1) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1);
   }

   public fcs(fal $$0, long $$1) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1);
   }

   @Override
   public void aM_() {
      this.E.a(this.l, this.p);
      fkx $$0 = this.E.c(fkx.d()).a(10);
      fhg $$1 = fhg.a(xo.j, $$0x -> this.H.run()).a();
      $$1.j = false;
      this.F = new fhp(this.p, 210, 20, b);
      this.F.b($$1x -> $$1.j = !azv.h($$1x));
      this.G = new fhp(this.p, 210, 20, c);
      $$0.a(fkp.a(this.p, this.F, b));
      $$0.a(fkp.a(this.p, this.G, c));
      fkx $$2 = this.E.b(fkx.e().a(10));
      $$2.a($$1);
      $$2.a(fhg.a(xo.k, $$0x -> this.d()).a());
      this.E.a($$1x -> {
         fhe var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aB_() {
      this.b(this.F);
   }

   @Override
   protected void c() {
      this.E.a();
   }

   private void a(fbh $$0) {
      fej $$1 = new fej($$0.a, this.F.a(), this.G.a());
      fdf $$2 = fdf.a(this, $$0, $$1, () -> this.m.execute(() -> {
            fal.g();
            this.m.a(this.D);
         }));
      this.m.a($$2);
   }

   private void a(long $$0) {
      fnf $$1 = new fde($$1x -> {
         if ($$1x == null) {
            this.m.a(this);
         } else {
            this.m.a(new fcx(this, new fee(this.D, $$0, $$1x, this.F.a(), this.G.a())));
         }
      }, a);
      this.m.a($$1);
   }

   @Override
   public void d() {
      this.m.a(this.D);
   }
}
