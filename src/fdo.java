public enum fdo {
   a(
      new ahg("advancements/box_obtained"),
      new ahg("advancements/task_frame_obtained"),
      new ahg("advancements/challenge_frame_obtained"),
      new ahg("advancements/goal_frame_obtained")
   ),
   b(
      new ahg("advancements/box_unobtained"),
      new ahg("advancements/task_frame_unobtained"),
      new ahg("advancements/challenge_frame_unobtained"),
      new ahg("advancements/goal_frame_unobtained")
   );

   private final ahg c;
   private final ahg d;
   private final ahg e;
   private final ahg f;

   private fdo(ahg $$0, ahg $$1, ahg $$2, ahg $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public ahg a() {
      return this.c;
   }

   public ahg a(al $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
