public enum aoq {
   a("old"),
   b("new"),
   c("compatible");

   private final ur d;
   private final ur e;

   private aoq(String $$0) {
      this.d = ur.c("pack.incompatible." + $$0).a(n.h);
      this.e = ur.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static aoq a(ate<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public ur b() {
      return this.d;
   }

   public ur c() {
      return this.e;
   }
}
