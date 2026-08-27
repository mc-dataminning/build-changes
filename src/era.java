public enum era {
   a(true, false),
   b(false, false),
   c(false, true);

   private static final era[] d = values();
   private final boolean e;
   private final boolean f;

   private era(boolean $$0, boolean $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.f;
   }

   public era c() {
      return d[(this.ordinal() + 1) % d.length];
   }
}
