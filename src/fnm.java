public enum fnm {
   a(
      new alb("advancements/box_obtained"),
      new alb("advancements/task_frame_obtained"),
      new alb("advancements/challenge_frame_obtained"),
      new alb("advancements/goal_frame_obtained")
   ),
   b(
      new alb("advancements/box_unobtained"),
      new alb("advancements/task_frame_unobtained"),
      new alb("advancements/challenge_frame_unobtained"),
      new alb("advancements/goal_frame_unobtained")
   );

   private final alb c;
   private final alb d;
   private final alb e;
   private final alb f;

   private fnm(final alb $$0, final alb $$1, final alb $$2, final alb $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public alb a() {
      return this.c;
   }

   public alb a(al $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
