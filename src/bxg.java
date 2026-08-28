import com.google.common.collect.ImmutableMap;

public class bxg<E extends bvh & clj, T extends bvf> extends bwy<E> {
   private static final int c = 1200;
   private int d;
   private bxg.a e = bxg.a.a;

   public bxg() {
      super(ImmutableMap.of(cej.n, cek.c, cej.o, cek.a), 1200);
   }

   protected boolean a(arc $$0, E $$1) {
      bvf $$2 = b($$1);
      return $$1.b(cwr.wV) && bxa.b($$1, $$2) && bxa.a($$1, $$2, 0);
   }

   protected boolean a(arc $$0, E $$1, long $$2) {
      return $$1.ec().a(cej.o) && this.a($$0, $$1);
   }

   protected void b(arc $$0, E $$1, long $$2) {
      bvf $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(arc $$0, E $$1, long $$2) {
      if ($$1.fz()) {
         $$1.fF();
      }

      if ($$1.b(cwr.wV)) {
         $$1.b(false);
         $$1.fB().b(kv.O, cys.a);
      }
   }

   private void a(E $$0, bvf $$1) {
      if (this.e == bxg.a.a) {
         $$0.c(cpq.a($$0, cwr.wV));
         this.e = bxg.a.b;
         $$0.b(true);
      } else if (this.e == bxg.a.b) {
         if (!$$0.fz()) {
            this.e = bxg.a.a;
         }

         int $$2 = $$0.fD();
         cwn $$3 = $$0.fB();
         if ($$2 >= cve.b($$3, $$0)) {
            $$0.fE();
            this.e = bxg.a.c;
            this.d = 20 + $$0.dZ().a(20);
            $$0.b(false);
         }
      } else if (this.e == bxg.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bxg.a.d;
         }
      } else if (this.e == bxg.a.d) {
         $$0.a($$1, 1.0F);
         this.e = bxg.a.a;
      }
   }

   private void b(bvh $$0, bvf $$1) {
      $$0.ec().a(cej.n, new bxj($$1, true));
   }

   private static bvf b(bvf $$0) {
      return $$0.ec().c(cej.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
