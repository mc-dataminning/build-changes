public enum eqb {
   a(true, false),
   b(false, false),
   c(false, true);

   private static final eqb[] d = values();
   private final boolean e;
   private final boolean f;

   private eqb(boolean $$0, boolean $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.f;
   }

   public eqb c() {
      return d[(this.ordinal() + 1) % d.length];
   }
}
