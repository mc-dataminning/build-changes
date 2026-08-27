public class enz extends gei {
   private static final tf a = tf.c("mco.configure.world.name");
   private static final tf b = tf.c("mco.configure.world.description");
   private static final int c = 10;
   private static final int y = 210;
   private final emn z;
   private final elr A;
   private final evo B = new evo(this);
   private esq C;
   private esq D;

   public enz(emn $$0, elr $$1) {
      super(tf.c("mco.selectServer.create"));
      this.z = $$0;
      this.A = $$1;
   }

   @Override
   public void aE_() {
      this.B.a(new etm(this.e, this.i));
      evs $$0 = this.B.c(evs.d()).a(10);
      $$0.c().b();
      esh $$1 = esh.a(tf.c("mco.create.world"), $$0x -> this.B()).a();
      $$1.i = false;
      this.C = new esq(this.i, 210, 20, tf.c("mco.configure.world.name"));
      this.C.b($$1x -> $$1.i = !ac.b($$1x));
      this.D = new esq(this.i, 210, 20, tf.c("mco.configure.world.description"));
      evs $$2 = $$0.a(evs.d().a(4));
      $$2.a(new etm(a, this.i), evr::a);
      $$2.a(this.C);
      evs $$3 = $$0.a(evs.d().a(4));
      $$3.a(new etm(b, this.i), evr::a);
      $$3.a(this.D);
      evs $$4 = this.B.b(evs.e().a(10));
      $$4.a($$1);
      $$4.a(esh.a(te.e, $$0x -> this.au_()).a());
      this.B.a($$1x -> {
         esf var10000 = this.d($$1x);
      });
      this.b();
      this.c(this.C);
   }

   @Override
   protected void b() {
      this.B.a();
   }

   private void B() {
      eol $$0 = new eol(
         this.A,
         this.z,
         tf.c("mco.selectServer.create"),
         tf.c("mco.create.world.subtitle"),
         -6250336,
         tf.c("mco.create.world.skip"),
         () -> this.f.execute(() -> this.f.a(this.A.f())),
         () -> this.f.a(this.A.f())
      );
      $$0.a(tf.c("mco.create.world.reset.title"));
      this.f.a(new eoe(this.A, new epu(this.z.a, this.C.a(), this.D.a(), $$0)));
   }

   @Override
   public void au_() {
      this.f.a(this.A);
   }
}
