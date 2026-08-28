import com.google.common.collect.ImmutableMap;

public class bvl<E extends btm & cjl, T extends btk> extends bvd<E> {
   private static final int c = 1200;
   private int d;
   private bvl.a e = bvl.a.a;

   public bvl() {
      super(ImmutableMap.of(cco.n, ccp.c, cco.o, ccp.a), 1200);
   }

   protected boolean a(arb $$0, E $$1) {
      btk $$2 = b($$1);
      return $$1.b(cun.vT) && bvf.b($$1, $$2) && bvf.a($$1, $$2, 0);
   }

   protected boolean a(arb $$0, E $$1, long $$2) {
      return $$1.dS().a(cco.o) && this.a($$0, $$1);
   }

   protected void b(arb $$0, E $$1, long $$2) {
      btk $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(arb $$0, E $$1, long $$2) {
      if ($$1.fv()) {
         $$1.fB();
      }

      if ($$1.b(cun.vT)) {
         $$1.b(false);
         $$1.fx().b(km.D, cwy.a);
      }
   }

   private void a(E $$0, btk $$1) {
      if (this.e == bvl.a.a) {
         $$0.c(cnm.a($$0, cun.vT));
         this.e = bvl.a.b;
         $$0.b(true);
      } else if (this.e == bvl.a.b) {
         if (!$$0.fv()) {
            this.e = bvl.a.a;
         }

         int $$2 = $$0.fz();
         cuk $$3 = $$0.fx();
         if ($$2 >= csx.l($$3)) {
            $$0.fA();
            this.e = bvl.a.c;
            this.d = 20 + $$0.el().a(20);
            $$0.b(false);
         }
      } else if (this.e == bvl.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bvl.a.d;
         }
      } else if (this.e == bvl.a.d) {
         $$0.a($$1, 1.0F);
         this.e = bvl.a.a;
      }
   }

   private void b(btm $$0, btk $$1) {
      $$0.dS().a(cco.n, new bvo($$1, true));
   }

   private static btk b(btk $$0) {
      return $$0.dS().c(cco.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
