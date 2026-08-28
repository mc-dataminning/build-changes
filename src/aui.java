public enum aui {
   a("old"),
   b("new"),
   c("compatible");

   private final wv d;
   private final wv e;

   private aui(final String $$0) {
      this.d = wv.c("pack.incompatible." + $$0).a(n.h);
      this.e = wv.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static aui a(azc<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public wv b() {
      return this.d;
   }

   public wv c() {
      return this.e;
   }
}
