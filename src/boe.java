import com.google.common.collect.ImmutableMap;

public class boe<E extends bmh & cbw, T extends bmf> extends bnw<E> {
   private static final int c = 1200;
   private int d;
   private boe.a e = boe.a.a;

   public boe() {
      super(ImmutableMap.of(bvh.n, bvi.c, bvh.o, bvi.a), 1200);
   }

   protected boolean a(amz $$0, E $$1) {
      bmf $$2 = b($$1);
      return $$1.b(cmu.vM) && bny.b($$1, $$2) && bny.a($$1, $$2, 0);
   }

   protected boolean a(amz $$0, E $$1, long $$2) {
      return $$1.dO().a(bvh.o) && this.a($$0, $$1);
   }

   protected void b(amz $$0, E $$1, long $$2) {
      bmf $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(amz $$0, E $$1, long $$2) {
      if ($$1.fn()) {
         $$1.ft();
      }

      if ($$1.b(cmu.vM)) {
         $$1.b(false);
         ckz.a($$1.fp(), false);
      }
   }

   private void a(E $$0, bmf $$1) {
      if (this.e == boe.a.a) {
         $$0.c(cfu.a($$0, cmu.vM));
         this.e = boe.a.b;
         $$0.b(true);
      } else if (this.e == boe.a.b) {
         if (!$$0.fn()) {
            this.e = boe.a.a;
         }

         int $$2 = $$0.fr();
         cmr $$3 = $$0.fp();
         if ($$2 >= ckz.k($$3)) {
            $$0.fs();
            this.e = boe.a.c;
            this.d = 20 + $$0.eg().a(20);
            $$0.b(false);
         }
      } else if (this.e == boe.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = boe.a.d;
         }
      } else if (this.e == boe.a.d) {
         $$0.a($$1, 1.0F);
         cmr $$4 = $$0.b(cfu.a($$0, cmu.vM));
         ckz.a($$4, false);
         this.e = boe.a.a;
      }
   }

   private void b(bmh $$0, bmf $$1) {
      $$0.dO().a(bvh.n, new boh($$1, true));
   }

   private static bmf b(bmf $$0) {
      return $$0.dO().c(bvh.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
