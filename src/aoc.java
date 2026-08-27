public enum aoc {
   a("old"),
   b("new"),
   c("compatible");

   private final ui d;
   private final ui e;

   private aoc(String $$0) {
      this.d = ui.c("pack.incompatible." + $$0).a(n.h);
      this.e = ui.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static aoc a(asq<Integer> $$0, int $$1) {
      if ($$0.b() < $$1) {
         return a;
      } else {
         return $$1 < $$0.a() ? b : c;
      }
   }

   public ui b() {
      return this.d;
   }

   public ui c() {
      return this.e;
   }
}
