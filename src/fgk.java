public class fgk extends hee {
   private static final xh a = xh.c("mco.selectServer.create");
   private static final xh b = xh.c("mco.configure.world.name");
   private static final xh c = xh.c("mco.configure.world.description");
   private static final int B = 10;
   private static final int C = 210;
   private final fee D;
   private final fon E = new fon(this);
   private fli F;
   private fli G;
   private final Runnable H;

   public fgk(fee $$0, ffa $$1) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1);
   }

   public fgk(fee $$0, long $$1) {
      super(a);
      this.D = $$0;
      this.H = () -> this.a($$1);
   }

   @Override
   public void aS_() {
      this.E.a(this.l, this.p);
      fos $$0 = this.E.c(fos.d()).a(10);
      fkz $$1 = fkz.a(xg.j, $$0x -> this.H.run()).a();
      $$1.j = false;
      this.F = new fli(this.p, 210, 20, b);
      this.F.b($$1x -> $$1.j = !bag.h($$1x));
      this.G = new fli(this.p, 210, 20, c);
      $$0.a(foj.a(this.p, this.F, b));
      $$0.a(foj.a(this.p, this.G, c));
      fos $$2 = this.E.b(fos.e().a(10));
      $$2.a($$1);
      $$2.a(fkz.a(xg.k, $$0x -> this.d()).a());
      this.E.a($$1x -> {
         fkx var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aH_() {
      this.b(this.F);
   }

   @Override
   protected void c() {
      this.E.a();
   }

   private void a(ffa $$0) {
      fia $$1 = new fia($$0.a, this.F.a(), this.G.a());
      fgw $$2 = fgw.a(this, $$0, $$1, () -> this.m.execute(() -> {
            fee.g();
            this.m.a(this.D);
         }));
      this.m.a($$2);
   }

   private void a(long $$0) {
      fqs $$1 = new fgv($$1x -> {
         if ($$1x == null) {
            this.m.a(this);
         } else {
            this.m.a(new fgo(this, new fhv(this.D, $$0, $$1x, this.F.a(), this.G.a())));
         }
      }, a);
      this.m.a($$1);
   }

   @Override
   public void d() {
      this.m.a(this.D);
   }
}
