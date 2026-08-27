public enum eza {
   a(
      new aey("advancements/box_obtained"),
      new aey("advancements/task_frame_obtained"),
      new aey("advancements/challenge_frame_obtained"),
      new aey("advancements/goal_frame_obtained")
   ),
   b(
      new aey("advancements/box_unobtained"),
      new aey("advancements/task_frame_unobtained"),
      new aey("advancements/challenge_frame_unobtained"),
      new aey("advancements/goal_frame_unobtained")
   );

   private final aey c;
   private final aey d;
   private final aey e;
   private final aey f;

   private eza(aey $$0, aey $$1, aey $$2, aey $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public aey a() {
      return this.c;
   }

   public aey a(ar $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
