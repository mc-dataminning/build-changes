public class fqb extends fox<bzf> {
   private static final acq a = new acq("textures/entity/llama/spit.png");
   private final fbz<bzf> f;

   public fqb(foy.a $$0) {
      super($$0);
      this.f = new fbz<>($$0.a(fed.at));
   }

   public void a(bzf $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(apa.i($$2, $$0.M, $$0.dy()) - 90.0F));
      $$3.a(a.f.rotationDegrees(apa.i($$2, $$0.N, $$0.dA())));
      this.f.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      ein $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, fum.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public acq a(bzf $$0) {
      return a;
   }
}
