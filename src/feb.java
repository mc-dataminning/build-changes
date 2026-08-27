public enum feb {
   a(
      new ahh("advancements/box_obtained"),
      new ahh("advancements/task_frame_obtained"),
      new ahh("advancements/challenge_frame_obtained"),
      new ahh("advancements/goal_frame_obtained")
   ),
   b(
      new ahh("advancements/box_unobtained"),
      new ahh("advancements/task_frame_unobtained"),
      new ahh("advancements/challenge_frame_unobtained"),
      new ahh("advancements/goal_frame_unobtained")
   );

   private final ahh c;
   private final ahh d;
   private final ahh e;
   private final ahh f;

   private feb(ahh $$0, ahh $$1, ahh $$2, ahh $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public ahh a() {
      return this.c;
   }

   public ahh a(al $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
