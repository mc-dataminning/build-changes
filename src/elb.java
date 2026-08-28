import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class elb {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final elb.f[] g = new elb.f[]{
      new elb.f(elb.n.class, 40, 0),
      new elb.f(elb.h.class, 5, 5),
      new elb.f(elb.d.class, 20, 0),
      new elb.f(elb.i.class, 20, 0),
      new elb.f(elb.j.class, 10, 6),
      new elb.f(elb.o.class, 5, 5),
      new elb.f(elb.l.class, 5, 5),
      new elb.f(elb.c.class, 5, 4),
      new elb.f(elb.a.class, 5, 4),
      new elb.f(elb.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new elb.f(elb.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<elb.f> h;
   static Class<? extends elb.p> i;
   private static int j;
   static final elb.k k = new elb.k();

   public static void a() {
      h = Lists.newArrayList();

      for (elb.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (elb.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static elb.p a(Class<? extends elb.p> $$0, eip $$1, azh $$2, int $$3, int $$4, int $$5, @Nullable je $$6, int $$7) {
      elb.p $$8 = null;
      if ($$0 == elb.n.class) {
         $$8 = elb.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == elb.h.class) {
         $$8 = elb.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == elb.d.class) {
         $$8 = elb.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == elb.i.class) {
         $$8 = elb.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == elb.j.class) {
         $$8 = elb.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == elb.o.class) {
         $$8 = elb.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == elb.l.class) {
         $$8 = elb.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == elb.c.class) {
         $$8 = elb.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == elb.a.class) {
         $$8 = elb.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == elb.e.class) {
         $$8 = elb.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == elb.g.class) {
         $$8 = elb.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static elb.p a(elb.m $$0, eip $$1, azh $$2, int $$3, int $$4, int $$5, je $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            elb.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (elb.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  elb.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         eic $$13 = elb.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.i() > 1 ? new elb.b($$7, $$13, $$6) : null;
      }
   }

   static eio b(elb.m $$0, eip $$1, azh $$2, int $$3, int $$4, int $$5, @Nullable je $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
         eio $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends elb.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, azh $$1, eic $$2, je $$3) {
         super(ejb.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(us $$0) {
         super(ejb.t, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(eja $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(eio $$0, eip $$1, azh $$2) {
         this.a((elb.m)$$0, $$1, $$2, 1, 1);
      }

      public static elb.a a(eip $$0, azh $$1, int $$2, int $$3, int $$4, je $$5, int $$6) {
         eic $$7 = eic.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new elb.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dct $$0, dcr $$1, dtz $$2, azh $$3, eic $$4, dbf $$5, iz $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, elb.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, elb.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, dfb.eH.o(), dfb.eH.o(), false);
         this.a($$0, dfb.jK.o(), 3, 1, 1, $$4);
         this.a($$0, dfb.jK.o(), 3, 1, 5, $$4);
         this.a($$0, dfb.jK.o(), 3, 2, 2, $$4);
         this.a($$0, dfb.jK.o(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, dfb.jK.o(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, eqe.y);
         }
      }
   }

   public static class b extends elb.p {
      private final int a;

      public b(int $$0, eic $$1, je $$2) {
         super(ejb.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != je.c && $$2 != je.d ? $$1.d() : $$1.f();
      }

      public b(us $$0) {
         super(ejb.u, $$0);
         this.a = $$0.h("Steps");
      }

      @Override
      protected void a(eja $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static eic a(eip $$0, azh $$1, int $$2, int $$3, int $$4, je $$5) {
         int $$6 = 3;
         eic $$7 = eic.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         eio $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().i() == $$7.i()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = eic.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return eic.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(dct $$0, dcr $$1, dtz $$2, azh $$3, eic $$4, dbf $$5, iz $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, dfb.eH.o(), 0, 0, $$7, $$4);
            this.a($$0, dfb.eH.o(), 1, 0, $$7, $$4);
            this.a($$0, dfb.eH.o(), 2, 0, $$7, $$4);
            this.a($$0, dfb.eH.o(), 3, 0, $$7, $$4);
            this.a($$0, dfb.eH.o(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, dfb.eH.o(), 0, $$8, $$7, $$4);
               this.a($$0, dfb.nc.o(), 1, $$8, $$7, $$4);
               this.a($$0, dfb.nc.o(), 2, $$8, $$7, $$4);
               this.a($$0, dfb.nc.o(), 3, $$8, $$7, $$4);
               this.a($$0, dfb.eH.o(), 4, $$8, $$7, $$4);
            }

            this.a($$0, dfb.eH.o(), 0, 4, $$7, $$4);
            this.a($$0, dfb.eH.o(), 1, 4, $$7, $$4);
            this.a($$0, dfb.eH.o(), 2, 4, $$7, $$4);
            this.a($$0, dfb.eH.o(), 3, 4, $$7, $$4);
            this.a($$0, dfb.eH.o(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends elb.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, azh $$1, eic $$2, je $$3) {
         super(ejb.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(us $$0) {
         super(ejb.v, $$0);
         this.d = $$0.q("leftLow");
         this.i = $$0.q("leftHigh");
         this.j = $$0.q("rightLow");
         this.k = $$0.q("rightHigh");
      }

      @Override
      protected void a(eja $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(eio $$0, eip $$1, azh $$2) {
         int $$3 = 3;
         int $$4 = 5;
         je $$5 = this.i();
         if ($$5 == je.e || $$5 == je.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((elb.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((elb.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((elb.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((elb.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((elb.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static elb.c a(eip $$0, azh $$1, int $$2, int $$3, int $$4, je $$5, int $$6) {
         eic $$7 = eic.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new elb.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dct $$0, dcr $$1, dtz $$2, azh $$3, eic $$4, dbf $$5, iz $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, elb.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, elb.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, elb.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, elb.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, elb.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, elb.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, dfb.jE.o(), dfb.jE.o(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, dfb.jE.o(), dfb.jE.o(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, elb.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, dfb.jE.o(), dfb.jE.o(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, dfb.jE.o(), dfb.jE.o(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, dfb.jE.o(), dfb.jE.o(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, dfb.jE.o(), dfb.jE.o(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, dfb.jE.o().a(dmc.b, dtk.c), dfb.jE.o().a(dmc.b, dtk.c), false);
         this.a($$0, dfb.cq.o().a(dob.g, je.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends elb.q {
      public d(int $$0, azh $$1, eic $$2, je $$3) {
         super(ejb.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(us $$0) {
         super(ejb.w, $$0);
      }

      @Override
      public void a(eio $$0, eip $$1, azh $$2) {
         je $$3 = this.i();
         if ($$3 != je.c && $$3 != je.f) {
            this.c((elb.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((elb.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static elb.d a(eip $$0, azh $$1, int $$2, int $$3, int $$4, je $$5, int $$6) {
         eic $$7 = eic.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new elb.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dct $$0, dcr $$1, dtz $$2, azh $$3, eic $$4, dbf $$5, iz $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, elb.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         je $$7 = this.i();
         if ($$7 != je.c && $$7 != je.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends elb.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, azh $$1, eic $$2, je $$3) {
         super(ejb.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.e() > 6;
      }

      public e(us $$0) {
         super(ejb.x, $$0);
         this.i = $$0.q("Tall");
      }

      @Override
      protected void a(eja $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static elb.e a(eip $$0, azh $$1, int $$2, int $$3, int $$4, je $$5, int $$6) {
         eic $$7 = eic.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = eic.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new elb.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(dct $$0, dcr $$1, dtz $$2, azh $$3, eic $$4, dbf $$5, iz $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, elb.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, dfb.bs.o(), dfb.bs.o(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dfb.n.o(), dfb.n.o(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dfb.n.o(), dfb.n.o(), false);
               this.a($$0, dfb.cq.o().a(dob.g, je.f), 2, 3, $$10, $$4);
               this.a($$0, dfb.cq.o().a(dob.g, je.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dfb.n.o(), dfb.n.o(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dfb.n.o(), dfb.n.o(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dfb.cl.o(), dfb.cl.o(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dfb.cl.o(), dfb.cl.o(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dfb.cl.o(), dfb.cl.o(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dfb.cl.o(), dfb.cl.o(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, dfb.cl.o(), dfb.cl.o(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, dfb.cl.o(), dfb.cl.o(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, dfb.cl.o(), dfb.cl.o(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, dfb.n.o(), dfb.n.o(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, dfb.n.o(), dfb.n.o(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, dfb.n.o(), dfb.n.o(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, dfb.n.o(), dfb.n.o(), false);
            this.a($$0, dfb.n.o(), 9, 5, 11, $$4);
            this.a($$0, dfb.n.o(), 8, 5, 11, $$4);
            this.a($$0, dfb.n.o(), 9, 5, 10, $$4);
            dsc $$12 = dfb.dU.o().a(dhx.d, Boolean.valueOf(true)).a(dhx.b, Boolean.valueOf(true));
            dsc $$13 = dfb.dU.o().a(dhx.a, Boolean.valueOf(true)).a(dhx.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, dfb.dU.o().a(dhx.a, Boolean.valueOf(true)).a(dhx.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, dfb.dU.o().a(dhx.c, Boolean.valueOf(true)).a(dhx.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, dfb.dU.o().a(dhx.a, Boolean.valueOf(true)).a(dhx.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, dfb.dU.o().a(dhx.c, Boolean.valueOf(true)).a(dhx.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, dfb.dU.o().a(dhx.a, Boolean.valueOf(true)).a(dhx.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            dsc $$15 = dfb.cO.o().a(djf.b, je.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            dsc $$18 = dfb.dU.o().a(dhx.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            dsc $$19 = dfb.dU.o().a(dhx.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            dsc $$20 = $$13.a(dhx.d, Boolean.valueOf(true)).a(dhx.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.a(dhx.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.a(dhx.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.a(dhx.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.a(dhx.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            dsc $$21 = dfb.cp.o();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, eqe.w);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, eqe.w);
         }
      }
   }

   static class f {
      public final Class<? extends elb.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends elb.p> $$0, int $$1, int $$2) {
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

   public static class g extends elb.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, eic $$1, je $$2) {
         super(ejb.y, $$0, $$1);
         this.a($$2);
      }

      public g(us $$0) {
         super(ejb.y, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(eja $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(eio $$0, eip $$1, azh $$2) {
         if ($$0 != null) {
            ((elb.m)$$0).b = this;
         }
      }

      public static elb.g a(eip $$0, int $$1, int $$2, int $$3, je $$4, int $$5) {
         eic $$6 = eic.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new elb.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dct $$0, dcr $$1, dtz $$2, azh $$3, eic $$4, dbf $$5, iz $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, elb.k);
         this.a($$0, $$3, $$4, elb.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, elb.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, elb.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, elb.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, elb.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, elb.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, elb.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, dfb.H.o(), dfb.H.o(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, dfb.H.o(), dfb.H.o(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, elb.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, dfb.H.o(), dfb.H.o(), false);
         dsc $$8 = dfb.eW.o().a(dja.a, Boolean.valueOf(true)).a(dja.c, Boolean.valueOf(true));
         dsc $$9 = dfb.eW.o().a(dja.d, Boolean.valueOf(true)).a(dja.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         dsc $$12 = dfb.fj.o().a(dmt.b, je.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, elb.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, elb.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, elb.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         dsc $$14 = dfb.fy.o().a(dho.b, je.c);
         dsc $$15 = dfb.fy.o().a(dho.b, je.d);
         dsc $$16 = dfb.fy.o().a(dho.b, je.f);
         dsc $$17 = dfb.fy.o().a(dho.b, je.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.a(dho.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.a(dho.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.a(dho.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.a(dho.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.a(dho.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.a(dho.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.a(dho.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.a(dho.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.a(dho.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.a(dho.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.a(dho.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.a(dho.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            dsc $$21 = dfb.fx.o();
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
            iz $$22 = this.b(5, 3, 6);
            if ($$4.b($$22)) {
               this.d = true;
               $$0.a($$22, dfb.ct.o(), 2);
               if ($$0.c_($$22) instanceof dqv $$24) {
                  $$24.a(bta.aM, $$3);
               }
            }
         }
      }
   }

   public static class h extends elb.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, azh $$1, eic $$2, je $$3) {
         super(ejb.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(us $$0) {
         super(ejb.z, $$0);
      }

      @Override
      public void a(eio $$0, eip $$1, azh $$2) {
         this.a((elb.m)$$0, $$1, $$2, 1, 1);
      }

      public static elb.h a(eip $$0, azh $$1, int $$2, int $$3, int $$4, je $$5, int $$6) {
         eic $$7 = eic.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new elb.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dct $$0, dcr $$1, dtz $$2, azh $$3, eic $$4, dbf $$5, iz $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, elb.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, elb.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, elb.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, elb.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, elb.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, dfb.eW.o().a(dja.a, Boolean.valueOf(true)).a(dja.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, dfb.eW.o().a(dja.a, Boolean.valueOf(true)).a(dja.c, Boolean.valueOf(true)).a(dja.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, dfb.eW.o().a(dja.a, Boolean.valueOf(true)).a(dja.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, dfb.eW.o().a(dja.d, Boolean.valueOf(true)).a(dja.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, dfb.eW.o().a(dja.d, Boolean.valueOf(true)).a(dja.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, dfb.eW.o().a(dja.d, Boolean.valueOf(true)).a(dja.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, dfb.eW.o().a(dja.a, Boolean.valueOf(true)).a(dja.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, dfb.eW.o().a(dja.a, Boolean.valueOf(true)).a(dja.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         dsc $$8 = dfb.dy.o().a(dhf.b, je.e);
         dsc $$9 = dfb.dy.o().a(dhf.b, je.e).a(dhf.f, dsy.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends elb.q {
      public i(int $$0, azh $$1, eic $$2, je $$3) {
         super(ejb.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(us $$0) {
         super(ejb.A, $$0);
      }

      @Override
      public void a(eio $$0, eip $$1, azh $$2) {
         je $$3 = this.i();
         if ($$3 != je.c && $$3 != je.f) {
            this.b((elb.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((elb.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static elb.i a(eip $$0, azh $$1, int $$2, int $$3, int $$4, je $$5, int $$6) {
         eic $$7 = eic.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new elb.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dct $$0, dcr $$1, dtz $$2, azh $$3, eic $$4, dbf $$5, iz $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, elb.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         je $$7 = this.i();
         if ($$7 != je.c && $$7 != je.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends elb.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, azh $$1, eic $$2, je $$3) {
         super(ejb.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(us $$0) {
         super(ejb.B, $$0);
         this.d = $$0.h("Type");
      }

      @Override
      protected void a(eja $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(eio $$0, eip $$1, azh $$2) {
         this.a((elb.m)$$0, $$1, $$2, 4, 1);
         this.b((elb.m)$$0, $$1, $$2, 1, 4);
         this.c((elb.m)$$0, $$1, $$2, 1, 4);
      }

      public static elb.j a(eip $$0, azh $$1, int $$2, int $$3, int $$4, je $$5, int $$6) {
         eic $$7 = eic.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new elb.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dct $$0, dcr $$1, dtz $$2, azh $$3, eic $$4, dbf $$5, iz $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, elb.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, dfb.eH.o(), 5, 1, 5, $$4);
               this.a($$0, dfb.eH.o(), 5, 2, 5, $$4);
               this.a($$0, dfb.eH.o(), 5, 3, 5, $$4);
               this.a($$0, dfb.cq.o().a(dob.g, je.e), 4, 3, 5, $$4);
               this.a($$0, dfb.cq.o().a(dob.g, je.f), 6, 3, 5, $$4);
               this.a($$0, dfb.cq.o().a(dob.g, je.d), 5, 3, 4, $$4);
               this.a($$0, dfb.cq.o().a(dob.g, je.c), 5, 3, 6, $$4);
               this.a($$0, dfb.jE.o(), 4, 1, 4, $$4);
               this.a($$0, dfb.jE.o(), 4, 1, 5, $$4);
               this.a($$0, dfb.jE.o(), 4, 1, 6, $$4);
               this.a($$0, dfb.jE.o(), 6, 1, 4, $$4);
               this.a($$0, dfb.jE.o(), 6, 1, 5, $$4);
               this.a($$0, dfb.jE.o(), 6, 1, 6, $$4);
               this.a($$0, dfb.jE.o(), 5, 1, 4, $$4);
               this.a($$0, dfb.jE.o(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, dfb.eH.o(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, dfb.eH.o(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, dfb.eH.o(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, dfb.eH.o(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, dfb.eH.o(), 5, 1, 5, $$4);
               this.a($$0, dfb.eH.o(), 5, 2, 5, $$4);
               this.a($$0, dfb.eH.o(), 5, 3, 5, $$4);
               this.a($$0, dfb.G.o(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, dfb.m.o(), 1, 3, $$8, $$4);
                  this.a($$0, dfb.m.o(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, dfb.m.o(), $$9, 3, 1, $$4);
                  this.a($$0, dfb.m.o(), $$9, 3, 9, $$4);
               }

               this.a($$0, dfb.m.o(), 5, 1, 4, $$4);
               this.a($$0, dfb.m.o(), 5, 1, 6, $$4);
               this.a($$0, dfb.m.o(), 5, 3, 4, $$4);
               this.a($$0, dfb.m.o(), 5, 3, 6, $$4);
               this.a($$0, dfb.m.o(), 4, 1, 5, $$4);
               this.a($$0, dfb.m.o(), 6, 1, 5, $$4);
               this.a($$0, dfb.m.o(), 4, 3, 5, $$4);
               this.a($$0, dfb.m.o(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, dfb.m.o(), 4, $$10, 4, $$4);
                  this.a($$0, dfb.m.o(), 6, $$10, 4, $$4);
                  this.a($$0, dfb.m.o(), 4, $$10, 6, $$4);
                  this.a($$0, dfb.m.o(), 6, $$10, 6, $$4);
               }

               this.a($$0, dfb.cq.o(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, dfb.n.o(), 2, 3, $$11, $$4);
                  this.a($$0, dfb.n.o(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, dfb.n.o(), 4, 3, $$11, $$4);
                     this.a($$0, dfb.n.o(), 5, 3, $$11, $$4);
                     this.a($$0, dfb.n.o(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, dfb.n.o(), 7, 3, $$11, $$4);
                  this.a($$0, dfb.n.o(), 8, 3, $$11, $$4);
               }

               dsc $$12 = dfb.cO.o().a(djf.b, je.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, eqe.x);
         }
      }
   }

   static class k extends eio.a {
      @Override
      public void a(azh $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = dfb.eJ.o();
            } else if ($$5 < 0.5F) {
               this.a = dfb.eI.o();
            } else if ($$5 < 0.55F) {
               this.a = dfb.eP.o();
            } else {
               this.a = dfb.eH.o();
            }
         } else {
            this.a = dfb.nc.o();
         }
      }
   }

   public static class l extends elb.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(ejb $$0, int $$1, int $$2, int $$3, je $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = elb.p.a.a;
      }

      public l(int $$0, azh $$1, eic $$2, je $$3) {
         super(ejb.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(ejb $$0, us $$1) {
         super($$0, $$1);
         this.d = $$1.q("Source");
      }

      public l(us $$0) {
         this(ejb.C, $$0);
      }

      @Override
      protected void a(eja $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(eio $$0, eip $$1, azh $$2) {
         if (this.d) {
            elb.i = elb.c.class;
         }

         this.a((elb.m)$$0, $$1, $$2, 1, 1);
      }

      public static elb.l a(eip $$0, azh $$1, int $$2, int $$3, int $$4, je $$5, int $$6) {
         eic $$7 = eic.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new elb.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dct $$0, dcr $$1, dtz $$2, azh $$3, eic $$4, dbf $$5, iz $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, elb.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, elb.p.a.a, 1, 1, 4);
         this.a($$0, dfb.eH.o(), 2, 6, 1, $$4);
         this.a($$0, dfb.eH.o(), 1, 5, 1, $$4);
         this.a($$0, dfb.jE.o(), 1, 6, 1, $$4);
         this.a($$0, dfb.eH.o(), 1, 5, 2, $$4);
         this.a($$0, dfb.eH.o(), 1, 4, 3, $$4);
         this.a($$0, dfb.jE.o(), 1, 5, 3, $$4);
         this.a($$0, dfb.eH.o(), 2, 4, 3, $$4);
         this.a($$0, dfb.eH.o(), 3, 3, 3, $$4);
         this.a($$0, dfb.jE.o(), 3, 4, 3, $$4);
         this.a($$0, dfb.eH.o(), 3, 3, 2, $$4);
         this.a($$0, dfb.eH.o(), 3, 2, 1, $$4);
         this.a($$0, dfb.jE.o(), 3, 3, 1, $$4);
         this.a($$0, dfb.eH.o(), 2, 2, 1, $$4);
         this.a($$0, dfb.eH.o(), 1, 1, 1, $$4);
         this.a($$0, dfb.jE.o(), 1, 2, 1, $$4);
         this.a($$0, dfb.eH.o(), 1, 1, 2, $$4);
         this.a($$0, dfb.jE.o(), 1, 1, 3, $$4);
      }
   }

   public static class m extends elb.l {
      public elb.f a;
      @Nullable
      public elb.g b;
      public final List<eio> c = Lists.newArrayList();

      public m(azh $$0, int $$1, int $$2) {
         super(ejb.D, 0, $$1, $$2, a($$0));
      }

      public m(us $$0) {
         super(ejb.D, $$0);
      }

      @Override
      public iz h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends elb.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, azh $$1, eic $$2, je $$3) {
         super(ejb.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(us $$0) {
         super(ejb.E, $$0);
         this.d = $$0.q("Left");
         this.i = $$0.q("Right");
      }

      @Override
      protected void a(eja $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(eio $$0, eip $$1, azh $$2) {
         this.a((elb.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((elb.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((elb.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static elb.n a(eip $$0, azh $$1, int $$2, int $$3, int $$4, je $$5, int $$6) {
         eic $$7 = eic.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new elb.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dct $$0, dcr $$1, dtz $$2, azh $$3, eic $$4, dbf $$5, iz $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, elb.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, elb.p.a.a, 1, 1, 6);
         dsc $$7 = dfb.cq.o().a(dob.g, je.f);
         dsc $$8 = dfb.cq.o().a(dob.g, je.e);
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

   public static class o extends elb.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, azh $$1, eic $$2, je $$3) {
         super(ejb.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(us $$0) {
         super(ejb.F, $$0);
      }

      @Override
      public void a(eio $$0, eip $$1, azh $$2) {
         this.a((elb.m)$$0, $$1, $$2, 1, 1);
      }

      public static elb.o a(eip $$0, azh $$1, int $$2, int $$3, int $$4, je $$5, int $$6) {
         eic $$7 = eic.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new elb.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dct $$0, dcr $$1, dtz $$2, azh $$3, eic $$4, dbf $$5, iz $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, elb.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, elb.p.a.a, 1, 1, 7);
         dsc $$7 = dfb.cQ.o().a(dmt.b, je.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, dfb.eH.o(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dfb.eH.o(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dfb.eH.o(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends eio {
      protected elb.p.a h = elb.p.a.a;

      protected p(ejb $$0, int $$1, eic $$2) {
         super($$0, $$1, $$2);
      }

      public p(ejb $$0, us $$1) {
         super($$0, $$1);
         this.h = elb.p.a.valueOf($$1.l("EntryDoor"));
      }

      @Override
      protected void a(eja $$0, us $$1) {
         $$1.a("EntryDoor", this.h.name());
      }

      protected void a(dct $$0, azh $$1, eic $$2, elb.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, dfb.eH.o(), $$4, $$5, $$6, $$2);
               this.a($$0, dfb.eH.o(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dfb.eH.o(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dfb.eH.o(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dfb.eH.o(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dfb.eH.o(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dfb.eH.o(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dfb.cN.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dfb.cN.o().a(dhf.f, dsy.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, dfb.nc.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dfb.nc.o(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dfb.eW.o().a(dja.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, dfb.eW.o().a(dja.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dfb.eW.o().a(dja.b, Boolean.valueOf(true)).a(dja.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dfb.eW.o().a(dja.b, Boolean.valueOf(true)).a(dja.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dfb.eW.o().a(dja.b, Boolean.valueOf(true)).a(dja.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dfb.eW.o().a(dja.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dfb.eW.o().a(dja.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, dfb.eH.o(), $$4, $$5, $$6, $$2);
               this.a($$0, dfb.eH.o(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dfb.eH.o(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dfb.eH.o(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dfb.eH.o(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dfb.eH.o(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dfb.eH.o(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dfb.dy.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dfb.dy.o().a(dhf.f, dsy.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dfb.dM.o().a(dfj.aE, je.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, dfb.dM.o().a(dfj.aE, je.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected elb.p.a b(azh $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return elb.p.a.a;
            case 2:
               return elb.p.a.b;
            case 3:
               return elb.p.a.c;
            case 4:
               return elb.p.a.d;
         }
      }

      @Nullable
      protected eio a(elb.m $$0, eip $$1, azh $$2, int $$3, int $$4) {
         je $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return elb.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$5, this.g());
               case d:
                  return elb.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$5, this.g());
               case e:
                  return elb.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
               case f:
                  return elb.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected eio b(elb.m $$0, eip $$1, azh $$2, int $$3, int $$4) {
         je $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return elb.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, je.e, this.g());
               case d:
                  return elb.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, je.e, this.g());
               case e:
                  return elb.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, je.c, this.g());
               case f:
                  return elb.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, je.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected eio c(elb.m $$0, eip $$1, azh $$2, int $$3, int $$4) {
         je $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return elb.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, je.f, this.g());
               case d:
                  return elb.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, je.f, this.g());
               case e:
                  return elb.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, je.d, this.g());
               case f:
                  return elb.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, je.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(eic $$0) {
         return $$0 != null && $$0.i() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;
      }
   }

   public abstract static class q extends elb.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(ejb $$0, int $$1, eic $$2) {
         super($$0, $$1, $$2);
      }

      public q(ejb $$0, us $$1) {
         super($$0, $$1);
      }
   }
}
