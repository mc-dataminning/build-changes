import com.google.common.collect.ImmutableMap;

public class byg<E extends bwh & cmj, T extends bwf> extends bxy<E> {
   private static final int c = 1200;
   private int d;
   private byg.a e = byg.a.a;

   public byg() {
      super(ImmutableMap.of(cfj.n, cfk.c, cfj.o, cfk.a), 1200);
   }

   protected boolean a(ash $$0, E $$1) {
      bwf $$2 = b($$1);
      return $$1.b(cxs.wL) && bya.b($$1, $$2) && bya.a($$1, $$2, 0);
   }

   protected boolean a(ash $$0, E $$1, long $$2) {
      return $$1.ec().a(cfj.o) && this.a($$0, $$1);
   }

   protected void b(ash $$0, E $$1, long $$2) {
      bwf $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(ash $$0, E $$1, long $$2) {
      if ($$1.fz()) {
         $$1.fF();
      }

      if ($$1.b(cxs.wL)) {
         $$1.b(false);
         $$1.fB().b(ku.O, czt.a);
      }
   }

   private void a(E $$0, bwf $$1) {
      if (this.e == byg.a.a) {
         $$0.c(cqr.a($$0, cxs.wL));
         this.e = byg.a.b;
         $$0.b(true);
      } else if (this.e == byg.a.b) {
         if (!$$0.fz()) {
            this.e = byg.a.a;
         }

         int $$2 = $$0.fD();
         cxo $$3 = $$0.fB();
         if ($$2 >= cwf.b($$3, $$0)) {
            $$0.fE();
            this.e = byg.a.c;
            this.d = 20 + $$0.dZ().a(20);
            $$0.b(false);
         }
      } else if (this.e == byg.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = byg.a.d;
         }
      } else if (this.e == byg.a.d) {
         $$0.a($$1, 1.0F);
         this.e = byg.a.a;
      }
   }

   private void b(bwh $$0, bwf $$1) {
      $$0.ec().a(cfj.n, new byj($$1, true));
   }

   private static bwf b(bwf $$0) {
      return $$0.ec().c(cfj.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
