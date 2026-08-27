public enum fcr {
   a(
      new agt("advancements/box_obtained"),
      new agt("advancements/task_frame_obtained"),
      new agt("advancements/challenge_frame_obtained"),
      new agt("advancements/goal_frame_obtained")
   ),
   b(
      new agt("advancements/box_unobtained"),
      new agt("advancements/task_frame_unobtained"),
      new agt("advancements/challenge_frame_unobtained"),
      new agt("advancements/goal_frame_unobtained")
   );

   private final agt c;
   private final agt d;
   private final agt e;
   private final agt f;

   private fcr(agt $$0, agt $$1, agt $$2, agt $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public agt a() {
      return this.c;
   }

   public agt a(al $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
