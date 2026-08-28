public enum frb {
   a(
      alh.b("advancements/box_obtained"),
      alh.b("advancements/task_frame_obtained"),
      alh.b("advancements/challenge_frame_obtained"),
      alh.b("advancements/goal_frame_obtained")
   ),
   b(
      alh.b("advancements/box_unobtained"),
      alh.b("advancements/task_frame_unobtained"),
      alh.b("advancements/challenge_frame_unobtained"),
      alh.b("advancements/goal_frame_unobtained")
   );

   private final alh c;
   private final alh d;
   private final alh e;
   private final alh f;

   private frb(final alh $$0, final alh $$1, final alh $$2, final alh $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public alh a() {
      return this.c;
   }

   public alh a(am $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
