public enum amv {
   a("old"),
   b("new"),
   c("compatible");

   private final tf d;
   private final tf e;

   private amv(String $$0) {
      this.d = tf.c("pack.incompatible." + $$0).a(n.h);
      this.e = tf.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static amv a(ari<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public tf b() {
      return this.d;
   }

   public tf c() {
      return this.e;
   }
}
