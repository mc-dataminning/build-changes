import com.mojang.serialization.MapCodec;

public class dgt extends der {
   public static final MapCodec<dgt> d = b(dgt::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<dgt> a() {
      return d;
   }

   public dgt(dtb.d $$0) {
      super($$0, kj.c);
   }

   @Override
   public boolean d(dtc $$0) {
      return false;
   }

   protected static boolean a(dcw $$0, ddw.c $$1) {
      if ($$1 == ddw.c.b) {
         return $$0.E_().i() < 0.05F;
      } else {
         return $$1 == ddw.c.c ? $$0.E_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dtc $$0, dcw $$1, jd $$2, ddw.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == ddw.c.b) {
            $$1.b($$2, dga.fu.o());
            $$1.a(null, dxz.c, $$2);
         } else if ($$3 == ddw.c.c) {
            $$1.b($$2, dga.fw.o());
            $$1.a(null, dxz.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(epb $$0) {
      return true;
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, epb $$3) {
      if ($$3 == epd.c) {
         dtc $$4 = dga.fu.o();
         $$1.b($$2, $$4);
         $$1.a(dxz.c, $$2, dxz.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == epd.e) {
         dtc $$5 = dga.fv.o();
         $$1.b($$2, $$5);
         $$1.a(dxz.c, $$2, dxz.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
