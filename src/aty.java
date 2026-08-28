public enum aty {
   a("old"),
   b("new"),
   c("compatible");

   private final wo d;
   private final wo e;

   private aty(final String $$0) {
      this.d = wo.c("pack.incompatible." + $$0).a(n.h);
      this.e = wo.c("pack.incompatible.confirm." + $$0);
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

   public wo b() {
      return this.d;
   }

   public wo c() {
      return this.e;
   }
}
