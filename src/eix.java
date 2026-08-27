import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class eix {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final eix.f[] g = new eix.f[]{
      new eix.f(eix.n.class, 40, 0),
      new eix.f(eix.h.class, 5, 5),
      new eix.f(eix.d.class, 20, 0),
      new eix.f(eix.i.class, 20, 0),
      new eix.f(eix.j.class, 10, 6),
      new eix.f(eix.o.class, 5, 5),
      new eix.f(eix.l.class, 5, 5),
      new eix.f(eix.c.class, 5, 4),
      new eix.f(eix.a.class, 5, 4),
      new eix.f(eix.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new eix.f(eix.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<eix.f> h;
   static Class<? extends eix.p> i;
   private static int j;
   static final eix.k k = new eix.k();

   public static void a() {
      h = Lists.newArrayList();

      for (eix.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (eix.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static eix.p a(Class<? extends eix.p> $$0, egl $$1, ayd $$2, int $$3, int $$4, int $$5, @Nullable ir $$6, int $$7) {
      eix.p $$8 = null;
      if ($$0 == eix.n.class) {
         $$8 = eix.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eix.h.class) {
         $$8 = eix.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eix.d.class) {
         $$8 = eix.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eix.i.class) {
         $$8 = eix.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eix.j.class) {
         $$8 = eix.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eix.o.class) {
         $$8 = eix.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eix.l.class) {
         $$8 = eix.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eix.c.class) {
         $$8 = eix.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eix.a.class) {
         $$8 = eix.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eix.e.class) {
         $$8 = eix.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eix.g.class) {
         $$8 = eix.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static eix.p a(eix.m $$0, egl $$1, ayd $$2, int $$3, int $$4, int $$5, ir $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            eix.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (eix.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  eix.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         efy $$13 = eix.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.i() > 1 ? new eix.b($$7, $$13, $$6) : null;
      }
   }

   static egk b(eix.m $$0, egl $$1, ayd $$2, int $$3, int $$4, int $$5, @Nullable ir $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
         egk $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends eix.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, ayd $$1, efy $$2, ir $$3) {
         super(egx.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(ty $$0) {
         super(egx.t, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(egw $$0, ty $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(egk $$0, egl $$1, ayd $$2) {
         this.a((eix.m)$$0, $$1, $$2, 1, 1);
      }

      public static eix.a a(egl $$0, ayd $$1, int $$2, int $$3, int $$4, ir $$5, int $$6) {
         efy $$7 = efy.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new eix.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dap $$0, dan $$1, drv $$2, ayd $$3, efy $$4, czb $$5, im $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, eix.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, eix.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, dcx.eH.n(), dcx.eH.n(), false);
         this.a($$0, dcx.jK.n(), 3, 1, 1, $$4);
         this.a($$0, dcx.jK.n(), 3, 1, 5, $$4);
         this.a($$0, dcx.jK.n(), 3, 2, 2, $$4);
         this.a($$0, dcx.jK.n(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, dcx.jK.n(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, eny.y);
         }
      }
   }

   public static class b extends eix.p {
      private final int a;

      public b(int $$0, efy $$1, ir $$2) {
         super(egx.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != ir.c && $$2 != ir.d ? $$1.d() : $$1.f();
      }

      public b(ty $$0) {
         super(egx.u, $$0);
         this.a = $$0.h("Steps");
      }

      @Override
      protected void a(egw $$0, ty $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static efy a(egl $$0, ayd $$1, int $$2, int $$3, int $$4, ir $$5) {
         int $$6 = 3;
         efy $$7 = efy.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         egk $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().i() == $$7.i()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = efy.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return efy.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(dap $$0, dan $$1, drv $$2, ayd $$3, efy $$4, czb $$5, im $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, dcx.eH.n(), 0, 0, $$7, $$4);
            this.a($$0, dcx.eH.n(), 1, 0, $$7, $$4);
            this.a($$0, dcx.eH.n(), 2, 0, $$7, $$4);
            this.a($$0, dcx.eH.n(), 3, 0, $$7, $$4);
            this.a($$0, dcx.eH.n(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, dcx.eH.n(), 0, $$8, $$7, $$4);
               this.a($$0, dcx.nc.n(), 1, $$8, $$7, $$4);
               this.a($$0, dcx.nc.n(), 2, $$8, $$7, $$4);
               this.a($$0, dcx.nc.n(), 3, $$8, $$7, $$4);
               this.a($$0, dcx.eH.n(), 4, $$8, $$7, $$4);
            }

            this.a($$0, dcx.eH.n(), 0, 4, $$7, $$4);
            this.a($$0, dcx.eH.n(), 1, 4, $$7, $$4);
            this.a($$0, dcx.eH.n(), 2, 4, $$7, $$4);
            this.a($$0, dcx.eH.n(), 3, 4, $$7, $$4);
            this.a($$0, dcx.eH.n(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends eix.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, ayd $$1, efy $$2, ir $$3) {
         super(egx.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(ty $$0) {
         super(egx.v, $$0);
         this.d = $$0.q("leftLow");
         this.i = $$0.q("leftHigh");
         this.j = $$0.q("rightLow");
         this.k = $$0.q("rightHigh");
      }

      @Override
      protected void a(egw $$0, ty $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(egk $$0, egl $$1, ayd $$2) {
         int $$3 = 3;
         int $$4 = 5;
         ir $$5 = this.i();
         if ($$5 == ir.e || $$5 == ir.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((eix.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((eix.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((eix.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((eix.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((eix.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static eix.c a(egl $$0, ayd $$1, int $$2, int $$3, int $$4, ir $$5, int $$6) {
         efy $$7 = efy.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eix.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dap $$0, dan $$1, drv $$2, ayd $$3, efy $$4, czb $$5, im $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, eix.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, eix.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, eix.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, eix.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, eix.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, eix.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, dcx.jE.n(), dcx.jE.n(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, dcx.jE.n(), dcx.jE.n(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, eix.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, dcx.jE.n(), dcx.jE.n(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, dcx.jE.n(), dcx.jE.n(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, dcx.jE.n(), dcx.jE.n(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, dcx.jE.n(), dcx.jE.n(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, dcx.jE.n().a(djy.b, drg.c), dcx.jE.n().a(djy.b, drg.c), false);
         this.a($$0, dcx.cq.n().a(dlx.g, ir.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends eix.q {
      public d(int $$0, ayd $$1, efy $$2, ir $$3) {
         super(egx.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(ty $$0) {
         super(egx.w, $$0);
      }

      @Override
      public void a(egk $$0, egl $$1, ayd $$2) {
         ir $$3 = this.i();
         if ($$3 != ir.c && $$3 != ir.f) {
            this.c((eix.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((eix.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static eix.d a(egl $$0, ayd $$1, int $$2, int $$3, int $$4, ir $$5, int $$6) {
         efy $$7 = efy.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eix.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dap $$0, dan $$1, drv $$2, ayd $$3, efy $$4, czb $$5, im $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, eix.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         ir $$7 = this.i();
         if ($$7 != ir.c && $$7 != ir.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends eix.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, ayd $$1, efy $$2, ir $$3) {
         super(egx.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.e() > 6;
      }

      public e(ty $$0) {
         super(egx.x, $$0);
         this.i = $$0.q("Tall");
      }

      @Override
      protected void a(egw $$0, ty $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static eix.e a(egl $$0, ayd $$1, int $$2, int $$3, int $$4, ir $$5, int $$6) {
         efy $$7 = efy.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = efy.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new eix.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(dap $$0, dan $$1, drv $$2, ayd $$3, efy $$4, czb $$5, im $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, eix.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, dcx.bs.n(), dcx.bs.n(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dcx.n.n(), dcx.n.n(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dcx.n.n(), dcx.n.n(), false);
               this.a($$0, dcx.cq.n().a(dlx.g, ir.f), 2, 3, $$10, $$4);
               this.a($$0, dcx.cq.n().a(dlx.g, ir.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dcx.n.n(), dcx.n.n(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dcx.n.n(), dcx.n.n(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dcx.cl.n(), dcx.cl.n(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dcx.cl.n(), dcx.cl.n(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dcx.cl.n(), dcx.cl.n(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dcx.cl.n(), dcx.cl.n(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, dcx.cl.n(), dcx.cl.n(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, dcx.cl.n(), dcx.cl.n(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, dcx.cl.n(), dcx.cl.n(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, dcx.n.n(), dcx.n.n(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, dcx.n.n(), dcx.n.n(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, dcx.n.n(), dcx.n.n(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, dcx.n.n(), dcx.n.n(), false);
            this.a($$0, dcx.n.n(), 9, 5, 11, $$4);
            this.a($$0, dcx.n.n(), 8, 5, 11, $$4);
            this.a($$0, dcx.n.n(), 9, 5, 10, $$4);
            dpy $$12 = dcx.dU.n().a(dft.d, Boolean.valueOf(true)).a(dft.b, Boolean.valueOf(true));
            dpy $$13 = dcx.dU.n().a(dft.a, Boolean.valueOf(true)).a(dft.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, dcx.dU.n().a(dft.a, Boolean.valueOf(true)).a(dft.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, dcx.dU.n().a(dft.c, Boolean.valueOf(true)).a(dft.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, dcx.dU.n().a(dft.a, Boolean.valueOf(true)).a(dft.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, dcx.dU.n().a(dft.c, Boolean.valueOf(true)).a(dft.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, dcx.dU.n().a(dft.a, Boolean.valueOf(true)).a(dft.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            dpy $$15 = dcx.cO.n().a(dhb.b, ir.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            dpy $$18 = dcx.dU.n().a(dft.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            dpy $$19 = dcx.dU.n().a(dft.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            dpy $$20 = $$13.a(dft.d, Boolean.valueOf(true)).a(dft.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.a(dft.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.a(dft.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.a(dft.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.a(dft.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            dpy $$21 = dcx.cp.n();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, eny.w);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, eny.w);
         }
      }
   }

   static class f {
      public final Class<? extends eix.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends eix.p> $$0, int $$1, int $$2) {
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

   public static class g extends eix.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, efy $$1, ir $$2) {
         super(egx.y, $$0, $$1);
         this.a($$2);
      }

      public g(ty $$0) {
         super(egx.y, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(egw $$0, ty $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(egk $$0, egl $$1, ayd $$2) {
         if ($$0 != null) {
            ((eix.m)$$0).b = this;
         }
      }

      public static eix.g a(egl $$0, int $$1, int $$2, int $$3, ir $$4, int $$5) {
         efy $$6 = efy.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new eix.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dap $$0, dan $$1, drv $$2, ayd $$3, efy $$4, czb $$5, im $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, eix.k);
         this.a($$0, $$3, $$4, eix.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, eix.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, eix.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, eix.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, eix.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, eix.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, eix.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, dcx.H.n(), dcx.H.n(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, dcx.H.n(), dcx.H.n(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, eix.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, dcx.H.n(), dcx.H.n(), false);
         dpy $$8 = dcx.eW.n().a(dgw.a, Boolean.valueOf(true)).a(dgw.c, Boolean.valueOf(true));
         dpy $$9 = dcx.eW.n().a(dgw.d, Boolean.valueOf(true)).a(dgw.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         dpy $$12 = dcx.fj.n().a(dkp.b, ir.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, eix.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, eix.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, eix.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         dpy $$14 = dcx.fy.n().a(dfk.b, ir.c);
         dpy $$15 = dcx.fy.n().a(dfk.b, ir.d);
         dpy $$16 = dcx.fy.n().a(dfk.b, ir.f);
         dpy $$17 = dcx.fy.n().a(dfk.b, ir.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.a(dfk.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.a(dfk.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.a(dfk.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.a(dfk.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.a(dfk.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.a(dfk.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.a(dfk.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.a(dfk.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.a(dfk.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.a(dfk.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.a(dfk.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.a(dfk.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            dpy $$21 = dcx.fx.n();
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
            im $$22 = this.b(5, 3, 6);
            if ($$4.b($$22)) {
               this.d = true;
               $$0.a($$22, dcx.ct.n(), 2);
               if ($$0.c_($$22) instanceof dor $$24) {
                  $$24.a(bqr.aL, $$3);
               }
            }
         }
      }
   }

   public static class h extends eix.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, ayd $$1, efy $$2, ir $$3) {
         super(egx.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(ty $$0) {
         super(egx.z, $$0);
      }

      @Override
      public void a(egk $$0, egl $$1, ayd $$2) {
         this.a((eix.m)$$0, $$1, $$2, 1, 1);
      }

      public static eix.h a(egl $$0, ayd $$1, int $$2, int $$3, int $$4, ir $$5, int $$6) {
         efy $$7 = efy.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eix.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dap $$0, dan $$1, drv $$2, ayd $$3, efy $$4, czb $$5, im $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, eix.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, eix.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, eix.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, eix.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, eix.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, dcx.eW.n().a(dgw.a, Boolean.valueOf(true)).a(dgw.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, dcx.eW.n().a(dgw.a, Boolean.valueOf(true)).a(dgw.c, Boolean.valueOf(true)).a(dgw.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, dcx.eW.n().a(dgw.a, Boolean.valueOf(true)).a(dgw.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, dcx.eW.n().a(dgw.d, Boolean.valueOf(true)).a(dgw.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, dcx.eW.n().a(dgw.d, Boolean.valueOf(true)).a(dgw.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, dcx.eW.n().a(dgw.d, Boolean.valueOf(true)).a(dgw.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, dcx.eW.n().a(dgw.a, Boolean.valueOf(true)).a(dgw.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, dcx.eW.n().a(dgw.a, Boolean.valueOf(true)).a(dgw.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         dpy $$8 = dcx.dy.n().a(dfb.b, ir.e);
         dpy $$9 = dcx.dy.n().a(dfb.b, ir.e).a(dfb.f, dqu.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends eix.q {
      public i(int $$0, ayd $$1, efy $$2, ir $$3) {
         super(egx.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(ty $$0) {
         super(egx.A, $$0);
      }

      @Override
      public void a(egk $$0, egl $$1, ayd $$2) {
         ir $$3 = this.i();
         if ($$3 != ir.c && $$3 != ir.f) {
            this.b((eix.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((eix.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static eix.i a(egl $$0, ayd $$1, int $$2, int $$3, int $$4, ir $$5, int $$6) {
         efy $$7 = efy.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eix.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dap $$0, dan $$1, drv $$2, ayd $$3, efy $$4, czb $$5, im $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, eix.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         ir $$7 = this.i();
         if ($$7 != ir.c && $$7 != ir.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends eix.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, ayd $$1, efy $$2, ir $$3) {
         super(egx.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(ty $$0) {
         super(egx.B, $$0);
         this.d = $$0.h("Type");
      }

      @Override
      protected void a(egw $$0, ty $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(egk $$0, egl $$1, ayd $$2) {
         this.a((eix.m)$$0, $$1, $$2, 4, 1);
         this.b((eix.m)$$0, $$1, $$2, 1, 4);
         this.c((eix.m)$$0, $$1, $$2, 1, 4);
      }

      public static eix.j a(egl $$0, ayd $$1, int $$2, int $$3, int $$4, ir $$5, int $$6) {
         efy $$7 = efy.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eix.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dap $$0, dan $$1, drv $$2, ayd $$3, efy $$4, czb $$5, im $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, eix.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, dcx.eH.n(), 5, 1, 5, $$4);
               this.a($$0, dcx.eH.n(), 5, 2, 5, $$4);
               this.a($$0, dcx.eH.n(), 5, 3, 5, $$4);
               this.a($$0, dcx.cq.n().a(dlx.g, ir.e), 4, 3, 5, $$4);
               this.a($$0, dcx.cq.n().a(dlx.g, ir.f), 6, 3, 5, $$4);
               this.a($$0, dcx.cq.n().a(dlx.g, ir.d), 5, 3, 4, $$4);
               this.a($$0, dcx.cq.n().a(dlx.g, ir.c), 5, 3, 6, $$4);
               this.a($$0, dcx.jE.n(), 4, 1, 4, $$4);
               this.a($$0, dcx.jE.n(), 4, 1, 5, $$4);
               this.a($$0, dcx.jE.n(), 4, 1, 6, $$4);
               this.a($$0, dcx.jE.n(), 6, 1, 4, $$4);
               this.a($$0, dcx.jE.n(), 6, 1, 5, $$4);
               this.a($$0, dcx.jE.n(), 6, 1, 6, $$4);
               this.a($$0, dcx.jE.n(), 5, 1, 4, $$4);
               this.a($$0, dcx.jE.n(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, dcx.eH.n(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, dcx.eH.n(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, dcx.eH.n(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, dcx.eH.n(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, dcx.eH.n(), 5, 1, 5, $$4);
               this.a($$0, dcx.eH.n(), 5, 2, 5, $$4);
               this.a($$0, dcx.eH.n(), 5, 3, 5, $$4);
               this.a($$0, dcx.G.n(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, dcx.m.n(), 1, 3, $$8, $$4);
                  this.a($$0, dcx.m.n(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, dcx.m.n(), $$9, 3, 1, $$4);
                  this.a($$0, dcx.m.n(), $$9, 3, 9, $$4);
               }

               this.a($$0, dcx.m.n(), 5, 1, 4, $$4);
               this.a($$0, dcx.m.n(), 5, 1, 6, $$4);
               this.a($$0, dcx.m.n(), 5, 3, 4, $$4);
               this.a($$0, dcx.m.n(), 5, 3, 6, $$4);
               this.a($$0, dcx.m.n(), 4, 1, 5, $$4);
               this.a($$0, dcx.m.n(), 6, 1, 5, $$4);
               this.a($$0, dcx.m.n(), 4, 3, 5, $$4);
               this.a($$0, dcx.m.n(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, dcx.m.n(), 4, $$10, 4, $$4);
                  this.a($$0, dcx.m.n(), 6, $$10, 4, $$4);
                  this.a($$0, dcx.m.n(), 4, $$10, 6, $$4);
                  this.a($$0, dcx.m.n(), 6, $$10, 6, $$4);
               }

               this.a($$0, dcx.cq.n(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, dcx.n.n(), 2, 3, $$11, $$4);
                  this.a($$0, dcx.n.n(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, dcx.n.n(), 4, 3, $$11, $$4);
                     this.a($$0, dcx.n.n(), 5, 3, $$11, $$4);
                     this.a($$0, dcx.n.n(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, dcx.n.n(), 7, 3, $$11, $$4);
                  this.a($$0, dcx.n.n(), 8, 3, $$11, $$4);
               }

               dpy $$12 = dcx.cO.n().a(dhb.b, ir.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, eny.x);
         }
      }
   }

   static class k extends egk.a {
      @Override
      public void a(ayd $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = dcx.eJ.n();
            } else if ($$5 < 0.5F) {
               this.a = dcx.eI.n();
            } else if ($$5 < 0.55F) {
               this.a = dcx.eP.n();
            } else {
               this.a = dcx.eH.n();
            }
         } else {
            this.a = dcx.nc.n();
         }
      }
   }

   public static class l extends eix.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(egx $$0, int $$1, int $$2, int $$3, ir $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = eix.p.a.a;
      }

      public l(int $$0, ayd $$1, efy $$2, ir $$3) {
         super(egx.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(egx $$0, ty $$1) {
         super($$0, $$1);
         this.d = $$1.q("Source");
      }

      public l(ty $$0) {
         this(egx.C, $$0);
      }

      @Override
      protected void a(egw $$0, ty $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(egk $$0, egl $$1, ayd $$2) {
         if (this.d) {
            eix.i = eix.c.class;
         }

         this.a((eix.m)$$0, $$1, $$2, 1, 1);
      }

      public static eix.l a(egl $$0, ayd $$1, int $$2, int $$3, int $$4, ir $$5, int $$6) {
         efy $$7 = efy.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eix.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dap $$0, dan $$1, drv $$2, ayd $$3, efy $$4, czb $$5, im $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, eix.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, eix.p.a.a, 1, 1, 4);
         this.a($$0, dcx.eH.n(), 2, 6, 1, $$4);
         this.a($$0, dcx.eH.n(), 1, 5, 1, $$4);
         this.a($$0, dcx.jE.n(), 1, 6, 1, $$4);
         this.a($$0, dcx.eH.n(), 1, 5, 2, $$4);
         this.a($$0, dcx.eH.n(), 1, 4, 3, $$4);
         this.a($$0, dcx.jE.n(), 1, 5, 3, $$4);
         this.a($$0, dcx.eH.n(), 2, 4, 3, $$4);
         this.a($$0, dcx.eH.n(), 3, 3, 3, $$4);
         this.a($$0, dcx.jE.n(), 3, 4, 3, $$4);
         this.a($$0, dcx.eH.n(), 3, 3, 2, $$4);
         this.a($$0, dcx.eH.n(), 3, 2, 1, $$4);
         this.a($$0, dcx.jE.n(), 3, 3, 1, $$4);
         this.a($$0, dcx.eH.n(), 2, 2, 1, $$4);
         this.a($$0, dcx.eH.n(), 1, 1, 1, $$4);
         this.a($$0, dcx.jE.n(), 1, 2, 1, $$4);
         this.a($$0, dcx.eH.n(), 1, 1, 2, $$4);
         this.a($$0, dcx.jE.n(), 1, 1, 3, $$4);
      }
   }

   public static class m extends eix.l {
      public eix.f a;
      @Nullable
      public eix.g b;
      public final List<egk> c = Lists.newArrayList();

      public m(ayd $$0, int $$1, int $$2) {
         super(egx.D, 0, $$1, $$2, a($$0));
      }

      public m(ty $$0) {
         super(egx.D, $$0);
      }

      @Override
      public im h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends eix.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, ayd $$1, efy $$2, ir $$3) {
         super(egx.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(ty $$0) {
         super(egx.E, $$0);
         this.d = $$0.q("Left");
         this.i = $$0.q("Right");
      }

      @Override
      protected void a(egw $$0, ty $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(egk $$0, egl $$1, ayd $$2) {
         this.a((eix.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((eix.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((eix.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static eix.n a(egl $$0, ayd $$1, int $$2, int $$3, int $$4, ir $$5, int $$6) {
         efy $$7 = efy.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new eix.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dap $$0, dan $$1, drv $$2, ayd $$3, efy $$4, czb $$5, im $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, eix.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, eix.p.a.a, 1, 1, 6);
         dpy $$7 = dcx.cq.n().a(dlx.g, ir.f);
         dpy $$8 = dcx.cq.n().a(dlx.g, ir.e);
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

   public static class o extends eix.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, ayd $$1, efy $$2, ir $$3) {
         super(egx.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(ty $$0) {
         super(egx.F, $$0);
      }

      @Override
      public void a(egk $$0, egl $$1, ayd $$2) {
         this.a((eix.m)$$0, $$1, $$2, 1, 1);
      }

      public static eix.o a(egl $$0, ayd $$1, int $$2, int $$3, int $$4, ir $$5, int $$6) {
         efy $$7 = efy.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new eix.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dap $$0, dan $$1, drv $$2, ayd $$3, efy $$4, czb $$5, im $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, eix.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, eix.p.a.a, 1, 1, 7);
         dpy $$7 = dcx.cQ.n().a(dkp.b, ir.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, dcx.eH.n(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dcx.eH.n(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dcx.eH.n(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends egk {
      protected eix.p.a h = eix.p.a.a;

      protected p(egx $$0, int $$1, efy $$2) {
         super($$0, $$1, $$2);
      }

      public p(egx $$0, ty $$1) {
         super($$0, $$1);
         this.h = eix.p.a.valueOf($$1.l("EntryDoor"));
      }

      @Override
      protected void a(egw $$0, ty $$1) {
         $$1.a("EntryDoor", this.h.name());
      }

      protected void a(dap $$0, ayd $$1, efy $$2, eix.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, dcx.eH.n(), $$4, $$5, $$6, $$2);
               this.a($$0, dcx.eH.n(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dcx.eH.n(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dcx.eH.n(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dcx.eH.n(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dcx.eH.n(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dcx.eH.n(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dcx.cN.n(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dcx.cN.n().a(dfb.f, dqu.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, dcx.nc.n(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dcx.nc.n(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dcx.eW.n().a(dgw.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, dcx.eW.n().a(dgw.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dcx.eW.n().a(dgw.b, Boolean.valueOf(true)).a(dgw.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dcx.eW.n().a(dgw.b, Boolean.valueOf(true)).a(dgw.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dcx.eW.n().a(dgw.b, Boolean.valueOf(true)).a(dgw.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dcx.eW.n().a(dgw.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dcx.eW.n().a(dgw.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, dcx.eH.n(), $$4, $$5, $$6, $$2);
               this.a($$0, dcx.eH.n(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dcx.eH.n(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dcx.eH.n(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dcx.eH.n(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dcx.eH.n(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dcx.eH.n(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dcx.dy.n(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dcx.dy.n().a(dfb.f, dqu.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dcx.dM.n().a(ddf.aE, ir.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, dcx.dM.n().a(ddf.aE, ir.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected eix.p.a b(ayd $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return eix.p.a.a;
            case 2:
               return eix.p.a.b;
            case 3:
               return eix.p.a.c;
            case 4:
               return eix.p.a.d;
         }
      }

      @Nullable
      protected egk a(eix.m $$0, egl $$1, ayd $$2, int $$3, int $$4) {
         ir $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eix.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$5, this.g());
               case d:
                  return eix.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$5, this.g());
               case e:
                  return eix.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
               case f:
                  return eix.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected egk b(eix.m $$0, egl $$1, ayd $$2, int $$3, int $$4) {
         ir $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eix.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, ir.e, this.g());
               case d:
                  return eix.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, ir.e, this.g());
               case e:
                  return eix.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, ir.c, this.g());
               case f:
                  return eix.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, ir.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected egk c(eix.m $$0, egl $$1, ayd $$2, int $$3, int $$4) {
         ir $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eix.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, ir.f, this.g());
               case d:
                  return eix.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, ir.f, this.g());
               case e:
                  return eix.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, ir.d, this.g());
               case f:
                  return eix.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, ir.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(efy $$0) {
         return $$0 != null && $$0.i() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;
      }
   }

   public abstract static class q extends eix.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(egx $$0, int $$1, efy $$2) {
         super($$0, $$1, $$2);
      }

      public q(egx $$0, ty $$1) {
         super($$0, $$1);
      }
   }
}
