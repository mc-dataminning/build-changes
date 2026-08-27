import java.util.Arrays;

public enum cjc {
   a(0, auo.Bk, auo.Bs),
   b(40, auo.Bj, auo.Bt),
   c(80, auo.Bl, auo.Bt);

   private static final cjc[] d = ac.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final aun f;
   private final aun g;

   private cjc(int $$0, aun $$1, aun $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public aun b() {
      return this.f;
   }

   public aun c() {
      return this.g;
   }

   public static cjc a(int $$0) {
      for (cjc $$1 : d) {
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
