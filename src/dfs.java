import com.mojang.serialization.MapCodec;

public class dfs extends ddq {
   public static final MapCodec<dfs> d = b(dfs::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<dfs> a() {
      return d;
   }

   public dfs(drz.d $$0) {
      super($$0, kf.c);
   }

   @Override
   public boolean d(dsa $$0) {
      return false;
   }

   protected static boolean a(dbw $$0, dcv.c $$1) {
      if ($$1 == dcv.c.b) {
         return $$0.E_().i() < 0.05F;
      } else {
         return $$1 == dcv.c.c ? $$0.E_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dsa $$0, dbw $$1, iz $$2, dcv.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == dcv.c.b) {
            $$1.b($$2, dez.fu.o());
            $$1.a(null, dwt.c, $$2);
         } else if ($$3 == dcv.c.c) {
            $$1.b($$2, dez.fw.o());
            $$1.a(null, dwt.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(ens $$0) {
      return true;
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, ens $$3) {
      if ($$3 == enu.c) {
         dsa $$4 = dez.fu.o();
         $$1.b($$2, $$4);
         $$1.a(dwt.c, $$2, dwt.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == enu.e) {
         dsa $$5 = dez.fv.o();
         $$1.b($$2, $$5);
         $$1.a(dwt.c, $$2, dwt.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
