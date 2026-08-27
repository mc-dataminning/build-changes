public class ewt extends gpe {
   private static final vu a = vu.c("mco.selectServer.create");
   private static final vu b = vu.c("mco.configure.world.name");
   private static final vu c = vu.c("mco.configure.world.description");
   private static final int v = 10;
   private static final int w = 210;
   private final eum x;
   private final fev y = new fev(this);
   private fbr z;
   private fbr A;
   private final Runnable B;

   public ewt(eum $$0, evi $$1) {
      super(a);
      this.x = $$0;
      this.B = () -> this.a($$1);
   }

   public ewt(eum $$0, long $$1) {
      super(a);
      this.x = $$0;
      this.B = () -> this.a($$1);
   }

   @Override
   public void aO_() {
      this.y.a(new fcp(this.e, this.i));
      fez $$0 = this.y.c(fez.d()).a(10);
      fbi $$1 = fbi.a(vt.j, $$0x -> this.B.run()).a();
      $$1.j = false;
      this.z = new fbr(this.i, 210, 20, b);
      this.z.b($$1x -> $$1.j = !ac.b($$1x));
      this.A = new fbr(this.i, 210, 20, c);
      $$0.a(fer.a(this.i, this.z, b));
      $$0.a(fer.a(this.i, this.A, c));
      fez $$2 = this.y.b(fez.e().a(10));
      $$2.a($$1);
      $$2.a(fbi.a(vt.k, $$0x -> this.d()).a());
      this.y.a($$1x -> {
         fbg var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aF_() {
      this.b(this.z);
   }

   @Override
   protected void c() {
      this.y.a();
   }

   private void a(evi $$0) {
      eyk $$1 = new eyk($$0.a, this.z.a(), this.A.a());
      exg $$2 = exg.a(this, $$0, $$1, () -> this.f.execute(() -> {
            eum.g();
            this.f.a(this.x);
         }));
      this.f.a($$2);
   }

   private void a(long $$0) {
      fhh $$1 = new exf($$1x -> {
         if ($$1x == null) {
            this.f.a(this);
         } else {
            this.f.a(new ewy(this, new eyf(this.x, $$0, $$1x, this.z.a(), this.A.a())));
         }
      }, a);
      this.f.a($$1);
   }

   @Override
   public void d() {
      this.f.a(this.x);
   }
}
