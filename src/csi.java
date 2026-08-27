import java.util.List;

public class csi extends cry {
   public csi(cry.a $$0) {
      super($$0);
   }

   @Override
   public boq a(cvn $$0) {
      czu $$1 = $$0.q();
      im $$2 = $$0.a();
      dpy $$3 = $$1.a_($$2);
      if ($$3.a(avo.S)) {
         ckl $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return boq.a($$1.B);
      } else {
         return boq.d;
      }
   }

   public static boq a(ckl $$0, czu $$1, im $$2) {
      cgp $$3 = null;
      double $$4 = 7.0;
      int $$5 = $$2.u();
      int $$6 = $$2.v();
      int $$7 = $$2.w();
      eta $$8 = new eta((double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0);
      List<brg> $$9 = $$1.a(brg.class, $$8, $$1x -> $$1x.ge() == $$0);

      for (brg $$10 : $$9) {
         if ($$3 == null) {
            $$3 = cgp.b($$1, $$2);
            $$3.C();
         }

         $$10.b($$3, true);
      }

      if (!$$9.isEmpty()) {
         $$1.a(dur.b, $$2, dur.a.a($$0));
         return boq.a;
      } else {
         return boq.d;
      }
   }
}
