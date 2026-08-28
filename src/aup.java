public enum aup {
   a("old"),
   b("new"),
   c("compatible");

   private final xc d;
   private final xc e;

   private aup(final String $$0) {
      this.d = xc.c("pack.incompatible." + $$0).a(o.h);
      this.e = xc.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static aup a(azi<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public xc b() {
      return this.d;
   }

   public xc c() {
      return this.e;
   }
}
