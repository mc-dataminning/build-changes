public enum eyt {
   a(
      new aez("advancements/box_obtained"),
      new aez("advancements/task_frame_obtained"),
      new aez("advancements/challenge_frame_obtained"),
      new aez("advancements/goal_frame_obtained")
   ),
   b(
      new aez("advancements/box_unobtained"),
      new aez("advancements/task_frame_unobtained"),
      new aez("advancements/challenge_frame_unobtained"),
      new aez("advancements/goal_frame_unobtained")
   );

   private final aez c;
   private final aez d;
   private final aez e;
   private final aez f;

   private eyt(aez $$0, aez $$1, aez $$2, aez $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public aez a() {
      return this.c;
   }

   public aez a(ar $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
