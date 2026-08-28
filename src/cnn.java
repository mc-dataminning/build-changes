import java.util.Arrays;

public enum cnn {
   a(0, awl.BL, awl.BT),
   b(40, awl.BK, awl.BU),
   c(80, awl.BM, awl.BU);

   private static final cnn[] d = ae.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final awk f;
   private final awk g;

   private cnn(final int $$0, final awk $$1, final awk $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public awk b() {
      return this.f;
   }

   public awk c() {
      return this.g;
   }

   public static cnn a(int $$0) {
      for (cnn $$1 : d) {
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
