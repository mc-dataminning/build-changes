public class eqt extends ghw {
   private static final uv a = uv.c("mco.selectServer.create");
   private static final uv b = uv.c("mco.configure.world.name");
   private static final uv c = uv.c("mco.configure.world.description");
   private static final int v = 10;
   private static final int w = 210;
   private final eom x;
   private final eyo y = new eyo(this);
   private evn z;
   private evn A;
   private final Runnable B;

   public eqt(eom $$0, epi $$1) {
      super(a);
      this.x = $$0;
      this.B = () -> this.a($$1);
   }

   public eqt(eom $$0, long $$1) {
      super(a);
      this.x = $$0;
      this.B = () -> this.a($$1);
   }

   @Override
   public void aQ_() {
      this.y.a(new ewl(this.e, this.i));
      eys $$0 = this.y.c(eys.d()).a(10);
      eve $$1 = eve.a(uu.j, $$0x -> this.B.run()).a();
      $$1.i = false;
      this.z = new evn(this.i, 210, 20, b);
      this.z.b($$1x -> $$1.i = !ac.b($$1x));
      this.A = new evn(this.i, 210, 20, c);
      $$0.a(eyk.a(this.i, this.z, b));
      $$0.a(eyk.a(this.i, this.A, c));
      eys $$2 = this.y.b(eys.e().a(10));
      $$2.a($$1);
      $$2.a(eve.a(uu.k, $$0x -> this.aG_()).a());
      this.y.a($$1x -> {
         evc var10000 = this.d($$1x);
      });
      this.c();
      this.c(this.z);
   }

   @Override
   protected void c() {
      this.y.a();
   }

   private void a(epi $$0) {
      esq $$1 = new esq($$0.a, this.z.a(), this.A.a());
      erg $$2 = erg.a(this, $$0, $$1, () -> this.f.execute(() -> {
            eom.f();
            this.f.a(this.x);
         }));
      this.f.a($$2);
   }

   private void a(long $$0) {
      faz $$1 = new erf($$1x -> {
         if ($$1x == null) {
            this.f.a(this);
         } else {
            this.f.a(new eqy(this, new esf(this.x, $$0, $$1x, this.z.a(), this.A.a())));
         }
      }, a);
      this.f.a($$1);
   }

   @Override
   public void aG_() {
      this.f.a(this.x);
   }
}
