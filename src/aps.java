public enum aps {
   a("old"),
   b("new"),
   c("compatible");

   private final vg d;
   private final vg e;

   private aps(String $$0) {
      this.d = vg.c("pack.incompatible." + $$0).a(n.h);
      this.e = vg.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static aps a(auh<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public vg b() {
      return this.d;
   }

   public vg c() {
      return this.e;
   }
}
