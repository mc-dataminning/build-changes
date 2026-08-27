import java.util.Arrays;

public enum civ {
   a(0, aum.Bk, aum.Bs),
   b(40, aum.Bj, aum.Bt),
   c(80, aum.Bl, aum.Bt);

   private static final civ[] d = ac.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final aul f;
   private final aul g;

   private civ(int $$0, aul $$1, aul $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public aul b() {
      return this.f;
   }

   public aul c() {
      return this.g;
   }

   public static civ a(int $$0) {
      for (civ $$1 : d) {
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
