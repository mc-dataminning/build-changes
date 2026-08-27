public enum fdn {
   a(true, false),
   b(false, false),
   c(false, true);

   private static final fdn[] d = values();
   private final boolean e;
   private final boolean f;

   private fdn(boolean $$0, boolean $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.f;
   }

   public fdn c() {
      return d[(this.ordinal() + 1) % d.length];
   }
}
