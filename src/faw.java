public enum faw {
   a(
      new agg("advancements/box_obtained"),
      new agg("advancements/task_frame_obtained"),
      new agg("advancements/challenge_frame_obtained"),
      new agg("advancements/goal_frame_obtained")
   ),
   b(
      new agg("advancements/box_unobtained"),
      new agg("advancements/task_frame_unobtained"),
      new agg("advancements/challenge_frame_unobtained"),
      new agg("advancements/goal_frame_unobtained")
   );

   private final agg c;
   private final agg d;
   private final agg e;
   private final agg f;

   private faw(agg $$0, agg $$1, agg $$2, agg $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public agg a() {
      return this.c;
   }

   public agg a(ar $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
