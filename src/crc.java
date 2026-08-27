import java.util.List;

public class crc extends cry {
   public crc(cry.a $$0) {
      super($$0);
   }

   @Override
   public boq a(cvn $$0) {
      czu $$1 = $$0.q();
      im $$2 = $$0.a();
      dpy $$3 = $$1.a_($$2);
      if (!$$3.a(dcx.co) && !$$3.a(dcx.F)) {
         return boq.e;
      } else {
         im $$4 = $$2.c();
         if (!$$1.u($$4)) {
            return boq.e;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bql> $$8 = $$1.a_(null, new eta($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return boq.e;
            } else {
               if ($$1 instanceof aqe) {
                  cfo $$9 = new cfo($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), dur.t, $$4);
                  dtt $$10 = ((aqe)$$1).D();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().g(1);
               return boq.a($$1.B);
            }
         }
      }
   }
}
