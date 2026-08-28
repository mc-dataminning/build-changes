import com.mojang.serialization.MapCodec;

public class dhq extends dfo {
   public static final MapCodec<dhq> d = b(dhq::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<dhq> a() {
      return d;
   }

   public dhq(dtz.d $$0) {
      super($$0, kk.c);
   }

   @Override
   public boolean d(dua $$0) {
      return false;
   }

   protected static boolean a(dds $$0, det.c $$1) {
      if ($$1 == det.c.b) {
         return $$0.C_().i() < 0.05F;
      } else {
         return $$1 == det.c.c ? $$0.C_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dua $$0, dds $$1, je $$2, det.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == det.c.b) {
            $$1.b($$2, dgx.fu.o());
            $$1.a(null, dyx.c, $$2);
         } else if ($$3 == det.c.c) {
            $$1.b($$2, dgx.fw.o());
            $$1.a(null, dyx.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(eqa $$0) {
      return true;
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, eqa $$3) {
      if ($$3 == eqc.c) {
         dua $$4 = dgx.fu.o();
         $$1.b($$2, $$4);
         $$1.a(dyx.c, $$2, dyx.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == eqc.e) {
         dua $$5 = dgx.fv.o();
         $$1.b($$2, $$5);
         $$1.a(dyx.c, $$2, dyx.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
