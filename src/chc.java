import java.util.Arrays;

public enum chc {
   a(0, atp.AZ, atp.Bh),
   b(40, atp.AY, atp.Bi),
   c(80, atp.Ba, atp.Bi);

   private static final chc[] d = ac.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final ato f;
   private final ato g;

   private chc(int $$0, ato $$1, ato $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public ato b() {
      return this.f;
   }

   public ato c() {
      return this.g;
   }

   public static chc a(int $$0) {
      for (chc $$1 : d) {
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
