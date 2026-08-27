public enum ao {
   a("task", 0, n.k),
   b("challenge", 26, n.f),
   c("goal", 52, n.k);

   private final String d;
   private final int e;
   private final n f;
   private final sw g;

   private ao(String $$0, int $$1, n $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = sw.c("advancements.toast." + $$0);
   }

   public String a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public static ao a(String $$0) {
      for (ao $$1 : values()) {
         if ($$1.d.equals($$0)) {
            return $$1;
         }
      }

      throw new IllegalArgumentException("Unknown frame type '" + $$0 + "'");
   }

   public n c() {
      return this.f;
   }

   public sw d() {
      return this.g;
   }
}
