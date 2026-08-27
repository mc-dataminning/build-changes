public enum ar {
   a("task", n.k),
   b("challenge", n.f),
   c("goal", n.k);

   private final String d;
   private final n e;
   private final tn f;

   private ar(String $$0, n $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = tn.c("advancements.toast." + $$0);
   }

   public String a() {
      return this.d;
   }

   public static ar a(String $$0) {
      for (ar $$1 : values()) {
         if ($$1.d.equals($$0)) {
            return $$1;
         }
      }

      throw new IllegalArgumentException("Unknown frame type '" + $$0 + "'");
   }

   public n b() {
      return this.e;
   }

   public tn c() {
      return this.f;
   }
}
