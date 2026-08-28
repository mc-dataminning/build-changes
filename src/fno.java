public enum fno {
   a(true, false),
   b(false, false),
   c(false, true);

   private static final fno[] d = values();
   private final boolean e;
   private final boolean f;

   private fno(final boolean $$0, final boolean $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.f;
   }

   public fno c() {
      return d[(this.ordinal() + 1) % d.length];
   }
}
