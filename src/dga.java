import com.mojang.serialization.MapCodec;

public class dga extends ddy {
   public static final MapCodec<dga> d = b(dga::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<dga> a() {
      return d;
   }

   public dga(dsg.d $$0) {
      super($$0, kg.c);
   }

   @Override
   public boolean d(dsh $$0) {
      return false;
   }

   protected static boolean a(dcd $$0, ddd.c $$1) {
      if ($$1 == ddd.c.b) {
         return $$0.E_().i() < 0.05F;
      } else {
         return $$1 == ddd.c.c ? $$0.E_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dsh $$0, dcd $$1, ja $$2, ddd.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == ddd.c.b) {
            $$1.b($$2, dfh.fu.o());
            $$1.a(null, dxa.c, $$2);
         } else if ($$3 == ddd.c.c) {
            $$1.b($$2, dfh.fw.o());
            $$1.a(null, dxa.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(eoa $$0) {
      return true;
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, eoa $$3) {
      if ($$3 == eoc.c) {
         dsh $$4 = dfh.fu.o();
         $$1.b($$2, $$4);
         $$1.a(dxa.c, $$2, dxa.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == eoc.e) {
         dsh $$5 = dfh.fv.o();
         $$1.b($$2, $$5);
         $$1.a(dxa.c, $$2, dxa.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
