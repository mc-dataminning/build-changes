public class fuh extends fsi<ccf> {
   private static final aep a = new aep("textures/entity/shulker/spark.png");
   private static final fno f = fno.h(a);
   private final fgc<ccf> g;

   public fuh(fsj.a $$0) {
      super($$0);
      this.g = new fgc<>($$0.a(fhi.bf));
   }

   protected int a(ccf $$0, gv $$1) {
      return 15;
   }

   public void a(ccf $$0, float $$1, float $$2, elh $$3, fng $$4, int $$5) {
      $$3.a();
      float $$6 = aro.j($$2, $$0.N, $$0.dA());
      float $$7 = aro.i($$2, $$0.O, $$0.dC());
      float $$8 = (float)$$0.ah + $$2;
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(aro.a($$8 * 0.1F) * 180.0F));
      $$3.a(a.b.rotationDegrees(aro.b($$8 * 0.1F) * 180.0F));
      $$3.a(a.f.rotationDegrees(aro.a($$8 * 0.15F) * 360.0F));
      $$3.b(-0.5F, -0.5F, 0.5F);
      this.g.a($$0, 0.0F, 0.0F, 0.0F, $$6, $$7);
      ell $$9 = $$4.getBuffer(this.g.a(a));
      this.g.a($$3, $$9, $$5, fxx.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b(1.5F, 1.5F, 1.5F);
      ell $$10 = $$4.getBuffer(f);
      this.g.a($$3, $$10, $$5, fxx.d, 1.0F, 1.0F, 1.0F, 0.15F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aep a(ccf $$0) {
      return a;
   }
}
