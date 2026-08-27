public class euz extends gnd {
   private static final vq a = vq.c("mco.selectServer.create");
   private static final vq b = vq.c("mco.configure.world.name");
   private static final vq c = vq.c("mco.configure.world.description");
   private static final int v = 10;
   private static final int w = 210;
   private final ess x;
   private final fda y = new fda(this);
   private ezx z;
   private ezx A;
   private final Runnable B;

   public euz(ess $$0, eto $$1) {
      super(a);
      this.x = $$0;
      this.B = () -> this.a($$1);
   }

   public euz(ess $$0, long $$1) {
      super(a);
      this.x = $$0;
      this.B = () -> this.a($$1);
   }

   @Override
   public void aQ_() {
      this.y.a(new fav(this.e, this.i));
      fde $$0 = this.y.c(fde.d()).a(10);
      ezo $$1 = ezo.a(vp.j, $$0x -> this.B.run()).a();
      $$1.j = false;
      this.z = new ezx(this.i, 210, 20, b);
      this.z.b($$1x -> $$1.j = !ac.b($$1x));
      this.A = new ezx(this.i, 210, 20, c);
      $$0.a(fcw.a(this.i, this.z, b));
      $$0.a(fcw.a(this.i, this.A, c));
      fde $$2 = this.y.b(fde.e().a(10));
      $$2.a($$1);
      $$2.a(ezo.a(vp.k, $$0x -> this.d()).a());
      this.y.a($$1x -> {
         ezm var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aH_() {
      this.b(this.z);
   }

   @Override
   protected void c() {
      this.y.a();
   }

   private void a(eto $$0) {
      ewq $$1 = new ewq($$0.a, this.z.a(), this.A.a());
      evm $$2 = evm.a(this, $$0, $$1, () -> this.f.execute(() -> {
            ess.g();
            this.f.a(this.x);
         }));
      this.f.a($$2);
   }

   private void a(long $$0) {
      ffl $$1 = new evl($$1x -> {
         if ($$1x == null) {
            this.f.a(this);
         } else {
            this.f.a(new eve(this, new ewl(this.x, $$0, $$1x, this.z.a(), this.A.a())));
         }
      }, a);
      this.f.a($$1);
   }

   @Override
   public void d() {
      this.f.a(this.x);
   }
}
