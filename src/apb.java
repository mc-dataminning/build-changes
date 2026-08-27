public enum apb {
   a("old"),
   b("new"),
   c("compatible");

   private final vb d;
   private final vb e;

   private apb(String $$0) {
      this.d = vb.c("pack.incompatible." + $$0).a(n.h);
      this.e = vb.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static apb a(atq<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public vb b() {
      return this.d;
   }

   public vb c() {
      return this.e;
   }
}
