public enum aui {
   a("old"),
   b("new"),
   c("compatible");

   private final xh d;
   private final xh e;

   private aui(final String $$0) {
      this.d = xh.c("pack.incompatible." + $$0).a(n.h);
      this.e = xh.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static aui a(azb<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public xh b() {
      return this.d;
   }

   public xh c() {
      return this.e;
   }
}
