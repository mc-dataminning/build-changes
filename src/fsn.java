public class fsn extends fup<buu, fel<buu>> {
   private static final aey a = new aey("textures/entity/bee/bee_angry.png");
   private static final aey i = new aey("textures/entity/bee/bee_angry_nectar.png");
   private static final aey j = new aey("textures/entity/bee/bee.png");
   private static final aey k = new aey("textures/entity/bee/bee_nectar.png");

   public fsn(ftj.a $$0) {
      super($$0, new fel<>($$0.a(fid.j)), 0.4F);
   }

   public aey a(buu $$0) {
      if ($$0.X_()) {
         return $$0.gn() ? i : a;
      } else {
         return $$0.gn() ? k : j;
      }
   }
}
