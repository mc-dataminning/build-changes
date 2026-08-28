import it.unimi.dsi.fastutil.ints.IntComparator;

public enum flw {
   a,
   b,
   c,
   d;

   private final IntComparator e = ($$0, $$1) -> $$0 == $$1 ? 0 : (this.b($$0, $$1) ? -1 : 1);

   public flv a() {
      return switch (this) {
         case a, b -> flv.b;
         case c, d -> flv.a;
      };
   }

   public flw b() {
      return switch (this) {
         case a -> b;
         case b -> a;
         case c -> d;
         case d -> c;
      };
   }

   public boolean c() {
      return switch (this) {
         case a, c -> false;
         case b, d -> true;
      };
   }

   public boolean a(int $$0, int $$1) {
      return this.c() ? $$0 > $$1 : $$1 > $$0;
   }

   public boolean b(int $$0, int $$1) {
      return this.c() ? $$0 < $$1 : $$1 < $$0;
   }

   public IntComparator d() {
      return this.e;
   }
}
