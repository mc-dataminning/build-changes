import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class erc {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final erc.f[] g = new erc.f[]{
      new erc.f(erc.n.class, 40, 0),
      new erc.f(erc.h.class, 5, 5),
      new erc.f(erc.d.class, 20, 0),
      new erc.f(erc.i.class, 20, 0),
      new erc.f(erc.j.class, 10, 6),
      new erc.f(erc.o.class, 5, 5),
      new erc.f(erc.l.class, 5, 5),
      new erc.f(erc.c.class, 5, 4),
      new erc.f(erc.a.class, 5, 4),
      new erc.f(erc.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new erc.f(erc.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<erc.f> h;
   static Class<? extends erc.p> i;
   private static int j;
   static final erc.k k = new erc.k();

   public static void a() {
      h = Lists.newArrayList();

      for (erc.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (erc.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static erc.p a(Class<? extends erc.p> $$0, eop $$1, bam $$2, int $$3, int $$4, int $$5, @Nullable jm $$6, int $$7) {
      erc.p $$8 = null;
      if ($$0 == erc.n.class) {
         $$8 = erc.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == erc.h.class) {
         $$8 = erc.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == erc.d.class) {
         $$8 = erc.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == erc.i.class) {
         $$8 = erc.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == erc.j.class) {
         $$8 = erc.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == erc.o.class) {
         $$8 = erc.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == erc.l.class) {
         $$8 = erc.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == erc.c.class) {
         $$8 = erc.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == erc.a.class) {
         $$8 = erc.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == erc.e.class) {
         $$8 = erc.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == erc.g.class) {
         $$8 = erc.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static erc.p a(erc.m $$0, eop $$1, bam $$2, int $$3, int $$4, int $$5, jm $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            erc.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (erc.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  erc.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         eoc $$13 = erc.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.i() > 1 ? new erc.b($$7, $$13, $$6) : null;
      }
   }

   static eoo b(erc.m $$0, eop $$1, bam $$2, int $$3, int $$4, int $$5, @Nullable jm $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
         eoo $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends erc.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, bam $$1, eoc $$2, jm $$3) {
         super(epb.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(ux $$0) {
         super(epb.t, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(epa $$0, ux $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(eoo $$0, eop $$1, bam $$2) {
         this.a((erc.m)$$0, $$1, $$2, 1, 1);
      }

      public static erc.a a(eop $$0, bam $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         eoc $$7 = eoc.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new erc.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dig $$0, die $$1, dzr $$2, bam $$3, eoc $$4, dgo $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, erc.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, erc.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, dko.eV.m(), dko.eV.m(), false);
         this.a($$0, dko.kc.m(), 3, 1, 1, $$4);
         this.a($$0, dko.kc.m(), 3, 1, 5, $$4);
         this.a($$0, dko.kc.m(), 3, 2, 2, $$4);
         this.a($$0, dko.kc.m(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, dko.kc.m(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, ewl.x);
         }
      }
   }

   public static class b extends erc.p {
      private final int a;

      public b(int $$0, eoc $$1, jm $$2) {
         super(epb.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != jm.c && $$2 != jm.d ? $$1.d() : $$1.f();
      }

      public b(ux $$0) {
         super(epb.u, $$0);
         this.a = $$0.h("Steps");
      }

      @Override
      protected void a(epa $$0, ux $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static eoc a(eop $$0, bam $$1, int $$2, int $$3, int $$4, jm $$5) {
         int $$6 = 3;
         eoc $$7 = eoc.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         eoo $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().i() == $$7.i()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = eoc.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return eoc.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(dig $$0, die $$1, dzr $$2, bam $$3, eoc $$4, dgo $$5, jh $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, dko.eV.m(), 0, 0, $$7, $$4);
            this.a($$0, dko.eV.m(), 1, 0, $$7, $$4);
            this.a($$0, dko.eV.m(), 2, 0, $$7, $$4);
            this.a($$0, dko.eV.m(), 3, 0, $$7, $$4);
            this.a($$0, dko.eV.m(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, dko.eV.m(), 0, $$8, $$7, $$4);
               this.a($$0, dko.nx.m(), 1, $$8, $$7, $$4);
               this.a($$0, dko.nx.m(), 2, $$8, $$7, $$4);
               this.a($$0, dko.nx.m(), 3, $$8, $$7, $$4);
               this.a($$0, dko.eV.m(), 4, $$8, $$7, $$4);
            }

            this.a($$0, dko.eV.m(), 0, 4, $$7, $$4);
            this.a($$0, dko.eV.m(), 1, 4, $$7, $$4);
            this.a($$0, dko.eV.m(), 2, 4, $$7, $$4);
            this.a($$0, dko.eV.m(), 3, 4, $$7, $$4);
            this.a($$0, dko.eV.m(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends erc.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, bam $$1, eoc $$2, jm $$3) {
         super(epb.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(ux $$0) {
         super(epb.v, $$0);
         this.d = $$0.q("leftLow");
         this.i = $$0.q("leftHigh");
         this.j = $$0.q("rightLow");
         this.k = $$0.q("rightHigh");
      }

      @Override
      protected void a(epa $$0, ux $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(eoo $$0, eop $$1, bam $$2) {
         int $$3 = 3;
         int $$4 = 5;
         jm $$5 = this.i();
         if ($$5 == jm.e || $$5 == jm.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((erc.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((erc.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((erc.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((erc.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((erc.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static erc.c a(eop $$0, bam $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         eoc $$7 = eoc.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new erc.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dig $$0, die $$1, dzr $$2, bam $$3, eoc $$4, dgo $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, erc.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, erc.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, erc.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, erc.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, erc.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, erc.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, dko.jW.m(), dko.jW.m(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, dko.jW.m(), dko.jW.m(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, erc.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, dko.jW.m(), dko.jW.m(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, dko.jW.m(), dko.jW.m(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, dko.jW.m(), dko.jW.m(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, dko.jW.m(), dko.jW.m(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, dko.jW.m().b(drs.b, dzc.c), dko.jW.m().b(drs.b, dzc.c), false);
         this.a($$0, dko.cx.m().b(dtr.g, jm.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends erc.q {
      public d(int $$0, bam $$1, eoc $$2, jm $$3) {
         super(epb.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(ux $$0) {
         super(epb.w, $$0);
      }

      @Override
      public void a(eoo $$0, eop $$1, bam $$2) {
         jm $$3 = this.i();
         if ($$3 != jm.c && $$3 != jm.f) {
            this.c((erc.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((erc.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static erc.d a(eop $$0, bam $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         eoc $$7 = eoc.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new erc.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dig $$0, die $$1, dzr $$2, bam $$3, eoc $$4, dgo $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, erc.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         jm $$7 = this.i();
         if ($$7 != jm.c && $$7 != jm.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends erc.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, bam $$1, eoc $$2, jm $$3) {
         super(epb.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.e() > 6;
      }

      public e(ux $$0) {
         super(epb.x, $$0);
         this.i = $$0.q("Tall");
      }

      @Override
      protected void a(epa $$0, ux $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static erc.e a(eop $$0, bam $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         eoc $$7 = eoc.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = eoc.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new erc.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(dig $$0, die $$1, dzr $$2, bam $$3, eoc $$4, dgo $$5, jh $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, erc.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, dko.bz.m(), dko.bz.m(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dko.n.m(), dko.n.m(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dko.n.m(), dko.n.m(), false);
               this.a($$0, dko.cx.m().b(dtr.g, jm.f), 2, 3, $$10, $$4);
               this.a($$0, dko.cx.m().b(dtr.g, jm.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dko.n.m(), dko.n.m(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dko.n.m(), dko.n.m(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dko.cs.m(), dko.cs.m(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dko.cs.m(), dko.cs.m(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dko.cs.m(), dko.cs.m(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dko.cs.m(), dko.cs.m(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, dko.cs.m(), dko.cs.m(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, dko.cs.m(), dko.cs.m(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, dko.cs.m(), dko.cs.m(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, dko.n.m(), dko.n.m(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, dko.n.m(), dko.n.m(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, dko.n.m(), dko.n.m(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, dko.n.m(), dko.n.m(), false);
            this.a($$0, dko.n.m(), 9, 5, 11, $$4);
            this.a($$0, dko.n.m(), 8, 5, 11, $$4);
            this.a($$0, dko.n.m(), 9, 5, 10, $$4);
            dxv $$12 = dko.eh.m().b(dnl.d, Boolean.valueOf(true)).b(dnl.b, Boolean.valueOf(true));
            dxv $$13 = dko.eh.m().b(dnl.a, Boolean.valueOf(true)).b(dnl.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, dko.eh.m().b(dnl.a, Boolean.valueOf(true)).b(dnl.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, dko.eh.m().b(dnl.c, Boolean.valueOf(true)).b(dnl.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, dko.eh.m().b(dnl.a, Boolean.valueOf(true)).b(dnl.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, dko.eh.m().b(dnl.c, Boolean.valueOf(true)).b(dnl.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, dko.eh.m().b(dnl.a, Boolean.valueOf(true)).b(dnl.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            dxv $$15 = dko.cX.m().b(dou.b, jm.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            dxv $$18 = dko.eh.m().b(dnl.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            dxv $$19 = dko.eh.m().b(dnl.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            dxv $$20 = $$13.b(dnl.d, Boolean.valueOf(true)).b(dnl.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.b(dnl.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.b(dnl.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.b(dnl.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.b(dnl.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            dxv $$21 = dko.cw.m();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, ewl.v);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, ewl.v);
         }
      }
   }

   static class f {
      public final Class<? extends erc.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends erc.p> $$0, int $$1, int $$2) {
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

   public static class g extends erc.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, eoc $$1, jm $$2) {
         super(epb.y, $$0, $$1);
         this.a($$2);
      }

      public g(ux $$0) {
         super(epb.y, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(epa $$0, ux $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(eoo $$0, eop $$1, bam $$2) {
         if ($$0 != null) {
            ((erc.m)$$0).b = this;
         }
      }

      public static erc.g a(eop $$0, int $$1, int $$2, int $$3, jm $$4, int $$5) {
         eoc $$6 = eoc.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new erc.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dig $$0, die $$1, dzr $$2, bam $$3, eoc $$4, dgo $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, erc.k);
         this.a($$0, $$3, $$4, erc.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, erc.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, erc.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, erc.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, erc.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, erc.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, erc.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, dko.K.m(), dko.K.m(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, dko.K.m(), dko.K.m(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, erc.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, dko.K.m(), dko.K.m(), false);
         dxv $$8 = dko.fk.m().b(dop.a, Boolean.valueOf(true)).b(dop.c, Boolean.valueOf(true));
         dxv $$9 = dko.fk.m().b(dop.d, Boolean.valueOf(true)).b(dop.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         dxv $$12 = dko.fx.m().b(dsj.b, jm.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, erc.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, erc.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, erc.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         dxv $$14 = dko.fM.m().b(dnd.b, jm.c);
         dxv $$15 = dko.fM.m().b(dnd.b, jm.d);
         dxv $$16 = dko.fM.m().b(dnd.b, jm.f);
         dxv $$17 = dko.fM.m().b(dnd.b, jm.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.b(dnd.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.b(dnd.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.b(dnd.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.b(dnd.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.b(dnd.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.b(dnd.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.b(dnd.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.b(dnd.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.b(dnd.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.b(dnd.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.b(dnd.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.b(dnd.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            dxv $$21 = dko.fL.m();
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
               $$0.a($$22, dko.cA.m(), 2);
               if ($$0.c_($$22) instanceof dwo $$24) {
                  $$24.a(bvr.be, $$3);
               }
            }
         }
      }
   }

   public static class h extends erc.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, bam $$1, eoc $$2, jm $$3) {
         super(epb.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(ux $$0) {
         super(epb.z, $$0);
      }

      @Override
      public void a(eoo $$0, eop $$1, bam $$2) {
         this.a((erc.m)$$0, $$1, $$2, 1, 1);
      }

      public static erc.h a(eop $$0, bam $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         eoc $$7 = eoc.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new erc.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dig $$0, die $$1, dzr $$2, bam $$3, eoc $$4, dgo $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, erc.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, erc.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, erc.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, erc.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, erc.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, dko.fk.m().b(dop.a, Boolean.valueOf(true)).b(dop.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, dko.fk.m().b(dop.a, Boolean.valueOf(true)).b(dop.c, Boolean.valueOf(true)).b(dop.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, dko.fk.m().b(dop.a, Boolean.valueOf(true)).b(dop.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, dko.fk.m().b(dop.d, Boolean.valueOf(true)).b(dop.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, dko.fk.m().b(dop.d, Boolean.valueOf(true)).b(dop.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, dko.fk.m().b(dop.d, Boolean.valueOf(true)).b(dop.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, dko.fk.m().b(dop.a, Boolean.valueOf(true)).b(dop.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, dko.fk.m().b(dop.a, Boolean.valueOf(true)).b(dop.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         dxv $$8 = dko.dK.m().b(dmu.b, jm.e);
         dxv $$9 = dko.dK.m().b(dmu.b, jm.e).b(dmu.f, dyq.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends erc.q {
      public i(int $$0, bam $$1, eoc $$2, jm $$3) {
         super(epb.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(ux $$0) {
         super(epb.A, $$0);
      }

      @Override
      public void a(eoo $$0, eop $$1, bam $$2) {
         jm $$3 = this.i();
         if ($$3 != jm.c && $$3 != jm.f) {
            this.b((erc.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((erc.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static erc.i a(eop $$0, bam $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         eoc $$7 = eoc.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new erc.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dig $$0, die $$1, dzr $$2, bam $$3, eoc $$4, dgo $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, erc.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         jm $$7 = this.i();
         if ($$7 != jm.c && $$7 != jm.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends erc.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, bam $$1, eoc $$2, jm $$3) {
         super(epb.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(ux $$0) {
         super(epb.B, $$0);
         this.d = $$0.h("Type");
      }

      @Override
      protected void a(epa $$0, ux $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(eoo $$0, eop $$1, bam $$2) {
         this.a((erc.m)$$0, $$1, $$2, 4, 1);
         this.b((erc.m)$$0, $$1, $$2, 1, 4);
         this.c((erc.m)$$0, $$1, $$2, 1, 4);
      }

      public static erc.j a(eop $$0, bam $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         eoc $$7 = eoc.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new erc.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dig $$0, die $$1, dzr $$2, bam $$3, eoc $$4, dgo $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, erc.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, dko.eV.m(), 5, 1, 5, $$4);
               this.a($$0, dko.eV.m(), 5, 2, 5, $$4);
               this.a($$0, dko.eV.m(), 5, 3, 5, $$4);
               this.a($$0, dko.cx.m().b(dtr.g, jm.e), 4, 3, 5, $$4);
               this.a($$0, dko.cx.m().b(dtr.g, jm.f), 6, 3, 5, $$4);
               this.a($$0, dko.cx.m().b(dtr.g, jm.d), 5, 3, 4, $$4);
               this.a($$0, dko.cx.m().b(dtr.g, jm.c), 5, 3, 6, $$4);
               this.a($$0, dko.jW.m(), 4, 1, 4, $$4);
               this.a($$0, dko.jW.m(), 4, 1, 5, $$4);
               this.a($$0, dko.jW.m(), 4, 1, 6, $$4);
               this.a($$0, dko.jW.m(), 6, 1, 4, $$4);
               this.a($$0, dko.jW.m(), 6, 1, 5, $$4);
               this.a($$0, dko.jW.m(), 6, 1, 6, $$4);
               this.a($$0, dko.jW.m(), 5, 1, 4, $$4);
               this.a($$0, dko.jW.m(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, dko.eV.m(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, dko.eV.m(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, dko.eV.m(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, dko.eV.m(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, dko.eV.m(), 5, 1, 5, $$4);
               this.a($$0, dko.eV.m(), 5, 2, 5, $$4);
               this.a($$0, dko.eV.m(), 5, 3, 5, $$4);
               this.a($$0, dko.J.m(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, dko.m.m(), 1, 3, $$8, $$4);
                  this.a($$0, dko.m.m(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, dko.m.m(), $$9, 3, 1, $$4);
                  this.a($$0, dko.m.m(), $$9, 3, 9, $$4);
               }

               this.a($$0, dko.m.m(), 5, 1, 4, $$4);
               this.a($$0, dko.m.m(), 5, 1, 6, $$4);
               this.a($$0, dko.m.m(), 5, 3, 4, $$4);
               this.a($$0, dko.m.m(), 5, 3, 6, $$4);
               this.a($$0, dko.m.m(), 4, 1, 5, $$4);
               this.a($$0, dko.m.m(), 6, 1, 5, $$4);
               this.a($$0, dko.m.m(), 4, 3, 5, $$4);
               this.a($$0, dko.m.m(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, dko.m.m(), 4, $$10, 4, $$4);
                  this.a($$0, dko.m.m(), 6, $$10, 4, $$4);
                  this.a($$0, dko.m.m(), 4, $$10, 6, $$4);
                  this.a($$0, dko.m.m(), 6, $$10, 6, $$4);
               }

               this.a($$0, dko.cx.m(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, dko.n.m(), 2, 3, $$11, $$4);
                  this.a($$0, dko.n.m(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, dko.n.m(), 4, 3, $$11, $$4);
                     this.a($$0, dko.n.m(), 5, 3, $$11, $$4);
                     this.a($$0, dko.n.m(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, dko.n.m(), 7, 3, $$11, $$4);
                  this.a($$0, dko.n.m(), 8, 3, $$11, $$4);
               }

               dxv $$12 = dko.cX.m().b(dou.b, jm.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, ewl.w);
         }
      }
   }

   static class k extends eoo.a {
      @Override
      public void a(bam $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = dko.eX.m();
            } else if ($$5 < 0.5F) {
               this.a = dko.eW.m();
            } else if ($$5 < 0.55F) {
               this.a = dko.fd.m();
            } else {
               this.a = dko.eV.m();
            }
         } else {
            this.a = dko.nx.m();
         }
      }
   }

   public static class l extends erc.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(epb $$0, int $$1, int $$2, int $$3, jm $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = erc.p.a.a;
      }

      public l(int $$0, bam $$1, eoc $$2, jm $$3) {
         super(epb.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(epb $$0, ux $$1) {
         super($$0, $$1);
         this.d = $$1.q("Source");
      }

      public l(ux $$0) {
         this(epb.C, $$0);
      }

      @Override
      protected void a(epa $$0, ux $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(eoo $$0, eop $$1, bam $$2) {
         if (this.d) {
            erc.i = erc.c.class;
         }

         this.a((erc.m)$$0, $$1, $$2, 1, 1);
      }

      public static erc.l a(eop $$0, bam $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         eoc $$7 = eoc.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new erc.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dig $$0, die $$1, dzr $$2, bam $$3, eoc $$4, dgo $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, erc.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, erc.p.a.a, 1, 1, 4);
         this.a($$0, dko.eV.m(), 2, 6, 1, $$4);
         this.a($$0, dko.eV.m(), 1, 5, 1, $$4);
         this.a($$0, dko.jW.m(), 1, 6, 1, $$4);
         this.a($$0, dko.eV.m(), 1, 5, 2, $$4);
         this.a($$0, dko.eV.m(), 1, 4, 3, $$4);
         this.a($$0, dko.jW.m(), 1, 5, 3, $$4);
         this.a($$0, dko.eV.m(), 2, 4, 3, $$4);
         this.a($$0, dko.eV.m(), 3, 3, 3, $$4);
         this.a($$0, dko.jW.m(), 3, 4, 3, $$4);
         this.a($$0, dko.eV.m(), 3, 3, 2, $$4);
         this.a($$0, dko.eV.m(), 3, 2, 1, $$4);
         this.a($$0, dko.jW.m(), 3, 3, 1, $$4);
         this.a($$0, dko.eV.m(), 2, 2, 1, $$4);
         this.a($$0, dko.eV.m(), 1, 1, 1, $$4);
         this.a($$0, dko.jW.m(), 1, 2, 1, $$4);
         this.a($$0, dko.eV.m(), 1, 1, 2, $$4);
         this.a($$0, dko.jW.m(), 1, 1, 3, $$4);
      }
   }

   public static class m extends erc.l {
      public erc.f a;
      @Nullable
      public erc.g b;
      public final List<eoo> c = Lists.newArrayList();

      public m(bam $$0, int $$1, int $$2) {
         super(epb.D, 0, $$1, $$2, a($$0));
      }

      public m(ux $$0) {
         super(epb.D, $$0);
      }

      @Override
      public jh h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends erc.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, bam $$1, eoc $$2, jm $$3) {
         super(epb.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(ux $$0) {
         super(epb.E, $$0);
         this.d = $$0.q("Left");
         this.i = $$0.q("Right");
      }

      @Override
      protected void a(epa $$0, ux $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(eoo $$0, eop $$1, bam $$2) {
         this.a((erc.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((erc.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((erc.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static erc.n a(eop $$0, bam $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         eoc $$7 = eoc.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new erc.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dig $$0, die $$1, dzr $$2, bam $$3, eoc $$4, dgo $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, erc.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, erc.p.a.a, 1, 1, 6);
         dxv $$7 = dko.cx.m().b(dtr.g, jm.f);
         dxv $$8 = dko.cx.m().b(dtr.g, jm.e);
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

   public static class o extends erc.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, bam $$1, eoc $$2, jm $$3) {
         super(epb.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(ux $$0) {
         super(epb.F, $$0);
      }

      @Override
      public void a(eoo $$0, eop $$1, bam $$2) {
         this.a((erc.m)$$0, $$1, $$2, 1, 1);
      }

      public static erc.o a(eop $$0, bam $$1, int $$2, int $$3, int $$4, jm $$5, int $$6) {
         eoc $$7 = eoc.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new erc.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dig $$0, die $$1, dzr $$2, bam $$3, eoc $$4, dgo $$5, jh $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, erc.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, erc.p.a.a, 1, 1, 7);
         dxv $$7 = dko.cZ.m().b(dsj.b, jm.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, dko.eV.m(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dko.eV.m(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dko.eV.m(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends eoo {
      protected erc.p.a h = erc.p.a.a;

      protected p(epb $$0, int $$1, eoc $$2) {
         super($$0, $$1, $$2);
      }

      public p(epb $$0, ux $$1) {
         super($$0, $$1);
         this.h = erc.p.a.valueOf($$1.l("EntryDoor"));
      }

      @Override
      protected void a(epa $$0, ux $$1) {
         $$1.a("EntryDoor", this.h.name());
      }

      protected void a(dig $$0, bam $$1, eoc $$2, erc.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, dko.eV.m(), $$4, $$5, $$6, $$2);
               this.a($$0, dko.eV.m(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dko.eV.m(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dko.eV.m(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dko.eV.m(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dko.eV.m(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dko.eV.m(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dko.cW.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dko.cW.m().b(dmu.f, dyq.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, dko.nx.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dko.nx.m(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dko.fk.m().b(dop.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, dko.fk.m().b(dop.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dko.fk.m().b(dop.b, Boolean.valueOf(true)).b(dop.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dko.fk.m().b(dop.b, Boolean.valueOf(true)).b(dop.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dko.fk.m().b(dop.b, Boolean.valueOf(true)).b(dop.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dko.fk.m().b(dop.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dko.fk.m().b(dop.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, dko.eV.m(), $$4, $$5, $$6, $$2);
               this.a($$0, dko.eV.m(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dko.eV.m(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dko.eV.m(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dko.eV.m(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dko.eV.m(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dko.eV.m(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dko.dK.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dko.dK.m().b(dmu.f, dyq.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dko.dZ.m().b(dkx.aF, jm.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, dko.dZ.m().b(dkx.aF, jm.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected erc.p.a b(bam $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return erc.p.a.a;
            case 2:
               return erc.p.a.b;
            case 3:
               return erc.p.a.c;
            case 4:
               return erc.p.a.d;
         }
      }

      @Nullable
      protected eoo a(erc.m $$0, eop $$1, bam $$2, int $$3, int $$4) {
         jm $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return erc.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$5, this.g());
               case d:
                  return erc.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$5, this.g());
               case e:
                  return erc.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
               case f:
                  return erc.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected eoo b(erc.m $$0, eop $$1, bam $$2, int $$3, int $$4) {
         jm $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return erc.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jm.e, this.g());
               case d:
                  return erc.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jm.e, this.g());
               case e:
                  return erc.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jm.c, this.g());
               case f:
                  return erc.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jm.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected eoo c(erc.m $$0, eop $$1, bam $$2, int $$3, int $$4) {
         jm $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return erc.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jm.f, this.g());
               case d:
                  return erc.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jm.f, this.g());
               case e:
                  return erc.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jm.d, this.g());
               case f:
                  return erc.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jm.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(eoc $$0) {
         return $$0 != null && $$0.i() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;
      }
   }

   public abstract static class q extends erc.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(epb $$0, int $$1, eoc $$2) {
         super($$0, $$1, $$2);
      }

      public q(epb $$0, ux $$1) {
         super($$0, $$1);
      }
   }
}
