public class etc extends gld {
   private static final vg a = vg.c("mco.selectServer.create");
   private static final vg b = vg.c("mco.configure.world.name");
   private static final vg c = vg.c("mco.configure.world.description");
   private static final int v = 10;
   private static final int w = 210;
   private final eqv x;
   private final fbb y = new fbb(this);
   private eya z;
   private eya A;
   private final Runnable B;

   public etc(eqv $$0, err $$1) {
      super(a);
      this.x = $$0;
      this.B = () -> this.a($$1);
   }

   public etc(eqv $$0, long $$1) {
      super(a);
      this.x = $$0;
      this.B = () -> this.a($$1);
   }

   @Override
   public void aP_() {
      this.y.a(new eyy(this.e, this.i));
      fbf $$0 = this.y.c(fbf.d()).a(10);
      exr $$1 = exr.a(vf.j, $$0x -> this.B.run()).a();
      $$1.j = false;
      this.z = new eya(this.i, 210, 20, b);
      this.z.b($$1x -> $$1.j = !ac.b($$1x));
      this.A = new eya(this.i, 210, 20, c);
      $$0.a(fax.a(this.i, this.z, b));
      $$0.a(fax.a(this.i, this.A, c));
      fbf $$2 = this.y.b(fbf.e().a(10));
      $$2.a($$1);
      $$2.a(exr.a(vf.k, $$0x -> this.d()).a());
      this.y.a($$1x -> {
         exp var10000 = this.d($$1x);
      });
      this.c();
      this.c(this.z);
   }

   @Override
   protected void c() {
      this.y.a();
   }

   private void a(err $$0) {
      euz $$1 = new euz($$0.a, this.z.a(), this.A.a());
      etp $$2 = etp.a(this, $$0, $$1, () -> this.f.execute(() -> {
            eqv.g();
            this.f.a(this.x);
         }));
      this.f.a($$2);
   }

   private void a(long $$0) {
      fdm $$1 = new eto($$1x -> {
         if ($$1x == null) {
            this.f.a(this);
         } else {
            this.f.a(new eth(this, new euo(this.x, $$0, $$1x, this.z.a(), this.A.a())));
         }
      }, a);
      this.f.a($$1);
   }

   @Override
   public void d() {
      this.f.a(this.x);
   }
}
