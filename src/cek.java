import java.util.Arrays;

public enum cek {
   a(0, ars.Aw, ars.AE),
   b(40, ars.Av, ars.AF),
   c(80, ars.Ax, ars.AF);

   private static final cek[] d = ac.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final arr f;
   private final arr g;

   private cek(int $$0, arr $$1, arr $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public arr b() {
      return this.f;
   }

   public arr c() {
      return this.g;
   }

   public static cek a(int $$0) {
      for (cek $$1 : d) {
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
