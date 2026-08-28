public enum fua {
   a(
      alp.b("advancements/box_obtained"),
      alp.b("advancements/task_frame_obtained"),
      alp.b("advancements/challenge_frame_obtained"),
      alp.b("advancements/goal_frame_obtained")
   ),
   b(
      alp.b("advancements/box_unobtained"),
      alp.b("advancements/task_frame_unobtained"),
      alp.b("advancements/challenge_frame_unobtained"),
      alp.b("advancements/goal_frame_unobtained")
   );

   private final alp c;
   private final alp d;
   private final alp e;
   private final alp f;

   private fua(final alp $$0, final alp $$1, final alp $$2, final alp $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public alp a() {
      return this.c;
   }

   public alp a(an $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
