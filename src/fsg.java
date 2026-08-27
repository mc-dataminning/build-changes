public class fsg extends fui<bun, fee<bun>> {
   private static final aeu a = new aeu("textures/entity/bee/bee_angry.png");
   private static final aeu i = new aeu("textures/entity/bee/bee_angry_nectar.png");
   private static final aeu j = new aeu("textures/entity/bee/bee.png");
   private static final aeu k = new aeu("textures/entity/bee/bee_nectar.png");

   public fsg(ftc.a $$0) {
      super($$0, new fee<>($$0.a(fhw.j)), 0.4F);
   }

   public aeu a(bun $$0) {
      if ($$0.S_()) {
         return $$0.gk() ? i : a;
      } else {
         return $$0.gk() ? k : j;
      }
   }
}
