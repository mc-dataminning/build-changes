import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class eex {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final eex.f[] g = new eex.f[]{
      new eex.f(eex.n.class, 40, 0),
      new eex.f(eex.h.class, 5, 5),
      new eex.f(eex.d.class, 20, 0),
      new eex.f(eex.i.class, 20, 0),
      new eex.f(eex.j.class, 10, 6),
      new eex.f(eex.o.class, 5, 5),
      new eex.f(eex.l.class, 5, 5),
      new eex.f(eex.c.class, 5, 4),
      new eex.f(eex.a.class, 5, 4),
      new eex.f(eex.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new eex.f(eex.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<eex.f> h;
   static Class<? extends eex.p> i;
   private static int j;
   static final eex.k k = new eex.k();

   public static void a() {
      h = Lists.newArrayList();

      for (eex.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (eex.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static eex.p a(Class<? extends eex.p> $$0, ecl $$1, awt $$2, int $$3, int $$4, int $$5, @Nullable ih $$6, int $$7) {
      eex.p $$8 = null;
      if ($$0 == eex.n.class) {
         $$8 = eex.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eex.h.class) {
         $$8 = eex.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eex.d.class) {
         $$8 = eex.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eex.i.class) {
         $$8 = eex.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eex.j.class) {
         $$8 = eex.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eex.o.class) {
         $$8 = eex.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eex.l.class) {
         $$8 = eex.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eex.c.class) {
         $$8 = eex.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eex.a.class) {
         $$8 = eex.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eex.e.class) {
         $$8 = eex.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eex.g.class) {
         $$8 = eex.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static eex.p a(eex.m $$0, ecl $$1, awt $$2, int $$3, int $$4, int $$5, ih $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            eex.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (eex.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  eex.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         eby $$13 = eex.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.i() > 1 ? new eex.b($$7, $$13, $$6) : null;
      }
   }

   static eck b(eex.m $$0, ecl $$1, awt $$2, int $$3, int $$4, int $$5, @Nullable ih $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
         eck $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends eex.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, awt $$1, eby $$2, ih $$3) {
         super(ecx.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(sy $$0) {
         super(ecx.t, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(ecw $$0, sy $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(eck $$0, ecl $$1, awt $$2) {
         this.a((eex.m)$$0, $$1, $$2, 1, 1);
      }

      public static eex.a a(ecl $$0, awt $$1, int $$2, int $$3, int $$4, ih $$5, int $$6) {
         eby $$7 = eby.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new eex.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cwz $$0, cwx $$1, dob $$2, awt $$3, eby $$4, cvl $$5, ib $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, eex.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, eex.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, czh.eH.o(), czh.eH.o(), false);
         this.a($$0, czh.jK.o(), 3, 1, 1, $$4);
         this.a($$0, czh.jK.o(), 3, 1, 5, $$4);
         this.a($$0, czh.jK.o(), 3, 2, 2, $$4);
         this.a($$0, czh.jK.o(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, czh.jK.o(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, ejw.y);
         }
      }
   }

   public static class b extends eex.p {
      private final int a;

      public b(int $$0, eby $$1, ih $$2) {
         super(ecx.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != ih.c && $$2 != ih.d ? $$1.d() : $$1.f();
      }

      public b(sy $$0) {
         super(ecx.u, $$0);
         this.a = $$0.h("Steps");
      }

      @Override
      protected void a(ecw $$0, sy $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static eby a(ecl $$0, awt $$1, int $$2, int $$3, int $$4, ih $$5) {
         int $$6 = 3;
         eby $$7 = eby.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         eck $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().i() == $$7.i()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = eby.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return eby.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(cwz $$0, cwx $$1, dob $$2, awt $$3, eby $$4, cvl $$5, ib $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, czh.eH.o(), 0, 0, $$7, $$4);
            this.a($$0, czh.eH.o(), 1, 0, $$7, $$4);
            this.a($$0, czh.eH.o(), 2, 0, $$7, $$4);
            this.a($$0, czh.eH.o(), 3, 0, $$7, $$4);
            this.a($$0, czh.eH.o(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, czh.eH.o(), 0, $$8, $$7, $$4);
               this.a($$0, czh.nc.o(), 1, $$8, $$7, $$4);
               this.a($$0, czh.nc.o(), 2, $$8, $$7, $$4);
               this.a($$0, czh.nc.o(), 3, $$8, $$7, $$4);
               this.a($$0, czh.eH.o(), 4, $$8, $$7, $$4);
            }

            this.a($$0, czh.eH.o(), 0, 4, $$7, $$4);
            this.a($$0, czh.eH.o(), 1, 4, $$7, $$4);
            this.a($$0, czh.eH.o(), 2, 4, $$7, $$4);
            this.a($$0, czh.eH.o(), 3, 4, $$7, $$4);
            this.a($$0, czh.eH.o(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends eex.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, awt $$1, eby $$2, ih $$3) {
         super(ecx.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(sy $$0) {
         super(ecx.v, $$0);
         this.d = $$0.q("leftLow");
         this.i = $$0.q("leftHigh");
         this.j = $$0.q("rightLow");
         this.k = $$0.q("rightHigh");
      }

      @Override
      protected void a(ecw $$0, sy $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(eck $$0, ecl $$1, awt $$2) {
         int $$3 = 3;
         int $$4 = 5;
         ih $$5 = this.i();
         if ($$5 == ih.e || $$5 == ih.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((eex.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((eex.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((eex.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((eex.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((eex.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static eex.c a(ecl $$0, awt $$1, int $$2, int $$3, int $$4, ih $$5, int $$6) {
         eby $$7 = eby.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eex.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cwz $$0, cwx $$1, dob $$2, awt $$3, eby $$4, cvl $$5, ib $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, eex.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, eex.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, eex.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, eex.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, eex.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, eex.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, czh.jE.o(), czh.jE.o(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, czh.jE.o(), czh.jE.o(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, eex.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, czh.jE.o(), czh.jE.o(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, czh.jE.o(), czh.jE.o(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, czh.jE.o(), czh.jE.o(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, czh.jE.o(), czh.jE.o(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, czh.jE.o().a(dgh.b, dnm.c), czh.jE.o().a(dgh.b, dnm.c), false);
         this.a($$0, czh.cq.o().a(dig.g, ih.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends eex.q {
      public d(int $$0, awt $$1, eby $$2, ih $$3) {
         super(ecx.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(sy $$0) {
         super(ecx.w, $$0);
      }

      @Override
      public void a(eck $$0, ecl $$1, awt $$2) {
         ih $$3 = this.i();
         if ($$3 != ih.c && $$3 != ih.f) {
            this.c((eex.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((eex.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static eex.d a(ecl $$0, awt $$1, int $$2, int $$3, int $$4, ih $$5, int $$6) {
         eby $$7 = eby.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eex.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cwz $$0, cwx $$1, dob $$2, awt $$3, eby $$4, cvl $$5, ib $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, eex.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         ih $$7 = this.i();
         if ($$7 != ih.c && $$7 != ih.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends eex.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, awt $$1, eby $$2, ih $$3) {
         super(ecx.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.e() > 6;
      }

      public e(sy $$0) {
         super(ecx.x, $$0);
         this.i = $$0.q("Tall");
      }

      @Override
      protected void a(ecw $$0, sy $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static eex.e a(ecl $$0, awt $$1, int $$2, int $$3, int $$4, ih $$5, int $$6) {
         eby $$7 = eby.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = eby.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new eex.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(cwz $$0, cwx $$1, dob $$2, awt $$3, eby $$4, cvl $$5, ib $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, eex.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, czh.bs.o(), czh.bs.o(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, czh.n.o(), czh.n.o(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, czh.n.o(), czh.n.o(), false);
               this.a($$0, czh.cq.o().a(dig.g, ih.f), 2, 3, $$10, $$4);
               this.a($$0, czh.cq.o().a(dig.g, ih.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, czh.n.o(), czh.n.o(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, czh.n.o(), czh.n.o(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, czh.cl.o(), czh.cl.o(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, czh.cl.o(), czh.cl.o(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, czh.cl.o(), czh.cl.o(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, czh.cl.o(), czh.cl.o(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, czh.cl.o(), czh.cl.o(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, czh.cl.o(), czh.cl.o(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, czh.cl.o(), czh.cl.o(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, czh.n.o(), czh.n.o(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, czh.n.o(), czh.n.o(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, czh.n.o(), czh.n.o(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, czh.n.o(), czh.n.o(), false);
            this.a($$0, czh.n.o(), 9, 5, 11, $$4);
            this.a($$0, czh.n.o(), 8, 5, 11, $$4);
            this.a($$0, czh.n.o(), 9, 5, 10, $$4);
            dme $$12 = czh.dU.o().a(dcd.d, Boolean.valueOf(true)).a(dcd.b, Boolean.valueOf(true));
            dme $$13 = czh.dU.o().a(dcd.a, Boolean.valueOf(true)).a(dcd.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, czh.dU.o().a(dcd.a, Boolean.valueOf(true)).a(dcd.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, czh.dU.o().a(dcd.c, Boolean.valueOf(true)).a(dcd.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, czh.dU.o().a(dcd.a, Boolean.valueOf(true)).a(dcd.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, czh.dU.o().a(dcd.c, Boolean.valueOf(true)).a(dcd.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, czh.dU.o().a(dcd.a, Boolean.valueOf(true)).a(dcd.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            dme $$15 = czh.cO.o().a(ddk.b, ih.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            dme $$18 = czh.dU.o().a(dcd.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            dme $$19 = czh.dU.o().a(dcd.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            dme $$20 = $$13.a(dcd.d, Boolean.valueOf(true)).a(dcd.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.a(dcd.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.a(dcd.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.a(dcd.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.a(dcd.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            dme $$21 = czh.cp.o();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, ejw.w);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, ejw.w);
         }
      }
   }

   static class f {
      public final Class<? extends eex.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends eex.p> $$0, int $$1, int $$2) {
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

   public static class g extends eex.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, eby $$1, ih $$2) {
         super(ecx.y, $$0, $$1);
         this.a($$2);
      }

      public g(sy $$0) {
         super(ecx.y, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(ecw $$0, sy $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(eck $$0, ecl $$1, awt $$2) {
         if ($$0 != null) {
            ((eex.m)$$0).b = this;
         }
      }

      public static eex.g a(ecl $$0, int $$1, int $$2, int $$3, ih $$4, int $$5) {
         eby $$6 = eby.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new eex.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(cwz $$0, cwx $$1, dob $$2, awt $$3, eby $$4, cvl $$5, ib $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, eex.k);
         this.a($$0, $$3, $$4, eex.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, eex.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, eex.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, eex.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, eex.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, eex.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, eex.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, czh.H.o(), czh.H.o(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, czh.H.o(), czh.H.o(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, eex.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, czh.H.o(), czh.H.o(), false);
         dme $$8 = czh.eW.o().a(ddf.a, Boolean.valueOf(true)).a(ddf.c, Boolean.valueOf(true));
         dme $$9 = czh.eW.o().a(ddf.d, Boolean.valueOf(true)).a(ddf.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         dme $$12 = czh.fj.o().a(dgy.b, ih.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, eex.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, eex.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, eex.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         dme $$14 = czh.fy.o().a(dbu.b, ih.c);
         dme $$15 = czh.fy.o().a(dbu.b, ih.d);
         dme $$16 = czh.fy.o().a(dbu.b, ih.f);
         dme $$17 = czh.fy.o().a(dbu.b, ih.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.a(dbu.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.a(dbu.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.a(dbu.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.a(dbu.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.a(dbu.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.a(dbu.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.a(dbu.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.a(dbu.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.a(dbu.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.a(dbu.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.a(dbu.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.a(dbu.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            dme $$21 = czh.fx.o();
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
            ib $$22 = this.b(5, 3, 6);
            if ($$4.b($$22)) {
               this.d = true;
               $$0.a($$22, czh.ct.o(), 2);
               if ($$0.c_($$22) instanceof dky $$24) {
                  $$24.a(bol.aK, $$3);
               }
            }
         }
      }
   }

   public static class h extends eex.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, awt $$1, eby $$2, ih $$3) {
         super(ecx.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(sy $$0) {
         super(ecx.z, $$0);
      }

      @Override
      public void a(eck $$0, ecl $$1, awt $$2) {
         this.a((eex.m)$$0, $$1, $$2, 1, 1);
      }

      public static eex.h a(ecl $$0, awt $$1, int $$2, int $$3, int $$4, ih $$5, int $$6) {
         eby $$7 = eby.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eex.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cwz $$0, cwx $$1, dob $$2, awt $$3, eby $$4, cvl $$5, ib $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, eex.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, eex.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, eex.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, eex.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, eex.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, czh.eW.o().a(ddf.a, Boolean.valueOf(true)).a(ddf.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, czh.eW.o().a(ddf.a, Boolean.valueOf(true)).a(ddf.c, Boolean.valueOf(true)).a(ddf.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, czh.eW.o().a(ddf.a, Boolean.valueOf(true)).a(ddf.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, czh.eW.o().a(ddf.d, Boolean.valueOf(true)).a(ddf.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, czh.eW.o().a(ddf.d, Boolean.valueOf(true)).a(ddf.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, czh.eW.o().a(ddf.d, Boolean.valueOf(true)).a(ddf.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, czh.eW.o().a(ddf.a, Boolean.valueOf(true)).a(ddf.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, czh.eW.o().a(ddf.a, Boolean.valueOf(true)).a(ddf.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         dme $$8 = czh.dy.o().a(dbl.b, ih.e);
         dme $$9 = czh.dy.o().a(dbl.b, ih.e).a(dbl.f, dna.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends eex.q {
      public i(int $$0, awt $$1, eby $$2, ih $$3) {
         super(ecx.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(sy $$0) {
         super(ecx.A, $$0);
      }

      @Override
      public void a(eck $$0, ecl $$1, awt $$2) {
         ih $$3 = this.i();
         if ($$3 != ih.c && $$3 != ih.f) {
            this.b((eex.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((eex.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static eex.i a(ecl $$0, awt $$1, int $$2, int $$3, int $$4, ih $$5, int $$6) {
         eby $$7 = eby.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eex.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cwz $$0, cwx $$1, dob $$2, awt $$3, eby $$4, cvl $$5, ib $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, eex.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         ih $$7 = this.i();
         if ($$7 != ih.c && $$7 != ih.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends eex.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, awt $$1, eby $$2, ih $$3) {
         super(ecx.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(sy $$0) {
         super(ecx.B, $$0);
         this.d = $$0.h("Type");
      }

      @Override
      protected void a(ecw $$0, sy $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(eck $$0, ecl $$1, awt $$2) {
         this.a((eex.m)$$0, $$1, $$2, 4, 1);
         this.b((eex.m)$$0, $$1, $$2, 1, 4);
         this.c((eex.m)$$0, $$1, $$2, 1, 4);
      }

      public static eex.j a(ecl $$0, awt $$1, int $$2, int $$3, int $$4, ih $$5, int $$6) {
         eby $$7 = eby.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eex.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cwz $$0, cwx $$1, dob $$2, awt $$3, eby $$4, cvl $$5, ib $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, eex.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, czh.eH.o(), 5, 1, 5, $$4);
               this.a($$0, czh.eH.o(), 5, 2, 5, $$4);
               this.a($$0, czh.eH.o(), 5, 3, 5, $$4);
               this.a($$0, czh.cq.o().a(dig.g, ih.e), 4, 3, 5, $$4);
               this.a($$0, czh.cq.o().a(dig.g, ih.f), 6, 3, 5, $$4);
               this.a($$0, czh.cq.o().a(dig.g, ih.d), 5, 3, 4, $$4);
               this.a($$0, czh.cq.o().a(dig.g, ih.c), 5, 3, 6, $$4);
               this.a($$0, czh.jE.o(), 4, 1, 4, $$4);
               this.a($$0, czh.jE.o(), 4, 1, 5, $$4);
               this.a($$0, czh.jE.o(), 4, 1, 6, $$4);
               this.a($$0, czh.jE.o(), 6, 1, 4, $$4);
               this.a($$0, czh.jE.o(), 6, 1, 5, $$4);
               this.a($$0, czh.jE.o(), 6, 1, 6, $$4);
               this.a($$0, czh.jE.o(), 5, 1, 4, $$4);
               this.a($$0, czh.jE.o(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, czh.eH.o(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, czh.eH.o(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, czh.eH.o(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, czh.eH.o(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, czh.eH.o(), 5, 1, 5, $$4);
               this.a($$0, czh.eH.o(), 5, 2, 5, $$4);
               this.a($$0, czh.eH.o(), 5, 3, 5, $$4);
               this.a($$0, czh.G.o(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, czh.m.o(), 1, 3, $$8, $$4);
                  this.a($$0, czh.m.o(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, czh.m.o(), $$9, 3, 1, $$4);
                  this.a($$0, czh.m.o(), $$9, 3, 9, $$4);
               }

               this.a($$0, czh.m.o(), 5, 1, 4, $$4);
               this.a($$0, czh.m.o(), 5, 1, 6, $$4);
               this.a($$0, czh.m.o(), 5, 3, 4, $$4);
               this.a($$0, czh.m.o(), 5, 3, 6, $$4);
               this.a($$0, czh.m.o(), 4, 1, 5, $$4);
               this.a($$0, czh.m.o(), 6, 1, 5, $$4);
               this.a($$0, czh.m.o(), 4, 3, 5, $$4);
               this.a($$0, czh.m.o(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, czh.m.o(), 4, $$10, 4, $$4);
                  this.a($$0, czh.m.o(), 6, $$10, 4, $$4);
                  this.a($$0, czh.m.o(), 4, $$10, 6, $$4);
                  this.a($$0, czh.m.o(), 6, $$10, 6, $$4);
               }

               this.a($$0, czh.cq.o(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, czh.n.o(), 2, 3, $$11, $$4);
                  this.a($$0, czh.n.o(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, czh.n.o(), 4, 3, $$11, $$4);
                     this.a($$0, czh.n.o(), 5, 3, $$11, $$4);
                     this.a($$0, czh.n.o(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, czh.n.o(), 7, 3, $$11, $$4);
                  this.a($$0, czh.n.o(), 8, 3, $$11, $$4);
               }

               dme $$12 = czh.cO.o().a(ddk.b, ih.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, ejw.x);
         }
      }
   }

   static class k extends eck.a {
      @Override
      public void a(awt $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = czh.eJ.o();
            } else if ($$5 < 0.5F) {
               this.a = czh.eI.o();
            } else if ($$5 < 0.55F) {
               this.a = czh.eP.o();
            } else {
               this.a = czh.eH.o();
            }
         } else {
            this.a = czh.nc.o();
         }
      }
   }

   public static class l extends eex.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(ecx $$0, int $$1, int $$2, int $$3, ih $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = eex.p.a.a;
      }

      public l(int $$0, awt $$1, eby $$2, ih $$3) {
         super(ecx.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(ecx $$0, sy $$1) {
         super($$0, $$1);
         this.d = $$1.q("Source");
      }

      public l(sy $$0) {
         this(ecx.C, $$0);
      }

      @Override
      protected void a(ecw $$0, sy $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(eck $$0, ecl $$1, awt $$2) {
         if (this.d) {
            eex.i = eex.c.class;
         }

         this.a((eex.m)$$0, $$1, $$2, 1, 1);
      }

      public static eex.l a(ecl $$0, awt $$1, int $$2, int $$3, int $$4, ih $$5, int $$6) {
         eby $$7 = eby.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eex.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cwz $$0, cwx $$1, dob $$2, awt $$3, eby $$4, cvl $$5, ib $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, eex.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, eex.p.a.a, 1, 1, 4);
         this.a($$0, czh.eH.o(), 2, 6, 1, $$4);
         this.a($$0, czh.eH.o(), 1, 5, 1, $$4);
         this.a($$0, czh.jE.o(), 1, 6, 1, $$4);
         this.a($$0, czh.eH.o(), 1, 5, 2, $$4);
         this.a($$0, czh.eH.o(), 1, 4, 3, $$4);
         this.a($$0, czh.jE.o(), 1, 5, 3, $$4);
         this.a($$0, czh.eH.o(), 2, 4, 3, $$4);
         this.a($$0, czh.eH.o(), 3, 3, 3, $$4);
         this.a($$0, czh.jE.o(), 3, 4, 3, $$4);
         this.a($$0, czh.eH.o(), 3, 3, 2, $$4);
         this.a($$0, czh.eH.o(), 3, 2, 1, $$4);
         this.a($$0, czh.jE.o(), 3, 3, 1, $$4);
         this.a($$0, czh.eH.o(), 2, 2, 1, $$4);
         this.a($$0, czh.eH.o(), 1, 1, 1, $$4);
         this.a($$0, czh.jE.o(), 1, 2, 1, $$4);
         this.a($$0, czh.eH.o(), 1, 1, 2, $$4);
         this.a($$0, czh.jE.o(), 1, 1, 3, $$4);
      }
   }

   public static class m extends eex.l {
      public eex.f a;
      @Nullable
      public eex.g b;
      public final List<eck> c = Lists.newArrayList();

      public m(awt $$0, int $$1, int $$2) {
         super(ecx.D, 0, $$1, $$2, a($$0));
      }

      public m(sy $$0) {
         super(ecx.D, $$0);
      }

      @Override
      public ib h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends eex.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, awt $$1, eby $$2, ih $$3) {
         super(ecx.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(sy $$0) {
         super(ecx.E, $$0);
         this.d = $$0.q("Left");
         this.i = $$0.q("Right");
      }

      @Override
      protected void a(ecw $$0, sy $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(eck $$0, ecl $$1, awt $$2) {
         this.a((eex.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((eex.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((eex.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static eex.n a(ecl $$0, awt $$1, int $$2, int $$3, int $$4, ih $$5, int $$6) {
         eby $$7 = eby.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new eex.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cwz $$0, cwx $$1, dob $$2, awt $$3, eby $$4, cvl $$5, ib $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, eex.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, eex.p.a.a, 1, 1, 6);
         dme $$7 = czh.cq.o().a(dig.g, ih.f);
         dme $$8 = czh.cq.o().a(dig.g, ih.e);
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

   public static class o extends eex.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, awt $$1, eby $$2, ih $$3) {
         super(ecx.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(sy $$0) {
         super(ecx.F, $$0);
      }

      @Override
      public void a(eck $$0, ecl $$1, awt $$2) {
         this.a((eex.m)$$0, $$1, $$2, 1, 1);
      }

      public static eex.o a(ecl $$0, awt $$1, int $$2, int $$3, int $$4, ih $$5, int $$6) {
         eby $$7 = eby.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new eex.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cwz $$0, cwx $$1, dob $$2, awt $$3, eby $$4, cvl $$5, ib $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, eex.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, eex.p.a.a, 1, 1, 7);
         dme $$7 = czh.cQ.o().a(dgy.b, ih.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, czh.eH.o(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, czh.eH.o(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, czh.eH.o(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends eck {
      protected eex.p.a h = eex.p.a.a;

      protected p(ecx $$0, int $$1, eby $$2) {
         super($$0, $$1, $$2);
      }

      public p(ecx $$0, sy $$1) {
         super($$0, $$1);
         this.h = eex.p.a.valueOf($$1.l("EntryDoor"));
      }

      @Override
      protected void a(ecw $$0, sy $$1) {
         $$1.a("EntryDoor", this.h.name());
      }

      protected void a(cwz $$0, awt $$1, eby $$2, eex.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, czh.eH.o(), $$4, $$5, $$6, $$2);
               this.a($$0, czh.eH.o(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, czh.eH.o(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, czh.eH.o(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, czh.eH.o(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, czh.eH.o(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, czh.eH.o(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, czh.cN.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, czh.cN.o().a(dbl.f, dna.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, czh.nc.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, czh.nc.o(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, czh.eW.o().a(ddf.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, czh.eW.o().a(ddf.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, czh.eW.o().a(ddf.b, Boolean.valueOf(true)).a(ddf.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, czh.eW.o().a(ddf.b, Boolean.valueOf(true)).a(ddf.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, czh.eW.o().a(ddf.b, Boolean.valueOf(true)).a(ddf.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, czh.eW.o().a(ddf.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, czh.eW.o().a(ddf.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, czh.eH.o(), $$4, $$5, $$6, $$2);
               this.a($$0, czh.eH.o(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, czh.eH.o(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, czh.eH.o(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, czh.eH.o(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, czh.eH.o(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, czh.eH.o(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, czh.dy.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, czh.dy.o().a(dbl.f, dna.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, czh.dM.o().a(czp.aE, ih.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, czh.dM.o().a(czp.aE, ih.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected eex.p.a b(awt $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return eex.p.a.a;
            case 2:
               return eex.p.a.b;
            case 3:
               return eex.p.a.c;
            case 4:
               return eex.p.a.d;
         }
      }

      @Nullable
      protected eck a(eex.m $$0, ecl $$1, awt $$2, int $$3, int $$4) {
         ih $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eex.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$5, this.g());
               case d:
                  return eex.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$5, this.g());
               case e:
                  return eex.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
               case f:
                  return eex.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected eck b(eex.m $$0, ecl $$1, awt $$2, int $$3, int $$4) {
         ih $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eex.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, ih.e, this.g());
               case d:
                  return eex.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, ih.e, this.g());
               case e:
                  return eex.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, ih.c, this.g());
               case f:
                  return eex.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, ih.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected eck c(eex.m $$0, ecl $$1, awt $$2, int $$3, int $$4) {
         ih $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eex.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, ih.f, this.g());
               case d:
                  return eex.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, ih.f, this.g());
               case e:
                  return eex.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, ih.d, this.g());
               case f:
                  return eex.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, ih.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(eby $$0) {
         return $$0 != null && $$0.i() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;
      }
   }

   public abstract static class q extends eex.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(ecx $$0, int $$1, eby $$2) {
         super($$0, $$1, $$2);
      }

      public q(ecx $$0, sy $$1) {
         super($$0, $$1);
      }
   }
}
