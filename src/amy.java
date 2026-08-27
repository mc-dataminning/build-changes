public enum amy {
   a("old"),
   b("new"),
   c("compatible");

   private final ti d;
   private final ti e;

   private amy(String $$0) {
      this.d = ti.c("pack.incompatible." + $$0).a(n.h);
      this.e = ti.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static amy a(arl<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public ti b() {
      return this.d;
   }

   public ti c() {
      return this.e;
   }
}
