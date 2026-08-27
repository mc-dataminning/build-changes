import com.mojang.serialization.MapCodec;

public class det extends dcr {
   public static final MapCodec<det> d = b(det::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<det> a() {
      return d;
   }

   public det(dra.d $$0) {
      super($$0, ju.c);
   }

   @Override
   public boolean d(drb $$0) {
      return false;
   }

   protected static boolean a(dax $$0, dbw.c $$1) {
      if ($$1 == dbw.c.b) {
         return $$0.E_().i() < 0.05F;
      } else {
         return $$1 == dbw.c.c ? $$0.E_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(drb $$0, dax $$1, io $$2, dbw.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == dbw.c.b) {
            $$1.b($$2, dea.fu.n());
            $$1.a(null, dvu.c, $$2);
         } else if ($$3 == dbw.c.c) {
            $$1.b($$2, dea.fw.n());
            $$1.a(null, dvu.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(emt $$0) {
      return true;
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, emt $$3) {
      if ($$3 == emv.c) {
         drb $$4 = dea.fu.n();
         $$1.b($$2, $$4);
         $$1.a(dvu.c, $$2, dvu.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == emv.e) {
         drb $$5 = dea.fv.n();
         $$1.b($$2, $$5);
         $$1.a(dvu.c, $$2, dvu.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
