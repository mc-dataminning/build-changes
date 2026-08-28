import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class epa {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final epa.f[] g = new epa.f[]{
      new epa.f(epa.n.class, 40, 0),
      new epa.f(epa.h.class, 5, 5),
      new epa.f(epa.d.class, 20, 0),
      new epa.f(epa.i.class, 20, 0),
      new epa.f(epa.j.class, 10, 6),
      new epa.f(epa.o.class, 5, 5),
      new epa.f(epa.l.class, 5, 5),
      new epa.f(epa.c.class, 5, 4),
      new epa.f(epa.a.class, 5, 4),
      new epa.f(epa.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new epa.f(epa.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<epa.f> h;
   static Class<? extends epa.p> i;
   private static int j;
   static final epa.k k = new epa.k();

   public static void a() {
      h = Lists.newArrayList();

      for (epa.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (epa.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static epa.p a(Class<? extends epa.p> $$0, emn $$1, azu $$2, int $$3, int $$4, int $$5, @Nullable jm $$6, int $$7) {
      epa.p $$8 = null;
      if ($$0 == epa.n.class) {
         $$8 = epa.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == epa.h.class) {
         $$8 = epa.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == epa.d.class) {
         $$8 = epa.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == epa.i.class) {
         $$8 = epa.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == epa.j.class) {
         $$8 = epa.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == epa.o.class) {
         $$8 = epa.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == epa.l.class) {
         $$8 = epa.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == epa.c.class) {
         $$8 = epa.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == epa.a.class) {
         $$8 = epa.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == epa.e.class) {
         $$8 = epa.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == epa.g.class) {
         $$8 = epa.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static epa.p a(epa.m $$0, emn $$1, azu $$2, int $$3, int $$4, int $$5, jm $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            epa.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (epa.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  epa.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         ema $$13 = epa.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.i() > 1 ? new epa.b($$7, $$13, $$6) : null;
      }
   }

   static emm b(epa.m $$0, emn $$1, azu $$2, int $$3, int $$4, int $$5, @Nullable jm $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
         emm $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends epa.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, azu $$1, ema $$2, jm $$3) {
         super(emz.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(ul $$0) {
         super(emz.t, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(emy $$0, ul $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(emm $$0, emn $$1, azu $$2) {
         this.a((epa.m)$$0, $$1, $$2, 1, 1);
      }

      public static epa.a a(emn $$0, azu $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         ema $$7 = ema.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new epa.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dgk $$0, dgi $$1, dxr $$2, azu $$3, ema $$4, des $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, epa.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, epa.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, dis.eH.m(), dis.eH.m(), false);
         this.a($$0, dis.jK.m(), 3, 1, 1, $$4);
         this.a($$0, dis.jK.m(), 3, 1, 5, $$4);
         this.a($$0, dis.jK.m(), 3, 2, 2, $$4);
         this.a($$0, dis.jK.m(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, dis.jK.m(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, euj.x);
         }
      }
   }

   public static class b extends epa.p {
      private final int a;

      public b(int $$0, ema $$1, jm $$2) {
         super(emz.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != jm.c && $$2 != jm.d ? $$1.d() : $$1.f();
      }

      public b(ul $$0) {
         super(emz.u, $$0);
         this.a = $$0.h("Steps");
      }

      @Override
      protected void a(emy $$0, ul $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static ema a(emn $$0, azu $$1, int $$2, int $$3, int $$4, jm $$5) {
         int $$6 = 3;
         ema $$7 = ema.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         emm $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().i() == $$7.i()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = ema.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return ema.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(dgk $$0, dgi $$1, dxr $$2, azu $$3, ema $$4, des $$5, jh $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, dis.eH.m(), 0, 0, $$7, $$4);
            this.a($$0, dis.eH.m(), 1, 0, $$7, $$4);
            this.a($$0, dis.eH.m(), 2, 0, $$7, $$4);
            this.a($$0, dis.eH.m(), 3, 0, $$7, $$4);
            this.a($$0, dis.eH.m(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, dis.eH.m(), 0, $$8, $$7, $$4);
               this.a($$0, dis.nc.m(), 1, $$8, $$7, $$4);
               this.a($$0, dis.nc.m(), 2, $$8, $$7, $$4);
               this.a($$0, dis.nc.m(), 3, $$8, $$7, $$4);
               this.a($$0, dis.eH.m(), 4, $$8, $$7, $$4);
            }

            this.a($$0, dis.eH.m(), 0, 4, $$7, $$4);
            this.a($$0, dis.eH.m(), 1, 4, $$7, $$4);
            this.a($$0, dis.eH.m(), 2, 4, $$7, $$4);
            this.a($$0, dis.eH.m(), 3, 4, $$7, $$4);
            this.a($$0, dis.eH.m(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends epa.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, azu $$1, ema $$2, jm $$3) {
         super(emz.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(ul $$0) {
         super(emz.v, $$0);
         this.d = $$0.q("leftLow");
         this.i = $$0.q("leftHigh");
         this.j = $$0.q("rightLow");
         this.k = $$0.q("rightHigh");
      }

      @Override
      protected void a(emy $$0, ul $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(emm $$0, emn $$1, azu $$2) {
         int $$3 = 3;
         int $$4 = 5;
         jm $$5 = this.i();
         if ($$5 == jm.e || $$5 == jm.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((epa.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((epa.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((epa.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((epa.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((epa.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static epa.c a(emn $$0, azu $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         ema $$7 = ema.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new epa.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dgk $$0, dgi $$1, dxr $$2, azu $$3, ema $$4, des $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, epa.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, epa.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, epa.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, epa.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, epa.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, epa.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, dis.jE.m(), dis.jE.m(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, dis.jE.m(), dis.jE.m(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, epa.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, dis.jE.m(), dis.jE.m(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, dis.jE.m(), dis.jE.m(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, dis.jE.m(), dis.jE.m(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, dis.jE.m(), dis.jE.m(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, dis.jE.m().b(dpt.b, dxc.c), dis.jE.m().b(dpt.b, dxc.c), false);
         this.a($$0, dis.cq.m().b(drs.g, jm.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends epa.q {
      public d(int $$0, azu $$1, ema $$2, jm $$3) {
         super(emz.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(ul $$0) {
         super(emz.w, $$0);
      }

      @Override
      public void a(emm $$0, emn $$1, azu $$2) {
         jm $$3 = this.i();
         if ($$3 != jm.c && $$3 != jm.f) {
            this.c((epa.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((epa.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static epa.d a(emn $$0, azu $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         ema $$7 = ema.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new epa.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dgk $$0, dgi $$1, dxr $$2, azu $$3, ema $$4, des $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, epa.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         jm $$7 = this.i();
         if ($$7 != jm.c && $$7 != jm.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends epa.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, azu $$1, ema $$2, jm $$3) {
         super(emz.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.e() > 6;
      }

      public e(ul $$0) {
         super(emz.x, $$0);
         this.i = $$0.q("Tall");
      }

      @Override
      protected void a(emy $$0, ul $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static epa.e a(emn $$0, azu $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         ema $$7 = ema.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = ema.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new epa.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(dgk $$0, dgi $$1, dxr $$2, azu $$3, ema $$4, des $$5, jh $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, epa.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, dis.bs.m(), dis.bs.m(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dis.n.m(), dis.n.m(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dis.n.m(), dis.n.m(), false);
               this.a($$0, dis.cq.m().b(drs.g, jm.f), 2, 3, $$10, $$4);
               this.a($$0, dis.cq.m().b(drs.g, jm.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dis.n.m(), dis.n.m(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dis.n.m(), dis.n.m(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dis.cl.m(), dis.cl.m(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dis.cl.m(), dis.cl.m(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dis.cl.m(), dis.cl.m(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dis.cl.m(), dis.cl.m(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, dis.cl.m(), dis.cl.m(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, dis.cl.m(), dis.cl.m(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, dis.cl.m(), dis.cl.m(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, dis.n.m(), dis.n.m(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, dis.n.m(), dis.n.m(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, dis.n.m(), dis.n.m(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, dis.n.m(), dis.n.m(), false);
            this.a($$0, dis.n.m(), 9, 5, 11, $$4);
            this.a($$0, dis.n.m(), 8, 5, 11, $$4);
            this.a($$0, dis.n.m(), 9, 5, 10, $$4);
            dvv $$12 = dis.dU.m().b(dln.d, Boolean.valueOf(true)).b(dln.b, Boolean.valueOf(true));
            dvv $$13 = dis.dU.m().b(dln.a, Boolean.valueOf(true)).b(dln.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, dis.dU.m().b(dln.a, Boolean.valueOf(true)).b(dln.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, dis.dU.m().b(dln.c, Boolean.valueOf(true)).b(dln.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, dis.dU.m().b(dln.a, Boolean.valueOf(true)).b(dln.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, dis.dU.m().b(dln.c, Boolean.valueOf(true)).b(dln.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, dis.dU.m().b(dln.a, Boolean.valueOf(true)).b(dln.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            dvv $$15 = dis.cO.m().b(dmv.b, jm.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            dvv $$18 = dis.dU.m().b(dln.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            dvv $$19 = dis.dU.m().b(dln.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            dvv $$20 = $$13.b(dln.d, Boolean.valueOf(true)).b(dln.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.b(dln.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.b(dln.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.b(dln.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.b(dln.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            dvv $$21 = dis.cp.m();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, euj.v);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, euj.v);
         }
      }
   }

   static class f {
      public final Class<? extends epa.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends epa.p> $$0, int $$1, int $$2) {
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

   public static class g extends epa.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, ema $$1, jm $$2) {
         super(emz.y, $$0, $$1);
         this.a($$2);
      }

      public g(ul $$0) {
         super(emz.y, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(emy $$0, ul $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(emm $$0, emn $$1, azu $$2) {
         if ($$0 != null) {
            ((epa.m)$$0).b = this;
         }
      }

      public static epa.g a(emn $$0, int $$1, int $$2, int $$3, jm $$4, int $$5) {
         ema $$6 = ema.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new epa.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dgk $$0, dgi $$1, dxr $$2, azu $$3, ema $$4, des $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, epa.k);
         this.a($$0, $$3, $$4, epa.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, epa.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, epa.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, epa.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, epa.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, epa.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, epa.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, dis.H.m(), dis.H.m(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, dis.H.m(), dis.H.m(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, epa.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, dis.H.m(), dis.H.m(), false);
         dvv $$8 = dis.eW.m().b(dmq.a, Boolean.valueOf(true)).b(dmq.c, Boolean.valueOf(true));
         dvv $$9 = dis.eW.m().b(dmq.d, Boolean.valueOf(true)).b(dmq.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         dvv $$12 = dis.fj.m().b(dqk.b, jm.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, epa.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, epa.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, epa.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         dvv $$14 = dis.fy.m().b(dlf.b, jm.c);
         dvv $$15 = dis.fy.m().b(dlf.b, jm.d);
         dvv $$16 = dis.fy.m().b(dlf.b, jm.f);
         dvv $$17 = dis.fy.m().b(dlf.b, jm.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.b(dlf.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.b(dlf.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.b(dlf.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.b(dlf.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.b(dlf.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.b(dlf.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.b(dlf.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.b(dlf.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.b(dlf.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.b(dlf.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.b(dlf.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.b(dlf.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            dvv $$21 = dis.fx.m();
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
            jh $$22 = this.b(5, 3, 6);
            if ($$4.b($$22)) {
               this.d = true;
               $$0.a($$22, dis.ct.m(), 2);
               if ($$0.c_($$22) instanceof duo $$24) {
                  $$24.a(bus.ba, $$3);
               }
            }
         }
      }
   }

   public static class h extends epa.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, azu $$1, ema $$2, jm $$3) {
         super(emz.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(ul $$0) {
         super(emz.z, $$0);
      }

      @Override
      public void a(emm $$0, emn $$1, azu $$2) {
         this.a((epa.m)$$0, $$1, $$2, 1, 1);
      }

      public static epa.h a(emn $$0, azu $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         ema $$7 = ema.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new epa.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dgk $$0, dgi $$1, dxr $$2, azu $$3, ema $$4, des $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, epa.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, epa.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, epa.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, epa.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, epa.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, dis.eW.m().b(dmq.a, Boolean.valueOf(true)).b(dmq.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, dis.eW.m().b(dmq.a, Boolean.valueOf(true)).b(dmq.c, Boolean.valueOf(true)).b(dmq.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, dis.eW.m().b(dmq.a, Boolean.valueOf(true)).b(dmq.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, dis.eW.m().b(dmq.d, Boolean.valueOf(true)).b(dmq.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, dis.eW.m().b(dmq.d, Boolean.valueOf(true)).b(dmq.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, dis.eW.m().b(dmq.d, Boolean.valueOf(true)).b(dmq.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, dis.eW.m().b(dmq.a, Boolean.valueOf(true)).b(dmq.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, dis.eW.m().b(dmq.a, Boolean.valueOf(true)).b(dmq.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         dvv $$8 = dis.dy.m().b(dkw.b, jm.e);
         dvv $$9 = dis.dy.m().b(dkw.b, jm.e).b(dkw.f, dwq.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends epa.q {
      public i(int $$0, azu $$1, ema $$2, jm $$3) {
         super(emz.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(ul $$0) {
         super(emz.A, $$0);
      }

      @Override
      public void a(emm $$0, emn $$1, azu $$2) {
         jm $$3 = this.i();
         if ($$3 != jm.c && $$3 != jm.f) {
            this.b((epa.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((epa.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static epa.i a(emn $$0, azu $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         ema $$7 = ema.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new epa.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dgk $$0, dgi $$1, dxr $$2, azu $$3, ema $$4, des $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, epa.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         jm $$7 = this.i();
         if ($$7 != jm.c && $$7 != jm.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends epa.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, azu $$1, ema $$2, jm $$3) {
         super(emz.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(ul $$0) {
         super(emz.B, $$0);
         this.d = $$0.h("Type");
      }

      @Override
      protected void a(emy $$0, ul $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(emm $$0, emn $$1, azu $$2) {
         this.a((epa.m)$$0, $$1, $$2, 4, 1);
         this.b((epa.m)$$0, $$1, $$2, 1, 4);
         this.c((epa.m)$$0, $$1, $$2, 1, 4);
      }

      public static epa.j a(emn $$0, azu $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         ema $$7 = ema.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new epa.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dgk $$0, dgi $$1, dxr $$2, azu $$3, ema $$4, des $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, epa.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, dis.eH.m(), 5, 1, 5, $$4);
               this.a($$0, dis.eH.m(), 5, 2, 5, $$4);
               this.a($$0, dis.eH.m(), 5, 3, 5, $$4);
               this.a($$0, dis.cq.m().b(drs.g, jm.e), 4, 3, 5, $$4);
               this.a($$0, dis.cq.m().b(drs.g, jm.f), 6, 3, 5, $$4);
               this.a($$0, dis.cq.m().b(drs.g, jm.d), 5, 3, 4, $$4);
               this.a($$0, dis.cq.m().b(drs.g, jm.c), 5, 3, 6, $$4);
               this.a($$0, dis.jE.m(), 4, 1, 4, $$4);
               this.a($$0, dis.jE.m(), 4, 1, 5, $$4);
               this.a($$0, dis.jE.m(), 4, 1, 6, $$4);
               this.a($$0, dis.jE.m(), 6, 1, 4, $$4);
               this.a($$0, dis.jE.m(), 6, 1, 5, $$4);
               this.a($$0, dis.jE.m(), 6, 1, 6, $$4);
               this.a($$0, dis.jE.m(), 5, 1, 4, $$4);
               this.a($$0, dis.jE.m(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, dis.eH.m(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, dis.eH.m(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, dis.eH.m(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, dis.eH.m(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, dis.eH.m(), 5, 1, 5, $$4);
               this.a($$0, dis.eH.m(), 5, 2, 5, $$4);
               this.a($$0, dis.eH.m(), 5, 3, 5, $$4);
               this.a($$0, dis.G.m(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, dis.m.m(), 1, 3, $$8, $$4);
                  this.a($$0, dis.m.m(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, dis.m.m(), $$9, 3, 1, $$4);
                  this.a($$0, dis.m.m(), $$9, 3, 9, $$4);
               }

               this.a($$0, dis.m.m(), 5, 1, 4, $$4);
               this.a($$0, dis.m.m(), 5, 1, 6, $$4);
               this.a($$0, dis.m.m(), 5, 3, 4, $$4);
               this.a($$0, dis.m.m(), 5, 3, 6, $$4);
               this.a($$0, dis.m.m(), 4, 1, 5, $$4);
               this.a($$0, dis.m.m(), 6, 1, 5, $$4);
               this.a($$0, dis.m.m(), 4, 3, 5, $$4);
               this.a($$0, dis.m.m(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, dis.m.m(), 4, $$10, 4, $$4);
                  this.a($$0, dis.m.m(), 6, $$10, 4, $$4);
                  this.a($$0, dis.m.m(), 4, $$10, 6, $$4);
                  this.a($$0, dis.m.m(), 6, $$10, 6, $$4);
               }

               this.a($$0, dis.cq.m(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, dis.n.m(), 2, 3, $$11, $$4);
                  this.a($$0, dis.n.m(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, dis.n.m(), 4, 3, $$11, $$4);
                     this.a($$0, dis.n.m(), 5, 3, $$11, $$4);
                     this.a($$0, dis.n.m(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, dis.n.m(), 7, 3, $$11, $$4);
                  this.a($$0, dis.n.m(), 8, 3, $$11, $$4);
               }

               dvv $$12 = dis.cO.m().b(dmv.b, jm.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, euj.w);
         }
      }
   }

   static class k extends emm.a {
      @Override
      public void a(azu $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = dis.eJ.m();
            } else if ($$5 < 0.5F) {
               this.a = dis.eI.m();
            } else if ($$5 < 0.55F) {
               this.a = dis.eP.m();
            } else {
               this.a = dis.eH.m();
            }
         } else {
            this.a = dis.nc.m();
         }
      }
   }

   public static class l extends epa.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(emz $$0, int $$1, int $$2, int $$3, jm $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = epa.p.a.a;
      }

      public l(int $$0, azu $$1, ema $$2, jm $$3) {
         super(emz.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(emz $$0, ul $$1) {
         super($$0, $$1);
         this.d = $$1.q("Source");
      }

      public l(ul $$0) {
         this(emz.C, $$0);
      }

      @Override
      protected void a(emy $$0, ul $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(emm $$0, emn $$1, azu $$2) {
         if (this.d) {
            epa.i = epa.c.class;
         }

         this.a((epa.m)$$0, $$1, $$2, 1, 1);
      }

      public static epa.l a(emn $$0, azu $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         ema $$7 = ema.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new epa.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dgk $$0, dgi $$1, dxr $$2, azu $$3, ema $$4, des $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, epa.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, epa.p.a.a, 1, 1, 4);
         this.a($$0, dis.eH.m(), 2, 6, 1, $$4);
         this.a($$0, dis.eH.m(), 1, 5, 1, $$4);
         this.a($$0, dis.jE.m(), 1, 6, 1, $$4);
         this.a($$0, dis.eH.m(), 1, 5, 2, $$4);
         this.a($$0, dis.eH.m(), 1, 4, 3, $$4);
         this.a($$0, dis.jE.m(), 1, 5, 3, $$4);
         this.a($$0, dis.eH.m(), 2, 4, 3, $$4);
         this.a($$0, dis.eH.m(), 3, 3, 3, $$4);
         this.a($$0, dis.jE.m(), 3, 4, 3, $$4);
         this.a($$0, dis.eH.m(), 3, 3, 2, $$4);
         this.a($$0, dis.eH.m(), 3, 2, 1, $$4);
         this.a($$0, dis.jE.m(), 3, 3, 1, $$4);
         this.a($$0, dis.eH.m(), 2, 2, 1, $$4);
         this.a($$0, dis.eH.m(), 1, 1, 1, $$4);
         this.a($$0, dis.jE.m(), 1, 2, 1, $$4);
         this.a($$0, dis.eH.m(), 1, 1, 2, $$4);
         this.a($$0, dis.jE.m(), 1, 1, 3, $$4);
      }
   }

   public static class m extends epa.l {
      public epa.f a;
      @Nullable
      public epa.g b;
      public final List<emm> c = Lists.newArrayList();

      public m(azu $$0, int $$1, int $$2) {
         super(emz.D, 0, $$1, $$2, a($$0));
      }

      public m(ul $$0) {
         super(emz.D, $$0);
      }

      @Override
      public jh h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends epa.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, azu $$1, ema $$2, jm $$3) {
         super(emz.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(ul $$0) {
         super(emz.E, $$0);
         this.d = $$0.q("Left");
         this.i = $$0.q("Right");
      }

      @Override
      protected void a(emy $$0, ul $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(emm $$0, emn $$1, azu $$2) {
         this.a((epa.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((epa.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((epa.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static epa.n a(emn $$0, azu $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         ema $$7 = ema.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new epa.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dgk $$0, dgi $$1, dxr $$2, azu $$3, ema $$4, des $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, epa.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, epa.p.a.a, 1, 1, 6);
         dvv $$7 = dis.cq.m().b(drs.g, jm.f);
         dvv $$8 = dis.cq.m().b(drs.g, jm.e);
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

   public static class o extends epa.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, azu $$1, ema $$2, jm $$3) {
         super(emz.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(ul $$0) {
         super(emz.F, $$0);
      }

      @Override
      public void a(emm $$0, emn $$1, azu $$2) {
         this.a((epa.m)$$0, $$1, $$2, 1, 1);
      }

      public static epa.o a(emn $$0, azu $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         ema $$7 = ema.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new epa.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dgk $$0, dgi $$1, dxr $$2, azu $$3, ema $$4, des $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, epa.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, epa.p.a.a, 1, 1, 7);
         dvv $$7 = dis.cQ.m().b(dqk.b, jm.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, dis.eH.m(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dis.eH.m(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dis.eH.m(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends emm {
      protected epa.p.a h = epa.p.a.a;

      protected p(emz $$0, int $$1, ema $$2) {
         super($$0, $$1, $$2);
      }

      public p(emz $$0, ul $$1) {
         super($$0, $$1);
         this.h = epa.p.a.valueOf($$1.l("EntryDoor"));
      }

      @Override
      protected void a(emy $$0, ul $$1) {
         $$1.a("EntryDoor", this.h.name());
      }

      protected void a(dgk $$0, azu $$1, ema $$2, epa.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, dis.eH.m(), $$4, $$5, $$6, $$2);
               this.a($$0, dis.eH.m(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dis.eH.m(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dis.eH.m(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dis.eH.m(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dis.eH.m(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dis.eH.m(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dis.cN.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dis.cN.m().b(dkw.f, dwq.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, dis.nc.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dis.nc.m(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dis.eW.m().b(dmq.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, dis.eW.m().b(dmq.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dis.eW.m().b(dmq.b, Boolean.valueOf(true)).b(dmq.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dis.eW.m().b(dmq.b, Boolean.valueOf(true)).b(dmq.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dis.eW.m().b(dmq.b, Boolean.valueOf(true)).b(dmq.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dis.eW.m().b(dmq.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dis.eW.m().b(dmq.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, dis.eH.m(), $$4, $$5, $$6, $$2);
               this.a($$0, dis.eH.m(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dis.eH.m(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dis.eH.m(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dis.eH.m(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dis.eH.m(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dis.eH.m(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dis.dy.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dis.dy.m().b(dkw.f, dwq.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dis.dM.m().b(dja.aF, jm.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, dis.dM.m().b(dja.aF, jm.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected epa.p.a b(azu $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return epa.p.a.a;
            case 2:
               return epa.p.a.b;
            case 3:
               return epa.p.a.c;
            case 4:
               return epa.p.a.d;
         }
      }

      @Nullable
      protected emm a(epa.m $$0, emn $$1, azu $$2, int $$3, int $$4) {
         jm $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return epa.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$5, this.g());
               case d:
                  return epa.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$5, this.g());
               case e:
                  return epa.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
               case f:
                  return epa.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected emm b(epa.m $$0, emn $$1, azu $$2, int $$3, int $$4) {
         jm $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return epa.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jm.e, this.g());
               case d:
                  return epa.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jm.e, this.g());
               case e:
                  return epa.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jm.c, this.g());
               case f:
                  return epa.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jm.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected emm c(epa.m $$0, emn $$1, azu $$2, int $$3, int $$4) {
         jm $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return epa.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jm.f, this.g());
               case d:
                  return epa.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jm.f, this.g());
               case e:
                  return epa.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jm.d, this.g());
               case f:
                  return epa.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jm.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(ema $$0) {
         return $$0 != null && $$0.i() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;
      }
   }

   public abstract static class q extends epa.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(emz $$0, int $$1, ema $$2) {
         super($$0, $$1, $$2);
      }

      public q(emz $$0, ul $$1) {
         super($$0, $$1);
      }
   }
}
