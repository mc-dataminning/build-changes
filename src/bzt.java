import com.google.common.collect.ImmutableMap;

public class bzt<E extends bxw & col, T extends bxu> extends bzl<E> {
   private static final int c = 1200;
   private int d;
   private bzt.a e = bzt.a.a;

   public bzt() {
      super(ImmutableMap.of(cgw.o, cgx.c, cgw.p, cgx.a), 1200);
   }

   protected boolean a(ars $$0, E $$1) {
      bxu $$2 = b($$1);
      return $$1.b(dac.xg) && bzn.b($$1, $$2) && bzn.a($$1, $$2, 0);
   }

   protected boolean a(ars $$0, E $$1, long $$2) {
      return $$1.ec().a(cgw.p) && this.a($$0, $$1);
   }

   protected void b(ars $$0, E $$1, long $$2) {
      bxu $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(ars $$0, E $$1, long $$2) {
      if ($$1.fz()) {
         $$1.fF();
      }

      if ($$1.b(dac.xg)) {
         $$1.b(false);
         $$1.fB().b(kk.P, dcc.a);
      }
   }

   private void a(E $$0, bxu $$1) {
      if (this.e == bzt.a.a) {
         $$0.c(csu.a($$0, dac.xg));
         this.e = bzt.a.b;
         $$0.b(true);
      } else if (this.e == bzt.a.b) {
         if (!$$0.fz()) {
            this.e = bzt.a.a;
         }

         int $$2 = $$0.fD();
         czy $$3 = $$0.fB();
         if ($$2 >= cyr.b($$3, $$0)) {
            $$0.fE();
            this.e = bzt.a.c;
            this.d = 20 + $$0.dY().a(20);
            $$0.b(false);
         }
      } else if (this.e == bzt.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bzt.a.d;
         }
      } else if (this.e == bzt.a.d) {
         $$0.a($$1, 1.0F);
         this.e = bzt.a.a;
      }
   }

   private void b(bxw $$0, bxu $$1) {
      $$0.ec().a(cgw.o, new bzw($$1, true));
   }

   private static bxu b(bxu $$0) {
      return $$0.ec().c(cgw.p).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
