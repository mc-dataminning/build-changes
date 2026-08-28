public enum fft {
   a(true, false),
   b(false, false),
   c(false, true);

   private static final fft[] d = values();
   private final boolean e;
   private final boolean f;

   private fft(final boolean $$0, final boolean $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.f;
   }

   public fft c() {
      return d[(this.ordinal() + 1) % d.length];
   }
}
