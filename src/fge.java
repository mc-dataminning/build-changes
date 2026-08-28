public enum fge {
   a(-3),
   b(-2),
   c(-1),
   d(0),
   e(1),
   f(2),
   g(3);

   private final int h;

   private fge(final int $$0) {
      this.h = $$0;
   }

   public static fge a(int $$0) {
      for (fge $$1 : values()) {
         if ($$1.h == $$0) {
            return $$1;
         }
      }

      return $$0 < a.h ? a : g;
   }

   public int a() {
      return this.h;
   }
}
