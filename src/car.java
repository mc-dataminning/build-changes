import java.util.Arrays;

public enum car {
   a(0, aoz.zw, aoz.zE),
   b(40, aoz.zv, aoz.zF),
   c(80, aoz.zx, aoz.zF);

   private static final car[] d = ac.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final aoy f;
   private final aoy g;

   private car(int $$0, aoy $$1, aoy $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public aoy b() {
      return this.f;
   }

   public aoy c() {
      return this.g;
   }

   public static car a(int $$0) {
      for (car $$1 : d) {
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
