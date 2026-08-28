import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class elp {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final elp.f[] g = new elp.f[]{
      new elp.f(elp.n.class, 40, 0),
      new elp.f(elp.h.class, 5, 5),
      new elp.f(elp.d.class, 20, 0),
      new elp.f(elp.i.class, 20, 0),
      new elp.f(elp.j.class, 10, 6),
      new elp.f(elp.o.class, 5, 5),
      new elp.f(elp.l.class, 5, 5),
      new elp.f(elp.c.class, 5, 4),
      new elp.f(elp.a.class, 5, 4),
      new elp.f(elp.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new elp.f(elp.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<elp.f> h;
   static Class<? extends elp.p> i;
   private static int j;
   static final elp.k k = new elp.k();

   public static void a() {
      h = Lists.newArrayList();

      for (elp.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (elp.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static elp.p a(Class<? extends elp.p> $$0, ejc $$1, ayo $$2, int $$3, int $$4, int $$5, @Nullable jf $$6, int $$7) {
      elp.p $$8 = null;
      if ($$0 == elp.n.class) {
         $$8 = elp.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == elp.h.class) {
         $$8 = elp.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == elp.d.class) {
         $$8 = elp.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == elp.i.class) {
         $$8 = elp.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == elp.j.class) {
         $$8 = elp.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == elp.o.class) {
         $$8 = elp.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == elp.l.class) {
         $$8 = elp.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == elp.c.class) {
         $$8 = elp.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == elp.a.class) {
         $$8 = elp.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == elp.e.class) {
         $$8 = elp.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == elp.g.class) {
         $$8 = elp.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static elp.p a(elp.m $$0, ejc $$1, ayo $$2, int $$3, int $$4, int $$5, jf $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            elp.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (elp.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  elp.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         eip $$13 = elp.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.i() > 1 ? new elp.b($$7, $$13, $$6) : null;
      }
   }

   static ejb b(elp.m $$0, ejc $$1, ayo $$2, int $$3, int $$4, int $$5, @Nullable jf $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
         ejb $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends elp.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, ayo $$1, eip $$2, jf $$3) {
         super(ejo.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(tx $$0) {
         super(ejo.t, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(ejn $$0, tx $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(ejb $$0, ejc $$1, ayo $$2) {
         this.a((elp.m)$$0, $$1, $$2, 1, 1);
      }

      public static elp.a a(ejc $$0, ayo $$1, int $$2, int $$3, int $$4, jf $$5, int $$6) {
         eip $$7 = eip.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new elp.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(ddc $$0, dda $$1, dui $$2, ayo $$3, eip $$4, dbn $$5, ja $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, elp.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, elp.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, dfk.eH.o(), dfk.eH.o(), false);
         this.a($$0, dfk.jK.o(), 3, 1, 1, $$4);
         this.a($$0, dfk.jK.o(), 3, 1, 5, $$4);
         this.a($$0, dfk.jK.o(), 3, 2, 2, $$4);
         this.a($$0, dfk.jK.o(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, dfk.jK.o(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, eqs.y);
         }
      }
   }

   public static class b extends elp.p {
      private final int a;

      public b(int $$0, eip $$1, jf $$2) {
         super(ejo.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != jf.c && $$2 != jf.d ? $$1.d() : $$1.f();
      }

      public b(tx $$0) {
         super(ejo.u, $$0);
         this.a = $$0.h("Steps");
      }

      @Override
      protected void a(ejn $$0, tx $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static eip a(ejc $$0, ayo $$1, int $$2, int $$3, int $$4, jf $$5) {
         int $$6 = 3;
         eip $$7 = eip.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         ejb $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().i() == $$7.i()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = eip.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return eip.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(ddc $$0, dda $$1, dui $$2, ayo $$3, eip $$4, dbn $$5, ja $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, dfk.eH.o(), 0, 0, $$7, $$4);
            this.a($$0, dfk.eH.o(), 1, 0, $$7, $$4);
            this.a($$0, dfk.eH.o(), 2, 0, $$7, $$4);
            this.a($$0, dfk.eH.o(), 3, 0, $$7, $$4);
            this.a($$0, dfk.eH.o(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, dfk.eH.o(), 0, $$8, $$7, $$4);
               this.a($$0, dfk.nc.o(), 1, $$8, $$7, $$4);
               this.a($$0, dfk.nc.o(), 2, $$8, $$7, $$4);
               this.a($$0, dfk.nc.o(), 3, $$8, $$7, $$4);
               this.a($$0, dfk.eH.o(), 4, $$8, $$7, $$4);
            }

            this.a($$0, dfk.eH.o(), 0, 4, $$7, $$4);
            this.a($$0, dfk.eH.o(), 1, 4, $$7, $$4);
            this.a($$0, dfk.eH.o(), 2, 4, $$7, $$4);
            this.a($$0, dfk.eH.o(), 3, 4, $$7, $$4);
            this.a($$0, dfk.eH.o(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends elp.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, ayo $$1, eip $$2, jf $$3) {
         super(ejo.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(tx $$0) {
         super(ejo.v, $$0);
         this.d = $$0.q("leftLow");
         this.i = $$0.q("leftHigh");
         this.j = $$0.q("rightLow");
         this.k = $$0.q("rightHigh");
      }

      @Override
      protected void a(ejn $$0, tx $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(ejb $$0, ejc $$1, ayo $$2) {
         int $$3 = 3;
         int $$4 = 5;
         jf $$5 = this.i();
         if ($$5 == jf.e || $$5 == jf.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((elp.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((elp.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((elp.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((elp.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((elp.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static elp.c a(ejc $$0, ayo $$1, int $$2, int $$3, int $$4, jf $$5, int $$6) {
         eip $$7 = eip.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new elp.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(ddc $$0, dda $$1, dui $$2, ayo $$3, eip $$4, dbn $$5, ja $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, elp.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, elp.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, elp.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, elp.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, elp.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, elp.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, dfk.jE.o(), dfk.jE.o(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, dfk.jE.o(), dfk.jE.o(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, elp.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, dfk.jE.o(), dfk.jE.o(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, dfk.jE.o(), dfk.jE.o(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, dfk.jE.o(), dfk.jE.o(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, dfk.jE.o(), dfk.jE.o(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, dfk.jE.o().a(dml.b, dtt.c), dfk.jE.o().a(dml.b, dtt.c), false);
         this.a($$0, dfk.cq.o().a(dok.g, jf.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends elp.q {
      public d(int $$0, ayo $$1, eip $$2, jf $$3) {
         super(ejo.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(tx $$0) {
         super(ejo.w, $$0);
      }

      @Override
      public void a(ejb $$0, ejc $$1, ayo $$2) {
         jf $$3 = this.i();
         if ($$3 != jf.c && $$3 != jf.f) {
            this.c((elp.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((elp.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static elp.d a(ejc $$0, ayo $$1, int $$2, int $$3, int $$4, jf $$5, int $$6) {
         eip $$7 = eip.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new elp.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(ddc $$0, dda $$1, dui $$2, ayo $$3, eip $$4, dbn $$5, ja $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, elp.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         jf $$7 = this.i();
         if ($$7 != jf.c && $$7 != jf.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends elp.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, ayo $$1, eip $$2, jf $$3) {
         super(ejo.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.e() > 6;
      }

      public e(tx $$0) {
         super(ejo.x, $$0);
         this.i = $$0.q("Tall");
      }

      @Override
      protected void a(ejn $$0, tx $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static elp.e a(ejc $$0, ayo $$1, int $$2, int $$3, int $$4, jf $$5, int $$6) {
         eip $$7 = eip.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = eip.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new elp.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(ddc $$0, dda $$1, dui $$2, ayo $$3, eip $$4, dbn $$5, ja $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, elp.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, dfk.bs.o(), dfk.bs.o(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dfk.n.o(), dfk.n.o(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dfk.n.o(), dfk.n.o(), false);
               this.a($$0, dfk.cq.o().a(dok.g, jf.f), 2, 3, $$10, $$4);
               this.a($$0, dfk.cq.o().a(dok.g, jf.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dfk.n.o(), dfk.n.o(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dfk.n.o(), dfk.n.o(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dfk.cl.o(), dfk.cl.o(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dfk.cl.o(), dfk.cl.o(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dfk.cl.o(), dfk.cl.o(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dfk.cl.o(), dfk.cl.o(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, dfk.cl.o(), dfk.cl.o(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, dfk.cl.o(), dfk.cl.o(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, dfk.cl.o(), dfk.cl.o(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, dfk.n.o(), dfk.n.o(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, dfk.n.o(), dfk.n.o(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, dfk.n.o(), dfk.n.o(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, dfk.n.o(), dfk.n.o(), false);
            this.a($$0, dfk.n.o(), 9, 5, 11, $$4);
            this.a($$0, dfk.n.o(), 8, 5, 11, $$4);
            this.a($$0, dfk.n.o(), 9, 5, 10, $$4);
            dsl $$12 = dfk.dU.o().a(dig.d, Boolean.valueOf(true)).a(dig.b, Boolean.valueOf(true));
            dsl $$13 = dfk.dU.o().a(dig.a, Boolean.valueOf(true)).a(dig.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, dfk.dU.o().a(dig.a, Boolean.valueOf(true)).a(dig.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, dfk.dU.o().a(dig.c, Boolean.valueOf(true)).a(dig.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, dfk.dU.o().a(dig.a, Boolean.valueOf(true)).a(dig.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, dfk.dU.o().a(dig.c, Boolean.valueOf(true)).a(dig.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, dfk.dU.o().a(dig.a, Boolean.valueOf(true)).a(dig.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            dsl $$15 = dfk.cO.o().a(djo.b, jf.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            dsl $$18 = dfk.dU.o().a(dig.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            dsl $$19 = dfk.dU.o().a(dig.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            dsl $$20 = $$13.a(dig.d, Boolean.valueOf(true)).a(dig.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.a(dig.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.a(dig.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.a(dig.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.a(dig.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            dsl $$21 = dfk.cp.o();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, eqs.w);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, eqs.w);
         }
      }
   }

   static class f {
      public final Class<? extends elp.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends elp.p> $$0, int $$1, int $$2) {
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

   public static class g extends elp.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, eip $$1, jf $$2) {
         super(ejo.y, $$0, $$1);
         this.a($$2);
      }

      public g(tx $$0) {
         super(ejo.y, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(ejn $$0, tx $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(ejb $$0, ejc $$1, ayo $$2) {
         if ($$0 != null) {
            ((elp.m)$$0).b = this;
         }
      }

      public static elp.g a(ejc $$0, int $$1, int $$2, int $$3, jf $$4, int $$5) {
         eip $$6 = eip.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new elp.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(ddc $$0, dda $$1, dui $$2, ayo $$3, eip $$4, dbn $$5, ja $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, elp.k);
         this.a($$0, $$3, $$4, elp.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, elp.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, elp.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, elp.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, elp.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, elp.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, elp.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, dfk.H.o(), dfk.H.o(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, dfk.H.o(), dfk.H.o(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, elp.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, dfk.H.o(), dfk.H.o(), false);
         dsl $$8 = dfk.eW.o().a(djj.a, Boolean.valueOf(true)).a(djj.c, Boolean.valueOf(true));
         dsl $$9 = dfk.eW.o().a(djj.d, Boolean.valueOf(true)).a(djj.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         dsl $$12 = dfk.fj.o().a(dnc.b, jf.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, elp.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, elp.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, elp.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         dsl $$14 = dfk.fy.o().a(dhx.b, jf.c);
         dsl $$15 = dfk.fy.o().a(dhx.b, jf.d);
         dsl $$16 = dfk.fy.o().a(dhx.b, jf.f);
         dsl $$17 = dfk.fy.o().a(dhx.b, jf.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.a(dhx.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.a(dhx.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.a(dhx.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.a(dhx.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.a(dhx.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.a(dhx.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.a(dhx.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.a(dhx.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.a(dhx.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.a(dhx.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.a(dhx.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.a(dhx.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            dsl $$21 = dfk.fx.o();
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
            ja $$22 = this.b(5, 3, 6);
            if ($$4.b($$22)) {
               this.d = true;
               $$0.a($$22, dfk.ct.o(), 2);
               if ($$0.c_($$22) instanceof drf $$24) {
                  $$24.a(bsn.aM, $$3);
               }
            }
         }
      }
   }

   public static class h extends elp.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, ayo $$1, eip $$2, jf $$3) {
         super(ejo.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(tx $$0) {
         super(ejo.z, $$0);
      }

      @Override
      public void a(ejb $$0, ejc $$1, ayo $$2) {
         this.a((elp.m)$$0, $$1, $$2, 1, 1);
      }

      public static elp.h a(ejc $$0, ayo $$1, int $$2, int $$3, int $$4, jf $$5, int $$6) {
         eip $$7 = eip.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new elp.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(ddc $$0, dda $$1, dui $$2, ayo $$3, eip $$4, dbn $$5, ja $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, elp.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, elp.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, elp.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, elp.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, elp.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, dfk.eW.o().a(djj.a, Boolean.valueOf(true)).a(djj.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, dfk.eW.o().a(djj.a, Boolean.valueOf(true)).a(djj.c, Boolean.valueOf(true)).a(djj.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, dfk.eW.o().a(djj.a, Boolean.valueOf(true)).a(djj.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, dfk.eW.o().a(djj.d, Boolean.valueOf(true)).a(djj.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, dfk.eW.o().a(djj.d, Boolean.valueOf(true)).a(djj.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, dfk.eW.o().a(djj.d, Boolean.valueOf(true)).a(djj.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, dfk.eW.o().a(djj.a, Boolean.valueOf(true)).a(djj.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, dfk.eW.o().a(djj.a, Boolean.valueOf(true)).a(djj.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         dsl $$8 = dfk.dy.o().a(dho.b, jf.e);
         dsl $$9 = dfk.dy.o().a(dho.b, jf.e).a(dho.f, dth.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends elp.q {
      public i(int $$0, ayo $$1, eip $$2, jf $$3) {
         super(ejo.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(tx $$0) {
         super(ejo.A, $$0);
      }

      @Override
      public void a(ejb $$0, ejc $$1, ayo $$2) {
         jf $$3 = this.i();
         if ($$3 != jf.c && $$3 != jf.f) {
            this.b((elp.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((elp.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static elp.i a(ejc $$0, ayo $$1, int $$2, int $$3, int $$4, jf $$5, int $$6) {
         eip $$7 = eip.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new elp.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(ddc $$0, dda $$1, dui $$2, ayo $$3, eip $$4, dbn $$5, ja $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, elp.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         jf $$7 = this.i();
         if ($$7 != jf.c && $$7 != jf.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends elp.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, ayo $$1, eip $$2, jf $$3) {
         super(ejo.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(tx $$0) {
         super(ejo.B, $$0);
         this.d = $$0.h("Type");
      }

      @Override
      protected void a(ejn $$0, tx $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(ejb $$0, ejc $$1, ayo $$2) {
         this.a((elp.m)$$0, $$1, $$2, 4, 1);
         this.b((elp.m)$$0, $$1, $$2, 1, 4);
         this.c((elp.m)$$0, $$1, $$2, 1, 4);
      }

      public static elp.j a(ejc $$0, ayo $$1, int $$2, int $$3, int $$4, jf $$5, int $$6) {
         eip $$7 = eip.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new elp.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(ddc $$0, dda $$1, dui $$2, ayo $$3, eip $$4, dbn $$5, ja $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, elp.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, dfk.eH.o(), 5, 1, 5, $$4);
               this.a($$0, dfk.eH.o(), 5, 2, 5, $$4);
               this.a($$0, dfk.eH.o(), 5, 3, 5, $$4);
               this.a($$0, dfk.cq.o().a(dok.g, jf.e), 4, 3, 5, $$4);
               this.a($$0, dfk.cq.o().a(dok.g, jf.f), 6, 3, 5, $$4);
               this.a($$0, dfk.cq.o().a(dok.g, jf.d), 5, 3, 4, $$4);
               this.a($$0, dfk.cq.o().a(dok.g, jf.c), 5, 3, 6, $$4);
               this.a($$0, dfk.jE.o(), 4, 1, 4, $$4);
               this.a($$0, dfk.jE.o(), 4, 1, 5, $$4);
               this.a($$0, dfk.jE.o(), 4, 1, 6, $$4);
               this.a($$0, dfk.jE.o(), 6, 1, 4, $$4);
               this.a($$0, dfk.jE.o(), 6, 1, 5, $$4);
               this.a($$0, dfk.jE.o(), 6, 1, 6, $$4);
               this.a($$0, dfk.jE.o(), 5, 1, 4, $$4);
               this.a($$0, dfk.jE.o(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, dfk.eH.o(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, dfk.eH.o(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, dfk.eH.o(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, dfk.eH.o(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, dfk.eH.o(), 5, 1, 5, $$4);
               this.a($$0, dfk.eH.o(), 5, 2, 5, $$4);
               this.a($$0, dfk.eH.o(), 5, 3, 5, $$4);
               this.a($$0, dfk.G.o(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, dfk.m.o(), 1, 3, $$8, $$4);
                  this.a($$0, dfk.m.o(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, dfk.m.o(), $$9, 3, 1, $$4);
                  this.a($$0, dfk.m.o(), $$9, 3, 9, $$4);
               }

               this.a($$0, dfk.m.o(), 5, 1, 4, $$4);
               this.a($$0, dfk.m.o(), 5, 1, 6, $$4);
               this.a($$0, dfk.m.o(), 5, 3, 4, $$4);
               this.a($$0, dfk.m.o(), 5, 3, 6, $$4);
               this.a($$0, dfk.m.o(), 4, 1, 5, $$4);
               this.a($$0, dfk.m.o(), 6, 1, 5, $$4);
               this.a($$0, dfk.m.o(), 4, 3, 5, $$4);
               this.a($$0, dfk.m.o(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, dfk.m.o(), 4, $$10, 4, $$4);
                  this.a($$0, dfk.m.o(), 6, $$10, 4, $$4);
                  this.a($$0, dfk.m.o(), 4, $$10, 6, $$4);
                  this.a($$0, dfk.m.o(), 6, $$10, 6, $$4);
               }

               this.a($$0, dfk.cq.o(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, dfk.n.o(), 2, 3, $$11, $$4);
                  this.a($$0, dfk.n.o(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, dfk.n.o(), 4, 3, $$11, $$4);
                     this.a($$0, dfk.n.o(), 5, 3, $$11, $$4);
                     this.a($$0, dfk.n.o(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, dfk.n.o(), 7, 3, $$11, $$4);
                  this.a($$0, dfk.n.o(), 8, 3, $$11, $$4);
               }

               dsl $$12 = dfk.cO.o().a(djo.b, jf.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, eqs.x);
         }
      }
   }

   static class k extends ejb.a {
      @Override
      public void a(ayo $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = dfk.eJ.o();
            } else if ($$5 < 0.5F) {
               this.a = dfk.eI.o();
            } else if ($$5 < 0.55F) {
               this.a = dfk.eP.o();
            } else {
               this.a = dfk.eH.o();
            }
         } else {
            this.a = dfk.nc.o();
         }
      }
   }

   public static class l extends elp.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(ejo $$0, int $$1, int $$2, int $$3, jf $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = elp.p.a.a;
      }

      public l(int $$0, ayo $$1, eip $$2, jf $$3) {
         super(ejo.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(ejo $$0, tx $$1) {
         super($$0, $$1);
         this.d = $$1.q("Source");
      }

      public l(tx $$0) {
         this(ejo.C, $$0);
      }

      @Override
      protected void a(ejn $$0, tx $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(ejb $$0, ejc $$1, ayo $$2) {
         if (this.d) {
            elp.i = elp.c.class;
         }

         this.a((elp.m)$$0, $$1, $$2, 1, 1);
      }

      public static elp.l a(ejc $$0, ayo $$1, int $$2, int $$3, int $$4, jf $$5, int $$6) {
         eip $$7 = eip.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new elp.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(ddc $$0, dda $$1, dui $$2, ayo $$3, eip $$4, dbn $$5, ja $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, elp.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, elp.p.a.a, 1, 1, 4);
         this.a($$0, dfk.eH.o(), 2, 6, 1, $$4);
         this.a($$0, dfk.eH.o(), 1, 5, 1, $$4);
         this.a($$0, dfk.jE.o(), 1, 6, 1, $$4);
         this.a($$0, dfk.eH.o(), 1, 5, 2, $$4);
         this.a($$0, dfk.eH.o(), 1, 4, 3, $$4);
         this.a($$0, dfk.jE.o(), 1, 5, 3, $$4);
         this.a($$0, dfk.eH.o(), 2, 4, 3, $$4);
         this.a($$0, dfk.eH.o(), 3, 3, 3, $$4);
         this.a($$0, dfk.jE.o(), 3, 4, 3, $$4);
         this.a($$0, dfk.eH.o(), 3, 3, 2, $$4);
         this.a($$0, dfk.eH.o(), 3, 2, 1, $$4);
         this.a($$0, dfk.jE.o(), 3, 3, 1, $$4);
         this.a($$0, dfk.eH.o(), 2, 2, 1, $$4);
         this.a($$0, dfk.eH.o(), 1, 1, 1, $$4);
         this.a($$0, dfk.jE.o(), 1, 2, 1, $$4);
         this.a($$0, dfk.eH.o(), 1, 1, 2, $$4);
         this.a($$0, dfk.jE.o(), 1, 1, 3, $$4);
      }
   }

   public static class m extends elp.l {
      public elp.f a;
      @Nullable
      public elp.g b;
      public final List<ejb> c = Lists.newArrayList();

      public m(ayo $$0, int $$1, int $$2) {
         super(ejo.D, 0, $$1, $$2, a($$0));
      }

      public m(tx $$0) {
         super(ejo.D, $$0);
      }

      @Override
      public ja h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends elp.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, ayo $$1, eip $$2, jf $$3) {
         super(ejo.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(tx $$0) {
         super(ejo.E, $$0);
         this.d = $$0.q("Left");
         this.i = $$0.q("Right");
      }

      @Override
      protected void a(ejn $$0, tx $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(ejb $$0, ejc $$1, ayo $$2) {
         this.a((elp.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((elp.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((elp.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static elp.n a(ejc $$0, ayo $$1, int $$2, int $$3, int $$4, jf $$5, int $$6) {
         eip $$7 = eip.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new elp.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(ddc $$0, dda $$1, dui $$2, ayo $$3, eip $$4, dbn $$5, ja $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, elp.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, elp.p.a.a, 1, 1, 6);
         dsl $$7 = dfk.cq.o().a(dok.g, jf.f);
         dsl $$8 = dfk.cq.o().a(dok.g, jf.e);
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

   public static class o extends elp.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, ayo $$1, eip $$2, jf $$3) {
         super(ejo.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(tx $$0) {
         super(ejo.F, $$0);
      }

      @Override
      public void a(ejb $$0, ejc $$1, ayo $$2) {
         this.a((elp.m)$$0, $$1, $$2, 1, 1);
      }

      public static elp.o a(ejc $$0, ayo $$1, int $$2, int $$3, int $$4, jf $$5, int $$6) {
         eip $$7 = eip.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new elp.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(ddc $$0, dda $$1, dui $$2, ayo $$3, eip $$4, dbn $$5, ja $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, elp.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, elp.p.a.a, 1, 1, 7);
         dsl $$7 = dfk.cQ.o().a(dnc.b, jf.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, dfk.eH.o(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dfk.eH.o(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dfk.eH.o(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends ejb {
      protected elp.p.a h = elp.p.a.a;

      protected p(ejo $$0, int $$1, eip $$2) {
         super($$0, $$1, $$2);
      }

      public p(ejo $$0, tx $$1) {
         super($$0, $$1);
         this.h = elp.p.a.valueOf($$1.l("EntryDoor"));
      }

      @Override
      protected void a(ejn $$0, tx $$1) {
         $$1.a("EntryDoor", this.h.name());
      }

      protected void a(ddc $$0, ayo $$1, eip $$2, elp.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, dfk.eH.o(), $$4, $$5, $$6, $$2);
               this.a($$0, dfk.eH.o(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dfk.eH.o(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dfk.eH.o(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dfk.eH.o(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dfk.eH.o(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dfk.eH.o(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dfk.cN.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dfk.cN.o().a(dho.f, dth.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, dfk.nc.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dfk.nc.o(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dfk.eW.o().a(djj.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, dfk.eW.o().a(djj.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dfk.eW.o().a(djj.b, Boolean.valueOf(true)).a(djj.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dfk.eW.o().a(djj.b, Boolean.valueOf(true)).a(djj.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dfk.eW.o().a(djj.b, Boolean.valueOf(true)).a(djj.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dfk.eW.o().a(djj.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dfk.eW.o().a(djj.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, dfk.eH.o(), $$4, $$5, $$6, $$2);
               this.a($$0, dfk.eH.o(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dfk.eH.o(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dfk.eH.o(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dfk.eH.o(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dfk.eH.o(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dfk.eH.o(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dfk.dy.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dfk.dy.o().a(dho.f, dth.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dfk.dM.o().a(dfs.aE, jf.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, dfk.dM.o().a(dfs.aE, jf.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected elp.p.a b(ayo $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return elp.p.a.a;
            case 2:
               return elp.p.a.b;
            case 3:
               return elp.p.a.c;
            case 4:
               return elp.p.a.d;
         }
      }

      @Nullable
      protected ejb a(elp.m $$0, ejc $$1, ayo $$2, int $$3, int $$4) {
         jf $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return elp.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$5, this.g());
               case d:
                  return elp.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$5, this.g());
               case e:
                  return elp.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
               case f:
                  return elp.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected ejb b(elp.m $$0, ejc $$1, ayo $$2, int $$3, int $$4) {
         jf $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return elp.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jf.e, this.g());
               case d:
                  return elp.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jf.e, this.g());
               case e:
                  return elp.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jf.c, this.g());
               case f:
                  return elp.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jf.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected ejb c(elp.m $$0, ejc $$1, ayo $$2, int $$3, int $$4) {
         jf $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return elp.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jf.f, this.g());
               case d:
                  return elp.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jf.f, this.g());
               case e:
                  return elp.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jf.d, this.g());
               case f:
                  return elp.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jf.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(eip $$0) {
         return $$0 != null && $$0.i() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;
      }
   }

   public abstract static class q extends elp.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(ejo $$0, int $$1, eip $$2) {
         super($$0, $$1, $$2);
      }

      public q(ejo $$0, tx $$1) {
         super($$0, $$1);
      }
   }
}
