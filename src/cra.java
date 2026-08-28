import java.util.Arrays;

public enum cra {
   a(0, awr.CL, awr.CT),
   b(40, awr.CK, awr.CU),
   c(80, awr.CM, awr.CU);

   private static final cra[] d = ag.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final awq f;
   private final awq g;

   private cra(final int $$0, final awq $$1, final awq $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public awq b() {
      return this.f;
   }

   public awq c() {
      return this.g;
   }

   public static cra a(int $$0) {
      for (cra $$1 : d) {
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
