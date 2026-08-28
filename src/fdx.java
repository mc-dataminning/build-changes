public class fdx extends gwo {
   private static final wz a = wz.c("mco.selectServer.create");
   private static final wz b = wz.c("mco.configure.world.name");
   private static final wz c = wz.c("mco.configure.world.description");
   private static final int B = 10;
   private static final int C = 210;
   private final fbr D;
   private final flx E = new flx(this);
   private fit F;
   private fit G;
   private final Runnable H;

   public fdx(fbr $$0, fcn $$1) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1);
   }

   public fdx(fbr $$0, long $$1) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1);
   }

   @Override
   public void aT_() {
      this.E.a(this.k, this.o);
      fmb $$0 = this.E.c(fmb.d()).a(10);
      fik $$1 = fik.a(wy.j, $$0x -> this.H.run()).a();
      $$1.j = false;
      this.F = new fit(this.o, 210, 20, b);
      this.F.b($$1x -> $$1.j = !azl.h($$1x));
      this.G = new fit(this.o, 210, 20, c);
      $$0.a(flt.a(this.o, this.F, b));
      $$0.a(flt.a(this.o, this.G, c));
      fmb $$2 = this.E.b(fmb.e().a(10));
      $$2.a($$1);
      $$2.a(fik.a(wy.k, $$0x -> this.d()).a());
      this.E.a($$1x -> {
         fii var10000 = this.c($$1x);
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

   private void a(fcn $$0) {
      ffn $$1 = new ffn($$0.a, this.F.a(), this.G.a());
      fej $$2 = fej.a(this, $$0, $$1, () -> this.l.execute(() -> {
            fbr.g();
            this.l.a(this.D);
         }));
      this.l.a($$2);
   }

   private void a(long $$0) {
      fob $$1 = new fei($$1x -> {
         if ($$1x == null) {
            this.l.a(this);
         } else {
            this.l.a(new feb(this, new ffi(this.D, $$0, $$1x, this.F.a(), this.G.a())));
         }
      }, a);
      this.l.a($$1);
   }

   @Override
   public void d() {
      this.l.a(this.D);
   }
}
