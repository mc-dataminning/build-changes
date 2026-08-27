import com.google.common.collect.ImmutableMap;

public class bua<E extends bsc & cia, T extends bsa> extends bts<E> {
   private static final int c = 1200;
   private int d;
   private bua.a e = bua.a.a;

   public bua() {
      super(ImmutableMap.of(cbd.n, cbe.c, cbd.o, cbe.a), 1200);
   }

   protected boolean a(aqh $$0, E $$1) {
      bsa $$2 = b($$1);
      return $$1.b(ctc.vT) && btu.b($$1, $$2) && btu.a($$1, $$2, 0);
   }

   protected boolean a(aqh $$0, E $$1, long $$2) {
      return $$1.dQ().a(cbd.o) && this.a($$0, $$1);
   }

   protected void b(aqh $$0, E $$1, long $$2) {
      bsa $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(aqh $$0, E $$1, long $$2) {
      if ($$1.ft()) {
         $$1.fz();
      }

      if ($$1.b(ctc.vT)) {
         $$1.b(false);
         $$1.fv().b(ka.C, cvl.a);
      }
   }

   private void a(E $$0, bsa $$1) {
      if (this.e == bua.a.a) {
         $$0.c(cmb.a($$0, ctc.vT));
         this.e = bua.a.b;
         $$0.b(true);
      } else if (this.e == bua.a.b) {
         if (!$$0.ft()) {
            this.e = bua.a.a;
         }

         int $$2 = $$0.fx();
         csz $$3 = $$0.fv();
         if ($$2 >= crm.l($$3)) {
            $$0.fy();
            this.e = bua.a.c;
            this.d = 20 + $$0.ej().a(20);
            $$0.b(false);
         }
      } else if (this.e == bua.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bua.a.d;
         }
      } else if (this.e == bua.a.d) {
         $$0.a($$1, 1.0F);
         this.e = bua.a.a;
      }
   }

   private void b(bsc $$0, bsa $$1) {
      $$0.dQ().a(cbd.n, new bud($$1, true));
   }

   private static bsa b(bsa $$0) {
      return $$0.dQ().c(cbd.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
