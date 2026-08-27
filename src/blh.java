import com.google.common.collect.ImmutableMap;

public class blh<E extends bjk & byx, T extends bji> extends bkz<E> {
   private static final int c = 1200;
   private int d;
   private blh.a e = blh.a.a;

   public blh() {
      super(ImmutableMap.of(bsj.n, bsk.c, bsj.o, bsk.a), 1200);
   }

   protected boolean a(aks $$0, E $$1) {
      bji $$2 = b($$1);
      return $$1.b(cjk.uZ) && blb.b($$1, $$2) && blb.a($$1, $$2, 0);
   }

   protected boolean a(aks $$0, E $$1, long $$2) {
      return $$1.dN().a(bsj.o) && this.a($$0, $$1);
   }

   protected void b(aks $$0, E $$1, long $$2) {
      bji $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(aks $$0, E $$1, long $$2) {
      if ($$1.fm()) {
         $$1.fs();
      }

      if ($$1.b(cjk.uZ)) {
         $$1.b(false);
         chp.a($$1.fo(), false);
      }
   }

   private void a(E $$0, bji $$1) {
      if (this.e == blh.a.a) {
         $$0.c(ccp.a($$0, cjk.uZ));
         this.e = blh.a.b;
         $$0.b(true);
      } else if (this.e == blh.a.b) {
         if (!$$0.fm()) {
            this.e = blh.a.a;
         }

         int $$2 = $$0.fq();
         cjh $$3 = $$0.fo();
         if ($$2 >= chp.k($$3)) {
            $$0.fr();
            this.e = blh.a.c;
            this.d = 20 + $$0.ef().a(20);
            $$0.b(false);
         }
      } else if (this.e == blh.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = blh.a.d;
         }
      } else if (this.e == blh.a.d) {
         $$0.a($$1, 1.0F);
         cjh $$4 = $$0.b(ccp.a($$0, cjk.uZ));
         chp.a($$4, false);
         this.e = blh.a.a;
      }
   }

   private void b(bjk $$0, bji $$1) {
      $$0.dN().a(bsj.n, new blk($$1, true));
   }

   private static bji b(bji $$0) {
      return $$0.dN().c(bsj.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
