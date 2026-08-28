public enum auj {
   a("old"),
   b("new"),
   c("compatible");

   private final ww d;
   private final ww e;

   private auj(final String $$0) {
      this.d = ww.c("pack.incompatible." + $$0).a(n.h);
      this.e = ww.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static auj a(azc<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public ww b() {
      return this.d;
   }

   public ww c() {
      return this.e;
   }
}
