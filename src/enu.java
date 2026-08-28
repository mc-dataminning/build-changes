import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class enu {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final enu.f[] g = new enu.f[]{
      new enu.f(enu.n.class, 40, 0),
      new enu.f(enu.h.class, 5, 5),
      new enu.f(enu.d.class, 20, 0),
      new enu.f(enu.i.class, 20, 0),
      new enu.f(enu.j.class, 10, 6),
      new enu.f(enu.o.class, 5, 5),
      new enu.f(enu.l.class, 5, 5),
      new enu.f(enu.c.class, 5, 4),
      new enu.f(enu.a.class, 5, 4),
      new enu.f(enu.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new enu.f(enu.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<enu.f> h;
   static Class<? extends enu.p> i;
   private static int j;
   static final enu.k k = new enu.k();

   public static void a() {
      h = Lists.newArrayList();

      for (enu.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (enu.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static enu.p a(Class<? extends enu.p> $$0, elh $$1, azl $$2, int $$3, int $$4, int $$5, @Nullable jj $$6, int $$7) {
      enu.p $$8 = null;
      if ($$0 == enu.n.class) {
         $$8 = enu.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == enu.h.class) {
         $$8 = enu.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == enu.d.class) {
         $$8 = enu.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == enu.i.class) {
         $$8 = enu.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == enu.j.class) {
         $$8 = enu.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == enu.o.class) {
         $$8 = enu.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == enu.l.class) {
         $$8 = enu.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == enu.c.class) {
         $$8 = enu.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == enu.a.class) {
         $$8 = enu.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == enu.e.class) {
         $$8 = enu.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == enu.g.class) {
         $$8 = enu.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static enu.p a(enu.m $$0, elh $$1, azl $$2, int $$3, int $$4, int $$5, jj $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            enu.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (enu.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  enu.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         eku $$13 = enu.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.i() > 1 ? new enu.b($$7, $$13, $$6) : null;
      }
   }

   static elg b(enu.m $$0, elh $$1, azl $$2, int $$3, int $$4, int $$5, @Nullable jj $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
         elg $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends enu.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, azl $$1, eku $$2, jj $$3) {
         super(elt.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(uf $$0) {
         super(elt.t, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(els $$0, uf $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(elg $$0, elh $$1, azl $$2) {
         this.a((enu.m)$$0, $$1, $$2, 1, 1);
      }

      public static enu.a a(elh $$0, azl $$1, int $$2, int $$3, int $$4, jj $$5, int $$6) {
         eku $$7 = eku.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new enu.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfd $$0, dfb $$1, dwl $$2, azl $$3, eku $$4, ddm $$5, je $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, enu.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, enu.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, dhl.eH.o(), dhl.eH.o(), false);
         this.a($$0, dhl.jK.o(), 3, 1, 1, $$4);
         this.a($$0, dhl.jK.o(), 3, 1, 5, $$4);
         this.a($$0, dhl.jK.o(), 3, 2, 2, $$4);
         this.a($$0, dhl.jK.o(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, dhl.jK.o(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, etd.y);
         }
      }
   }

   public static class b extends enu.p {
      private final int a;

      public b(int $$0, eku $$1, jj $$2) {
         super(elt.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != jj.c && $$2 != jj.d ? $$1.d() : $$1.f();
      }

      public b(uf $$0) {
         super(elt.u, $$0);
         this.a = $$0.h("Steps");
      }

      @Override
      protected void a(els $$0, uf $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static eku a(elh $$0, azl $$1, int $$2, int $$3, int $$4, jj $$5) {
         int $$6 = 3;
         eku $$7 = eku.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         elg $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().i() == $$7.i()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = eku.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return eku.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(dfd $$0, dfb $$1, dwl $$2, azl $$3, eku $$4, ddm $$5, je $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, dhl.eH.o(), 0, 0, $$7, $$4);
            this.a($$0, dhl.eH.o(), 1, 0, $$7, $$4);
            this.a($$0, dhl.eH.o(), 2, 0, $$7, $$4);
            this.a($$0, dhl.eH.o(), 3, 0, $$7, $$4);
            this.a($$0, dhl.eH.o(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, dhl.eH.o(), 0, $$8, $$7, $$4);
               this.a($$0, dhl.nc.o(), 1, $$8, $$7, $$4);
               this.a($$0, dhl.nc.o(), 2, $$8, $$7, $$4);
               this.a($$0, dhl.nc.o(), 3, $$8, $$7, $$4);
               this.a($$0, dhl.eH.o(), 4, $$8, $$7, $$4);
            }

            this.a($$0, dhl.eH.o(), 0, 4, $$7, $$4);
            this.a($$0, dhl.eH.o(), 1, 4, $$7, $$4);
            this.a($$0, dhl.eH.o(), 2, 4, $$7, $$4);
            this.a($$0, dhl.eH.o(), 3, 4, $$7, $$4);
            this.a($$0, dhl.eH.o(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends enu.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, azl $$1, eku $$2, jj $$3) {
         super(elt.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(uf $$0) {
         super(elt.v, $$0);
         this.d = $$0.q("leftLow");
         this.i = $$0.q("leftHigh");
         this.j = $$0.q("rightLow");
         this.k = $$0.q("rightHigh");
      }

      @Override
      protected void a(els $$0, uf $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(elg $$0, elh $$1, azl $$2) {
         int $$3 = 3;
         int $$4 = 5;
         jj $$5 = this.i();
         if ($$5 == jj.e || $$5 == jj.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((enu.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((enu.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((enu.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((enu.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((enu.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static enu.c a(elh $$0, azl $$1, int $$2, int $$3, int $$4, jj $$5, int $$6) {
         eku $$7 = eku.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new enu.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfd $$0, dfb $$1, dwl $$2, azl $$3, eku $$4, ddm $$5, je $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, enu.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, enu.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, enu.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, enu.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, enu.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, enu.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, dhl.jE.o(), dhl.jE.o(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, dhl.jE.o(), dhl.jE.o(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, enu.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, dhl.jE.o(), dhl.jE.o(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, dhl.jE.o(), dhl.jE.o(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, dhl.jE.o(), dhl.jE.o(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, dhl.jE.o(), dhl.jE.o(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, dhl.jE.o().b(don.b, dvw.c), dhl.jE.o().b(don.b, dvw.c), false);
         this.a($$0, dhl.cq.o().b(dqm.g, jj.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends enu.q {
      public d(int $$0, azl $$1, eku $$2, jj $$3) {
         super(elt.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(uf $$0) {
         super(elt.w, $$0);
      }

      @Override
      public void a(elg $$0, elh $$1, azl $$2) {
         jj $$3 = this.i();
         if ($$3 != jj.c && $$3 != jj.f) {
            this.c((enu.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((enu.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static enu.d a(elh $$0, azl $$1, int $$2, int $$3, int $$4, jj $$5, int $$6) {
         eku $$7 = eku.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new enu.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfd $$0, dfb $$1, dwl $$2, azl $$3, eku $$4, ddm $$5, je $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, enu.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         jj $$7 = this.i();
         if ($$7 != jj.c && $$7 != jj.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends enu.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, azl $$1, eku $$2, jj $$3) {
         super(elt.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.e() > 6;
      }

      public e(uf $$0) {
         super(elt.x, $$0);
         this.i = $$0.q("Tall");
      }

      @Override
      protected void a(els $$0, uf $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static enu.e a(elh $$0, azl $$1, int $$2, int $$3, int $$4, jj $$5, int $$6) {
         eku $$7 = eku.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = eku.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new enu.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(dfd $$0, dfb $$1, dwl $$2, azl $$3, eku $$4, ddm $$5, je $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, enu.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, dhl.bs.o(), dhl.bs.o(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dhl.n.o(), dhl.n.o(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dhl.n.o(), dhl.n.o(), false);
               this.a($$0, dhl.cq.o().b(dqm.g, jj.f), 2, 3, $$10, $$4);
               this.a($$0, dhl.cq.o().b(dqm.g, jj.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dhl.n.o(), dhl.n.o(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dhl.n.o(), dhl.n.o(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dhl.cl.o(), dhl.cl.o(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dhl.cl.o(), dhl.cl.o(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dhl.cl.o(), dhl.cl.o(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dhl.cl.o(), dhl.cl.o(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, dhl.cl.o(), dhl.cl.o(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, dhl.cl.o(), dhl.cl.o(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, dhl.cl.o(), dhl.cl.o(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, dhl.n.o(), dhl.n.o(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, dhl.n.o(), dhl.n.o(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, dhl.n.o(), dhl.n.o(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, dhl.n.o(), dhl.n.o(), false);
            this.a($$0, dhl.n.o(), 9, 5, 11, $$4);
            this.a($$0, dhl.n.o(), 8, 5, 11, $$4);
            this.a($$0, dhl.n.o(), 9, 5, 10, $$4);
            duo $$12 = dhl.dU.o().b(dkh.d, Boolean.valueOf(true)).b(dkh.b, Boolean.valueOf(true));
            duo $$13 = dhl.dU.o().b(dkh.a, Boolean.valueOf(true)).b(dkh.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, dhl.dU.o().b(dkh.a, Boolean.valueOf(true)).b(dkh.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, dhl.dU.o().b(dkh.c, Boolean.valueOf(true)).b(dkh.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, dhl.dU.o().b(dkh.a, Boolean.valueOf(true)).b(dkh.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, dhl.dU.o().b(dkh.c, Boolean.valueOf(true)).b(dkh.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, dhl.dU.o().b(dkh.a, Boolean.valueOf(true)).b(dkh.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            duo $$15 = dhl.cO.o().b(dlp.b, jj.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            duo $$18 = dhl.dU.o().b(dkh.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            duo $$19 = dhl.dU.o().b(dkh.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            duo $$20 = $$13.b(dkh.d, Boolean.valueOf(true)).b(dkh.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.b(dkh.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.b(dkh.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.b(dkh.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.b(dkh.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            duo $$21 = dhl.cp.o();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, etd.w);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, etd.w);
         }
      }
   }

   static class f {
      public final Class<? extends enu.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends enu.p> $$0, int $$1, int $$2) {
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

   public static class g extends enu.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, eku $$1, jj $$2) {
         super(elt.y, $$0, $$1);
         this.a($$2);
      }

      public g(uf $$0) {
         super(elt.y, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(els $$0, uf $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(elg $$0, elh $$1, azl $$2) {
         if ($$0 != null) {
            ((enu.m)$$0).b = this;
         }
      }

      public static enu.g a(elh $$0, int $$1, int $$2, int $$3, jj $$4, int $$5) {
         eku $$6 = eku.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new enu.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dfd $$0, dfb $$1, dwl $$2, azl $$3, eku $$4, ddm $$5, je $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, enu.k);
         this.a($$0, $$3, $$4, enu.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, enu.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, enu.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, enu.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, enu.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, enu.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, enu.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, dhl.H.o(), dhl.H.o(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, dhl.H.o(), dhl.H.o(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, enu.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, dhl.H.o(), dhl.H.o(), false);
         duo $$8 = dhl.eW.o().b(dlk.a, Boolean.valueOf(true)).b(dlk.c, Boolean.valueOf(true));
         duo $$9 = dhl.eW.o().b(dlk.d, Boolean.valueOf(true)).b(dlk.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         duo $$12 = dhl.fj.o().b(dpe.b, jj.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, enu.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, enu.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, enu.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         duo $$14 = dhl.fy.o().b(djy.b, jj.c);
         duo $$15 = dhl.fy.o().b(djy.b, jj.d);
         duo $$16 = dhl.fy.o().b(djy.b, jj.f);
         duo $$17 = dhl.fy.o().b(djy.b, jj.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.b(djy.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.b(djy.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.b(djy.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.b(djy.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.b(djy.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.b(djy.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.b(djy.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.b(djy.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.b(djy.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.b(djy.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.b(djy.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.b(djy.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            duo $$21 = dhl.fx.o();
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
            je $$22 = this.b(5, 3, 6);
            if ($$4.b($$22)) {
               this.d = true;
               $$0.a($$22, dhl.ct.o(), 2);
               if ($$0.c_($$22) instanceof dti $$24) {
                  $$24.a(btv.aM, $$3);
               }
            }
         }
      }
   }

   public static class h extends enu.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, azl $$1, eku $$2, jj $$3) {
         super(elt.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(uf $$0) {
         super(elt.z, $$0);
      }

      @Override
      public void a(elg $$0, elh $$1, azl $$2) {
         this.a((enu.m)$$0, $$1, $$2, 1, 1);
      }

      public static enu.h a(elh $$0, azl $$1, int $$2, int $$3, int $$4, jj $$5, int $$6) {
         eku $$7 = eku.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new enu.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfd $$0, dfb $$1, dwl $$2, azl $$3, eku $$4, ddm $$5, je $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, enu.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, enu.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, enu.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, enu.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, enu.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, dhl.eW.o().b(dlk.a, Boolean.valueOf(true)).b(dlk.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, dhl.eW.o().b(dlk.a, Boolean.valueOf(true)).b(dlk.c, Boolean.valueOf(true)).b(dlk.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, dhl.eW.o().b(dlk.a, Boolean.valueOf(true)).b(dlk.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, dhl.eW.o().b(dlk.d, Boolean.valueOf(true)).b(dlk.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, dhl.eW.o().b(dlk.d, Boolean.valueOf(true)).b(dlk.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, dhl.eW.o().b(dlk.d, Boolean.valueOf(true)).b(dlk.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, dhl.eW.o().b(dlk.a, Boolean.valueOf(true)).b(dlk.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, dhl.eW.o().b(dlk.a, Boolean.valueOf(true)).b(dlk.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         duo $$8 = dhl.dy.o().b(djp.b, jj.e);
         duo $$9 = dhl.dy.o().b(djp.b, jj.e).b(djp.f, dvk.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends enu.q {
      public i(int $$0, azl $$1, eku $$2, jj $$3) {
         super(elt.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(uf $$0) {
         super(elt.A, $$0);
      }

      @Override
      public void a(elg $$0, elh $$1, azl $$2) {
         jj $$3 = this.i();
         if ($$3 != jj.c && $$3 != jj.f) {
            this.b((enu.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((enu.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static enu.i a(elh $$0, azl $$1, int $$2, int $$3, int $$4, jj $$5, int $$6) {
         eku $$7 = eku.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new enu.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfd $$0, dfb $$1, dwl $$2, azl $$3, eku $$4, ddm $$5, je $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, enu.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         jj $$7 = this.i();
         if ($$7 != jj.c && $$7 != jj.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends enu.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, azl $$1, eku $$2, jj $$3) {
         super(elt.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(uf $$0) {
         super(elt.B, $$0);
         this.d = $$0.h("Type");
      }

      @Override
      protected void a(els $$0, uf $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(elg $$0, elh $$1, azl $$2) {
         this.a((enu.m)$$0, $$1, $$2, 4, 1);
         this.b((enu.m)$$0, $$1, $$2, 1, 4);
         this.c((enu.m)$$0, $$1, $$2, 1, 4);
      }

      public static enu.j a(elh $$0, azl $$1, int $$2, int $$3, int $$4, jj $$5, int $$6) {
         eku $$7 = eku.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new enu.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfd $$0, dfb $$1, dwl $$2, azl $$3, eku $$4, ddm $$5, je $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, enu.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, dhl.eH.o(), 5, 1, 5, $$4);
               this.a($$0, dhl.eH.o(), 5, 2, 5, $$4);
               this.a($$0, dhl.eH.o(), 5, 3, 5, $$4);
               this.a($$0, dhl.cq.o().b(dqm.g, jj.e), 4, 3, 5, $$4);
               this.a($$0, dhl.cq.o().b(dqm.g, jj.f), 6, 3, 5, $$4);
               this.a($$0, dhl.cq.o().b(dqm.g, jj.d), 5, 3, 4, $$4);
               this.a($$0, dhl.cq.o().b(dqm.g, jj.c), 5, 3, 6, $$4);
               this.a($$0, dhl.jE.o(), 4, 1, 4, $$4);
               this.a($$0, dhl.jE.o(), 4, 1, 5, $$4);
               this.a($$0, dhl.jE.o(), 4, 1, 6, $$4);
               this.a($$0, dhl.jE.o(), 6, 1, 4, $$4);
               this.a($$0, dhl.jE.o(), 6, 1, 5, $$4);
               this.a($$0, dhl.jE.o(), 6, 1, 6, $$4);
               this.a($$0, dhl.jE.o(), 5, 1, 4, $$4);
               this.a($$0, dhl.jE.o(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, dhl.eH.o(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, dhl.eH.o(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, dhl.eH.o(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, dhl.eH.o(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, dhl.eH.o(), 5, 1, 5, $$4);
               this.a($$0, dhl.eH.o(), 5, 2, 5, $$4);
               this.a($$0, dhl.eH.o(), 5, 3, 5, $$4);
               this.a($$0, dhl.G.o(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, dhl.m.o(), 1, 3, $$8, $$4);
                  this.a($$0, dhl.m.o(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, dhl.m.o(), $$9, 3, 1, $$4);
                  this.a($$0, dhl.m.o(), $$9, 3, 9, $$4);
               }

               this.a($$0, dhl.m.o(), 5, 1, 4, $$4);
               this.a($$0, dhl.m.o(), 5, 1, 6, $$4);
               this.a($$0, dhl.m.o(), 5, 3, 4, $$4);
               this.a($$0, dhl.m.o(), 5, 3, 6, $$4);
               this.a($$0, dhl.m.o(), 4, 1, 5, $$4);
               this.a($$0, dhl.m.o(), 6, 1, 5, $$4);
               this.a($$0, dhl.m.o(), 4, 3, 5, $$4);
               this.a($$0, dhl.m.o(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, dhl.m.o(), 4, $$10, 4, $$4);
                  this.a($$0, dhl.m.o(), 6, $$10, 4, $$4);
                  this.a($$0, dhl.m.o(), 4, $$10, 6, $$4);
                  this.a($$0, dhl.m.o(), 6, $$10, 6, $$4);
               }

               this.a($$0, dhl.cq.o(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, dhl.n.o(), 2, 3, $$11, $$4);
                  this.a($$0, dhl.n.o(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, dhl.n.o(), 4, 3, $$11, $$4);
                     this.a($$0, dhl.n.o(), 5, 3, $$11, $$4);
                     this.a($$0, dhl.n.o(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, dhl.n.o(), 7, 3, $$11, $$4);
                  this.a($$0, dhl.n.o(), 8, 3, $$11, $$4);
               }

               duo $$12 = dhl.cO.o().b(dlp.b, jj.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, etd.x);
         }
      }
   }

   static class k extends elg.a {
      @Override
      public void a(azl $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = dhl.eJ.o();
            } else if ($$5 < 0.5F) {
               this.a = dhl.eI.o();
            } else if ($$5 < 0.55F) {
               this.a = dhl.eP.o();
            } else {
               this.a = dhl.eH.o();
            }
         } else {
            this.a = dhl.nc.o();
         }
      }
   }

   public static class l extends enu.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(elt $$0, int $$1, int $$2, int $$3, jj $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = enu.p.a.a;
      }

      public l(int $$0, azl $$1, eku $$2, jj $$3) {
         super(elt.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(elt $$0, uf $$1) {
         super($$0, $$1);
         this.d = $$1.q("Source");
      }

      public l(uf $$0) {
         this(elt.C, $$0);
      }

      @Override
      protected void a(els $$0, uf $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(elg $$0, elh $$1, azl $$2) {
         if (this.d) {
            enu.i = enu.c.class;
         }

         this.a((enu.m)$$0, $$1, $$2, 1, 1);
      }

      public static enu.l a(elh $$0, azl $$1, int $$2, int $$3, int $$4, jj $$5, int $$6) {
         eku $$7 = eku.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new enu.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfd $$0, dfb $$1, dwl $$2, azl $$3, eku $$4, ddm $$5, je $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, enu.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, enu.p.a.a, 1, 1, 4);
         this.a($$0, dhl.eH.o(), 2, 6, 1, $$4);
         this.a($$0, dhl.eH.o(), 1, 5, 1, $$4);
         this.a($$0, dhl.jE.o(), 1, 6, 1, $$4);
         this.a($$0, dhl.eH.o(), 1, 5, 2, $$4);
         this.a($$0, dhl.eH.o(), 1, 4, 3, $$4);
         this.a($$0, dhl.jE.o(), 1, 5, 3, $$4);
         this.a($$0, dhl.eH.o(), 2, 4, 3, $$4);
         this.a($$0, dhl.eH.o(), 3, 3, 3, $$4);
         this.a($$0, dhl.jE.o(), 3, 4, 3, $$4);
         this.a($$0, dhl.eH.o(), 3, 3, 2, $$4);
         this.a($$0, dhl.eH.o(), 3, 2, 1, $$4);
         this.a($$0, dhl.jE.o(), 3, 3, 1, $$4);
         this.a($$0, dhl.eH.o(), 2, 2, 1, $$4);
         this.a($$0, dhl.eH.o(), 1, 1, 1, $$4);
         this.a($$0, dhl.jE.o(), 1, 2, 1, $$4);
         this.a($$0, dhl.eH.o(), 1, 1, 2, $$4);
         this.a($$0, dhl.jE.o(), 1, 1, 3, $$4);
      }
   }

   public static class m extends enu.l {
      public enu.f a;
      @Nullable
      public enu.g b;
      public final List<elg> c = Lists.newArrayList();

      public m(azl $$0, int $$1, int $$2) {
         super(elt.D, 0, $$1, $$2, a($$0));
      }

      public m(uf $$0) {
         super(elt.D, $$0);
      }

      @Override
      public je h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends enu.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, azl $$1, eku $$2, jj $$3) {
         super(elt.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(uf $$0) {
         super(elt.E, $$0);
         this.d = $$0.q("Left");
         this.i = $$0.q("Right");
      }

      @Override
      protected void a(els $$0, uf $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(elg $$0, elh $$1, azl $$2) {
         this.a((enu.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((enu.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((enu.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static enu.n a(elh $$0, azl $$1, int $$2, int $$3, int $$4, jj $$5, int $$6) {
         eku $$7 = eku.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new enu.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfd $$0, dfb $$1, dwl $$2, azl $$3, eku $$4, ddm $$5, je $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, enu.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, enu.p.a.a, 1, 1, 6);
         duo $$7 = dhl.cq.o().b(dqm.g, jj.f);
         duo $$8 = dhl.cq.o().b(dqm.g, jj.e);
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

   public static class o extends enu.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, azl $$1, eku $$2, jj $$3) {
         super(elt.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(uf $$0) {
         super(elt.F, $$0);
      }

      @Override
      public void a(elg $$0, elh $$1, azl $$2) {
         this.a((enu.m)$$0, $$1, $$2, 1, 1);
      }

      public static enu.o a(elh $$0, azl $$1, int $$2, int $$3, int $$4, jj $$5, int $$6) {
         eku $$7 = eku.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new enu.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dfd $$0, dfb $$1, dwl $$2, azl $$3, eku $$4, ddm $$5, je $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, enu.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, enu.p.a.a, 1, 1, 7);
         duo $$7 = dhl.cQ.o().b(dpe.b, jj.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, dhl.eH.o(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dhl.eH.o(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dhl.eH.o(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends elg {
      protected enu.p.a h = enu.p.a.a;

      protected p(elt $$0, int $$1, eku $$2) {
         super($$0, $$1, $$2);
      }

      public p(elt $$0, uf $$1) {
         super($$0, $$1);
         this.h = enu.p.a.valueOf($$1.l("EntryDoor"));
      }

      @Override
      protected void a(els $$0, uf $$1) {
         $$1.a("EntryDoor", this.h.name());
      }

      protected void a(dfd $$0, azl $$1, eku $$2, enu.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, dhl.eH.o(), $$4, $$5, $$6, $$2);
               this.a($$0, dhl.eH.o(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dhl.eH.o(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dhl.eH.o(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dhl.eH.o(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dhl.eH.o(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dhl.eH.o(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dhl.cN.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dhl.cN.o().b(djp.f, dvk.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, dhl.nc.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dhl.nc.o(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dhl.eW.o().b(dlk.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, dhl.eW.o().b(dlk.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dhl.eW.o().b(dlk.b, Boolean.valueOf(true)).b(dlk.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dhl.eW.o().b(dlk.b, Boolean.valueOf(true)).b(dlk.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dhl.eW.o().b(dlk.b, Boolean.valueOf(true)).b(dlk.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dhl.eW.o().b(dlk.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dhl.eW.o().b(dlk.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, dhl.eH.o(), $$4, $$5, $$6, $$2);
               this.a($$0, dhl.eH.o(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dhl.eH.o(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dhl.eH.o(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dhl.eH.o(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dhl.eH.o(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dhl.eH.o(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dhl.dy.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dhl.dy.o().b(djp.f, dvk.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dhl.dM.o().b(dht.aF, jj.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, dhl.dM.o().b(dht.aF, jj.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected enu.p.a b(azl $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return enu.p.a.a;
            case 2:
               return enu.p.a.b;
            case 3:
               return enu.p.a.c;
            case 4:
               return enu.p.a.d;
         }
      }

      @Nullable
      protected elg a(enu.m $$0, elh $$1, azl $$2, int $$3, int $$4) {
         jj $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return enu.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$5, this.g());
               case d:
                  return enu.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$5, this.g());
               case e:
                  return enu.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
               case f:
                  return enu.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected elg b(enu.m $$0, elh $$1, azl $$2, int $$3, int $$4) {
         jj $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return enu.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jj.e, this.g());
               case d:
                  return enu.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jj.e, this.g());
               case e:
                  return enu.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jj.c, this.g());
               case f:
                  return enu.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jj.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected elg c(enu.m $$0, elh $$1, azl $$2, int $$3, int $$4) {
         jj $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return enu.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jj.f, this.g());
               case d:
                  return enu.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jj.f, this.g());
               case e:
                  return enu.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jj.d, this.g());
               case f:
                  return enu.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jj.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(eku $$0) {
         return $$0 != null && $$0.i() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;
      }
   }

   public abstract static class q extends enu.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(elt $$0, int $$1, eku $$2) {
         super($$0, $$1, $$2);
      }

      public q(elt $$0, uf $$1) {
         super($$0, $$1);
      }
   }
}
