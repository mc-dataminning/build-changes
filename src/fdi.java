public enum fdi {
   a(
      new ahd("advancements/box_obtained"),
      new ahd("advancements/task_frame_obtained"),
      new ahd("advancements/challenge_frame_obtained"),
      new ahd("advancements/goal_frame_obtained")
   ),
   b(
      new ahd("advancements/box_unobtained"),
      new ahd("advancements/task_frame_unobtained"),
      new ahd("advancements/challenge_frame_unobtained"),
      new ahd("advancements/goal_frame_unobtained")
   );

   private final ahd c;
   private final ahd d;
   private final ahd e;
   private final ahd f;

   private fdi(ahd $$0, ahd $$1, ahd $$2, ahd $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public ahd a() {
      return this.c;
   }

   public ahd a(al $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
