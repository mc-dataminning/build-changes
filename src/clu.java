import java.util.Arrays;

public enum clu {
   a(0, avw.BD, avw.BL),
   b(40, avw.BC, avw.BM),
   c(80, avw.BE, avw.BM);

   private static final clu[] d = ac.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final avv f;
   private final avv g;

   private clu(final int $$0, final avv $$1, final avv $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public avv b() {
      return this.f;
   }

   public avv c() {
      return this.g;
   }

   public static clu a(int $$0) {
      for (clu $$1 : d) {
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
