public class eoo {
   private static final int b = 16;
   public static final int a = Integer.MIN_VALUE;
   private final int c;
   private final axb d;
   private final ir.a e = new ir.a();
   private final ir.a f = new ir.a();

   public eoo(dcc $$0) {
      this.c = $$0.J_() - 1;
      int $$1 = $$0.am();
      int $$2 = aym.e($$1 - this.c + 1);
      this.d = new aza($$2, 256);
   }

   public void a(duy $$0) {
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

   private int a(duy $$0, int $$1, int $$2, int $$3) {
      int $$4 = jt.c($$0.g($$1) + 1);
      ir.a $$5 = this.e.d($$2, $$4, $$3);
      ir.a $$6 = this.f.a($$5, iw.a);
      dtc $$7 = dfe.a.n();

      for (int $$8 = $$1; $$8 >= 0; $$8--) {
         dvj $$9 = $$0.b($$8);
         if ($$9.c()) {
            $$7 = dfe.a.n();
            int $$10 = $$0.g($$8);
            $$5.q(jt.c($$10));
            $$6.q($$5.v() - 1);
         } else {
            for (int $$11 = 15; $$11 >= 0; $$11--) {
               dtc $$12 = $$9.a($$2, $$11, $$3);
               if (a($$0, $$5, $$7, $$6, $$12)) {
                  return $$5.v();
               }

               $$7 = $$12;
               $$5.g($$6);
               $$6.d(iw.a);
            }
         }
      }

      return this.c;
   }

   public boolean a(dbg $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$2 + 1;
      int $$5 = c($$1, $$3);
      int $$6 = this.b($$5);
      if ($$4 < $$6) {
         return false;
      } else {
         ir $$7 = this.e.d($$1, $$2 + 1, $$3);
         dtc $$8 = $$0.a_($$7);
         ir $$9 = this.f.d($$1, $$2, $$3);
         dtc $$10 = $$0.a_($$9);
         if (this.a($$0, $$5, $$6, $$7, $$8, $$9, $$10)) {
            return true;
         } else {
            ir $$11 = this.e.d($$1, $$2 - 1, $$3);
            dtc $$12 = $$0.a_($$11);
            return this.a($$0, $$5, $$6, $$9, $$10, $$11, $$12);
         }
      }
   }

   private boolean a(dbg $$0, int $$1, int $$2, ir $$3, dtc $$4, ir $$5, dtc $$6) {
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

   private int a(dbg $$0, ir $$1, dtc $$2) {
      ir.a $$3 = this.e.g($$1);
      ir.a $$4 = this.f.a($$1, iw.a);
      dtc $$5 = $$2;

      while ($$4.v() >= this.c) {
         dtc $$6 = $$0.a_($$4);
         if (a($$0, $$3, $$5, $$4, $$6)) {
            return $$3.v();
         }

         $$5 = $$6;
         $$3.g($$4);
         $$4.d(iw.a);
      }

      return this.c;
   }

   private static boolean a(dbg $$0, ir $$1, dtc $$2, ir $$3, dtc $$4) {
      if ($$4.b($$0, $$3) != 0) {
         return true;
      } else {
         exn $$5 = eov.a($$0, $$1, $$2, iw.a);
         exn $$6 = eov.a($$0, $$3, $$4, iw.b);
         return exk.b($$5, $$6);
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
