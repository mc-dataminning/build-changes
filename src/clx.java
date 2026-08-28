import java.util.Arrays;

public enum clx {
   a(0, avo.BH, avo.BP),
   b(40, avo.BG, avo.BQ),
   c(80, avo.BI, avo.BQ);

   private static final clx[] d = ad.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final avn f;
   private final avn g;

   private clx(final int $$0, final avn $$1, final avn $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public avn b() {
      return this.f;
   }

   public avn c() {
      return this.g;
   }

   public static clx a(int $$0) {
      for (clx $$1 : d) {
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
