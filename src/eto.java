public abstract class eto {
   private static final ir.a[] d = ir.a.values();
   protected final int a;
   protected final int b;
   protected final int c;

   protected eto(int $$0, int $$1, int $$2) {
      if ($$0 >= 0 && $$1 >= 0 && $$2 >= 0) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      } else {
         throw new IllegalArgumentException("Need all positive sizes: x: " + $$0 + ", y: " + $$1 + ", z: " + $$2);
      }
   }

   public boolean a(ij $$0, int $$1, int $$2, int $$3) {
      return this.e($$0.a($$1, $$2, $$3, ir.a.a), $$0.a($$1, $$2, $$3, ir.a.b), $$0.a($$1, $$2, $$3, ir.a.c));
   }

   public boolean e(int $$0, int $$1, int $$2) {
      if ($$0 < 0 || $$1 < 0 || $$2 < 0) {
         return false;
      } else {
         return $$0 < this.a && $$1 < this.b && $$2 < this.c ? this.b($$0, $$1, $$2) : false;
      }
   }

   public boolean b(ij $$0, int $$1, int $$2, int $$3) {
      return this.b($$0.a($$1, $$2, $$3, ir.a.a), $$0.a($$1, $$2, $$3, ir.a.b), $$0.a($$1, $$2, $$3, ir.a.c));
   }

   public abstract boolean b(int var1, int var2, int var3);

   public abstract void c(int var1, int var2, int var3);

   public boolean a() {
      for (ir.a $$0 : d) {
         if (this.a($$0) >= this.b($$0)) {
            return true;
         }
      }

      return false;
   }

   public abstract int a(ir.a var1);

   public abstract int b(ir.a var1);

   public int a(ir.a $$0, int $$1, int $$2) {
      int $$3 = this.c($$0);
      if ($$1 >= 0 && $$2 >= 0) {
         ir.a $$4 = ij.b.a($$0);
         ir.a $$5 = ij.c.a($$0);
         if ($$1 < this.c($$4) && $$2 < this.c($$5)) {
            ij $$6 = ij.a(ir.a.a, $$0);

            for (int $$7 = 0; $$7 < $$3; $$7++) {
               if (this.b($$6, $$7, $$1, $$2)) {
                  return $$7;
               }
            }

            return $$3;
         } else {
            return $$3;
         }
      } else {
         return $$3;
      }
   }

   public int b(ir.a $$0, int $$1, int $$2) {
      if ($$1 >= 0 && $$2 >= 0) {
         ir.a $$3 = ij.b.a($$0);
         ir.a $$4 = ij.c.a($$0);
         if ($$1 < this.c($$3) && $$2 < this.c($$4)) {
            int $$5 = this.c($$0);
            ij $$6 = ij.a(ir.a.a, $$0);

            for (int $$7 = $$5 - 1; $$7 >= 0; $$7--) {
               if (this.b($$6, $$7, $$1, $$2)) {
                  return $$7 + 1;
               }
            }

            return 0;
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   public int c(ir.a $$0) {
      return $$0.a(this.a, this.b, this.c);
   }

   public int b() {
      return this.c(ir.a.a);
   }

   public int c() {
      return this.c(ir.a.b);
   }

   public int d() {
      return this.c(ir.a.c);
   }

   public void a(eto.b $$0, boolean $$1) {
      this.a($$0, ij.a, $$1);
      this.a($$0, ij.b, $$1);
      this.a($$0, ij.c, $$1);
   }

   private void a(eto.b $$0, ij $$1, boolean $$2) {
      ij $$3 = $$1.a();
      int $$4 = this.c($$3.a(ir.a.a));
      int $$5 = this.c($$3.a(ir.a.b));
      int $$6 = this.c($$3.a(ir.a.c));

      for (int $$7 = 0; $$7 <= $$4; $$7++) {
         for (int $$8 = 0; $$8 <= $$5; $$8++) {
            int $$9 = -1;

            for (int $$10 = 0; $$10 <= $$6; $$10++) {
               int $$11 = 0;
               int $$12 = 0;

               for (int $$13 = 0; $$13 <= 1; $$13++) {
                  for (int $$14 = 0; $$14 <= 1; $$14++) {
                     if (this.a($$3, $$7 + $$13 - 1, $$8 + $$14 - 1, $$10)) {
                        $$11++;
                        $$12 ^= $$13 ^ $$14;
                     }
                  }
               }

               if ($$11 == 1 || $$11 == 3 || $$11 == 2 && ($$12 & 1) == 0) {
                  if ($$2) {
                     if ($$9 == -1) {
                        $$9 = $$10;
                     }
                  } else {
                     $$0.consume(
                        $$3.a($$7, $$8, $$10, ir.a.a),
                        $$3.a($$7, $$8, $$10, ir.a.b),
                        $$3.a($$7, $$8, $$10, ir.a.c),
                        $$3.a($$7, $$8, $$10 + 1, ir.a.a),
                        $$3.a($$7, $$8, $$10 + 1, ir.a.b),
                        $$3.a($$7, $$8, $$10 + 1, ir.a.c)
                     );
                  }
               } else if ($$9 != -1) {
                  $$0.consume(
                     $$3.a($$7, $$8, $$9, ir.a.a),
                     $$3.a($$7, $$8, $$9, ir.a.b),
                     $$3.a($$7, $$8, $$9, ir.a.c),
                     $$3.a($$7, $$8, $$10, ir.a.a),
                     $$3.a($$7, $$8, $$10, ir.a.b),
                     $$3.a($$7, $$8, $$10, ir.a.c)
                  );
                  $$9 = -1;
               }
            }
         }
      }
   }

   public void b(eto.b $$0, boolean $$1) {
      eti.a(this, $$0, $$1);
   }

   public void a(eto.a $$0) {
      this.a($$0, ij.a);
      this.a($$0, ij.b);
      this.a($$0, ij.c);
   }

   private void a(eto.a $$0, ij $$1) {
      ij $$2 = $$1.a();
      ir.a $$3 = $$2.a(ir.a.c);
      int $$4 = this.c($$2.a(ir.a.a));
      int $$5 = this.c($$2.a(ir.a.b));
      int $$6 = this.c($$3);
      ir $$7 = ir.a($$3, ir.b.b);
      ir $$8 = ir.a($$3, ir.b.a);

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         for (int $$10 = 0; $$10 < $$5; $$10++) {
            boolean $$11 = false;

            for (int $$12 = 0; $$12 <= $$6; $$12++) {
               boolean $$13 = $$12 != $$6 && this.b($$2, $$9, $$10, $$12);
               if (!$$11 && $$13) {
                  $$0.consume($$7, $$2.a($$9, $$10, $$12, ir.a.a), $$2.a($$9, $$10, $$12, ir.a.b), $$2.a($$9, $$10, $$12, ir.a.c));
               }

               if ($$11 && !$$13) {
                  $$0.consume($$8, $$2.a($$9, $$10, $$12 - 1, ir.a.a), $$2.a($$9, $$10, $$12 - 1, ir.a.b), $$2.a($$9, $$10, $$12 - 1, ir.a.c));
               }

               $$11 = $$13;
            }
         }
      }
   }

   public interface a {
      void consume(ir var1, int var2, int var3, int var4);
   }

   public interface b {
      void consume(int var1, int var2, int var3, int var4, int var5, int var6);
   }
}
