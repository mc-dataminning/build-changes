import java.util.Arrays;

public enum bxq {
   a(0, amh.zq, amh.zy),
   b(40, amh.zp, amh.zz),
   c(80, amh.zr, amh.zz);

   private static final bxq[] d = ac.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final amg f;
   private final amg g;

   private bxq(int $$0, amg $$1, amg $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public amg b() {
      return this.f;
   }

   public amg c() {
      return this.g;
   }

   public static bxq a(int $$0) {
      for (bxq $$1 : d) {
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
