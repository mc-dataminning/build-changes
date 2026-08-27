import com.google.common.collect.ImmutableMap;

public class bqx<E extends boz & cet, T extends box> extends bqp<E> {
   private static final int c = 1200;
   private int d;
   private bqx.a e = bqx.a.a;

   public bqx() {
      super(ImmutableMap.of(bya.n, byb.c, bya.o, byb.a), 1200);
   }

   protected boolean a(apa $$0, E $$1) {
      box $$2 = b($$1);
      return $$1.b(cpt.vP) && bqr.b($$1, $$2) && bqr.a($$1, $$2, 0);
   }

   protected boolean a(apa $$0, E $$1, long $$2) {
      return $$1.dM().a(bya.o) && this.a($$0, $$1);
   }

   protected void b(apa $$0, E $$1, long $$2) {
      box $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(apa $$0, E $$1, long $$2) {
      if ($$1.fp()) {
         $$1.fv();
      }

      if ($$1.b(cpt.vP)) {
         $$1.b(false);
         coa.a($$1.fr(), false);
      }
   }

   private void a(E $$0, box $$1) {
      if (this.e == bqx.a.a) {
         $$0.c(ciu.a($$0, cpt.vP));
         this.e = bqx.a.b;
         $$0.b(true);
      } else if (this.e == bqx.a.b) {
         if (!$$0.fp()) {
            this.e = bqx.a.a;
         }

         int $$2 = $$0.ft();
         cpq $$3 = $$0.fr();
         if ($$2 >= coa.k($$3)) {
            $$0.fu();
            this.e = bqx.a.c;
            this.d = 20 + $$0.ef().a(20);
            $$0.b(false);
         }
      } else if (this.e == bqx.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bqx.a.d;
         }
      } else if (this.e == bqx.a.d) {
         $$0.a($$1, 1.0F);
         cpq $$4 = $$0.b(ciu.a($$0, cpt.vP));
         coa.a($$4, false);
         this.e = bqx.a.a;
      }
   }

   private void b(boz $$0, box $$1) {
      $$0.dM().a(bya.n, new bra($$1, true));
   }

   private static box b(box $$0) {
      return $$0.dM().c(bya.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
