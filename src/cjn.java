import java.util.Arrays;

public enum cjn {
   a(0, auz.Br, auz.Bz),
   b(40, auz.Bq, auz.BA),
   c(80, auz.Bs, auz.BA);

   private static final cjn[] d = ac.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final auy f;
   private final auy g;

   private cjn(int $$0, auy $$1, auy $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public auy b() {
      return this.f;
   }

   public auy c() {
      return this.g;
   }

   public static cjn a(int $$0) {
      for (cjn $$1 : d) {
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
