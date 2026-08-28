import java.util.Arrays;

public enum cnr {
   a(0, awo.BL, awo.BT),
   b(40, awo.BK, awo.BU),
   c(80, awo.BM, awo.BU);

   private static final cnr[] d = ae.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final awn f;
   private final awn g;

   private cnr(final int $$0, final awn $$1, final awn $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public awn b() {
      return this.f;
   }

   public awn c() {
      return this.g;
   }

   public static cnr a(int $$0) {
      for (cnr $$1 : d) {
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
