import com.mojang.serialization.MapCodec;

public class dgc extends dea {
   public static final MapCodec<dgc> d = b(dgc::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<dgc> a() {
      return d;
   }

   public dgc(dsj.d $$0) {
      super($$0, kg.c);
   }

   @Override
   public boolean d(dsk $$0) {
      return false;
   }

   protected static boolean a(dcf $$0, ddf.c $$1) {
      if ($$1 == ddf.c.b) {
         return $$0.E_().i() < 0.05F;
      } else {
         return $$1 == ddf.c.c ? $$0.E_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dsk $$0, dcf $$1, ja $$2, ddf.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == ddf.c.b) {
            $$1.b($$2, dfj.fu.o());
            $$1.a(null, dxg.c, $$2);
         } else if ($$3 == ddf.c.c) {
            $$1.b($$2, dfj.fw.o());
            $$1.a(null, dxg.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(eog $$0) {
      return true;
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, eog $$3) {
      if ($$3 == eoi.c) {
         dsk $$4 = dfj.fu.o();
         $$1.b($$2, $$4);
         $$1.a(dxg.c, $$2, dxg.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == eoi.e) {
         dsk $$5 = dfj.fv.o();
         $$1.b($$2, $$5);
         $$1.a(dxg.c, $$2, dxg.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
