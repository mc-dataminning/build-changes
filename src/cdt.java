import java.util.Arrays;

public enum cdt {
   a(0, arc.Aw, arc.AE),
   b(40, arc.Av, arc.AF),
   c(80, arc.Ax, arc.AF);

   private static final cdt[] d = ac.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final arb f;
   private final arb g;

   private cdt(int $$0, arb $$1, arb $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public arb b() {
      return this.f;
   }

   public arb c() {
      return this.g;
   }

   public static cdt a(int $$0) {
      for (cdt $$1 : d) {
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
