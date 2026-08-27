import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class dxn {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final dxn.f[] g = new dxn.f[]{
      new dxn.f(dxn.n.class, 40, 0),
      new dxn.f(dxn.h.class, 5, 5),
      new dxn.f(dxn.d.class, 20, 0),
      new dxn.f(dxn.i.class, 20, 0),
      new dxn.f(dxn.j.class, 10, 6),
      new dxn.f(dxn.o.class, 5, 5),
      new dxn.f(dxn.l.class, 5, 5),
      new dxn.f(dxn.c.class, 5, 4),
      new dxn.f(dxn.a.class, 5, 4),
      new dxn.f(dxn.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new dxn.f(dxn.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<dxn.f> h;
   static Class<? extends dxn.p> i;
   private static int j;
   static final dxn.k k = new dxn.k();

   public static void a() {
      h = Lists.newArrayList();

      for (dxn.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (dxn.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static dxn.p a(Class<? extends dxn.p> $$0, dvi $$1, arx $$2, int $$3, int $$4, int $$5, @Nullable hc $$6, int $$7) {
      dxn.p $$8 = null;
      if ($$0 == dxn.n.class) {
         $$8 = dxn.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dxn.h.class) {
         $$8 = dxn.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dxn.d.class) {
         $$8 = dxn.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dxn.i.class) {
         $$8 = dxn.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dxn.j.class) {
         $$8 = dxn.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dxn.o.class) {
         $$8 = dxn.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dxn.l.class) {
         $$8 = dxn.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dxn.c.class) {
         $$8 = dxn.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dxn.a.class) {
         $$8 = dxn.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dxn.e.class) {
         $$8 = dxn.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dxn.g.class) {
         $$8 = dxn.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static dxn.p a(dxn.m $$0, dvi $$1, arx $$2, int $$3, int $$4, int $$5, hc $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            dxn.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (dxn.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  dxn.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         duv $$13 = dxn.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.h() > 1 ? new dxn.b($$7, $$13, $$6) : null;
      }
   }

   static dvh b(dxn.m $$0, dvi $$1, arx $$2, int $$3, int $$4, int $$5, @Nullable hc $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().g()) <= 112 && Math.abs($$5 - $$0.f().i()) <= 112) {
         dvh $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends dxn.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, arx $$1, duv $$2, hc $$3) {
         super(dvu.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(qu $$0) {
         super(dvu.t, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(dvt $$0, qu $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(dvh $$0, dvi $$1, arx $$2) {
         this.a((dxn.m)$$0, $$1, $$2, 1, 1);
      }

      public static dxn.a a(dvi $$0, arx $$1, int $$2, int $$3, int $$4, hc $$5, int $$6) {
         duv $$7 = duv.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new dxn.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cqk $$0, cqi $$1, dhb $$2, arx $$3, duv $$4, cox $$5, gw $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, dxn.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, dxn.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, csr.eI.n(), csr.eI.n(), false);
         this.a($$0, csr.jK.n(), 3, 1, 1, $$4);
         this.a($$0, csr.jK.n(), 3, 1, 5, $$4);
         this.a($$0, csr.jK.n(), 3, 2, 2, $$4);
         this.a($$0, csr.jK.n(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, csr.jK.n(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, ecj.y);
         }
      }
   }

   public static class b extends dxn.p {
      private final int a;

      public b(int $$0, duv $$1, hc $$2) {
         super(dvu.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != hc.c && $$2 != hc.d ? $$1.c() : $$1.e();
      }

      public b(qu $$0) {
         super(dvu.u, $$0);
         this.a = $$0.h("Steps");
      }

      @Override
      protected void a(dvt $$0, qu $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static duv a(dvi $$0, arx $$1, int $$2, int $$3, int $$4, hc $$5) {
         int $$6 = 3;
         duv $$7 = duv.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         dvh $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().h() == $$7.h()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = duv.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return duv.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(cqk $$0, cqi $$1, dhb $$2, arx $$3, duv $$4, cox $$5, gw $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, csr.eI.n(), 0, 0, $$7, $$4);
            this.a($$0, csr.eI.n(), 1, 0, $$7, $$4);
            this.a($$0, csr.eI.n(), 2, 0, $$7, $$4);
            this.a($$0, csr.eI.n(), 3, 0, $$7, $$4);
            this.a($$0, csr.eI.n(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, csr.eI.n(), 0, $$8, $$7, $$4);
               this.a($$0, csr.nc.n(), 1, $$8, $$7, $$4);
               this.a($$0, csr.nc.n(), 2, $$8, $$7, $$4);
               this.a($$0, csr.nc.n(), 3, $$8, $$7, $$4);
               this.a($$0, csr.eI.n(), 4, $$8, $$7, $$4);
            }

            this.a($$0, csr.eI.n(), 0, 4, $$7, $$4);
            this.a($$0, csr.eI.n(), 1, 4, $$7, $$4);
            this.a($$0, csr.eI.n(), 2, 4, $$7, $$4);
            this.a($$0, csr.eI.n(), 3, 4, $$7, $$4);
            this.a($$0, csr.eI.n(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends dxn.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, arx $$1, duv $$2, hc $$3) {
         super(dvu.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(qu $$0) {
         super(dvu.v, $$0);
         this.d = $$0.q("leftLow");
         this.i = $$0.q("leftHigh");
         this.j = $$0.q("rightLow");
         this.k = $$0.q("rightHigh");
      }

      @Override
      protected void a(dvt $$0, qu $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(dvh $$0, dvi $$1, arx $$2) {
         int $$3 = 3;
         int $$4 = 5;
         hc $$5 = this.i();
         if ($$5 == hc.e || $$5 == hc.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((dxn.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((dxn.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((dxn.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((dxn.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((dxn.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static dxn.c a(dvi $$0, arx $$1, int $$2, int $$3, int $$4, hc $$5, int $$6) {
         duv $$7 = duv.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new dxn.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cqk $$0, cqi $$1, dhb $$2, arx $$3, duv $$4, cox $$5, gw $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, dxn.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, dxn.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, dxn.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, dxn.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, dxn.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, dxn.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, csr.jE.n(), csr.jE.n(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, csr.jE.n(), csr.jE.n(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, dxn.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, csr.jE.n(), csr.jE.n(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, csr.jE.n(), csr.jE.n(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, csr.jE.n(), csr.jE.n(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, csr.jE.n(), csr.jE.n(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, csr.jE.n().a(czt.a, dgm.c), csr.jE.n().a(czt.a, dgm.c), false);
         this.a($$0, csr.cq.n().a(dbq.a, hc.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends dxn.q {
      public d(int $$0, arx $$1, duv $$2, hc $$3) {
         super(dvu.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(qu $$0) {
         super(dvu.w, $$0);
      }

      @Override
      public void a(dvh $$0, dvi $$1, arx $$2) {
         hc $$3 = this.i();
         if ($$3 != hc.c && $$3 != hc.f) {
            this.c((dxn.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((dxn.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static dxn.d a(dvi $$0, arx $$1, int $$2, int $$3, int $$4, hc $$5, int $$6) {
         duv $$7 = duv.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new dxn.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cqk $$0, cqi $$1, dhb $$2, arx $$3, duv $$4, cox $$5, gw $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, dxn.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         hc $$7 = this.i();
         if ($$7 != hc.c && $$7 != hc.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends dxn.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, arx $$1, duv $$2, hc $$3) {
         super(dvu.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.d() > 6;
      }

      public e(qu $$0) {
         super(dvu.x, $$0);
         this.i = $$0.q("Tall");
      }

      @Override
      protected void a(dvt $$0, qu $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static dxn.e a(dvi $$0, arx $$1, int $$2, int $$3, int $$4, hc $$5, int $$6) {
         duv $$7 = duv.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = duv.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new dxn.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(cqk $$0, cqi $$1, dhb $$2, arx $$3, duv $$4, cox $$5, gw $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, dxn.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, csr.bs.n(), csr.bs.n(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, csr.n.n(), csr.n.n(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, csr.n.n(), csr.n.n(), false);
               this.a($$0, csr.cq.n().a(dbq.a, hc.f), 2, 3, $$10, $$4);
               this.a($$0, csr.cq.n().a(dbq.a, hc.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, csr.n.n(), csr.n.n(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, csr.n.n(), csr.n.n(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, csr.cl.n(), csr.cl.n(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, csr.cl.n(), csr.cl.n(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, csr.cl.n(), csr.cl.n(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, csr.cl.n(), csr.cl.n(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, csr.cl.n(), csr.cl.n(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, csr.cl.n(), csr.cl.n(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, csr.cl.n(), csr.cl.n(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, csr.n.n(), csr.n.n(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, csr.n.n(), csr.n.n(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, csr.n.n(), csr.n.n(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, csr.n.n(), csr.n.n(), false);
            this.a($$0, csr.n.n(), 9, 5, 11, $$4);
            this.a($$0, csr.n.n(), 8, 5, 11, $$4);
            this.a($$0, csr.n.n(), 9, 5, 10, $$4);
            dfe $$12 = csr.dU.n().a(cvk.d, Boolean.valueOf(true)).a(cvk.b, Boolean.valueOf(true));
            dfe $$13 = csr.dU.n().a(cvk.a, Boolean.valueOf(true)).a(cvk.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, csr.dU.n().a(cvk.a, Boolean.valueOf(true)).a(cvk.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, csr.dU.n().a(cvk.c, Boolean.valueOf(true)).a(cvk.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, csr.dU.n().a(cvk.a, Boolean.valueOf(true)).a(cvk.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, csr.dU.n().a(cvk.c, Boolean.valueOf(true)).a(cvk.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, csr.dU.n().a(cvk.a, Boolean.valueOf(true)).a(cvk.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            dfe $$15 = csr.cO.n().a(cwt.a, hc.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            dfe $$18 = csr.dU.n().a(cvk.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            dfe $$19 = csr.dU.n().a(cvk.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            dfe $$20 = $$13.a(cvk.d, Boolean.valueOf(true)).a(cvk.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.a(cvk.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.a(cvk.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.a(cvk.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.a(cvk.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            dfe $$21 = csr.cp.n();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, ecj.w);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, ecj.w);
         }
      }
   }

   static class f {
      public final Class<? extends dxn.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends dxn.p> $$0, int $$1, int $$2) {
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

   public static class g extends dxn.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, duv $$1, hc $$2) {
         super(dvu.y, $$0, $$1);
         this.a($$2);
      }

      public g(qu $$0) {
         super(dvu.y, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(dvt $$0, qu $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(dvh $$0, dvi $$1, arx $$2) {
         if ($$0 != null) {
            ((dxn.m)$$0).b = this;
         }
      }

      public static dxn.g a(dvi $$0, int $$1, int $$2, int $$3, hc $$4, int $$5) {
         duv $$6 = duv.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new dxn.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(cqk $$0, cqi $$1, dhb $$2, arx $$3, duv $$4, cox $$5, gw $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, dxn.k);
         this.a($$0, $$3, $$4, dxn.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, dxn.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, dxn.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, dxn.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, dxn.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, dxn.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, dxn.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, csr.H.n(), csr.H.n(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, csr.H.n(), csr.H.n(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, dxn.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, csr.H.n(), csr.H.n(), false);
         dfe $$8 = csr.eX.n().a(cwo.a, Boolean.valueOf(true)).a(cwo.c, Boolean.valueOf(true));
         dfe $$9 = csr.eX.n().a(cwo.d, Boolean.valueOf(true)).a(cwo.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         dfe $$12 = csr.fj.n().a(dak.a, hc.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, dxn.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, dxn.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, dxn.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         dfe $$14 = csr.fy.n().a(cvb.a, hc.c);
         dfe $$15 = csr.fy.n().a(cvb.a, hc.d);
         dfe $$16 = csr.fy.n().a(cvb.a, hc.f);
         dfe $$17 = csr.fy.n().a(cvb.a, hc.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.a(cvb.b, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.a(cvb.b, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.a(cvb.b, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.a(cvb.b, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.a(cvb.b, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.a(cvb.b, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.a(cvb.b, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.a(cvb.b, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.a(cvb.b, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.a(cvb.b, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.a(cvb.b, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.a(cvb.b, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            dfe $$21 = csr.fx.n();
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
            gw $$22 = this.b(5, 3, 6);
            if ($$4.b($$22)) {
               this.d = true;
               $$0.a($$22, csr.ct.n(), 2);
               if ($$0.c_($$22) instanceof dec $$24) {
                  $$24.a(bip.aI, $$3);
               }
            }
         }
      }
   }

   public static class h extends dxn.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, arx $$1, duv $$2, hc $$3) {
         super(dvu.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(qu $$0) {
         super(dvu.z, $$0);
      }

      @Override
      public void a(dvh $$0, dvi $$1, arx $$2) {
         this.a((dxn.m)$$0, $$1, $$2, 1, 1);
      }

      public static dxn.h a(dvi $$0, arx $$1, int $$2, int $$3, int $$4, hc $$5, int $$6) {
         duv $$7 = duv.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new dxn.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cqk $$0, cqi $$1, dhb $$2, arx $$3, duv $$4, cox $$5, gw $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, dxn.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, dxn.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, dxn.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, dxn.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, dxn.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, csr.eX.n().a(cwo.a, Boolean.valueOf(true)).a(cwo.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, csr.eX.n().a(cwo.a, Boolean.valueOf(true)).a(cwo.c, Boolean.valueOf(true)).a(cwo.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, csr.eX.n().a(cwo.a, Boolean.valueOf(true)).a(cwo.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, csr.eX.n().a(cwo.d, Boolean.valueOf(true)).a(cwo.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, csr.eX.n().a(cwo.d, Boolean.valueOf(true)).a(cwo.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, csr.eX.n().a(cwo.d, Boolean.valueOf(true)).a(cwo.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, csr.eX.n().a(cwo.a, Boolean.valueOf(true)).a(cwo.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, csr.eX.n().a(cwo.a, Boolean.valueOf(true)).a(cwo.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         dfe $$8 = csr.dy.n().a(cus.a, hc.e);
         dfe $$9 = csr.dy.n().a(cus.a, hc.e).a(cus.e, dga.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends dxn.q {
      public i(int $$0, arx $$1, duv $$2, hc $$3) {
         super(dvu.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(qu $$0) {
         super(dvu.A, $$0);
      }

      @Override
      public void a(dvh $$0, dvi $$1, arx $$2) {
         hc $$3 = this.i();
         if ($$3 != hc.c && $$3 != hc.f) {
            this.b((dxn.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((dxn.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static dxn.i a(dvi $$0, arx $$1, int $$2, int $$3, int $$4, hc $$5, int $$6) {
         duv $$7 = duv.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new dxn.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cqk $$0, cqi $$1, dhb $$2, arx $$3, duv $$4, cox $$5, gw $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, dxn.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         hc $$7 = this.i();
         if ($$7 != hc.c && $$7 != hc.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends dxn.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, arx $$1, duv $$2, hc $$3) {
         super(dvu.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(qu $$0) {
         super(dvu.B, $$0);
         this.d = $$0.h("Type");
      }

      @Override
      protected void a(dvt $$0, qu $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(dvh $$0, dvi $$1, arx $$2) {
         this.a((dxn.m)$$0, $$1, $$2, 4, 1);
         this.b((dxn.m)$$0, $$1, $$2, 1, 4);
         this.c((dxn.m)$$0, $$1, $$2, 1, 4);
      }

      public static dxn.j a(dvi $$0, arx $$1, int $$2, int $$3, int $$4, hc $$5, int $$6) {
         duv $$7 = duv.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new dxn.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cqk $$0, cqi $$1, dhb $$2, arx $$3, duv $$4, cox $$5, gw $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, dxn.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, csr.eI.n(), 5, 1, 5, $$4);
               this.a($$0, csr.eI.n(), 5, 2, 5, $$4);
               this.a($$0, csr.eI.n(), 5, 3, 5, $$4);
               this.a($$0, csr.cq.n().a(dbq.a, hc.e), 4, 3, 5, $$4);
               this.a($$0, csr.cq.n().a(dbq.a, hc.f), 6, 3, 5, $$4);
               this.a($$0, csr.cq.n().a(dbq.a, hc.d), 5, 3, 4, $$4);
               this.a($$0, csr.cq.n().a(dbq.a, hc.c), 5, 3, 6, $$4);
               this.a($$0, csr.jE.n(), 4, 1, 4, $$4);
               this.a($$0, csr.jE.n(), 4, 1, 5, $$4);
               this.a($$0, csr.jE.n(), 4, 1, 6, $$4);
               this.a($$0, csr.jE.n(), 6, 1, 4, $$4);
               this.a($$0, csr.jE.n(), 6, 1, 5, $$4);
               this.a($$0, csr.jE.n(), 6, 1, 6, $$4);
               this.a($$0, csr.jE.n(), 5, 1, 4, $$4);
               this.a($$0, csr.jE.n(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, csr.eI.n(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, csr.eI.n(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, csr.eI.n(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, csr.eI.n(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, csr.eI.n(), 5, 1, 5, $$4);
               this.a($$0, csr.eI.n(), 5, 2, 5, $$4);
               this.a($$0, csr.eI.n(), 5, 3, 5, $$4);
               this.a($$0, csr.G.n(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, csr.m.n(), 1, 3, $$8, $$4);
                  this.a($$0, csr.m.n(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, csr.m.n(), $$9, 3, 1, $$4);
                  this.a($$0, csr.m.n(), $$9, 3, 9, $$4);
               }

               this.a($$0, csr.m.n(), 5, 1, 4, $$4);
               this.a($$0, csr.m.n(), 5, 1, 6, $$4);
               this.a($$0, csr.m.n(), 5, 3, 4, $$4);
               this.a($$0, csr.m.n(), 5, 3, 6, $$4);
               this.a($$0, csr.m.n(), 4, 1, 5, $$4);
               this.a($$0, csr.m.n(), 6, 1, 5, $$4);
               this.a($$0, csr.m.n(), 4, 3, 5, $$4);
               this.a($$0, csr.m.n(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, csr.m.n(), 4, $$10, 4, $$4);
                  this.a($$0, csr.m.n(), 6, $$10, 4, $$4);
                  this.a($$0, csr.m.n(), 4, $$10, 6, $$4);
                  this.a($$0, csr.m.n(), 6, $$10, 6, $$4);
               }

               this.a($$0, csr.cq.n(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, csr.n.n(), 2, 3, $$11, $$4);
                  this.a($$0, csr.n.n(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, csr.n.n(), 4, 3, $$11, $$4);
                     this.a($$0, csr.n.n(), 5, 3, $$11, $$4);
                     this.a($$0, csr.n.n(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, csr.n.n(), 7, 3, $$11, $$4);
                  this.a($$0, csr.n.n(), 8, 3, $$11, $$4);
               }

               dfe $$12 = csr.cO.n().a(cwt.a, hc.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, ecj.x);
         }
      }
   }

   static class k extends dvh.a {
      @Override
      public void a(arx $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = csr.eK.n();
            } else if ($$5 < 0.5F) {
               this.a = csr.eJ.n();
            } else if ($$5 < 0.55F) {
               this.a = csr.eQ.n();
            } else {
               this.a = csr.eI.n();
            }
         } else {
            this.a = csr.nc.n();
         }
      }
   }

   public static class l extends dxn.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(dvu $$0, int $$1, int $$2, int $$3, hc $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = dxn.p.a.a;
      }

      public l(int $$0, arx $$1, duv $$2, hc $$3) {
         super(dvu.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(dvu $$0, qu $$1) {
         super($$0, $$1);
         this.d = $$1.q("Source");
      }

      public l(qu $$0) {
         this(dvu.C, $$0);
      }

      @Override
      protected void a(dvt $$0, qu $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(dvh $$0, dvi $$1, arx $$2) {
         if (this.d) {
            dxn.i = dxn.c.class;
         }

         this.a((dxn.m)$$0, $$1, $$2, 1, 1);
      }

      public static dxn.l a(dvi $$0, arx $$1, int $$2, int $$3, int $$4, hc $$5, int $$6) {
         duv $$7 = duv.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new dxn.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cqk $$0, cqi $$1, dhb $$2, arx $$3, duv $$4, cox $$5, gw $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, dxn.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, dxn.p.a.a, 1, 1, 4);
         this.a($$0, csr.eI.n(), 2, 6, 1, $$4);
         this.a($$0, csr.eI.n(), 1, 5, 1, $$4);
         this.a($$0, csr.jE.n(), 1, 6, 1, $$4);
         this.a($$0, csr.eI.n(), 1, 5, 2, $$4);
         this.a($$0, csr.eI.n(), 1, 4, 3, $$4);
         this.a($$0, csr.jE.n(), 1, 5, 3, $$4);
         this.a($$0, csr.eI.n(), 2, 4, 3, $$4);
         this.a($$0, csr.eI.n(), 3, 3, 3, $$4);
         this.a($$0, csr.jE.n(), 3, 4, 3, $$4);
         this.a($$0, csr.eI.n(), 3, 3, 2, $$4);
         this.a($$0, csr.eI.n(), 3, 2, 1, $$4);
         this.a($$0, csr.jE.n(), 3, 3, 1, $$4);
         this.a($$0, csr.eI.n(), 2, 2, 1, $$4);
         this.a($$0, csr.eI.n(), 1, 1, 1, $$4);
         this.a($$0, csr.jE.n(), 1, 2, 1, $$4);
         this.a($$0, csr.eI.n(), 1, 1, 2, $$4);
         this.a($$0, csr.jE.n(), 1, 1, 3, $$4);
      }
   }

   public static class m extends dxn.l {
      public dxn.f a;
      @Nullable
      public dxn.g b;
      public final List<dvh> c = Lists.newArrayList();

      public m(arx $$0, int $$1, int $$2) {
         super(dvu.D, 0, $$1, $$2, a($$0));
      }

      public m(qu $$0) {
         super(dvu.D, $$0);
      }

      @Override
      public gw h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends dxn.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, arx $$1, duv $$2, hc $$3) {
         super(dvu.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(qu $$0) {
         super(dvu.E, $$0);
         this.d = $$0.q("Left");
         this.i = $$0.q("Right");
      }

      @Override
      protected void a(dvt $$0, qu $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(dvh $$0, dvi $$1, arx $$2) {
         this.a((dxn.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((dxn.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((dxn.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static dxn.n a(dvi $$0, arx $$1, int $$2, int $$3, int $$4, hc $$5, int $$6) {
         duv $$7 = duv.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new dxn.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cqk $$0, cqi $$1, dhb $$2, arx $$3, duv $$4, cox $$5, gw $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, dxn.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, dxn.p.a.a, 1, 1, 6);
         dfe $$7 = csr.cq.n().a(dbq.a, hc.f);
         dfe $$8 = csr.cq.n().a(dbq.a, hc.e);
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

   public static class o extends dxn.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, arx $$1, duv $$2, hc $$3) {
         super(dvu.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(qu $$0) {
         super(dvu.F, $$0);
      }

      @Override
      public void a(dvh $$0, dvi $$1, arx $$2) {
         this.a((dxn.m)$$0, $$1, $$2, 1, 1);
      }

      public static dxn.o a(dvi $$0, arx $$1, int $$2, int $$3, int $$4, hc $$5, int $$6) {
         duv $$7 = duv.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new dxn.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cqk $$0, cqi $$1, dhb $$2, arx $$3, duv $$4, cox $$5, gw $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, dxn.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, dxn.p.a.a, 1, 1, 7);
         dfe $$7 = csr.cQ.n().a(dak.a, hc.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, csr.eI.n(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, csr.eI.n(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, csr.eI.n(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends dvh {
      protected dxn.p.a h = dxn.p.a.a;

      protected p(dvu $$0, int $$1, duv $$2) {
         super($$0, $$1, $$2);
      }

      public p(dvu $$0, qu $$1) {
         super($$0, $$1);
         this.h = dxn.p.a.valueOf($$1.l("EntryDoor"));
      }

      @Override
      protected void a(dvt $$0, qu $$1) {
         $$1.a("EntryDoor", this.h.name());
      }

      protected void a(cqk $$0, arx $$1, duv $$2, dxn.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, csr.eI.n(), $$4, $$5, $$6, $$2);
               this.a($$0, csr.eI.n(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, csr.eI.n(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, csr.eI.n(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, csr.eI.n(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, csr.eI.n(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, csr.eI.n(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, csr.cN.n(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, csr.cN.n().a(cus.e, dga.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, csr.nc.n(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, csr.nc.n(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, csr.eX.n().a(cwo.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, csr.eX.n().a(cwo.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, csr.eX.n().a(cwo.b, Boolean.valueOf(true)).a(cwo.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, csr.eX.n().a(cwo.b, Boolean.valueOf(true)).a(cwo.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, csr.eX.n().a(cwo.b, Boolean.valueOf(true)).a(cwo.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, csr.eX.n().a(cwo.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, csr.eX.n().a(cwo.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, csr.eI.n(), $$4, $$5, $$6, $$2);
               this.a($$0, csr.eI.n(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, csr.eI.n(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, csr.eI.n(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, csr.eI.n(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, csr.eI.n(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, csr.eI.n(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, csr.dy.n(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, csr.dy.n().a(cus.e, dga.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, csr.dM.n().a(csz.aC, hc.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, csr.dM.n().a(csz.aC, hc.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected dxn.p.a b(arx $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return dxn.p.a.a;
            case 2:
               return dxn.p.a.b;
            case 3:
               return dxn.p.a.c;
            case 4:
               return dxn.p.a.d;
         }
      }

      @Nullable
      protected dvh a(dxn.m $$0, dvi $$1, arx $$2, int $$3, int $$4) {
         hc $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return dxn.b($$0, $$1, $$2, this.f.g() + $$3, this.f.h() + $$4, this.f.i() - 1, $$5, this.g());
               case d:
                  return dxn.b($$0, $$1, $$2, this.f.g() + $$3, this.f.h() + $$4, this.f.l() + 1, $$5, this.g());
               case e:
                  return dxn.b($$0, $$1, $$2, this.f.g() - 1, this.f.h() + $$4, this.f.i() + $$3, $$5, this.g());
               case f:
                  return dxn.b($$0, $$1, $$2, this.f.j() + 1, this.f.h() + $$4, this.f.i() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected dvh b(dxn.m $$0, dvi $$1, arx $$2, int $$3, int $$4) {
         hc $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return dxn.b($$0, $$1, $$2, this.f.g() - 1, this.f.h() + $$3, this.f.i() + $$4, hc.e, this.g());
               case d:
                  return dxn.b($$0, $$1, $$2, this.f.g() - 1, this.f.h() + $$3, this.f.i() + $$4, hc.e, this.g());
               case e:
                  return dxn.b($$0, $$1, $$2, this.f.g() + $$4, this.f.h() + $$3, this.f.i() - 1, hc.c, this.g());
               case f:
                  return dxn.b($$0, $$1, $$2, this.f.g() + $$4, this.f.h() + $$3, this.f.i() - 1, hc.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected dvh c(dxn.m $$0, dvi $$1, arx $$2, int $$3, int $$4) {
         hc $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return dxn.b($$0, $$1, $$2, this.f.j() + 1, this.f.h() + $$3, this.f.i() + $$4, hc.f, this.g());
               case d:
                  return dxn.b($$0, $$1, $$2, this.f.j() + 1, this.f.h() + $$3, this.f.i() + $$4, hc.f, this.g());
               case e:
                  return dxn.b($$0, $$1, $$2, this.f.g() + $$4, this.f.h() + $$3, this.f.l() + 1, hc.d, this.g());
               case f:
                  return dxn.b($$0, $$1, $$2, this.f.g() + $$4, this.f.h() + $$3, this.f.l() + 1, hc.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(duv $$0) {
         return $$0 != null && $$0.h() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;
      }
   }

   public abstract static class q extends dxn.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(dvu $$0, int $$1, duv $$2) {
         super($$0, $$1, $$2);
      }

      public q(dvu $$0, qu $$1) {
         super($$0, $$1);
      }
   }
}
