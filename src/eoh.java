public class eoh extends gfb {
   private static final tl a = tl.c("mco.configure.world.name");
   private static final tl b = tl.c("mco.configure.world.description");
   private static final int c = 10;
   private static final int y = 210;
   private final emw z;
   private final ema A;
   private final evz B = new evz(this);
   private esz C;
   private esz D;

   public eoh(emw $$0, ema $$1) {
      super(tl.c("mco.selectServer.create"));
      this.z = $$0;
      this.A = $$1;
   }

   @Override
   public void aH_() {
      this.B.a(new etw(this.e, this.i));
      ewd $$0 = this.B.c(ewd.d()).a(10);
      esq $$1 = esq.a(tl.c("mco.create.world"), $$0x -> this.D()).a();
      $$1.i = false;
      this.C = new esz(this.i, 210, 20, tl.c("mco.configure.world.name"));
      this.C.b($$1x -> $$1.i = !ac.b($$1x));
      this.D = new esz(this.i, 210, 20, tl.c("mco.configure.world.description"));
      $$0.a(evv.a(this.i, this.C, a));
      $$0.a(evv.a(this.i, this.D, b));
      ewd $$2 = this.B.b(ewd.e().a(10));
      $$2.a($$1);
      $$2.a(esq.a(tk.e, $$0x -> this.az_()).a());
      this.B.a($$1x -> {
         eso var10000 = this.d($$1x);
      });
      this.b();
      this.c(this.C);
   }

   @Override
   protected void b() {
      this.B.a();
   }

   private void D() {
      eou $$0 = eou.a(this.A, this.z, () -> this.f.execute(() -> {
            this.A.e();
            this.f.a(this.A);
         }));
      this.f.a(new eom(this.A, new eqd(this.z.a, this.C.a(), this.D.a(), $$0)));
   }

   @Override
   public void az_() {
      this.f.a(this.A);
   }
}
