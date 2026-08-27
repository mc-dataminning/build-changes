public class frn extends ftp<buj, fdq<buj>> {
   private static final aep a = new aep("textures/entity/bee/bee_angry.png");
   private static final aep i = new aep("textures/entity/bee/bee_angry_nectar.png");
   private static final aep j = new aep("textures/entity/bee/bee.png");
   private static final aep k = new aep("textures/entity/bee/bee_nectar.png");

   public frn(fsj.a $$0) {
      super($$0, new fdq<>($$0.a(fhi.j)), 0.4F);
   }

   public aep a(buj $$0) {
      if ($$0.S_()) {
         return $$0.gj() ? i : a;
      } else {
         return $$0.gj() ? k : j;
      }
   }
}
