public enum fqq {
   a(
      ale.b("advancements/box_obtained"),
      ale.b("advancements/task_frame_obtained"),
      ale.b("advancements/challenge_frame_obtained"),
      ale.b("advancements/goal_frame_obtained")
   ),
   b(
      ale.b("advancements/box_unobtained"),
      ale.b("advancements/task_frame_unobtained"),
      ale.b("advancements/challenge_frame_unobtained"),
      ale.b("advancements/goal_frame_unobtained")
   );

   private final ale c;
   private final ale d;
   private final ale e;
   private final ale f;

   private fqq(final ale $$0, final ale $$1, final ale $$2, final ale $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public ale a() {
      return this.c;
   }

   public ale a(am $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
