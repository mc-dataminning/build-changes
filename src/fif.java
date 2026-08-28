public enum fif {
   a(false, true),
   b(false, true),
   c(false, true),
   d(true, false),
   e(true, false),
   f(true, false),
   g(false, false),
   h(false, false),
   i(false, false);

   final boolean j;
   final boolean k;

   private fif(final boolean $$0, final boolean $$1) {
      this.j = $$0;
      this.k = $$1;
   }

   public boolean a() {
      return this.j;
   }

   public boolean b() {
      return this.k;
   }
}
