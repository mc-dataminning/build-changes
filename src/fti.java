public class fti extends fsi<bxy> {
   private static final aep a = new aep("textures/entity/lead_knot.png");
   private final ffb<bxy> f;

   public fti(fsj.a $$0) {
      super($$0);
      this.f = new ffb<>($$0.a(fhi.aq));
   }

   public void a(bxy $$0, float $$1, float $$2, elh $$3, fng $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      ell $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, fxx.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aep a(bxy $$0) {
      return a;
   }
}
