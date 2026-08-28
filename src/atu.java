public enum atu {
   a("old"),
   b("new"),
   c("compatible");

   private final xl d;
   private final xl e;

   private atu(final String $$0) {
      this.d = xl.c("pack.incompatible." + $$0).a(n.h);
      this.e = xl.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static atu a(aym<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public xl b() {
      return this.d;
   }

   public xl c() {
      return this.e;
   }
}
