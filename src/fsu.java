public class fsu extends fup<buy, feu<buy>> {
   private static final aey a = new aey("textures/entity/chicken.png");

   public fsu(ftj.a $$0) {
      super($$0, new feu<>($$0.a(fid.t)), 0.3F);
   }

   public aey a(buy $$0) {
      return a;
   }

   protected float a(buy $$0, float $$1) {
      float $$2 = ary.i($$1, $$0.bX, $$0.bT);
      float $$3 = ary.i($$1, $$0.bW, $$0.bU);
      return (ary.a($$2) + 1.0F) * $$3;
   }
}
