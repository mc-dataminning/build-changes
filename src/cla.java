import java.util.Arrays;

public enum cla {
   a(0, avi.BD, avi.BL),
   b(40, avi.BC, avi.BM),
   c(80, avi.BE, avi.BM);

   private static final cla[] d = ac.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final avh f;
   private final avh g;

   private cla(int $$0, avh $$1, avh $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public avh b() {
      return this.f;
   }

   public avh c() {
      return this.g;
   }

   public static cla a(int $$0) {
      for (cla $$1 : d) {
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
