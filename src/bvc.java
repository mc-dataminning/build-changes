import com.google.common.collect.ImmutableMap;

public class bvc<E extends btd & cjd, T extends btb> extends buu<E> {
   private static final int c = 1200;
   private int d;
   private bvc.a e = bvc.a.a;

   public bvc() {
      super(ImmutableMap.of(ccf.n, ccg.c, ccf.o, ccg.a), 1200);
   }

   protected boolean a(aqm $$0, E $$1) {
      btb $$2 = b($$1);
      return $$1.b(cuf.vW) && buw.b($$1, $$2) && buw.a($$1, $$2, 0);
   }

   protected boolean a(aqm $$0, E $$1, long $$2) {
      return $$1.dU().a(ccf.o) && this.a($$0, $$1);
   }

   protected void b(aqm $$0, E $$1, long $$2) {
      btb $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(aqm $$0, E $$1, long $$2) {
      if ($$1.fs()) {
         $$1.fy();
      }

      if ($$1.b(cuf.vW)) {
         $$1.b(false);
         $$1.fu().b(kn.E, cwp.a);
      }
   }

   private void a(E $$0, btb $$1) {
      if (this.e == bvc.a.a) {
         $$0.c(cne.a($$0, cuf.vW));
         this.e = bvc.a.b;
         $$0.b(true);
      } else if (this.e == bvc.a.b) {
         if (!$$0.fs()) {
            this.e = bvc.a.a;
         }

         int $$2 = $$0.fw();
         cuc $$3 = $$0.fu();
         if ($$2 >= csp.a($$0)) {
            $$0.fx();
            this.e = bvc.a.c;
            this.d = 20 + $$0.dT().a(20);
            $$0.b(false);
         }
      } else if (this.e == bvc.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bvc.a.d;
         }
      } else if (this.e == bvc.a.d) {
         $$0.a($$1, 1.0F);
         this.e = bvc.a.a;
      }
   }

   private void b(btd $$0, btb $$1) {
      $$0.dU().a(ccf.n, new bvf($$1, true));
   }

   private static btb b(btb $$0) {
      return $$0.dU().c(ccf.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
