import com.google.common.collect.ImmutableMap;

public class bnk<E extends bln & cba, T extends bll> extends bnc<E> {
   private static final int c = 1200;
   private int d;
   private bnk.a e = bnk.a.a;

   public bnk() {
      super(ImmutableMap.of(bum.n, bun.c, bum.o, bun.a), 1200);
   }

   protected boolean a(ami $$0, E $$1) {
      bll $$2 = b($$1);
      return $$1.b(clr.vL) && bne.b($$1, $$2) && bne.a($$1, $$2, 0);
   }

   protected boolean a(ami $$0, E $$1, long $$2) {
      return $$1.dP().a(bum.o) && this.a($$0, $$1);
   }

   protected void b(ami $$0, E $$1, long $$2) {
      bll $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(ami $$0, E $$1, long $$2) {
      if ($$1.fo()) {
         $$1.fu();
      }

      if ($$1.b(clr.vL)) {
         $$1.b(false);
         cjw.a($$1.fq(), false);
      }
   }

   private void a(E $$0, bll $$1) {
      if (this.e == bnk.a.a) {
         $$0.c(ces.a($$0, clr.vL));
         this.e = bnk.a.b;
         $$0.b(true);
      } else if (this.e == bnk.a.b) {
         if (!$$0.fo()) {
            this.e = bnk.a.a;
         }

         int $$2 = $$0.fs();
         clo $$3 = $$0.fq();
         if ($$2 >= cjw.k($$3)) {
            $$0.ft();
            this.e = bnk.a.c;
            this.d = 20 + $$0.eh().a(20);
            $$0.b(false);
         }
      } else if (this.e == bnk.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bnk.a.d;
         }
      } else if (this.e == bnk.a.d) {
         $$0.a($$1, 1.0F);
         clo $$4 = $$0.b(ces.a($$0, clr.vL));
         cjw.a($$4, false);
         this.e = bnk.a.a;
      }
   }

   private void b(bln $$0, bll $$1) {
      $$0.dP().a(bum.n, new bnn($$1, true));
   }

   private static bll b(bll $$0) {
      return $$0.dP().c(bum.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
