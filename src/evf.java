import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class evf {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final evf.f[] g = new evf.f[]{
      new evf.f(evf.n.class, 40, 0),
      new evf.f(evf.h.class, 5, 5),
      new evf.f(evf.d.class, 20, 0),
      new evf.f(evf.i.class, 20, 0),
      new evf.f(evf.j.class, 10, 6),
      new evf.f(evf.o.class, 5, 5),
      new evf.f(evf.l.class, 5, 5),
      new evf.f(evf.c.class, 5, 4),
      new evf.f(evf.a.class, 5, 4),
      new evf.f(evf.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new evf.f(evf.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<evf.f> h;
   static Class<? extends evf.p> i;
   private static int j;
   static final evf.k k = new evf.k();

   public static void a() {
      h = Lists.newArrayList();

      for (evf.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (evf.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static evf.p a(Class<? extends evf.p> $$0, ess $$1, bai $$2, int $$3, int $$4, int $$5, @Nullable jc $$6, int $$7) {
      evf.p $$8 = null;
      if ($$0 == evf.n.class) {
         $$8 = evf.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == evf.h.class) {
         $$8 = evf.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == evf.d.class) {
         $$8 = evf.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == evf.i.class) {
         $$8 = evf.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == evf.j.class) {
         $$8 = evf.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == evf.o.class) {
         $$8 = evf.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == evf.l.class) {
         $$8 = evf.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == evf.c.class) {
         $$8 = evf.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == evf.a.class) {
         $$8 = evf.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == evf.e.class) {
         $$8 = evf.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == evf.g.class) {
         $$8 = evf.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static evf.p a(evf.m $$0, ess $$1, bai $$2, int $$3, int $$4, int $$5, jc $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            evf.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (evf.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  evf.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         esf $$13 = evf.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.i() > 1 ? new evf.b($$7, $$13, $$6) : null;
      }
   }

   static esr b(evf.m $$0, ess $$1, bai $$2, int $$3, int $$4, int $$5, @Nullable jc $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
         esr $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends evf.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, bai $$1, esf $$2, jc $$3) {
         super(ete.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(ua $$0) {
         super(ete.t, $$0);
         this.d = $$0.b("Chest", false);
      }

      @Override
      protected void a(etd $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(esr $$0, ess $$1, bai $$2) {
         this.a((evf.m)$$0, $$1, $$2, 1, 1);
      }

      public static evf.a a(ess $$0, bai $$1, int $$2, int $$3, int $$4, jc $$5, int $$6) {
         esf $$7 = esf.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new evf.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dli $$0, dlf $$1, edo $$2, bai $$3, esf $$4, djo $$5, iw $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, evf.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, evf.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, dnq.eZ.m(), dnq.eZ.m(), false);
         this.a($$0, dnq.kn.m(), 3, 1, 1, $$4);
         this.a($$0, dnq.kn.m(), 3, 1, 5, $$4);
         this.a($$0, dnq.kn.m(), 3, 2, 2, $$4);
         this.a($$0, dnq.kn.m(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, dnq.kn.m(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, fap.x);
         }
      }
   }

   public static class b extends evf.p {
      private final int a;

      public b(int $$0, esf $$1, jc $$2) {
         super(ete.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != jc.c && $$2 != jc.d ? $$1.d() : $$1.f();
      }

      public b(ua $$0) {
         super(ete.u, $$0);
         this.a = $$0.b("Steps", 0);
      }

      @Override
      protected void a(etd $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static esf a(ess $$0, bai $$1, int $$2, int $$3, int $$4, jc $$5) {
         int $$6 = 3;
         esf $$7 = esf.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         esr $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().i() == $$7.i()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = esf.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return esf.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(dli $$0, dlf $$1, edo $$2, bai $$3, esf $$4, djo $$5, iw $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, dnq.eZ.m(), 0, 0, $$7, $$4);
            this.a($$0, dnq.eZ.m(), 1, 0, $$7, $$4);
            this.a($$0, dnq.eZ.m(), 2, 0, $$7, $$4);
            this.a($$0, dnq.eZ.m(), 3, 0, $$7, $$4);
            this.a($$0, dnq.eZ.m(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, dnq.eZ.m(), 0, $$8, $$7, $$4);
               this.a($$0, dnq.nI.m(), 1, $$8, $$7, $$4);
               this.a($$0, dnq.nI.m(), 2, $$8, $$7, $$4);
               this.a($$0, dnq.nI.m(), 3, $$8, $$7, $$4);
               this.a($$0, dnq.eZ.m(), 4, $$8, $$7, $$4);
            }

            this.a($$0, dnq.eZ.m(), 0, 4, $$7, $$4);
            this.a($$0, dnq.eZ.m(), 1, 4, $$7, $$4);
            this.a($$0, dnq.eZ.m(), 2, 4, $$7, $$4);
            this.a($$0, dnq.eZ.m(), 3, 4, $$7, $$4);
            this.a($$0, dnq.eZ.m(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends evf.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, bai $$1, esf $$2, jc $$3) {
         super(ete.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(ua $$0) {
         super(ete.v, $$0);
         this.d = $$0.b("leftLow", false);
         this.i = $$0.b("leftHigh", false);
         this.j = $$0.b("rightLow", false);
         this.k = $$0.b("rightHigh", false);
      }

      @Override
      protected void a(etd $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(esr $$0, ess $$1, bai $$2) {
         int $$3 = 3;
         int $$4 = 5;
         jc $$5 = this.i();
         if ($$5 == jc.e || $$5 == jc.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((evf.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((evf.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((evf.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((evf.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((evf.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static evf.c a(ess $$0, bai $$1, int $$2, int $$3, int $$4, jc $$5, int $$6) {
         esf $$7 = esf.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new evf.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dli $$0, dlf $$1, edo $$2, bai $$3, esf $$4, djo $$5, iw $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, evf.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, evf.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, evf.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, evf.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, evf.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, evf.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, dnq.kh.m(), dnq.kh.m(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, dnq.kh.m(), dnq.kh.m(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, evf.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, dnq.kh.m(), dnq.kh.m(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, dnq.kh.m(), dnq.kh.m(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, dnq.kh.m(), dnq.kh.m(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, dnq.kh.m(), dnq.kh.m(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, dnq.kh.m().b(dvb.b, ecy.c), dnq.kh.m().b(dvb.b, ecy.c), false);
         this.a($$0, dnq.cA.m().b(dxh.e, jc.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends evf.q {
      public d(int $$0, bai $$1, esf $$2, jc $$3) {
         super(ete.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(ua $$0) {
         super(ete.w, $$0);
      }

      @Override
      public void a(esr $$0, ess $$1, bai $$2) {
         jc $$3 = this.i();
         if ($$3 != jc.c && $$3 != jc.f) {
            this.c((evf.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((evf.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static evf.d a(ess $$0, bai $$1, int $$2, int $$3, int $$4, jc $$5, int $$6) {
         esf $$7 = esf.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new evf.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dli $$0, dlf $$1, edo $$2, bai $$3, esf $$4, djo $$5, iw $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, evf.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         jc $$7 = this.i();
         if ($$7 != jc.c && $$7 != jc.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends evf.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, bai $$1, esf $$2, jc $$3) {
         super(ete.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.e() > 6;
      }

      public e(ua $$0) {
         super(ete.x, $$0);
         this.i = $$0.b("Tall", false);
      }

      @Override
      protected void a(etd $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static evf.e a(ess $$0, bai $$1, int $$2, int $$3, int $$4, jc $$5, int $$6) {
         esf $$7 = esf.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = esf.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new evf.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(dli $$0, dlf $$1, edo $$2, bai $$3, esf $$4, djo $$5, iw $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, evf.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, dnq.bz.m(), dnq.bz.m(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dnq.n.m(), dnq.n.m(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dnq.n.m(), dnq.n.m(), false);
               this.a($$0, dnq.cA.m().b(dxh.e, jc.f), 2, 3, $$10, $$4);
               this.a($$0, dnq.cA.m().b(dxh.e, jc.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dnq.n.m(), dnq.n.m(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dnq.n.m(), dnq.n.m(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dnq.cv.m(), dnq.cv.m(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dnq.cv.m(), dnq.cv.m(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dnq.cv.m(), dnq.cv.m(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dnq.cv.m(), dnq.cv.m(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, dnq.cv.m(), dnq.cv.m(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, dnq.cv.m(), dnq.cv.m(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, dnq.cv.m(), dnq.cv.m(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, dnq.n.m(), dnq.n.m(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, dnq.n.m(), dnq.n.m(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, dnq.n.m(), dnq.n.m(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, dnq.n.m(), dnq.n.m(), false);
            this.a($$0, dnq.n.m(), 9, 5, 11, $$4);
            this.a($$0, dnq.n.m(), 8, 5, 11, $$4);
            this.a($$0, dnq.n.m(), 9, 5, 10, $$4);
            ebq $$12 = dnq.el.m().b(dqo.d, Boolean.valueOf(true)).b(dqo.b, Boolean.valueOf(true));
            ebq $$13 = dnq.el.m().b(dqo.a, Boolean.valueOf(true)).b(dqo.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, dnq.el.m().b(dqo.a, Boolean.valueOf(true)).b(dqo.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, dnq.el.m().b(dqo.c, Boolean.valueOf(true)).b(dqo.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, dnq.el.m().b(dqo.a, Boolean.valueOf(true)).b(dqo.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, dnq.el.m().b(dqo.c, Boolean.valueOf(true)).b(dqo.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, dnq.el.m().b(dqo.a, Boolean.valueOf(true)).b(dqo.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            ebq $$15 = dnq.da.m().b(drz.b, jc.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            ebq $$18 = dnq.el.m().b(dqo.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            ebq $$19 = dnq.el.m().b(dqo.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            ebq $$20 = $$13.b(dqo.d, Boolean.valueOf(true)).b(dqo.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.b(dqo.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.b(dqo.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.b(dqo.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.b(dqo.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            ebq $$21 = dnq.cz.m();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, fap.v);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, fap.v);
         }
      }
   }

   static class f {
      public final Class<? extends evf.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends evf.p> $$0, int $$1, int $$2) {
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

   public static class g extends evf.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, esf $$1, jc $$2) {
         super(ete.y, $$0, $$1);
         this.a($$2);
      }

      public g(ua $$0) {
         super(ete.y, $$0);
         this.d = $$0.b("Mob", false);
      }

      @Override
      protected void a(etd $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(esr $$0, ess $$1, bai $$2) {
         if ($$0 != null) {
            ((evf.m)$$0).b = this;
         }
      }

      public static evf.g a(ess $$0, int $$1, int $$2, int $$3, jc $$4, int $$5) {
         esf $$6 = esf.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new evf.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dli $$0, dlf $$1, edo $$2, bai $$3, esf $$4, djo $$5, iw $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, evf.k);
         this.a($$0, $$3, $$4, evf.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, evf.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, evf.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, evf.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, evf.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, evf.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, evf.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, dnq.K.m(), dnq.K.m(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, dnq.K.m(), dnq.K.m(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, evf.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, dnq.K.m(), dnq.K.m(), false);
         ebq $$8 = dnq.fo.m().b(dru.a, Boolean.valueOf(true)).b(dru.c, Boolean.valueOf(true));
         ebq $$9 = dnq.fo.m().b(dru.d, Boolean.valueOf(true)).b(dru.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         ebq $$12 = dnq.fC.m().b(dvs.b, jc.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, evf.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, evf.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, evf.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         ebq $$14 = dnq.fX.m().b(dqf.b, jc.c);
         ebq $$15 = dnq.fX.m().b(dqf.b, jc.d);
         ebq $$16 = dnq.fX.m().b(dqf.b, jc.f);
         ebq $$17 = dnq.fX.m().b(dqf.b, jc.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.b(dqf.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.b(dqf.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.b(dqf.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.b(dqf.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.b(dqf.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.b(dqf.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.b(dqf.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.b(dqf.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.b(dqf.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.b(dqf.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.b(dqf.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.b(dqf.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            ebq $$21 = dnq.fW.m();
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
               $$0.a($$22, dnq.cD.m(), 2);
               if ($$0.c_($$22) instanceof eag $$24) {
                  $$24.a(bxn.bf, $$3);
               }
            }
         }
      }
   }

   public static class h extends evf.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, bai $$1, esf $$2, jc $$3) {
         super(ete.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(ua $$0) {
         super(ete.z, $$0);
      }

      @Override
      public void a(esr $$0, ess $$1, bai $$2) {
         this.a((evf.m)$$0, $$1, $$2, 1, 1);
      }

      public static evf.h a(ess $$0, bai $$1, int $$2, int $$3, int $$4, jc $$5, int $$6) {
         esf $$7 = esf.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new evf.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dli $$0, dlf $$1, edo $$2, bai $$3, esf $$4, djo $$5, iw $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, evf.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, evf.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, evf.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, evf.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, evf.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, dnq.fo.m().b(dru.a, Boolean.valueOf(true)).b(dru.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, dnq.fo.m().b(dru.a, Boolean.valueOf(true)).b(dru.c, Boolean.valueOf(true)).b(dru.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, dnq.fo.m().b(dru.a, Boolean.valueOf(true)).b(dru.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, dnq.fo.m().b(dru.d, Boolean.valueOf(true)).b(dru.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, dnq.fo.m().b(dru.d, Boolean.valueOf(true)).b(dru.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, dnq.fo.m().b(dru.d, Boolean.valueOf(true)).b(dru.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, dnq.fo.m().b(dru.a, Boolean.valueOf(true)).b(dru.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, dnq.fo.m().b(dru.a, Boolean.valueOf(true)).b(dru.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         ebq $$8 = dnq.dN.m().b(dpv.b, jc.e);
         ebq $$9 = dnq.dN.m().b(dpv.b, jc.e).b(dpv.c, ecm.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends evf.q {
      public i(int $$0, bai $$1, esf $$2, jc $$3) {
         super(ete.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(ua $$0) {
         super(ete.A, $$0);
      }

      @Override
      public void a(esr $$0, ess $$1, bai $$2) {
         jc $$3 = this.i();
         if ($$3 != jc.c && $$3 != jc.f) {
            this.b((evf.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((evf.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static evf.i a(ess $$0, bai $$1, int $$2, int $$3, int $$4, jc $$5, int $$6) {
         esf $$7 = esf.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new evf.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dli $$0, dlf $$1, edo $$2, bai $$3, esf $$4, djo $$5, iw $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, evf.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         jc $$7 = this.i();
         if ($$7 != jc.c && $$7 != jc.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends evf.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, bai $$1, esf $$2, jc $$3) {
         super(ete.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(ua $$0) {
         super(ete.B, $$0);
         this.d = $$0.b("Type", 0);
      }

      @Override
      protected void a(etd $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(esr $$0, ess $$1, bai $$2) {
         this.a((evf.m)$$0, $$1, $$2, 4, 1);
         this.b((evf.m)$$0, $$1, $$2, 1, 4);
         this.c((evf.m)$$0, $$1, $$2, 1, 4);
      }

      public static evf.j a(ess $$0, bai $$1, int $$2, int $$3, int $$4, jc $$5, int $$6) {
         esf $$7 = esf.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new evf.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dli $$0, dlf $$1, edo $$2, bai $$3, esf $$4, djo $$5, iw $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, evf.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, dnq.eZ.m(), 5, 1, 5, $$4);
               this.a($$0, dnq.eZ.m(), 5, 2, 5, $$4);
               this.a($$0, dnq.eZ.m(), 5, 3, 5, $$4);
               this.a($$0, dnq.cA.m().b(dxh.e, jc.e), 4, 3, 5, $$4);
               this.a($$0, dnq.cA.m().b(dxh.e, jc.f), 6, 3, 5, $$4);
               this.a($$0, dnq.cA.m().b(dxh.e, jc.d), 5, 3, 4, $$4);
               this.a($$0, dnq.cA.m().b(dxh.e, jc.c), 5, 3, 6, $$4);
               this.a($$0, dnq.kh.m(), 4, 1, 4, $$4);
               this.a($$0, dnq.kh.m(), 4, 1, 5, $$4);
               this.a($$0, dnq.kh.m(), 4, 1, 6, $$4);
               this.a($$0, dnq.kh.m(), 6, 1, 4, $$4);
               this.a($$0, dnq.kh.m(), 6, 1, 5, $$4);
               this.a($$0, dnq.kh.m(), 6, 1, 6, $$4);
               this.a($$0, dnq.kh.m(), 5, 1, 4, $$4);
               this.a($$0, dnq.kh.m(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, dnq.eZ.m(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, dnq.eZ.m(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, dnq.eZ.m(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, dnq.eZ.m(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, dnq.eZ.m(), 5, 1, 5, $$4);
               this.a($$0, dnq.eZ.m(), 5, 2, 5, $$4);
               this.a($$0, dnq.eZ.m(), 5, 3, 5, $$4);
               this.a($$0, dnq.J.m(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, dnq.m.m(), 1, 3, $$8, $$4);
                  this.a($$0, dnq.m.m(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, dnq.m.m(), $$9, 3, 1, $$4);
                  this.a($$0, dnq.m.m(), $$9, 3, 9, $$4);
               }

               this.a($$0, dnq.m.m(), 5, 1, 4, $$4);
               this.a($$0, dnq.m.m(), 5, 1, 6, $$4);
               this.a($$0, dnq.m.m(), 5, 3, 4, $$4);
               this.a($$0, dnq.m.m(), 5, 3, 6, $$4);
               this.a($$0, dnq.m.m(), 4, 1, 5, $$4);
               this.a($$0, dnq.m.m(), 6, 1, 5, $$4);
               this.a($$0, dnq.m.m(), 4, 3, 5, $$4);
               this.a($$0, dnq.m.m(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, dnq.m.m(), 4, $$10, 4, $$4);
                  this.a($$0, dnq.m.m(), 6, $$10, 4, $$4);
                  this.a($$0, dnq.m.m(), 4, $$10, 6, $$4);
                  this.a($$0, dnq.m.m(), 6, $$10, 6, $$4);
               }

               this.a($$0, dnq.cA.m(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, dnq.n.m(), 2, 3, $$11, $$4);
                  this.a($$0, dnq.n.m(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, dnq.n.m(), 4, 3, $$11, $$4);
                     this.a($$0, dnq.n.m(), 5, 3, $$11, $$4);
                     this.a($$0, dnq.n.m(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, dnq.n.m(), 7, 3, $$11, $$4);
                  this.a($$0, dnq.n.m(), 8, 3, $$11, $$4);
               }

               ebq $$12 = dnq.da.m().b(drz.b, jc.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, fap.w);
         }
      }
   }

   static class k extends esr.a {
      @Override
      public void a(bai $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = dnq.fb.m();
            } else if ($$5 < 0.5F) {
               this.a = dnq.fa.m();
            } else if ($$5 < 0.55F) {
               this.a = dnq.fh.m();
            } else {
               this.a = dnq.eZ.m();
            }
         } else {
            this.a = dnq.nI.m();
         }
      }
   }

   public static class l extends evf.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(ete $$0, int $$1, int $$2, int $$3, jc $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = evf.p.a.a;
      }

      public l(int $$0, bai $$1, esf $$2, jc $$3) {
         super(ete.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(ete $$0, ua $$1) {
         super($$0, $$1);
         this.d = $$1.b("Source", false);
      }

      public l(ua $$0) {
         this(ete.C, $$0);
      }

      @Override
      protected void a(etd $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(esr $$0, ess $$1, bai $$2) {
         if (this.d) {
            evf.i = evf.c.class;
         }

         this.a((evf.m)$$0, $$1, $$2, 1, 1);
      }

      public static evf.l a(ess $$0, bai $$1, int $$2, int $$3, int $$4, jc $$5, int $$6) {
         esf $$7 = esf.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new evf.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dli $$0, dlf $$1, edo $$2, bai $$3, esf $$4, djo $$5, iw $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, evf.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, evf.p.a.a, 1, 1, 4);
         this.a($$0, dnq.eZ.m(), 2, 6, 1, $$4);
         this.a($$0, dnq.eZ.m(), 1, 5, 1, $$4);
         this.a($$0, dnq.kh.m(), 1, 6, 1, $$4);
         this.a($$0, dnq.eZ.m(), 1, 5, 2, $$4);
         this.a($$0, dnq.eZ.m(), 1, 4, 3, $$4);
         this.a($$0, dnq.kh.m(), 1, 5, 3, $$4);
         this.a($$0, dnq.eZ.m(), 2, 4, 3, $$4);
         this.a($$0, dnq.eZ.m(), 3, 3, 3, $$4);
         this.a($$0, dnq.kh.m(), 3, 4, 3, $$4);
         this.a($$0, dnq.eZ.m(), 3, 3, 2, $$4);
         this.a($$0, dnq.eZ.m(), 3, 2, 1, $$4);
         this.a($$0, dnq.kh.m(), 3, 3, 1, $$4);
         this.a($$0, dnq.eZ.m(), 2, 2, 1, $$4);
         this.a($$0, dnq.eZ.m(), 1, 1, 1, $$4);
         this.a($$0, dnq.kh.m(), 1, 2, 1, $$4);
         this.a($$0, dnq.eZ.m(), 1, 1, 2, $$4);
         this.a($$0, dnq.kh.m(), 1, 1, 3, $$4);
      }
   }

   public static class m extends evf.l {
      public evf.f a;
      @Nullable
      public evf.g b;
      public final List<esr> c = Lists.newArrayList();

      public m(bai $$0, int $$1, int $$2) {
         super(ete.D, 0, $$1, $$2, a($$0));
      }

      public m(ua $$0) {
         super(ete.D, $$0);
      }

      @Override
      public iw h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends evf.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, bai $$1, esf $$2, jc $$3) {
         super(ete.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(ua $$0) {
         super(ete.E, $$0);
         this.d = $$0.b("Left", false);
         this.i = $$0.b("Right", false);
      }

      @Override
      protected void a(etd $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(esr $$0, ess $$1, bai $$2) {
         this.a((evf.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((evf.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((evf.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static evf.n a(ess $$0, bai $$1, int $$2, int $$3, int $$4, jc $$5, int $$6) {
         esf $$7 = esf.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new evf.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dli $$0, dlf $$1, edo $$2, bai $$3, esf $$4, djo $$5, iw $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, evf.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, evf.p.a.a, 1, 1, 6);
         ebq $$7 = dnq.cA.m().b(dxh.e, jc.f);
         ebq $$8 = dnq.cA.m().b(dxh.e, jc.e);
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

   public static class o extends evf.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, bai $$1, esf $$2, jc $$3) {
         super(ete.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(ua $$0) {
         super(ete.F, $$0);
      }

      @Override
      public void a(esr $$0, ess $$1, bai $$2) {
         this.a((evf.m)$$0, $$1, $$2, 1, 1);
      }

      public static evf.o a(ess $$0, bai $$1, int $$2, int $$3, int $$4, jc $$5, int $$6) {
         esf $$7 = esf.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new evf.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dli $$0, dlf $$1, edo $$2, bai $$3, esf $$4, djo $$5, iw $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, evf.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, evf.p.a.a, 1, 1, 7);
         ebq $$7 = dnq.dc.m().b(dvs.b, jc.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, dnq.eZ.m(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dnq.eZ.m(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dnq.eZ.m(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends esr {
      protected evf.p.a h = evf.p.a.a;

      protected p(ete $$0, int $$1, esf $$2) {
         super($$0, $$1, $$2);
      }

      public p(ete $$0, ua $$1) {
         super($$0, $$1);
         this.h = $$1.<evf.p.a>a("EntryDoor", evf.p.a.e).orElseThrow();
      }

      @Override
      protected void a(etd $$0, ua $$1) {
         $$1.a("EntryDoor", evf.p.a.e, this.h);
      }

      protected void a(dli $$0, bai $$1, esf $$2, evf.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, dnq.eZ.m(), $$4, $$5, $$6, $$2);
               this.a($$0, dnq.eZ.m(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dnq.eZ.m(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dnq.eZ.m(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dnq.eZ.m(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dnq.eZ.m(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dnq.eZ.m(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dnq.cZ.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dnq.cZ.m().b(dpv.c, ecm.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, dnq.nI.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dnq.nI.m(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dnq.fo.m().b(dru.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, dnq.fo.m().b(dru.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dnq.fo.m().b(dru.b, Boolean.valueOf(true)).b(dru.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dnq.fo.m().b(dru.b, Boolean.valueOf(true)).b(dru.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dnq.fo.m().b(dru.b, Boolean.valueOf(true)).b(dru.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dnq.fo.m().b(dru.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dnq.fo.m().b(dru.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, dnq.eZ.m(), $$4, $$5, $$6, $$2);
               this.a($$0, dnq.eZ.m(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dnq.eZ.m(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dnq.eZ.m(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dnq.eZ.m(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dnq.eZ.m(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dnq.eZ.m(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dnq.dN.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dnq.dN.m().b(dpv.c, ecm.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dnq.ec.m().b(dnz.e, jc.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, dnq.ec.m().b(dnz.e, jc.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected evf.p.a b(bai $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return evf.p.a.a;
            case 2:
               return evf.p.a.b;
            case 3:
               return evf.p.a.c;
            case 4:
               return evf.p.a.d;
         }
      }

      @Nullable
      protected esr a(evf.m $$0, ess $$1, bai $$2, int $$3, int $$4) {
         jc $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return evf.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$5, this.g());
               case d:
                  return evf.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$5, this.g());
               case e:
                  return evf.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
               case f:
                  return evf.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected esr b(evf.m $$0, ess $$1, bai $$2, int $$3, int $$4) {
         jc $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return evf.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jc.e, this.g());
               case d:
                  return evf.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jc.e, this.g());
               case e:
                  return evf.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jc.c, this.g());
               case f:
                  return evf.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jc.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected esr c(evf.m $$0, ess $$1, bai $$2, int $$3, int $$4) {
         jc $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return evf.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jc.f, this.g());
               case d:
                  return evf.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jc.f, this.g());
               case e:
                  return evf.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jc.d, this.g());
               case f:
                  return evf.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jc.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(esf $$0) {
         return $$0 != null && $$0.i() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;

         @Deprecated
         public static final Codec<evf.p.a> e = azg.c(evf.p.a::valueOf);
      }
   }

   public abstract static class q extends evf.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(ete $$0, int $$1, esf $$2) {
         super($$0, $$1, $$2);
      }

      public q(ete $$0, ua $$1) {
         super($$0, $$1);
      }
   }
}
