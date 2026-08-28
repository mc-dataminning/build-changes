import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class eny {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final eny.f[] g = new eny.f[]{
      new eny.f(eny.n.class, 40, 0),
      new eny.f(eny.h.class, 5, 5),
      new eny.f(eny.d.class, 20, 0),
      new eny.f(eny.i.class, 20, 0),
      new eny.f(eny.j.class, 10, 6),
      new eny.f(eny.o.class, 5, 5),
      new eny.f(eny.l.class, 5, 5),
      new eny.f(eny.c.class, 5, 4),
      new eny.f(eny.a.class, 5, 4),
      new eny.f(eny.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new eny.f(eny.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<eny.f> h;
   static Class<? extends eny.p> i;
   private static int j;
   static final eny.k k = new eny.k();

   public static void a() {
      h = Lists.newArrayList();

      for (eny.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (eny.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static eny.p a(Class<? extends eny.p> $$0, ell $$1, azn $$2, int $$3, int $$4, int $$5, @Nullable jk $$6, int $$7) {
      eny.p $$8 = null;
      if ($$0 == eny.n.class) {
         $$8 = eny.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eny.h.class) {
         $$8 = eny.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eny.d.class) {
         $$8 = eny.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eny.i.class) {
         $$8 = eny.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eny.j.class) {
         $$8 = eny.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eny.o.class) {
         $$8 = eny.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eny.l.class) {
         $$8 = eny.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eny.c.class) {
         $$8 = eny.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eny.a.class) {
         $$8 = eny.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eny.e.class) {
         $$8 = eny.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eny.g.class) {
         $$8 = eny.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static eny.p a(eny.m $$0, ell $$1, azn $$2, int $$3, int $$4, int $$5, jk $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            eny.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (eny.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  eny.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         eky $$13 = eny.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.i() > 1 ? new eny.b($$7, $$13, $$6) : null;
      }
   }

   static elk b(eny.m $$0, ell $$1, azn $$2, int $$3, int $$4, int $$5, @Nullable jk $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
         elk $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends eny.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, azn $$1, eky $$2, jk $$3) {
         super(elx.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(ug $$0) {
         super(elx.t, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(elw $$0, ug $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(elk $$0, ell $$1, azn $$2) {
         this.a((eny.m)$$0, $$1, $$2, 1, 1);
      }

      public static eny.a a(ell $$0, azn $$1, int $$2, int $$3, int $$4, jk $$5, int $$6) {
         eky $$7 = eky.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new eny.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfg $$0, dfe $$1, dwp $$2, azn $$3, eky $$4, ddp $$5, jf $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, eny.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, eny.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, dho.eH.n(), dho.eH.n(), false);
         this.a($$0, dho.jK.n(), 3, 1, 1, $$4);
         this.a($$0, dho.jK.n(), 3, 1, 5, $$4);
         this.a($$0, dho.jK.n(), 3, 2, 2, $$4);
         this.a($$0, dho.jK.n(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, dho.jK.n(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, eth.x);
         }
      }
   }

   public static class b extends eny.p {
      private final int a;

      public b(int $$0, eky $$1, jk $$2) {
         super(elx.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != jk.c && $$2 != jk.d ? $$1.d() : $$1.f();
      }

      public b(ug $$0) {
         super(elx.u, $$0);
         this.a = $$0.h("Steps");
      }

      @Override
      protected void a(elw $$0, ug $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static eky a(ell $$0, azn $$1, int $$2, int $$3, int $$4, jk $$5) {
         int $$6 = 3;
         eky $$7 = eky.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         elk $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().i() == $$7.i()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = eky.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return eky.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(dfg $$0, dfe $$1, dwp $$2, azn $$3, eky $$4, ddp $$5, jf $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, dho.eH.n(), 0, 0, $$7, $$4);
            this.a($$0, dho.eH.n(), 1, 0, $$7, $$4);
            this.a($$0, dho.eH.n(), 2, 0, $$7, $$4);
            this.a($$0, dho.eH.n(), 3, 0, $$7, $$4);
            this.a($$0, dho.eH.n(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, dho.eH.n(), 0, $$8, $$7, $$4);
               this.a($$0, dho.nc.n(), 1, $$8, $$7, $$4);
               this.a($$0, dho.nc.n(), 2, $$8, $$7, $$4);
               this.a($$0, dho.nc.n(), 3, $$8, $$7, $$4);
               this.a($$0, dho.eH.n(), 4, $$8, $$7, $$4);
            }

            this.a($$0, dho.eH.n(), 0, 4, $$7, $$4);
            this.a($$0, dho.eH.n(), 1, 4, $$7, $$4);
            this.a($$0, dho.eH.n(), 2, 4, $$7, $$4);
            this.a($$0, dho.eH.n(), 3, 4, $$7, $$4);
            this.a($$0, dho.eH.n(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends eny.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, azn $$1, eky $$2, jk $$3) {
         super(elx.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(ug $$0) {
         super(elx.v, $$0);
         this.d = $$0.q("leftLow");
         this.i = $$0.q("leftHigh");
         this.j = $$0.q("rightLow");
         this.k = $$0.q("rightHigh");
      }

      @Override
      protected void a(elw $$0, ug $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(elk $$0, ell $$1, azn $$2) {
         int $$3 = 3;
         int $$4 = 5;
         jk $$5 = this.i();
         if ($$5 == jk.e || $$5 == jk.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((eny.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((eny.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((eny.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((eny.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((eny.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static eny.c a(ell $$0, azn $$1, int $$2, int $$3, int $$4, jk $$5, int $$6) {
         eky $$7 = eky.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eny.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfg $$0, dfe $$1, dwp $$2, azn $$3, eky $$4, ddp $$5, jf $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, eny.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, eny.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, eny.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, eny.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, eny.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, eny.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, dho.jE.n(), dho.jE.n(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, dho.jE.n(), dho.jE.n(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, eny.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, dho.jE.n(), dho.jE.n(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, dho.jE.n(), dho.jE.n(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, dho.jE.n(), dho.jE.n(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, dho.jE.n(), dho.jE.n(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, dho.jE.n().b(doq.b, dwa.c), dho.jE.n().b(doq.b, dwa.c), false);
         this.a($$0, dho.cq.n().b(dqp.g, jk.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends eny.q {
      public d(int $$0, azn $$1, eky $$2, jk $$3) {
         super(elx.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(ug $$0) {
         super(elx.w, $$0);
      }

      @Override
      public void a(elk $$0, ell $$1, azn $$2) {
         jk $$3 = this.i();
         if ($$3 != jk.c && $$3 != jk.f) {
            this.c((eny.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((eny.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static eny.d a(ell $$0, azn $$1, int $$2, int $$3, int $$4, jk $$5, int $$6) {
         eky $$7 = eky.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eny.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfg $$0, dfe $$1, dwp $$2, azn $$3, eky $$4, ddp $$5, jf $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, eny.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         jk $$7 = this.i();
         if ($$7 != jk.c && $$7 != jk.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends eny.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, azn $$1, eky $$2, jk $$3) {
         super(elx.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.e() > 6;
      }

      public e(ug $$0) {
         super(elx.x, $$0);
         this.i = $$0.q("Tall");
      }

      @Override
      protected void a(elw $$0, ug $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static eny.e a(ell $$0, azn $$1, int $$2, int $$3, int $$4, jk $$5, int $$6) {
         eky $$7 = eky.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = eky.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new eny.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(dfg $$0, dfe $$1, dwp $$2, azn $$3, eky $$4, ddp $$5, jf $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, eny.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, dho.bs.n(), dho.bs.n(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dho.n.n(), dho.n.n(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dho.n.n(), dho.n.n(), false);
               this.a($$0, dho.cq.n().b(dqp.g, jk.f), 2, 3, $$10, $$4);
               this.a($$0, dho.cq.n().b(dqp.g, jk.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dho.n.n(), dho.n.n(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dho.n.n(), dho.n.n(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dho.cl.n(), dho.cl.n(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dho.cl.n(), dho.cl.n(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dho.cl.n(), dho.cl.n(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dho.cl.n(), dho.cl.n(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, dho.cl.n(), dho.cl.n(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, dho.cl.n(), dho.cl.n(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, dho.cl.n(), dho.cl.n(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, dho.n.n(), dho.n.n(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, dho.n.n(), dho.n.n(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, dho.n.n(), dho.n.n(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, dho.n.n(), dho.n.n(), false);
            this.a($$0, dho.n.n(), 9, 5, 11, $$4);
            this.a($$0, dho.n.n(), 8, 5, 11, $$4);
            this.a($$0, dho.n.n(), 9, 5, 10, $$4);
            dus $$12 = dho.dU.n().b(dkk.d, Boolean.valueOf(true)).b(dkk.b, Boolean.valueOf(true));
            dus $$13 = dho.dU.n().b(dkk.a, Boolean.valueOf(true)).b(dkk.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, dho.dU.n().b(dkk.a, Boolean.valueOf(true)).b(dkk.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, dho.dU.n().b(dkk.c, Boolean.valueOf(true)).b(dkk.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, dho.dU.n().b(dkk.a, Boolean.valueOf(true)).b(dkk.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, dho.dU.n().b(dkk.c, Boolean.valueOf(true)).b(dkk.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, dho.dU.n().b(dkk.a, Boolean.valueOf(true)).b(dkk.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            dus $$15 = dho.cO.n().b(dls.b, jk.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            dus $$18 = dho.dU.n().b(dkk.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            dus $$19 = dho.dU.n().b(dkk.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            dus $$20 = $$13.b(dkk.d, Boolean.valueOf(true)).b(dkk.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.b(dkk.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.b(dkk.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.b(dkk.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.b(dkk.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            dus $$21 = dho.cp.n();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, eth.v);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, eth.v);
         }
      }
   }

   static class f {
      public final Class<? extends eny.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends eny.p> $$0, int $$1, int $$2) {
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

   public static class g extends eny.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, eky $$1, jk $$2) {
         super(elx.y, $$0, $$1);
         this.a($$2);
      }

      public g(ug $$0) {
         super(elx.y, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(elw $$0, ug $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(elk $$0, ell $$1, azn $$2) {
         if ($$0 != null) {
            ((eny.m)$$0).b = this;
         }
      }

      public static eny.g a(ell $$0, int $$1, int $$2, int $$3, jk $$4, int $$5) {
         eky $$6 = eky.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new eny.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dfg $$0, dfe $$1, dwp $$2, azn $$3, eky $$4, ddp $$5, jf $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, eny.k);
         this.a($$0, $$3, $$4, eny.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, eny.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, eny.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, eny.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, eny.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, eny.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, eny.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, dho.H.n(), dho.H.n(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, dho.H.n(), dho.H.n(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, eny.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, dho.H.n(), dho.H.n(), false);
         dus $$8 = dho.eW.n().b(dln.a, Boolean.valueOf(true)).b(dln.c, Boolean.valueOf(true));
         dus $$9 = dho.eW.n().b(dln.d, Boolean.valueOf(true)).b(dln.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         dus $$12 = dho.fj.n().b(dph.b, jk.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, eny.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, eny.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, eny.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         dus $$14 = dho.fy.n().b(dkb.b, jk.c);
         dus $$15 = dho.fy.n().b(dkb.b, jk.d);
         dus $$16 = dho.fy.n().b(dkb.b, jk.f);
         dus $$17 = dho.fy.n().b(dkb.b, jk.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.b(dkb.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.b(dkb.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.b(dkb.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.b(dkb.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.b(dkb.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.b(dkb.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.b(dkb.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.b(dkb.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.b(dkb.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.b(dkb.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.b(dkb.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.b(dkb.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            dus $$21 = dho.fx.n();
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
            jf $$22 = this.b(5, 3, 6);
            if ($$4.b($$22)) {
               this.d = true;
               $$0.a($$22, dho.ct.n(), 2);
               if ($$0.c_($$22) instanceof dtl $$24) {
                  $$24.a(bty.aM, $$3);
               }
            }
         }
      }
   }

   public static class h extends eny.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, azn $$1, eky $$2, jk $$3) {
         super(elx.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(ug $$0) {
         super(elx.z, $$0);
      }

      @Override
      public void a(elk $$0, ell $$1, azn $$2) {
         this.a((eny.m)$$0, $$1, $$2, 1, 1);
      }

      public static eny.h a(ell $$0, azn $$1, int $$2, int $$3, int $$4, jk $$5, int $$6) {
         eky $$7 = eky.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eny.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfg $$0, dfe $$1, dwp $$2, azn $$3, eky $$4, ddp $$5, jf $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, eny.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, eny.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, eny.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, eny.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, eny.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, dho.eW.n().b(dln.a, Boolean.valueOf(true)).b(dln.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, dho.eW.n().b(dln.a, Boolean.valueOf(true)).b(dln.c, Boolean.valueOf(true)).b(dln.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, dho.eW.n().b(dln.a, Boolean.valueOf(true)).b(dln.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, dho.eW.n().b(dln.d, Boolean.valueOf(true)).b(dln.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, dho.eW.n().b(dln.d, Boolean.valueOf(true)).b(dln.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, dho.eW.n().b(dln.d, Boolean.valueOf(true)).b(dln.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, dho.eW.n().b(dln.a, Boolean.valueOf(true)).b(dln.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, dho.eW.n().b(dln.a, Boolean.valueOf(true)).b(dln.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         dus $$8 = dho.dy.n().b(djs.b, jk.e);
         dus $$9 = dho.dy.n().b(djs.b, jk.e).b(djs.f, dvo.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends eny.q {
      public i(int $$0, azn $$1, eky $$2, jk $$3) {
         super(elx.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(ug $$0) {
         super(elx.A, $$0);
      }

      @Override
      public void a(elk $$0, ell $$1, azn $$2) {
         jk $$3 = this.i();
         if ($$3 != jk.c && $$3 != jk.f) {
            this.b((eny.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((eny.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static eny.i a(ell $$0, azn $$1, int $$2, int $$3, int $$4, jk $$5, int $$6) {
         eky $$7 = eky.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eny.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfg $$0, dfe $$1, dwp $$2, azn $$3, eky $$4, ddp $$5, jf $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, eny.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         jk $$7 = this.i();
         if ($$7 != jk.c && $$7 != jk.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends eny.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, azn $$1, eky $$2, jk $$3) {
         super(elx.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(ug $$0) {
         super(elx.B, $$0);
         this.d = $$0.h("Type");
      }

      @Override
      protected void a(elw $$0, ug $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(elk $$0, ell $$1, azn $$2) {
         this.a((eny.m)$$0, $$1, $$2, 4, 1);
         this.b((eny.m)$$0, $$1, $$2, 1, 4);
         this.c((eny.m)$$0, $$1, $$2, 1, 4);
      }

      public static eny.j a(ell $$0, azn $$1, int $$2, int $$3, int $$4, jk $$5, int $$6) {
         eky $$7 = eky.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eny.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfg $$0, dfe $$1, dwp $$2, azn $$3, eky $$4, ddp $$5, jf $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, eny.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, dho.eH.n(), 5, 1, 5, $$4);
               this.a($$0, dho.eH.n(), 5, 2, 5, $$4);
               this.a($$0, dho.eH.n(), 5, 3, 5, $$4);
               this.a($$0, dho.cq.n().b(dqp.g, jk.e), 4, 3, 5, $$4);
               this.a($$0, dho.cq.n().b(dqp.g, jk.f), 6, 3, 5, $$4);
               this.a($$0, dho.cq.n().b(dqp.g, jk.d), 5, 3, 4, $$4);
               this.a($$0, dho.cq.n().b(dqp.g, jk.c), 5, 3, 6, $$4);
               this.a($$0, dho.jE.n(), 4, 1, 4, $$4);
               this.a($$0, dho.jE.n(), 4, 1, 5, $$4);
               this.a($$0, dho.jE.n(), 4, 1, 6, $$4);
               this.a($$0, dho.jE.n(), 6, 1, 4, $$4);
               this.a($$0, dho.jE.n(), 6, 1, 5, $$4);
               this.a($$0, dho.jE.n(), 6, 1, 6, $$4);
               this.a($$0, dho.jE.n(), 5, 1, 4, $$4);
               this.a($$0, dho.jE.n(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, dho.eH.n(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, dho.eH.n(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, dho.eH.n(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, dho.eH.n(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, dho.eH.n(), 5, 1, 5, $$4);
               this.a($$0, dho.eH.n(), 5, 2, 5, $$4);
               this.a($$0, dho.eH.n(), 5, 3, 5, $$4);
               this.a($$0, dho.G.n(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, dho.m.n(), 1, 3, $$8, $$4);
                  this.a($$0, dho.m.n(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, dho.m.n(), $$9, 3, 1, $$4);
                  this.a($$0, dho.m.n(), $$9, 3, 9, $$4);
               }

               this.a($$0, dho.m.n(), 5, 1, 4, $$4);
               this.a($$0, dho.m.n(), 5, 1, 6, $$4);
               this.a($$0, dho.m.n(), 5, 3, 4, $$4);
               this.a($$0, dho.m.n(), 5, 3, 6, $$4);
               this.a($$0, dho.m.n(), 4, 1, 5, $$4);
               this.a($$0, dho.m.n(), 6, 1, 5, $$4);
               this.a($$0, dho.m.n(), 4, 3, 5, $$4);
               this.a($$0, dho.m.n(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, dho.m.n(), 4, $$10, 4, $$4);
                  this.a($$0, dho.m.n(), 6, $$10, 4, $$4);
                  this.a($$0, dho.m.n(), 4, $$10, 6, $$4);
                  this.a($$0, dho.m.n(), 6, $$10, 6, $$4);
               }

               this.a($$0, dho.cq.n(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, dho.n.n(), 2, 3, $$11, $$4);
                  this.a($$0, dho.n.n(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, dho.n.n(), 4, 3, $$11, $$4);
                     this.a($$0, dho.n.n(), 5, 3, $$11, $$4);
                     this.a($$0, dho.n.n(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, dho.n.n(), 7, 3, $$11, $$4);
                  this.a($$0, dho.n.n(), 8, 3, $$11, $$4);
               }

               dus $$12 = dho.cO.n().b(dls.b, jk.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, eth.w);
         }
      }
   }

   static class k extends elk.a {
      @Override
      public void a(azn $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = dho.eJ.n();
            } else if ($$5 < 0.5F) {
               this.a = dho.eI.n();
            } else if ($$5 < 0.55F) {
               this.a = dho.eP.n();
            } else {
               this.a = dho.eH.n();
            }
         } else {
            this.a = dho.nc.n();
         }
      }
   }

   public static class l extends eny.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(elx $$0, int $$1, int $$2, int $$3, jk $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = eny.p.a.a;
      }

      public l(int $$0, azn $$1, eky $$2, jk $$3) {
         super(elx.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(elx $$0, ug $$1) {
         super($$0, $$1);
         this.d = $$1.q("Source");
      }

      public l(ug $$0) {
         this(elx.C, $$0);
      }

      @Override
      protected void a(elw $$0, ug $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(elk $$0, ell $$1, azn $$2) {
         if (this.d) {
            eny.i = eny.c.class;
         }

         this.a((eny.m)$$0, $$1, $$2, 1, 1);
      }

      public static eny.l a(ell $$0, azn $$1, int $$2, int $$3, int $$4, jk $$5, int $$6) {
         eky $$7 = eky.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eny.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfg $$0, dfe $$1, dwp $$2, azn $$3, eky $$4, ddp $$5, jf $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, eny.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, eny.p.a.a, 1, 1, 4);
         this.a($$0, dho.eH.n(), 2, 6, 1, $$4);
         this.a($$0, dho.eH.n(), 1, 5, 1, $$4);
         this.a($$0, dho.jE.n(), 1, 6, 1, $$4);
         this.a($$0, dho.eH.n(), 1, 5, 2, $$4);
         this.a($$0, dho.eH.n(), 1, 4, 3, $$4);
         this.a($$0, dho.jE.n(), 1, 5, 3, $$4);
         this.a($$0, dho.eH.n(), 2, 4, 3, $$4);
         this.a($$0, dho.eH.n(), 3, 3, 3, $$4);
         this.a($$0, dho.jE.n(), 3, 4, 3, $$4);
         this.a($$0, dho.eH.n(), 3, 3, 2, $$4);
         this.a($$0, dho.eH.n(), 3, 2, 1, $$4);
         this.a($$0, dho.jE.n(), 3, 3, 1, $$4);
         this.a($$0, dho.eH.n(), 2, 2, 1, $$4);
         this.a($$0, dho.eH.n(), 1, 1, 1, $$4);
         this.a($$0, dho.jE.n(), 1, 2, 1, $$4);
         this.a($$0, dho.eH.n(), 1, 1, 2, $$4);
         this.a($$0, dho.jE.n(), 1, 1, 3, $$4);
      }
   }

   public static class m extends eny.l {
      public eny.f a;
      @Nullable
      public eny.g b;
      public final List<elk> c = Lists.newArrayList();

      public m(azn $$0, int $$1, int $$2) {
         super(elx.D, 0, $$1, $$2, a($$0));
      }

      public m(ug $$0) {
         super(elx.D, $$0);
      }

      @Override
      public jf h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends eny.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, azn $$1, eky $$2, jk $$3) {
         super(elx.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(ug $$0) {
         super(elx.E, $$0);
         this.d = $$0.q("Left");
         this.i = $$0.q("Right");
      }

      @Override
      protected void a(elw $$0, ug $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(elk $$0, ell $$1, azn $$2) {
         this.a((eny.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((eny.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((eny.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static eny.n a(ell $$0, azn $$1, int $$2, int $$3, int $$4, jk $$5, int $$6) {
         eky $$7 = eky.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new eny.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfg $$0, dfe $$1, dwp $$2, azn $$3, eky $$4, ddp $$5, jf $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, eny.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, eny.p.a.a, 1, 1, 6);
         dus $$7 = dho.cq.n().b(dqp.g, jk.f);
         dus $$8 = dho.cq.n().b(dqp.g, jk.e);
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

   public static class o extends eny.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, azn $$1, eky $$2, jk $$3) {
         super(elx.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(ug $$0) {
         super(elx.F, $$0);
      }

      @Override
      public void a(elk $$0, ell $$1, azn $$2) {
         this.a((eny.m)$$0, $$1, $$2, 1, 1);
      }

      public static eny.o a(ell $$0, azn $$1, int $$2, int $$3, int $$4, jk $$5, int $$6) {
         eky $$7 = eky.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new eny.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfg $$0, dfe $$1, dwp $$2, azn $$3, eky $$4, ddp $$5, jf $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, eny.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, eny.p.a.a, 1, 1, 7);
         dus $$7 = dho.cQ.n().b(dph.b, jk.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, dho.eH.n(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dho.eH.n(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dho.eH.n(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends elk {
      protected eny.p.a h = eny.p.a.a;

      protected p(elx $$0, int $$1, eky $$2) {
         super($$0, $$1, $$2);
      }

      public p(elx $$0, ug $$1) {
         super($$0, $$1);
         this.h = eny.p.a.valueOf($$1.l("EntryDoor"));
      }

      @Override
      protected void a(elw $$0, ug $$1) {
         $$1.a("EntryDoor", this.h.name());
      }

      protected void a(dfg $$0, azn $$1, eky $$2, eny.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, dho.eH.n(), $$4, $$5, $$6, $$2);
               this.a($$0, dho.eH.n(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dho.eH.n(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dho.eH.n(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dho.eH.n(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dho.eH.n(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dho.eH.n(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dho.cN.n(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dho.cN.n().b(djs.f, dvo.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, dho.nc.n(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dho.nc.n(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dho.eW.n().b(dln.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, dho.eW.n().b(dln.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dho.eW.n().b(dln.b, Boolean.valueOf(true)).b(dln.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dho.eW.n().b(dln.b, Boolean.valueOf(true)).b(dln.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dho.eW.n().b(dln.b, Boolean.valueOf(true)).b(dln.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dho.eW.n().b(dln.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dho.eW.n().b(dln.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, dho.eH.n(), $$4, $$5, $$6, $$2);
               this.a($$0, dho.eH.n(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dho.eH.n(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dho.eH.n(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dho.eH.n(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dho.eH.n(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dho.eH.n(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dho.dy.n(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dho.dy.n().b(djs.f, dvo.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dho.dM.n().b(dhw.aF, jk.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, dho.dM.n().b(dhw.aF, jk.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected eny.p.a b(azn $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return eny.p.a.a;
            case 2:
               return eny.p.a.b;
            case 3:
               return eny.p.a.c;
            case 4:
               return eny.p.a.d;
         }
      }

      @Nullable
      protected elk a(eny.m $$0, ell $$1, azn $$2, int $$3, int $$4) {
         jk $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eny.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$5, this.g());
               case d:
                  return eny.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$5, this.g());
               case e:
                  return eny.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
               case f:
                  return eny.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected elk b(eny.m $$0, ell $$1, azn $$2, int $$3, int $$4) {
         jk $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eny.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jk.e, this.g());
               case d:
                  return eny.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jk.e, this.g());
               case e:
                  return eny.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jk.c, this.g());
               case f:
                  return eny.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jk.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected elk c(eny.m $$0, ell $$1, azn $$2, int $$3, int $$4) {
         jk $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eny.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jk.f, this.g());
               case d:
                  return eny.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jk.f, this.g());
               case e:
                  return eny.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jk.d, this.g());
               case f:
                  return eny.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jk.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(eky $$0) {
         return $$0 != null && $$0.i() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;
      }
   }

   public abstract static class q extends eny.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(elx $$0, int $$1, eky $$2) {
         super($$0, $$1, $$2);
      }

      public q(elx $$0, ug $$1) {
         super($$0, $$1);
      }
   }
}
