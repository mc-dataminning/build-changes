public record epw(aqt a, eww b, eww c, float d, float e, boolean f) {
   public epw(aqt $$0, eww $$1, eww $$2, float $$3, float $$4) {
      this($$0, $$1, $$2, $$3, $$4, false);
   }

   public epw(aqt $$0) {
      this($$0, $$0.V().b(), eww.b, 0.0F, 0.0F, false);
   }

   public static epw a(aqt $$0) {
      return new epw($$0, $$0.V().b(), eww.b, 0.0F, 0.0F, true);
   }
}
