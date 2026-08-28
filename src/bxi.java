import com.google.common.collect.ImmutableMap;

public class bxi<E extends bvj & cll, T extends bvh> extends bxa<E> {
   private static final int c = 1200;
   private int d;
   private bxi.a e = bxi.a.a;

   public bxi() {
      super(ImmutableMap.of(cel.n, cem.c, cel.o, cem.a), 1200);
   }

   protected boolean a(ard $$0, E $$1) {
      bvh $$2 = b($$1);
      return $$1.b(cwt.wV) && bxc.b($$1, $$2) && bxc.a($$1, $$2, 0);
   }

   protected boolean a(ard $$0, E $$1, long $$2) {
      return $$1.eb().a(cel.o) && this.a($$0, $$1);
   }

   protected void b(ard $$0, E $$1, long $$2) {
      bvh $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(ard $$0, E $$1, long $$2) {
      if ($$1.fz()) {
         $$1.fF();
      }

      if ($$1.b(cwt.wV)) {
         $$1.b(false);
         $$1.fB().b(kv.O, cyu.a);
      }
   }

   private void a(E $$0, bvh $$1) {
      if (this.e == bxi.a.a) {
         $$0.c(cps.a($$0, cwt.wV));
         this.e = bxi.a.b;
         $$0.b(true);
      } else if (this.e == bxi.a.b) {
         if (!$$0.fz()) {
            this.e = bxi.a.a;
         }

         int $$2 = $$0.fD();
         cwp $$3 = $$0.fB();
         if ($$2 >= cvg.b($$3, $$0)) {
            $$0.fE();
            this.e = bxi.a.c;
            this.d = 20 + $$0.dY().a(20);
            $$0.b(false);
         }
      } else if (this.e == bxi.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bxi.a.d;
         }
      } else if (this.e == bxi.a.d) {
         $$0.a($$1, 1.0F);
         this.e = bxi.a.a;
      }
   }

   private void b(bvj $$0, bvh $$1) {
      $$0.eb().a(cel.n, new bxl($$1, true));
   }

   private static bvh b(bvh $$0) {
      return $$0.eb().c(cel.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
