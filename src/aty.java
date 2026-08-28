public enum aty {
   a("old"),
   b("new"),
   c("compatible");

   private final wp d;
   private final wp e;

   private aty(final String $$0) {
      this.d = wp.c("pack.incompatible." + $$0).a(n.h);
      this.e = wp.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static aty a(ayr<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public wp b() {
      return this.d;
   }

   public wp c() {
      return this.e;
   }
}
