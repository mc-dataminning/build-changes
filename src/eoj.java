import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class eoj {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final eoj.f[] g = new eoj.f[]{
      new eoj.f(eoj.n.class, 40, 0),
      new eoj.f(eoj.h.class, 5, 5),
      new eoj.f(eoj.d.class, 20, 0),
      new eoj.f(eoj.i.class, 20, 0),
      new eoj.f(eoj.j.class, 10, 6),
      new eoj.f(eoj.o.class, 5, 5),
      new eoj.f(eoj.l.class, 5, 5),
      new eoj.f(eoj.c.class, 5, 4),
      new eoj.f(eoj.a.class, 5, 4),
      new eoj.f(eoj.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new eoj.f(eoj.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<eoj.f> h;
   static Class<? extends eoj.p> i;
   private static int j;
   static final eoj.k k = new eoj.k();

   public static void a() {
      h = Lists.newArrayList();

      for (eoj.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (eoj.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static eoj.p a(Class<? extends eoj.p> $$0, elw $$1, azr $$2, int $$3, int $$4, int $$5, @Nullable jl $$6, int $$7) {
      eoj.p $$8 = null;
      if ($$0 == eoj.n.class) {
         $$8 = eoj.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eoj.h.class) {
         $$8 = eoj.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eoj.d.class) {
         $$8 = eoj.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eoj.i.class) {
         $$8 = eoj.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eoj.j.class) {
         $$8 = eoj.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eoj.o.class) {
         $$8 = eoj.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eoj.l.class) {
         $$8 = eoj.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eoj.c.class) {
         $$8 = eoj.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eoj.a.class) {
         $$8 = eoj.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eoj.e.class) {
         $$8 = eoj.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eoj.g.class) {
         $$8 = eoj.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static eoj.p a(eoj.m $$0, elw $$1, azr $$2, int $$3, int $$4, int $$5, jl $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            eoj.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (eoj.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  eoj.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         elj $$13 = eoj.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.i() > 1 ? new eoj.b($$7, $$13, $$6) : null;
      }
   }

   static elv b(eoj.m $$0, elw $$1, azr $$2, int $$3, int $$4, int $$5, @Nullable jl $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
         elv $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends eoj.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, azr $$1, elj $$2, jl $$3) {
         super(emi.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(uj $$0) {
         super(emi.t, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(emh $$0, uj $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(elv $$0, elw $$1, azr $$2) {
         this.a((eoj.m)$$0, $$1, $$2, 1, 1);
      }

      public static eoj.a a(elw $$0, azr $$1, int $$2, int $$3, int $$4, jl $$5, int $$6) {
         elj $$7 = elj.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new eoj.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfs $$0, dfq $$1, dxa $$2, azr $$3, elj $$4, deb $$5, jg $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, eoj.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, eoj.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, dia.eH.m(), dia.eH.m(), false);
         this.a($$0, dia.jK.m(), 3, 1, 1, $$4);
         this.a($$0, dia.jK.m(), 3, 1, 5, $$4);
         this.a($$0, dia.jK.m(), 3, 2, 2, $$4);
         this.a($$0, dia.jK.m(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, dia.jK.m(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, ets.x);
         }
      }
   }

   public static class b extends eoj.p {
      private final int a;

      public b(int $$0, elj $$1, jl $$2) {
         super(emi.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != jl.c && $$2 != jl.d ? $$1.d() : $$1.f();
      }

      public b(uj $$0) {
         super(emi.u, $$0);
         this.a = $$0.h("Steps");
      }

      @Override
      protected void a(emh $$0, uj $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static elj a(elw $$0, azr $$1, int $$2, int $$3, int $$4, jl $$5) {
         int $$6 = 3;
         elj $$7 = elj.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         elv $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().i() == $$7.i()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = elj.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return elj.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(dfs $$0, dfq $$1, dxa $$2, azr $$3, elj $$4, deb $$5, jg $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, dia.eH.m(), 0, 0, $$7, $$4);
            this.a($$0, dia.eH.m(), 1, 0, $$7, $$4);
            this.a($$0, dia.eH.m(), 2, 0, $$7, $$4);
            this.a($$0, dia.eH.m(), 3, 0, $$7, $$4);
            this.a($$0, dia.eH.m(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, dia.eH.m(), 0, $$8, $$7, $$4);
               this.a($$0, dia.nc.m(), 1, $$8, $$7, $$4);
               this.a($$0, dia.nc.m(), 2, $$8, $$7, $$4);
               this.a($$0, dia.nc.m(), 3, $$8, $$7, $$4);
               this.a($$0, dia.eH.m(), 4, $$8, $$7, $$4);
            }

            this.a($$0, dia.eH.m(), 0, 4, $$7, $$4);
            this.a($$0, dia.eH.m(), 1, 4, $$7, $$4);
            this.a($$0, dia.eH.m(), 2, 4, $$7, $$4);
            this.a($$0, dia.eH.m(), 3, 4, $$7, $$4);
            this.a($$0, dia.eH.m(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends eoj.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, azr $$1, elj $$2, jl $$3) {
         super(emi.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(uj $$0) {
         super(emi.v, $$0);
         this.d = $$0.q("leftLow");
         this.i = $$0.q("leftHigh");
         this.j = $$0.q("rightLow");
         this.k = $$0.q("rightHigh");
      }

      @Override
      protected void a(emh $$0, uj $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(elv $$0, elw $$1, azr $$2) {
         int $$3 = 3;
         int $$4 = 5;
         jl $$5 = this.i();
         if ($$5 == jl.e || $$5 == jl.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((eoj.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((eoj.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((eoj.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((eoj.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((eoj.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static eoj.c a(elw $$0, azr $$1, int $$2, int $$3, int $$4, jl $$5, int $$6) {
         elj $$7 = elj.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eoj.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfs $$0, dfq $$1, dxa $$2, azr $$3, elj $$4, deb $$5, jg $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, eoj.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, eoj.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, eoj.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, eoj.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, eoj.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, eoj.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, dia.jE.m(), dia.jE.m(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, dia.jE.m(), dia.jE.m(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, eoj.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, dia.jE.m(), dia.jE.m(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, dia.jE.m(), dia.jE.m(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, dia.jE.m(), dia.jE.m(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, dia.jE.m(), dia.jE.m(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, dia.jE.m().b(dpb.b, dwl.c), dia.jE.m().b(dpb.b, dwl.c), false);
         this.a($$0, dia.cq.m().b(dra.g, jl.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends eoj.q {
      public d(int $$0, azr $$1, elj $$2, jl $$3) {
         super(emi.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(uj $$0) {
         super(emi.w, $$0);
      }

      @Override
      public void a(elv $$0, elw $$1, azr $$2) {
         jl $$3 = this.i();
         if ($$3 != jl.c && $$3 != jl.f) {
            this.c((eoj.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((eoj.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static eoj.d a(elw $$0, azr $$1, int $$2, int $$3, int $$4, jl $$5, int $$6) {
         elj $$7 = elj.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eoj.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfs $$0, dfq $$1, dxa $$2, azr $$3, elj $$4, deb $$5, jg $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, eoj.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         jl $$7 = this.i();
         if ($$7 != jl.c && $$7 != jl.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends eoj.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, azr $$1, elj $$2, jl $$3) {
         super(emi.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.e() > 6;
      }

      public e(uj $$0) {
         super(emi.x, $$0);
         this.i = $$0.q("Tall");
      }

      @Override
      protected void a(emh $$0, uj $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static eoj.e a(elw $$0, azr $$1, int $$2, int $$3, int $$4, jl $$5, int $$6) {
         elj $$7 = elj.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = elj.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new eoj.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(dfs $$0, dfq $$1, dxa $$2, azr $$3, elj $$4, deb $$5, jg $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, eoj.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, dia.bs.m(), dia.bs.m(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dia.n.m(), dia.n.m(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dia.n.m(), dia.n.m(), false);
               this.a($$0, dia.cq.m().b(dra.g, jl.f), 2, 3, $$10, $$4);
               this.a($$0, dia.cq.m().b(dra.g, jl.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dia.n.m(), dia.n.m(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dia.n.m(), dia.n.m(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dia.cl.m(), dia.cl.m(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dia.cl.m(), dia.cl.m(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dia.cl.m(), dia.cl.m(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dia.cl.m(), dia.cl.m(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, dia.cl.m(), dia.cl.m(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, dia.cl.m(), dia.cl.m(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, dia.cl.m(), dia.cl.m(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, dia.n.m(), dia.n.m(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, dia.n.m(), dia.n.m(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, dia.n.m(), dia.n.m(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, dia.n.m(), dia.n.m(), false);
            this.a($$0, dia.n.m(), 9, 5, 11, $$4);
            this.a($$0, dia.n.m(), 8, 5, 11, $$4);
            this.a($$0, dia.n.m(), 9, 5, 10, $$4);
            dvd $$12 = dia.dU.m().b(dkv.d, Boolean.valueOf(true)).b(dkv.b, Boolean.valueOf(true));
            dvd $$13 = dia.dU.m().b(dkv.a, Boolean.valueOf(true)).b(dkv.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, dia.dU.m().b(dkv.a, Boolean.valueOf(true)).b(dkv.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, dia.dU.m().b(dkv.c, Boolean.valueOf(true)).b(dkv.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, dia.dU.m().b(dkv.a, Boolean.valueOf(true)).b(dkv.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, dia.dU.m().b(dkv.c, Boolean.valueOf(true)).b(dkv.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, dia.dU.m().b(dkv.a, Boolean.valueOf(true)).b(dkv.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            dvd $$15 = dia.cO.m().b(dmd.b, jl.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            dvd $$18 = dia.dU.m().b(dkv.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            dvd $$19 = dia.dU.m().b(dkv.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            dvd $$20 = $$13.b(dkv.d, Boolean.valueOf(true)).b(dkv.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.b(dkv.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.b(dkv.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.b(dkv.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.b(dkv.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            dvd $$21 = dia.cp.m();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, ets.v);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, ets.v);
         }
      }
   }

   static class f {
      public final Class<? extends eoj.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends eoj.p> $$0, int $$1, int $$2) {
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

   public static class g extends eoj.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, elj $$1, jl $$2) {
         super(emi.y, $$0, $$1);
         this.a($$2);
      }

      public g(uj $$0) {
         super(emi.y, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(emh $$0, uj $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(elv $$0, elw $$1, azr $$2) {
         if ($$0 != null) {
            ((eoj.m)$$0).b = this;
         }
      }

      public static eoj.g a(elw $$0, int $$1, int $$2, int $$3, jl $$4, int $$5) {
         elj $$6 = elj.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new eoj.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dfs $$0, dfq $$1, dxa $$2, azr $$3, elj $$4, deb $$5, jg $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, eoj.k);
         this.a($$0, $$3, $$4, eoj.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, eoj.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, eoj.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, eoj.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, eoj.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, eoj.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, eoj.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, dia.H.m(), dia.H.m(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, dia.H.m(), dia.H.m(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, eoj.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, dia.H.m(), dia.H.m(), false);
         dvd $$8 = dia.eW.m().b(dly.a, Boolean.valueOf(true)).b(dly.c, Boolean.valueOf(true));
         dvd $$9 = dia.eW.m().b(dly.d, Boolean.valueOf(true)).b(dly.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         dvd $$12 = dia.fj.m().b(dps.b, jl.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, eoj.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, eoj.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, eoj.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         dvd $$14 = dia.fy.m().b(dkn.b, jl.c);
         dvd $$15 = dia.fy.m().b(dkn.b, jl.d);
         dvd $$16 = dia.fy.m().b(dkn.b, jl.f);
         dvd $$17 = dia.fy.m().b(dkn.b, jl.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.b(dkn.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.b(dkn.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.b(dkn.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.b(dkn.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.b(dkn.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.b(dkn.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.b(dkn.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.b(dkn.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.b(dkn.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.b(dkn.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.b(dkn.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.b(dkn.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            dvd $$21 = dia.fx.m();
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
            jg $$22 = this.b(5, 3, 6);
            if ($$4.b($$22)) {
               this.d = true;
               $$0.a($$22, dia.ct.m(), 2);
               if ($$0.c_($$22) instanceof dtw $$24) {
                  $$24.a(bug.aM, $$3);
               }
            }
         }
      }
   }

   public static class h extends eoj.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, azr $$1, elj $$2, jl $$3) {
         super(emi.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(uj $$0) {
         super(emi.z, $$0);
      }

      @Override
      public void a(elv $$0, elw $$1, azr $$2) {
         this.a((eoj.m)$$0, $$1, $$2, 1, 1);
      }

      public static eoj.h a(elw $$0, azr $$1, int $$2, int $$3, int $$4, jl $$5, int $$6) {
         elj $$7 = elj.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eoj.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfs $$0, dfq $$1, dxa $$2, azr $$3, elj $$4, deb $$5, jg $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, eoj.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, eoj.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, eoj.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, eoj.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, eoj.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, dia.eW.m().b(dly.a, Boolean.valueOf(true)).b(dly.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, dia.eW.m().b(dly.a, Boolean.valueOf(true)).b(dly.c, Boolean.valueOf(true)).b(dly.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, dia.eW.m().b(dly.a, Boolean.valueOf(true)).b(dly.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, dia.eW.m().b(dly.d, Boolean.valueOf(true)).b(dly.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, dia.eW.m().b(dly.d, Boolean.valueOf(true)).b(dly.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, dia.eW.m().b(dly.d, Boolean.valueOf(true)).b(dly.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, dia.eW.m().b(dly.a, Boolean.valueOf(true)).b(dly.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, dia.eW.m().b(dly.a, Boolean.valueOf(true)).b(dly.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         dvd $$8 = dia.dy.m().b(dke.b, jl.e);
         dvd $$9 = dia.dy.m().b(dke.b, jl.e).b(dke.f, dvz.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends eoj.q {
      public i(int $$0, azr $$1, elj $$2, jl $$3) {
         super(emi.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(uj $$0) {
         super(emi.A, $$0);
      }

      @Override
      public void a(elv $$0, elw $$1, azr $$2) {
         jl $$3 = this.i();
         if ($$3 != jl.c && $$3 != jl.f) {
            this.b((eoj.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((eoj.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static eoj.i a(elw $$0, azr $$1, int $$2, int $$3, int $$4, jl $$5, int $$6) {
         elj $$7 = elj.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eoj.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfs $$0, dfq $$1, dxa $$2, azr $$3, elj $$4, deb $$5, jg $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, eoj.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         jl $$7 = this.i();
         if ($$7 != jl.c && $$7 != jl.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends eoj.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, azr $$1, elj $$2, jl $$3) {
         super(emi.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(uj $$0) {
         super(emi.B, $$0);
         this.d = $$0.h("Type");
      }

      @Override
      protected void a(emh $$0, uj $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(elv $$0, elw $$1, azr $$2) {
         this.a((eoj.m)$$0, $$1, $$2, 4, 1);
         this.b((eoj.m)$$0, $$1, $$2, 1, 4);
         this.c((eoj.m)$$0, $$1, $$2, 1, 4);
      }

      public static eoj.j a(elw $$0, azr $$1, int $$2, int $$3, int $$4, jl $$5, int $$6) {
         elj $$7 = elj.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eoj.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfs $$0, dfq $$1, dxa $$2, azr $$3, elj $$4, deb $$5, jg $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, eoj.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, dia.eH.m(), 5, 1, 5, $$4);
               this.a($$0, dia.eH.m(), 5, 2, 5, $$4);
               this.a($$0, dia.eH.m(), 5, 3, 5, $$4);
               this.a($$0, dia.cq.m().b(dra.g, jl.e), 4, 3, 5, $$4);
               this.a($$0, dia.cq.m().b(dra.g, jl.f), 6, 3, 5, $$4);
               this.a($$0, dia.cq.m().b(dra.g, jl.d), 5, 3, 4, $$4);
               this.a($$0, dia.cq.m().b(dra.g, jl.c), 5, 3, 6, $$4);
               this.a($$0, dia.jE.m(), 4, 1, 4, $$4);
               this.a($$0, dia.jE.m(), 4, 1, 5, $$4);
               this.a($$0, dia.jE.m(), 4, 1, 6, $$4);
               this.a($$0, dia.jE.m(), 6, 1, 4, $$4);
               this.a($$0, dia.jE.m(), 6, 1, 5, $$4);
               this.a($$0, dia.jE.m(), 6, 1, 6, $$4);
               this.a($$0, dia.jE.m(), 5, 1, 4, $$4);
               this.a($$0, dia.jE.m(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, dia.eH.m(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, dia.eH.m(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, dia.eH.m(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, dia.eH.m(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, dia.eH.m(), 5, 1, 5, $$4);
               this.a($$0, dia.eH.m(), 5, 2, 5, $$4);
               this.a($$0, dia.eH.m(), 5, 3, 5, $$4);
               this.a($$0, dia.G.m(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, dia.m.m(), 1, 3, $$8, $$4);
                  this.a($$0, dia.m.m(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, dia.m.m(), $$9, 3, 1, $$4);
                  this.a($$0, dia.m.m(), $$9, 3, 9, $$4);
               }

               this.a($$0, dia.m.m(), 5, 1, 4, $$4);
               this.a($$0, dia.m.m(), 5, 1, 6, $$4);
               this.a($$0, dia.m.m(), 5, 3, 4, $$4);
               this.a($$0, dia.m.m(), 5, 3, 6, $$4);
               this.a($$0, dia.m.m(), 4, 1, 5, $$4);
               this.a($$0, dia.m.m(), 6, 1, 5, $$4);
               this.a($$0, dia.m.m(), 4, 3, 5, $$4);
               this.a($$0, dia.m.m(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, dia.m.m(), 4, $$10, 4, $$4);
                  this.a($$0, dia.m.m(), 6, $$10, 4, $$4);
                  this.a($$0, dia.m.m(), 4, $$10, 6, $$4);
                  this.a($$0, dia.m.m(), 6, $$10, 6, $$4);
               }

               this.a($$0, dia.cq.m(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, dia.n.m(), 2, 3, $$11, $$4);
                  this.a($$0, dia.n.m(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, dia.n.m(), 4, 3, $$11, $$4);
                     this.a($$0, dia.n.m(), 5, 3, $$11, $$4);
                     this.a($$0, dia.n.m(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, dia.n.m(), 7, 3, $$11, $$4);
                  this.a($$0, dia.n.m(), 8, 3, $$11, $$4);
               }

               dvd $$12 = dia.cO.m().b(dmd.b, jl.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, ets.w);
         }
      }
   }

   static class k extends elv.a {
      @Override
      public void a(azr $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = dia.eJ.m();
            } else if ($$5 < 0.5F) {
               this.a = dia.eI.m();
            } else if ($$5 < 0.55F) {
               this.a = dia.eP.m();
            } else {
               this.a = dia.eH.m();
            }
         } else {
            this.a = dia.nc.m();
         }
      }
   }

   public static class l extends eoj.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(emi $$0, int $$1, int $$2, int $$3, jl $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = eoj.p.a.a;
      }

      public l(int $$0, azr $$1, elj $$2, jl $$3) {
         super(emi.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(emi $$0, uj $$1) {
         super($$0, $$1);
         this.d = $$1.q("Source");
      }

      public l(uj $$0) {
         this(emi.C, $$0);
      }

      @Override
      protected void a(emh $$0, uj $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(elv $$0, elw $$1, azr $$2) {
         if (this.d) {
            eoj.i = eoj.c.class;
         }

         this.a((eoj.m)$$0, $$1, $$2, 1, 1);
      }

      public static eoj.l a(elw $$0, azr $$1, int $$2, int $$3, int $$4, jl $$5, int $$6) {
         elj $$7 = elj.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eoj.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfs $$0, dfq $$1, dxa $$2, azr $$3, elj $$4, deb $$5, jg $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, eoj.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, eoj.p.a.a, 1, 1, 4);
         this.a($$0, dia.eH.m(), 2, 6, 1, $$4);
         this.a($$0, dia.eH.m(), 1, 5, 1, $$4);
         this.a($$0, dia.jE.m(), 1, 6, 1, $$4);
         this.a($$0, dia.eH.m(), 1, 5, 2, $$4);
         this.a($$0, dia.eH.m(), 1, 4, 3, $$4);
         this.a($$0, dia.jE.m(), 1, 5, 3, $$4);
         this.a($$0, dia.eH.m(), 2, 4, 3, $$4);
         this.a($$0, dia.eH.m(), 3, 3, 3, $$4);
         this.a($$0, dia.jE.m(), 3, 4, 3, $$4);
         this.a($$0, dia.eH.m(), 3, 3, 2, $$4);
         this.a($$0, dia.eH.m(), 3, 2, 1, $$4);
         this.a($$0, dia.jE.m(), 3, 3, 1, $$4);
         this.a($$0, dia.eH.m(), 2, 2, 1, $$4);
         this.a($$0, dia.eH.m(), 1, 1, 1, $$4);
         this.a($$0, dia.jE.m(), 1, 2, 1, $$4);
         this.a($$0, dia.eH.m(), 1, 1, 2, $$4);
         this.a($$0, dia.jE.m(), 1, 1, 3, $$4);
      }
   }

   public static class m extends eoj.l {
      public eoj.f a;
      @Nullable
      public eoj.g b;
      public final List<elv> c = Lists.newArrayList();

      public m(azr $$0, int $$1, int $$2) {
         super(emi.D, 0, $$1, $$2, a($$0));
      }

      public m(uj $$0) {
         super(emi.D, $$0);
      }

      @Override
      public jg h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends eoj.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, azr $$1, elj $$2, jl $$3) {
         super(emi.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(uj $$0) {
         super(emi.E, $$0);
         this.d = $$0.q("Left");
         this.i = $$0.q("Right");
      }

      @Override
      protected void a(emh $$0, uj $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(elv $$0, elw $$1, azr $$2) {
         this.a((eoj.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((eoj.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((eoj.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static eoj.n a(elw $$0, azr $$1, int $$2, int $$3, int $$4, jl $$5, int $$6) {
         elj $$7 = elj.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new eoj.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfs $$0, dfq $$1, dxa $$2, azr $$3, elj $$4, deb $$5, jg $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, eoj.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, eoj.p.a.a, 1, 1, 6);
         dvd $$7 = dia.cq.m().b(dra.g, jl.f);
         dvd $$8 = dia.cq.m().b(dra.g, jl.e);
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

   public static class o extends eoj.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, azr $$1, elj $$2, jl $$3) {
         super(emi.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(uj $$0) {
         super(emi.F, $$0);
      }

      @Override
      public void a(elv $$0, elw $$1, azr $$2) {
         this.a((eoj.m)$$0, $$1, $$2, 1, 1);
      }

      public static eoj.o a(elw $$0, azr $$1, int $$2, int $$3, int $$4, jl $$5, int $$6) {
         elj $$7 = elj.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new eoj.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfs $$0, dfq $$1, dxa $$2, azr $$3, elj $$4, deb $$5, jg $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, eoj.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, eoj.p.a.a, 1, 1, 7);
         dvd $$7 = dia.cQ.m().b(dps.b, jl.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, dia.eH.m(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dia.eH.m(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dia.eH.m(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends elv {
      protected eoj.p.a h = eoj.p.a.a;

      protected p(emi $$0, int $$1, elj $$2) {
         super($$0, $$1, $$2);
      }

      public p(emi $$0, uj $$1) {
         super($$0, $$1);
         this.h = eoj.p.a.valueOf($$1.l("EntryDoor"));
      }

      @Override
      protected void a(emh $$0, uj $$1) {
         $$1.a("EntryDoor", this.h.name());
      }

      protected void a(dfs $$0, azr $$1, elj $$2, eoj.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, dia.eH.m(), $$4, $$5, $$6, $$2);
               this.a($$0, dia.eH.m(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dia.eH.m(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dia.eH.m(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dia.eH.m(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dia.eH.m(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dia.eH.m(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dia.cN.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dia.cN.m().b(dke.f, dvz.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, dia.nc.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dia.nc.m(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dia.eW.m().b(dly.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, dia.eW.m().b(dly.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dia.eW.m().b(dly.b, Boolean.valueOf(true)).b(dly.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dia.eW.m().b(dly.b, Boolean.valueOf(true)).b(dly.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dia.eW.m().b(dly.b, Boolean.valueOf(true)).b(dly.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dia.eW.m().b(dly.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dia.eW.m().b(dly.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, dia.eH.m(), $$4, $$5, $$6, $$2);
               this.a($$0, dia.eH.m(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dia.eH.m(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dia.eH.m(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dia.eH.m(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dia.eH.m(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dia.eH.m(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dia.dy.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dia.dy.m().b(dke.f, dvz.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dia.dM.m().b(dii.aF, jl.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, dia.dM.m().b(dii.aF, jl.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected eoj.p.a b(azr $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return eoj.p.a.a;
            case 2:
               return eoj.p.a.b;
            case 3:
               return eoj.p.a.c;
            case 4:
               return eoj.p.a.d;
         }
      }

      @Nullable
      protected elv a(eoj.m $$0, elw $$1, azr $$2, int $$3, int $$4) {
         jl $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eoj.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$5, this.g());
               case d:
                  return eoj.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$5, this.g());
               case e:
                  return eoj.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
               case f:
                  return eoj.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected elv b(eoj.m $$0, elw $$1, azr $$2, int $$3, int $$4) {
         jl $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eoj.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jl.e, this.g());
               case d:
                  return eoj.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jl.e, this.g());
               case e:
                  return eoj.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jl.c, this.g());
               case f:
                  return eoj.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jl.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected elv c(eoj.m $$0, elw $$1, azr $$2, int $$3, int $$4) {
         jl $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eoj.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jl.f, this.g());
               case d:
                  return eoj.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jl.f, this.g());
               case e:
                  return eoj.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jl.d, this.g());
               case f:
                  return eoj.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jl.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(elj $$0) {
         return $$0 != null && $$0.i() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;
      }
   }

   public abstract static class q extends eoj.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(emi $$0, int $$1, elj $$2) {
         super($$0, $$1, $$2);
      }

      public q(emi $$0, uj $$1) {
         super($$0, $$1);
      }
   }
}
