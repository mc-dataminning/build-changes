import java.util.Arrays;

public enum cox {
   a(0, axf.Cg, axf.Co),
   b(40, axf.Cf, axf.Cp),
   c(80, axf.Ch, axf.Cp);

   private static final cox[] d = ae.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final axe f;
   private final axe g;

   private cox(final int $$0, final axe $$1, final axe $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public axe b() {
      return this.f;
   }

   public axe c() {
      return this.g;
   }

   public static cox a(int $$0) {
      for (cox $$1 : d) {
         if ($$0 >= $$1.e) {
            return $$1;
         }
      }

      return a;
   }

   public boolean d() {
      return this == c;
   }
}
