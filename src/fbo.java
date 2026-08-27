public enum fbo {
   a(
      new agm("advancements/box_obtained"),
      new agm("advancements/task_frame_obtained"),
      new agm("advancements/challenge_frame_obtained"),
      new agm("advancements/goal_frame_obtained")
   ),
   b(
      new agm("advancements/box_unobtained"),
      new agm("advancements/task_frame_unobtained"),
      new agm("advancements/challenge_frame_unobtained"),
      new agm("advancements/goal_frame_unobtained")
   );

   private final agm c;
   private final agm d;
   private final agm e;
   private final agm f;

   private fbo(agm $$0, agm $$1, agm $$2, agm $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public agm a() {
      return this.c;
   }

   public agm a(ar $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
