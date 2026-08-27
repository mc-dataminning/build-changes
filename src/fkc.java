public enum fkc {
   a(
      new ajt("advancements/box_obtained"),
      new ajt("advancements/task_frame_obtained"),
      new ajt("advancements/challenge_frame_obtained"),
      new ajt("advancements/goal_frame_obtained")
   ),
   b(
      new ajt("advancements/box_unobtained"),
      new ajt("advancements/task_frame_unobtained"),
      new ajt("advancements/challenge_frame_unobtained"),
      new ajt("advancements/goal_frame_unobtained")
   );

   private final ajt c;
   private final ajt d;
   private final ajt e;
   private final ajt f;

   private fkc(ajt $$0, ajt $$1, ajt $$2, ajt $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public ajt a() {
      return this.c;
   }

   public ajt a(al $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
