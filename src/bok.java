import com.google.common.collect.ImmutableMap;

public class bok<E extends bmn & ccc, T extends bml> extends boc<E> {
   private static final int c = 1200;
   private int d;
   private bok.a e = bok.a.a;

   public bok() {
      super(ImmutableMap.of(bvn.n, bvo.c, bvn.o, bvo.a), 1200);
   }

   protected boolean a(and $$0, E $$1) {
      bml $$2 = b($$1);
      return $$1.b(cnb.vM) && boe.b($$1, $$2) && boe.a($$1, $$2, 0);
   }

   protected boolean a(and $$0, E $$1, long $$2) {
      return $$1.dO().a(bvn.o) && this.a($$0, $$1);
   }

   protected void b(and $$0, E $$1, long $$2) {
      bml $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(and $$0, E $$1, long $$2) {
      if ($$1.fn()) {
         $$1.ft();
      }

      if ($$1.b(cnb.vM)) {
         $$1.b(false);
         clg.a($$1.fp(), false);
      }
   }

   private void a(E $$0, bml $$1) {
      if (this.e == bok.a.a) {
         $$0.c(cgb.a($$0, cnb.vM));
         this.e = bok.a.b;
         $$0.b(true);
      } else if (this.e == bok.a.b) {
         if (!$$0.fn()) {
            this.e = bok.a.a;
         }

         int $$2 = $$0.fr();
         cmy $$3 = $$0.fp();
         if ($$2 >= clg.k($$3)) {
            $$0.fs();
            this.e = bok.a.c;
            this.d = 20 + $$0.eg().a(20);
            $$0.b(false);
         }
      } else if (this.e == bok.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bok.a.d;
         }
      } else if (this.e == bok.a.d) {
         $$0.a($$1, 1.0F);
         cmy $$4 = $$0.b(cgb.a($$0, cnb.vM));
         clg.a($$4, false);
         this.e = bok.a.a;
      }
   }

   private void b(bmn $$0, bml $$1) {
      $$0.dO().a(bvn.n, new bon($$1, true));
   }

   private static bml b(bml $$0) {
      return $$0.dO().c(bvn.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
