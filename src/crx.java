import java.util.List;

public class crx extends crn {
   public crx(crn.a $$0) {
      super($$0);
   }

   @Override
   public bof a(cuz $$0) {
      czg $$1 = $$0.q();
      id $$2 = $$0.a();
      dpi $$3 = $$1.a_($$2);
      if ($$3.a(ave.S)) {
         cka $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return bof.a($$1.B);
      } else {
         return bof.d;
      }
   }

   public static bof a(cka $$0, czg $$1, id $$2) {
      cge $$3 = null;
      double $$4 = 7.0;
      int $$5 = $$2.u();
      int $$6 = $$2.v();
      int $$7 = $$2.w();
      ese $$8 = new ese((double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0);
      List<bqv> $$9 = $$1.a(bqv.class, $$8, $$1x -> $$1x.gc() == $$0);

      for (bqv $$10 : $$9) {
         if ($$3 == null) {
            $$3 = cge.b($$1, $$2);
            $$3.C();
         }

         $$10.b($$3, true);
      }

      if (!$$9.isEmpty()) {
         $$1.a(dub.b, $$2, dub.a.a($$0));
         return bof.a;
      } else {
         return bof.d;
      }
   }
}
