import java.util.Arrays;

public enum cpj {
   a(0, awk.CF, awk.CN),
   b(40, awk.CE, awk.CO),
   c(80, awk.CG, awk.CO);

   private static final cpj[] d = af.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final awj f;
   private final awj g;

   private cpj(final int $$0, final awj $$1, final awj $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public awj b() {
      return this.f;
   }

   public awj c() {
      return this.g;
   }

   public static cpj a(int $$0) {
      for (cpj $$1 : d) {
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
