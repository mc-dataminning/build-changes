public enum and {
   a("old"),
   b("new"),
   c("compatible");

   private final tm d;
   private final tm e;

   private and(String $$0) {
      this.d = tm.c("pack.incompatible." + $$0).a(n.h);
      this.e = tm.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static and a(arq<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public tm b() {
      return this.d;
   }

   public tm c() {
      return this.e;
   }
}
