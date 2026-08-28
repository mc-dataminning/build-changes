import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class euf {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final euf.f[] g = new euf.f[]{
      new euf.f(euf.n.class, 40, 0),
      new euf.f(euf.h.class, 5, 5),
      new euf.f(euf.d.class, 20, 0),
      new euf.f(euf.i.class, 20, 0),
      new euf.f(euf.j.class, 10, 6),
      new euf.f(euf.o.class, 5, 5),
      new euf.f(euf.l.class, 5, 5),
      new euf.f(euf.c.class, 5, 4),
      new euf.f(euf.a.class, 5, 4),
      new euf.f(euf.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new euf.f(euf.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<euf.f> h;
   static Class<? extends euf.p> i;
   private static int j;
   static final euf.k k = new euf.k();

   public static void a() {
      h = Lists.newArrayList();

      for (euf.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (euf.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static euf.p a(Class<? extends euf.p> $$0, ers $$1, azv $$2, int $$3, int $$4, int $$5, @Nullable jb $$6, int $$7) {
      euf.p $$8 = null;
      if ($$0 == euf.n.class) {
         $$8 = euf.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == euf.h.class) {
         $$8 = euf.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == euf.d.class) {
         $$8 = euf.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == euf.i.class) {
         $$8 = euf.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == euf.j.class) {
         $$8 = euf.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == euf.o.class) {
         $$8 = euf.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == euf.l.class) {
         $$8 = euf.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == euf.c.class) {
         $$8 = euf.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == euf.a.class) {
         $$8 = euf.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == euf.e.class) {
         $$8 = euf.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == euf.g.class) {
         $$8 = euf.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static euf.p a(euf.m $$0, ers $$1, azv $$2, int $$3, int $$4, int $$5, jb $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            euf.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (euf.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  euf.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         erf $$13 = euf.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.i() > 1 ? new euf.b($$7, $$13, $$6) : null;
      }
   }

   static err b(euf.m $$0, ers $$1, azv $$2, int $$3, int $$4, int $$5, @Nullable jb $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
         err $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends euf.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, azv $$1, erf $$2, jb $$3) {
         super(ese.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(tz $$0) {
         super(ese.t, $$0);
         this.d = $$0.o("Chest");
      }

      @Override
      protected void a(esd $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(err $$0, ers $$1, azv $$2) {
         this.a((euf.m)$$0, $$1, $$2, 1, 1);
      }

      public static euf.a a(ers $$0, azv $$1, int $$2, int $$3, int $$4, jb $$5, int $$6) {
         erf $$7 = erf.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new euf.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dkl $$0, dki $$1, ecr $$2, azv $$3, erf $$4, dir $$5, iv $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, euf.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, euf.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, dmt.eZ.m(), dmt.eZ.m(), false);
         this.a($$0, dmt.kn.m(), 3, 1, 1, $$4);
         this.a($$0, dmt.kn.m(), 3, 1, 5, $$4);
         this.a($$0, dmt.kn.m(), 3, 2, 2, $$4);
         this.a($$0, dmt.kn.m(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, dmt.kn.m(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, ezp.x);
         }
      }
   }

   public static class b extends euf.p {
      private final int a;

      public b(int $$0, erf $$1, jb $$2) {
         super(ese.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != jb.c && $$2 != jb.d ? $$1.d() : $$1.f();
      }

      public b(tz $$0) {
         super(ese.u, $$0);
         this.a = $$0.f("Steps");
      }

      @Override
      protected void a(esd $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static erf a(ers $$0, azv $$1, int $$2, int $$3, int $$4, jb $$5) {
         int $$6 = 3;
         erf $$7 = erf.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         err $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().i() == $$7.i()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = erf.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return erf.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(dkl $$0, dki $$1, ecr $$2, azv $$3, erf $$4, dir $$5, iv $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, dmt.eZ.m(), 0, 0, $$7, $$4);
            this.a($$0, dmt.eZ.m(), 1, 0, $$7, $$4);
            this.a($$0, dmt.eZ.m(), 2, 0, $$7, $$4);
            this.a($$0, dmt.eZ.m(), 3, 0, $$7, $$4);
            this.a($$0, dmt.eZ.m(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, dmt.eZ.m(), 0, $$8, $$7, $$4);
               this.a($$0, dmt.nI.m(), 1, $$8, $$7, $$4);
               this.a($$0, dmt.nI.m(), 2, $$8, $$7, $$4);
               this.a($$0, dmt.nI.m(), 3, $$8, $$7, $$4);
               this.a($$0, dmt.eZ.m(), 4, $$8, $$7, $$4);
            }

            this.a($$0, dmt.eZ.m(), 0, 4, $$7, $$4);
            this.a($$0, dmt.eZ.m(), 1, 4, $$7, $$4);
            this.a($$0, dmt.eZ.m(), 2, 4, $$7, $$4);
            this.a($$0, dmt.eZ.m(), 3, 4, $$7, $$4);
            this.a($$0, dmt.eZ.m(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends euf.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, azv $$1, erf $$2, jb $$3) {
         super(ese.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(tz $$0) {
         super(ese.v, $$0);
         this.d = $$0.o("leftLow");
         this.i = $$0.o("leftHigh");
         this.j = $$0.o("rightLow");
         this.k = $$0.o("rightHigh");
      }

      @Override
      protected void a(esd $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(err $$0, ers $$1, azv $$2) {
         int $$3 = 3;
         int $$4 = 5;
         jb $$5 = this.i();
         if ($$5 == jb.e || $$5 == jb.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((euf.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((euf.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((euf.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((euf.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((euf.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static euf.c a(ers $$0, azv $$1, int $$2, int $$3, int $$4, jb $$5, int $$6) {
         erf $$7 = erf.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new euf.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dkl $$0, dki $$1, ecr $$2, azv $$3, erf $$4, dir $$5, iv $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, euf.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, euf.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, euf.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, euf.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, euf.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, euf.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, dmt.kh.m(), dmt.kh.m(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, dmt.kh.m(), dmt.kh.m(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, euf.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, dmt.kh.m(), dmt.kh.m(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, dmt.kh.m(), dmt.kh.m(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, dmt.kh.m(), dmt.kh.m(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, dmt.kh.m(), dmt.kh.m(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, dmt.kh.m().b(due.b, ecb.c), dmt.kh.m().b(due.b, ecb.c), false);
         this.a($$0, dmt.cA.m().b(dwk.e, jb.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends euf.q {
      public d(int $$0, azv $$1, erf $$2, jb $$3) {
         super(ese.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(tz $$0) {
         super(ese.w, $$0);
      }

      @Override
      public void a(err $$0, ers $$1, azv $$2) {
         jb $$3 = this.i();
         if ($$3 != jb.c && $$3 != jb.f) {
            this.c((euf.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((euf.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static euf.d a(ers $$0, azv $$1, int $$2, int $$3, int $$4, jb $$5, int $$6) {
         erf $$7 = erf.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new euf.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dkl $$0, dki $$1, ecr $$2, azv $$3, erf $$4, dir $$5, iv $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, euf.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         jb $$7 = this.i();
         if ($$7 != jb.c && $$7 != jb.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends euf.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, azv $$1, erf $$2, jb $$3) {
         super(ese.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.e() > 6;
      }

      public e(tz $$0) {
         super(ese.x, $$0);
         this.i = $$0.o("Tall");
      }

      @Override
      protected void a(esd $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static euf.e a(ers $$0, azv $$1, int $$2, int $$3, int $$4, jb $$5, int $$6) {
         erf $$7 = erf.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = erf.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new euf.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(dkl $$0, dki $$1, ecr $$2, azv $$3, erf $$4, dir $$5, iv $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, euf.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, dmt.bz.m(), dmt.bz.m(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dmt.n.m(), dmt.n.m(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dmt.n.m(), dmt.n.m(), false);
               this.a($$0, dmt.cA.m().b(dwk.e, jb.f), 2, 3, $$10, $$4);
               this.a($$0, dmt.cA.m().b(dwk.e, jb.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dmt.n.m(), dmt.n.m(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dmt.n.m(), dmt.n.m(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dmt.cv.m(), dmt.cv.m(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dmt.cv.m(), dmt.cv.m(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dmt.cv.m(), dmt.cv.m(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dmt.cv.m(), dmt.cv.m(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, dmt.cv.m(), dmt.cv.m(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, dmt.cv.m(), dmt.cv.m(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, dmt.cv.m(), dmt.cv.m(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, dmt.n.m(), dmt.n.m(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, dmt.n.m(), dmt.n.m(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, dmt.n.m(), dmt.n.m(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, dmt.n.m(), dmt.n.m(), false);
            this.a($$0, dmt.n.m(), 9, 5, 11, $$4);
            this.a($$0, dmt.n.m(), 8, 5, 11, $$4);
            this.a($$0, dmt.n.m(), 9, 5, 10, $$4);
            eat $$12 = dmt.el.m().b(dpr.d, Boolean.valueOf(true)).b(dpr.b, Boolean.valueOf(true));
            eat $$13 = dmt.el.m().b(dpr.a, Boolean.valueOf(true)).b(dpr.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, dmt.el.m().b(dpr.a, Boolean.valueOf(true)).b(dpr.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, dmt.el.m().b(dpr.c, Boolean.valueOf(true)).b(dpr.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, dmt.el.m().b(dpr.a, Boolean.valueOf(true)).b(dpr.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, dmt.el.m().b(dpr.c, Boolean.valueOf(true)).b(dpr.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, dmt.el.m().b(dpr.a, Boolean.valueOf(true)).b(dpr.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            eat $$15 = dmt.da.m().b(drc.b, jb.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            eat $$18 = dmt.el.m().b(dpr.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            eat $$19 = dmt.el.m().b(dpr.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            eat $$20 = $$13.b(dpr.d, Boolean.valueOf(true)).b(dpr.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.b(dpr.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.b(dpr.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.b(dpr.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.b(dpr.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            eat $$21 = dmt.cz.m();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, ezp.v);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, ezp.v);
         }
      }
   }

   static class f {
      public final Class<? extends euf.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends euf.p> $$0, int $$1, int $$2) {
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

   public static class g extends euf.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, erf $$1, jb $$2) {
         super(ese.y, $$0, $$1);
         this.a($$2);
      }

      public g(tz $$0) {
         super(ese.y, $$0);
         this.d = $$0.o("Mob");
      }

      @Override
      protected void a(esd $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(err $$0, ers $$1, azv $$2) {
         if ($$0 != null) {
            ((euf.m)$$0).b = this;
         }
      }

      public static euf.g a(ers $$0, int $$1, int $$2, int $$3, jb $$4, int $$5) {
         erf $$6 = erf.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new euf.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dkl $$0, dki $$1, ecr $$2, azv $$3, erf $$4, dir $$5, iv $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, euf.k);
         this.a($$0, $$3, $$4, euf.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, euf.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, euf.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, euf.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, euf.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, euf.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, euf.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, dmt.K.m(), dmt.K.m(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, dmt.K.m(), dmt.K.m(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, euf.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, dmt.K.m(), dmt.K.m(), false);
         eat $$8 = dmt.fo.m().b(dqx.a, Boolean.valueOf(true)).b(dqx.c, Boolean.valueOf(true));
         eat $$9 = dmt.fo.m().b(dqx.d, Boolean.valueOf(true)).b(dqx.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         eat $$12 = dmt.fC.m().b(duv.b, jb.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, euf.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, euf.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, euf.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         eat $$14 = dmt.fX.m().b(dpi.b, jb.c);
         eat $$15 = dmt.fX.m().b(dpi.b, jb.d);
         eat $$16 = dmt.fX.m().b(dpi.b, jb.f);
         eat $$17 = dmt.fX.m().b(dpi.b, jb.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.b(dpi.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.b(dpi.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.b(dpi.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.b(dpi.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.b(dpi.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.b(dpi.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.b(dpi.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.b(dpi.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.b(dpi.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.b(dpi.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.b(dpi.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.b(dpi.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            eat $$21 = dmt.fW.m();
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
               $$0.a($$22, dmt.cD.m(), 2);
               if ($$0.c_($$22) instanceof dzj $$24) {
                  $$24.a(bwr.be, $$3);
               }
            }
         }
      }
   }

   public static class h extends euf.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, azv $$1, erf $$2, jb $$3) {
         super(ese.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(tz $$0) {
         super(ese.z, $$0);
      }

      @Override
      public void a(err $$0, ers $$1, azv $$2) {
         this.a((euf.m)$$0, $$1, $$2, 1, 1);
      }

      public static euf.h a(ers $$0, azv $$1, int $$2, int $$3, int $$4, jb $$5, int $$6) {
         erf $$7 = erf.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new euf.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dkl $$0, dki $$1, ecr $$2, azv $$3, erf $$4, dir $$5, iv $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, euf.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, euf.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, euf.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, euf.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, euf.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, dmt.fo.m().b(dqx.a, Boolean.valueOf(true)).b(dqx.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, dmt.fo.m().b(dqx.a, Boolean.valueOf(true)).b(dqx.c, Boolean.valueOf(true)).b(dqx.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, dmt.fo.m().b(dqx.a, Boolean.valueOf(true)).b(dqx.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, dmt.fo.m().b(dqx.d, Boolean.valueOf(true)).b(dqx.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, dmt.fo.m().b(dqx.d, Boolean.valueOf(true)).b(dqx.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, dmt.fo.m().b(dqx.d, Boolean.valueOf(true)).b(dqx.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, dmt.fo.m().b(dqx.a, Boolean.valueOf(true)).b(dqx.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, dmt.fo.m().b(dqx.a, Boolean.valueOf(true)).b(dqx.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         eat $$8 = dmt.dN.m().b(doy.b, jb.e);
         eat $$9 = dmt.dN.m().b(doy.b, jb.e).b(doy.c, ebp.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends euf.q {
      public i(int $$0, azv $$1, erf $$2, jb $$3) {
         super(ese.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(tz $$0) {
         super(ese.A, $$0);
      }

      @Override
      public void a(err $$0, ers $$1, azv $$2) {
         jb $$3 = this.i();
         if ($$3 != jb.c && $$3 != jb.f) {
            this.b((euf.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((euf.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static euf.i a(ers $$0, azv $$1, int $$2, int $$3, int $$4, jb $$5, int $$6) {
         erf $$7 = erf.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new euf.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dkl $$0, dki $$1, ecr $$2, azv $$3, erf $$4, dir $$5, iv $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, euf.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         jb $$7 = this.i();
         if ($$7 != jb.c && $$7 != jb.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends euf.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, azv $$1, erf $$2, jb $$3) {
         super(ese.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(tz $$0) {
         super(ese.B, $$0);
         this.d = $$0.f("Type");
      }

      @Override
      protected void a(esd $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(err $$0, ers $$1, azv $$2) {
         this.a((euf.m)$$0, $$1, $$2, 4, 1);
         this.b((euf.m)$$0, $$1, $$2, 1, 4);
         this.c((euf.m)$$0, $$1, $$2, 1, 4);
      }

      public static euf.j a(ers $$0, azv $$1, int $$2, int $$3, int $$4, jb $$5, int $$6) {
         erf $$7 = erf.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new euf.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dkl $$0, dki $$1, ecr $$2, azv $$3, erf $$4, dir $$5, iv $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, euf.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, dmt.eZ.m(), 5, 1, 5, $$4);
               this.a($$0, dmt.eZ.m(), 5, 2, 5, $$4);
               this.a($$0, dmt.eZ.m(), 5, 3, 5, $$4);
               this.a($$0, dmt.cA.m().b(dwk.e, jb.e), 4, 3, 5, $$4);
               this.a($$0, dmt.cA.m().b(dwk.e, jb.f), 6, 3, 5, $$4);
               this.a($$0, dmt.cA.m().b(dwk.e, jb.d), 5, 3, 4, $$4);
               this.a($$0, dmt.cA.m().b(dwk.e, jb.c), 5, 3, 6, $$4);
               this.a($$0, dmt.kh.m(), 4, 1, 4, $$4);
               this.a($$0, dmt.kh.m(), 4, 1, 5, $$4);
               this.a($$0, dmt.kh.m(), 4, 1, 6, $$4);
               this.a($$0, dmt.kh.m(), 6, 1, 4, $$4);
               this.a($$0, dmt.kh.m(), 6, 1, 5, $$4);
               this.a($$0, dmt.kh.m(), 6, 1, 6, $$4);
               this.a($$0, dmt.kh.m(), 5, 1, 4, $$4);
               this.a($$0, dmt.kh.m(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, dmt.eZ.m(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, dmt.eZ.m(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, dmt.eZ.m(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, dmt.eZ.m(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, dmt.eZ.m(), 5, 1, 5, $$4);
               this.a($$0, dmt.eZ.m(), 5, 2, 5, $$4);
               this.a($$0, dmt.eZ.m(), 5, 3, 5, $$4);
               this.a($$0, dmt.J.m(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, dmt.m.m(), 1, 3, $$8, $$4);
                  this.a($$0, dmt.m.m(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, dmt.m.m(), $$9, 3, 1, $$4);
                  this.a($$0, dmt.m.m(), $$9, 3, 9, $$4);
               }

               this.a($$0, dmt.m.m(), 5, 1, 4, $$4);
               this.a($$0, dmt.m.m(), 5, 1, 6, $$4);
               this.a($$0, dmt.m.m(), 5, 3, 4, $$4);
               this.a($$0, dmt.m.m(), 5, 3, 6, $$4);
               this.a($$0, dmt.m.m(), 4, 1, 5, $$4);
               this.a($$0, dmt.m.m(), 6, 1, 5, $$4);
               this.a($$0, dmt.m.m(), 4, 3, 5, $$4);
               this.a($$0, dmt.m.m(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, dmt.m.m(), 4, $$10, 4, $$4);
                  this.a($$0, dmt.m.m(), 6, $$10, 4, $$4);
                  this.a($$0, dmt.m.m(), 4, $$10, 6, $$4);
                  this.a($$0, dmt.m.m(), 6, $$10, 6, $$4);
               }

               this.a($$0, dmt.cA.m(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, dmt.n.m(), 2, 3, $$11, $$4);
                  this.a($$0, dmt.n.m(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, dmt.n.m(), 4, 3, $$11, $$4);
                     this.a($$0, dmt.n.m(), 5, 3, $$11, $$4);
                     this.a($$0, dmt.n.m(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, dmt.n.m(), 7, 3, $$11, $$4);
                  this.a($$0, dmt.n.m(), 8, 3, $$11, $$4);
               }

               eat $$12 = dmt.da.m().b(drc.b, jb.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, ezp.w);
         }
      }
   }

   static class k extends err.a {
      @Override
      public void a(azv $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = dmt.fb.m();
            } else if ($$5 < 0.5F) {
               this.a = dmt.fa.m();
            } else if ($$5 < 0.55F) {
               this.a = dmt.fh.m();
            } else {
               this.a = dmt.eZ.m();
            }
         } else {
            this.a = dmt.nI.m();
         }
      }
   }

   public static class l extends euf.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(ese $$0, int $$1, int $$2, int $$3, jb $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = euf.p.a.a;
      }

      public l(int $$0, azv $$1, erf $$2, jb $$3) {
         super(ese.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(ese $$0, tz $$1) {
         super($$0, $$1);
         this.d = $$1.o("Source");
      }

      public l(tz $$0) {
         this(ese.C, $$0);
      }

      @Override
      protected void a(esd $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(err $$0, ers $$1, azv $$2) {
         if (this.d) {
            euf.i = euf.c.class;
         }

         this.a((euf.m)$$0, $$1, $$2, 1, 1);
      }

      public static euf.l a(ers $$0, azv $$1, int $$2, int $$3, int $$4, jb $$5, int $$6) {
         erf $$7 = erf.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new euf.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dkl $$0, dki $$1, ecr $$2, azv $$3, erf $$4, dir $$5, iv $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, euf.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, euf.p.a.a, 1, 1, 4);
         this.a($$0, dmt.eZ.m(), 2, 6, 1, $$4);
         this.a($$0, dmt.eZ.m(), 1, 5, 1, $$4);
         this.a($$0, dmt.kh.m(), 1, 6, 1, $$4);
         this.a($$0, dmt.eZ.m(), 1, 5, 2, $$4);
         this.a($$0, dmt.eZ.m(), 1, 4, 3, $$4);
         this.a($$0, dmt.kh.m(), 1, 5, 3, $$4);
         this.a($$0, dmt.eZ.m(), 2, 4, 3, $$4);
         this.a($$0, dmt.eZ.m(), 3, 3, 3, $$4);
         this.a($$0, dmt.kh.m(), 3, 4, 3, $$4);
         this.a($$0, dmt.eZ.m(), 3, 3, 2, $$4);
         this.a($$0, dmt.eZ.m(), 3, 2, 1, $$4);
         this.a($$0, dmt.kh.m(), 3, 3, 1, $$4);
         this.a($$0, dmt.eZ.m(), 2, 2, 1, $$4);
         this.a($$0, dmt.eZ.m(), 1, 1, 1, $$4);
         this.a($$0, dmt.kh.m(), 1, 2, 1, $$4);
         this.a($$0, dmt.eZ.m(), 1, 1, 2, $$4);
         this.a($$0, dmt.kh.m(), 1, 1, 3, $$4);
      }
   }

   public static class m extends euf.l {
      public euf.f a;
      @Nullable
      public euf.g b;
      public final List<err> c = Lists.newArrayList();

      public m(azv $$0, int $$1, int $$2) {
         super(ese.D, 0, $$1, $$2, a($$0));
      }

      public m(tz $$0) {
         super(ese.D, $$0);
      }

      @Override
      public iv h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends euf.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, azv $$1, erf $$2, jb $$3) {
         super(ese.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(tz $$0) {
         super(ese.E, $$0);
         this.d = $$0.o("Left");
         this.i = $$0.o("Right");
      }

      @Override
      protected void a(esd $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(err $$0, ers $$1, azv $$2) {
         this.a((euf.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((euf.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((euf.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static euf.n a(ers $$0, azv $$1, int $$2, int $$3, int $$4, jb $$5, int $$6) {
         erf $$7 = erf.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new euf.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dkl $$0, dki $$1, ecr $$2, azv $$3, erf $$4, dir $$5, iv $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, euf.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, euf.p.a.a, 1, 1, 6);
         eat $$7 = dmt.cA.m().b(dwk.e, jb.f);
         eat $$8 = dmt.cA.m().b(dwk.e, jb.e);
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

   public static class o extends euf.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, azv $$1, erf $$2, jb $$3) {
         super(ese.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(tz $$0) {
         super(ese.F, $$0);
      }

      @Override
      public void a(err $$0, ers $$1, azv $$2) {
         this.a((euf.m)$$0, $$1, $$2, 1, 1);
      }

      public static euf.o a(ers $$0, azv $$1, int $$2, int $$3, int $$4, jb $$5, int $$6) {
         erf $$7 = erf.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new euf.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dkl $$0, dki $$1, ecr $$2, azv $$3, erf $$4, dir $$5, iv $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, euf.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, euf.p.a.a, 1, 1, 7);
         eat $$7 = dmt.dc.m().b(duv.b, jb.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, dmt.eZ.m(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dmt.eZ.m(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dmt.eZ.m(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends err {
      protected euf.p.a h = euf.p.a.a;

      protected p(ese $$0, int $$1, erf $$2) {
         super($$0, $$1, $$2);
      }

      public p(ese $$0, tz $$1) {
         super($$0, $$1);
         this.h = $$1.<euf.p.a>a("EntryDoor", euf.p.a.e).orElseThrow();
      }

      @Override
      protected void a(esd $$0, tz $$1) {
         $$1.a("EntryDoor", euf.p.a.e, this.h);
      }

      protected void a(dkl $$0, azv $$1, erf $$2, euf.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, dmt.eZ.m(), $$4, $$5, $$6, $$2);
               this.a($$0, dmt.eZ.m(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dmt.eZ.m(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dmt.eZ.m(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dmt.eZ.m(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dmt.eZ.m(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dmt.eZ.m(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dmt.cZ.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dmt.cZ.m().b(doy.c, ebp.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, dmt.nI.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dmt.nI.m(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dmt.fo.m().b(dqx.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, dmt.fo.m().b(dqx.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dmt.fo.m().b(dqx.b, Boolean.valueOf(true)).b(dqx.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dmt.fo.m().b(dqx.b, Boolean.valueOf(true)).b(dqx.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dmt.fo.m().b(dqx.b, Boolean.valueOf(true)).b(dqx.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dmt.fo.m().b(dqx.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dmt.fo.m().b(dqx.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, dmt.eZ.m(), $$4, $$5, $$6, $$2);
               this.a($$0, dmt.eZ.m(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dmt.eZ.m(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dmt.eZ.m(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dmt.eZ.m(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dmt.eZ.m(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dmt.eZ.m(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dmt.dN.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dmt.dN.m().b(doy.c, ebp.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dmt.ec.m().b(dnc.e, jb.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, dmt.ec.m().b(dnc.e, jb.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected euf.p.a b(azv $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return euf.p.a.a;
            case 2:
               return euf.p.a.b;
            case 3:
               return euf.p.a.c;
            case 4:
               return euf.p.a.d;
         }
      }

      @Nullable
      protected err a(euf.m $$0, ers $$1, azv $$2, int $$3, int $$4) {
         jb $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return euf.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$5, this.g());
               case d:
                  return euf.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$5, this.g());
               case e:
                  return euf.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
               case f:
                  return euf.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected err b(euf.m $$0, ers $$1, azv $$2, int $$3, int $$4) {
         jb $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return euf.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jb.e, this.g());
               case d:
                  return euf.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jb.e, this.g());
               case e:
                  return euf.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jb.c, this.g());
               case f:
                  return euf.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jb.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected err c(euf.m $$0, ers $$1, azv $$2, int $$3, int $$4) {
         jb $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return euf.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jb.f, this.g());
               case d:
                  return euf.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jb.f, this.g());
               case e:
                  return euf.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jb.d, this.g());
               case f:
                  return euf.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jb.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(erf $$0) {
         return $$0 != null && $$0.i() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;

         @Deprecated
         public static final Codec<euf.p.a> e = ayu.c(euf.p.a::valueOf);
      }
   }

   public abstract static class q extends euf.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(ese $$0, int $$1, erf $$2) {
         super($$0, $$1, $$2);
      }

      public q(ese $$0, tz $$1) {
         super($$0, $$1);
      }
   }
}
