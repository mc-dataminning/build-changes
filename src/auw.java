public enum auw {
   a("old"),
   b("new"),
   c("compatible");

   private final xg d;
   private final xg e;

   private auw(final String $$0) {
      this.d = xg.c("pack.incompatible." + $$0).a(o.h);
      this.e = xg.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static auw a(azr<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public xg b() {
      return this.d;
   }

   public xg c() {
      return this.e;
   }
}
