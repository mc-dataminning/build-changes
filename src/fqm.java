public enum fqm {
   a(
      alc.b("advancements/box_obtained"),
      alc.b("advancements/task_frame_obtained"),
      alc.b("advancements/challenge_frame_obtained"),
      alc.b("advancements/goal_frame_obtained")
   ),
   b(
      alc.b("advancements/box_unobtained"),
      alc.b("advancements/task_frame_unobtained"),
      alc.b("advancements/challenge_frame_unobtained"),
      alc.b("advancements/goal_frame_unobtained")
   );

   private final alc c;
   private final alc d;
   private final alc e;
   private final alc f;

   private fqm(final alc $$0, final alc $$1, final alc $$2, final alc $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public alc a() {
      return this.c;
   }

   public alc a(am $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
