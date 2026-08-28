public enum aun {
   a("old"),
   b("new"),
   c("compatible");

   private final xa d;
   private final xa e;

   private aun(final String $$0) {
      this.d = xa.c("pack.incompatible." + $$0).a(o.h);
      this.e = xa.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static aun a(azg<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public xa b() {
      return this.d;
   }

   public xa c() {
      return this.e;
   }
}
