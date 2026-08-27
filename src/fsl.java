public class fsl extends fun<bus, fej<bus>> {
   private static final aew a = new aew("textures/entity/bee/bee_angry.png");
   private static final aew i = new aew("textures/entity/bee/bee_angry_nectar.png");
   private static final aew j = new aew("textures/entity/bee/bee.png");
   private static final aew k = new aew("textures/entity/bee/bee_nectar.png");

   public fsl(fth.a $$0) {
      super($$0, new fej<>($$0.a(fib.j)), 0.4F);
   }

   public aew a(bus $$0) {
      if ($$0.X_()) {
         return $$0.gn() ? i : a;
      } else {
         return $$0.gn() ? k : j;
      }
   }
}
