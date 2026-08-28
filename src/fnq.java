public enum fnq {
   a(
      new ale("advancements/box_obtained"),
      new ale("advancements/task_frame_obtained"),
      new ale("advancements/challenge_frame_obtained"),
      new ale("advancements/goal_frame_obtained")
   ),
   b(
      new ale("advancements/box_unobtained"),
      new ale("advancements/task_frame_unobtained"),
      new ale("advancements/challenge_frame_unobtained"),
      new ale("advancements/goal_frame_unobtained")
   );

   private final ale c;
   private final ale d;
   private final ale e;
   private final ale f;

   private fnq(final ale $$0, final ale $$1, final ale $$2, final ale $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public ale a() {
      return this.c;
   }

   public ale a(al $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
