public class fcq extends gvg {
   private static final xp a = xp.c("mco.selectServer.create");
   private static final xp b = xp.c("mco.configure.world.name");
   private static final xp c = xp.c("mco.configure.world.description");
   private static final int B = 10;
   private static final int C = 210;
   private final faj D;
   private final fkr E = new fkr(this);
   private fhn F;
   private fhn G;
   private final Runnable H;

   public fcq(faj $$0, fbf $$1) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1);
   }

   public fcq(faj $$0, long $$1) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1);
   }

   @Override
   public void aM_() {
      this.E.a(this.l, this.p);
      fkv $$0 = this.E.c(fkv.d()).a(10);
      fhe $$1 = fhe.a(xo.j, $$0x -> this.H.run()).a();
      $$1.j = false;
      this.F = new fhn(this.p, 210, 20, b);
      this.F.b($$1x -> $$1.j = !azv.h($$1x));
      this.G = new fhn(this.p, 210, 20, c);
      $$0.a(fkn.a(this.p, this.F, b));
      $$0.a(fkn.a(this.p, this.G, c));
      fkv $$2 = this.E.b(fkv.e().a(10));
      $$2.a($$1);
      $$2.a(fhe.a(xo.k, $$0x -> this.d()).a());
      this.E.a($$1x -> {
         fhc var10000 = this.c($$1x);
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

   private void a(fbf $$0) {
      feh $$1 = new feh($$0.a, this.F.a(), this.G.a());
      fdd $$2 = fdd.a(this, $$0, $$1, () -> this.m.execute(() -> {
            faj.g();
            this.m.a(this.D);
         }));
      this.m.a($$2);
   }

   private void a(long $$0) {
      fnd $$1 = new fdc($$1x -> {
         if ($$1x == null) {
            this.m.a(this);
         } else {
            this.m.a(new fcv(this, new fec(this.D, $$0, $$1x, this.F.a(), this.G.a())));
         }
      }, a);
      this.m.a($$1);
   }

   @Override
   public void d() {
      this.m.a(this.D);
   }
}
