public enum arx {
   a("old"),
   b("new"),
   c("compatible");

   private final vu d;
   private final vu e;

   private arx(String $$0) {
      this.d = vu.c("pack.incompatible." + $$0).a(n.h);
      this.e = vu.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static arx a(awo<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public vu b() {
      return this.d;
   }

   public vu c() {
      return this.e;
   }
}
