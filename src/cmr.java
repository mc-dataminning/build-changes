import java.util.Arrays;

public enum cmr {
   a(0, awd.BN, awd.BV),
   b(40, awd.BM, awd.BW),
   c(80, awd.BO, awd.BW);

   private static final cmr[] d = ad.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final awc f;
   private final awc g;

   private cmr(final int $$0, final awc $$1, final awc $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public awc b() {
      return this.f;
   }

   public awc c() {
      return this.g;
   }

   public static cmr a(int $$0) {
      for (cmr $$1 : d) {
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
