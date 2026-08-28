public class fdt extends gwj {
   private static final wy a = wy.c("mco.selectServer.create");
   private static final wy b = wy.c("mco.configure.world.name");
   private static final wy c = wy.c("mco.configure.world.description");
   private static final int A = 10;
   private static final int B = 210;
   private final fbn C;
   private final flt D = new flt(this);
   private fip E;
   private fip F;
   private final Runnable G;

   public fdt(fbn $$0, fcj $$1) {
      super(a);
      this.C = $$0;
      this.G = () -> this.a($$1);
   }

   public fdt(fbn $$0, long $$1) {
      super(a);
      this.C = $$0;
      this.G = () -> this.a($$1);
   }

   @Override
   public void aP_() {
      this.D.a(this.k, this.o);
      flx $$0 = this.D.c(flx.d()).a(10);
      fig $$1 = fig.a(wx.j, $$0x -> this.G.run()).a();
      $$1.j = false;
      this.E = new fip(this.o, 210, 20, b);
      this.E.b($$1x -> $$1.j = !azk.h($$1x));
      this.F = new fip(this.o, 210, 20, c);
      $$0.a(flp.a(this.o, this.E, b));
      $$0.a(flp.a(this.o, this.F, c));
      flx $$2 = this.D.b(flx.e().a(10));
      $$2.a($$1);
      $$2.a(fig.a(wx.k, $$0x -> this.d()).a());
      this.D.a($$1x -> {
         fie var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aE_() {
      this.b(this.E);
   }

   @Override
   protected void c() {
      this.D.a();
   }

   private void a(fcj $$0) {
      ffj $$1 = new ffj($$0.a, this.E.a(), this.F.a());
      fef $$2 = fef.a(this, $$0, $$1, () -> this.l.execute(() -> {
            fbn.g();
            this.l.a(this.C);
         }));
      this.l.a($$2);
   }

   private void a(long $$0) {
      fnx $$1 = new fee($$1x -> {
         if ($$1x == null) {
            this.l.a(this);
         } else {
            this.l.a(new fdx(this, new ffe(this.C, $$0, $$1x, this.E.a(), this.F.a())));
         }
      }, a);
      this.l.a($$1);
   }

   @Override
   public void d() {
      this.l.a(this.C);
   }
}
