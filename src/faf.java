public class faf extends gsq {
   private static final ws a = ws.c("mco.selectServer.create");
   private static final ws b = ws.c("mco.configure.world.name");
   private static final ws c = ws.c("mco.configure.world.description");
   private static final int B = 10;
   private static final int C = 210;
   private final exy D;
   private final fih E = new fih(this);
   private ffd F;
   private ffd G;
   private final Runnable H;

   public faf(exy $$0, eyu $$1) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1);
   }

   public faf(exy $$0, long $$1) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1);
   }

   @Override
   public void aM_() {
      this.E.a(this.l, this.p);
      fil $$0 = this.E.c(fil.d()).a(10);
      feu $$1 = feu.a(wr.j, $$0x -> this.H.run()).a();
      $$1.j = false;
      this.F = new ffd(this.p, 210, 20, b);
      this.F.b($$1x -> $$1.j = !ayr.h($$1x));
      this.G = new ffd(this.p, 210, 20, c);
      $$0.a(fid.a(this.p, this.F, b));
      $$0.a(fid.a(this.p, this.G, c));
      fil $$2 = this.E.b(fil.e().a(10));
      $$2.a($$1);
      $$2.a(feu.a(wr.k, $$0x -> this.d()).a());
      this.E.a($$1x -> {
         fes var10000 = this.c($$1x);
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

   private void a(eyu $$0) {
      fbw $$1 = new fbw($$0.a, this.F.a(), this.G.a());
      fas $$2 = fas.a(this, $$0, $$1, () -> this.m.execute(() -> {
            exy.g();
            this.m.a(this.D);
         }));
      this.m.a($$2);
   }

   private void a(long $$0) {
      fkt $$1 = new far($$1x -> {
         if ($$1x == null) {
            this.m.a(this);
         } else {
            this.m.a(new fak(this, new fbr(this.D, $$0, $$1x, this.F.a(), this.G.a())));
         }
      }, a);
      this.m.a($$1);
   }

   @Override
   public void d() {
      this.m.a(this.D);
   }
}
