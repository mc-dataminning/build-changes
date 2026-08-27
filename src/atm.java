public enum atm {
   a("old"),
   b("new"),
   c("compatible");

   private final xe d;
   private final xe e;

   private atm(String $$0) {
      this.d = xe.c("pack.incompatible." + $$0).a(n.h);
      this.e = xe.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static atm a(aye<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public xe b() {
      return this.d;
   }

   public xe c() {
      return this.e;
   }
}
