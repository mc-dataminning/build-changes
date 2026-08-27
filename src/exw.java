public enum exw {
   a(true, false),
   b(false, false),
   c(false, true);

   private static final exw[] d = values();
   private final boolean e;
   private final boolean f;

   private exw(boolean $$0, boolean $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.f;
   }

   public exw c() {
      return d[(this.ordinal() + 1) % d.length];
   }
}
