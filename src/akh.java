public enum akh {
   a("old"),
   b("new"),
   c("compatible");

   private final sw d;
   private final sw e;

   private akh(String $$0) {
      this.d = sw.c("pack.incompatible." + $$0).a(n.h);
      this.e = sw.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static akh a(int $$0, ajm $$1) {
      int $$2 = aa.b().a($$1);
      if ($$0 < $$2) {
         return a;
      } else {
         return $$0 > $$2 ? b : c;
      }
   }

   public sw b() {
      return this.d;
   }

   public sw c() {
      return this.e;
   }
}
