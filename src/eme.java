import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class eme {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final eme.f[] g = new eme.f[]{
      new eme.f(eme.n.class, 40, 0),
      new eme.f(eme.h.class, 5, 5),
      new eme.f(eme.d.class, 20, 0),
      new eme.f(eme.i.class, 20, 0),
      new eme.f(eme.j.class, 10, 6),
      new eme.f(eme.o.class, 5, 5),
      new eme.f(eme.l.class, 5, 5),
      new eme.f(eme.c.class, 5, 4),
      new eme.f(eme.a.class, 5, 4),
      new eme.f(eme.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new eme.f(eme.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<eme.f> h;
   static Class<? extends eme.p> i;
   private static int j;
   static final eme.k k = new eme.k();

   public static void a() {
      h = Lists.newArrayList();

      for (eme.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (eme.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static eme.p a(Class<? extends eme.p> $$0, ejr $$1, ayv $$2, int $$3, int $$4, int $$5, @Nullable ji $$6, int $$7) {
      eme.p $$8 = null;
      if ($$0 == eme.n.class) {
         $$8 = eme.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eme.h.class) {
         $$8 = eme.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eme.d.class) {
         $$8 = eme.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eme.i.class) {
         $$8 = eme.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eme.j.class) {
         $$8 = eme.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eme.o.class) {
         $$8 = eme.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eme.l.class) {
         $$8 = eme.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eme.c.class) {
         $$8 = eme.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eme.a.class) {
         $$8 = eme.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eme.e.class) {
         $$8 = eme.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eme.g.class) {
         $$8 = eme.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static eme.p a(eme.m $$0, ejr $$1, ayv $$2, int $$3, int $$4, int $$5, ji $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            eme.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (eme.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  eme.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         eje $$13 = eme.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.i() > 1 ? new eme.b($$7, $$13, $$6) : null;
      }
   }

   static ejq b(eme.m $$0, ejr $$1, ayv $$2, int $$3, int $$4, int $$5, @Nullable ji $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
         ejq $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends eme.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, ayv $$1, eje $$2, ji $$3) {
         super(ekd.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(ua $$0) {
         super(ekd.t, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(ekc $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(ejq $$0, ejr $$1, ayv $$2) {
         this.a((eme.m)$$0, $$1, $$2, 1, 1);
      }

      public static eme.a a(ejr $$0, ayv $$1, int $$2, int $$3, int $$4, ji $$5, int $$6) {
         eje $$7 = eje.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new eme.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(ddq $$0, ddo $$1, dux $$2, ayv $$3, eje $$4, dcb $$5, jd $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, eme.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, eme.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, dfy.eH.o(), dfy.eH.o(), false);
         this.a($$0, dfy.jK.o(), 3, 1, 1, $$4);
         this.a($$0, dfy.jK.o(), 3, 1, 5, $$4);
         this.a($$0, dfy.jK.o(), 3, 2, 2, $$4);
         this.a($$0, dfy.jK.o(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, dfy.jK.o(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, erh.y);
         }
      }
   }

   public static class b extends eme.p {
      private final int a;

      public b(int $$0, eje $$1, ji $$2) {
         super(ekd.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != ji.c && $$2 != ji.d ? $$1.d() : $$1.f();
      }

      public b(ua $$0) {
         super(ekd.u, $$0);
         this.a = $$0.h("Steps");
      }

      @Override
      protected void a(ekc $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static eje a(ejr $$0, ayv $$1, int $$2, int $$3, int $$4, ji $$5) {
         int $$6 = 3;
         eje $$7 = eje.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         ejq $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().i() == $$7.i()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = eje.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return eje.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(ddq $$0, ddo $$1, dux $$2, ayv $$3, eje $$4, dcb $$5, jd $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, dfy.eH.o(), 0, 0, $$7, $$4);
            this.a($$0, dfy.eH.o(), 1, 0, $$7, $$4);
            this.a($$0, dfy.eH.o(), 2, 0, $$7, $$4);
            this.a($$0, dfy.eH.o(), 3, 0, $$7, $$4);
            this.a($$0, dfy.eH.o(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, dfy.eH.o(), 0, $$8, $$7, $$4);
               this.a($$0, dfy.nc.o(), 1, $$8, $$7, $$4);
               this.a($$0, dfy.nc.o(), 2, $$8, $$7, $$4);
               this.a($$0, dfy.nc.o(), 3, $$8, $$7, $$4);
               this.a($$0, dfy.eH.o(), 4, $$8, $$7, $$4);
            }

            this.a($$0, dfy.eH.o(), 0, 4, $$7, $$4);
            this.a($$0, dfy.eH.o(), 1, 4, $$7, $$4);
            this.a($$0, dfy.eH.o(), 2, 4, $$7, $$4);
            this.a($$0, dfy.eH.o(), 3, 4, $$7, $$4);
            this.a($$0, dfy.eH.o(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends eme.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, ayv $$1, eje $$2, ji $$3) {
         super(ekd.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(ua $$0) {
         super(ekd.v, $$0);
         this.d = $$0.q("leftLow");
         this.i = $$0.q("leftHigh");
         this.j = $$0.q("rightLow");
         this.k = $$0.q("rightHigh");
      }

      @Override
      protected void a(ekc $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(ejq $$0, ejr $$1, ayv $$2) {
         int $$3 = 3;
         int $$4 = 5;
         ji $$5 = this.i();
         if ($$5 == ji.e || $$5 == ji.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((eme.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((eme.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((eme.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((eme.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((eme.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static eme.c a(ejr $$0, ayv $$1, int $$2, int $$3, int $$4, ji $$5, int $$6) {
         eje $$7 = eje.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eme.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(ddq $$0, ddo $$1, dux $$2, ayv $$3, eje $$4, dcb $$5, jd $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, eme.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, eme.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, eme.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, eme.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, eme.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, eme.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, dfy.jE.o(), dfy.jE.o(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, dfy.jE.o(), dfy.jE.o(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, eme.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, dfy.jE.o(), dfy.jE.o(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, dfy.jE.o(), dfy.jE.o(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, dfy.jE.o(), dfy.jE.o(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, dfy.jE.o(), dfy.jE.o(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, dfy.jE.o().a(dna.b, dui.c), dfy.jE.o().a(dna.b, dui.c), false);
         this.a($$0, dfy.cq.o().a(doz.g, ji.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends eme.q {
      public d(int $$0, ayv $$1, eje $$2, ji $$3) {
         super(ekd.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(ua $$0) {
         super(ekd.w, $$0);
      }

      @Override
      public void a(ejq $$0, ejr $$1, ayv $$2) {
         ji $$3 = this.i();
         if ($$3 != ji.c && $$3 != ji.f) {
            this.c((eme.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((eme.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static eme.d a(ejr $$0, ayv $$1, int $$2, int $$3, int $$4, ji $$5, int $$6) {
         eje $$7 = eje.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eme.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(ddq $$0, ddo $$1, dux $$2, ayv $$3, eje $$4, dcb $$5, jd $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, eme.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         ji $$7 = this.i();
         if ($$7 != ji.c && $$7 != ji.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends eme.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, ayv $$1, eje $$2, ji $$3) {
         super(ekd.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.e() > 6;
      }

      public e(ua $$0) {
         super(ekd.x, $$0);
         this.i = $$0.q("Tall");
      }

      @Override
      protected void a(ekc $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static eme.e a(ejr $$0, ayv $$1, int $$2, int $$3, int $$4, ji $$5, int $$6) {
         eje $$7 = eje.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = eje.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new eme.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(ddq $$0, ddo $$1, dux $$2, ayv $$3, eje $$4, dcb $$5, jd $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, eme.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, dfy.bs.o(), dfy.bs.o(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dfy.n.o(), dfy.n.o(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dfy.n.o(), dfy.n.o(), false);
               this.a($$0, dfy.cq.o().a(doz.g, ji.f), 2, 3, $$10, $$4);
               this.a($$0, dfy.cq.o().a(doz.g, ji.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dfy.n.o(), dfy.n.o(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dfy.n.o(), dfy.n.o(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dfy.cl.o(), dfy.cl.o(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dfy.cl.o(), dfy.cl.o(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dfy.cl.o(), dfy.cl.o(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dfy.cl.o(), dfy.cl.o(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, dfy.cl.o(), dfy.cl.o(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, dfy.cl.o(), dfy.cl.o(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, dfy.cl.o(), dfy.cl.o(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, dfy.n.o(), dfy.n.o(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, dfy.n.o(), dfy.n.o(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, dfy.n.o(), dfy.n.o(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, dfy.n.o(), dfy.n.o(), false);
            this.a($$0, dfy.n.o(), 9, 5, 11, $$4);
            this.a($$0, dfy.n.o(), 8, 5, 11, $$4);
            this.a($$0, dfy.n.o(), 9, 5, 10, $$4);
            dta $$12 = dfy.dU.o().a(diu.d, Boolean.valueOf(true)).a(diu.b, Boolean.valueOf(true));
            dta $$13 = dfy.dU.o().a(diu.a, Boolean.valueOf(true)).a(diu.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, dfy.dU.o().a(diu.a, Boolean.valueOf(true)).a(diu.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, dfy.dU.o().a(diu.c, Boolean.valueOf(true)).a(diu.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, dfy.dU.o().a(diu.a, Boolean.valueOf(true)).a(diu.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, dfy.dU.o().a(diu.c, Boolean.valueOf(true)).a(diu.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, dfy.dU.o().a(diu.a, Boolean.valueOf(true)).a(diu.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            dta $$15 = dfy.cO.o().a(dkc.b, ji.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            dta $$18 = dfy.dU.o().a(diu.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            dta $$19 = dfy.dU.o().a(diu.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            dta $$20 = $$13.a(diu.d, Boolean.valueOf(true)).a(diu.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.a(diu.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.a(diu.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.a(diu.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.a(diu.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            dta $$21 = dfy.cp.o();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, erh.w);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, erh.w);
         }
      }
   }

   static class f {
      public final Class<? extends eme.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends eme.p> $$0, int $$1, int $$2) {
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

   public static class g extends eme.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, eje $$1, ji $$2) {
         super(ekd.y, $$0, $$1);
         this.a($$2);
      }

      public g(ua $$0) {
         super(ekd.y, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(ekc $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(ejq $$0, ejr $$1, ayv $$2) {
         if ($$0 != null) {
            ((eme.m)$$0).b = this;
         }
      }

      public static eme.g a(ejr $$0, int $$1, int $$2, int $$3, ji $$4, int $$5) {
         eje $$6 = eje.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new eme.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(ddq $$0, ddo $$1, dux $$2, ayv $$3, eje $$4, dcb $$5, jd $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, eme.k);
         this.a($$0, $$3, $$4, eme.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, eme.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, eme.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, eme.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, eme.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, eme.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, eme.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, dfy.H.o(), dfy.H.o(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, dfy.H.o(), dfy.H.o(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, eme.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, dfy.H.o(), dfy.H.o(), false);
         dta $$8 = dfy.eW.o().a(djx.a, Boolean.valueOf(true)).a(djx.c, Boolean.valueOf(true));
         dta $$9 = dfy.eW.o().a(djx.d, Boolean.valueOf(true)).a(djx.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         dta $$12 = dfy.fj.o().a(dnr.b, ji.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, eme.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, eme.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, eme.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         dta $$14 = dfy.fy.o().a(dil.b, ji.c);
         dta $$15 = dfy.fy.o().a(dil.b, ji.d);
         dta $$16 = dfy.fy.o().a(dil.b, ji.f);
         dta $$17 = dfy.fy.o().a(dil.b, ji.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.a(dil.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.a(dil.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.a(dil.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.a(dil.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.a(dil.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.a(dil.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.a(dil.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.a(dil.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.a(dil.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.a(dil.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.a(dil.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.a(dil.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            dta $$21 = dfy.fx.o();
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
            jd $$22 = this.b(5, 3, 6);
            if ($$4.b($$22)) {
               this.d = true;
               $$0.a($$22, dfy.ct.o(), 2);
               if ($$0.c_($$22) instanceof dru $$24) {
                  $$24.a(bsw.aM, $$3);
               }
            }
         }
      }
   }

   public static class h extends eme.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, ayv $$1, eje $$2, ji $$3) {
         super(ekd.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(ua $$0) {
         super(ekd.z, $$0);
      }

      @Override
      public void a(ejq $$0, ejr $$1, ayv $$2) {
         this.a((eme.m)$$0, $$1, $$2, 1, 1);
      }

      public static eme.h a(ejr $$0, ayv $$1, int $$2, int $$3, int $$4, ji $$5, int $$6) {
         eje $$7 = eje.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eme.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(ddq $$0, ddo $$1, dux $$2, ayv $$3, eje $$4, dcb $$5, jd $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, eme.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, eme.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, eme.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, eme.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, eme.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, dfy.eW.o().a(djx.a, Boolean.valueOf(true)).a(djx.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, dfy.eW.o().a(djx.a, Boolean.valueOf(true)).a(djx.c, Boolean.valueOf(true)).a(djx.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, dfy.eW.o().a(djx.a, Boolean.valueOf(true)).a(djx.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, dfy.eW.o().a(djx.d, Boolean.valueOf(true)).a(djx.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, dfy.eW.o().a(djx.d, Boolean.valueOf(true)).a(djx.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, dfy.eW.o().a(djx.d, Boolean.valueOf(true)).a(djx.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, dfy.eW.o().a(djx.a, Boolean.valueOf(true)).a(djx.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, dfy.eW.o().a(djx.a, Boolean.valueOf(true)).a(djx.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         dta $$8 = dfy.dy.o().a(dic.b, ji.e);
         dta $$9 = dfy.dy.o().a(dic.b, ji.e).a(dic.f, dtw.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends eme.q {
      public i(int $$0, ayv $$1, eje $$2, ji $$3) {
         super(ekd.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(ua $$0) {
         super(ekd.A, $$0);
      }

      @Override
      public void a(ejq $$0, ejr $$1, ayv $$2) {
         ji $$3 = this.i();
         if ($$3 != ji.c && $$3 != ji.f) {
            this.b((eme.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((eme.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static eme.i a(ejr $$0, ayv $$1, int $$2, int $$3, int $$4, ji $$5, int $$6) {
         eje $$7 = eje.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eme.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(ddq $$0, ddo $$1, dux $$2, ayv $$3, eje $$4, dcb $$5, jd $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, eme.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         ji $$7 = this.i();
         if ($$7 != ji.c && $$7 != ji.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends eme.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, ayv $$1, eje $$2, ji $$3) {
         super(ekd.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(ua $$0) {
         super(ekd.B, $$0);
         this.d = $$0.h("Type");
      }

      @Override
      protected void a(ekc $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(ejq $$0, ejr $$1, ayv $$2) {
         this.a((eme.m)$$0, $$1, $$2, 4, 1);
         this.b((eme.m)$$0, $$1, $$2, 1, 4);
         this.c((eme.m)$$0, $$1, $$2, 1, 4);
      }

      public static eme.j a(ejr $$0, ayv $$1, int $$2, int $$3, int $$4, ji $$5, int $$6) {
         eje $$7 = eje.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eme.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(ddq $$0, ddo $$1, dux $$2, ayv $$3, eje $$4, dcb $$5, jd $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, eme.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, dfy.eH.o(), 5, 1, 5, $$4);
               this.a($$0, dfy.eH.o(), 5, 2, 5, $$4);
               this.a($$0, dfy.eH.o(), 5, 3, 5, $$4);
               this.a($$0, dfy.cq.o().a(doz.g, ji.e), 4, 3, 5, $$4);
               this.a($$0, dfy.cq.o().a(doz.g, ji.f), 6, 3, 5, $$4);
               this.a($$0, dfy.cq.o().a(doz.g, ji.d), 5, 3, 4, $$4);
               this.a($$0, dfy.cq.o().a(doz.g, ji.c), 5, 3, 6, $$4);
               this.a($$0, dfy.jE.o(), 4, 1, 4, $$4);
               this.a($$0, dfy.jE.o(), 4, 1, 5, $$4);
               this.a($$0, dfy.jE.o(), 4, 1, 6, $$4);
               this.a($$0, dfy.jE.o(), 6, 1, 4, $$4);
               this.a($$0, dfy.jE.o(), 6, 1, 5, $$4);
               this.a($$0, dfy.jE.o(), 6, 1, 6, $$4);
               this.a($$0, dfy.jE.o(), 5, 1, 4, $$4);
               this.a($$0, dfy.jE.o(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, dfy.eH.o(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, dfy.eH.o(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, dfy.eH.o(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, dfy.eH.o(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, dfy.eH.o(), 5, 1, 5, $$4);
               this.a($$0, dfy.eH.o(), 5, 2, 5, $$4);
               this.a($$0, dfy.eH.o(), 5, 3, 5, $$4);
               this.a($$0, dfy.G.o(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, dfy.m.o(), 1, 3, $$8, $$4);
                  this.a($$0, dfy.m.o(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, dfy.m.o(), $$9, 3, 1, $$4);
                  this.a($$0, dfy.m.o(), $$9, 3, 9, $$4);
               }

               this.a($$0, dfy.m.o(), 5, 1, 4, $$4);
               this.a($$0, dfy.m.o(), 5, 1, 6, $$4);
               this.a($$0, dfy.m.o(), 5, 3, 4, $$4);
               this.a($$0, dfy.m.o(), 5, 3, 6, $$4);
               this.a($$0, dfy.m.o(), 4, 1, 5, $$4);
               this.a($$0, dfy.m.o(), 6, 1, 5, $$4);
               this.a($$0, dfy.m.o(), 4, 3, 5, $$4);
               this.a($$0, dfy.m.o(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, dfy.m.o(), 4, $$10, 4, $$4);
                  this.a($$0, dfy.m.o(), 6, $$10, 4, $$4);
                  this.a($$0, dfy.m.o(), 4, $$10, 6, $$4);
                  this.a($$0, dfy.m.o(), 6, $$10, 6, $$4);
               }

               this.a($$0, dfy.cq.o(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, dfy.n.o(), 2, 3, $$11, $$4);
                  this.a($$0, dfy.n.o(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, dfy.n.o(), 4, 3, $$11, $$4);
                     this.a($$0, dfy.n.o(), 5, 3, $$11, $$4);
                     this.a($$0, dfy.n.o(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, dfy.n.o(), 7, 3, $$11, $$4);
                  this.a($$0, dfy.n.o(), 8, 3, $$11, $$4);
               }

               dta $$12 = dfy.cO.o().a(dkc.b, ji.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, erh.x);
         }
      }
   }

   static class k extends ejq.a {
      @Override
      public void a(ayv $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = dfy.eJ.o();
            } else if ($$5 < 0.5F) {
               this.a = dfy.eI.o();
            } else if ($$5 < 0.55F) {
               this.a = dfy.eP.o();
            } else {
               this.a = dfy.eH.o();
            }
         } else {
            this.a = dfy.nc.o();
         }
      }
   }

   public static class l extends eme.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(ekd $$0, int $$1, int $$2, int $$3, ji $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = eme.p.a.a;
      }

      public l(int $$0, ayv $$1, eje $$2, ji $$3) {
         super(ekd.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(ekd $$0, ua $$1) {
         super($$0, $$1);
         this.d = $$1.q("Source");
      }

      public l(ua $$0) {
         this(ekd.C, $$0);
      }

      @Override
      protected void a(ekc $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(ejq $$0, ejr $$1, ayv $$2) {
         if (this.d) {
            eme.i = eme.c.class;
         }

         this.a((eme.m)$$0, $$1, $$2, 1, 1);
      }

      public static eme.l a(ejr $$0, ayv $$1, int $$2, int $$3, int $$4, ji $$5, int $$6) {
         eje $$7 = eje.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eme.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(ddq $$0, ddo $$1, dux $$2, ayv $$3, eje $$4, dcb $$5, jd $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, eme.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, eme.p.a.a, 1, 1, 4);
         this.a($$0, dfy.eH.o(), 2, 6, 1, $$4);
         this.a($$0, dfy.eH.o(), 1, 5, 1, $$4);
         this.a($$0, dfy.jE.o(), 1, 6, 1, $$4);
         this.a($$0, dfy.eH.o(), 1, 5, 2, $$4);
         this.a($$0, dfy.eH.o(), 1, 4, 3, $$4);
         this.a($$0, dfy.jE.o(), 1, 5, 3, $$4);
         this.a($$0, dfy.eH.o(), 2, 4, 3, $$4);
         this.a($$0, dfy.eH.o(), 3, 3, 3, $$4);
         this.a($$0, dfy.jE.o(), 3, 4, 3, $$4);
         this.a($$0, dfy.eH.o(), 3, 3, 2, $$4);
         this.a($$0, dfy.eH.o(), 3, 2, 1, $$4);
         this.a($$0, dfy.jE.o(), 3, 3, 1, $$4);
         this.a($$0, dfy.eH.o(), 2, 2, 1, $$4);
         this.a($$0, dfy.eH.o(), 1, 1, 1, $$4);
         this.a($$0, dfy.jE.o(), 1, 2, 1, $$4);
         this.a($$0, dfy.eH.o(), 1, 1, 2, $$4);
         this.a($$0, dfy.jE.o(), 1, 1, 3, $$4);
      }
   }

   public static class m extends eme.l {
      public eme.f a;
      @Nullable
      public eme.g b;
      public final List<ejq> c = Lists.newArrayList();

      public m(ayv $$0, int $$1, int $$2) {
         super(ekd.D, 0, $$1, $$2, a($$0));
      }

      public m(ua $$0) {
         super(ekd.D, $$0);
      }

      @Override
      public jd h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends eme.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, ayv $$1, eje $$2, ji $$3) {
         super(ekd.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(ua $$0) {
         super(ekd.E, $$0);
         this.d = $$0.q("Left");
         this.i = $$0.q("Right");
      }

      @Override
      protected void a(ekc $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(ejq $$0, ejr $$1, ayv $$2) {
         this.a((eme.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((eme.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((eme.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static eme.n a(ejr $$0, ayv $$1, int $$2, int $$3, int $$4, ji $$5, int $$6) {
         eje $$7 = eje.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new eme.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(ddq $$0, ddo $$1, dux $$2, ayv $$3, eje $$4, dcb $$5, jd $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, eme.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, eme.p.a.a, 1, 1, 6);
         dta $$7 = dfy.cq.o().a(doz.g, ji.f);
         dta $$8 = dfy.cq.o().a(doz.g, ji.e);
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

   public static class o extends eme.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, ayv $$1, eje $$2, ji $$3) {
         super(ekd.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(ua $$0) {
         super(ekd.F, $$0);
      }

      @Override
      public void a(ejq $$0, ejr $$1, ayv $$2) {
         this.a((eme.m)$$0, $$1, $$2, 1, 1);
      }

      public static eme.o a(ejr $$0, ayv $$1, int $$2, int $$3, int $$4, ji $$5, int $$6) {
         eje $$7 = eje.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new eme.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(ddq $$0, ddo $$1, dux $$2, ayv $$3, eje $$4, dcb $$5, jd $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, eme.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, eme.p.a.a, 1, 1, 7);
         dta $$7 = dfy.cQ.o().a(dnr.b, ji.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, dfy.eH.o(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dfy.eH.o(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dfy.eH.o(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends ejq {
      protected eme.p.a h = eme.p.a.a;

      protected p(ekd $$0, int $$1, eje $$2) {
         super($$0, $$1, $$2);
      }

      public p(ekd $$0, ua $$1) {
         super($$0, $$1);
         this.h = eme.p.a.valueOf($$1.l("EntryDoor"));
      }

      @Override
      protected void a(ekc $$0, ua $$1) {
         $$1.a("EntryDoor", this.h.name());
      }

      protected void a(ddq $$0, ayv $$1, eje $$2, eme.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, dfy.eH.o(), $$4, $$5, $$6, $$2);
               this.a($$0, dfy.eH.o(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dfy.eH.o(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dfy.eH.o(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dfy.eH.o(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dfy.eH.o(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dfy.eH.o(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dfy.cN.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dfy.cN.o().a(dic.f, dtw.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, dfy.nc.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dfy.nc.o(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dfy.eW.o().a(djx.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, dfy.eW.o().a(djx.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dfy.eW.o().a(djx.b, Boolean.valueOf(true)).a(djx.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dfy.eW.o().a(djx.b, Boolean.valueOf(true)).a(djx.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dfy.eW.o().a(djx.b, Boolean.valueOf(true)).a(djx.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dfy.eW.o().a(djx.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dfy.eW.o().a(djx.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, dfy.eH.o(), $$4, $$5, $$6, $$2);
               this.a($$0, dfy.eH.o(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dfy.eH.o(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dfy.eH.o(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dfy.eH.o(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dfy.eH.o(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dfy.eH.o(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dfy.dy.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dfy.dy.o().a(dic.f, dtw.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dfy.dM.o().a(dgg.aE, ji.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, dfy.dM.o().a(dgg.aE, ji.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected eme.p.a b(ayv $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return eme.p.a.a;
            case 2:
               return eme.p.a.b;
            case 3:
               return eme.p.a.c;
            case 4:
               return eme.p.a.d;
         }
      }

      @Nullable
      protected ejq a(eme.m $$0, ejr $$1, ayv $$2, int $$3, int $$4) {
         ji $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eme.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$5, this.g());
               case d:
                  return eme.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$5, this.g());
               case e:
                  return eme.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
               case f:
                  return eme.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected ejq b(eme.m $$0, ejr $$1, ayv $$2, int $$3, int $$4) {
         ji $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eme.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, ji.e, this.g());
               case d:
                  return eme.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, ji.e, this.g());
               case e:
                  return eme.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, ji.c, this.g());
               case f:
                  return eme.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, ji.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected ejq c(eme.m $$0, ejr $$1, ayv $$2, int $$3, int $$4) {
         ji $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eme.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, ji.f, this.g());
               case d:
                  return eme.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, ji.f, this.g());
               case e:
                  return eme.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, ji.d, this.g());
               case f:
                  return eme.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, ji.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(eje $$0) {
         return $$0 != null && $$0.i() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;
      }
   }

   public abstract static class q extends eme.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(ekd $$0, int $$1, eje $$2) {
         super($$0, $$1, $$2);
      }

      public q(ekd $$0, ua $$1) {
         super($$0, $$1);
      }
   }
}
