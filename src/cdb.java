import java.util.Arrays;

public enum cdb {
   a(0, aqv.Ab, aqv.Aj),
   b(40, aqv.Aa, aqv.Ak),
   c(80, aqv.Ac, aqv.Ak);

   private static final cdb[] d = ac.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final aqu f;
   private final aqu g;

   private cdb(int $$0, aqu $$1, aqu $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public aqu b() {
      return this.f;
   }

   public aqu c() {
      return this.g;
   }

   public static cdb a(int $$0) {
      for (cdb $$1 : d) {
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
