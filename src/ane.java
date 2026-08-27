public enum ane {
   a("old"),
   b("new"),
   c("compatible");

   private final tn d;
   private final tn e;

   private ane(String $$0) {
      this.d = tn.c("pack.incompatible." + $$0).a(n.h);
      this.e = tn.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static ane a(arr<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public tn b() {
      return this.d;
   }

   public tn c() {
      return this.e;
   }
}
