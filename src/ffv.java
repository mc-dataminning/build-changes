public enum ffv {
   a(true, false),
   b(false, false),
   c(false, true);

   private static final ffv[] d = values();
   private final boolean e;
   private final boolean f;

   private ffv(boolean $$0, boolean $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.f;
   }

   public ffv c() {
      return d[(this.ordinal() + 1) % d.length];
   }
}
