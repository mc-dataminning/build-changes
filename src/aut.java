public enum aut {
   a("old"),
   b("new"),
   c("compatible");

   private final xk d;
   private final xk e;

   private aut(final String $$0) {
      this.d = xk.c("pack.incompatible." + $$0).a(n.h);
      this.e = xk.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static aut a(azm<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public xk b() {
      return this.d;
   }

   public xk c() {
      return this.e;
   }
}
