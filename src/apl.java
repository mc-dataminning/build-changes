public enum apl {
   a("old"),
   b("new"),
   c("compatible");

   private final vd d;
   private final vd e;

   private apl(String $$0) {
      this.d = vd.c("pack.incompatible." + $$0).a(n.h);
      this.e = vd.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static apl a(aua<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public vd b() {
      return this.d;
   }

   public vd c() {
      return this.e;
   }
}
