public class frs extends ftu<bul, fdu<bul>> {
   private static final aer a = new aer("textures/entity/bee/bee_angry.png");
   private static final aer i = new aer("textures/entity/bee/bee_angry_nectar.png");
   private static final aer j = new aer("textures/entity/bee/bee.png");
   private static final aer k = new aer("textures/entity/bee/bee_nectar.png");

   public frs(fso.a $$0) {
      super($$0, new fdu<>($$0.a(fhm.j)), 0.4F);
   }

   public aer a(bul $$0) {
      if ($$0.S_()) {
         return $$0.gj() ? i : a;
      } else {
         return $$0.gj() ? k : j;
      }
   }
}
