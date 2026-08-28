public class fcr extends gvh {
   private static final xp a = xp.c("mco.selectServer.create");
   private static final xp b = xp.c("mco.configure.world.name");
   private static final xp c = xp.c("mco.configure.world.description");
   private static final int B = 10;
   private static final int C = 210;
   private final fak D;
   private final fks E = new fks(this);
   private fho F;
   private fho G;
   private final Runnable H;

   public fcr(fak $$0, fbg $$1) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1);
   }

   public fcr(fak $$0, long $$1) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1);
   }

   @Override
   public void aM_() {
      this.E.a(this.l, this.p);
      fkw $$0 = this.E.c(fkw.d()).a(10);
      fhf $$1 = fhf.a(xo.j, $$0x -> this.H.run()).a();
      $$1.j = false;
      this.F = new fho(this.p, 210, 20, b);
      this.F.b($$1x -> $$1.j = !azv.h($$1x));
      this.G = new fho(this.p, 210, 20, c);
      $$0.a(fko.a(this.p, this.F, b));
      $$0.a(fko.a(this.p, this.G, c));
      fkw $$2 = this.E.b(fkw.e().a(10));
      $$2.a($$1);
      $$2.a(fhf.a(xo.k, $$0x -> this.d()).a());
      this.E.a($$1x -> {
         fhd var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aB_() {
      this.b(this.F);
   }

   @Override
   protected void c() {
      this.E.a();
   }

   private void a(fbg $$0) {
      fei $$1 = new fei($$0.a, this.F.a(), this.G.a());
      fde $$2 = fde.a(this, $$0, $$1, () -> this.m.execute(() -> {
            fak.g();
            this.m.a(this.D);
         }));
      this.m.a($$2);
   }

   private void a(long $$0) {
      fne $$1 = new fdd($$1x -> {
         if ($$1x == null) {
            this.m.a(this);
         } else {
            this.m.a(new fcw(this, new fed(this.D, $$0, $$1x, this.F.a(), this.G.a())));
         }
      }, a);
      this.m.a($$1);
   }

   @Override
   public void d() {
      this.m.a(this.D);
   }
}
