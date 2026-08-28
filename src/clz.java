import java.util.Arrays;

public enum clz {
   a(0, avp.BH, avp.BP),
   b(40, avp.BG, avp.BQ),
   c(80, avp.BI, avp.BQ);

   private static final clz[] d = ad.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final avo f;
   private final avo g;

   private clz(final int $$0, final avo $$1, final avo $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public avo b() {
      return this.f;
   }

   public avo c() {
      return this.g;
   }

   public static clz a(int $$0) {
      for (clz $$1 : d) {
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
