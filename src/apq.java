public enum apq {
   a("old"),
   b("new"),
   c("compatible");

   private final vf d;
   private final vf e;

   private apq(String $$0) {
      this.d = vf.c("pack.incompatible." + $$0).a(n.h);
      this.e = vf.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static apq a(auf<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public vf b() {
      return this.d;
   }

   public vf c() {
      return this.e;
   }
}
