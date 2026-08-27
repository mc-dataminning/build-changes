import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class ead {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final ead.f[] g = new ead.f[]{
      new ead.f(ead.n.class, 40, 0),
      new ead.f(ead.h.class, 5, 5),
      new ead.f(ead.d.class, 20, 0),
      new ead.f(ead.i.class, 20, 0),
      new ead.f(ead.j.class, 10, 6),
      new ead.f(ead.o.class, 5, 5),
      new ead.f(ead.l.class, 5, 5),
      new ead.f(ead.c.class, 5, 4),
      new ead.f(ead.a.class, 5, 4),
      new ead.f(ead.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new ead.f(ead.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<ead.f> h;
   static Class<? extends ead.p> i;
   private static int j;
   static final ead.k k = new ead.k();

   public static void a() {
      h = Lists.newArrayList();

      for (ead.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (ead.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static ead.p a(Class<? extends ead.p> $$0, dxr $$1, atw $$2, int $$3, int $$4, int $$5, @Nullable ib $$6, int $$7) {
      ead.p $$8 = null;
      if ($$0 == ead.n.class) {
         $$8 = ead.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ead.h.class) {
         $$8 = ead.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ead.d.class) {
         $$8 = ead.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ead.i.class) {
         $$8 = ead.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ead.j.class) {
         $$8 = ead.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ead.o.class) {
         $$8 = ead.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ead.l.class) {
         $$8 = ead.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ead.c.class) {
         $$8 = ead.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ead.a.class) {
         $$8 = ead.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ead.e.class) {
         $$8 = ead.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ead.g.class) {
         $$8 = ead.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static ead.p a(ead.m $$0, dxr $$1, atw $$2, int $$3, int $$4, int $$5, ib $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            ead.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (ead.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  ead.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         dxe $$13 = ead.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.i() > 1 ? new ead.b($$7, $$13, $$6) : null;
      }
   }

   static dxq b(ead.m $$0, dxr $$1, atw $$2, int $$3, int $$4, int $$5, @Nullable ib $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
         dxq $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends ead.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, atw $$1, dxe $$2, ib $$3) {
         super(dyd.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(sd $$0) {
         super(dyd.t, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(dyc $$0, sd $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(dxq $$0, dxr $$1, atw $$2) {
         this.a((ead.m)$$0, $$1, $$2, 1, 1);
      }

      public static ead.a a(dxr $$0, atw $$1, int $$2, int $$3, int $$4, ib $$5, int $$6) {
         dxe $$7 = dxe.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new ead.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(csz $$0, csx $$1, djk $$2, atw $$3, dxe $$4, crm $$5, hx $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, ead.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, ead.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, cvh.eH.o(), cvh.eH.o(), false);
         this.a($$0, cvh.jK.o(), 3, 1, 1, $$4);
         this.a($$0, cvh.jK.o(), 3, 1, 5, $$4);
         this.a($$0, cvh.jK.o(), 3, 2, 2, $$4);
         this.a($$0, cvh.jK.o(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, cvh.jK.o(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, efa.y);
         }
      }
   }

   public static class b extends ead.p {
      private final int a;

      public b(int $$0, dxe $$1, ib $$2) {
         super(dyd.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != ib.c && $$2 != ib.d ? $$1.d() : $$1.f();
      }

      public b(sd $$0) {
         super(dyd.u, $$0);
         this.a = $$0.h("Steps");
      }

      @Override
      protected void a(dyc $$0, sd $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static dxe a(dxr $$0, atw $$1, int $$2, int $$3, int $$4, ib $$5) {
         int $$6 = 3;
         dxe $$7 = dxe.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         dxq $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().i() == $$7.i()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = dxe.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return dxe.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(csz $$0, csx $$1, djk $$2, atw $$3, dxe $$4, crm $$5, hx $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, cvh.eH.o(), 0, 0, $$7, $$4);
            this.a($$0, cvh.eH.o(), 1, 0, $$7, $$4);
            this.a($$0, cvh.eH.o(), 2, 0, $$7, $$4);
            this.a($$0, cvh.eH.o(), 3, 0, $$7, $$4);
            this.a($$0, cvh.eH.o(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, cvh.eH.o(), 0, $$8, $$7, $$4);
               this.a($$0, cvh.nc.o(), 1, $$8, $$7, $$4);
               this.a($$0, cvh.nc.o(), 2, $$8, $$7, $$4);
               this.a($$0, cvh.nc.o(), 3, $$8, $$7, $$4);
               this.a($$0, cvh.eH.o(), 4, $$8, $$7, $$4);
            }

            this.a($$0, cvh.eH.o(), 0, 4, $$7, $$4);
            this.a($$0, cvh.eH.o(), 1, 4, $$7, $$4);
            this.a($$0, cvh.eH.o(), 2, 4, $$7, $$4);
            this.a($$0, cvh.eH.o(), 3, 4, $$7, $$4);
            this.a($$0, cvh.eH.o(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends ead.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, atw $$1, dxe $$2, ib $$3) {
         super(dyd.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(sd $$0) {
         super(dyd.v, $$0);
         this.d = $$0.q("leftLow");
         this.i = $$0.q("leftHigh");
         this.j = $$0.q("rightLow");
         this.k = $$0.q("rightHigh");
      }

      @Override
      protected void a(dyc $$0, sd $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(dxq $$0, dxr $$1, atw $$2) {
         int $$3 = 3;
         int $$4 = 5;
         ib $$5 = this.i();
         if ($$5 == ib.e || $$5 == ib.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((ead.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((ead.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((ead.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((ead.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((ead.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static ead.c a(dxr $$0, atw $$1, int $$2, int $$3, int $$4, ib $$5, int $$6) {
         dxe $$7 = dxe.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new ead.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(csz $$0, csx $$1, djk $$2, atw $$3, dxe $$4, crm $$5, hx $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, ead.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, ead.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, ead.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, ead.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, ead.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, ead.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, cvh.jE.o(), cvh.jE.o(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, cvh.jE.o(), cvh.jE.o(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, ead.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, cvh.jE.o(), cvh.jE.o(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, cvh.jE.o(), cvh.jE.o(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, cvh.jE.o(), cvh.jE.o(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, cvh.jE.o(), cvh.jE.o(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, cvh.jE.o().a(dch.b, div.c), cvh.jE.o().a(dch.b, div.c), false);
         this.a($$0, cvh.cq.o().a(dee.g, ib.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends ead.q {
      public d(int $$0, atw $$1, dxe $$2, ib $$3) {
         super(dyd.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(sd $$0) {
         super(dyd.w, $$0);
      }

      @Override
      public void a(dxq $$0, dxr $$1, atw $$2) {
         ib $$3 = this.i();
         if ($$3 != ib.c && $$3 != ib.f) {
            this.c((ead.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((ead.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static ead.d a(dxr $$0, atw $$1, int $$2, int $$3, int $$4, ib $$5, int $$6) {
         dxe $$7 = dxe.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new ead.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(csz $$0, csx $$1, djk $$2, atw $$3, dxe $$4, crm $$5, hx $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, ead.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         ib $$7 = this.i();
         if ($$7 != ib.c && $$7 != ib.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends ead.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, atw $$1, dxe $$2, ib $$3) {
         super(dyd.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.e() > 6;
      }

      public e(sd $$0) {
         super(dyd.x, $$0);
         this.i = $$0.q("Tall");
      }

      @Override
      protected void a(dyc $$0, sd $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static ead.e a(dxr $$0, atw $$1, int $$2, int $$3, int $$4, ib $$5, int $$6) {
         dxe $$7 = dxe.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = dxe.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new ead.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(csz $$0, csx $$1, djk $$2, atw $$3, dxe $$4, crm $$5, hx $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, ead.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, cvh.bs.o(), cvh.bs.o(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, cvh.n.o(), cvh.n.o(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, cvh.n.o(), cvh.n.o(), false);
               this.a($$0, cvh.cq.o().a(dee.g, ib.f), 2, 3, $$10, $$4);
               this.a($$0, cvh.cq.o().a(dee.g, ib.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, cvh.n.o(), cvh.n.o(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, cvh.n.o(), cvh.n.o(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, cvh.cl.o(), cvh.cl.o(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, cvh.cl.o(), cvh.cl.o(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, cvh.cl.o(), cvh.cl.o(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, cvh.cl.o(), cvh.cl.o(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, cvh.cl.o(), cvh.cl.o(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, cvh.cl.o(), cvh.cl.o(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, cvh.cl.o(), cvh.cl.o(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, cvh.n.o(), cvh.n.o(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, cvh.n.o(), cvh.n.o(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, cvh.n.o(), cvh.n.o(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, cvh.n.o(), cvh.n.o(), false);
            this.a($$0, cvh.n.o(), 9, 5, 11, $$4);
            this.a($$0, cvh.n.o(), 8, 5, 11, $$4);
            this.a($$0, cvh.n.o(), 9, 5, 10, $$4);
            dhn $$12 = cvh.dU.o().a(cyd.d, Boolean.valueOf(true)).a(cyd.b, Boolean.valueOf(true));
            dhn $$13 = cvh.dU.o().a(cyd.a, Boolean.valueOf(true)).a(cyd.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, cvh.dU.o().a(cyd.a, Boolean.valueOf(true)).a(cyd.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, cvh.dU.o().a(cyd.c, Boolean.valueOf(true)).a(cyd.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, cvh.dU.o().a(cyd.a, Boolean.valueOf(true)).a(cyd.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, cvh.dU.o().a(cyd.c, Boolean.valueOf(true)).a(cyd.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, cvh.dU.o().a(cyd.a, Boolean.valueOf(true)).a(cyd.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            dhn $$15 = cvh.cO.o().a(czk.b, ib.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            dhn $$18 = cvh.dU.o().a(cyd.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            dhn $$19 = cvh.dU.o().a(cyd.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            dhn $$20 = $$13.a(cyd.d, Boolean.valueOf(true)).a(cyd.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.a(cyd.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.a(cyd.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.a(cyd.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.a(cyd.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            dhn $$21 = cvh.cp.o();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, efa.w);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, efa.w);
         }
      }
   }

   static class f {
      public final Class<? extends ead.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends ead.p> $$0, int $$1, int $$2) {
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

   public static class g extends ead.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, dxe $$1, ib $$2) {
         super(dyd.y, $$0, $$1);
         this.a($$2);
      }

      public g(sd $$0) {
         super(dyd.y, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(dyc $$0, sd $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(dxq $$0, dxr $$1, atw $$2) {
         if ($$0 != null) {
            ((ead.m)$$0).b = this;
         }
      }

      public static ead.g a(dxr $$0, int $$1, int $$2, int $$3, ib $$4, int $$5) {
         dxe $$6 = dxe.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new ead.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(csz $$0, csx $$1, djk $$2, atw $$3, dxe $$4, crm $$5, hx $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, ead.k);
         this.a($$0, $$3, $$4, ead.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, ead.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, ead.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, ead.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, ead.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, ead.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, ead.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, cvh.H.o(), cvh.H.o(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, cvh.H.o(), cvh.H.o(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, ead.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, cvh.H.o(), cvh.H.o(), false);
         dhn $$8 = cvh.eW.o().a(czf.a, Boolean.valueOf(true)).a(czf.c, Boolean.valueOf(true));
         dhn $$9 = cvh.eW.o().a(czf.d, Boolean.valueOf(true)).a(czf.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         dhn $$12 = cvh.fj.o().a(dcy.b, ib.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, ead.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, ead.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, ead.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         dhn $$14 = cvh.fy.o().a(cxu.b, ib.c);
         dhn $$15 = cvh.fy.o().a(cxu.b, ib.d);
         dhn $$16 = cvh.fy.o().a(cxu.b, ib.f);
         dhn $$17 = cvh.fy.o().a(cxu.b, ib.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.a(cxu.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.a(cxu.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.a(cxu.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.a(cxu.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.a(cxu.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.a(cxu.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.a(cxu.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.a(cxu.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.a(cxu.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.a(cxu.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.a(cxu.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.a(cxu.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            dhn $$21 = cvh.fx.o();
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
            hx $$22 = this.b(5, 3, 6);
            if ($$4.b($$22)) {
               this.d = true;
               $$0.a($$22, cvh.ct.o(), 2);
               if ($$0.c_($$22) instanceof dgv $$24) {
                  $$24.a(bkz.aI, $$3);
               }
            }
         }
      }
   }

   public static class h extends ead.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, atw $$1, dxe $$2, ib $$3) {
         super(dyd.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(sd $$0) {
         super(dyd.z, $$0);
      }

      @Override
      public void a(dxq $$0, dxr $$1, atw $$2) {
         this.a((ead.m)$$0, $$1, $$2, 1, 1);
      }

      public static ead.h a(dxr $$0, atw $$1, int $$2, int $$3, int $$4, ib $$5, int $$6) {
         dxe $$7 = dxe.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new ead.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(csz $$0, csx $$1, djk $$2, atw $$3, dxe $$4, crm $$5, hx $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, ead.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, ead.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, ead.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, ead.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, ead.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, cvh.eW.o().a(czf.a, Boolean.valueOf(true)).a(czf.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, cvh.eW.o().a(czf.a, Boolean.valueOf(true)).a(czf.c, Boolean.valueOf(true)).a(czf.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, cvh.eW.o().a(czf.a, Boolean.valueOf(true)).a(czf.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, cvh.eW.o().a(czf.d, Boolean.valueOf(true)).a(czf.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, cvh.eW.o().a(czf.d, Boolean.valueOf(true)).a(czf.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, cvh.eW.o().a(czf.d, Boolean.valueOf(true)).a(czf.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, cvh.eW.o().a(czf.a, Boolean.valueOf(true)).a(czf.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, cvh.eW.o().a(czf.a, Boolean.valueOf(true)).a(czf.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         dhn $$8 = cvh.dy.o().a(cxl.b, ib.e);
         dhn $$9 = cvh.dy.o().a(cxl.b, ib.e).a(cxl.f, dij.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends ead.q {
      public i(int $$0, atw $$1, dxe $$2, ib $$3) {
         super(dyd.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(sd $$0) {
         super(dyd.A, $$0);
      }

      @Override
      public void a(dxq $$0, dxr $$1, atw $$2) {
         ib $$3 = this.i();
         if ($$3 != ib.c && $$3 != ib.f) {
            this.b((ead.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((ead.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static ead.i a(dxr $$0, atw $$1, int $$2, int $$3, int $$4, ib $$5, int $$6) {
         dxe $$7 = dxe.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new ead.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(csz $$0, csx $$1, djk $$2, atw $$3, dxe $$4, crm $$5, hx $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, ead.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         ib $$7 = this.i();
         if ($$7 != ib.c && $$7 != ib.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends ead.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, atw $$1, dxe $$2, ib $$3) {
         super(dyd.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(sd $$0) {
         super(dyd.B, $$0);
         this.d = $$0.h("Type");
      }

      @Override
      protected void a(dyc $$0, sd $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(dxq $$0, dxr $$1, atw $$2) {
         this.a((ead.m)$$0, $$1, $$2, 4, 1);
         this.b((ead.m)$$0, $$1, $$2, 1, 4);
         this.c((ead.m)$$0, $$1, $$2, 1, 4);
      }

      public static ead.j a(dxr $$0, atw $$1, int $$2, int $$3, int $$4, ib $$5, int $$6) {
         dxe $$7 = dxe.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new ead.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(csz $$0, csx $$1, djk $$2, atw $$3, dxe $$4, crm $$5, hx $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, ead.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, cvh.eH.o(), 5, 1, 5, $$4);
               this.a($$0, cvh.eH.o(), 5, 2, 5, $$4);
               this.a($$0, cvh.eH.o(), 5, 3, 5, $$4);
               this.a($$0, cvh.cq.o().a(dee.g, ib.e), 4, 3, 5, $$4);
               this.a($$0, cvh.cq.o().a(dee.g, ib.f), 6, 3, 5, $$4);
               this.a($$0, cvh.cq.o().a(dee.g, ib.d), 5, 3, 4, $$4);
               this.a($$0, cvh.cq.o().a(dee.g, ib.c), 5, 3, 6, $$4);
               this.a($$0, cvh.jE.o(), 4, 1, 4, $$4);
               this.a($$0, cvh.jE.o(), 4, 1, 5, $$4);
               this.a($$0, cvh.jE.o(), 4, 1, 6, $$4);
               this.a($$0, cvh.jE.o(), 6, 1, 4, $$4);
               this.a($$0, cvh.jE.o(), 6, 1, 5, $$4);
               this.a($$0, cvh.jE.o(), 6, 1, 6, $$4);
               this.a($$0, cvh.jE.o(), 5, 1, 4, $$4);
               this.a($$0, cvh.jE.o(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, cvh.eH.o(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, cvh.eH.o(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, cvh.eH.o(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, cvh.eH.o(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, cvh.eH.o(), 5, 1, 5, $$4);
               this.a($$0, cvh.eH.o(), 5, 2, 5, $$4);
               this.a($$0, cvh.eH.o(), 5, 3, 5, $$4);
               this.a($$0, cvh.G.o(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, cvh.m.o(), 1, 3, $$8, $$4);
                  this.a($$0, cvh.m.o(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, cvh.m.o(), $$9, 3, 1, $$4);
                  this.a($$0, cvh.m.o(), $$9, 3, 9, $$4);
               }

               this.a($$0, cvh.m.o(), 5, 1, 4, $$4);
               this.a($$0, cvh.m.o(), 5, 1, 6, $$4);
               this.a($$0, cvh.m.o(), 5, 3, 4, $$4);
               this.a($$0, cvh.m.o(), 5, 3, 6, $$4);
               this.a($$0, cvh.m.o(), 4, 1, 5, $$4);
               this.a($$0, cvh.m.o(), 6, 1, 5, $$4);
               this.a($$0, cvh.m.o(), 4, 3, 5, $$4);
               this.a($$0, cvh.m.o(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, cvh.m.o(), 4, $$10, 4, $$4);
                  this.a($$0, cvh.m.o(), 6, $$10, 4, $$4);
                  this.a($$0, cvh.m.o(), 4, $$10, 6, $$4);
                  this.a($$0, cvh.m.o(), 6, $$10, 6, $$4);
               }

               this.a($$0, cvh.cq.o(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, cvh.n.o(), 2, 3, $$11, $$4);
                  this.a($$0, cvh.n.o(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, cvh.n.o(), 4, 3, $$11, $$4);
                     this.a($$0, cvh.n.o(), 5, 3, $$11, $$4);
                     this.a($$0, cvh.n.o(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, cvh.n.o(), 7, 3, $$11, $$4);
                  this.a($$0, cvh.n.o(), 8, 3, $$11, $$4);
               }

               dhn $$12 = cvh.cO.o().a(czk.b, ib.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, efa.x);
         }
      }
   }

   static class k extends dxq.a {
      @Override
      public void a(atw $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = cvh.eJ.o();
            } else if ($$5 < 0.5F) {
               this.a = cvh.eI.o();
            } else if ($$5 < 0.55F) {
               this.a = cvh.eP.o();
            } else {
               this.a = cvh.eH.o();
            }
         } else {
            this.a = cvh.nc.o();
         }
      }
   }

   public static class l extends ead.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(dyd $$0, int $$1, int $$2, int $$3, ib $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = ead.p.a.a;
      }

      public l(int $$0, atw $$1, dxe $$2, ib $$3) {
         super(dyd.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(dyd $$0, sd $$1) {
         super($$0, $$1);
         this.d = $$1.q("Source");
      }

      public l(sd $$0) {
         this(dyd.C, $$0);
      }

      @Override
      protected void a(dyc $$0, sd $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(dxq $$0, dxr $$1, atw $$2) {
         if (this.d) {
            ead.i = ead.c.class;
         }

         this.a((ead.m)$$0, $$1, $$2, 1, 1);
      }

      public static ead.l a(dxr $$0, atw $$1, int $$2, int $$3, int $$4, ib $$5, int $$6) {
         dxe $$7 = dxe.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new ead.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(csz $$0, csx $$1, djk $$2, atw $$3, dxe $$4, crm $$5, hx $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, ead.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, ead.p.a.a, 1, 1, 4);
         this.a($$0, cvh.eH.o(), 2, 6, 1, $$4);
         this.a($$0, cvh.eH.o(), 1, 5, 1, $$4);
         this.a($$0, cvh.jE.o(), 1, 6, 1, $$4);
         this.a($$0, cvh.eH.o(), 1, 5, 2, $$4);
         this.a($$0, cvh.eH.o(), 1, 4, 3, $$4);
         this.a($$0, cvh.jE.o(), 1, 5, 3, $$4);
         this.a($$0, cvh.eH.o(), 2, 4, 3, $$4);
         this.a($$0, cvh.eH.o(), 3, 3, 3, $$4);
         this.a($$0, cvh.jE.o(), 3, 4, 3, $$4);
         this.a($$0, cvh.eH.o(), 3, 3, 2, $$4);
         this.a($$0, cvh.eH.o(), 3, 2, 1, $$4);
         this.a($$0, cvh.jE.o(), 3, 3, 1, $$4);
         this.a($$0, cvh.eH.o(), 2, 2, 1, $$4);
         this.a($$0, cvh.eH.o(), 1, 1, 1, $$4);
         this.a($$0, cvh.jE.o(), 1, 2, 1, $$4);
         this.a($$0, cvh.eH.o(), 1, 1, 2, $$4);
         this.a($$0, cvh.jE.o(), 1, 1, 3, $$4);
      }
   }

   public static class m extends ead.l {
      public ead.f a;
      @Nullable
      public ead.g b;
      public final List<dxq> c = Lists.newArrayList();

      public m(atw $$0, int $$1, int $$2) {
         super(dyd.D, 0, $$1, $$2, a($$0));
      }

      public m(sd $$0) {
         super(dyd.D, $$0);
      }

      @Override
      public hx h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends ead.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, atw $$1, dxe $$2, ib $$3) {
         super(dyd.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(sd $$0) {
         super(dyd.E, $$0);
         this.d = $$0.q("Left");
         this.i = $$0.q("Right");
      }

      @Override
      protected void a(dyc $$0, sd $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(dxq $$0, dxr $$1, atw $$2) {
         this.a((ead.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((ead.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((ead.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static ead.n a(dxr $$0, atw $$1, int $$2, int $$3, int $$4, ib $$5, int $$6) {
         dxe $$7 = dxe.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new ead.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(csz $$0, csx $$1, djk $$2, atw $$3, dxe $$4, crm $$5, hx $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, ead.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, ead.p.a.a, 1, 1, 6);
         dhn $$7 = cvh.cq.o().a(dee.g, ib.f);
         dhn $$8 = cvh.cq.o().a(dee.g, ib.e);
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

   public static class o extends ead.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, atw $$1, dxe $$2, ib $$3) {
         super(dyd.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(sd $$0) {
         super(dyd.F, $$0);
      }

      @Override
      public void a(dxq $$0, dxr $$1, atw $$2) {
         this.a((ead.m)$$0, $$1, $$2, 1, 1);
      }

      public static ead.o a(dxr $$0, atw $$1, int $$2, int $$3, int $$4, ib $$5, int $$6) {
         dxe $$7 = dxe.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new ead.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(csz $$0, csx $$1, djk $$2, atw $$3, dxe $$4, crm $$5, hx $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, ead.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, ead.p.a.a, 1, 1, 7);
         dhn $$7 = cvh.cQ.o().a(dcy.b, ib.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, cvh.eH.o(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, cvh.eH.o(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, cvh.eH.o(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends dxq {
      protected ead.p.a h = ead.p.a.a;

      protected p(dyd $$0, int $$1, dxe $$2) {
         super($$0, $$1, $$2);
      }

      public p(dyd $$0, sd $$1) {
         super($$0, $$1);
         this.h = ead.p.a.valueOf($$1.l("EntryDoor"));
      }

      @Override
      protected void a(dyc $$0, sd $$1) {
         $$1.a("EntryDoor", this.h.name());
      }

      protected void a(csz $$0, atw $$1, dxe $$2, ead.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, cvh.eH.o(), $$4, $$5, $$6, $$2);
               this.a($$0, cvh.eH.o(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, cvh.eH.o(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, cvh.eH.o(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, cvh.eH.o(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, cvh.eH.o(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, cvh.eH.o(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, cvh.cN.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, cvh.cN.o().a(cxl.f, dij.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, cvh.nc.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, cvh.nc.o(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, cvh.eW.o().a(czf.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, cvh.eW.o().a(czf.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, cvh.eW.o().a(czf.b, Boolean.valueOf(true)).a(czf.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, cvh.eW.o().a(czf.b, Boolean.valueOf(true)).a(czf.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, cvh.eW.o().a(czf.b, Boolean.valueOf(true)).a(czf.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, cvh.eW.o().a(czf.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, cvh.eW.o().a(czf.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, cvh.eH.o(), $$4, $$5, $$6, $$2);
               this.a($$0, cvh.eH.o(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, cvh.eH.o(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, cvh.eH.o(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, cvh.eH.o(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, cvh.eH.o(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, cvh.eH.o(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, cvh.dy.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, cvh.dy.o().a(cxl.f, dij.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, cvh.dM.o().a(cvp.aE, ib.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, cvh.dM.o().a(cvp.aE, ib.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected ead.p.a b(atw $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return ead.p.a.a;
            case 2:
               return ead.p.a.b;
            case 3:
               return ead.p.a.c;
            case 4:
               return ead.p.a.d;
         }
      }

      @Nullable
      protected dxq a(ead.m $$0, dxr $$1, atw $$2, int $$3, int $$4) {
         ib $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return ead.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$5, this.g());
               case d:
                  return ead.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$5, this.g());
               case e:
                  return ead.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
               case f:
                  return ead.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected dxq b(ead.m $$0, dxr $$1, atw $$2, int $$3, int $$4) {
         ib $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return ead.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, ib.e, this.g());
               case d:
                  return ead.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, ib.e, this.g());
               case e:
                  return ead.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, ib.c, this.g());
               case f:
                  return ead.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, ib.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected dxq c(ead.m $$0, dxr $$1, atw $$2, int $$3, int $$4) {
         ib $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return ead.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, ib.f, this.g());
               case d:
                  return ead.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, ib.f, this.g());
               case e:
                  return ead.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, ib.d, this.g());
               case f:
                  return ead.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, ib.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(dxe $$0) {
         return $$0 != null && $$0.i() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;
      }
   }

   public abstract static class q extends ead.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(dyd $$0, int $$1, dxe $$2) {
         super($$0, $$1, $$2);
      }

      public q(dyd $$0, sd $$1) {
         super($$0, $$1);
      }
   }
}
