import com.mojang.serialization.MapCodec;

public class daa extends cxy {
   public static final MapCodec<daa> d = b(daa::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<daa> a() {
      return d;
   }

   public daa(dmd.d $$0) {
      super($$0, jh.c);
   }

   @Override
   public boolean d(dme $$0) {
      return false;
   }

   protected static boolean a(cwe $$0, cxd.c $$1) {
      if ($$1 == cxd.c.b) {
         return $$0.F_().i() < 0.05F;
      } else {
         return $$1 == cxd.c.c ? $$0.F_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dme $$0, cwe $$1, ib $$2, cxd.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == cxd.c.b) {
            $$1.b($$2, czh.fu.o());
            $$1.a(null, dqr.c, $$2);
         } else if ($$3 == cxd.c.c) {
            $$1.b($$2, czh.fw.o());
            $$1.a(null, dqr.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(ehq $$0) {
      return true;
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, ehq $$3) {
      if ($$3 == ehs.c) {
         dme $$4 = czh.fu.o();
         $$1.b($$2, $$4);
         $$1.a(dqr.c, $$2, dqr.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == ehs.e) {
         dme $$5 = czh.fv.o();
         $$1.b($$2, $$5);
         $$1.a(dqr.c, $$2, dqr.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
