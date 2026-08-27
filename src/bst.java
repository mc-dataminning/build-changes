import com.google.common.collect.ImmutableMap;

public class bst<E extends bqv & cgt, T extends bqt> extends bsl<E> {
   private static final int c = 1200;
   private int d;
   private bst.a e = bst.a.a;

   public bst() {
      super(ImmutableMap.of(bzw.n, bzx.c, bzw.o, bzx.a), 1200);
   }

   protected boolean a(apu $$0, E $$1) {
      bqt $$2 = b($$1);
      return $$1.b(crv.vR) && bsn.b($$1, $$2) && bsn.a($$1, $$2, 0);
   }

   protected boolean a(apu $$0, E $$1, long $$2) {
      return $$1.dP().a(bzw.o) && this.a($$0, $$1);
   }

   protected void b(apu $$0, E $$1, long $$2) {
      bqt $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(apu $$0, E $$1, long $$2) {
      if ($$1.fs()) {
         $$1.fy();
      }

      if ($$1.b(crv.vR)) {
         $$1.b(false);
         $$1.fu().b(jr.v, cub.a);
      }
   }

   private void a(E $$0, bqt $$1) {
      if (this.e == bst.a.a) {
         $$0.c(cku.a($$0, crv.vR));
         this.e = bst.a.b;
         $$0.b(true);
      } else if (this.e == bst.a.b) {
         if (!$$0.fs()) {
            this.e = bst.a.a;
         }

         int $$2 = $$0.fw();
         crs $$3 = $$0.fu();
         if ($$2 >= cqf.l($$3)) {
            $$0.fx();
            this.e = bst.a.c;
            this.d = 20 + $$0.ei().a(20);
            $$0.b(false);
         }
      } else if (this.e == bst.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bst.a.d;
         }
      } else if (this.e == bst.a.d) {
         $$0.a($$1, 1.0F);
         this.e = bst.a.a;
      }
   }

   private void b(bqv $$0, bqt $$1) {
      $$0.dP().a(bzw.n, new bsw($$1, true));
   }

   private static bqt b(bqt $$0) {
      return $$0.dP().c(bzw.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
