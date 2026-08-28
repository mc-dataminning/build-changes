public enum fer {
   a(true, false),
   b(false, false),
   c(false, true);

   private static final fer[] d = values();
   private final boolean e;
   private final boolean f;

   private fer(final boolean $$0, final boolean $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.f;
   }

   public fer c() {
      return d[(this.ordinal() + 1) % d.length];
   }
}
