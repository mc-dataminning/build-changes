import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class eua {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final eua.f[] g = new eua.f[]{
      new eua.f(eua.n.class, 40, 0),
      new eua.f(eua.h.class, 5, 5),
      new eua.f(eua.d.class, 20, 0),
      new eua.f(eua.i.class, 20, 0),
      new eua.f(eua.j.class, 10, 6),
      new eua.f(eua.o.class, 5, 5),
      new eua.f(eua.l.class, 5, 5),
      new eua.f(eua.c.class, 5, 4),
      new eua.f(eua.a.class, 5, 4),
      new eua.f(eua.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new eua.f(eua.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<eua.f> h;
   static Class<? extends eua.p> i;
   private static int j;
   static final eua.k k = new eua.k();

   public static void a() {
      h = Lists.newArrayList();

      for (eua.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (eua.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static eua.p a(Class<? extends eua.p> $$0, ern $$1, azv $$2, int $$3, int $$4, int $$5, @Nullable jb $$6, int $$7) {
      eua.p $$8 = null;
      if ($$0 == eua.n.class) {
         $$8 = eua.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eua.h.class) {
         $$8 = eua.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eua.d.class) {
         $$8 = eua.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eua.i.class) {
         $$8 = eua.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eua.j.class) {
         $$8 = eua.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eua.o.class) {
         $$8 = eua.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eua.l.class) {
         $$8 = eua.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eua.c.class) {
         $$8 = eua.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eua.a.class) {
         $$8 = eua.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eua.e.class) {
         $$8 = eua.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eua.g.class) {
         $$8 = eua.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static eua.p a(eua.m $$0, ern $$1, azv $$2, int $$3, int $$4, int $$5, jb $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            eua.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (eua.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  eua.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         era $$13 = eua.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.i() > 1 ? new eua.b($$7, $$13, $$6) : null;
      }
   }

   static erm b(eua.m $$0, ern $$1, azv $$2, int $$3, int $$4, int $$5, @Nullable jb $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
         erm $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends eua.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, azv $$1, era $$2, jb $$3) {
         super(erz.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(tz $$0) {
         super(erz.t, $$0);
         this.d = $$0.o("Chest");
      }

      @Override
      protected void a(ery $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(erm $$0, ern $$1, azv $$2) {
         this.a((eua.m)$$0, $$1, $$2, 1, 1);
      }

      public static eua.a a(ern $$0, azv $$1, int $$2, int $$3, int $$4, jb $$5, int $$6) {
         era $$7 = era.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new eua.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dkg $$0, dkd $$1, ecm $$2, azv $$3, era $$4, dio $$5, iv $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, eua.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, eua.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, dmo.eZ.m(), dmo.eZ.m(), false);
         this.a($$0, dmo.kn.m(), 3, 1, 1, $$4);
         this.a($$0, dmo.kn.m(), 3, 1, 5, $$4);
         this.a($$0, dmo.kn.m(), 3, 2, 2, $$4);
         this.a($$0, dmo.kn.m(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, dmo.kn.m(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, ezk.x);
         }
      }
   }

   public static class b extends eua.p {
      private final int a;

      public b(int $$0, era $$1, jb $$2) {
         super(erz.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != jb.c && $$2 != jb.d ? $$1.d() : $$1.f();
      }

      public b(tz $$0) {
         super(erz.u, $$0);
         this.a = $$0.f("Steps");
      }

      @Override
      protected void a(ery $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static era a(ern $$0, azv $$1, int $$2, int $$3, int $$4, jb $$5) {
         int $$6 = 3;
         era $$7 = era.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         erm $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().i() == $$7.i()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = era.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return era.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(dkg $$0, dkd $$1, ecm $$2, azv $$3, era $$4, dio $$5, iv $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, dmo.eZ.m(), 0, 0, $$7, $$4);
            this.a($$0, dmo.eZ.m(), 1, 0, $$7, $$4);
            this.a($$0, dmo.eZ.m(), 2, 0, $$7, $$4);
            this.a($$0, dmo.eZ.m(), 3, 0, $$7, $$4);
            this.a($$0, dmo.eZ.m(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, dmo.eZ.m(), 0, $$8, $$7, $$4);
               this.a($$0, dmo.nI.m(), 1, $$8, $$7, $$4);
               this.a($$0, dmo.nI.m(), 2, $$8, $$7, $$4);
               this.a($$0, dmo.nI.m(), 3, $$8, $$7, $$4);
               this.a($$0, dmo.eZ.m(), 4, $$8, $$7, $$4);
            }

            this.a($$0, dmo.eZ.m(), 0, 4, $$7, $$4);
            this.a($$0, dmo.eZ.m(), 1, 4, $$7, $$4);
            this.a($$0, dmo.eZ.m(), 2, 4, $$7, $$4);
            this.a($$0, dmo.eZ.m(), 3, 4, $$7, $$4);
            this.a($$0, dmo.eZ.m(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends eua.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, azv $$1, era $$2, jb $$3) {
         super(erz.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(tz $$0) {
         super(erz.v, $$0);
         this.d = $$0.o("leftLow");
         this.i = $$0.o("leftHigh");
         this.j = $$0.o("rightLow");
         this.k = $$0.o("rightHigh");
      }

      @Override
      protected void a(ery $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(erm $$0, ern $$1, azv $$2) {
         int $$3 = 3;
         int $$4 = 5;
         jb $$5 = this.i();
         if ($$5 == jb.e || $$5 == jb.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((eua.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((eua.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((eua.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((eua.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((eua.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static eua.c a(ern $$0, azv $$1, int $$2, int $$3, int $$4, jb $$5, int $$6) {
         era $$7 = era.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eua.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dkg $$0, dkd $$1, ecm $$2, azv $$3, era $$4, dio $$5, iv $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, eua.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, eua.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, eua.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, eua.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, eua.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, eua.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, dmo.kh.m(), dmo.kh.m(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, dmo.kh.m(), dmo.kh.m(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, eua.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, dmo.kh.m(), dmo.kh.m(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, dmo.kh.m(), dmo.kh.m(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, dmo.kh.m(), dmo.kh.m(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, dmo.kh.m(), dmo.kh.m(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, dmo.kh.m().b(dtz.b, ebw.c), dmo.kh.m().b(dtz.b, ebw.c), false);
         this.a($$0, dmo.cA.m().b(dwf.e, jb.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends eua.q {
      public d(int $$0, azv $$1, era $$2, jb $$3) {
         super(erz.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(tz $$0) {
         super(erz.w, $$0);
      }

      @Override
      public void a(erm $$0, ern $$1, azv $$2) {
         jb $$3 = this.i();
         if ($$3 != jb.c && $$3 != jb.f) {
            this.c((eua.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((eua.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static eua.d a(ern $$0, azv $$1, int $$2, int $$3, int $$4, jb $$5, int $$6) {
         era $$7 = era.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eua.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dkg $$0, dkd $$1, ecm $$2, azv $$3, era $$4, dio $$5, iv $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, eua.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         jb $$7 = this.i();
         if ($$7 != jb.c && $$7 != jb.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends eua.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, azv $$1, era $$2, jb $$3) {
         super(erz.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.e() > 6;
      }

      public e(tz $$0) {
         super(erz.x, $$0);
         this.i = $$0.o("Tall");
      }

      @Override
      protected void a(ery $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static eua.e a(ern $$0, azv $$1, int $$2, int $$3, int $$4, jb $$5, int $$6) {
         era $$7 = era.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = era.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new eua.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(dkg $$0, dkd $$1, ecm $$2, azv $$3, era $$4, dio $$5, iv $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, eua.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, dmo.bz.m(), dmo.bz.m(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dmo.n.m(), dmo.n.m(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dmo.n.m(), dmo.n.m(), false);
               this.a($$0, dmo.cA.m().b(dwf.e, jb.f), 2, 3, $$10, $$4);
               this.a($$0, dmo.cA.m().b(dwf.e, jb.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dmo.n.m(), dmo.n.m(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dmo.n.m(), dmo.n.m(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dmo.cv.m(), dmo.cv.m(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dmo.cv.m(), dmo.cv.m(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dmo.cv.m(), dmo.cv.m(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dmo.cv.m(), dmo.cv.m(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, dmo.cv.m(), dmo.cv.m(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, dmo.cv.m(), dmo.cv.m(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, dmo.cv.m(), dmo.cv.m(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, dmo.n.m(), dmo.n.m(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, dmo.n.m(), dmo.n.m(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, dmo.n.m(), dmo.n.m(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, dmo.n.m(), dmo.n.m(), false);
            this.a($$0, dmo.n.m(), 9, 5, 11, $$4);
            this.a($$0, dmo.n.m(), 8, 5, 11, $$4);
            this.a($$0, dmo.n.m(), 9, 5, 10, $$4);
            eao $$12 = dmo.el.m().b(dpm.d, Boolean.valueOf(true)).b(dpm.b, Boolean.valueOf(true));
            eao $$13 = dmo.el.m().b(dpm.a, Boolean.valueOf(true)).b(dpm.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, dmo.el.m().b(dpm.a, Boolean.valueOf(true)).b(dpm.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, dmo.el.m().b(dpm.c, Boolean.valueOf(true)).b(dpm.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, dmo.el.m().b(dpm.a, Boolean.valueOf(true)).b(dpm.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, dmo.el.m().b(dpm.c, Boolean.valueOf(true)).b(dpm.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, dmo.el.m().b(dpm.a, Boolean.valueOf(true)).b(dpm.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            eao $$15 = dmo.da.m().b(dqx.b, jb.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            eao $$18 = dmo.el.m().b(dpm.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            eao $$19 = dmo.el.m().b(dpm.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            eao $$20 = $$13.b(dpm.d, Boolean.valueOf(true)).b(dpm.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.b(dpm.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.b(dpm.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.b(dpm.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.b(dpm.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            eao $$21 = dmo.cz.m();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, ezk.v);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, ezk.v);
         }
      }
   }

   static class f {
      public final Class<? extends eua.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends eua.p> $$0, int $$1, int $$2) {
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

   public static class g extends eua.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, era $$1, jb $$2) {
         super(erz.y, $$0, $$1);
         this.a($$2);
      }

      public g(tz $$0) {
         super(erz.y, $$0);
         this.d = $$0.o("Mob");
      }

      @Override
      protected void a(ery $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(erm $$0, ern $$1, azv $$2) {
         if ($$0 != null) {
            ((eua.m)$$0).b = this;
         }
      }

      public static eua.g a(ern $$0, int $$1, int $$2, int $$3, jb $$4, int $$5) {
         era $$6 = era.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new eua.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dkg $$0, dkd $$1, ecm $$2, azv $$3, era $$4, dio $$5, iv $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, eua.k);
         this.a($$0, $$3, $$4, eua.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, eua.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, eua.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, eua.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, eua.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, eua.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, eua.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, dmo.K.m(), dmo.K.m(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, dmo.K.m(), dmo.K.m(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, eua.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, dmo.K.m(), dmo.K.m(), false);
         eao $$8 = dmo.fo.m().b(dqs.a, Boolean.valueOf(true)).b(dqs.c, Boolean.valueOf(true));
         eao $$9 = dmo.fo.m().b(dqs.d, Boolean.valueOf(true)).b(dqs.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         eao $$12 = dmo.fC.m().b(duq.b, jb.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, eua.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, eua.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, eua.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         eao $$14 = dmo.fX.m().b(dpd.b, jb.c);
         eao $$15 = dmo.fX.m().b(dpd.b, jb.d);
         eao $$16 = dmo.fX.m().b(dpd.b, jb.f);
         eao $$17 = dmo.fX.m().b(dpd.b, jb.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.b(dpd.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.b(dpd.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.b(dpd.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.b(dpd.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.b(dpd.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.b(dpd.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.b(dpd.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.b(dpd.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.b(dpd.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.b(dpd.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.b(dpd.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.b(dpd.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            eao $$21 = dmo.fW.m();
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
               $$0.a($$22, dmo.cD.m(), 2);
               if ($$0.c_($$22) instanceof dze $$24) {
                  $$24.a(bwr.be, $$3);
               }
            }
         }
      }
   }

   public static class h extends eua.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, azv $$1, era $$2, jb $$3) {
         super(erz.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(tz $$0) {
         super(erz.z, $$0);
      }

      @Override
      public void a(erm $$0, ern $$1, azv $$2) {
         this.a((eua.m)$$0, $$1, $$2, 1, 1);
      }

      public static eua.h a(ern $$0, azv $$1, int $$2, int $$3, int $$4, jb $$5, int $$6) {
         era $$7 = era.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eua.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dkg $$0, dkd $$1, ecm $$2, azv $$3, era $$4, dio $$5, iv $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, eua.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, eua.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, eua.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, eua.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, eua.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, dmo.fo.m().b(dqs.a, Boolean.valueOf(true)).b(dqs.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, dmo.fo.m().b(dqs.a, Boolean.valueOf(true)).b(dqs.c, Boolean.valueOf(true)).b(dqs.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, dmo.fo.m().b(dqs.a, Boolean.valueOf(true)).b(dqs.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, dmo.fo.m().b(dqs.d, Boolean.valueOf(true)).b(dqs.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, dmo.fo.m().b(dqs.d, Boolean.valueOf(true)).b(dqs.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, dmo.fo.m().b(dqs.d, Boolean.valueOf(true)).b(dqs.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, dmo.fo.m().b(dqs.a, Boolean.valueOf(true)).b(dqs.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, dmo.fo.m().b(dqs.a, Boolean.valueOf(true)).b(dqs.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         eao $$8 = dmo.dN.m().b(dot.b, jb.e);
         eao $$9 = dmo.dN.m().b(dot.b, jb.e).b(dot.c, ebk.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends eua.q {
      public i(int $$0, azv $$1, era $$2, jb $$3) {
         super(erz.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(tz $$0) {
         super(erz.A, $$0);
      }

      @Override
      public void a(erm $$0, ern $$1, azv $$2) {
         jb $$3 = this.i();
         if ($$3 != jb.c && $$3 != jb.f) {
            this.b((eua.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((eua.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static eua.i a(ern $$0, azv $$1, int $$2, int $$3, int $$4, jb $$5, int $$6) {
         era $$7 = era.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eua.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dkg $$0, dkd $$1, ecm $$2, azv $$3, era $$4, dio $$5, iv $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, eua.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         jb $$7 = this.i();
         if ($$7 != jb.c && $$7 != jb.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends eua.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, azv $$1, era $$2, jb $$3) {
         super(erz.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(tz $$0) {
         super(erz.B, $$0);
         this.d = $$0.f("Type");
      }

      @Override
      protected void a(ery $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(erm $$0, ern $$1, azv $$2) {
         this.a((eua.m)$$0, $$1, $$2, 4, 1);
         this.b((eua.m)$$0, $$1, $$2, 1, 4);
         this.c((eua.m)$$0, $$1, $$2, 1, 4);
      }

      public static eua.j a(ern $$0, azv $$1, int $$2, int $$3, int $$4, jb $$5, int $$6) {
         era $$7 = era.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eua.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dkg $$0, dkd $$1, ecm $$2, azv $$3, era $$4, dio $$5, iv $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, eua.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, dmo.eZ.m(), 5, 1, 5, $$4);
               this.a($$0, dmo.eZ.m(), 5, 2, 5, $$4);
               this.a($$0, dmo.eZ.m(), 5, 3, 5, $$4);
               this.a($$0, dmo.cA.m().b(dwf.e, jb.e), 4, 3, 5, $$4);
               this.a($$0, dmo.cA.m().b(dwf.e, jb.f), 6, 3, 5, $$4);
               this.a($$0, dmo.cA.m().b(dwf.e, jb.d), 5, 3, 4, $$4);
               this.a($$0, dmo.cA.m().b(dwf.e, jb.c), 5, 3, 6, $$4);
               this.a($$0, dmo.kh.m(), 4, 1, 4, $$4);
               this.a($$0, dmo.kh.m(), 4, 1, 5, $$4);
               this.a($$0, dmo.kh.m(), 4, 1, 6, $$4);
               this.a($$0, dmo.kh.m(), 6, 1, 4, $$4);
               this.a($$0, dmo.kh.m(), 6, 1, 5, $$4);
               this.a($$0, dmo.kh.m(), 6, 1, 6, $$4);
               this.a($$0, dmo.kh.m(), 5, 1, 4, $$4);
               this.a($$0, dmo.kh.m(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, dmo.eZ.m(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, dmo.eZ.m(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, dmo.eZ.m(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, dmo.eZ.m(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, dmo.eZ.m(), 5, 1, 5, $$4);
               this.a($$0, dmo.eZ.m(), 5, 2, 5, $$4);
               this.a($$0, dmo.eZ.m(), 5, 3, 5, $$4);
               this.a($$0, dmo.J.m(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, dmo.m.m(), 1, 3, $$8, $$4);
                  this.a($$0, dmo.m.m(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, dmo.m.m(), $$9, 3, 1, $$4);
                  this.a($$0, dmo.m.m(), $$9, 3, 9, $$4);
               }

               this.a($$0, dmo.m.m(), 5, 1, 4, $$4);
               this.a($$0, dmo.m.m(), 5, 1, 6, $$4);
               this.a($$0, dmo.m.m(), 5, 3, 4, $$4);
               this.a($$0, dmo.m.m(), 5, 3, 6, $$4);
               this.a($$0, dmo.m.m(), 4, 1, 5, $$4);
               this.a($$0, dmo.m.m(), 6, 1, 5, $$4);
               this.a($$0, dmo.m.m(), 4, 3, 5, $$4);
               this.a($$0, dmo.m.m(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, dmo.m.m(), 4, $$10, 4, $$4);
                  this.a($$0, dmo.m.m(), 6, $$10, 4, $$4);
                  this.a($$0, dmo.m.m(), 4, $$10, 6, $$4);
                  this.a($$0, dmo.m.m(), 6, $$10, 6, $$4);
               }

               this.a($$0, dmo.cA.m(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, dmo.n.m(), 2, 3, $$11, $$4);
                  this.a($$0, dmo.n.m(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, dmo.n.m(), 4, 3, $$11, $$4);
                     this.a($$0, dmo.n.m(), 5, 3, $$11, $$4);
                     this.a($$0, dmo.n.m(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, dmo.n.m(), 7, 3, $$11, $$4);
                  this.a($$0, dmo.n.m(), 8, 3, $$11, $$4);
               }

               eao $$12 = dmo.da.m().b(dqx.b, jb.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, ezk.w);
         }
      }
   }

   static class k extends erm.a {
      @Override
      public void a(azv $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = dmo.fb.m();
            } else if ($$5 < 0.5F) {
               this.a = dmo.fa.m();
            } else if ($$5 < 0.55F) {
               this.a = dmo.fh.m();
            } else {
               this.a = dmo.eZ.m();
            }
         } else {
            this.a = dmo.nI.m();
         }
      }
   }

   public static class l extends eua.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(erz $$0, int $$1, int $$2, int $$3, jb $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = eua.p.a.a;
      }

      public l(int $$0, azv $$1, era $$2, jb $$3) {
         super(erz.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(erz $$0, tz $$1) {
         super($$0, $$1);
         this.d = $$1.o("Source");
      }

      public l(tz $$0) {
         this(erz.C, $$0);
      }

      @Override
      protected void a(ery $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(erm $$0, ern $$1, azv $$2) {
         if (this.d) {
            eua.i = eua.c.class;
         }

         this.a((eua.m)$$0, $$1, $$2, 1, 1);
      }

      public static eua.l a(ern $$0, azv $$1, int $$2, int $$3, int $$4, jb $$5, int $$6) {
         era $$7 = era.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eua.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dkg $$0, dkd $$1, ecm $$2, azv $$3, era $$4, dio $$5, iv $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, eua.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, eua.p.a.a, 1, 1, 4);
         this.a($$0, dmo.eZ.m(), 2, 6, 1, $$4);
         this.a($$0, dmo.eZ.m(), 1, 5, 1, $$4);
         this.a($$0, dmo.kh.m(), 1, 6, 1, $$4);
         this.a($$0, dmo.eZ.m(), 1, 5, 2, $$4);
         this.a($$0, dmo.eZ.m(), 1, 4, 3, $$4);
         this.a($$0, dmo.kh.m(), 1, 5, 3, $$4);
         this.a($$0, dmo.eZ.m(), 2, 4, 3, $$4);
         this.a($$0, dmo.eZ.m(), 3, 3, 3, $$4);
         this.a($$0, dmo.kh.m(), 3, 4, 3, $$4);
         this.a($$0, dmo.eZ.m(), 3, 3, 2, $$4);
         this.a($$0, dmo.eZ.m(), 3, 2, 1, $$4);
         this.a($$0, dmo.kh.m(), 3, 3, 1, $$4);
         this.a($$0, dmo.eZ.m(), 2, 2, 1, $$4);
         this.a($$0, dmo.eZ.m(), 1, 1, 1, $$4);
         this.a($$0, dmo.kh.m(), 1, 2, 1, $$4);
         this.a($$0, dmo.eZ.m(), 1, 1, 2, $$4);
         this.a($$0, dmo.kh.m(), 1, 1, 3, $$4);
      }
   }

   public static class m extends eua.l {
      public eua.f a;
      @Nullable
      public eua.g b;
      public final List<erm> c = Lists.newArrayList();

      public m(azv $$0, int $$1, int $$2) {
         super(erz.D, 0, $$1, $$2, a($$0));
      }

      public m(tz $$0) {
         super(erz.D, $$0);
      }

      @Override
      public iv h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends eua.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, azv $$1, era $$2, jb $$3) {
         super(erz.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(tz $$0) {
         super(erz.E, $$0);
         this.d = $$0.o("Left");
         this.i = $$0.o("Right");
      }

      @Override
      protected void a(ery $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(erm $$0, ern $$1, azv $$2) {
         this.a((eua.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((eua.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((eua.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static eua.n a(ern $$0, azv $$1, int $$2, int $$3, int $$4, jb $$5, int $$6) {
         era $$7 = era.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new eua.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dkg $$0, dkd $$1, ecm $$2, azv $$3, era $$4, dio $$5, iv $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, eua.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, eua.p.a.a, 1, 1, 6);
         eao $$7 = dmo.cA.m().b(dwf.e, jb.f);
         eao $$8 = dmo.cA.m().b(dwf.e, jb.e);
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

   public static class o extends eua.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, azv $$1, era $$2, jb $$3) {
         super(erz.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(tz $$0) {
         super(erz.F, $$0);
      }

      @Override
      public void a(erm $$0, ern $$1, azv $$2) {
         this.a((eua.m)$$0, $$1, $$2, 1, 1);
      }

      public static eua.o a(ern $$0, azv $$1, int $$2, int $$3, int $$4, jb $$5, int $$6) {
         era $$7 = era.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new eua.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dkg $$0, dkd $$1, ecm $$2, azv $$3, era $$4, dio $$5, iv $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, eua.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, eua.p.a.a, 1, 1, 7);
         eao $$7 = dmo.dc.m().b(duq.b, jb.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, dmo.eZ.m(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dmo.eZ.m(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dmo.eZ.m(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends erm {
      protected eua.p.a h = eua.p.a.a;

      protected p(erz $$0, int $$1, era $$2) {
         super($$0, $$1, $$2);
      }

      public p(erz $$0, tz $$1) {
         super($$0, $$1);
         this.h = $$1.<eua.p.a>a("EntryDoor", eua.p.a.e).orElseThrow();
      }

      @Override
      protected void a(ery $$0, tz $$1) {
         $$1.a("EntryDoor", eua.p.a.e, this.h);
      }

      protected void a(dkg $$0, azv $$1, era $$2, eua.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, dmo.eZ.m(), $$4, $$5, $$6, $$2);
               this.a($$0, dmo.eZ.m(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dmo.eZ.m(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dmo.eZ.m(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dmo.eZ.m(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dmo.eZ.m(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dmo.eZ.m(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dmo.cZ.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dmo.cZ.m().b(dot.c, ebk.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, dmo.nI.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dmo.nI.m(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dmo.fo.m().b(dqs.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, dmo.fo.m().b(dqs.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dmo.fo.m().b(dqs.b, Boolean.valueOf(true)).b(dqs.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dmo.fo.m().b(dqs.b, Boolean.valueOf(true)).b(dqs.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dmo.fo.m().b(dqs.b, Boolean.valueOf(true)).b(dqs.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dmo.fo.m().b(dqs.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dmo.fo.m().b(dqs.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, dmo.eZ.m(), $$4, $$5, $$6, $$2);
               this.a($$0, dmo.eZ.m(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dmo.eZ.m(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dmo.eZ.m(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dmo.eZ.m(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dmo.eZ.m(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dmo.eZ.m(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dmo.dN.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dmo.dN.m().b(dot.c, ebk.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dmo.ec.m().b(dmx.e, jb.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, dmo.ec.m().b(dmx.e, jb.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected eua.p.a b(azv $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return eua.p.a.a;
            case 2:
               return eua.p.a.b;
            case 3:
               return eua.p.a.c;
            case 4:
               return eua.p.a.d;
         }
      }

      @Nullable
      protected erm a(eua.m $$0, ern $$1, azv $$2, int $$3, int $$4) {
         jb $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eua.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$5, this.g());
               case d:
                  return eua.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$5, this.g());
               case e:
                  return eua.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
               case f:
                  return eua.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected erm b(eua.m $$0, ern $$1, azv $$2, int $$3, int $$4) {
         jb $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eua.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jb.e, this.g());
               case d:
                  return eua.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jb.e, this.g());
               case e:
                  return eua.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jb.c, this.g());
               case f:
                  return eua.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jb.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected erm c(eua.m $$0, ern $$1, azv $$2, int $$3, int $$4) {
         jb $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eua.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jb.f, this.g());
               case d:
                  return eua.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jb.f, this.g());
               case e:
                  return eua.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jb.d, this.g());
               case f:
                  return eua.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jb.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(era $$0) {
         return $$0 != null && $$0.i() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;

         @Deprecated
         public static final Codec<eua.p.a> e = ayu.c(eua.p.a::valueOf);
      }
   }

   public abstract static class q extends eua.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(erz $$0, int $$1, era $$2) {
         super($$0, $$1, $$2);
      }

      public q(erz $$0, tz $$1) {
         super($$0, $$1);
      }
   }
}
