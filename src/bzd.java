import com.google.common.collect.ImmutableMap;

public class bzd<E extends bxg & cnq, T extends bxe> extends byv<E> {
   private static final int c = 1200;
   private int d;
   private bzd.a e = bzd.a.a;

   public bzd() {
      super(ImmutableMap.of(cgg.o, cgh.c, cgg.p, cgh.a), 1200);
   }

   protected boolean a(arq $$0, E $$1) {
      bxe $$2 = b($$1);
      return $$1.b(czh.xg) && byx.b($$1, $$2) && byx.a($$1, $$2, 0);
   }

   protected boolean a(arq $$0, E $$1, long $$2) {
      return $$1.ec().a(cgg.p) && this.a($$0, $$1);
   }

   protected void b(arq $$0, E $$1, long $$2) {
      bxe $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(arq $$0, E $$1, long $$2) {
      if ($$1.fz()) {
         $$1.fF();
      }

      if ($$1.b(czh.xg)) {
         $$1.b(false);
         $$1.fB().b(kj.P, dbh.a);
      }
   }

   private void a(E $$0, bxe $$1) {
      if (this.e == bzd.a.a) {
         $$0.c(crz.a($$0, czh.xg));
         this.e = bzd.a.b;
         $$0.b(true);
      } else if (this.e == bzd.a.b) {
         if (!$$0.fz()) {
            this.e = bzd.a.a;
         }

         int $$2 = $$0.fD();
         czd $$3 = $$0.fB();
         if ($$2 >= cxw.b($$3, $$0)) {
            $$0.fE();
            this.e = bzd.a.c;
            this.d = 20 + $$0.dY().a(20);
            $$0.b(false);
         }
      } else if (this.e == bzd.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bzd.a.d;
         }
      } else if (this.e == bzd.a.d) {
         $$0.a($$1, 1.0F);
         this.e = bzd.a.a;
      }
   }

   private void b(bxg $$0, bxe $$1) {
      $$0.ec().a(cgg.o, new bzg($$1, true));
   }

   private static bxe b(bxe $$0) {
      return $$0.ec().c(cgg.p).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
