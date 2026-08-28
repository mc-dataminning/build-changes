import java.util.Arrays;

public enum cnx {
   a(0, awa.Cv, awa.CD),
   b(40, awa.Cu, awa.CE),
   c(80, awa.Cw, awa.CE);

   private static final cnx[] d = af.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final avz f;
   private final avz g;

   private cnx(final int $$0, final avz $$1, final avz $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public avz b() {
      return this.f;
   }

   public avz c() {
      return this.g;
   }

   public static cnx a(int $$0) {
      for (cnx $$1 : d) {
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
