public enum fmm {
   a(
      new akm("advancements/box_obtained"),
      new akm("advancements/task_frame_obtained"),
      new akm("advancements/challenge_frame_obtained"),
      new akm("advancements/goal_frame_obtained")
   ),
   b(
      new akm("advancements/box_unobtained"),
      new akm("advancements/task_frame_unobtained"),
      new akm("advancements/challenge_frame_unobtained"),
      new akm("advancements/goal_frame_unobtained")
   );

   private final akm c;
   private final akm d;
   private final akm e;
   private final akm f;

   private fmm(akm $$0, akm $$1, akm $$2, akm $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public akm a() {
      return this.c;
   }

   public akm a(al $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
