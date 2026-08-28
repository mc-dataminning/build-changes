import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class eop {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final eop.f[] g = new eop.f[]{
      new eop.f(eop.n.class, 40, 0),
      new eop.f(eop.h.class, 5, 5),
      new eop.f(eop.d.class, 20, 0),
      new eop.f(eop.i.class, 20, 0),
      new eop.f(eop.j.class, 10, 6),
      new eop.f(eop.o.class, 5, 5),
      new eop.f(eop.l.class, 5, 5),
      new eop.f(eop.c.class, 5, 4),
      new eop.f(eop.a.class, 5, 4),
      new eop.f(eop.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new eop.f(eop.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<eop.f> h;
   static Class<? extends eop.p> i;
   private static int j;
   static final eop.k k = new eop.k();

   public static void a() {
      h = Lists.newArrayList();

      for (eop.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (eop.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static eop.p a(Class<? extends eop.p> $$0, emc $$1, azs $$2, int $$3, int $$4, int $$5, @Nullable jm $$6, int $$7) {
      eop.p $$8 = null;
      if ($$0 == eop.n.class) {
         $$8 = eop.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eop.h.class) {
         $$8 = eop.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eop.d.class) {
         $$8 = eop.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eop.i.class) {
         $$8 = eop.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eop.j.class) {
         $$8 = eop.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eop.o.class) {
         $$8 = eop.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eop.l.class) {
         $$8 = eop.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eop.c.class) {
         $$8 = eop.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eop.a.class) {
         $$8 = eop.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eop.e.class) {
         $$8 = eop.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eop.g.class) {
         $$8 = eop.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static eop.p a(eop.m $$0, emc $$1, azs $$2, int $$3, int $$4, int $$5, jm $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            eop.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (eop.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  eop.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         elp $$13 = eop.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.i() > 1 ? new eop.b($$7, $$13, $$6) : null;
      }
   }

   static emb b(eop.m $$0, emc $$1, azs $$2, int $$3, int $$4, int $$5, @Nullable jm $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
         emb $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends eop.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, azs $$1, elp $$2, jm $$3) {
         super(emo.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(uk $$0) {
         super(emo.t, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(emn $$0, uk $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(emb $$0, emc $$1, azs $$2) {
         this.a((eop.m)$$0, $$1, $$2, 1, 1);
      }

      public static eop.a a(emc $$0, azs $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         elp $$7 = elp.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new eop.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfy $$0, dfw $$1, dxg $$2, azs $$3, elp $$4, deh $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, eop.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, eop.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, dig.eH.m(), dig.eH.m(), false);
         this.a($$0, dig.jK.m(), 3, 1, 1, $$4);
         this.a($$0, dig.jK.m(), 3, 1, 5, $$4);
         this.a($$0, dig.jK.m(), 3, 2, 2, $$4);
         this.a($$0, dig.jK.m(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, dig.jK.m(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, ety.x);
         }
      }
   }

   public static class b extends eop.p {
      private final int a;

      public b(int $$0, elp $$1, jm $$2) {
         super(emo.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != jm.c && $$2 != jm.d ? $$1.d() : $$1.f();
      }

      public b(uk $$0) {
         super(emo.u, $$0);
         this.a = $$0.h("Steps");
      }

      @Override
      protected void a(emn $$0, uk $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static elp a(emc $$0, azs $$1, int $$2, int $$3, int $$4, jm $$5) {
         int $$6 = 3;
         elp $$7 = elp.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         emb $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().i() == $$7.i()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = elp.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return elp.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(dfy $$0, dfw $$1, dxg $$2, azs $$3, elp $$4, deh $$5, jh $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, dig.eH.m(), 0, 0, $$7, $$4);
            this.a($$0, dig.eH.m(), 1, 0, $$7, $$4);
            this.a($$0, dig.eH.m(), 2, 0, $$7, $$4);
            this.a($$0, dig.eH.m(), 3, 0, $$7, $$4);
            this.a($$0, dig.eH.m(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, dig.eH.m(), 0, $$8, $$7, $$4);
               this.a($$0, dig.nc.m(), 1, $$8, $$7, $$4);
               this.a($$0, dig.nc.m(), 2, $$8, $$7, $$4);
               this.a($$0, dig.nc.m(), 3, $$8, $$7, $$4);
               this.a($$0, dig.eH.m(), 4, $$8, $$7, $$4);
            }

            this.a($$0, dig.eH.m(), 0, 4, $$7, $$4);
            this.a($$0, dig.eH.m(), 1, 4, $$7, $$4);
            this.a($$0, dig.eH.m(), 2, 4, $$7, $$4);
            this.a($$0, dig.eH.m(), 3, 4, $$7, $$4);
            this.a($$0, dig.eH.m(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends eop.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, azs $$1, elp $$2, jm $$3) {
         super(emo.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(uk $$0) {
         super(emo.v, $$0);
         this.d = $$0.q("leftLow");
         this.i = $$0.q("leftHigh");
         this.j = $$0.q("rightLow");
         this.k = $$0.q("rightHigh");
      }

      @Override
      protected void a(emn $$0, uk $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(emb $$0, emc $$1, azs $$2) {
         int $$3 = 3;
         int $$4 = 5;
         jm $$5 = this.i();
         if ($$5 == jm.e || $$5 == jm.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((eop.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((eop.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((eop.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((eop.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((eop.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static eop.c a(emc $$0, azs $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         elp $$7 = elp.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eop.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfy $$0, dfw $$1, dxg $$2, azs $$3, elp $$4, deh $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, eop.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, eop.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, eop.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, eop.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, eop.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, eop.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, dig.jE.m(), dig.jE.m(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, dig.jE.m(), dig.jE.m(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, eop.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, dig.jE.m(), dig.jE.m(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, dig.jE.m(), dig.jE.m(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, dig.jE.m(), dig.jE.m(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, dig.jE.m(), dig.jE.m(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, dig.jE.m().b(dph.b, dwr.c), dig.jE.m().b(dph.b, dwr.c), false);
         this.a($$0, dig.cq.m().b(drg.g, jm.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends eop.q {
      public d(int $$0, azs $$1, elp $$2, jm $$3) {
         super(emo.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(uk $$0) {
         super(emo.w, $$0);
      }

      @Override
      public void a(emb $$0, emc $$1, azs $$2) {
         jm $$3 = this.i();
         if ($$3 != jm.c && $$3 != jm.f) {
            this.c((eop.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((eop.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static eop.d a(emc $$0, azs $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         elp $$7 = elp.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eop.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfy $$0, dfw $$1, dxg $$2, azs $$3, elp $$4, deh $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, eop.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         jm $$7 = this.i();
         if ($$7 != jm.c && $$7 != jm.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends eop.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, azs $$1, elp $$2, jm $$3) {
         super(emo.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.e() > 6;
      }

      public e(uk $$0) {
         super(emo.x, $$0);
         this.i = $$0.q("Tall");
      }

      @Override
      protected void a(emn $$0, uk $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static eop.e a(emc $$0, azs $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         elp $$7 = elp.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = elp.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new eop.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(dfy $$0, dfw $$1, dxg $$2, azs $$3, elp $$4, deh $$5, jh $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, eop.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, dig.bs.m(), dig.bs.m(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dig.n.m(), dig.n.m(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dig.n.m(), dig.n.m(), false);
               this.a($$0, dig.cq.m().b(drg.g, jm.f), 2, 3, $$10, $$4);
               this.a($$0, dig.cq.m().b(drg.g, jm.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dig.n.m(), dig.n.m(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dig.n.m(), dig.n.m(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dig.cl.m(), dig.cl.m(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dig.cl.m(), dig.cl.m(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dig.cl.m(), dig.cl.m(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dig.cl.m(), dig.cl.m(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, dig.cl.m(), dig.cl.m(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, dig.cl.m(), dig.cl.m(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, dig.cl.m(), dig.cl.m(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, dig.n.m(), dig.n.m(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, dig.n.m(), dig.n.m(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, dig.n.m(), dig.n.m(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, dig.n.m(), dig.n.m(), false);
            this.a($$0, dig.n.m(), 9, 5, 11, $$4);
            this.a($$0, dig.n.m(), 8, 5, 11, $$4);
            this.a($$0, dig.n.m(), 9, 5, 10, $$4);
            dvj $$12 = dig.dU.m().b(dlb.d, Boolean.valueOf(true)).b(dlb.b, Boolean.valueOf(true));
            dvj $$13 = dig.dU.m().b(dlb.a, Boolean.valueOf(true)).b(dlb.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, dig.dU.m().b(dlb.a, Boolean.valueOf(true)).b(dlb.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, dig.dU.m().b(dlb.c, Boolean.valueOf(true)).b(dlb.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, dig.dU.m().b(dlb.a, Boolean.valueOf(true)).b(dlb.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, dig.dU.m().b(dlb.c, Boolean.valueOf(true)).b(dlb.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, dig.dU.m().b(dlb.a, Boolean.valueOf(true)).b(dlb.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            dvj $$15 = dig.cO.m().b(dmj.b, jm.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            dvj $$18 = dig.dU.m().b(dlb.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            dvj $$19 = dig.dU.m().b(dlb.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            dvj $$20 = $$13.b(dlb.d, Boolean.valueOf(true)).b(dlb.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.b(dlb.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.b(dlb.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.b(dlb.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.b(dlb.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            dvj $$21 = dig.cp.m();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, ety.v);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, ety.v);
         }
      }
   }

   static class f {
      public final Class<? extends eop.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends eop.p> $$0, int $$1, int $$2) {
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

   public static class g extends eop.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, elp $$1, jm $$2) {
         super(emo.y, $$0, $$1);
         this.a($$2);
      }

      public g(uk $$0) {
         super(emo.y, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(emn $$0, uk $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(emb $$0, emc $$1, azs $$2) {
         if ($$0 != null) {
            ((eop.m)$$0).b = this;
         }
      }

      public static eop.g a(emc $$0, int $$1, int $$2, int $$3, jm $$4, int $$5) {
         elp $$6 = elp.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new eop.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dfy $$0, dfw $$1, dxg $$2, azs $$3, elp $$4, deh $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, eop.k);
         this.a($$0, $$3, $$4, eop.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, eop.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, eop.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, eop.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, eop.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, eop.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, eop.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, dig.H.m(), dig.H.m(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, dig.H.m(), dig.H.m(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, eop.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, dig.H.m(), dig.H.m(), false);
         dvj $$8 = dig.eW.m().b(dme.a, Boolean.valueOf(true)).b(dme.c, Boolean.valueOf(true));
         dvj $$9 = dig.eW.m().b(dme.d, Boolean.valueOf(true)).b(dme.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         dvj $$12 = dig.fj.m().b(dpy.b, jm.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, eop.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, eop.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, eop.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         dvj $$14 = dig.fy.m().b(dkt.b, jm.c);
         dvj $$15 = dig.fy.m().b(dkt.b, jm.d);
         dvj $$16 = dig.fy.m().b(dkt.b, jm.f);
         dvj $$17 = dig.fy.m().b(dkt.b, jm.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.b(dkt.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.b(dkt.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.b(dkt.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.b(dkt.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.b(dkt.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.b(dkt.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.b(dkt.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.b(dkt.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.b(dkt.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.b(dkt.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.b(dkt.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.b(dkt.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            dvj $$21 = dig.fx.m();
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
               $$0.a($$22, dig.ct.m(), 2);
               if ($$0.c_($$22) instanceof duc $$24) {
                  $$24.a(bul.aM, $$3);
               }
            }
         }
      }
   }

   public static class h extends eop.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, azs $$1, elp $$2, jm $$3) {
         super(emo.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(uk $$0) {
         super(emo.z, $$0);
      }

      @Override
      public void a(emb $$0, emc $$1, azs $$2) {
         this.a((eop.m)$$0, $$1, $$2, 1, 1);
      }

      public static eop.h a(emc $$0, azs $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         elp $$7 = elp.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eop.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfy $$0, dfw $$1, dxg $$2, azs $$3, elp $$4, deh $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, eop.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, eop.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, eop.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, eop.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, eop.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, dig.eW.m().b(dme.a, Boolean.valueOf(true)).b(dme.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, dig.eW.m().b(dme.a, Boolean.valueOf(true)).b(dme.c, Boolean.valueOf(true)).b(dme.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, dig.eW.m().b(dme.a, Boolean.valueOf(true)).b(dme.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, dig.eW.m().b(dme.d, Boolean.valueOf(true)).b(dme.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, dig.eW.m().b(dme.d, Boolean.valueOf(true)).b(dme.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, dig.eW.m().b(dme.d, Boolean.valueOf(true)).b(dme.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, dig.eW.m().b(dme.a, Boolean.valueOf(true)).b(dme.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, dig.eW.m().b(dme.a, Boolean.valueOf(true)).b(dme.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         dvj $$8 = dig.dy.m().b(dkk.b, jm.e);
         dvj $$9 = dig.dy.m().b(dkk.b, jm.e).b(dkk.f, dwf.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends eop.q {
      public i(int $$0, azs $$1, elp $$2, jm $$3) {
         super(emo.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(uk $$0) {
         super(emo.A, $$0);
      }

      @Override
      public void a(emb $$0, emc $$1, azs $$2) {
         jm $$3 = this.i();
         if ($$3 != jm.c && $$3 != jm.f) {
            this.b((eop.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((eop.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static eop.i a(emc $$0, azs $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         elp $$7 = elp.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eop.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfy $$0, dfw $$1, dxg $$2, azs $$3, elp $$4, deh $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, eop.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         jm $$7 = this.i();
         if ($$7 != jm.c && $$7 != jm.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends eop.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, azs $$1, elp $$2, jm $$3) {
         super(emo.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(uk $$0) {
         super(emo.B, $$0);
         this.d = $$0.h("Type");
      }

      @Override
      protected void a(emn $$0, uk $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(emb $$0, emc $$1, azs $$2) {
         this.a((eop.m)$$0, $$1, $$2, 4, 1);
         this.b((eop.m)$$0, $$1, $$2, 1, 4);
         this.c((eop.m)$$0, $$1, $$2, 1, 4);
      }

      public static eop.j a(emc $$0, azs $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         elp $$7 = elp.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eop.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfy $$0, dfw $$1, dxg $$2, azs $$3, elp $$4, deh $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, eop.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, dig.eH.m(), 5, 1, 5, $$4);
               this.a($$0, dig.eH.m(), 5, 2, 5, $$4);
               this.a($$0, dig.eH.m(), 5, 3, 5, $$4);
               this.a($$0, dig.cq.m().b(drg.g, jm.e), 4, 3, 5, $$4);
               this.a($$0, dig.cq.m().b(drg.g, jm.f), 6, 3, 5, $$4);
               this.a($$0, dig.cq.m().b(drg.g, jm.d), 5, 3, 4, $$4);
               this.a($$0, dig.cq.m().b(drg.g, jm.c), 5, 3, 6, $$4);
               this.a($$0, dig.jE.m(), 4, 1, 4, $$4);
               this.a($$0, dig.jE.m(), 4, 1, 5, $$4);
               this.a($$0, dig.jE.m(), 4, 1, 6, $$4);
               this.a($$0, dig.jE.m(), 6, 1, 4, $$4);
               this.a($$0, dig.jE.m(), 6, 1, 5, $$4);
               this.a($$0, dig.jE.m(), 6, 1, 6, $$4);
               this.a($$0, dig.jE.m(), 5, 1, 4, $$4);
               this.a($$0, dig.jE.m(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, dig.eH.m(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, dig.eH.m(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, dig.eH.m(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, dig.eH.m(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, dig.eH.m(), 5, 1, 5, $$4);
               this.a($$0, dig.eH.m(), 5, 2, 5, $$4);
               this.a($$0, dig.eH.m(), 5, 3, 5, $$4);
               this.a($$0, dig.G.m(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, dig.m.m(), 1, 3, $$8, $$4);
                  this.a($$0, dig.m.m(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, dig.m.m(), $$9, 3, 1, $$4);
                  this.a($$0, dig.m.m(), $$9, 3, 9, $$4);
               }

               this.a($$0, dig.m.m(), 5, 1, 4, $$4);
               this.a($$0, dig.m.m(), 5, 1, 6, $$4);
               this.a($$0, dig.m.m(), 5, 3, 4, $$4);
               this.a($$0, dig.m.m(), 5, 3, 6, $$4);
               this.a($$0, dig.m.m(), 4, 1, 5, $$4);
               this.a($$0, dig.m.m(), 6, 1, 5, $$4);
               this.a($$0, dig.m.m(), 4, 3, 5, $$4);
               this.a($$0, dig.m.m(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, dig.m.m(), 4, $$10, 4, $$4);
                  this.a($$0, dig.m.m(), 6, $$10, 4, $$4);
                  this.a($$0, dig.m.m(), 4, $$10, 6, $$4);
                  this.a($$0, dig.m.m(), 6, $$10, 6, $$4);
               }

               this.a($$0, dig.cq.m(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, dig.n.m(), 2, 3, $$11, $$4);
                  this.a($$0, dig.n.m(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, dig.n.m(), 4, 3, $$11, $$4);
                     this.a($$0, dig.n.m(), 5, 3, $$11, $$4);
                     this.a($$0, dig.n.m(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, dig.n.m(), 7, 3, $$11, $$4);
                  this.a($$0, dig.n.m(), 8, 3, $$11, $$4);
               }

               dvj $$12 = dig.cO.m().b(dmj.b, jm.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, ety.w);
         }
      }
   }

   static class k extends emb.a {
      @Override
      public void a(azs $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = dig.eJ.m();
            } else if ($$5 < 0.5F) {
               this.a = dig.eI.m();
            } else if ($$5 < 0.55F) {
               this.a = dig.eP.m();
            } else {
               this.a = dig.eH.m();
            }
         } else {
            this.a = dig.nc.m();
         }
      }
   }

   public static class l extends eop.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(emo $$0, int $$1, int $$2, int $$3, jm $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = eop.p.a.a;
      }

      public l(int $$0, azs $$1, elp $$2, jm $$3) {
         super(emo.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(emo $$0, uk $$1) {
         super($$0, $$1);
         this.d = $$1.q("Source");
      }

      public l(uk $$0) {
         this(emo.C, $$0);
      }

      @Override
      protected void a(emn $$0, uk $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(emb $$0, emc $$1, azs $$2) {
         if (this.d) {
            eop.i = eop.c.class;
         }

         this.a((eop.m)$$0, $$1, $$2, 1, 1);
      }

      public static eop.l a(emc $$0, azs $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         elp $$7 = elp.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eop.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfy $$0, dfw $$1, dxg $$2, azs $$3, elp $$4, deh $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, eop.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, eop.p.a.a, 1, 1, 4);
         this.a($$0, dig.eH.m(), 2, 6, 1, $$4);
         this.a($$0, dig.eH.m(), 1, 5, 1, $$4);
         this.a($$0, dig.jE.m(), 1, 6, 1, $$4);
         this.a($$0, dig.eH.m(), 1, 5, 2, $$4);
         this.a($$0, dig.eH.m(), 1, 4, 3, $$4);
         this.a($$0, dig.jE.m(), 1, 5, 3, $$4);
         this.a($$0, dig.eH.m(), 2, 4, 3, $$4);
         this.a($$0, dig.eH.m(), 3, 3, 3, $$4);
         this.a($$0, dig.jE.m(), 3, 4, 3, $$4);
         this.a($$0, dig.eH.m(), 3, 3, 2, $$4);
         this.a($$0, dig.eH.m(), 3, 2, 1, $$4);
         this.a($$0, dig.jE.m(), 3, 3, 1, $$4);
         this.a($$0, dig.eH.m(), 2, 2, 1, $$4);
         this.a($$0, dig.eH.m(), 1, 1, 1, $$4);
         this.a($$0, dig.jE.m(), 1, 2, 1, $$4);
         this.a($$0, dig.eH.m(), 1, 1, 2, $$4);
         this.a($$0, dig.jE.m(), 1, 1, 3, $$4);
      }
   }

   public static class m extends eop.l {
      public eop.f a;
      @Nullable
      public eop.g b;
      public final List<emb> c = Lists.newArrayList();

      public m(azs $$0, int $$1, int $$2) {
         super(emo.D, 0, $$1, $$2, a($$0));
      }

      public m(uk $$0) {
         super(emo.D, $$0);
      }

      @Override
      public jh h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends eop.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, azs $$1, elp $$2, jm $$3) {
         super(emo.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(uk $$0) {
         super(emo.E, $$0);
         this.d = $$0.q("Left");
         this.i = $$0.q("Right");
      }

      @Override
      protected void a(emn $$0, uk $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(emb $$0, emc $$1, azs $$2) {
         this.a((eop.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((eop.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((eop.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static eop.n a(emc $$0, azs $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         elp $$7 = elp.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new eop.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfy $$0, dfw $$1, dxg $$2, azs $$3, elp $$4, deh $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, eop.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, eop.p.a.a, 1, 1, 6);
         dvj $$7 = dig.cq.m().b(drg.g, jm.f);
         dvj $$8 = dig.cq.m().b(drg.g, jm.e);
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

   public static class o extends eop.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, azs $$1, elp $$2, jm $$3) {
         super(emo.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(uk $$0) {
         super(emo.F, $$0);
      }

      @Override
      public void a(emb $$0, emc $$1, azs $$2) {
         this.a((eop.m)$$0, $$1, $$2, 1, 1);
      }

      public static eop.o a(emc $$0, azs $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         elp $$7 = elp.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new eop.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfy $$0, dfw $$1, dxg $$2, azs $$3, elp $$4, deh $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, eop.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, eop.p.a.a, 1, 1, 7);
         dvj $$7 = dig.cQ.m().b(dpy.b, jm.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, dig.eH.m(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dig.eH.m(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dig.eH.m(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends emb {
      protected eop.p.a h = eop.p.a.a;

      protected p(emo $$0, int $$1, elp $$2) {
         super($$0, $$1, $$2);
      }

      public p(emo $$0, uk $$1) {
         super($$0, $$1);
         this.h = eop.p.a.valueOf($$1.l("EntryDoor"));
      }

      @Override
      protected void a(emn $$0, uk $$1) {
         $$1.a("EntryDoor", this.h.name());
      }

      protected void a(dfy $$0, azs $$1, elp $$2, eop.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, dig.eH.m(), $$4, $$5, $$6, $$2);
               this.a($$0, dig.eH.m(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dig.eH.m(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dig.eH.m(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dig.eH.m(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dig.eH.m(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dig.eH.m(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dig.cN.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dig.cN.m().b(dkk.f, dwf.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, dig.nc.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dig.nc.m(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dig.eW.m().b(dme.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, dig.eW.m().b(dme.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dig.eW.m().b(dme.b, Boolean.valueOf(true)).b(dme.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dig.eW.m().b(dme.b, Boolean.valueOf(true)).b(dme.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dig.eW.m().b(dme.b, Boolean.valueOf(true)).b(dme.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dig.eW.m().b(dme.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dig.eW.m().b(dme.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, dig.eH.m(), $$4, $$5, $$6, $$2);
               this.a($$0, dig.eH.m(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dig.eH.m(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dig.eH.m(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dig.eH.m(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dig.eH.m(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dig.eH.m(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dig.dy.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dig.dy.m().b(dkk.f, dwf.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dig.dM.m().b(dio.aF, jm.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, dig.dM.m().b(dio.aF, jm.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected eop.p.a b(azs $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return eop.p.a.a;
            case 2:
               return eop.p.a.b;
            case 3:
               return eop.p.a.c;
            case 4:
               return eop.p.a.d;
         }
      }

      @Nullable
      protected emb a(eop.m $$0, emc $$1, azs $$2, int $$3, int $$4) {
         jm $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eop.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$5, this.g());
               case d:
                  return eop.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$5, this.g());
               case e:
                  return eop.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
               case f:
                  return eop.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected emb b(eop.m $$0, emc $$1, azs $$2, int $$3, int $$4) {
         jm $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eop.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jm.e, this.g());
               case d:
                  return eop.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jm.e, this.g());
               case e:
                  return eop.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jm.c, this.g());
               case f:
                  return eop.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jm.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected emb c(eop.m $$0, emc $$1, azs $$2, int $$3, int $$4) {
         jm $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eop.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jm.f, this.g());
               case d:
                  return eop.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jm.f, this.g());
               case e:
                  return eop.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jm.d, this.g());
               case f:
                  return eop.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jm.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(elp $$0) {
         return $$0 != null && $$0.i() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;
      }
   }

   public abstract static class q extends eop.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(emo $$0, int $$1, elp $$2) {
         super($$0, $$1, $$2);
      }

      public q(emo $$0, uk $$1) {
         super($$0, $$1);
      }
   }
}
