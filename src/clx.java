import java.util.Arrays;

public enum clx {
   a(0, avz.BD, avz.BL),
   b(40, avz.BC, avz.BM),
   c(80, avz.BE, avz.BM);

   private static final clx[] d = ac.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final avy f;
   private final avy g;

   private clx(final int $$0, final avy $$1, final avy $$2) {
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

   public static clx a(int $$0) {
      for (clx $$1 : d) {
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
