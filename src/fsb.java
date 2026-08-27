public class fsb extends fud<buk, fdz<buk>> {
   private static final aer a = new aer("textures/entity/bee/bee_angry.png");
   private static final aer i = new aer("textures/entity/bee/bee_angry_nectar.png");
   private static final aer j = new aer("textures/entity/bee/bee.png");
   private static final aer k = new aer("textures/entity/bee/bee_nectar.png");

   public fsb(fsx.a $$0) {
      super($$0, new fdz<>($$0.a(fhr.j)), 0.4F);
   }

   public aer a(buk $$0) {
      if ($$0.S_()) {
         return $$0.gk() ? i : a;
      } else {
         return $$0.gk() ? k : j;
      }
   }
}
