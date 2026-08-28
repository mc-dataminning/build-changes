public enum fry {
   a(
      all.b("advancements/box_obtained"),
      all.b("advancements/task_frame_obtained"),
      all.b("advancements/challenge_frame_obtained"),
      all.b("advancements/goal_frame_obtained")
   ),
   b(
      all.b("advancements/box_unobtained"),
      all.b("advancements/task_frame_unobtained"),
      all.b("advancements/challenge_frame_unobtained"),
      all.b("advancements/goal_frame_unobtained")
   );

   private final all c;
   private final all d;
   private final all e;
   private final all f;

   private fry(final all $$0, final all $$1, final all $$2, final all $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public all a() {
      return this.c;
   }

   public all a(an $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
