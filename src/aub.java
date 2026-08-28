public enum aub {
   a("old"),
   b("new"),
   c("compatible");

   private final xd d;
   private final xd e;

   private aub(final String $$0) {
      this.d = xd.c("pack.incompatible." + $$0).a(n.h);
      this.e = xd.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static aub a(ayu<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public xd b() {
      return this.d;
   }

   public xd c() {
      return this.e;
   }
}
