public class eoc extends gew {
   private static final ti a = ti.c("mco.configure.world.name");
   private static final ti b = ti.c("mco.configure.world.description");
   private static final int c = 10;
   private static final int y = 210;
   private final emr z;
   private final elv A;
   private final evu B = new evu(this);
   private esu C;
   private esu D;

   public eoc(emr $$0, elv $$1) {
      super(ti.c("mco.selectServer.create"));
      this.z = $$0;
      this.A = $$1;
   }

   @Override
   public void aD_() {
      this.B.a(new etr(this.e, this.i));
      evy $$0 = this.B.c(evy.d()).a(10);
      esl $$1 = esl.a(ti.c("mco.create.world"), $$0x -> this.C()).a();
      $$1.i = false;
      this.C = new esu(this.i, 210, 20, ti.c("mco.configure.world.name"));
      this.C.b($$1x -> $$1.i = !ac.b($$1x));
      this.D = new esu(this.i, 210, 20, ti.c("mco.configure.world.description"));
      $$0.a(evq.a(this.i, this.C, a));
      $$0.a(evq.a(this.i, this.D, b));
      evy $$2 = this.B.b(evy.e().a(10));
      $$2.a($$1);
      $$2.a(esl.a(th.e, $$0x -> this.au_()).a());
      this.B.a($$1x -> {
         esj var10000 = this.d($$1x);
      });
      this.b();
      this.c(this.C);
   }

   @Override
   protected void b() {
      this.B.a();
   }

   private void C() {
      eop $$0 = eop.a(this.A, this.z, () -> this.f.execute(() -> {
            this.A.e();
            this.f.a(this.A.h());
         }));
      this.f.a(new eoh(this.A, new epy(this.z.a, this.C.a(), this.D.a(), $$0)));
   }

   @Override
   public void au_() {
      this.f.a(this.A);
   }
}
