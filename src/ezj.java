public class ezj extends gru {
   private static final wi a = wi.c("mco.selectServer.create");
   private static final wi b = wi.c("mco.configure.world.name");
   private static final wi c = wi.c("mco.configure.world.description");
   private static final int y = 10;
   private static final int z = 210;
   private final exc A;
   private final fhl B = new fhl(this);
   private feh C;
   private feh D;
   private final Runnable E;

   public ezj(exc $$0, exy $$1) {
      super(a);
      this.A = $$0;
      this.E = () -> this.a($$1);
   }

   public ezj(exc $$0, long $$1) {
      super(a);
      this.A = $$0;
      this.E = () -> this.a($$1);
   }

   @Override
   public void aM_() {
      this.B.a(this.i, this.m);
      fhp $$0 = this.B.c(fhp.d()).a(10);
      fdy $$1 = fdy.a(wh.j, $$0x -> this.E.run()).a();
      $$1.j = false;
      this.C = new feh(this.m, 210, 20, b);
      this.C.b($$1x -> $$1.j = !ayh.h($$1x));
      this.D = new feh(this.m, 210, 20, c);
      $$0.a(fhh.a(this.m, this.C, b));
      $$0.a(fhh.a(this.m, this.D, c));
      fhp $$2 = this.B.b(fhp.e().a(10));
      $$2.a($$1);
      $$2.a(fdy.a(wh.k, $$0x -> this.d()).a());
      this.B.a($$1x -> {
         fdw var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aC_() {
      this.b(this.C);
   }

   @Override
   protected void c() {
      this.B.a();
   }

   private void a(exy $$0) {
      fba $$1 = new fba($$0.a, this.C.a(), this.D.a());
      ezw $$2 = ezw.a(this, $$0, $$1, () -> this.j.execute(() -> {
            exc.g();
            this.j.a(this.A);
         }));
      this.j.a($$2);
   }

   private void a(long $$0) {
      fjx $$1 = new ezv($$1x -> {
         if ($$1x == null) {
            this.j.a(this);
         } else {
            this.j.a(new ezo(this, new fav(this.A, $$0, $$1x, this.C.a(), this.D.a())));
         }
      }, a);
      this.j.a($$1);
   }

   @Override
   public void d() {
      this.j.a(this.A);
   }
}
