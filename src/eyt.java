public enum eyt {
   a(
      new aeu("advancements/box_obtained"),
      new aeu("advancements/task_frame_obtained"),
      new aeu("advancements/challenge_frame_obtained"),
      new aeu("advancements/goal_frame_obtained")
   ),
   b(
      new aeu("advancements/box_unobtained"),
      new aeu("advancements/task_frame_unobtained"),
      new aeu("advancements/challenge_frame_unobtained"),
      new aeu("advancements/goal_frame_unobtained")
   );

   private final aeu c;
   private final aeu d;
   private final aeu e;
   private final aeu f;

   private eyt(aeu $$0, aeu $$1, aeu $$2, aeu $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public aeu a() {
      return this.c;
   }

   public aeu a(ar $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
