import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class eny {
   public static void a(epf $$0, je $$1, dnx $$2, List<eny.i> $$3, azl $$4) {
      eny.c $$5 = new eny.c($$4);
      eny.d $$6 = new eny.d($$0, $$4);
      $$6.a($$1, $$2, $$3, $$5);
   }

   static class a extends eny.b {
      @Override
      public String a(azl $$0) {
         return "1x1_a" + ($$0.a(5) + 1);
      }

      @Override
      public String b(azl $$0) {
         return "1x1_as" + ($$0.a(4) + 1);
      }

      @Override
      public String a(azl $$0, boolean $$1) {
         return "1x2_a" + ($$0.a(9) + 1);
      }

      @Override
      public String b(azl $$0, boolean $$1) {
         return "1x2_b" + ($$0.a(5) + 1);
      }

      @Override
      public String c(azl $$0) {
         return "1x2_s" + ($$0.a(2) + 1);
      }

      @Override
      public String d(azl $$0) {
         return "2x2_a" + ($$0.a(4) + 1);
      }

      @Override
      public String e(azl $$0) {
         return "2x2_s1";
      }
   }

   abstract static class b {
      public abstract String a(azl var1);

      public abstract String b(azl var1);

      public abstract String a(azl var1, boolean var2);

      public abstract String b(azl var1, boolean var2);

      public abstract String c(azl var1);

      public abstract String d(azl var1);

      public abstract String e(azl var1);
   }

   static class c {
      private static final int a = 11;
      private static final int b = 0;
      private static final int c = 1;
      private static final int d = 2;
      private static final int e = 3;
      private static final int f = 4;
      private static final int g = 5;
      private static final int h = 65536;
      private static final int i = 131072;
      private static final int j = 262144;
      private static final int k = 1048576;
      private static final int l = 2097152;
      private static final int m = 4194304;
      private static final int n = 8388608;
      private static final int o = 983040;
      private static final int p = 65535;
      private final azl q;
      final eny.g r;
      final eny.g s;
      final eny.g[] t;
      final int u;
      final int v;

      public c(azl $$0) {
         this.q = $$0;
         int $$1 = 11;
         this.u = 7;
         this.v = 4;
         this.r = new eny.g(11, 11, 5);
         this.r.a(this.u, this.v, this.u + 1, this.v + 1, 3);
         this.r.a(this.u - 1, this.v, this.u - 1, this.v + 1, 2);
         this.r.a(this.u + 2, this.v - 2, this.u + 3, this.v + 3, 5);
         this.r.a(this.u + 1, this.v - 2, this.u + 1, this.v - 1, 1);
         this.r.a(this.u + 1, this.v + 2, this.u + 1, this.v + 3, 1);
         this.r.a(this.u - 1, this.v - 1, 1);
         this.r.a(this.u - 1, this.v + 2, 1);
         this.r.a(0, 0, 11, 1, 5);
         this.r.a(0, 9, 11, 11, 5);
         this.a(this.r, this.u, this.v - 2, jj.e, 6);
         this.a(this.r, this.u, this.v + 3, jj.e, 6);
         this.a(this.r, this.u - 2, this.v - 1, jj.e, 3);
         this.a(this.r, this.u - 2, this.v + 2, jj.e, 3);

         while (this.a(this.r)) {
         }

         this.t = new eny.g[3];
         this.t[0] = new eny.g(11, 11, 5);
         this.t[1] = new eny.g(11, 11, 5);
         this.t[2] = new eny.g(11, 11, 5);
         this.a(this.r, this.t[0]);
         this.a(this.r, this.t[1]);
         this.t[0].a(this.u + 1, this.v, this.u + 1, this.v + 1, 8388608);
         this.t[1].a(this.u + 1, this.v, this.u + 1, this.v + 1, 8388608);
         this.s = new eny.g(this.r.b, this.r.c, 5);
         this.a();
         this.a(this.s, this.t[2]);
      }

      public static boolean a(eny.g $$0, int $$1, int $$2) {
         int $$3 = $$0.a($$1, $$2);
         return $$3 == 1 || $$3 == 2 || $$3 == 3 || $$3 == 4;
      }

      public boolean a(eny.g $$0, int $$1, int $$2, int $$3, int $$4) {
         return (this.t[$$3].a($$1, $$2) & 65535) == $$4;
      }

      @Nullable
      public jj b(eny.g $$0, int $$1, int $$2, int $$3, int $$4) {
         for (jj $$5 : jj.c.a) {
            if (this.a($$0, $$1 + $$5.j(), $$2 + $$5.l(), $$3, $$4)) {
               return $$5;
            }
         }

         return null;
      }

      private void a(eny.g $$0, int $$1, int $$2, jj $$3, int $$4) {
         if ($$4 > 0) {
            $$0.a($$1, $$2, 1);
            $$0.a($$1 + $$3.j(), $$2 + $$3.l(), 0, 1);

            for (int $$5 = 0; $$5 < 8; $$5++) {
               jj $$6 = jj.b(this.q.a(4));
               if ($$6 != $$3.g() && ($$6 != jj.f || !this.q.h())) {
                  int $$7 = $$1 + $$3.j();
                  int $$8 = $$2 + $$3.l();
                  if ($$0.a($$7 + $$6.j(), $$8 + $$6.l()) == 0 && $$0.a($$7 + $$6.j() * 2, $$8 + $$6.l() * 2) == 0) {
                     this.a($$0, $$1 + $$3.j() + $$6.j(), $$2 + $$3.l() + $$6.l(), $$6, $$4 - 1);
                     break;
                  }
               }
            }

            jj $$9 = $$3.h();
            jj $$10 = $$3.i();
            $$0.a($$1 + $$9.j(), $$2 + $$9.l(), 0, 2);
            $$0.a($$1 + $$10.j(), $$2 + $$10.l(), 0, 2);
            $$0.a($$1 + $$3.j() + $$9.j(), $$2 + $$3.l() + $$9.l(), 0, 2);
            $$0.a($$1 + $$3.j() + $$10.j(), $$2 + $$3.l() + $$10.l(), 0, 2);
            $$0.a($$1 + $$3.j() * 2, $$2 + $$3.l() * 2, 0, 2);
            $$0.a($$1 + $$9.j() * 2, $$2 + $$9.l() * 2, 0, 2);
            $$0.a($$1 + $$10.j() * 2, $$2 + $$10.l() * 2, 0, 2);
         }
      }

      private boolean a(eny.g $$0) {
         boolean $$1 = false;

         for (int $$2 = 0; $$2 < $$0.c; $$2++) {
            for (int $$3 = 0; $$3 < $$0.b; $$3++) {
               if ($$0.a($$3, $$2) == 0) {
                  int $$4 = 0;
                  $$4 += a($$0, $$3 + 1, $$2) ? 1 : 0;
                  $$4 += a($$0, $$3 - 1, $$2) ? 1 : 0;
                  $$4 += a($$0, $$3, $$2 + 1) ? 1 : 0;
                  $$4 += a($$0, $$3, $$2 - 1) ? 1 : 0;
                  if ($$4 >= 3) {
                     $$0.a($$3, $$2, 2);
                     $$1 = true;
                  } else if ($$4 == 2) {
                     int $$5 = 0;
                     $$5 += a($$0, $$3 + 1, $$2 + 1) ? 1 : 0;
                     $$5 += a($$0, $$3 - 1, $$2 + 1) ? 1 : 0;
                     $$5 += a($$0, $$3 + 1, $$2 - 1) ? 1 : 0;
                     $$5 += a($$0, $$3 - 1, $$2 - 1) ? 1 : 0;
                     if ($$5 <= 1) {
                        $$0.a($$3, $$2, 2);
                        $$1 = true;
                     }
                  }
               }
            }
         }

         return $$1;
      }

      private void a() {
         List<bah<Integer, Integer>> $$0 = Lists.newArrayList();
         eny.g $$1 = this.t[1];

         for (int $$2 = 0; $$2 < this.s.c; $$2++) {
            for (int $$3 = 0; $$3 < this.s.b; $$3++) {
               int $$4 = $$1.a($$3, $$2);
               int $$5 = $$4 & 983040;
               if ($$5 == 131072 && ($$4 & 2097152) == 2097152) {
                  $$0.add(new bah<>($$3, $$2));
               }
            }
         }

         if ($$0.isEmpty()) {
            this.s.a(0, 0, this.s.b, this.s.c, 5);
         } else {
            bah<Integer, Integer> $$6 = $$0.get(this.q.a($$0.size()));
            int $$7 = $$1.a($$6.a(), $$6.b());
            $$1.a($$6.a(), $$6.b(), $$7 | 4194304);
            jj $$8 = this.b(this.r, $$6.a(), $$6.b(), 1, $$7 & 65535);
            int $$9 = $$6.a() + $$8.j();
            int $$10 = $$6.b() + $$8.l();

            for (int $$11 = 0; $$11 < this.s.c; $$11++) {
               for (int $$12 = 0; $$12 < this.s.b; $$12++) {
                  if (!a(this.r, $$12, $$11)) {
                     this.s.a($$12, $$11, 5);
                  } else if ($$12 == $$6.a() && $$11 == $$6.b()) {
                     this.s.a($$12, $$11, 3);
                  } else if ($$12 == $$9 && $$11 == $$10) {
                     this.s.a($$12, $$11, 3);
                     this.t[2].a($$12, $$11, 8388608);
                  }
               }
            }

            List<jj> $$13 = Lists.newArrayList();

            for (jj $$14 : jj.c.a) {
               if (this.s.a($$9 + $$14.j(), $$10 + $$14.l()) == 0) {
                  $$13.add($$14);
               }
            }

            if ($$13.isEmpty()) {
               this.s.a(0, 0, this.s.b, this.s.c, 5);
               $$1.a($$6.a(), $$6.b(), $$7);
            } else {
               jj $$15 = $$13.get(this.q.a($$13.size()));
               this.a(this.s, $$9 + $$15.j(), $$10 + $$15.l(), $$15, 4);

               while (this.a(this.s)) {
               }
            }
         }
      }

      private void a(eny.g $$0, eny.g $$1) {
         ObjectArrayList<bah<Integer, Integer>> $$2 = new ObjectArrayList();

         for (int $$3 = 0; $$3 < $$0.c; $$3++) {
            for (int $$4 = 0; $$4 < $$0.b; $$4++) {
               if ($$0.a($$4, $$3) == 2) {
                  $$2.add(new bah<>($$4, $$3));
               }
            }
         }

         ad.c($$2, this.q);
         int $$5 = 10;
         ObjectListIterator var20 = $$2.iterator();

         while (var20.hasNext()) {
            bah<Integer, Integer> $$6 = (bah<Integer, Integer>)var20.next();
            int $$7 = $$6.a();
            int $$8 = $$6.b();
            if ($$1.a($$7, $$8) == 0) {
               int $$9 = $$7;
               int $$10 = $$7;
               int $$11 = $$8;
               int $$12 = $$8;
               int $$13 = 65536;
               if ($$1.a($$7 + 1, $$8) == 0
                  && $$1.a($$7, $$8 + 1) == 0
                  && $$1.a($$7 + 1, $$8 + 1) == 0
                  && $$0.a($$7 + 1, $$8) == 2
                  && $$0.a($$7, $$8 + 1) == 2
                  && $$0.a($$7 + 1, $$8 + 1) == 2) {
                  $$10 = $$7 + 1;
                  $$12 = $$8 + 1;
                  $$13 = 262144;
               } else if ($$1.a($$7 - 1, $$8) == 0
                  && $$1.a($$7, $$8 + 1) == 0
                  && $$1.a($$7 - 1, $$8 + 1) == 0
                  && $$0.a($$7 - 1, $$8) == 2
                  && $$0.a($$7, $$8 + 1) == 2
                  && $$0.a($$7 - 1, $$8 + 1) == 2) {
                  $$9 = $$7 - 1;
                  $$12 = $$8 + 1;
                  $$13 = 262144;
               } else if ($$1.a($$7 - 1, $$8) == 0
                  && $$1.a($$7, $$8 - 1) == 0
                  && $$1.a($$7 - 1, $$8 - 1) == 0
                  && $$0.a($$7 - 1, $$8) == 2
                  && $$0.a($$7, $$8 - 1) == 2
                  && $$0.a($$7 - 1, $$8 - 1) == 2) {
                  $$9 = $$7 - 1;
                  $$11 = $$8 - 1;
                  $$13 = 262144;
               } else if ($$1.a($$7 + 1, $$8) == 0 && $$0.a($$7 + 1, $$8) == 2) {
                  $$10 = $$7 + 1;
                  $$13 = 131072;
               } else if ($$1.a($$7, $$8 + 1) == 0 && $$0.a($$7, $$8 + 1) == 2) {
                  $$12 = $$8 + 1;
                  $$13 = 131072;
               } else if ($$1.a($$7 - 1, $$8) == 0 && $$0.a($$7 - 1, $$8) == 2) {
                  $$9 = $$7 - 1;
                  $$13 = 131072;
               } else if ($$1.a($$7, $$8 - 1) == 0 && $$0.a($$7, $$8 - 1) == 2) {
                  $$11 = $$8 - 1;
                  $$13 = 131072;
               }

               int $$14 = this.q.h() ? $$9 : $$10;
               int $$15 = this.q.h() ? $$11 : $$12;
               int $$16 = 2097152;
               if (!$$0.b($$14, $$15, 1)) {
                  $$14 = $$14 == $$9 ? $$10 : $$9;
                  $$15 = $$15 == $$11 ? $$12 : $$11;
                  if (!$$0.b($$14, $$15, 1)) {
                     $$15 = $$15 == $$11 ? $$12 : $$11;
                     if (!$$0.b($$14, $$15, 1)) {
                        $$14 = $$14 == $$9 ? $$10 : $$9;
                        $$15 = $$15 == $$11 ? $$12 : $$11;
                        if (!$$0.b($$14, $$15, 1)) {
                           $$16 = 0;
                           $$14 = $$9;
                           $$15 = $$11;
                        }
                     }
                  }
               }

               for (int $$17 = $$11; $$17 <= $$12; $$17++) {
                  for (int $$18 = $$9; $$18 <= $$10; $$18++) {
                     if ($$18 == $$14 && $$17 == $$15) {
                        $$1.a($$18, $$17, 1048576 | $$16 | $$13 | $$5);
                     } else {
                        $$1.a($$18, $$17, $$13 | $$5);
                     }
                  }
               }

               $$5++;
            }
         }
      }
   }

   static class d {
      private final epf a;
      private final azl b;
      private int c;
      private int d;

      public d(epf $$0, azl $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public void a(je $$0, dnx $$1, List<eny.i> $$2, eny.c $$3) {
         eny.e $$4 = new eny.e();
         $$4.b = $$0;
         $$4.a = $$1;
         $$4.c = "wall_flat";
         eny.e $$5 = new eny.e();
         this.a($$2, $$4);
         $$5.b = $$4.b.b(8);
         $$5.a = $$4.a;
         $$5.c = "wall_window";
         if (!$$2.isEmpty()) {
         }

         eny.g $$6 = $$3.r;
         eny.g $$7 = $$3.s;
         this.c = $$3.u + 1;
         this.d = $$3.v + 1;
         int $$8 = $$3.u + 1;
         int $$9 = $$3.v;
         this.a($$2, $$4, $$6, jj.d, this.c, this.d, $$8, $$9);
         this.a($$2, $$5, $$6, jj.d, this.c, this.d, $$8, $$9);
         eny.e $$10 = new eny.e();
         $$10.b = $$4.b.b(19);
         $$10.a = $$4.a;
         $$10.c = "wall_window";
         boolean $$11 = false;

         for (int $$12 = 0; $$12 < $$7.c && !$$11; $$12++) {
            for (int $$13 = $$7.b - 1; $$13 >= 0 && !$$11; $$13--) {
               if (eny.c.a($$7, $$13, $$12)) {
                  $$10.b = $$10.b.a($$1.a(jj.d), 8 + ($$12 - this.d) * 8);
                  $$10.b = $$10.b.a($$1.a(jj.f), ($$13 - this.c) * 8);
                  this.b($$2, $$10);
                  this.a($$2, $$10, $$7, jj.d, $$13, $$12, $$13, $$12);
                  $$11 = true;
               }
            }
         }

         this.a($$2, $$0.b(16), $$1, $$6, $$7);
         this.a($$2, $$0.b(27), $$1, $$7, null);
         if (!$$2.isEmpty()) {
         }

         eny.b[] $$14 = new eny.b[]{new eny.a(), new eny.f(), new eny.h()};

         for (int $$15 = 0; $$15 < 3; $$15++) {
            je $$16 = $$0.b(8 * $$15 + ($$15 == 2 ? 3 : 0));
            eny.g $$17 = $$3.t[$$15];
            eny.g $$18 = $$15 == 2 ? $$7 : $$6;
            String $$19 = $$15 == 0 ? "carpet_south_1" : "carpet_south_2";
            String $$20 = $$15 == 0 ? "carpet_west_1" : "carpet_west_2";

            for (int $$21 = 0; $$21 < $$18.c; $$21++) {
               for (int $$22 = 0; $$22 < $$18.b; $$22++) {
                  if ($$18.a($$22, $$21) == 1) {
                     je $$23 = $$16.a($$1.a(jj.d), 8 + ($$21 - this.d) * 8);
                     $$23 = $$23.a($$1.a(jj.f), ($$22 - this.c) * 8);
                     $$2.add(new eny.i(this.a, "corridor_floor", $$23, $$1));
                     if ($$18.a($$22, $$21 - 1) == 1 || ($$17.a($$22, $$21 - 1) & 8388608) == 8388608) {
                        $$2.add(new eny.i(this.a, "carpet_north", $$23.a($$1.a(jj.f), 1).d(), $$1));
                     }

                     if ($$18.a($$22 + 1, $$21) == 1 || ($$17.a($$22 + 1, $$21) & 8388608) == 8388608) {
                        $$2.add(new eny.i(this.a, "carpet_east", $$23.a($$1.a(jj.d), 1).a($$1.a(jj.f), 5).d(), $$1));
                     }

                     if ($$18.a($$22, $$21 + 1) == 1 || ($$17.a($$22, $$21 + 1) & 8388608) == 8388608) {
                        $$2.add(new eny.i(this.a, $$19, $$23.a($$1.a(jj.d), 5).a($$1.a(jj.e), 1), $$1));
                     }

                     if ($$18.a($$22 - 1, $$21) == 1 || ($$17.a($$22 - 1, $$21) & 8388608) == 8388608) {
                        $$2.add(new eny.i(this.a, $$20, $$23.a($$1.a(jj.e), 1).a($$1.a(jj.c), 1), $$1));
                     }
                  }
               }
            }

            String $$24 = $$15 == 0 ? "indoors_wall_1" : "indoors_wall_2";
            String $$25 = $$15 == 0 ? "indoors_door_1" : "indoors_door_2";
            List<jj> $$26 = Lists.newArrayList();

            for (int $$27 = 0; $$27 < $$18.c; $$27++) {
               for (int $$28 = 0; $$28 < $$18.b; $$28++) {
                  boolean $$29 = $$15 == 2 && $$18.a($$28, $$27) == 3;
                  if ($$18.a($$28, $$27) == 2 || $$29) {
                     int $$30 = $$17.a($$28, $$27);
                     int $$31 = $$30 & 983040;
                     int $$32 = $$30 & 65535;
                     $$29 = $$29 && ($$30 & 8388608) == 8388608;
                     $$26.clear();
                     if (($$30 & 2097152) == 2097152) {
                        for (jj $$33 : jj.c.a) {
                           if ($$18.a($$28 + $$33.j(), $$27 + $$33.l()) == 1) {
                              $$26.add($$33);
                           }
                        }
                     }

                     jj $$34 = null;
                     if (!$$26.isEmpty()) {
                        $$34 = $$26.get(this.b.a($$26.size()));
                     } else if (($$30 & 1048576) == 1048576) {
                        $$34 = jj.b;
                     }

                     je $$35 = $$16.a($$1.a(jj.d), 8 + ($$27 - this.d) * 8);
                     $$35 = $$35.a($$1.a(jj.f), -1 + ($$28 - this.c) * 8);
                     if (eny.c.a($$18, $$28 - 1, $$27) && !$$3.a($$18, $$28 - 1, $$27, $$15, $$32)) {
                        $$2.add(new eny.i(this.a, $$34 == jj.e ? $$25 : $$24, $$35, $$1));
                     }

                     if ($$18.a($$28 + 1, $$27) == 1 && !$$29) {
                        je $$36 = $$35.a($$1.a(jj.f), 8);
                        $$2.add(new eny.i(this.a, $$34 == jj.f ? $$25 : $$24, $$36, $$1));
                     }

                     if (eny.c.a($$18, $$28, $$27 + 1) && !$$3.a($$18, $$28, $$27 + 1, $$15, $$32)) {
                        je $$37 = $$35.a($$1.a(jj.d), 7);
                        $$37 = $$37.a($$1.a(jj.f), 7);
                        $$2.add(new eny.i(this.a, $$34 == jj.d ? $$25 : $$24, $$37, $$1.a(dnx.b)));
                     }

                     if ($$18.a($$28, $$27 - 1) == 1 && !$$29) {
                        je $$38 = $$35.a($$1.a(jj.c), 1);
                        $$38 = $$38.a($$1.a(jj.f), 7);
                        $$2.add(new eny.i(this.a, $$34 == jj.c ? $$25 : $$24, $$38, $$1.a(dnx.b)));
                     }

                     if ($$31 == 65536) {
                        this.a($$2, $$35, $$1, $$34, $$14[$$15]);
                     } else if ($$31 == 131072 && $$34 != null) {
                        jj $$39 = $$3.b($$18, $$28, $$27, $$15, $$32);
                        boolean $$40 = ($$30 & 4194304) == 4194304;
                        this.a($$2, $$35, $$1, $$39, $$34, $$14[$$15], $$40);
                     } else if ($$31 == 262144 && $$34 != null && $$34 != jj.b) {
                        jj $$41 = $$34.h();
                        if (!$$3.a($$18, $$28 + $$41.j(), $$27 + $$41.l(), $$15, $$32)) {
                           $$41 = $$41.g();
                        }

                        this.a($$2, $$35, $$1, $$41, $$34, $$14[$$15]);
                     } else if ($$31 == 262144 && $$34 == jj.b) {
                        this.a($$2, $$35, $$1, $$14[$$15]);
                     }
                  }
               }
            }
         }
      }

      private void a(List<eny.i> $$0, eny.e $$1, eny.g $$2, jj $$3, int $$4, int $$5, int $$6, int $$7) {
         int $$8 = $$4;
         int $$9 = $$5;
         jj $$10 = $$3;

         do {
            if (!eny.c.a($$2, $$8 + $$3.j(), $$9 + $$3.l())) {
               this.c($$0, $$1);
               $$3 = $$3.h();
               if ($$8 != $$6 || $$9 != $$7 || $$10 != $$3) {
                  this.b($$0, $$1);
               }
            } else if (eny.c.a($$2, $$8 + $$3.j(), $$9 + $$3.l()) && eny.c.a($$2, $$8 + $$3.j() + $$3.i().j(), $$9 + $$3.l() + $$3.i().l())) {
               this.d($$0, $$1);
               $$8 += $$3.j();
               $$9 += $$3.l();
               $$3 = $$3.i();
            } else {
               $$8 += $$3.j();
               $$9 += $$3.l();
               if ($$8 != $$6 || $$9 != $$7 || $$10 != $$3) {
                  this.b($$0, $$1);
               }
            }
         } while ($$8 != $$6 || $$9 != $$7 || $$10 != $$3);
      }

      private void a(List<eny.i> $$0, je $$1, dnx $$2, eny.g $$3, @Nullable eny.g $$4) {
         for (int $$5 = 0; $$5 < $$3.c; $$5++) {
            for (int $$6 = 0; $$6 < $$3.b; $$6++) {
               je $$27 = $$1.a($$2.a(jj.d), 8 + ($$5 - this.d) * 8);
               $$27 = $$27.a($$2.a(jj.f), ($$6 - this.c) * 8);
               boolean $$8 = $$4 != null && eny.c.a($$4, $$6, $$5);
               if (eny.c.a($$3, $$6, $$5) && !$$8) {
                  $$0.add(new eny.i(this.a, "roof", $$27.b(3), $$2));
                  if (!eny.c.a($$3, $$6 + 1, $$5)) {
                     je $$9 = $$27.a($$2.a(jj.f), 6);
                     $$0.add(new eny.i(this.a, "roof_front", $$9, $$2));
                  }

                  if (!eny.c.a($$3, $$6 - 1, $$5)) {
                     je $$10 = $$27.a($$2.a(jj.f), 0);
                     $$10 = $$10.a($$2.a(jj.d), 7);
                     $$0.add(new eny.i(this.a, "roof_front", $$10, $$2.a(dnx.c)));
                  }

                  if (!eny.c.a($$3, $$6, $$5 - 1)) {
                     je $$11 = $$27.a($$2.a(jj.e), 1);
                     $$0.add(new eny.i(this.a, "roof_front", $$11, $$2.a(dnx.d)));
                  }

                  if (!eny.c.a($$3, $$6, $$5 + 1)) {
                     je $$12 = $$27.a($$2.a(jj.f), 6);
                     $$12 = $$12.a($$2.a(jj.d), 6);
                     $$0.add(new eny.i(this.a, "roof_front", $$12, $$2.a(dnx.b)));
                  }
               }
            }
         }

         if ($$4 != null) {
            for (int $$13 = 0; $$13 < $$3.c; $$13++) {
               for (int $$14 = 0; $$14 < $$3.b; $$14++) {
                  je var17 = $$1.a($$2.a(jj.d), 8 + ($$13 - this.d) * 8);
                  var17 = var17.a($$2.a(jj.f), ($$14 - this.c) * 8);
                  boolean $$16 = eny.c.a($$4, $$14, $$13);
                  if (eny.c.a($$3, $$14, $$13) && $$16) {
                     if (!eny.c.a($$3, $$14 + 1, $$13)) {
                        je $$17 = var17.a($$2.a(jj.f), 7);
                        $$0.add(new eny.i(this.a, "small_wall", $$17, $$2));
                     }

                     if (!eny.c.a($$3, $$14 - 1, $$13)) {
                        je $$18 = var17.a($$2.a(jj.e), 1);
                        $$18 = $$18.a($$2.a(jj.d), 6);
                        $$0.add(new eny.i(this.a, "small_wall", $$18, $$2.a(dnx.c)));
                     }

                     if (!eny.c.a($$3, $$14, $$13 - 1)) {
                        je $$19 = var17.a($$2.a(jj.e), 0);
                        $$19 = $$19.a($$2.a(jj.c), 1);
                        $$0.add(new eny.i(this.a, "small_wall", $$19, $$2.a(dnx.d)));
                     }

                     if (!eny.c.a($$3, $$14, $$13 + 1)) {
                        je $$20 = var17.a($$2.a(jj.f), 6);
                        $$20 = $$20.a($$2.a(jj.d), 7);
                        $$0.add(new eny.i(this.a, "small_wall", $$20, $$2.a(dnx.b)));
                     }

                     if (!eny.c.a($$3, $$14 + 1, $$13)) {
                        if (!eny.c.a($$3, $$14, $$13 - 1)) {
                           je $$21 = var17.a($$2.a(jj.f), 7);
                           $$21 = $$21.a($$2.a(jj.c), 2);
                           $$0.add(new eny.i(this.a, "small_wall_corner", $$21, $$2));
                        }

                        if (!eny.c.a($$3, $$14, $$13 + 1)) {
                           je $$22 = var17.a($$2.a(jj.f), 8);
                           $$22 = $$22.a($$2.a(jj.d), 7);
                           $$0.add(new eny.i(this.a, "small_wall_corner", $$22, $$2.a(dnx.b)));
                        }
                     }

                     if (!eny.c.a($$3, $$14 - 1, $$13)) {
                        if (!eny.c.a($$3, $$14, $$13 - 1)) {
                           je $$23 = var17.a($$2.a(jj.e), 2);
                           $$23 = $$23.a($$2.a(jj.c), 1);
                           $$0.add(new eny.i(this.a, "small_wall_corner", $$23, $$2.a(dnx.d)));
                        }

                        if (!eny.c.a($$3, $$14, $$13 + 1)) {
                           je $$24 = var17.a($$2.a(jj.e), 1);
                           $$24 = $$24.a($$2.a(jj.d), 8);
                           $$0.add(new eny.i(this.a, "small_wall_corner", $$24, $$2.a(dnx.c)));
                        }
                     }
                  }
               }
            }
         }

         for (int $$25 = 0; $$25 < $$3.c; $$25++) {
            for (int $$26 = 0; $$26 < $$3.b; $$26++) {
               je var19 = $$1.a($$2.a(jj.d), 8 + ($$25 - this.d) * 8);
               var19 = var19.a($$2.a(jj.f), ($$26 - this.c) * 8);
               boolean $$28 = $$4 != null && eny.c.a($$4, $$26, $$25);
               if (eny.c.a($$3, $$26, $$25) && !$$28) {
                  if (!eny.c.a($$3, $$26 + 1, $$25)) {
                     je $$29 = var19.a($$2.a(jj.f), 6);
                     if (!eny.c.a($$3, $$26, $$25 + 1)) {
                        je $$30 = $$29.a($$2.a(jj.d), 6);
                        $$0.add(new eny.i(this.a, "roof_corner", $$30, $$2));
                     } else if (eny.c.a($$3, $$26 + 1, $$25 + 1)) {
                        je $$31 = $$29.a($$2.a(jj.d), 5);
                        $$0.add(new eny.i(this.a, "roof_inner_corner", $$31, $$2));
                     }

                     if (!eny.c.a($$3, $$26, $$25 - 1)) {
                        $$0.add(new eny.i(this.a, "roof_corner", $$29, $$2.a(dnx.d)));
                     } else if (eny.c.a($$3, $$26 + 1, $$25 - 1)) {
                        je $$32 = var19.a($$2.a(jj.f), 9);
                        $$32 = $$32.a($$2.a(jj.c), 2);
                        $$0.add(new eny.i(this.a, "roof_inner_corner", $$32, $$2.a(dnx.b)));
                     }
                  }

                  if (!eny.c.a($$3, $$26 - 1, $$25)) {
                     je $$33 = var19.a($$2.a(jj.f), 0);
                     $$33 = $$33.a($$2.a(jj.d), 0);
                     if (!eny.c.a($$3, $$26, $$25 + 1)) {
                        je $$34 = $$33.a($$2.a(jj.d), 6);
                        $$0.add(new eny.i(this.a, "roof_corner", $$34, $$2.a(dnx.b)));
                     } else if (eny.c.a($$3, $$26 - 1, $$25 + 1)) {
                        je $$35 = $$33.a($$2.a(jj.d), 8);
                        $$35 = $$35.a($$2.a(jj.e), 3);
                        $$0.add(new eny.i(this.a, "roof_inner_corner", $$35, $$2.a(dnx.d)));
                     }

                     if (!eny.c.a($$3, $$26, $$25 - 1)) {
                        $$0.add(new eny.i(this.a, "roof_corner", $$33, $$2.a(dnx.c)));
                     } else if (eny.c.a($$3, $$26 - 1, $$25 - 1)) {
                        je $$36 = $$33.a($$2.a(jj.d), 1);
                        $$0.add(new eny.i(this.a, "roof_inner_corner", $$36, $$2.a(dnx.c)));
                     }
                  }
               }
            }
         }
      }

      private void a(List<eny.i> $$0, eny.e $$1) {
         jj $$2 = $$1.a.a(jj.e);
         $$0.add(new eny.i(this.a, "entrance", $$1.b.a($$2, 9), $$1.a));
         $$1.b = $$1.b.a($$1.a.a(jj.d), 16);
      }

      private void b(List<eny.i> $$0, eny.e $$1) {
         $$0.add(new eny.i(this.a, $$1.c, $$1.b.a($$1.a.a(jj.f), 7), $$1.a));
         $$1.b = $$1.b.a($$1.a.a(jj.d), 8);
      }

      private void c(List<eny.i> $$0, eny.e $$1) {
         $$1.b = $$1.b.a($$1.a.a(jj.d), -1);
         $$0.add(new eny.i(this.a, "wall_corner", $$1.b, $$1.a));
         $$1.b = $$1.b.a($$1.a.a(jj.d), -7);
         $$1.b = $$1.b.a($$1.a.a(jj.e), -6);
         $$1.a = $$1.a.a(dnx.b);
      }

      private void d(List<eny.i> $$0, eny.e $$1) {
         $$1.b = $$1.b.a($$1.a.a(jj.d), 6);
         $$1.b = $$1.b.a($$1.a.a(jj.f), 8);
         $$1.a = $$1.a.a(dnx.d);
      }

      private void a(List<eny.i> $$0, je $$1, dnx $$2, jj $$3, eny.b $$4) {
         dnx $$5 = dnx.a;
         String $$6 = $$4.a(this.b);
         if ($$3 != jj.f) {
            if ($$3 == jj.c) {
               $$5 = $$5.a(dnx.d);
            } else if ($$3 == jj.e) {
               $$5 = $$5.a(dnx.c);
            } else if ($$3 == jj.d) {
               $$5 = $$5.a(dnx.b);
            } else {
               $$6 = $$4.b(this.b);
            }
         }

         je $$7 = epe.a(new je(1, 0, 0), dmg.a, $$5, 7, 7);
         $$5 = $$5.a($$2);
         $$7 = $$7.a($$2);
         je $$8 = $$1.b($$7.u(), 0, $$7.w());
         $$0.add(new eny.i(this.a, $$6, $$8, $$5));
      }

      private void a(List<eny.i> $$0, je $$1, dnx $$2, jj $$3, jj $$4, eny.b $$5, boolean $$6) {
         if ($$4 == jj.f && $$3 == jj.d) {
            je $$7 = $$1.a($$2.a(jj.f), 1);
            $$0.add(new eny.i(this.a, $$5.a(this.b, $$6), $$7, $$2));
         } else if ($$4 == jj.f && $$3 == jj.c) {
            je $$8 = $$1.a($$2.a(jj.f), 1);
            $$8 = $$8.a($$2.a(jj.d), 6);
            $$0.add(new eny.i(this.a, $$5.a(this.b, $$6), $$8, $$2, dmg.b));
         } else if ($$4 == jj.e && $$3 == jj.c) {
            je $$9 = $$1.a($$2.a(jj.f), 7);
            $$9 = $$9.a($$2.a(jj.d), 6);
            $$0.add(new eny.i(this.a, $$5.a(this.b, $$6), $$9, $$2.a(dnx.c)));
         } else if ($$4 == jj.e && $$3 == jj.d) {
            je $$10 = $$1.a($$2.a(jj.f), 7);
            $$0.add(new eny.i(this.a, $$5.a(this.b, $$6), $$10, $$2, dmg.c));
         } else if ($$4 == jj.d && $$3 == jj.f) {
            je $$11 = $$1.a($$2.a(jj.f), 1);
            $$0.add(new eny.i(this.a, $$5.a(this.b, $$6), $$11, $$2.a(dnx.b), dmg.b));
         } else if ($$4 == jj.d && $$3 == jj.e) {
            je $$12 = $$1.a($$2.a(jj.f), 7);
            $$0.add(new eny.i(this.a, $$5.a(this.b, $$6), $$12, $$2.a(dnx.b)));
         } else if ($$4 == jj.c && $$3 == jj.e) {
            je $$13 = $$1.a($$2.a(jj.f), 7);
            $$13 = $$13.a($$2.a(jj.d), 6);
            $$0.add(new eny.i(this.a, $$5.a(this.b, $$6), $$13, $$2.a(dnx.b), dmg.c));
         } else if ($$4 == jj.c && $$3 == jj.f) {
            je $$14 = $$1.a($$2.a(jj.f), 1);
            $$14 = $$14.a($$2.a(jj.d), 6);
            $$0.add(new eny.i(this.a, $$5.a(this.b, $$6), $$14, $$2.a(dnx.d)));
         } else if ($$4 == jj.d && $$3 == jj.c) {
            je $$15 = $$1.a($$2.a(jj.f), 1);
            $$15 = $$15.a($$2.a(jj.c), 8);
            $$0.add(new eny.i(this.a, $$5.b(this.b, $$6), $$15, $$2));
         } else if ($$4 == jj.c && $$3 == jj.d) {
            je $$16 = $$1.a($$2.a(jj.f), 7);
            $$16 = $$16.a($$2.a(jj.d), 14);
            $$0.add(new eny.i(this.a, $$5.b(this.b, $$6), $$16, $$2.a(dnx.c)));
         } else if ($$4 == jj.e && $$3 == jj.f) {
            je $$17 = $$1.a($$2.a(jj.f), 15);
            $$0.add(new eny.i(this.a, $$5.b(this.b, $$6), $$17, $$2.a(dnx.b)));
         } else if ($$4 == jj.f && $$3 == jj.e) {
            je $$18 = $$1.a($$2.a(jj.e), 7);
            $$18 = $$18.a($$2.a(jj.d), 6);
            $$0.add(new eny.i(this.a, $$5.b(this.b, $$6), $$18, $$2.a(dnx.d)));
         } else if ($$4 == jj.b && $$3 == jj.f) {
            je $$19 = $$1.a($$2.a(jj.f), 15);
            $$0.add(new eny.i(this.a, $$5.c(this.b), $$19, $$2.a(dnx.b)));
         } else if ($$4 == jj.b && $$3 == jj.d) {
            je $$20 = $$1.a($$2.a(jj.f), 1);
            $$20 = $$20.a($$2.a(jj.c), 0);
            $$0.add(new eny.i(this.a, $$5.c(this.b), $$20, $$2));
         }
      }

      private void a(List<eny.i> $$0, je $$1, dnx $$2, jj $$3, jj $$4, eny.b $$5) {
         int $$6 = 0;
         int $$7 = 0;
         dnx $$8 = $$2;
         dmg $$9 = dmg.a;
         if ($$4 == jj.f && $$3 == jj.d) {
            $$6 = -7;
         } else if ($$4 == jj.f && $$3 == jj.c) {
            $$6 = -7;
            $$7 = 6;
            $$9 = dmg.b;
         } else if ($$4 == jj.c && $$3 == jj.f) {
            $$6 = 1;
            $$7 = 14;
            $$8 = $$2.a(dnx.d);
         } else if ($$4 == jj.c && $$3 == jj.e) {
            $$6 = 7;
            $$7 = 14;
            $$8 = $$2.a(dnx.d);
            $$9 = dmg.b;
         } else if ($$4 == jj.d && $$3 == jj.e) {
            $$6 = 7;
            $$7 = -8;
            $$8 = $$2.a(dnx.b);
         } else if ($$4 == jj.d && $$3 == jj.f) {
            $$6 = 1;
            $$7 = -8;
            $$8 = $$2.a(dnx.b);
            $$9 = dmg.b;
         } else if ($$4 == jj.e && $$3 == jj.c) {
            $$6 = 15;
            $$7 = 6;
            $$8 = $$2.a(dnx.c);
         } else if ($$4 == jj.e && $$3 == jj.d) {
            $$6 = 15;
            $$9 = dmg.c;
         }

         je $$10 = $$1.a($$2.a(jj.f), $$6);
         $$10 = $$10.a($$2.a(jj.d), $$7);
         $$0.add(new eny.i(this.a, $$5.d(this.b), $$10, $$8, $$9));
      }

      private void a(List<eny.i> $$0, je $$1, dnx $$2, eny.b $$3) {
         je $$4 = $$1.a($$2.a(jj.f), 1);
         $$0.add(new eny.i(this.a, $$3.e(this.b), $$4, $$2, dmg.a));
      }
   }

   static class e {
      public dnx a;
      public je b;
      public String c;
   }

   static class f extends eny.b {
      @Override
      public String a(azl $$0) {
         return "1x1_b" + ($$0.a(4) + 1);
      }

      @Override
      public String b(azl $$0) {
         return "1x1_as" + ($$0.a(4) + 1);
      }

      @Override
      public String a(azl $$0, boolean $$1) {
         return $$1 ? "1x2_c_stairs" : "1x2_c" + ($$0.a(4) + 1);
      }

      @Override
      public String b(azl $$0, boolean $$1) {
         return $$1 ? "1x2_d_stairs" : "1x2_d" + ($$0.a(5) + 1);
      }

      @Override
      public String c(azl $$0) {
         return "1x2_se" + ($$0.a(1) + 1);
      }

      @Override
      public String d(azl $$0) {
         return "2x2_b" + ($$0.a(5) + 1);
      }

      @Override
      public String e(azl $$0) {
         return "2x2_s1";
      }
   }

   static class g {
      private final int[][] a;
      final int b;
      final int c;
      private final int d;

      public g(int $$0, int $$1, int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.a = new int[$$0][$$1];
      }

      public void a(int $$0, int $$1, int $$2) {
         if ($$0 >= 0 && $$0 < this.b && $$1 >= 0 && $$1 < this.c) {
            this.a[$$0][$$1] = $$2;
         }
      }

      public void a(int $$0, int $$1, int $$2, int $$3, int $$4) {
         for (int $$5 = $$1; $$5 <= $$3; $$5++) {
            for (int $$6 = $$0; $$6 <= $$2; $$6++) {
               this.a($$6, $$5, $$4);
            }
         }
      }

      public int a(int $$0, int $$1) {
         return $$0 >= 0 && $$0 < this.b && $$1 >= 0 && $$1 < this.c ? this.a[$$0][$$1] : this.d;
      }

      public void a(int $$0, int $$1, int $$2, int $$3) {
         if (this.a($$0, $$1) == $$2) {
            this.a($$0, $$1, $$3);
         }
      }

      public boolean b(int $$0, int $$1, int $$2) {
         return this.a($$0 - 1, $$1) == $$2 || this.a($$0 + 1, $$1) == $$2 || this.a($$0, $$1 + 1) == $$2 || this.a($$0, $$1 - 1) == $$2;
      }
   }

   static class h extends eny.f {
   }

   public static class i extends elm {
      public i(epf $$0, String $$1, je $$2, dnx $$3) {
         this($$0, $$1, $$2, $$3, dmg.a);
      }

      public i(epf $$0, String $$1, je $$2, dnx $$3, dmg $$4) {
         super(elt.Z, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public i(epf $$0, uf $$1) {
         super(elt.Z, $$1, $$0, $$1x -> a(dmg.valueOf($$1.l("Mi")), dnx.valueOf($$1.l("Rot"))));
      }

      @Override
      protected alc b() {
         return a(this.a);
      }

      private static alc a(String $$0) {
         return alc.b("woodland_mansion/" + $$0);
      }

      private static epa a(dmg $$0, dnx $$1) {
         return new epa().a(true).a($$1).a($$0).a(eof.b);
      }

      @Override
      protected void a(els $$0, uf $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Mi", this.c.c().name());
      }

      @Override
      protected void a(String $$0, je $$1, dew $$2, azl $$3, eku $$4) {
         if ($$0.startsWith("Chest")) {
            dnx $$5 = this.c.d();
            duo $$6 = dhl.cv.o();
            if ("ChestWest".equals($$0)) {
               $$6 = $$6.b(dim.c, $$5.a(jj.e));
            } else if ("ChestEast".equals($$0)) {
               $$6 = $$6.b(dim.c, $$5.a(jj.f));
            } else if ("ChestSouth".equals($$0)) {
               $$6 = $$6.b(dim.c, $$5.a(jj.d));
            } else if ("ChestNorth".equals($$0)) {
               $$6 = $$6.b(dim.c, $$5.a(jj.c));
            }

            this.a($$2, $$4, $$3, $$1, etd.D, $$6);
         } else {
            List<bum> $$7 = new ArrayList<>();
            switch ($$0) {
               case "Mage":
                  $$7.add(btv.J.a($$2.E(), btu.d));
                  break;
               case "Warrior":
                  $$7.add(btv.bk.a($$2.E(), btu.d));
                  break;
               case "Group of Allays":
                  int $$8 = $$2.C_().a(3) + 1;

                  for (int $$9 = 0; $$9 < $$8; $$9++) {
                     $$7.add(btv.a.a($$2.E(), btu.d));
                  }
                  break;
               default:
                  return;
            }

            for (bum $$10 : $$7) {
               if ($$10 != null) {
                  $$10.fW();
                  $$10.a($$1, 0.0F, 0.0F);
                  $$10.a($$2, $$2.d_($$10.ds()), btu.d, null);
                  $$2.a_($$10);
                  $$2.a($$1, dhl.a.o(), 2);
               }
            }
         }
      }
   }
}
