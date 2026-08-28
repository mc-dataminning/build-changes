import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class elc {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final elc.f[] g = new elc.f[]{
      new elc.f(elc.n.class, 40, 0),
      new elc.f(elc.h.class, 5, 5),
      new elc.f(elc.d.class, 20, 0),
      new elc.f(elc.i.class, 20, 0),
      new elc.f(elc.j.class, 10, 6),
      new elc.f(elc.o.class, 5, 5),
      new elc.f(elc.l.class, 5, 5),
      new elc.f(elc.c.class, 5, 4),
      new elc.f(elc.a.class, 5, 4),
      new elc.f(elc.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new elc.f(elc.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<elc.f> h;
   static Class<? extends elc.p> i;
   private static int j;
   static final elc.k k = new elc.k();

   public static void a() {
      h = Lists.newArrayList();

      for (elc.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (elc.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static elc.p a(Class<? extends elc.p> $$0, eiq $$1, azh $$2, int $$3, int $$4, int $$5, @Nullable je $$6, int $$7) {
      elc.p $$8 = null;
      if ($$0 == elc.n.class) {
         $$8 = elc.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == elc.h.class) {
         $$8 = elc.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == elc.d.class) {
         $$8 = elc.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == elc.i.class) {
         $$8 = elc.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == elc.j.class) {
         $$8 = elc.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == elc.o.class) {
         $$8 = elc.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == elc.l.class) {
         $$8 = elc.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == elc.c.class) {
         $$8 = elc.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == elc.a.class) {
         $$8 = elc.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == elc.e.class) {
         $$8 = elc.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == elc.g.class) {
         $$8 = elc.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static elc.p a(elc.m $$0, eiq $$1, azh $$2, int $$3, int $$4, int $$5, je $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            elc.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (elc.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  elc.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         eid $$13 = elc.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.i() > 1 ? new elc.b($$7, $$13, $$6) : null;
      }
   }

   static eip b(elc.m $$0, eiq $$1, azh $$2, int $$3, int $$4, int $$5, @Nullable je $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
         eip $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends elc.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, azh $$1, eid $$2, je $$3) {
         super(ejc.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(us $$0) {
         super(ejc.t, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(ejb $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(eip $$0, eiq $$1, azh $$2) {
         this.a((elc.m)$$0, $$1, $$2, 1, 1);
      }

      public static elc.a a(eiq $$0, azh $$1, int $$2, int $$3, int $$4, je $$5, int $$6) {
         eid $$7 = eid.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new elc.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dcu $$0, dcs $$1, dua $$2, azh $$3, eid $$4, dbg $$5, iz $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, elc.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, elc.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, dfc.eH.o(), dfc.eH.o(), false);
         this.a($$0, dfc.jK.o(), 3, 1, 1, $$4);
         this.a($$0, dfc.jK.o(), 3, 1, 5, $$4);
         this.a($$0, dfc.jK.o(), 3, 2, 2, $$4);
         this.a($$0, dfc.jK.o(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, dfc.jK.o(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, eqf.y);
         }
      }
   }

   public static class b extends elc.p {
      private final int a;

      public b(int $$0, eid $$1, je $$2) {
         super(ejc.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != je.c && $$2 != je.d ? $$1.d() : $$1.f();
      }

      public b(us $$0) {
         super(ejc.u, $$0);
         this.a = $$0.h("Steps");
      }

      @Override
      protected void a(ejb $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static eid a(eiq $$0, azh $$1, int $$2, int $$3, int $$4, je $$5) {
         int $$6 = 3;
         eid $$7 = eid.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         eip $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().i() == $$7.i()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = eid.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return eid.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(dcu $$0, dcs $$1, dua $$2, azh $$3, eid $$4, dbg $$5, iz $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, dfc.eH.o(), 0, 0, $$7, $$4);
            this.a($$0, dfc.eH.o(), 1, 0, $$7, $$4);
            this.a($$0, dfc.eH.o(), 2, 0, $$7, $$4);
            this.a($$0, dfc.eH.o(), 3, 0, $$7, $$4);
            this.a($$0, dfc.eH.o(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, dfc.eH.o(), 0, $$8, $$7, $$4);
               this.a($$0, dfc.nc.o(), 1, $$8, $$7, $$4);
               this.a($$0, dfc.nc.o(), 2, $$8, $$7, $$4);
               this.a($$0, dfc.nc.o(), 3, $$8, $$7, $$4);
               this.a($$0, dfc.eH.o(), 4, $$8, $$7, $$4);
            }

            this.a($$0, dfc.eH.o(), 0, 4, $$7, $$4);
            this.a($$0, dfc.eH.o(), 1, 4, $$7, $$4);
            this.a($$0, dfc.eH.o(), 2, 4, $$7, $$4);
            this.a($$0, dfc.eH.o(), 3, 4, $$7, $$4);
            this.a($$0, dfc.eH.o(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends elc.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, azh $$1, eid $$2, je $$3) {
         super(ejc.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(us $$0) {
         super(ejc.v, $$0);
         this.d = $$0.q("leftLow");
         this.i = $$0.q("leftHigh");
         this.j = $$0.q("rightLow");
         this.k = $$0.q("rightHigh");
      }

      @Override
      protected void a(ejb $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(eip $$0, eiq $$1, azh $$2) {
         int $$3 = 3;
         int $$4 = 5;
         je $$5 = this.i();
         if ($$5 == je.e || $$5 == je.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((elc.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((elc.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((elc.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((elc.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((elc.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static elc.c a(eiq $$0, azh $$1, int $$2, int $$3, int $$4, je $$5, int $$6) {
         eid $$7 = eid.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new elc.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dcu $$0, dcs $$1, dua $$2, azh $$3, eid $$4, dbg $$5, iz $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, elc.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, elc.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, elc.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, elc.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, elc.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, elc.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, dfc.jE.o(), dfc.jE.o(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, dfc.jE.o(), dfc.jE.o(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, elc.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, dfc.jE.o(), dfc.jE.o(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, dfc.jE.o(), dfc.jE.o(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, dfc.jE.o(), dfc.jE.o(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, dfc.jE.o(), dfc.jE.o(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, dfc.jE.o().a(dmd.b, dtl.c), dfc.jE.o().a(dmd.b, dtl.c), false);
         this.a($$0, dfc.cq.o().a(doc.g, je.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends elc.q {
      public d(int $$0, azh $$1, eid $$2, je $$3) {
         super(ejc.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(us $$0) {
         super(ejc.w, $$0);
      }

      @Override
      public void a(eip $$0, eiq $$1, azh $$2) {
         je $$3 = this.i();
         if ($$3 != je.c && $$3 != je.f) {
            this.c((elc.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((elc.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static elc.d a(eiq $$0, azh $$1, int $$2, int $$3, int $$4, je $$5, int $$6) {
         eid $$7 = eid.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new elc.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dcu $$0, dcs $$1, dua $$2, azh $$3, eid $$4, dbg $$5, iz $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, elc.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         je $$7 = this.i();
         if ($$7 != je.c && $$7 != je.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends elc.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, azh $$1, eid $$2, je $$3) {
         super(ejc.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.e() > 6;
      }

      public e(us $$0) {
         super(ejc.x, $$0);
         this.i = $$0.q("Tall");
      }

      @Override
      protected void a(ejb $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static elc.e a(eiq $$0, azh $$1, int $$2, int $$3, int $$4, je $$5, int $$6) {
         eid $$7 = eid.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = eid.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new elc.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(dcu $$0, dcs $$1, dua $$2, azh $$3, eid $$4, dbg $$5, iz $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, elc.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, dfc.bs.o(), dfc.bs.o(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dfc.n.o(), dfc.n.o(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dfc.n.o(), dfc.n.o(), false);
               this.a($$0, dfc.cq.o().a(doc.g, je.f), 2, 3, $$10, $$4);
               this.a($$0, dfc.cq.o().a(doc.g, je.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dfc.n.o(), dfc.n.o(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dfc.n.o(), dfc.n.o(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dfc.cl.o(), dfc.cl.o(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dfc.cl.o(), dfc.cl.o(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dfc.cl.o(), dfc.cl.o(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dfc.cl.o(), dfc.cl.o(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, dfc.cl.o(), dfc.cl.o(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, dfc.cl.o(), dfc.cl.o(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, dfc.cl.o(), dfc.cl.o(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, dfc.n.o(), dfc.n.o(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, dfc.n.o(), dfc.n.o(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, dfc.n.o(), dfc.n.o(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, dfc.n.o(), dfc.n.o(), false);
            this.a($$0, dfc.n.o(), 9, 5, 11, $$4);
            this.a($$0, dfc.n.o(), 8, 5, 11, $$4);
            this.a($$0, dfc.n.o(), 9, 5, 10, $$4);
            dsd $$12 = dfc.dU.o().a(dhy.d, Boolean.valueOf(true)).a(dhy.b, Boolean.valueOf(true));
            dsd $$13 = dfc.dU.o().a(dhy.a, Boolean.valueOf(true)).a(dhy.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, dfc.dU.o().a(dhy.a, Boolean.valueOf(true)).a(dhy.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, dfc.dU.o().a(dhy.c, Boolean.valueOf(true)).a(dhy.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, dfc.dU.o().a(dhy.a, Boolean.valueOf(true)).a(dhy.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, dfc.dU.o().a(dhy.c, Boolean.valueOf(true)).a(dhy.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, dfc.dU.o().a(dhy.a, Boolean.valueOf(true)).a(dhy.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            dsd $$15 = dfc.cO.o().a(djg.b, je.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            dsd $$18 = dfc.dU.o().a(dhy.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            dsd $$19 = dfc.dU.o().a(dhy.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            dsd $$20 = $$13.a(dhy.d, Boolean.valueOf(true)).a(dhy.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.a(dhy.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.a(dhy.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.a(dhy.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.a(dhy.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            dsd $$21 = dfc.cp.o();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, eqf.w);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, eqf.w);
         }
      }
   }

   static class f {
      public final Class<? extends elc.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends elc.p> $$0, int $$1, int $$2) {
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

   public static class g extends elc.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, eid $$1, je $$2) {
         super(ejc.y, $$0, $$1);
         this.a($$2);
      }

      public g(us $$0) {
         super(ejc.y, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(ejb $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(eip $$0, eiq $$1, azh $$2) {
         if ($$0 != null) {
            ((elc.m)$$0).b = this;
         }
      }

      public static elc.g a(eiq $$0, int $$1, int $$2, int $$3, je $$4, int $$5) {
         eid $$6 = eid.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new elc.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dcu $$0, dcs $$1, dua $$2, azh $$3, eid $$4, dbg $$5, iz $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, elc.k);
         this.a($$0, $$3, $$4, elc.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, elc.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, elc.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, elc.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, elc.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, elc.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, elc.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, dfc.H.o(), dfc.H.o(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, dfc.H.o(), dfc.H.o(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, elc.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, dfc.H.o(), dfc.H.o(), false);
         dsd $$8 = dfc.eW.o().a(djb.a, Boolean.valueOf(true)).a(djb.c, Boolean.valueOf(true));
         dsd $$9 = dfc.eW.o().a(djb.d, Boolean.valueOf(true)).a(djb.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         dsd $$12 = dfc.fj.o().a(dmu.b, je.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, elc.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, elc.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, elc.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         dsd $$14 = dfc.fy.o().a(dhp.b, je.c);
         dsd $$15 = dfc.fy.o().a(dhp.b, je.d);
         dsd $$16 = dfc.fy.o().a(dhp.b, je.f);
         dsd $$17 = dfc.fy.o().a(dhp.b, je.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.a(dhp.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.a(dhp.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.a(dhp.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.a(dhp.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.a(dhp.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.a(dhp.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.a(dhp.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.a(dhp.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.a(dhp.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.a(dhp.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.a(dhp.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.a(dhp.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            dsd $$21 = dfc.fx.o();
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
               $$0.a($$22, dfc.ct.o(), 2);
               if ($$0.c_($$22) instanceof dqw $$24) {
                  $$24.a(btb.aM, $$3);
               }
            }
         }
      }
   }

   public static class h extends elc.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, azh $$1, eid $$2, je $$3) {
         super(ejc.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(us $$0) {
         super(ejc.z, $$0);
      }

      @Override
      public void a(eip $$0, eiq $$1, azh $$2) {
         this.a((elc.m)$$0, $$1, $$2, 1, 1);
      }

      public static elc.h a(eiq $$0, azh $$1, int $$2, int $$3, int $$4, je $$5, int $$6) {
         eid $$7 = eid.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new elc.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dcu $$0, dcs $$1, dua $$2, azh $$3, eid $$4, dbg $$5, iz $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, elc.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, elc.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, elc.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, elc.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, elc.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, dfc.eW.o().a(djb.a, Boolean.valueOf(true)).a(djb.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, dfc.eW.o().a(djb.a, Boolean.valueOf(true)).a(djb.c, Boolean.valueOf(true)).a(djb.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, dfc.eW.o().a(djb.a, Boolean.valueOf(true)).a(djb.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, dfc.eW.o().a(djb.d, Boolean.valueOf(true)).a(djb.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, dfc.eW.o().a(djb.d, Boolean.valueOf(true)).a(djb.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, dfc.eW.o().a(djb.d, Boolean.valueOf(true)).a(djb.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, dfc.eW.o().a(djb.a, Boolean.valueOf(true)).a(djb.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, dfc.eW.o().a(djb.a, Boolean.valueOf(true)).a(djb.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         dsd $$8 = dfc.dy.o().a(dhg.b, je.e);
         dsd $$9 = dfc.dy.o().a(dhg.b, je.e).a(dhg.f, dsz.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends elc.q {
      public i(int $$0, azh $$1, eid $$2, je $$3) {
         super(ejc.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(us $$0) {
         super(ejc.A, $$0);
      }

      @Override
      public void a(eip $$0, eiq $$1, azh $$2) {
         je $$3 = this.i();
         if ($$3 != je.c && $$3 != je.f) {
            this.b((elc.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((elc.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static elc.i a(eiq $$0, azh $$1, int $$2, int $$3, int $$4, je $$5, int $$6) {
         eid $$7 = eid.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new elc.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dcu $$0, dcs $$1, dua $$2, azh $$3, eid $$4, dbg $$5, iz $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, elc.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         je $$7 = this.i();
         if ($$7 != je.c && $$7 != je.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends elc.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, azh $$1, eid $$2, je $$3) {
         super(ejc.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(us $$0) {
         super(ejc.B, $$0);
         this.d = $$0.h("Type");
      }

      @Override
      protected void a(ejb $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(eip $$0, eiq $$1, azh $$2) {
         this.a((elc.m)$$0, $$1, $$2, 4, 1);
         this.b((elc.m)$$0, $$1, $$2, 1, 4);
         this.c((elc.m)$$0, $$1, $$2, 1, 4);
      }

      public static elc.j a(eiq $$0, azh $$1, int $$2, int $$3, int $$4, je $$5, int $$6) {
         eid $$7 = eid.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new elc.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dcu $$0, dcs $$1, dua $$2, azh $$3, eid $$4, dbg $$5, iz $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, elc.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, dfc.eH.o(), 5, 1, 5, $$4);
               this.a($$0, dfc.eH.o(), 5, 2, 5, $$4);
               this.a($$0, dfc.eH.o(), 5, 3, 5, $$4);
               this.a($$0, dfc.cq.o().a(doc.g, je.e), 4, 3, 5, $$4);
               this.a($$0, dfc.cq.o().a(doc.g, je.f), 6, 3, 5, $$4);
               this.a($$0, dfc.cq.o().a(doc.g, je.d), 5, 3, 4, $$4);
               this.a($$0, dfc.cq.o().a(doc.g, je.c), 5, 3, 6, $$4);
               this.a($$0, dfc.jE.o(), 4, 1, 4, $$4);
               this.a($$0, dfc.jE.o(), 4, 1, 5, $$4);
               this.a($$0, dfc.jE.o(), 4, 1, 6, $$4);
               this.a($$0, dfc.jE.o(), 6, 1, 4, $$4);
               this.a($$0, dfc.jE.o(), 6, 1, 5, $$4);
               this.a($$0, dfc.jE.o(), 6, 1, 6, $$4);
               this.a($$0, dfc.jE.o(), 5, 1, 4, $$4);
               this.a($$0, dfc.jE.o(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, dfc.eH.o(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, dfc.eH.o(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, dfc.eH.o(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, dfc.eH.o(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, dfc.eH.o(), 5, 1, 5, $$4);
               this.a($$0, dfc.eH.o(), 5, 2, 5, $$4);
               this.a($$0, dfc.eH.o(), 5, 3, 5, $$4);
               this.a($$0, dfc.G.o(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, dfc.m.o(), 1, 3, $$8, $$4);
                  this.a($$0, dfc.m.o(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, dfc.m.o(), $$9, 3, 1, $$4);
                  this.a($$0, dfc.m.o(), $$9, 3, 9, $$4);
               }

               this.a($$0, dfc.m.o(), 5, 1, 4, $$4);
               this.a($$0, dfc.m.o(), 5, 1, 6, $$4);
               this.a($$0, dfc.m.o(), 5, 3, 4, $$4);
               this.a($$0, dfc.m.o(), 5, 3, 6, $$4);
               this.a($$0, dfc.m.o(), 4, 1, 5, $$4);
               this.a($$0, dfc.m.o(), 6, 1, 5, $$4);
               this.a($$0, dfc.m.o(), 4, 3, 5, $$4);
               this.a($$0, dfc.m.o(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, dfc.m.o(), 4, $$10, 4, $$4);
                  this.a($$0, dfc.m.o(), 6, $$10, 4, $$4);
                  this.a($$0, dfc.m.o(), 4, $$10, 6, $$4);
                  this.a($$0, dfc.m.o(), 6, $$10, 6, $$4);
               }

               this.a($$0, dfc.cq.o(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, dfc.n.o(), 2, 3, $$11, $$4);
                  this.a($$0, dfc.n.o(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, dfc.n.o(), 4, 3, $$11, $$4);
                     this.a($$0, dfc.n.o(), 5, 3, $$11, $$4);
                     this.a($$0, dfc.n.o(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, dfc.n.o(), 7, 3, $$11, $$4);
                  this.a($$0, dfc.n.o(), 8, 3, $$11, $$4);
               }

               dsd $$12 = dfc.cO.o().a(djg.b, je.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, eqf.x);
         }
      }
   }

   static class k extends eip.a {
      @Override
      public void a(azh $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = dfc.eJ.o();
            } else if ($$5 < 0.5F) {
               this.a = dfc.eI.o();
            } else if ($$5 < 0.55F) {
               this.a = dfc.eP.o();
            } else {
               this.a = dfc.eH.o();
            }
         } else {
            this.a = dfc.nc.o();
         }
      }
   }

   public static class l extends elc.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(ejc $$0, int $$1, int $$2, int $$3, je $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = elc.p.a.a;
      }

      public l(int $$0, azh $$1, eid $$2, je $$3) {
         super(ejc.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(ejc $$0, us $$1) {
         super($$0, $$1);
         this.d = $$1.q("Source");
      }

      public l(us $$0) {
         this(ejc.C, $$0);
      }

      @Override
      protected void a(ejb $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(eip $$0, eiq $$1, azh $$2) {
         if (this.d) {
            elc.i = elc.c.class;
         }

         this.a((elc.m)$$0, $$1, $$2, 1, 1);
      }

      public static elc.l a(eiq $$0, azh $$1, int $$2, int $$3, int $$4, je $$5, int $$6) {
         eid $$7 = eid.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new elc.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dcu $$0, dcs $$1, dua $$2, azh $$3, eid $$4, dbg $$5, iz $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, elc.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, elc.p.a.a, 1, 1, 4);
         this.a($$0, dfc.eH.o(), 2, 6, 1, $$4);
         this.a($$0, dfc.eH.o(), 1, 5, 1, $$4);
         this.a($$0, dfc.jE.o(), 1, 6, 1, $$4);
         this.a($$0, dfc.eH.o(), 1, 5, 2, $$4);
         this.a($$0, dfc.eH.o(), 1, 4, 3, $$4);
         this.a($$0, dfc.jE.o(), 1, 5, 3, $$4);
         this.a($$0, dfc.eH.o(), 2, 4, 3, $$4);
         this.a($$0, dfc.eH.o(), 3, 3, 3, $$4);
         this.a($$0, dfc.jE.o(), 3, 4, 3, $$4);
         this.a($$0, dfc.eH.o(), 3, 3, 2, $$4);
         this.a($$0, dfc.eH.o(), 3, 2, 1, $$4);
         this.a($$0, dfc.jE.o(), 3, 3, 1, $$4);
         this.a($$0, dfc.eH.o(), 2, 2, 1, $$4);
         this.a($$0, dfc.eH.o(), 1, 1, 1, $$4);
         this.a($$0, dfc.jE.o(), 1, 2, 1, $$4);
         this.a($$0, dfc.eH.o(), 1, 1, 2, $$4);
         this.a($$0, dfc.jE.o(), 1, 1, 3, $$4);
      }
   }

   public static class m extends elc.l {
      public elc.f a;
      @Nullable
      public elc.g b;
      public final List<eip> c = Lists.newArrayList();

      public m(azh $$0, int $$1, int $$2) {
         super(ejc.D, 0, $$1, $$2, a($$0));
      }

      public m(us $$0) {
         super(ejc.D, $$0);
      }

      @Override
      public iz h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends elc.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, azh $$1, eid $$2, je $$3) {
         super(ejc.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(us $$0) {
         super(ejc.E, $$0);
         this.d = $$0.q("Left");
         this.i = $$0.q("Right");
      }

      @Override
      protected void a(ejb $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(eip $$0, eiq $$1, azh $$2) {
         this.a((elc.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((elc.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((elc.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static elc.n a(eiq $$0, azh $$1, int $$2, int $$3, int $$4, je $$5, int $$6) {
         eid $$7 = eid.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new elc.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dcu $$0, dcs $$1, dua $$2, azh $$3, eid $$4, dbg $$5, iz $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, elc.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, elc.p.a.a, 1, 1, 6);
         dsd $$7 = dfc.cq.o().a(doc.g, je.f);
         dsd $$8 = dfc.cq.o().a(doc.g, je.e);
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

   public static class o extends elc.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, azh $$1, eid $$2, je $$3) {
         super(ejc.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(us $$0) {
         super(ejc.F, $$0);
      }

      @Override
      public void a(eip $$0, eiq $$1, azh $$2) {
         this.a((elc.m)$$0, $$1, $$2, 1, 1);
      }

      public static elc.o a(eiq $$0, azh $$1, int $$2, int $$3, int $$4, je $$5, int $$6) {
         eid $$7 = eid.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new elc.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dcu $$0, dcs $$1, dua $$2, azh $$3, eid $$4, dbg $$5, iz $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, elc.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, elc.p.a.a, 1, 1, 7);
         dsd $$7 = dfc.cQ.o().a(dmu.b, je.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, dfc.eH.o(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dfc.eH.o(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dfc.eH.o(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends eip {
      protected elc.p.a h = elc.p.a.a;

      protected p(ejc $$0, int $$1, eid $$2) {
         super($$0, $$1, $$2);
      }

      public p(ejc $$0, us $$1) {
         super($$0, $$1);
         this.h = elc.p.a.valueOf($$1.l("EntryDoor"));
      }

      @Override
      protected void a(ejb $$0, us $$1) {
         $$1.a("EntryDoor", this.h.name());
      }

      protected void a(dcu $$0, azh $$1, eid $$2, elc.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, dfc.eH.o(), $$4, $$5, $$6, $$2);
               this.a($$0, dfc.eH.o(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dfc.eH.o(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dfc.eH.o(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dfc.eH.o(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dfc.eH.o(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dfc.eH.o(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dfc.cN.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dfc.cN.o().a(dhg.f, dsz.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, dfc.nc.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dfc.nc.o(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dfc.eW.o().a(djb.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, dfc.eW.o().a(djb.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dfc.eW.o().a(djb.b, Boolean.valueOf(true)).a(djb.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dfc.eW.o().a(djb.b, Boolean.valueOf(true)).a(djb.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dfc.eW.o().a(djb.b, Boolean.valueOf(true)).a(djb.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dfc.eW.o().a(djb.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dfc.eW.o().a(djb.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, dfc.eH.o(), $$4, $$5, $$6, $$2);
               this.a($$0, dfc.eH.o(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dfc.eH.o(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dfc.eH.o(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dfc.eH.o(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dfc.eH.o(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dfc.eH.o(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dfc.dy.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dfc.dy.o().a(dhg.f, dsz.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dfc.dM.o().a(dfk.aE, je.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, dfc.dM.o().a(dfk.aE, je.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected elc.p.a b(azh $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return elc.p.a.a;
            case 2:
               return elc.p.a.b;
            case 3:
               return elc.p.a.c;
            case 4:
               return elc.p.a.d;
         }
      }

      @Nullable
      protected eip a(elc.m $$0, eiq $$1, azh $$2, int $$3, int $$4) {
         je $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return elc.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$5, this.g());
               case d:
                  return elc.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$5, this.g());
               case e:
                  return elc.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
               case f:
                  return elc.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected eip b(elc.m $$0, eiq $$1, azh $$2, int $$3, int $$4) {
         je $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return elc.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, je.e, this.g());
               case d:
                  return elc.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, je.e, this.g());
               case e:
                  return elc.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, je.c, this.g());
               case f:
                  return elc.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, je.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected eip c(elc.m $$0, eiq $$1, azh $$2, int $$3, int $$4) {
         je $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return elc.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, je.f, this.g());
               case d:
                  return elc.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, je.f, this.g());
               case e:
                  return elc.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, je.d, this.g());
               case f:
                  return elc.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, je.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(eid $$0) {
         return $$0 != null && $$0.i() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;
      }
   }

   public abstract static class q extends elc.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(ejc $$0, int $$1, eid $$2) {
         super($$0, $$1, $$2);
      }

      public q(ejc $$0, us $$1) {
         super($$0, $$1);
      }
   }
}
