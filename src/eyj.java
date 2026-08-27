public enum eyj {
   a(
      new aep("advancements/box_obtained"),
      new aep("advancements/task_frame_obtained"),
      new aep("advancements/challenge_frame_obtained"),
      new aep("advancements/goal_frame_obtained")
   ),
   b(
      new aep("advancements/box_unobtained"),
      new aep("advancements/task_frame_unobtained"),
      new aep("advancements/challenge_frame_unobtained"),
      new aep("advancements/goal_frame_unobtained")
   );

   private final aep c;
   private final aep d;
   private final aep e;
   private final aep f;

   private eyj(aep $$0, aep $$1, aep $$2, aep $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public aep a() {
      return this.c;
   }

   public aep a(ao $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
