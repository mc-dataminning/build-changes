import com.mojang.serialization.MapCodec;

public class dit extends dgr {
   public static final MapCodec<dit> d = b(dit::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<dit> a() {
      return d;
   }

   public dit(dvc.d $$0) {
      super($$0, km.c);
   }

   @Override
   public boolean d(dvd $$0) {
      return false;
   }

   protected static boolean a(dev $$0, dfw.c $$1) {
      if ($$1 == dfw.c.b) {
         return $$0.E_().i() < 0.05F;
      } else {
         return $$1 == dfw.c.c ? $$0.E_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, dfw.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == dfw.c.b) {
            $$1.b($$2, dia.fu.m());
            $$1.a(null, eaa.c, $$2);
         } else if ($$3 == dfw.c.c) {
            $$1.b($$2, dia.fw.m());
            $$1.a(null, eaa.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(erd $$0) {
      return true;
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, erd $$3) {
      if ($$3 == erf.c) {
         dvd $$4 = dia.fu.m();
         $$1.b($$2, $$4);
         $$1.a(eaa.c, $$2, eaa.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == erf.e) {
         dvd $$5 = dia.fv.m();
         $$1.b($$2, $$5);
         $$1.a(eaa.c, $$2, eaa.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
