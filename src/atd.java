public enum atd {
   a("old"),
   b("new"),
   c("compatible");

   private final wu d;
   private final wu e;

   private atd(final String $$0) {
      this.d = wu.c("pack.incompatible." + $$0).a(n.h);
      this.e = wu.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static atd a(axw<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public wu b() {
      return this.d;
   }

   public wu c() {
      return this.e;
   }
}
