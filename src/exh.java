import java.util.function.Function;
import java.util.function.Supplier;

public enum exh implements elm {
   a(() -> a(5, 8, ($$0, $$1) -> -1)),
   b(() -> {
      int $$0 = 5;
      int $$1 = 8;
      return a(5, 8, ($$0x, $$1x) -> {
         boolean $$2 = $$0x == 0 || $$0x + 1 == 5 || $$1x == 0 || $$1x + 1 == 8;
         return $$2 ? -1 : 0;
      });
   });

   final eml c;

   private static eml a(int $$0, int $$1, exh.a $$2) {
      eml $$3 = new eml(eml.a.a, $$0, $$1, false);

      for (int $$4 = 0; $$4 < $$1; $$4++) {
         for (int $$5 = 0; $$5 < $$0; $$5++) {
            $$3.a($$5, $$4, $$2.getColor($$5, $$4));
         }
      }

      $$3.i();
      return $$3;
   }

   private exh(Supplier<eml> $$0) {
      this.c = $$0.get();
   }

   @Override
   public float getAdvance() {
      return (float)(this.c.a() + 1);
   }

   @Override
   public exf bake(Function<elo, exf> $$0) {
      return $$0.apply(new elo() {
         @Override
         public int a() {
            return exh.this.c.a();
         }

         @Override
         public int b() {
            return exh.this.c.b();
         }

         @Override
         public float d() {
            return 1.0F;
         }

         @Override
         public void a(int $$0, int $$1) {
            exh.this.c.a(0, $$0, $$1, false);
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
