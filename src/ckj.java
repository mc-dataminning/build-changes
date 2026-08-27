import java.util.Arrays;

public enum ckj {
   a(0, avc.Bs, avc.BA),
   b(40, avc.Br, avc.BB),
   c(80, avc.Bt, avc.BB);

   private static final ckj[] d = ac.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final avb f;
   private final avb g;

   private ckj(int $$0, avb $$1, avb $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public avb b() {
      return this.f;
   }

   public avb c() {
      return this.g;
   }

   public static ckj a(int $$0) {
      for (ckj $$1 : d) {
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
