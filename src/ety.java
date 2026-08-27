public abstract class ety {
   private static final is.a[] d = is.a.values();
   protected final int a;
   protected final int b;
   protected final int c;

   protected ety(int $$0, int $$1, int $$2) {
      if ($$0 >= 0 && $$1 >= 0 && $$2 >= 0) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      } else {
         throw new IllegalArgumentException("Need all positive sizes: x: " + $$0 + ", y: " + $$1 + ", z: " + $$2);
      }
   }

   public boolean a(ik $$0, int $$1, int $$2, int $$3) {
      return this.e($$0.a($$1, $$2, $$3, is.a.a), $$0.a($$1, $$2, $$3, is.a.b), $$0.a($$1, $$2, $$3, is.a.c));
   }

   public boolean e(int $$0, int $$1, int $$2) {
      if ($$0 < 0 || $$1 < 0 || $$2 < 0) {
         return false;
      } else {
         return $$0 < this.a && $$1 < this.b && $$2 < this.c ? this.b($$0, $$1, $$2) : false;
      }
   }

   public boolean b(ik $$0, int $$1, int $$2, int $$3) {
      return this.b($$0.a($$1, $$2, $$3, is.a.a), $$0.a($$1, $$2, $$3, is.a.b), $$0.a($$1, $$2, $$3, is.a.c));
   }

   public abstract boolean b(int var1, int var2, int var3);

   public abstract void c(int var1, int var2, int var3);

   public boolean a() {
      for (is.a $$0 : d) {
         if (this.a($$0) >= this.b($$0)) {
            return true;
         }
      }

      return false;
   }

   public abstract int a(is.a var1);

   public abstract int b(is.a var1);

   public int a(is.a $$0, int $$1, int $$2) {
      int $$3 = this.c($$0);
      if ($$1 >= 0 && $$2 >= 0) {
         is.a $$4 = ik.b.a($$0);
         is.a $$5 = ik.c.a($$0);
         if ($$1 < this.c($$4) && $$2 < this.c($$5)) {
            ik $$6 = ik.a(is.a.a, $$0);

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

   public int b(is.a $$0, int $$1, int $$2) {
      if ($$1 >= 0 && $$2 >= 0) {
         is.a $$3 = ik.b.a($$0);
         is.a $$4 = ik.c.a($$0);
         if ($$1 < this.c($$3) && $$2 < this.c($$4)) {
            int $$5 = this.c($$0);
            ik $$6 = ik.a(is.a.a, $$0);

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

   public int c(is.a $$0) {
      return $$0.a(this.a, this.b, this.c);
   }

   public int b() {
      return this.c(is.a.a);
   }

   public int c() {
      return this.c(is.a.b);
   }

   public int d() {
      return this.c(is.a.c);
   }

   public void a(ety.b $$0, boolean $$1) {
      this.a($$0, ik.a, $$1);
      this.a($$0, ik.b, $$1);
      this.a($$0, ik.c, $$1);
   }

   private void a(ety.b $$0, ik $$1, boolean $$2) {
      ik $$3 = $$1.a();
      int $$4 = this.c($$3.a(is.a.a));
      int $$5 = this.c($$3.a(is.a.b));
      int $$6 = this.c($$3.a(is.a.c));

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
                        $$3.a($$7, $$8, $$10, is.a.a),
                        $$3.a($$7, $$8, $$10, is.a.b),
                        $$3.a($$7, $$8, $$10, is.a.c),
                        $$3.a($$7, $$8, $$10 + 1, is.a.a),
                        $$3.a($$7, $$8, $$10 + 1, is.a.b),
                        $$3.a($$7, $$8, $$10 + 1, is.a.c)
                     );
                  }
               } else if ($$9 != -1) {
                  $$0.consume(
                     $$3.a($$7, $$8, $$9, is.a.a),
                     $$3.a($$7, $$8, $$9, is.a.b),
                     $$3.a($$7, $$8, $$9, is.a.c),
                     $$3.a($$7, $$8, $$10, is.a.a),
                     $$3.a($$7, $$8, $$10, is.a.b),
                     $$3.a($$7, $$8, $$10, is.a.c)
                  );
                  $$9 = -1;
               }
            }
         }
      }
   }

   public void b(ety.b $$0, boolean $$1) {
      ets.a(this, $$0, $$1);
   }

   public void a(ety.a $$0) {
      this.a($$0, ik.a);
      this.a($$0, ik.b);
      this.a($$0, ik.c);
   }

   private void a(ety.a $$0, ik $$1) {
      ik $$2 = $$1.a();
      is.a $$3 = $$2.a(is.a.c);
      int $$4 = this.c($$2.a(is.a.a));
      int $$5 = this.c($$2.a(is.a.b));
      int $$6 = this.c($$3);
      is $$7 = is.a($$3, is.b.b);
      is $$8 = is.a($$3, is.b.a);

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         for (int $$10 = 0; $$10 < $$5; $$10++) {
            boolean $$11 = false;

            for (int $$12 = 0; $$12 <= $$6; $$12++) {
               boolean $$13 = $$12 != $$6 && this.b($$2, $$9, $$10, $$12);
               if (!$$11 && $$13) {
                  $$0.consume($$7, $$2.a($$9, $$10, $$12, is.a.a), $$2.a($$9, $$10, $$12, is.a.b), $$2.a($$9, $$10, $$12, is.a.c));
               }

               if ($$11 && !$$13) {
                  $$0.consume($$8, $$2.a($$9, $$10, $$12 - 1, is.a.a), $$2.a($$9, $$10, $$12 - 1, is.a.b), $$2.a($$9, $$10, $$12 - 1, is.a.c));
               }

               $$11 = $$13;
            }
         }
      }
   }

   public interface a {
      void consume(is var1, int var2, int var3, int var4);
   }

   public interface b {
      void consume(int var1, int var2, int var3, int var4, int var5, int var6);
   }
}
