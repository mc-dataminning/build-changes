import com.google.common.collect.ImmutableMap;

public class bzv<E extends bxy & coo, T extends bxw> extends bzn<E> {
   private static final int c = 1200;
   private int d;
   private bzv.a e = bzv.a.a;

   public bzv() {
      super(ImmutableMap.of(cgy.o, cgz.c, cgy.p, cgz.a), 1200);
   }

   protected boolean a(aru $$0, E $$1) {
      bxw $$2 = b($$1);
      return $$1.b(dae.xg) && bzp.b($$1, $$2) && bzp.a($$1, $$2, 0);
   }

   protected boolean a(aru $$0, E $$1, long $$2) {
      return $$1.ec().a(cgy.p) && this.a($$0, $$1);
   }

   protected void b(aru $$0, E $$1, long $$2) {
      bxw $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(aru $$0, E $$1, long $$2) {
      if ($$1.fz()) {
         $$1.fF();
      }

      if ($$1.b(dae.xg)) {
         $$1.b(false);
         $$1.fB().b(kl.P, dce.a);
      }
   }

   private void a(E $$0, bxw $$1) {
      if (this.e == bzv.a.a) {
         $$0.c(csw.a($$0, dae.xg));
         this.e = bzv.a.b;
         $$0.b(true);
      } else if (this.e == bzv.a.b) {
         if (!$$0.fz()) {
            this.e = bzv.a.a;
         }

         int $$2 = $$0.fD();
         daa $$3 = $$0.fB();
         if ($$2 >= cyt.b($$3, $$0)) {
            $$0.fE();
            this.e = bzv.a.c;
            this.d = 20 + $$0.dY().a(20);
            $$0.b(false);
         }
      } else if (this.e == bzv.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bzv.a.d;
         }
      } else if (this.e == bzv.a.d) {
         $$0.a($$1, 1.0F);
         this.e = bzv.a.a;
      }
   }

   private void b(bxy $$0, bxw $$1) {
      $$0.ec().a(cgy.o, new bzy($$1, true));
   }

   private static bxw b(bxw $$0) {
      return $$0.ec().c(cgy.p).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
