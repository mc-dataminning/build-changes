public enum fbj {
   a(
      new agi("advancements/box_obtained"),
      new agi("advancements/task_frame_obtained"),
      new agi("advancements/challenge_frame_obtained"),
      new agi("advancements/goal_frame_obtained")
   ),
   b(
      new agi("advancements/box_unobtained"),
      new agi("advancements/task_frame_unobtained"),
      new agi("advancements/challenge_frame_unobtained"),
      new agi("advancements/goal_frame_unobtained")
   );

   private final agi c;
   private final agi d;
   private final agi e;
   private final agi f;

   private fbj(agi $$0, agi $$1, agi $$2, agi $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public agi a() {
      return this.c;
   }

   public agi a(ar $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
