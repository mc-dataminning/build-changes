public class epz {
   private static final int b = 16;
   public static final int a = Integer.MIN_VALUE;
   private final int c;
   private final axs d;
   private final je.a e = new je.a();
   private final je.a f = new je.a();

   public epz(dei $$0) {
      this.c = $$0.G_() - 1;
      int $$1 = $$0.an() + 1;
      int $$2 = azd.e($$1 - this.c + 1);
      this.d = new azs($$2, 256);
   }

   public void a(dwk $$0) {
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

   private int a(dwk $$0, int $$1, int $$2, int $$3) {
      int $$4 = kg.c($$0.h($$1) + 1);
      je.a $$5 = this.e.d($$2, $$4, $$3);
      je.a $$6 = this.f.a($$5, jj.a);
      duo $$7 = dhl.a.o();

      for (int $$8 = $$1; $$8 >= 0; $$8--) {
         dwv $$9 = $$0.b($$8);
         if ($$9.c()) {
            $$7 = dhl.a.o();
            int $$10 = $$0.h($$8);
            $$5.q(kg.c($$10));
            $$6.q($$5.v() - 1);
         } else {
            for (int $$11 = 15; $$11 >= 0; $$11--) {
               duo $$12 = $$9.a($$2, $$11, $$3);
               if (a($$7, $$12)) {
                  return $$5.v();
               }

               $$7 = $$12;
               $$5.g($$6);
               $$6.c(jj.a);
            }
         }
      }

      return this.c;
   }

   public boolean a(ddl $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$2 + 1;
      int $$5 = c($$1, $$3);
      int $$6 = this.b($$5);
      if ($$4 < $$6) {
         return false;
      } else {
         je $$7 = this.e.d($$1, $$2 + 1, $$3);
         duo $$8 = $$0.a_($$7);
         je $$9 = this.f.d($$1, $$2, $$3);
         duo $$10 = $$0.a_($$9);
         if (this.a($$0, $$5, $$6, $$7, $$8, $$9, $$10)) {
            return true;
         } else {
            je $$11 = this.e.d($$1, $$2 - 1, $$3);
            duo $$12 = $$0.a_($$11);
            return this.a($$0, $$5, $$6, $$9, $$10, $$11, $$12);
         }
      }
   }

   private boolean a(ddl $$0, int $$1, int $$2, je $$3, duo $$4, je $$5, duo $$6) {
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

   private int a(ddl $$0, je $$1, duo $$2) {
      je.a $$3 = this.e.g($$1);
      je.a $$4 = this.f.a($$1, jj.a);
      duo $$5 = $$2;

      while ($$4.v() >= this.c) {
         duo $$6 = $$0.a_($$4);
         if (a($$5, $$6)) {
            return $$3.v();
         }

         $$5 = $$6;
         $$3.g($$4);
         $$4.c(jj.a);
      }

      return this.c;
   }

   private static boolean a(duo $$0, duo $$1) {
      if ($$1.g() != 0) {
         return true;
      } else {
         ezm $$2 = eqg.a($$0, jj.a);
         ezm $$3 = eqg.a($$1, jj.b);
         return ezj.b($$2, $$3);
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
