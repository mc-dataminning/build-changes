import java.util.Arrays;

public enum cln {
   a(0, avh.BG, avh.BO),
   b(40, avh.BF, avh.BP),
   c(80, avh.BH, avh.BP);

   private static final cln[] d = ac.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final avg f;
   private final avg g;

   private cln(final int $$0, final avg $$1, final avg $$2) {
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

   public static cln a(int $$0) {
      for (cln $$1 : d) {
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
