import java.util.Arrays;

public enum cbz {
   a(0, aqd.zy, aqd.zG),
   b(40, aqd.zx, aqd.zH),
   c(80, aqd.zz, aqd.zH);

   private static final cbz[] d = ac.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final aqc f;
   private final aqc g;

   private cbz(int $$0, aqc $$1, aqc $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public aqc b() {
      return this.f;
   }

   public aqc c() {
      return this.g;
   }

   public static cbz a(int $$0) {
      for (cbz $$1 : d) {
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
