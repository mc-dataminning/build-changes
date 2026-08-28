import com.mojang.serialization.MapCodec;

public class dmw extends dkt {
   public static final MapCodec<dmw> c = b(dmw::new);
   private static final float d = 0.05F;
   private static final float e = 0.1F;

   @Override
   public MapCodec<dmw> a() {
      return c;
   }

   public dmw(dzy.d $$0) {
      super($$0, kb.c);
   }

   @Override
   public boolean d(dzz $$0) {
      return false;
   }

   protected static boolean a(div $$0, djy.c $$1) {
      if ($$1 == djy.c.b) {
         return $$0.C_().i() < 0.05F;
      } else {
         return $$1 == djy.c.c ? $$0.C_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, djy.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == djy.c.b) {
            $$1.b($$2, dmc.fQ.m());
            $$1.a(null, eez.c, $$2);
         } else if ($$3 == djy.c.c) {
            $$1.b($$2, dmc.fS.m());
            $$1.a(null, eez.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(ewf $$0) {
      return true;
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, ewf $$3) {
      if ($$3 == ewh.c) {
         dzz $$4 = dmc.fQ.m();
         $$1.b($$2, $$4);
         $$1.a(eez.c, $$2, eez.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == ewh.e) {
         dzz $$5 = dmc.fR.m();
         $$1.b($$2, $$5);
         $$1.a(eez.c, $$2, eez.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
