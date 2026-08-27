import com.mojang.serialization.MapCodec;

public class dax extends cyv {
   public static final MapCodec<dax> d = b(dax::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<dax> a() {
      return d;
   }

   public dax(dna.d $$0) {
      super($$0, ji.c);
   }

   @Override
   public boolean d(dnb $$0) {
      return false;
   }

   protected static boolean a(cxb $$0, cya.c $$1) {
      if ($$1 == cya.c.b) {
         return $$0.E_().i() < 0.05F;
      } else {
         return $$1 == cya.c.c ? $$0.E_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dnb $$0, cxb $$1, ib $$2, cya.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == cya.c.b) {
            $$1.b($$2, dae.fu.o());
            $$1.a(null, drp.c, $$2);
         } else if ($$3 == cya.c.c) {
            $$1.b($$2, dae.fw.o());
            $$1.a(null, drp.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(eio $$0) {
      return true;
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, eio $$3) {
      if ($$3 == eiq.c) {
         dnb $$4 = dae.fu.o();
         $$1.b($$2, $$4);
         $$1.a(drp.c, $$2, drp.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == eiq.e) {
         dnb $$5 = dae.fv.o();
         $$1.b($$2, $$5);
         $$1.a(drp.c, $$2, drp.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
