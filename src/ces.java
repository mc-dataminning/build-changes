import java.util.Arrays;

public enum ces {
   a(0, art.AL, art.AT),
   b(40, art.AK, art.AU),
   c(80, art.AM, art.AU);

   private static final ces[] d = ac.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final ars f;
   private final ars g;

   private ces(int $$0, ars $$1, ars $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public ars b() {
      return this.f;
   }

   public ars c() {
      return this.g;
   }

   public static ces a(int $$0) {
      for (ces $$1 : d) {
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
