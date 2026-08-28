public enum ffx {
   a(true, false),
   b(false, false),
   c(false, true);

   private static final ffx[] d = values();
   private final boolean e;
   private final boolean f;

   private ffx(final boolean $$0, final boolean $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.f;
   }

   public ffx c() {
      return d[(this.ordinal() + 1) % d.length];
   }
}
