import java.util.List;

public class czd extends czw {
   public czd(czw.a $$0) {
      super($$0);
   }

   @Override
   public but a(ddv $$0) {
      djz $$1 = $$0.q();
      iw $$2 = $$0.a();
      ebg $$3 = $$1.a_($$2);
      if (!$$3.a(dng.cy) && !$$3.a(dng.I)) {
         return but.d;
      } else {
         iw $$4 = $$2.d();
         if (!$$1.v($$4)) {
            return but.d;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bwv> $$8 = $$1.a_(null, new ffn($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return but.d;
            } else {
               if ($$1 instanceof aru) {
                  cmw $$9 = new cmw($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), egg.t, $$4);
                  efg $$10 = ((aru)$$1).F();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return but.a;
            }
         }
      }
   }
}
