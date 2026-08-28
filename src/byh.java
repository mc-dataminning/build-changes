import com.google.common.collect.ImmutableMap;

public class byh<E extends bwi & cmk, T extends bwg> extends bxz<E> {
   private static final int c = 1200;
   private int d;
   private byh.a e = byh.a.a;

   public byh() {
      super(ImmutableMap.of(cfk.n, cfl.c, cfk.o, cfl.a), 1200);
   }

   protected boolean a(ash $$0, E $$1) {
      bwg $$2 = b($$1);
      return $$1.b(cxt.wL) && byb.b($$1, $$2) && byb.a($$1, $$2, 0);
   }

   protected boolean a(ash $$0, E $$1, long $$2) {
      return $$1.ec().a(cfk.o) && this.a($$0, $$1);
   }

   protected void b(ash $$0, E $$1, long $$2) {
      bwg $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(ash $$0, E $$1, long $$2) {
      if ($$1.fz()) {
         $$1.fF();
      }

      if ($$1.b(cxt.wL)) {
         $$1.b(false);
         $$1.fB().b(ku.O, czu.a);
      }
   }

   private void a(E $$0, bwg $$1) {
      if (this.e == byh.a.a) {
         $$0.c(cqs.a($$0, cxt.wL));
         this.e = byh.a.b;
         $$0.b(true);
      } else if (this.e == byh.a.b) {
         if (!$$0.fz()) {
            this.e = byh.a.a;
         }

         int $$2 = $$0.fD();
         cxp $$3 = $$0.fB();
         if ($$2 >= cwg.b($$3, $$0)) {
            $$0.fE();
            this.e = byh.a.c;
            this.d = 20 + $$0.dZ().a(20);
            $$0.b(false);
         }
      } else if (this.e == byh.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = byh.a.d;
         }
      } else if (this.e == byh.a.d) {
         $$0.a($$1, 1.0F);
         this.e = byh.a.a;
      }
   }

   private void b(bwi $$0, bwg $$1) {
      $$0.ec().a(cfk.n, new byk($$1, true));
   }

   private static bwg b(bwg $$0) {
      return $$0.ec().c(cfk.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
