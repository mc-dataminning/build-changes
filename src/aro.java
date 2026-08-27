public enum aro {
   a("old"),
   b("new"),
   c("compatible");

   private final vs d;
   private final vs e;

   private aro(String $$0) {
      this.d = vs.c("pack.incompatible." + $$0).a(n.h);
      this.e = vs.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static aro a(awe<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public vs b() {
      return this.d;
   }

   public vs c() {
      return this.e;
   }
}
