public enum auj {
   a("old"),
   b("new"),
   c("compatible");

   private final xi d;
   private final xi e;

   private auj(final String $$0) {
      this.d = xi.c("pack.incompatible." + $$0).a(n.h);
      this.e = xi.c("pack.incompatible.confirm." + $$0);
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

   public xi b() {
      return this.d;
   }

   public xi c() {
      return this.e;
   }
}
