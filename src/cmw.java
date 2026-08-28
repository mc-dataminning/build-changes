import java.util.Arrays;

public enum cmw {
   a(0, awe.BN, awe.BV),
   b(40, awe.BM, awe.BW),
   c(80, awe.BO, awe.BW);

   private static final cmw[] d = ad.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final awd f;
   private final awd g;

   private cmw(final int $$0, final awd $$1, final awd $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public awd b() {
      return this.f;
   }

   public awd c() {
      return this.g;
   }

   public static cmw a(int $$0) {
      for (cmw $$1 : d) {
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
