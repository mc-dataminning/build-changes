public enum anf {
   a("old"),
   b("new"),
   c("compatible");

   private final tl d;
   private final tl e;

   private anf(String $$0) {
      this.d = tl.c("pack.incompatible." + $$0).a(n.h);
      this.e = tl.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static anf a(art<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public tl b() {
      return this.d;
   }

   public tl c() {
      return this.e;
   }
}
