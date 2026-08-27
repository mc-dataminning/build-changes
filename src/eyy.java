public enum eyy {
   a(
      new aex("advancements/box_obtained"),
      new aex("advancements/task_frame_obtained"),
      new aex("advancements/challenge_frame_obtained"),
      new aex("advancements/goal_frame_obtained")
   ),
   b(
      new aex("advancements/box_unobtained"),
      new aex("advancements/task_frame_unobtained"),
      new aex("advancements/challenge_frame_unobtained"),
      new aex("advancements/goal_frame_unobtained")
   );

   private final aex c;
   private final aex d;
   private final aex e;
   private final aex f;

   private eyy(aex $$0, aex $$1, aex $$2, aex $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public aex a() {
      return this.c;
   }

   public aex a(ar $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
