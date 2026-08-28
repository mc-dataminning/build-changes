import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class eqv {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final eqv.f[] g = new eqv.f[]{
      new eqv.f(eqv.n.class, 40, 0),
      new eqv.f(eqv.h.class, 5, 5),
      new eqv.f(eqv.d.class, 20, 0),
      new eqv.f(eqv.i.class, 20, 0),
      new eqv.f(eqv.j.class, 10, 6),
      new eqv.f(eqv.o.class, 5, 5),
      new eqv.f(eqv.l.class, 5, 5),
      new eqv.f(eqv.c.class, 5, 4),
      new eqv.f(eqv.a.class, 5, 4),
      new eqv.f(eqv.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new eqv.f(eqv.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<eqv.f> h;
   static Class<? extends eqv.p> i;
   private static int j;
   static final eqv.k k = new eqv.k();

   public static void a() {
      h = Lists.newArrayList();

      for (eqv.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (eqv.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static eqv.p a(Class<? extends eqv.p> $$0, eoi $$1, bac $$2, int $$3, int $$4, int $$5, @Nullable jm $$6, int $$7) {
      eqv.p $$8 = null;
      if ($$0 == eqv.n.class) {
         $$8 = eqv.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eqv.h.class) {
         $$8 = eqv.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eqv.d.class) {
         $$8 = eqv.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eqv.i.class) {
         $$8 = eqv.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eqv.j.class) {
         $$8 = eqv.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eqv.o.class) {
         $$8 = eqv.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eqv.l.class) {
         $$8 = eqv.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eqv.c.class) {
         $$8 = eqv.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eqv.a.class) {
         $$8 = eqv.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eqv.e.class) {
         $$8 = eqv.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eqv.g.class) {
         $$8 = eqv.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static eqv.p a(eqv.m $$0, eoi $$1, bac $$2, int $$3, int $$4, int $$5, jm $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            eqv.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (eqv.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  eqv.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         env $$13 = eqv.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.i() > 1 ? new eqv.b($$7, $$13, $$6) : null;
      }
   }

   static eoh b(eqv.m $$0, eoi $$1, bac $$2, int $$3, int $$4, int $$5, @Nullable jm $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
         eoh $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends eqv.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, bac $$1, env $$2, jm $$3) {
         super(eou.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(um $$0) {
         super(eou.t, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(eot $$0, um $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(eoh $$0, eoi $$1, bac $$2) {
         this.a((eqv.m)$$0, $$1, $$2, 1, 1);
      }

      public static eqv.a a(eoi $$0, bac $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         env $$7 = env.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new eqv.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dhx $$0, dhv $$1, dzk $$2, bac $$3, env $$4, dgf $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, eqv.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, eqv.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, dkf.eV.m(), dkf.eV.m(), false);
         this.a($$0, dkf.kj.m(), 3, 1, 1, $$4);
         this.a($$0, dkf.kj.m(), 3, 1, 5, $$4);
         this.a($$0, dkf.kj.m(), 3, 2, 2, $$4);
         this.a($$0, dkf.kj.m(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, dkf.kj.m(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, ewe.x);
         }
      }
   }

   public static class b extends eqv.p {
      private final int a;

      public b(int $$0, env $$1, jm $$2) {
         super(eou.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != jm.c && $$2 != jm.d ? $$1.d() : $$1.f();
      }

      public b(um $$0) {
         super(eou.u, $$0);
         this.a = $$0.h("Steps");
      }

      @Override
      protected void a(eot $$0, um $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static env a(eoi $$0, bac $$1, int $$2, int $$3, int $$4, jm $$5) {
         int $$6 = 3;
         env $$7 = env.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         eoh $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().i() == $$7.i()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = env.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return env.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(dhx $$0, dhv $$1, dzk $$2, bac $$3, env $$4, dgf $$5, jh $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, dkf.eV.m(), 0, 0, $$7, $$4);
            this.a($$0, dkf.eV.m(), 1, 0, $$7, $$4);
            this.a($$0, dkf.eV.m(), 2, 0, $$7, $$4);
            this.a($$0, dkf.eV.m(), 3, 0, $$7, $$4);
            this.a($$0, dkf.eV.m(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, dkf.eV.m(), 0, $$8, $$7, $$4);
               this.a($$0, dkf.nE.m(), 1, $$8, $$7, $$4);
               this.a($$0, dkf.nE.m(), 2, $$8, $$7, $$4);
               this.a($$0, dkf.nE.m(), 3, $$8, $$7, $$4);
               this.a($$0, dkf.eV.m(), 4, $$8, $$7, $$4);
            }

            this.a($$0, dkf.eV.m(), 0, 4, $$7, $$4);
            this.a($$0, dkf.eV.m(), 1, 4, $$7, $$4);
            this.a($$0, dkf.eV.m(), 2, 4, $$7, $$4);
            this.a($$0, dkf.eV.m(), 3, 4, $$7, $$4);
            this.a($$0, dkf.eV.m(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends eqv.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, bac $$1, env $$2, jm $$3) {
         super(eou.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(um $$0) {
         super(eou.v, $$0);
         this.d = $$0.q("leftLow");
         this.i = $$0.q("leftHigh");
         this.j = $$0.q("rightLow");
         this.k = $$0.q("rightHigh");
      }

      @Override
      protected void a(eot $$0, um $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(eoh $$0, eoi $$1, bac $$2) {
         int $$3 = 3;
         int $$4 = 5;
         jm $$5 = this.i();
         if ($$5 == jm.e || $$5 == jm.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((eqv.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((eqv.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((eqv.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((eqv.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((eqv.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static eqv.c a(eoi $$0, bac $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         env $$7 = env.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eqv.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dhx $$0, dhv $$1, dzk $$2, bac $$3, env $$4, dgf $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, eqv.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, eqv.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, eqv.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, eqv.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, eqv.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, eqv.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, dkf.kd.m(), dkf.kd.m(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, dkf.kd.m(), dkf.kd.m(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, eqv.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, dkf.kd.m(), dkf.kd.m(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, dkf.kd.m(), dkf.kd.m(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, dkf.kd.m(), dkf.kd.m(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, dkf.kd.m(), dkf.kd.m(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, dkf.kd.m().b(drl.b, dyv.c), dkf.kd.m().b(drl.b, dyv.c), false);
         this.a($$0, dkf.cx.m().b(dtk.g, jm.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends eqv.q {
      public d(int $$0, bac $$1, env $$2, jm $$3) {
         super(eou.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(um $$0) {
         super(eou.w, $$0);
      }

      @Override
      public void a(eoh $$0, eoi $$1, bac $$2) {
         jm $$3 = this.i();
         if ($$3 != jm.c && $$3 != jm.f) {
            this.c((eqv.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((eqv.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static eqv.d a(eoi $$0, bac $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         env $$7 = env.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eqv.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dhx $$0, dhv $$1, dzk $$2, bac $$3, env $$4, dgf $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, eqv.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         jm $$7 = this.i();
         if ($$7 != jm.c && $$7 != jm.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends eqv.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, bac $$1, env $$2, jm $$3) {
         super(eou.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.e() > 6;
      }

      public e(um $$0) {
         super(eou.x, $$0);
         this.i = $$0.q("Tall");
      }

      @Override
      protected void a(eot $$0, um $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static eqv.e a(eoi $$0, bac $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         env $$7 = env.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = env.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new eqv.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(dhx $$0, dhv $$1, dzk $$2, bac $$3, env $$4, dgf $$5, jh $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, eqv.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, dkf.bz.m(), dkf.bz.m(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dkf.n.m(), dkf.n.m(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dkf.n.m(), dkf.n.m(), false);
               this.a($$0, dkf.cx.m().b(dtk.g, jm.f), 2, 3, $$10, $$4);
               this.a($$0, dkf.cx.m().b(dtk.g, jm.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dkf.n.m(), dkf.n.m(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dkf.n.m(), dkf.n.m(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dkf.cs.m(), dkf.cs.m(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dkf.cs.m(), dkf.cs.m(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dkf.cs.m(), dkf.cs.m(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dkf.cs.m(), dkf.cs.m(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, dkf.cs.m(), dkf.cs.m(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, dkf.cs.m(), dkf.cs.m(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, dkf.cs.m(), dkf.cs.m(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, dkf.n.m(), dkf.n.m(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, dkf.n.m(), dkf.n.m(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, dkf.n.m(), dkf.n.m(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, dkf.n.m(), dkf.n.m(), false);
            this.a($$0, dkf.n.m(), 9, 5, 11, $$4);
            this.a($$0, dkf.n.m(), 8, 5, 11, $$4);
            this.a($$0, dkf.n.m(), 9, 5, 10, $$4);
            dxo $$12 = dkf.eh.m().b(dnc.d, Boolean.valueOf(true)).b(dnc.b, Boolean.valueOf(true));
            dxo $$13 = dkf.eh.m().b(dnc.a, Boolean.valueOf(true)).b(dnc.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, dkf.eh.m().b(dnc.a, Boolean.valueOf(true)).b(dnc.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, dkf.eh.m().b(dnc.c, Boolean.valueOf(true)).b(dnc.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, dkf.eh.m().b(dnc.a, Boolean.valueOf(true)).b(dnc.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, dkf.eh.m().b(dnc.c, Boolean.valueOf(true)).b(dnc.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, dkf.eh.m().b(dnc.a, Boolean.valueOf(true)).b(dnc.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            dxo $$15 = dkf.cX.m().b(dol.b, jm.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            dxo $$18 = dkf.eh.m().b(dnc.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            dxo $$19 = dkf.eh.m().b(dnc.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            dxo $$20 = $$13.b(dnc.d, Boolean.valueOf(true)).b(dnc.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.b(dnc.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.b(dnc.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.b(dnc.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.b(dnc.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            dxo $$21 = dkf.cw.m();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, ewe.v);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, ewe.v);
         }
      }
   }

   static class f {
      public final Class<? extends eqv.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends eqv.p> $$0, int $$1, int $$2) {
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

   public static class g extends eqv.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, env $$1, jm $$2) {
         super(eou.y, $$0, $$1);
         this.a($$2);
      }

      public g(um $$0) {
         super(eou.y, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(eot $$0, um $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(eoh $$0, eoi $$1, bac $$2) {
         if ($$0 != null) {
            ((eqv.m)$$0).b = this;
         }
      }

      public static eqv.g a(eoi $$0, int $$1, int $$2, int $$3, jm $$4, int $$5) {
         env $$6 = env.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new eqv.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dhx $$0, dhv $$1, dzk $$2, bac $$3, env $$4, dgf $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, eqv.k);
         this.a($$0, $$3, $$4, eqv.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, eqv.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, eqv.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, eqv.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, eqv.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, eqv.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, eqv.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, dkf.K.m(), dkf.K.m(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, dkf.K.m(), dkf.K.m(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, eqv.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, dkf.K.m(), dkf.K.m(), false);
         dxo $$8 = dkf.fk.m().b(dog.a, Boolean.valueOf(true)).b(dog.c, Boolean.valueOf(true));
         dxo $$9 = dkf.fk.m().b(dog.d, Boolean.valueOf(true)).b(dog.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         dxo $$12 = dkf.fy.m().b(dsc.b, jm.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, eqv.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, eqv.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, eqv.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         dxo $$14 = dkf.fT.m().b(dmt.b, jm.c);
         dxo $$15 = dkf.fT.m().b(dmt.b, jm.d);
         dxo $$16 = dkf.fT.m().b(dmt.b, jm.f);
         dxo $$17 = dkf.fT.m().b(dmt.b, jm.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.b(dmt.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.b(dmt.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.b(dmt.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.b(dmt.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.b(dmt.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.b(dmt.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.b(dmt.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.b(dmt.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.b(dmt.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.b(dmt.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.b(dmt.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.b(dmt.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            dxo $$21 = dkf.fS.m();
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
               $$0.a($$22, dkf.cA.m(), 2);
               if ($$0.c_($$22) instanceof dwh $$24) {
                  $$24.a(bvi.be, $$3);
               }
            }
         }
      }
   }

   public static class h extends eqv.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, bac $$1, env $$2, jm $$3) {
         super(eou.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(um $$0) {
         super(eou.z, $$0);
      }

      @Override
      public void a(eoh $$0, eoi $$1, bac $$2) {
         this.a((eqv.m)$$0, $$1, $$2, 1, 1);
      }

      public static eqv.h a(eoi $$0, bac $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         env $$7 = env.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eqv.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dhx $$0, dhv $$1, dzk $$2, bac $$3, env $$4, dgf $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, eqv.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, eqv.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, eqv.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, eqv.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, eqv.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, dkf.fk.m().b(dog.a, Boolean.valueOf(true)).b(dog.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, dkf.fk.m().b(dog.a, Boolean.valueOf(true)).b(dog.c, Boolean.valueOf(true)).b(dog.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, dkf.fk.m().b(dog.a, Boolean.valueOf(true)).b(dog.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, dkf.fk.m().b(dog.d, Boolean.valueOf(true)).b(dog.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, dkf.fk.m().b(dog.d, Boolean.valueOf(true)).b(dog.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, dkf.fk.m().b(dog.d, Boolean.valueOf(true)).b(dog.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, dkf.fk.m().b(dog.a, Boolean.valueOf(true)).b(dog.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, dkf.fk.m().b(dog.a, Boolean.valueOf(true)).b(dog.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         dxo $$8 = dkf.dK.m().b(dmk.b, jm.e);
         dxo $$9 = dkf.dK.m().b(dmk.b, jm.e).b(dmk.f, dyj.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends eqv.q {
      public i(int $$0, bac $$1, env $$2, jm $$3) {
         super(eou.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(um $$0) {
         super(eou.A, $$0);
      }

      @Override
      public void a(eoh $$0, eoi $$1, bac $$2) {
         jm $$3 = this.i();
         if ($$3 != jm.c && $$3 != jm.f) {
            this.b((eqv.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((eqv.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static eqv.i a(eoi $$0, bac $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         env $$7 = env.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eqv.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dhx $$0, dhv $$1, dzk $$2, bac $$3, env $$4, dgf $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, eqv.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         jm $$7 = this.i();
         if ($$7 != jm.c && $$7 != jm.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends eqv.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, bac $$1, env $$2, jm $$3) {
         super(eou.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(um $$0) {
         super(eou.B, $$0);
         this.d = $$0.h("Type");
      }

      @Override
      protected void a(eot $$0, um $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(eoh $$0, eoi $$1, bac $$2) {
         this.a((eqv.m)$$0, $$1, $$2, 4, 1);
         this.b((eqv.m)$$0, $$1, $$2, 1, 4);
         this.c((eqv.m)$$0, $$1, $$2, 1, 4);
      }

      public static eqv.j a(eoi $$0, bac $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         env $$7 = env.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eqv.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dhx $$0, dhv $$1, dzk $$2, bac $$3, env $$4, dgf $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, eqv.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, dkf.eV.m(), 5, 1, 5, $$4);
               this.a($$0, dkf.eV.m(), 5, 2, 5, $$4);
               this.a($$0, dkf.eV.m(), 5, 3, 5, $$4);
               this.a($$0, dkf.cx.m().b(dtk.g, jm.e), 4, 3, 5, $$4);
               this.a($$0, dkf.cx.m().b(dtk.g, jm.f), 6, 3, 5, $$4);
               this.a($$0, dkf.cx.m().b(dtk.g, jm.d), 5, 3, 4, $$4);
               this.a($$0, dkf.cx.m().b(dtk.g, jm.c), 5, 3, 6, $$4);
               this.a($$0, dkf.kd.m(), 4, 1, 4, $$4);
               this.a($$0, dkf.kd.m(), 4, 1, 5, $$4);
               this.a($$0, dkf.kd.m(), 4, 1, 6, $$4);
               this.a($$0, dkf.kd.m(), 6, 1, 4, $$4);
               this.a($$0, dkf.kd.m(), 6, 1, 5, $$4);
               this.a($$0, dkf.kd.m(), 6, 1, 6, $$4);
               this.a($$0, dkf.kd.m(), 5, 1, 4, $$4);
               this.a($$0, dkf.kd.m(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, dkf.eV.m(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, dkf.eV.m(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, dkf.eV.m(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, dkf.eV.m(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, dkf.eV.m(), 5, 1, 5, $$4);
               this.a($$0, dkf.eV.m(), 5, 2, 5, $$4);
               this.a($$0, dkf.eV.m(), 5, 3, 5, $$4);
               this.a($$0, dkf.J.m(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, dkf.m.m(), 1, 3, $$8, $$4);
                  this.a($$0, dkf.m.m(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, dkf.m.m(), $$9, 3, 1, $$4);
                  this.a($$0, dkf.m.m(), $$9, 3, 9, $$4);
               }

               this.a($$0, dkf.m.m(), 5, 1, 4, $$4);
               this.a($$0, dkf.m.m(), 5, 1, 6, $$4);
               this.a($$0, dkf.m.m(), 5, 3, 4, $$4);
               this.a($$0, dkf.m.m(), 5, 3, 6, $$4);
               this.a($$0, dkf.m.m(), 4, 1, 5, $$4);
               this.a($$0, dkf.m.m(), 6, 1, 5, $$4);
               this.a($$0, dkf.m.m(), 4, 3, 5, $$4);
               this.a($$0, dkf.m.m(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, dkf.m.m(), 4, $$10, 4, $$4);
                  this.a($$0, dkf.m.m(), 6, $$10, 4, $$4);
                  this.a($$0, dkf.m.m(), 4, $$10, 6, $$4);
                  this.a($$0, dkf.m.m(), 6, $$10, 6, $$4);
               }

               this.a($$0, dkf.cx.m(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, dkf.n.m(), 2, 3, $$11, $$4);
                  this.a($$0, dkf.n.m(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, dkf.n.m(), 4, 3, $$11, $$4);
                     this.a($$0, dkf.n.m(), 5, 3, $$11, $$4);
                     this.a($$0, dkf.n.m(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, dkf.n.m(), 7, 3, $$11, $$4);
                  this.a($$0, dkf.n.m(), 8, 3, $$11, $$4);
               }

               dxo $$12 = dkf.cX.m().b(dol.b, jm.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, ewe.w);
         }
      }
   }

   static class k extends eoh.a {
      @Override
      public void a(bac $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = dkf.eX.m();
            } else if ($$5 < 0.5F) {
               this.a = dkf.eW.m();
            } else if ($$5 < 0.55F) {
               this.a = dkf.fd.m();
            } else {
               this.a = dkf.eV.m();
            }
         } else {
            this.a = dkf.nE.m();
         }
      }
   }

   public static class l extends eqv.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(eou $$0, int $$1, int $$2, int $$3, jm $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = eqv.p.a.a;
      }

      public l(int $$0, bac $$1, env $$2, jm $$3) {
         super(eou.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(eou $$0, um $$1) {
         super($$0, $$1);
         this.d = $$1.q("Source");
      }

      public l(um $$0) {
         this(eou.C, $$0);
      }

      @Override
      protected void a(eot $$0, um $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(eoh $$0, eoi $$1, bac $$2) {
         if (this.d) {
            eqv.i = eqv.c.class;
         }

         this.a((eqv.m)$$0, $$1, $$2, 1, 1);
      }

      public static eqv.l a(eoi $$0, bac $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         env $$7 = env.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eqv.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dhx $$0, dhv $$1, dzk $$2, bac $$3, env $$4, dgf $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, eqv.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, eqv.p.a.a, 1, 1, 4);
         this.a($$0, dkf.eV.m(), 2, 6, 1, $$4);
         this.a($$0, dkf.eV.m(), 1, 5, 1, $$4);
         this.a($$0, dkf.kd.m(), 1, 6, 1, $$4);
         this.a($$0, dkf.eV.m(), 1, 5, 2, $$4);
         this.a($$0, dkf.eV.m(), 1, 4, 3, $$4);
         this.a($$0, dkf.kd.m(), 1, 5, 3, $$4);
         this.a($$0, dkf.eV.m(), 2, 4, 3, $$4);
         this.a($$0, dkf.eV.m(), 3, 3, 3, $$4);
         this.a($$0, dkf.kd.m(), 3, 4, 3, $$4);
         this.a($$0, dkf.eV.m(), 3, 3, 2, $$4);
         this.a($$0, dkf.eV.m(), 3, 2, 1, $$4);
         this.a($$0, dkf.kd.m(), 3, 3, 1, $$4);
         this.a($$0, dkf.eV.m(), 2, 2, 1, $$4);
         this.a($$0, dkf.eV.m(), 1, 1, 1, $$4);
         this.a($$0, dkf.kd.m(), 1, 2, 1, $$4);
         this.a($$0, dkf.eV.m(), 1, 1, 2, $$4);
         this.a($$0, dkf.kd.m(), 1, 1, 3, $$4);
      }
   }

   public static class m extends eqv.l {
      public eqv.f a;
      @Nullable
      public eqv.g b;
      public final List<eoh> c = Lists.newArrayList();

      public m(bac $$0, int $$1, int $$2) {
         super(eou.D, 0, $$1, $$2, a($$0));
      }

      public m(um $$0) {
         super(eou.D, $$0);
      }

      @Override
      public jh h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends eqv.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, bac $$1, env $$2, jm $$3) {
         super(eou.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(um $$0) {
         super(eou.E, $$0);
         this.d = $$0.q("Left");
         this.i = $$0.q("Right");
      }

      @Override
      protected void a(eot $$0, um $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(eoh $$0, eoi $$1, bac $$2) {
         this.a((eqv.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((eqv.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((eqv.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static eqv.n a(eoi $$0, bac $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         env $$7 = env.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new eqv.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dhx $$0, dhv $$1, dzk $$2, bac $$3, env $$4, dgf $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, eqv.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, eqv.p.a.a, 1, 1, 6);
         dxo $$7 = dkf.cx.m().b(dtk.g, jm.f);
         dxo $$8 = dkf.cx.m().b(dtk.g, jm.e);
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

   public static class o extends eqv.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, bac $$1, env $$2, jm $$3) {
         super(eou.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(um $$0) {
         super(eou.F, $$0);
      }

      @Override
      public void a(eoh $$0, eoi $$1, bac $$2) {
         this.a((eqv.m)$$0, $$1, $$2, 1, 1);
      }

      public static eqv.o a(eoi $$0, bac $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         env $$7 = env.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new eqv.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dhx $$0, dhv $$1, dzk $$2, bac $$3, env $$4, dgf $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, eqv.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, eqv.p.a.a, 1, 1, 7);
         dxo $$7 = dkf.cZ.m().b(dsc.b, jm.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, dkf.eV.m(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dkf.eV.m(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dkf.eV.m(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends eoh {
      protected eqv.p.a h = eqv.p.a.a;

      protected p(eou $$0, int $$1, env $$2) {
         super($$0, $$1, $$2);
      }

      public p(eou $$0, um $$1) {
         super($$0, $$1);
         this.h = eqv.p.a.valueOf($$1.l("EntryDoor"));
      }

      @Override
      protected void a(eot $$0, um $$1) {
         $$1.a("EntryDoor", this.h.name());
      }

      protected void a(dhx $$0, bac $$1, env $$2, eqv.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, dkf.eV.m(), $$4, $$5, $$6, $$2);
               this.a($$0, dkf.eV.m(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dkf.eV.m(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dkf.eV.m(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dkf.eV.m(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dkf.eV.m(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dkf.eV.m(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dkf.cW.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dkf.cW.m().b(dmk.f, dyj.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, dkf.nE.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dkf.nE.m(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dkf.fk.m().b(dog.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, dkf.fk.m().b(dog.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dkf.fk.m().b(dog.b, Boolean.valueOf(true)).b(dog.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dkf.fk.m().b(dog.b, Boolean.valueOf(true)).b(dog.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dkf.fk.m().b(dog.b, Boolean.valueOf(true)).b(dog.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dkf.fk.m().b(dog.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dkf.fk.m().b(dog.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, dkf.eV.m(), $$4, $$5, $$6, $$2);
               this.a($$0, dkf.eV.m(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dkf.eV.m(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dkf.eV.m(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dkf.eV.m(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dkf.eV.m(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dkf.eV.m(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dkf.dK.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dkf.dK.m().b(dmk.f, dyj.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dkf.dZ.m().b(dko.aF, jm.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, dkf.dZ.m().b(dko.aF, jm.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected eqv.p.a b(bac $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return eqv.p.a.a;
            case 2:
               return eqv.p.a.b;
            case 3:
               return eqv.p.a.c;
            case 4:
               return eqv.p.a.d;
         }
      }

      @Nullable
      protected eoh a(eqv.m $$0, eoi $$1, bac $$2, int $$3, int $$4) {
         jm $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eqv.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$5, this.g());
               case d:
                  return eqv.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$5, this.g());
               case e:
                  return eqv.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
               case f:
                  return eqv.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected eoh b(eqv.m $$0, eoi $$1, bac $$2, int $$3, int $$4) {
         jm $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eqv.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jm.e, this.g());
               case d:
                  return eqv.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jm.e, this.g());
               case e:
                  return eqv.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jm.c, this.g());
               case f:
                  return eqv.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jm.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected eoh c(eqv.m $$0, eoi $$1, bac $$2, int $$3, int $$4) {
         jm $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eqv.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jm.f, this.g());
               case d:
                  return eqv.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jm.f, this.g());
               case e:
                  return eqv.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jm.d, this.g());
               case f:
                  return eqv.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jm.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(env $$0) {
         return $$0 != null && $$0.i() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;
      }
   }

   public abstract static class q extends eqv.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(eou $$0, int $$1, env $$2) {
         super($$0, $$1, $$2);
      }

      public q(eou $$0, um $$1) {
         super($$0, $$1);
      }
   }
}
