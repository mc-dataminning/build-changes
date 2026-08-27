public class ess extends gko {
   private static final vf a = vf.c("mco.selectServer.create");
   private static final vf b = vf.c("mco.configure.world.name");
   private static final vf c = vf.c("mco.configure.world.description");
   private static final int v = 10;
   private static final int w = 210;
   private final eql x;
   private final fap y = new fap(this);
   private exo z;
   private exo A;
   private final Runnable B;

   public ess(eql $$0, erh $$1) {
      super(a);
      this.x = $$0;
      this.B = () -> this.a($$1);
   }

   public ess(eql $$0, long $$1) {
      super(a);
      this.x = $$0;
      this.B = () -> this.a($$1);
   }

   @Override
   public void aN_() {
      this.y.a(new eym(this.e, this.i));
      fat $$0 = this.y.c(fat.d()).a(10);
      exf $$1 = exf.a(ve.j, $$0x -> this.B.run()).a();
      $$1.j = false;
      this.z = new exo(this.i, 210, 20, b);
      this.z.b($$1x -> $$1.j = !ac.b($$1x));
      this.A = new exo(this.i, 210, 20, c);
      $$0.a(fal.a(this.i, this.z, b));
      $$0.a(fal.a(this.i, this.A, c));
      fat $$2 = this.y.b(fat.e().a(10));
      $$2.a($$1);
      $$2.a(exf.a(ve.k, $$0x -> this.aE_()).a());
      this.y.a($$1x -> {
         exd var10000 = this.d($$1x);
      });
      this.c();
      this.c(this.z);
   }

   @Override
   protected void c() {
      this.y.a();
   }

   private void a(erh $$0) {
      eup $$1 = new eup($$0.a, this.z.a(), this.A.a());
      etf $$2 = etf.a(this, $$0, $$1, () -> this.f.execute(() -> {
            eql.f();
            this.f.a(this.x);
         }));
      this.f.a($$2);
   }

   private void a(long $$0) {
      fda $$1 = new ete($$1x -> {
         if ($$1x == null) {
            this.f.a(this);
         } else {
            this.f.a(new esx(this, new eue(this.x, $$0, $$1x, this.z.a(), this.A.a())));
         }
      }, a);
      this.f.a($$1);
   }

   @Override
   public void aE_() {
      this.f.a(this.x);
   }
}
