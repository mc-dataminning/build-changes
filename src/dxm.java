import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class dxm {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final dxm.f[] g = new dxm.f[]{
      new dxm.f(dxm.n.class, 40, 0),
      new dxm.f(dxm.h.class, 5, 5),
      new dxm.f(dxm.d.class, 20, 0),
      new dxm.f(dxm.i.class, 20, 0),
      new dxm.f(dxm.j.class, 10, 6),
      new dxm.f(dxm.o.class, 5, 5),
      new dxm.f(dxm.l.class, 5, 5),
      new dxm.f(dxm.c.class, 5, 4),
      new dxm.f(dxm.a.class, 5, 4),
      new dxm.f(dxm.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new dxm.f(dxm.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<dxm.f> h;
   static Class<? extends dxm.p> i;
   private static int j;
   static final dxm.k k = new dxm.k();

   public static void a() {
      h = Lists.newArrayList();

      for (dxm.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (dxm.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static dxm.p a(Class<? extends dxm.p> $$0, dvh $$1, ash $$2, int $$3, int $$4, int $$5, @Nullable ha $$6, int $$7) {
      dxm.p $$8 = null;
      if ($$0 == dxm.n.class) {
         $$8 = dxm.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dxm.h.class) {
         $$8 = dxm.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dxm.d.class) {
         $$8 = dxm.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dxm.i.class) {
         $$8 = dxm.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dxm.j.class) {
         $$8 = dxm.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dxm.o.class) {
         $$8 = dxm.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dxm.l.class) {
         $$8 = dxm.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dxm.c.class) {
         $$8 = dxm.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dxm.a.class) {
         $$8 = dxm.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dxm.e.class) {
         $$8 = dxm.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dxm.g.class) {
         $$8 = dxm.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static dxm.p a(dxm.m $$0, dvh $$1, ash $$2, int $$3, int $$4, int $$5, ha $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            dxm.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (dxm.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  dxm.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         duu $$13 = dxm.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.h() > 1 ? new dxm.b($$7, $$13, $$6) : null;
      }
   }

   static dvg b(dxm.m $$0, dvh $$1, ash $$2, int $$3, int $$4, int $$5, @Nullable ha $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().g()) <= 112 && Math.abs($$5 - $$0.f().i()) <= 112) {
         dvg $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends dxm.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, ash $$1, duu $$2, ha $$3) {
         super(dvt.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(qw $$0) {
         super(dvt.t, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(dvs $$0, qw $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(dvg $$0, dvh $$1, ash $$2) {
         this.a((dxm.m)$$0, $$1, $$2, 1, 1);
      }

      public static dxm.a a(dvh $$0, ash $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
         duu $$7 = duu.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new dxm.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cqv $$0, cqt $$1, dha $$2, ash $$3, duu $$4, cpi $$5, gw $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, dxm.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, dxm.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, cte.eH.o(), cte.eH.o(), false);
         this.a($$0, cte.jK.o(), 3, 1, 1, $$4);
         this.a($$0, cte.jK.o(), 3, 1, 5, $$4);
         this.a($$0, cte.jK.o(), 3, 2, 2, $$4);
         this.a($$0, cte.jK.o(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, cte.jK.o(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, eci.y);
         }
      }
   }

   public static class b extends dxm.p {
      private final int a;

      public b(int $$0, duu $$1, ha $$2) {
         super(dvt.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != ha.c && $$2 != ha.d ? $$1.c() : $$1.e();
      }

      public b(qw $$0) {
         super(dvt.u, $$0);
         this.a = $$0.h("Steps");
      }

      @Override
      protected void a(dvs $$0, qw $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static duu a(dvh $$0, ash $$1, int $$2, int $$3, int $$4, ha $$5) {
         int $$6 = 3;
         duu $$7 = duu.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         dvg $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().h() == $$7.h()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = duu.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return duu.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(cqv $$0, cqt $$1, dha $$2, ash $$3, duu $$4, cpi $$5, gw $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, cte.eH.o(), 0, 0, $$7, $$4);
            this.a($$0, cte.eH.o(), 1, 0, $$7, $$4);
            this.a($$0, cte.eH.o(), 2, 0, $$7, $$4);
            this.a($$0, cte.eH.o(), 3, 0, $$7, $$4);
            this.a($$0, cte.eH.o(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, cte.eH.o(), 0, $$8, $$7, $$4);
               this.a($$0, cte.nc.o(), 1, $$8, $$7, $$4);
               this.a($$0, cte.nc.o(), 2, $$8, $$7, $$4);
               this.a($$0, cte.nc.o(), 3, $$8, $$7, $$4);
               this.a($$0, cte.eH.o(), 4, $$8, $$7, $$4);
            }

            this.a($$0, cte.eH.o(), 0, 4, $$7, $$4);
            this.a($$0, cte.eH.o(), 1, 4, $$7, $$4);
            this.a($$0, cte.eH.o(), 2, 4, $$7, $$4);
            this.a($$0, cte.eH.o(), 3, 4, $$7, $$4);
            this.a($$0, cte.eH.o(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends dxm.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, ash $$1, duu $$2, ha $$3) {
         super(dvt.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(qw $$0) {
         super(dvt.v, $$0);
         this.d = $$0.q("leftLow");
         this.i = $$0.q("leftHigh");
         this.j = $$0.q("rightLow");
         this.k = $$0.q("rightHigh");
      }

      @Override
      protected void a(dvs $$0, qw $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(dvg $$0, dvh $$1, ash $$2) {
         int $$3 = 3;
         int $$4 = 5;
         ha $$5 = this.i();
         if ($$5 == ha.e || $$5 == ha.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((dxm.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((dxm.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((dxm.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((dxm.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((dxm.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static dxm.c a(dvh $$0, ash $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
         duu $$7 = duu.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new dxm.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cqv $$0, cqt $$1, dha $$2, ash $$3, duu $$4, cpi $$5, gw $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, dxm.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, dxm.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, dxm.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, dxm.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, dxm.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, dxm.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, cte.jE.o(), cte.jE.o(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, cte.jE.o(), cte.jE.o(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, dxm.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, cte.jE.o(), cte.jE.o(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, cte.jE.o(), cte.jE.o(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, cte.jE.o(), cte.jE.o(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, cte.jE.o(), cte.jE.o(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, cte.jE.o().a(dad.b, dgl.c), cte.jE.o().a(dad.b, dgl.c), false);
         this.a($$0, cte.cq.o().a(dbz.g, ha.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends dxm.q {
      public d(int $$0, ash $$1, duu $$2, ha $$3) {
         super(dvt.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(qw $$0) {
         super(dvt.w, $$0);
      }

      @Override
      public void a(dvg $$0, dvh $$1, ash $$2) {
         ha $$3 = this.i();
         if ($$3 != ha.c && $$3 != ha.f) {
            this.c((dxm.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((dxm.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static dxm.d a(dvh $$0, ash $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
         duu $$7 = duu.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new dxm.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cqv $$0, cqt $$1, dha $$2, ash $$3, duu $$4, cpi $$5, gw $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, dxm.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         ha $$7 = this.i();
         if ($$7 != ha.c && $$7 != ha.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends dxm.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, ash $$1, duu $$2, ha $$3) {
         super(dvt.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.d() > 6;
      }

      public e(qw $$0) {
         super(dvt.x, $$0);
         this.i = $$0.q("Tall");
      }

      @Override
      protected void a(dvs $$0, qw $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static dxm.e a(dvh $$0, ash $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
         duu $$7 = duu.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = duu.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new dxm.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(cqv $$0, cqt $$1, dha $$2, ash $$3, duu $$4, cpi $$5, gw $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, dxm.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, cte.bs.o(), cte.bs.o(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, cte.n.o(), cte.n.o(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, cte.n.o(), cte.n.o(), false);
               this.a($$0, cte.cq.o().a(dbz.g, ha.f), 2, 3, $$10, $$4);
               this.a($$0, cte.cq.o().a(dbz.g, ha.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, cte.n.o(), cte.n.o(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, cte.n.o(), cte.n.o(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, cte.cl.o(), cte.cl.o(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, cte.cl.o(), cte.cl.o(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, cte.cl.o(), cte.cl.o(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, cte.cl.o(), cte.cl.o(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, cte.cl.o(), cte.cl.o(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, cte.cl.o(), cte.cl.o(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, cte.cl.o(), cte.cl.o(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, cte.n.o(), cte.n.o(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, cte.n.o(), cte.n.o(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, cte.n.o(), cte.n.o(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, cte.n.o(), cte.n.o(), false);
            this.a($$0, cte.n.o(), 9, 5, 11, $$4);
            this.a($$0, cte.n.o(), 8, 5, 11, $$4);
            this.a($$0, cte.n.o(), 9, 5, 10, $$4);
            dfd $$12 = cte.dU.o().a(cvy.d, Boolean.valueOf(true)).a(cvy.b, Boolean.valueOf(true));
            dfd $$13 = cte.dU.o().a(cvy.a, Boolean.valueOf(true)).a(cvy.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, cte.dU.o().a(cvy.a, Boolean.valueOf(true)).a(cvy.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, cte.dU.o().a(cvy.c, Boolean.valueOf(true)).a(cvy.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, cte.dU.o().a(cvy.a, Boolean.valueOf(true)).a(cvy.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, cte.dU.o().a(cvy.c, Boolean.valueOf(true)).a(cvy.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, cte.dU.o().a(cvy.a, Boolean.valueOf(true)).a(cvy.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            dfd $$15 = cte.cO.o().a(cxg.b, ha.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            dfd $$18 = cte.dU.o().a(cvy.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            dfd $$19 = cte.dU.o().a(cvy.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            dfd $$20 = $$13.a(cvy.d, Boolean.valueOf(true)).a(cvy.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.a(cvy.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.a(cvy.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.a(cvy.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.a(cvy.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            dfd $$21 = cte.cp.o();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, eci.w);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, eci.w);
         }
      }
   }

   static class f {
      public final Class<? extends dxm.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends dxm.p> $$0, int $$1, int $$2) {
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

   public static class g extends dxm.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, duu $$1, ha $$2) {
         super(dvt.y, $$0, $$1);
         this.a($$2);
      }

      public g(qw $$0) {
         super(dvt.y, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(dvs $$0, qw $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(dvg $$0, dvh $$1, ash $$2) {
         if ($$0 != null) {
            ((dxm.m)$$0).b = this;
         }
      }

      public static dxm.g a(dvh $$0, int $$1, int $$2, int $$3, ha $$4, int $$5) {
         duu $$6 = duu.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new dxm.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(cqv $$0, cqt $$1, dha $$2, ash $$3, duu $$4, cpi $$5, gw $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, dxm.k);
         this.a($$0, $$3, $$4, dxm.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, dxm.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, dxm.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, dxm.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, dxm.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, dxm.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, dxm.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, cte.H.o(), cte.H.o(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, cte.H.o(), cte.H.o(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, dxm.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, cte.H.o(), cte.H.o(), false);
         dfd $$8 = cte.eW.o().a(cxb.a, Boolean.valueOf(true)).a(cxb.c, Boolean.valueOf(true));
         dfd $$9 = cte.eW.o().a(cxb.d, Boolean.valueOf(true)).a(cxb.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         dfd $$12 = cte.fj.o().a(dau.b, ha.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, dxm.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, dxm.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, dxm.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         dfd $$14 = cte.fy.o().a(cvp.b, ha.c);
         dfd $$15 = cte.fy.o().a(cvp.b, ha.d);
         dfd $$16 = cte.fy.o().a(cvp.b, ha.f);
         dfd $$17 = cte.fy.o().a(cvp.b, ha.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.a(cvp.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.a(cvp.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.a(cvp.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.a(cvp.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.a(cvp.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.a(cvp.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.a(cvp.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.a(cvp.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.a(cvp.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.a(cvp.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.a(cvp.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.a(cvp.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            dfd $$21 = cte.fx.o();
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
               $$0.a($$22, cte.ct.o(), 2);
               if ($$0.c_($$22) instanceof del $$24) {
                  $$24.a(bja.aI, $$3);
               }
            }
         }
      }
   }

   public static class h extends dxm.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, ash $$1, duu $$2, ha $$3) {
         super(dvt.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(qw $$0) {
         super(dvt.z, $$0);
      }

      @Override
      public void a(dvg $$0, dvh $$1, ash $$2) {
         this.a((dxm.m)$$0, $$1, $$2, 1, 1);
      }

      public static dxm.h a(dvh $$0, ash $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
         duu $$7 = duu.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new dxm.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cqv $$0, cqt $$1, dha $$2, ash $$3, duu $$4, cpi $$5, gw $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, dxm.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, dxm.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, dxm.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, dxm.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, dxm.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, cte.eW.o().a(cxb.a, Boolean.valueOf(true)).a(cxb.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, cte.eW.o().a(cxb.a, Boolean.valueOf(true)).a(cxb.c, Boolean.valueOf(true)).a(cxb.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, cte.eW.o().a(cxb.a, Boolean.valueOf(true)).a(cxb.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, cte.eW.o().a(cxb.d, Boolean.valueOf(true)).a(cxb.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, cte.eW.o().a(cxb.d, Boolean.valueOf(true)).a(cxb.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, cte.eW.o().a(cxb.d, Boolean.valueOf(true)).a(cxb.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, cte.eW.o().a(cxb.a, Boolean.valueOf(true)).a(cxb.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, cte.eW.o().a(cxb.a, Boolean.valueOf(true)).a(cxb.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         dfd $$8 = cte.dy.o().a(cvg.b, ha.e);
         dfd $$9 = cte.dy.o().a(cvg.b, ha.e).a(cvg.f, dfz.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends dxm.q {
      public i(int $$0, ash $$1, duu $$2, ha $$3) {
         super(dvt.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(qw $$0) {
         super(dvt.A, $$0);
      }

      @Override
      public void a(dvg $$0, dvh $$1, ash $$2) {
         ha $$3 = this.i();
         if ($$3 != ha.c && $$3 != ha.f) {
            this.b((dxm.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((dxm.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static dxm.i a(dvh $$0, ash $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
         duu $$7 = duu.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new dxm.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cqv $$0, cqt $$1, dha $$2, ash $$3, duu $$4, cpi $$5, gw $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, dxm.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         ha $$7 = this.i();
         if ($$7 != ha.c && $$7 != ha.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends dxm.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, ash $$1, duu $$2, ha $$3) {
         super(dvt.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(qw $$0) {
         super(dvt.B, $$0);
         this.d = $$0.h("Type");
      }

      @Override
      protected void a(dvs $$0, qw $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(dvg $$0, dvh $$1, ash $$2) {
         this.a((dxm.m)$$0, $$1, $$2, 4, 1);
         this.b((dxm.m)$$0, $$1, $$2, 1, 4);
         this.c((dxm.m)$$0, $$1, $$2, 1, 4);
      }

      public static dxm.j a(dvh $$0, ash $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
         duu $$7 = duu.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new dxm.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cqv $$0, cqt $$1, dha $$2, ash $$3, duu $$4, cpi $$5, gw $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, dxm.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, cte.eH.o(), 5, 1, 5, $$4);
               this.a($$0, cte.eH.o(), 5, 2, 5, $$4);
               this.a($$0, cte.eH.o(), 5, 3, 5, $$4);
               this.a($$0, cte.cq.o().a(dbz.g, ha.e), 4, 3, 5, $$4);
               this.a($$0, cte.cq.o().a(dbz.g, ha.f), 6, 3, 5, $$4);
               this.a($$0, cte.cq.o().a(dbz.g, ha.d), 5, 3, 4, $$4);
               this.a($$0, cte.cq.o().a(dbz.g, ha.c), 5, 3, 6, $$4);
               this.a($$0, cte.jE.o(), 4, 1, 4, $$4);
               this.a($$0, cte.jE.o(), 4, 1, 5, $$4);
               this.a($$0, cte.jE.o(), 4, 1, 6, $$4);
               this.a($$0, cte.jE.o(), 6, 1, 4, $$4);
               this.a($$0, cte.jE.o(), 6, 1, 5, $$4);
               this.a($$0, cte.jE.o(), 6, 1, 6, $$4);
               this.a($$0, cte.jE.o(), 5, 1, 4, $$4);
               this.a($$0, cte.jE.o(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, cte.eH.o(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, cte.eH.o(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, cte.eH.o(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, cte.eH.o(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, cte.eH.o(), 5, 1, 5, $$4);
               this.a($$0, cte.eH.o(), 5, 2, 5, $$4);
               this.a($$0, cte.eH.o(), 5, 3, 5, $$4);
               this.a($$0, cte.G.o(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, cte.m.o(), 1, 3, $$8, $$4);
                  this.a($$0, cte.m.o(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, cte.m.o(), $$9, 3, 1, $$4);
                  this.a($$0, cte.m.o(), $$9, 3, 9, $$4);
               }

               this.a($$0, cte.m.o(), 5, 1, 4, $$4);
               this.a($$0, cte.m.o(), 5, 1, 6, $$4);
               this.a($$0, cte.m.o(), 5, 3, 4, $$4);
               this.a($$0, cte.m.o(), 5, 3, 6, $$4);
               this.a($$0, cte.m.o(), 4, 1, 5, $$4);
               this.a($$0, cte.m.o(), 6, 1, 5, $$4);
               this.a($$0, cte.m.o(), 4, 3, 5, $$4);
               this.a($$0, cte.m.o(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, cte.m.o(), 4, $$10, 4, $$4);
                  this.a($$0, cte.m.o(), 6, $$10, 4, $$4);
                  this.a($$0, cte.m.o(), 4, $$10, 6, $$4);
                  this.a($$0, cte.m.o(), 6, $$10, 6, $$4);
               }

               this.a($$0, cte.cq.o(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, cte.n.o(), 2, 3, $$11, $$4);
                  this.a($$0, cte.n.o(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, cte.n.o(), 4, 3, $$11, $$4);
                     this.a($$0, cte.n.o(), 5, 3, $$11, $$4);
                     this.a($$0, cte.n.o(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, cte.n.o(), 7, 3, $$11, $$4);
                  this.a($$0, cte.n.o(), 8, 3, $$11, $$4);
               }

               dfd $$12 = cte.cO.o().a(cxg.b, ha.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, eci.x);
         }
      }
   }

   static class k extends dvg.a {
      @Override
      public void a(ash $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = cte.eJ.o();
            } else if ($$5 < 0.5F) {
               this.a = cte.eI.o();
            } else if ($$5 < 0.55F) {
               this.a = cte.eP.o();
            } else {
               this.a = cte.eH.o();
            }
         } else {
            this.a = cte.nc.o();
         }
      }
   }

   public static class l extends dxm.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(dvt $$0, int $$1, int $$2, int $$3, ha $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = dxm.p.a.a;
      }

      public l(int $$0, ash $$1, duu $$2, ha $$3) {
         super(dvt.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(dvt $$0, qw $$1) {
         super($$0, $$1);
         this.d = $$1.q("Source");
      }

      public l(qw $$0) {
         this(dvt.C, $$0);
      }

      @Override
      protected void a(dvs $$0, qw $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(dvg $$0, dvh $$1, ash $$2) {
         if (this.d) {
            dxm.i = dxm.c.class;
         }

         this.a((dxm.m)$$0, $$1, $$2, 1, 1);
      }

      public static dxm.l a(dvh $$0, ash $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
         duu $$7 = duu.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new dxm.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cqv $$0, cqt $$1, dha $$2, ash $$3, duu $$4, cpi $$5, gw $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, dxm.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, dxm.p.a.a, 1, 1, 4);
         this.a($$0, cte.eH.o(), 2, 6, 1, $$4);
         this.a($$0, cte.eH.o(), 1, 5, 1, $$4);
         this.a($$0, cte.jE.o(), 1, 6, 1, $$4);
         this.a($$0, cte.eH.o(), 1, 5, 2, $$4);
         this.a($$0, cte.eH.o(), 1, 4, 3, $$4);
         this.a($$0, cte.jE.o(), 1, 5, 3, $$4);
         this.a($$0, cte.eH.o(), 2, 4, 3, $$4);
         this.a($$0, cte.eH.o(), 3, 3, 3, $$4);
         this.a($$0, cte.jE.o(), 3, 4, 3, $$4);
         this.a($$0, cte.eH.o(), 3, 3, 2, $$4);
         this.a($$0, cte.eH.o(), 3, 2, 1, $$4);
         this.a($$0, cte.jE.o(), 3, 3, 1, $$4);
         this.a($$0, cte.eH.o(), 2, 2, 1, $$4);
         this.a($$0, cte.eH.o(), 1, 1, 1, $$4);
         this.a($$0, cte.jE.o(), 1, 2, 1, $$4);
         this.a($$0, cte.eH.o(), 1, 1, 2, $$4);
         this.a($$0, cte.jE.o(), 1, 1, 3, $$4);
      }
   }

   public static class m extends dxm.l {
      public dxm.f a;
      @Nullable
      public dxm.g b;
      public final List<dvg> c = Lists.newArrayList();

      public m(ash $$0, int $$1, int $$2) {
         super(dvt.D, 0, $$1, $$2, a($$0));
      }

      public m(qw $$0) {
         super(dvt.D, $$0);
      }

      @Override
      public gw h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends dxm.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, ash $$1, duu $$2, ha $$3) {
         super(dvt.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(qw $$0) {
         super(dvt.E, $$0);
         this.d = $$0.q("Left");
         this.i = $$0.q("Right");
      }

      @Override
      protected void a(dvs $$0, qw $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(dvg $$0, dvh $$1, ash $$2) {
         this.a((dxm.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((dxm.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((dxm.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static dxm.n a(dvh $$0, ash $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
         duu $$7 = duu.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new dxm.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cqv $$0, cqt $$1, dha $$2, ash $$3, duu $$4, cpi $$5, gw $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, dxm.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, dxm.p.a.a, 1, 1, 6);
         dfd $$7 = cte.cq.o().a(dbz.g, ha.f);
         dfd $$8 = cte.cq.o().a(dbz.g, ha.e);
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

   public static class o extends dxm.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, ash $$1, duu $$2, ha $$3) {
         super(dvt.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(qw $$0) {
         super(dvt.F, $$0);
      }

      @Override
      public void a(dvg $$0, dvh $$1, ash $$2) {
         this.a((dxm.m)$$0, $$1, $$2, 1, 1);
      }

      public static dxm.o a(dvh $$0, ash $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
         duu $$7 = duu.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new dxm.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cqv $$0, cqt $$1, dha $$2, ash $$3, duu $$4, cpi $$5, gw $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, dxm.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, dxm.p.a.a, 1, 1, 7);
         dfd $$7 = cte.cQ.o().a(dau.b, ha.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, cte.eH.o(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, cte.eH.o(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, cte.eH.o(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends dvg {
      protected dxm.p.a h = dxm.p.a.a;

      protected p(dvt $$0, int $$1, duu $$2) {
         super($$0, $$1, $$2);
      }

      public p(dvt $$0, qw $$1) {
         super($$0, $$1);
         this.h = dxm.p.a.valueOf($$1.l("EntryDoor"));
      }

      @Override
      protected void a(dvs $$0, qw $$1) {
         $$1.a("EntryDoor", this.h.name());
      }

      protected void a(cqv $$0, ash $$1, duu $$2, dxm.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, cte.eH.o(), $$4, $$5, $$6, $$2);
               this.a($$0, cte.eH.o(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, cte.eH.o(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, cte.eH.o(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, cte.eH.o(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, cte.eH.o(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, cte.eH.o(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, cte.cN.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, cte.cN.o().a(cvg.f, dfz.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, cte.nc.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, cte.nc.o(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, cte.eW.o().a(cxb.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, cte.eW.o().a(cxb.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, cte.eW.o().a(cxb.b, Boolean.valueOf(true)).a(cxb.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, cte.eW.o().a(cxb.b, Boolean.valueOf(true)).a(cxb.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, cte.eW.o().a(cxb.b, Boolean.valueOf(true)).a(cxb.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, cte.eW.o().a(cxb.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, cte.eW.o().a(cxb.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, cte.eH.o(), $$4, $$5, $$6, $$2);
               this.a($$0, cte.eH.o(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, cte.eH.o(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, cte.eH.o(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, cte.eH.o(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, cte.eH.o(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, cte.eH.o(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, cte.dy.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, cte.dy.o().a(cvg.f, dfz.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, cte.dM.o().a(ctm.aE, ha.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, cte.dM.o().a(ctm.aE, ha.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected dxm.p.a b(ash $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return dxm.p.a.a;
            case 2:
               return dxm.p.a.b;
            case 3:
               return dxm.p.a.c;
            case 4:
               return dxm.p.a.d;
         }
      }

      @Nullable
      protected dvg a(dxm.m $$0, dvh $$1, ash $$2, int $$3, int $$4) {
         ha $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return dxm.b($$0, $$1, $$2, this.f.g() + $$3, this.f.h() + $$4, this.f.i() - 1, $$5, this.g());
               case d:
                  return dxm.b($$0, $$1, $$2, this.f.g() + $$3, this.f.h() + $$4, this.f.l() + 1, $$5, this.g());
               case e:
                  return dxm.b($$0, $$1, $$2, this.f.g() - 1, this.f.h() + $$4, this.f.i() + $$3, $$5, this.g());
               case f:
                  return dxm.b($$0, $$1, $$2, this.f.j() + 1, this.f.h() + $$4, this.f.i() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected dvg b(dxm.m $$0, dvh $$1, ash $$2, int $$3, int $$4) {
         ha $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return dxm.b($$0, $$1, $$2, this.f.g() - 1, this.f.h() + $$3, this.f.i() + $$4, ha.e, this.g());
               case d:
                  return dxm.b($$0, $$1, $$2, this.f.g() - 1, this.f.h() + $$3, this.f.i() + $$4, ha.e, this.g());
               case e:
                  return dxm.b($$0, $$1, $$2, this.f.g() + $$4, this.f.h() + $$3, this.f.i() - 1, ha.c, this.g());
               case f:
                  return dxm.b($$0, $$1, $$2, this.f.g() + $$4, this.f.h() + $$3, this.f.i() - 1, ha.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected dvg c(dxm.m $$0, dvh $$1, ash $$2, int $$3, int $$4) {
         ha $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return dxm.b($$0, $$1, $$2, this.f.j() + 1, this.f.h() + $$3, this.f.i() + $$4, ha.f, this.g());
               case d:
                  return dxm.b($$0, $$1, $$2, this.f.j() + 1, this.f.h() + $$3, this.f.i() + $$4, ha.f, this.g());
               case e:
                  return dxm.b($$0, $$1, $$2, this.f.g() + $$4, this.f.h() + $$3, this.f.l() + 1, ha.d, this.g());
               case f:
                  return dxm.b($$0, $$1, $$2, this.f.g() + $$4, this.f.h() + $$3, this.f.l() + 1, ha.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(duu $$0) {
         return $$0 != null && $$0.h() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;
      }
   }

   public abstract static class q extends dxm.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(dvt $$0, int $$1, duu $$2) {
         super($$0, $$1, $$2);
      }

      public q(dvt $$0, qw $$1) {
         super($$0, $$1);
      }
   }
}
