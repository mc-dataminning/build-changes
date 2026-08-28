import java.util.List;

public class cut extends cuj {
   public cut(cuj.a $$0) {
      super($$0);
   }

   @Override
   public bqt a(cyb $$0) {
      dbx $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsb $$3 = $$1.a_($$2);
      if ($$3.a(awo.S)) {
         cmw $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return bqt.a($$1.B);
      } else {
         return bqt.e;
      }
   }

   public static bqt a(cmw $$0, dbx $$1, iz $$2) {
      cja $$3 = null;
      double $$4 = 7.0;
      int $$5 = $$2.u();
      int $$6 = $$2.v();
      int $$7 = $$2.w();
      evl $$8 = new evl((double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0);
      List<btq> $$9 = $$1.a(btq.class, $$8, $$1x -> $$1x.gf() == $$0);

      for (btq $$10 : $$9) {
         if ($$3 == null) {
            $$3 = cja.b($$1, $$2);
            $$3.C();
         }

         $$10.b($$3, true);
      }

      if (!$$9.isEmpty()) {
         $$1.a(dwu.b, $$2, dwu.a.a($$0));
         return bqt.a;
      } else {
         return bqt.e;
      }
   }
}
