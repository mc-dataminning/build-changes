public enum fgw {
   a(
      new ajc("advancements/box_obtained"),
      new ajc("advancements/task_frame_obtained"),
      new ajc("advancements/challenge_frame_obtained"),
      new ajc("advancements/goal_frame_obtained")
   ),
   b(
      new ajc("advancements/box_unobtained"),
      new ajc("advancements/task_frame_unobtained"),
      new ajc("advancements/challenge_frame_unobtained"),
      new ajc("advancements/goal_frame_unobtained")
   );

   private final ajc c;
   private final ajc d;
   private final ajc e;
   private final ajc f;

   private fgw(ajc $$0, ajc $$1, ajc $$2, ajc $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public ajc a() {
      return this.c;
   }

   public ajc a(al $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
