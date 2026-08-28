public abstract class ffl {
   private static final jb.a[] d = jb.a.values();
   protected final int a;
   protected final int b;
   protected final int c;

   protected ffl(int $$0, int $$1, int $$2) {
      if ($$0 >= 0 && $$1 >= 0 && $$2 >= 0) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      } else {
         throw new IllegalArgumentException("Need all positive sizes: x: " + $$0 + ", y: " + $$1 + ", z: " + $$2);
      }
   }

   public ffl a(h $$0) {
      if ($$0 == h.a) {
         return this;
      } else {
         jb.a $$1 = $$0.b(jb.a.a);
         jb.a $$2 = $$0.b(jb.a.b);
         jb.a $$3 = $$0.b(jb.a.c);
         int $$4 = $$1.a(this.a, this.b, this.c);
         int $$5 = $$2.a(this.a, this.b, this.c);
         int $$6 = $$3.a(this.a, this.b, this.c);
         boolean $$7 = $$0.a($$1);
         boolean $$8 = $$0.a($$2);
         boolean $$9 = $$0.a($$3);
         boolean $$10 = $$1.a($$7, $$8, $$9);
         boolean $$11 = $$2.a($$7, $$8, $$9);
         boolean $$12 = $$3.a($$7, $$8, $$9);
         ffl $$13 = new fff($$4, $$5, $$6);

         for (int $$14 = 0; $$14 < this.a; $$14++) {
            for (int $$15 = 0; $$15 < this.b; $$15++) {
               for (int $$16 = 0; $$16 < this.c; $$16++) {
                  if (this.b($$14, $$15, $$16)) {
                     int $$17 = $$1.a($$14, $$15, $$16);
                     int $$18 = $$2.a($$14, $$15, $$16);
                     int $$19 = $$3.a($$14, $$15, $$16);
                     $$13.c($$10 ? $$4 - 1 - $$17 : $$17, $$11 ? $$5 - 1 - $$18 : $$18, $$12 ? $$6 - 1 - $$19 : $$19);
                  }
               }
            }
         }

         return $$13;
      }
   }

   public boolean a(is $$0, int $$1, int $$2, int $$3) {
      return this.e($$0.a($$1, $$2, $$3, jb.a.a), $$0.a($$1, $$2, $$3, jb.a.b), $$0.a($$1, $$2, $$3, jb.a.c));
   }

   public boolean e(int $$0, int $$1, int $$2) {
      if ($$0 < 0 || $$1 < 0 || $$2 < 0) {
         return false;
      } else {
         return $$0 < this.a && $$1 < this.b && $$2 < this.c ? this.b($$0, $$1, $$2) : false;
      }
   }

   public boolean b(is $$0, int $$1, int $$2, int $$3) {
      return this.b($$0.a($$1, $$2, $$3, jb.a.a), $$0.a($$1, $$2, $$3, jb.a.b), $$0.a($$1, $$2, $$3, jb.a.c));
   }

   public abstract boolean b(int var1, int var2, int var3);

   public abstract void c(int var1, int var2, int var3);

   public boolean a() {
      for (jb.a $$0 : d) {
         if (this.a($$0) >= this.b($$0)) {
            return true;
         }
      }

      return false;
   }

   public abstract int a(jb.a var1);

   public abstract int b(jb.a var1);

   public int a(jb.a $$0, int $$1, int $$2) {
      int $$3 = this.c($$0);
      if ($$1 >= 0 && $$2 >= 0) {
         jb.a $$4 = is.b.a($$0);
         jb.a $$5 = is.c.a($$0);
         if ($$1 < this.c($$4) && $$2 < this.c($$5)) {
            is $$6 = is.a(jb.a.a, $$0);

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

   public int b(jb.a $$0, int $$1, int $$2) {
      if ($$1 >= 0 && $$2 >= 0) {
         jb.a $$3 = is.b.a($$0);
         jb.a $$4 = is.c.a($$0);
         if ($$1 < this.c($$3) && $$2 < this.c($$4)) {
            int $$5 = this.c($$0);
            is $$6 = is.a(jb.a.a, $$0);

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

   public int c(jb.a $$0) {
      return $$0.a(this.a, this.b, this.c);
   }

   public int b() {
      return this.c(jb.a.a);
   }

   public int c() {
      return this.c(jb.a.b);
   }

   public int d() {
      return this.c(jb.a.c);
   }

   public void a(ffl.b $$0, boolean $$1) {
      this.a($$0, is.a, $$1);
      this.a($$0, is.b, $$1);
      this.a($$0, is.c, $$1);
   }

   private void a(ffl.b $$0, is $$1, boolean $$2) {
      is $$3 = $$1.a();
      int $$4 = this.c($$3.a(jb.a.a));
      int $$5 = this.c($$3.a(jb.a.b));
      int $$6 = this.c($$3.a(jb.a.c));

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
                        $$3.a($$7, $$8, $$10, jb.a.a),
                        $$3.a($$7, $$8, $$10, jb.a.b),
                        $$3.a($$7, $$8, $$10, jb.a.c),
                        $$3.a($$7, $$8, $$10 + 1, jb.a.a),
                        $$3.a($$7, $$8, $$10 + 1, jb.a.b),
                        $$3.a($$7, $$8, $$10 + 1, jb.a.c)
                     );
                  }
               } else if ($$9 != -1) {
                  $$0.consume(
                     $$3.a($$7, $$8, $$9, jb.a.a),
                     $$3.a($$7, $$8, $$9, jb.a.b),
                     $$3.a($$7, $$8, $$9, jb.a.c),
                     $$3.a($$7, $$8, $$10, jb.a.a),
                     $$3.a($$7, $$8, $$10, jb.a.b),
                     $$3.a($$7, $$8, $$10, jb.a.c)
                  );
                  $$9 = -1;
               }
            }
         }
      }
   }

   public void b(ffl.b $$0, boolean $$1) {
      fff.a(this, $$0, $$1);
   }

   public void a(ffl.a $$0) {
      this.a($$0, is.a);
      this.a($$0, is.b);
      this.a($$0, is.c);
   }

   private void a(ffl.a $$0, is $$1) {
      is $$2 = $$1.a();
      jb.a $$3 = $$2.a(jb.a.c);
      int $$4 = this.c($$2.a(jb.a.a));
      int $$5 = this.c($$2.a(jb.a.b));
      int $$6 = this.c($$3);
      jb $$7 = jb.a($$3, jb.b.b);
      jb $$8 = jb.a($$3, jb.b.a);

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         for (int $$10 = 0; $$10 < $$5; $$10++) {
            boolean $$11 = false;

            for (int $$12 = 0; $$12 <= $$6; $$12++) {
               boolean $$13 = $$12 != $$6 && this.b($$2, $$9, $$10, $$12);
               if (!$$11 && $$13) {
                  $$0.consume($$7, $$2.a($$9, $$10, $$12, jb.a.a), $$2.a($$9, $$10, $$12, jb.a.b), $$2.a($$9, $$10, $$12, jb.a.c));
               }

               if ($$11 && !$$13) {
                  $$0.consume($$8, $$2.a($$9, $$10, $$12 - 1, jb.a.a), $$2.a($$9, $$10, $$12 - 1, jb.a.b), $$2.a($$9, $$10, $$12 - 1, jb.a.c));
               }

               $$11 = $$13;
            }
         }
      }
   }

   public interface a {
      void consume(jb var1, int var2, int var3, int var4);
   }

   public interface b {
      void consume(int var1, int var2, int var3, int var4, int var5, int var6);
   }
}
