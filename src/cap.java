import java.util.Arrays;

public enum cap {
   a(0, aow.zr, aow.zz),
   b(40, aow.zq, aow.zA),
   c(80, aow.zs, aow.zA);

   private static final cap[] d = ac.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final aov f;
   private final aov g;

   private cap(int $$0, aov $$1, aov $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public aov b() {
      return this.f;
   }

   public aov c() {
      return this.g;
   }

   public static cap a(int $$0) {
      for (cap $$1 : d) {
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
