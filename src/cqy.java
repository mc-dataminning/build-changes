import java.util.Arrays;

public enum cqy {
   a(0, awp.CL, awp.CT),
   b(40, awp.CK, awp.CU),
   c(80, awp.CM, awp.CU);

   private static final cqy[] d = ag.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final awo f;
   private final awo g;

   private cqy(final int $$0, final awo $$1, final awo $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public awo b() {
      return this.f;
   }

   public awo c() {
      return this.g;
   }

   public static cqy a(int $$0) {
      for (cqy $$1 : d) {
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
