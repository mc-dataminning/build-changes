import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class eec {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final eec.f[] g = new eec.f[]{
      new eec.f(eec.n.class, 40, 0),
      new eec.f(eec.h.class, 5, 5),
      new eec.f(eec.d.class, 20, 0),
      new eec.f(eec.i.class, 20, 0),
      new eec.f(eec.j.class, 10, 6),
      new eec.f(eec.o.class, 5, 5),
      new eec.f(eec.l.class, 5, 5),
      new eec.f(eec.c.class, 5, 4),
      new eec.f(eec.a.class, 5, 4),
      new eec.f(eec.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new eec.f(eec.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<eec.f> h;
   static Class<? extends eec.p> i;
   private static int j;
   static final eec.k k = new eec.k();

   public static void a() {
      h = Lists.newArrayList();

      for (eec.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (eec.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static eec.p a(Class<? extends eec.p> $$0, ebq $$1, awp $$2, int $$3, int $$4, int $$5, @Nullable ie $$6, int $$7) {
      eec.p $$8 = null;
      if ($$0 == eec.n.class) {
         $$8 = eec.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eec.h.class) {
         $$8 = eec.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eec.d.class) {
         $$8 = eec.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eec.i.class) {
         $$8 = eec.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eec.j.class) {
         $$8 = eec.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eec.o.class) {
         $$8 = eec.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eec.l.class) {
         $$8 = eec.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eec.c.class) {
         $$8 = eec.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eec.a.class) {
         $$8 = eec.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eec.e.class) {
         $$8 = eec.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eec.g.class) {
         $$8 = eec.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static eec.p a(eec.m $$0, ebq $$1, awp $$2, int $$3, int $$4, int $$5, ie $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            eec.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (eec.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  eec.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         ebd $$13 = eec.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.i() > 1 ? new eec.b($$7, $$13, $$6) : null;
      }
   }

   static ebp b(eec.m $$0, ebq $$1, awp $$2, int $$3, int $$4, int $$5, @Nullable ie $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
         ebp $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends eec.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, awp $$1, ebd $$2, ie $$3) {
         super(ecc.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(sw $$0) {
         super(ecc.t, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(ecb $$0, sw $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(ebp $$0, ebq $$1, awp $$2) {
         this.a((eec.m)$$0, $$1, $$2, 1, 1);
      }

      public static eec.a a(ebq $$0, awp $$1, int $$2, int $$3, int $$4, ie $$5, int $$6) {
         ebd $$7 = ebd.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new eec.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cwm $$0, cwk $$1, dng $$2, awp $$3, ebd $$4, cuy $$5, hz $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, eec.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, eec.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, cyu.eH.o(), cyu.eH.o(), false);
         this.a($$0, cyu.jK.o(), 3, 1, 1, $$4);
         this.a($$0, cyu.jK.o(), 3, 1, 5, $$4);
         this.a($$0, cyu.jK.o(), 3, 2, 2, $$4);
         this.a($$0, cyu.jK.o(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, cyu.jK.o(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, eja.y);
         }
      }
   }

   public static class b extends eec.p {
      private final int a;

      public b(int $$0, ebd $$1, ie $$2) {
         super(ecc.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != ie.c && $$2 != ie.d ? $$1.d() : $$1.f();
      }

      public b(sw $$0) {
         super(ecc.u, $$0);
         this.a = $$0.h("Steps");
      }

      @Override
      protected void a(ecb $$0, sw $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static ebd a(ebq $$0, awp $$1, int $$2, int $$3, int $$4, ie $$5) {
         int $$6 = 3;
         ebd $$7 = ebd.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         ebp $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().i() == $$7.i()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = ebd.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return ebd.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(cwm $$0, cwk $$1, dng $$2, awp $$3, ebd $$4, cuy $$5, hz $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, cyu.eH.o(), 0, 0, $$7, $$4);
            this.a($$0, cyu.eH.o(), 1, 0, $$7, $$4);
            this.a($$0, cyu.eH.o(), 2, 0, $$7, $$4);
            this.a($$0, cyu.eH.o(), 3, 0, $$7, $$4);
            this.a($$0, cyu.eH.o(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, cyu.eH.o(), 0, $$8, $$7, $$4);
               this.a($$0, cyu.nc.o(), 1, $$8, $$7, $$4);
               this.a($$0, cyu.nc.o(), 2, $$8, $$7, $$4);
               this.a($$0, cyu.nc.o(), 3, $$8, $$7, $$4);
               this.a($$0, cyu.eH.o(), 4, $$8, $$7, $$4);
            }

            this.a($$0, cyu.eH.o(), 0, 4, $$7, $$4);
            this.a($$0, cyu.eH.o(), 1, 4, $$7, $$4);
            this.a($$0, cyu.eH.o(), 2, 4, $$7, $$4);
            this.a($$0, cyu.eH.o(), 3, 4, $$7, $$4);
            this.a($$0, cyu.eH.o(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends eec.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, awp $$1, ebd $$2, ie $$3) {
         super(ecc.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(sw $$0) {
         super(ecc.v, $$0);
         this.d = $$0.q("leftLow");
         this.i = $$0.q("leftHigh");
         this.j = $$0.q("rightLow");
         this.k = $$0.q("rightHigh");
      }

      @Override
      protected void a(ecb $$0, sw $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(ebp $$0, ebq $$1, awp $$2) {
         int $$3 = 3;
         int $$4 = 5;
         ie $$5 = this.i();
         if ($$5 == ie.e || $$5 == ie.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((eec.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((eec.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((eec.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((eec.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((eec.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static eec.c a(ebq $$0, awp $$1, int $$2, int $$3, int $$4, ie $$5, int $$6) {
         ebd $$7 = ebd.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eec.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cwm $$0, cwk $$1, dng $$2, awp $$3, ebd $$4, cuy $$5, hz $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, eec.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, eec.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, eec.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, eec.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, eec.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, eec.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, cyu.jE.o(), cyu.jE.o(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, cyu.jE.o(), cyu.jE.o(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, eec.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, cyu.jE.o(), cyu.jE.o(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, cyu.jE.o(), cyu.jE.o(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, cyu.jE.o(), cyu.jE.o(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, cyu.jE.o(), cyu.jE.o(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, cyu.jE.o().a(dfu.b, dmr.c), cyu.jE.o().a(dfu.b, dmr.c), false);
         this.a($$0, cyu.cq.o().a(dhs.g, ie.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends eec.q {
      public d(int $$0, awp $$1, ebd $$2, ie $$3) {
         super(ecc.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(sw $$0) {
         super(ecc.w, $$0);
      }

      @Override
      public void a(ebp $$0, ebq $$1, awp $$2) {
         ie $$3 = this.i();
         if ($$3 != ie.c && $$3 != ie.f) {
            this.c((eec.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((eec.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static eec.d a(ebq $$0, awp $$1, int $$2, int $$3, int $$4, ie $$5, int $$6) {
         ebd $$7 = ebd.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eec.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cwm $$0, cwk $$1, dng $$2, awp $$3, ebd $$4, cuy $$5, hz $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, eec.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         ie $$7 = this.i();
         if ($$7 != ie.c && $$7 != ie.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends eec.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, awp $$1, ebd $$2, ie $$3) {
         super(ecc.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.e() > 6;
      }

      public e(sw $$0) {
         super(ecc.x, $$0);
         this.i = $$0.q("Tall");
      }

      @Override
      protected void a(ecb $$0, sw $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static eec.e a(ebq $$0, awp $$1, int $$2, int $$3, int $$4, ie $$5, int $$6) {
         ebd $$7 = ebd.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = ebd.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new eec.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(cwm $$0, cwk $$1, dng $$2, awp $$3, ebd $$4, cuy $$5, hz $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, eec.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, cyu.bs.o(), cyu.bs.o(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, cyu.n.o(), cyu.n.o(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, cyu.n.o(), cyu.n.o(), false);
               this.a($$0, cyu.cq.o().a(dhs.g, ie.f), 2, 3, $$10, $$4);
               this.a($$0, cyu.cq.o().a(dhs.g, ie.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, cyu.n.o(), cyu.n.o(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, cyu.n.o(), cyu.n.o(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, cyu.cl.o(), cyu.cl.o(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, cyu.cl.o(), cyu.cl.o(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, cyu.cl.o(), cyu.cl.o(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, cyu.cl.o(), cyu.cl.o(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, cyu.cl.o(), cyu.cl.o(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, cyu.cl.o(), cyu.cl.o(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, cyu.cl.o(), cyu.cl.o(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, cyu.n.o(), cyu.n.o(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, cyu.n.o(), cyu.n.o(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, cyu.n.o(), cyu.n.o(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, cyu.n.o(), cyu.n.o(), false);
            this.a($$0, cyu.n.o(), 9, 5, 11, $$4);
            this.a($$0, cyu.n.o(), 8, 5, 11, $$4);
            this.a($$0, cyu.n.o(), 9, 5, 10, $$4);
            dlj $$12 = cyu.dU.o().a(dbq.d, Boolean.valueOf(true)).a(dbq.b, Boolean.valueOf(true));
            dlj $$13 = cyu.dU.o().a(dbq.a, Boolean.valueOf(true)).a(dbq.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, cyu.dU.o().a(dbq.a, Boolean.valueOf(true)).a(dbq.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, cyu.dU.o().a(dbq.c, Boolean.valueOf(true)).a(dbq.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, cyu.dU.o().a(dbq.a, Boolean.valueOf(true)).a(dbq.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, cyu.dU.o().a(dbq.c, Boolean.valueOf(true)).a(dbq.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, cyu.dU.o().a(dbq.a, Boolean.valueOf(true)).a(dbq.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            dlj $$15 = cyu.cO.o().a(dcx.b, ie.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            dlj $$18 = cyu.dU.o().a(dbq.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            dlj $$19 = cyu.dU.o().a(dbq.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            dlj $$20 = $$13.a(dbq.d, Boolean.valueOf(true)).a(dbq.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.a(dbq.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.a(dbq.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.a(dbq.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.a(dbq.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            dlj $$21 = cyu.cp.o();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, eja.w);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, eja.w);
         }
      }
   }

   static class f {
      public final Class<? extends eec.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends eec.p> $$0, int $$1, int $$2) {
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

   public static class g extends eec.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, ebd $$1, ie $$2) {
         super(ecc.y, $$0, $$1);
         this.a($$2);
      }

      public g(sw $$0) {
         super(ecc.y, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(ecb $$0, sw $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(ebp $$0, ebq $$1, awp $$2) {
         if ($$0 != null) {
            ((eec.m)$$0).b = this;
         }
      }

      public static eec.g a(ebq $$0, int $$1, int $$2, int $$3, ie $$4, int $$5) {
         ebd $$6 = ebd.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new eec.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(cwm $$0, cwk $$1, dng $$2, awp $$3, ebd $$4, cuy $$5, hz $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, eec.k);
         this.a($$0, $$3, $$4, eec.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, eec.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, eec.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, eec.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, eec.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, eec.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, eec.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, cyu.H.o(), cyu.H.o(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, cyu.H.o(), cyu.H.o(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, eec.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, cyu.H.o(), cyu.H.o(), false);
         dlj $$8 = cyu.eW.o().a(dcs.a, Boolean.valueOf(true)).a(dcs.c, Boolean.valueOf(true));
         dlj $$9 = cyu.eW.o().a(dcs.d, Boolean.valueOf(true)).a(dcs.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         dlj $$12 = cyu.fj.o().a(dgl.b, ie.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, eec.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, eec.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, eec.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         dlj $$14 = cyu.fy.o().a(dbh.b, ie.c);
         dlj $$15 = cyu.fy.o().a(dbh.b, ie.d);
         dlj $$16 = cyu.fy.o().a(dbh.b, ie.f);
         dlj $$17 = cyu.fy.o().a(dbh.b, ie.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.a(dbh.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.a(dbh.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.a(dbh.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.a(dbh.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.a(dbh.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.a(dbh.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.a(dbh.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.a(dbh.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.a(dbh.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.a(dbh.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.a(dbh.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.a(dbh.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            dlj $$21 = cyu.fx.o();
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
            hz $$22 = this.b(5, 3, 6);
            if ($$4.b($$22)) {
               this.d = true;
               $$0.a($$22, cyu.ct.o(), 2);
               if ($$0.c_($$22) instanceof dkk $$24) {
                  $$24.a(bnw.aK, $$3);
               }
            }
         }
      }
   }

   public static class h extends eec.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, awp $$1, ebd $$2, ie $$3) {
         super(ecc.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(sw $$0) {
         super(ecc.z, $$0);
      }

      @Override
      public void a(ebp $$0, ebq $$1, awp $$2) {
         this.a((eec.m)$$0, $$1, $$2, 1, 1);
      }

      public static eec.h a(ebq $$0, awp $$1, int $$2, int $$3, int $$4, ie $$5, int $$6) {
         ebd $$7 = ebd.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eec.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cwm $$0, cwk $$1, dng $$2, awp $$3, ebd $$4, cuy $$5, hz $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, eec.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, eec.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, eec.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, eec.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, eec.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, cyu.eW.o().a(dcs.a, Boolean.valueOf(true)).a(dcs.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, cyu.eW.o().a(dcs.a, Boolean.valueOf(true)).a(dcs.c, Boolean.valueOf(true)).a(dcs.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, cyu.eW.o().a(dcs.a, Boolean.valueOf(true)).a(dcs.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, cyu.eW.o().a(dcs.d, Boolean.valueOf(true)).a(dcs.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, cyu.eW.o().a(dcs.d, Boolean.valueOf(true)).a(dcs.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, cyu.eW.o().a(dcs.d, Boolean.valueOf(true)).a(dcs.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, cyu.eW.o().a(dcs.a, Boolean.valueOf(true)).a(dcs.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, cyu.eW.o().a(dcs.a, Boolean.valueOf(true)).a(dcs.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         dlj $$8 = cyu.dy.o().a(day.b, ie.e);
         dlj $$9 = cyu.dy.o().a(day.b, ie.e).a(day.f, dmf.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends eec.q {
      public i(int $$0, awp $$1, ebd $$2, ie $$3) {
         super(ecc.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(sw $$0) {
         super(ecc.A, $$0);
      }

      @Override
      public void a(ebp $$0, ebq $$1, awp $$2) {
         ie $$3 = this.i();
         if ($$3 != ie.c && $$3 != ie.f) {
            this.b((eec.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((eec.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static eec.i a(ebq $$0, awp $$1, int $$2, int $$3, int $$4, ie $$5, int $$6) {
         ebd $$7 = ebd.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eec.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cwm $$0, cwk $$1, dng $$2, awp $$3, ebd $$4, cuy $$5, hz $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, eec.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         ie $$7 = this.i();
         if ($$7 != ie.c && $$7 != ie.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends eec.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, awp $$1, ebd $$2, ie $$3) {
         super(ecc.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(sw $$0) {
         super(ecc.B, $$0);
         this.d = $$0.h("Type");
      }

      @Override
      protected void a(ecb $$0, sw $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(ebp $$0, ebq $$1, awp $$2) {
         this.a((eec.m)$$0, $$1, $$2, 4, 1);
         this.b((eec.m)$$0, $$1, $$2, 1, 4);
         this.c((eec.m)$$0, $$1, $$2, 1, 4);
      }

      public static eec.j a(ebq $$0, awp $$1, int $$2, int $$3, int $$4, ie $$5, int $$6) {
         ebd $$7 = ebd.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eec.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cwm $$0, cwk $$1, dng $$2, awp $$3, ebd $$4, cuy $$5, hz $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, eec.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, cyu.eH.o(), 5, 1, 5, $$4);
               this.a($$0, cyu.eH.o(), 5, 2, 5, $$4);
               this.a($$0, cyu.eH.o(), 5, 3, 5, $$4);
               this.a($$0, cyu.cq.o().a(dhs.g, ie.e), 4, 3, 5, $$4);
               this.a($$0, cyu.cq.o().a(dhs.g, ie.f), 6, 3, 5, $$4);
               this.a($$0, cyu.cq.o().a(dhs.g, ie.d), 5, 3, 4, $$4);
               this.a($$0, cyu.cq.o().a(dhs.g, ie.c), 5, 3, 6, $$4);
               this.a($$0, cyu.jE.o(), 4, 1, 4, $$4);
               this.a($$0, cyu.jE.o(), 4, 1, 5, $$4);
               this.a($$0, cyu.jE.o(), 4, 1, 6, $$4);
               this.a($$0, cyu.jE.o(), 6, 1, 4, $$4);
               this.a($$0, cyu.jE.o(), 6, 1, 5, $$4);
               this.a($$0, cyu.jE.o(), 6, 1, 6, $$4);
               this.a($$0, cyu.jE.o(), 5, 1, 4, $$4);
               this.a($$0, cyu.jE.o(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, cyu.eH.o(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, cyu.eH.o(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, cyu.eH.o(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, cyu.eH.o(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, cyu.eH.o(), 5, 1, 5, $$4);
               this.a($$0, cyu.eH.o(), 5, 2, 5, $$4);
               this.a($$0, cyu.eH.o(), 5, 3, 5, $$4);
               this.a($$0, cyu.G.o(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, cyu.m.o(), 1, 3, $$8, $$4);
                  this.a($$0, cyu.m.o(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, cyu.m.o(), $$9, 3, 1, $$4);
                  this.a($$0, cyu.m.o(), $$9, 3, 9, $$4);
               }

               this.a($$0, cyu.m.o(), 5, 1, 4, $$4);
               this.a($$0, cyu.m.o(), 5, 1, 6, $$4);
               this.a($$0, cyu.m.o(), 5, 3, 4, $$4);
               this.a($$0, cyu.m.o(), 5, 3, 6, $$4);
               this.a($$0, cyu.m.o(), 4, 1, 5, $$4);
               this.a($$0, cyu.m.o(), 6, 1, 5, $$4);
               this.a($$0, cyu.m.o(), 4, 3, 5, $$4);
               this.a($$0, cyu.m.o(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, cyu.m.o(), 4, $$10, 4, $$4);
                  this.a($$0, cyu.m.o(), 6, $$10, 4, $$4);
                  this.a($$0, cyu.m.o(), 4, $$10, 6, $$4);
                  this.a($$0, cyu.m.o(), 6, $$10, 6, $$4);
               }

               this.a($$0, cyu.cq.o(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, cyu.n.o(), 2, 3, $$11, $$4);
                  this.a($$0, cyu.n.o(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, cyu.n.o(), 4, 3, $$11, $$4);
                     this.a($$0, cyu.n.o(), 5, 3, $$11, $$4);
                     this.a($$0, cyu.n.o(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, cyu.n.o(), 7, 3, $$11, $$4);
                  this.a($$0, cyu.n.o(), 8, 3, $$11, $$4);
               }

               dlj $$12 = cyu.cO.o().a(dcx.b, ie.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, eja.x);
         }
      }
   }

   static class k extends ebp.a {
      @Override
      public void a(awp $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = cyu.eJ.o();
            } else if ($$5 < 0.5F) {
               this.a = cyu.eI.o();
            } else if ($$5 < 0.55F) {
               this.a = cyu.eP.o();
            } else {
               this.a = cyu.eH.o();
            }
         } else {
            this.a = cyu.nc.o();
         }
      }
   }

   public static class l extends eec.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(ecc $$0, int $$1, int $$2, int $$3, ie $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = eec.p.a.a;
      }

      public l(int $$0, awp $$1, ebd $$2, ie $$3) {
         super(ecc.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(ecc $$0, sw $$1) {
         super($$0, $$1);
         this.d = $$1.q("Source");
      }

      public l(sw $$0) {
         this(ecc.C, $$0);
      }

      @Override
      protected void a(ecb $$0, sw $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(ebp $$0, ebq $$1, awp $$2) {
         if (this.d) {
            eec.i = eec.c.class;
         }

         this.a((eec.m)$$0, $$1, $$2, 1, 1);
      }

      public static eec.l a(ebq $$0, awp $$1, int $$2, int $$3, int $$4, ie $$5, int $$6) {
         ebd $$7 = ebd.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eec.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cwm $$0, cwk $$1, dng $$2, awp $$3, ebd $$4, cuy $$5, hz $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, eec.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, eec.p.a.a, 1, 1, 4);
         this.a($$0, cyu.eH.o(), 2, 6, 1, $$4);
         this.a($$0, cyu.eH.o(), 1, 5, 1, $$4);
         this.a($$0, cyu.jE.o(), 1, 6, 1, $$4);
         this.a($$0, cyu.eH.o(), 1, 5, 2, $$4);
         this.a($$0, cyu.eH.o(), 1, 4, 3, $$4);
         this.a($$0, cyu.jE.o(), 1, 5, 3, $$4);
         this.a($$0, cyu.eH.o(), 2, 4, 3, $$4);
         this.a($$0, cyu.eH.o(), 3, 3, 3, $$4);
         this.a($$0, cyu.jE.o(), 3, 4, 3, $$4);
         this.a($$0, cyu.eH.o(), 3, 3, 2, $$4);
         this.a($$0, cyu.eH.o(), 3, 2, 1, $$4);
         this.a($$0, cyu.jE.o(), 3, 3, 1, $$4);
         this.a($$0, cyu.eH.o(), 2, 2, 1, $$4);
         this.a($$0, cyu.eH.o(), 1, 1, 1, $$4);
         this.a($$0, cyu.jE.o(), 1, 2, 1, $$4);
         this.a($$0, cyu.eH.o(), 1, 1, 2, $$4);
         this.a($$0, cyu.jE.o(), 1, 1, 3, $$4);
      }
   }

   public static class m extends eec.l {
      public eec.f a;
      @Nullable
      public eec.g b;
      public final List<ebp> c = Lists.newArrayList();

      public m(awp $$0, int $$1, int $$2) {
         super(ecc.D, 0, $$1, $$2, a($$0));
      }

      public m(sw $$0) {
         super(ecc.D, $$0);
      }

      @Override
      public hz h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends eec.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, awp $$1, ebd $$2, ie $$3) {
         super(ecc.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(sw $$0) {
         super(ecc.E, $$0);
         this.d = $$0.q("Left");
         this.i = $$0.q("Right");
      }

      @Override
      protected void a(ecb $$0, sw $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(ebp $$0, ebq $$1, awp $$2) {
         this.a((eec.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((eec.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((eec.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static eec.n a(ebq $$0, awp $$1, int $$2, int $$3, int $$4, ie $$5, int $$6) {
         ebd $$7 = ebd.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new eec.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cwm $$0, cwk $$1, dng $$2, awp $$3, ebd $$4, cuy $$5, hz $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, eec.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, eec.p.a.a, 1, 1, 6);
         dlj $$7 = cyu.cq.o().a(dhs.g, ie.f);
         dlj $$8 = cyu.cq.o().a(dhs.g, ie.e);
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

   public static class o extends eec.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, awp $$1, ebd $$2, ie $$3) {
         super(ecc.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(sw $$0) {
         super(ecc.F, $$0);
      }

      @Override
      public void a(ebp $$0, ebq $$1, awp $$2) {
         this.a((eec.m)$$0, $$1, $$2, 1, 1);
      }

      public static eec.o a(ebq $$0, awp $$1, int $$2, int $$3, int $$4, ie $$5, int $$6) {
         ebd $$7 = ebd.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new eec.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cwm $$0, cwk $$1, dng $$2, awp $$3, ebd $$4, cuy $$5, hz $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, eec.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, eec.p.a.a, 1, 1, 7);
         dlj $$7 = cyu.cQ.o().a(dgl.b, ie.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, cyu.eH.o(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, cyu.eH.o(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, cyu.eH.o(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends ebp {
      protected eec.p.a h = eec.p.a.a;

      protected p(ecc $$0, int $$1, ebd $$2) {
         super($$0, $$1, $$2);
      }

      public p(ecc $$0, sw $$1) {
         super($$0, $$1);
         this.h = eec.p.a.valueOf($$1.l("EntryDoor"));
      }

      @Override
      protected void a(ecb $$0, sw $$1) {
         $$1.a("EntryDoor", this.h.name());
      }

      protected void a(cwm $$0, awp $$1, ebd $$2, eec.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, cyu.eH.o(), $$4, $$5, $$6, $$2);
               this.a($$0, cyu.eH.o(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, cyu.eH.o(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, cyu.eH.o(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, cyu.eH.o(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, cyu.eH.o(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, cyu.eH.o(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, cyu.cN.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, cyu.cN.o().a(day.f, dmf.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, cyu.nc.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, cyu.nc.o(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, cyu.eW.o().a(dcs.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, cyu.eW.o().a(dcs.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, cyu.eW.o().a(dcs.b, Boolean.valueOf(true)).a(dcs.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, cyu.eW.o().a(dcs.b, Boolean.valueOf(true)).a(dcs.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, cyu.eW.o().a(dcs.b, Boolean.valueOf(true)).a(dcs.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, cyu.eW.o().a(dcs.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, cyu.eW.o().a(dcs.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, cyu.eH.o(), $$4, $$5, $$6, $$2);
               this.a($$0, cyu.eH.o(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, cyu.eH.o(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, cyu.eH.o(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, cyu.eH.o(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, cyu.eH.o(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, cyu.eH.o(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, cyu.dy.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, cyu.dy.o().a(day.f, dmf.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, cyu.dM.o().a(czc.aE, ie.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, cyu.dM.o().a(czc.aE, ie.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected eec.p.a b(awp $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return eec.p.a.a;
            case 2:
               return eec.p.a.b;
            case 3:
               return eec.p.a.c;
            case 4:
               return eec.p.a.d;
         }
      }

      @Nullable
      protected ebp a(eec.m $$0, ebq $$1, awp $$2, int $$3, int $$4) {
         ie $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eec.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$5, this.g());
               case d:
                  return eec.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$5, this.g());
               case e:
                  return eec.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
               case f:
                  return eec.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected ebp b(eec.m $$0, ebq $$1, awp $$2, int $$3, int $$4) {
         ie $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eec.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, ie.e, this.g());
               case d:
                  return eec.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, ie.e, this.g());
               case e:
                  return eec.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, ie.c, this.g());
               case f:
                  return eec.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, ie.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected ebp c(eec.m $$0, ebq $$1, awp $$2, int $$3, int $$4) {
         ie $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eec.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, ie.f, this.g());
               case d:
                  return eec.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, ie.f, this.g());
               case e:
                  return eec.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, ie.d, this.g());
               case f:
                  return eec.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, ie.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(ebd $$0) {
         return $$0 != null && $$0.i() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;
      }
   }

   public abstract static class q extends eec.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(ecc $$0, int $$1, ebd $$2) {
         super($$0, $$1, $$2);
      }

      public q(ecc $$0, sw $$1) {
         super($$0, $$1);
      }
   }
}
