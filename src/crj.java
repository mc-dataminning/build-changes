import java.util.Arrays;

public enum crj {
   a(0, awy.CL, awy.CT),
   b(40, awy.CK, awy.CU),
   c(80, awy.CM, awy.CU);

   private static final crj[] d = ag.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final awx f;
   private final awx g;

   private crj(final int $$0, final awx $$1, final awx $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public awx b() {
      return this.f;
   }

   public awx c() {
      return this.g;
   }

   public static crj a(int $$0) {
      for (crj $$1 : d) {
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
