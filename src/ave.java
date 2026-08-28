public enum ave {
   a("old"),
   b("new"),
   c("compatible");

   private final xv d;
   private final xv e;

   private ave(final String $$0) {
      this.d = xv.c("pack.incompatible." + $$0).a(n.h);
      this.e = xv.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static ave a(azw<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public xv b() {
      return this.d;
   }

   public xv c() {
      return this.e;
   }
}
