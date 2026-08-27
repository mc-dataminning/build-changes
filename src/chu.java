import java.util.Arrays;

public enum chu {
   a(0, aty.Bc, aty.Bk),
   b(40, aty.Bb, aty.Bl),
   c(80, aty.Bd, aty.Bl);

   private static final chu[] d = ac.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final atx f;
   private final atx g;

   private chu(int $$0, atx $$1, atx $$2) {
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

   public static chu a(int $$0) {
      for (chu $$1 : d) {
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
