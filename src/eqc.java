public enum eqc {
   a(true, false),
   b(false, false),
   c(false, true);

   private static final eqc[] d = values();
   private final boolean e;
   private final boolean f;

   private eqc(boolean $$0, boolean $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.f;
   }

   public eqc c() {
      return d[(this.ordinal() + 1) % d.length];
   }
}
