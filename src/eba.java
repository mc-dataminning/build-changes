public enum eba implements bai {
   a("none", true),
   b("unstable", false),
   c("partial", true),
   d("full", true);

   private final String e;
   private final boolean f;

   private eba(final String $$0, final boolean $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public String c() {
      return this.e;
   }

   public boolean a() {
      return this.f;
   }
}
