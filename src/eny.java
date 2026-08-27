public class eny extends ger {
   private static final tf a = tf.c("mco.configure.world.name");
   private static final tf b = tf.c("mco.configure.world.description");
   private static final int c = 10;
   private static final int y = 210;
   private final emm z;
   private final elq A;
   private final evp B = new evp(this);
   private esp C;
   private esp D;

   public eny(emm $$0, elq $$1) {
      super(tf.c("mco.selectServer.create"));
      this.z = $$0;
      this.A = $$1;
   }

   @Override
   public void aC_() {
      this.B.a(new etm(this.e, this.i));
      evt $$0 = this.B.c(evt.d()).a(10);
      esg $$1 = esg.a(tf.c("mco.create.world"), $$0x -> this.C()).a();
      $$1.i = false;
      this.C = new esp(this.i, 210, 20, tf.c("mco.configure.world.name"));
      this.C.b($$1x -> $$1.i = !ac.b($$1x));
      this.D = new esp(this.i, 210, 20, tf.c("mco.configure.world.description"));
      $$0.a(evl.a(this.i, this.C, a));
      $$0.a(evl.a(this.i, this.D, b));
      evt $$2 = this.B.b(evt.e().a(10));
      $$2.a($$1);
      $$2.a(esg.a(te.e, $$0x -> this.at_()).a());
      this.B.a($$1x -> {
         ese var10000 = this.d($$1x);
      });
      this.b();
      this.c(this.C);
   }

   @Override
   protected void b() {
      this.B.a();
   }

   private void C() {
      eok $$0 = new eok(
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
      this.f.a(new eod(this.A, new ept(this.z.a, this.C.a(), this.D.a(), $$0)));
   }

   @Override
   public void at_() {
      this.f.a(this.A);
   }
}
