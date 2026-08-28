import java.util.Arrays;

public enum cmz {
   a(0, awg.BN, awg.BV),
   b(40, awg.BM, awg.BW),
   c(80, awg.BO, awg.BW);

   private static final cmz[] d = ad.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final awf f;
   private final awf g;

   private cmz(final int $$0, final awf $$1, final awf $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public awf b() {
      return this.f;
   }

   public awf c() {
      return this.g;
   }

   public static cmz a(int $$0) {
      for (cmz $$1 : d) {
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
