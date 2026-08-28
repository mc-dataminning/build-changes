import com.google.common.collect.ImmutableMap;

public class bxh<E extends bvi & clk, T extends bvg> extends bwz<E> {
   private static final int c = 1200;
   private int d;
   private bxh.a e = bxh.a.a;

   public bxh() {
      super(ImmutableMap.of(cek.n, cel.c, cek.o, cel.a), 1200);
   }

   protected boolean a(ard $$0, E $$1) {
      bvg $$2 = b($$1);
      return $$1.b(cws.wV) && bxb.b($$1, $$2) && bxb.a($$1, $$2, 0);
   }

   protected boolean a(ard $$0, E $$1, long $$2) {
      return $$1.eb().a(cek.o) && this.a($$0, $$1);
   }

   protected void b(ard $$0, E $$1, long $$2) {
      bvg $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(ard $$0, E $$1, long $$2) {
      if ($$1.fz()) {
         $$1.fF();
      }

      if ($$1.b(cws.wV)) {
         $$1.b(false);
         $$1.fB().b(kv.O, cyt.a);
      }
   }

   private void a(E $$0, bvg $$1) {
      if (this.e == bxh.a.a) {
         $$0.c(cpr.a($$0, cws.wV));
         this.e = bxh.a.b;
         $$0.b(true);
      } else if (this.e == bxh.a.b) {
         if (!$$0.fz()) {
            this.e = bxh.a.a;
         }

         int $$2 = $$0.fD();
         cwo $$3 = $$0.fB();
         if ($$2 >= cvf.b($$3, $$0)) {
            $$0.fE();
            this.e = bxh.a.c;
            this.d = 20 + $$0.dY().a(20);
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
      $$0.eb().a(cek.n, new bxk($$1, true));
   }

   private static bvg b(bvg $$0) {
      return $$0.eb().c(cek.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
