import java.util.Arrays;

public enum caw {
   a(0, apd.zw, apd.zE),
   b(40, apd.zv, apd.zF),
   c(80, apd.zx, apd.zF);

   private static final caw[] d = ac.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final apc f;
   private final apc g;

   private caw(int $$0, apc $$1, apc $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public apc b() {
      return this.f;
   }

   public apc c() {
      return this.g;
   }

   public static caw a(int $$0) {
      for (caw $$1 : d) {
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
