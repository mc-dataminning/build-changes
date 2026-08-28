public class ffz extends hdp {
   private static final xe a = xe.c("mco.selectServer.create");
   private static final xe b = xe.c("mco.configure.world.name");
   private static final xe c = xe.c("mco.configure.world.description");
   private static final int B = 10;
   private static final int C = 210;
   private final fdt D;
   private final foc E = new foc(this);
   private fkx F;
   private fkx G;
   private final Runnable H;

   public ffz(fdt $$0, fep $$1) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1);
   }

   public ffz(fdt $$0, long $$1) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1);
   }

   @Override
   public void aS_() {
      this.E.a(this.l, this.p);
      fog $$0 = this.E.c(fog.d()).a(10);
      fko $$1 = fko.a(xd.j, $$0x -> this.H.run()).a();
      $$1.j = false;
      this.F = new fkx(this.p, 210, 20, b);
      this.F.b($$1x -> $$1.j = !bac.h($$1x));
      this.G = new fkx(this.p, 210, 20, c);
      $$0.a(fny.a(this.p, this.F, b));
      $$0.a(fny.a(this.p, this.G, c));
      fog $$2 = this.E.b(fog.e().a(10));
      $$2.a($$1);
      $$2.a(fko.a(xd.k, $$0x -> this.d()).a());
      this.E.a($$1x -> {
         fkm var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aH_() {
      this.b(this.F);
   }

   @Override
   protected void c() {
      this.E.a();
   }

   private void a(fep $$0) {
      fhp $$1 = new fhp($$0.a, this.F.a(), this.G.a());
      fgl $$2 = fgl.a(this, $$0, $$1, () -> this.m.execute(() -> {
            fdt.g();
            this.m.a(this.D);
         }));
      this.m.a($$2);
   }

   private void a(long $$0) {
      fqh $$1 = new fgk($$1x -> {
         if ($$1x == null) {
            this.m.a(this);
         } else {
            this.m.a(new fgd(this, new fhk(this.D, $$0, $$1x, this.F.a(), this.G.a())));
         }
      }, a);
      this.m.a($$1);
   }

   @Override
   public void d() {
      this.m.a(this.D);
   }
}
