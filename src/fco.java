public class fco extends gve {
   private static final xo a = xo.c("mco.selectServer.create");
   private static final xo b = xo.c("mco.configure.world.name");
   private static final xo c = xo.c("mco.configure.world.description");
   private static final int B = 10;
   private static final int C = 210;
   private final fah D;
   private final fkp E = new fkp(this);
   private fhl F;
   private fhl G;
   private final Runnable H;

   public fco(fah $$0, fbd $$1) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1);
   }

   public fco(fah $$0, long $$1) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1);
   }

   @Override
   public void aM_() {
      this.E.a(this.l, this.p);
      fkt $$0 = this.E.c(fkt.d()).a(10);
      fhc $$1 = fhc.a(xn.j, $$0x -> this.H.run()).a();
      $$1.j = false;
      this.F = new fhl(this.p, 210, 20, b);
      this.F.b($$1x -> $$1.j = !azt.h($$1x));
      this.G = new fhl(this.p, 210, 20, c);
      $$0.a(fkl.a(this.p, this.F, b));
      $$0.a(fkl.a(this.p, this.G, c));
      fkt $$2 = this.E.b(fkt.e().a(10));
      $$2.a($$1);
      $$2.a(fhc.a(xn.k, $$0x -> this.d()).a());
      this.E.a($$1x -> {
         fha var10000 = this.c($$1x);
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

   private void a(fbd $$0) {
      fef $$1 = new fef($$0.a, this.F.a(), this.G.a());
      fdb $$2 = fdb.a(this, $$0, $$1, () -> this.m.execute(() -> {
            fah.g();
            this.m.a(this.D);
         }));
      this.m.a($$2);
   }

   private void a(long $$0) {
      fnb $$1 = new fda($$1x -> {
         if ($$1x == null) {
            this.m.a(this);
         } else {
            this.m.a(new fct(this, new fea(this.D, $$0, $$1x, this.F.a(), this.G.a())));
         }
      }, a);
      this.m.a($$1);
   }

   @Override
   public void d() {
      this.m.a(this.D);
   }
}
