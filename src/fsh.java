public class fsh extends fuj<buy, fee<buy>> {
   private static final aez a = new aez("textures/entity/bee/bee_angry.png");
   private static final aez i = new aez("textures/entity/bee/bee_angry_nectar.png");
   private static final aez j = new aez("textures/entity/bee/bee.png");
   private static final aez k = new aez("textures/entity/bee/bee_nectar.png");

   public fsh(ftd.a $$0) {
      super($$0, new fee<>($$0.a(fhw.j)), 0.4F);
   }

   public aez a(buy $$0) {
      if ($$0.X_()) {
         return $$0.go() ? i : a;
      } else {
         return $$0.go() ? k : j;
      }
   }
}
