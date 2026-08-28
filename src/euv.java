import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class euv {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final euv.f[] g = new euv.f[]{
      new euv.f(euv.n.class, 40, 0),
      new euv.f(euv.h.class, 5, 5),
      new euv.f(euv.d.class, 20, 0),
      new euv.f(euv.i.class, 20, 0),
      new euv.f(euv.j.class, 10, 6),
      new euv.f(euv.o.class, 5, 5),
      new euv.f(euv.l.class, 5, 5),
      new euv.f(euv.c.class, 5, 4),
      new euv.f(euv.a.class, 5, 4),
      new euv.f(euv.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new euv.f(euv.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<euv.f> h;
   static Class<? extends euv.p> i;
   private static int j;
   static final euv.k k = new euv.k();

   public static void a() {
      h = Lists.newArrayList();

      for (euv.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (euv.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static euv.p a(Class<? extends euv.p> $$0, esi $$1, azz $$2, int $$3, int $$4, int $$5, @Nullable jc $$6, int $$7) {
      euv.p $$8 = null;
      if ($$0 == euv.n.class) {
         $$8 = euv.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == euv.h.class) {
         $$8 = euv.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == euv.d.class) {
         $$8 = euv.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == euv.i.class) {
         $$8 = euv.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == euv.j.class) {
         $$8 = euv.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == euv.o.class) {
         $$8 = euv.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == euv.l.class) {
         $$8 = euv.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == euv.c.class) {
         $$8 = euv.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == euv.a.class) {
         $$8 = euv.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == euv.e.class) {
         $$8 = euv.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == euv.g.class) {
         $$8 = euv.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static euv.p a(euv.m $$0, esi $$1, azz $$2, int $$3, int $$4, int $$5, jc $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            euv.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (euv.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  euv.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         erv $$13 = euv.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.i() > 1 ? new euv.b($$7, $$13, $$6) : null;
      }
   }

   static esh b(euv.m $$0, esi $$1, azz $$2, int $$3, int $$4, int $$5, @Nullable jc $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
         esh $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends euv.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, azz $$1, erv $$2, jc $$3) {
         super(esu.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(ua $$0) {
         super(esu.t, $$0);
         this.d = $$0.b("Chest", false);
      }

      @Override
      protected void a(est $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(esh $$0, esi $$1, azz $$2) {
         this.a((euv.m)$$0, $$1, $$2, 1, 1);
      }

      public static euv.a a(esi $$0, azz $$1, int $$2, int $$3, int $$4, jc $$5, int $$6) {
         erv $$7 = erv.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new euv.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dky $$0, dkv $$1, ede $$2, azz $$3, erv $$4, dje $$5, iw $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, euv.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, euv.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, dng.eZ.m(), dng.eZ.m(), false);
         this.a($$0, dng.kn.m(), 3, 1, 1, $$4);
         this.a($$0, dng.kn.m(), 3, 1, 5, $$4);
         this.a($$0, dng.kn.m(), 3, 2, 2, $$4);
         this.a($$0, dng.kn.m(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, dng.kn.m(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, faf.x);
         }
      }
   }

   public static class b extends euv.p {
      private final int a;

      public b(int $$0, erv $$1, jc $$2) {
         super(esu.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != jc.c && $$2 != jc.d ? $$1.d() : $$1.f();
      }

      public b(ua $$0) {
         super(esu.u, $$0);
         this.a = $$0.b("Steps", 0);
      }

      @Override
      protected void a(est $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static erv a(esi $$0, azz $$1, int $$2, int $$3, int $$4, jc $$5) {
         int $$6 = 3;
         erv $$7 = erv.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         esh $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().i() == $$7.i()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = erv.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return erv.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(dky $$0, dkv $$1, ede $$2, azz $$3, erv $$4, dje $$5, iw $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, dng.eZ.m(), 0, 0, $$7, $$4);
            this.a($$0, dng.eZ.m(), 1, 0, $$7, $$4);
            this.a($$0, dng.eZ.m(), 2, 0, $$7, $$4);
            this.a($$0, dng.eZ.m(), 3, 0, $$7, $$4);
            this.a($$0, dng.eZ.m(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, dng.eZ.m(), 0, $$8, $$7, $$4);
               this.a($$0, dng.nI.m(), 1, $$8, $$7, $$4);
               this.a($$0, dng.nI.m(), 2, $$8, $$7, $$4);
               this.a($$0, dng.nI.m(), 3, $$8, $$7, $$4);
               this.a($$0, dng.eZ.m(), 4, $$8, $$7, $$4);
            }

            this.a($$0, dng.eZ.m(), 0, 4, $$7, $$4);
            this.a($$0, dng.eZ.m(), 1, 4, $$7, $$4);
            this.a($$0, dng.eZ.m(), 2, 4, $$7, $$4);
            this.a($$0, dng.eZ.m(), 3, 4, $$7, $$4);
            this.a($$0, dng.eZ.m(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends euv.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, azz $$1, erv $$2, jc $$3) {
         super(esu.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(ua $$0) {
         super(esu.v, $$0);
         this.d = $$0.b("leftLow", false);
         this.i = $$0.b("leftHigh", false);
         this.j = $$0.b("rightLow", false);
         this.k = $$0.b("rightHigh", false);
      }

      @Override
      protected void a(est $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(esh $$0, esi $$1, azz $$2) {
         int $$3 = 3;
         int $$4 = 5;
         jc $$5 = this.i();
         if ($$5 == jc.e || $$5 == jc.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((euv.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((euv.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((euv.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((euv.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((euv.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static euv.c a(esi $$0, azz $$1, int $$2, int $$3, int $$4, jc $$5, int $$6) {
         erv $$7 = erv.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new euv.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dky $$0, dkv $$1, ede $$2, azz $$3, erv $$4, dje $$5, iw $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, euv.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, euv.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, euv.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, euv.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, euv.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, euv.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, dng.kh.m(), dng.kh.m(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, dng.kh.m(), dng.kh.m(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, euv.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, dng.kh.m(), dng.kh.m(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, dng.kh.m(), dng.kh.m(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, dng.kh.m(), dng.kh.m(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, dng.kh.m(), dng.kh.m(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, dng.kh.m().b(dur.b, eco.c), dng.kh.m().b(dur.b, eco.c), false);
         this.a($$0, dng.cA.m().b(dwx.e, jc.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends euv.q {
      public d(int $$0, azz $$1, erv $$2, jc $$3) {
         super(esu.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(ua $$0) {
         super(esu.w, $$0);
      }

      @Override
      public void a(esh $$0, esi $$1, azz $$2) {
         jc $$3 = this.i();
         if ($$3 != jc.c && $$3 != jc.f) {
            this.c((euv.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((euv.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static euv.d a(esi $$0, azz $$1, int $$2, int $$3, int $$4, jc $$5, int $$6) {
         erv $$7 = erv.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new euv.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dky $$0, dkv $$1, ede $$2, azz $$3, erv $$4, dje $$5, iw $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, euv.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         jc $$7 = this.i();
         if ($$7 != jc.c && $$7 != jc.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends euv.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, azz $$1, erv $$2, jc $$3) {
         super(esu.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.e() > 6;
      }

      public e(ua $$0) {
         super(esu.x, $$0);
         this.i = $$0.b("Tall", false);
      }

      @Override
      protected void a(est $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static euv.e a(esi $$0, azz $$1, int $$2, int $$3, int $$4, jc $$5, int $$6) {
         erv $$7 = erv.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = erv.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new euv.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(dky $$0, dkv $$1, ede $$2, azz $$3, erv $$4, dje $$5, iw $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, euv.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, dng.bz.m(), dng.bz.m(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dng.n.m(), dng.n.m(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dng.n.m(), dng.n.m(), false);
               this.a($$0, dng.cA.m().b(dwx.e, jc.f), 2, 3, $$10, $$4);
               this.a($$0, dng.cA.m().b(dwx.e, jc.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dng.n.m(), dng.n.m(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dng.n.m(), dng.n.m(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dng.cv.m(), dng.cv.m(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dng.cv.m(), dng.cv.m(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dng.cv.m(), dng.cv.m(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dng.cv.m(), dng.cv.m(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, dng.cv.m(), dng.cv.m(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, dng.cv.m(), dng.cv.m(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, dng.cv.m(), dng.cv.m(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, dng.n.m(), dng.n.m(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, dng.n.m(), dng.n.m(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, dng.n.m(), dng.n.m(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, dng.n.m(), dng.n.m(), false);
            this.a($$0, dng.n.m(), 9, 5, 11, $$4);
            this.a($$0, dng.n.m(), 8, 5, 11, $$4);
            this.a($$0, dng.n.m(), 9, 5, 10, $$4);
            ebg $$12 = dng.el.m().b(dqe.d, Boolean.valueOf(true)).b(dqe.b, Boolean.valueOf(true));
            ebg $$13 = dng.el.m().b(dqe.a, Boolean.valueOf(true)).b(dqe.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, dng.el.m().b(dqe.a, Boolean.valueOf(true)).b(dqe.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, dng.el.m().b(dqe.c, Boolean.valueOf(true)).b(dqe.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, dng.el.m().b(dqe.a, Boolean.valueOf(true)).b(dqe.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, dng.el.m().b(dqe.c, Boolean.valueOf(true)).b(dqe.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, dng.el.m().b(dqe.a, Boolean.valueOf(true)).b(dqe.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            ebg $$15 = dng.da.m().b(drp.b, jc.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            ebg $$18 = dng.el.m().b(dqe.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            ebg $$19 = dng.el.m().b(dqe.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            ebg $$20 = $$13.b(dqe.d, Boolean.valueOf(true)).b(dqe.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.b(dqe.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.b(dqe.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.b(dqe.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.b(dqe.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            ebg $$21 = dng.cz.m();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, faf.v);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, faf.v);
         }
      }
   }

   static class f {
      public final Class<? extends euv.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends euv.p> $$0, int $$1, int $$2) {
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

   public static class g extends euv.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, erv $$1, jc $$2) {
         super(esu.y, $$0, $$1);
         this.a($$2);
      }

      public g(ua $$0) {
         super(esu.y, $$0);
         this.d = $$0.b("Mob", false);
      }

      @Override
      protected void a(est $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(esh $$0, esi $$1, azz $$2) {
         if ($$0 != null) {
            ((euv.m)$$0).b = this;
         }
      }

      public static euv.g a(esi $$0, int $$1, int $$2, int $$3, jc $$4, int $$5) {
         erv $$6 = erv.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new euv.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dky $$0, dkv $$1, ede $$2, azz $$3, erv $$4, dje $$5, iw $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, euv.k);
         this.a($$0, $$3, $$4, euv.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, euv.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, euv.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, euv.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, euv.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, euv.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, euv.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, dng.K.m(), dng.K.m(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, dng.K.m(), dng.K.m(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, euv.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, dng.K.m(), dng.K.m(), false);
         ebg $$8 = dng.fo.m().b(drk.a, Boolean.valueOf(true)).b(drk.c, Boolean.valueOf(true));
         ebg $$9 = dng.fo.m().b(drk.d, Boolean.valueOf(true)).b(drk.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         ebg $$12 = dng.fC.m().b(dvi.b, jc.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, euv.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, euv.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, euv.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         ebg $$14 = dng.fX.m().b(dpv.b, jc.c);
         ebg $$15 = dng.fX.m().b(dpv.b, jc.d);
         ebg $$16 = dng.fX.m().b(dpv.b, jc.f);
         ebg $$17 = dng.fX.m().b(dpv.b, jc.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.b(dpv.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.b(dpv.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.b(dpv.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.b(dpv.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.b(dpv.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.b(dpv.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.b(dpv.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.b(dpv.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.b(dpv.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.b(dpv.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.b(dpv.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.b(dpv.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            ebg $$21 = dng.fW.m();
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
            iw $$22 = this.b(5, 3, 6);
            if ($$4.b($$22)) {
               this.d = true;
               $$0.a($$22, dng.cD.m(), 2);
               if ($$0.c_($$22) instanceof dzw $$24) {
                  $$24.a(bxe.bf, $$3);
               }
            }
         }
      }
   }

   public static class h extends euv.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, azz $$1, erv $$2, jc $$3) {
         super(esu.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(ua $$0) {
         super(esu.z, $$0);
      }

      @Override
      public void a(esh $$0, esi $$1, azz $$2) {
         this.a((euv.m)$$0, $$1, $$2, 1, 1);
      }

      public static euv.h a(esi $$0, azz $$1, int $$2, int $$3, int $$4, jc $$5, int $$6) {
         erv $$7 = erv.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new euv.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dky $$0, dkv $$1, ede $$2, azz $$3, erv $$4, dje $$5, iw $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, euv.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, euv.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, euv.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, euv.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, euv.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, dng.fo.m().b(drk.a, Boolean.valueOf(true)).b(drk.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, dng.fo.m().b(drk.a, Boolean.valueOf(true)).b(drk.c, Boolean.valueOf(true)).b(drk.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, dng.fo.m().b(drk.a, Boolean.valueOf(true)).b(drk.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, dng.fo.m().b(drk.d, Boolean.valueOf(true)).b(drk.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, dng.fo.m().b(drk.d, Boolean.valueOf(true)).b(drk.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, dng.fo.m().b(drk.d, Boolean.valueOf(true)).b(drk.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, dng.fo.m().b(drk.a, Boolean.valueOf(true)).b(drk.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, dng.fo.m().b(drk.a, Boolean.valueOf(true)).b(drk.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         ebg $$8 = dng.dN.m().b(dpl.b, jc.e);
         ebg $$9 = dng.dN.m().b(dpl.b, jc.e).b(dpl.c, ecc.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends euv.q {
      public i(int $$0, azz $$1, erv $$2, jc $$3) {
         super(esu.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(ua $$0) {
         super(esu.A, $$0);
      }

      @Override
      public void a(esh $$0, esi $$1, azz $$2) {
         jc $$3 = this.i();
         if ($$3 != jc.c && $$3 != jc.f) {
            this.b((euv.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((euv.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static euv.i a(esi $$0, azz $$1, int $$2, int $$3, int $$4, jc $$5, int $$6) {
         erv $$7 = erv.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new euv.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dky $$0, dkv $$1, ede $$2, azz $$3, erv $$4, dje $$5, iw $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, euv.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         jc $$7 = this.i();
         if ($$7 != jc.c && $$7 != jc.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends euv.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, azz $$1, erv $$2, jc $$3) {
         super(esu.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(ua $$0) {
         super(esu.B, $$0);
         this.d = $$0.b("Type", 0);
      }

      @Override
      protected void a(est $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(esh $$0, esi $$1, azz $$2) {
         this.a((euv.m)$$0, $$1, $$2, 4, 1);
         this.b((euv.m)$$0, $$1, $$2, 1, 4);
         this.c((euv.m)$$0, $$1, $$2, 1, 4);
      }

      public static euv.j a(esi $$0, azz $$1, int $$2, int $$3, int $$4, jc $$5, int $$6) {
         erv $$7 = erv.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new euv.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dky $$0, dkv $$1, ede $$2, azz $$3, erv $$4, dje $$5, iw $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, euv.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, dng.eZ.m(), 5, 1, 5, $$4);
               this.a($$0, dng.eZ.m(), 5, 2, 5, $$4);
               this.a($$0, dng.eZ.m(), 5, 3, 5, $$4);
               this.a($$0, dng.cA.m().b(dwx.e, jc.e), 4, 3, 5, $$4);
               this.a($$0, dng.cA.m().b(dwx.e, jc.f), 6, 3, 5, $$4);
               this.a($$0, dng.cA.m().b(dwx.e, jc.d), 5, 3, 4, $$4);
               this.a($$0, dng.cA.m().b(dwx.e, jc.c), 5, 3, 6, $$4);
               this.a($$0, dng.kh.m(), 4, 1, 4, $$4);
               this.a($$0, dng.kh.m(), 4, 1, 5, $$4);
               this.a($$0, dng.kh.m(), 4, 1, 6, $$4);
               this.a($$0, dng.kh.m(), 6, 1, 4, $$4);
               this.a($$0, dng.kh.m(), 6, 1, 5, $$4);
               this.a($$0, dng.kh.m(), 6, 1, 6, $$4);
               this.a($$0, dng.kh.m(), 5, 1, 4, $$4);
               this.a($$0, dng.kh.m(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, dng.eZ.m(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, dng.eZ.m(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, dng.eZ.m(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, dng.eZ.m(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, dng.eZ.m(), 5, 1, 5, $$4);
               this.a($$0, dng.eZ.m(), 5, 2, 5, $$4);
               this.a($$0, dng.eZ.m(), 5, 3, 5, $$4);
               this.a($$0, dng.J.m(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, dng.m.m(), 1, 3, $$8, $$4);
                  this.a($$0, dng.m.m(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, dng.m.m(), $$9, 3, 1, $$4);
                  this.a($$0, dng.m.m(), $$9, 3, 9, $$4);
               }

               this.a($$0, dng.m.m(), 5, 1, 4, $$4);
               this.a($$0, dng.m.m(), 5, 1, 6, $$4);
               this.a($$0, dng.m.m(), 5, 3, 4, $$4);
               this.a($$0, dng.m.m(), 5, 3, 6, $$4);
               this.a($$0, dng.m.m(), 4, 1, 5, $$4);
               this.a($$0, dng.m.m(), 6, 1, 5, $$4);
               this.a($$0, dng.m.m(), 4, 3, 5, $$4);
               this.a($$0, dng.m.m(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, dng.m.m(), 4, $$10, 4, $$4);
                  this.a($$0, dng.m.m(), 6, $$10, 4, $$4);
                  this.a($$0, dng.m.m(), 4, $$10, 6, $$4);
                  this.a($$0, dng.m.m(), 6, $$10, 6, $$4);
               }

               this.a($$0, dng.cA.m(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, dng.n.m(), 2, 3, $$11, $$4);
                  this.a($$0, dng.n.m(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, dng.n.m(), 4, 3, $$11, $$4);
                     this.a($$0, dng.n.m(), 5, 3, $$11, $$4);
                     this.a($$0, dng.n.m(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, dng.n.m(), 7, 3, $$11, $$4);
                  this.a($$0, dng.n.m(), 8, 3, $$11, $$4);
               }

               ebg $$12 = dng.da.m().b(drp.b, jc.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, faf.w);
         }
      }
   }

   static class k extends esh.a {
      @Override
      public void a(azz $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = dng.fb.m();
            } else if ($$5 < 0.5F) {
               this.a = dng.fa.m();
            } else if ($$5 < 0.55F) {
               this.a = dng.fh.m();
            } else {
               this.a = dng.eZ.m();
            }
         } else {
            this.a = dng.nI.m();
         }
      }
   }

   public static class l extends euv.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(esu $$0, int $$1, int $$2, int $$3, jc $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = euv.p.a.a;
      }

      public l(int $$0, azz $$1, erv $$2, jc $$3) {
         super(esu.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(esu $$0, ua $$1) {
         super($$0, $$1);
         this.d = $$1.b("Source", false);
      }

      public l(ua $$0) {
         this(esu.C, $$0);
      }

      @Override
      protected void a(est $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(esh $$0, esi $$1, azz $$2) {
         if (this.d) {
            euv.i = euv.c.class;
         }

         this.a((euv.m)$$0, $$1, $$2, 1, 1);
      }

      public static euv.l a(esi $$0, azz $$1, int $$2, int $$3, int $$4, jc $$5, int $$6) {
         erv $$7 = erv.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new euv.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dky $$0, dkv $$1, ede $$2, azz $$3, erv $$4, dje $$5, iw $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, euv.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, euv.p.a.a, 1, 1, 4);
         this.a($$0, dng.eZ.m(), 2, 6, 1, $$4);
         this.a($$0, dng.eZ.m(), 1, 5, 1, $$4);
         this.a($$0, dng.kh.m(), 1, 6, 1, $$4);
         this.a($$0, dng.eZ.m(), 1, 5, 2, $$4);
         this.a($$0, dng.eZ.m(), 1, 4, 3, $$4);
         this.a($$0, dng.kh.m(), 1, 5, 3, $$4);
         this.a($$0, dng.eZ.m(), 2, 4, 3, $$4);
         this.a($$0, dng.eZ.m(), 3, 3, 3, $$4);
         this.a($$0, dng.kh.m(), 3, 4, 3, $$4);
         this.a($$0, dng.eZ.m(), 3, 3, 2, $$4);
         this.a($$0, dng.eZ.m(), 3, 2, 1, $$4);
         this.a($$0, dng.kh.m(), 3, 3, 1, $$4);
         this.a($$0, dng.eZ.m(), 2, 2, 1, $$4);
         this.a($$0, dng.eZ.m(), 1, 1, 1, $$4);
         this.a($$0, dng.kh.m(), 1, 2, 1, $$4);
         this.a($$0, dng.eZ.m(), 1, 1, 2, $$4);
         this.a($$0, dng.kh.m(), 1, 1, 3, $$4);
      }
   }

   public static class m extends euv.l {
      public euv.f a;
      @Nullable
      public euv.g b;
      public final List<esh> c = Lists.newArrayList();

      public m(azz $$0, int $$1, int $$2) {
         super(esu.D, 0, $$1, $$2, a($$0));
      }

      public m(ua $$0) {
         super(esu.D, $$0);
      }

      @Override
      public iw h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends euv.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, azz $$1, erv $$2, jc $$3) {
         super(esu.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(ua $$0) {
         super(esu.E, $$0);
         this.d = $$0.b("Left", false);
         this.i = $$0.b("Right", false);
      }

      @Override
      protected void a(est $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(esh $$0, esi $$1, azz $$2) {
         this.a((euv.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((euv.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((euv.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static euv.n a(esi $$0, azz $$1, int $$2, int $$3, int $$4, jc $$5, int $$6) {
         erv $$7 = erv.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new euv.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dky $$0, dkv $$1, ede $$2, azz $$3, erv $$4, dje $$5, iw $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, euv.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, euv.p.a.a, 1, 1, 6);
         ebg $$7 = dng.cA.m().b(dwx.e, jc.f);
         ebg $$8 = dng.cA.m().b(dwx.e, jc.e);
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

   public static class o extends euv.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, azz $$1, erv $$2, jc $$3) {
         super(esu.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(ua $$0) {
         super(esu.F, $$0);
      }

      @Override
      public void a(esh $$0, esi $$1, azz $$2) {
         this.a((euv.m)$$0, $$1, $$2, 1, 1);
      }

      public static euv.o a(esi $$0, azz $$1, int $$2, int $$3, int $$4, jc $$5, int $$6) {
         erv $$7 = erv.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new euv.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dky $$0, dkv $$1, ede $$2, azz $$3, erv $$4, dje $$5, iw $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, euv.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, euv.p.a.a, 1, 1, 7);
         ebg $$7 = dng.dc.m().b(dvi.b, jc.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, dng.eZ.m(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dng.eZ.m(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dng.eZ.m(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends esh {
      protected euv.p.a h = euv.p.a.a;

      protected p(esu $$0, int $$1, erv $$2) {
         super($$0, $$1, $$2);
      }

      public p(esu $$0, ua $$1) {
         super($$0, $$1);
         this.h = $$1.<euv.p.a>a("EntryDoor", euv.p.a.e).orElseThrow();
      }

      @Override
      protected void a(est $$0, ua $$1) {
         $$1.a("EntryDoor", euv.p.a.e, this.h);
      }

      protected void a(dky $$0, azz $$1, erv $$2, euv.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, dng.eZ.m(), $$4, $$5, $$6, $$2);
               this.a($$0, dng.eZ.m(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dng.eZ.m(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dng.eZ.m(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dng.eZ.m(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dng.eZ.m(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dng.eZ.m(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dng.cZ.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dng.cZ.m().b(dpl.c, ecc.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, dng.nI.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dng.nI.m(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dng.fo.m().b(drk.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, dng.fo.m().b(drk.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dng.fo.m().b(drk.b, Boolean.valueOf(true)).b(drk.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dng.fo.m().b(drk.b, Boolean.valueOf(true)).b(drk.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dng.fo.m().b(drk.b, Boolean.valueOf(true)).b(drk.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dng.fo.m().b(drk.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dng.fo.m().b(drk.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, dng.eZ.m(), $$4, $$5, $$6, $$2);
               this.a($$0, dng.eZ.m(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dng.eZ.m(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dng.eZ.m(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dng.eZ.m(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dng.eZ.m(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dng.eZ.m(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dng.dN.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dng.dN.m().b(dpl.c, ecc.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dng.ec.m().b(dnp.e, jc.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, dng.ec.m().b(dnp.e, jc.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected euv.p.a b(azz $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return euv.p.a.a;
            case 2:
               return euv.p.a.b;
            case 3:
               return euv.p.a.c;
            case 4:
               return euv.p.a.d;
         }
      }

      @Nullable
      protected esh a(euv.m $$0, esi $$1, azz $$2, int $$3, int $$4) {
         jc $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return euv.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$5, this.g());
               case d:
                  return euv.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$5, this.g());
               case e:
                  return euv.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
               case f:
                  return euv.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected esh b(euv.m $$0, esi $$1, azz $$2, int $$3, int $$4) {
         jc $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return euv.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jc.e, this.g());
               case d:
                  return euv.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jc.e, this.g());
               case e:
                  return euv.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jc.c, this.g());
               case f:
                  return euv.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jc.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected esh c(euv.m $$0, esi $$1, azz $$2, int $$3, int $$4) {
         jc $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return euv.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jc.f, this.g());
               case d:
                  return euv.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jc.f, this.g());
               case e:
                  return euv.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jc.d, this.g());
               case f:
                  return euv.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jc.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(erv $$0) {
         return $$0 != null && $$0.i() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;

         @Deprecated
         public static final Codec<euv.p.a> e = ayy.c(euv.p.a::valueOf);
      }
   }

   public abstract static class q extends euv.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(esu $$0, int $$1, erv $$2) {
         super($$0, $$1, $$2);
      }

      public q(esu $$0, ua $$1) {
         super($$0, $$1);
      }
   }
}
