import com.mojang.serialization.MapCodec;

public class dfv extends ddt {
   public static final MapCodec<dfv> d = b(dfv::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<dfv> a() {
      return d;
   }

   public dfv(dsc.d $$0) {
      super($$0, kf.c);
   }

   @Override
   public boolean d(dsd $$0) {
      return false;
   }

   protected static boolean a(dbz $$0, dcy.c $$1) {
      if ($$1 == dcy.c.b) {
         return $$0.E_().i() < 0.05F;
      } else {
         return $$1 == dcy.c.c ? $$0.E_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dsd $$0, dbz $$1, iz $$2, dcy.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == dcy.c.b) {
            $$1.b($$2, dfc.fu.o());
            $$1.a(null, dww.c, $$2);
         } else if ($$3 == dcy.c.c) {
            $$1.b($$2, dfc.fw.o());
            $$1.a(null, dww.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(env $$0) {
      return true;
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, env $$3) {
      if ($$3 == enx.c) {
         dsd $$4 = dfc.fu.o();
         $$1.b($$2, $$4);
         $$1.a(dww.c, $$2, dww.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == enx.e) {
         dsd $$5 = dfc.fv.o();
         $$1.b($$2, $$5);
         $$1.a(dww.c, $$2, dww.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
