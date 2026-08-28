import com.google.common.collect.ImmutableMap;

public class bww<E extends bux & ckz, T extends buv> extends bwo<E> {
   private static final int c = 1200;
   private int d;
   private bww.a e = bww.a.a;

   public bww() {
      super(ImmutableMap.of(cdz.n, cea.c, cdz.o, cea.a), 1200);
   }

   protected boolean a(arm $$0, E $$1) {
      buv $$2 = b($$1);
      return $$1.b(cwb.vX) && bwq.b($$1, $$2) && bwq.a($$1, $$2, 0);
   }

   protected boolean a(arm $$0, E $$1, long $$2) {
      return $$1.ed().a(cdz.o) && this.a($$0, $$1);
   }

   protected void b(arm $$0, E $$1, long $$2) {
      buv $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(arm $$0, E $$1, long $$2) {
      if ($$1.fB()) {
         $$1.fH();
      }

      if ($$1.b(cwb.vX)) {
         $$1.b(false);
         $$1.fD().b(kt.N, cyc.a);
      }
   }

   private void a(E $$0, buv $$1) {
      if (this.e == bww.a.a) {
         $$0.c(cpd.a($$0, cwb.vX));
         this.e = bww.a.b;
         $$0.b(true);
      } else if (this.e == bww.a.b) {
         if (!$$0.fB()) {
            this.e = bww.a.a;
         }

         int $$2 = $$0.fF();
         cvx $$3 = $$0.fD();
         if ($$2 >= cuo.b($$3, $$0)) {
            $$0.fG();
            this.e = bww.a.c;
            this.d = 20 + $$0.ea().a(20);
            $$0.b(false);
         }
      } else if (this.e == bww.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bww.a.d;
         }
      } else if (this.e == bww.a.d) {
         $$0.a($$1, 1.0F);
         this.e = bww.a.a;
      }
   }

   private void b(bux $$0, buv $$1) {
      $$0.ed().a(cdz.n, new bwz($$1, true));
   }

   private static buv b(buv $$0) {
      return $$0.ed().c(cdz.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
