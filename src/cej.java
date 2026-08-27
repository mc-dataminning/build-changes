import java.util.Arrays;

public enum cej {
   a(0, arr.Aw, arr.AE),
   b(40, arr.Av, arr.AF),
   c(80, arr.Ax, arr.AF);

   private static final cej[] d = ac.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final arq f;
   private final arq g;

   private cej(int $$0, arq $$1, arq $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public arq b() {
      return this.f;
   }

   public arq c() {
      return this.g;
   }

   public static cej a(int $$0) {
      for (cej $$1 : d) {
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
