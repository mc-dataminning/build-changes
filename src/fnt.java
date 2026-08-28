public enum fnt {
   a(
      new alf("advancements/box_obtained"),
      new alf("advancements/task_frame_obtained"),
      new alf("advancements/challenge_frame_obtained"),
      new alf("advancements/goal_frame_obtained")
   ),
   b(
      new alf("advancements/box_unobtained"),
      new alf("advancements/task_frame_unobtained"),
      new alf("advancements/challenge_frame_unobtained"),
      new alf("advancements/goal_frame_unobtained")
   );

   private final alf c;
   private final alf d;
   private final alf e;
   private final alf f;

   private fnt(final alf $$0, final alf $$1, final alf $$2, final alf $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public alf a() {
      return this.c;
   }

   public alf a(al $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
