import com.google.common.collect.ImmutableMap;

public class bkx<E extends bja & byn, T extends biy> extends bkp<E> {
   private static final int c = 1200;
   private int d;
   private bkx.a e = bkx.a.a;

   public bkx() {
      super(ImmutableMap.of(brz.n, bsa.c, brz.o, bsa.a), 1200);
   }

   protected boolean a(akk $$0, E $$1) {
      biy $$2 = b($$1);
      return $$1.b(cja.uZ) && bkr.b($$1, $$2) && bkr.a($$1, $$2, 0);
   }

   protected boolean a(akk $$0, E $$1, long $$2) {
      return $$1.dM().a(brz.o) && this.a($$0, $$1);
   }

   protected void b(akk $$0, E $$1, long $$2) {
      biy $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(akk $$0, E $$1, long $$2) {
      if ($$1.fl()) {
         $$1.fr();
      }

      if ($$1.b(cja.uZ)) {
         $$1.b(false);
         chf.a($$1.fn(), false);
      }
   }

   private void a(E $$0, biy $$1) {
      if (this.e == bkx.a.a) {
         $$0.c(ccf.a($$0, cja.uZ));
         this.e = bkx.a.b;
         $$0.b(true);
      } else if (this.e == bkx.a.b) {
         if (!$$0.fl()) {
            this.e = bkx.a.a;
         }

         int $$2 = $$0.fp();
         cix $$3 = $$0.fn();
         if ($$2 >= chf.k($$3)) {
            $$0.fq();
            this.e = bkx.a.c;
            this.d = 20 + $$0.ee().a(20);
            $$0.b(false);
         }
      } else if (this.e == bkx.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bkx.a.d;
         }
      } else if (this.e == bkx.a.d) {
         $$0.a($$1, 1.0F);
         cix $$4 = $$0.b(ccf.a($$0, cja.uZ));
         chf.a($$4, false);
         this.e = bkx.a.a;
      }
   }

   private void b(bja $$0, biy $$1) {
      $$0.dM().a(brz.n, new bla($$1, true));
   }

   private static biy b(biy $$0) {
      return $$0.dM().c(brz.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
