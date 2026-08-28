import com.mojang.serialization.MapCodec;

public class dgd extends deb {
   public static final MapCodec<dgd> d = b(dgd::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<dgd> a() {
      return d;
   }

   public dgd(dsk.d $$0) {
      super($$0, kg.c);
   }

   @Override
   public boolean d(dsl $$0) {
      return false;
   }

   protected static boolean a(dcg $$0, ddg.c $$1) {
      if ($$1 == ddg.c.b) {
         return $$0.E_().i() < 0.05F;
      } else {
         return $$1 == ddg.c.c ? $$0.E_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dsl $$0, dcg $$1, ja $$2, ddg.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == ddg.c.b) {
            $$1.b($$2, dfk.fu.o());
            $$1.a(null, dxh.c, $$2);
         } else if ($$3 == ddg.c.c) {
            $$1.b($$2, dfk.fw.o());
            $$1.a(null, dxh.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(eoi $$0) {
      return true;
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, eoi $$3) {
      if ($$3 == eok.c) {
         dsl $$4 = dfk.fu.o();
         $$1.b($$2, $$4);
         $$1.a(dxh.c, $$2, dxh.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == eok.e) {
         dsl $$5 = dfk.fv.o();
         $$1.b($$2, $$5);
         $$1.a(dxh.c, $$2, dxh.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
