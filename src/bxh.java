import com.google.common.collect.ImmutableMap;

public class bxh<E extends bvi & clk, T extends bvg> extends bwz<E> {
   private static final int c = 1200;
   private int d;
   private bxh.a e = bxh.a.a;

   public bxh() {
      super(ImmutableMap.of(cek.n, cel.c, cek.o, cel.a), 1200);
   }

   protected boolean a(arc $$0, E $$1) {
      bvg $$2 = b($$1);
      return $$1.b(cwt.wV) && bxb.b($$1, $$2) && bxb.a($$1, $$2, 0);
   }

   protected boolean a(arc $$0, E $$1, long $$2) {
      return $$1.ec().a(cek.o) && this.a($$0, $$1);
   }

   protected void b(arc $$0, E $$1, long $$2) {
      bvg $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(arc $$0, E $$1, long $$2) {
      if ($$1.fz()) {
         $$1.fF();
      }

      if ($$1.b(cwt.wV)) {
         $$1.b(false);
         $$1.fB().b(kv.O, cyu.a);
      }
   }

   private void a(E $$0, bvg $$1) {
      if (this.e == bxh.a.a) {
         $$0.c(cps.a($$0, cwt.wV));
         this.e = bxh.a.b;
         $$0.b(true);
      } else if (this.e == bxh.a.b) {
         if (!$$0.fz()) {
            this.e = bxh.a.a;
         }

         int $$2 = $$0.fD();
         cwp $$3 = $$0.fB();
         if ($$2 >= cvg.b($$3, $$0)) {
            $$0.fE();
            this.e = bxh.a.c;
            this.d = 20 + $$0.dZ().a(20);
            $$0.b(false);
         }
      } else if (this.e == bxh.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bxh.a.d;
         }
      } else if (this.e == bxh.a.d) {
         $$0.a($$1, 1.0F);
         this.e = bxh.a.a;
      }
   }

   private void b(bvi $$0, bvg $$1) {
      $$0.ec().a(cek.n, new bxk($$1, true));
   }

   private static bvg b(bvg $$0) {
      return $$0.ec().c(cek.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
