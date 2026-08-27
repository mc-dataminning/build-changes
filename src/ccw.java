import java.util.Arrays;

public enum ccw {
   a(0, aqr.Ab, aqr.Aj),
   b(40, aqr.Aa, aqr.Ak),
   c(80, aqr.Ac, aqr.Ak);

   private static final ccw[] d = ac.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final aqq f;
   private final aqq g;

   private ccw(int $$0, aqq $$1, aqq $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public aqq b() {
      return this.f;
   }

   public aqq c() {
      return this.g;
   }

   public static ccw a(int $$0) {
      for (ccw $$1 : d) {
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
