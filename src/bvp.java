import com.google.common.collect.ImmutableMap;

public class bvp<E extends btq & cjp, T extends bto> extends bvh<E> {
   private static final int c = 1200;
   private int d;
   private bvp.a e = bvp.a.a;

   public bvp() {
      super(ImmutableMap.of(ccs.n, cct.c, ccs.o, cct.a), 1200);
   }

   protected boolean a(are $$0, E $$1) {
      bto $$2 = b($$1);
      return $$1.b(cur.vT) && bvj.b($$1, $$2) && bvj.a($$1, $$2, 0);
   }

   protected boolean a(are $$0, E $$1, long $$2) {
      return $$1.dS().a(ccs.o) && this.a($$0, $$1);
   }

   protected void b(are $$0, E $$1, long $$2) {
      bto $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(are $$0, E $$1, long $$2) {
      if ($$1.fv()) {
         $$1.fB();
      }

      if ($$1.b(cur.vT)) {
         $$1.b(false);
         $$1.fx().b(km.E, cxc.a);
      }
   }

   private void a(E $$0, bto $$1) {
      if (this.e == bvp.a.a) {
         $$0.c(cnq.a($$0, cur.vT));
         this.e = bvp.a.b;
         $$0.b(true);
      } else if (this.e == bvp.a.b) {
         if (!$$0.fv()) {
            this.e = bvp.a.a;
         }

         int $$2 = $$0.fz();
         cuo $$3 = $$0.fx();
         if ($$2 >= ctb.l($$3)) {
            $$0.fA();
            this.e = bvp.a.c;
            this.d = 20 + $$0.el().a(20);
            $$0.b(false);
         }
      } else if (this.e == bvp.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bvp.a.d;
         }
      } else if (this.e == bvp.a.d) {
         $$0.a($$1, 1.0F);
         this.e = bvp.a.a;
      }
   }

   private void b(btq $$0, bto $$1) {
      $$0.dS().a(ccs.n, new bvs($$1, true));
   }

   private static bto b(bto $$0) {
      return $$0.dS().c(ccs.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
