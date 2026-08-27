import com.google.common.collect.ImmutableMap;

public class bmi<E extends bkl & bzy, T extends bkj> extends bma<E> {
   private static final int c = 1200;
   private int d;
   private bmi.a e = bmi.a.a;

   public bmi() {
      super(ImmutableMap.of(btk.n, btl.c, btk.o, btl.a), 1200);
   }

   protected boolean a(alq $$0, E $$1) {
      bkj $$2 = b($$1);
      return $$1.b(ckm.uZ) && bmc.b($$1, $$2) && bmc.a($$1, $$2, 0);
   }

   protected boolean a(alq $$0, E $$1, long $$2) {
      return $$1.dN().a(btk.o) && this.a($$0, $$1);
   }

   protected void b(alq $$0, E $$1, long $$2) {
      bkj $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(alq $$0, E $$1, long $$2) {
      if ($$1.fn()) {
         $$1.ft();
      }

      if ($$1.b(ckm.uZ)) {
         $$1.b(false);
         cir.a($$1.fp(), false);
      }
   }

   private void a(E $$0, bkj $$1) {
      if (this.e == bmi.a.a) {
         $$0.c(cdq.a($$0, ckm.uZ));
         this.e = bmi.a.b;
         $$0.b(true);
      } else if (this.e == bmi.a.b) {
         if (!$$0.fn()) {
            this.e = bmi.a.a;
         }

         int $$2 = $$0.fr();
         ckj $$3 = $$0.fp();
         if ($$2 >= cir.k($$3)) {
            $$0.fs();
            this.e = bmi.a.c;
            this.d = 20 + $$0.ef().a(20);
            $$0.b(false);
         }
      } else if (this.e == bmi.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bmi.a.d;
         }
      } else if (this.e == bmi.a.d) {
         $$0.a($$1, 1.0F);
         ckj $$4 = $$0.b(cdq.a($$0, ckm.uZ));
         cir.a($$4, false);
         this.e = bmi.a.a;
      }
   }

   private void b(bkl $$0, bkj $$1) {
      $$0.dN().a(btk.n, new bml($$1, true));
   }

   private static bkj b(bkj $$0) {
      return $$0.dN().c(btk.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
