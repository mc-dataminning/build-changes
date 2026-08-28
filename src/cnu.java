import java.util.Arrays;

public enum cnu {
   a(0, awn.BL, awn.BT),
   b(40, awn.BK, awn.BU),
   c(80, awn.BM, awn.BU);

   private static final cnu[] d = ae.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final awm f;
   private final awm g;

   private cnu(final int $$0, final awm $$1, final awm $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public awm b() {
      return this.f;
   }

   public awm c() {
      return this.g;
   }

   public static cnu a(int $$0) {
      for (cnu $$1 : d) {
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
