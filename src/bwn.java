import com.google.common.collect.ImmutableMap;

public class bwn<E extends bup & ckq, T extends bun> extends bwf<E> {
   private static final int c = 1200;
   private int d;
   private bwn.a e = bwn.a.a;

   public bwn() {
      super(ImmutableMap.of(cdq.n, cdr.c, cdq.o, cdr.a), 1200);
   }

   protected boolean a(arj $$0, E $$1) {
      bun $$2 = b($$1);
      return $$1.b(cvw.vX) && bwh.b($$1, $$2) && bwh.a($$1, $$2, 0);
   }

   protected boolean a(arj $$0, E $$1, long $$2) {
      return $$1.dY().a(cdq.o) && this.a($$0, $$1);
   }

   protected void b(arj $$0, E $$1, long $$2) {
      bun $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(arj $$0, E $$1, long $$2) {
      if ($$1.fv()) {
         $$1.fB();
      }

      if ($$1.b(cvw.vX)) {
         $$1.b(false);
         $$1.fx().b(ks.J, cyd.a);
      }
   }

   private void a(E $$0, bun $$1) {
      if (this.e == bwn.a.a) {
         $$0.c(cot.a($$0, cvw.vX));
         this.e = bwn.a.b;
         $$0.b(true);
      } else if (this.e == bwn.a.b) {
         if (!$$0.fv()) {
            this.e = bwn.a.a;
         }

         int $$2 = $$0.fz();
         cvs $$3 = $$0.fx();
         if ($$2 >= cug.b($$3, $$0)) {
            $$0.fA();
            this.e = bwn.a.c;
            this.d = 20 + $$0.dV().a(20);
            $$0.b(false);
         }
      } else if (this.e == bwn.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bwn.a.d;
         }
      } else if (this.e == bwn.a.d) {
         $$0.a($$1, 1.0F);
         this.e = bwn.a.a;
      }
   }

   private void b(bup $$0, bun $$1) {
      $$0.dY().a(cdq.n, new bwq($$1, true));
   }

   private static bun b(bun $$0) {
      return $$0.dY().c(cdq.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
