import java.util.Arrays;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableDouble;

public interface eez {
   static eez a(efr $$0, dhw $$1, eft $$2, ega $$3, int $$4, int $$5, eez.a $$6) {
      return new eez.c($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   static eez a(final eez.a $$0) {
      return new eez() {
         @Nullable
         @Override
         public dzo a(efg.b $$0x, double $$1) {
            return $$1 > 0.0 ? null : $$0.computeFluid($$0.a(), $$0.b(), $$0.c()).a($$0.b());
         }

         @Override
         public boolean a() {
            return false;
         }
      };
   }

   @Nullable
   dzo a(efg.b var1, double var2);

   boolean a();

   public interface a {
      eez.b computeFluid(int var1, int var2, int var3);
   }

   public static record b(int a, dzo b) {

      public dzo a(int $$0) {
         return $$0 < this.a ? this.b : dlw.a.m();
      }
   }

   public static class c implements eez {
      private static final int a = 10;
      private static final int b = 9;
      private static final int c = 10;
      private static final int d = 6;
      private static final int e = 3;
      private static final int f = 6;
      private static final int g = 16;
      private static final int h = 12;
      private static final int i = 16;
      private static final int j = 11;
      private static final double k = a(azk.h(10), azk.h(12));
      private final efr l;
      private final efg m;
      private final efg n;
      private final efg o;
      private final efg p;
      private final ega q;
      private final eez.b[] r;
      private final long[] s;
      private final eez.a t;
      private final efg u;
      private final efg v;
      private boolean w;
      private final int x;
      private final int y;
      private final int z;
      private final int A;
      private final int B;
      private static final int[][] C = new int[][]{
         {0, 0}, {-2, -1}, {-1, -1}, {0, -1}, {1, -1}, {-3, 0}, {-2, 0}, {-1, 0}, {1, 0}, {-2, 1}, {-1, 1}, {0, 1}, {1, 1}
      };

      c(efr $$0, dhw $$1, eft $$2, ega $$3, int $$4, int $$5, eez.a $$6) {
         this.l = $$0;
         this.m = $$2.a();
         this.n = $$2.b();
         this.o = $$2.c();
         this.p = $$2.d();
         this.u = $$2.h();
         this.v = $$2.i();
         this.q = $$3;
         this.x = this.a($$1.d()) - 1;
         this.t = $$6;
         int $$7 = this.a($$1.f()) + 1;
         this.A = $$7 - this.x + 1;
         this.y = this.b($$4) - 1;
         int $$8 = this.b($$4 + $$5) + 1;
         int $$9 = $$8 - this.y + 1;
         this.z = this.c($$1.e()) - 1;
         int $$10 = this.c($$1.g()) + 1;
         this.B = $$10 - this.z + 1;
         int $$11 = this.A * $$9 * this.B;
         this.r = new eez.b[$$11];
         this.s = new long[$$11];
         Arrays.fill(this.s, Long.MAX_VALUE);
      }

      private int a(int $$0, int $$1, int $$2) {
         int $$3 = $$0 - this.x;
         int $$4 = $$1 - this.y;
         int $$5 = $$2 - this.z;
         return ($$4 * this.B + $$5) * this.A + $$3;
      }

      @Nullable
      @Override
      public dzo a(efg.b $$0, double $$1) {
         int $$2 = $$0.a();
         int $$3 = $$0.b();
         int $$4 = $$0.c();
         if ($$1 > 0.0) {
            this.w = false;
            return null;
         } else {
            eez.b $$5 = this.t.computeFluid($$2, $$3, $$4);
            if ($$5.a($$3).a(dlw.K)) {
               this.w = false;
               return dlw.K.m();
            } else {
               int $$6 = Math.floorDiv($$2 - 5, 16);
               int $$7 = Math.floorDiv($$3 + 1, 12);
               int $$8 = Math.floorDiv($$4 - 5, 16);
               int $$9 = Integer.MAX_VALUE;
               int $$10 = Integer.MAX_VALUE;
               int $$11 = Integer.MAX_VALUE;
               int $$12 = Integer.MAX_VALUE;
               long $$13 = 0L;
               long $$14 = 0L;
               long $$15 = 0L;
               long $$16 = 0L;

               for (int $$17 = 0; $$17 <= 1; $$17++) {
                  for (int $$18 = -1; $$18 <= 1; $$18++) {
                     for (int $$19 = 0; $$19 <= 1; $$19++) {
                        int $$20 = $$6 + $$17;
                        int $$21 = $$7 + $$18;
                        int $$22 = $$8 + $$19;
                        int $$23 = this.a($$20, $$21, $$22);
                        long $$24 = this.s[$$23];
                        long $$25;
                        if ($$24 != Long.MAX_VALUE) {
                           $$25 = $$24;
                        } else {
                           azt $$26 = this.q.a($$20, $$21, $$22);
                           $$25 = iu.a($$20 * 16 + $$26.a(10), $$21 * 12 + $$26.a(9), $$22 * 16 + $$26.a(10));
                           this.s[$$23] = $$25;
                        }

                        int $$28 = iu.a($$25) - $$2;
                        int $$29 = iu.b($$25) - $$3;
                        int $$30 = iu.c($$25) - $$4;
                        int $$31 = $$28 * $$28 + $$29 * $$29 + $$30 * $$30;
                        if ($$9 >= $$31) {
                           $$16 = $$15;
                           $$15 = $$14;
                           $$14 = $$13;
                           $$13 = $$25;
                           $$12 = $$11;
                           $$11 = $$10;
                           $$10 = $$9;
                           $$9 = $$31;
                        } else if ($$10 >= $$31) {
                           $$16 = $$15;
                           $$15 = $$14;
                           $$14 = $$25;
                           $$12 = $$11;
                           $$11 = $$10;
                           $$10 = $$31;
                        } else if ($$11 >= $$31) {
                           $$16 = $$15;
                           $$15 = $$25;
                           $$12 = $$11;
                           $$11 = $$31;
                        } else if ($$12 >= $$31) {
                           $$16 = $$25;
                           $$12 = $$31;
                        }
                     }
                  }
               }

               eez.b $$32 = this.a($$13);
               double $$33 = a($$9, $$10);
               dzo $$34 = $$32.a($$3);
               if ($$33 <= 0.0) {
                  if ($$33 >= k) {
                     eez.b $$36 = this.a($$14);
                     this.w = !$$32.equals($$36);
                  } else {
                     this.w = false;
                  }

                  return $$34;
               } else if ($$34.a(dlw.J) && this.t.computeFluid($$2, $$3 - 1, $$4).a($$3 - 1).a(dlw.K)) {
                  this.w = true;
                  return $$34;
               } else {
                  MutableDouble $$37 = new MutableDouble(Double.NaN);
                  eez.b $$38 = this.a($$14);
                  double $$39 = $$33 * this.a($$0, $$37, $$32, $$38);
                  if ($$1 + $$39 > 0.0) {
                     this.w = false;
                     return null;
                  } else {
                     eez.b $$40 = this.a($$15);
                     double $$41 = a($$9, $$11);
                     if ($$41 > 0.0) {
                        double $$42 = $$33 * $$41 * this.a($$0, $$37, $$32, $$40);
                        if ($$1 + $$42 > 0.0) {
                           this.w = false;
                           return null;
                        }
                     }

                     double $$43 = a($$10, $$11);
                     if ($$43 > 0.0) {
                        double $$44 = $$33 * $$43 * this.a($$0, $$37, $$38, $$40);
                        if ($$1 + $$44 > 0.0) {
                           this.w = false;
                           return null;
                        }
                     }

                     boolean $$45 = !$$32.equals($$38);
                     boolean $$46 = $$43 >= k && !$$38.equals($$40);
                     boolean $$47 = $$41 >= k && !$$32.equals($$40);
                     if (!$$45 && !$$46 && !$$47) {
                        this.w = $$41 >= k && a($$9, $$12) >= k && !$$32.equals(this.a($$16));
                     } else {
                        this.w = true;
                     }

                     return $$34;
                  }
               }
            }
         }
      }

      @Override
      public boolean a() {
         return this.w;
      }

      private static double a(int $$0, int $$1) {
         double $$2 = 25.0;
         return 1.0 - (double)Math.abs($$1 - $$0) / 25.0;
      }

      private double a(efg.b $$0, MutableDouble $$1, eez.b $$2, eez.b $$3) {
         int $$4 = $$0.b();
         dzo $$5 = $$2.a($$4);
         dzo $$6 = $$3.a($$4);
         if ((!$$5.a(dlw.K) || !$$6.a(dlw.J)) && (!$$5.a(dlw.J) || !$$6.a(dlw.K))) {
            int $$7 = Math.abs($$2.a - $$3.a);
            if ($$7 == 0) {
               return 0.0;
            } else {
               double $$8 = 0.5 * (double)($$2.a + $$3.a);
               double $$9 = (double)$$4 + 0.5 - $$8;
               double $$10 = (double)$$7 / 2.0;
               double $$11 = 0.0;
               double $$12 = 2.5;
               double $$13 = 1.5;
               double $$14 = 3.0;
               double $$15 = 10.0;
               double $$16 = 3.0;
               double $$17 = $$10 - Math.abs($$9);
               double $$19;
               if ($$9 > 0.0) {
                  double $$18 = 0.0 + $$17;
                  if ($$18 > 0.0) {
                     $$19 = $$18 / 1.5;
                  } else {
                     $$19 = $$18 / 2.5;
                  }
               } else {
                  double $$21 = 3.0 + $$17;
                  if ($$21 > 0.0) {
                     $$19 = $$21 / 3.0;
                  } else {
                     $$19 = $$21 / 10.0;
                  }
               }

               double $$24 = 2.0;
               double $$28;
               if (!($$19 < -2.0) && !($$19 > 2.0)) {
                  double $$26 = $$1.getValue();
                  if (Double.isNaN($$26)) {
                     double $$27 = this.m.a($$0);
                     $$1.setValue($$27);
                     $$28 = $$27;
                  } else {
                     $$28 = $$26;
                  }
               } else {
                  $$28 = 0.0;
               }

               return 2.0 * ($$28 + $$19);
            }
         } else {
            return 2.0;
         }
      }

      private int a(int $$0) {
         return Math.floorDiv($$0, 16);
      }

      private int b(int $$0) {
         return Math.floorDiv($$0, 12);
      }

      private int c(int $$0) {
         return Math.floorDiv($$0, 16);
      }

      private eez.b a(long $$0) {
         int $$1 = iu.a($$0);
         int $$2 = iu.b($$0);
         int $$3 = iu.c($$0);
         int $$4 = this.a($$1);
         int $$5 = this.b($$2);
         int $$6 = this.c($$3);
         int $$7 = this.a($$4, $$5, $$6);
         eez.b $$8 = this.r[$$7];
         if ($$8 != null) {
            return $$8;
         } else {
            eez.b $$9 = this.b($$1, $$2, $$3);
            this.r[$$7] = $$9;
            return $$9;
         }
      }

      private eez.b b(int $$0, int $$1, int $$2) {
         eez.b $$3 = this.t.computeFluid($$0, $$1, $$2);
         int $$4 = Integer.MAX_VALUE;
         int $$5 = $$1 + 12;
         int $$6 = $$1 - 12;
         boolean $$7 = false;

         for (int[] $$8 : C) {
            int $$9 = $$0 + jx.c($$8[0]);
            int $$10 = $$2 + jx.c($$8[1]);
            int $$11 = this.l.a($$9, $$10);
            int $$12 = $$11 + 8;
            boolean $$13 = $$8[0] == 0 && $$8[1] == 0;
            if ($$13 && $$6 > $$12) {
               return $$3;
            }

            boolean $$14 = $$5 > $$12;
            if ($$14 || $$13) {
               eez.b $$15 = this.t.computeFluid($$9, $$12, $$10);
               if (!$$15.a($$12).l()) {
                  if ($$13) {
                     $$7 = true;
                  }

                  if ($$14) {
                     return $$15;
                  }
               }
            }

            $$4 = Math.min($$4, $$11);
         }

         int $$16 = this.a($$0, $$1, $$2, $$3, $$4, $$7);
         return new eez.b($$16, this.a($$0, $$1, $$2, $$3, $$16));
      }

      private int a(int $$0, int $$1, int $$2, eez.b $$3, int $$4, boolean $$5) {
         efg.e $$6 = new efg.e($$0, $$1, $$2);
         double $$7;
         double $$8;
         if (dki.a(this.u, this.v, $$6)) {
            $$7 = -1.0;
            $$8 = -1.0;
         } else {
            int $$9 = $$4 + 8 - $$1;
            int $$10 = 64;
            double $$11 = $$5 ? azk.a((double)$$9, 0.0, 64.0, 1.0, 0.0) : 0.0;
            double $$12 = azk.a(this.n.a($$6), -1.0, 1.0);
            double $$13 = azk.b($$11, 1.0, 0.0, -0.3, 0.8);
            double $$14 = azk.b($$11, 1.0, 0.0, -0.8, 0.4);
            $$7 = $$12 - $$14;
            $$8 = $$12 - $$13;
         }

         int $$17;
         if ($$8 > 0.0) {
            $$17 = $$3.a;
         } else if ($$7 > 0.0) {
            $$17 = this.a($$0, $$1, $$2, $$4);
         } else {
            $$17 = edl.g;
         }

         return $$17;
      }

      private int a(int $$0, int $$1, int $$2, int $$3) {
         int $$4 = 16;
         int $$5 = 40;
         int $$6 = Math.floorDiv($$0, 16);
         int $$7 = Math.floorDiv($$1, 40);
         int $$8 = Math.floorDiv($$2, 16);
         int $$9 = $$7 * 40 + 20;
         int $$10 = 10;
         double $$11 = this.o.a(new efg.e($$6, $$7, $$8)) * 10.0;
         int $$12 = azk.a($$11, 3);
         int $$13 = $$9 + $$12;
         return Math.min($$3, $$13);
      }

      private dzo a(int $$0, int $$1, int $$2, eez.b $$3, int $$4) {
         dzo $$5 = $$3.b;
         if ($$4 <= -10 && $$4 != edl.g && $$3.b != dlw.K.m()) {
            int $$6 = 64;
            int $$7 = 40;
            int $$8 = Math.floorDiv($$0, 64);
            int $$9 = Math.floorDiv($$1, 40);
            int $$10 = Math.floorDiv($$2, 64);
            double $$11 = this.p.a(new efg.e($$8, $$9, $$10));
            if (Math.abs($$11) > 0.3) {
               $$5 = dlw.K.m();
            }
         }

         return $$5;
      }
   }
}
