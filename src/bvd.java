import com.google.common.collect.ImmutableMap;

public class bvd<E extends bte & cje, T extends btc> extends buv<E> {
   private static final int c = 1200;
   private int d;
   private bvd.a e = bvd.a.a;

   public bvd() {
      super(ImmutableMap.of(ccg.n, cch.c, ccg.o, cch.a), 1200);
   }

   protected boolean a(aqm $$0, E $$1) {
      btc $$2 = b($$1);
      return $$1.b(cug.vW) && bux.b($$1, $$2) && bux.a($$1, $$2, 0);
   }

   protected boolean a(aqm $$0, E $$1, long $$2) {
      return $$1.dV().a(ccg.o) && this.a($$0, $$1);
   }

   protected void b(aqm $$0, E $$1, long $$2) {
      btc $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(aqm $$0, E $$1, long $$2) {
      if ($$1.ft()) {
         $$1.fz();
      }

      if ($$1.b(cug.vW)) {
         $$1.b(false);
         $$1.fv().b(kn.E, cwq.a);
      }
   }

   private void a(E $$0, btc $$1) {
      if (this.e == bvd.a.a) {
         $$0.c(cnf.a($$0, cug.vW));
         this.e = bvd.a.b;
         $$0.b(true);
      } else if (this.e == bvd.a.b) {
         if (!$$0.ft()) {
            this.e = bvd.a.a;
         }

         int $$2 = $$0.fx();
         cud $$3 = $$0.fv();
         if ($$2 >= csq.a($$0)) {
            $$0.fy();
            this.e = bvd.a.c;
            this.d = 20 + $$0.dU().a(20);
            $$0.b(false);
         }
      } else if (this.e == bvd.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bvd.a.d;
         }
      } else if (this.e == bvd.a.d) {
         $$0.a($$1, 1.0F);
         this.e = bvd.a.a;
      }
   }

   private void b(bte $$0, btc $$1) {
      $$0.dV().a(ccg.n, new bvg($$1, true));
   }

   private static btc b(btc $$0) {
      return $$0.dV().c(ccg.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
