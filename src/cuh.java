import java.util.List;

public class cuh extends ctx {
   public cuh(ctx.a $$0) {
      super($$0);
   }

   @Override
   public bqg a(cxo $$0) {
      dcf $$1 = $$0.q();
      ja $$2 = $$0.a();
      dsk $$3 = $$1.a_($$2);
      if ($$3.a(avw.S)) {
         cmk $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return bqg.a($$1.B);
      } else {
         return bqg.e;
      }
   }

   public static bqg a(cmk $$0, dcf $$1, ja $$2) {
      cio $$3 = null;
      double $$4 = 7.0;
      int $$5 = $$2.u();
      int $$6 = $$2.v();
      int $$7 = $$2.w();
      ewa $$8 = new ewa((double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0);
      List<btd> $$9 = $$1.a(btd.class, $$8, $$1x -> $$1x.gc() == $$0);

      for (btd $$10 : $$9) {
         if ($$3 == null) {
            $$3 = cio.b($$1, $$2);
            $$3.v();
         }

         $$10.b($$3, true);
      }

      if (!$$9.isEmpty()) {
         $$1.a(dxg.b, $$2, dxg.a.a($$0));
         return bqg.a;
      } else {
         return bqg.e;
      }
   }
}
