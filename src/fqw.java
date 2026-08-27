public class fqw extends fox<bzi> {
   private static final acq a = new acq("textures/entity/shulker/spark.png");
   private static final fkf f = fkf.h(a);
   private final fcx<bzi> g;

   public fqw(foy.a $$0) {
      super($$0);
      this.g = new fcx<>($$0.a(fed.bf));
   }

   protected int a(bzi $$0, gu $$1) {
      return 15;
   }

   public void a(bzi $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
      $$3.a();
      float $$6 = apa.j($$2, $$0.M, $$0.dy());
      float $$7 = apa.i($$2, $$0.N, $$0.dA());
      float $$8 = (float)$$0.ag + $$2;
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(apa.a($$8 * 0.1F) * 180.0F));
      $$3.a(a.b.rotationDegrees(apa.b($$8 * 0.1F) * 180.0F));
      $$3.a(a.f.rotationDegrees(apa.a($$8 * 0.15F) * 360.0F));
      $$3.b(-0.5F, -0.5F, 0.5F);
      this.g.a($$0, 0.0F, 0.0F, 0.0F, $$6, $$7);
      ein $$9 = $$4.getBuffer(this.g.a(a));
      this.g.a($$3, $$9, $$5, fum.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b(1.5F, 1.5F, 1.5F);
      ein $$10 = $$4.getBuffer(f);
      this.g.a($$3, $$10, $$5, fum.d, 1.0F, 1.0F, 1.0F, 0.15F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public acq a(bzi $$0) {
      return a;
   }
}
