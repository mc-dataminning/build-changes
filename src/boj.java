import com.google.common.collect.ImmutableMap;

public class boj<E extends bmm & ccb, T extends bmk> extends bob<E> {
   private static final int c = 1200;
   private int d;
   private boj.a e = boj.a.a;

   public boj() {
      super(ImmutableMap.of(bvm.n, bvn.c, bvm.o, bvn.a), 1200);
   }

   protected boolean a(and $$0, E $$1) {
      bmk $$2 = b($$1);
      return $$1.b(cna.vM) && bod.b($$1, $$2) && bod.a($$1, $$2, 0);
   }

   protected boolean a(and $$0, E $$1, long $$2) {
      return $$1.dO().a(bvm.o) && this.a($$0, $$1);
   }

   protected void b(and $$0, E $$1, long $$2) {
      bmk $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(and $$0, E $$1, long $$2) {
      if ($$1.fn()) {
         $$1.ft();
      }

      if ($$1.b(cna.vM)) {
         $$1.b(false);
         clf.a($$1.fp(), false);
      }
   }

   private void a(E $$0, bmk $$1) {
      if (this.e == boj.a.a) {
         $$0.c(cga.a($$0, cna.vM));
         this.e = boj.a.b;
         $$0.b(true);
      } else if (this.e == boj.a.b) {
         if (!$$0.fn()) {
            this.e = boj.a.a;
         }

         int $$2 = $$0.fr();
         cmx $$3 = $$0.fp();
         if ($$2 >= clf.k($$3)) {
            $$0.fs();
            this.e = boj.a.c;
            this.d = 20 + $$0.eg().a(20);
            $$0.b(false);
         }
      } else if (this.e == boj.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = boj.a.d;
         }
      } else if (this.e == boj.a.d) {
         $$0.a($$1, 1.0F);
         cmx $$4 = $$0.b(cga.a($$0, cna.vM));
         clf.a($$4, false);
         this.e = boj.a.a;
      }
   }

   private void b(bmm $$0, bmk $$1) {
      $$0.dO().a(bvm.n, new bom($$1, true));
   }

   private static bmk b(bmk $$0) {
      return $$0.dO().c(bvm.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
