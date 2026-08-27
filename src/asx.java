public enum asx {
   a("old"),
   b("new"),
   c("compatible");

   private final ws d;
   private final ws e;

   private asx(String $$0) {
      this.d = ws.c("pack.incompatible." + $$0).a(n.h);
      this.e = ws.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static asx a(axo<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public ws b() {
      return this.d;
   }

   public ws c() {
      return this.e;
   }
}
