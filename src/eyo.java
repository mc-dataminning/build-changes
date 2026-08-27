public enum eyo {
   a(
      new aer("advancements/box_obtained"),
      new aer("advancements/task_frame_obtained"),
      new aer("advancements/challenge_frame_obtained"),
      new aer("advancements/goal_frame_obtained")
   ),
   b(
      new aer("advancements/box_unobtained"),
      new aer("advancements/task_frame_unobtained"),
      new aer("advancements/challenge_frame_unobtained"),
      new aer("advancements/goal_frame_unobtained")
   );

   private final aer c;
   private final aer d;
   private final aer e;
   private final aer f;

   private eyo(aer $$0, aer $$1, aer $$2, aer $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public aer a() {
      return this.c;
   }

   public aer a(ao $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
