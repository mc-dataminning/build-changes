import java.util.Arrays;

public enum cpt {
   a(0, awl.CF, awl.CN),
   b(40, awl.CE, awl.CO),
   c(80, awl.CG, awl.CO);

   private static final cpt[] d = af.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final awk f;
   private final awk g;

   private cpt(final int $$0, final awk $$1, final awk $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public awk b() {
      return this.f;
   }

   public awk c() {
      return this.g;
   }

   public static cpt a(int $$0) {
      for (cpt $$1 : d) {
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
