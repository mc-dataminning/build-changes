public enum asl {
   a("old"),
   b("new"),
   c("compatible");

   private final wg d;
   private final wg e;

   private asl(String $$0) {
      this.d = wg.c("pack.incompatible." + $$0).a(n.h);
      this.e = wg.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static asl a(axc<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public wg b() {
      return this.d;
   }

   public wg c() {
      return this.e;
   }
}
