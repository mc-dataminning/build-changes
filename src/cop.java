import java.util.Arrays;

public enum cop {
   a(0, awv.Cw, awv.CE),
   b(40, awv.Cv, awv.CF),
   c(80, awv.Cx, awv.CF);

   private static final cop[] d = ae.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final awu f;
   private final awu g;

   private cop(final int $$0, final awu $$1, final awu $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public awu b() {
      return this.f;
   }

   public awu c() {
      return this.g;
   }

   public static cop a(int $$0) {
      for (cop $$1 : d) {
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
