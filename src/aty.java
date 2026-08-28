public enum aty {
   a("old"),
   b("new"),
   c("compatible");

   private final xp d;
   private final xp e;

   private aty(final String $$0) {
      this.d = xp.c("pack.incompatible." + $$0).a(n.h);
      this.e = xp.c("pack.incompatible.confirm." + $$0);
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

   public xp b() {
      return this.d;
   }

   public xp c() {
      return this.e;
   }
}
