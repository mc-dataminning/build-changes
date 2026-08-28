public class ewf {
   private static final int b = 16;
   public static final int a = Integer.MIN_VALUE;
   private final int c;
   private final aya d;
   private final iv.a e = new iv.a();
   private final iv.a f = new iv.a();

   public ewf(djj $$0) {
      this.c = $$0.G_() - 1;
      int $$1 = $$0.ao() + 1;
      int $$2 = azm.e($$1 - this.c + 1);
      this.d = new bad($$2, 256);
   }

   public void a(ecl $$0) {
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

   private int a(ecl $$0, int $$1, int $$2, int $$3) {
      int $$4 = jy.c($$0.h($$1) + 1);
      iv.a $$5 = this.e.d($$2, $$4, $$3);
      iv.a $$6 = this.f.a($$5, jb.a);
      eao $$7 = dmo.a.m();

      for (int $$8 = $$1; $$8 >= 0; $$8--) {
         ecw $$9 = $$0.b($$8);
         if ($$9.c()) {
            $$7 = dmo.a.m();
            int $$10 = $$0.h($$8);
            $$5.q(jy.c($$10));
            $$6.q($$5.v() - 1);
         } else {
            for (int $$11 = 15; $$11 >= 0; $$11--) {
               eao $$12 = $$9.a($$2, $$11, $$3);
               if (a($$7, $$12)) {
                  return $$5.v();
               }

               $$7 = $$12;
               $$5.g($$6);
               $$6.c(jb.a);
            }
         }
      }

      return this.c;
   }

   public boolean a(din $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$2 + 1;
      int $$5 = c($$1, $$3);
      int $$6 = this.b($$5);
      if ($$4 < $$6) {
         return false;
      } else {
         iv $$7 = this.e.d($$1, $$2 + 1, $$3);
         eao $$8 = $$0.a_($$7);
         iv $$9 = this.f.d($$1, $$2, $$3);
         eao $$10 = $$0.a_($$9);
         if (this.a($$0, $$5, $$6, $$7, $$8, $$9, $$10)) {
            return true;
         } else {
            iv $$11 = this.e.d($$1, $$2 - 1, $$3);
            eao $$12 = $$0.a_($$11);
            return this.a($$0, $$5, $$6, $$9, $$10, $$11, $$12);
         }
      }
   }

   private boolean a(din $$0, int $$1, int $$2, iv $$3, eao $$4, iv $$5, eao $$6) {
      int $$7 = $$3.v();
      if (a($$4, $$6)) {
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

   private int a(din $$0, iv $$1, eao $$2) {
      iv.a $$3 = this.e.g($$1);
      iv.a $$4 = this.f.a($$1, jb.a);
      eao $$5 = $$2;

      while ($$4.v() >= this.c) {
         eao $$6 = $$0.a_($$4);
         if (a($$5, $$6)) {
            return $$3.v();
         }

         $$5 = $$6;
         $$3.g($$4);
         $$4.c(jb.a);
      }

      return this.c;
   }

   private static boolean a(eao $$0, eao $$1) {
      if ($$1.g() != 0) {
         return true;
      } else {
         ffr $$2 = ewm.a($$0, jb.a);
         ffr $$3 = ewm.a($$1, jb.b);
         return ffo.b($$2, $$3);
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
