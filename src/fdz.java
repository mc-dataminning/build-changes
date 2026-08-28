public class fdz extends gwq {
   private static final wz a = wz.c("mco.selectServer.create");
   private static final wz b = wz.c("mco.configure.world.name");
   private static final wz c = wz.c("mco.configure.world.description");
   private static final int B = 10;
   private static final int C = 210;
   private final fbt D;
   private final flz E = new flz(this);
   private fiv F;
   private fiv G;
   private final Runnable H;

   public fdz(fbt $$0, fcp $$1) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1);
   }

   public fdz(fbt $$0, long $$1) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1);
   }

   @Override
   public void aT_() {
      this.E.a(this.k, this.o);
      fmd $$0 = this.E.c(fmd.d()).a(10);
      fim $$1 = fim.a(wy.j, $$0x -> this.H.run()).a();
      $$1.j = false;
      this.F = new fiv(this.o, 210, 20, b);
      this.F.b($$1x -> $$1.j = !azl.h($$1x));
      this.G = new fiv(this.o, 210, 20, c);
      $$0.a(flv.a(this.o, this.F, b));
      $$0.a(flv.a(this.o, this.G, c));
      fmd $$2 = this.E.b(fmd.e().a(10));
      $$2.a($$1);
      $$2.a(fim.a(wy.k, $$0x -> this.d()).a());
      this.E.a($$1x -> {
         fik var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aI_() {
      this.b(this.F);
   }

   @Override
   protected void c() {
      this.E.a();
   }

   private void a(fcp $$0) {
      ffp $$1 = new ffp($$0.a, this.F.a(), this.G.a());
      fel $$2 = fel.a(this, $$0, $$1, () -> this.l.execute(() -> {
            fbt.g();
            this.l.a(this.D);
         }));
      this.l.a($$2);
   }

   private void a(long $$0) {
      fod $$1 = new fek($$1x -> {
         if ($$1x == null) {
            this.l.a(this);
         } else {
            this.l.a(new fed(this, new ffk(this.D, $$0, $$1x, this.F.a(), this.G.a())));
         }
      }, a);
      this.l.a($$1);
   }

   @Override
   public void d() {
      this.l.a(this.D);
   }
}
