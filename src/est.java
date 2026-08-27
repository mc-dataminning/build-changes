public class est extends gkp {
   private static final vf a = vf.c("mco.selectServer.create");
   private static final vf b = vf.c("mco.configure.world.name");
   private static final vf c = vf.c("mco.configure.world.description");
   private static final int v = 10;
   private static final int w = 210;
   private final eqm x;
   private final faq y = new faq(this);
   private exp z;
   private exp A;
   private final Runnable B;

   public est(eqm $$0, eri $$1) {
      super(a);
      this.x = $$0;
      this.B = () -> this.a($$1);
   }

   public est(eqm $$0, long $$1) {
      super(a);
      this.x = $$0;
      this.B = () -> this.a($$1);
   }

   @Override
   public void aN_() {
      this.y.a(new eyn(this.e, this.i));
      fau $$0 = this.y.c(fau.d()).a(10);
      exg $$1 = exg.a(ve.j, $$0x -> this.B.run()).a();
      $$1.j = false;
      this.z = new exp(this.i, 210, 20, b);
      this.z.b($$1x -> $$1.j = !ac.b($$1x));
      this.A = new exp(this.i, 210, 20, c);
      $$0.a(fam.a(this.i, this.z, b));
      $$0.a(fam.a(this.i, this.A, c));
      fau $$2 = this.y.b(fau.e().a(10));
      $$2.a($$1);
      $$2.a(exg.a(ve.k, $$0x -> this.aE_()).a());
      this.y.a($$1x -> {
         exe var10000 = this.d($$1x);
      });
      this.c();
      this.c(this.z);
   }

   @Override
   protected void c() {
      this.y.a();
   }

   private void a(eri $$0) {
      euq $$1 = new euq($$0.a, this.z.a(), this.A.a());
      etg $$2 = etg.a(this, $$0, $$1, () -> this.f.execute(() -> {
            eqm.f();
            this.f.a(this.x);
         }));
      this.f.a($$2);
   }

   private void a(long $$0) {
      fdb $$1 = new etf($$1x -> {
         if ($$1x == null) {
            this.f.a(this);
         } else {
            this.f.a(new esy(this, new euf(this.x, $$0, $$1x, this.z.a(), this.A.a())));
         }
      }, a);
      this.f.a($$1);
   }

   @Override
   public void aE_() {
      this.f.a(this.x);
   }
}
