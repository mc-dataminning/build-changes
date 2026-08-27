public class eza extends grl {
   private static final wg a = wg.c("mco.selectServer.create");
   private static final wg b = wg.c("mco.configure.world.name");
   private static final wg c = wg.c("mco.configure.world.description");
   private static final int y = 10;
   private static final int z = 210;
   private final ewt A;
   private final fhc B = new fhc(this);
   private fdy C;
   private fdy D;
   private final Runnable E;

   public eza(ewt $$0, exp $$1) {
      super(a);
      this.A = $$0;
      this.E = () -> this.a($$1);
   }

   public eza(ewt $$0, long $$1) {
      super(a);
      this.A = $$0;
      this.E = () -> this.a($$1);
   }

   @Override
   public void aN_() {
      this.B.a(this.i, this.m);
      fhg $$0 = this.B.c(fhg.d()).a(10);
      fdp $$1 = fdp.a(wf.j, $$0x -> this.E.run()).a();
      $$1.j = false;
      this.C = new fdy(this.m, 210, 20, b);
      this.C.b($$1x -> $$1.j = !ayf.h($$1x));
      this.D = new fdy(this.m, 210, 20, c);
      $$0.a(fgy.a(this.m, this.C, b));
      $$0.a(fgy.a(this.m, this.D, c));
      fhg $$2 = this.B.b(fhg.e().a(10));
      $$2.a($$1);
      $$2.a(fdp.a(wf.k, $$0x -> this.d()).a());
      this.B.a($$1x -> {
         fdn var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aD_() {
      this.b(this.C);
   }

   @Override
   protected void c() {
      this.B.a();
   }

   private void a(exp $$0) {
      far $$1 = new far($$0.a, this.C.a(), this.D.a());
      ezn $$2 = ezn.a(this, $$0, $$1, () -> this.j.execute(() -> {
            ewt.g();
            this.j.a(this.A);
         }));
      this.j.a($$2);
   }

   private void a(long $$0) {
      fjo $$1 = new ezm($$1x -> {
         if ($$1x == null) {
            this.j.a(this);
         } else {
            this.j.a(new ezf(this, new fam(this.A, $$0, $$1x, this.C.a(), this.D.a())));
         }
      }, a);
      this.j.a($$1);
   }

   @Override
   public void d() {
      this.j.a(this.A);
   }
}
