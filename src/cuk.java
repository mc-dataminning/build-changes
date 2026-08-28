import java.util.List;

public class cuk extends cvg {
   public cuk(cvg.a $$0) {
      super($$0);
   }

   @Override
   public brk a(cyy $$0) {
      dds $$1 = $$0.q();
      je $$2 = $$0.a();
      dua $$3 = $$1.a_($$2);
      if (!$$3.a(dgx.co) && !$$3.a(dgx.F)) {
         return brk.d;
      } else {
         je $$4 = $$2.d();
         if (!$$1.u($$4)) {
            return brk.d;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<btj> $$8 = $$1.a_(null, new exz($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return brk.d;
            } else {
               if ($$1 instanceof arg) {
                  cir $$9 = new cir($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), dyx.t, $$4);
                  dxz $$10 = ((arg)$$1).D();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return brk.a;
            }
         }
      }
   }
}
