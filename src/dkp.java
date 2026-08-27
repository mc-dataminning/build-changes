import com.mojang.serialization.MapCodec;

public class dkp extends dfc implements dff {
   public static final MapCodec<dkp> a = b(dkp::new);

   @Override
   public MapCodec<dkp> a() {
      return a;
   }

   public dkp(dtb.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcd $$0, ir $$1, dtc $$2) {
      if (!$$0.a_($$1.c()).a((dbg)$$0, $$1)) {
         return false;
      } else {
         for (ir $$3 : ir.c($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(awe.aN)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dca $$0, ayt $$1, ir $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayt $$1, ir $$2, dtc $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (ir $$6 : ir.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dtc $$7 = $$0.a_($$6);
         if ($$7.a(dfe.pn)) {
            $$5 = true;
         }

         if ($$7.a(dfe.pw)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dfe.pn.n() : dfe.pw.n(), 3);
      } else if ($$5) {
         $$0.a($$2, dfe.pn.n(), 3);
      } else if ($$4) {
         $$0.a($$2, dfe.pw.n(), 3);
      }
   }

   @Override
   public dff.a aq_() {
      return dff.a.a;
   }
}
