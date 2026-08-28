public record eph(aqm a, ewh b, ewh c, float d, float e, boolean f) {
   public eph(aqm $$0, ewh $$1, ewh $$2, float $$3, float $$4) {
      this($$0, $$1, $$2, $$3, $$4, false);
   }

   public eph(aqm $$0) {
      this($$0, $$0.V().b(), ewh.b, 0.0F, 0.0F, false);
   }

   public static eph a(aqm $$0) {
      return new eph($$0, $$0.V().b(), ewh.b, 0.0F, 0.0F, true);
   }
}
