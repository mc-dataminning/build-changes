public class eus extends gmv {
   private static final vq a = vq.c("mco.selectServer.create");
   private static final vq b = vq.c("mco.configure.world.name");
   private static final vq c = vq.c("mco.configure.world.description");
   private static final int v = 10;
   private static final int w = 210;
   private final esl x;
   private final fct y = new fct(this);
   private ezq z;
   private ezq A;
   private final Runnable B;

   public eus(esl $$0, eth $$1) {
      super(a);
      this.x = $$0;
      this.B = () -> this.a($$1);
   }

   public eus(esl $$0, long $$1) {
      super(a);
      this.x = $$0;
      this.B = () -> this.a($$1);
   }

   @Override
   public void aQ_() {
      this.y.a(new fao(this.e, this.i));
      fcx $$0 = this.y.c(fcx.d()).a(10);
      ezh $$1 = ezh.a(vp.j, $$0x -> this.B.run()).a();
      $$1.j = false;
      this.z = new ezq(this.i, 210, 20, b);
      this.z.b($$1x -> $$1.j = !ac.b($$1x));
      this.A = new ezq(this.i, 210, 20, c);
      $$0.a(fcp.a(this.i, this.z, b));
      $$0.a(fcp.a(this.i, this.A, c));
      fcx $$2 = this.y.b(fcx.e().a(10));
      $$2.a($$1);
      $$2.a(ezh.a(vp.k, $$0x -> this.d()).a());
      this.y.a($$1x -> {
         ezf var10000 = this.d($$1x);
      });
      this.c();
   }

   @Override
   protected void aH_() {
      this.c(this.z);
   }

   @Override
   protected void c() {
      this.y.a();
   }

   private void a(eth $$0) {
      ewj $$1 = new ewj($$0.a, this.z.a(), this.A.a());
      evf $$2 = evf.a(this, $$0, $$1, () -> this.f.execute(() -> {
            esl.g();
            this.f.a(this.x);
         }));
      this.f.a($$2);
   }

   private void a(long $$0) {
      ffe $$1 = new eve($$1x -> {
         if ($$1x == null) {
            this.f.a(this);
         } else {
            this.f.a(new eux(this, new ewe(this.x, $$0, $$1x, this.z.a(), this.A.a())));
         }
      }, a);
      this.f.a($$1);
   }

   @Override
   public void d() {
      this.f.a(this.x);
   }
}
