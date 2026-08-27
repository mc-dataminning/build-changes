import java.util.Arrays;

public enum cay {
   a(0, apf.zw, apf.zE),
   b(40, apf.zv, apf.zF),
   c(80, apf.zx, apf.zF);

   private static final cay[] d = ac.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final ape f;
   private final ape g;

   private cay(int $$0, ape $$1, ape $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public ape b() {
      return this.f;
   }

   public ape c() {
      return this.g;
   }

   public static cay a(int $$0) {
      for (cay $$1 : d) {
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
