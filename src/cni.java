import java.util.Arrays;

public enum cni {
   a(0, awk.BL, awk.BT),
   b(40, awk.BK, awk.BU),
   c(80, awk.BM, awk.BU);

   private static final cni[] d = ad.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final awj f;
   private final awj g;

   private cni(final int $$0, final awj $$1, final awj $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public awj b() {
      return this.f;
   }

   public awj c() {
      return this.g;
   }

   public static cni a(int $$0) {
      for (cni $$1 : d) {
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
