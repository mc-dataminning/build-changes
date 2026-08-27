import com.mojang.serialization.MapCodec;

public class cxe extends cvc {
   public static final MapCodec<cxe> d = b(cxe::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<cxe> a() {
      return d;
   }

   public cxe(diz.d $$0) {
      super($$0, jd.c);
   }

   @Override
   public boolean d(dja $$0) {
      return false;
   }

   protected static boolean a(cti $$0, cuh.c $$1) {
      if ($$1 == cuh.c.b) {
         return $$0.F_().i() < 0.05F;
      } else {
         return $$1 == cuh.c.c ? $$0.F_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, cuh.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == cuh.c.b) {
            $$1.b($$2, cwl.fu.o());
            $$1.a(null, dnk.c, $$2);
         } else if ($$3 == cuh.c.c) {
            $$1.b($$2, cwl.fw.o());
            $$1.a(null, dnk.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(eej $$0) {
      return true;
   }

   @Override
   protected void a(dja $$0, cti $$1, hx $$2, eej $$3) {
      if ($$3 == eel.c) {
         dja $$4 = cwl.fu.o();
         $$1.b($$2, $$4);
         $$1.a(dnk.c, $$2, dnk.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == eel.e) {
         dja $$5 = cwl.fv.o();
         $$1.b($$2, $$5);
         $$1.a(dnk.c, $$2, dnk.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
