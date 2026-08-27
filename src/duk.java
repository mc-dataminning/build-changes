import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class duk {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final duk.f[] g = new duk.f[]{
      new duk.f(duk.n.class, 40, 0),
      new duk.f(duk.h.class, 5, 5),
      new duk.f(duk.d.class, 20, 0),
      new duk.f(duk.i.class, 20, 0),
      new duk.f(duk.j.class, 10, 6),
      new duk.f(duk.o.class, 5, 5),
      new duk.f(duk.l.class, 5, 5),
      new duk.f(duk.c.class, 5, 4),
      new duk.f(duk.a.class, 5, 4),
      new duk.f(duk.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new duk.f(duk.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<duk.f> h;
   static Class<? extends duk.p> i;
   private static int j;
   static final duk.k k = new duk.k();

   public static void a() {
      h = Lists.newArrayList();

      for (duk.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (duk.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static duk.p a(Class<? extends duk.p> $$0, dsf $$1, apf $$2, int $$3, int $$4, int $$5, @Nullable ha $$6, int $$7) {
      duk.p $$8 = null;
      if ($$0 == duk.n.class) {
         $$8 = duk.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == duk.h.class) {
         $$8 = duk.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == duk.d.class) {
         $$8 = duk.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == duk.i.class) {
         $$8 = duk.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == duk.j.class) {
         $$8 = duk.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == duk.o.class) {
         $$8 = duk.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == duk.l.class) {
         $$8 = duk.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == duk.c.class) {
         $$8 = duk.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == duk.a.class) {
         $$8 = duk.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == duk.e.class) {
         $$8 = duk.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == duk.g.class) {
         $$8 = duk.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static duk.p a(duk.m $$0, dsf $$1, apf $$2, int $$3, int $$4, int $$5, ha $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            duk.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (duk.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  duk.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         drs $$13 = duk.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.h() > 1 ? new duk.b($$7, $$13, $$6) : null;
      }
   }

   static dse b(duk.m $$0, dsf $$1, apf $$2, int $$3, int $$4, int $$5, @Nullable ha $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().g()) <= 112 && Math.abs($$5 - $$0.f().i()) <= 112) {
         dse $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends duk.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, apf $$1, drs $$2, ha $$3) {
         super(dsr.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(qr $$0) {
         super(dsr.t, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(dsq $$0, qr $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(dse $$0, dsf $$1, apf $$2) {
         this.a((duk.m)$$0, $$1, $$2, 1, 1);
      }

      public static duk.a a(dsf $$0, apf $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
         drs $$7 = drs.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new duk.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, gu $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, duk.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, duk.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, cpo.eI.n(), cpo.eI.n(), false);
         this.a($$0, cpo.jK.n(), 3, 1, 1, $$4);
         this.a($$0, cpo.jK.n(), 3, 1, 5, $$4);
         this.a($$0, cpo.jK.n(), 3, 2, 2, $$4);
         this.a($$0, cpo.jK.n(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, cpo.jK.n(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, dzg.y);
         }
      }
   }

   public static class b extends duk.p {
      private final int a;

      public b(int $$0, drs $$1, ha $$2) {
         super(dsr.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != ha.c && $$2 != ha.d ? $$1.c() : $$1.e();
      }

      public b(qr $$0) {
         super(dsr.u, $$0);
         this.a = $$0.h("Steps");
      }

      @Override
      protected void a(dsq $$0, qr $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static drs a(dsf $$0, apf $$1, int $$2, int $$3, int $$4, ha $$5) {
         int $$6 = 3;
         drs $$7 = drs.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         dse $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().h() == $$7.h()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = drs.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return drs.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, gu $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, cpo.eI.n(), 0, 0, $$7, $$4);
            this.a($$0, cpo.eI.n(), 1, 0, $$7, $$4);
            this.a($$0, cpo.eI.n(), 2, 0, $$7, $$4);
            this.a($$0, cpo.eI.n(), 3, 0, $$7, $$4);
            this.a($$0, cpo.eI.n(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, cpo.eI.n(), 0, $$8, $$7, $$4);
               this.a($$0, cpo.nc.n(), 1, $$8, $$7, $$4);
               this.a($$0, cpo.nc.n(), 2, $$8, $$7, $$4);
               this.a($$0, cpo.nc.n(), 3, $$8, $$7, $$4);
               this.a($$0, cpo.eI.n(), 4, $$8, $$7, $$4);
            }

            this.a($$0, cpo.eI.n(), 0, 4, $$7, $$4);
            this.a($$0, cpo.eI.n(), 1, 4, $$7, $$4);
            this.a($$0, cpo.eI.n(), 2, 4, $$7, $$4);
            this.a($$0, cpo.eI.n(), 3, 4, $$7, $$4);
            this.a($$0, cpo.eI.n(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends duk.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, apf $$1, drs $$2, ha $$3) {
         super(dsr.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(qr $$0) {
         super(dsr.v, $$0);
         this.d = $$0.q("leftLow");
         this.i = $$0.q("leftHigh");
         this.j = $$0.q("rightLow");
         this.k = $$0.q("rightHigh");
      }

      @Override
      protected void a(dsq $$0, qr $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(dse $$0, dsf $$1, apf $$2) {
         int $$3 = 3;
         int $$4 = 5;
         ha $$5 = this.i();
         if ($$5 == ha.e || $$5 == ha.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((duk.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((duk.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((duk.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((duk.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((duk.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static duk.c a(dsf $$0, apf $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
         drs $$7 = drs.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new duk.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, gu $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, duk.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, duk.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, duk.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, duk.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, duk.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, duk.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, cpo.jE.n(), cpo.jE.n(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, cpo.jE.n(), cpo.jE.n(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, duk.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, cpo.jE.n(), cpo.jE.n(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, cpo.jE.n(), cpo.jE.n(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, cpo.jE.n(), cpo.jE.n(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, cpo.jE.n(), cpo.jE.n(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, cpo.jE.n().a(cwq.a, ddj.c), cpo.jE.n().a(cwq.a, ddj.c), false);
         this.a($$0, cpo.cq.n().a(cyn.a, ha.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends duk.q {
      public d(int $$0, apf $$1, drs $$2, ha $$3) {
         super(dsr.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(qr $$0) {
         super(dsr.w, $$0);
      }

      @Override
      public void a(dse $$0, dsf $$1, apf $$2) {
         ha $$3 = this.i();
         if ($$3 != ha.c && $$3 != ha.f) {
            this.c((duk.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((duk.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static duk.d a(dsf $$0, apf $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
         drs $$7 = drs.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new duk.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, gu $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, duk.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         ha $$7 = this.i();
         if ($$7 != ha.c && $$7 != ha.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends duk.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, apf $$1, drs $$2, ha $$3) {
         super(dsr.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.d() > 6;
      }

      public e(qr $$0) {
         super(dsr.x, $$0);
         this.i = $$0.q("Tall");
      }

      @Override
      protected void a(dsq $$0, qr $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static duk.e a(dsf $$0, apf $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
         drs $$7 = drs.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = drs.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new duk.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, gu $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, duk.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, cpo.bs.n(), cpo.bs.n(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, cpo.n.n(), cpo.n.n(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, cpo.n.n(), cpo.n.n(), false);
               this.a($$0, cpo.cq.n().a(cyn.a, ha.f), 2, 3, $$10, $$4);
               this.a($$0, cpo.cq.n().a(cyn.a, ha.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, cpo.n.n(), cpo.n.n(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, cpo.n.n(), cpo.n.n(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, cpo.cl.n(), cpo.cl.n(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, cpo.cl.n(), cpo.cl.n(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, cpo.cl.n(), cpo.cl.n(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, cpo.cl.n(), cpo.cl.n(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, cpo.cl.n(), cpo.cl.n(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, cpo.cl.n(), cpo.cl.n(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, cpo.cl.n(), cpo.cl.n(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, cpo.n.n(), cpo.n.n(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, cpo.n.n(), cpo.n.n(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, cpo.n.n(), cpo.n.n(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, cpo.n.n(), cpo.n.n(), false);
            this.a($$0, cpo.n.n(), 9, 5, 11, $$4);
            this.a($$0, cpo.n.n(), 8, 5, 11, $$4);
            this.a($$0, cpo.n.n(), 9, 5, 10, $$4);
            dcb $$12 = cpo.dU.n().a(csh.d, Boolean.valueOf(true)).a(csh.b, Boolean.valueOf(true));
            dcb $$13 = cpo.dU.n().a(csh.a, Boolean.valueOf(true)).a(csh.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, cpo.dU.n().a(csh.a, Boolean.valueOf(true)).a(csh.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, cpo.dU.n().a(csh.c, Boolean.valueOf(true)).a(csh.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, cpo.dU.n().a(csh.a, Boolean.valueOf(true)).a(csh.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, cpo.dU.n().a(csh.c, Boolean.valueOf(true)).a(csh.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, cpo.dU.n().a(csh.a, Boolean.valueOf(true)).a(csh.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            dcb $$15 = cpo.cO.n().a(ctq.a, ha.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            dcb $$18 = cpo.dU.n().a(csh.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            dcb $$19 = cpo.dU.n().a(csh.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            dcb $$20 = $$13.a(csh.d, Boolean.valueOf(true)).a(csh.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.a(csh.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.a(csh.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.a(csh.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.a(csh.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            dcb $$21 = cpo.cp.n();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, dzg.w);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, dzg.w);
         }
      }
   }

   static class f {
      public final Class<? extends duk.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends duk.p> $$0, int $$1, int $$2) {
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

   public static class g extends duk.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, drs $$1, ha $$2) {
         super(dsr.y, $$0, $$1);
         this.a($$2);
      }

      public g(qr $$0) {
         super(dsr.y, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(dsq $$0, qr $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(dse $$0, dsf $$1, apf $$2) {
         if ($$0 != null) {
            ((duk.m)$$0).b = this;
         }
      }

      public static duk.g a(dsf $$0, int $$1, int $$2, int $$3, ha $$4, int $$5) {
         drs $$6 = drs.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new duk.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, gu $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, duk.k);
         this.a($$0, $$3, $$4, duk.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, duk.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, duk.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, duk.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, duk.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, duk.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, duk.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, cpo.H.n(), cpo.H.n(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, cpo.H.n(), cpo.H.n(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, duk.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, cpo.H.n(), cpo.H.n(), false);
         dcb $$8 = cpo.eX.n().a(ctl.a, Boolean.valueOf(true)).a(ctl.c, Boolean.valueOf(true));
         dcb $$9 = cpo.eX.n().a(ctl.d, Boolean.valueOf(true)).a(ctl.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         dcb $$12 = cpo.fj.n().a(cxh.a, ha.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, duk.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, duk.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, duk.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         dcb $$14 = cpo.fy.n().a(cry.a, ha.c);
         dcb $$15 = cpo.fy.n().a(cry.a, ha.d);
         dcb $$16 = cpo.fy.n().a(cry.a, ha.f);
         dcb $$17 = cpo.fy.n().a(cry.a, ha.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.a(cry.b, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.a(cry.b, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.a(cry.b, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.a(cry.b, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.a(cry.b, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.a(cry.b, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.a(cry.b, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.a(cry.b, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.a(cry.b, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.a(cry.b, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.a(cry.b, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.a(cry.b, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            dcb $$21 = cpo.fx.n();
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
            gu $$22 = this.b(5, 3, 6);
            if ($$4.b($$22)) {
               this.d = true;
               $$0.a($$22, cpo.ct.n(), 2);
               if ($$0.c_($$22) instanceof daz $$24) {
                  $$24.a(bfn.aI, $$3);
               }
            }
         }
      }
   }

   public static class h extends duk.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, apf $$1, drs $$2, ha $$3) {
         super(dsr.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(qr $$0) {
         super(dsr.z, $$0);
      }

      @Override
      public void a(dse $$0, dsf $$1, apf $$2) {
         this.a((duk.m)$$0, $$1, $$2, 1, 1);
      }

      public static duk.h a(dsf $$0, apf $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
         drs $$7 = drs.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new duk.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, gu $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, duk.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, duk.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, duk.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, duk.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, duk.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, cpo.eX.n().a(ctl.a, Boolean.valueOf(true)).a(ctl.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, cpo.eX.n().a(ctl.a, Boolean.valueOf(true)).a(ctl.c, Boolean.valueOf(true)).a(ctl.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, cpo.eX.n().a(ctl.a, Boolean.valueOf(true)).a(ctl.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, cpo.eX.n().a(ctl.d, Boolean.valueOf(true)).a(ctl.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, cpo.eX.n().a(ctl.d, Boolean.valueOf(true)).a(ctl.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, cpo.eX.n().a(ctl.d, Boolean.valueOf(true)).a(ctl.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, cpo.eX.n().a(ctl.a, Boolean.valueOf(true)).a(ctl.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, cpo.eX.n().a(ctl.a, Boolean.valueOf(true)).a(ctl.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         dcb $$8 = cpo.dy.n().a(crp.a, ha.e);
         dcb $$9 = cpo.dy.n().a(crp.a, ha.e).a(crp.e, dcx.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends duk.q {
      public i(int $$0, apf $$1, drs $$2, ha $$3) {
         super(dsr.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(qr $$0) {
         super(dsr.A, $$0);
      }

      @Override
      public void a(dse $$0, dsf $$1, apf $$2) {
         ha $$3 = this.i();
         if ($$3 != ha.c && $$3 != ha.f) {
            this.b((duk.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((duk.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static duk.i a(dsf $$0, apf $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
         drs $$7 = drs.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new duk.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, gu $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, duk.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         ha $$7 = this.i();
         if ($$7 != ha.c && $$7 != ha.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends duk.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, apf $$1, drs $$2, ha $$3) {
         super(dsr.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(qr $$0) {
         super(dsr.B, $$0);
         this.d = $$0.h("Type");
      }

      @Override
      protected void a(dsq $$0, qr $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(dse $$0, dsf $$1, apf $$2) {
         this.a((duk.m)$$0, $$1, $$2, 4, 1);
         this.b((duk.m)$$0, $$1, $$2, 1, 4);
         this.c((duk.m)$$0, $$1, $$2, 1, 4);
      }

      public static duk.j a(dsf $$0, apf $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
         drs $$7 = drs.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new duk.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, gu $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, duk.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, cpo.eI.n(), 5, 1, 5, $$4);
               this.a($$0, cpo.eI.n(), 5, 2, 5, $$4);
               this.a($$0, cpo.eI.n(), 5, 3, 5, $$4);
               this.a($$0, cpo.cq.n().a(cyn.a, ha.e), 4, 3, 5, $$4);
               this.a($$0, cpo.cq.n().a(cyn.a, ha.f), 6, 3, 5, $$4);
               this.a($$0, cpo.cq.n().a(cyn.a, ha.d), 5, 3, 4, $$4);
               this.a($$0, cpo.cq.n().a(cyn.a, ha.c), 5, 3, 6, $$4);
               this.a($$0, cpo.jE.n(), 4, 1, 4, $$4);
               this.a($$0, cpo.jE.n(), 4, 1, 5, $$4);
               this.a($$0, cpo.jE.n(), 4, 1, 6, $$4);
               this.a($$0, cpo.jE.n(), 6, 1, 4, $$4);
               this.a($$0, cpo.jE.n(), 6, 1, 5, $$4);
               this.a($$0, cpo.jE.n(), 6, 1, 6, $$4);
               this.a($$0, cpo.jE.n(), 5, 1, 4, $$4);
               this.a($$0, cpo.jE.n(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, cpo.eI.n(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, cpo.eI.n(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, cpo.eI.n(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, cpo.eI.n(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, cpo.eI.n(), 5, 1, 5, $$4);
               this.a($$0, cpo.eI.n(), 5, 2, 5, $$4);
               this.a($$0, cpo.eI.n(), 5, 3, 5, $$4);
               this.a($$0, cpo.G.n(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, cpo.m.n(), 1, 3, $$8, $$4);
                  this.a($$0, cpo.m.n(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, cpo.m.n(), $$9, 3, 1, $$4);
                  this.a($$0, cpo.m.n(), $$9, 3, 9, $$4);
               }

               this.a($$0, cpo.m.n(), 5, 1, 4, $$4);
               this.a($$0, cpo.m.n(), 5, 1, 6, $$4);
               this.a($$0, cpo.m.n(), 5, 3, 4, $$4);
               this.a($$0, cpo.m.n(), 5, 3, 6, $$4);
               this.a($$0, cpo.m.n(), 4, 1, 5, $$4);
               this.a($$0, cpo.m.n(), 6, 1, 5, $$4);
               this.a($$0, cpo.m.n(), 4, 3, 5, $$4);
               this.a($$0, cpo.m.n(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, cpo.m.n(), 4, $$10, 4, $$4);
                  this.a($$0, cpo.m.n(), 6, $$10, 4, $$4);
                  this.a($$0, cpo.m.n(), 4, $$10, 6, $$4);
                  this.a($$0, cpo.m.n(), 6, $$10, 6, $$4);
               }

               this.a($$0, cpo.cq.n(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, cpo.n.n(), 2, 3, $$11, $$4);
                  this.a($$0, cpo.n.n(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, cpo.n.n(), 4, 3, $$11, $$4);
                     this.a($$0, cpo.n.n(), 5, 3, $$11, $$4);
                     this.a($$0, cpo.n.n(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, cpo.n.n(), 7, 3, $$11, $$4);
                  this.a($$0, cpo.n.n(), 8, 3, $$11, $$4);
               }

               dcb $$12 = cpo.cO.n().a(ctq.a, ha.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, dzg.x);
         }
      }
   }

   static class k extends dse.a {
      @Override
      public void a(apf $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = cpo.eK.n();
            } else if ($$5 < 0.5F) {
               this.a = cpo.eJ.n();
            } else if ($$5 < 0.55F) {
               this.a = cpo.eQ.n();
            } else {
               this.a = cpo.eI.n();
            }
         } else {
            this.a = cpo.nc.n();
         }
      }
   }

   public static class l extends duk.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(dsr $$0, int $$1, int $$2, int $$3, ha $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = duk.p.a.a;
      }

      public l(int $$0, apf $$1, drs $$2, ha $$3) {
         super(dsr.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(dsr $$0, qr $$1) {
         super($$0, $$1);
         this.d = $$1.q("Source");
      }

      public l(qr $$0) {
         this(dsr.C, $$0);
      }

      @Override
      protected void a(dsq $$0, qr $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(dse $$0, dsf $$1, apf $$2) {
         if (this.d) {
            duk.i = duk.c.class;
         }

         this.a((duk.m)$$0, $$1, $$2, 1, 1);
      }

      public static duk.l a(dsf $$0, apf $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
         drs $$7 = drs.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new duk.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, gu $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, duk.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, duk.p.a.a, 1, 1, 4);
         this.a($$0, cpo.eI.n(), 2, 6, 1, $$4);
         this.a($$0, cpo.eI.n(), 1, 5, 1, $$4);
         this.a($$0, cpo.jE.n(), 1, 6, 1, $$4);
         this.a($$0, cpo.eI.n(), 1, 5, 2, $$4);
         this.a($$0, cpo.eI.n(), 1, 4, 3, $$4);
         this.a($$0, cpo.jE.n(), 1, 5, 3, $$4);
         this.a($$0, cpo.eI.n(), 2, 4, 3, $$4);
         this.a($$0, cpo.eI.n(), 3, 3, 3, $$4);
         this.a($$0, cpo.jE.n(), 3, 4, 3, $$4);
         this.a($$0, cpo.eI.n(), 3, 3, 2, $$4);
         this.a($$0, cpo.eI.n(), 3, 2, 1, $$4);
         this.a($$0, cpo.jE.n(), 3, 3, 1, $$4);
         this.a($$0, cpo.eI.n(), 2, 2, 1, $$4);
         this.a($$0, cpo.eI.n(), 1, 1, 1, $$4);
         this.a($$0, cpo.jE.n(), 1, 2, 1, $$4);
         this.a($$0, cpo.eI.n(), 1, 1, 2, $$4);
         this.a($$0, cpo.jE.n(), 1, 1, 3, $$4);
      }
   }

   public static class m extends duk.l {
      public duk.f a;
      @Nullable
      public duk.g b;
      public final List<dse> c = Lists.newArrayList();

      public m(apf $$0, int $$1, int $$2) {
         super(dsr.D, 0, $$1, $$2, a($$0));
      }

      public m(qr $$0) {
         super(dsr.D, $$0);
      }

      @Override
      public gu h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends duk.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, apf $$1, drs $$2, ha $$3) {
         super(dsr.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(qr $$0) {
         super(dsr.E, $$0);
         this.d = $$0.q("Left");
         this.i = $$0.q("Right");
      }

      @Override
      protected void a(dsq $$0, qr $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(dse $$0, dsf $$1, apf $$2) {
         this.a((duk.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((duk.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((duk.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static duk.n a(dsf $$0, apf $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
         drs $$7 = drs.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new duk.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, gu $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, duk.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, duk.p.a.a, 1, 1, 6);
         dcb $$7 = cpo.cq.n().a(cyn.a, ha.f);
         dcb $$8 = cpo.cq.n().a(cyn.a, ha.e);
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

   public static class o extends duk.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, apf $$1, drs $$2, ha $$3) {
         super(dsr.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(qr $$0) {
         super(dsr.F, $$0);
      }

      @Override
      public void a(dse $$0, dsf $$1, apf $$2) {
         this.a((duk.m)$$0, $$1, $$2, 1, 1);
      }

      public static duk.o a(dsf $$0, apf $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
         drs $$7 = drs.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new duk.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, gu $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, duk.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, duk.p.a.a, 1, 1, 7);
         dcb $$7 = cpo.cQ.n().a(cxh.a, ha.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, cpo.eI.n(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, cpo.eI.n(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, cpo.eI.n(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends dse {
      protected duk.p.a h = duk.p.a.a;

      protected p(dsr $$0, int $$1, drs $$2) {
         super($$0, $$1, $$2);
      }

      public p(dsr $$0, qr $$1) {
         super($$0, $$1);
         this.h = duk.p.a.valueOf($$1.l("EntryDoor"));
      }

      @Override
      protected void a(dsq $$0, qr $$1) {
         $$1.a("EntryDoor", this.h.name());
      }

      protected void a(cng $$0, apf $$1, drs $$2, duk.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, cpo.eI.n(), $$4, $$5, $$6, $$2);
               this.a($$0, cpo.eI.n(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, cpo.eI.n(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, cpo.eI.n(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, cpo.eI.n(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, cpo.eI.n(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, cpo.eI.n(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, cpo.cN.n(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, cpo.cN.n().a(crp.e, dcx.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, cpo.nc.n(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, cpo.nc.n(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, cpo.eX.n().a(ctl.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, cpo.eX.n().a(ctl.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, cpo.eX.n().a(ctl.b, Boolean.valueOf(true)).a(ctl.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, cpo.eX.n().a(ctl.b, Boolean.valueOf(true)).a(ctl.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, cpo.eX.n().a(ctl.b, Boolean.valueOf(true)).a(ctl.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, cpo.eX.n().a(ctl.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, cpo.eX.n().a(ctl.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, cpo.eI.n(), $$4, $$5, $$6, $$2);
               this.a($$0, cpo.eI.n(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, cpo.eI.n(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, cpo.eI.n(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, cpo.eI.n(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, cpo.eI.n(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, cpo.eI.n(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, cpo.dy.n(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, cpo.dy.n().a(crp.e, dcx.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, cpo.dM.n().a(cpw.aC, ha.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, cpo.dM.n().a(cpw.aC, ha.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected duk.p.a b(apf $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return duk.p.a.a;
            case 2:
               return duk.p.a.b;
            case 3:
               return duk.p.a.c;
            case 4:
               return duk.p.a.d;
         }
      }

      @Nullable
      protected dse a(duk.m $$0, dsf $$1, apf $$2, int $$3, int $$4) {
         ha $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return duk.b($$0, $$1, $$2, this.f.g() + $$3, this.f.h() + $$4, this.f.i() - 1, $$5, this.g());
               case d:
                  return duk.b($$0, $$1, $$2, this.f.g() + $$3, this.f.h() + $$4, this.f.l() + 1, $$5, this.g());
               case e:
                  return duk.b($$0, $$1, $$2, this.f.g() - 1, this.f.h() + $$4, this.f.i() + $$3, $$5, this.g());
               case f:
                  return duk.b($$0, $$1, $$2, this.f.j() + 1, this.f.h() + $$4, this.f.i() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected dse b(duk.m $$0, dsf $$1, apf $$2, int $$3, int $$4) {
         ha $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return duk.b($$0, $$1, $$2, this.f.g() - 1, this.f.h() + $$3, this.f.i() + $$4, ha.e, this.g());
               case d:
                  return duk.b($$0, $$1, $$2, this.f.g() - 1, this.f.h() + $$3, this.f.i() + $$4, ha.e, this.g());
               case e:
                  return duk.b($$0, $$1, $$2, this.f.g() + $$4, this.f.h() + $$3, this.f.i() - 1, ha.c, this.g());
               case f:
                  return duk.b($$0, $$1, $$2, this.f.g() + $$4, this.f.h() + $$3, this.f.i() - 1, ha.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected dse c(duk.m $$0, dsf $$1, apf $$2, int $$3, int $$4) {
         ha $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return duk.b($$0, $$1, $$2, this.f.j() + 1, this.f.h() + $$3, this.f.i() + $$4, ha.f, this.g());
               case d:
                  return duk.b($$0, $$1, $$2, this.f.j() + 1, this.f.h() + $$3, this.f.i() + $$4, ha.f, this.g());
               case e:
                  return duk.b($$0, $$1, $$2, this.f.g() + $$4, this.f.h() + $$3, this.f.l() + 1, ha.d, this.g());
               case f:
                  return duk.b($$0, $$1, $$2, this.f.g() + $$4, this.f.h() + $$3, this.f.l() + 1, ha.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(drs $$0) {
         return $$0 != null && $$0.h() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;
      }
   }

   public abstract static class q extends duk.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(dsr $$0, int $$1, drs $$2) {
         super($$0, $$1, $$2);
      }

      public q(dsr $$0, qr $$1) {
         super($$0, $$1);
      }
   }
}
