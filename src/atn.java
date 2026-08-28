public enum atn {
   a("old"),
   b("new"),
   c("compatible");

   private final wz d;
   private final wz e;

   private atn(final String $$0) {
      this.d = wz.c("pack.incompatible." + $$0).a(n.h);
      this.e = wz.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static atn a(ayg<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public wz b() {
      return this.d;
   }

   public wz c() {
      return this.e;
   }
}
