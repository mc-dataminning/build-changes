import java.util.Arrays;

public enum cco {
   a(0, aqn.zA, aqn.zI),
   b(40, aqn.zz, aqn.zJ),
   c(80, aqn.zB, aqn.zJ);

   private static final cco[] d = ac.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final aqm f;
   private final aqm g;

   private cco(int $$0, aqm $$1, aqm $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public aqm b() {
      return this.f;
   }

   public aqm c() {
      return this.g;
   }

   public static cco a(int $$0) {
      for (cco $$1 : d) {
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
