public enum fpd {
   a(
      new akt("advancements/box_obtained"),
      new akt("advancements/task_frame_obtained"),
      new akt("advancements/challenge_frame_obtained"),
      new akt("advancements/goal_frame_obtained")
   ),
   b(
      new akt("advancements/box_unobtained"),
      new akt("advancements/task_frame_unobtained"),
      new akt("advancements/challenge_frame_unobtained"),
      new akt("advancements/goal_frame_unobtained")
   );

   private final akt c;
   private final akt d;
   private final akt e;
   private final akt f;

   private fpd(akt $$0, akt $$1, akt $$2, akt $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public akt a() {
      return this.c;
   }

   public akt a(am $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
