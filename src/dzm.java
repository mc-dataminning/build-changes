import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class dzm {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final dzm.f[] g = new dzm.f[]{
      new dzm.f(dzm.n.class, 40, 0),
      new dzm.f(dzm.h.class, 5, 5),
      new dzm.f(dzm.d.class, 20, 0),
      new dzm.f(dzm.i.class, 20, 0),
      new dzm.f(dzm.j.class, 10, 6),
      new dzm.f(dzm.o.class, 5, 5),
      new dzm.f(dzm.l.class, 5, 5),
      new dzm.f(dzm.c.class, 5, 4),
      new dzm.f(dzm.a.class, 5, 4),
      new dzm.f(dzm.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new dzm.f(dzm.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<dzm.f> h;
   static Class<? extends dzm.p> i;
   private static int j;
   static final dzm.k k = new dzm.k();

   public static void a() {
      h = Lists.newArrayList();

      for (dzm.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (dzm.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static dzm.p a(Class<? extends dzm.p> $$0, dxa $$1, ato $$2, int $$3, int $$4, int $$5, @Nullable hx $$6, int $$7) {
      dzm.p $$8 = null;
      if ($$0 == dzm.n.class) {
         $$8 = dzm.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dzm.h.class) {
         $$8 = dzm.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dzm.d.class) {
         $$8 = dzm.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dzm.i.class) {
         $$8 = dzm.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dzm.j.class) {
         $$8 = dzm.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dzm.o.class) {
         $$8 = dzm.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dzm.l.class) {
         $$8 = dzm.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dzm.c.class) {
         $$8 = dzm.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dzm.a.class) {
         $$8 = dzm.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dzm.e.class) {
         $$8 = dzm.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dzm.g.class) {
         $$8 = dzm.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static dzm.p a(dzm.m $$0, dxa $$1, ato $$2, int $$3, int $$4, int $$5, hx $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            dzm.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (dzm.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  dzm.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         dwn $$13 = dzm.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.h() > 1 ? new dzm.b($$7, $$13, $$6) : null;
      }
   }

   static dwz b(dzm.m $$0, dxa $$1, ato $$2, int $$3, int $$4, int $$5, @Nullable hx $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().g()) <= 112 && Math.abs($$5 - $$0.f().i()) <= 112) {
         dwz $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends dzm.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, ato $$1, dwn $$2, hx $$3) {
         super(dxm.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(rz $$0) {
         super(dxm.t, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(dxl $$0, rz $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(dwz $$0, dxa $$1, ato $$2) {
         this.a((dzm.m)$$0, $$1, $$2, 1, 1);
      }

      public static dzm.a a(dxa $$0, ato $$1, int $$2, int $$3, int $$4, hx $$5, int $$6) {
         dwn $$7 = dwn.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new dzm.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(csm $$0, csk $$1, dit $$2, ato $$3, dwn $$4, cqz $$5, ht $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, dzm.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, dzm.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, cuv.eH.o(), cuv.eH.o(), false);
         this.a($$0, cuv.jK.o(), 3, 1, 1, $$4);
         this.a($$0, cuv.jK.o(), 3, 1, 5, $$4);
         this.a($$0, cuv.jK.o(), 3, 2, 2, $$4);
         this.a($$0, cuv.jK.o(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, cuv.jK.o(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, eej.y);
         }
      }
   }

   public static class b extends dzm.p {
      private final int a;

      public b(int $$0, dwn $$1, hx $$2) {
         super(dxm.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != hx.c && $$2 != hx.d ? $$1.c() : $$1.e();
      }

      public b(rz $$0) {
         super(dxm.u, $$0);
         this.a = $$0.h("Steps");
      }

      @Override
      protected void a(dxl $$0, rz $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static dwn a(dxa $$0, ato $$1, int $$2, int $$3, int $$4, hx $$5) {
         int $$6 = 3;
         dwn $$7 = dwn.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         dwz $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().h() == $$7.h()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = dwn.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return dwn.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(csm $$0, csk $$1, dit $$2, ato $$3, dwn $$4, cqz $$5, ht $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, cuv.eH.o(), 0, 0, $$7, $$4);
            this.a($$0, cuv.eH.o(), 1, 0, $$7, $$4);
            this.a($$0, cuv.eH.o(), 2, 0, $$7, $$4);
            this.a($$0, cuv.eH.o(), 3, 0, $$7, $$4);
            this.a($$0, cuv.eH.o(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, cuv.eH.o(), 0, $$8, $$7, $$4);
               this.a($$0, cuv.nc.o(), 1, $$8, $$7, $$4);
               this.a($$0, cuv.nc.o(), 2, $$8, $$7, $$4);
               this.a($$0, cuv.nc.o(), 3, $$8, $$7, $$4);
               this.a($$0, cuv.eH.o(), 4, $$8, $$7, $$4);
            }

            this.a($$0, cuv.eH.o(), 0, 4, $$7, $$4);
            this.a($$0, cuv.eH.o(), 1, 4, $$7, $$4);
            this.a($$0, cuv.eH.o(), 2, 4, $$7, $$4);
            this.a($$0, cuv.eH.o(), 3, 4, $$7, $$4);
            this.a($$0, cuv.eH.o(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends dzm.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, ato $$1, dwn $$2, hx $$3) {
         super(dxm.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(rz $$0) {
         super(dxm.v, $$0);
         this.d = $$0.q("leftLow");
         this.i = $$0.q("leftHigh");
         this.j = $$0.q("rightLow");
         this.k = $$0.q("rightHigh");
      }

      @Override
      protected void a(dxl $$0, rz $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(dwz $$0, dxa $$1, ato $$2) {
         int $$3 = 3;
         int $$4 = 5;
         hx $$5 = this.i();
         if ($$5 == hx.e || $$5 == hx.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((dzm.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((dzm.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((dzm.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((dzm.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((dzm.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static dzm.c a(dxa $$0, ato $$1, int $$2, int $$3, int $$4, hx $$5, int $$6) {
         dwn $$7 = dwn.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new dzm.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(csm $$0, csk $$1, dit $$2, ato $$3, dwn $$4, cqz $$5, ht $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, dzm.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, dzm.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, dzm.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, dzm.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, dzm.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, dzm.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, cuv.jE.o(), cuv.jE.o(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, cuv.jE.o(), cuv.jE.o(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, dzm.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, cuv.jE.o(), cuv.jE.o(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, cuv.jE.o(), cuv.jE.o(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, cuv.jE.o(), cuv.jE.o(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, cuv.jE.o(), cuv.jE.o(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, cuv.jE.o().a(dbv.b, die.c), cuv.jE.o().a(dbv.b, die.c), false);
         this.a($$0, cuv.cq.o().a(ddr.g, hx.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends dzm.q {
      public d(int $$0, ato $$1, dwn $$2, hx $$3) {
         super(dxm.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(rz $$0) {
         super(dxm.w, $$0);
      }

      @Override
      public void a(dwz $$0, dxa $$1, ato $$2) {
         hx $$3 = this.i();
         if ($$3 != hx.c && $$3 != hx.f) {
            this.c((dzm.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((dzm.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static dzm.d a(dxa $$0, ato $$1, int $$2, int $$3, int $$4, hx $$5, int $$6) {
         dwn $$7 = dwn.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new dzm.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(csm $$0, csk $$1, dit $$2, ato $$3, dwn $$4, cqz $$5, ht $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, dzm.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         hx $$7 = this.i();
         if ($$7 != hx.c && $$7 != hx.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends dzm.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, ato $$1, dwn $$2, hx $$3) {
         super(dxm.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.d() > 6;
      }

      public e(rz $$0) {
         super(dxm.x, $$0);
         this.i = $$0.q("Tall");
      }

      @Override
      protected void a(dxl $$0, rz $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static dzm.e a(dxa $$0, ato $$1, int $$2, int $$3, int $$4, hx $$5, int $$6) {
         dwn $$7 = dwn.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = dwn.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new dzm.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(csm $$0, csk $$1, dit $$2, ato $$3, dwn $$4, cqz $$5, ht $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, dzm.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, cuv.bs.o(), cuv.bs.o(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, cuv.n.o(), cuv.n.o(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, cuv.n.o(), cuv.n.o(), false);
               this.a($$0, cuv.cq.o().a(ddr.g, hx.f), 2, 3, $$10, $$4);
               this.a($$0, cuv.cq.o().a(ddr.g, hx.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, cuv.n.o(), cuv.n.o(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, cuv.n.o(), cuv.n.o(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, cuv.cl.o(), cuv.cl.o(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, cuv.cl.o(), cuv.cl.o(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, cuv.cl.o(), cuv.cl.o(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, cuv.cl.o(), cuv.cl.o(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, cuv.cl.o(), cuv.cl.o(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, cuv.cl.o(), cuv.cl.o(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, cuv.cl.o(), cuv.cl.o(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, cuv.n.o(), cuv.n.o(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, cuv.n.o(), cuv.n.o(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, cuv.n.o(), cuv.n.o(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, cuv.n.o(), cuv.n.o(), false);
            this.a($$0, cuv.n.o(), 9, 5, 11, $$4);
            this.a($$0, cuv.n.o(), 8, 5, 11, $$4);
            this.a($$0, cuv.n.o(), 9, 5, 10, $$4);
            dgw $$12 = cuv.dU.o().a(cxq.d, Boolean.valueOf(true)).a(cxq.b, Boolean.valueOf(true));
            dgw $$13 = cuv.dU.o().a(cxq.a, Boolean.valueOf(true)).a(cxq.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, cuv.dU.o().a(cxq.a, Boolean.valueOf(true)).a(cxq.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, cuv.dU.o().a(cxq.c, Boolean.valueOf(true)).a(cxq.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, cuv.dU.o().a(cxq.a, Boolean.valueOf(true)).a(cxq.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, cuv.dU.o().a(cxq.c, Boolean.valueOf(true)).a(cxq.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, cuv.dU.o().a(cxq.a, Boolean.valueOf(true)).a(cxq.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            dgw $$15 = cuv.cO.o().a(cyy.b, hx.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            dgw $$18 = cuv.dU.o().a(cxq.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            dgw $$19 = cuv.dU.o().a(cxq.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            dgw $$20 = $$13.a(cxq.d, Boolean.valueOf(true)).a(cxq.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.a(cxq.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.a(cxq.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.a(cxq.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.a(cxq.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            dgw $$21 = cuv.cp.o();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, eej.w);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, eej.w);
         }
      }
   }

   static class f {
      public final Class<? extends dzm.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends dzm.p> $$0, int $$1, int $$2) {
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

   public static class g extends dzm.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, dwn $$1, hx $$2) {
         super(dxm.y, $$0, $$1);
         this.a($$2);
      }

      public g(rz $$0) {
         super(dxm.y, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(dxl $$0, rz $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(dwz $$0, dxa $$1, ato $$2) {
         if ($$0 != null) {
            ((dzm.m)$$0).b = this;
         }
      }

      public static dzm.g a(dxa $$0, int $$1, int $$2, int $$3, hx $$4, int $$5) {
         dwn $$6 = dwn.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new dzm.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(csm $$0, csk $$1, dit $$2, ato $$3, dwn $$4, cqz $$5, ht $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, dzm.k);
         this.a($$0, $$3, $$4, dzm.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, dzm.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, dzm.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, dzm.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, dzm.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, dzm.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, dzm.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, cuv.H.o(), cuv.H.o(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, cuv.H.o(), cuv.H.o(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, dzm.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, cuv.H.o(), cuv.H.o(), false);
         dgw $$8 = cuv.eW.o().a(cyt.a, Boolean.valueOf(true)).a(cyt.c, Boolean.valueOf(true));
         dgw $$9 = cuv.eW.o().a(cyt.d, Boolean.valueOf(true)).a(cyt.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         dgw $$12 = cuv.fj.o().a(dcm.b, hx.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, dzm.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, dzm.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, dzm.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         dgw $$14 = cuv.fy.o().a(cxh.b, hx.c);
         dgw $$15 = cuv.fy.o().a(cxh.b, hx.d);
         dgw $$16 = cuv.fy.o().a(cxh.b, hx.f);
         dgw $$17 = cuv.fy.o().a(cxh.b, hx.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.a(cxh.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.a(cxh.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.a(cxh.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.a(cxh.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.a(cxh.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.a(cxh.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.a(cxh.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.a(cxh.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.a(cxh.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.a(cxh.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.a(cxh.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.a(cxh.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            dgw $$21 = cuv.fx.o();
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
               $$0.a($$22, cuv.ct.o(), 2);
               if ($$0.c_($$22) instanceof dge $$24) {
                  $$24.a(bkm.aI, $$3);
               }
            }
         }
      }
   }

   public static class h extends dzm.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, ato $$1, dwn $$2, hx $$3) {
         super(dxm.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(rz $$0) {
         super(dxm.z, $$0);
      }

      @Override
      public void a(dwz $$0, dxa $$1, ato $$2) {
         this.a((dzm.m)$$0, $$1, $$2, 1, 1);
      }

      public static dzm.h a(dxa $$0, ato $$1, int $$2, int $$3, int $$4, hx $$5, int $$6) {
         dwn $$7 = dwn.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new dzm.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(csm $$0, csk $$1, dit $$2, ato $$3, dwn $$4, cqz $$5, ht $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, dzm.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, dzm.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, dzm.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, dzm.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, dzm.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, cuv.eW.o().a(cyt.a, Boolean.valueOf(true)).a(cyt.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, cuv.eW.o().a(cyt.a, Boolean.valueOf(true)).a(cyt.c, Boolean.valueOf(true)).a(cyt.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, cuv.eW.o().a(cyt.a, Boolean.valueOf(true)).a(cyt.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, cuv.eW.o().a(cyt.d, Boolean.valueOf(true)).a(cyt.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, cuv.eW.o().a(cyt.d, Boolean.valueOf(true)).a(cyt.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, cuv.eW.o().a(cyt.d, Boolean.valueOf(true)).a(cyt.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, cuv.eW.o().a(cyt.a, Boolean.valueOf(true)).a(cyt.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, cuv.eW.o().a(cyt.a, Boolean.valueOf(true)).a(cyt.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         dgw $$8 = cuv.dy.o().a(cwy.b, hx.e);
         dgw $$9 = cuv.dy.o().a(cwy.b, hx.e).a(cwy.f, dhs.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends dzm.q {
      public i(int $$0, ato $$1, dwn $$2, hx $$3) {
         super(dxm.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(rz $$0) {
         super(dxm.A, $$0);
      }

      @Override
      public void a(dwz $$0, dxa $$1, ato $$2) {
         hx $$3 = this.i();
         if ($$3 != hx.c && $$3 != hx.f) {
            this.b((dzm.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((dzm.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static dzm.i a(dxa $$0, ato $$1, int $$2, int $$3, int $$4, hx $$5, int $$6) {
         dwn $$7 = dwn.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new dzm.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(csm $$0, csk $$1, dit $$2, ato $$3, dwn $$4, cqz $$5, ht $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, dzm.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         hx $$7 = this.i();
         if ($$7 != hx.c && $$7 != hx.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends dzm.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, ato $$1, dwn $$2, hx $$3) {
         super(dxm.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(rz $$0) {
         super(dxm.B, $$0);
         this.d = $$0.h("Type");
      }

      @Override
      protected void a(dxl $$0, rz $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(dwz $$0, dxa $$1, ato $$2) {
         this.a((dzm.m)$$0, $$1, $$2, 4, 1);
         this.b((dzm.m)$$0, $$1, $$2, 1, 4);
         this.c((dzm.m)$$0, $$1, $$2, 1, 4);
      }

      public static dzm.j a(dxa $$0, ato $$1, int $$2, int $$3, int $$4, hx $$5, int $$6) {
         dwn $$7 = dwn.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new dzm.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(csm $$0, csk $$1, dit $$2, ato $$3, dwn $$4, cqz $$5, ht $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, dzm.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, cuv.eH.o(), 5, 1, 5, $$4);
               this.a($$0, cuv.eH.o(), 5, 2, 5, $$4);
               this.a($$0, cuv.eH.o(), 5, 3, 5, $$4);
               this.a($$0, cuv.cq.o().a(ddr.g, hx.e), 4, 3, 5, $$4);
               this.a($$0, cuv.cq.o().a(ddr.g, hx.f), 6, 3, 5, $$4);
               this.a($$0, cuv.cq.o().a(ddr.g, hx.d), 5, 3, 4, $$4);
               this.a($$0, cuv.cq.o().a(ddr.g, hx.c), 5, 3, 6, $$4);
               this.a($$0, cuv.jE.o(), 4, 1, 4, $$4);
               this.a($$0, cuv.jE.o(), 4, 1, 5, $$4);
               this.a($$0, cuv.jE.o(), 4, 1, 6, $$4);
               this.a($$0, cuv.jE.o(), 6, 1, 4, $$4);
               this.a($$0, cuv.jE.o(), 6, 1, 5, $$4);
               this.a($$0, cuv.jE.o(), 6, 1, 6, $$4);
               this.a($$0, cuv.jE.o(), 5, 1, 4, $$4);
               this.a($$0, cuv.jE.o(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, cuv.eH.o(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, cuv.eH.o(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, cuv.eH.o(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, cuv.eH.o(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, cuv.eH.o(), 5, 1, 5, $$4);
               this.a($$0, cuv.eH.o(), 5, 2, 5, $$4);
               this.a($$0, cuv.eH.o(), 5, 3, 5, $$4);
               this.a($$0, cuv.G.o(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, cuv.m.o(), 1, 3, $$8, $$4);
                  this.a($$0, cuv.m.o(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, cuv.m.o(), $$9, 3, 1, $$4);
                  this.a($$0, cuv.m.o(), $$9, 3, 9, $$4);
               }

               this.a($$0, cuv.m.o(), 5, 1, 4, $$4);
               this.a($$0, cuv.m.o(), 5, 1, 6, $$4);
               this.a($$0, cuv.m.o(), 5, 3, 4, $$4);
               this.a($$0, cuv.m.o(), 5, 3, 6, $$4);
               this.a($$0, cuv.m.o(), 4, 1, 5, $$4);
               this.a($$0, cuv.m.o(), 6, 1, 5, $$4);
               this.a($$0, cuv.m.o(), 4, 3, 5, $$4);
               this.a($$0, cuv.m.o(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, cuv.m.o(), 4, $$10, 4, $$4);
                  this.a($$0, cuv.m.o(), 6, $$10, 4, $$4);
                  this.a($$0, cuv.m.o(), 4, $$10, 6, $$4);
                  this.a($$0, cuv.m.o(), 6, $$10, 6, $$4);
               }

               this.a($$0, cuv.cq.o(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, cuv.n.o(), 2, 3, $$11, $$4);
                  this.a($$0, cuv.n.o(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, cuv.n.o(), 4, 3, $$11, $$4);
                     this.a($$0, cuv.n.o(), 5, 3, $$11, $$4);
                     this.a($$0, cuv.n.o(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, cuv.n.o(), 7, 3, $$11, $$4);
                  this.a($$0, cuv.n.o(), 8, 3, $$11, $$4);
               }

               dgw $$12 = cuv.cO.o().a(cyy.b, hx.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, eej.x);
         }
      }
   }

   static class k extends dwz.a {
      @Override
      public void a(ato $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = cuv.eJ.o();
            } else if ($$5 < 0.5F) {
               this.a = cuv.eI.o();
            } else if ($$5 < 0.55F) {
               this.a = cuv.eP.o();
            } else {
               this.a = cuv.eH.o();
            }
         } else {
            this.a = cuv.nc.o();
         }
      }
   }

   public static class l extends dzm.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(dxm $$0, int $$1, int $$2, int $$3, hx $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = dzm.p.a.a;
      }

      public l(int $$0, ato $$1, dwn $$2, hx $$3) {
         super(dxm.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(dxm $$0, rz $$1) {
         super($$0, $$1);
         this.d = $$1.q("Source");
      }

      public l(rz $$0) {
         this(dxm.C, $$0);
      }

      @Override
      protected void a(dxl $$0, rz $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(dwz $$0, dxa $$1, ato $$2) {
         if (this.d) {
            dzm.i = dzm.c.class;
         }

         this.a((dzm.m)$$0, $$1, $$2, 1, 1);
      }

      public static dzm.l a(dxa $$0, ato $$1, int $$2, int $$3, int $$4, hx $$5, int $$6) {
         dwn $$7 = dwn.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new dzm.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(csm $$0, csk $$1, dit $$2, ato $$3, dwn $$4, cqz $$5, ht $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, dzm.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, dzm.p.a.a, 1, 1, 4);
         this.a($$0, cuv.eH.o(), 2, 6, 1, $$4);
         this.a($$0, cuv.eH.o(), 1, 5, 1, $$4);
         this.a($$0, cuv.jE.o(), 1, 6, 1, $$4);
         this.a($$0, cuv.eH.o(), 1, 5, 2, $$4);
         this.a($$0, cuv.eH.o(), 1, 4, 3, $$4);
         this.a($$0, cuv.jE.o(), 1, 5, 3, $$4);
         this.a($$0, cuv.eH.o(), 2, 4, 3, $$4);
         this.a($$0, cuv.eH.o(), 3, 3, 3, $$4);
         this.a($$0, cuv.jE.o(), 3, 4, 3, $$4);
         this.a($$0, cuv.eH.o(), 3, 3, 2, $$4);
         this.a($$0, cuv.eH.o(), 3, 2, 1, $$4);
         this.a($$0, cuv.jE.o(), 3, 3, 1, $$4);
         this.a($$0, cuv.eH.o(), 2, 2, 1, $$4);
         this.a($$0, cuv.eH.o(), 1, 1, 1, $$4);
         this.a($$0, cuv.jE.o(), 1, 2, 1, $$4);
         this.a($$0, cuv.eH.o(), 1, 1, 2, $$4);
         this.a($$0, cuv.jE.o(), 1, 1, 3, $$4);
      }
   }

   public static class m extends dzm.l {
      public dzm.f a;
      @Nullable
      public dzm.g b;
      public final List<dwz> c = Lists.newArrayList();

      public m(ato $$0, int $$1, int $$2) {
         super(dxm.D, 0, $$1, $$2, a($$0));
      }

      public m(rz $$0) {
         super(dxm.D, $$0);
      }

      @Override
      public ht h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends dzm.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, ato $$1, dwn $$2, hx $$3) {
         super(dxm.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(rz $$0) {
         super(dxm.E, $$0);
         this.d = $$0.q("Left");
         this.i = $$0.q("Right");
      }

      @Override
      protected void a(dxl $$0, rz $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(dwz $$0, dxa $$1, ato $$2) {
         this.a((dzm.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((dzm.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((dzm.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static dzm.n a(dxa $$0, ato $$1, int $$2, int $$3, int $$4, hx $$5, int $$6) {
         dwn $$7 = dwn.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new dzm.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(csm $$0, csk $$1, dit $$2, ato $$3, dwn $$4, cqz $$5, ht $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, dzm.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, dzm.p.a.a, 1, 1, 6);
         dgw $$7 = cuv.cq.o().a(ddr.g, hx.f);
         dgw $$8 = cuv.cq.o().a(ddr.g, hx.e);
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

   public static class o extends dzm.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, ato $$1, dwn $$2, hx $$3) {
         super(dxm.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(rz $$0) {
         super(dxm.F, $$0);
      }

      @Override
      public void a(dwz $$0, dxa $$1, ato $$2) {
         this.a((dzm.m)$$0, $$1, $$2, 1, 1);
      }

      public static dzm.o a(dxa $$0, ato $$1, int $$2, int $$3, int $$4, hx $$5, int $$6) {
         dwn $$7 = dwn.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new dzm.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(csm $$0, csk $$1, dit $$2, ato $$3, dwn $$4, cqz $$5, ht $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, dzm.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, dzm.p.a.a, 1, 1, 7);
         dgw $$7 = cuv.cQ.o().a(dcm.b, hx.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, cuv.eH.o(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, cuv.eH.o(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, cuv.eH.o(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends dwz {
      protected dzm.p.a h = dzm.p.a.a;

      protected p(dxm $$0, int $$1, dwn $$2) {
         super($$0, $$1, $$2);
      }

      public p(dxm $$0, rz $$1) {
         super($$0, $$1);
         this.h = dzm.p.a.valueOf($$1.l("EntryDoor"));
      }

      @Override
      protected void a(dxl $$0, rz $$1) {
         $$1.a("EntryDoor", this.h.name());
      }

      protected void a(csm $$0, ato $$1, dwn $$2, dzm.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, cuv.eH.o(), $$4, $$5, $$6, $$2);
               this.a($$0, cuv.eH.o(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, cuv.eH.o(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, cuv.eH.o(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, cuv.eH.o(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, cuv.eH.o(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, cuv.eH.o(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, cuv.cN.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, cuv.cN.o().a(cwy.f, dhs.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, cuv.nc.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, cuv.nc.o(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, cuv.eW.o().a(cyt.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, cuv.eW.o().a(cyt.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, cuv.eW.o().a(cyt.b, Boolean.valueOf(true)).a(cyt.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, cuv.eW.o().a(cyt.b, Boolean.valueOf(true)).a(cyt.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, cuv.eW.o().a(cyt.b, Boolean.valueOf(true)).a(cyt.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, cuv.eW.o().a(cyt.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, cuv.eW.o().a(cyt.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, cuv.eH.o(), $$4, $$5, $$6, $$2);
               this.a($$0, cuv.eH.o(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, cuv.eH.o(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, cuv.eH.o(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, cuv.eH.o(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, cuv.eH.o(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, cuv.eH.o(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, cuv.dy.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, cuv.dy.o().a(cwy.f, dhs.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, cuv.dM.o().a(cvd.aE, hx.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, cuv.dM.o().a(cvd.aE, hx.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected dzm.p.a b(ato $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return dzm.p.a.a;
            case 2:
               return dzm.p.a.b;
            case 3:
               return dzm.p.a.c;
            case 4:
               return dzm.p.a.d;
         }
      }

      @Nullable
      protected dwz a(dzm.m $$0, dxa $$1, ato $$2, int $$3, int $$4) {
         hx $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return dzm.b($$0, $$1, $$2, this.f.g() + $$3, this.f.h() + $$4, this.f.i() - 1, $$5, this.g());
               case d:
                  return dzm.b($$0, $$1, $$2, this.f.g() + $$3, this.f.h() + $$4, this.f.l() + 1, $$5, this.g());
               case e:
                  return dzm.b($$0, $$1, $$2, this.f.g() - 1, this.f.h() + $$4, this.f.i() + $$3, $$5, this.g());
               case f:
                  return dzm.b($$0, $$1, $$2, this.f.j() + 1, this.f.h() + $$4, this.f.i() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected dwz b(dzm.m $$0, dxa $$1, ato $$2, int $$3, int $$4) {
         hx $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return dzm.b($$0, $$1, $$2, this.f.g() - 1, this.f.h() + $$3, this.f.i() + $$4, hx.e, this.g());
               case d:
                  return dzm.b($$0, $$1, $$2, this.f.g() - 1, this.f.h() + $$3, this.f.i() + $$4, hx.e, this.g());
               case e:
                  return dzm.b($$0, $$1, $$2, this.f.g() + $$4, this.f.h() + $$3, this.f.i() - 1, hx.c, this.g());
               case f:
                  return dzm.b($$0, $$1, $$2, this.f.g() + $$4, this.f.h() + $$3, this.f.i() - 1, hx.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected dwz c(dzm.m $$0, dxa $$1, ato $$2, int $$3, int $$4) {
         hx $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return dzm.b($$0, $$1, $$2, this.f.j() + 1, this.f.h() + $$3, this.f.i() + $$4, hx.f, this.g());
               case d:
                  return dzm.b($$0, $$1, $$2, this.f.j() + 1, this.f.h() + $$3, this.f.i() + $$4, hx.f, this.g());
               case e:
                  return dzm.b($$0, $$1, $$2, this.f.g() + $$4, this.f.h() + $$3, this.f.l() + 1, hx.d, this.g());
               case f:
                  return dzm.b($$0, $$1, $$2, this.f.g() + $$4, this.f.h() + $$3, this.f.l() + 1, hx.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(dwn $$0) {
         return $$0 != null && $$0.h() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;
      }
   }

   public abstract static class q extends dzm.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(dxm $$0, int $$1, dwn $$2) {
         super($$0, $$1, $$2);
      }

      public q(dxm $$0, rz $$1) {
         super($$0, $$1);
      }
   }
}
