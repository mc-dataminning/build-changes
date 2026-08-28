public class fcp extends gvf {
   private static final xo a = xo.c("mco.selectServer.create");
   private static final xo b = xo.c("mco.configure.world.name");
   private static final xo c = xo.c("mco.configure.world.description");
   private static final int B = 10;
   private static final int C = 210;
   private final fai D;
   private final fkq E = new fkq(this);
   private fhm F;
   private fhm G;
   private final Runnable H;

   public fcp(fai $$0, fbe $$1) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1);
   }

   public fcp(fai $$0, long $$1) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1);
   }

   @Override
   public void aM_() {
      this.E.a(this.l, this.p);
      fku $$0 = this.E.c(fku.d()).a(10);
      fhd $$1 = fhd.a(xn.j, $$0x -> this.H.run()).a();
      $$1.j = false;
      this.F = new fhm(this.p, 210, 20, b);
      this.F.b($$1x -> $$1.j = !azu.h($$1x));
      this.G = new fhm(this.p, 210, 20, c);
      $$0.a(fkm.a(this.p, this.F, b));
      $$0.a(fkm.a(this.p, this.G, c));
      fku $$2 = this.E.b(fku.e().a(10));
      $$2.a($$1);
      $$2.a(fhd.a(xn.k, $$0x -> this.d()).a());
      this.E.a($$1x -> {
         fhb var10000 = this.c($$1x);
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

   private void a(fbe $$0) {
      feg $$1 = new feg($$0.a, this.F.a(), this.G.a());
      fdc $$2 = fdc.a(this, $$0, $$1, () -> this.m.execute(() -> {
            fai.g();
            this.m.a(this.D);
         }));
      this.m.a($$2);
   }

   private void a(long $$0) {
      fnc $$1 = new fdb($$1x -> {
         if ($$1x == null) {
            this.m.a(this);
         } else {
            this.m.a(new fcu(this, new feb(this.D, $$0, $$1x, this.F.a(), this.G.a())));
         }
      }, a);
      this.m.a($$1);
   }

   @Override
   public void d() {
      this.m.a(this.D);
   }
}
