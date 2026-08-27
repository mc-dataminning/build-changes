import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class ejg {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final ejg.f[] g = new ejg.f[]{
      new ejg.f(ejg.n.class, 40, 0),
      new ejg.f(ejg.h.class, 5, 5),
      new ejg.f(ejg.d.class, 20, 0),
      new ejg.f(ejg.i.class, 20, 0),
      new ejg.f(ejg.j.class, 10, 6),
      new ejg.f(ejg.o.class, 5, 5),
      new ejg.f(ejg.l.class, 5, 5),
      new ejg.f(ejg.c.class, 5, 4),
      new ejg.f(ejg.a.class, 5, 4),
      new ejg.f(ejg.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new ejg.f(ejg.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<ejg.f> h;
   static Class<? extends ejg.p> i;
   private static int j;
   static final ejg.k k = new ejg.k();

   public static void a() {
      h = Lists.newArrayList();

      for (ejg.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (ejg.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static ejg.p a(Class<? extends ejg.p> $$0, egu $$1, ayg $$2, int $$3, int $$4, int $$5, @Nullable is $$6, int $$7) {
      ejg.p $$8 = null;
      if ($$0 == ejg.n.class) {
         $$8 = ejg.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ejg.h.class) {
         $$8 = ejg.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ejg.d.class) {
         $$8 = ejg.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ejg.i.class) {
         $$8 = ejg.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ejg.j.class) {
         $$8 = ejg.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ejg.o.class) {
         $$8 = ejg.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ejg.l.class) {
         $$8 = ejg.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ejg.c.class) {
         $$8 = ejg.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ejg.a.class) {
         $$8 = ejg.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ejg.e.class) {
         $$8 = ejg.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ejg.g.class) {
         $$8 = ejg.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static ejg.p a(ejg.m $$0, egu $$1, ayg $$2, int $$3, int $$4, int $$5, is $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            ejg.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (ejg.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  ejg.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         egh $$13 = ejg.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.i() > 1 ? new ejg.b($$7, $$13, $$6) : null;
      }
   }

   static egt b(ejg.m $$0, egu $$1, ayg $$2, int $$3, int $$4, int $$5, @Nullable is $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
         egt $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends ejg.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, ayg $$1, egh $$2, is $$3) {
         super(ehg.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(ua $$0) {
         super(ehg.t, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(ehf $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(egt $$0, egu $$1, ayg $$2) {
         this.a((ejg.m)$$0, $$1, $$2, 1, 1);
      }

      public static ejg.a a(egu $$0, ayg $$1, int $$2, int $$3, int $$4, is $$5, int $$6) {
         egh $$7 = egh.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new ejg.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(day $$0, daw $$1, dse $$2, ayg $$3, egh $$4, czk $$5, in $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, ejg.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, ejg.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, ddg.eH.n(), ddg.eH.n(), false);
         this.a($$0, ddg.jK.n(), 3, 1, 1, $$4);
         this.a($$0, ddg.jK.n(), 3, 1, 5, $$4);
         this.a($$0, ddg.jK.n(), 3, 2, 2, $$4);
         this.a($$0, ddg.jK.n(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, ddg.jK.n(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, eoj.y);
         }
      }
   }

   public static class b extends ejg.p {
      private final int a;

      public b(int $$0, egh $$1, is $$2) {
         super(ehg.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != is.c && $$2 != is.d ? $$1.d() : $$1.f();
      }

      public b(ua $$0) {
         super(ehg.u, $$0);
         this.a = $$0.h("Steps");
      }

      @Override
      protected void a(ehf $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static egh a(egu $$0, ayg $$1, int $$2, int $$3, int $$4, is $$5) {
         int $$6 = 3;
         egh $$7 = egh.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         egt $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().i() == $$7.i()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = egh.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return egh.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(day $$0, daw $$1, dse $$2, ayg $$3, egh $$4, czk $$5, in $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, ddg.eH.n(), 0, 0, $$7, $$4);
            this.a($$0, ddg.eH.n(), 1, 0, $$7, $$4);
            this.a($$0, ddg.eH.n(), 2, 0, $$7, $$4);
            this.a($$0, ddg.eH.n(), 3, 0, $$7, $$4);
            this.a($$0, ddg.eH.n(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, ddg.eH.n(), 0, $$8, $$7, $$4);
               this.a($$0, ddg.nc.n(), 1, $$8, $$7, $$4);
               this.a($$0, ddg.nc.n(), 2, $$8, $$7, $$4);
               this.a($$0, ddg.nc.n(), 3, $$8, $$7, $$4);
               this.a($$0, ddg.eH.n(), 4, $$8, $$7, $$4);
            }

            this.a($$0, ddg.eH.n(), 0, 4, $$7, $$4);
            this.a($$0, ddg.eH.n(), 1, 4, $$7, $$4);
            this.a($$0, ddg.eH.n(), 2, 4, $$7, $$4);
            this.a($$0, ddg.eH.n(), 3, 4, $$7, $$4);
            this.a($$0, ddg.eH.n(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends ejg.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, ayg $$1, egh $$2, is $$3) {
         super(ehg.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(ua $$0) {
         super(ehg.v, $$0);
         this.d = $$0.q("leftLow");
         this.i = $$0.q("leftHigh");
         this.j = $$0.q("rightLow");
         this.k = $$0.q("rightHigh");
      }

      @Override
      protected void a(ehf $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(egt $$0, egu $$1, ayg $$2) {
         int $$3 = 3;
         int $$4 = 5;
         is $$5 = this.i();
         if ($$5 == is.e || $$5 == is.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((ejg.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((ejg.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((ejg.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((ejg.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((ejg.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static ejg.c a(egu $$0, ayg $$1, int $$2, int $$3, int $$4, is $$5, int $$6) {
         egh $$7 = egh.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new ejg.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(day $$0, daw $$1, dse $$2, ayg $$3, egh $$4, czk $$5, in $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, ejg.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, ejg.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, ejg.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, ejg.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, ejg.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, ejg.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, ddg.jE.n(), ddg.jE.n(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, ddg.jE.n(), ddg.jE.n(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, ejg.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, ddg.jE.n(), ddg.jE.n(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, ddg.jE.n(), ddg.jE.n(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, ddg.jE.n(), ddg.jE.n(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, ddg.jE.n(), ddg.jE.n(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, ddg.jE.n().a(dkh.b, drp.c), ddg.jE.n().a(dkh.b, drp.c), false);
         this.a($$0, ddg.cq.n().a(dmg.g, is.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends ejg.q {
      public d(int $$0, ayg $$1, egh $$2, is $$3) {
         super(ehg.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(ua $$0) {
         super(ehg.w, $$0);
      }

      @Override
      public void a(egt $$0, egu $$1, ayg $$2) {
         is $$3 = this.i();
         if ($$3 != is.c && $$3 != is.f) {
            this.c((ejg.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((ejg.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static ejg.d a(egu $$0, ayg $$1, int $$2, int $$3, int $$4, is $$5, int $$6) {
         egh $$7 = egh.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new ejg.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(day $$0, daw $$1, dse $$2, ayg $$3, egh $$4, czk $$5, in $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, ejg.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         is $$7 = this.i();
         if ($$7 != is.c && $$7 != is.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends ejg.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, ayg $$1, egh $$2, is $$3) {
         super(ehg.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.e() > 6;
      }

      public e(ua $$0) {
         super(ehg.x, $$0);
         this.i = $$0.q("Tall");
      }

      @Override
      protected void a(ehf $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static ejg.e a(egu $$0, ayg $$1, int $$2, int $$3, int $$4, is $$5, int $$6) {
         egh $$7 = egh.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = egh.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new ejg.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(day $$0, daw $$1, dse $$2, ayg $$3, egh $$4, czk $$5, in $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, ejg.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, ddg.bs.n(), ddg.bs.n(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, ddg.n.n(), ddg.n.n(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, ddg.n.n(), ddg.n.n(), false);
               this.a($$0, ddg.cq.n().a(dmg.g, is.f), 2, 3, $$10, $$4);
               this.a($$0, ddg.cq.n().a(dmg.g, is.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, ddg.n.n(), ddg.n.n(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, ddg.n.n(), ddg.n.n(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, ddg.cl.n(), ddg.cl.n(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, ddg.cl.n(), ddg.cl.n(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, ddg.cl.n(), ddg.cl.n(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, ddg.cl.n(), ddg.cl.n(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, ddg.cl.n(), ddg.cl.n(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, ddg.cl.n(), ddg.cl.n(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, ddg.cl.n(), ddg.cl.n(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, ddg.n.n(), ddg.n.n(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, ddg.n.n(), ddg.n.n(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, ddg.n.n(), ddg.n.n(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, ddg.n.n(), ddg.n.n(), false);
            this.a($$0, ddg.n.n(), 9, 5, 11, $$4);
            this.a($$0, ddg.n.n(), 8, 5, 11, $$4);
            this.a($$0, ddg.n.n(), 9, 5, 10, $$4);
            dqh $$12 = ddg.dU.n().a(dgc.d, Boolean.valueOf(true)).a(dgc.b, Boolean.valueOf(true));
            dqh $$13 = ddg.dU.n().a(dgc.a, Boolean.valueOf(true)).a(dgc.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, ddg.dU.n().a(dgc.a, Boolean.valueOf(true)).a(dgc.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, ddg.dU.n().a(dgc.c, Boolean.valueOf(true)).a(dgc.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, ddg.dU.n().a(dgc.a, Boolean.valueOf(true)).a(dgc.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, ddg.dU.n().a(dgc.c, Boolean.valueOf(true)).a(dgc.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, ddg.dU.n().a(dgc.a, Boolean.valueOf(true)).a(dgc.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            dqh $$15 = ddg.cO.n().a(dhk.b, is.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            dqh $$18 = ddg.dU.n().a(dgc.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            dqh $$19 = ddg.dU.n().a(dgc.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            dqh $$20 = $$13.a(dgc.d, Boolean.valueOf(true)).a(dgc.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.a(dgc.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.a(dgc.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.a(dgc.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.a(dgc.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            dqh $$21 = ddg.cp.n();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, eoj.w);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, eoj.w);
         }
      }
   }

   static class f {
      public final Class<? extends ejg.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends ejg.p> $$0, int $$1, int $$2) {
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

   public static class g extends ejg.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, egh $$1, is $$2) {
         super(ehg.y, $$0, $$1);
         this.a($$2);
      }

      public g(ua $$0) {
         super(ehg.y, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(ehf $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(egt $$0, egu $$1, ayg $$2) {
         if ($$0 != null) {
            ((ejg.m)$$0).b = this;
         }
      }

      public static ejg.g a(egu $$0, int $$1, int $$2, int $$3, is $$4, int $$5) {
         egh $$6 = egh.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new ejg.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(day $$0, daw $$1, dse $$2, ayg $$3, egh $$4, czk $$5, in $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, ejg.k);
         this.a($$0, $$3, $$4, ejg.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, ejg.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, ejg.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, ejg.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, ejg.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, ejg.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, ejg.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, ddg.H.n(), ddg.H.n(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, ddg.H.n(), ddg.H.n(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, ejg.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, ddg.H.n(), ddg.H.n(), false);
         dqh $$8 = ddg.eW.n().a(dhf.a, Boolean.valueOf(true)).a(dhf.c, Boolean.valueOf(true));
         dqh $$9 = ddg.eW.n().a(dhf.d, Boolean.valueOf(true)).a(dhf.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         dqh $$12 = ddg.fj.n().a(dky.b, is.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, ejg.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, ejg.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, ejg.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         dqh $$14 = ddg.fy.n().a(dft.b, is.c);
         dqh $$15 = ddg.fy.n().a(dft.b, is.d);
         dqh $$16 = ddg.fy.n().a(dft.b, is.f);
         dqh $$17 = ddg.fy.n().a(dft.b, is.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.a(dft.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.a(dft.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.a(dft.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.a(dft.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.a(dft.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.a(dft.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.a(dft.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.a(dft.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.a(dft.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.a(dft.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.a(dft.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.a(dft.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            dqh $$21 = ddg.fx.n();
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
            in $$22 = this.b(5, 3, 6);
            if ($$4.b($$22)) {
               this.d = true;
               $$0.a($$22, ddg.ct.n(), 2);
               if ($$0.c_($$22) instanceof dpa $$24) {
                  $$24.a(brn.aL, $$3);
               }
            }
         }
      }
   }

   public static class h extends ejg.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, ayg $$1, egh $$2, is $$3) {
         super(ehg.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(ua $$0) {
         super(ehg.z, $$0);
      }

      @Override
      public void a(egt $$0, egu $$1, ayg $$2) {
         this.a((ejg.m)$$0, $$1, $$2, 1, 1);
      }

      public static ejg.h a(egu $$0, ayg $$1, int $$2, int $$3, int $$4, is $$5, int $$6) {
         egh $$7 = egh.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new ejg.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(day $$0, daw $$1, dse $$2, ayg $$3, egh $$4, czk $$5, in $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, ejg.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, ejg.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, ejg.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, ejg.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, ejg.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, ddg.eW.n().a(dhf.a, Boolean.valueOf(true)).a(dhf.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, ddg.eW.n().a(dhf.a, Boolean.valueOf(true)).a(dhf.c, Boolean.valueOf(true)).a(dhf.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, ddg.eW.n().a(dhf.a, Boolean.valueOf(true)).a(dhf.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, ddg.eW.n().a(dhf.d, Boolean.valueOf(true)).a(dhf.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, ddg.eW.n().a(dhf.d, Boolean.valueOf(true)).a(dhf.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, ddg.eW.n().a(dhf.d, Boolean.valueOf(true)).a(dhf.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, ddg.eW.n().a(dhf.a, Boolean.valueOf(true)).a(dhf.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, ddg.eW.n().a(dhf.a, Boolean.valueOf(true)).a(dhf.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         dqh $$8 = ddg.dy.n().a(dfk.b, is.e);
         dqh $$9 = ddg.dy.n().a(dfk.b, is.e).a(dfk.f, drd.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends ejg.q {
      public i(int $$0, ayg $$1, egh $$2, is $$3) {
         super(ehg.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(ua $$0) {
         super(ehg.A, $$0);
      }

      @Override
      public void a(egt $$0, egu $$1, ayg $$2) {
         is $$3 = this.i();
         if ($$3 != is.c && $$3 != is.f) {
            this.b((ejg.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((ejg.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static ejg.i a(egu $$0, ayg $$1, int $$2, int $$3, int $$4, is $$5, int $$6) {
         egh $$7 = egh.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new ejg.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(day $$0, daw $$1, dse $$2, ayg $$3, egh $$4, czk $$5, in $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, ejg.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         is $$7 = this.i();
         if ($$7 != is.c && $$7 != is.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends ejg.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, ayg $$1, egh $$2, is $$3) {
         super(ehg.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(ua $$0) {
         super(ehg.B, $$0);
         this.d = $$0.h("Type");
      }

      @Override
      protected void a(ehf $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(egt $$0, egu $$1, ayg $$2) {
         this.a((ejg.m)$$0, $$1, $$2, 4, 1);
         this.b((ejg.m)$$0, $$1, $$2, 1, 4);
         this.c((ejg.m)$$0, $$1, $$2, 1, 4);
      }

      public static ejg.j a(egu $$0, ayg $$1, int $$2, int $$3, int $$4, is $$5, int $$6) {
         egh $$7 = egh.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new ejg.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(day $$0, daw $$1, dse $$2, ayg $$3, egh $$4, czk $$5, in $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, ejg.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, ddg.eH.n(), 5, 1, 5, $$4);
               this.a($$0, ddg.eH.n(), 5, 2, 5, $$4);
               this.a($$0, ddg.eH.n(), 5, 3, 5, $$4);
               this.a($$0, ddg.cq.n().a(dmg.g, is.e), 4, 3, 5, $$4);
               this.a($$0, ddg.cq.n().a(dmg.g, is.f), 6, 3, 5, $$4);
               this.a($$0, ddg.cq.n().a(dmg.g, is.d), 5, 3, 4, $$4);
               this.a($$0, ddg.cq.n().a(dmg.g, is.c), 5, 3, 6, $$4);
               this.a($$0, ddg.jE.n(), 4, 1, 4, $$4);
               this.a($$0, ddg.jE.n(), 4, 1, 5, $$4);
               this.a($$0, ddg.jE.n(), 4, 1, 6, $$4);
               this.a($$0, ddg.jE.n(), 6, 1, 4, $$4);
               this.a($$0, ddg.jE.n(), 6, 1, 5, $$4);
               this.a($$0, ddg.jE.n(), 6, 1, 6, $$4);
               this.a($$0, ddg.jE.n(), 5, 1, 4, $$4);
               this.a($$0, ddg.jE.n(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, ddg.eH.n(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, ddg.eH.n(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, ddg.eH.n(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, ddg.eH.n(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, ddg.eH.n(), 5, 1, 5, $$4);
               this.a($$0, ddg.eH.n(), 5, 2, 5, $$4);
               this.a($$0, ddg.eH.n(), 5, 3, 5, $$4);
               this.a($$0, ddg.G.n(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, ddg.m.n(), 1, 3, $$8, $$4);
                  this.a($$0, ddg.m.n(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, ddg.m.n(), $$9, 3, 1, $$4);
                  this.a($$0, ddg.m.n(), $$9, 3, 9, $$4);
               }

               this.a($$0, ddg.m.n(), 5, 1, 4, $$4);
               this.a($$0, ddg.m.n(), 5, 1, 6, $$4);
               this.a($$0, ddg.m.n(), 5, 3, 4, $$4);
               this.a($$0, ddg.m.n(), 5, 3, 6, $$4);
               this.a($$0, ddg.m.n(), 4, 1, 5, $$4);
               this.a($$0, ddg.m.n(), 6, 1, 5, $$4);
               this.a($$0, ddg.m.n(), 4, 3, 5, $$4);
               this.a($$0, ddg.m.n(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, ddg.m.n(), 4, $$10, 4, $$4);
                  this.a($$0, ddg.m.n(), 6, $$10, 4, $$4);
                  this.a($$0, ddg.m.n(), 4, $$10, 6, $$4);
                  this.a($$0, ddg.m.n(), 6, $$10, 6, $$4);
               }

               this.a($$0, ddg.cq.n(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, ddg.n.n(), 2, 3, $$11, $$4);
                  this.a($$0, ddg.n.n(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, ddg.n.n(), 4, 3, $$11, $$4);
                     this.a($$0, ddg.n.n(), 5, 3, $$11, $$4);
                     this.a($$0, ddg.n.n(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, ddg.n.n(), 7, 3, $$11, $$4);
                  this.a($$0, ddg.n.n(), 8, 3, $$11, $$4);
               }

               dqh $$12 = ddg.cO.n().a(dhk.b, is.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, eoj.x);
         }
      }
   }

   static class k extends egt.a {
      @Override
      public void a(ayg $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = ddg.eJ.n();
            } else if ($$5 < 0.5F) {
               this.a = ddg.eI.n();
            } else if ($$5 < 0.55F) {
               this.a = ddg.eP.n();
            } else {
               this.a = ddg.eH.n();
            }
         } else {
            this.a = ddg.nc.n();
         }
      }
   }

   public static class l extends ejg.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(ehg $$0, int $$1, int $$2, int $$3, is $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = ejg.p.a.a;
      }

      public l(int $$0, ayg $$1, egh $$2, is $$3) {
         super(ehg.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(ehg $$0, ua $$1) {
         super($$0, $$1);
         this.d = $$1.q("Source");
      }

      public l(ua $$0) {
         this(ehg.C, $$0);
      }

      @Override
      protected void a(ehf $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(egt $$0, egu $$1, ayg $$2) {
         if (this.d) {
            ejg.i = ejg.c.class;
         }

         this.a((ejg.m)$$0, $$1, $$2, 1, 1);
      }

      public static ejg.l a(egu $$0, ayg $$1, int $$2, int $$3, int $$4, is $$5, int $$6) {
         egh $$7 = egh.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new ejg.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(day $$0, daw $$1, dse $$2, ayg $$3, egh $$4, czk $$5, in $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, ejg.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, ejg.p.a.a, 1, 1, 4);
         this.a($$0, ddg.eH.n(), 2, 6, 1, $$4);
         this.a($$0, ddg.eH.n(), 1, 5, 1, $$4);
         this.a($$0, ddg.jE.n(), 1, 6, 1, $$4);
         this.a($$0, ddg.eH.n(), 1, 5, 2, $$4);
         this.a($$0, ddg.eH.n(), 1, 4, 3, $$4);
         this.a($$0, ddg.jE.n(), 1, 5, 3, $$4);
         this.a($$0, ddg.eH.n(), 2, 4, 3, $$4);
         this.a($$0, ddg.eH.n(), 3, 3, 3, $$4);
         this.a($$0, ddg.jE.n(), 3, 4, 3, $$4);
         this.a($$0, ddg.eH.n(), 3, 3, 2, $$4);
         this.a($$0, ddg.eH.n(), 3, 2, 1, $$4);
         this.a($$0, ddg.jE.n(), 3, 3, 1, $$4);
         this.a($$0, ddg.eH.n(), 2, 2, 1, $$4);
         this.a($$0, ddg.eH.n(), 1, 1, 1, $$4);
         this.a($$0, ddg.jE.n(), 1, 2, 1, $$4);
         this.a($$0, ddg.eH.n(), 1, 1, 2, $$4);
         this.a($$0, ddg.jE.n(), 1, 1, 3, $$4);
      }
   }

   public static class m extends ejg.l {
      public ejg.f a;
      @Nullable
      public ejg.g b;
      public final List<egt> c = Lists.newArrayList();

      public m(ayg $$0, int $$1, int $$2) {
         super(ehg.D, 0, $$1, $$2, a($$0));
      }

      public m(ua $$0) {
         super(ehg.D, $$0);
      }

      @Override
      public in h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends ejg.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, ayg $$1, egh $$2, is $$3) {
         super(ehg.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(ua $$0) {
         super(ehg.E, $$0);
         this.d = $$0.q("Left");
         this.i = $$0.q("Right");
      }

      @Override
      protected void a(ehf $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(egt $$0, egu $$1, ayg $$2) {
         this.a((ejg.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((ejg.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((ejg.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static ejg.n a(egu $$0, ayg $$1, int $$2, int $$3, int $$4, is $$5, int $$6) {
         egh $$7 = egh.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new ejg.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(day $$0, daw $$1, dse $$2, ayg $$3, egh $$4, czk $$5, in $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, ejg.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, ejg.p.a.a, 1, 1, 6);
         dqh $$7 = ddg.cq.n().a(dmg.g, is.f);
         dqh $$8 = ddg.cq.n().a(dmg.g, is.e);
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

   public static class o extends ejg.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, ayg $$1, egh $$2, is $$3) {
         super(ehg.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(ua $$0) {
         super(ehg.F, $$0);
      }

      @Override
      public void a(egt $$0, egu $$1, ayg $$2) {
         this.a((ejg.m)$$0, $$1, $$2, 1, 1);
      }

      public static ejg.o a(egu $$0, ayg $$1, int $$2, int $$3, int $$4, is $$5, int $$6) {
         egh $$7 = egh.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new ejg.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(day $$0, daw $$1, dse $$2, ayg $$3, egh $$4, czk $$5, in $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, ejg.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, ejg.p.a.a, 1, 1, 7);
         dqh $$7 = ddg.cQ.n().a(dky.b, is.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, ddg.eH.n(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, ddg.eH.n(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, ddg.eH.n(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends egt {
      protected ejg.p.a h = ejg.p.a.a;

      protected p(ehg $$0, int $$1, egh $$2) {
         super($$0, $$1, $$2);
      }

      public p(ehg $$0, ua $$1) {
         super($$0, $$1);
         this.h = ejg.p.a.valueOf($$1.l("EntryDoor"));
      }

      @Override
      protected void a(ehf $$0, ua $$1) {
         $$1.a("EntryDoor", this.h.name());
      }

      protected void a(day $$0, ayg $$1, egh $$2, ejg.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, ddg.eH.n(), $$4, $$5, $$6, $$2);
               this.a($$0, ddg.eH.n(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, ddg.eH.n(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, ddg.eH.n(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, ddg.eH.n(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, ddg.eH.n(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, ddg.eH.n(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, ddg.cN.n(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, ddg.cN.n().a(dfk.f, drd.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, ddg.nc.n(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, ddg.nc.n(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, ddg.eW.n().a(dhf.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, ddg.eW.n().a(dhf.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, ddg.eW.n().a(dhf.b, Boolean.valueOf(true)).a(dhf.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, ddg.eW.n().a(dhf.b, Boolean.valueOf(true)).a(dhf.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, ddg.eW.n().a(dhf.b, Boolean.valueOf(true)).a(dhf.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, ddg.eW.n().a(dhf.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, ddg.eW.n().a(dhf.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, ddg.eH.n(), $$4, $$5, $$6, $$2);
               this.a($$0, ddg.eH.n(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, ddg.eH.n(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, ddg.eH.n(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, ddg.eH.n(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, ddg.eH.n(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, ddg.eH.n(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, ddg.dy.n(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, ddg.dy.n().a(dfk.f, drd.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, ddg.dM.n().a(ddo.aE, is.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, ddg.dM.n().a(ddo.aE, is.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected ejg.p.a b(ayg $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return ejg.p.a.a;
            case 2:
               return ejg.p.a.b;
            case 3:
               return ejg.p.a.c;
            case 4:
               return ejg.p.a.d;
         }
      }

      @Nullable
      protected egt a(ejg.m $$0, egu $$1, ayg $$2, int $$3, int $$4) {
         is $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return ejg.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$5, this.g());
               case d:
                  return ejg.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$5, this.g());
               case e:
                  return ejg.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
               case f:
                  return ejg.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected egt b(ejg.m $$0, egu $$1, ayg $$2, int $$3, int $$4) {
         is $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return ejg.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, is.e, this.g());
               case d:
                  return ejg.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, is.e, this.g());
               case e:
                  return ejg.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, is.c, this.g());
               case f:
                  return ejg.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, is.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected egt c(ejg.m $$0, egu $$1, ayg $$2, int $$3, int $$4) {
         is $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return ejg.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, is.f, this.g());
               case d:
                  return ejg.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, is.f, this.g());
               case e:
                  return ejg.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, is.d, this.g());
               case f:
                  return ejg.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, is.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(egh $$0) {
         return $$0 != null && $$0.i() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;
      }
   }

   public abstract static class q extends ejg.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(ehg $$0, int $$1, egh $$2) {
         super($$0, $$1, $$2);
      }

      public q(ehg $$0, ua $$1) {
         super($$0, $$1);
      }
   }
}
