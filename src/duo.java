import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class duo {
   public static void a(dvu $$0, gu $$1, cvz $$2, List<duo.i> $$3, apf $$4) {
      duo.c $$5 = new duo.c($$4);
      duo.d $$6 = new duo.d($$0, $$4);
      $$6.a($$1, $$2, $$3, $$5);
   }

   public static void a(String[] $$0) {
      apf $$1 = apf.a();
      long $$2 = $$1.g();
      System.out.println("Seed: " + $$2);
      $$1.b($$2);
      duo.c $$3 = new duo.c($$1);
      $$3.a();
   }

   static class a extends duo.b {
      @Override
      public String a(apf $$0) {
         return "1x1_a" + ($$0.a(5) + 1);
      }

      @Override
      public String b(apf $$0) {
         return "1x1_as" + ($$0.a(4) + 1);
      }

      @Override
      public String a(apf $$0, boolean $$1) {
         return "1x2_a" + ($$0.a(9) + 1);
      }

      @Override
      public String b(apf $$0, boolean $$1) {
         return "1x2_b" + ($$0.a(5) + 1);
      }

      @Override
      public String c(apf $$0) {
         return "1x2_s" + ($$0.a(2) + 1);
      }

      @Override
      public String d(apf $$0) {
         return "2x2_a" + ($$0.a(4) + 1);
      }

      @Override
      public String e(apf $$0) {
         return "2x2_s1";
      }
   }

   abstract static class b {
      public abstract String a(apf var1);

      public abstract String b(apf var1);

      public abstract String a(apf var1, boolean var2);

      public abstract String b(apf var1, boolean var2);

      public abstract String c(apf var1);

      public abstract String d(apf var1);

      public abstract String e(apf var1);
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
      private final apf q;
      final duo.g r;
      final duo.g s;
      final duo.g[] t;
      final int u;
      final int v;

      public c(apf $$0) {
         this.q = $$0;
         int $$1 = 11;
         this.u = 7;
         this.v = 4;
         this.r = new duo.g(11, 11, 5);
         this.r.a(this.u, this.v, this.u + 1, this.v + 1, 3);
         this.r.a(this.u - 1, this.v, this.u - 1, this.v + 1, 2);
         this.r.a(this.u + 2, this.v - 2, this.u + 3, this.v + 3, 5);
         this.r.a(this.u + 1, this.v - 2, this.u + 1, this.v - 1, 1);
         this.r.a(this.u + 1, this.v + 2, this.u + 1, this.v + 3, 1);
         this.r.a(this.u - 1, this.v - 1, 1);
         this.r.a(this.u - 1, this.v + 2, 1);
         this.r.a(0, 0, 11, 1, 5);
         this.r.a(0, 9, 11, 11, 5);
         this.a(this.r, this.u, this.v - 2, ha.e, 6);
         this.a(this.r, this.u, this.v + 3, ha.e, 6);
         this.a(this.r, this.u - 2, this.v - 1, ha.e, 3);
         this.a(this.r, this.u - 2, this.v + 2, ha.e, 3);

         while (this.a(this.r)) {
         }

         this.t = new duo.g[3];
         this.t[0] = new duo.g(11, 11, 5);
         this.t[1] = new duo.g(11, 11, 5);
         this.t[2] = new duo.g(11, 11, 5);
         this.a(this.r, this.t[0]);
         this.a(this.r, this.t[1]);
         this.t[0].a(this.u + 1, this.v, this.u + 1, this.v + 1, 8388608);
         this.t[1].a(this.u + 1, this.v, this.u + 1, this.v + 1, 8388608);
         this.s = new duo.g(this.r.b, this.r.c, 5);
         this.b();
         this.a(this.s, this.t[2]);
      }

      public static boolean a(duo.g $$0, int $$1, int $$2) {
         int $$3 = $$0.a($$1, $$2);
         return $$3 == 1 || $$3 == 2 || $$3 == 3 || $$3 == 4;
      }

      public boolean a(duo.g $$0, int $$1, int $$2, int $$3, int $$4) {
         return (this.t[$$3].a($$1, $$2) & 65535) == $$4;
      }

      @Nullable
      public ha b(duo.g $$0, int $$1, int $$2, int $$3, int $$4) {
         for (ha $$5 : ha.c.a) {
            if (this.a($$0, $$1 + $$5.j(), $$2 + $$5.l(), $$3, $$4)) {
               return $$5;
            }
         }

         return null;
      }

      private void a(duo.g $$0, int $$1, int $$2, ha $$3, int $$4) {
         if ($$4 > 0) {
            $$0.a($$1, $$2, 1);
            $$0.a($$1 + $$3.j(), $$2 + $$3.l(), 0, 1);

            for (int $$5 = 0; $$5 < 8; $$5++) {
               ha $$6 = ha.b(this.q.a(4));
               if ($$6 != $$3.g() && ($$6 != ha.f || !this.q.h())) {
                  int $$7 = $$1 + $$3.j();
                  int $$8 = $$2 + $$3.l();
                  if ($$0.a($$7 + $$6.j(), $$8 + $$6.l()) == 0 && $$0.a($$7 + $$6.j() * 2, $$8 + $$6.l() * 2) == 0) {
                     this.a($$0, $$1 + $$3.j() + $$6.j(), $$2 + $$3.l() + $$6.l(), $$6, $$4 - 1);
                     break;
                  }
               }
            }

            ha $$9 = $$3.h();
            ha $$10 = $$3.i();
            $$0.a($$1 + $$9.j(), $$2 + $$9.l(), 0, 2);
            $$0.a($$1 + $$10.j(), $$2 + $$10.l(), 0, 2);
            $$0.a($$1 + $$3.j() + $$9.j(), $$2 + $$3.l() + $$9.l(), 0, 2);
            $$0.a($$1 + $$3.j() + $$10.j(), $$2 + $$3.l() + $$10.l(), 0, 2);
            $$0.a($$1 + $$3.j() * 2, $$2 + $$3.l() * 2, 0, 2);
            $$0.a($$1 + $$9.j() * 2, $$2 + $$9.l() * 2, 0, 2);
            $$0.a($$1 + $$10.j() * 2, $$2 + $$10.l() * 2, 0, 2);
         }
      }

      private boolean a(duo.g $$0) {
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

      private void b() {
         List<apy<Integer, Integer>> $$0 = Lists.newArrayList();
         duo.g $$1 = this.t[1];

         for (int $$2 = 0; $$2 < this.s.c; $$2++) {
            for (int $$3 = 0; $$3 < this.s.b; $$3++) {
               int $$4 = $$1.a($$3, $$2);
               int $$5 = $$4 & 983040;
               if ($$5 == 131072 && ($$4 & 2097152) == 2097152) {
                  $$0.add(new apy<>($$3, $$2));
               }
            }
         }

         if ($$0.isEmpty()) {
            this.s.a(0, 0, this.s.b, this.s.c, 5);
         } else {
            apy<Integer, Integer> $$6 = $$0.get(this.q.a($$0.size()));
            int $$7 = $$1.a($$6.a(), $$6.b());
            $$1.a($$6.a(), $$6.b(), $$7 | 4194304);
            ha $$8 = this.b(this.r, $$6.a(), $$6.b(), 1, $$7 & 65535);
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

            List<ha> $$13 = Lists.newArrayList();

            for (ha $$14 : ha.c.a) {
               if (this.s.a($$9 + $$14.j(), $$10 + $$14.l()) == 0) {
                  $$13.add($$14);
               }
            }

            if ($$13.isEmpty()) {
               this.s.a(0, 0, this.s.b, this.s.c, 5);
               $$1.a($$6.a(), $$6.b(), $$7);
            } else {
               ha $$15 = $$13.get(this.q.a($$13.size()));
               this.a(this.s, $$9 + $$15.j(), $$10 + $$15.l(), $$15, 4);

               while (this.a(this.s)) {
               }
            }
         }
      }

      private void a(duo.g $$0, duo.g $$1) {
         ObjectArrayList<apy<Integer, Integer>> $$2 = new ObjectArrayList();

         for (int $$3 = 0; $$3 < $$0.c; $$3++) {
            for (int $$4 = 0; $$4 < $$0.b; $$4++) {
               if ($$0.a($$4, $$3) == 2) {
                  $$2.add(new apy<>($$4, $$3));
               }
            }
         }

         ac.b($$2, this.q);
         int $$5 = 10;
         ObjectListIterator var20 = $$2.iterator();

         while (var20.hasNext()) {
            apy<Integer, Integer> $$6 = (apy<Integer, Integer>)var20.next();
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

      public void a() {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            duo.g $$1 = $$0 == 0 ? this.r : this.s;

            for (int $$2 = 0; $$2 < $$1.c; $$2++) {
               for (int $$3 = 0; $$3 < $$1.b; $$3++) {
                  int $$4 = $$1.a($$3, $$2);
                  if ($$4 == 1) {
                     System.out.print("+");
                  } else if ($$4 == 4) {
                     System.out.print("x");
                  } else if ($$4 == 2) {
                     System.out.print("X");
                  } else if ($$4 == 3) {
                     System.out.print("O");
                  } else if ($$4 == 5) {
                     System.out.print("#");
                  } else {
                     System.out.print(" ");
                  }
               }

               System.out.println("");
            }

            System.out.println("");
         }
      }
   }

   static class d {
      private final dvu a;
      private final apf b;
      private int c;
      private int d;

      public d(dvu $$0, apf $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public void a(gu $$0, cvz $$1, List<duo.i> $$2, duo.c $$3) {
         duo.e $$4 = new duo.e();
         $$4.b = $$0;
         $$4.a = $$1;
         $$4.c = "wall_flat";
         duo.e $$5 = new duo.e();
         this.a($$2, $$4);
         $$5.b = $$4.b.b(8);
         $$5.a = $$4.a;
         $$5.c = "wall_window";
         if (!$$2.isEmpty()) {
         }

         duo.g $$6 = $$3.r;
         duo.g $$7 = $$3.s;
         this.c = $$3.u + 1;
         this.d = $$3.v + 1;
         int $$8 = $$3.u + 1;
         int $$9 = $$3.v;
         this.a($$2, $$4, $$6, ha.d, this.c, this.d, $$8, $$9);
         this.a($$2, $$5, $$6, ha.d, this.c, this.d, $$8, $$9);
         duo.e $$10 = new duo.e();
         $$10.b = $$4.b.b(19);
         $$10.a = $$4.a;
         $$10.c = "wall_window";
         boolean $$11 = false;

         for (int $$12 = 0; $$12 < $$7.c && !$$11; $$12++) {
            for (int $$13 = $$7.b - 1; $$13 >= 0 && !$$11; $$13--) {
               if (duo.c.a($$7, $$13, $$12)) {
                  $$10.b = $$10.b.a($$1.a(ha.d), 8 + ($$12 - this.d) * 8);
                  $$10.b = $$10.b.a($$1.a(ha.f), ($$13 - this.c) * 8);
                  this.b($$2, $$10);
                  this.a($$2, $$10, $$7, ha.d, $$13, $$12, $$13, $$12);
                  $$11 = true;
               }
            }
         }

         this.a($$2, $$0.b(16), $$1, $$6, $$7);
         this.a($$2, $$0.b(27), $$1, $$7, null);
         if (!$$2.isEmpty()) {
         }

         duo.b[] $$14 = new duo.b[]{new duo.a(), new duo.f(), new duo.h()};

         for (int $$15 = 0; $$15 < 3; $$15++) {
            gu $$16 = $$0.b(8 * $$15 + ($$15 == 2 ? 3 : 0));
            duo.g $$17 = $$3.t[$$15];
            duo.g $$18 = $$15 == 2 ? $$7 : $$6;
            String $$19 = $$15 == 0 ? "carpet_south_1" : "carpet_south_2";
            String $$20 = $$15 == 0 ? "carpet_west_1" : "carpet_west_2";

            for (int $$21 = 0; $$21 < $$18.c; $$21++) {
               for (int $$22 = 0; $$22 < $$18.b; $$22++) {
                  if ($$18.a($$22, $$21) == 1) {
                     gu $$23 = $$16.a($$1.a(ha.d), 8 + ($$21 - this.d) * 8);
                     $$23 = $$23.a($$1.a(ha.f), ($$22 - this.c) * 8);
                     $$2.add(new duo.i(this.a, "corridor_floor", $$23, $$1));
                     if ($$18.a($$22, $$21 - 1) == 1 || ($$17.a($$22, $$21 - 1) & 8388608) == 8388608) {
                        $$2.add(new duo.i(this.a, "carpet_north", $$23.a($$1.a(ha.f), 1).c(), $$1));
                     }

                     if ($$18.a($$22 + 1, $$21) == 1 || ($$17.a($$22 + 1, $$21) & 8388608) == 8388608) {
                        $$2.add(new duo.i(this.a, "carpet_east", $$23.a($$1.a(ha.d), 1).a($$1.a(ha.f), 5).c(), $$1));
                     }

                     if ($$18.a($$22, $$21 + 1) == 1 || ($$17.a($$22, $$21 + 1) & 8388608) == 8388608) {
                        $$2.add(new duo.i(this.a, $$19, $$23.a($$1.a(ha.d), 5).a($$1.a(ha.e), 1), $$1));
                     }

                     if ($$18.a($$22 - 1, $$21) == 1 || ($$17.a($$22 - 1, $$21) & 8388608) == 8388608) {
                        $$2.add(new duo.i(this.a, $$20, $$23.a($$1.a(ha.e), 1).a($$1.a(ha.c), 1), $$1));
                     }
                  }
               }
            }

            String $$24 = $$15 == 0 ? "indoors_wall_1" : "indoors_wall_2";
            String $$25 = $$15 == 0 ? "indoors_door_1" : "indoors_door_2";
            List<ha> $$26 = Lists.newArrayList();

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
                        for (ha $$33 : ha.c.a) {
                           if ($$18.a($$28 + $$33.j(), $$27 + $$33.l()) == 1) {
                              $$26.add($$33);
                           }
                        }
                     }

                     ha $$34 = null;
                     if (!$$26.isEmpty()) {
                        $$34 = $$26.get(this.b.a($$26.size()));
                     } else if (($$30 & 1048576) == 1048576) {
                        $$34 = ha.b;
                     }

                     gu $$35 = $$16.a($$1.a(ha.d), 8 + ($$27 - this.d) * 8);
                     $$35 = $$35.a($$1.a(ha.f), -1 + ($$28 - this.c) * 8);
                     if (duo.c.a($$18, $$28 - 1, $$27) && !$$3.a($$18, $$28 - 1, $$27, $$15, $$32)) {
                        $$2.add(new duo.i(this.a, $$34 == ha.e ? $$25 : $$24, $$35, $$1));
                     }

                     if ($$18.a($$28 + 1, $$27) == 1 && !$$29) {
                        gu $$36 = $$35.a($$1.a(ha.f), 8);
                        $$2.add(new duo.i(this.a, $$34 == ha.f ? $$25 : $$24, $$36, $$1));
                     }

                     if (duo.c.a($$18, $$28, $$27 + 1) && !$$3.a($$18, $$28, $$27 + 1, $$15, $$32)) {
                        gu $$37 = $$35.a($$1.a(ha.d), 7);
                        $$37 = $$37.a($$1.a(ha.f), 7);
                        $$2.add(new duo.i(this.a, $$34 == ha.d ? $$25 : $$24, $$37, $$1.a(cvz.b)));
                     }

                     if ($$18.a($$28, $$27 - 1) == 1 && !$$29) {
                        gu $$38 = $$35.a($$1.a(ha.c), 1);
                        $$38 = $$38.a($$1.a(ha.f), 7);
                        $$2.add(new duo.i(this.a, $$34 == ha.c ? $$25 : $$24, $$38, $$1.a(cvz.b)));
                     }

                     if ($$31 == 65536) {
                        this.a($$2, $$35, $$1, $$34, $$14[$$15]);
                     } else if ($$31 == 131072 && $$34 != null) {
                        ha $$39 = $$3.b($$18, $$28, $$27, $$15, $$32);
                        boolean $$40 = ($$30 & 4194304) == 4194304;
                        this.a($$2, $$35, $$1, $$39, $$34, $$14[$$15], $$40);
                     } else if ($$31 == 262144 && $$34 != null && $$34 != ha.b) {
                        ha $$41 = $$34.h();
                        if (!$$3.a($$18, $$28 + $$41.j(), $$27 + $$41.l(), $$15, $$32)) {
                           $$41 = $$41.g();
                        }

                        this.a($$2, $$35, $$1, $$41, $$34, $$14[$$15]);
                     } else if ($$31 == 262144 && $$34 == ha.b) {
                        this.a($$2, $$35, $$1, $$14[$$15]);
                     }
                  }
               }
            }
         }
      }

      private void a(List<duo.i> $$0, duo.e $$1, duo.g $$2, ha $$3, int $$4, int $$5, int $$6, int $$7) {
         int $$8 = $$4;
         int $$9 = $$5;
         ha $$10 = $$3;

         do {
            if (!duo.c.a($$2, $$8 + $$3.j(), $$9 + $$3.l())) {
               this.c($$0, $$1);
               $$3 = $$3.h();
               if ($$8 != $$6 || $$9 != $$7 || $$10 != $$3) {
                  this.b($$0, $$1);
               }
            } else if (duo.c.a($$2, $$8 + $$3.j(), $$9 + $$3.l()) && duo.c.a($$2, $$8 + $$3.j() + $$3.i().j(), $$9 + $$3.l() + $$3.i().l())) {
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

      private void a(List<duo.i> $$0, gu $$1, cvz $$2, duo.g $$3, @Nullable duo.g $$4) {
         for (int $$5 = 0; $$5 < $$3.c; $$5++) {
            for (int $$6 = 0; $$6 < $$3.b; $$6++) {
               gu $$27 = $$1.a($$2.a(ha.d), 8 + ($$5 - this.d) * 8);
               $$27 = $$27.a($$2.a(ha.f), ($$6 - this.c) * 8);
               boolean $$8 = $$4 != null && duo.c.a($$4, $$6, $$5);
               if (duo.c.a($$3, $$6, $$5) && !$$8) {
                  $$0.add(new duo.i(this.a, "roof", $$27.b(3), $$2));
                  if (!duo.c.a($$3, $$6 + 1, $$5)) {
                     gu $$9 = $$27.a($$2.a(ha.f), 6);
                     $$0.add(new duo.i(this.a, "roof_front", $$9, $$2));
                  }

                  if (!duo.c.a($$3, $$6 - 1, $$5)) {
                     gu $$10 = $$27.a($$2.a(ha.f), 0);
                     $$10 = $$10.a($$2.a(ha.d), 7);
                     $$0.add(new duo.i(this.a, "roof_front", $$10, $$2.a(cvz.c)));
                  }

                  if (!duo.c.a($$3, $$6, $$5 - 1)) {
                     gu $$11 = $$27.a($$2.a(ha.e), 1);
                     $$0.add(new duo.i(this.a, "roof_front", $$11, $$2.a(cvz.d)));
                  }

                  if (!duo.c.a($$3, $$6, $$5 + 1)) {
                     gu $$12 = $$27.a($$2.a(ha.f), 6);
                     $$12 = $$12.a($$2.a(ha.d), 6);
                     $$0.add(new duo.i(this.a, "roof_front", $$12, $$2.a(cvz.b)));
                  }
               }
            }
         }

         if ($$4 != null) {
            for (int $$13 = 0; $$13 < $$3.c; $$13++) {
               for (int $$14 = 0; $$14 < $$3.b; $$14++) {
                  gu var17 = $$1.a($$2.a(ha.d), 8 + ($$13 - this.d) * 8);
                  var17 = var17.a($$2.a(ha.f), ($$14 - this.c) * 8);
                  boolean $$16 = duo.c.a($$4, $$14, $$13);
                  if (duo.c.a($$3, $$14, $$13) && $$16) {
                     if (!duo.c.a($$3, $$14 + 1, $$13)) {
                        gu $$17 = var17.a($$2.a(ha.f), 7);
                        $$0.add(new duo.i(this.a, "small_wall", $$17, $$2));
                     }

                     if (!duo.c.a($$3, $$14 - 1, $$13)) {
                        gu $$18 = var17.a($$2.a(ha.e), 1);
                        $$18 = $$18.a($$2.a(ha.d), 6);
                        $$0.add(new duo.i(this.a, "small_wall", $$18, $$2.a(cvz.c)));
                     }

                     if (!duo.c.a($$3, $$14, $$13 - 1)) {
                        gu $$19 = var17.a($$2.a(ha.e), 0);
                        $$19 = $$19.a($$2.a(ha.c), 1);
                        $$0.add(new duo.i(this.a, "small_wall", $$19, $$2.a(cvz.d)));
                     }

                     if (!duo.c.a($$3, $$14, $$13 + 1)) {
                        gu $$20 = var17.a($$2.a(ha.f), 6);
                        $$20 = $$20.a($$2.a(ha.d), 7);
                        $$0.add(new duo.i(this.a, "small_wall", $$20, $$2.a(cvz.b)));
                     }

                     if (!duo.c.a($$3, $$14 + 1, $$13)) {
                        if (!duo.c.a($$3, $$14, $$13 - 1)) {
                           gu $$21 = var17.a($$2.a(ha.f), 7);
                           $$21 = $$21.a($$2.a(ha.c), 2);
                           $$0.add(new duo.i(this.a, "small_wall_corner", $$21, $$2));
                        }

                        if (!duo.c.a($$3, $$14, $$13 + 1)) {
                           gu $$22 = var17.a($$2.a(ha.f), 8);
                           $$22 = $$22.a($$2.a(ha.d), 7);
                           $$0.add(new duo.i(this.a, "small_wall_corner", $$22, $$2.a(cvz.b)));
                        }
                     }

                     if (!duo.c.a($$3, $$14 - 1, $$13)) {
                        if (!duo.c.a($$3, $$14, $$13 - 1)) {
                           gu $$23 = var17.a($$2.a(ha.e), 2);
                           $$23 = $$23.a($$2.a(ha.c), 1);
                           $$0.add(new duo.i(this.a, "small_wall_corner", $$23, $$2.a(cvz.d)));
                        }

                        if (!duo.c.a($$3, $$14, $$13 + 1)) {
                           gu $$24 = var17.a($$2.a(ha.e), 1);
                           $$24 = $$24.a($$2.a(ha.d), 8);
                           $$0.add(new duo.i(this.a, "small_wall_corner", $$24, $$2.a(cvz.c)));
                        }
                     }
                  }
               }
            }
         }

         for (int $$25 = 0; $$25 < $$3.c; $$25++) {
            for (int $$26 = 0; $$26 < $$3.b; $$26++) {
               gu var19 = $$1.a($$2.a(ha.d), 8 + ($$25 - this.d) * 8);
               var19 = var19.a($$2.a(ha.f), ($$26 - this.c) * 8);
               boolean $$28 = $$4 != null && duo.c.a($$4, $$26, $$25);
               if (duo.c.a($$3, $$26, $$25) && !$$28) {
                  if (!duo.c.a($$3, $$26 + 1, $$25)) {
                     gu $$29 = var19.a($$2.a(ha.f), 6);
                     if (!duo.c.a($$3, $$26, $$25 + 1)) {
                        gu $$30 = $$29.a($$2.a(ha.d), 6);
                        $$0.add(new duo.i(this.a, "roof_corner", $$30, $$2));
                     } else if (duo.c.a($$3, $$26 + 1, $$25 + 1)) {
                        gu $$31 = $$29.a($$2.a(ha.d), 5);
                        $$0.add(new duo.i(this.a, "roof_inner_corner", $$31, $$2));
                     }

                     if (!duo.c.a($$3, $$26, $$25 - 1)) {
                        $$0.add(new duo.i(this.a, "roof_corner", $$29, $$2.a(cvz.d)));
                     } else if (duo.c.a($$3, $$26 + 1, $$25 - 1)) {
                        gu $$32 = var19.a($$2.a(ha.f), 9);
                        $$32 = $$32.a($$2.a(ha.c), 2);
                        $$0.add(new duo.i(this.a, "roof_inner_corner", $$32, $$2.a(cvz.b)));
                     }
                  }

                  if (!duo.c.a($$3, $$26 - 1, $$25)) {
                     gu $$33 = var19.a($$2.a(ha.f), 0);
                     $$33 = $$33.a($$2.a(ha.d), 0);
                     if (!duo.c.a($$3, $$26, $$25 + 1)) {
                        gu $$34 = $$33.a($$2.a(ha.d), 6);
                        $$0.add(new duo.i(this.a, "roof_corner", $$34, $$2.a(cvz.b)));
                     } else if (duo.c.a($$3, $$26 - 1, $$25 + 1)) {
                        gu $$35 = $$33.a($$2.a(ha.d), 8);
                        $$35 = $$35.a($$2.a(ha.e), 3);
                        $$0.add(new duo.i(this.a, "roof_inner_corner", $$35, $$2.a(cvz.d)));
                     }

                     if (!duo.c.a($$3, $$26, $$25 - 1)) {
                        $$0.add(new duo.i(this.a, "roof_corner", $$33, $$2.a(cvz.c)));
                     } else if (duo.c.a($$3, $$26 - 1, $$25 - 1)) {
                        gu $$36 = $$33.a($$2.a(ha.d), 1);
                        $$0.add(new duo.i(this.a, "roof_inner_corner", $$36, $$2.a(cvz.c)));
                     }
                  }
               }
            }
         }
      }

      private void a(List<duo.i> $$0, duo.e $$1) {
         ha $$2 = $$1.a.a(ha.e);
         $$0.add(new duo.i(this.a, "entrance", $$1.b.a($$2, 9), $$1.a));
         $$1.b = $$1.b.a($$1.a.a(ha.d), 16);
      }

      private void b(List<duo.i> $$0, duo.e $$1) {
         $$0.add(new duo.i(this.a, $$1.c, $$1.b.a($$1.a.a(ha.f), 7), $$1.a));
         $$1.b = $$1.b.a($$1.a.a(ha.d), 8);
      }

      private void c(List<duo.i> $$0, duo.e $$1) {
         $$1.b = $$1.b.a($$1.a.a(ha.d), -1);
         $$0.add(new duo.i(this.a, "wall_corner", $$1.b, $$1.a));
         $$1.b = $$1.b.a($$1.a.a(ha.d), -7);
         $$1.b = $$1.b.a($$1.a.a(ha.e), -6);
         $$1.a = $$1.a.a(cvz.b);
      }

      private void d(List<duo.i> $$0, duo.e $$1) {
         $$1.b = $$1.b.a($$1.a.a(ha.d), 6);
         $$1.b = $$1.b.a($$1.a.a(ha.f), 8);
         $$1.a = $$1.a.a(cvz.d);
      }

      private void a(List<duo.i> $$0, gu $$1, cvz $$2, ha $$3, duo.b $$4) {
         cvz $$5 = cvz.a;
         String $$6 = $$4.a(this.b);
         if ($$3 != ha.f) {
            if ($$3 == ha.c) {
               $$5 = $$5.a(cvz.d);
            } else if ($$3 == ha.e) {
               $$5 = $$5.a(cvz.c);
            } else if ($$3 == ha.d) {
               $$5 = $$5.a(cvz.b);
            } else {
               $$6 = $$4.b(this.b);
            }
         }

         gu $$7 = dvt.a(new gu(1, 0, 0), cui.a, $$5, 7, 7);
         $$5 = $$5.a($$2);
         $$7 = $$7.a($$2);
         gu $$8 = $$1.b($$7.u(), 0, $$7.w());
         $$0.add(new duo.i(this.a, $$6, $$8, $$5));
      }

      private void a(List<duo.i> $$0, gu $$1, cvz $$2, ha $$3, ha $$4, duo.b $$5, boolean $$6) {
         if ($$4 == ha.f && $$3 == ha.d) {
            gu $$7 = $$1.a($$2.a(ha.f), 1);
            $$0.add(new duo.i(this.a, $$5.a(this.b, $$6), $$7, $$2));
         } else if ($$4 == ha.f && $$3 == ha.c) {
            gu $$8 = $$1.a($$2.a(ha.f), 1);
            $$8 = $$8.a($$2.a(ha.d), 6);
            $$0.add(new duo.i(this.a, $$5.a(this.b, $$6), $$8, $$2, cui.b));
         } else if ($$4 == ha.e && $$3 == ha.c) {
            gu $$9 = $$1.a($$2.a(ha.f), 7);
            $$9 = $$9.a($$2.a(ha.d), 6);
            $$0.add(new duo.i(this.a, $$5.a(this.b, $$6), $$9, $$2.a(cvz.c)));
         } else if ($$4 == ha.e && $$3 == ha.d) {
            gu $$10 = $$1.a($$2.a(ha.f), 7);
            $$0.add(new duo.i(this.a, $$5.a(this.b, $$6), $$10, $$2, cui.c));
         } else if ($$4 == ha.d && $$3 == ha.f) {
            gu $$11 = $$1.a($$2.a(ha.f), 1);
            $$0.add(new duo.i(this.a, $$5.a(this.b, $$6), $$11, $$2.a(cvz.b), cui.b));
         } else if ($$4 == ha.d && $$3 == ha.e) {
            gu $$12 = $$1.a($$2.a(ha.f), 7);
            $$0.add(new duo.i(this.a, $$5.a(this.b, $$6), $$12, $$2.a(cvz.b)));
         } else if ($$4 == ha.c && $$3 == ha.e) {
            gu $$13 = $$1.a($$2.a(ha.f), 7);
            $$13 = $$13.a($$2.a(ha.d), 6);
            $$0.add(new duo.i(this.a, $$5.a(this.b, $$6), $$13, $$2.a(cvz.b), cui.c));
         } else if ($$4 == ha.c && $$3 == ha.f) {
            gu $$14 = $$1.a($$2.a(ha.f), 1);
            $$14 = $$14.a($$2.a(ha.d), 6);
            $$0.add(new duo.i(this.a, $$5.a(this.b, $$6), $$14, $$2.a(cvz.d)));
         } else if ($$4 == ha.d && $$3 == ha.c) {
            gu $$15 = $$1.a($$2.a(ha.f), 1);
            $$15 = $$15.a($$2.a(ha.c), 8);
            $$0.add(new duo.i(this.a, $$5.b(this.b, $$6), $$15, $$2));
         } else if ($$4 == ha.c && $$3 == ha.d) {
            gu $$16 = $$1.a($$2.a(ha.f), 7);
            $$16 = $$16.a($$2.a(ha.d), 14);
            $$0.add(new duo.i(this.a, $$5.b(this.b, $$6), $$16, $$2.a(cvz.c)));
         } else if ($$4 == ha.e && $$3 == ha.f) {
            gu $$17 = $$1.a($$2.a(ha.f), 15);
            $$0.add(new duo.i(this.a, $$5.b(this.b, $$6), $$17, $$2.a(cvz.b)));
         } else if ($$4 == ha.f && $$3 == ha.e) {
            gu $$18 = $$1.a($$2.a(ha.e), 7);
            $$18 = $$18.a($$2.a(ha.d), 6);
            $$0.add(new duo.i(this.a, $$5.b(this.b, $$6), $$18, $$2.a(cvz.d)));
         } else if ($$4 == ha.b && $$3 == ha.f) {
            gu $$19 = $$1.a($$2.a(ha.f), 15);
            $$0.add(new duo.i(this.a, $$5.c(this.b), $$19, $$2.a(cvz.b)));
         } else if ($$4 == ha.b && $$3 == ha.d) {
            gu $$20 = $$1.a($$2.a(ha.f), 1);
            $$20 = $$20.a($$2.a(ha.c), 0);
            $$0.add(new duo.i(this.a, $$5.c(this.b), $$20, $$2));
         }
      }

      private void a(List<duo.i> $$0, gu $$1, cvz $$2, ha $$3, ha $$4, duo.b $$5) {
         int $$6 = 0;
         int $$7 = 0;
         cvz $$8 = $$2;
         cui $$9 = cui.a;
         if ($$4 == ha.f && $$3 == ha.d) {
            $$6 = -7;
         } else if ($$4 == ha.f && $$3 == ha.c) {
            $$6 = -7;
            $$7 = 6;
            $$9 = cui.b;
         } else if ($$4 == ha.c && $$3 == ha.f) {
            $$6 = 1;
            $$7 = 14;
            $$8 = $$2.a(cvz.d);
         } else if ($$4 == ha.c && $$3 == ha.e) {
            $$6 = 7;
            $$7 = 14;
            $$8 = $$2.a(cvz.d);
            $$9 = cui.b;
         } else if ($$4 == ha.d && $$3 == ha.e) {
            $$6 = 7;
            $$7 = -8;
            $$8 = $$2.a(cvz.b);
         } else if ($$4 == ha.d && $$3 == ha.f) {
            $$6 = 1;
            $$7 = -8;
            $$8 = $$2.a(cvz.b);
            $$9 = cui.b;
         } else if ($$4 == ha.e && $$3 == ha.c) {
            $$6 = 15;
            $$7 = 6;
            $$8 = $$2.a(cvz.c);
         } else if ($$4 == ha.e && $$3 == ha.d) {
            $$6 = 15;
            $$9 = cui.c;
         }

         gu $$10 = $$1.a($$2.a(ha.f), $$6);
         $$10 = $$10.a($$2.a(ha.d), $$7);
         $$0.add(new duo.i(this.a, $$5.d(this.b), $$10, $$8, $$9));
      }

      private void a(List<duo.i> $$0, gu $$1, cvz $$2, duo.b $$3) {
         gu $$4 = $$1.a($$2.a(ha.f), 1);
         $$0.add(new duo.i(this.a, $$3.e(this.b), $$4, $$2, cui.a));
      }
   }

   static class e {
      public cvz a;
      public gu b;
      public String c;
   }

   static class f extends duo.b {
      @Override
      public String a(apf $$0) {
         return "1x1_b" + ($$0.a(4) + 1);
      }

      @Override
      public String b(apf $$0) {
         return "1x1_as" + ($$0.a(4) + 1);
      }

      @Override
      public String a(apf $$0, boolean $$1) {
         return $$1 ? "1x2_c_stairs" : "1x2_c" + ($$0.a(4) + 1);
      }

      @Override
      public String b(apf $$0, boolean $$1) {
         return $$1 ? "1x2_d_stairs" : "1x2_d" + ($$0.a(5) + 1);
      }

      @Override
      public String c(apf $$0) {
         return "1x2_se" + ($$0.a(1) + 1);
      }

      @Override
      public String d(apf $$0) {
         return "2x2_b" + ($$0.a(5) + 1);
      }

      @Override
      public String e(apf $$0) {
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

   static class h extends duo.f {
   }

   public static class i extends dsk {
      public i(dvu $$0, String $$1, gu $$2, cvz $$3) {
         this($$0, $$1, $$2, $$3, cui.a);
      }

      public i(dvu $$0, String $$1, gu $$2, cvz $$3, cui $$4) {
         super(dsr.Z, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public i(dvu $$0, qr $$1) {
         super(dsr.Z, $$1, $$0, $$1x -> a(cui.valueOf($$1.l("Mi")), cvz.valueOf($$1.l("Rot"))));
      }

      @Override
      protected acq b() {
         return a(this.a);
      }

      private static acq a(String $$0) {
         return new acq("woodland_mansion/" + $$0);
      }

      private static dvp a(cui $$0, cvz $$1) {
         return new dvp().a(true).a($$1).a($$0).a(duv.b);
      }

      @Override
      protected void a(dsq $$0, qr $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Mi", this.c.c().name());
      }

      @Override
      protected void a(String $$0, gu $$1, cnb $$2, apf $$3, drs $$4) {
         if ($$0.startsWith("Chest")) {
            cvz $$5 = this.c.d();
            dcb $$6 = cpo.cv.n();
            if ("ChestWest".equals($$0)) {
               $$6 = $$6.a(cqp.b, $$5.a(ha.e));
            } else if ("ChestEast".equals($$0)) {
               $$6 = $$6.a(cqp.b, $$5.a(ha.f));
            } else if ("ChestSouth".equals($$0)) {
               $$6 = $$6.a(cqp.b, $$5.a(ha.d));
            } else if ("ChestNorth".equals($$0)) {
               $$6 = $$6.a(cqp.b, $$5.a(ha.c));
            }

            this.a($$2, $$4, $$3, $$1, dzg.D, $$6);
         } else {
            List<bgb> $$7 = new ArrayList<>();
            switch ($$0) {
               case "Mage":
                  $$7.add(bfn.G.a((cmm)$$2.C()));
                  break;
               case "Warrior":
                  $$7.add(bfn.bg.a((cmm)$$2.C()));
                  break;
               case "Group of Allays":
                  int $$8 = $$2.y_().a(3) + 1;

                  for (int $$9 = 0; $$9 < $$8; $$9++) {
                     $$7.add(bfn.b.a((cmm)$$2.C()));
                  }
                  break;
               default:
                  return;
            }

            for (bgb $$10 : $$7) {
               if ($$10 != null) {
                  $$10.fF();
                  $$10.a($$1, 0.0F, 0.0F);
                  $$10.a($$2, $$2.d_($$10.di()), bgd.d, null, null);
                  $$2.a_($$10);
                  $$2.a($$1, cpo.a.n(), 2);
               }
            }
         }
      }
   }
}
