import com.mojang.serialization.MapCodec;

public class dgr extends dep {
   public static final MapCodec<dgr> d = b(dgr::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<dgr> a() {
      return d;
   }

   public dgr(dsz.d $$0) {
      super($$0, kj.c);
   }

   @Override
   public boolean d(dta $$0) {
      return false;
   }

   protected static boolean a(dcu $$0, ddu.c $$1) {
      if ($$1 == ddu.c.b) {
         return $$0.E_().i() < 0.05F;
      } else {
         return $$1 == ddu.c.c ? $$0.E_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dta $$0, dcu $$1, jd $$2, ddu.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == ddu.c.b) {
            $$1.b($$2, dfy.fu.o());
            $$1.a(null, dxw.c, $$2);
         } else if ($$3 == ddu.c.c) {
            $$1.b($$2, dfy.fw.o());
            $$1.a(null, dxw.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(eox $$0) {
      return true;
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, eox $$3) {
      if ($$3 == eoz.c) {
         dta $$4 = dfy.fu.o();
         $$1.b($$2, $$4);
         $$1.a(dxw.c, $$2, dxw.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == eoz.e) {
         dta $$5 = dfy.fv.o();
         $$1.b($$2, $$5);
         $$1.a(dxw.c, $$2, dxw.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
