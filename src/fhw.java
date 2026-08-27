public enum fhw {
   a(
      new ajh("advancements/box_obtained"),
      new ajh("advancements/task_frame_obtained"),
      new ajh("advancements/challenge_frame_obtained"),
      new ajh("advancements/goal_frame_obtained")
   ),
   b(
      new ajh("advancements/box_unobtained"),
      new ajh("advancements/task_frame_unobtained"),
      new ajh("advancements/challenge_frame_unobtained"),
      new ajh("advancements/goal_frame_unobtained")
   );

   private final ajh c;
   private final ajh d;
   private final ajh e;
   private final ajh f;

   private fhw(ajh $$0, ajh $$1, ajh $$2, ajh $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public ajh a() {
      return this.c;
   }

   public ajh a(al $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
