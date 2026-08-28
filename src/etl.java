import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class etl {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final etl.f[] g = new etl.f[]{
      new etl.f(etl.n.class, 40, 0),
      new etl.f(etl.h.class, 5, 5),
      new etl.f(etl.d.class, 20, 0),
      new etl.f(etl.i.class, 20, 0),
      new etl.f(etl.j.class, 10, 6),
      new etl.f(etl.o.class, 5, 5),
      new etl.f(etl.l.class, 5, 5),
      new etl.f(etl.c.class, 5, 4),
      new etl.f(etl.a.class, 5, 4),
      new etl.f(etl.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new etl.f(etl.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<etl.f> h;
   static Class<? extends etl.p> i;
   private static int j;
   static final etl.k k = new etl.k();

   public static void a() {
      h = Lists.newArrayList();

      for (etl.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (etl.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static etl.p a(Class<? extends etl.p> $$0, eqy $$1, azv $$2, int $$3, int $$4, int $$5, @Nullable ja $$6, int $$7) {
      etl.p $$8 = null;
      if ($$0 == etl.n.class) {
         $$8 = etl.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == etl.h.class) {
         $$8 = etl.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == etl.d.class) {
         $$8 = etl.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == etl.i.class) {
         $$8 = etl.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == etl.j.class) {
         $$8 = etl.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == etl.o.class) {
         $$8 = etl.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == etl.l.class) {
         $$8 = etl.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == etl.c.class) {
         $$8 = etl.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == etl.a.class) {
         $$8 = etl.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == etl.e.class) {
         $$8 = etl.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == etl.g.class) {
         $$8 = etl.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static etl.p a(etl.m $$0, eqy $$1, azv $$2, int $$3, int $$4, int $$5, ja $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            etl.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (etl.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  etl.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
                  if ($$12 != null) {
                     $$11.c++;
                     $$0.a = $$11;
                     if (!$$11.a()) {
                        h.remove($$11);
                     }

                     return $$12;
                  }
               }
            }
         }

         eql $$13 = etl.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.i() > 1 ? new etl.b($$7, $$13, $$6) : null;
      }
   }

   static eqx b(etl.m $$0, eqy $$1, azv $$2, int $$3, int $$4, int $$5, @Nullable ja $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
         eqx $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends etl.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, azv $$1, eql $$2, ja $$3) {
         super(erk.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(tz $$0) {
         super(erk.t, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(erj $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(eqx $$0, eqy $$1, azv $$2) {
         this.a((etl.m)$$0, $$1, $$2, 1, 1);
      }

      public static etl.a a(eqy $$0, azv $$1, int $$2, int $$3, int $$4, ja $$5, int $$6) {
         eql $$7 = eql.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new etl.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dju $$0, djr $$1, ebx $$2, azv $$3, eql $$4, dic $$5, iu $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, etl.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, etl.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, dmc.eW.m(), dmc.eW.m(), false);
         this.a($$0, dmc.kk.m(), 3, 1, 1, $$4);
         this.a($$0, dmc.kk.m(), 3, 1, 5, $$4);
         this.a($$0, dmc.kk.m(), 3, 2, 2, $$4);
         this.a($$0, dmc.kk.m(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, dmc.kk.m(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, eyv.x);
         }
      }
   }

   public static class b extends etl.p {
      private final int a;

      public b(int $$0, eql $$1, ja $$2) {
         super(erk.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != ja.c && $$2 != ja.d ? $$1.d() : $$1.f();
      }

      public b(tz $$0) {
         super(erk.u, $$0);
         this.a = $$0.h("Steps");
      }

      @Override
      protected void a(erj $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static eql a(eqy $$0, azv $$1, int $$2, int $$3, int $$4, ja $$5) {
         int $$6 = 3;
         eql $$7 = eql.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         eqx $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().i() == $$7.i()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = eql.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return eql.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(dju $$0, djr $$1, ebx $$2, azv $$3, eql $$4, dic $$5, iu $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, dmc.eW.m(), 0, 0, $$7, $$4);
            this.a($$0, dmc.eW.m(), 1, 0, $$7, $$4);
            this.a($$0, dmc.eW.m(), 2, 0, $$7, $$4);
            this.a($$0, dmc.eW.m(), 3, 0, $$7, $$4);
            this.a($$0, dmc.eW.m(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, dmc.eW.m(), 0, $$8, $$7, $$4);
               this.a($$0, dmc.nF.m(), 1, $$8, $$7, $$4);
               this.a($$0, dmc.nF.m(), 2, $$8, $$7, $$4);
               this.a($$0, dmc.nF.m(), 3, $$8, $$7, $$4);
               this.a($$0, dmc.eW.m(), 4, $$8, $$7, $$4);
            }

            this.a($$0, dmc.eW.m(), 0, 4, $$7, $$4);
            this.a($$0, dmc.eW.m(), 1, 4, $$7, $$4);
            this.a($$0, dmc.eW.m(), 2, 4, $$7, $$4);
            this.a($$0, dmc.eW.m(), 3, 4, $$7, $$4);
            this.a($$0, dmc.eW.m(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends etl.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, azv $$1, eql $$2, ja $$3) {
         super(erk.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(tz $$0) {
         super(erk.v, $$0);
         this.d = $$0.q("leftLow");
         this.i = $$0.q("leftHigh");
         this.j = $$0.q("rightLow");
         this.k = $$0.q("rightHigh");
      }

      @Override
      protected void a(erj $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(eqx $$0, eqy $$1, azv $$2) {
         int $$3 = 3;
         int $$4 = 5;
         ja $$5 = this.i();
         if ($$5 == ja.e || $$5 == ja.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((etl.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((etl.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((etl.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((etl.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((etl.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static etl.c a(eqy $$0, azv $$1, int $$2, int $$3, int $$4, ja $$5, int $$6) {
         eql $$7 = eql.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new etl.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dju $$0, djr $$1, ebx $$2, azv $$3, eql $$4, dic $$5, iu $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, etl.k);
         this.a($$0, $$3, $$4, this.h, 4, 3, 0);
         if (this.d) {
            this.a($$0, $$4, 0, 3, 1, 0, 5, 3, e, e, false);
         }

         if (this.j) {
            this.a($$0, $$4, 9, 3, 1, 9, 5, 3, e, e, false);
         }

         if (this.i) {
            this.a($$0, $$4, 0, 5, 7, 0, 7, 9, e, e, false);
         }

         if (this.k) {
            this.a($$0, $$4, 9, 5, 7, 9, 7, 9, e, e, false);
         }

         this.a($$0, $$4, 5, 1, 10, 7, 3, 10, e, e, false);
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, etl.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, etl.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, etl.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, etl.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, etl.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, dmc.ke.m(), dmc.ke.m(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, dmc.ke.m(), dmc.ke.m(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, etl.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, dmc.ke.m(), dmc.ke.m(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, dmc.ke.m(), dmc.ke.m(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, dmc.ke.m(), dmc.ke.m(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, dmc.ke.m(), dmc.ke.m(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, dmc.ke.m().b(dtl.b, ebh.c), dmc.ke.m().b(dtl.b, ebh.c), false);
         this.a($$0, dmc.cy.m().b(dvq.e, ja.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends etl.q {
      public d(int $$0, azv $$1, eql $$2, ja $$3) {
         super(erk.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(tz $$0) {
         super(erk.w, $$0);
      }

      @Override
      public void a(eqx $$0, eqy $$1, azv $$2) {
         ja $$3 = this.i();
         if ($$3 != ja.c && $$3 != ja.f) {
            this.c((etl.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((etl.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static etl.d a(eqy $$0, azv $$1, int $$2, int $$3, int $$4, ja $$5, int $$6) {
         eql $$7 = eql.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new etl.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dju $$0, djr $$1, ebx $$2, azv $$3, eql $$4, dic $$5, iu $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, etl.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         ja $$7 = this.i();
         if ($$7 != ja.c && $$7 != ja.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends etl.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, azv $$1, eql $$2, ja $$3) {
         super(erk.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.e() > 6;
      }

      public e(tz $$0) {
         super(erk.x, $$0);
         this.i = $$0.q("Tall");
      }

      @Override
      protected void a(erj $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static etl.e a(eqy $$0, azv $$1, int $$2, int $$3, int $$4, ja $$5, int $$6) {
         eql $$7 = eql.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = eql.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new etl.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(dju $$0, djr $$1, ebx $$2, azv $$3, eql $$4, dic $$5, iu $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, etl.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, dmc.bz.m(), dmc.bz.m(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dmc.n.m(), dmc.n.m(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dmc.n.m(), dmc.n.m(), false);
               this.a($$0, dmc.cy.m().b(dvq.e, ja.f), 2, 3, $$10, $$4);
               this.a($$0, dmc.cy.m().b(dvq.e, ja.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dmc.n.m(), dmc.n.m(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dmc.n.m(), dmc.n.m(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dmc.ct.m(), dmc.ct.m(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dmc.ct.m(), dmc.ct.m(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dmc.ct.m(), dmc.ct.m(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dmc.ct.m(), dmc.ct.m(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, dmc.ct.m(), dmc.ct.m(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, dmc.ct.m(), dmc.ct.m(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, dmc.ct.m(), dmc.ct.m(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, dmc.n.m(), dmc.n.m(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, dmc.n.m(), dmc.n.m(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, dmc.n.m(), dmc.n.m(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, dmc.n.m(), dmc.n.m(), false);
            this.a($$0, dmc.n.m(), 9, 5, 11, $$4);
            this.a($$0, dmc.n.m(), 8, 5, 11, $$4);
            this.a($$0, dmc.n.m(), 9, 5, 10, $$4);
            dzz $$12 = dmc.ei.m().b(doz.d, Boolean.valueOf(true)).b(doz.b, Boolean.valueOf(true));
            dzz $$13 = dmc.ei.m().b(doz.a, Boolean.valueOf(true)).b(doz.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, dmc.ei.m().b(doz.a, Boolean.valueOf(true)).b(doz.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, dmc.ei.m().b(doz.c, Boolean.valueOf(true)).b(doz.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, dmc.ei.m().b(doz.a, Boolean.valueOf(true)).b(doz.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, dmc.ei.m().b(doz.c, Boolean.valueOf(true)).b(doz.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, dmc.ei.m().b(doz.a, Boolean.valueOf(true)).b(doz.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            dzz $$15 = dmc.cY.m().b(dqk.b, ja.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            dzz $$18 = dmc.ei.m().b(doz.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            dzz $$19 = dmc.ei.m().b(doz.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            dzz $$20 = $$13.b(doz.d, Boolean.valueOf(true)).b(doz.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.b(doz.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.b(doz.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.b(doz.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.b(doz.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            dzz $$21 = dmc.cx.m();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, eyv.v);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, eyv.v);
         }
      }
   }

   static class f {
      public final Class<? extends etl.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends etl.p> $$0, int $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.d = $$2;
      }

      public boolean a(int $$0) {
         return this.d == 0 || this.c < this.d;
      }

      public boolean a() {
         return this.d == 0 || this.c < this.d;
      }
   }

   public static class g extends etl.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, eql $$1, ja $$2) {
         super(erk.y, $$0, $$1);
         this.a($$2);
      }

      public g(tz $$0) {
         super(erk.y, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(erj $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(eqx $$0, eqy $$1, azv $$2) {
         if ($$0 != null) {
            ((etl.m)$$0).b = this;
         }
      }

      public static etl.g a(eqy $$0, int $$1, int $$2, int $$3, ja $$4, int $$5) {
         eql $$6 = eql.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new etl.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dju $$0, djr $$1, ebx $$2, azv $$3, eql $$4, dic $$5, iu $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, etl.k);
         this.a($$0, $$3, $$4, etl.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, etl.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, etl.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, etl.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, etl.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, etl.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, etl.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, dmc.K.m(), dmc.K.m(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, dmc.K.m(), dmc.K.m(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, etl.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, dmc.K.m(), dmc.K.m(), false);
         dzz $$8 = dmc.fl.m().b(dqf.a, Boolean.valueOf(true)).b(dqf.c, Boolean.valueOf(true));
         dzz $$9 = dmc.fl.m().b(dqf.d, Boolean.valueOf(true)).b(dqf.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         dzz $$12 = dmc.fz.m().b(duc.b, ja.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, etl.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, etl.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, etl.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         dzz $$14 = dmc.fU.m().b(doq.b, ja.c);
         dzz $$15 = dmc.fU.m().b(doq.b, ja.d);
         dzz $$16 = dmc.fU.m().b(doq.b, ja.f);
         dzz $$17 = dmc.fU.m().b(doq.b, ja.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.b(doq.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.b(doq.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.b(doq.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.b(doq.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.b(doq.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.b(doq.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.b(doq.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.b(doq.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.b(doq.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.b(doq.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.b(doq.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.b(doq.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            dzz $$21 = dmc.fT.m();
            this.a($$0, $$21, 4, 3, 9, $$4);
            this.a($$0, $$21, 5, 3, 9, $$4);
            this.a($$0, $$21, 6, 3, 9, $$4);
            this.a($$0, $$21, 4, 3, 10, $$4);
            this.a($$0, $$21, 5, 3, 10, $$4);
            this.a($$0, $$21, 6, 3, 10, $$4);
            this.a($$0, $$21, 4, 3, 11, $$4);
            this.a($$0, $$21, 5, 3, 11, $$4);
            this.a($$0, $$21, 6, 3, 11, $$4);
         }

         if (!this.d) {
            iu $$22 = this.b(5, 3, 6);
            if ($$4.b($$22)) {
               this.d = true;
               $$0.a($$22, dmc.cB.m(), 2);
               if ($$0.c_($$22) instanceof dyp $$24) {
                  $$24.a(bwm.be, $$3);
               }
            }
         }
      }
   }

   public static class h extends etl.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, azv $$1, eql $$2, ja $$3) {
         super(erk.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(tz $$0) {
         super(erk.z, $$0);
      }

      @Override
      public void a(eqx $$0, eqy $$1, azv $$2) {
         this.a((etl.m)$$0, $$1, $$2, 1, 1);
      }

      public static etl.h a(eqy $$0, azv $$1, int $$2, int $$3, int $$4, ja $$5, int $$6) {
         eql $$7 = eql.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new etl.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dju $$0, djr $$1, ebx $$2, azv $$3, eql $$4, dic $$5, iu $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, etl.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, etl.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, etl.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, etl.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, etl.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, dmc.fl.m().b(dqf.a, Boolean.valueOf(true)).b(dqf.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, dmc.fl.m().b(dqf.a, Boolean.valueOf(true)).b(dqf.c, Boolean.valueOf(true)).b(dqf.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, dmc.fl.m().b(dqf.a, Boolean.valueOf(true)).b(dqf.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, dmc.fl.m().b(dqf.d, Boolean.valueOf(true)).b(dqf.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, dmc.fl.m().b(dqf.d, Boolean.valueOf(true)).b(dqf.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, dmc.fl.m().b(dqf.d, Boolean.valueOf(true)).b(dqf.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, dmc.fl.m().b(dqf.a, Boolean.valueOf(true)).b(dqf.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, dmc.fl.m().b(dqf.a, Boolean.valueOf(true)).b(dqf.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         dzz $$8 = dmc.dL.m().b(doh.b, ja.e);
         dzz $$9 = dmc.dL.m().b(doh.b, ja.e).b(doh.c, eav.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends etl.q {
      public i(int $$0, azv $$1, eql $$2, ja $$3) {
         super(erk.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(tz $$0) {
         super(erk.A, $$0);
      }

      @Override
      public void a(eqx $$0, eqy $$1, azv $$2) {
         ja $$3 = this.i();
         if ($$3 != ja.c && $$3 != ja.f) {
            this.b((etl.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((etl.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static etl.i a(eqy $$0, azv $$1, int $$2, int $$3, int $$4, ja $$5, int $$6) {
         eql $$7 = eql.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new etl.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dju $$0, djr $$1, ebx $$2, azv $$3, eql $$4, dic $$5, iu $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, etl.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         ja $$7 = this.i();
         if ($$7 != ja.c && $$7 != ja.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends etl.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, azv $$1, eql $$2, ja $$3) {
         super(erk.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(tz $$0) {
         super(erk.B, $$0);
         this.d = $$0.h("Type");
      }

      @Override
      protected void a(erj $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(eqx $$0, eqy $$1, azv $$2) {
         this.a((etl.m)$$0, $$1, $$2, 4, 1);
         this.b((etl.m)$$0, $$1, $$2, 1, 4);
         this.c((etl.m)$$0, $$1, $$2, 1, 4);
      }

      public static etl.j a(eqy $$0, azv $$1, int $$2, int $$3, int $$4, ja $$5, int $$6) {
         eql $$7 = eql.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new etl.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dju $$0, djr $$1, ebx $$2, azv $$3, eql $$4, dic $$5, iu $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, etl.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, dmc.eW.m(), 5, 1, 5, $$4);
               this.a($$0, dmc.eW.m(), 5, 2, 5, $$4);
               this.a($$0, dmc.eW.m(), 5, 3, 5, $$4);
               this.a($$0, dmc.cy.m().b(dvq.e, ja.e), 4, 3, 5, $$4);
               this.a($$0, dmc.cy.m().b(dvq.e, ja.f), 6, 3, 5, $$4);
               this.a($$0, dmc.cy.m().b(dvq.e, ja.d), 5, 3, 4, $$4);
               this.a($$0, dmc.cy.m().b(dvq.e, ja.c), 5, 3, 6, $$4);
               this.a($$0, dmc.ke.m(), 4, 1, 4, $$4);
               this.a($$0, dmc.ke.m(), 4, 1, 5, $$4);
               this.a($$0, dmc.ke.m(), 4, 1, 6, $$4);
               this.a($$0, dmc.ke.m(), 6, 1, 4, $$4);
               this.a($$0, dmc.ke.m(), 6, 1, 5, $$4);
               this.a($$0, dmc.ke.m(), 6, 1, 6, $$4);
               this.a($$0, dmc.ke.m(), 5, 1, 4, $$4);
               this.a($$0, dmc.ke.m(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, dmc.eW.m(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, dmc.eW.m(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, dmc.eW.m(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, dmc.eW.m(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, dmc.eW.m(), 5, 1, 5, $$4);
               this.a($$0, dmc.eW.m(), 5, 2, 5, $$4);
               this.a($$0, dmc.eW.m(), 5, 3, 5, $$4);
               this.a($$0, dmc.J.m(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, dmc.m.m(), 1, 3, $$8, $$4);
                  this.a($$0, dmc.m.m(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, dmc.m.m(), $$9, 3, 1, $$4);
                  this.a($$0, dmc.m.m(), $$9, 3, 9, $$4);
               }

               this.a($$0, dmc.m.m(), 5, 1, 4, $$4);
               this.a($$0, dmc.m.m(), 5, 1, 6, $$4);
               this.a($$0, dmc.m.m(), 5, 3, 4, $$4);
               this.a($$0, dmc.m.m(), 5, 3, 6, $$4);
               this.a($$0, dmc.m.m(), 4, 1, 5, $$4);
               this.a($$0, dmc.m.m(), 6, 1, 5, $$4);
               this.a($$0, dmc.m.m(), 4, 3, 5, $$4);
               this.a($$0, dmc.m.m(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, dmc.m.m(), 4, $$10, 4, $$4);
                  this.a($$0, dmc.m.m(), 6, $$10, 4, $$4);
                  this.a($$0, dmc.m.m(), 4, $$10, 6, $$4);
                  this.a($$0, dmc.m.m(), 6, $$10, 6, $$4);
               }

               this.a($$0, dmc.cy.m(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, dmc.n.m(), 2, 3, $$11, $$4);
                  this.a($$0, dmc.n.m(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, dmc.n.m(), 4, 3, $$11, $$4);
                     this.a($$0, dmc.n.m(), 5, 3, $$11, $$4);
                     this.a($$0, dmc.n.m(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, dmc.n.m(), 7, 3, $$11, $$4);
                  this.a($$0, dmc.n.m(), 8, 3, $$11, $$4);
               }

               dzz $$12 = dmc.cY.m().b(dqk.b, ja.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, eyv.w);
         }
      }
   }

   static class k extends eqx.a {
      @Override
      public void a(azv $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = dmc.eY.m();
            } else if ($$5 < 0.5F) {
               this.a = dmc.eX.m();
            } else if ($$5 < 0.55F) {
               this.a = dmc.fe.m();
            } else {
               this.a = dmc.eW.m();
            }
         } else {
            this.a = dmc.nF.m();
         }
      }
   }

   public static class l extends etl.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(erk $$0, int $$1, int $$2, int $$3, ja $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = etl.p.a.a;
      }

      public l(int $$0, azv $$1, eql $$2, ja $$3) {
         super(erk.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(erk $$0, tz $$1) {
         super($$0, $$1);
         this.d = $$1.q("Source");
      }

      public l(tz $$0) {
         this(erk.C, $$0);
      }

      @Override
      protected void a(erj $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(eqx $$0, eqy $$1, azv $$2) {
         if (this.d) {
            etl.i = etl.c.class;
         }

         this.a((etl.m)$$0, $$1, $$2, 1, 1);
      }

      public static etl.l a(eqy $$0, azv $$1, int $$2, int $$3, int $$4, ja $$5, int $$6) {
         eql $$7 = eql.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new etl.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dju $$0, djr $$1, ebx $$2, azv $$3, eql $$4, dic $$5, iu $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, etl.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, etl.p.a.a, 1, 1, 4);
         this.a($$0, dmc.eW.m(), 2, 6, 1, $$4);
         this.a($$0, dmc.eW.m(), 1, 5, 1, $$4);
         this.a($$0, dmc.ke.m(), 1, 6, 1, $$4);
         this.a($$0, dmc.eW.m(), 1, 5, 2, $$4);
         this.a($$0, dmc.eW.m(), 1, 4, 3, $$4);
         this.a($$0, dmc.ke.m(), 1, 5, 3, $$4);
         this.a($$0, dmc.eW.m(), 2, 4, 3, $$4);
         this.a($$0, dmc.eW.m(), 3, 3, 3, $$4);
         this.a($$0, dmc.ke.m(), 3, 4, 3, $$4);
         this.a($$0, dmc.eW.m(), 3, 3, 2, $$4);
         this.a($$0, dmc.eW.m(), 3, 2, 1, $$4);
         this.a($$0, dmc.ke.m(), 3, 3, 1, $$4);
         this.a($$0, dmc.eW.m(), 2, 2, 1, $$4);
         this.a($$0, dmc.eW.m(), 1, 1, 1, $$4);
         this.a($$0, dmc.ke.m(), 1, 2, 1, $$4);
         this.a($$0, dmc.eW.m(), 1, 1, 2, $$4);
         this.a($$0, dmc.ke.m(), 1, 1, 3, $$4);
      }
   }

   public static class m extends etl.l {
      public etl.f a;
      @Nullable
      public etl.g b;
      public final List<eqx> c = Lists.newArrayList();

      public m(azv $$0, int $$1, int $$2) {
         super(erk.D, 0, $$1, $$2, a($$0));
      }

      public m(tz $$0) {
         super(erk.D, $$0);
      }

      @Override
      public iu h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends etl.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, azv $$1, eql $$2, ja $$3) {
         super(erk.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(tz $$0) {
         super(erk.E, $$0);
         this.d = $$0.q("Left");
         this.i = $$0.q("Right");
      }

      @Override
      protected void a(erj $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(eqx $$0, eqy $$1, azv $$2) {
         this.a((etl.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((etl.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((etl.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static etl.n a(eqy $$0, azv $$1, int $$2, int $$3, int $$4, ja $$5, int $$6) {
         eql $$7 = eql.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new etl.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dju $$0, djr $$1, ebx $$2, azv $$3, eql $$4, dic $$5, iu $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, etl.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, etl.p.a.a, 1, 1, 6);
         dzz $$7 = dmc.cy.m().b(dvq.e, ja.f);
         dzz $$8 = dmc.cy.m().b(dvq.e, ja.e);
         this.a($$0, $$4, $$3, 0.1F, 1, 2, 1, $$7);
         this.a($$0, $$4, $$3, 0.1F, 3, 2, 1, $$8);
         this.a($$0, $$4, $$3, 0.1F, 1, 2, 5, $$7);
         this.a($$0, $$4, $$3, 0.1F, 3, 2, 5, $$8);
         if (this.d) {
            this.a($$0, $$4, 0, 1, 2, 0, 3, 4, e, e, false);
         }

         if (this.i) {
            this.a($$0, $$4, 4, 1, 2, 4, 3, 4, e, e, false);
         }
      }
   }

   public static class o extends etl.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, azv $$1, eql $$2, ja $$3) {
         super(erk.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(tz $$0) {
         super(erk.F, $$0);
      }

      @Override
      public void a(eqx $$0, eqy $$1, azv $$2) {
         this.a((etl.m)$$0, $$1, $$2, 1, 1);
      }

      public static etl.o a(eqy $$0, azv $$1, int $$2, int $$3, int $$4, ja $$5, int $$6) {
         eql $$7 = eql.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new etl.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dju $$0, djr $$1, ebx $$2, azv $$3, eql $$4, dic $$5, iu $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, etl.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, etl.p.a.a, 1, 1, 7);
         dzz $$7 = dmc.da.m().b(duc.b, ja.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, dmc.eW.m(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dmc.eW.m(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dmc.eW.m(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends eqx {
      protected etl.p.a h = etl.p.a.a;

      protected p(erk $$0, int $$1, eql $$2) {
         super($$0, $$1, $$2);
      }

      public p(erk $$0, tz $$1) {
         super($$0, $$1);
         this.h = etl.p.a.valueOf($$1.l("EntryDoor"));
      }

      @Override
      protected void a(erj $$0, tz $$1) {
         $$1.a("EntryDoor", this.h.name());
      }

      protected void a(dju $$0, azv $$1, eql $$2, etl.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, dmc.eW.m(), $$4, $$5, $$6, $$2);
               this.a($$0, dmc.eW.m(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dmc.eW.m(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dmc.eW.m(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dmc.eW.m(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dmc.eW.m(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dmc.eW.m(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dmc.cX.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dmc.cX.m().b(doh.c, eav.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, dmc.nF.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dmc.nF.m(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dmc.fl.m().b(dqf.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, dmc.fl.m().b(dqf.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dmc.fl.m().b(dqf.b, Boolean.valueOf(true)).b(dqf.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dmc.fl.m().b(dqf.b, Boolean.valueOf(true)).b(dqf.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dmc.fl.m().b(dqf.b, Boolean.valueOf(true)).b(dqf.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dmc.fl.m().b(dqf.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dmc.fl.m().b(dqf.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, dmc.eW.m(), $$4, $$5, $$6, $$2);
               this.a($$0, dmc.eW.m(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dmc.eW.m(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dmc.eW.m(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dmc.eW.m(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dmc.eW.m(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dmc.eW.m(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dmc.dL.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dmc.dL.m().b(doh.c, eav.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dmc.ea.m().b(dml.e, ja.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, dmc.ea.m().b(dml.e, ja.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected etl.p.a b(azv $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return etl.p.a.a;
            case 2:
               return etl.p.a.b;
            case 3:
               return etl.p.a.c;
            case 4:
               return etl.p.a.d;
         }
      }

      @Nullable
      protected eqx a(etl.m $$0, eqy $$1, azv $$2, int $$3, int $$4) {
         ja $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return etl.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$5, this.g());
               case d:
                  return etl.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$5, this.g());
               case e:
                  return etl.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
               case f:
                  return etl.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected eqx b(etl.m $$0, eqy $$1, azv $$2, int $$3, int $$4) {
         ja $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return etl.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, ja.e, this.g());
               case d:
                  return etl.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, ja.e, this.g());
               case e:
                  return etl.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, ja.c, this.g());
               case f:
                  return etl.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, ja.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected eqx c(etl.m $$0, eqy $$1, azv $$2, int $$3, int $$4) {
         ja $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return etl.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, ja.f, this.g());
               case d:
                  return etl.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, ja.f, this.g());
               case e:
                  return etl.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, ja.d, this.g());
               case f:
                  return etl.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, ja.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(eql $$0) {
         return $$0 != null && $$0.i() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;
      }
   }

   public abstract static class q extends etl.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(erk $$0, int $$1, eql $$2) {
         super($$0, $$1, $$2);
      }

      public q(erk $$0, tz $$1) {
         super($$0, $$1);
      }
   }
}
