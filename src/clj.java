import java.util.Arrays;

public enum clj {
   a(0, avf.BG, avf.BO),
   b(40, avf.BF, avf.BP),
   c(80, avf.BH, avf.BP);

   private static final clj[] d = ac.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final ave f;
   private final ave g;

   private clj(final int $$0, final ave $$1, final ave $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public ave b() {
      return this.f;
   }

   public ave c() {
      return this.g;
   }

   public static clj a(int $$0) {
      for (clj $$1 : d) {
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
