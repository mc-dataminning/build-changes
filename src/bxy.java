import com.google.common.collect.ImmutableMap;

public class bxy<E extends bvz & cmb, T extends bvx> extends bxq<E> {
   private static final int c = 1200;
   private int d;
   private bxy.a e = bxy.a.a;

   public bxy() {
      super(ImmutableMap.of(cfb.n, cfc.c, cfb.o, cfc.a), 1200);
   }

   protected boolean a(arx $$0, E $$1) {
      bvx $$2 = b($$1);
      return $$1.b(cxk.wV) && bxs.b($$1, $$2) && bxs.a($$1, $$2, 0);
   }

   protected boolean a(arx $$0, E $$1, long $$2) {
      return $$1.ec().a(cfb.o) && this.a($$0, $$1);
   }

   protected void b(arx $$0, E $$1, long $$2) {
      bvx $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(arx $$0, E $$1, long $$2) {
      if ($$1.fz()) {
         $$1.fF();
      }

      if ($$1.b(cxk.wV)) {
         $$1.b(false);
         $$1.fB().b(ku.O, czl.a);
      }
   }

   private void a(E $$0, bvx $$1) {
      if (this.e == bxy.a.a) {
         $$0.c(cqj.a($$0, cxk.wV));
         this.e = bxy.a.b;
         $$0.b(true);
      } else if (this.e == bxy.a.b) {
         if (!$$0.fz()) {
            this.e = bxy.a.a;
         }

         int $$2 = $$0.fD();
         cxg $$3 = $$0.fB();
         if ($$2 >= cvx.b($$3, $$0)) {
            $$0.fE();
            this.e = bxy.a.c;
            this.d = 20 + $$0.dZ().a(20);
            $$0.b(false);
         }
      } else if (this.e == bxy.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bxy.a.d;
         }
      } else if (this.e == bxy.a.d) {
         $$0.a($$1, 1.0F);
         this.e = bxy.a.a;
      }
   }

   private void b(bvz $$0, bvx $$1) {
      $$0.ec().a(cfb.n, new byb($$1, true));
   }

   private static bvx b(bvx $$0) {
      return $$0.ec().c(cfb.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
