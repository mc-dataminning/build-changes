import com.mojang.serialization.MapCodec;

public class dgi extends dcv {
   public static final MapCodec<dgi> a = b(dgi::new);

   @Override
   public MapCodec<dgi> a() {
      return a;
   }

   public dgi(dmd.d $$0) {
      super($$0);
   }

   @Override
   public void a(cwe $$0, dme $$1, ib $$2, bof $$3, float $$4) {
      if ($$3.bR()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.ah().k());
      }
   }

   @Override
   public void a(cvk $$0, bof $$1) {
      if ($$1.bR()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bof $$0) {
      eov $$1 = $$0.dm();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof box ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * $$2, $$1.e);
      }
   }

   @Override
   public void a(cwe $$0, ib $$1, dme $$2, bof $$3) {
      double $$4 = Math.abs($$3.dm().d);
      if ($$4 < 0.1 && !$$3.bQ()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.g($$3.dm().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
