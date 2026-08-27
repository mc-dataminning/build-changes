import com.google.common.collect.ImmutableMap;

public class bky<E extends bja & byo, T extends biy> extends bkq<E> {
   private static final int c = 1200;
   private int d;
   private bky.a e = bky.a.a;

   public bky() {
      super(ImmutableMap.of(bsa.n, bsb.c, bsa.o, bsb.a), 1200);
   }

   protected boolean a(akk $$0, E $$1) {
      biy $$2 = b($$1);
      return $$1.b(cjb.uZ) && bks.b($$1, $$2) && bks.a($$1, $$2, 0);
   }

   protected boolean a(akk $$0, E $$1, long $$2) {
      return $$1.dM().a(bsa.o) && this.a($$0, $$1);
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

      if ($$1.b(cjb.uZ)) {
         $$1.b(false);
         chg.a($$1.fn(), false);
      }
   }

   private void a(E $$0, biy $$1) {
      if (this.e == bky.a.a) {
         $$0.c(ccg.a($$0, cjb.uZ));
         this.e = bky.a.b;
         $$0.b(true);
      } else if (this.e == bky.a.b) {
         if (!$$0.fl()) {
            this.e = bky.a.a;
         }

         int $$2 = $$0.fp();
         ciy $$3 = $$0.fn();
         if ($$2 >= chg.k($$3)) {
            $$0.fq();
            this.e = bky.a.c;
            this.d = 20 + $$0.ee().a(20);
            $$0.b(false);
         }
      } else if (this.e == bky.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bky.a.d;
         }
      } else if (this.e == bky.a.d) {
         $$0.a($$1, 1.0F);
         ciy $$4 = $$0.b(ccg.a($$0, cjb.uZ));
         chg.a($$4, false);
         this.e = bky.a.a;
      }
   }

   private void b(bja $$0, biy $$1) {
      $$0.dM().a(bsa.n, new blb($$1, true));
   }

   private static biy b(biy $$0) {
      return $$0.dM().c(bsa.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
