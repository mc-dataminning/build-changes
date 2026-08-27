import com.mojang.serialization.MapCodec;

public class dav extends cyt {
   public static final MapCodec<dav> d = b(dav::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<dav> a() {
      return d;
   }

   public dav(dmy.d $$0) {
      super($$0, ji.c);
   }

   @Override
   public boolean d(dmz $$0) {
      return false;
   }

   protected static boolean a(cwz $$0, cxy.c $$1) {
      if ($$1 == cxy.c.b) {
         return $$0.E_().i() < 0.05F;
      } else {
         return $$1 == cxy.c.c ? $$0.E_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dmz $$0, cwz $$1, ib $$2, cxy.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == cxy.c.b) {
            $$1.b($$2, dac.fu.o());
            $$1.a(null, drn.c, $$2);
         } else if ($$3 == cxy.c.c) {
            $$1.b($$2, dac.fw.o());
            $$1.a(null, drn.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(eim $$0) {
      return true;
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, eim $$3) {
      if ($$3 == eio.c) {
         dmz $$4 = dac.fu.o();
         $$1.b($$2, $$4);
         $$1.a(drn.c, $$2, drn.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == eio.e) {
         dmz $$5 = dac.fv.o();
         $$1.b($$2, $$5);
         $$1.a(drn.c, $$2, drn.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
