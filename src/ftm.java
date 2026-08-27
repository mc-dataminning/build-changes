public class ftm extends fsi<ccc> {
   private static final aep a = new aep("textures/entity/llama/spit.png");
   private final ffe<ccc> f;

   public ftm(fsj.a $$0) {
      super($$0);
      this.f = new ffe<>($$0.a(fhi.at));
   }

   public void a(ccc $$0, float $$1, float $$2, elh $$3, fng $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(aro.i($$2, $$0.N, $$0.dA()) - 90.0F));
      $$3.a(a.f.rotationDegrees(aro.i($$2, $$0.O, $$0.dC())));
      this.f.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      ell $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, fxx.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aep a(ccc $$0) {
      return a;
   }
}
