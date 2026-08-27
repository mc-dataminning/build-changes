public enum amt {
   a("old"),
   b("new"),
   c("compatible");

   private final te d;
   private final te e;

   private amt(String $$0) {
      this.d = te.c("pack.incompatible." + $$0).a(n.h);
      this.e = te.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static amt a(arh<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public te b() {
      return this.d;
   }

   public te c() {
      return this.e;
   }
}
