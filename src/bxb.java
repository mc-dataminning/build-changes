import com.google.common.collect.ImmutableMap;

public class bxb<E extends bvc & cle, T extends bva> extends bwt<E> {
   private static final int c = 1200;
   private int d;
   private bxb.a e = bxb.a.a;

   public bxb() {
      super(ImmutableMap.of(cee.n, cef.c, cee.o, cef.a), 1200);
   }

   protected boolean a(arn $$0, E $$1) {
      bva $$2 = b($$1);
      return $$1.b(cwf.vX) && bwv.b($$1, $$2) && bwv.a($$1, $$2, 0);
   }

   protected boolean a(arn $$0, E $$1, long $$2) {
      return $$1.ed().a(cee.o) && this.a($$0, $$1);
   }

   protected void b(arn $$0, E $$1, long $$2) {
      bva $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(arn $$0, E $$1, long $$2) {
      if ($$1.fB()) {
         $$1.fH();
      }

      if ($$1.b(cwf.vX)) {
         $$1.b(false);
         $$1.fD().b(ku.O, cyg.a);
      }
   }

   private void a(E $$0, bva $$1) {
      if (this.e == bxb.a.a) {
         $$0.c(cpi.a($$0, cwf.vX));
         this.e = bxb.a.b;
         $$0.b(true);
      } else if (this.e == bxb.a.b) {
         if (!$$0.fB()) {
            this.e = bxb.a.a;
         }

         int $$2 = $$0.fF();
         cwb $$3 = $$0.fD();
         if ($$2 >= cus.b($$3, $$0)) {
            $$0.fG();
            this.e = bxb.a.c;
            this.d = 20 + $$0.ea().a(20);
            $$0.b(false);
         }
      } else if (this.e == bxb.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bxb.a.d;
         }
      } else if (this.e == bxb.a.d) {
         $$0.a($$1, 1.0F);
         this.e = bxb.a.a;
      }
   }

   private void b(bvc $$0, bva $$1) {
      $$0.ed().a(cee.n, new bxe($$1, true));
   }

   private static bva b(bva $$0) {
      return $$0.ed().c(cee.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
