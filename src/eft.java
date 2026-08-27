import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class eft {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final eft.f[] g = new eft.f[]{
      new eft.f(eft.n.class, 40, 0),
      new eft.f(eft.h.class, 5, 5),
      new eft.f(eft.d.class, 20, 0),
      new eft.f(eft.i.class, 20, 0),
      new eft.f(eft.j.class, 10, 6),
      new eft.f(eft.o.class, 5, 5),
      new eft.f(eft.l.class, 5, 5),
      new eft.f(eft.c.class, 5, 4),
      new eft.f(eft.a.class, 5, 4),
      new eft.f(eft.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new eft.f(eft.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<eft.f> h;
   static Class<? extends eft.p> i;
   private static int j;
   static final eft.k k = new eft.k();

   public static void a() {
      h = Lists.newArrayList();

      for (eft.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (eft.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static eft.p a(Class<? extends eft.p> $$0, edh $$1, axd $$2, int $$3, int $$4, int $$5, @Nullable ih $$6, int $$7) {
      eft.p $$8 = null;
      if ($$0 == eft.n.class) {
         $$8 = eft.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eft.h.class) {
         $$8 = eft.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eft.d.class) {
         $$8 = eft.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eft.i.class) {
         $$8 = eft.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eft.j.class) {
         $$8 = eft.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eft.o.class) {
         $$8 = eft.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eft.l.class) {
         $$8 = eft.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eft.c.class) {
         $$8 = eft.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eft.a.class) {
         $$8 = eft.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eft.e.class) {
         $$8 = eft.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eft.g.class) {
         $$8 = eft.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static eft.p a(eft.m $$0, edh $$1, axd $$2, int $$3, int $$4, int $$5, ih $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            eft.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (eft.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  eft.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         ecu $$13 = eft.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.i() > 1 ? new eft.b($$7, $$13, $$6) : null;
      }
   }

   static edg b(eft.m $$0, edh $$1, axd $$2, int $$3, int $$4, int $$5, @Nullable ih $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
         edg $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends eft.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, axd $$1, ecu $$2, ih $$3) {
         super(edt.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(ta $$0) {
         super(edt.t, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(eds $$0, ta $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(edg $$0, edh $$1, axd $$2) {
         this.a((eft.m)$$0, $$1, $$2, 1, 1);
      }

      public static eft.a a(edh $$0, axd $$1, int $$2, int $$3, int $$4, ih $$5, int $$6) {
         ecu $$7 = ecu.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new eft.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cxu $$0, cxs $$1, dow $$2, axd $$3, ecu $$4, cwg $$5, ib $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, eft.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, eft.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, dac.eH.o(), dac.eH.o(), false);
         this.a($$0, dac.jK.o(), 3, 1, 1, $$4);
         this.a($$0, dac.jK.o(), 3, 1, 5, $$4);
         this.a($$0, dac.jK.o(), 3, 2, 2, $$4);
         this.a($$0, dac.jK.o(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, dac.jK.o(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, eks.y);
         }
      }
   }

   public static class b extends eft.p {
      private final int a;

      public b(int $$0, ecu $$1, ih $$2) {
         super(edt.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != ih.c && $$2 != ih.d ? $$1.d() : $$1.f();
      }

      public b(ta $$0) {
         super(edt.u, $$0);
         this.a = $$0.h("Steps");
      }

      @Override
      protected void a(eds $$0, ta $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static ecu a(edh $$0, axd $$1, int $$2, int $$3, int $$4, ih $$5) {
         int $$6 = 3;
         ecu $$7 = ecu.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         edg $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().i() == $$7.i()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = ecu.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return ecu.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(cxu $$0, cxs $$1, dow $$2, axd $$3, ecu $$4, cwg $$5, ib $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, dac.eH.o(), 0, 0, $$7, $$4);
            this.a($$0, dac.eH.o(), 1, 0, $$7, $$4);
            this.a($$0, dac.eH.o(), 2, 0, $$7, $$4);
            this.a($$0, dac.eH.o(), 3, 0, $$7, $$4);
            this.a($$0, dac.eH.o(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, dac.eH.o(), 0, $$8, $$7, $$4);
               this.a($$0, dac.nc.o(), 1, $$8, $$7, $$4);
               this.a($$0, dac.nc.o(), 2, $$8, $$7, $$4);
               this.a($$0, dac.nc.o(), 3, $$8, $$7, $$4);
               this.a($$0, dac.eH.o(), 4, $$8, $$7, $$4);
            }

            this.a($$0, dac.eH.o(), 0, 4, $$7, $$4);
            this.a($$0, dac.eH.o(), 1, 4, $$7, $$4);
            this.a($$0, dac.eH.o(), 2, 4, $$7, $$4);
            this.a($$0, dac.eH.o(), 3, 4, $$7, $$4);
            this.a($$0, dac.eH.o(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends eft.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, axd $$1, ecu $$2, ih $$3) {
         super(edt.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(ta $$0) {
         super(edt.v, $$0);
         this.d = $$0.q("leftLow");
         this.i = $$0.q("leftHigh");
         this.j = $$0.q("rightLow");
         this.k = $$0.q("rightHigh");
      }

      @Override
      protected void a(eds $$0, ta $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(edg $$0, edh $$1, axd $$2) {
         int $$3 = 3;
         int $$4 = 5;
         ih $$5 = this.i();
         if ($$5 == ih.e || $$5 == ih.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((eft.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((eft.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((eft.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((eft.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((eft.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static eft.c a(edh $$0, axd $$1, int $$2, int $$3, int $$4, ih $$5, int $$6) {
         ecu $$7 = ecu.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eft.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cxu $$0, cxs $$1, dow $$2, axd $$3, ecu $$4, cwg $$5, ib $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, eft.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, eft.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, eft.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, eft.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, eft.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, eft.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, dac.jE.o(), dac.jE.o(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, dac.jE.o(), dac.jE.o(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, eft.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, dac.jE.o(), dac.jE.o(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, dac.jE.o(), dac.jE.o(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, dac.jE.o(), dac.jE.o(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, dac.jE.o(), dac.jE.o(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, dac.jE.o().a(dhc.b, doh.c), dac.jE.o().a(dhc.b, doh.c), false);
         this.a($$0, dac.cq.o().a(djb.g, ih.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends eft.q {
      public d(int $$0, axd $$1, ecu $$2, ih $$3) {
         super(edt.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(ta $$0) {
         super(edt.w, $$0);
      }

      @Override
      public void a(edg $$0, edh $$1, axd $$2) {
         ih $$3 = this.i();
         if ($$3 != ih.c && $$3 != ih.f) {
            this.c((eft.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((eft.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static eft.d a(edh $$0, axd $$1, int $$2, int $$3, int $$4, ih $$5, int $$6) {
         ecu $$7 = ecu.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eft.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cxu $$0, cxs $$1, dow $$2, axd $$3, ecu $$4, cwg $$5, ib $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, eft.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         ih $$7 = this.i();
         if ($$7 != ih.c && $$7 != ih.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends eft.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, axd $$1, ecu $$2, ih $$3) {
         super(edt.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.e() > 6;
      }

      public e(ta $$0) {
         super(edt.x, $$0);
         this.i = $$0.q("Tall");
      }

      @Override
      protected void a(eds $$0, ta $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static eft.e a(edh $$0, axd $$1, int $$2, int $$3, int $$4, ih $$5, int $$6) {
         ecu $$7 = ecu.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = ecu.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new eft.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(cxu $$0, cxs $$1, dow $$2, axd $$3, ecu $$4, cwg $$5, ib $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, eft.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, dac.bs.o(), dac.bs.o(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dac.n.o(), dac.n.o(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dac.n.o(), dac.n.o(), false);
               this.a($$0, dac.cq.o().a(djb.g, ih.f), 2, 3, $$10, $$4);
               this.a($$0, dac.cq.o().a(djb.g, ih.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dac.n.o(), dac.n.o(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dac.n.o(), dac.n.o(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dac.cl.o(), dac.cl.o(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dac.cl.o(), dac.cl.o(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dac.cl.o(), dac.cl.o(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dac.cl.o(), dac.cl.o(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, dac.cl.o(), dac.cl.o(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, dac.cl.o(), dac.cl.o(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, dac.cl.o(), dac.cl.o(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, dac.n.o(), dac.n.o(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, dac.n.o(), dac.n.o(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, dac.n.o(), dac.n.o(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, dac.n.o(), dac.n.o(), false);
            this.a($$0, dac.n.o(), 9, 5, 11, $$4);
            this.a($$0, dac.n.o(), 8, 5, 11, $$4);
            this.a($$0, dac.n.o(), 9, 5, 10, $$4);
            dmz $$12 = dac.dU.o().a(dcy.d, Boolean.valueOf(true)).a(dcy.b, Boolean.valueOf(true));
            dmz $$13 = dac.dU.o().a(dcy.a, Boolean.valueOf(true)).a(dcy.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, dac.dU.o().a(dcy.a, Boolean.valueOf(true)).a(dcy.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, dac.dU.o().a(dcy.c, Boolean.valueOf(true)).a(dcy.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, dac.dU.o().a(dcy.a, Boolean.valueOf(true)).a(dcy.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, dac.dU.o().a(dcy.c, Boolean.valueOf(true)).a(dcy.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, dac.dU.o().a(dcy.a, Boolean.valueOf(true)).a(dcy.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            dmz $$15 = dac.cO.o().a(def.b, ih.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            dmz $$18 = dac.dU.o().a(dcy.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            dmz $$19 = dac.dU.o().a(dcy.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            dmz $$20 = $$13.a(dcy.d, Boolean.valueOf(true)).a(dcy.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.a(dcy.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.a(dcy.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.a(dcy.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.a(dcy.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            dmz $$21 = dac.cp.o();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, eks.w);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, eks.w);
         }
      }
   }

   static class f {
      public final Class<? extends eft.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends eft.p> $$0, int $$1, int $$2) {
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

   public static class g extends eft.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, ecu $$1, ih $$2) {
         super(edt.y, $$0, $$1);
         this.a($$2);
      }

      public g(ta $$0) {
         super(edt.y, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(eds $$0, ta $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(edg $$0, edh $$1, axd $$2) {
         if ($$0 != null) {
            ((eft.m)$$0).b = this;
         }
      }

      public static eft.g a(edh $$0, int $$1, int $$2, int $$3, ih $$4, int $$5) {
         ecu $$6 = ecu.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new eft.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(cxu $$0, cxs $$1, dow $$2, axd $$3, ecu $$4, cwg $$5, ib $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, eft.k);
         this.a($$0, $$3, $$4, eft.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, eft.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, eft.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, eft.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, eft.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, eft.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, eft.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, dac.H.o(), dac.H.o(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, dac.H.o(), dac.H.o(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, eft.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, dac.H.o(), dac.H.o(), false);
         dmz $$8 = dac.eW.o().a(dea.a, Boolean.valueOf(true)).a(dea.c, Boolean.valueOf(true));
         dmz $$9 = dac.eW.o().a(dea.d, Boolean.valueOf(true)).a(dea.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         dmz $$12 = dac.fj.o().a(dht.b, ih.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, eft.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, eft.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, eft.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         dmz $$14 = dac.fy.o().a(dcp.b, ih.c);
         dmz $$15 = dac.fy.o().a(dcp.b, ih.d);
         dmz $$16 = dac.fy.o().a(dcp.b, ih.f);
         dmz $$17 = dac.fy.o().a(dcp.b, ih.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.a(dcp.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.a(dcp.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.a(dcp.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.a(dcp.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.a(dcp.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.a(dcp.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.a(dcp.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.a(dcp.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.a(dcp.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.a(dcp.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.a(dcp.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.a(dcp.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            dmz $$21 = dac.fx.o();
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
               $$0.a($$22, dac.ct.o(), 2);
               if ($$0.c_($$22) instanceof dlt $$24) {
                  $$24.a(bpc.aL, $$3);
               }
            }
         }
      }
   }

   public static class h extends eft.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, axd $$1, ecu $$2, ih $$3) {
         super(edt.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(ta $$0) {
         super(edt.z, $$0);
      }

      @Override
      public void a(edg $$0, edh $$1, axd $$2) {
         this.a((eft.m)$$0, $$1, $$2, 1, 1);
      }

      public static eft.h a(edh $$0, axd $$1, int $$2, int $$3, int $$4, ih $$5, int $$6) {
         ecu $$7 = ecu.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eft.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cxu $$0, cxs $$1, dow $$2, axd $$3, ecu $$4, cwg $$5, ib $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, eft.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, eft.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, eft.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, eft.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, eft.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, dac.eW.o().a(dea.a, Boolean.valueOf(true)).a(dea.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, dac.eW.o().a(dea.a, Boolean.valueOf(true)).a(dea.c, Boolean.valueOf(true)).a(dea.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, dac.eW.o().a(dea.a, Boolean.valueOf(true)).a(dea.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, dac.eW.o().a(dea.d, Boolean.valueOf(true)).a(dea.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, dac.eW.o().a(dea.d, Boolean.valueOf(true)).a(dea.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, dac.eW.o().a(dea.d, Boolean.valueOf(true)).a(dea.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, dac.eW.o().a(dea.a, Boolean.valueOf(true)).a(dea.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, dac.eW.o().a(dea.a, Boolean.valueOf(true)).a(dea.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         dmz $$8 = dac.dy.o().a(dcg.b, ih.e);
         dmz $$9 = dac.dy.o().a(dcg.b, ih.e).a(dcg.f, dnv.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends eft.q {
      public i(int $$0, axd $$1, ecu $$2, ih $$3) {
         super(edt.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(ta $$0) {
         super(edt.A, $$0);
      }

      @Override
      public void a(edg $$0, edh $$1, axd $$2) {
         ih $$3 = this.i();
         if ($$3 != ih.c && $$3 != ih.f) {
            this.b((eft.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((eft.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static eft.i a(edh $$0, axd $$1, int $$2, int $$3, int $$4, ih $$5, int $$6) {
         ecu $$7 = ecu.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eft.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cxu $$0, cxs $$1, dow $$2, axd $$3, ecu $$4, cwg $$5, ib $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, eft.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         ih $$7 = this.i();
         if ($$7 != ih.c && $$7 != ih.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends eft.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, axd $$1, ecu $$2, ih $$3) {
         super(edt.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(ta $$0) {
         super(edt.B, $$0);
         this.d = $$0.h("Type");
      }

      @Override
      protected void a(eds $$0, ta $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(edg $$0, edh $$1, axd $$2) {
         this.a((eft.m)$$0, $$1, $$2, 4, 1);
         this.b((eft.m)$$0, $$1, $$2, 1, 4);
         this.c((eft.m)$$0, $$1, $$2, 1, 4);
      }

      public static eft.j a(edh $$0, axd $$1, int $$2, int $$3, int $$4, ih $$5, int $$6) {
         ecu $$7 = ecu.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eft.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cxu $$0, cxs $$1, dow $$2, axd $$3, ecu $$4, cwg $$5, ib $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, eft.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, dac.eH.o(), 5, 1, 5, $$4);
               this.a($$0, dac.eH.o(), 5, 2, 5, $$4);
               this.a($$0, dac.eH.o(), 5, 3, 5, $$4);
               this.a($$0, dac.cq.o().a(djb.g, ih.e), 4, 3, 5, $$4);
               this.a($$0, dac.cq.o().a(djb.g, ih.f), 6, 3, 5, $$4);
               this.a($$0, dac.cq.o().a(djb.g, ih.d), 5, 3, 4, $$4);
               this.a($$0, dac.cq.o().a(djb.g, ih.c), 5, 3, 6, $$4);
               this.a($$0, dac.jE.o(), 4, 1, 4, $$4);
               this.a($$0, dac.jE.o(), 4, 1, 5, $$4);
               this.a($$0, dac.jE.o(), 4, 1, 6, $$4);
               this.a($$0, dac.jE.o(), 6, 1, 4, $$4);
               this.a($$0, dac.jE.o(), 6, 1, 5, $$4);
               this.a($$0, dac.jE.o(), 6, 1, 6, $$4);
               this.a($$0, dac.jE.o(), 5, 1, 4, $$4);
               this.a($$0, dac.jE.o(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, dac.eH.o(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, dac.eH.o(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, dac.eH.o(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, dac.eH.o(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, dac.eH.o(), 5, 1, 5, $$4);
               this.a($$0, dac.eH.o(), 5, 2, 5, $$4);
               this.a($$0, dac.eH.o(), 5, 3, 5, $$4);
               this.a($$0, dac.G.o(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, dac.m.o(), 1, 3, $$8, $$4);
                  this.a($$0, dac.m.o(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, dac.m.o(), $$9, 3, 1, $$4);
                  this.a($$0, dac.m.o(), $$9, 3, 9, $$4);
               }

               this.a($$0, dac.m.o(), 5, 1, 4, $$4);
               this.a($$0, dac.m.o(), 5, 1, 6, $$4);
               this.a($$0, dac.m.o(), 5, 3, 4, $$4);
               this.a($$0, dac.m.o(), 5, 3, 6, $$4);
               this.a($$0, dac.m.o(), 4, 1, 5, $$4);
               this.a($$0, dac.m.o(), 6, 1, 5, $$4);
               this.a($$0, dac.m.o(), 4, 3, 5, $$4);
               this.a($$0, dac.m.o(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, dac.m.o(), 4, $$10, 4, $$4);
                  this.a($$0, dac.m.o(), 6, $$10, 4, $$4);
                  this.a($$0, dac.m.o(), 4, $$10, 6, $$4);
                  this.a($$0, dac.m.o(), 6, $$10, 6, $$4);
               }

               this.a($$0, dac.cq.o(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, dac.n.o(), 2, 3, $$11, $$4);
                  this.a($$0, dac.n.o(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, dac.n.o(), 4, 3, $$11, $$4);
                     this.a($$0, dac.n.o(), 5, 3, $$11, $$4);
                     this.a($$0, dac.n.o(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, dac.n.o(), 7, 3, $$11, $$4);
                  this.a($$0, dac.n.o(), 8, 3, $$11, $$4);
               }

               dmz $$12 = dac.cO.o().a(def.b, ih.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, eks.x);
         }
      }
   }

   static class k extends edg.a {
      @Override
      public void a(axd $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = dac.eJ.o();
            } else if ($$5 < 0.5F) {
               this.a = dac.eI.o();
            } else if ($$5 < 0.55F) {
               this.a = dac.eP.o();
            } else {
               this.a = dac.eH.o();
            }
         } else {
            this.a = dac.nc.o();
         }
      }
   }

   public static class l extends eft.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(edt $$0, int $$1, int $$2, int $$3, ih $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = eft.p.a.a;
      }

      public l(int $$0, axd $$1, ecu $$2, ih $$3) {
         super(edt.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(edt $$0, ta $$1) {
         super($$0, $$1);
         this.d = $$1.q("Source");
      }

      public l(ta $$0) {
         this(edt.C, $$0);
      }

      @Override
      protected void a(eds $$0, ta $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(edg $$0, edh $$1, axd $$2) {
         if (this.d) {
            eft.i = eft.c.class;
         }

         this.a((eft.m)$$0, $$1, $$2, 1, 1);
      }

      public static eft.l a(edh $$0, axd $$1, int $$2, int $$3, int $$4, ih $$5, int $$6) {
         ecu $$7 = ecu.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eft.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cxu $$0, cxs $$1, dow $$2, axd $$3, ecu $$4, cwg $$5, ib $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, eft.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, eft.p.a.a, 1, 1, 4);
         this.a($$0, dac.eH.o(), 2, 6, 1, $$4);
         this.a($$0, dac.eH.o(), 1, 5, 1, $$4);
         this.a($$0, dac.jE.o(), 1, 6, 1, $$4);
         this.a($$0, dac.eH.o(), 1, 5, 2, $$4);
         this.a($$0, dac.eH.o(), 1, 4, 3, $$4);
         this.a($$0, dac.jE.o(), 1, 5, 3, $$4);
         this.a($$0, dac.eH.o(), 2, 4, 3, $$4);
         this.a($$0, dac.eH.o(), 3, 3, 3, $$4);
         this.a($$0, dac.jE.o(), 3, 4, 3, $$4);
         this.a($$0, dac.eH.o(), 3, 3, 2, $$4);
         this.a($$0, dac.eH.o(), 3, 2, 1, $$4);
         this.a($$0, dac.jE.o(), 3, 3, 1, $$4);
         this.a($$0, dac.eH.o(), 2, 2, 1, $$4);
         this.a($$0, dac.eH.o(), 1, 1, 1, $$4);
         this.a($$0, dac.jE.o(), 1, 2, 1, $$4);
         this.a($$0, dac.eH.o(), 1, 1, 2, $$4);
         this.a($$0, dac.jE.o(), 1, 1, 3, $$4);
      }
   }

   public static class m extends eft.l {
      public eft.f a;
      @Nullable
      public eft.g b;
      public final List<edg> c = Lists.newArrayList();

      public m(axd $$0, int $$1, int $$2) {
         super(edt.D, 0, $$1, $$2, a($$0));
      }

      public m(ta $$0) {
         super(edt.D, $$0);
      }

      @Override
      public ib h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends eft.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, axd $$1, ecu $$2, ih $$3) {
         super(edt.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(ta $$0) {
         super(edt.E, $$0);
         this.d = $$0.q("Left");
         this.i = $$0.q("Right");
      }

      @Override
      protected void a(eds $$0, ta $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(edg $$0, edh $$1, axd $$2) {
         this.a((eft.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((eft.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((eft.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static eft.n a(edh $$0, axd $$1, int $$2, int $$3, int $$4, ih $$5, int $$6) {
         ecu $$7 = ecu.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new eft.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cxu $$0, cxs $$1, dow $$2, axd $$3, ecu $$4, cwg $$5, ib $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, eft.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, eft.p.a.a, 1, 1, 6);
         dmz $$7 = dac.cq.o().a(djb.g, ih.f);
         dmz $$8 = dac.cq.o().a(djb.g, ih.e);
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

   public static class o extends eft.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, axd $$1, ecu $$2, ih $$3) {
         super(edt.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(ta $$0) {
         super(edt.F, $$0);
      }

      @Override
      public void a(edg $$0, edh $$1, axd $$2) {
         this.a((eft.m)$$0, $$1, $$2, 1, 1);
      }

      public static eft.o a(edh $$0, axd $$1, int $$2, int $$3, int $$4, ih $$5, int $$6) {
         ecu $$7 = ecu.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new eft.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cxu $$0, cxs $$1, dow $$2, axd $$3, ecu $$4, cwg $$5, ib $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, eft.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, eft.p.a.a, 1, 1, 7);
         dmz $$7 = dac.cQ.o().a(dht.b, ih.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, dac.eH.o(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dac.eH.o(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dac.eH.o(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends edg {
      protected eft.p.a h = eft.p.a.a;

      protected p(edt $$0, int $$1, ecu $$2) {
         super($$0, $$1, $$2);
      }

      public p(edt $$0, ta $$1) {
         super($$0, $$1);
         this.h = eft.p.a.valueOf($$1.l("EntryDoor"));
      }

      @Override
      protected void a(eds $$0, ta $$1) {
         $$1.a("EntryDoor", this.h.name());
      }

      protected void a(cxu $$0, axd $$1, ecu $$2, eft.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, dac.eH.o(), $$4, $$5, $$6, $$2);
               this.a($$0, dac.eH.o(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dac.eH.o(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dac.eH.o(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dac.eH.o(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dac.eH.o(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dac.eH.o(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dac.cN.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dac.cN.o().a(dcg.f, dnv.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, dac.nc.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dac.nc.o(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dac.eW.o().a(dea.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, dac.eW.o().a(dea.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dac.eW.o().a(dea.b, Boolean.valueOf(true)).a(dea.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dac.eW.o().a(dea.b, Boolean.valueOf(true)).a(dea.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dac.eW.o().a(dea.b, Boolean.valueOf(true)).a(dea.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dac.eW.o().a(dea.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dac.eW.o().a(dea.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, dac.eH.o(), $$4, $$5, $$6, $$2);
               this.a($$0, dac.eH.o(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dac.eH.o(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dac.eH.o(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dac.eH.o(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dac.eH.o(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dac.eH.o(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dac.dy.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dac.dy.o().a(dcg.f, dnv.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dac.dM.o().a(dak.aE, ih.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, dac.dM.o().a(dak.aE, ih.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected eft.p.a b(axd $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return eft.p.a.a;
            case 2:
               return eft.p.a.b;
            case 3:
               return eft.p.a.c;
            case 4:
               return eft.p.a.d;
         }
      }

      @Nullable
      protected edg a(eft.m $$0, edh $$1, axd $$2, int $$3, int $$4) {
         ih $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eft.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$5, this.g());
               case d:
                  return eft.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$5, this.g());
               case e:
                  return eft.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
               case f:
                  return eft.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected edg b(eft.m $$0, edh $$1, axd $$2, int $$3, int $$4) {
         ih $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eft.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, ih.e, this.g());
               case d:
                  return eft.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, ih.e, this.g());
               case e:
                  return eft.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, ih.c, this.g());
               case f:
                  return eft.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, ih.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected edg c(eft.m $$0, edh $$1, axd $$2, int $$3, int $$4) {
         ih $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eft.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, ih.f, this.g());
               case d:
                  return eft.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, ih.f, this.g());
               case e:
                  return eft.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, ih.d, this.g());
               case f:
                  return eft.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, ih.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(ecu $$0) {
         return $$0 != null && $$0.i() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;
      }
   }

   public abstract static class q extends eft.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(edt $$0, int $$1, ecu $$2) {
         super($$0, $$1, $$2);
      }

      public q(edt $$0, ta $$1) {
         super($$0, $$1);
      }
   }
}
