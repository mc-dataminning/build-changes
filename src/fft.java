public enum fft {
   a(
      new aiy("advancements/box_obtained"),
      new aiy("advancements/task_frame_obtained"),
      new aiy("advancements/challenge_frame_obtained"),
      new aiy("advancements/goal_frame_obtained")
   ),
   b(
      new aiy("advancements/box_unobtained"),
      new aiy("advancements/task_frame_unobtained"),
      new aiy("advancements/challenge_frame_unobtained"),
      new aiy("advancements/goal_frame_unobtained")
   );

   private final aiy c;
   private final aiy d;
   private final aiy e;
   private final aiy f;

   private fft(aiy $$0, aiy $$1, aiy $$2, aiy $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public aiy a() {
      return this.c;
   }

   public aiy a(al $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
