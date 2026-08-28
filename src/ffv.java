public class ffv extends hdk {
   private static final xd a = xd.c("mco.selectServer.create");
   private static final xd b = xd.c("mco.configure.world.name");
   private static final xd c = xd.c("mco.configure.world.description");
   private static final int B = 10;
   private static final int C = 210;
   private final fdp D;
   private final fny E = new fny(this);
   private fkt F;
   private fkt G;
   private final Runnable H;

   public ffv(fdp $$0, fel $$1) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1);
   }

   public ffv(fdp $$0, long $$1) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1);
   }

   @Override
   public void aR_() {
      this.E.a(this.l, this.p);
      foc $$0 = this.E.c(foc.d()).a(10);
      fkk $$1 = fkk.a(xc.j, $$0x -> this.H.run()).a();
      $$1.j = false;
      this.F = new fkt(this.p, 210, 20, b);
      this.F.b($$1x -> $$1.j = !baa.h($$1x));
      this.G = new fkt(this.p, 210, 20, c);
      $$0.a(fnu.a(this.p, this.F, b));
      $$0.a(fnu.a(this.p, this.G, c));
      foc $$2 = this.E.b(foc.e().a(10));
      $$2.a($$1);
      $$2.a(fkk.a(xc.k, $$0x -> this.d()).a());
      this.E.a($$1x -> {
         fki var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aG_() {
      this.b(this.F);
   }

   @Override
   protected void c() {
      this.E.a();
   }

   private void a(fel $$0) {
      fhl $$1 = new fhl($$0.a, this.F.a(), this.G.a());
      fgh $$2 = fgh.a(this, $$0, $$1, () -> this.m.execute(() -> {
            fdp.g();
            this.m.a(this.D);
         }));
      this.m.a($$2);
   }

   private void a(long $$0) {
      fqd $$1 = new fgg($$1x -> {
         if ($$1x == null) {
            this.m.a(this);
         } else {
            this.m.a(new ffz(this, new fhg(this.D, $$0, $$1x, this.F.a(), this.G.a())));
         }
      }, a);
      this.m.a($$1);
   }

   @Override
   public void d() {
      this.m.a(this.D);
   }
}
