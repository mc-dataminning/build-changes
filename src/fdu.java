public class fdu extends gxb {
   private static final xe a = xe.c("mco.selectServer.create");
   private static final xe b = xe.c("mco.configure.world.name");
   private static final xe c = xe.c("mco.configure.world.description");
   private static final int B = 10;
   private static final int C = 210;
   private final fbn D;
   private final fma E = new fma(this);
   private fiw F;
   private fiw G;
   private final Runnable H;

   public fdu(fbn $$0, fcj $$1) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1);
   }

   public fdu(fbn $$0, long $$1) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1);
   }

   @Override
   public void aN_() {
      this.E.a(this.l, this.p);
      fme $$0 = this.E.c(fme.d()).a(10);
      fin $$1 = fin.a(xd.j, $$0x -> this.H.run()).a();
      $$1.j = false;
      this.F = new fiw(this.p, 210, 20, b);
      this.F.b($$1x -> $$1.j = !azh.h($$1x));
      this.G = new fiw(this.p, 210, 20, c);
      $$0.a(flw.a(this.p, this.F, b));
      $$0.a(flw.a(this.p, this.G, c));
      fme $$2 = this.E.b(fme.e().a(10));
      $$2.a($$1);
      $$2.a(fin.a(xd.k, $$0x -> this.d()).a());
      this.E.a($$1x -> {
         fil var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aC_() {
      this.b(this.F);
   }

   @Override
   protected void c() {
      this.E.a();
   }

   private void a(fcj $$0) {
      ffl $$1 = new ffl($$0.a, this.F.a(), this.G.a());
      feh $$2 = feh.a(this, $$0, $$1, () -> this.m.execute(() -> {
            fbn.g();
            this.m.a(this.D);
         }));
      this.m.a($$2);
   }

   private void a(long $$0) {
      fon $$1 = new feg($$1x -> {
         if ($$1x == null) {
            this.m.a(this);
         } else {
            this.m.a(new fdz(this, new ffg(this.D, $$0, $$1x, this.F.a(), this.G.a())));
         }
      }, a);
      this.m.a($$1);
   }

   @Override
   public void d() {
      this.m.a(this.D);
   }
}
