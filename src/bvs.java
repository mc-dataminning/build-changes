import com.google.common.collect.ImmutableMap;

public class bvs<E extends btt & cjs, T extends btr> extends bvk<E> {
   private static final int c = 1200;
   private int d;
   private bvs.a e = bvs.a.a;

   public bvs() {
      super(ImmutableMap.of(ccv.n, ccw.c, ccv.o, ccw.a), 1200);
   }

   protected boolean a(arf $$0, E $$1) {
      btr $$2 = b($$1);
      return $$1.b(cuu.vT) && bvm.b($$1, $$2) && bvm.a($$1, $$2, 0);
   }

   protected boolean a(arf $$0, E $$1, long $$2) {
      return $$1.dS().a(ccv.o) && this.a($$0, $$1);
   }

   protected void b(arf $$0, E $$1, long $$2) {
      btr $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(arf $$0, E $$1, long $$2) {
      if ($$1.fv()) {
         $$1.fB();
      }

      if ($$1.b(cuu.vT)) {
         $$1.b(false);
         $$1.fx().b(km.E, cxf.a);
      }
   }

   private void a(E $$0, btr $$1) {
      if (this.e == bvs.a.a) {
         $$0.c(cnt.a($$0, cuu.vT));
         this.e = bvs.a.b;
         $$0.b(true);
      } else if (this.e == bvs.a.b) {
         if (!$$0.fv()) {
            this.e = bvs.a.a;
         }

         int $$2 = $$0.fz();
         cur $$3 = $$0.fx();
         if ($$2 >= cte.l($$3)) {
            $$0.fA();
            this.e = bvs.a.c;
            this.d = 20 + $$0.el().a(20);
            $$0.b(false);
         }
      } else if (this.e == bvs.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bvs.a.d;
         }
      } else if (this.e == bvs.a.d) {
         $$0.a($$1, 1.0F);
         this.e = bvs.a.a;
      }
   }

   private void b(btt $$0, btr $$1) {
      $$0.dS().a(ccv.n, new bvv($$1, true));
   }

   private static btr b(btr $$0) {
      return $$0.dS().c(ccv.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
