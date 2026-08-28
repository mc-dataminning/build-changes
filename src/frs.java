import java.util.function.Function;
import java.util.function.Supplier;

public enum frs implements fdt {
   a(() -> a(5, 8, ($$0, $$1) -> -1)),
   b(() -> {
      int $$0 = 5;
      int $$1 = 8;
      return a(5, 8, ($$0x, $$1x) -> {
         boolean $$2 = $$0x == 0 || $$0x + 1 == 5 || $$1x == 0 || $$1x + 1 == 8;
         return $$2 ? -1 : 0;
      });
   });

   final fev c;

   private static fev a(int $$0, int $$1, frs.a $$2) {
      fev $$3 = new fev(fev.a.a, $$0, $$1, false);

      for (int $$4 = 0; $$4 < $$1; $$4++) {
         for (int $$5 = 0; $$5 < $$0; $$5++) {
            $$3.a($$5, $$4, $$2.getColor($$5, $$4));
         }
      }

      $$3.i();
      return $$3;
   }

   private frs(final Supplier<fev> $$0) {
      this.c = $$0.get();
   }

   @Override
   public float getAdvance() {
      return (float)(this.c.a() + 1);
   }

   @Override
   public frq bake(Function<fdv, frq> $$0) {
      return $$0.apply(new fdv() {
         @Override
         public int a() {
            return frs.this.c.a();
         }

         @Override
         public int b() {
            return frs.this.c.b();
         }

         @Override
         public float d() {
            return 1.0F;
         }

         @Override
         public void a(int $$0, int $$1) {
            frs.this.c.a(0, $$0, $$1, false);
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
