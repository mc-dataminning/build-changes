import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class emh {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final emh.f[] g = new emh.f[]{
      new emh.f(emh.n.class, 40, 0),
      new emh.f(emh.h.class, 5, 5),
      new emh.f(emh.d.class, 20, 0),
      new emh.f(emh.i.class, 20, 0),
      new emh.f(emh.j.class, 10, 6),
      new emh.f(emh.o.class, 5, 5),
      new emh.f(emh.l.class, 5, 5),
      new emh.f(emh.c.class, 5, 4),
      new emh.f(emh.a.class, 5, 4),
      new emh.f(emh.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new emh.f(emh.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<emh.f> h;
   static Class<? extends emh.p> i;
   private static int j;
   static final emh.k k = new emh.k();

   public static void a() {
      h = Lists.newArrayList();

      for (emh.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (emh.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static emh.p a(Class<? extends emh.p> $$0, eju $$1, ayw $$2, int $$3, int $$4, int $$5, @Nullable ji $$6, int $$7) {
      emh.p $$8 = null;
      if ($$0 == emh.n.class) {
         $$8 = emh.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == emh.h.class) {
         $$8 = emh.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == emh.d.class) {
         $$8 = emh.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == emh.i.class) {
         $$8 = emh.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == emh.j.class) {
         $$8 = emh.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == emh.o.class) {
         $$8 = emh.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == emh.l.class) {
         $$8 = emh.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == emh.c.class) {
         $$8 = emh.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == emh.a.class) {
         $$8 = emh.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == emh.e.class) {
         $$8 = emh.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == emh.g.class) {
         $$8 = emh.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static emh.p a(emh.m $$0, eju $$1, ayw $$2, int $$3, int $$4, int $$5, ji $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            emh.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (emh.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  emh.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         ejh $$13 = emh.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.i() > 1 ? new emh.b($$7, $$13, $$6) : null;
      }
   }

   static ejt b(emh.m $$0, eju $$1, ayw $$2, int $$3, int $$4, int $$5, @Nullable ji $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
         ejt $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends emh.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, ayw $$1, ejh $$2, ji $$3) {
         super(ekg.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(ub $$0) {
         super(ekg.t, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(ekf $$0, ub $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(ejt $$0, eju $$1, ayw $$2) {
         this.a((emh.m)$$0, $$1, $$2, 1, 1);
      }

      public static emh.a a(eju $$0, ayw $$1, int $$2, int $$3, int $$4, ji $$5, int $$6) {
         ejh $$7 = ejh.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new emh.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejh $$4, dcd $$5, jd $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, emh.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, emh.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, dga.eH.o(), dga.eH.o(), false);
         this.a($$0, dga.jK.o(), 3, 1, 1, $$4);
         this.a($$0, dga.jK.o(), 3, 1, 5, $$4);
         this.a($$0, dga.jK.o(), 3, 2, 2, $$4);
         this.a($$0, dga.jK.o(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, dga.jK.o(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, erl.y);
         }
      }
   }

   public static class b extends emh.p {
      private final int a;

      public b(int $$0, ejh $$1, ji $$2) {
         super(ekg.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != ji.c && $$2 != ji.d ? $$1.d() : $$1.f();
      }

      public b(ub $$0) {
         super(ekg.u, $$0);
         this.a = $$0.h("Steps");
      }

      @Override
      protected void a(ekf $$0, ub $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static ejh a(eju $$0, ayw $$1, int $$2, int $$3, int $$4, ji $$5) {
         int $$6 = 3;
         ejh $$7 = ejh.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         ejt $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().i() == $$7.i()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = ejh.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return ejh.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejh $$4, dcd $$5, jd $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, dga.eH.o(), 0, 0, $$7, $$4);
            this.a($$0, dga.eH.o(), 1, 0, $$7, $$4);
            this.a($$0, dga.eH.o(), 2, 0, $$7, $$4);
            this.a($$0, dga.eH.o(), 3, 0, $$7, $$4);
            this.a($$0, dga.eH.o(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, dga.eH.o(), 0, $$8, $$7, $$4);
               this.a($$0, dga.nc.o(), 1, $$8, $$7, $$4);
               this.a($$0, dga.nc.o(), 2, $$8, $$7, $$4);
               this.a($$0, dga.nc.o(), 3, $$8, $$7, $$4);
               this.a($$0, dga.eH.o(), 4, $$8, $$7, $$4);
            }

            this.a($$0, dga.eH.o(), 0, 4, $$7, $$4);
            this.a($$0, dga.eH.o(), 1, 4, $$7, $$4);
            this.a($$0, dga.eH.o(), 2, 4, $$7, $$4);
            this.a($$0, dga.eH.o(), 3, 4, $$7, $$4);
            this.a($$0, dga.eH.o(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends emh.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, ayw $$1, ejh $$2, ji $$3) {
         super(ekg.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(ub $$0) {
         super(ekg.v, $$0);
         this.d = $$0.q("leftLow");
         this.i = $$0.q("leftHigh");
         this.j = $$0.q("rightLow");
         this.k = $$0.q("rightHigh");
      }

      @Override
      protected void a(ekf $$0, ub $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(ejt $$0, eju $$1, ayw $$2) {
         int $$3 = 3;
         int $$4 = 5;
         ji $$5 = this.i();
         if ($$5 == ji.e || $$5 == ji.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((emh.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((emh.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((emh.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((emh.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((emh.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static emh.c a(eju $$0, ayw $$1, int $$2, int $$3, int $$4, ji $$5, int $$6) {
         ejh $$7 = ejh.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new emh.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejh $$4, dcd $$5, jd $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, emh.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, emh.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, emh.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, emh.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, emh.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, emh.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, dga.jE.o(), dga.jE.o(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, dga.jE.o(), dga.jE.o(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, emh.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, dga.jE.o(), dga.jE.o(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, dga.jE.o(), dga.jE.o(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, dga.jE.o(), dga.jE.o(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, dga.jE.o(), dga.jE.o(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, dga.jE.o().a(dnc.b, duk.c), dga.jE.o().a(dnc.b, duk.c), false);
         this.a($$0, dga.cq.o().a(dpb.g, ji.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends emh.q {
      public d(int $$0, ayw $$1, ejh $$2, ji $$3) {
         super(ekg.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(ub $$0) {
         super(ekg.w, $$0);
      }

      @Override
      public void a(ejt $$0, eju $$1, ayw $$2) {
         ji $$3 = this.i();
         if ($$3 != ji.c && $$3 != ji.f) {
            this.c((emh.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((emh.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static emh.d a(eju $$0, ayw $$1, int $$2, int $$3, int $$4, ji $$5, int $$6) {
         ejh $$7 = ejh.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new emh.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejh $$4, dcd $$5, jd $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, emh.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         ji $$7 = this.i();
         if ($$7 != ji.c && $$7 != ji.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends emh.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, ayw $$1, ejh $$2, ji $$3) {
         super(ekg.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.e() > 6;
      }

      public e(ub $$0) {
         super(ekg.x, $$0);
         this.i = $$0.q("Tall");
      }

      @Override
      protected void a(ekf $$0, ub $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static emh.e a(eju $$0, ayw $$1, int $$2, int $$3, int $$4, ji $$5, int $$6) {
         ejh $$7 = ejh.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = ejh.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new emh.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejh $$4, dcd $$5, jd $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, emh.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, dga.bs.o(), dga.bs.o(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dga.n.o(), dga.n.o(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dga.n.o(), dga.n.o(), false);
               this.a($$0, dga.cq.o().a(dpb.g, ji.f), 2, 3, $$10, $$4);
               this.a($$0, dga.cq.o().a(dpb.g, ji.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dga.n.o(), dga.n.o(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dga.n.o(), dga.n.o(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dga.cl.o(), dga.cl.o(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dga.cl.o(), dga.cl.o(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dga.cl.o(), dga.cl.o(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dga.cl.o(), dga.cl.o(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, dga.cl.o(), dga.cl.o(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, dga.cl.o(), dga.cl.o(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, dga.cl.o(), dga.cl.o(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, dga.n.o(), dga.n.o(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, dga.n.o(), dga.n.o(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, dga.n.o(), dga.n.o(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, dga.n.o(), dga.n.o(), false);
            this.a($$0, dga.n.o(), 9, 5, 11, $$4);
            this.a($$0, dga.n.o(), 8, 5, 11, $$4);
            this.a($$0, dga.n.o(), 9, 5, 10, $$4);
            dtc $$12 = dga.dU.o().a(diw.d, Boolean.valueOf(true)).a(diw.b, Boolean.valueOf(true));
            dtc $$13 = dga.dU.o().a(diw.a, Boolean.valueOf(true)).a(diw.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, dga.dU.o().a(diw.a, Boolean.valueOf(true)).a(diw.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, dga.dU.o().a(diw.c, Boolean.valueOf(true)).a(diw.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, dga.dU.o().a(diw.a, Boolean.valueOf(true)).a(diw.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, dga.dU.o().a(diw.c, Boolean.valueOf(true)).a(diw.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, dga.dU.o().a(diw.a, Boolean.valueOf(true)).a(diw.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            dtc $$15 = dga.cO.o().a(dke.b, ji.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            dtc $$18 = dga.dU.o().a(diw.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            dtc $$19 = dga.dU.o().a(diw.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            dtc $$20 = $$13.a(diw.d, Boolean.valueOf(true)).a(diw.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.a(diw.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.a(diw.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.a(diw.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.a(diw.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            dtc $$21 = dga.cp.o();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, erl.w);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, erl.w);
         }
      }
   }

   static class f {
      public final Class<? extends emh.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends emh.p> $$0, int $$1, int $$2) {
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

   public static class g extends emh.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, ejh $$1, ji $$2) {
         super(ekg.y, $$0, $$1);
         this.a($$2);
      }

      public g(ub $$0) {
         super(ekg.y, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(ekf $$0, ub $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(ejt $$0, eju $$1, ayw $$2) {
         if ($$0 != null) {
            ((emh.m)$$0).b = this;
         }
      }

      public static emh.g a(eju $$0, int $$1, int $$2, int $$3, ji $$4, int $$5) {
         ejh $$6 = ejh.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new emh.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejh $$4, dcd $$5, jd $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, emh.k);
         this.a($$0, $$3, $$4, emh.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, emh.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, emh.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, emh.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, emh.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, emh.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, emh.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, dga.H.o(), dga.H.o(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, dga.H.o(), dga.H.o(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, emh.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, dga.H.o(), dga.H.o(), false);
         dtc $$8 = dga.eW.o().a(djz.a, Boolean.valueOf(true)).a(djz.c, Boolean.valueOf(true));
         dtc $$9 = dga.eW.o().a(djz.d, Boolean.valueOf(true)).a(djz.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         dtc $$12 = dga.fj.o().a(dnt.b, ji.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, emh.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, emh.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, emh.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         dtc $$14 = dga.fy.o().a(din.b, ji.c);
         dtc $$15 = dga.fy.o().a(din.b, ji.d);
         dtc $$16 = dga.fy.o().a(din.b, ji.f);
         dtc $$17 = dga.fy.o().a(din.b, ji.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.a(din.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.a(din.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.a(din.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.a(din.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.a(din.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.a(din.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.a(din.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.a(din.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.a(din.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.a(din.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.a(din.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.a(din.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            dtc $$21 = dga.fx.o();
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
               $$0.a($$22, dga.ct.o(), 2);
               if ($$0.c_($$22) instanceof drw $$24) {
                  $$24.a(bsx.aM, $$3);
               }
            }
         }
      }
   }

   public static class h extends emh.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, ayw $$1, ejh $$2, ji $$3) {
         super(ekg.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(ub $$0) {
         super(ekg.z, $$0);
      }

      @Override
      public void a(ejt $$0, eju $$1, ayw $$2) {
         this.a((emh.m)$$0, $$1, $$2, 1, 1);
      }

      public static emh.h a(eju $$0, ayw $$1, int $$2, int $$3, int $$4, ji $$5, int $$6) {
         ejh $$7 = ejh.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new emh.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejh $$4, dcd $$5, jd $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, emh.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, emh.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, emh.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, emh.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, emh.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, dga.eW.o().a(djz.a, Boolean.valueOf(true)).a(djz.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, dga.eW.o().a(djz.a, Boolean.valueOf(true)).a(djz.c, Boolean.valueOf(true)).a(djz.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, dga.eW.o().a(djz.a, Boolean.valueOf(true)).a(djz.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, dga.eW.o().a(djz.d, Boolean.valueOf(true)).a(djz.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, dga.eW.o().a(djz.d, Boolean.valueOf(true)).a(djz.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, dga.eW.o().a(djz.d, Boolean.valueOf(true)).a(djz.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, dga.eW.o().a(djz.a, Boolean.valueOf(true)).a(djz.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, dga.eW.o().a(djz.a, Boolean.valueOf(true)).a(djz.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         dtc $$8 = dga.dy.o().a(die.b, ji.e);
         dtc $$9 = dga.dy.o().a(die.b, ji.e).a(die.f, dty.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends emh.q {
      public i(int $$0, ayw $$1, ejh $$2, ji $$3) {
         super(ekg.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(ub $$0) {
         super(ekg.A, $$0);
      }

      @Override
      public void a(ejt $$0, eju $$1, ayw $$2) {
         ji $$3 = this.i();
         if ($$3 != ji.c && $$3 != ji.f) {
            this.b((emh.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((emh.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static emh.i a(eju $$0, ayw $$1, int $$2, int $$3, int $$4, ji $$5, int $$6) {
         ejh $$7 = ejh.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new emh.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejh $$4, dcd $$5, jd $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, emh.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         ji $$7 = this.i();
         if ($$7 != ji.c && $$7 != ji.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends emh.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, ayw $$1, ejh $$2, ji $$3) {
         super(ekg.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(ub $$0) {
         super(ekg.B, $$0);
         this.d = $$0.h("Type");
      }

      @Override
      protected void a(ekf $$0, ub $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(ejt $$0, eju $$1, ayw $$2) {
         this.a((emh.m)$$0, $$1, $$2, 4, 1);
         this.b((emh.m)$$0, $$1, $$2, 1, 4);
         this.c((emh.m)$$0, $$1, $$2, 1, 4);
      }

      public static emh.j a(eju $$0, ayw $$1, int $$2, int $$3, int $$4, ji $$5, int $$6) {
         ejh $$7 = ejh.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new emh.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejh $$4, dcd $$5, jd $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, emh.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, dga.eH.o(), 5, 1, 5, $$4);
               this.a($$0, dga.eH.o(), 5, 2, 5, $$4);
               this.a($$0, dga.eH.o(), 5, 3, 5, $$4);
               this.a($$0, dga.cq.o().a(dpb.g, ji.e), 4, 3, 5, $$4);
               this.a($$0, dga.cq.o().a(dpb.g, ji.f), 6, 3, 5, $$4);
               this.a($$0, dga.cq.o().a(dpb.g, ji.d), 5, 3, 4, $$4);
               this.a($$0, dga.cq.o().a(dpb.g, ji.c), 5, 3, 6, $$4);
               this.a($$0, dga.jE.o(), 4, 1, 4, $$4);
               this.a($$0, dga.jE.o(), 4, 1, 5, $$4);
               this.a($$0, dga.jE.o(), 4, 1, 6, $$4);
               this.a($$0, dga.jE.o(), 6, 1, 4, $$4);
               this.a($$0, dga.jE.o(), 6, 1, 5, $$4);
               this.a($$0, dga.jE.o(), 6, 1, 6, $$4);
               this.a($$0, dga.jE.o(), 5, 1, 4, $$4);
               this.a($$0, dga.jE.o(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, dga.eH.o(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, dga.eH.o(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, dga.eH.o(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, dga.eH.o(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, dga.eH.o(), 5, 1, 5, $$4);
               this.a($$0, dga.eH.o(), 5, 2, 5, $$4);
               this.a($$0, dga.eH.o(), 5, 3, 5, $$4);
               this.a($$0, dga.G.o(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, dga.m.o(), 1, 3, $$8, $$4);
                  this.a($$0, dga.m.o(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, dga.m.o(), $$9, 3, 1, $$4);
                  this.a($$0, dga.m.o(), $$9, 3, 9, $$4);
               }

               this.a($$0, dga.m.o(), 5, 1, 4, $$4);
               this.a($$0, dga.m.o(), 5, 1, 6, $$4);
               this.a($$0, dga.m.o(), 5, 3, 4, $$4);
               this.a($$0, dga.m.o(), 5, 3, 6, $$4);
               this.a($$0, dga.m.o(), 4, 1, 5, $$4);
               this.a($$0, dga.m.o(), 6, 1, 5, $$4);
               this.a($$0, dga.m.o(), 4, 3, 5, $$4);
               this.a($$0, dga.m.o(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, dga.m.o(), 4, $$10, 4, $$4);
                  this.a($$0, dga.m.o(), 6, $$10, 4, $$4);
                  this.a($$0, dga.m.o(), 4, $$10, 6, $$4);
                  this.a($$0, dga.m.o(), 6, $$10, 6, $$4);
               }

               this.a($$0, dga.cq.o(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, dga.n.o(), 2, 3, $$11, $$4);
                  this.a($$0, dga.n.o(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, dga.n.o(), 4, 3, $$11, $$4);
                     this.a($$0, dga.n.o(), 5, 3, $$11, $$4);
                     this.a($$0, dga.n.o(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, dga.n.o(), 7, 3, $$11, $$4);
                  this.a($$0, dga.n.o(), 8, 3, $$11, $$4);
               }

               dtc $$12 = dga.cO.o().a(dke.b, ji.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, erl.x);
         }
      }
   }

   static class k extends ejt.a {
      @Override
      public void a(ayw $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = dga.eJ.o();
            } else if ($$5 < 0.5F) {
               this.a = dga.eI.o();
            } else if ($$5 < 0.55F) {
               this.a = dga.eP.o();
            } else {
               this.a = dga.eH.o();
            }
         } else {
            this.a = dga.nc.o();
         }
      }
   }

   public static class l extends emh.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(ekg $$0, int $$1, int $$2, int $$3, ji $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = emh.p.a.a;
      }

      public l(int $$0, ayw $$1, ejh $$2, ji $$3) {
         super(ekg.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(ekg $$0, ub $$1) {
         super($$0, $$1);
         this.d = $$1.q("Source");
      }

      public l(ub $$0) {
         this(ekg.C, $$0);
      }

      @Override
      protected void a(ekf $$0, ub $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(ejt $$0, eju $$1, ayw $$2) {
         if (this.d) {
            emh.i = emh.c.class;
         }

         this.a((emh.m)$$0, $$1, $$2, 1, 1);
      }

      public static emh.l a(eju $$0, ayw $$1, int $$2, int $$3, int $$4, ji $$5, int $$6) {
         ejh $$7 = ejh.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new emh.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejh $$4, dcd $$5, jd $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, emh.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, emh.p.a.a, 1, 1, 4);
         this.a($$0, dga.eH.o(), 2, 6, 1, $$4);
         this.a($$0, dga.eH.o(), 1, 5, 1, $$4);
         this.a($$0, dga.jE.o(), 1, 6, 1, $$4);
         this.a($$0, dga.eH.o(), 1, 5, 2, $$4);
         this.a($$0, dga.eH.o(), 1, 4, 3, $$4);
         this.a($$0, dga.jE.o(), 1, 5, 3, $$4);
         this.a($$0, dga.eH.o(), 2, 4, 3, $$4);
         this.a($$0, dga.eH.o(), 3, 3, 3, $$4);
         this.a($$0, dga.jE.o(), 3, 4, 3, $$4);
         this.a($$0, dga.eH.o(), 3, 3, 2, $$4);
         this.a($$0, dga.eH.o(), 3, 2, 1, $$4);
         this.a($$0, dga.jE.o(), 3, 3, 1, $$4);
         this.a($$0, dga.eH.o(), 2, 2, 1, $$4);
         this.a($$0, dga.eH.o(), 1, 1, 1, $$4);
         this.a($$0, dga.jE.o(), 1, 2, 1, $$4);
         this.a($$0, dga.eH.o(), 1, 1, 2, $$4);
         this.a($$0, dga.jE.o(), 1, 1, 3, $$4);
      }
   }

   public static class m extends emh.l {
      public emh.f a;
      @Nullable
      public emh.g b;
      public final List<ejt> c = Lists.newArrayList();

      public m(ayw $$0, int $$1, int $$2) {
         super(ekg.D, 0, $$1, $$2, a($$0));
      }

      public m(ub $$0) {
         super(ekg.D, $$0);
      }

      @Override
      public jd h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends emh.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, ayw $$1, ejh $$2, ji $$3) {
         super(ekg.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(ub $$0) {
         super(ekg.E, $$0);
         this.d = $$0.q("Left");
         this.i = $$0.q("Right");
      }

      @Override
      protected void a(ekf $$0, ub $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(ejt $$0, eju $$1, ayw $$2) {
         this.a((emh.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((emh.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((emh.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static emh.n a(eju $$0, ayw $$1, int $$2, int $$3, int $$4, ji $$5, int $$6) {
         ejh $$7 = ejh.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new emh.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejh $$4, dcd $$5, jd $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, emh.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, emh.p.a.a, 1, 1, 6);
         dtc $$7 = dga.cq.o().a(dpb.g, ji.f);
         dtc $$8 = dga.cq.o().a(dpb.g, ji.e);
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

   public static class o extends emh.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, ayw $$1, ejh $$2, ji $$3) {
         super(ekg.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(ub $$0) {
         super(ekg.F, $$0);
      }

      @Override
      public void a(ejt $$0, eju $$1, ayw $$2) {
         this.a((emh.m)$$0, $$1, $$2, 1, 1);
      }

      public static emh.o a(eju $$0, ayw $$1, int $$2, int $$3, int $$4, ji $$5, int $$6) {
         ejh $$7 = ejh.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new emh.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejh $$4, dcd $$5, jd $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, emh.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, emh.p.a.a, 1, 1, 7);
         dtc $$7 = dga.cQ.o().a(dnt.b, ji.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, dga.eH.o(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dga.eH.o(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dga.eH.o(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends ejt {
      protected emh.p.a h = emh.p.a.a;

      protected p(ekg $$0, int $$1, ejh $$2) {
         super($$0, $$1, $$2);
      }

      public p(ekg $$0, ub $$1) {
         super($$0, $$1);
         this.h = emh.p.a.valueOf($$1.l("EntryDoor"));
      }

      @Override
      protected void a(ekf $$0, ub $$1) {
         $$1.a("EntryDoor", this.h.name());
      }

      protected void a(dds $$0, ayw $$1, ejh $$2, emh.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, dga.eH.o(), $$4, $$5, $$6, $$2);
               this.a($$0, dga.eH.o(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dga.eH.o(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dga.eH.o(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dga.eH.o(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dga.eH.o(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dga.eH.o(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dga.cN.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dga.cN.o().a(die.f, dty.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, dga.nc.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dga.nc.o(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dga.eW.o().a(djz.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, dga.eW.o().a(djz.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dga.eW.o().a(djz.b, Boolean.valueOf(true)).a(djz.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dga.eW.o().a(djz.b, Boolean.valueOf(true)).a(djz.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dga.eW.o().a(djz.b, Boolean.valueOf(true)).a(djz.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dga.eW.o().a(djz.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dga.eW.o().a(djz.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, dga.eH.o(), $$4, $$5, $$6, $$2);
               this.a($$0, dga.eH.o(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dga.eH.o(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dga.eH.o(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dga.eH.o(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dga.eH.o(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dga.eH.o(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dga.dy.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dga.dy.o().a(die.f, dty.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dga.dM.o().a(dgi.aE, ji.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, dga.dM.o().a(dgi.aE, ji.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected emh.p.a b(ayw $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return emh.p.a.a;
            case 2:
               return emh.p.a.b;
            case 3:
               return emh.p.a.c;
            case 4:
               return emh.p.a.d;
         }
      }

      @Nullable
      protected ejt a(emh.m $$0, eju $$1, ayw $$2, int $$3, int $$4) {
         ji $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return emh.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$5, this.g());
               case d:
                  return emh.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$5, this.g());
               case e:
                  return emh.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
               case f:
                  return emh.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected ejt b(emh.m $$0, eju $$1, ayw $$2, int $$3, int $$4) {
         ji $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return emh.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, ji.e, this.g());
               case d:
                  return emh.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, ji.e, this.g());
               case e:
                  return emh.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, ji.c, this.g());
               case f:
                  return emh.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, ji.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected ejt c(emh.m $$0, eju $$1, ayw $$2, int $$3, int $$4) {
         ji $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return emh.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, ji.f, this.g());
               case d:
                  return emh.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, ji.f, this.g());
               case e:
                  return emh.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, ji.d, this.g());
               case f:
                  return emh.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, ji.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(ejh $$0) {
         return $$0 != null && $$0.i() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;
      }
   }

   public abstract static class q extends emh.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(ekg $$0, int $$1, ejh $$2) {
         super($$0, $$1, $$2);
      }

      public q(ekg $$0, ub $$1) {
         super($$0, $$1);
      }
   }
}
