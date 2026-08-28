import java.util.function.Function;
import java.util.function.Supplier;

public enum fnm implements fbg {
   a(() -> a(5, 8, ($$0, $$1) -> -1)),
   b(() -> {
      int $$0 = 5;
      int $$1 = 8;
      return a(5, 8, ($$0x, $$1x) -> {
         boolean $$2 = $$0x == 0 || $$0x + 1 == 5 || $$1x == 0 || $$1x + 1 == 8;
         return $$2 ? -1 : 0;
      });
   });

   final fci c;

   private static fci a(int $$0, int $$1, fnm.a $$2) {
      fci $$3 = new fci(fci.a.a, $$0, $$1, false);

      for (int $$4 = 0; $$4 < $$1; $$4++) {
         for (int $$5 = 0; $$5 < $$0; $$5++) {
            $$3.a($$5, $$4, $$2.getColor($$5, $$4));
         }
      }

      $$3.i();
      return $$3;
   }

   private fnm(final Supplier<fci> $$0) {
      this.c = $$0.get();
   }

   @Override
   public float getAdvance() {
      return (float)(this.c.a() + 1);
   }

   @Override
   public fnk bake(Function<fbi, fnk> $$0) {
      return $$0.apply(new fbi() {
         @Override
         public int a() {
            return fnm.this.c.a();
         }

         @Override
         public int b() {
            return fnm.this.c.b();
         }

         @Override
         public float d() {
            return 1.0F;
         }

         @Override
         public void a(int $$0, int $$1) {
            fnm.this.c.a(0, $$0, $$1, false);
         }

         @Override
         public boolean c() {
            return true;
         }
      });
   }

   @FunctionalInterface
   interface a {
      int getColor(int var1, int var2);
   }
}
