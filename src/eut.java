import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class eut {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final eut.f[] g = new eut.f[]{
      new eut.f(eut.n.class, 40, 0),
      new eut.f(eut.h.class, 5, 5),
      new eut.f(eut.d.class, 20, 0),
      new eut.f(eut.i.class, 20, 0),
      new eut.f(eut.j.class, 10, 6),
      new eut.f(eut.o.class, 5, 5),
      new eut.f(eut.l.class, 5, 5),
      new eut.f(eut.c.class, 5, 4),
      new eut.f(eut.a.class, 5, 4),
      new eut.f(eut.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new eut.f(eut.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<eut.f> h;
   static Class<? extends eut.p> i;
   private static int j;
   static final eut.k k = new eut.k();

   public static void a() {
      h = Lists.newArrayList();

      for (eut.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (eut.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static eut.p a(Class<? extends eut.p> $$0, esg $$1, azx $$2, int $$3, int $$4, int $$5, @Nullable jb $$6, int $$7) {
      eut.p $$8 = null;
      if ($$0 == eut.n.class) {
         $$8 = eut.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eut.h.class) {
         $$8 = eut.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eut.d.class) {
         $$8 = eut.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eut.i.class) {
         $$8 = eut.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eut.j.class) {
         $$8 = eut.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eut.o.class) {
         $$8 = eut.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eut.l.class) {
         $$8 = eut.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eut.c.class) {
         $$8 = eut.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eut.a.class) {
         $$8 = eut.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eut.e.class) {
         $$8 = eut.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eut.g.class) {
         $$8 = eut.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static eut.p a(eut.m $$0, esg $$1, azx $$2, int $$3, int $$4, int $$5, jb $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            eut.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (eut.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  eut.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         ert $$13 = eut.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.i() > 1 ? new eut.b($$7, $$13, $$6) : null;
      }
   }

   static esf b(eut.m $$0, esg $$1, azx $$2, int $$3, int $$4, int $$5, @Nullable jb $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
         esf $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends eut.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, azx $$1, ert $$2, jb $$3) {
         super(ess.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(tz $$0) {
         super(ess.t, $$0);
         this.d = $$0.b("Chest", false);
      }

      @Override
      protected void a(esr $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(esf $$0, esg $$1, azx $$2) {
         this.a((eut.m)$$0, $$1, $$2, 1, 1);
      }

      public static eut.a a(esg $$0, azx $$1, int $$2, int $$3, int $$4, jb $$5, int $$6) {
         ert $$7 = ert.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new eut.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dkw $$0, dkt $$1, edc $$2, azx $$3, ert $$4, djc $$5, iv $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, eut.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, eut.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, dne.eZ.m(), dne.eZ.m(), false);
         this.a($$0, dne.kn.m(), 3, 1, 1, $$4);
         this.a($$0, dne.kn.m(), 3, 1, 5, $$4);
         this.a($$0, dne.kn.m(), 3, 2, 2, $$4);
         this.a($$0, dne.kn.m(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, dne.kn.m(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, fad.x);
         }
      }
   }

   public static class b extends eut.p {
      private final int a;

      public b(int $$0, ert $$1, jb $$2) {
         super(ess.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != jb.c && $$2 != jb.d ? $$1.d() : $$1.f();
      }

      public b(tz $$0) {
         super(ess.u, $$0);
         this.a = $$0.b("Steps", 0);
      }

      @Override
      protected void a(esr $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static ert a(esg $$0, azx $$1, int $$2, int $$3, int $$4, jb $$5) {
         int $$6 = 3;
         ert $$7 = ert.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         esf $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().i() == $$7.i()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = ert.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return ert.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(dkw $$0, dkt $$1, edc $$2, azx $$3, ert $$4, djc $$5, iv $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, dne.eZ.m(), 0, 0, $$7, $$4);
            this.a($$0, dne.eZ.m(), 1, 0, $$7, $$4);
            this.a($$0, dne.eZ.m(), 2, 0, $$7, $$4);
            this.a($$0, dne.eZ.m(), 3, 0, $$7, $$4);
            this.a($$0, dne.eZ.m(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, dne.eZ.m(), 0, $$8, $$7, $$4);
               this.a($$0, dne.nI.m(), 1, $$8, $$7, $$4);
               this.a($$0, dne.nI.m(), 2, $$8, $$7, $$4);
               this.a($$0, dne.nI.m(), 3, $$8, $$7, $$4);
               this.a($$0, dne.eZ.m(), 4, $$8, $$7, $$4);
            }

            this.a($$0, dne.eZ.m(), 0, 4, $$7, $$4);
            this.a($$0, dne.eZ.m(), 1, 4, $$7, $$4);
            this.a($$0, dne.eZ.m(), 2, 4, $$7, $$4);
            this.a($$0, dne.eZ.m(), 3, 4, $$7, $$4);
            this.a($$0, dne.eZ.m(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends eut.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, azx $$1, ert $$2, jb $$3) {
         super(ess.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(tz $$0) {
         super(ess.v, $$0);
         this.d = $$0.b("leftLow", false);
         this.i = $$0.b("leftHigh", false);
         this.j = $$0.b("rightLow", false);
         this.k = $$0.b("rightHigh", false);
      }

      @Override
      protected void a(esr $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(esf $$0, esg $$1, azx $$2) {
         int $$3 = 3;
         int $$4 = 5;
         jb $$5 = this.i();
         if ($$5 == jb.e || $$5 == jb.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((eut.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((eut.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((eut.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((eut.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((eut.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static eut.c a(esg $$0, azx $$1, int $$2, int $$3, int $$4, jb $$5, int $$6) {
         ert $$7 = ert.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eut.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dkw $$0, dkt $$1, edc $$2, azx $$3, ert $$4, djc $$5, iv $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, eut.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, eut.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, eut.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, eut.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, eut.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, eut.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, dne.kh.m(), dne.kh.m(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, dne.kh.m(), dne.kh.m(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, eut.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, dne.kh.m(), dne.kh.m(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, dne.kh.m(), dne.kh.m(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, dne.kh.m(), dne.kh.m(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, dne.kh.m(), dne.kh.m(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, dne.kh.m().b(dup.b, ecm.c), dne.kh.m().b(dup.b, ecm.c), false);
         this.a($$0, dne.cA.m().b(dwv.e, jb.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends eut.q {
      public d(int $$0, azx $$1, ert $$2, jb $$3) {
         super(ess.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(tz $$0) {
         super(ess.w, $$0);
      }

      @Override
      public void a(esf $$0, esg $$1, azx $$2) {
         jb $$3 = this.i();
         if ($$3 != jb.c && $$3 != jb.f) {
            this.c((eut.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((eut.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static eut.d a(esg $$0, azx $$1, int $$2, int $$3, int $$4, jb $$5, int $$6) {
         ert $$7 = ert.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eut.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dkw $$0, dkt $$1, edc $$2, azx $$3, ert $$4, djc $$5, iv $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, eut.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         jb $$7 = this.i();
         if ($$7 != jb.c && $$7 != jb.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends eut.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, azx $$1, ert $$2, jb $$3) {
         super(ess.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.e() > 6;
      }

      public e(tz $$0) {
         super(ess.x, $$0);
         this.i = $$0.b("Tall", false);
      }

      @Override
      protected void a(esr $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static eut.e a(esg $$0, azx $$1, int $$2, int $$3, int $$4, jb $$5, int $$6) {
         ert $$7 = ert.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = ert.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new eut.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(dkw $$0, dkt $$1, edc $$2, azx $$3, ert $$4, djc $$5, iv $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, eut.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, dne.bz.m(), dne.bz.m(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dne.n.m(), dne.n.m(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dne.n.m(), dne.n.m(), false);
               this.a($$0, dne.cA.m().b(dwv.e, jb.f), 2, 3, $$10, $$4);
               this.a($$0, dne.cA.m().b(dwv.e, jb.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dne.n.m(), dne.n.m(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dne.n.m(), dne.n.m(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dne.cv.m(), dne.cv.m(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dne.cv.m(), dne.cv.m(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dne.cv.m(), dne.cv.m(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dne.cv.m(), dne.cv.m(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, dne.cv.m(), dne.cv.m(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, dne.cv.m(), dne.cv.m(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, dne.cv.m(), dne.cv.m(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, dne.n.m(), dne.n.m(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, dne.n.m(), dne.n.m(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, dne.n.m(), dne.n.m(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, dne.n.m(), dne.n.m(), false);
            this.a($$0, dne.n.m(), 9, 5, 11, $$4);
            this.a($$0, dne.n.m(), 8, 5, 11, $$4);
            this.a($$0, dne.n.m(), 9, 5, 10, $$4);
            ebe $$12 = dne.el.m().b(dqc.d, Boolean.valueOf(true)).b(dqc.b, Boolean.valueOf(true));
            ebe $$13 = dne.el.m().b(dqc.a, Boolean.valueOf(true)).b(dqc.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, dne.el.m().b(dqc.a, Boolean.valueOf(true)).b(dqc.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, dne.el.m().b(dqc.c, Boolean.valueOf(true)).b(dqc.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, dne.el.m().b(dqc.a, Boolean.valueOf(true)).b(dqc.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, dne.el.m().b(dqc.c, Boolean.valueOf(true)).b(dqc.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, dne.el.m().b(dqc.a, Boolean.valueOf(true)).b(dqc.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            ebe $$15 = dne.da.m().b(drn.b, jb.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            ebe $$18 = dne.el.m().b(dqc.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            ebe $$19 = dne.el.m().b(dqc.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            ebe $$20 = $$13.b(dqc.d, Boolean.valueOf(true)).b(dqc.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.b(dqc.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.b(dqc.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.b(dqc.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.b(dqc.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            ebe $$21 = dne.cz.m();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, fad.v);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, fad.v);
         }
      }
   }

   static class f {
      public final Class<? extends eut.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends eut.p> $$0, int $$1, int $$2) {
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

   public static class g extends eut.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, ert $$1, jb $$2) {
         super(ess.y, $$0, $$1);
         this.a($$2);
      }

      public g(tz $$0) {
         super(ess.y, $$0);
         this.d = $$0.b("Mob", false);
      }

      @Override
      protected void a(esr $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(esf $$0, esg $$1, azx $$2) {
         if ($$0 != null) {
            ((eut.m)$$0).b = this;
         }
      }

      public static eut.g a(esg $$0, int $$1, int $$2, int $$3, jb $$4, int $$5) {
         ert $$6 = ert.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new eut.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dkw $$0, dkt $$1, edc $$2, azx $$3, ert $$4, djc $$5, iv $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, eut.k);
         this.a($$0, $$3, $$4, eut.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, eut.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, eut.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, eut.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, eut.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, eut.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, eut.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, dne.K.m(), dne.K.m(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, dne.K.m(), dne.K.m(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, eut.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, dne.K.m(), dne.K.m(), false);
         ebe $$8 = dne.fo.m().b(dri.a, Boolean.valueOf(true)).b(dri.c, Boolean.valueOf(true));
         ebe $$9 = dne.fo.m().b(dri.d, Boolean.valueOf(true)).b(dri.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         ebe $$12 = dne.fC.m().b(dvg.b, jb.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, eut.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, eut.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, eut.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         ebe $$14 = dne.fX.m().b(dpt.b, jb.c);
         ebe $$15 = dne.fX.m().b(dpt.b, jb.d);
         ebe $$16 = dne.fX.m().b(dpt.b, jb.f);
         ebe $$17 = dne.fX.m().b(dpt.b, jb.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.b(dpt.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.b(dpt.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.b(dpt.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.b(dpt.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.b(dpt.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.b(dpt.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.b(dpt.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.b(dpt.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.b(dpt.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.b(dpt.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.b(dpt.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.b(dpt.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            ebe $$21 = dne.fW.m();
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
            iv $$22 = this.b(5, 3, 6);
            if ($$4.b($$22)) {
               this.d = true;
               $$0.a($$22, dne.cD.m(), 2);
               if ($$0.c_($$22) instanceof dzu $$24) {
                  $$24.a(bxc.bf, $$3);
               }
            }
         }
      }
   }

   public static class h extends eut.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, azx $$1, ert $$2, jb $$3) {
         super(ess.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(tz $$0) {
         super(ess.z, $$0);
      }

      @Override
      public void a(esf $$0, esg $$1, azx $$2) {
         this.a((eut.m)$$0, $$1, $$2, 1, 1);
      }

      public static eut.h a(esg $$0, azx $$1, int $$2, int $$3, int $$4, jb $$5, int $$6) {
         ert $$7 = ert.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eut.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dkw $$0, dkt $$1, edc $$2, azx $$3, ert $$4, djc $$5, iv $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, eut.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, eut.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, eut.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, eut.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, eut.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, dne.fo.m().b(dri.a, Boolean.valueOf(true)).b(dri.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, dne.fo.m().b(dri.a, Boolean.valueOf(true)).b(dri.c, Boolean.valueOf(true)).b(dri.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, dne.fo.m().b(dri.a, Boolean.valueOf(true)).b(dri.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, dne.fo.m().b(dri.d, Boolean.valueOf(true)).b(dri.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, dne.fo.m().b(dri.d, Boolean.valueOf(true)).b(dri.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, dne.fo.m().b(dri.d, Boolean.valueOf(true)).b(dri.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, dne.fo.m().b(dri.a, Boolean.valueOf(true)).b(dri.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, dne.fo.m().b(dri.a, Boolean.valueOf(true)).b(dri.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         ebe $$8 = dne.dN.m().b(dpj.b, jb.e);
         ebe $$9 = dne.dN.m().b(dpj.b, jb.e).b(dpj.c, eca.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends eut.q {
      public i(int $$0, azx $$1, ert $$2, jb $$3) {
         super(ess.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(tz $$0) {
         super(ess.A, $$0);
      }

      @Override
      public void a(esf $$0, esg $$1, azx $$2) {
         jb $$3 = this.i();
         if ($$3 != jb.c && $$3 != jb.f) {
            this.b((eut.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((eut.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static eut.i a(esg $$0, azx $$1, int $$2, int $$3, int $$4, jb $$5, int $$6) {
         ert $$7 = ert.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eut.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dkw $$0, dkt $$1, edc $$2, azx $$3, ert $$4, djc $$5, iv $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, eut.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         jb $$7 = this.i();
         if ($$7 != jb.c && $$7 != jb.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends eut.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, azx $$1, ert $$2, jb $$3) {
         super(ess.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(tz $$0) {
         super(ess.B, $$0);
         this.d = $$0.b("Type", 0);
      }

      @Override
      protected void a(esr $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(esf $$0, esg $$1, azx $$2) {
         this.a((eut.m)$$0, $$1, $$2, 4, 1);
         this.b((eut.m)$$0, $$1, $$2, 1, 4);
         this.c((eut.m)$$0, $$1, $$2, 1, 4);
      }

      public static eut.j a(esg $$0, azx $$1, int $$2, int $$3, int $$4, jb $$5, int $$6) {
         ert $$7 = ert.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eut.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dkw $$0, dkt $$1, edc $$2, azx $$3, ert $$4, djc $$5, iv $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, eut.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, dne.eZ.m(), 5, 1, 5, $$4);
               this.a($$0, dne.eZ.m(), 5, 2, 5, $$4);
               this.a($$0, dne.eZ.m(), 5, 3, 5, $$4);
               this.a($$0, dne.cA.m().b(dwv.e, jb.e), 4, 3, 5, $$4);
               this.a($$0, dne.cA.m().b(dwv.e, jb.f), 6, 3, 5, $$4);
               this.a($$0, dne.cA.m().b(dwv.e, jb.d), 5, 3, 4, $$4);
               this.a($$0, dne.cA.m().b(dwv.e, jb.c), 5, 3, 6, $$4);
               this.a($$0, dne.kh.m(), 4, 1, 4, $$4);
               this.a($$0, dne.kh.m(), 4, 1, 5, $$4);
               this.a($$0, dne.kh.m(), 4, 1, 6, $$4);
               this.a($$0, dne.kh.m(), 6, 1, 4, $$4);
               this.a($$0, dne.kh.m(), 6, 1, 5, $$4);
               this.a($$0, dne.kh.m(), 6, 1, 6, $$4);
               this.a($$0, dne.kh.m(), 5, 1, 4, $$4);
               this.a($$0, dne.kh.m(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, dne.eZ.m(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, dne.eZ.m(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, dne.eZ.m(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, dne.eZ.m(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, dne.eZ.m(), 5, 1, 5, $$4);
               this.a($$0, dne.eZ.m(), 5, 2, 5, $$4);
               this.a($$0, dne.eZ.m(), 5, 3, 5, $$4);
               this.a($$0, dne.J.m(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, dne.m.m(), 1, 3, $$8, $$4);
                  this.a($$0, dne.m.m(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, dne.m.m(), $$9, 3, 1, $$4);
                  this.a($$0, dne.m.m(), $$9, 3, 9, $$4);
               }

               this.a($$0, dne.m.m(), 5, 1, 4, $$4);
               this.a($$0, dne.m.m(), 5, 1, 6, $$4);
               this.a($$0, dne.m.m(), 5, 3, 4, $$4);
               this.a($$0, dne.m.m(), 5, 3, 6, $$4);
               this.a($$0, dne.m.m(), 4, 1, 5, $$4);
               this.a($$0, dne.m.m(), 6, 1, 5, $$4);
               this.a($$0, dne.m.m(), 4, 3, 5, $$4);
               this.a($$0, dne.m.m(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, dne.m.m(), 4, $$10, 4, $$4);
                  this.a($$0, dne.m.m(), 6, $$10, 4, $$4);
                  this.a($$0, dne.m.m(), 4, $$10, 6, $$4);
                  this.a($$0, dne.m.m(), 6, $$10, 6, $$4);
               }

               this.a($$0, dne.cA.m(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, dne.n.m(), 2, 3, $$11, $$4);
                  this.a($$0, dne.n.m(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, dne.n.m(), 4, 3, $$11, $$4);
                     this.a($$0, dne.n.m(), 5, 3, $$11, $$4);
                     this.a($$0, dne.n.m(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, dne.n.m(), 7, 3, $$11, $$4);
                  this.a($$0, dne.n.m(), 8, 3, $$11, $$4);
               }

               ebe $$12 = dne.da.m().b(drn.b, jb.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, fad.w);
         }
      }
   }

   static class k extends esf.a {
      @Override
      public void a(azx $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = dne.fb.m();
            } else if ($$5 < 0.5F) {
               this.a = dne.fa.m();
            } else if ($$5 < 0.55F) {
               this.a = dne.fh.m();
            } else {
               this.a = dne.eZ.m();
            }
         } else {
            this.a = dne.nI.m();
         }
      }
   }

   public static class l extends eut.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(ess $$0, int $$1, int $$2, int $$3, jb $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = eut.p.a.a;
      }

      public l(int $$0, azx $$1, ert $$2, jb $$3) {
         super(ess.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(ess $$0, tz $$1) {
         super($$0, $$1);
         this.d = $$1.b("Source", false);
      }

      public l(tz $$0) {
         this(ess.C, $$0);
      }

      @Override
      protected void a(esr $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(esf $$0, esg $$1, azx $$2) {
         if (this.d) {
            eut.i = eut.c.class;
         }

         this.a((eut.m)$$0, $$1, $$2, 1, 1);
      }

      public static eut.l a(esg $$0, azx $$1, int $$2, int $$3, int $$4, jb $$5, int $$6) {
         ert $$7 = ert.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eut.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dkw $$0, dkt $$1, edc $$2, azx $$3, ert $$4, djc $$5, iv $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, eut.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, eut.p.a.a, 1, 1, 4);
         this.a($$0, dne.eZ.m(), 2, 6, 1, $$4);
         this.a($$0, dne.eZ.m(), 1, 5, 1, $$4);
         this.a($$0, dne.kh.m(), 1, 6, 1, $$4);
         this.a($$0, dne.eZ.m(), 1, 5, 2, $$4);
         this.a($$0, dne.eZ.m(), 1, 4, 3, $$4);
         this.a($$0, dne.kh.m(), 1, 5, 3, $$4);
         this.a($$0, dne.eZ.m(), 2, 4, 3, $$4);
         this.a($$0, dne.eZ.m(), 3, 3, 3, $$4);
         this.a($$0, dne.kh.m(), 3, 4, 3, $$4);
         this.a($$0, dne.eZ.m(), 3, 3, 2, $$4);
         this.a($$0, dne.eZ.m(), 3, 2, 1, $$4);
         this.a($$0, dne.kh.m(), 3, 3, 1, $$4);
         this.a($$0, dne.eZ.m(), 2, 2, 1, $$4);
         this.a($$0, dne.eZ.m(), 1, 1, 1, $$4);
         this.a($$0, dne.kh.m(), 1, 2, 1, $$4);
         this.a($$0, dne.eZ.m(), 1, 1, 2, $$4);
         this.a($$0, dne.kh.m(), 1, 1, 3, $$4);
      }
   }

   public static class m extends eut.l {
      public eut.f a;
      @Nullable
      public eut.g b;
      public final List<esf> c = Lists.newArrayList();

      public m(azx $$0, int $$1, int $$2) {
         super(ess.D, 0, $$1, $$2, a($$0));
      }

      public m(tz $$0) {
         super(ess.D, $$0);
      }

      @Override
      public iv h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends eut.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, azx $$1, ert $$2, jb $$3) {
         super(ess.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(tz $$0) {
         super(ess.E, $$0);
         this.d = $$0.b("Left", false);
         this.i = $$0.b("Right", false);
      }

      @Override
      protected void a(esr $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(esf $$0, esg $$1, azx $$2) {
         this.a((eut.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((eut.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((eut.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static eut.n a(esg $$0, azx $$1, int $$2, int $$3, int $$4, jb $$5, int $$6) {
         ert $$7 = ert.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new eut.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dkw $$0, dkt $$1, edc $$2, azx $$3, ert $$4, djc $$5, iv $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, eut.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, eut.p.a.a, 1, 1, 6);
         ebe $$7 = dne.cA.m().b(dwv.e, jb.f);
         ebe $$8 = dne.cA.m().b(dwv.e, jb.e);
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

   public static class o extends eut.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, azx $$1, ert $$2, jb $$3) {
         super(ess.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(tz $$0) {
         super(ess.F, $$0);
      }

      @Override
      public void a(esf $$0, esg $$1, azx $$2) {
         this.a((eut.m)$$0, $$1, $$2, 1, 1);
      }

      public static eut.o a(esg $$0, azx $$1, int $$2, int $$3, int $$4, jb $$5, int $$6) {
         ert $$7 = ert.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new eut.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dkw $$0, dkt $$1, edc $$2, azx $$3, ert $$4, djc $$5, iv $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, eut.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, eut.p.a.a, 1, 1, 7);
         ebe $$7 = dne.dc.m().b(dvg.b, jb.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, dne.eZ.m(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dne.eZ.m(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dne.eZ.m(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends esf {
      protected eut.p.a h = eut.p.a.a;

      protected p(ess $$0, int $$1, ert $$2) {
         super($$0, $$1, $$2);
      }

      public p(ess $$0, tz $$1) {
         super($$0, $$1);
         this.h = $$1.<eut.p.a>a("EntryDoor", eut.p.a.e).orElseThrow();
      }

      @Override
      protected void a(esr $$0, tz $$1) {
         $$1.a("EntryDoor", eut.p.a.e, this.h);
      }

      protected void a(dkw $$0, azx $$1, ert $$2, eut.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, dne.eZ.m(), $$4, $$5, $$6, $$2);
               this.a($$0, dne.eZ.m(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dne.eZ.m(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dne.eZ.m(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dne.eZ.m(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dne.eZ.m(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dne.eZ.m(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dne.cZ.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dne.cZ.m().b(dpj.c, eca.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, dne.nI.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dne.nI.m(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dne.fo.m().b(dri.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, dne.fo.m().b(dri.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dne.fo.m().b(dri.b, Boolean.valueOf(true)).b(dri.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dne.fo.m().b(dri.b, Boolean.valueOf(true)).b(dri.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dne.fo.m().b(dri.b, Boolean.valueOf(true)).b(dri.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dne.fo.m().b(dri.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dne.fo.m().b(dri.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, dne.eZ.m(), $$4, $$5, $$6, $$2);
               this.a($$0, dne.eZ.m(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dne.eZ.m(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dne.eZ.m(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dne.eZ.m(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dne.eZ.m(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dne.eZ.m(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dne.dN.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dne.dN.m().b(dpj.c, eca.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dne.ec.m().b(dnn.e, jb.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, dne.ec.m().b(dnn.e, jb.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected eut.p.a b(azx $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return eut.p.a.a;
            case 2:
               return eut.p.a.b;
            case 3:
               return eut.p.a.c;
            case 4:
               return eut.p.a.d;
         }
      }

      @Nullable
      protected esf a(eut.m $$0, esg $$1, azx $$2, int $$3, int $$4) {
         jb $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eut.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$5, this.g());
               case d:
                  return eut.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$5, this.g());
               case e:
                  return eut.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
               case f:
                  return eut.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected esf b(eut.m $$0, esg $$1, azx $$2, int $$3, int $$4) {
         jb $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eut.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jb.e, this.g());
               case d:
                  return eut.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jb.e, this.g());
               case e:
                  return eut.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jb.c, this.g());
               case f:
                  return eut.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jb.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected esf c(eut.m $$0, esg $$1, azx $$2, int $$3, int $$4) {
         jb $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eut.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jb.f, this.g());
               case d:
                  return eut.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jb.f, this.g());
               case e:
                  return eut.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jb.d, this.g());
               case f:
                  return eut.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jb.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(ert $$0) {
         return $$0 != null && $$0.i() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;

         @Deprecated
         public static final Codec<eut.p.a> e = ayw.c(eut.p.a::valueOf);
      }
   }

   public abstract static class q extends eut.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(ess $$0, int $$1, ert $$2) {
         super($$0, $$1, $$2);
      }

      public q(ess $$0, tz $$1) {
         super($$0, $$1);
      }
   }
}
