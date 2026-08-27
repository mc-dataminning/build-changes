public class eob extends gex {
   private static final tl a = tl.c("mco.configure.world.name");
   private static final tl b = tl.c("mco.configure.world.description");
   private static final int c = 10;
   private static final int y = 210;
   private final emq z;
   private final elu A;
   private final evu B = new evu(this);
   private est C;
   private est D;

   public eob(emq $$0, elu $$1) {
      super(tl.c("mco.selectServer.create"));
      this.z = $$0;
      this.A = $$1;
   }

   @Override
   public void aH_() {
      this.B.a(new etr(this.e, this.i));
      evy $$0 = this.B.c(evy.d()).a(10);
      esk $$1 = esk.a(tl.c("mco.create.world"), $$0x -> this.D()).a();
      $$1.i = false;
      this.C = new est(this.i, 210, 20, tl.c("mco.configure.world.name"));
      this.C.b($$1x -> $$1.i = !ac.b($$1x));
      this.D = new est(this.i, 210, 20, tl.c("mco.configure.world.description"));
      $$0.a(evq.a(this.i, this.C, a));
      $$0.a(evq.a(this.i, this.D, b));
      evy $$2 = this.B.b(evy.e().a(10));
      $$2.a($$1);
      $$2.a(esk.a(tk.e, $$0x -> this.az_()).a());
      this.B.a($$1x -> {
         esi var10000 = this.d($$1x);
      });
      this.b();
      this.c(this.C);
   }

   @Override
   protected void b() {
      this.B.a();
   }

   private void D() {
      eoo $$0 = eoo.a(this.A, this.z, () -> this.f.execute(() -> {
            this.A.e();
            this.f.a(this.A);
         }));
      this.f.a(new eog(this.A, new epx(this.z.a, this.C.a(), this.D.a(), $$0)));
   }

   @Override
   public void az_() {
      this.f.a(this.A);
   }
}
