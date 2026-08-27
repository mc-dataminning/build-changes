import java.util.Arrays;

public enum cgn {
   a(0, atl.AM, atl.AU),
   b(40, atl.AL, atl.AV),
   c(80, atl.AN, atl.AV);

   private static final cgn[] d = ac.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final atk f;
   private final atk g;

   private cgn(int $$0, atk $$1, atk $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public atk b() {
      return this.f;
   }

   public atk c() {
      return this.g;
   }

   public static cgn a(int $$0) {
      for (cgn $$1 : d) {
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
