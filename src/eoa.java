public class eoa extends ged {
   private static final te a = te.c("mco.configure.world.name");
   private static final te b = te.c("mco.configure.world.description");
   private static final int c = 10;
   private static final int y = 210;
   private final emo z;
   private final els A;
   private final evk B = new evk(this);
   private esr C;
   private esr D;

   public eoa(emo $$0, els $$1) {
      super(te.c("mco.selectServer.create"));
      this.z = $$0;
      this.A = $$1;
   }

   @Override
   public void aE_() {
      this.B.a(new etn(this.e, this.i));
      evo $$0 = this.B.c(evo.d()).a(10);
      $$0.c().b();
      esi $$1 = esi.a(te.c("mco.create.world"), $$0x -> this.B()).a();
      $$1.i = false;
      this.C = new esr(this.i, 208, 20, te.c("mco.configure.world.name"));
      this.C.b($$1x -> $$1.i = !ac.b($$1x));
      this.D = new esr(this.i, 208, 20, te.c("mco.configure.world.description"));
      evo $$2 = $$0.a(evo.d().a(4));
      $$2.a(new etn(a, this.i), evn::a);
      $$2.a(this.C, $$0x -> $$0x.a(1));
      evo $$3 = $$0.a(evo.d().a(4));
      $$3.a(new etn(b, this.i), evn::a);
      $$3.a(this.D, $$0x -> $$0x.a(1));
      evo $$4 = this.B.b(evo.e().a(10));
      $$4.a($$1);
      $$4.a(esi.a(td.e, $$0x -> this.au_()).a());
      this.B.a($$1x -> {
         esg var10000 = this.d($$1x);
      });
      this.b();
      this.c(this.C);
   }

   @Override
   protected void b() {
      this.B.a();
   }

   private void B() {
      eom $$0 = new eom(
         this.A,
         this.z,
         te.c("mco.selectServer.create"),
         te.c("mco.create.world.subtitle"),
         -6250336,
         te.c("mco.create.world.skip"),
         () -> this.f.execute(() -> this.f.a(this.A.f())),
         () -> this.f.a(this.A.f())
      );
      $$0.a(te.c("mco.create.world.reset.title"));
      this.f.a(new eof(this.A, new epv(this.z.a, this.C.a(), this.D.a(), $$0)));
   }

   @Override
   public void au_() {
      this.f.a(this.A);
   }
}
