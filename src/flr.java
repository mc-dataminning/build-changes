public enum flr {
   a(
      new akh("advancements/box_obtained"),
      new akh("advancements/task_frame_obtained"),
      new akh("advancements/challenge_frame_obtained"),
      new akh("advancements/goal_frame_obtained")
   ),
   b(
      new akh("advancements/box_unobtained"),
      new akh("advancements/task_frame_unobtained"),
      new akh("advancements/challenge_frame_unobtained"),
      new akh("advancements/goal_frame_unobtained")
   );

   private final akh c;
   private final akh d;
   private final akh e;
   private final akh f;

   private flr(akh $$0, akh $$1, akh $$2, akh $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public akh a() {
      return this.c;
   }

   public akh a(al $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
