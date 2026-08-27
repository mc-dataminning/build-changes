public enum esp {
   a(true, false),
   b(false, false),
   c(false, true);

   private static final esp[] d = values();
   private final boolean e;
   private final boolean f;

   private esp(boolean $$0, boolean $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.f;
   }

   public esp c() {
      return d[(this.ordinal() + 1) % d.length];
   }
}
