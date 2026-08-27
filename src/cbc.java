import java.util.Arrays;

public enum cbc {
   a(0, apg.zw, apg.zE),
   b(40, apg.zv, apg.zF),
   c(80, apg.zx, apg.zF);

   private static final cbc[] d = ac.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final apf f;
   private final apf g;

   private cbc(int $$0, apf $$1, apf $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public apf b() {
      return this.f;
   }

   public apf c() {
      return this.g;
   }

   public static cbc a(int $$0) {
      for (cbc $$1 : d) {
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
