import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Set;

public class ekt {
   private ekt() {
   }

   static class a implements ekt.i {
      @Override
      public boolean a(ekt.v $$0) {
         return $$0.c[je.f.d()] && !$$0.b[je.f.d()].d;
      }

      @Override
      public ekt.r a(je $$0, ekt.v $$1, azh $$2) {
         $$1.d = true;
         $$1.b[je.f.d()].d = true;
         return new ekt.k($$0, $$1);
      }
   }

   static class b implements ekt.i {
      @Override
      public boolean a(ekt.v $$0) {
         if ($$0.c[je.f.d()] && !$$0.b[je.f.d()].d && $$0.c[je.b.d()] && !$$0.b[je.b.d()].d) {
            ekt.v $$1 = $$0.b[je.f.d()];
            return $$1.c[je.b.d()] && !$$1.b[je.b.d()].d;
         } else {
            return false;
         }
      }

      @Override
      public ekt.r a(je $$0, ekt.v $$1, azh $$2) {
         $$1.d = true;
         $$1.b[je.f.d()].d = true;
         $$1.b[je.b.d()].d = true;
         $$1.b[je.f.d()].b[je.b.d()].d = true;
         return new ekt.l($$0, $$1);
      }
   }

   static class c implements ekt.i {
      @Override
      public boolean a(ekt.v $$0) {
         return $$0.c[je.b.d()] && !$$0.b[je.b.d()].d;
      }

      @Override
      public ekt.r a(je $$0, ekt.v $$1, azh $$2) {
         $$1.d = true;
         $$1.b[je.b.d()].d = true;
         return new ekt.m($$0, $$1);
      }
   }

   static class d implements ekt.i {
      @Override
      public boolean a(ekt.v $$0) {
         if ($$0.c[je.c.d()] && !$$0.b[je.c.d()].d && $$0.c[je.b.d()] && !$$0.b[je.b.d()].d) {
            ekt.v $$1 = $$0.b[je.c.d()];
            return $$1.c[je.b.d()] && !$$1.b[je.b.d()].d;
         } else {
            return false;
         }
      }

      @Override
      public ekt.r a(je $$0, ekt.v $$1, azh $$2) {
         $$1.d = true;
         $$1.b[je.c.d()].d = true;
         $$1.b[je.b.d()].d = true;
         $$1.b[je.c.d()].b[je.b.d()].d = true;
         return new ekt.n($$0, $$1);
      }
   }

   static class e implements ekt.i {
      @Override
      public boolean a(ekt.v $$0) {
         return $$0.c[je.c.d()] && !$$0.b[je.c.d()].d;
      }

      @Override
      public ekt.r a(je $$0, ekt.v $$1, azh $$2) {
         ekt.v $$3 = $$1;
         if (!$$1.c[je.c.d()] || $$1.b[je.c.d()].d) {
            $$3 = $$1.b[je.d.d()];
         }

         $$3.d = true;
         $$3.b[je.c.d()].d = true;
         return new ekt.o($$0, $$3);
      }
   }

   static class f implements ekt.i {
      @Override
      public boolean a(ekt.v $$0) {
         return true;
      }

      @Override
      public ekt.r a(je $$0, ekt.v $$1, azh $$2) {
         $$1.d = true;
         return new ekt.s($$0, $$1, $$2);
      }
   }

   static class g implements ekt.i {
      @Override
      public boolean a(ekt.v $$0) {
         return !$$0.c[je.e.d()] && !$$0.c[je.f.d()] && !$$0.c[je.c.d()] && !$$0.c[je.d.d()] && !$$0.c[je.b.d()];
      }

      @Override
      public ekt.r a(je $$0, ekt.v $$1, azh $$2) {
         $$1.d = true;
         return new ekt.t($$0, $$1);
      }
   }

   public static class h extends ekt.r {
      private static final int C = 58;
      private static final int D = 22;
      private static final int E = 58;
      public static final int a = 29;
      private static final int F = 61;
      private ekt.v G;
      private ekt.v H;
      private final List<ekt.r> I = Lists.newArrayList();

      public h(azh $$0, int $$1, int $$2, je $$3) {
         super(ejb.M, $$3, 0, a($$1, 39, $$2, $$3, 58, 23, 58));
         this.a($$3);
         List<ekt.v> $$4 = this.b($$0);
         this.G.d = true;
         this.I.add(new ekt.p($$3, this.G));
         this.I.add(new ekt.j($$3, this.H));
         List<ekt.i> $$5 = Lists.newArrayList();
         $$5.add(new ekt.b());
         $$5.add(new ekt.d());
         $$5.add(new ekt.e());
         $$5.add(new ekt.a());
         $$5.add(new ekt.c());
         $$5.add(new ekt.g());
         $$5.add(new ekt.f());

         for (ekt.v $$6 : $$4) {
            if (!$$6.d && !$$6.b()) {
               for (ekt.i $$7 : $$5) {
                  if ($$7.a($$6)) {
                     this.I.add($$7.a($$3, $$6, $$0));
                     break;
                  }
               }
            }
         }

         iz $$8 = this.b(9, 0, 22);

         for (ekt.r $$9 : this.I) {
            $$9.f().a((kd)$$8);
         }

         eic $$10 = eic.a(this.b(1, 1, 1), this.b(23, 8, 21));
         eic $$11 = eic.a(this.b(34, 1, 1), this.b(56, 8, 21));
         eic $$12 = eic.a(this.b(22, 13, 22), this.b(35, 17, 35));
         int $$13 = $$0.f();
         this.I.add(new ekt.u($$3, $$10, $$13++));
         this.I.add(new ekt.u($$3, $$11, $$13++));
         this.I.add(new ekt.q($$3, $$12));
      }

      public h(us $$0) {
         super(ejb.M, $$0);
      }

      private List<ekt.v> b(azh $$0) {
         ekt.v[] $$1 = new ekt.v[75];

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 4; $$3++) {
               int $$4 = 0;
               int $$5 = c($$2, 0, $$3);
               $$1[$$5] = new ekt.v($$5);
            }
         }

         for (int $$6 = 0; $$6 < 5; $$6++) {
            for (int $$7 = 0; $$7 < 4; $$7++) {
               int $$8 = 1;
               int $$9 = c($$6, 1, $$7);
               $$1[$$9] = new ekt.v($$9);
            }
         }

         for (int $$10 = 1; $$10 < 4; $$10++) {
            for (int $$11 = 0; $$11 < 2; $$11++) {
               int $$12 = 2;
               int $$13 = c($$10, 2, $$11);
               $$1[$$13] = new ekt.v($$13);
            }
         }

         this.G = $$1[u];

         for (int $$14 = 0; $$14 < 5; $$14++) {
            for (int $$15 = 0; $$15 < 5; $$15++) {
               for (int $$16 = 0; $$16 < 3; $$16++) {
                  int $$17 = c($$14, $$16, $$15);
                  if ($$1[$$17] != null) {
                     for (je $$18 : je.values()) {
                        int $$19 = $$14 + $$18.j();
                        int $$20 = $$16 + $$18.k();
                        int $$21 = $$15 + $$18.l();
                        if ($$19 >= 0 && $$19 < 5 && $$21 >= 0 && $$21 < 5 && $$20 >= 0 && $$20 < 3) {
                           int $$22 = c($$19, $$20, $$21);
                           if ($$1[$$22] != null) {
                              if ($$21 == $$15) {
                                 $$1[$$17].a($$18, $$1[$$22]);
                              } else {
                                 $$1[$$17].a($$18.g(), $$1[$$22]);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         ekt.v $$23 = new ekt.v(1003);
         ekt.v $$24 = new ekt.v(1001);
         ekt.v $$25 = new ekt.v(1002);
         $$1[v].a(je.b, $$23);
         $$1[w].a(je.d, $$24);
         $$1[x].a(je.d, $$25);
         $$23.d = true;
         $$24.d = true;
         $$25.d = true;
         this.G.e = true;
         this.H = $$1[c($$0.a(4), 0, 2)];
         this.H.d = true;
         this.H.b[je.f.d()].d = true;
         this.H.b[je.c.d()].d = true;
         this.H.b[je.f.d()].b[je.c.d()].d = true;
         this.H.b[je.b.d()].d = true;
         this.H.b[je.f.d()].b[je.b.d()].d = true;
         this.H.b[je.c.d()].b[je.b.d()].d = true;
         this.H.b[je.f.d()].b[je.c.d()].b[je.b.d()].d = true;
         ObjectArrayList<ekt.v> $$26 = new ObjectArrayList();

         for (ekt.v $$27 : $$1) {
            if ($$27 != null) {
               $$27.a();
               $$26.add($$27);
            }
         }

         $$23.a();
         ac.c($$26, $$0);
         int $$28 = 1;
         ObjectListIterator var34 = $$26.iterator();

         while (var34.hasNext()) {
            ekt.v $$29 = (ekt.v)var34.next();
            int $$30 = 0;
            int $$31 = 0;

            while ($$30 < 2 && $$31 < 5) {
               $$31++;
               int $$32 = $$0.a(6);
               if ($$29.c[$$32]) {
                  int $$33 = je.a($$32).g().d();
                  $$29.c[$$32] = false;
                  $$29.b[$$32].c[$$33] = false;
                  if ($$29.a($$28++) && $$29.b[$$32].a($$28++)) {
                     $$30++;
                  } else {
                     $$29.c[$$32] = true;
                     $$29.b[$$32].c[$$33] = true;
                  }
               }
            }
         }

         $$26.add($$23);
         $$26.add($$24);
         $$26.add($$25);
         return $$26;
      }

      @Override
      public void a(dct $$0, dcr $$1, dtz $$2, azh $$3, eic $$4, dbf $$5, iz $$6) {
         int $$7 = Math.max($$0.z_(), 64) - this.f.i();
         this.b($$0, $$4, 0, 0, 0, 58, $$7, 58);
         this.a(false, 0, $$0, $$3, $$4);
         this.a(true, 33, $$0, $$3, $$4);
         this.a($$0, $$3, $$4);
         this.b($$0, $$3, $$4);
         this.c($$0, $$3, $$4);
         this.d($$0, $$3, $$4);
         this.e($$0, $$3, $$4);
         this.f($$0, $$3, $$4);

         for (int $$8 = 0; $$8 < 7; $$8++) {
            int $$9 = 0;

            while ($$9 < 7) {
               if ($$9 == 0 && $$8 == 3) {
                  $$9 = 6;
               }

               int $$10 = $$8 * 9;
               int $$11 = $$9 * 9;

               for (int $$12 = 0; $$12 < 4; $$12++) {
                  for (int $$13 = 0; $$13 < 4; $$13++) {
                     this.a($$0, c, $$10 + $$12, 0, $$11 + $$13, $$4);
                     this.b($$0, c, $$10 + $$12, -1, $$11 + $$13, $$4);
                  }
               }

               if ($$8 != 0 && $$8 != 6) {
                  $$9 += 6;
               } else {
                  $$9++;
               }
            }
         }

         for (int $$14 = 0; $$14 < 5; $$14++) {
            this.b($$0, $$4, -1 - $$14, 0 + $$14 * 2, -1 - $$14, -1 - $$14, 23, 58 + $$14);
            this.b($$0, $$4, 58 + $$14, 0 + $$14 * 2, -1 - $$14, 58 + $$14, 23, 58 + $$14);
            this.b($$0, $$4, 0 - $$14, 0 + $$14 * 2, -1 - $$14, 57 + $$14, 23, -1 - $$14);
            this.b($$0, $$4, 0 - $$14, 0 + $$14 * 2, 58 + $$14, 57 + $$14, 23, 58 + $$14);
         }

         for (ekt.r $$15 : this.I) {
            if ($$15.f().a($$4)) {
               $$15.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
            }
         }
      }

      private void a(boolean $$0, int $$1, dct $$2, azh $$3, eic $$4) {
         int $$5 = 24;
         if (this.a($$4, $$1, 0, $$1 + 23, 20)) {
            this.a($$2, $$4, $$1 + 0, 0, 0, $$1 + 24, 0, 20, b, b, false);
            this.b($$2, $$4, $$1 + 0, 1, 0, $$1 + 24, 10, 20);

            for (int $$6 = 0; $$6 < 4; $$6++) {
               this.a($$2, $$4, $$1 + $$6, $$6 + 1, $$6, $$1 + $$6, $$6 + 1, 20, c, c, false);
               this.a($$2, $$4, $$1 + $$6 + 7, $$6 + 5, $$6 + 7, $$1 + $$6 + 7, $$6 + 5, 20, c, c, false);
               this.a($$2, $$4, $$1 + 17 - $$6, $$6 + 5, $$6 + 7, $$1 + 17 - $$6, $$6 + 5, 20, c, c, false);
               this.a($$2, $$4, $$1 + 24 - $$6, $$6 + 1, $$6, $$1 + 24 - $$6, $$6 + 1, 20, c, c, false);
               this.a($$2, $$4, $$1 + $$6 + 1, $$6 + 1, $$6, $$1 + 23 - $$6, $$6 + 1, $$6, c, c, false);
               this.a($$2, $$4, $$1 + $$6 + 8, $$6 + 5, $$6 + 7, $$1 + 16 - $$6, $$6 + 5, $$6 + 7, c, c, false);
            }

            this.a($$2, $$4, $$1 + 4, 4, 4, $$1 + 6, 4, 20, b, b, false);
            this.a($$2, $$4, $$1 + 7, 4, 4, $$1 + 17, 4, 6, b, b, false);
            this.a($$2, $$4, $$1 + 18, 4, 4, $$1 + 20, 4, 20, b, b, false);
            this.a($$2, $$4, $$1 + 11, 8, 11, $$1 + 13, 8, 20, b, b, false);
            this.a($$2, h, $$1 + 12, 9, 12, $$4);
            this.a($$2, h, $$1 + 12, 9, 15, $$4);
            this.a($$2, h, $$1 + 12, 9, 18, $$4);
            int $$7 = $$1 + ($$0 ? 19 : 5);
            int $$8 = $$1 + ($$0 ? 5 : 19);

            for (int $$9 = 20; $$9 >= 5; $$9 -= 3) {
               this.a($$2, h, $$7, 5, $$9, $$4);
            }

            for (int $$10 = 19; $$10 >= 7; $$10 -= 3) {
               this.a($$2, h, $$8, 5, $$10, $$4);
            }

            for (int $$11 = 0; $$11 < 4; $$11++) {
               int $$12 = $$0 ? $$1 + 24 - (17 - $$11 * 3) : $$1 + 17 - $$11 * 3;
               this.a($$2, h, $$12, 5, 5, $$4);
            }

            this.a($$2, h, $$8, 5, 5, $$4);
            this.a($$2, $$4, $$1 + 11, 1, 12, $$1 + 13, 7, 12, b, b, false);
            this.a($$2, $$4, $$1 + 12, 1, 11, $$1 + 12, 7, 13, b, b, false);
         }
      }

      private void a(dct $$0, azh $$1, eic $$2) {
         if (this.a($$2, 22, 5, 35, 17)) {
            this.b($$0, $$2, 25, 0, 0, 32, 8, 20);

            for (int $$3 = 0; $$3 < 4; $$3++) {
               this.a($$0, $$2, 24, 2, 5 + $$3 * 4, 24, 4, 5 + $$3 * 4, c, c, false);
               this.a($$0, $$2, 22, 4, 5 + $$3 * 4, 23, 4, 5 + $$3 * 4, c, c, false);
               this.a($$0, c, 25, 5, 5 + $$3 * 4, $$2);
               this.a($$0, c, 26, 6, 5 + $$3 * 4, $$2);
               this.a($$0, i, 26, 5, 5 + $$3 * 4, $$2);
               this.a($$0, $$2, 33, 2, 5 + $$3 * 4, 33, 4, 5 + $$3 * 4, c, c, false);
               this.a($$0, $$2, 34, 4, 5 + $$3 * 4, 35, 4, 5 + $$3 * 4, c, c, false);
               this.a($$0, c, 32, 5, 5 + $$3 * 4, $$2);
               this.a($$0, c, 31, 6, 5 + $$3 * 4, $$2);
               this.a($$0, i, 31, 5, 5 + $$3 * 4, $$2);
               this.a($$0, $$2, 27, 6, 5 + $$3 * 4, 30, 6, 5 + $$3 * 4, b, b, false);
            }
         }
      }

      private void b(dct $$0, azh $$1, eic $$2) {
         if (this.a($$2, 15, 20, 42, 21)) {
            this.a($$0, $$2, 15, 0, 21, 42, 0, 21, b, b, false);
            this.b($$0, $$2, 26, 1, 21, 31, 3, 21);
            this.a($$0, $$2, 21, 12, 21, 36, 12, 21, b, b, false);
            this.a($$0, $$2, 17, 11, 21, 40, 11, 21, b, b, false);
            this.a($$0, $$2, 16, 10, 21, 41, 10, 21, b, b, false);
            this.a($$0, $$2, 15, 7, 21, 42, 9, 21, b, b, false);
            this.a($$0, $$2, 16, 6, 21, 41, 6, 21, b, b, false);
            this.a($$0, $$2, 17, 5, 21, 40, 5, 21, b, b, false);
            this.a($$0, $$2, 21, 4, 21, 36, 4, 21, b, b, false);
            this.a($$0, $$2, 22, 3, 21, 26, 3, 21, b, b, false);
            this.a($$0, $$2, 31, 3, 21, 35, 3, 21, b, b, false);
            this.a($$0, $$2, 23, 2, 21, 25, 2, 21, b, b, false);
            this.a($$0, $$2, 32, 2, 21, 34, 2, 21, b, b, false);
            this.a($$0, $$2, 28, 4, 20, 29, 4, 21, c, c, false);
            this.a($$0, c, 27, 3, 21, $$2);
            this.a($$0, c, 30, 3, 21, $$2);
            this.a($$0, c, 26, 2, 21, $$2);
            this.a($$0, c, 31, 2, 21, $$2);
            this.a($$0, c, 25, 1, 21, $$2);
            this.a($$0, c, 32, 1, 21, $$2);

            for (int $$3 = 0; $$3 < 7; $$3++) {
               this.a($$0, d, 28 - $$3, 6 + $$3, 21, $$2);
               this.a($$0, d, 29 + $$3, 6 + $$3, 21, $$2);
            }

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.a($$0, d, 28 - $$4, 9 + $$4, 21, $$2);
               this.a($$0, d, 29 + $$4, 9 + $$4, 21, $$2);
            }

            this.a($$0, d, 28, 12, 21, $$2);
            this.a($$0, d, 29, 12, 21, $$2);

            for (int $$5 = 0; $$5 < 3; $$5++) {
               this.a($$0, d, 22 - $$5 * 2, 8, 21, $$2);
               this.a($$0, d, 22 - $$5 * 2, 9, 21, $$2);
               this.a($$0, d, 35 + $$5 * 2, 8, 21, $$2);
               this.a($$0, d, 35 + $$5 * 2, 9, 21, $$2);
            }

            this.b($$0, $$2, 15, 13, 21, 42, 15, 21);
            this.b($$0, $$2, 15, 1, 21, 15, 6, 21);
            this.b($$0, $$2, 16, 1, 21, 16, 5, 21);
            this.b($$0, $$2, 17, 1, 21, 20, 4, 21);
            this.b($$0, $$2, 21, 1, 21, 21, 3, 21);
            this.b($$0, $$2, 22, 1, 21, 22, 2, 21);
            this.b($$0, $$2, 23, 1, 21, 24, 1, 21);
            this.b($$0, $$2, 42, 1, 21, 42, 6, 21);
            this.b($$0, $$2, 41, 1, 21, 41, 5, 21);
            this.b($$0, $$2, 37, 1, 21, 40, 4, 21);
            this.b($$0, $$2, 36, 1, 21, 36, 3, 21);
            this.b($$0, $$2, 33, 1, 21, 34, 1, 21);
            this.b($$0, $$2, 35, 1, 21, 35, 2, 21);
         }
      }

      private void c(dct $$0, azh $$1, eic $$2) {
         if (this.a($$2, 21, 21, 36, 36)) {
            this.a($$0, $$2, 21, 0, 22, 36, 0, 36, b, b, false);
            this.b($$0, $$2, 21, 1, 22, 36, 23, 36);

            for (int $$3 = 0; $$3 < 4; $$3++) {
               this.a($$0, $$2, 21 + $$3, 13 + $$3, 21 + $$3, 36 - $$3, 13 + $$3, 21 + $$3, c, c, false);
               this.a($$0, $$2, 21 + $$3, 13 + $$3, 36 - $$3, 36 - $$3, 13 + $$3, 36 - $$3, c, c, false);
               this.a($$0, $$2, 21 + $$3, 13 + $$3, 22 + $$3, 21 + $$3, 13 + $$3, 35 - $$3, c, c, false);
               this.a($$0, $$2, 36 - $$3, 13 + $$3, 22 + $$3, 36 - $$3, 13 + $$3, 35 - $$3, c, c, false);
            }

            this.a($$0, $$2, 25, 16, 25, 32, 16, 32, b, b, false);
            this.a($$0, $$2, 25, 17, 25, 25, 19, 25, c, c, false);
            this.a($$0, $$2, 32, 17, 25, 32, 19, 25, c, c, false);
            this.a($$0, $$2, 25, 17, 32, 25, 19, 32, c, c, false);
            this.a($$0, $$2, 32, 17, 32, 32, 19, 32, c, c, false);
            this.a($$0, c, 26, 20, 26, $$2);
            this.a($$0, c, 27, 21, 27, $$2);
            this.a($$0, i, 27, 20, 27, $$2);
            this.a($$0, c, 26, 20, 31, $$2);
            this.a($$0, c, 27, 21, 30, $$2);
            this.a($$0, i, 27, 20, 30, $$2);
            this.a($$0, c, 31, 20, 31, $$2);
            this.a($$0, c, 30, 21, 30, $$2);
            this.a($$0, i, 30, 20, 30, $$2);
            this.a($$0, c, 31, 20, 26, $$2);
            this.a($$0, c, 30, 21, 27, $$2);
            this.a($$0, i, 30, 20, 27, $$2);
            this.a($$0, $$2, 28, 21, 27, 29, 21, 27, b, b, false);
            this.a($$0, $$2, 27, 21, 28, 27, 21, 29, b, b, false);
            this.a($$0, $$2, 28, 21, 30, 29, 21, 30, b, b, false);
            this.a($$0, $$2, 30, 21, 28, 30, 21, 29, b, b, false);
         }
      }

      private void d(dct $$0, azh $$1, eic $$2) {
         if (this.a($$2, 0, 21, 6, 58)) {
            this.a($$0, $$2, 0, 0, 21, 6, 0, 57, b, b, false);
            this.b($$0, $$2, 0, 1, 21, 6, 7, 57);
            this.a($$0, $$2, 4, 4, 21, 6, 4, 53, b, b, false);

            for (int $$3 = 0; $$3 < 4; $$3++) {
               this.a($$0, $$2, $$3, $$3 + 1, 21, $$3, $$3 + 1, 57 - $$3, c, c, false);
            }

            for (int $$4 = 23; $$4 < 53; $$4 += 3) {
               this.a($$0, h, 5, 5, $$4, $$2);
            }

            this.a($$0, h, 5, 5, 52, $$2);

            for (int $$5 = 0; $$5 < 4; $$5++) {
               this.a($$0, $$2, $$5, $$5 + 1, 21, $$5, $$5 + 1, 57 - $$5, c, c, false);
            }

            this.a($$0, $$2, 4, 1, 52, 6, 3, 52, b, b, false);
            this.a($$0, $$2, 5, 1, 51, 5, 3, 53, b, b, false);
         }

         if (this.a($$2, 51, 21, 58, 58)) {
            this.a($$0, $$2, 51, 0, 21, 57, 0, 57, b, b, false);
            this.b($$0, $$2, 51, 1, 21, 57, 7, 57);
            this.a($$0, $$2, 51, 4, 21, 53, 4, 53, b, b, false);

            for (int $$6 = 0; $$6 < 4; $$6++) {
               this.a($$0, $$2, 57 - $$6, $$6 + 1, 21, 57 - $$6, $$6 + 1, 57 - $$6, c, c, false);
            }

            for (int $$7 = 23; $$7 < 53; $$7 += 3) {
               this.a($$0, h, 52, 5, $$7, $$2);
            }

            this.a($$0, h, 52, 5, 52, $$2);
            this.a($$0, $$2, 51, 1, 52, 53, 3, 52, b, b, false);
            this.a($$0, $$2, 52, 1, 51, 52, 3, 53, b, b, false);
         }

         if (this.a($$2, 0, 51, 57, 57)) {
            this.a($$0, $$2, 7, 0, 51, 50, 0, 57, b, b, false);
            this.b($$0, $$2, 7, 1, 51, 50, 10, 57);

            for (int $$8 = 0; $$8 < 4; $$8++) {
               this.a($$0, $$2, $$8 + 1, $$8 + 1, 57 - $$8, 56 - $$8, $$8 + 1, 57 - $$8, c, c, false);
            }
         }
      }

      private void e(dct $$0, azh $$1, eic $$2) {
         if (this.a($$2, 7, 21, 13, 50)) {
            this.a($$0, $$2, 7, 0, 21, 13, 0, 50, b, b, false);
            this.b($$0, $$2, 7, 1, 21, 13, 10, 50);
            this.a($$0, $$2, 11, 8, 21, 13, 8, 53, b, b, false);

            for (int $$3 = 0; $$3 < 4; $$3++) {
               this.a($$0, $$2, $$3 + 7, $$3 + 5, 21, $$3 + 7, $$3 + 5, 54, c, c, false);
            }

            for (int $$4 = 21; $$4 <= 45; $$4 += 3) {
               this.a($$0, h, 12, 9, $$4, $$2);
            }
         }

         if (this.a($$2, 44, 21, 50, 54)) {
            this.a($$0, $$2, 44, 0, 21, 50, 0, 50, b, b, false);
            this.b($$0, $$2, 44, 1, 21, 50, 10, 50);
            this.a($$0, $$2, 44, 8, 21, 46, 8, 53, b, b, false);

            for (int $$5 = 0; $$5 < 4; $$5++) {
               this.a($$0, $$2, 50 - $$5, $$5 + 5, 21, 50 - $$5, $$5 + 5, 54, c, c, false);
            }

            for (int $$6 = 21; $$6 <= 45; $$6 += 3) {
               this.a($$0, h, 45, 9, $$6, $$2);
            }
         }

         if (this.a($$2, 8, 44, 49, 54)) {
            this.a($$0, $$2, 14, 0, 44, 43, 0, 50, b, b, false);
            this.b($$0, $$2, 14, 1, 44, 43, 10, 50);

            for (int $$7 = 12; $$7 <= 45; $$7 += 3) {
               this.a($$0, h, $$7, 9, 45, $$2);
               this.a($$0, h, $$7, 9, 52, $$2);
               if ($$7 == 12 || $$7 == 18 || $$7 == 24 || $$7 == 33 || $$7 == 39 || $$7 == 45) {
                  this.a($$0, h, $$7, 9, 47, $$2);
                  this.a($$0, h, $$7, 9, 50, $$2);
                  this.a($$0, h, $$7, 10, 45, $$2);
                  this.a($$0, h, $$7, 10, 46, $$2);
                  this.a($$0, h, $$7, 10, 51, $$2);
                  this.a($$0, h, $$7, 10, 52, $$2);
                  this.a($$0, h, $$7, 11, 47, $$2);
                  this.a($$0, h, $$7, 11, 50, $$2);
                  this.a($$0, h, $$7, 12, 48, $$2);
                  this.a($$0, h, $$7, 12, 49, $$2);
               }
            }

            for (int $$8 = 0; $$8 < 3; $$8++) {
               this.a($$0, $$2, 8 + $$8, 5 + $$8, 54, 49 - $$8, 5 + $$8, 54, b, b, false);
            }

            this.a($$0, $$2, 11, 8, 54, 46, 8, 54, c, c, false);
            this.a($$0, $$2, 14, 8, 44, 43, 8, 53, b, b, false);
         }
      }

      private void f(dct $$0, azh $$1, eic $$2) {
         if (this.a($$2, 14, 21, 20, 43)) {
            this.a($$0, $$2, 14, 0, 21, 20, 0, 43, b, b, false);
            this.b($$0, $$2, 14, 1, 22, 20, 14, 43);
            this.a($$0, $$2, 18, 12, 22, 20, 12, 39, b, b, false);
            this.a($$0, $$2, 18, 12, 21, 20, 12, 21, c, c, false);

            for (int $$3 = 0; $$3 < 4; $$3++) {
               this.a($$0, $$2, $$3 + 14, $$3 + 9, 21, $$3 + 14, $$3 + 9, 43 - $$3, c, c, false);
            }

            for (int $$4 = 23; $$4 <= 39; $$4 += 3) {
               this.a($$0, h, 19, 13, $$4, $$2);
            }
         }

         if (this.a($$2, 37, 21, 43, 43)) {
            this.a($$0, $$2, 37, 0, 21, 43, 0, 43, b, b, false);
            this.b($$0, $$2, 37, 1, 22, 43, 14, 43);
            this.a($$0, $$2, 37, 12, 22, 39, 12, 39, b, b, false);
            this.a($$0, $$2, 37, 12, 21, 39, 12, 21, c, c, false);

            for (int $$5 = 0; $$5 < 4; $$5++) {
               this.a($$0, $$2, 43 - $$5, $$5 + 9, 21, 43 - $$5, $$5 + 9, 43 - $$5, c, c, false);
            }

            for (int $$6 = 23; $$6 <= 39; $$6 += 3) {
               this.a($$0, h, 38, 13, $$6, $$2);
            }
         }

         if (this.a($$2, 15, 37, 42, 43)) {
            this.a($$0, $$2, 21, 0, 37, 36, 0, 43, b, b, false);
            this.b($$0, $$2, 21, 1, 37, 36, 14, 43);
            this.a($$0, $$2, 21, 12, 37, 36, 12, 39, b, b, false);

            for (int $$7 = 0; $$7 < 4; $$7++) {
               this.a($$0, $$2, 15 + $$7, $$7 + 9, 43 - $$7, 42 - $$7, $$7 + 9, 43 - $$7, c, c, false);
            }

            for (int $$8 = 21; $$8 <= 36; $$8 += 3) {
               this.a($$0, h, $$8, 13, 38, $$2);
            }
         }
      }
   }

   interface i {
      boolean a(ekt.v var1);

      ekt.r a(je var1, ekt.v var2, azh var3);
   }

   public static class j extends ekt.r {
      public j(je $$0, ekt.v $$1) {
         super(ejb.N, 1, $$0, $$1, 2, 2, 2);
      }

      public j(us $$0) {
         super(ejb.N, $$0);
      }

      @Override
      public void a(dct $$0, dcr $$1, dtz $$2, azh $$3, eic $$4, dbf $$5, iz $$6) {
         this.a($$0, $$4, 1, 8, 0, 14, 8, 14, b);
         int $$7 = 7;
         dsc $$8 = c;
         this.a($$0, $$4, 0, 7, 0, 0, 7, 15, $$8, $$8, false);
         this.a($$0, $$4, 15, 7, 0, 15, 7, 15, $$8, $$8, false);
         this.a($$0, $$4, 1, 7, 0, 15, 7, 0, $$8, $$8, false);
         this.a($$0, $$4, 1, 7, 15, 14, 7, 15, $$8, $$8, false);

         for (int $$9 = 1; $$9 <= 6; $$9++) {
            $$8 = c;
            if ($$9 == 2 || $$9 == 6) {
               $$8 = b;
            }

            for (int $$11 = 0; $$11 <= 15; $$11 += 15) {
               this.a($$0, $$4, $$11, $$9, 0, $$11, $$9, 1, $$8, $$8, false);
               this.a($$0, $$4, $$11, $$9, 6, $$11, $$9, 9, $$8, $$8, false);
               this.a($$0, $$4, $$11, $$9, 14, $$11, $$9, 15, $$8, $$8, false);
            }

            this.a($$0, $$4, 1, $$9, 0, 1, $$9, 0, $$8, $$8, false);
            this.a($$0, $$4, 6, $$9, 0, 9, $$9, 0, $$8, $$8, false);
            this.a($$0, $$4, 14, $$9, 0, 14, $$9, 0, $$8, $$8, false);
            this.a($$0, $$4, 1, $$9, 15, 14, $$9, 15, $$8, $$8, false);
         }

         this.a($$0, $$4, 6, 3, 6, 9, 6, 9, d, d, false);
         this.a($$0, $$4, 7, 4, 7, 8, 5, 8, dfb.ch.o(), dfb.ch.o(), false);

         for (int $$12 = 3; $$12 <= 6; $$12 += 3) {
            for (int $$13 = 6; $$13 <= 9; $$13 += 3) {
               this.a($$0, i, $$13, $$12, 6, $$4);
               this.a($$0, i, $$13, $$12, 9, $$4);
            }
         }

         this.a($$0, $$4, 5, 1, 6, 5, 2, 6, c, c, false);
         this.a($$0, $$4, 5, 1, 9, 5, 2, 9, c, c, false);
         this.a($$0, $$4, 10, 1, 6, 10, 2, 6, c, c, false);
         this.a($$0, $$4, 10, 1, 9, 10, 2, 9, c, c, false);
         this.a($$0, $$4, 6, 1, 5, 6, 2, 5, c, c, false);
         this.a($$0, $$4, 9, 1, 5, 9, 2, 5, c, c, false);
         this.a($$0, $$4, 6, 1, 10, 6, 2, 10, c, c, false);
         this.a($$0, $$4, 9, 1, 10, 9, 2, 10, c, c, false);
         this.a($$0, $$4, 5, 2, 5, 5, 6, 5, c, c, false);
         this.a($$0, $$4, 5, 2, 10, 5, 6, 10, c, c, false);
         this.a($$0, $$4, 10, 2, 5, 10, 6, 5, c, c, false);
         this.a($$0, $$4, 10, 2, 10, 10, 6, 10, c, c, false);
         this.a($$0, $$4, 5, 7, 1, 5, 7, 6, c, c, false);
         this.a($$0, $$4, 10, 7, 1, 10, 7, 6, c, c, false);
         this.a($$0, $$4, 5, 7, 9, 5, 7, 14, c, c, false);
         this.a($$0, $$4, 10, 7, 9, 10, 7, 14, c, c, false);
         this.a($$0, $$4, 1, 7, 5, 6, 7, 5, c, c, false);
         this.a($$0, $$4, 1, 7, 10, 6, 7, 10, c, c, false);
         this.a($$0, $$4, 9, 7, 5, 14, 7, 5, c, c, false);
         this.a($$0, $$4, 9, 7, 10, 14, 7, 10, c, c, false);
         this.a($$0, $$4, 2, 1, 2, 2, 1, 3, c, c, false);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 2, c, c, false);
         this.a($$0, $$4, 13, 1, 2, 13, 1, 3, c, c, false);
         this.a($$0, $$4, 12, 1, 2, 12, 1, 2, c, c, false);
         this.a($$0, $$4, 2, 1, 12, 2, 1, 13, c, c, false);
         this.a($$0, $$4, 3, 1, 13, 3, 1, 13, c, c, false);
         this.a($$0, $$4, 13, 1, 12, 13, 1, 13, c, c, false);
         this.a($$0, $$4, 12, 1, 13, 12, 1, 13, c, c, false);
      }
   }

   public static class k extends ekt.r {
      public k(je $$0, ekt.v $$1) {
         super(ejb.O, 1, $$0, $$1, 2, 1, 1);
      }

      public k(us $$0) {
         super(ejb.O, $$0);
      }

      @Override
      public void a(dct $$0, dcr $$1, dtz $$2, azh $$3, eic $$4, dbf $$5, iz $$6) {
         ekt.v $$7 = this.B.b[je.f.d()];
         ekt.v $$8 = this.B;
         if (this.B.a / 25 > 0) {
            this.a($$0, $$4, 8, 0, $$7.c[je.a.d()]);
            this.a($$0, $$4, 0, 0, $$8.c[je.a.d()]);
         }

         if ($$8.b[je.b.d()] == null) {
            this.a($$0, $$4, 1, 4, 1, 7, 4, 6, b);
         }

         if ($$7.b[je.b.d()] == null) {
            this.a($$0, $$4, 8, 4, 1, 14, 4, 6, b);
         }

         this.a($$0, $$4, 0, 3, 0, 0, 3, 7, c, c, false);
         this.a($$0, $$4, 15, 3, 0, 15, 3, 7, c, c, false);
         this.a($$0, $$4, 1, 3, 0, 15, 3, 0, c, c, false);
         this.a($$0, $$4, 1, 3, 7, 14, 3, 7, c, c, false);
         this.a($$0, $$4, 0, 2, 0, 0, 2, 7, b, b, false);
         this.a($$0, $$4, 15, 2, 0, 15, 2, 7, b, b, false);
         this.a($$0, $$4, 1, 2, 0, 15, 2, 0, b, b, false);
         this.a($$0, $$4, 1, 2, 7, 14, 2, 7, b, b, false);
         this.a($$0, $$4, 0, 1, 0, 0, 1, 7, c, c, false);
         this.a($$0, $$4, 15, 1, 0, 15, 1, 7, c, c, false);
         this.a($$0, $$4, 1, 1, 0, 15, 1, 0, c, c, false);
         this.a($$0, $$4, 1, 1, 7, 14, 1, 7, c, c, false);
         this.a($$0, $$4, 5, 1, 0, 10, 1, 4, c, c, false);
         this.a($$0, $$4, 6, 2, 0, 9, 2, 3, b, b, false);
         this.a($$0, $$4, 5, 3, 0, 10, 3, 4, c, c, false);
         this.a($$0, i, 6, 2, 3, $$4);
         this.a($$0, i, 9, 2, 3, $$4);
         if ($$8.c[je.d.d()]) {
            this.b($$0, $$4, 3, 1, 0, 4, 2, 0);
         }

         if ($$8.c[je.c.d()]) {
            this.b($$0, $$4, 3, 1, 7, 4, 2, 7);
         }

         if ($$8.c[je.e.d()]) {
            this.b($$0, $$4, 0, 1, 3, 0, 2, 4);
         }

         if ($$7.c[je.d.d()]) {
            this.b($$0, $$4, 11, 1, 0, 12, 2, 0);
         }

         if ($$7.c[je.c.d()]) {
            this.b($$0, $$4, 11, 1, 7, 12, 2, 7);
         }

         if ($$7.c[je.f.d()]) {
            this.b($$0, $$4, 15, 1, 3, 15, 2, 4);
         }
      }
   }

   public static class l extends ekt.r {
      public l(je $$0, ekt.v $$1) {
         super(ejb.P, 1, $$0, $$1, 2, 2, 1);
      }

      public l(us $$0) {
         super(ejb.P, $$0);
      }

      @Override
      public void a(dct $$0, dcr $$1, dtz $$2, azh $$3, eic $$4, dbf $$5, iz $$6) {
         ekt.v $$7 = this.B.b[je.f.d()];
         ekt.v $$8 = this.B;
         ekt.v $$9 = $$8.b[je.b.d()];
         ekt.v $$10 = $$7.b[je.b.d()];
         if (this.B.a / 25 > 0) {
            this.a($$0, $$4, 8, 0, $$7.c[je.a.d()]);
            this.a($$0, $$4, 0, 0, $$8.c[je.a.d()]);
         }

         if ($$9.b[je.b.d()] == null) {
            this.a($$0, $$4, 1, 8, 1, 7, 8, 6, b);
         }

         if ($$10.b[je.b.d()] == null) {
            this.a($$0, $$4, 8, 8, 1, 14, 8, 6, b);
         }

         for (int $$11 = 1; $$11 <= 7; $$11++) {
            dsc $$12 = c;
            if ($$11 == 2 || $$11 == 6) {
               $$12 = b;
            }

            this.a($$0, $$4, 0, $$11, 0, 0, $$11, 7, $$12, $$12, false);
            this.a($$0, $$4, 15, $$11, 0, 15, $$11, 7, $$12, $$12, false);
            this.a($$0, $$4, 1, $$11, 0, 15, $$11, 0, $$12, $$12, false);
            this.a($$0, $$4, 1, $$11, 7, 14, $$11, 7, $$12, $$12, false);
         }

         this.a($$0, $$4, 2, 1, 3, 2, 7, 4, c, c, false);
         this.a($$0, $$4, 3, 1, 2, 4, 7, 2, c, c, false);
         this.a($$0, $$4, 3, 1, 5, 4, 7, 5, c, c, false);
         this.a($$0, $$4, 13, 1, 3, 13, 7, 4, c, c, false);
         this.a($$0, $$4, 11, 1, 2, 12, 7, 2, c, c, false);
         this.a($$0, $$4, 11, 1, 5, 12, 7, 5, c, c, false);
         this.a($$0, $$4, 5, 1, 3, 5, 3, 4, c, c, false);
         this.a($$0, $$4, 10, 1, 3, 10, 3, 4, c, c, false);
         this.a($$0, $$4, 5, 7, 2, 10, 7, 5, c, c, false);
         this.a($$0, $$4, 5, 5, 2, 5, 7, 2, c, c, false);
         this.a($$0, $$4, 10, 5, 2, 10, 7, 2, c, c, false);
         this.a($$0, $$4, 5, 5, 5, 5, 7, 5, c, c, false);
         this.a($$0, $$4, 10, 5, 5, 10, 7, 5, c, c, false);
         this.a($$0, c, 6, 6, 2, $$4);
         this.a($$0, c, 9, 6, 2, $$4);
         this.a($$0, c, 6, 6, 5, $$4);
         this.a($$0, c, 9, 6, 5, $$4);
         this.a($$0, $$4, 5, 4, 3, 6, 4, 4, c, c, false);
         this.a($$0, $$4, 9, 4, 3, 10, 4, 4, c, c, false);
         this.a($$0, i, 5, 4, 2, $$4);
         this.a($$0, i, 5, 4, 5, $$4);
         this.a($$0, i, 10, 4, 2, $$4);
         this.a($$0, i, 10, 4, 5, $$4);
         if ($$8.c[je.d.d()]) {
            this.b($$0, $$4, 3, 1, 0, 4, 2, 0);
         }

         if ($$8.c[je.c.d()]) {
            this.b($$0, $$4, 3, 1, 7, 4, 2, 7);
         }

         if ($$8.c[je.e.d()]) {
            this.b($$0, $$4, 0, 1, 3, 0, 2, 4);
         }

         if ($$7.c[je.d.d()]) {
            this.b($$0, $$4, 11, 1, 0, 12, 2, 0);
         }

         if ($$7.c[je.c.d()]) {
            this.b($$0, $$4, 11, 1, 7, 12, 2, 7);
         }

         if ($$7.c[je.f.d()]) {
            this.b($$0, $$4, 15, 1, 3, 15, 2, 4);
         }

         if ($$9.c[je.d.d()]) {
            this.b($$0, $$4, 3, 5, 0, 4, 6, 0);
         }

         if ($$9.c[je.c.d()]) {
            this.b($$0, $$4, 3, 5, 7, 4, 6, 7);
         }

         if ($$9.c[je.e.d()]) {
            this.b($$0, $$4, 0, 5, 3, 0, 6, 4);
         }

         if ($$10.c[je.d.d()]) {
            this.b($$0, $$4, 11, 5, 0, 12, 6, 0);
         }

         if ($$10.c[je.c.d()]) {
            this.b($$0, $$4, 11, 5, 7, 12, 6, 7);
         }

         if ($$10.c[je.f.d()]) {
            this.b($$0, $$4, 15, 5, 3, 15, 6, 4);
         }
      }
   }

   public static class m extends ekt.r {
      public m(je $$0, ekt.v $$1) {
         super(ejb.Q, 1, $$0, $$1, 1, 2, 1);
      }

      public m(us $$0) {
         super(ejb.Q, $$0);
      }

      @Override
      public void a(dct $$0, dcr $$1, dtz $$2, azh $$3, eic $$4, dbf $$5, iz $$6) {
         if (this.B.a / 25 > 0) {
            this.a($$0, $$4, 0, 0, this.B.c[je.a.d()]);
         }

         ekt.v $$7 = this.B.b[je.b.d()];
         if ($$7.b[je.b.d()] == null) {
            this.a($$0, $$4, 1, 8, 1, 6, 8, 6, b);
         }

         this.a($$0, $$4, 0, 4, 0, 0, 4, 7, c, c, false);
         this.a($$0, $$4, 7, 4, 0, 7, 4, 7, c, c, false);
         this.a($$0, $$4, 1, 4, 0, 6, 4, 0, c, c, false);
         this.a($$0, $$4, 1, 4, 7, 6, 4, 7, c, c, false);
         this.a($$0, $$4, 2, 4, 1, 2, 4, 2, c, c, false);
         this.a($$0, $$4, 1, 4, 2, 1, 4, 2, c, c, false);
         this.a($$0, $$4, 5, 4, 1, 5, 4, 2, c, c, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 2, c, c, false);
         this.a($$0, $$4, 2, 4, 5, 2, 4, 6, c, c, false);
         this.a($$0, $$4, 1, 4, 5, 1, 4, 5, c, c, false);
         this.a($$0, $$4, 5, 4, 5, 5, 4, 6, c, c, false);
         this.a($$0, $$4, 6, 4, 5, 6, 4, 5, c, c, false);
         ekt.v $$8 = this.B;

         for (int $$9 = 1; $$9 <= 5; $$9 += 4) {
            int $$10 = 0;
            if ($$8.c[je.d.d()]) {
               this.a($$0, $$4, 2, $$9, $$10, 2, $$9 + 2, $$10, c, c, false);
               this.a($$0, $$4, 5, $$9, $$10, 5, $$9 + 2, $$10, c, c, false);
               this.a($$0, $$4, 3, $$9 + 2, $$10, 4, $$9 + 2, $$10, c, c, false);
            } else {
               this.a($$0, $$4, 0, $$9, $$10, 7, $$9 + 2, $$10, c, c, false);
               this.a($$0, $$4, 0, $$9 + 1, $$10, 7, $$9 + 1, $$10, b, b, false);
            }

            int var13 = 7;
            if ($$8.c[je.c.d()]) {
               this.a($$0, $$4, 2, $$9, var13, 2, $$9 + 2, var13, c, c, false);
               this.a($$0, $$4, 5, $$9, var13, 5, $$9 + 2, var13, c, c, false);
               this.a($$0, $$4, 3, $$9 + 2, var13, 4, $$9 + 2, var13, c, c, false);
            } else {
               this.a($$0, $$4, 0, $$9, var13, 7, $$9 + 2, var13, c, c, false);
               this.a($$0, $$4, 0, $$9 + 1, var13, 7, $$9 + 1, var13, b, b, false);
            }

            int $$11 = 0;
            if ($$8.c[je.e.d()]) {
               this.a($$0, $$4, $$11, $$9, 2, $$11, $$9 + 2, 2, c, c, false);
               this.a($$0, $$4, $$11, $$9, 5, $$11, $$9 + 2, 5, c, c, false);
               this.a($$0, $$4, $$11, $$9 + 2, 3, $$11, $$9 + 2, 4, c, c, false);
            } else {
               this.a($$0, $$4, $$11, $$9, 0, $$11, $$9 + 2, 7, c, c, false);
               this.a($$0, $$4, $$11, $$9 + 1, 0, $$11, $$9 + 1, 7, b, b, false);
            }

            int var14 = 7;
            if ($$8.c[je.f.d()]) {
               this.a($$0, $$4, var14, $$9, 2, var14, $$9 + 2, 2, c, c, false);
               this.a($$0, $$4, var14, $$9, 5, var14, $$9 + 2, 5, c, c, false);
               this.a($$0, $$4, var14, $$9 + 2, 3, var14, $$9 + 2, 4, c, c, false);
            } else {
               this.a($$0, $$4, var14, $$9, 0, var14, $$9 + 2, 7, c, c, false);
               this.a($$0, $$4, var14, $$9 + 1, 0, var14, $$9 + 1, 7, b, b, false);
            }

            $$8 = $$7;
         }
      }
   }

   public static class n extends ekt.r {
      public n(je $$0, ekt.v $$1) {
         super(ejb.R, 1, $$0, $$1, 1, 2, 2);
      }

      public n(us $$0) {
         super(ejb.R, $$0);
      }

      @Override
      public void a(dct $$0, dcr $$1, dtz $$2, azh $$3, eic $$4, dbf $$5, iz $$6) {
         ekt.v $$7 = this.B.b[je.c.d()];
         ekt.v $$8 = this.B;
         ekt.v $$9 = $$7.b[je.b.d()];
         ekt.v $$10 = $$8.b[je.b.d()];
         if (this.B.a / 25 > 0) {
            this.a($$0, $$4, 0, 8, $$7.c[je.a.d()]);
            this.a($$0, $$4, 0, 0, $$8.c[je.a.d()]);
         }

         if ($$10.b[je.b.d()] == null) {
            this.a($$0, $$4, 1, 8, 1, 6, 8, 7, b);
         }

         if ($$9.b[je.b.d()] == null) {
            this.a($$0, $$4, 1, 8, 8, 6, 8, 14, b);
         }

         for (int $$11 = 1; $$11 <= 7; $$11++) {
            dsc $$12 = c;
            if ($$11 == 2 || $$11 == 6) {
               $$12 = b;
            }

            this.a($$0, $$4, 0, $$11, 0, 0, $$11, 15, $$12, $$12, false);
            this.a($$0, $$4, 7, $$11, 0, 7, $$11, 15, $$12, $$12, false);
            this.a($$0, $$4, 1, $$11, 0, 6, $$11, 0, $$12, $$12, false);
            this.a($$0, $$4, 1, $$11, 15, 6, $$11, 15, $$12, $$12, false);
         }

         for (int $$13 = 1; $$13 <= 7; $$13++) {
            dsc $$14 = d;
            if ($$13 == 2 || $$13 == 6) {
               $$14 = i;
            }

            this.a($$0, $$4, 3, $$13, 7, 4, $$13, 8, $$14, $$14, false);
         }

         if ($$8.c[je.d.d()]) {
            this.b($$0, $$4, 3, 1, 0, 4, 2, 0);
         }

         if ($$8.c[je.f.d()]) {
            this.b($$0, $$4, 7, 1, 3, 7, 2, 4);
         }

         if ($$8.c[je.e.d()]) {
            this.b($$0, $$4, 0, 1, 3, 0, 2, 4);
         }

         if ($$7.c[je.c.d()]) {
            this.b($$0, $$4, 3, 1, 15, 4, 2, 15);
         }

         if ($$7.c[je.e.d()]) {
            this.b($$0, $$4, 0, 1, 11, 0, 2, 12);
         }

         if ($$7.c[je.f.d()]) {
            this.b($$0, $$4, 7, 1, 11, 7, 2, 12);
         }

         if ($$10.c[je.d.d()]) {
            this.b($$0, $$4, 3, 5, 0, 4, 6, 0);
         }

         if ($$10.c[je.f.d()]) {
            this.b($$0, $$4, 7, 5, 3, 7, 6, 4);
            this.a($$0, $$4, 5, 4, 2, 6, 4, 5, c, c, false);
            this.a($$0, $$4, 6, 1, 2, 6, 3, 2, c, c, false);
            this.a($$0, $$4, 6, 1, 5, 6, 3, 5, c, c, false);
         }

         if ($$10.c[je.e.d()]) {
            this.b($$0, $$4, 0, 5, 3, 0, 6, 4);
            this.a($$0, $$4, 1, 4, 2, 2, 4, 5, c, c, false);
            this.a($$0, $$4, 1, 1, 2, 1, 3, 2, c, c, false);
            this.a($$0, $$4, 1, 1, 5, 1, 3, 5, c, c, false);
         }

         if ($$9.c[je.c.d()]) {
            this.b($$0, $$4, 3, 5, 15, 4, 6, 15);
         }

         if ($$9.c[je.e.d()]) {
            this.b($$0, $$4, 0, 5, 11, 0, 6, 12);
            this.a($$0, $$4, 1, 4, 10, 2, 4, 13, c, c, false);
            this.a($$0, $$4, 1, 1, 10, 1, 3, 10, c, c, false);
            this.a($$0, $$4, 1, 1, 13, 1, 3, 13, c, c, false);
         }

         if ($$9.c[je.f.d()]) {
            this.b($$0, $$4, 7, 5, 11, 7, 6, 12);
            this.a($$0, $$4, 5, 4, 10, 6, 4, 13, c, c, false);
            this.a($$0, $$4, 6, 1, 10, 6, 3, 10, c, c, false);
            this.a($$0, $$4, 6, 1, 13, 6, 3, 13, c, c, false);
         }
      }
   }

   public static class o extends ekt.r {
      public o(je $$0, ekt.v $$1) {
         super(ejb.S, 1, $$0, $$1, 1, 1, 2);
      }

      public o(us $$0) {
         super(ejb.S, $$0);
      }

      @Override
      public void a(dct $$0, dcr $$1, dtz $$2, azh $$3, eic $$4, dbf $$5, iz $$6) {
         ekt.v $$7 = this.B.b[je.c.d()];
         ekt.v $$8 = this.B;
         if (this.B.a / 25 > 0) {
            this.a($$0, $$4, 0, 8, $$7.c[je.a.d()]);
            this.a($$0, $$4, 0, 0, $$8.c[je.a.d()]);
         }

         if ($$8.b[je.b.d()] == null) {
            this.a($$0, $$4, 1, 4, 1, 6, 4, 7, b);
         }

         if ($$7.b[je.b.d()] == null) {
            this.a($$0, $$4, 1, 4, 8, 6, 4, 14, b);
         }

         this.a($$0, $$4, 0, 3, 0, 0, 3, 15, c, c, false);
         this.a($$0, $$4, 7, 3, 0, 7, 3, 15, c, c, false);
         this.a($$0, $$4, 1, 3, 0, 7, 3, 0, c, c, false);
         this.a($$0, $$4, 1, 3, 15, 6, 3, 15, c, c, false);
         this.a($$0, $$4, 0, 2, 0, 0, 2, 15, b, b, false);
         this.a($$0, $$4, 7, 2, 0, 7, 2, 15, b, b, false);
         this.a($$0, $$4, 1, 2, 0, 7, 2, 0, b, b, false);
         this.a($$0, $$4, 1, 2, 15, 6, 2, 15, b, b, false);
         this.a($$0, $$4, 0, 1, 0, 0, 1, 15, c, c, false);
         this.a($$0, $$4, 7, 1, 0, 7, 1, 15, c, c, false);
         this.a($$0, $$4, 1, 1, 0, 7, 1, 0, c, c, false);
         this.a($$0, $$4, 1, 1, 15, 6, 1, 15, c, c, false);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 2, c, c, false);
         this.a($$0, $$4, 6, 1, 1, 6, 1, 2, c, c, false);
         this.a($$0, $$4, 1, 3, 1, 1, 3, 2, c, c, false);
         this.a($$0, $$4, 6, 3, 1, 6, 3, 2, c, c, false);
         this.a($$0, $$4, 1, 1, 13, 1, 1, 14, c, c, false);
         this.a($$0, $$4, 6, 1, 13, 6, 1, 14, c, c, false);
         this.a($$0, $$4, 1, 3, 13, 1, 3, 14, c, c, false);
         this.a($$0, $$4, 6, 3, 13, 6, 3, 14, c, c, false);
         this.a($$0, $$4, 2, 1, 6, 2, 3, 6, c, c, false);
         this.a($$0, $$4, 5, 1, 6, 5, 3, 6, c, c, false);
         this.a($$0, $$4, 2, 1, 9, 2, 3, 9, c, c, false);
         this.a($$0, $$4, 5, 1, 9, 5, 3, 9, c, c, false);
         this.a($$0, $$4, 3, 2, 6, 4, 2, 6, c, c, false);
         this.a($$0, $$4, 3, 2, 9, 4, 2, 9, c, c, false);
         this.a($$0, $$4, 2, 2, 7, 2, 2, 8, c, c, false);
         this.a($$0, $$4, 5, 2, 7, 5, 2, 8, c, c, false);
         this.a($$0, i, 2, 2, 5, $$4);
         this.a($$0, i, 5, 2, 5, $$4);
         this.a($$0, i, 2, 2, 10, $$4);
         this.a($$0, i, 5, 2, 10, $$4);
         this.a($$0, c, 2, 3, 5, $$4);
         this.a($$0, c, 5, 3, 5, $$4);
         this.a($$0, c, 2, 3, 10, $$4);
         this.a($$0, c, 5, 3, 10, $$4);
         if ($$8.c[je.d.d()]) {
            this.b($$0, $$4, 3, 1, 0, 4, 2, 0);
         }

         if ($$8.c[je.f.d()]) {
            this.b($$0, $$4, 7, 1, 3, 7, 2, 4);
         }

         if ($$8.c[je.e.d()]) {
            this.b($$0, $$4, 0, 1, 3, 0, 2, 4);
         }

         if ($$7.c[je.c.d()]) {
            this.b($$0, $$4, 3, 1, 15, 4, 2, 15);
         }

         if ($$7.c[je.e.d()]) {
            this.b($$0, $$4, 0, 1, 11, 0, 2, 12);
         }

         if ($$7.c[je.f.d()]) {
            this.b($$0, $$4, 7, 1, 11, 7, 2, 12);
         }
      }
   }

   public static class p extends ekt.r {
      public p(je $$0, ekt.v $$1) {
         super(ejb.T, 1, $$0, $$1, 1, 1, 1);
      }

      public p(us $$0) {
         super(ejb.T, $$0);
      }

      @Override
      public void a(dct $$0, dcr $$1, dtz $$2, azh $$3, eic $$4, dbf $$5, iz $$6) {
         this.a($$0, $$4, 0, 3, 0, 2, 3, 7, c, c, false);
         this.a($$0, $$4, 5, 3, 0, 7, 3, 7, c, c, false);
         this.a($$0, $$4, 0, 2, 0, 1, 2, 7, c, c, false);
         this.a($$0, $$4, 6, 2, 0, 7, 2, 7, c, c, false);
         this.a($$0, $$4, 0, 1, 0, 0, 1, 7, c, c, false);
         this.a($$0, $$4, 7, 1, 0, 7, 1, 7, c, c, false);
         this.a($$0, $$4, 0, 1, 7, 7, 3, 7, c, c, false);
         this.a($$0, $$4, 1, 1, 0, 2, 3, 0, c, c, false);
         this.a($$0, $$4, 5, 1, 0, 6, 3, 0, c, c, false);
         if (this.B.c[je.c.d()]) {
            this.b($$0, $$4, 3, 1, 7, 4, 2, 7);
         }

         if (this.B.c[je.e.d()]) {
            this.b($$0, $$4, 0, 1, 3, 1, 2, 4);
         }

         if (this.B.c[je.f.d()]) {
            this.b($$0, $$4, 6, 1, 3, 7, 2, 4);
         }
      }
   }

   public static class q extends ekt.r {
      public q(je $$0, eic $$1) {
         super(ejb.U, $$0, 1, $$1);
      }

      public q(us $$0) {
         super(ejb.U, $$0);
      }

      @Override
      public void a(dct $$0, dcr $$1, dtz $$2, azh $$3, eic $$4, dbf $$5, iz $$6) {
         this.a($$0, $$4, 2, -1, 2, 11, -1, 11, c, c, false);
         this.a($$0, $$4, 0, -1, 0, 1, -1, 11, b, b, false);
         this.a($$0, $$4, 12, -1, 0, 13, -1, 11, b, b, false);
         this.a($$0, $$4, 2, -1, 0, 11, -1, 1, b, b, false);
         this.a($$0, $$4, 2, -1, 12, 11, -1, 13, b, b, false);
         this.a($$0, $$4, 0, 0, 0, 0, 0, 13, c, c, false);
         this.a($$0, $$4, 13, 0, 0, 13, 0, 13, c, c, false);
         this.a($$0, $$4, 1, 0, 0, 12, 0, 0, c, c, false);
         this.a($$0, $$4, 1, 0, 13, 12, 0, 13, c, c, false);

         for (int $$7 = 2; $$7 <= 11; $$7 += 3) {
            this.a($$0, i, 0, 0, $$7, $$4);
            this.a($$0, i, 13, 0, $$7, $$4);
            this.a($$0, i, $$7, 0, 0, $$4);
         }

         this.a($$0, $$4, 2, 0, 3, 4, 0, 9, c, c, false);
         this.a($$0, $$4, 9, 0, 3, 11, 0, 9, c, c, false);
         this.a($$0, $$4, 4, 0, 9, 9, 0, 11, c, c, false);
         this.a($$0, c, 5, 0, 8, $$4);
         this.a($$0, c, 8, 0, 8, $$4);
         this.a($$0, c, 10, 0, 10, $$4);
         this.a($$0, c, 3, 0, 10, $$4);
         this.a($$0, $$4, 3, 0, 3, 3, 0, 7, d, d, false);
         this.a($$0, $$4, 10, 0, 3, 10, 0, 7, d, d, false);
         this.a($$0, $$4, 6, 0, 10, 7, 0, 10, d, d, false);
         int $$8 = 3;

         for (int $$9 = 0; $$9 < 2; $$9++) {
            for (int $$10 = 2; $$10 <= 8; $$10 += 3) {
               this.a($$0, $$4, $$8, 0, $$10, $$8, 2, $$10, c, c, false);
            }

            $$8 = 10;
         }

         this.a($$0, $$4, 5, 0, 10, 5, 2, 10, c, c, false);
         this.a($$0, $$4, 8, 0, 10, 8, 2, 10, c, c, false);
         this.a($$0, $$4, 6, -1, 7, 7, -1, 8, d, d, false);
         this.b($$0, $$4, 6, -1, 3, 7, -1, 4);
         this.a($$0, $$4, 6, 1, 6);
      }
   }

   protected abstract static class r extends eio {
      protected static final dsc b = dfb.hZ.o();
      protected static final dsc c = dfb.ia.o();
      protected static final dsc d = dfb.ib.o();
      protected static final dsc h = c;
      protected static final dsc i = dfb.ii.o();
      protected static final boolean j = true;
      protected static final dsc k = dfb.G.o();
      protected static final Set<dez> l = ImmutableSet.builder().add(dfb.dO).add(dfb.iC).add(dfb.mW).add(k.b()).build();
      protected static final int m = 8;
      protected static final int n = 8;
      protected static final int o = 4;
      protected static final int p = 5;
      protected static final int q = 5;
      protected static final int r = 3;
      protected static final int s = 25;
      protected static final int t = 75;
      protected static final int u = c(2, 0, 0);
      protected static final int v = c(2, 2, 0);
      protected static final int w = c(0, 1, 0);
      protected static final int x = c(4, 1, 0);
      protected static final int y = 1001;
      protected static final int z = 1002;
      protected static final int A = 1003;
      protected ekt.v B;

      protected static int c(int $$0, int $$1, int $$2) {
         return $$1 * 25 + $$2 * 5 + $$0;
      }

      public r(ejb $$0, je $$1, int $$2, eic $$3) {
         super($$0, $$2, $$3);
         this.a($$1);
      }

      protected r(ejb $$0, int $$1, je $$2, ekt.v $$3, int $$4, int $$5, int $$6) {
         super($$0, $$1, a($$2, $$3, $$4, $$5, $$6));
         this.a($$2);
         this.B = $$3;
      }

      private static eic a(je $$0, ekt.v $$1, int $$2, int $$3, int $$4) {
         int $$5 = $$1.a;
         int $$6 = $$5 % 5;
         int $$7 = $$5 / 5 % 5;
         int $$8 = $$5 / 25;
         eic $$9 = a(0, 0, 0, $$0, $$2 * 8, $$3 * 4, $$4 * 8);
         switch ($$0) {
            case c:
               $$9.a($$6 * 8, $$8 * 4, -($$7 + $$4) * 8 + 1);
               break;
            case d:
               $$9.a($$6 * 8, $$8 * 4, $$7 * 8);
               break;
            case e:
               $$9.a(-($$7 + $$4) * 8 + 1, $$8 * 4, $$6 * 8);
               break;
            case f:
            default:
               $$9.a($$7 * 8, $$8 * 4, $$6 * 8);
         }

         return $$9;
      }

      public r(ejb $$0, us $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(eja $$0, us $$1) {
      }

      protected void b(dct $$0, eic $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
         for (int $$8 = $$3; $$8 <= $$6; $$8++) {
            for (int $$9 = $$2; $$9 <= $$5; $$9++) {
               for (int $$10 = $$4; $$10 <= $$7; $$10++) {
                  dsc $$11 = this.a($$0, $$9, $$8, $$10, $$1);
                  if (!l.contains($$11.b())) {
                     if (this.b($$8) >= $$0.z_() && $$11 != k) {
                        this.a($$0, dfb.a.o(), $$9, $$8, $$10, $$1);
                     } else {
                        this.a($$0, k, $$9, $$8, $$10, $$1);
                     }
                  }
               }
            }
         }
      }

      protected void a(dct $$0, eic $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            this.a($$0, $$1, $$2 + 0, 0, $$3 + 0, $$2 + 2, 0, $$3 + 8 - 1, b, b, false);
            this.a($$0, $$1, $$2 + 5, 0, $$3 + 0, $$2 + 8 - 1, 0, $$3 + 8 - 1, b, b, false);
            this.a($$0, $$1, $$2 + 3, 0, $$3 + 0, $$2 + 4, 0, $$3 + 2, b, b, false);
            this.a($$0, $$1, $$2 + 3, 0, $$3 + 5, $$2 + 4, 0, $$3 + 8 - 1, b, b, false);
            this.a($$0, $$1, $$2 + 3, 0, $$3 + 2, $$2 + 4, 0, $$3 + 2, c, c, false);
            this.a($$0, $$1, $$2 + 3, 0, $$3 + 5, $$2 + 4, 0, $$3 + 5, c, c, false);
            this.a($$0, $$1, $$2 + 2, 0, $$3 + 3, $$2 + 2, 0, $$3 + 4, c, c, false);
            this.a($$0, $$1, $$2 + 5, 0, $$3 + 3, $$2 + 5, 0, $$3 + 4, c, c, false);
         } else {
            this.a($$0, $$1, $$2 + 0, 0, $$3 + 0, $$2 + 8 - 1, 0, $$3 + 8 - 1, b, b, false);
         }
      }

      protected void a(dct $$0, eic $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dsc $$8) {
         for (int $$9 = $$3; $$9 <= $$6; $$9++) {
            for (int $$10 = $$2; $$10 <= $$5; $$10++) {
               for (int $$11 = $$4; $$11 <= $$7; $$11++) {
                  if (this.a($$0, $$10, $$9, $$11, $$1) == k) {
                     this.a($$0, $$8, $$10, $$9, $$11, $$1);
                  }
               }
            }
         }
      }

      protected boolean a(eic $$0, int $$1, int $$2, int $$3, int $$4) {
         int $$5 = this.a($$1, $$2);
         int $$6 = this.b($$1, $$2);
         int $$7 = this.a($$3, $$4);
         int $$8 = this.b($$3, $$4);
         return $$0.a(Math.min($$5, $$7), Math.min($$6, $$8), Math.max($$5, $$7), Math.max($$6, $$8));
      }

      protected void a(dct $$0, eic $$1, int $$2, int $$3, int $$4) {
         iz $$5 = this.b($$2, $$3, $$4);
         if ($$1.b($$5)) {
            cjs $$6 = bta.D.a((dby)$$0.E());
            if ($$6 != null) {
               $$6.c($$6.eR());
               $$6.b((double)$$5.u() + 0.5, (double)$$5.v(), (double)$$5.w() + 0.5, 0.0F, 0.0F);
               $$6.a($$0, $$0.d_($$6.dp()), btt.d, null);
               $$0.a_($$6);
            }
         }
      }
   }

   public static class s extends ekt.r {
      private int a;

      public s(je $$0, ekt.v $$1, azh $$2) {
         super(ejb.V, 1, $$0, $$1, 1, 1, 1);
         this.a = $$2.a(3);
      }

      public s(us $$0) {
         super(ejb.V, $$0);
      }

      @Override
      public void a(dct $$0, dcr $$1, dtz $$2, azh $$3, eic $$4, dbf $$5, iz $$6) {
         if (this.B.a / 25 > 0) {
            this.a($$0, $$4, 0, 0, this.B.c[je.a.d()]);
         }

         if (this.B.b[je.b.d()] == null) {
            this.a($$0, $$4, 1, 4, 1, 6, 4, 6, b);
         }

         boolean $$7 = this.a != 0 && $$3.h() && !this.B.c[je.a.d()] && !this.B.c[je.b.d()] && this.B.c() > 1;
         if (this.a == 0) {
            this.a($$0, $$4, 0, 1, 0, 2, 1, 2, c, c, false);
            this.a($$0, $$4, 0, 3, 0, 2, 3, 2, c, c, false);
            this.a($$0, $$4, 0, 2, 0, 0, 2, 2, b, b, false);
            this.a($$0, $$4, 1, 2, 0, 2, 2, 0, b, b, false);
            this.a($$0, i, 1, 2, 1, $$4);
            this.a($$0, $$4, 5, 1, 0, 7, 1, 2, c, c, false);
            this.a($$0, $$4, 5, 3, 0, 7, 3, 2, c, c, false);
            this.a($$0, $$4, 7, 2, 0, 7, 2, 2, b, b, false);
            this.a($$0, $$4, 5, 2, 0, 6, 2, 0, b, b, false);
            this.a($$0, i, 6, 2, 1, $$4);
            this.a($$0, $$4, 0, 1, 5, 2, 1, 7, c, c, false);
            this.a($$0, $$4, 0, 3, 5, 2, 3, 7, c, c, false);
            this.a($$0, $$4, 0, 2, 5, 0, 2, 7, b, b, false);
            this.a($$0, $$4, 1, 2, 7, 2, 2, 7, b, b, false);
            this.a($$0, i, 1, 2, 6, $$4);
            this.a($$0, $$4, 5, 1, 5, 7, 1, 7, c, c, false);
            this.a($$0, $$4, 5, 3, 5, 7, 3, 7, c, c, false);
            this.a($$0, $$4, 7, 2, 5, 7, 2, 7, b, b, false);
            this.a($$0, $$4, 5, 2, 7, 6, 2, 7, b, b, false);
            this.a($$0, i, 6, 2, 6, $$4);
            if (this.B.c[je.d.d()]) {
               this.a($$0, $$4, 3, 3, 0, 4, 3, 0, c, c, false);
            } else {
               this.a($$0, $$4, 3, 3, 0, 4, 3, 1, c, c, false);
               this.a($$0, $$4, 3, 2, 0, 4, 2, 0, b, b, false);
               this.a($$0, $$4, 3, 1, 0, 4, 1, 1, c, c, false);
            }

            if (this.B.c[je.c.d()]) {
               this.a($$0, $$4, 3, 3, 7, 4, 3, 7, c, c, false);
            } else {
               this.a($$0, $$4, 3, 3, 6, 4, 3, 7, c, c, false);
               this.a($$0, $$4, 3, 2, 7, 4, 2, 7, b, b, false);
               this.a($$0, $$4, 3, 1, 6, 4, 1, 7, c, c, false);
            }

            if (this.B.c[je.e.d()]) {
               this.a($$0, $$4, 0, 3, 3, 0, 3, 4, c, c, false);
            } else {
               this.a($$0, $$4, 0, 3, 3, 1, 3, 4, c, c, false);
               this.a($$0, $$4, 0, 2, 3, 0, 2, 4, b, b, false);
               this.a($$0, $$4, 0, 1, 3, 1, 1, 4, c, c, false);
            }

            if (this.B.c[je.f.d()]) {
               this.a($$0, $$4, 7, 3, 3, 7, 3, 4, c, c, false);
            } else {
               this.a($$0, $$4, 6, 3, 3, 7, 3, 4, c, c, false);
               this.a($$0, $$4, 7, 2, 3, 7, 2, 4, b, b, false);
               this.a($$0, $$4, 6, 1, 3, 7, 1, 4, c, c, false);
            }
         } else if (this.a == 1) {
            this.a($$0, $$4, 2, 1, 2, 2, 3, 2, c, c, false);
            this.a($$0, $$4, 2, 1, 5, 2, 3, 5, c, c, false);
            this.a($$0, $$4, 5, 1, 5, 5, 3, 5, c, c, false);
            this.a($$0, $$4, 5, 1, 2, 5, 3, 2, c, c, false);
            this.a($$0, i, 2, 2, 2, $$4);
            this.a($$0, i, 2, 2, 5, $$4);
            this.a($$0, i, 5, 2, 5, $$4);
            this.a($$0, i, 5, 2, 2, $$4);
            this.a($$0, $$4, 0, 1, 0, 1, 3, 0, c, c, false);
            this.a($$0, $$4, 0, 1, 1, 0, 3, 1, c, c, false);
            this.a($$0, $$4, 0, 1, 7, 1, 3, 7, c, c, false);
            this.a($$0, $$4, 0, 1, 6, 0, 3, 6, c, c, false);
            this.a($$0, $$4, 6, 1, 7, 7, 3, 7, c, c, false);
            this.a($$0, $$4, 7, 1, 6, 7, 3, 6, c, c, false);
            this.a($$0, $$4, 6, 1, 0, 7, 3, 0, c, c, false);
            this.a($$0, $$4, 7, 1, 1, 7, 3, 1, c, c, false);
            this.a($$0, b, 1, 2, 0, $$4);
            this.a($$0, b, 0, 2, 1, $$4);
            this.a($$0, b, 1, 2, 7, $$4);
            this.a($$0, b, 0, 2, 6, $$4);
            this.a($$0, b, 6, 2, 7, $$4);
            this.a($$0, b, 7, 2, 6, $$4);
            this.a($$0, b, 6, 2, 0, $$4);
            this.a($$0, b, 7, 2, 1, $$4);
            if (!this.B.c[je.d.d()]) {
               this.a($$0, $$4, 1, 3, 0, 6, 3, 0, c, c, false);
               this.a($$0, $$4, 1, 2, 0, 6, 2, 0, b, b, false);
               this.a($$0, $$4, 1, 1, 0, 6, 1, 0, c, c, false);
            }

            if (!this.B.c[je.c.d()]) {
               this.a($$0, $$4, 1, 3, 7, 6, 3, 7, c, c, false);
               this.a($$0, $$4, 1, 2, 7, 6, 2, 7, b, b, false);
               this.a($$0, $$4, 1, 1, 7, 6, 1, 7, c, c, false);
            }

            if (!this.B.c[je.e.d()]) {
               this.a($$0, $$4, 0, 3, 1, 0, 3, 6, c, c, false);
               this.a($$0, $$4, 0, 2, 1, 0, 2, 6, b, b, false);
               this.a($$0, $$4, 0, 1, 1, 0, 1, 6, c, c, false);
            }

            if (!this.B.c[je.f.d()]) {
               this.a($$0, $$4, 7, 3, 1, 7, 3, 6, c, c, false);
               this.a($$0, $$4, 7, 2, 1, 7, 2, 6, b, b, false);
               this.a($$0, $$4, 7, 1, 1, 7, 1, 6, c, c, false);
            }
         } else if (this.a == 2) {
            this.a($$0, $$4, 0, 1, 0, 0, 1, 7, c, c, false);
            this.a($$0, $$4, 7, 1, 0, 7, 1, 7, c, c, false);
            this.a($$0, $$4, 1, 1, 0, 6, 1, 0, c, c, false);
            this.a($$0, $$4, 1, 1, 7, 6, 1, 7, c, c, false);
            this.a($$0, $$4, 0, 2, 0, 0, 2, 7, d, d, false);
            this.a($$0, $$4, 7, 2, 0, 7, 2, 7, d, d, false);
            this.a($$0, $$4, 1, 2, 0, 6, 2, 0, d, d, false);
            this.a($$0, $$4, 1, 2, 7, 6, 2, 7, d, d, false);
            this.a($$0, $$4, 0, 3, 0, 0, 3, 7, c, c, false);
            this.a($$0, $$4, 7, 3, 0, 7, 3, 7, c, c, false);
            this.a($$0, $$4, 1, 3, 0, 6, 3, 0, c, c, false);
            this.a($$0, $$4, 1, 3, 7, 6, 3, 7, c, c, false);
            this.a($$0, $$4, 0, 1, 3, 0, 2, 4, d, d, false);
            this.a($$0, $$4, 7, 1, 3, 7, 2, 4, d, d, false);
            this.a($$0, $$4, 3, 1, 0, 4, 2, 0, d, d, false);
            this.a($$0, $$4, 3, 1, 7, 4, 2, 7, d, d, false);
            if (this.B.c[je.d.d()]) {
               this.b($$0, $$4, 3, 1, 0, 4, 2, 0);
            }

            if (this.B.c[je.c.d()]) {
               this.b($$0, $$4, 3, 1, 7, 4, 2, 7);
            }

            if (this.B.c[je.e.d()]) {
               this.b($$0, $$4, 0, 1, 3, 0, 2, 4);
            }

            if (this.B.c[je.f.d()]) {
               this.b($$0, $$4, 7, 1, 3, 7, 2, 4);
            }
         }

         if ($$7) {
            this.a($$0, $$4, 3, 1, 3, 4, 1, 4, c, c, false);
            this.a($$0, $$4, 3, 2, 3, 4, 2, 4, b, b, false);
            this.a($$0, $$4, 3, 3, 3, 4, 3, 4, c, c, false);
         }
      }
   }

   public static class t extends ekt.r {
      public t(je $$0, ekt.v $$1) {
         super(ejb.W, 1, $$0, $$1, 1, 1, 1);
      }

      public t(us $$0) {
         super(ejb.W, $$0);
      }

      @Override
      public void a(dct $$0, dcr $$1, dtz $$2, azh $$3, eic $$4, dbf $$5, iz $$6) {
         if (this.B.a / 25 > 0) {
            this.a($$0, $$4, 0, 0, this.B.c[je.a.d()]);
         }

         if (this.B.b[je.b.d()] == null) {
            this.a($$0, $$4, 1, 4, 1, 6, 4, 6, b);
         }

         for (int $$7 = 1; $$7 <= 6; $$7++) {
            for (int $$8 = 1; $$8 <= 6; $$8++) {
               if ($$3.a(3) != 0) {
                  int $$9 = 2 + ($$3.a(4) == 0 ? 0 : 1);
                  dsc $$10 = dfb.aP.o();
                  this.a($$0, $$4, $$7, $$9, $$8, $$7, 3, $$8, $$10, $$10, false);
               }
            }
         }

         this.a($$0, $$4, 0, 1, 0, 0, 1, 7, c, c, false);
         this.a($$0, $$4, 7, 1, 0, 7, 1, 7, c, c, false);
         this.a($$0, $$4, 1, 1, 0, 6, 1, 0, c, c, false);
         this.a($$0, $$4, 1, 1, 7, 6, 1, 7, c, c, false);
         this.a($$0, $$4, 0, 2, 0, 0, 2, 7, d, d, false);
         this.a($$0, $$4, 7, 2, 0, 7, 2, 7, d, d, false);
         this.a($$0, $$4, 1, 2, 0, 6, 2, 0, d, d, false);
         this.a($$0, $$4, 1, 2, 7, 6, 2, 7, d, d, false);
         this.a($$0, $$4, 0, 3, 0, 0, 3, 7, c, c, false);
         this.a($$0, $$4, 7, 3, 0, 7, 3, 7, c, c, false);
         this.a($$0, $$4, 1, 3, 0, 6, 3, 0, c, c, false);
         this.a($$0, $$4, 1, 3, 7, 6, 3, 7, c, c, false);
         this.a($$0, $$4, 0, 1, 3, 0, 2, 4, d, d, false);
         this.a($$0, $$4, 7, 1, 3, 7, 2, 4, d, d, false);
         this.a($$0, $$4, 3, 1, 0, 4, 2, 0, d, d, false);
         this.a($$0, $$4, 3, 1, 7, 4, 2, 7, d, d, false);
         if (this.B.c[je.d.d()]) {
            this.b($$0, $$4, 3, 1, 0, 4, 2, 0);
         }
      }
   }

   public static class u extends ekt.r {
      private int a;

      public u(je $$0, eic $$1, int $$2) {
         super(ejb.X, $$0, 1, $$1);
         this.a = $$2 & 1;
      }

      public u(us $$0) {
         super(ejb.X, $$0);
      }

      @Override
      public void a(dct $$0, dcr $$1, dtz $$2, azh $$3, eic $$4, dbf $$5, iz $$6) {
         if (this.a == 0) {
            for (int $$7 = 0; $$7 < 4; $$7++) {
               this.a($$0, $$4, 10 - $$7, 3 - $$7, 20 - $$7, 12 + $$7, 3 - $$7, 20, c, c, false);
            }

            this.a($$0, $$4, 7, 0, 6, 15, 0, 16, c, c, false);
            this.a($$0, $$4, 6, 0, 6, 6, 3, 20, c, c, false);
            this.a($$0, $$4, 16, 0, 6, 16, 3, 20, c, c, false);
            this.a($$0, $$4, 7, 1, 7, 7, 1, 20, c, c, false);
            this.a($$0, $$4, 15, 1, 7, 15, 1, 20, c, c, false);
            this.a($$0, $$4, 7, 1, 6, 9, 3, 6, c, c, false);
            this.a($$0, $$4, 13, 1, 6, 15, 3, 6, c, c, false);
            this.a($$0, $$4, 8, 1, 7, 9, 1, 7, c, c, false);
            this.a($$0, $$4, 13, 1, 7, 14, 1, 7, c, c, false);
            this.a($$0, $$4, 9, 0, 5, 13, 0, 5, c, c, false);
            this.a($$0, $$4, 10, 0, 7, 12, 0, 7, d, d, false);
            this.a($$0, $$4, 8, 0, 10, 8, 0, 12, d, d, false);
            this.a($$0, $$4, 14, 0, 10, 14, 0, 12, d, d, false);

            for (int $$8 = 18; $$8 >= 7; $$8 -= 3) {
               this.a($$0, i, 6, 3, $$8, $$4);
               this.a($$0, i, 16, 3, $$8, $$4);
            }

            this.a($$0, i, 10, 0, 10, $$4);
            this.a($$0, i, 12, 0, 10, $$4);
            this.a($$0, i, 10, 0, 12, $$4);
            this.a($$0, i, 12, 0, 12, $$4);
            this.a($$0, i, 8, 3, 6, $$4);
            this.a($$0, i, 14, 3, 6, $$4);
            this.a($$0, c, 4, 2, 4, $$4);
            this.a($$0, i, 4, 1, 4, $$4);
            this.a($$0, c, 4, 0, 4, $$4);
            this.a($$0, c, 18, 2, 4, $$4);
            this.a($$0, i, 18, 1, 4, $$4);
            this.a($$0, c, 18, 0, 4, $$4);
            this.a($$0, c, 4, 2, 18, $$4);
            this.a($$0, i, 4, 1, 18, $$4);
            this.a($$0, c, 4, 0, 18, $$4);
            this.a($$0, c, 18, 2, 18, $$4);
            this.a($$0, i, 18, 1, 18, $$4);
            this.a($$0, c, 18, 0, 18, $$4);
            this.a($$0, c, 9, 7, 20, $$4);
            this.a($$0, c, 13, 7, 20, $$4);
            this.a($$0, $$4, 6, 0, 21, 7, 4, 21, c, c, false);
            this.a($$0, $$4, 15, 0, 21, 16, 4, 21, c, c, false);
            this.a($$0, $$4, 11, 2, 16);
         } else if (this.a == 1) {
            this.a($$0, $$4, 9, 3, 18, 13, 3, 20, c, c, false);
            this.a($$0, $$4, 9, 0, 18, 9, 2, 18, c, c, false);
            this.a($$0, $$4, 13, 0, 18, 13, 2, 18, c, c, false);
            int $$9 = 9;
            int $$10 = 20;
            int $$11 = 5;

            for (int $$12 = 0; $$12 < 2; $$12++) {
               this.a($$0, c, $$9, 6, 20, $$4);
               this.a($$0, i, $$9, 5, 20, $$4);
               this.a($$0, c, $$9, 4, 20, $$4);
               $$9 = 13;
            }

            this.a($$0, $$4, 7, 3, 7, 15, 3, 14, c, c, false);
            int var14 = 10;

            for (int $$13 = 0; $$13 < 2; $$13++) {
               this.a($$0, $$4, var14, 0, 10, var14, 6, 10, c, c, false);
               this.a($$0, $$4, var14, 0, 12, var14, 6, 12, c, c, false);
               this.a($$0, i, var14, 0, 10, $$4);
               this.a($$0, i, var14, 0, 12, $$4);
               this.a($$0, i, var14, 4, 10, $$4);
               this.a($$0, i, var14, 4, 12, $$4);
               var14 = 12;
            }

            var14 = 8;

            for (int $$14 = 0; $$14 < 2; $$14++) {
               this.a($$0, $$4, var14, 0, 7, var14, 2, 7, c, c, false);
               this.a($$0, $$4, var14, 0, 14, var14, 2, 14, c, c, false);
               var14 = 14;
            }

            this.a($$0, $$4, 8, 3, 8, 8, 3, 13, d, d, false);
            this.a($$0, $$4, 14, 3, 8, 14, 3, 13, d, d, false);
            this.a($$0, $$4, 11, 5, 13);
         }
      }
   }

   static class v {
      final int a;
      final ekt.v[] b = new ekt.v[6];
      final boolean[] c = new boolean[6];
      boolean d;
      boolean e;
      private int f;

      public v(int $$0) {
         this.a = $$0;
      }

      public void a(je $$0, ekt.v $$1) {
         this.b[$$0.d()] = $$1;
         $$1.b[$$0.g().d()] = this;
      }

      public void a() {
         for (int $$0 = 0; $$0 < 6; $$0++) {
            this.c[$$0] = this.b[$$0] != null;
         }
      }

      public boolean a(int $$0) {
         if (this.e) {
            return true;
         } else {
            this.f = $$0;

            for (int $$1 = 0; $$1 < 6; $$1++) {
               if (this.b[$$1] != null && this.c[$$1] && this.b[$$1].f != $$0 && this.b[$$1].a($$0)) {
                  return true;
               }
            }

            return false;
         }
      }

      public boolean b() {
         return this.a >= 75;
      }

      public int c() {
         int $$0 = 0;

         for (int $$1 = 0; $$1 < 6; $$1++) {
            if (this.c[$$1]) {
               $$0++;
            }
         }

         return $$0;
      }
   }
}
