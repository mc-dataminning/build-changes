public enum aul {
   a("old"),
   b("new"),
   c("compatible");

   private final xj d;
   private final xj e;

   private aul(final String $$0) {
      this.d = xj.c("pack.incompatible." + $$0).a(n.h);
      this.e = xj.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static aul a(aze<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public xj b() {
      return this.d;
   }

   public xj c() {
      return this.e;
   }
}
