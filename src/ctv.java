import java.util.List;

public class ctv extends ctl {
   public ctv(ctl.a $$0) {
      super($$0);
   }

   @Override
   public bpw a(cxd $$0) {
      daz $$1 = $$0.q();
      io $$2 = $$0.a();
      drd $$3 = $$1.a_($$2);
      if ($$3.a(avx.S)) {
         cly $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return bpw.a($$1.B);
      } else {
         return bpw.d;
      }
   }

   public static bpw a(cly $$0, daz $$1, io $$2) {
      cic $$3 = null;
      double $$4 = 7.0;
      int $$5 = $$2.u();
      int $$6 = $$2.v();
      int $$7 = $$2.w();
      euh $$8 = new euh((double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0);
      List<bss> $$9 = $$1.a(bss.class, $$8, $$1x -> $$1x.ge() == $$0);

      for (bss $$10 : $$9) {
         if ($$3 == null) {
            $$3 = cic.b($$1, $$2);
            $$3.C();
         }

         $$10.b($$3, true);
      }

      if (!$$9.isEmpty()) {
         $$1.a(dvw.b, $$2, dvw.a.a($$0));
         return bpw.a;
      } else {
         return bpw.d;
      }
   }
}
