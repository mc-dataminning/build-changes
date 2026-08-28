public abstract class fdd {
   private static final jo.a[] d = jo.a.values();
   protected final int a;
   protected final int b;
   protected final int c;

   protected fdd(int $$0, int $$1, int $$2) {
      if ($$0 >= 0 && $$1 >= 0 && $$2 >= 0) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      } else {
         throw new IllegalArgumentException("Need all positive sizes: x: " + $$0 + ", y: " + $$1 + ", z: " + $$2);
      }
   }

   public fdd a(h $$0) {
      if ($$0 == h.a) {
         return this;
      } else {
         jo.a $$1 = $$0.b(jo.a.a);
         jo.a $$2 = $$0.b(jo.a.b);
         jo.a $$3 = $$0.b(jo.a.c);
         int $$4 = $$1.a(this.a, this.b, this.c);
         int $$5 = $$2.a(this.a, this.b, this.c);
         int $$6 = $$3.a(this.a, this.b, this.c);
         boolean $$7 = $$0.a($$1);
         boolean $$8 = $$0.a($$2);
         boolean $$9 = $$0.a($$3);
         boolean $$10 = $$1.a($$7, $$8, $$9);
         boolean $$11 = $$2.a($$7, $$8, $$9);
         boolean $$12 = $$3.a($$7, $$8, $$9);
         fdd $$13 = new fcx($$4, $$5, $$6);

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

   public boolean a(jg $$0, int $$1, int $$2, int $$3) {
      return this.e($$0.a($$1, $$2, $$3, jo.a.a), $$0.a($$1, $$2, $$3, jo.a.b), $$0.a($$1, $$2, $$3, jo.a.c));
   }

   public boolean e(int $$0, int $$1, int $$2) {
      if ($$0 < 0 || $$1 < 0 || $$2 < 0) {
         return false;
      } else {
         return $$0 < this.a && $$1 < this.b && $$2 < this.c ? this.b($$0, $$1, $$2) : false;
      }
   }

   public boolean b(jg $$0, int $$1, int $$2, int $$3) {
      return this.b($$0.a($$1, $$2, $$3, jo.a.a), $$0.a($$1, $$2, $$3, jo.a.b), $$0.a($$1, $$2, $$3, jo.a.c));
   }

   public abstract boolean b(int var1, int var2, int var3);

   public abstract void c(int var1, int var2, int var3);

   public boolean a() {
      for (jo.a $$0 : d) {
         if (this.a($$0) >= this.b($$0)) {
            return true;
         }
      }

      return false;
   }

   public abstract int a(jo.a var1);

   public abstract int b(jo.a var1);

   public int a(jo.a $$0, int $$1, int $$2) {
      int $$3 = this.c($$0);
      if ($$1 >= 0 && $$2 >= 0) {
         jo.a $$4 = jg.b.a($$0);
         jo.a $$5 = jg.c.a($$0);
         if ($$1 < this.c($$4) && $$2 < this.c($$5)) {
            jg $$6 = jg.a(jo.a.a, $$0);

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

   public int b(jo.a $$0, int $$1, int $$2) {
      if ($$1 >= 0 && $$2 >= 0) {
         jo.a $$3 = jg.b.a($$0);
         jo.a $$4 = jg.c.a($$0);
         if ($$1 < this.c($$3) && $$2 < this.c($$4)) {
            int $$5 = this.c($$0);
            jg $$6 = jg.a(jo.a.a, $$0);

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

   public int c(jo.a $$0) {
      return $$0.a(this.a, this.b, this.c);
   }

   public int b() {
      return this.c(jo.a.a);
   }

   public int c() {
      return this.c(jo.a.b);
   }

   public int d() {
      return this.c(jo.a.c);
   }

   public void a(fdd.b $$0, boolean $$1) {
      this.a($$0, jg.a, $$1);
      this.a($$0, jg.b, $$1);
      this.a($$0, jg.c, $$1);
   }

   private void a(fdd.b $$0, jg $$1, boolean $$2) {
      jg $$3 = $$1.a();
      int $$4 = this.c($$3.a(jo.a.a));
      int $$5 = this.c($$3.a(jo.a.b));
      int $$6 = this.c($$3.a(jo.a.c));

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
                        $$3.a($$7, $$8, $$10, jo.a.a),
                        $$3.a($$7, $$8, $$10, jo.a.b),
                        $$3.a($$7, $$8, $$10, jo.a.c),
                        $$3.a($$7, $$8, $$10 + 1, jo.a.a),
                        $$3.a($$7, $$8, $$10 + 1, jo.a.b),
                        $$3.a($$7, $$8, $$10 + 1, jo.a.c)
                     );
                  }
               } else if ($$9 != -1) {
                  $$0.consume(
                     $$3.a($$7, $$8, $$9, jo.a.a),
                     $$3.a($$7, $$8, $$9, jo.a.b),
                     $$3.a($$7, $$8, $$9, jo.a.c),
                     $$3.a($$7, $$8, $$10, jo.a.a),
                     $$3.a($$7, $$8, $$10, jo.a.b),
                     $$3.a($$7, $$8, $$10, jo.a.c)
                  );
                  $$9 = -1;
               }
            }
         }
      }
   }

   public void b(fdd.b $$0, boolean $$1) {
      fcx.a(this, $$0, $$1);
   }

   public void a(fdd.a $$0) {
      this.a($$0, jg.a);
      this.a($$0, jg.b);
      this.a($$0, jg.c);
   }

   private void a(fdd.a $$0, jg $$1) {
      jg $$2 = $$1.a();
      jo.a $$3 = $$2.a(jo.a.c);
      int $$4 = this.c($$2.a(jo.a.a));
      int $$5 = this.c($$2.a(jo.a.b));
      int $$6 = this.c($$3);
      jo $$7 = jo.a($$3, jo.b.b);
      jo $$8 = jo.a($$3, jo.b.a);

      for (int $$9 = 0; $$9 < $$4; $$9++) {
         for (int $$10 = 0; $$10 < $$5; $$10++) {
            boolean $$11 = false;

            for (int $$12 = 0; $$12 <= $$6; $$12++) {
               boolean $$13 = $$12 != $$6 && this.b($$2, $$9, $$10, $$12);
               if (!$$11 && $$13) {
                  $$0.consume($$7, $$2.a($$9, $$10, $$12, jo.a.a), $$2.a($$9, $$10, $$12, jo.a.b), $$2.a($$9, $$10, $$12, jo.a.c));
               }

               if ($$11 && !$$13) {
                  $$0.consume($$8, $$2.a($$9, $$10, $$12 - 1, jo.a.a), $$2.a($$9, $$10, $$12 - 1, jo.a.b), $$2.a($$9, $$10, $$12 - 1, jo.a.c));
               }

               $$11 = $$13;
            }
         }
      }
   }

   public interface a {
      void consume(jo var1, int var2, int var3, int var4);
   }

   public interface b {
      void consume(int var1, int var2, int var3, int var4, int var5, int var6);
   }
}
