public enum fog {
   a(
      akq.b("advancements/box_obtained"),
      akq.b("advancements/task_frame_obtained"),
      akq.b("advancements/challenge_frame_obtained"),
      akq.b("advancements/goal_frame_obtained")
   ),
   b(
      akq.b("advancements/box_unobtained"),
      akq.b("advancements/task_frame_unobtained"),
      akq.b("advancements/challenge_frame_unobtained"),
      akq.b("advancements/goal_frame_unobtained")
   );

   private final akq c;
   private final akq d;
   private final akq e;
   private final akq f;

   private fog(final akq $$0, final akq $$1, final akq $$2, final akq $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public akq a() {
      return this.c;
   }

   public akq a(am $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
