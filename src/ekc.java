import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class ekc {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final ekc.f[] g = new ekc.f[]{
      new ekc.f(ekc.n.class, 40, 0),
      new ekc.f(ekc.h.class, 5, 5),
      new ekc.f(ekc.d.class, 20, 0),
      new ekc.f(ekc.i.class, 20, 0),
      new ekc.f(ekc.j.class, 10, 6),
      new ekc.f(ekc.o.class, 5, 5),
      new ekc.f(ekc.l.class, 5, 5),
      new ekc.f(ekc.c.class, 5, 4),
      new ekc.f(ekc.a.class, 5, 4),
      new ekc.f(ekc.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new ekc.f(ekc.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<ekc.f> h;
   static Class<? extends ekc.p> i;
   private static int j;
   static final ekc.k k = new ekc.k();

   public static void a() {
      h = Lists.newArrayList();

      for (ekc.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (ekc.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static ekc.p a(Class<? extends ekc.p> $$0, ehq $$1, aym $$2, int $$3, int $$4, int $$5, @Nullable it $$6, int $$7) {
      ekc.p $$8 = null;
      if ($$0 == ekc.n.class) {
         $$8 = ekc.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ekc.h.class) {
         $$8 = ekc.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ekc.d.class) {
         $$8 = ekc.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ekc.i.class) {
         $$8 = ekc.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ekc.j.class) {
         $$8 = ekc.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ekc.o.class) {
         $$8 = ekc.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ekc.l.class) {
         $$8 = ekc.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ekc.c.class) {
         $$8 = ekc.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ekc.a.class) {
         $$8 = ekc.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ekc.e.class) {
         $$8 = ekc.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ekc.g.class) {
         $$8 = ekc.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static ekc.p a(ekc.m $$0, ehq $$1, aym $$2, int $$3, int $$4, int $$5, it $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            ekc.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (ekc.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  ekc.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         ehd $$13 = ekc.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.i() > 1 ? new ekc.b($$7, $$13, $$6) : null;
      }
   }

   static ehp b(ekc.m $$0, ehq $$1, aym $$2, int $$3, int $$4, int $$5, @Nullable it $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
         ehp $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends ekc.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, aym $$1, ehd $$2, it $$3) {
         super(eic.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(ud $$0) {
         super(eic.t, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(eib $$0, ud $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(ehp $$0, ehq $$1, aym $$2) {
         this.a((ekc.m)$$0, $$1, $$2, 1, 1);
      }

      public static ekc.a a(ehq $$0, aym $$1, int $$2, int $$3, int $$4, it $$5, int $$6) {
         ehd $$7 = ehd.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new ekc.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dbu $$0, dbs $$1, dta $$2, aym $$3, ehd $$4, dag $$5, io $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, ekc.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, ekc.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, dec.eH.n(), dec.eH.n(), false);
         this.a($$0, dec.jK.n(), 3, 1, 1, $$4);
         this.a($$0, dec.jK.n(), 3, 1, 5, $$4);
         this.a($$0, dec.jK.n(), 3, 2, 2, $$4);
         this.a($$0, dec.jK.n(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, dec.jK.n(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, epf.y);
         }
      }
   }

   public static class b extends ekc.p {
      private final int a;

      public b(int $$0, ehd $$1, it $$2) {
         super(eic.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != it.c && $$2 != it.d ? $$1.d() : $$1.f();
      }

      public b(ud $$0) {
         super(eic.u, $$0);
         this.a = $$0.h("Steps");
      }

      @Override
      protected void a(eib $$0, ud $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static ehd a(ehq $$0, aym $$1, int $$2, int $$3, int $$4, it $$5) {
         int $$6 = 3;
         ehd $$7 = ehd.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         ehp $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().i() == $$7.i()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = ehd.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return ehd.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(dbu $$0, dbs $$1, dta $$2, aym $$3, ehd $$4, dag $$5, io $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, dec.eH.n(), 0, 0, $$7, $$4);
            this.a($$0, dec.eH.n(), 1, 0, $$7, $$4);
            this.a($$0, dec.eH.n(), 2, 0, $$7, $$4);
            this.a($$0, dec.eH.n(), 3, 0, $$7, $$4);
            this.a($$0, dec.eH.n(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, dec.eH.n(), 0, $$8, $$7, $$4);
               this.a($$0, dec.nc.n(), 1, $$8, $$7, $$4);
               this.a($$0, dec.nc.n(), 2, $$8, $$7, $$4);
               this.a($$0, dec.nc.n(), 3, $$8, $$7, $$4);
               this.a($$0, dec.eH.n(), 4, $$8, $$7, $$4);
            }

            this.a($$0, dec.eH.n(), 0, 4, $$7, $$4);
            this.a($$0, dec.eH.n(), 1, 4, $$7, $$4);
            this.a($$0, dec.eH.n(), 2, 4, $$7, $$4);
            this.a($$0, dec.eH.n(), 3, 4, $$7, $$4);
            this.a($$0, dec.eH.n(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends ekc.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, aym $$1, ehd $$2, it $$3) {
         super(eic.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(ud $$0) {
         super(eic.v, $$0);
         this.d = $$0.q("leftLow");
         this.i = $$0.q("leftHigh");
         this.j = $$0.q("rightLow");
         this.k = $$0.q("rightHigh");
      }

      @Override
      protected void a(eib $$0, ud $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(ehp $$0, ehq $$1, aym $$2) {
         int $$3 = 3;
         int $$4 = 5;
         it $$5 = this.i();
         if ($$5 == it.e || $$5 == it.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((ekc.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((ekc.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((ekc.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((ekc.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((ekc.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static ekc.c a(ehq $$0, aym $$1, int $$2, int $$3, int $$4, it $$5, int $$6) {
         ehd $$7 = ehd.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new ekc.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dbu $$0, dbs $$1, dta $$2, aym $$3, ehd $$4, dag $$5, io $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, ekc.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, ekc.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, ekc.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, ekc.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, ekc.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, ekc.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, dec.jE.n(), dec.jE.n(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, dec.jE.n(), dec.jE.n(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, ekc.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, dec.jE.n(), dec.jE.n(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, dec.jE.n(), dec.jE.n(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, dec.jE.n(), dec.jE.n(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, dec.jE.n(), dec.jE.n(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, dec.jE.n().a(dld.b, dsl.c), dec.jE.n().a(dld.b, dsl.c), false);
         this.a($$0, dec.cq.n().a(dnc.g, it.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends ekc.q {
      public d(int $$0, aym $$1, ehd $$2, it $$3) {
         super(eic.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(ud $$0) {
         super(eic.w, $$0);
      }

      @Override
      public void a(ehp $$0, ehq $$1, aym $$2) {
         it $$3 = this.i();
         if ($$3 != it.c && $$3 != it.f) {
            this.c((ekc.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((ekc.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static ekc.d a(ehq $$0, aym $$1, int $$2, int $$3, int $$4, it $$5, int $$6) {
         ehd $$7 = ehd.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new ekc.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dbu $$0, dbs $$1, dta $$2, aym $$3, ehd $$4, dag $$5, io $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, ekc.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         it $$7 = this.i();
         if ($$7 != it.c && $$7 != it.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends ekc.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, aym $$1, ehd $$2, it $$3) {
         super(eic.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.e() > 6;
      }

      public e(ud $$0) {
         super(eic.x, $$0);
         this.i = $$0.q("Tall");
      }

      @Override
      protected void a(eib $$0, ud $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static ekc.e a(ehq $$0, aym $$1, int $$2, int $$3, int $$4, it $$5, int $$6) {
         ehd $$7 = ehd.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = ehd.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new ekc.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(dbu $$0, dbs $$1, dta $$2, aym $$3, ehd $$4, dag $$5, io $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, ekc.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, dec.bs.n(), dec.bs.n(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dec.n.n(), dec.n.n(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dec.n.n(), dec.n.n(), false);
               this.a($$0, dec.cq.n().a(dnc.g, it.f), 2, 3, $$10, $$4);
               this.a($$0, dec.cq.n().a(dnc.g, it.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dec.n.n(), dec.n.n(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dec.n.n(), dec.n.n(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dec.cl.n(), dec.cl.n(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dec.cl.n(), dec.cl.n(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dec.cl.n(), dec.cl.n(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dec.cl.n(), dec.cl.n(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, dec.cl.n(), dec.cl.n(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, dec.cl.n(), dec.cl.n(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, dec.cl.n(), dec.cl.n(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, dec.n.n(), dec.n.n(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, dec.n.n(), dec.n.n(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, dec.n.n(), dec.n.n(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, dec.n.n(), dec.n.n(), false);
            this.a($$0, dec.n.n(), 9, 5, 11, $$4);
            this.a($$0, dec.n.n(), 8, 5, 11, $$4);
            this.a($$0, dec.n.n(), 9, 5, 10, $$4);
            drd $$12 = dec.dU.n().a(dgy.d, Boolean.valueOf(true)).a(dgy.b, Boolean.valueOf(true));
            drd $$13 = dec.dU.n().a(dgy.a, Boolean.valueOf(true)).a(dgy.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, dec.dU.n().a(dgy.a, Boolean.valueOf(true)).a(dgy.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, dec.dU.n().a(dgy.c, Boolean.valueOf(true)).a(dgy.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, dec.dU.n().a(dgy.a, Boolean.valueOf(true)).a(dgy.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, dec.dU.n().a(dgy.c, Boolean.valueOf(true)).a(dgy.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, dec.dU.n().a(dgy.a, Boolean.valueOf(true)).a(dgy.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            drd $$15 = dec.cO.n().a(dig.b, it.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            drd $$18 = dec.dU.n().a(dgy.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            drd $$19 = dec.dU.n().a(dgy.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            drd $$20 = $$13.a(dgy.d, Boolean.valueOf(true)).a(dgy.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.a(dgy.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.a(dgy.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.a(dgy.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.a(dgy.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            drd $$21 = dec.cp.n();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, epf.w);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, epf.w);
         }
      }
   }

   static class f {
      public final Class<? extends ekc.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends ekc.p> $$0, int $$1, int $$2) {
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

   public static class g extends ekc.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, ehd $$1, it $$2) {
         super(eic.y, $$0, $$1);
         this.a($$2);
      }

      public g(ud $$0) {
         super(eic.y, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(eib $$0, ud $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(ehp $$0, ehq $$1, aym $$2) {
         if ($$0 != null) {
            ((ekc.m)$$0).b = this;
         }
      }

      public static ekc.g a(ehq $$0, int $$1, int $$2, int $$3, it $$4, int $$5) {
         ehd $$6 = ehd.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new ekc.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dbu $$0, dbs $$1, dta $$2, aym $$3, ehd $$4, dag $$5, io $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, ekc.k);
         this.a($$0, $$3, $$4, ekc.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, ekc.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, ekc.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, ekc.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, ekc.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, ekc.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, ekc.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, dec.H.n(), dec.H.n(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, dec.H.n(), dec.H.n(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, ekc.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, dec.H.n(), dec.H.n(), false);
         drd $$8 = dec.eW.n().a(dib.a, Boolean.valueOf(true)).a(dib.c, Boolean.valueOf(true));
         drd $$9 = dec.eW.n().a(dib.d, Boolean.valueOf(true)).a(dib.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         drd $$12 = dec.fj.n().a(dlu.b, it.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, ekc.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, ekc.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, ekc.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         drd $$14 = dec.fy.n().a(dgp.b, it.c);
         drd $$15 = dec.fy.n().a(dgp.b, it.d);
         drd $$16 = dec.fy.n().a(dgp.b, it.f);
         drd $$17 = dec.fy.n().a(dgp.b, it.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.a(dgp.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.a(dgp.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.a(dgp.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.a(dgp.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.a(dgp.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.a(dgp.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.a(dgp.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.a(dgp.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.a(dgp.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.a(dgp.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.a(dgp.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.a(dgp.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            drd $$21 = dec.fx.n();
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
            io $$22 = this.b(5, 3, 6);
            if ($$4.b($$22)) {
               this.d = true;
               $$0.a($$22, dec.ct.n(), 2);
               if ($$0.c_($$22) instanceof dpw $$24) {
                  $$24.a(bsc.aM, $$3);
               }
            }
         }
      }
   }

   public static class h extends ekc.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, aym $$1, ehd $$2, it $$3) {
         super(eic.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(ud $$0) {
         super(eic.z, $$0);
      }

      @Override
      public void a(ehp $$0, ehq $$1, aym $$2) {
         this.a((ekc.m)$$0, $$1, $$2, 1, 1);
      }

      public static ekc.h a(ehq $$0, aym $$1, int $$2, int $$3, int $$4, it $$5, int $$6) {
         ehd $$7 = ehd.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new ekc.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dbu $$0, dbs $$1, dta $$2, aym $$3, ehd $$4, dag $$5, io $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, ekc.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, ekc.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, ekc.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, ekc.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, ekc.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, dec.eW.n().a(dib.a, Boolean.valueOf(true)).a(dib.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, dec.eW.n().a(dib.a, Boolean.valueOf(true)).a(dib.c, Boolean.valueOf(true)).a(dib.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, dec.eW.n().a(dib.a, Boolean.valueOf(true)).a(dib.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, dec.eW.n().a(dib.d, Boolean.valueOf(true)).a(dib.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, dec.eW.n().a(dib.d, Boolean.valueOf(true)).a(dib.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, dec.eW.n().a(dib.d, Boolean.valueOf(true)).a(dib.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, dec.eW.n().a(dib.a, Boolean.valueOf(true)).a(dib.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, dec.eW.n().a(dib.a, Boolean.valueOf(true)).a(dib.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         drd $$8 = dec.dy.n().a(dgg.b, it.e);
         drd $$9 = dec.dy.n().a(dgg.b, it.e).a(dgg.f, drz.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends ekc.q {
      public i(int $$0, aym $$1, ehd $$2, it $$3) {
         super(eic.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(ud $$0) {
         super(eic.A, $$0);
      }

      @Override
      public void a(ehp $$0, ehq $$1, aym $$2) {
         it $$3 = this.i();
         if ($$3 != it.c && $$3 != it.f) {
            this.b((ekc.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((ekc.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static ekc.i a(ehq $$0, aym $$1, int $$2, int $$3, int $$4, it $$5, int $$6) {
         ehd $$7 = ehd.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new ekc.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dbu $$0, dbs $$1, dta $$2, aym $$3, ehd $$4, dag $$5, io $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, ekc.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         it $$7 = this.i();
         if ($$7 != it.c && $$7 != it.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends ekc.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, aym $$1, ehd $$2, it $$3) {
         super(eic.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(ud $$0) {
         super(eic.B, $$0);
         this.d = $$0.h("Type");
      }

      @Override
      protected void a(eib $$0, ud $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(ehp $$0, ehq $$1, aym $$2) {
         this.a((ekc.m)$$0, $$1, $$2, 4, 1);
         this.b((ekc.m)$$0, $$1, $$2, 1, 4);
         this.c((ekc.m)$$0, $$1, $$2, 1, 4);
      }

      public static ekc.j a(ehq $$0, aym $$1, int $$2, int $$3, int $$4, it $$5, int $$6) {
         ehd $$7 = ehd.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new ekc.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dbu $$0, dbs $$1, dta $$2, aym $$3, ehd $$4, dag $$5, io $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, ekc.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, dec.eH.n(), 5, 1, 5, $$4);
               this.a($$0, dec.eH.n(), 5, 2, 5, $$4);
               this.a($$0, dec.eH.n(), 5, 3, 5, $$4);
               this.a($$0, dec.cq.n().a(dnc.g, it.e), 4, 3, 5, $$4);
               this.a($$0, dec.cq.n().a(dnc.g, it.f), 6, 3, 5, $$4);
               this.a($$0, dec.cq.n().a(dnc.g, it.d), 5, 3, 4, $$4);
               this.a($$0, dec.cq.n().a(dnc.g, it.c), 5, 3, 6, $$4);
               this.a($$0, dec.jE.n(), 4, 1, 4, $$4);
               this.a($$0, dec.jE.n(), 4, 1, 5, $$4);
               this.a($$0, dec.jE.n(), 4, 1, 6, $$4);
               this.a($$0, dec.jE.n(), 6, 1, 4, $$4);
               this.a($$0, dec.jE.n(), 6, 1, 5, $$4);
               this.a($$0, dec.jE.n(), 6, 1, 6, $$4);
               this.a($$0, dec.jE.n(), 5, 1, 4, $$4);
               this.a($$0, dec.jE.n(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, dec.eH.n(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, dec.eH.n(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, dec.eH.n(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, dec.eH.n(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, dec.eH.n(), 5, 1, 5, $$4);
               this.a($$0, dec.eH.n(), 5, 2, 5, $$4);
               this.a($$0, dec.eH.n(), 5, 3, 5, $$4);
               this.a($$0, dec.G.n(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, dec.m.n(), 1, 3, $$8, $$4);
                  this.a($$0, dec.m.n(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, dec.m.n(), $$9, 3, 1, $$4);
                  this.a($$0, dec.m.n(), $$9, 3, 9, $$4);
               }

               this.a($$0, dec.m.n(), 5, 1, 4, $$4);
               this.a($$0, dec.m.n(), 5, 1, 6, $$4);
               this.a($$0, dec.m.n(), 5, 3, 4, $$4);
               this.a($$0, dec.m.n(), 5, 3, 6, $$4);
               this.a($$0, dec.m.n(), 4, 1, 5, $$4);
               this.a($$0, dec.m.n(), 6, 1, 5, $$4);
               this.a($$0, dec.m.n(), 4, 3, 5, $$4);
               this.a($$0, dec.m.n(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, dec.m.n(), 4, $$10, 4, $$4);
                  this.a($$0, dec.m.n(), 6, $$10, 4, $$4);
                  this.a($$0, dec.m.n(), 4, $$10, 6, $$4);
                  this.a($$0, dec.m.n(), 6, $$10, 6, $$4);
               }

               this.a($$0, dec.cq.n(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, dec.n.n(), 2, 3, $$11, $$4);
                  this.a($$0, dec.n.n(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, dec.n.n(), 4, 3, $$11, $$4);
                     this.a($$0, dec.n.n(), 5, 3, $$11, $$4);
                     this.a($$0, dec.n.n(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, dec.n.n(), 7, 3, $$11, $$4);
                  this.a($$0, dec.n.n(), 8, 3, $$11, $$4);
               }

               drd $$12 = dec.cO.n().a(dig.b, it.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, epf.x);
         }
      }
   }

   static class k extends ehp.a {
      @Override
      public void a(aym $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = dec.eJ.n();
            } else if ($$5 < 0.5F) {
               this.a = dec.eI.n();
            } else if ($$5 < 0.55F) {
               this.a = dec.eP.n();
            } else {
               this.a = dec.eH.n();
            }
         } else {
            this.a = dec.nc.n();
         }
      }
   }

   public static class l extends ekc.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(eic $$0, int $$1, int $$2, int $$3, it $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = ekc.p.a.a;
      }

      public l(int $$0, aym $$1, ehd $$2, it $$3) {
         super(eic.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(eic $$0, ud $$1) {
         super($$0, $$1);
         this.d = $$1.q("Source");
      }

      public l(ud $$0) {
         this(eic.C, $$0);
      }

      @Override
      protected void a(eib $$0, ud $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(ehp $$0, ehq $$1, aym $$2) {
         if (this.d) {
            ekc.i = ekc.c.class;
         }

         this.a((ekc.m)$$0, $$1, $$2, 1, 1);
      }

      public static ekc.l a(ehq $$0, aym $$1, int $$2, int $$3, int $$4, it $$5, int $$6) {
         ehd $$7 = ehd.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new ekc.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dbu $$0, dbs $$1, dta $$2, aym $$3, ehd $$4, dag $$5, io $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, ekc.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, ekc.p.a.a, 1, 1, 4);
         this.a($$0, dec.eH.n(), 2, 6, 1, $$4);
         this.a($$0, dec.eH.n(), 1, 5, 1, $$4);
         this.a($$0, dec.jE.n(), 1, 6, 1, $$4);
         this.a($$0, dec.eH.n(), 1, 5, 2, $$4);
         this.a($$0, dec.eH.n(), 1, 4, 3, $$4);
         this.a($$0, dec.jE.n(), 1, 5, 3, $$4);
         this.a($$0, dec.eH.n(), 2, 4, 3, $$4);
         this.a($$0, dec.eH.n(), 3, 3, 3, $$4);
         this.a($$0, dec.jE.n(), 3, 4, 3, $$4);
         this.a($$0, dec.eH.n(), 3, 3, 2, $$4);
         this.a($$0, dec.eH.n(), 3, 2, 1, $$4);
         this.a($$0, dec.jE.n(), 3, 3, 1, $$4);
         this.a($$0, dec.eH.n(), 2, 2, 1, $$4);
         this.a($$0, dec.eH.n(), 1, 1, 1, $$4);
         this.a($$0, dec.jE.n(), 1, 2, 1, $$4);
         this.a($$0, dec.eH.n(), 1, 1, 2, $$4);
         this.a($$0, dec.jE.n(), 1, 1, 3, $$4);
      }
   }

   public static class m extends ekc.l {
      public ekc.f a;
      @Nullable
      public ekc.g b;
      public final List<ehp> c = Lists.newArrayList();

      public m(aym $$0, int $$1, int $$2) {
         super(eic.D, 0, $$1, $$2, a($$0));
      }

      public m(ud $$0) {
         super(eic.D, $$0);
      }

      @Override
      public io h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends ekc.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, aym $$1, ehd $$2, it $$3) {
         super(eic.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(ud $$0) {
         super(eic.E, $$0);
         this.d = $$0.q("Left");
         this.i = $$0.q("Right");
      }

      @Override
      protected void a(eib $$0, ud $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(ehp $$0, ehq $$1, aym $$2) {
         this.a((ekc.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((ekc.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((ekc.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static ekc.n a(ehq $$0, aym $$1, int $$2, int $$3, int $$4, it $$5, int $$6) {
         ehd $$7 = ehd.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new ekc.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dbu $$0, dbs $$1, dta $$2, aym $$3, ehd $$4, dag $$5, io $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, ekc.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, ekc.p.a.a, 1, 1, 6);
         drd $$7 = dec.cq.n().a(dnc.g, it.f);
         drd $$8 = dec.cq.n().a(dnc.g, it.e);
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

   public static class o extends ekc.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, aym $$1, ehd $$2, it $$3) {
         super(eic.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(ud $$0) {
         super(eic.F, $$0);
      }

      @Override
      public void a(ehp $$0, ehq $$1, aym $$2) {
         this.a((ekc.m)$$0, $$1, $$2, 1, 1);
      }

      public static ekc.o a(ehq $$0, aym $$1, int $$2, int $$3, int $$4, it $$5, int $$6) {
         ehd $$7 = ehd.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new ekc.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dbu $$0, dbs $$1, dta $$2, aym $$3, ehd $$4, dag $$5, io $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, ekc.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, ekc.p.a.a, 1, 1, 7);
         drd $$7 = dec.cQ.n().a(dlu.b, it.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, dec.eH.n(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dec.eH.n(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dec.eH.n(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends ehp {
      protected ekc.p.a h = ekc.p.a.a;

      protected p(eic $$0, int $$1, ehd $$2) {
         super($$0, $$1, $$2);
      }

      public p(eic $$0, ud $$1) {
         super($$0, $$1);
         this.h = ekc.p.a.valueOf($$1.l("EntryDoor"));
      }

      @Override
      protected void a(eib $$0, ud $$1) {
         $$1.a("EntryDoor", this.h.name());
      }

      protected void a(dbu $$0, aym $$1, ehd $$2, ekc.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, dec.eH.n(), $$4, $$5, $$6, $$2);
               this.a($$0, dec.eH.n(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dec.eH.n(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dec.eH.n(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dec.eH.n(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dec.eH.n(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dec.eH.n(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dec.cN.n(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dec.cN.n().a(dgg.f, drz.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, dec.nc.n(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dec.nc.n(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dec.eW.n().a(dib.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, dec.eW.n().a(dib.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dec.eW.n().a(dib.b, Boolean.valueOf(true)).a(dib.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dec.eW.n().a(dib.b, Boolean.valueOf(true)).a(dib.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dec.eW.n().a(dib.b, Boolean.valueOf(true)).a(dib.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dec.eW.n().a(dib.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dec.eW.n().a(dib.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, dec.eH.n(), $$4, $$5, $$6, $$2);
               this.a($$0, dec.eH.n(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dec.eH.n(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dec.eH.n(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dec.eH.n(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dec.eH.n(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dec.eH.n(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dec.dy.n(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dec.dy.n().a(dgg.f, drz.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dec.dM.n().a(dek.aE, it.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, dec.dM.n().a(dek.aE, it.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected ekc.p.a b(aym $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return ekc.p.a.a;
            case 2:
               return ekc.p.a.b;
            case 3:
               return ekc.p.a.c;
            case 4:
               return ekc.p.a.d;
         }
      }

      @Nullable
      protected ehp a(ekc.m $$0, ehq $$1, aym $$2, int $$3, int $$4) {
         it $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return ekc.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$5, this.g());
               case d:
                  return ekc.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$5, this.g());
               case e:
                  return ekc.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
               case f:
                  return ekc.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected ehp b(ekc.m $$0, ehq $$1, aym $$2, int $$3, int $$4) {
         it $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return ekc.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, it.e, this.g());
               case d:
                  return ekc.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, it.e, this.g());
               case e:
                  return ekc.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, it.c, this.g());
               case f:
                  return ekc.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, it.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected ehp c(ekc.m $$0, ehq $$1, aym $$2, int $$3, int $$4) {
         it $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return ekc.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, it.f, this.g());
               case d:
                  return ekc.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, it.f, this.g());
               case e:
                  return ekc.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, it.d, this.g());
               case f:
                  return ekc.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, it.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(ehd $$0) {
         return $$0 != null && $$0.i() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;
      }
   }

   public abstract static class q extends ekc.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(eic $$0, int $$1, ehd $$2) {
         super($$0, $$1, $$2);
      }

      public q(eic $$0, ud $$1) {
         super($$0, $$1);
      }
   }
}
