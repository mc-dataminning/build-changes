public enum fkl {
   a(
      new ajv("advancements/box_obtained"),
      new ajv("advancements/task_frame_obtained"),
      new ajv("advancements/challenge_frame_obtained"),
      new ajv("advancements/goal_frame_obtained")
   ),
   b(
      new ajv("advancements/box_unobtained"),
      new ajv("advancements/task_frame_unobtained"),
      new ajv("advancements/challenge_frame_unobtained"),
      new ajv("advancements/goal_frame_unobtained")
   );

   private final ajv c;
   private final ajv d;
   private final ajv e;
   private final ajv f;

   private fkl(ajv $$0, ajv $$1, ajv $$2, ajv $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public ajv a() {
      return this.c;
   }

   public ajv a(al $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
