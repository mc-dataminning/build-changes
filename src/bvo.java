import com.google.common.collect.ImmutableMap;

public class bvo<E extends btp & cjo, T extends btn> extends bvg<E> {
   private static final int c = 1200;
   private int d;
   private bvo.a e = bvo.a.a;

   public bvo() {
      super(ImmutableMap.of(ccr.n, ccs.c, ccr.o, ccs.a), 1200);
   }

   protected boolean a(are $$0, E $$1) {
      btn $$2 = b($$1);
      return $$1.b(cuq.vT) && bvi.b($$1, $$2) && bvi.a($$1, $$2, 0);
   }

   protected boolean a(are $$0, E $$1, long $$2) {
      return $$1.dS().a(ccr.o) && this.a($$0, $$1);
   }

   protected void b(are $$0, E $$1, long $$2) {
      btn $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(are $$0, E $$1, long $$2) {
      if ($$1.fv()) {
         $$1.fB();
      }

      if ($$1.b(cuq.vT)) {
         $$1.b(false);
         $$1.fx().b(km.D, cxb.a);
      }
   }

   private void a(E $$0, btn $$1) {
      if (this.e == bvo.a.a) {
         $$0.c(cnp.a($$0, cuq.vT));
         this.e = bvo.a.b;
         $$0.b(true);
      } else if (this.e == bvo.a.b) {
         if (!$$0.fv()) {
            this.e = bvo.a.a;
         }

         int $$2 = $$0.fz();
         cun $$3 = $$0.fx();
         if ($$2 >= cta.l($$3)) {
            $$0.fA();
            this.e = bvo.a.c;
            this.d = 20 + $$0.el().a(20);
            $$0.b(false);
         }
      } else if (this.e == bvo.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bvo.a.d;
         }
      } else if (this.e == bvo.a.d) {
         $$0.a($$1, 1.0F);
         this.e = bvo.a.a;
      }
   }

   private void b(btp $$0, btn $$1) {
      $$0.dS().a(ccr.n, new bvr($$1, true));
   }

   private static btn b(btn $$0) {
      return $$0.dS().c(ccr.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
