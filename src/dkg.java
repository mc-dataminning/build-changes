import java.util.Arrays;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableDouble;

public interface dkg {
   static dkg a(dky $$0, cpe $$1, dla $$2, dlh $$3, int $$4, int $$5, dkg.a $$6) {
      return new dkg.c($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   static dkg a(final dkg.a $$0) {
      return new dkg() {
         @Nullable
         @Override
         public dfl a(dkn.b $$0x, double $$1) {
            return $$1 > 0.0 ? null : $$0.computeFluid($$0.a(), $$0.b(), $$0.c()).a($$0.b());
         }

         @Override
         public boolean a() {
            return false;
         }
      };
   }

   @Nullable
   dfl a(dkn.b var1, double var2);

   boolean a();

   public interface a {
      dkg.b computeFluid(int var1, int var2, int var3);
   }

   public static final class b {
      final int a;
      final dfl b;

      public b(int $$0, dfl $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public dfl a(int $$0) {
         return $$0 < this.a ? this.b : csy.a.n();
      }
   }

   public static class c implements dkg {
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
      private static final double k = a(ary.h(10), ary.h(12));
      private final dky l;
      private final dkn m;
      private final dkn n;
      private final dkn o;
      private final dkn p;
      private final dlh q;
      private final dkg.b[] r;
      private final long[] s;
      private final dkg.a t;
      private final dkn u;
      private final dkn v;
      private boolean w;
      private final int x;
      private final int y;
      private final int z;
      private final int A;
      private final int B;
      private static final int[][] C = new int[][]{
         {0, 0}, {-2, -1}, {-1, -1}, {0, -1}, {1, -1}, {-3, 0}, {-2, 0}, {-1, 0}, {1, 0}, {-2, 1}, {-1, 1}, {0, 1}, {1, 1}
      };

      c(dky $$0, cpe $$1, dla $$2, dlh $$3, int $$4, int $$5, dkg.a $$6) {
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
         this.r = new dkg.b[$$11];
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
      public dfl a(dkn.b $$0, double $$1) {
         int $$2 = $$0.a();
         int $$3 = $$0.b();
         int $$4 = $$0.c();
         if ($$1 > 0.0) {
            this.w = false;
            return null;
         } else {
            dkg.b $$5 = this.t.computeFluid($$2, $$3, $$4);
            if ($$5.a($$3).a(csy.H)) {
               this.w = false;
               return csy.H.n();
            } else {
               int $$6 = Math.floorDiv($$2 - 5, 16);
               int $$7 = Math.floorDiv($$3 + 1, 12);
               int $$8 = Math.floorDiv($$4 - 5, 16);
               int $$9 = Integer.MAX_VALUE;
               int $$10 = Integer.MAX_VALUE;
               int $$11 = Integer.MAX_VALUE;
               long $$12 = 0L;
               long $$13 = 0L;
               long $$14 = 0L;

               for (int $$15 = 0; $$15 <= 1; $$15++) {
                  for (int $$16 = -1; $$16 <= 1; $$16++) {
                     for (int $$17 = 0; $$17 <= 1; $$17++) {
                        int $$18 = $$6 + $$15;
                        int $$19 = $$7 + $$16;
                        int $$20 = $$8 + $$17;
                        int $$21 = this.a($$18, $$19, $$20);
                        long $$22 = this.s[$$21];
                        long $$23;
                        if ($$22 != Long.MAX_VALUE) {
                           $$23 = $$22;
                        } else {
                           ase $$24 = this.q.a($$18, $$19, $$20);
                           $$23 = gw.a($$18 * 16 + $$24.a(10), $$19 * 12 + $$24.a(9), $$20 * 16 + $$24.a(10));
                           this.s[$$21] = $$23;
                        }

                        int $$26 = gw.a($$23) - $$2;
                        int $$27 = gw.b($$23) - $$3;
                        int $$28 = gw.c($$23) - $$4;
                        int $$29 = $$26 * $$26 + $$27 * $$27 + $$28 * $$28;
                        if ($$9 >= $$29) {
                           $$14 = $$13;
                           $$13 = $$12;
                           $$12 = $$23;
                           $$11 = $$10;
                           $$10 = $$9;
                           $$9 = $$29;
                        } else if ($$10 >= $$29) {
                           $$14 = $$13;
                           $$13 = $$23;
                           $$11 = $$10;
                           $$10 = $$29;
                        } else if ($$11 >= $$29) {
                           $$14 = $$23;
                           $$11 = $$29;
                        }
                     }
                  }
               }

               dkg.b $$30 = this.a($$12);
               double $$31 = a($$9, $$10);
               dfl $$32 = $$30.a($$3);
               if ($$31 <= 0.0) {
                  this.w = $$31 >= k;
                  return $$32;
               } else if ($$32.a(csy.G) && this.t.computeFluid($$2, $$3 - 1, $$4).a($$3 - 1).a(csy.H)) {
                  this.w = true;
                  return $$32;
               } else {
                  MutableDouble $$34 = new MutableDouble(Double.NaN);
                  dkg.b $$35 = this.a($$13);
                  double $$36 = $$31 * this.a($$0, $$34, $$30, $$35);
                  if ($$1 + $$36 > 0.0) {
                     this.w = false;
                     return null;
                  } else {
                     dkg.b $$37 = this.a($$14);
                     double $$38 = a($$9, $$11);
                     if ($$38 > 0.0) {
                        double $$39 = $$31 * $$38 * this.a($$0, $$34, $$30, $$37);
                        if ($$1 + $$39 > 0.0) {
                           this.w = false;
                           return null;
                        }
                     }

                     double $$40 = a($$10, $$11);
                     if ($$40 > 0.0) {
                        double $$41 = $$31 * $$40 * this.a($$0, $$34, $$35, $$37);
                        if ($$1 + $$41 > 0.0) {
                           this.w = false;
                           return null;
                        }
                     }

                     this.w = true;
                     return $$32;
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

      private double a(dkn.b $$0, MutableDouble $$1, dkg.b $$2, dkg.b $$3) {
         int $$4 = $$0.b();
         dfl $$5 = $$2.a($$4);
         dfl $$6 = $$3.a($$4);
         if ((!$$5.a(csy.H) || !$$6.a(csy.G)) && (!$$5.a(csy.G) || !$$6.a(csy.H))) {
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

      private dkg.b a(long $$0) {
         int $$1 = gw.a($$0);
         int $$2 = gw.b($$0);
         int $$3 = gw.c($$0);
         int $$4 = this.a($$1);
         int $$5 = this.b($$2);
         int $$6 = this.c($$3);
         int $$7 = this.a($$4, $$5, $$6);
         dkg.b $$8 = this.r[$$7];
         if ($$8 != null) {
            return $$8;
         } else {
            dkg.b $$9 = this.b($$1, $$2, $$3);
            this.r[$$7] = $$9;
            return $$9;
         }
      }

      private dkg.b b(int $$0, int $$1, int $$2) {
         dkg.b $$3 = this.t.computeFluid($$0, $$1, $$2);
         int $$4 = Integer.MAX_VALUE;
         int $$5 = $$1 + 12;
         int $$6 = $$1 - 12;
         boolean $$7 = false;

         for (int[] $$8 : C) {
            int $$9 = $$0 + hz.c($$8[0]);
            int $$10 = $$2 + hz.c($$8[1]);
            int $$11 = this.l.a($$9, $$10);
            int $$12 = $$11 + 8;
            boolean $$13 = $$8[0] == 0 && $$8[1] == 0;
            if ($$13 && $$6 > $$12) {
               return $$3;
            }

            boolean $$14 = $$5 > $$12;
            if ($$14 || $$13) {
               dkg.b $$15 = this.t.computeFluid($$9, $$12, $$10);
               if (!$$15.a($$12).i()) {
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
         return new dkg.b($$16, this.a($$0, $$1, $$2, $$3, $$16));
      }

      private int a(int $$0, int $$1, int $$2, dkg.b $$3, int $$4, boolean $$5) {
         dkn.e $$6 = new dkn.e($$0, $$1, $$2);
         double $$7;
         double $$8;
         if (crl.a(this.u, this.v, $$6)) {
            $$7 = -1.0;
            $$8 = -1.0;
         } else {
            int $$9 = $$4 + 8 - $$1;
            int $$10 = 64;
            double $$11 = $$5 ? ary.a((double)$$9, 0.0, 64.0, 1.0, 0.0) : 0.0;
            double $$12 = ary.a(this.n.a($$6), -1.0, 1.0);
            double $$13 = ary.b($$11, 1.0, 0.0, -0.3, 0.8);
            double $$14 = ary.b($$11, 1.0, 0.0, -0.8, 0.4);
            $$7 = $$12 - $$14;
            $$8 = $$12 - $$13;
         }

         int $$17;
         if ($$8 > 0.0) {
            $$17 = $$3.a;
         } else if ($$7 > 0.0) {
            $$17 = this.a($$0, $$1, $$2, $$4);
         } else {
            $$17 = diu.g;
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
         double $$11 = this.o.a(new dkn.e($$6, $$7, $$8)) * 10.0;
         int $$12 = ary.a($$11, 3);
         int $$13 = $$9 + $$12;
         return Math.min($$3, $$13);
      }

      private dfl a(int $$0, int $$1, int $$2, dkg.b $$3, int $$4) {
         dfl $$5 = $$3.b;
         if ($$4 <= -10 && $$4 != diu.g && $$3.b != csy.H.n()) {
            int $$6 = 64;
            int $$7 = 40;
            int $$8 = Math.floorDiv($$0, 64);
            int $$9 = Math.floorDiv($$1, 40);
            int $$10 = Math.floorDiv($$2, 64);
            double $$11 = this.p.a(new dkn.e($$8, $$9, $$10));
            if (Math.abs($$11) > 0.3) {
               $$5 = csy.H.n();
            }
         }

         return $$5;
      }
   }
}
