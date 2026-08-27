public class eqo extends ghr {
   private static final ur a = ur.c("mco.selectServer.create");
   private static final ur b = ur.c("mco.configure.world.name");
   private static final ur c = ur.c("mco.configure.world.description");
   private static final int v = 10;
   private static final int w = 210;
   private final eoh x;
   private final eyj y = new eyj(this);
   private evi z;
   private evi A;
   private final Runnable B;

   public eqo(eoh $$0, epd $$1) {
      super(a);
      this.x = $$0;
      this.B = () -> this.a($$1);
   }

   public eqo(eoh $$0, long $$1) {
      super(a);
      this.x = $$0;
      this.B = () -> this.a($$1);
   }

   @Override
   public void aP_() {
      this.y.a(new ewg(this.e, this.i));
      eyn $$0 = this.y.c(eyn.d()).a(10);
      euz $$1 = euz.a(uq.j, $$0x -> this.B.run()).a();
      $$1.i = false;
      this.z = new evi(this.i, 210, 20, b);
      this.z.b($$1x -> $$1.i = !ac.b($$1x));
      this.A = new evi(this.i, 210, 20, c);
      $$0.a(eyf.a(this.i, this.z, b));
      $$0.a(eyf.a(this.i, this.A, c));
      eyn $$2 = this.y.b(eyn.e().a(10));
      $$2.a($$1);
      $$2.a(euz.a(uq.k, $$0x -> this.aF_()).a());
      this.y.a($$1x -> {
         eux var10000 = this.d($$1x);
      });
      this.c();
      this.c(this.z);
   }

   @Override
   protected void c() {
      this.y.a();
   }

   private void a(epd $$0) {
      esl $$1 = new esl($$0.a, this.z.a(), this.A.a());
      erb $$2 = erb.a(this, $$0, $$1, () -> this.f.execute(() -> {
            eoh.f();
            this.f.a(this.x);
         }));
      this.f.a($$2);
   }

   private void a(long $$0) {
      fau $$1 = new era($$1x -> {
         if ($$1x == null) {
            this.f.a(this);
         } else {
            this.f.a(new eqt(this, new esa(this.x, $$0, $$1x, this.z.a(), this.A.a())));
         }
      }, a);
      this.f.a($$1);
   }

   @Override
   public void aF_() {
      this.f.a(this.x);
   }
}
