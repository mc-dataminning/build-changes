import com.google.common.collect.ImmutableMap;

public class bkw<E extends biy & bym, T extends biw> extends bko<E> {
   private static final int c = 1200;
   private int d;
   private bkw.a e = bkw.a.a;

   public bkw() {
      super(ImmutableMap.of(bry.n, brz.c, bry.o, brz.a), 1200);
   }

   protected boolean a(aki $$0, E $$1) {
      biw $$2 = b($$1);
      return $$1.b(ciz.uZ) && bkq.b($$1, $$2) && bkq.a($$1, $$2, 0);
   }

   protected boolean a(aki $$0, E $$1, long $$2) {
      return $$1.dM().a(bry.o) && this.a($$0, $$1);
   }

   protected void b(aki $$0, E $$1, long $$2) {
      biw $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(aki $$0, E $$1, long $$2) {
      if ($$1.fl()) {
         $$1.fr();
      }

      if ($$1.b(ciz.uZ)) {
         $$1.b(false);
         che.a($$1.fn(), false);
      }
   }

   private void a(E $$0, biw $$1) {
      if (this.e == bkw.a.a) {
         $$0.c(cce.a($$0, ciz.uZ));
         this.e = bkw.a.b;
         $$0.b(true);
      } else if (this.e == bkw.a.b) {
         if (!$$0.fl()) {
            this.e = bkw.a.a;
         }

         int $$2 = $$0.fp();
         ciw $$3 = $$0.fn();
         if ($$2 >= che.k($$3)) {
            $$0.fq();
            this.e = bkw.a.c;
            this.d = 20 + $$0.ee().a(20);
            $$0.b(false);
         }
      } else if (this.e == bkw.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bkw.a.d;
         }
      } else if (this.e == bkw.a.d) {
         $$0.a($$1, 1.0F);
         ciw $$4 = $$0.b(cce.a($$0, ciz.uZ));
         che.a($$4, false);
         this.e = bkw.a.a;
      }
   }

   private void b(biy $$0, biw $$1) {
      $$0.dM().a(bry.n, new bkz($$1, true));
   }

   private static biw b(biw $$0) {
      return $$0.dM().c(bry.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
