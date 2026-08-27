import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class eih {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final eih.f[] g = new eih.f[]{
      new eih.f(eih.n.class, 40, 0),
      new eih.f(eih.h.class, 5, 5),
      new eih.f(eih.d.class, 20, 0),
      new eih.f(eih.i.class, 20, 0),
      new eih.f(eih.j.class, 10, 6),
      new eih.f(eih.o.class, 5, 5),
      new eih.f(eih.l.class, 5, 5),
      new eih.f(eih.c.class, 5, 4),
      new eih.f(eih.a.class, 5, 4),
      new eih.f(eih.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new eih.f(eih.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<eih.f> h;
   static Class<? extends eih.p> i;
   private static int j;
   static final eih.k k = new eih.k();

   public static void a() {
      h = Lists.newArrayList();

      for (eih.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (eih.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static eih.p a(Class<? extends eih.p> $$0, efv $$1, axt $$2, int $$3, int $$4, int $$5, @Nullable ij $$6, int $$7) {
      eih.p $$8 = null;
      if ($$0 == eih.n.class) {
         $$8 = eih.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eih.h.class) {
         $$8 = eih.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eih.d.class) {
         $$8 = eih.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eih.i.class) {
         $$8 = eih.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eih.j.class) {
         $$8 = eih.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eih.o.class) {
         $$8 = eih.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eih.l.class) {
         $$8 = eih.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eih.c.class) {
         $$8 = eih.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eih.a.class) {
         $$8 = eih.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eih.e.class) {
         $$8 = eih.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eih.g.class) {
         $$8 = eih.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static eih.p a(eih.m $$0, efv $$1, axt $$2, int $$3, int $$4, int $$5, ij $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            eih.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (eih.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  eih.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         efi $$13 = eih.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.i() > 1 ? new eih.b($$7, $$13, $$6) : null;
      }
   }

   static efu b(eih.m $$0, efv $$1, axt $$2, int $$3, int $$4, int $$5, @Nullable ij $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
         efu $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends eih.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, axt $$1, efi $$2, ij $$3) {
         super(egh.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(to $$0) {
         super(egh.t, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(egg $$0, to $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(efu $$0, efv $$1, axt $$2) {
         this.a((eih.m)$$0, $$1, $$2, 1, 1);
      }

      public static eih.a a(efv $$0, axt $$1, int $$2, int $$3, int $$4, ij $$5, int $$6) {
         efi $$7 = efi.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new eih.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, eih.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, eih.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, dcj.eH.n(), dcj.eH.n(), false);
         this.a($$0, dcj.jK.n(), 3, 1, 1, $$4);
         this.a($$0, dcj.jK.n(), 3, 1, 5, $$4);
         this.a($$0, dcj.jK.n(), 3, 2, 2, $$4);
         this.a($$0, dcj.jK.n(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, dcj.jK.n(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, eni.y);
         }
      }
   }

   public static class b extends eih.p {
      private final int a;

      public b(int $$0, efi $$1, ij $$2) {
         super(egh.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != ij.c && $$2 != ij.d ? $$1.d() : $$1.f();
      }

      public b(to $$0) {
         super(egh.u, $$0);
         this.a = $$0.h("Steps");
      }

      @Override
      protected void a(egg $$0, to $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static efi a(efv $$0, axt $$1, int $$2, int $$3, int $$4, ij $$5) {
         int $$6 = 3;
         efi $$7 = efi.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         efu $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().i() == $$7.i()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = efi.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return efi.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, dcj.eH.n(), 0, 0, $$7, $$4);
            this.a($$0, dcj.eH.n(), 1, 0, $$7, $$4);
            this.a($$0, dcj.eH.n(), 2, 0, $$7, $$4);
            this.a($$0, dcj.eH.n(), 3, 0, $$7, $$4);
            this.a($$0, dcj.eH.n(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, dcj.eH.n(), 0, $$8, $$7, $$4);
               this.a($$0, dcj.nc.n(), 1, $$8, $$7, $$4);
               this.a($$0, dcj.nc.n(), 2, $$8, $$7, $$4);
               this.a($$0, dcj.nc.n(), 3, $$8, $$7, $$4);
               this.a($$0, dcj.eH.n(), 4, $$8, $$7, $$4);
            }

            this.a($$0, dcj.eH.n(), 0, 4, $$7, $$4);
            this.a($$0, dcj.eH.n(), 1, 4, $$7, $$4);
            this.a($$0, dcj.eH.n(), 2, 4, $$7, $$4);
            this.a($$0, dcj.eH.n(), 3, 4, $$7, $$4);
            this.a($$0, dcj.eH.n(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends eih.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, axt $$1, efi $$2, ij $$3) {
         super(egh.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(to $$0) {
         super(egh.v, $$0);
         this.d = $$0.q("leftLow");
         this.i = $$0.q("leftHigh");
         this.j = $$0.q("rightLow");
         this.k = $$0.q("rightHigh");
      }

      @Override
      protected void a(egg $$0, to $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(efu $$0, efv $$1, axt $$2) {
         int $$3 = 3;
         int $$4 = 5;
         ij $$5 = this.i();
         if ($$5 == ij.e || $$5 == ij.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((eih.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((eih.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((eih.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((eih.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((eih.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static eih.c a(efv $$0, axt $$1, int $$2, int $$3, int $$4, ij $$5, int $$6) {
         efi $$7 = efi.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eih.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, eih.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, eih.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, eih.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, eih.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, eih.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, eih.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, dcj.jE.n(), dcj.jE.n(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, dcj.jE.n(), dcj.jE.n(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, eih.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, dcj.jE.n(), dcj.jE.n(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, dcj.jE.n(), dcj.jE.n(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, dcj.jE.n(), dcj.jE.n(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, dcj.jE.n(), dcj.jE.n(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, dcj.jE.n().a(djj.b, dqq.c), dcj.jE.n().a(djj.b, dqq.c), false);
         this.a($$0, dcj.cq.n().a(dli.g, ij.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends eih.q {
      public d(int $$0, axt $$1, efi $$2, ij $$3) {
         super(egh.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(to $$0) {
         super(egh.w, $$0);
      }

      @Override
      public void a(efu $$0, efv $$1, axt $$2) {
         ij $$3 = this.i();
         if ($$3 != ij.c && $$3 != ij.f) {
            this.c((eih.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((eih.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static eih.d a(efv $$0, axt $$1, int $$2, int $$3, int $$4, ij $$5, int $$6) {
         efi $$7 = efi.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eih.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, eih.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         ij $$7 = this.i();
         if ($$7 != ij.c && $$7 != ij.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends eih.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, axt $$1, efi $$2, ij $$3) {
         super(egh.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.e() > 6;
      }

      public e(to $$0) {
         super(egh.x, $$0);
         this.i = $$0.q("Tall");
      }

      @Override
      protected void a(egg $$0, to $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static eih.e a(efv $$0, axt $$1, int $$2, int $$3, int $$4, ij $$5, int $$6) {
         efi $$7 = efi.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = efi.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new eih.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, eih.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, dcj.bs.n(), dcj.bs.n(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dcj.n.n(), dcj.n.n(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dcj.n.n(), dcj.n.n(), false);
               this.a($$0, dcj.cq.n().a(dli.g, ij.f), 2, 3, $$10, $$4);
               this.a($$0, dcj.cq.n().a(dli.g, ij.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dcj.n.n(), dcj.n.n(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dcj.n.n(), dcj.n.n(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dcj.cl.n(), dcj.cl.n(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dcj.cl.n(), dcj.cl.n(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dcj.cl.n(), dcj.cl.n(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dcj.cl.n(), dcj.cl.n(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, dcj.cl.n(), dcj.cl.n(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, dcj.cl.n(), dcj.cl.n(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, dcj.cl.n(), dcj.cl.n(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, dcj.n.n(), dcj.n.n(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, dcj.n.n(), dcj.n.n(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, dcj.n.n(), dcj.n.n(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, dcj.n.n(), dcj.n.n(), false);
            this.a($$0, dcj.n.n(), 9, 5, 11, $$4);
            this.a($$0, dcj.n.n(), 8, 5, 11, $$4);
            this.a($$0, dcj.n.n(), 9, 5, 10, $$4);
            dpi $$12 = dcj.dU.n().a(dff.d, Boolean.valueOf(true)).a(dff.b, Boolean.valueOf(true));
            dpi $$13 = dcj.dU.n().a(dff.a, Boolean.valueOf(true)).a(dff.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, dcj.dU.n().a(dff.a, Boolean.valueOf(true)).a(dff.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, dcj.dU.n().a(dff.c, Boolean.valueOf(true)).a(dff.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, dcj.dU.n().a(dff.a, Boolean.valueOf(true)).a(dff.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, dcj.dU.n().a(dff.c, Boolean.valueOf(true)).a(dff.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, dcj.dU.n().a(dff.a, Boolean.valueOf(true)).a(dff.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            dpi $$15 = dcj.cO.n().a(dgm.b, ij.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            dpi $$18 = dcj.dU.n().a(dff.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            dpi $$19 = dcj.dU.n().a(dff.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            dpi $$20 = $$13.a(dff.d, Boolean.valueOf(true)).a(dff.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.a(dff.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.a(dff.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.a(dff.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.a(dff.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            dpi $$21 = dcj.cp.n();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, eni.w);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, eni.w);
         }
      }
   }

   static class f {
      public final Class<? extends eih.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends eih.p> $$0, int $$1, int $$2) {
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

   public static class g extends eih.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, efi $$1, ij $$2) {
         super(egh.y, $$0, $$1);
         this.a($$2);
      }

      public g(to $$0) {
         super(egh.y, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(egg $$0, to $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(efu $$0, efv $$1, axt $$2) {
         if ($$0 != null) {
            ((eih.m)$$0).b = this;
         }
      }

      public static eih.g a(efv $$0, int $$1, int $$2, int $$3, ij $$4, int $$5) {
         efi $$6 = efi.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new eih.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, eih.k);
         this.a($$0, $$3, $$4, eih.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, eih.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, eih.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, eih.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, eih.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, eih.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, eih.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, dcj.H.n(), dcj.H.n(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, dcj.H.n(), dcj.H.n(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, eih.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, dcj.H.n(), dcj.H.n(), false);
         dpi $$8 = dcj.eW.n().a(dgh.a, Boolean.valueOf(true)).a(dgh.c, Boolean.valueOf(true));
         dpi $$9 = dcj.eW.n().a(dgh.d, Boolean.valueOf(true)).a(dgh.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         dpi $$12 = dcj.fj.n().a(dka.b, ij.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, eih.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, eih.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, eih.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         dpi $$14 = dcj.fy.n().a(dew.b, ij.c);
         dpi $$15 = dcj.fy.n().a(dew.b, ij.d);
         dpi $$16 = dcj.fy.n().a(dew.b, ij.f);
         dpi $$17 = dcj.fy.n().a(dew.b, ij.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.a(dew.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.a(dew.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.a(dew.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.a(dew.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.a(dew.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.a(dew.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.a(dew.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.a(dew.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.a(dew.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.a(dew.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.a(dew.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.a(dew.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            dpi $$21 = dcj.fx.n();
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
            id $$22 = this.b(5, 3, 6);
            if ($$4.b($$22)) {
               this.d = true;
               $$0.a($$22, dcj.ct.n(), 2);
               if ($$0.c_($$22) instanceof doc $$24) {
                  $$24.a(bqg.aL, $$3);
               }
            }
         }
      }
   }

   public static class h extends eih.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, axt $$1, efi $$2, ij $$3) {
         super(egh.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(to $$0) {
         super(egh.z, $$0);
      }

      @Override
      public void a(efu $$0, efv $$1, axt $$2) {
         this.a((eih.m)$$0, $$1, $$2, 1, 1);
      }

      public static eih.h a(efv $$0, axt $$1, int $$2, int $$3, int $$4, ij $$5, int $$6) {
         efi $$7 = efi.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eih.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, eih.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, eih.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, eih.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, eih.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, eih.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, dcj.eW.n().a(dgh.a, Boolean.valueOf(true)).a(dgh.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, dcj.eW.n().a(dgh.a, Boolean.valueOf(true)).a(dgh.c, Boolean.valueOf(true)).a(dgh.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, dcj.eW.n().a(dgh.a, Boolean.valueOf(true)).a(dgh.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, dcj.eW.n().a(dgh.d, Boolean.valueOf(true)).a(dgh.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, dcj.eW.n().a(dgh.d, Boolean.valueOf(true)).a(dgh.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, dcj.eW.n().a(dgh.d, Boolean.valueOf(true)).a(dgh.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, dcj.eW.n().a(dgh.a, Boolean.valueOf(true)).a(dgh.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, dcj.eW.n().a(dgh.a, Boolean.valueOf(true)).a(dgh.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         dpi $$8 = dcj.dy.n().a(den.b, ij.e);
         dpi $$9 = dcj.dy.n().a(den.b, ij.e).a(den.f, dqe.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends eih.q {
      public i(int $$0, axt $$1, efi $$2, ij $$3) {
         super(egh.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(to $$0) {
         super(egh.A, $$0);
      }

      @Override
      public void a(efu $$0, efv $$1, axt $$2) {
         ij $$3 = this.i();
         if ($$3 != ij.c && $$3 != ij.f) {
            this.b((eih.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((eih.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static eih.i a(efv $$0, axt $$1, int $$2, int $$3, int $$4, ij $$5, int $$6) {
         efi $$7 = efi.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eih.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, eih.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         ij $$7 = this.i();
         if ($$7 != ij.c && $$7 != ij.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends eih.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, axt $$1, efi $$2, ij $$3) {
         super(egh.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(to $$0) {
         super(egh.B, $$0);
         this.d = $$0.h("Type");
      }

      @Override
      protected void a(egg $$0, to $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(efu $$0, efv $$1, axt $$2) {
         this.a((eih.m)$$0, $$1, $$2, 4, 1);
         this.b((eih.m)$$0, $$1, $$2, 1, 4);
         this.c((eih.m)$$0, $$1, $$2, 1, 4);
      }

      public static eih.j a(efv $$0, axt $$1, int $$2, int $$3, int $$4, ij $$5, int $$6) {
         efi $$7 = efi.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eih.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, eih.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, dcj.eH.n(), 5, 1, 5, $$4);
               this.a($$0, dcj.eH.n(), 5, 2, 5, $$4);
               this.a($$0, dcj.eH.n(), 5, 3, 5, $$4);
               this.a($$0, dcj.cq.n().a(dli.g, ij.e), 4, 3, 5, $$4);
               this.a($$0, dcj.cq.n().a(dli.g, ij.f), 6, 3, 5, $$4);
               this.a($$0, dcj.cq.n().a(dli.g, ij.d), 5, 3, 4, $$4);
               this.a($$0, dcj.cq.n().a(dli.g, ij.c), 5, 3, 6, $$4);
               this.a($$0, dcj.jE.n(), 4, 1, 4, $$4);
               this.a($$0, dcj.jE.n(), 4, 1, 5, $$4);
               this.a($$0, dcj.jE.n(), 4, 1, 6, $$4);
               this.a($$0, dcj.jE.n(), 6, 1, 4, $$4);
               this.a($$0, dcj.jE.n(), 6, 1, 5, $$4);
               this.a($$0, dcj.jE.n(), 6, 1, 6, $$4);
               this.a($$0, dcj.jE.n(), 5, 1, 4, $$4);
               this.a($$0, dcj.jE.n(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, dcj.eH.n(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, dcj.eH.n(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, dcj.eH.n(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, dcj.eH.n(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, dcj.eH.n(), 5, 1, 5, $$4);
               this.a($$0, dcj.eH.n(), 5, 2, 5, $$4);
               this.a($$0, dcj.eH.n(), 5, 3, 5, $$4);
               this.a($$0, dcj.G.n(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, dcj.m.n(), 1, 3, $$8, $$4);
                  this.a($$0, dcj.m.n(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, dcj.m.n(), $$9, 3, 1, $$4);
                  this.a($$0, dcj.m.n(), $$9, 3, 9, $$4);
               }

               this.a($$0, dcj.m.n(), 5, 1, 4, $$4);
               this.a($$0, dcj.m.n(), 5, 1, 6, $$4);
               this.a($$0, dcj.m.n(), 5, 3, 4, $$4);
               this.a($$0, dcj.m.n(), 5, 3, 6, $$4);
               this.a($$0, dcj.m.n(), 4, 1, 5, $$4);
               this.a($$0, dcj.m.n(), 6, 1, 5, $$4);
               this.a($$0, dcj.m.n(), 4, 3, 5, $$4);
               this.a($$0, dcj.m.n(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, dcj.m.n(), 4, $$10, 4, $$4);
                  this.a($$0, dcj.m.n(), 6, $$10, 4, $$4);
                  this.a($$0, dcj.m.n(), 4, $$10, 6, $$4);
                  this.a($$0, dcj.m.n(), 6, $$10, 6, $$4);
               }

               this.a($$0, dcj.cq.n(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, dcj.n.n(), 2, 3, $$11, $$4);
                  this.a($$0, dcj.n.n(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, dcj.n.n(), 4, 3, $$11, $$4);
                     this.a($$0, dcj.n.n(), 5, 3, $$11, $$4);
                     this.a($$0, dcj.n.n(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, dcj.n.n(), 7, 3, $$11, $$4);
                  this.a($$0, dcj.n.n(), 8, 3, $$11, $$4);
               }

               dpi $$12 = dcj.cO.n().a(dgm.b, ij.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, eni.x);
         }
      }
   }

   static class k extends efu.a {
      @Override
      public void a(axt $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = dcj.eJ.n();
            } else if ($$5 < 0.5F) {
               this.a = dcj.eI.n();
            } else if ($$5 < 0.55F) {
               this.a = dcj.eP.n();
            } else {
               this.a = dcj.eH.n();
            }
         } else {
            this.a = dcj.nc.n();
         }
      }
   }

   public static class l extends eih.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(egh $$0, int $$1, int $$2, int $$3, ij $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = eih.p.a.a;
      }

      public l(int $$0, axt $$1, efi $$2, ij $$3) {
         super(egh.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(egh $$0, to $$1) {
         super($$0, $$1);
         this.d = $$1.q("Source");
      }

      public l(to $$0) {
         this(egh.C, $$0);
      }

      @Override
      protected void a(egg $$0, to $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(efu $$0, efv $$1, axt $$2) {
         if (this.d) {
            eih.i = eih.c.class;
         }

         this.a((eih.m)$$0, $$1, $$2, 1, 1);
      }

      public static eih.l a(efv $$0, axt $$1, int $$2, int $$3, int $$4, ij $$5, int $$6) {
         efi $$7 = efi.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eih.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, eih.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, eih.p.a.a, 1, 1, 4);
         this.a($$0, dcj.eH.n(), 2, 6, 1, $$4);
         this.a($$0, dcj.eH.n(), 1, 5, 1, $$4);
         this.a($$0, dcj.jE.n(), 1, 6, 1, $$4);
         this.a($$0, dcj.eH.n(), 1, 5, 2, $$4);
         this.a($$0, dcj.eH.n(), 1, 4, 3, $$4);
         this.a($$0, dcj.jE.n(), 1, 5, 3, $$4);
         this.a($$0, dcj.eH.n(), 2, 4, 3, $$4);
         this.a($$0, dcj.eH.n(), 3, 3, 3, $$4);
         this.a($$0, dcj.jE.n(), 3, 4, 3, $$4);
         this.a($$0, dcj.eH.n(), 3, 3, 2, $$4);
         this.a($$0, dcj.eH.n(), 3, 2, 1, $$4);
         this.a($$0, dcj.jE.n(), 3, 3, 1, $$4);
         this.a($$0, dcj.eH.n(), 2, 2, 1, $$4);
         this.a($$0, dcj.eH.n(), 1, 1, 1, $$4);
         this.a($$0, dcj.jE.n(), 1, 2, 1, $$4);
         this.a($$0, dcj.eH.n(), 1, 1, 2, $$4);
         this.a($$0, dcj.jE.n(), 1, 1, 3, $$4);
      }
   }

   public static class m extends eih.l {
      public eih.f a;
      @Nullable
      public eih.g b;
      public final List<efu> c = Lists.newArrayList();

      public m(axt $$0, int $$1, int $$2) {
         super(egh.D, 0, $$1, $$2, a($$0));
      }

      public m(to $$0) {
         super(egh.D, $$0);
      }

      @Override
      public id h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends eih.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, axt $$1, efi $$2, ij $$3) {
         super(egh.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(to $$0) {
         super(egh.E, $$0);
         this.d = $$0.q("Left");
         this.i = $$0.q("Right");
      }

      @Override
      protected void a(egg $$0, to $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(efu $$0, efv $$1, axt $$2) {
         this.a((eih.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((eih.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((eih.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static eih.n a(efv $$0, axt $$1, int $$2, int $$3, int $$4, ij $$5, int $$6) {
         efi $$7 = efi.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new eih.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, eih.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, eih.p.a.a, 1, 1, 6);
         dpi $$7 = dcj.cq.n().a(dli.g, ij.f);
         dpi $$8 = dcj.cq.n().a(dli.g, ij.e);
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

   public static class o extends eih.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, axt $$1, efi $$2, ij $$3) {
         super(egh.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(to $$0) {
         super(egh.F, $$0);
      }

      @Override
      public void a(efu $$0, efv $$1, axt $$2) {
         this.a((eih.m)$$0, $$1, $$2, 1, 1);
      }

      public static eih.o a(efv $$0, axt $$1, int $$2, int $$3, int $$4, ij $$5, int $$6) {
         efi $$7 = efi.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new eih.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, eih.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, eih.p.a.a, 1, 1, 7);
         dpi $$7 = dcj.cQ.n().a(dka.b, ij.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, dcj.eH.n(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dcj.eH.n(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dcj.eH.n(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends efu {
      protected eih.p.a h = eih.p.a.a;

      protected p(egh $$0, int $$1, efi $$2) {
         super($$0, $$1, $$2);
      }

      public p(egh $$0, to $$1) {
         super($$0, $$1);
         this.h = eih.p.a.valueOf($$1.l("EntryDoor"));
      }

      @Override
      protected void a(egg $$0, to $$1) {
         $$1.a("EntryDoor", this.h.name());
      }

      protected void a(dab $$0, axt $$1, efi $$2, eih.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, dcj.eH.n(), $$4, $$5, $$6, $$2);
               this.a($$0, dcj.eH.n(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dcj.eH.n(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dcj.eH.n(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dcj.eH.n(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dcj.eH.n(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dcj.eH.n(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dcj.cN.n(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dcj.cN.n().a(den.f, dqe.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, dcj.nc.n(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dcj.nc.n(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dcj.eW.n().a(dgh.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, dcj.eW.n().a(dgh.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dcj.eW.n().a(dgh.b, Boolean.valueOf(true)).a(dgh.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dcj.eW.n().a(dgh.b, Boolean.valueOf(true)).a(dgh.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dcj.eW.n().a(dgh.b, Boolean.valueOf(true)).a(dgh.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dcj.eW.n().a(dgh.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dcj.eW.n().a(dgh.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, dcj.eH.n(), $$4, $$5, $$6, $$2);
               this.a($$0, dcj.eH.n(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dcj.eH.n(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dcj.eH.n(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dcj.eH.n(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dcj.eH.n(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dcj.eH.n(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dcj.dy.n(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dcj.dy.n().a(den.f, dqe.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dcj.dM.n().a(dcr.aE, ij.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, dcj.dM.n().a(dcr.aE, ij.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected eih.p.a b(axt $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return eih.p.a.a;
            case 2:
               return eih.p.a.b;
            case 3:
               return eih.p.a.c;
            case 4:
               return eih.p.a.d;
         }
      }

      @Nullable
      protected efu a(eih.m $$0, efv $$1, axt $$2, int $$3, int $$4) {
         ij $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eih.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$5, this.g());
               case d:
                  return eih.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$5, this.g());
               case e:
                  return eih.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
               case f:
                  return eih.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected efu b(eih.m $$0, efv $$1, axt $$2, int $$3, int $$4) {
         ij $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eih.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, ij.e, this.g());
               case d:
                  return eih.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, ij.e, this.g());
               case e:
                  return eih.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, ij.c, this.g());
               case f:
                  return eih.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, ij.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected efu c(eih.m $$0, efv $$1, axt $$2, int $$3, int $$4) {
         ij $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eih.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, ij.f, this.g());
               case d:
                  return eih.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, ij.f, this.g());
               case e:
                  return eih.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, ij.d, this.g());
               case f:
                  return eih.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, ij.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(efi $$0) {
         return $$0 != null && $$0.i() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;
      }
   }

   public abstract static class q extends eih.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(egh $$0, int $$1, efi $$2) {
         super($$0, $$1, $$2);
      }

      public q(egh $$0, to $$1) {
         super($$0, $$1);
      }
   }
}
