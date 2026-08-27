public class eoj extends gfd {
   private static final tn a = tn.c("mco.configure.world.name");
   private static final tn b = tn.c("mco.configure.world.description");
   private static final int c = 10;
   private static final int y = 210;
   private final emy z;
   private final emc A;
   private final ewb B = new ewb(this);
   private etb C;
   private etb D;

   public eoj(emy $$0, emc $$1) {
      super(tn.c("mco.selectServer.create"));
      this.z = $$0;
      this.A = $$1;
   }

   @Override
   public void aH_() {
      this.B.a(new ety(this.e, this.i));
      ewf $$0 = this.B.c(ewf.d()).a(10);
      ess $$1 = ess.a(tn.c("mco.create.world"), $$0x -> this.D()).a();
      $$1.i = false;
      this.C = new etb(this.i, 210, 20, tn.c("mco.configure.world.name"));
      this.C.b($$1x -> $$1.i = !ac.b($$1x));
      this.D = new etb(this.i, 210, 20, tn.c("mco.configure.world.description"));
      $$0.a(evx.a(this.i, this.C, a));
      $$0.a(evx.a(this.i, this.D, b));
      ewf $$2 = this.B.b(ewf.e().a(10));
      $$2.a($$1);
      $$2.a(ess.a(tm.e, $$0x -> this.az_()).a());
      this.B.a($$1x -> {
         esq var10000 = this.d($$1x);
      });
      this.b();
      this.c(this.C);
   }

   @Override
   protected void b() {
      this.B.a();
   }

   private void D() {
      eow $$0 = eow.a(this.A, this.z, () -> this.f.execute(() -> {
            this.A.e();
            this.f.a(this.A);
         }));
      this.f.a(new eoo(this.A, new eqf(this.z.a, this.C.a(), this.D.a(), $$0)));
   }

   @Override
   public void az_() {
      this.f.a(this.A);
   }
}
