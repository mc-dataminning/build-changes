public enum eyy {
   a(
      new aew("advancements/box_obtained"),
      new aew("advancements/task_frame_obtained"),
      new aew("advancements/challenge_frame_obtained"),
      new aew("advancements/goal_frame_obtained")
   ),
   b(
      new aew("advancements/box_unobtained"),
      new aew("advancements/task_frame_unobtained"),
      new aew("advancements/challenge_frame_unobtained"),
      new aew("advancements/goal_frame_unobtained")
   );

   private final aew c;
   private final aew d;
   private final aew e;
   private final aew f;

   private eyy(aew $$0, aew $$1, aew $$2, aew $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public aew a() {
      return this.c;
   }

   public aew a(ar $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
