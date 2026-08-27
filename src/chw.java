import java.util.Arrays;

public enum chw {
   a(0, aty.Bh, aty.Bp),
   b(40, aty.Bg, aty.Bq),
   c(80, aty.Bi, aty.Bq);

   private static final chw[] d = ac.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final atx f;
   private final atx g;

   private chw(int $$0, atx $$1, atx $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public atx b() {
      return this.f;
   }

   public atx c() {
      return this.g;
   }

   public static chw a(int $$0) {
      for (chw $$1 : d) {
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
