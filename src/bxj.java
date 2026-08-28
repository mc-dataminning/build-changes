import com.google.common.collect.ImmutableMap;

public class bxj<E extends bvk & clm, T extends bvi> extends bxb<E> {
   private static final int c = 1200;
   private int d;
   private bxj.a e = bxj.a.a;

   public bxj() {
      super(ImmutableMap.of(cem.n, cen.c, cem.o, cen.a), 1200);
   }

   protected boolean a(ard $$0, E $$1) {
      bvi $$2 = b($$1);
      return $$1.b(cwu.wV) && bxd.b($$1, $$2) && bxd.a($$1, $$2, 0);
   }

   protected boolean a(ard $$0, E $$1, long $$2) {
      return $$1.eb().a(cem.o) && this.a($$0, $$1);
   }

   protected void b(ard $$0, E $$1, long $$2) {
      bvi $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(ard $$0, E $$1, long $$2) {
      if ($$1.fz()) {
         $$1.fF();
      }

      if ($$1.b(cwu.wV)) {
         $$1.b(false);
         $$1.fB().b(kv.O, cyv.a);
      }
   }

   private void a(E $$0, bvi $$1) {
      if (this.e == bxj.a.a) {
         $$0.c(cpt.a($$0, cwu.wV));
         this.e = bxj.a.b;
         $$0.b(true);
      } else if (this.e == bxj.a.b) {
         if (!$$0.fz()) {
            this.e = bxj.a.a;
         }

         int $$2 = $$0.fD();
         cwq $$3 = $$0.fB();
         if ($$2 >= cvh.b($$3, $$0)) {
            $$0.fE();
            this.e = bxj.a.c;
            this.d = 20 + $$0.dY().a(20);
            $$0.b(false);
         }
      } else if (this.e == bxj.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bxj.a.d;
         }
      } else if (this.e == bxj.a.d) {
         $$0.a($$1, 1.0F);
         this.e = bxj.a.a;
      }
   }

   private void b(bvk $$0, bvi $$1) {
      $$0.eb().a(cem.n, new bxm($$1, true));
   }

   private static bvi b(bvi $$0) {
      return $$0.eb().c(cem.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
