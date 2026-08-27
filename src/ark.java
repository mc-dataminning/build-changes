public enum ark {
   a("old"),
   b("new"),
   c("compatible");

   private final vq d;
   private final vq e;

   private ark(String $$0) {
      this.d = vq.c("pack.incompatible." + $$0).a(n.h);
      this.e = vq.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static ark a(awa<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public vq b() {
      return this.d;
   }

   public vq c() {
      return this.e;
   }
}
