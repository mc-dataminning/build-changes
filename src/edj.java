public class edj {
   private static final int b = 16;
   public static final int a = Integer.MIN_VALUE;
   private final int c;
   private final aso d;
   private final hv.a e = new hv.a();
   private final hv.a f = new hv.a();

   public edj(cta $$0) {
      this.c = $$0.J_() - 1;
      int $$1 = $$0.ak();
      int $$2 = aty.e($$1 - this.c + 1);
      this.d = new aun($$2, 256);
   }

   public void a(dkl $$0) {
      int $$1 = $$0.a();
      if ($$1 == -1) {
         this.a(this.c);
      } else {
         for (int $$2 = 0; $$2 < 16; $$2++) {
            for (int $$3 = 0; $$3 < 16; $$3++) {
               int $$4 = Math.max(this.a($$0, $$1, $$3, $$2), this.c);
               this.b(c($$3, $$2), $$4);
            }
         }
      }
   }

   private int a(dkl $$0, int $$1, int $$2, int $$3) {
      int $$4 = ix.c($$0.g($$1) + 1);
      hv.a $$5 = this.e.d($$2, $$4, $$3);
      hv.a $$6 = this.f.a($$5, ia.a);
      dip $$7 = cwb.a.o();

      for (int $$8 = $$1; $$8 >= 0; $$8--) {
         dkx $$9 = $$0.b($$8);
         if ($$9.c()) {
            $$7 = cwb.a.o();
            int $$10 = $$0.g($$8);
            $$5.q(ix.c($$10));
            $$6.q($$5.v() - 1);
         } else {
            for (int $$11 = 15; $$11 >= 0; $$11--) {
               dip $$12 = $$9.a($$2, $$11, $$3);
               if (a($$0, $$5, $$7, $$6, $$12)) {
                  return $$5.v();
               }

               $$7 = $$12;
               $$5.g($$6);
               $$6.c(ia.a);
            }
         }
      }

      return this.c;
   }

   public boolean a(cse $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$2 + 1;
      int $$5 = c($$1, $$3);
      int $$6 = this.b($$5);
      if ($$4 < $$6) {
         return false;
      } else {
         hv $$7 = this.e.d($$1, $$2 + 1, $$3);
         dip $$8 = $$0.a_($$7);
         hv $$9 = this.f.d($$1, $$2, $$3);
         dip $$10 = $$0.a_($$9);
         if (this.a($$0, $$5, $$6, $$7, $$8, $$9, $$10)) {
            return true;
         } else {
            hv $$11 = this.e.d($$1, $$2 - 1, $$3);
            dip $$12 = $$0.a_($$11);
            return this.a($$0, $$5, $$6, $$9, $$10, $$11, $$12);
         }
      }
   }

   private boolean a(cse $$0, int $$1, int $$2, hv $$3, dip $$4, hv $$5, dip $$6) {
      int $$7 = $$3.v();
      if (a($$0, $$3, $$4, $$5, $$6)) {
         if ($$7 > $$2) {
            this.b($$1, $$7);
            return true;
         }
      } else if ($$7 == $$2) {
         this.b($$1, this.a($$0, $$5, $$6));
         return true;
      }

      return false;
   }

   private int a(cse $$0, hv $$1, dip $$2) {
      hv.a $$3 = this.e.g($$1);
      hv.a $$4 = this.f.a($$1, ia.a);
      dip $$5 = $$2;

      while ($$4.v() >= this.c) {
         dip $$6 = $$0.a_($$4);
         if (a($$0, $$3, $$5, $$4, $$6)) {
            return $$3.v();
         }

         $$5 = $$6;
         $$3.g($$4);
         $$4.c(ia.a);
      }

      return this.c;
   }

   private static boolean a(cse $$0, hv $$1, dip $$2, hv $$3, dip $$4) {
      if ($$4.b($$0, $$3) != 0) {
         return true;
      } else {
         elu $$5 = edq.a($$0, $$1, $$2, ia.a);
         elu $$6 = edq.a($$0, $$3, $$4, ia.b);
         return elr.b($$5, $$6);
      }
   }

   public int a(int $$0, int $$1) {
      int $$2 = this.b(c($$0, $$1));
      return this.c($$2);
   }

   public int a() {
      int $$0 = Integer.MIN_VALUE;

      for (int $$1 = 0; $$1 < this.d.b(); $$1++) {
         int $$2 = this.d.a($$1);
         if ($$2 > $$0) {
            $$0 = $$2;
         }
      }

      return this.c($$0 + this.c);
   }

   private void a(int $$0) {
      int $$1 = $$0 - this.c;

      for (int $$2 = 0; $$2 < this.d.b(); $$2++) {
         this.d.b($$2, $$1);
      }
   }

   private void b(int $$0, int $$1) {
      this.d.b($$0, $$1 - this.c);
   }

   private int b(int $$0) {
      return this.d.a($$0) + this.c;
   }

   private int c(int $$0) {
      return $$0 == this.c ? Integer.MIN_VALUE : $$0;
   }

   private static int c(int $$0, int $$1) {
      return $$0 + $$1 * 16;
   }
}
