import java.util.Arrays;

public enum ced {
   a(0, arm.Aw, arm.AE),
   b(40, arm.Av, arm.AF),
   c(80, arm.Ax, arm.AF);

   private static final ced[] d = ac.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final arl f;
   private final arl g;

   private ced(int $$0, arl $$1, arl $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public arl b() {
      return this.f;
   }

   public arl c() {
      return this.g;
   }

   public static ced a(int $$0) {
      for (ced $$1 : d) {
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
