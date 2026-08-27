public enum flh {
   a(
      new akf("advancements/box_obtained"),
      new akf("advancements/task_frame_obtained"),
      new akf("advancements/challenge_frame_obtained"),
      new akf("advancements/goal_frame_obtained")
   ),
   b(
      new akf("advancements/box_unobtained"),
      new akf("advancements/task_frame_unobtained"),
      new akf("advancements/challenge_frame_unobtained"),
      new akf("advancements/goal_frame_unobtained")
   );

   private final akf c;
   private final akf d;
   private final akf e;
   private final akf f;

   private flh(akf $$0, akf $$1, akf $$2, akf $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public akf a() {
      return this.c;
   }

   public akf a(al $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
