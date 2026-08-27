public enum aou {
   a("old"),
   b("new"),
   c("compatible");

   private final uv d;
   private final uv e;

   private aou(String $$0) {
      this.d = uv.c("pack.incompatible." + $$0).a(n.h);
      this.e = uv.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static aou a(ati<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public uv b() {
      return this.d;
   }

   public uv c() {
      return this.e;
   }
}
