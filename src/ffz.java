public enum ffz {
   a(true, false),
   b(false, false),
   c(false, true);

   private static final ffz[] d = values();
   private final boolean e;
   private final boolean f;

   private ffz(final boolean $$0, final boolean $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.f;
   }

   public ffz c() {
      return d[(this.ordinal() + 1) % d.length];
   }
}
