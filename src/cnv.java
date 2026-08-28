import java.util.Arrays;

public enum cnv {
   a(0, avz.Cv, avz.CD),
   b(40, avz.Cu, avz.CE),
   c(80, avz.Cw, avz.CE);

   private static final cnv[] d = af.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final avy f;
   private final avy g;

   private cnv(final int $$0, final avy $$1, final avy $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public avy b() {
      return this.f;
   }

   public avy c() {
      return this.g;
   }

   public static cnv a(int $$0) {
      for (cnv $$1 : d) {
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
