import com.google.common.collect.ImmutableMap;

public class bro<E extends bpq & cfl, T extends bpo> extends brg<E> {
   private static final int c = 1200;
   private int d;
   private bro.a e = bro.a.a;

   public bro() {
      super(ImmutableMap.of(byr.n, bys.c, byr.o, bys.a), 1200);
   }

   protected boolean a(apf $$0, E $$1) {
      bpo $$2 = b($$1);
      return $$1.b(cqn.vQ) && bri.b($$1, $$2) && bri.a($$1, $$2, 0);
   }

   protected boolean a(apf $$0, E $$1, long $$2) {
      return $$1.dP().a(byr.o) && this.a($$0, $$1);
   }

   protected void b(apf $$0, E $$1, long $$2) {
      bpo $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(apf $$0, E $$1, long $$2) {
      if ($$1.fs()) {
         $$1.fy();
      }

      if ($$1.b(cqn.vQ)) {
         $$1.b(false);
         cov.a($$1.fu(), false);
      }
   }

   private void a(E $$0, bpo $$1) {
      if (this.e == bro.a.a) {
         $$0.c(cjm.a($$0, cqn.vQ));
         this.e = bro.a.b;
         $$0.b(true);
      } else if (this.e == bro.a.b) {
         if (!$$0.fs()) {
            this.e = bro.a.a;
         }

         int $$2 = $$0.fw();
         cqk $$3 = $$0.fu();
         if ($$2 >= cov.k($$3)) {
            $$0.fx();
            this.e = bro.a.c;
            this.d = 20 + $$0.ei().a(20);
            $$0.b(false);
         }
      } else if (this.e == bro.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bro.a.d;
         }
      } else if (this.e == bro.a.d) {
         $$0.a($$1, 1.0F);
         cqk $$4 = $$0.b(cjm.a($$0, cqn.vQ));
         cov.a($$4, false);
         this.e = bro.a.a;
      }
   }

   private void b(bpq $$0, bpo $$1) {
      $$0.dP().a(byr.n, new brr($$1, true));
   }

   private static bpo b(bpo $$0) {
      return $$0.dP().c(byr.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
