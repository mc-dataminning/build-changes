import java.util.Arrays;

public enum caw {
   a(0, ape.zw, ape.zE),
   b(40, ape.zv, ape.zF),
   c(80, ape.zx, ape.zF);

   private static final caw[] d = ac.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final apd f;
   private final apd g;

   private caw(int $$0, apd $$1, apd $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public apd b() {
      return this.f;
   }

   public apd c() {
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
