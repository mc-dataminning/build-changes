public class fth extends fvj<bvv, ffd<bvv>> {
   private static final afw a = new afw("textures/entity/bee/bee_angry.png");
   private static final afw i = new afw("textures/entity/bee/bee_angry_nectar.png");
   private static final afw j = new afw("textures/entity/bee/bee.png");
   private static final afw k = new afw("textures/entity/bee/bee_nectar.png");

   public fth(fud.a $$0) {
      super($$0, new ffd<>($$0.a(fiv.j)), 0.4F);
   }

   public afw a(bvv $$0) {
      if ($$0.Y_()) {
         return $$0.go() ? i : a;
      } else {
         return $$0.go() ? k : j;
      }
   }
}
