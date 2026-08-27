import com.google.common.collect.ImmutableMap;

public class bnf<E extends bli & cav, T extends blg> extends bmx<E> {
   private static final int c = 1200;
   private int d;
   private bnf.a e = bnf.a.a;

   public bnf() {
      super(ImmutableMap.of(buh.n, bui.c, buh.o, bui.a), 1200);
   }

   protected boolean a(ame $$0, E $$1) {
      blg $$2 = b($$1);
      return $$1.b(clm.vL) && bmz.b($$1, $$2) && bmz.a($$1, $$2, 0);
   }

   protected boolean a(ame $$0, E $$1, long $$2) {
      return $$1.dP().a(buh.o) && this.a($$0, $$1);
   }

   protected void b(ame $$0, E $$1, long $$2) {
      blg $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(ame $$0, E $$1, long $$2) {
      if ($$1.fo()) {
         $$1.fu();
      }

      if ($$1.b(clm.vL)) {
         $$1.b(false);
         cjr.a($$1.fq(), false);
      }
   }

   private void a(E $$0, blg $$1) {
      if (this.e == bnf.a.a) {
         $$0.c(cen.a($$0, clm.vL));
         this.e = bnf.a.b;
         $$0.b(true);
      } else if (this.e == bnf.a.b) {
         if (!$$0.fo()) {
            this.e = bnf.a.a;
         }

         int $$2 = $$0.fs();
         clj $$3 = $$0.fq();
         if ($$2 >= cjr.k($$3)) {
            $$0.ft();
            this.e = bnf.a.c;
            this.d = 20 + $$0.eh().a(20);
            $$0.b(false);
         }
      } else if (this.e == bnf.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bnf.a.d;
         }
      } else if (this.e == bnf.a.d) {
         $$0.a($$1, 1.0F);
         clj $$4 = $$0.b(cen.a($$0, clm.vL));
         cjr.a($$4, false);
         this.e = bnf.a.a;
      }
   }

   private void b(bli $$0, blg $$1) {
      $$0.dP().a(buh.n, new bni($$1, true));
   }

   private static blg b(blg $$0) {
      return $$0.dP().c(buh.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
