import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class dyk {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final dyk.f[] g = new dyk.f[]{
      new dyk.f(dyk.n.class, 40, 0),
      new dyk.f(dyk.h.class, 5, 5),
      new dyk.f(dyk.d.class, 20, 0),
      new dyk.f(dyk.i.class, 20, 0),
      new dyk.f(dyk.j.class, 10, 6),
      new dyk.f(dyk.o.class, 5, 5),
      new dyk.f(dyk.l.class, 5, 5),
      new dyk.f(dyk.c.class, 5, 4),
      new dyk.f(dyk.a.class, 5, 4),
      new dyk.f(dyk.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new dyk.f(dyk.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<dyk.f> h;
   static Class<? extends dyk.p> i;
   private static int j;
   static final dyk.k k = new dyk.k();

   public static void a() {
      h = Lists.newArrayList();

      for (dyk.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (dyk.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static dyk.p a(Class<? extends dyk.p> $$0, dwf $$1, ate $$2, int $$3, int $$4, int $$5, @Nullable hx $$6, int $$7) {
      dyk.p $$8 = null;
      if ($$0 == dyk.n.class) {
         $$8 = dyk.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dyk.h.class) {
         $$8 = dyk.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dyk.d.class) {
         $$8 = dyk.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dyk.i.class) {
         $$8 = dyk.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dyk.j.class) {
         $$8 = dyk.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dyk.o.class) {
         $$8 = dyk.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dyk.l.class) {
         $$8 = dyk.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dyk.c.class) {
         $$8 = dyk.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dyk.a.class) {
         $$8 = dyk.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dyk.e.class) {
         $$8 = dyk.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dyk.g.class) {
         $$8 = dyk.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static dyk.p a(dyk.m $$0, dwf $$1, ate $$2, int $$3, int $$4, int $$5, hx $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            dyk.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (dyk.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  dyk.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         dvs $$13 = dyk.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.h() > 1 ? new dyk.b($$7, $$13, $$6) : null;
      }
   }

   static dwe b(dyk.m $$0, dwf $$1, ate $$2, int $$3, int $$4, int $$5, @Nullable hx $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().g()) <= 112 && Math.abs($$5 - $$0.f().i()) <= 112) {
         dwe $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends dyk.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, ate $$1, dvs $$2, hx $$3) {
         super(dwr.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(rt $$0) {
         super(dwr.t, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(dwq $$0, rt $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(dwe $$0, dwf $$1, ate $$2) {
         this.a((dyk.m)$$0, $$1, $$2, 1, 1);
      }

      public static dyk.a a(dwf $$0, ate $$1, int $$2, int $$3, int $$4, hx $$5, int $$6) {
         dvs $$7 = dvs.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new dyk.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(crt $$0, crr $$1, dhy $$2, ate $$3, dvs $$4, cqg $$5, ht $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, dyk.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, dyk.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, cuc.eH.o(), cuc.eH.o(), false);
         this.a($$0, cuc.jK.o(), 3, 1, 1, $$4);
         this.a($$0, cuc.jK.o(), 3, 1, 5, $$4);
         this.a($$0, cuc.jK.o(), 3, 2, 2, $$4);
         this.a($$0, cuc.jK.o(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, cuc.jK.o(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, edg.y);
         }
      }
   }

   public static class b extends dyk.p {
      private final int a;

      public b(int $$0, dvs $$1, hx $$2) {
         super(dwr.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != hx.c && $$2 != hx.d ? $$1.c() : $$1.e();
      }

      public b(rt $$0) {
         super(dwr.u, $$0);
         this.a = $$0.h("Steps");
      }

      @Override
      protected void a(dwq $$0, rt $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static dvs a(dwf $$0, ate $$1, int $$2, int $$3, int $$4, hx $$5) {
         int $$6 = 3;
         dvs $$7 = dvs.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         dwe $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().h() == $$7.h()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = dvs.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return dvs.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(crt $$0, crr $$1, dhy $$2, ate $$3, dvs $$4, cqg $$5, ht $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, cuc.eH.o(), 0, 0, $$7, $$4);
            this.a($$0, cuc.eH.o(), 1, 0, $$7, $$4);
            this.a($$0, cuc.eH.o(), 2, 0, $$7, $$4);
            this.a($$0, cuc.eH.o(), 3, 0, $$7, $$4);
            this.a($$0, cuc.eH.o(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, cuc.eH.o(), 0, $$8, $$7, $$4);
               this.a($$0, cuc.nc.o(), 1, $$8, $$7, $$4);
               this.a($$0, cuc.nc.o(), 2, $$8, $$7, $$4);
               this.a($$0, cuc.nc.o(), 3, $$8, $$7, $$4);
               this.a($$0, cuc.eH.o(), 4, $$8, $$7, $$4);
            }

            this.a($$0, cuc.eH.o(), 0, 4, $$7, $$4);
            this.a($$0, cuc.eH.o(), 1, 4, $$7, $$4);
            this.a($$0, cuc.eH.o(), 2, 4, $$7, $$4);
            this.a($$0, cuc.eH.o(), 3, 4, $$7, $$4);
            this.a($$0, cuc.eH.o(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends dyk.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, ate $$1, dvs $$2, hx $$3) {
         super(dwr.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(rt $$0) {
         super(dwr.v, $$0);
         this.d = $$0.q("leftLow");
         this.i = $$0.q("leftHigh");
         this.j = $$0.q("rightLow");
         this.k = $$0.q("rightHigh");
      }

      @Override
      protected void a(dwq $$0, rt $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(dwe $$0, dwf $$1, ate $$2) {
         int $$3 = 3;
         int $$4 = 5;
         hx $$5 = this.i();
         if ($$5 == hx.e || $$5 == hx.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((dyk.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((dyk.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((dyk.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((dyk.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((dyk.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static dyk.c a(dwf $$0, ate $$1, int $$2, int $$3, int $$4, hx $$5, int $$6) {
         dvs $$7 = dvs.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new dyk.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(crt $$0, crr $$1, dhy $$2, ate $$3, dvs $$4, cqg $$5, ht $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, dyk.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, dyk.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, dyk.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, dyk.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, dyk.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, dyk.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, cuc.jE.o(), cuc.jE.o(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, cuc.jE.o(), cuc.jE.o(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, dyk.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, cuc.jE.o(), cuc.jE.o(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, cuc.jE.o(), cuc.jE.o(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, cuc.jE.o(), cuc.jE.o(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, cuc.jE.o(), cuc.jE.o(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, cuc.jE.o().a(dbb.b, dhj.c), cuc.jE.o().a(dbb.b, dhj.c), false);
         this.a($$0, cuc.cq.o().a(dcx.g, hx.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends dyk.q {
      public d(int $$0, ate $$1, dvs $$2, hx $$3) {
         super(dwr.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(rt $$0) {
         super(dwr.w, $$0);
      }

      @Override
      public void a(dwe $$0, dwf $$1, ate $$2) {
         hx $$3 = this.i();
         if ($$3 != hx.c && $$3 != hx.f) {
            this.c((dyk.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((dyk.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static dyk.d a(dwf $$0, ate $$1, int $$2, int $$3, int $$4, hx $$5, int $$6) {
         dvs $$7 = dvs.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new dyk.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(crt $$0, crr $$1, dhy $$2, ate $$3, dvs $$4, cqg $$5, ht $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, dyk.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         hx $$7 = this.i();
         if ($$7 != hx.c && $$7 != hx.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends dyk.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, ate $$1, dvs $$2, hx $$3) {
         super(dwr.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.d() > 6;
      }

      public e(rt $$0) {
         super(dwr.x, $$0);
         this.i = $$0.q("Tall");
      }

      @Override
      protected void a(dwq $$0, rt $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static dyk.e a(dwf $$0, ate $$1, int $$2, int $$3, int $$4, hx $$5, int $$6) {
         dvs $$7 = dvs.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = dvs.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new dyk.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(crt $$0, crr $$1, dhy $$2, ate $$3, dvs $$4, cqg $$5, ht $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, dyk.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, cuc.bs.o(), cuc.bs.o(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, cuc.n.o(), cuc.n.o(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, cuc.n.o(), cuc.n.o(), false);
               this.a($$0, cuc.cq.o().a(dcx.g, hx.f), 2, 3, $$10, $$4);
               this.a($$0, cuc.cq.o().a(dcx.g, hx.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, cuc.n.o(), cuc.n.o(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, cuc.n.o(), cuc.n.o(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, cuc.cl.o(), cuc.cl.o(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, cuc.cl.o(), cuc.cl.o(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, cuc.cl.o(), cuc.cl.o(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, cuc.cl.o(), cuc.cl.o(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, cuc.cl.o(), cuc.cl.o(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, cuc.cl.o(), cuc.cl.o(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, cuc.cl.o(), cuc.cl.o(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, cuc.n.o(), cuc.n.o(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, cuc.n.o(), cuc.n.o(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, cuc.n.o(), cuc.n.o(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, cuc.n.o(), cuc.n.o(), false);
            this.a($$0, cuc.n.o(), 9, 5, 11, $$4);
            this.a($$0, cuc.n.o(), 8, 5, 11, $$4);
            this.a($$0, cuc.n.o(), 9, 5, 10, $$4);
            dgb $$12 = cuc.dU.o().a(cww.d, Boolean.valueOf(true)).a(cww.b, Boolean.valueOf(true));
            dgb $$13 = cuc.dU.o().a(cww.a, Boolean.valueOf(true)).a(cww.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, cuc.dU.o().a(cww.a, Boolean.valueOf(true)).a(cww.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, cuc.dU.o().a(cww.c, Boolean.valueOf(true)).a(cww.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, cuc.dU.o().a(cww.a, Boolean.valueOf(true)).a(cww.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, cuc.dU.o().a(cww.c, Boolean.valueOf(true)).a(cww.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, cuc.dU.o().a(cww.a, Boolean.valueOf(true)).a(cww.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            dgb $$15 = cuc.cO.o().a(cye.b, hx.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            dgb $$18 = cuc.dU.o().a(cww.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            dgb $$19 = cuc.dU.o().a(cww.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            dgb $$20 = $$13.a(cww.d, Boolean.valueOf(true)).a(cww.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.a(cww.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.a(cww.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.a(cww.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.a(cww.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            dgb $$21 = cuc.cp.o();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, edg.w);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, edg.w);
         }
      }
   }

   static class f {
      public final Class<? extends dyk.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends dyk.p> $$0, int $$1, int $$2) {
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

   public static class g extends dyk.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, dvs $$1, hx $$2) {
         super(dwr.y, $$0, $$1);
         this.a($$2);
      }

      public g(rt $$0) {
         super(dwr.y, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(dwq $$0, rt $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(dwe $$0, dwf $$1, ate $$2) {
         if ($$0 != null) {
            ((dyk.m)$$0).b = this;
         }
      }

      public static dyk.g a(dwf $$0, int $$1, int $$2, int $$3, hx $$4, int $$5) {
         dvs $$6 = dvs.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new dyk.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(crt $$0, crr $$1, dhy $$2, ate $$3, dvs $$4, cqg $$5, ht $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, dyk.k);
         this.a($$0, $$3, $$4, dyk.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, dyk.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, dyk.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, dyk.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, dyk.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, dyk.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, dyk.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, cuc.H.o(), cuc.H.o(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, cuc.H.o(), cuc.H.o(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, dyk.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, cuc.H.o(), cuc.H.o(), false);
         dgb $$8 = cuc.eW.o().a(cxz.a, Boolean.valueOf(true)).a(cxz.c, Boolean.valueOf(true));
         dgb $$9 = cuc.eW.o().a(cxz.d, Boolean.valueOf(true)).a(cxz.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         dgb $$12 = cuc.fj.o().a(dbs.b, hx.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, dyk.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, dyk.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, dyk.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         dgb $$14 = cuc.fy.o().a(cwn.b, hx.c);
         dgb $$15 = cuc.fy.o().a(cwn.b, hx.d);
         dgb $$16 = cuc.fy.o().a(cwn.b, hx.f);
         dgb $$17 = cuc.fy.o().a(cwn.b, hx.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.a(cwn.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.a(cwn.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.a(cwn.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.a(cwn.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.a(cwn.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.a(cwn.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.a(cwn.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.a(cwn.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.a(cwn.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.a(cwn.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.a(cwn.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.a(cwn.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            dgb $$21 = cuc.fx.o();
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
            ht $$22 = this.b(5, 3, 6);
            if ($$4.b($$22)) {
               this.d = true;
               $$0.a($$22, cuc.ct.o(), 2);
               if ($$0.c_($$22) instanceof dfj $$24) {
                  $$24.a(bjx.aI, $$3);
               }
            }
         }
      }
   }

   public static class h extends dyk.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, ate $$1, dvs $$2, hx $$3) {
         super(dwr.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(rt $$0) {
         super(dwr.z, $$0);
      }

      @Override
      public void a(dwe $$0, dwf $$1, ate $$2) {
         this.a((dyk.m)$$0, $$1, $$2, 1, 1);
      }

      public static dyk.h a(dwf $$0, ate $$1, int $$2, int $$3, int $$4, hx $$5, int $$6) {
         dvs $$7 = dvs.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new dyk.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(crt $$0, crr $$1, dhy $$2, ate $$3, dvs $$4, cqg $$5, ht $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, dyk.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, dyk.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, dyk.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, dyk.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, dyk.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, cuc.eW.o().a(cxz.a, Boolean.valueOf(true)).a(cxz.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, cuc.eW.o().a(cxz.a, Boolean.valueOf(true)).a(cxz.c, Boolean.valueOf(true)).a(cxz.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, cuc.eW.o().a(cxz.a, Boolean.valueOf(true)).a(cxz.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, cuc.eW.o().a(cxz.d, Boolean.valueOf(true)).a(cxz.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, cuc.eW.o().a(cxz.d, Boolean.valueOf(true)).a(cxz.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, cuc.eW.o().a(cxz.d, Boolean.valueOf(true)).a(cxz.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, cuc.eW.o().a(cxz.a, Boolean.valueOf(true)).a(cxz.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, cuc.eW.o().a(cxz.a, Boolean.valueOf(true)).a(cxz.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         dgb $$8 = cuc.dy.o().a(cwe.b, hx.e);
         dgb $$9 = cuc.dy.o().a(cwe.b, hx.e).a(cwe.f, dgx.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends dyk.q {
      public i(int $$0, ate $$1, dvs $$2, hx $$3) {
         super(dwr.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(rt $$0) {
         super(dwr.A, $$0);
      }

      @Override
      public void a(dwe $$0, dwf $$1, ate $$2) {
         hx $$3 = this.i();
         if ($$3 != hx.c && $$3 != hx.f) {
            this.b((dyk.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((dyk.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static dyk.i a(dwf $$0, ate $$1, int $$2, int $$3, int $$4, hx $$5, int $$6) {
         dvs $$7 = dvs.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new dyk.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(crt $$0, crr $$1, dhy $$2, ate $$3, dvs $$4, cqg $$5, ht $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, dyk.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         hx $$7 = this.i();
         if ($$7 != hx.c && $$7 != hx.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends dyk.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, ate $$1, dvs $$2, hx $$3) {
         super(dwr.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(rt $$0) {
         super(dwr.B, $$0);
         this.d = $$0.h("Type");
      }

      @Override
      protected void a(dwq $$0, rt $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(dwe $$0, dwf $$1, ate $$2) {
         this.a((dyk.m)$$0, $$1, $$2, 4, 1);
         this.b((dyk.m)$$0, $$1, $$2, 1, 4);
         this.c((dyk.m)$$0, $$1, $$2, 1, 4);
      }

      public static dyk.j a(dwf $$0, ate $$1, int $$2, int $$3, int $$4, hx $$5, int $$6) {
         dvs $$7 = dvs.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new dyk.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(crt $$0, crr $$1, dhy $$2, ate $$3, dvs $$4, cqg $$5, ht $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, dyk.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, cuc.eH.o(), 5, 1, 5, $$4);
               this.a($$0, cuc.eH.o(), 5, 2, 5, $$4);
               this.a($$0, cuc.eH.o(), 5, 3, 5, $$4);
               this.a($$0, cuc.cq.o().a(dcx.g, hx.e), 4, 3, 5, $$4);
               this.a($$0, cuc.cq.o().a(dcx.g, hx.f), 6, 3, 5, $$4);
               this.a($$0, cuc.cq.o().a(dcx.g, hx.d), 5, 3, 4, $$4);
               this.a($$0, cuc.cq.o().a(dcx.g, hx.c), 5, 3, 6, $$4);
               this.a($$0, cuc.jE.o(), 4, 1, 4, $$4);
               this.a($$0, cuc.jE.o(), 4, 1, 5, $$4);
               this.a($$0, cuc.jE.o(), 4, 1, 6, $$4);
               this.a($$0, cuc.jE.o(), 6, 1, 4, $$4);
               this.a($$0, cuc.jE.o(), 6, 1, 5, $$4);
               this.a($$0, cuc.jE.o(), 6, 1, 6, $$4);
               this.a($$0, cuc.jE.o(), 5, 1, 4, $$4);
               this.a($$0, cuc.jE.o(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, cuc.eH.o(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, cuc.eH.o(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, cuc.eH.o(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, cuc.eH.o(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, cuc.eH.o(), 5, 1, 5, $$4);
               this.a($$0, cuc.eH.o(), 5, 2, 5, $$4);
               this.a($$0, cuc.eH.o(), 5, 3, 5, $$4);
               this.a($$0, cuc.G.o(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, cuc.m.o(), 1, 3, $$8, $$4);
                  this.a($$0, cuc.m.o(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, cuc.m.o(), $$9, 3, 1, $$4);
                  this.a($$0, cuc.m.o(), $$9, 3, 9, $$4);
               }

               this.a($$0, cuc.m.o(), 5, 1, 4, $$4);
               this.a($$0, cuc.m.o(), 5, 1, 6, $$4);
               this.a($$0, cuc.m.o(), 5, 3, 4, $$4);
               this.a($$0, cuc.m.o(), 5, 3, 6, $$4);
               this.a($$0, cuc.m.o(), 4, 1, 5, $$4);
               this.a($$0, cuc.m.o(), 6, 1, 5, $$4);
               this.a($$0, cuc.m.o(), 4, 3, 5, $$4);
               this.a($$0, cuc.m.o(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, cuc.m.o(), 4, $$10, 4, $$4);
                  this.a($$0, cuc.m.o(), 6, $$10, 4, $$4);
                  this.a($$0, cuc.m.o(), 4, $$10, 6, $$4);
                  this.a($$0, cuc.m.o(), 6, $$10, 6, $$4);
               }

               this.a($$0, cuc.cq.o(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, cuc.n.o(), 2, 3, $$11, $$4);
                  this.a($$0, cuc.n.o(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, cuc.n.o(), 4, 3, $$11, $$4);
                     this.a($$0, cuc.n.o(), 5, 3, $$11, $$4);
                     this.a($$0, cuc.n.o(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, cuc.n.o(), 7, 3, $$11, $$4);
                  this.a($$0, cuc.n.o(), 8, 3, $$11, $$4);
               }

               dgb $$12 = cuc.cO.o().a(cye.b, hx.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, edg.x);
         }
      }
   }

   static class k extends dwe.a {
      @Override
      public void a(ate $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = cuc.eJ.o();
            } else if ($$5 < 0.5F) {
               this.a = cuc.eI.o();
            } else if ($$5 < 0.55F) {
               this.a = cuc.eP.o();
            } else {
               this.a = cuc.eH.o();
            }
         } else {
            this.a = cuc.nc.o();
         }
      }
   }

   public static class l extends dyk.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(dwr $$0, int $$1, int $$2, int $$3, hx $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = dyk.p.a.a;
      }

      public l(int $$0, ate $$1, dvs $$2, hx $$3) {
         super(dwr.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(dwr $$0, rt $$1) {
         super($$0, $$1);
         this.d = $$1.q("Source");
      }

      public l(rt $$0) {
         this(dwr.C, $$0);
      }

      @Override
      protected void a(dwq $$0, rt $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(dwe $$0, dwf $$1, ate $$2) {
         if (this.d) {
            dyk.i = dyk.c.class;
         }

         this.a((dyk.m)$$0, $$1, $$2, 1, 1);
      }

      public static dyk.l a(dwf $$0, ate $$1, int $$2, int $$3, int $$4, hx $$5, int $$6) {
         dvs $$7 = dvs.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new dyk.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(crt $$0, crr $$1, dhy $$2, ate $$3, dvs $$4, cqg $$5, ht $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, dyk.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, dyk.p.a.a, 1, 1, 4);
         this.a($$0, cuc.eH.o(), 2, 6, 1, $$4);
         this.a($$0, cuc.eH.o(), 1, 5, 1, $$4);
         this.a($$0, cuc.jE.o(), 1, 6, 1, $$4);
         this.a($$0, cuc.eH.o(), 1, 5, 2, $$4);
         this.a($$0, cuc.eH.o(), 1, 4, 3, $$4);
         this.a($$0, cuc.jE.o(), 1, 5, 3, $$4);
         this.a($$0, cuc.eH.o(), 2, 4, 3, $$4);
         this.a($$0, cuc.eH.o(), 3, 3, 3, $$4);
         this.a($$0, cuc.jE.o(), 3, 4, 3, $$4);
         this.a($$0, cuc.eH.o(), 3, 3, 2, $$4);
         this.a($$0, cuc.eH.o(), 3, 2, 1, $$4);
         this.a($$0, cuc.jE.o(), 3, 3, 1, $$4);
         this.a($$0, cuc.eH.o(), 2, 2, 1, $$4);
         this.a($$0, cuc.eH.o(), 1, 1, 1, $$4);
         this.a($$0, cuc.jE.o(), 1, 2, 1, $$4);
         this.a($$0, cuc.eH.o(), 1, 1, 2, $$4);
         this.a($$0, cuc.jE.o(), 1, 1, 3, $$4);
      }
   }

   public static class m extends dyk.l {
      public dyk.f a;
      @Nullable
      public dyk.g b;
      public final List<dwe> c = Lists.newArrayList();

      public m(ate $$0, int $$1, int $$2) {
         super(dwr.D, 0, $$1, $$2, a($$0));
      }

      public m(rt $$0) {
         super(dwr.D, $$0);
      }

      @Override
      public ht h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends dyk.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, ate $$1, dvs $$2, hx $$3) {
         super(dwr.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(rt $$0) {
         super(dwr.E, $$0);
         this.d = $$0.q("Left");
         this.i = $$0.q("Right");
      }

      @Override
      protected void a(dwq $$0, rt $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(dwe $$0, dwf $$1, ate $$2) {
         this.a((dyk.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((dyk.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((dyk.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static dyk.n a(dwf $$0, ate $$1, int $$2, int $$3, int $$4, hx $$5, int $$6) {
         dvs $$7 = dvs.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new dyk.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(crt $$0, crr $$1, dhy $$2, ate $$3, dvs $$4, cqg $$5, ht $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, dyk.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, dyk.p.a.a, 1, 1, 6);
         dgb $$7 = cuc.cq.o().a(dcx.g, hx.f);
         dgb $$8 = cuc.cq.o().a(dcx.g, hx.e);
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

   public static class o extends dyk.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, ate $$1, dvs $$2, hx $$3) {
         super(dwr.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(rt $$0) {
         super(dwr.F, $$0);
      }

      @Override
      public void a(dwe $$0, dwf $$1, ate $$2) {
         this.a((dyk.m)$$0, $$1, $$2, 1, 1);
      }

      public static dyk.o a(dwf $$0, ate $$1, int $$2, int $$3, int $$4, hx $$5, int $$6) {
         dvs $$7 = dvs.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new dyk.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(crt $$0, crr $$1, dhy $$2, ate $$3, dvs $$4, cqg $$5, ht $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, dyk.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, dyk.p.a.a, 1, 1, 7);
         dgb $$7 = cuc.cQ.o().a(dbs.b, hx.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, cuc.eH.o(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, cuc.eH.o(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, cuc.eH.o(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends dwe {
      protected dyk.p.a h = dyk.p.a.a;

      protected p(dwr $$0, int $$1, dvs $$2) {
         super($$0, $$1, $$2);
      }

      public p(dwr $$0, rt $$1) {
         super($$0, $$1);
         this.h = dyk.p.a.valueOf($$1.l("EntryDoor"));
      }

      @Override
      protected void a(dwq $$0, rt $$1) {
         $$1.a("EntryDoor", this.h.name());
      }

      protected void a(crt $$0, ate $$1, dvs $$2, dyk.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, cuc.eH.o(), $$4, $$5, $$6, $$2);
               this.a($$0, cuc.eH.o(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, cuc.eH.o(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, cuc.eH.o(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, cuc.eH.o(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, cuc.eH.o(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, cuc.eH.o(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, cuc.cN.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, cuc.cN.o().a(cwe.f, dgx.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, cuc.nc.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, cuc.nc.o(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, cuc.eW.o().a(cxz.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, cuc.eW.o().a(cxz.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, cuc.eW.o().a(cxz.b, Boolean.valueOf(true)).a(cxz.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, cuc.eW.o().a(cxz.b, Boolean.valueOf(true)).a(cxz.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, cuc.eW.o().a(cxz.b, Boolean.valueOf(true)).a(cxz.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, cuc.eW.o().a(cxz.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, cuc.eW.o().a(cxz.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, cuc.eH.o(), $$4, $$5, $$6, $$2);
               this.a($$0, cuc.eH.o(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, cuc.eH.o(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, cuc.eH.o(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, cuc.eH.o(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, cuc.eH.o(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, cuc.eH.o(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, cuc.dy.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, cuc.dy.o().a(cwe.f, dgx.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, cuc.dM.o().a(cuk.aE, hx.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, cuc.dM.o().a(cuk.aE, hx.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected dyk.p.a b(ate $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return dyk.p.a.a;
            case 2:
               return dyk.p.a.b;
            case 3:
               return dyk.p.a.c;
            case 4:
               return dyk.p.a.d;
         }
      }

      @Nullable
      protected dwe a(dyk.m $$0, dwf $$1, ate $$2, int $$3, int $$4) {
         hx $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return dyk.b($$0, $$1, $$2, this.f.g() + $$3, this.f.h() + $$4, this.f.i() - 1, $$5, this.g());
               case d:
                  return dyk.b($$0, $$1, $$2, this.f.g() + $$3, this.f.h() + $$4, this.f.l() + 1, $$5, this.g());
               case e:
                  return dyk.b($$0, $$1, $$2, this.f.g() - 1, this.f.h() + $$4, this.f.i() + $$3, $$5, this.g());
               case f:
                  return dyk.b($$0, $$1, $$2, this.f.j() + 1, this.f.h() + $$4, this.f.i() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected dwe b(dyk.m $$0, dwf $$1, ate $$2, int $$3, int $$4) {
         hx $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return dyk.b($$0, $$1, $$2, this.f.g() - 1, this.f.h() + $$3, this.f.i() + $$4, hx.e, this.g());
               case d:
                  return dyk.b($$0, $$1, $$2, this.f.g() - 1, this.f.h() + $$3, this.f.i() + $$4, hx.e, this.g());
               case e:
                  return dyk.b($$0, $$1, $$2, this.f.g() + $$4, this.f.h() + $$3, this.f.i() - 1, hx.c, this.g());
               case f:
                  return dyk.b($$0, $$1, $$2, this.f.g() + $$4, this.f.h() + $$3, this.f.i() - 1, hx.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected dwe c(dyk.m $$0, dwf $$1, ate $$2, int $$3, int $$4) {
         hx $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return dyk.b($$0, $$1, $$2, this.f.j() + 1, this.f.h() + $$3, this.f.i() + $$4, hx.f, this.g());
               case d:
                  return dyk.b($$0, $$1, $$2, this.f.j() + 1, this.f.h() + $$3, this.f.i() + $$4, hx.f, this.g());
               case e:
                  return dyk.b($$0, $$1, $$2, this.f.g() + $$4, this.f.h() + $$3, this.f.l() + 1, hx.d, this.g());
               case f:
                  return dyk.b($$0, $$1, $$2, this.f.g() + $$4, this.f.h() + $$3, this.f.l() + 1, hx.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(dvs $$0) {
         return $$0 != null && $$0.h() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;
      }
   }

   public abstract static class q extends dyk.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(dwr $$0, int $$1, dvs $$2) {
         super($$0, $$1, $$2);
      }

      public q(dwr $$0, rt $$1) {
         super($$0, $$1);
      }
   }
}
