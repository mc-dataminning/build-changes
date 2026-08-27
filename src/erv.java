public class erv extends gjl {
   private static final vb a = vb.c("mco.selectServer.create");
   private static final vb b = vb.c("mco.configure.world.name");
   private static final vb c = vb.c("mco.configure.world.description");
   private static final int v = 10;
   private static final int w = 210;
   private final epo x;
   private final ezr y = new ezr(this);
   private ewq z;
   private ewq A;
   private final Runnable B;

   public erv(epo $$0, eqk $$1) {
      super(a);
      this.x = $$0;
      this.B = () -> this.a($$1);
   }

   public erv(epo $$0, long $$1) {
      super(a);
      this.x = $$0;
      this.B = () -> this.a($$1);
   }

   @Override
   public void aP_() {
      this.y.a(new exo(this.e, this.i));
      ezv $$0 = this.y.c(ezv.d()).a(10);
      ewh $$1 = ewh.a(va.j, $$0x -> this.B.run()).a();
      $$1.i = false;
      this.z = new ewq(this.i, 210, 20, b);
      this.z.b($$1x -> $$1.i = !ac.b($$1x));
      this.A = new ewq(this.i, 210, 20, c);
      $$0.a(ezn.a(this.i, this.z, b));
      $$0.a(ezn.a(this.i, this.A, c));
      ezv $$2 = this.y.b(ezv.e().a(10));
      $$2.a($$1);
      $$2.a(ewh.a(va.k, $$0x -> this.aF_()).a());
      this.y.a($$1x -> {
         ewf var10000 = this.d($$1x);
      });
      this.c();
      this.c(this.z);
   }

   @Override
   protected void c() {
      this.y.a();
   }

   private void a(eqk $$0) {
      ets $$1 = new ets($$0.a, this.z.a(), this.A.a());
      esi $$2 = esi.a(this, $$0, $$1, () -> this.f.execute(() -> {
            epo.f();
            this.f.a(this.x);
         }));
      this.f.a($$2);
   }

   private void a(long $$0) {
      fcc $$1 = new esh($$1x -> {
         if ($$1x == null) {
            this.f.a(this);
         } else {
            this.f.a(new esa(this, new eth(this.x, $$0, $$1x, this.z.a(), this.A.a())));
         }
      }, a);
      this.f.a($$1);
   }

   @Override
   public void aF_() {
      this.f.a(this.x);
   }
}
