import com.mojang.serialization.MapCodec;

public class dfw extends ddu {
   public static final MapCodec<dfw> d = b(dfw::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<dfw> a() {
      return d;
   }

   public dfw(dsd.d $$0) {
      super($$0, kf.c);
   }

   @Override
   public boolean d(dse $$0) {
      return false;
   }

   protected static boolean a(dca $$0, dcz.c $$1) {
      if ($$1 == dcz.c.b) {
         return $$0.E_().i() < 0.05F;
      } else {
         return $$1 == dcz.c.c ? $$0.E_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dse $$0, dca $$1, iz $$2, dcz.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == dcz.c.b) {
            $$1.b($$2, dfd.fu.o());
            $$1.a(null, dwx.c, $$2);
         } else if ($$3 == dcz.c.c) {
            $$1.b($$2, dfd.fw.o());
            $$1.a(null, dwx.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(enw $$0) {
      return true;
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, enw $$3) {
      if ($$3 == eny.c) {
         dse $$4 = dfd.fu.o();
         $$1.b($$2, $$4);
         $$1.a(dwx.c, $$2, dwx.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == eny.e) {
         dse $$5 = dfd.fv.o();
         $$1.b($$2, $$5);
         $$1.a(dwx.c, $$2, dwx.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
