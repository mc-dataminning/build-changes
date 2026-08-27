public enum asn {
   a("old"),
   b("new"),
   c("compatible");

   private final wi d;
   private final wi e;

   private asn(String $$0) {
      this.d = wi.c("pack.incompatible." + $$0).a(n.h);
      this.e = wi.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static asn a(axe<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public wi b() {
      return this.d;
   }

   public wi c() {
      return this.e;
   }
}
