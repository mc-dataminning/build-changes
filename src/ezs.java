public enum ezs {
   a(
      new afw("advancements/box_obtained"),
      new afw("advancements/task_frame_obtained"),
      new afw("advancements/challenge_frame_obtained"),
      new afw("advancements/goal_frame_obtained")
   ),
   b(
      new afw("advancements/box_unobtained"),
      new afw("advancements/task_frame_unobtained"),
      new afw("advancements/challenge_frame_unobtained"),
      new afw("advancements/goal_frame_unobtained")
   );

   private final afw c;
   private final afw d;
   private final afw e;
   private final afw f;

   private ezs(afw $$0, afw $$1, afw $$2, afw $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public afw a() {
      return this.c;
   }

   public afw a(ar $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
