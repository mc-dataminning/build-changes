public enum fnu {
   a(
      new akk("advancements/box_obtained"),
      new akk("advancements/task_frame_obtained"),
      new akk("advancements/challenge_frame_obtained"),
      new akk("advancements/goal_frame_obtained")
   ),
   b(
      new akk("advancements/box_unobtained"),
      new akk("advancements/task_frame_unobtained"),
      new akk("advancements/challenge_frame_unobtained"),
      new akk("advancements/goal_frame_unobtained")
   );

   private final akk c;
   private final akk d;
   private final akk e;
   private final akk f;

   private fnu(final akk $$0, final akk $$1, final akk $$2, final akk $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public akk a() {
      return this.c;
   }

   public akk a(al $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
