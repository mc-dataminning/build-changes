import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class dxy {
   public static void a(dze $$0, gw $$1, czj $$2, List<dxy.i> $$3, ase $$4) {
      dxy.c $$5 = new dxy.c($$4);
      dxy.d $$6 = new dxy.d($$0, $$4);
      $$6.a($$1, $$2, $$3, $$5);
   }

   static class a extends dxy.b {
      @Override
      public String a(ase $$0) {
         return "1x1_a" + ($$0.a(5) + 1);
      }

      @Override
      public String b(ase $$0) {
         return "1x1_as" + ($$0.a(4) + 1);
      }

      @Override
      public String a(ase $$0, boolean $$1) {
         return "1x2_a" + ($$0.a(9) + 1);
      }

      @Override
      public String b(ase $$0, boolean $$1) {
         return "1x2_b" + ($$0.a(5) + 1);
      }

      @Override
      public String c(ase $$0) {
         return "1x2_s" + ($$0.a(2) + 1);
      }

      @Override
      public String d(ase $$0) {
         return "2x2_a" + ($$0.a(4) + 1);
      }

      @Override
      public String e(ase $$0) {
         return "2x2_s1";
      }
   }

   abstract static class b {
      public abstract String a(ase var1);

      public abstract String b(ase var1);

      public abstract String a(ase var1, boolean var2);

      public abstract String b(ase var1, boolean var2);

      public abstract String c(ase var1);

      public abstract String d(ase var1);

      public abstract String e(ase var1);
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
      private final ase q;
      final dxy.g r;
      final dxy.g s;
      final dxy.g[] t;
      final int u;
      final int v;

      public c(ase $$0) {
         this.q = $$0;
         int $$1 = 11;
         this.u = 7;
         this.v = 4;
         this.r = new dxy.g(11, 11, 5);
         this.r.a(this.u, this.v, this.u + 1, this.v + 1, 3);
         this.r.a(this.u - 1, this.v, this.u - 1, this.v + 1, 2);
         this.r.a(this.u + 2, this.v - 2, this.u + 3, this.v + 3, 5);
         this.r.a(this.u + 1, this.v - 2, this.u + 1, this.v - 1, 1);
         this.r.a(this.u + 1, this.v + 2, this.u + 1, this.v + 3, 1);
         this.r.a(this.u - 1, this.v - 1, 1);
         this.r.a(this.u - 1, this.v + 2, 1);
         this.r.a(0, 0, 11, 1, 5);
         this.r.a(0, 9, 11, 11, 5);
         this.a(this.r, this.u, this.v - 2, hc.e, 6);
         this.a(this.r, this.u, this.v + 3, hc.e, 6);
         this.a(this.r, this.u - 2, this.v - 1, hc.e, 3);
         this.a(this.r, this.u - 2, this.v + 2, hc.e, 3);

         while (this.a(this.r)) {
         }

         this.t = new dxy.g[3];
         this.t[0] = new dxy.g(11, 11, 5);
         this.t[1] = new dxy.g(11, 11, 5);
         this.t[2] = new dxy.g(11, 11, 5);
         this.a(this.r, this.t[0]);
         this.a(this.r, this.t[1]);
         this.t[0].a(this.u + 1, this.v, this.u + 1, this.v + 1, 8388608);
         this.t[1].a(this.u + 1, this.v, this.u + 1, this.v + 1, 8388608);
         this.s = new dxy.g(this.r.b, this.r.c, 5);
         this.a();
         this.a(this.s, this.t[2]);
      }

      public static boolean a(dxy.g $$0, int $$1, int $$2) {
         int $$3 = $$0.a($$1, $$2);
         return $$3 == 1 || $$3 == 2 || $$3 == 3 || $$3 == 4;
      }

      public boolean a(dxy.g $$0, int $$1, int $$2, int $$3, int $$4) {
         return (this.t[$$3].a($$1, $$2) & 65535) == $$4;
      }

      @Nullable
      public hc b(dxy.g $$0, int $$1, int $$2, int $$3, int $$4) {
         for (hc $$5 : hc.c.a) {
            if (this.a($$0, $$1 + $$5.j(), $$2 + $$5.l(), $$3, $$4)) {
               return $$5;
            }
         }

         return null;
      }

      private void a(dxy.g $$0, int $$1, int $$2, hc $$3, int $$4) {
         if ($$4 > 0) {
            $$0.a($$1, $$2, 1);
            $$0.a($$1 + $$3.j(), $$2 + $$3.l(), 0, 1);

            for (int $$5 = 0; $$5 < 8; $$5++) {
               hc $$6 = hc.b(this.q.a(4));
               if ($$6 != $$3.g() && ($$6 != hc.f || !this.q.h())) {
                  int $$7 = $$1 + $$3.j();
                  int $$8 = $$2 + $$3.l();
                  if ($$0.a($$7 + $$6.j(), $$8 + $$6.l()) == 0 && $$0.a($$7 + $$6.j() * 2, $$8 + $$6.l() * 2) == 0) {
                     this.a($$0, $$1 + $$3.j() + $$6.j(), $$2 + $$3.l() + $$6.l(), $$6, $$4 - 1);
                     break;
                  }
               }
            }

            hc $$9 = $$3.h();
            hc $$10 = $$3.i();
            $$0.a($$1 + $$9.j(), $$2 + $$9.l(), 0, 2);
            $$0.a($$1 + $$10.j(), $$2 + $$10.l(), 0, 2);
            $$0.a($$1 + $$3.j() + $$9.j(), $$2 + $$3.l() + $$9.l(), 0, 2);
            $$0.a($$1 + $$3.j() + $$10.j(), $$2 + $$3.l() + $$10.l(), 0, 2);
            $$0.a($$1 + $$3.j() * 2, $$2 + $$3.l() * 2, 0, 2);
            $$0.a($$1 + $$9.j() * 2, $$2 + $$9.l() * 2, 0, 2);
            $$0.a($$1 + $$10.j() * 2, $$2 + $$10.l() * 2, 0, 2);
         }
      }

      private boolean a(dxy.g $$0) {
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
         List<asy<Integer, Integer>> $$0 = Lists.newArrayList();
         dxy.g $$1 = this.t[1];

         for (int $$2 = 0; $$2 < this.s.c; $$2++) {
            for (int $$3 = 0; $$3 < this.s.b; $$3++) {
               int $$4 = $$1.a($$3, $$2);
               int $$5 = $$4 & 983040;
               if ($$5 == 131072 && ($$4 & 2097152) == 2097152) {
                  $$0.add(new asy<>($$3, $$2));
               }
            }
         }

         if ($$0.isEmpty()) {
            this.s.a(0, 0, this.s.b, this.s.c, 5);
         } else {
            asy<Integer, Integer> $$6 = $$0.get(this.q.a($$0.size()));
            int $$7 = $$1.a($$6.a(), $$6.b());
            $$1.a($$6.a(), $$6.b(), $$7 | 4194304);
            hc $$8 = this.b(this.r, $$6.a(), $$6.b(), 1, $$7 & 65535);
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

            List<hc> $$13 = Lists.newArrayList();

            for (hc $$14 : hc.c.a) {
               if (this.s.a($$9 + $$14.j(), $$10 + $$14.l()) == 0) {
                  $$13.add($$14);
               }
            }

            if ($$13.isEmpty()) {
               this.s.a(0, 0, this.s.b, this.s.c, 5);
               $$1.a($$6.a(), $$6.b(), $$7);
            } else {
               hc $$15 = $$13.get(this.q.a($$13.size()));
               this.a(this.s, $$9 + $$15.j(), $$10 + $$15.l(), $$15, 4);

               while (this.a(this.s)) {
               }
            }
         }
      }

      private void a(dxy.g $$0, dxy.g $$1) {
         ObjectArrayList<asy<Integer, Integer>> $$2 = new ObjectArrayList();

         for (int $$3 = 0; $$3 < $$0.c; $$3++) {
            for (int $$4 = 0; $$4 < $$0.b; $$4++) {
               if ($$0.a($$4, $$3) == 2) {
                  $$2.add(new asy<>($$4, $$3));
               }
            }
         }

         ac.b($$2, this.q);
         int $$5 = 10;
         ObjectListIterator var20 = $$2.iterator();

         while (var20.hasNext()) {
            asy<Integer, Integer> $$6 = (asy<Integer, Integer>)var20.next();
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
      private final dze a;
      private final ase b;
      private int c;
      private int d;

      public d(dze $$0, ase $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public void a(gw $$0, czj $$1, List<dxy.i> $$2, dxy.c $$3) {
         dxy.e $$4 = new dxy.e();
         $$4.b = $$0;
         $$4.a = $$1;
         $$4.c = "wall_flat";
         dxy.e $$5 = new dxy.e();
         this.a($$2, $$4);
         $$5.b = $$4.b.b(8);
         $$5.a = $$4.a;
         $$5.c = "wall_window";
         if (!$$2.isEmpty()) {
         }

         dxy.g $$6 = $$3.r;
         dxy.g $$7 = $$3.s;
         this.c = $$3.u + 1;
         this.d = $$3.v + 1;
         int $$8 = $$3.u + 1;
         int $$9 = $$3.v;
         this.a($$2, $$4, $$6, hc.d, this.c, this.d, $$8, $$9);
         this.a($$2, $$5, $$6, hc.d, this.c, this.d, $$8, $$9);
         dxy.e $$10 = new dxy.e();
         $$10.b = $$4.b.b(19);
         $$10.a = $$4.a;
         $$10.c = "wall_window";
         boolean $$11 = false;

         for (int $$12 = 0; $$12 < $$7.c && !$$11; $$12++) {
            for (int $$13 = $$7.b - 1; $$13 >= 0 && !$$11; $$13--) {
               if (dxy.c.a($$7, $$13, $$12)) {
                  $$10.b = $$10.b.a($$1.a(hc.d), 8 + ($$12 - this.d) * 8);
                  $$10.b = $$10.b.a($$1.a(hc.f), ($$13 - this.c) * 8);
                  this.b($$2, $$10);
                  this.a($$2, $$10, $$7, hc.d, $$13, $$12, $$13, $$12);
                  $$11 = true;
               }
            }
         }

         this.a($$2, $$0.b(16), $$1, $$6, $$7);
         this.a($$2, $$0.b(27), $$1, $$7, null);
         if (!$$2.isEmpty()) {
         }

         dxy.b[] $$14 = new dxy.b[]{new dxy.a(), new dxy.f(), new dxy.h()};

         for (int $$15 = 0; $$15 < 3; $$15++) {
            gw $$16 = $$0.b(8 * $$15 + ($$15 == 2 ? 3 : 0));
            dxy.g $$17 = $$3.t[$$15];
            dxy.g $$18 = $$15 == 2 ? $$7 : $$6;
            String $$19 = $$15 == 0 ? "carpet_south_1" : "carpet_south_2";
            String $$20 = $$15 == 0 ? "carpet_west_1" : "carpet_west_2";

            for (int $$21 = 0; $$21 < $$18.c; $$21++) {
               for (int $$22 = 0; $$22 < $$18.b; $$22++) {
                  if ($$18.a($$22, $$21) == 1) {
                     gw $$23 = $$16.a($$1.a(hc.d), 8 + ($$21 - this.d) * 8);
                     $$23 = $$23.a($$1.a(hc.f), ($$22 - this.c) * 8);
                     $$2.add(new dxy.i(this.a, "corridor_floor", $$23, $$1));
                     if ($$18.a($$22, $$21 - 1) == 1 || ($$17.a($$22, $$21 - 1) & 8388608) == 8388608) {
                        $$2.add(new dxy.i(this.a, "carpet_north", $$23.a($$1.a(hc.f), 1).c(), $$1));
                     }

                     if ($$18.a($$22 + 1, $$21) == 1 || ($$17.a($$22 + 1, $$21) & 8388608) == 8388608) {
                        $$2.add(new dxy.i(this.a, "carpet_east", $$23.a($$1.a(hc.d), 1).a($$1.a(hc.f), 5).c(), $$1));
                     }

                     if ($$18.a($$22, $$21 + 1) == 1 || ($$17.a($$22, $$21 + 1) & 8388608) == 8388608) {
                        $$2.add(new dxy.i(this.a, $$19, $$23.a($$1.a(hc.d), 5).a($$1.a(hc.e), 1), $$1));
                     }

                     if ($$18.a($$22 - 1, $$21) == 1 || ($$17.a($$22 - 1, $$21) & 8388608) == 8388608) {
                        $$2.add(new dxy.i(this.a, $$20, $$23.a($$1.a(hc.e), 1).a($$1.a(hc.c), 1), $$1));
                     }
                  }
               }
            }

            String $$24 = $$15 == 0 ? "indoors_wall_1" : "indoors_wall_2";
            String $$25 = $$15 == 0 ? "indoors_door_1" : "indoors_door_2";
            List<hc> $$26 = Lists.newArrayList();

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
                        for (hc $$33 : hc.c.a) {
                           if ($$18.a($$28 + $$33.j(), $$27 + $$33.l()) == 1) {
                              $$26.add($$33);
                           }
                        }
                     }

                     hc $$34 = null;
                     if (!$$26.isEmpty()) {
                        $$34 = $$26.get(this.b.a($$26.size()));
                     } else if (($$30 & 1048576) == 1048576) {
                        $$34 = hc.b;
                     }

                     gw $$35 = $$16.a($$1.a(hc.d), 8 + ($$27 - this.d) * 8);
                     $$35 = $$35.a($$1.a(hc.f), -1 + ($$28 - this.c) * 8);
                     if (dxy.c.a($$18, $$28 - 1, $$27) && !$$3.a($$18, $$28 - 1, $$27, $$15, $$32)) {
                        $$2.add(new dxy.i(this.a, $$34 == hc.e ? $$25 : $$24, $$35, $$1));
                     }

                     if ($$18.a($$28 + 1, $$27) == 1 && !$$29) {
                        gw $$36 = $$35.a($$1.a(hc.f), 8);
                        $$2.add(new dxy.i(this.a, $$34 == hc.f ? $$25 : $$24, $$36, $$1));
                     }

                     if (dxy.c.a($$18, $$28, $$27 + 1) && !$$3.a($$18, $$28, $$27 + 1, $$15, $$32)) {
                        gw $$37 = $$35.a($$1.a(hc.d), 7);
                        $$37 = $$37.a($$1.a(hc.f), 7);
                        $$2.add(new dxy.i(this.a, $$34 == hc.d ? $$25 : $$24, $$37, $$1.a(czj.b)));
                     }

                     if ($$18.a($$28, $$27 - 1) == 1 && !$$29) {
                        gw $$38 = $$35.a($$1.a(hc.c), 1);
                        $$38 = $$38.a($$1.a(hc.f), 7);
                        $$2.add(new dxy.i(this.a, $$34 == hc.c ? $$25 : $$24, $$38, $$1.a(czj.b)));
                     }

                     if ($$31 == 65536) {
                        this.a($$2, $$35, $$1, $$34, $$14[$$15]);
                     } else if ($$31 == 131072 && $$34 != null) {
                        hc $$39 = $$3.b($$18, $$28, $$27, $$15, $$32);
                        boolean $$40 = ($$30 & 4194304) == 4194304;
                        this.a($$2, $$35, $$1, $$39, $$34, $$14[$$15], $$40);
                     } else if ($$31 == 262144 && $$34 != null && $$34 != hc.b) {
                        hc $$41 = $$34.h();
                        if (!$$3.a($$18, $$28 + $$41.j(), $$27 + $$41.l(), $$15, $$32)) {
                           $$41 = $$41.g();
                        }

                        this.a($$2, $$35, $$1, $$41, $$34, $$14[$$15]);
                     } else if ($$31 == 262144 && $$34 == hc.b) {
                        this.a($$2, $$35, $$1, $$14[$$15]);
                     }
                  }
               }
            }
         }
      }

      private void a(List<dxy.i> $$0, dxy.e $$1, dxy.g $$2, hc $$3, int $$4, int $$5, int $$6, int $$7) {
         int $$8 = $$4;
         int $$9 = $$5;
         hc $$10 = $$3;

         do {
            if (!dxy.c.a($$2, $$8 + $$3.j(), $$9 + $$3.l())) {
               this.c($$0, $$1);
               $$3 = $$3.h();
               if ($$8 != $$6 || $$9 != $$7 || $$10 != $$3) {
                  this.b($$0, $$1);
               }
            } else if (dxy.c.a($$2, $$8 + $$3.j(), $$9 + $$3.l()) && dxy.c.a($$2, $$8 + $$3.j() + $$3.i().j(), $$9 + $$3.l() + $$3.i().l())) {
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

      private void a(List<dxy.i> $$0, gw $$1, czj $$2, dxy.g $$3, @Nullable dxy.g $$4) {
         for (int $$5 = 0; $$5 < $$3.c; $$5++) {
            for (int $$6 = 0; $$6 < $$3.b; $$6++) {
               gw $$27 = $$1.a($$2.a(hc.d), 8 + ($$5 - this.d) * 8);
               $$27 = $$27.a($$2.a(hc.f), ($$6 - this.c) * 8);
               boolean $$8 = $$4 != null && dxy.c.a($$4, $$6, $$5);
               if (dxy.c.a($$3, $$6, $$5) && !$$8) {
                  $$0.add(new dxy.i(this.a, "roof", $$27.b(3), $$2));
                  if (!dxy.c.a($$3, $$6 + 1, $$5)) {
                     gw $$9 = $$27.a($$2.a(hc.f), 6);
                     $$0.add(new dxy.i(this.a, "roof_front", $$9, $$2));
                  }

                  if (!dxy.c.a($$3, $$6 - 1, $$5)) {
                     gw $$10 = $$27.a($$2.a(hc.f), 0);
                     $$10 = $$10.a($$2.a(hc.d), 7);
                     $$0.add(new dxy.i(this.a, "roof_front", $$10, $$2.a(czj.c)));
                  }

                  if (!dxy.c.a($$3, $$6, $$5 - 1)) {
                     gw $$11 = $$27.a($$2.a(hc.e), 1);
                     $$0.add(new dxy.i(this.a, "roof_front", $$11, $$2.a(czj.d)));
                  }

                  if (!dxy.c.a($$3, $$6, $$5 + 1)) {
                     gw $$12 = $$27.a($$2.a(hc.f), 6);
                     $$12 = $$12.a($$2.a(hc.d), 6);
                     $$0.add(new dxy.i(this.a, "roof_front", $$12, $$2.a(czj.b)));
                  }
               }
            }
         }

         if ($$4 != null) {
            for (int $$13 = 0; $$13 < $$3.c; $$13++) {
               for (int $$14 = 0; $$14 < $$3.b; $$14++) {
                  gw var17 = $$1.a($$2.a(hc.d), 8 + ($$13 - this.d) * 8);
                  var17 = var17.a($$2.a(hc.f), ($$14 - this.c) * 8);
                  boolean $$16 = dxy.c.a($$4, $$14, $$13);
                  if (dxy.c.a($$3, $$14, $$13) && $$16) {
                     if (!dxy.c.a($$3, $$14 + 1, $$13)) {
                        gw $$17 = var17.a($$2.a(hc.f), 7);
                        $$0.add(new dxy.i(this.a, "small_wall", $$17, $$2));
                     }

                     if (!dxy.c.a($$3, $$14 - 1, $$13)) {
                        gw $$18 = var17.a($$2.a(hc.e), 1);
                        $$18 = $$18.a($$2.a(hc.d), 6);
                        $$0.add(new dxy.i(this.a, "small_wall", $$18, $$2.a(czj.c)));
                     }

                     if (!dxy.c.a($$3, $$14, $$13 - 1)) {
                        gw $$19 = var17.a($$2.a(hc.e), 0);
                        $$19 = $$19.a($$2.a(hc.c), 1);
                        $$0.add(new dxy.i(this.a, "small_wall", $$19, $$2.a(czj.d)));
                     }

                     if (!dxy.c.a($$3, $$14, $$13 + 1)) {
                        gw $$20 = var17.a($$2.a(hc.f), 6);
                        $$20 = $$20.a($$2.a(hc.d), 7);
                        $$0.add(new dxy.i(this.a, "small_wall", $$20, $$2.a(czj.b)));
                     }

                     if (!dxy.c.a($$3, $$14 + 1, $$13)) {
                        if (!dxy.c.a($$3, $$14, $$13 - 1)) {
                           gw $$21 = var17.a($$2.a(hc.f), 7);
                           $$21 = $$21.a($$2.a(hc.c), 2);
                           $$0.add(new dxy.i(this.a, "small_wall_corner", $$21, $$2));
                        }

                        if (!dxy.c.a($$3, $$14, $$13 + 1)) {
                           gw $$22 = var17.a($$2.a(hc.f), 8);
                           $$22 = $$22.a($$2.a(hc.d), 7);
                           $$0.add(new dxy.i(this.a, "small_wall_corner", $$22, $$2.a(czj.b)));
                        }
                     }

                     if (!dxy.c.a($$3, $$14 - 1, $$13)) {
                        if (!dxy.c.a($$3, $$14, $$13 - 1)) {
                           gw $$23 = var17.a($$2.a(hc.e), 2);
                           $$23 = $$23.a($$2.a(hc.c), 1);
                           $$0.add(new dxy.i(this.a, "small_wall_corner", $$23, $$2.a(czj.d)));
                        }

                        if (!dxy.c.a($$3, $$14, $$13 + 1)) {
                           gw $$24 = var17.a($$2.a(hc.e), 1);
                           $$24 = $$24.a($$2.a(hc.d), 8);
                           $$0.add(new dxy.i(this.a, "small_wall_corner", $$24, $$2.a(czj.c)));
                        }
                     }
                  }
               }
            }
         }

         for (int $$25 = 0; $$25 < $$3.c; $$25++) {
            for (int $$26 = 0; $$26 < $$3.b; $$26++) {
               gw var19 = $$1.a($$2.a(hc.d), 8 + ($$25 - this.d) * 8);
               var19 = var19.a($$2.a(hc.f), ($$26 - this.c) * 8);
               boolean $$28 = $$4 != null && dxy.c.a($$4, $$26, $$25);
               if (dxy.c.a($$3, $$26, $$25) && !$$28) {
                  if (!dxy.c.a($$3, $$26 + 1, $$25)) {
                     gw $$29 = var19.a($$2.a(hc.f), 6);
                     if (!dxy.c.a($$3, $$26, $$25 + 1)) {
                        gw $$30 = $$29.a($$2.a(hc.d), 6);
                        $$0.add(new dxy.i(this.a, "roof_corner", $$30, $$2));
                     } else if (dxy.c.a($$3, $$26 + 1, $$25 + 1)) {
                        gw $$31 = $$29.a($$2.a(hc.d), 5);
                        $$0.add(new dxy.i(this.a, "roof_inner_corner", $$31, $$2));
                     }

                     if (!dxy.c.a($$3, $$26, $$25 - 1)) {
                        $$0.add(new dxy.i(this.a, "roof_corner", $$29, $$2.a(czj.d)));
                     } else if (dxy.c.a($$3, $$26 + 1, $$25 - 1)) {
                        gw $$32 = var19.a($$2.a(hc.f), 9);
                        $$32 = $$32.a($$2.a(hc.c), 2);
                        $$0.add(new dxy.i(this.a, "roof_inner_corner", $$32, $$2.a(czj.b)));
                     }
                  }

                  if (!dxy.c.a($$3, $$26 - 1, $$25)) {
                     gw $$33 = var19.a($$2.a(hc.f), 0);
                     $$33 = $$33.a($$2.a(hc.d), 0);
                     if (!dxy.c.a($$3, $$26, $$25 + 1)) {
                        gw $$34 = $$33.a($$2.a(hc.d), 6);
                        $$0.add(new dxy.i(this.a, "roof_corner", $$34, $$2.a(czj.b)));
                     } else if (dxy.c.a($$3, $$26 - 1, $$25 + 1)) {
                        gw $$35 = $$33.a($$2.a(hc.d), 8);
                        $$35 = $$35.a($$2.a(hc.e), 3);
                        $$0.add(new dxy.i(this.a, "roof_inner_corner", $$35, $$2.a(czj.d)));
                     }

                     if (!dxy.c.a($$3, $$26, $$25 - 1)) {
                        $$0.add(new dxy.i(this.a, "roof_corner", $$33, $$2.a(czj.c)));
                     } else if (dxy.c.a($$3, $$26 - 1, $$25 - 1)) {
                        gw $$36 = $$33.a($$2.a(hc.d), 1);
                        $$0.add(new dxy.i(this.a, "roof_inner_corner", $$36, $$2.a(czj.c)));
                     }
                  }
               }
            }
         }
      }

      private void a(List<dxy.i> $$0, dxy.e $$1) {
         hc $$2 = $$1.a.a(hc.e);
         $$0.add(new dxy.i(this.a, "entrance", $$1.b.a($$2, 9), $$1.a));
         $$1.b = $$1.b.a($$1.a.a(hc.d), 16);
      }

      private void b(List<dxy.i> $$0, dxy.e $$1) {
         $$0.add(new dxy.i(this.a, $$1.c, $$1.b.a($$1.a.a(hc.f), 7), $$1.a));
         $$1.b = $$1.b.a($$1.a.a(hc.d), 8);
      }

      private void c(List<dxy.i> $$0, dxy.e $$1) {
         $$1.b = $$1.b.a($$1.a.a(hc.d), -1);
         $$0.add(new dxy.i(this.a, "wall_corner", $$1.b, $$1.a));
         $$1.b = $$1.b.a($$1.a.a(hc.d), -7);
         $$1.b = $$1.b.a($$1.a.a(hc.e), -6);
         $$1.a = $$1.a.a(czj.b);
      }

      private void d(List<dxy.i> $$0, dxy.e $$1) {
         $$1.b = $$1.b.a($$1.a.a(hc.d), 6);
         $$1.b = $$1.b.a($$1.a.a(hc.f), 8);
         $$1.a = $$1.a.a(czj.d);
      }

      private void a(List<dxy.i> $$0, gw $$1, czj $$2, hc $$3, dxy.b $$4) {
         czj $$5 = czj.a;
         String $$6 = $$4.a(this.b);
         if ($$3 != hc.f) {
            if ($$3 == hc.c) {
               $$5 = $$5.a(czj.d);
            } else if ($$3 == hc.e) {
               $$5 = $$5.a(czj.c);
            } else if ($$3 == hc.d) {
               $$5 = $$5.a(czj.b);
            } else {
               $$6 = $$4.b(this.b);
            }
         }

         gw $$7 = dzd.a(new gw(1, 0, 0), cxs.a, $$5, 7, 7);
         $$5 = $$5.a($$2);
         $$7 = $$7.a($$2);
         gw $$8 = $$1.b($$7.u(), 0, $$7.w());
         $$0.add(new dxy.i(this.a, $$6, $$8, $$5));
      }

      private void a(List<dxy.i> $$0, gw $$1, czj $$2, hc $$3, hc $$4, dxy.b $$5, boolean $$6) {
         if ($$4 == hc.f && $$3 == hc.d) {
            gw $$7 = $$1.a($$2.a(hc.f), 1);
            $$0.add(new dxy.i(this.a, $$5.a(this.b, $$6), $$7, $$2));
         } else if ($$4 == hc.f && $$3 == hc.c) {
            gw $$8 = $$1.a($$2.a(hc.f), 1);
            $$8 = $$8.a($$2.a(hc.d), 6);
            $$0.add(new dxy.i(this.a, $$5.a(this.b, $$6), $$8, $$2, cxs.b));
         } else if ($$4 == hc.e && $$3 == hc.c) {
            gw $$9 = $$1.a($$2.a(hc.f), 7);
            $$9 = $$9.a($$2.a(hc.d), 6);
            $$0.add(new dxy.i(this.a, $$5.a(this.b, $$6), $$9, $$2.a(czj.c)));
         } else if ($$4 == hc.e && $$3 == hc.d) {
            gw $$10 = $$1.a($$2.a(hc.f), 7);
            $$0.add(new dxy.i(this.a, $$5.a(this.b, $$6), $$10, $$2, cxs.c));
         } else if ($$4 == hc.d && $$3 == hc.f) {
            gw $$11 = $$1.a($$2.a(hc.f), 1);
            $$0.add(new dxy.i(this.a, $$5.a(this.b, $$6), $$11, $$2.a(czj.b), cxs.b));
         } else if ($$4 == hc.d && $$3 == hc.e) {
            gw $$12 = $$1.a($$2.a(hc.f), 7);
            $$0.add(new dxy.i(this.a, $$5.a(this.b, $$6), $$12, $$2.a(czj.b)));
         } else if ($$4 == hc.c && $$3 == hc.e) {
            gw $$13 = $$1.a($$2.a(hc.f), 7);
            $$13 = $$13.a($$2.a(hc.d), 6);
            $$0.add(new dxy.i(this.a, $$5.a(this.b, $$6), $$13, $$2.a(czj.b), cxs.c));
         } else if ($$4 == hc.c && $$3 == hc.f) {
            gw $$14 = $$1.a($$2.a(hc.f), 1);
            $$14 = $$14.a($$2.a(hc.d), 6);
            $$0.add(new dxy.i(this.a, $$5.a(this.b, $$6), $$14, $$2.a(czj.d)));
         } else if ($$4 == hc.d && $$3 == hc.c) {
            gw $$15 = $$1.a($$2.a(hc.f), 1);
            $$15 = $$15.a($$2.a(hc.c), 8);
            $$0.add(new dxy.i(this.a, $$5.b(this.b, $$6), $$15, $$2));
         } else if ($$4 == hc.c && $$3 == hc.d) {
            gw $$16 = $$1.a($$2.a(hc.f), 7);
            $$16 = $$16.a($$2.a(hc.d), 14);
            $$0.add(new dxy.i(this.a, $$5.b(this.b, $$6), $$16, $$2.a(czj.c)));
         } else if ($$4 == hc.e && $$3 == hc.f) {
            gw $$17 = $$1.a($$2.a(hc.f), 15);
            $$0.add(new dxy.i(this.a, $$5.b(this.b, $$6), $$17, $$2.a(czj.b)));
         } else if ($$4 == hc.f && $$3 == hc.e) {
            gw $$18 = $$1.a($$2.a(hc.e), 7);
            $$18 = $$18.a($$2.a(hc.d), 6);
            $$0.add(new dxy.i(this.a, $$5.b(this.b, $$6), $$18, $$2.a(czj.d)));
         } else if ($$4 == hc.b && $$3 == hc.f) {
            gw $$19 = $$1.a($$2.a(hc.f), 15);
            $$0.add(new dxy.i(this.a, $$5.c(this.b), $$19, $$2.a(czj.b)));
         } else if ($$4 == hc.b && $$3 == hc.d) {
            gw $$20 = $$1.a($$2.a(hc.f), 1);
            $$20 = $$20.a($$2.a(hc.c), 0);
            $$0.add(new dxy.i(this.a, $$5.c(this.b), $$20, $$2));
         }
      }

      private void a(List<dxy.i> $$0, gw $$1, czj $$2, hc $$3, hc $$4, dxy.b $$5) {
         int $$6 = 0;
         int $$7 = 0;
         czj $$8 = $$2;
         cxs $$9 = cxs.a;
         if ($$4 == hc.f && $$3 == hc.d) {
            $$6 = -7;
         } else if ($$4 == hc.f && $$3 == hc.c) {
            $$6 = -7;
            $$7 = 6;
            $$9 = cxs.b;
         } else if ($$4 == hc.c && $$3 == hc.f) {
            $$6 = 1;
            $$7 = 14;
            $$8 = $$2.a(czj.d);
         } else if ($$4 == hc.c && $$3 == hc.e) {
            $$6 = 7;
            $$7 = 14;
            $$8 = $$2.a(czj.d);
            $$9 = cxs.b;
         } else if ($$4 == hc.d && $$3 == hc.e) {
            $$6 = 7;
            $$7 = -8;
            $$8 = $$2.a(czj.b);
         } else if ($$4 == hc.d && $$3 == hc.f) {
            $$6 = 1;
            $$7 = -8;
            $$8 = $$2.a(czj.b);
            $$9 = cxs.b;
         } else if ($$4 == hc.e && $$3 == hc.c) {
            $$6 = 15;
            $$7 = 6;
            $$8 = $$2.a(czj.c);
         } else if ($$4 == hc.e && $$3 == hc.d) {
            $$6 = 15;
            $$9 = cxs.c;
         }

         gw $$10 = $$1.a($$2.a(hc.f), $$6);
         $$10 = $$10.a($$2.a(hc.d), $$7);
         $$0.add(new dxy.i(this.a, $$5.d(this.b), $$10, $$8, $$9));
      }

      private void a(List<dxy.i> $$0, gw $$1, czj $$2, dxy.b $$3) {
         gw $$4 = $$1.a($$2.a(hc.f), 1);
         $$0.add(new dxy.i(this.a, $$3.e(this.b), $$4, $$2, cxs.a));
      }
   }

   static class e {
      public czj a;
      public gw b;
      public String c;
   }

   static class f extends dxy.b {
      @Override
      public String a(ase $$0) {
         return "1x1_b" + ($$0.a(4) + 1);
      }

      @Override
      public String b(ase $$0) {
         return "1x1_as" + ($$0.a(4) + 1);
      }

      @Override
      public String a(ase $$0, boolean $$1) {
         return $$1 ? "1x2_c_stairs" : "1x2_c" + ($$0.a(4) + 1);
      }

      @Override
      public String b(ase $$0, boolean $$1) {
         return $$1 ? "1x2_d_stairs" : "1x2_d" + ($$0.a(5) + 1);
      }

      @Override
      public String c(ase $$0) {
         return "1x2_se" + ($$0.a(1) + 1);
      }

      @Override
      public String d(ase $$0) {
         return "2x2_b" + ($$0.a(5) + 1);
      }

      @Override
      public String e(ase $$0) {
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

   static class h extends dxy.f {
   }

   public static class i extends dvu {
      public i(dze $$0, String $$1, gw $$2, czj $$3) {
         this($$0, $$1, $$2, $$3, cxs.a);
      }

      public i(dze $$0, String $$1, gw $$2, czj $$3, cxs $$4) {
         super(dwb.Z, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public i(dze $$0, qy $$1) {
         super(dwb.Z, $$1, $$0, $$1x -> a(cxs.valueOf($$1.l("Mi")), czj.valueOf($$1.l("Rot"))));
      }

      @Override
      protected aey b() {
         return a(this.a);
      }

      private static aey a(String $$0) {
         return new aey("woodland_mansion/" + $$0);
      }

      private static dyz a(cxs $$0, czj $$1) {
         return new dyz().a(true).a($$1).a($$0).a(dyf.b);
      }

      @Override
      protected void a(dwa $$0, qy $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Mi", this.c.c().name());
      }

      @Override
      protected void a(String $$0, gw $$1, cqm $$2, ase $$3, dvc $$4) {
         if ($$0.startsWith("Chest")) {
            czj $$5 = this.c.d();
            dfl $$6 = csy.cv.n();
            if ("ChestWest".equals($$0)) {
               $$6 = $$6.a(ctz.b, $$5.a(hc.e));
            } else if ("ChestEast".equals($$0)) {
               $$6 = $$6.a(ctz.b, $$5.a(hc.f));
            } else if ("ChestSouth".equals($$0)) {
               $$6 = $$6.a(ctz.b, $$5.a(hc.d));
            } else if ("ChestNorth".equals($$0)) {
               $$6 = $$6.a(ctz.b, $$5.a(hc.c));
            }

            this.a($$2, $$4, $$3, $$1, ecq.D, $$6);
         } else {
            List<bjk> $$7 = new ArrayList<>();
            switch ($$0) {
               case "Mage":
                  $$7.add(biw.G.a((cpx)$$2.C()));
                  break;
               case "Warrior":
                  $$7.add(biw.bg.a((cpx)$$2.C()));
                  break;
               case "Group of Allays":
                  int $$8 = $$2.D_().a(3) + 1;

                  for (int $$9 = 0; $$9 < $$8; $$9++) {
                     $$7.add(biw.b.a((cpx)$$2.C()));
                  }
                  break;
               default:
                  return;
            }

            for (bjk $$10 : $$7) {
               if ($$10 != null) {
                  $$10.fI();
                  $$10.a($$1, 0.0F, 0.0F);
                  $$10.a($$2, $$2.d_($$10.dl()), bjm.d, null, null);
                  $$2.a_($$10);
                  $$2.a($$1, csy.a.n(), 2);
               }
            }
         }
      }
   }
}
