import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class ecf {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final ecf.f[] g = new ecf.f[]{
      new ecf.f(ecf.n.class, 40, 0),
      new ecf.f(ecf.h.class, 5, 5),
      new ecf.f(ecf.d.class, 20, 0),
      new ecf.f(ecf.i.class, 20, 0),
      new ecf.f(ecf.j.class, 10, 6),
      new ecf.f(ecf.o.class, 5, 5),
      new ecf.f(ecf.l.class, 5, 5),
      new ecf.f(ecf.c.class, 5, 4),
      new ecf.f(ecf.a.class, 5, 4),
      new ecf.f(ecf.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new ecf.f(ecf.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<ecf.f> h;
   static Class<? extends ecf.p> i;
   private static int j;
   static final ecf.k k = new ecf.k();

   public static void a() {
      h = Lists.newArrayList();

      for (ecf.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (ecf.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static ecf.p a(Class<? extends ecf.p> $$0, dzt $$1, auw $$2, int $$3, int $$4, int $$5, @Nullable ic $$6, int $$7) {
      ecf.p $$8 = null;
      if ($$0 == ecf.n.class) {
         $$8 = ecf.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ecf.h.class) {
         $$8 = ecf.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ecf.d.class) {
         $$8 = ecf.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ecf.i.class) {
         $$8 = ecf.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ecf.j.class) {
         $$8 = ecf.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ecf.o.class) {
         $$8 = ecf.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ecf.l.class) {
         $$8 = ecf.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ecf.c.class) {
         $$8 = ecf.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ecf.a.class) {
         $$8 = ecf.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ecf.e.class) {
         $$8 = ecf.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ecf.g.class) {
         $$8 = ecf.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static ecf.p a(ecf.m $$0, dzt $$1, auw $$2, int $$3, int $$4, int $$5, ic $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            ecf.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (ecf.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  ecf.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         dzg $$13 = ecf.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.i() > 1 ? new ecf.b($$7, $$13, $$6) : null;
      }
   }

   static dzs b(ecf.m $$0, dzt $$1, auw $$2, int $$3, int $$4, int $$5, @Nullable ic $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
         dzs $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends ecf.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, auw $$1, dzg $$2, ic $$3) {
         super(eaf.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(so $$0) {
         super(eaf.t, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(eae $$0, so $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(dzs $$0, dzt $$1, auw $$2) {
         this.a((ecf.m)$$0, $$1, $$2, 1, 1);
      }

      public static ecf.a a(dzt $$0, auw $$1, int $$2, int $$3, int $$4, ic $$5, int $$6) {
         dzg $$7 = dzg.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new ecf.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cus $$0, cuq $$1, dlm $$2, auw $$3, dzg $$4, cte $$5, hx $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, ecf.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, ecf.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, cxa.eH.o(), cxa.eH.o(), false);
         this.a($$0, cxa.jK.o(), 3, 1, 1, $$4);
         this.a($$0, cxa.jK.o(), 3, 1, 5, $$4);
         this.a($$0, cxa.jK.o(), 3, 2, 2, $$4);
         this.a($$0, cxa.jK.o(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, cxa.jK.o(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, ehd.y);
         }
      }
   }

   public static class b extends ecf.p {
      private final int a;

      public b(int $$0, dzg $$1, ic $$2) {
         super(eaf.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != ic.c && $$2 != ic.d ? $$1.d() : $$1.f();
      }

      public b(so $$0) {
         super(eaf.u, $$0);
         this.a = $$0.h("Steps");
      }

      @Override
      protected void a(eae $$0, so $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static dzg a(dzt $$0, auw $$1, int $$2, int $$3, int $$4, ic $$5) {
         int $$6 = 3;
         dzg $$7 = dzg.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         dzs $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().i() == $$7.i()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = dzg.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return dzg.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(cus $$0, cuq $$1, dlm $$2, auw $$3, dzg $$4, cte $$5, hx $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, cxa.eH.o(), 0, 0, $$7, $$4);
            this.a($$0, cxa.eH.o(), 1, 0, $$7, $$4);
            this.a($$0, cxa.eH.o(), 2, 0, $$7, $$4);
            this.a($$0, cxa.eH.o(), 3, 0, $$7, $$4);
            this.a($$0, cxa.eH.o(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, cxa.eH.o(), 0, $$8, $$7, $$4);
               this.a($$0, cxa.nc.o(), 1, $$8, $$7, $$4);
               this.a($$0, cxa.nc.o(), 2, $$8, $$7, $$4);
               this.a($$0, cxa.nc.o(), 3, $$8, $$7, $$4);
               this.a($$0, cxa.eH.o(), 4, $$8, $$7, $$4);
            }

            this.a($$0, cxa.eH.o(), 0, 4, $$7, $$4);
            this.a($$0, cxa.eH.o(), 1, 4, $$7, $$4);
            this.a($$0, cxa.eH.o(), 2, 4, $$7, $$4);
            this.a($$0, cxa.eH.o(), 3, 4, $$7, $$4);
            this.a($$0, cxa.eH.o(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends ecf.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, auw $$1, dzg $$2, ic $$3) {
         super(eaf.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(so $$0) {
         super(eaf.v, $$0);
         this.d = $$0.q("leftLow");
         this.i = $$0.q("leftHigh");
         this.j = $$0.q("rightLow");
         this.k = $$0.q("rightHigh");
      }

      @Override
      protected void a(eae $$0, so $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(dzs $$0, dzt $$1, auw $$2) {
         int $$3 = 3;
         int $$4 = 5;
         ic $$5 = this.i();
         if ($$5 == ic.e || $$5 == ic.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((ecf.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((ecf.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((ecf.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((ecf.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((ecf.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static ecf.c a(dzt $$0, auw $$1, int $$2, int $$3, int $$4, ic $$5, int $$6) {
         dzg $$7 = dzg.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new ecf.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cus $$0, cuq $$1, dlm $$2, auw $$3, dzg $$4, cte $$5, hx $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, ecf.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, ecf.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, ecf.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, ecf.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, ecf.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, ecf.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, cxa.jE.o(), cxa.jE.o(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, cxa.jE.o(), cxa.jE.o(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, ecf.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, cxa.jE.o(), cxa.jE.o(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, cxa.jE.o(), cxa.jE.o(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, cxa.jE.o(), cxa.jE.o(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, cxa.jE.o(), cxa.jE.o(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, cxa.jE.o().a(dea.b, dkx.c), cxa.jE.o().a(dea.b, dkx.c), false);
         this.a($$0, cxa.cq.o().a(dfy.g, ic.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends ecf.q {
      public d(int $$0, auw $$1, dzg $$2, ic $$3) {
         super(eaf.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(so $$0) {
         super(eaf.w, $$0);
      }

      @Override
      public void a(dzs $$0, dzt $$1, auw $$2) {
         ic $$3 = this.i();
         if ($$3 != ic.c && $$3 != ic.f) {
            this.c((ecf.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((ecf.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static ecf.d a(dzt $$0, auw $$1, int $$2, int $$3, int $$4, ic $$5, int $$6) {
         dzg $$7 = dzg.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new ecf.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cus $$0, cuq $$1, dlm $$2, auw $$3, dzg $$4, cte $$5, hx $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, ecf.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         ic $$7 = this.i();
         if ($$7 != ic.c && $$7 != ic.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends ecf.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, auw $$1, dzg $$2, ic $$3) {
         super(eaf.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.e() > 6;
      }

      public e(so $$0) {
         super(eaf.x, $$0);
         this.i = $$0.q("Tall");
      }

      @Override
      protected void a(eae $$0, so $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static ecf.e a(dzt $$0, auw $$1, int $$2, int $$3, int $$4, ic $$5, int $$6) {
         dzg $$7 = dzg.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = dzg.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new ecf.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(cus $$0, cuq $$1, dlm $$2, auw $$3, dzg $$4, cte $$5, hx $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, ecf.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, cxa.bs.o(), cxa.bs.o(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, cxa.n.o(), cxa.n.o(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, cxa.n.o(), cxa.n.o(), false);
               this.a($$0, cxa.cq.o().a(dfy.g, ic.f), 2, 3, $$10, $$4);
               this.a($$0, cxa.cq.o().a(dfy.g, ic.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, cxa.n.o(), cxa.n.o(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, cxa.n.o(), cxa.n.o(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, cxa.cl.o(), cxa.cl.o(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, cxa.cl.o(), cxa.cl.o(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, cxa.cl.o(), cxa.cl.o(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, cxa.cl.o(), cxa.cl.o(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, cxa.cl.o(), cxa.cl.o(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, cxa.cl.o(), cxa.cl.o(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, cxa.cl.o(), cxa.cl.o(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, cxa.n.o(), cxa.n.o(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, cxa.n.o(), cxa.n.o(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, cxa.n.o(), cxa.n.o(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, cxa.n.o(), cxa.n.o(), false);
            this.a($$0, cxa.n.o(), 9, 5, 11, $$4);
            this.a($$0, cxa.n.o(), 8, 5, 11, $$4);
            this.a($$0, cxa.n.o(), 9, 5, 10, $$4);
            djp $$12 = cxa.dU.o().a(czw.d, Boolean.valueOf(true)).a(czw.b, Boolean.valueOf(true));
            djp $$13 = cxa.dU.o().a(czw.a, Boolean.valueOf(true)).a(czw.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, cxa.dU.o().a(czw.a, Boolean.valueOf(true)).a(czw.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, cxa.dU.o().a(czw.c, Boolean.valueOf(true)).a(czw.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, cxa.dU.o().a(czw.a, Boolean.valueOf(true)).a(czw.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, cxa.dU.o().a(czw.c, Boolean.valueOf(true)).a(czw.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, cxa.dU.o().a(czw.a, Boolean.valueOf(true)).a(czw.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            djp $$15 = cxa.cO.o().a(dbd.b, ic.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            djp $$18 = cxa.dU.o().a(czw.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            djp $$19 = cxa.dU.o().a(czw.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            djp $$20 = $$13.a(czw.d, Boolean.valueOf(true)).a(czw.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.a(czw.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.a(czw.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.a(czw.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.a(czw.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            djp $$21 = cxa.cp.o();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, ehd.w);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, ehd.w);
         }
      }
   }

   static class f {
      public final Class<? extends ecf.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends ecf.p> $$0, int $$1, int $$2) {
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

   public static class g extends ecf.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, dzg $$1, ic $$2) {
         super(eaf.y, $$0, $$1);
         this.a($$2);
      }

      public g(so $$0) {
         super(eaf.y, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(eae $$0, so $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(dzs $$0, dzt $$1, auw $$2) {
         if ($$0 != null) {
            ((ecf.m)$$0).b = this;
         }
      }

      public static ecf.g a(dzt $$0, int $$1, int $$2, int $$3, ic $$4, int $$5) {
         dzg $$6 = dzg.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new ecf.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(cus $$0, cuq $$1, dlm $$2, auw $$3, dzg $$4, cte $$5, hx $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, ecf.k);
         this.a($$0, $$3, $$4, ecf.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, ecf.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, ecf.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, ecf.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, ecf.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, ecf.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, ecf.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, cxa.H.o(), cxa.H.o(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, cxa.H.o(), cxa.H.o(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, ecf.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, cxa.H.o(), cxa.H.o(), false);
         djp $$8 = cxa.eW.o().a(day.a, Boolean.valueOf(true)).a(day.c, Boolean.valueOf(true));
         djp $$9 = cxa.eW.o().a(day.d, Boolean.valueOf(true)).a(day.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         djp $$12 = cxa.fj.o().a(der.b, ic.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, ecf.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, ecf.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, ecf.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         djp $$14 = cxa.fy.o().a(czn.b, ic.c);
         djp $$15 = cxa.fy.o().a(czn.b, ic.d);
         djp $$16 = cxa.fy.o().a(czn.b, ic.f);
         djp $$17 = cxa.fy.o().a(czn.b, ic.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.a(czn.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.a(czn.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.a(czn.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.a(czn.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.a(czn.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.a(czn.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.a(czn.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.a(czn.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.a(czn.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.a(czn.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.a(czn.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.a(czn.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            djp $$21 = cxa.fx.o();
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
               $$0.a($$22, cxa.ct.o(), 2);
               if ($$0.c_($$22) instanceof diq $$24) {
                  $$24.a(bmc.aK, $$3);
               }
            }
         }
      }
   }

   public static class h extends ecf.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, auw $$1, dzg $$2, ic $$3) {
         super(eaf.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(so $$0) {
         super(eaf.z, $$0);
      }

      @Override
      public void a(dzs $$0, dzt $$1, auw $$2) {
         this.a((ecf.m)$$0, $$1, $$2, 1, 1);
      }

      public static ecf.h a(dzt $$0, auw $$1, int $$2, int $$3, int $$4, ic $$5, int $$6) {
         dzg $$7 = dzg.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new ecf.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cus $$0, cuq $$1, dlm $$2, auw $$3, dzg $$4, cte $$5, hx $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, ecf.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, ecf.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, ecf.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, ecf.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, ecf.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, cxa.eW.o().a(day.a, Boolean.valueOf(true)).a(day.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, cxa.eW.o().a(day.a, Boolean.valueOf(true)).a(day.c, Boolean.valueOf(true)).a(day.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, cxa.eW.o().a(day.a, Boolean.valueOf(true)).a(day.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, cxa.eW.o().a(day.d, Boolean.valueOf(true)).a(day.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, cxa.eW.o().a(day.d, Boolean.valueOf(true)).a(day.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, cxa.eW.o().a(day.d, Boolean.valueOf(true)).a(day.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, cxa.eW.o().a(day.a, Boolean.valueOf(true)).a(day.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, cxa.eW.o().a(day.a, Boolean.valueOf(true)).a(day.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         djp $$8 = cxa.dy.o().a(cze.b, ic.e);
         djp $$9 = cxa.dy.o().a(cze.b, ic.e).a(cze.f, dkl.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends ecf.q {
      public i(int $$0, auw $$1, dzg $$2, ic $$3) {
         super(eaf.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(so $$0) {
         super(eaf.A, $$0);
      }

      @Override
      public void a(dzs $$0, dzt $$1, auw $$2) {
         ic $$3 = this.i();
         if ($$3 != ic.c && $$3 != ic.f) {
            this.b((ecf.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((ecf.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static ecf.i a(dzt $$0, auw $$1, int $$2, int $$3, int $$4, ic $$5, int $$6) {
         dzg $$7 = dzg.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new ecf.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cus $$0, cuq $$1, dlm $$2, auw $$3, dzg $$4, cte $$5, hx $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, ecf.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         ic $$7 = this.i();
         if ($$7 != ic.c && $$7 != ic.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends ecf.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, auw $$1, dzg $$2, ic $$3) {
         super(eaf.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(so $$0) {
         super(eaf.B, $$0);
         this.d = $$0.h("Type");
      }

      @Override
      protected void a(eae $$0, so $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(dzs $$0, dzt $$1, auw $$2) {
         this.a((ecf.m)$$0, $$1, $$2, 4, 1);
         this.b((ecf.m)$$0, $$1, $$2, 1, 4);
         this.c((ecf.m)$$0, $$1, $$2, 1, 4);
      }

      public static ecf.j a(dzt $$0, auw $$1, int $$2, int $$3, int $$4, ic $$5, int $$6) {
         dzg $$7 = dzg.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new ecf.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cus $$0, cuq $$1, dlm $$2, auw $$3, dzg $$4, cte $$5, hx $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, ecf.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, cxa.eH.o(), 5, 1, 5, $$4);
               this.a($$0, cxa.eH.o(), 5, 2, 5, $$4);
               this.a($$0, cxa.eH.o(), 5, 3, 5, $$4);
               this.a($$0, cxa.cq.o().a(dfy.g, ic.e), 4, 3, 5, $$4);
               this.a($$0, cxa.cq.o().a(dfy.g, ic.f), 6, 3, 5, $$4);
               this.a($$0, cxa.cq.o().a(dfy.g, ic.d), 5, 3, 4, $$4);
               this.a($$0, cxa.cq.o().a(dfy.g, ic.c), 5, 3, 6, $$4);
               this.a($$0, cxa.jE.o(), 4, 1, 4, $$4);
               this.a($$0, cxa.jE.o(), 4, 1, 5, $$4);
               this.a($$0, cxa.jE.o(), 4, 1, 6, $$4);
               this.a($$0, cxa.jE.o(), 6, 1, 4, $$4);
               this.a($$0, cxa.jE.o(), 6, 1, 5, $$4);
               this.a($$0, cxa.jE.o(), 6, 1, 6, $$4);
               this.a($$0, cxa.jE.o(), 5, 1, 4, $$4);
               this.a($$0, cxa.jE.o(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, cxa.eH.o(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, cxa.eH.o(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, cxa.eH.o(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, cxa.eH.o(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, cxa.eH.o(), 5, 1, 5, $$4);
               this.a($$0, cxa.eH.o(), 5, 2, 5, $$4);
               this.a($$0, cxa.eH.o(), 5, 3, 5, $$4);
               this.a($$0, cxa.G.o(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, cxa.m.o(), 1, 3, $$8, $$4);
                  this.a($$0, cxa.m.o(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, cxa.m.o(), $$9, 3, 1, $$4);
                  this.a($$0, cxa.m.o(), $$9, 3, 9, $$4);
               }

               this.a($$0, cxa.m.o(), 5, 1, 4, $$4);
               this.a($$0, cxa.m.o(), 5, 1, 6, $$4);
               this.a($$0, cxa.m.o(), 5, 3, 4, $$4);
               this.a($$0, cxa.m.o(), 5, 3, 6, $$4);
               this.a($$0, cxa.m.o(), 4, 1, 5, $$4);
               this.a($$0, cxa.m.o(), 6, 1, 5, $$4);
               this.a($$0, cxa.m.o(), 4, 3, 5, $$4);
               this.a($$0, cxa.m.o(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, cxa.m.o(), 4, $$10, 4, $$4);
                  this.a($$0, cxa.m.o(), 6, $$10, 4, $$4);
                  this.a($$0, cxa.m.o(), 4, $$10, 6, $$4);
                  this.a($$0, cxa.m.o(), 6, $$10, 6, $$4);
               }

               this.a($$0, cxa.cq.o(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, cxa.n.o(), 2, 3, $$11, $$4);
                  this.a($$0, cxa.n.o(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, cxa.n.o(), 4, 3, $$11, $$4);
                     this.a($$0, cxa.n.o(), 5, 3, $$11, $$4);
                     this.a($$0, cxa.n.o(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, cxa.n.o(), 7, 3, $$11, $$4);
                  this.a($$0, cxa.n.o(), 8, 3, $$11, $$4);
               }

               djp $$12 = cxa.cO.o().a(dbd.b, ic.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, ehd.x);
         }
      }
   }

   static class k extends dzs.a {
      @Override
      public void a(auw $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = cxa.eJ.o();
            } else if ($$5 < 0.5F) {
               this.a = cxa.eI.o();
            } else if ($$5 < 0.55F) {
               this.a = cxa.eP.o();
            } else {
               this.a = cxa.eH.o();
            }
         } else {
            this.a = cxa.nc.o();
         }
      }
   }

   public static class l extends ecf.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(eaf $$0, int $$1, int $$2, int $$3, ic $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = ecf.p.a.a;
      }

      public l(int $$0, auw $$1, dzg $$2, ic $$3) {
         super(eaf.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(eaf $$0, so $$1) {
         super($$0, $$1);
         this.d = $$1.q("Source");
      }

      public l(so $$0) {
         this(eaf.C, $$0);
      }

      @Override
      protected void a(eae $$0, so $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(dzs $$0, dzt $$1, auw $$2) {
         if (this.d) {
            ecf.i = ecf.c.class;
         }

         this.a((ecf.m)$$0, $$1, $$2, 1, 1);
      }

      public static ecf.l a(dzt $$0, auw $$1, int $$2, int $$3, int $$4, ic $$5, int $$6) {
         dzg $$7 = dzg.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new ecf.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cus $$0, cuq $$1, dlm $$2, auw $$3, dzg $$4, cte $$5, hx $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, ecf.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, ecf.p.a.a, 1, 1, 4);
         this.a($$0, cxa.eH.o(), 2, 6, 1, $$4);
         this.a($$0, cxa.eH.o(), 1, 5, 1, $$4);
         this.a($$0, cxa.jE.o(), 1, 6, 1, $$4);
         this.a($$0, cxa.eH.o(), 1, 5, 2, $$4);
         this.a($$0, cxa.eH.o(), 1, 4, 3, $$4);
         this.a($$0, cxa.jE.o(), 1, 5, 3, $$4);
         this.a($$0, cxa.eH.o(), 2, 4, 3, $$4);
         this.a($$0, cxa.eH.o(), 3, 3, 3, $$4);
         this.a($$0, cxa.jE.o(), 3, 4, 3, $$4);
         this.a($$0, cxa.eH.o(), 3, 3, 2, $$4);
         this.a($$0, cxa.eH.o(), 3, 2, 1, $$4);
         this.a($$0, cxa.jE.o(), 3, 3, 1, $$4);
         this.a($$0, cxa.eH.o(), 2, 2, 1, $$4);
         this.a($$0, cxa.eH.o(), 1, 1, 1, $$4);
         this.a($$0, cxa.jE.o(), 1, 2, 1, $$4);
         this.a($$0, cxa.eH.o(), 1, 1, 2, $$4);
         this.a($$0, cxa.jE.o(), 1, 1, 3, $$4);
      }
   }

   public static class m extends ecf.l {
      public ecf.f a;
      @Nullable
      public ecf.g b;
      public final List<dzs> c = Lists.newArrayList();

      public m(auw $$0, int $$1, int $$2) {
         super(eaf.D, 0, $$1, $$2, a($$0));
      }

      public m(so $$0) {
         super(eaf.D, $$0);
      }

      @Override
      public hx h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends ecf.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, auw $$1, dzg $$2, ic $$3) {
         super(eaf.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(so $$0) {
         super(eaf.E, $$0);
         this.d = $$0.q("Left");
         this.i = $$0.q("Right");
      }

      @Override
      protected void a(eae $$0, so $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(dzs $$0, dzt $$1, auw $$2) {
         this.a((ecf.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((ecf.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((ecf.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static ecf.n a(dzt $$0, auw $$1, int $$2, int $$3, int $$4, ic $$5, int $$6) {
         dzg $$7 = dzg.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new ecf.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cus $$0, cuq $$1, dlm $$2, auw $$3, dzg $$4, cte $$5, hx $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, ecf.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, ecf.p.a.a, 1, 1, 6);
         djp $$7 = cxa.cq.o().a(dfy.g, ic.f);
         djp $$8 = cxa.cq.o().a(dfy.g, ic.e);
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

   public static class o extends ecf.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, auw $$1, dzg $$2, ic $$3) {
         super(eaf.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(so $$0) {
         super(eaf.F, $$0);
      }

      @Override
      public void a(dzs $$0, dzt $$1, auw $$2) {
         this.a((ecf.m)$$0, $$1, $$2, 1, 1);
      }

      public static ecf.o a(dzt $$0, auw $$1, int $$2, int $$3, int $$4, ic $$5, int $$6) {
         dzg $$7 = dzg.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new ecf.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cus $$0, cuq $$1, dlm $$2, auw $$3, dzg $$4, cte $$5, hx $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, ecf.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, ecf.p.a.a, 1, 1, 7);
         djp $$7 = cxa.cQ.o().a(der.b, ic.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, cxa.eH.o(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, cxa.eH.o(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, cxa.eH.o(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends dzs {
      protected ecf.p.a h = ecf.p.a.a;

      protected p(eaf $$0, int $$1, dzg $$2) {
         super($$0, $$1, $$2);
      }

      public p(eaf $$0, so $$1) {
         super($$0, $$1);
         this.h = ecf.p.a.valueOf($$1.l("EntryDoor"));
      }

      @Override
      protected void a(eae $$0, so $$1) {
         $$1.a("EntryDoor", this.h.name());
      }

      protected void a(cus $$0, auw $$1, dzg $$2, ecf.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, cxa.eH.o(), $$4, $$5, $$6, $$2);
               this.a($$0, cxa.eH.o(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, cxa.eH.o(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, cxa.eH.o(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, cxa.eH.o(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, cxa.eH.o(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, cxa.eH.o(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, cxa.cN.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, cxa.cN.o().a(cze.f, dkl.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, cxa.nc.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, cxa.nc.o(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, cxa.eW.o().a(day.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, cxa.eW.o().a(day.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, cxa.eW.o().a(day.b, Boolean.valueOf(true)).a(day.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, cxa.eW.o().a(day.b, Boolean.valueOf(true)).a(day.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, cxa.eW.o().a(day.b, Boolean.valueOf(true)).a(day.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, cxa.eW.o().a(day.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, cxa.eW.o().a(day.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, cxa.eH.o(), $$4, $$5, $$6, $$2);
               this.a($$0, cxa.eH.o(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, cxa.eH.o(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, cxa.eH.o(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, cxa.eH.o(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, cxa.eH.o(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, cxa.eH.o(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, cxa.dy.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, cxa.dy.o().a(cze.f, dkl.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, cxa.dM.o().a(cxi.aE, ic.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, cxa.dM.o().a(cxi.aE, ic.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected ecf.p.a b(auw $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return ecf.p.a.a;
            case 2:
               return ecf.p.a.b;
            case 3:
               return ecf.p.a.c;
            case 4:
               return ecf.p.a.d;
         }
      }

      @Nullable
      protected dzs a(ecf.m $$0, dzt $$1, auw $$2, int $$3, int $$4) {
         ic $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return ecf.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$5, this.g());
               case d:
                  return ecf.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$5, this.g());
               case e:
                  return ecf.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
               case f:
                  return ecf.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected dzs b(ecf.m $$0, dzt $$1, auw $$2, int $$3, int $$4) {
         ic $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return ecf.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, ic.e, this.g());
               case d:
                  return ecf.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, ic.e, this.g());
               case e:
                  return ecf.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, ic.c, this.g());
               case f:
                  return ecf.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, ic.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected dzs c(ecf.m $$0, dzt $$1, auw $$2, int $$3, int $$4) {
         ic $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return ecf.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, ic.f, this.g());
               case d:
                  return ecf.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, ic.f, this.g());
               case e:
                  return ecf.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, ic.d, this.g());
               case f:
                  return ecf.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, ic.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(dzg $$0) {
         return $$0 != null && $$0.i() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;
      }
   }

   public abstract static class q extends ecf.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(eaf $$0, int $$1, dzg $$2) {
         super($$0, $$1, $$2);
      }

      public q(eaf $$0, so $$1) {
         super($$0, $$1);
      }
   }
}
