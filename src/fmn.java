public enum fmn {
   a(
      new akn("advancements/box_obtained"),
      new akn("advancements/task_frame_obtained"),
      new akn("advancements/challenge_frame_obtained"),
      new akn("advancements/goal_frame_obtained")
   ),
   b(
      new akn("advancements/box_unobtained"),
      new akn("advancements/task_frame_unobtained"),
      new akn("advancements/challenge_frame_unobtained"),
      new akn("advancements/goal_frame_unobtained")
   );

   private final akn c;
   private final akn d;
   private final akn e;
   private final akn f;

   private fmn(akn $$0, akn $$1, akn $$2, akn $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public akn a() {
      return this.c;
   }

   public akn a(al $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
