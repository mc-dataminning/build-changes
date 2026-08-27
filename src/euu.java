public enum euu {
   a(true, false),
   b(false, false),
   c(false, true);

   private static final euu[] d = values();
   private final boolean e;
   private final boolean f;

   private euu(boolean $$0, boolean $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.f;
   }

   public euu c() {
      return d[(this.ordinal() + 1) % d.length];
   }
}
