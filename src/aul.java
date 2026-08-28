public enum aul {
   a("old"),
   b("new"),
   c("compatible");

   private final wy d;
   private final wy e;

   private aul(final String $$0) {
      this.d = wy.c("pack.incompatible." + $$0).a(n.h);
      this.e = wy.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static aul a(aze<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public wy b() {
      return this.d;
   }

   public wy c() {
      return this.e;
   }
}
