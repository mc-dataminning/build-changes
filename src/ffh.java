public enum ffh {
   a(true, false),
   b(false, false),
   c(false, true);

   private static final ffh[] d = values();
   private final boolean e;
   private final boolean f;

   private ffh(final boolean $$0, final boolean $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.f;
   }

   public ffh c() {
      return d[(this.ordinal() + 1) % d.length];
   }
}
