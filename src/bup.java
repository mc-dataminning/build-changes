import com.google.common.collect.ImmutableMap;

public class bup<E extends bsq & cip, T extends bso> extends buh<E> {
   private static final int c = 1200;
   private int d;
   private bup.a e = bup.a.a;

   public bup() {
      super(ImmutableMap.of(cbs.n, cbt.c, cbs.o, cbt.a), 1200);
   }

   protected boolean a(aqm $$0, E $$1) {
      bso $$2 = b($$1);
      return $$1.b(ctr.vT) && buj.b($$1, $$2) && buj.a($$1, $$2, 0);
   }

   protected boolean a(aqm $$0, E $$1, long $$2) {
      return $$1.dS().a(cbs.o) && this.a($$0, $$1);
   }

   protected void b(aqm $$0, E $$1, long $$2) {
      bso $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(aqm $$0, E $$1, long $$2) {
      if ($$1.fv()) {
         $$1.fB();
      }

      if ($$1.b(ctr.vT)) {
         $$1.b(false);
         $$1.fx().b(kb.D, cwc.a);
      }
   }

   private void a(E $$0, bso $$1) {
      if (this.e == bup.a.a) {
         $$0.c(cmq.a($$0, ctr.vT));
         this.e = bup.a.b;
         $$0.b(true);
      } else if (this.e == bup.a.b) {
         if (!$$0.fv()) {
            this.e = bup.a.a;
         }

         int $$2 = $$0.fz();
         cto $$3 = $$0.fx();
         if ($$2 >= csb.l($$3)) {
            $$0.fA();
            this.e = bup.a.c;
            this.d = 20 + $$0.el().a(20);
            $$0.b(false);
         }
      } else if (this.e == bup.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bup.a.d;
         }
      } else if (this.e == bup.a.d) {
         $$0.a($$1, 1.0F);
         this.e = bup.a.a;
      }
   }

   private void b(bsq $$0, bso $$1) {
      $$0.dS().a(cbs.n, new bus($$1, true));
   }

   private static bso b(bso $$0) {
      return $$0.dS().c(cbs.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
