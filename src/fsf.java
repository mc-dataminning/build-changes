public enum fsf {
   a(
      alj.b("advancements/box_obtained"),
      alj.b("advancements/task_frame_obtained"),
      alj.b("advancements/challenge_frame_obtained"),
      alj.b("advancements/goal_frame_obtained")
   ),
   b(
      alj.b("advancements/box_unobtained"),
      alj.b("advancements/task_frame_unobtained"),
      alj.b("advancements/challenge_frame_unobtained"),
      alj.b("advancements/goal_frame_unobtained")
   );

   private final alj c;
   private final alj d;
   private final alj e;
   private final alj f;

   private fsf(final alj $$0, final alj $$1, final alj $$2, final alj $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public alj a() {
      return this.c;
   }

   public alj a(an $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
