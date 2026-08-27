import java.util.Arrays;

public enum cgj {
   a(0, atk.AL, atk.AT),
   b(40, atk.AK, atk.AU),
   c(80, atk.AM, atk.AU);

   private static final cgj[] d = ac.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final atj f;
   private final atj g;

   private cgj(int $$0, atj $$1, atj $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public atj b() {
      return this.f;
   }

   public atj c() {
      return this.g;
   }

   public static cgj a(int $$0) {
      for (cgj $$1 : d) {
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
