public class fcl extends gvb {
   private static final xl a = xl.c("mco.selectServer.create");
   private static final xl b = xl.c("mco.configure.world.name");
   private static final xl c = xl.c("mco.configure.world.description");
   private static final int B = 10;
   private static final int C = 210;
   private final fae D;
   private final fkm E = new fkm(this);
   private fhi F;
   private fhi G;
   private final Runnable H;

   public fcl(fae $$0, fba $$1) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1);
   }

   public fcl(fae $$0, long $$1) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1);
   }

   @Override
   public void aN_() {
      this.E.a(this.l, this.p);
      fkq $$0 = this.E.c(fkq.d()).a(10);
      fgz $$1 = fgz.a(xk.j, $$0x -> this.H.run()).a();
      $$1.j = false;
      this.F = new fhi(this.p, 210, 20, b);
      this.F.b($$1x -> $$1.j = !azq.h($$1x));
      this.G = new fhi(this.p, 210, 20, c);
      $$0.a(fki.a(this.p, this.F, b));
      $$0.a(fki.a(this.p, this.G, c));
      fkq $$2 = this.E.b(fkq.e().a(10));
      $$2.a($$1);
      $$2.a(fgz.a(xk.k, $$0x -> this.d()).a());
      this.E.a($$1x -> {
         fgx var10000 = this.c($$1x);
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

   private void a(fba $$0) {
      fec $$1 = new fec($$0.a, this.F.a(), this.G.a());
      fcy $$2 = fcy.a(this, $$0, $$1, () -> this.m.execute(() -> {
            fae.g();
            this.m.a(this.D);
         }));
      this.m.a($$2);
   }

   private void a(long $$0) {
      fmy $$1 = new fcx($$1x -> {
         if ($$1x == null) {
            this.m.a(this);
         } else {
            this.m.a(new fcq(this, new fdx(this.D, $$0, $$1x, this.F.a(), this.G.a())));
         }
      }, a);
      this.m.a($$1);
   }

   @Override
   public void d() {
      this.m.a(this.D);
   }
}
