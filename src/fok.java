public enum fok {
   a(
      akr.b("advancements/box_obtained"),
      akr.b("advancements/task_frame_obtained"),
      akr.b("advancements/challenge_frame_obtained"),
      akr.b("advancements/goal_frame_obtained")
   ),
   b(
      akr.b("advancements/box_unobtained"),
      akr.b("advancements/task_frame_unobtained"),
      akr.b("advancements/challenge_frame_unobtained"),
      akr.b("advancements/goal_frame_unobtained")
   );

   private final akr c;
   private final akr d;
   private final akr e;
   private final akr f;

   private fok(final akr $$0, final akr $$1, final akr $$2, final akr $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public akr a() {
      return this.c;
   }

   public akr a(am $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
