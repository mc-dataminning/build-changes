import com.mojang.serialization.MapCodec;

public class dct extends dar {
   public static final MapCodec<dct> d = b(dct::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<dct> a() {
      return d;
   }

   public dct(doy.d $$0) {
      super($$0, ji.c);
   }

   @Override
   public boolean d(doz $$0) {
      return false;
   }

   protected static boolean a(cyx $$0, czw.c $$1) {
      if ($$1 == czw.c.b) {
         return $$0.E_().i() < 0.05F;
      } else {
         return $$1 == czw.c.c ? $$0.E_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(doz $$0, cyx $$1, ib $$2, czw.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == czw.c.b) {
            $$1.b($$2, dca.fu.n());
            $$1.a(null, dts.c, $$2);
         } else if ($$3 == czw.c.c) {
            $$1.b($$2, dca.fw.n());
            $$1.a(null, dts.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(ekr $$0) {
      return true;
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, ekr $$3) {
      if ($$3 == ekt.c) {
         doz $$4 = dca.fu.n();
         $$1.b($$2, $$4);
         $$1.a(dts.c, $$2, dts.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == ekt.e) {
         doz $$5 = dca.fv.n();
         $$1.b($$2, $$5);
         $$1.a(dts.c, $$2, dts.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
