import java.util.Arrays;

public enum cky {
   a(0, avh.BD, avh.BL),
   b(40, avh.BC, avh.BM),
   c(80, avh.BE, avh.BM);

   private static final cky[] d = ac.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final avg f;
   private final avg g;

   private cky(int $$0, avg $$1, avg $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public avg b() {
      return this.f;
   }

   public avg c() {
      return this.g;
   }

   public static cky a(int $$0) {
      for (cky $$1 : d) {
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
