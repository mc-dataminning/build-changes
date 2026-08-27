import java.util.Arrays;

public enum can {
   a(0, aou.zr, aou.zz),
   b(40, aou.zq, aou.zA),
   c(80, aou.zs, aou.zA);

   private static final can[] d = ac.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final aot f;
   private final aot g;

   private can(int $$0, aot $$1, aot $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public aot b() {
      return this.f;
   }

   public aot c() {
      return this.g;
   }

   public static can a(int $$0) {
      for (can $$1 : d) {
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
