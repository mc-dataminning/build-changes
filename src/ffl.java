public class ffl extends hct {
   private static final xd a = xd.c("mco.selectServer.create");
   private static final xd b = xd.c("mco.configure.world.name");
   private static final xd c = xd.c("mco.configure.world.description");
   private static final int B = 10;
   private static final int C = 210;
   private final fdf D;
   private final fno E = new fno(this);
   private fkj F;
   private fkj G;
   private final Runnable H;

   public ffl(fdf $$0, feb $$1) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1);
   }

   public ffl(fdf $$0, long $$1) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1);
   }

   @Override
   public void aT_() {
      this.E.a(this.l, this.p);
      fns $$0 = this.E.c(fns.d()).a(10);
      fka $$1 = fka.a(xc.j, $$0x -> this.H.run()).a();
      $$1.j = false;
      this.F = new fkj(this.p, 210, 20, b);
      this.F.b($$1x -> $$1.j = !azz.h($$1x));
      this.G = new fkj(this.p, 210, 20, c);
      $$0.a(fnk.a(this.p, this.F, b));
      $$0.a(fnk.a(this.p, this.G, c));
      fns $$2 = this.E.b(fns.e().a(10));
      $$2.a($$1);
      $$2.a(fka.a(xc.k, $$0x -> this.d()).a());
      this.E.a($$1x -> {
         fjy var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aI_() {
      this.b(this.F);
   }

   @Override
   protected void c() {
      this.E.a();
   }

   private void a(feb $$0) {
      fhb $$1 = new fhb($$0.a, this.F.a(), this.G.a());
      ffx $$2 = ffx.a(this, $$0, $$1, () -> this.m.execute(() -> {
            fdf.g();
            this.m.a(this.D);
         }));
      this.m.a($$2);
   }

   private void a(long $$0) {
      fpt $$1 = new ffw($$1x -> {
         if ($$1x == null) {
            this.m.a(this);
         } else {
            this.m.a(new ffp(this, new fgw(this.D, $$0, $$1x, this.F.a(), this.G.a())));
         }
      }, a);
      this.m.a($$1);
   }

   @Override
   public void d() {
      this.m.a(this.D);
   }
}
