import com.google.common.collect.ImmutableMap;

public class bvq<E extends btr & cjq, T extends btp> extends bvi<E> {
   private static final int c = 1200;
   private int d;
   private bvq.a e = bvq.a.a;

   public bvq() {
      super(ImmutableMap.of(cct.n, ccu.c, cct.o, ccu.a), 1200);
   }

   protected boolean a(arf $$0, E $$1) {
      btp $$2 = b($$1);
      return $$1.b(cus.vT) && bvk.b($$1, $$2) && bvk.a($$1, $$2, 0);
   }

   protected boolean a(arf $$0, E $$1, long $$2) {
      return $$1.dS().a(cct.o) && this.a($$0, $$1);
   }

   protected void b(arf $$0, E $$1, long $$2) {
      btp $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(arf $$0, E $$1, long $$2) {
      if ($$1.fv()) {
         $$1.fB();
      }

      if ($$1.b(cus.vT)) {
         $$1.b(false);
         $$1.fx().b(km.E, cxd.a);
      }
   }

   private void a(E $$0, btp $$1) {
      if (this.e == bvq.a.a) {
         $$0.c(cnr.a($$0, cus.vT));
         this.e = bvq.a.b;
         $$0.b(true);
      } else if (this.e == bvq.a.b) {
         if (!$$0.fv()) {
            this.e = bvq.a.a;
         }

         int $$2 = $$0.fz();
         cup $$3 = $$0.fx();
         if ($$2 >= ctc.l($$3)) {
            $$0.fA();
            this.e = bvq.a.c;
            this.d = 20 + $$0.el().a(20);
            $$0.b(false);
         }
      } else if (this.e == bvq.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bvq.a.d;
         }
      } else if (this.e == bvq.a.d) {
         $$0.a($$1, 1.0F);
         this.e = bvq.a.a;
      }
   }

   private void b(btr $$0, btp $$1) {
      $$0.dS().a(cct.n, new bvt($$1, true));
   }

   private static btp b(btp $$0) {
      return $$0.dS().c(cct.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
