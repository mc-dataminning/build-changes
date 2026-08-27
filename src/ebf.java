import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class ebf {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final ebf.f[] g = new ebf.f[]{
      new ebf.f(ebf.n.class, 40, 0),
      new ebf.f(ebf.h.class, 5, 5),
      new ebf.f(ebf.d.class, 20, 0),
      new ebf.f(ebf.i.class, 20, 0),
      new ebf.f(ebf.j.class, 10, 6),
      new ebf.f(ebf.o.class, 5, 5),
      new ebf.f(ebf.l.class, 5, 5),
      new ebf.f(ebf.c.class, 5, 4),
      new ebf.f(ebf.a.class, 5, 4),
      new ebf.f(ebf.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new ebf.f(ebf.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<ebf.f> h;
   static Class<? extends ebf.p> i;
   private static int j;
   static final ebf.k k = new ebf.k();

   public static void a() {
      h = Lists.newArrayList();

      for (ebf.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (ebf.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static ebf.p a(Class<? extends ebf.p> $$0, dyt $$1, auf $$2, int $$3, int $$4, int $$5, @Nullable ia $$6, int $$7) {
      ebf.p $$8 = null;
      if ($$0 == ebf.n.class) {
         $$8 = ebf.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ebf.h.class) {
         $$8 = ebf.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ebf.d.class) {
         $$8 = ebf.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ebf.i.class) {
         $$8 = ebf.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ebf.j.class) {
         $$8 = ebf.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ebf.o.class) {
         $$8 = ebf.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ebf.l.class) {
         $$8 = ebf.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ebf.c.class) {
         $$8 = ebf.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ebf.a.class) {
         $$8 = ebf.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ebf.e.class) {
         $$8 = ebf.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ebf.g.class) {
         $$8 = ebf.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static ebf.p a(ebf.m $$0, dyt $$1, auf $$2, int $$3, int $$4, int $$5, ia $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            ebf.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (ebf.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  ebf.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         dyg $$13 = ebf.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.i() > 1 ? new ebf.b($$7, $$13, $$6) : null;
      }
   }

   static dys b(ebf.m $$0, dyt $$1, auf $$2, int $$3, int $$4, int $$5, @Nullable ia $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
         dys $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends ebf.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, auf $$1, dyg $$2, ia $$3) {
         super(dzf.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(sj $$0) {
         super(dzf.t, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(dze $$0, sj $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(dys $$0, dyt $$1, auf $$2) {
         this.a((ebf.m)$$0, $$1, $$2, 1, 1);
      }

      public static ebf.a a(dyt $$0, auf $$1, int $$2, int $$3, int $$4, ia $$5, int $$6) {
         dyg $$7 = dyg.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new ebf.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(ctt $$0, ctr $$1, dkm $$2, auf $$3, dyg $$4, csf $$5, hv $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, ebf.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, ebf.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, cwb.eH.o(), cwb.eH.o(), false);
         this.a($$0, cwb.jK.o(), 3, 1, 1, $$4);
         this.a($$0, cwb.jK.o(), 3, 1, 5, $$4);
         this.a($$0, cwb.jK.o(), 3, 2, 2, $$4);
         this.a($$0, cwb.jK.o(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, cwb.jK.o(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, egc.y);
         }
      }
   }

   public static class b extends ebf.p {
      private final int a;

      public b(int $$0, dyg $$1, ia $$2) {
         super(dzf.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != ia.c && $$2 != ia.d ? $$1.d() : $$1.f();
      }

      public b(sj $$0) {
         super(dzf.u, $$0);
         this.a = $$0.h("Steps");
      }

      @Override
      protected void a(dze $$0, sj $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static dyg a(dyt $$0, auf $$1, int $$2, int $$3, int $$4, ia $$5) {
         int $$6 = 3;
         dyg $$7 = dyg.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         dys $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().i() == $$7.i()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = dyg.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return dyg.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(ctt $$0, ctr $$1, dkm $$2, auf $$3, dyg $$4, csf $$5, hv $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, cwb.eH.o(), 0, 0, $$7, $$4);
            this.a($$0, cwb.eH.o(), 1, 0, $$7, $$4);
            this.a($$0, cwb.eH.o(), 2, 0, $$7, $$4);
            this.a($$0, cwb.eH.o(), 3, 0, $$7, $$4);
            this.a($$0, cwb.eH.o(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, cwb.eH.o(), 0, $$8, $$7, $$4);
               this.a($$0, cwb.nc.o(), 1, $$8, $$7, $$4);
               this.a($$0, cwb.nc.o(), 2, $$8, $$7, $$4);
               this.a($$0, cwb.nc.o(), 3, $$8, $$7, $$4);
               this.a($$0, cwb.eH.o(), 4, $$8, $$7, $$4);
            }

            this.a($$0, cwb.eH.o(), 0, 4, $$7, $$4);
            this.a($$0, cwb.eH.o(), 1, 4, $$7, $$4);
            this.a($$0, cwb.eH.o(), 2, 4, $$7, $$4);
            this.a($$0, cwb.eH.o(), 3, 4, $$7, $$4);
            this.a($$0, cwb.eH.o(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends ebf.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, auf $$1, dyg $$2, ia $$3) {
         super(dzf.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(sj $$0) {
         super(dzf.v, $$0);
         this.d = $$0.q("leftLow");
         this.i = $$0.q("leftHigh");
         this.j = $$0.q("rightLow");
         this.k = $$0.q("rightHigh");
      }

      @Override
      protected void a(dze $$0, sj $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(dys $$0, dyt $$1, auf $$2) {
         int $$3 = 3;
         int $$4 = 5;
         ia $$5 = this.i();
         if ($$5 == ia.e || $$5 == ia.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((ebf.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((ebf.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((ebf.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((ebf.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((ebf.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static ebf.c a(dyt $$0, auf $$1, int $$2, int $$3, int $$4, ia $$5, int $$6) {
         dyg $$7 = dyg.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new ebf.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(ctt $$0, ctr $$1, dkm $$2, auf $$3, dyg $$4, csf $$5, hv $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, ebf.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, ebf.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, ebf.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, ebf.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, ebf.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, ebf.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, cwb.jE.o(), cwb.jE.o(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, cwb.jE.o(), cwb.jE.o(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, ebf.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, cwb.jE.o(), cwb.jE.o(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, cwb.jE.o(), cwb.jE.o(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, cwb.jE.o(), cwb.jE.o(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, cwb.jE.o(), cwb.jE.o(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, cwb.jE.o().a(ddb.b, djx.c), cwb.jE.o().a(ddb.b, djx.c), false);
         this.a($$0, cwb.cq.o().a(dez.g, ia.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends ebf.q {
      public d(int $$0, auf $$1, dyg $$2, ia $$3) {
         super(dzf.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(sj $$0) {
         super(dzf.w, $$0);
      }

      @Override
      public void a(dys $$0, dyt $$1, auf $$2) {
         ia $$3 = this.i();
         if ($$3 != ia.c && $$3 != ia.f) {
            this.c((ebf.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((ebf.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static ebf.d a(dyt $$0, auf $$1, int $$2, int $$3, int $$4, ia $$5, int $$6) {
         dyg $$7 = dyg.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new ebf.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(ctt $$0, ctr $$1, dkm $$2, auf $$3, dyg $$4, csf $$5, hv $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, ebf.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         ia $$7 = this.i();
         if ($$7 != ia.c && $$7 != ia.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends ebf.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, auf $$1, dyg $$2, ia $$3) {
         super(dzf.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.e() > 6;
      }

      public e(sj $$0) {
         super(dzf.x, $$0);
         this.i = $$0.q("Tall");
      }

      @Override
      protected void a(dze $$0, sj $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static ebf.e a(dyt $$0, auf $$1, int $$2, int $$3, int $$4, ia $$5, int $$6) {
         dyg $$7 = dyg.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = dyg.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new ebf.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(ctt $$0, ctr $$1, dkm $$2, auf $$3, dyg $$4, csf $$5, hv $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, ebf.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, cwb.bs.o(), cwb.bs.o(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, cwb.n.o(), cwb.n.o(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, cwb.n.o(), cwb.n.o(), false);
               this.a($$0, cwb.cq.o().a(dez.g, ia.f), 2, 3, $$10, $$4);
               this.a($$0, cwb.cq.o().a(dez.g, ia.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, cwb.n.o(), cwb.n.o(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, cwb.n.o(), cwb.n.o(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, cwb.cl.o(), cwb.cl.o(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, cwb.cl.o(), cwb.cl.o(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, cwb.cl.o(), cwb.cl.o(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, cwb.cl.o(), cwb.cl.o(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, cwb.cl.o(), cwb.cl.o(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, cwb.cl.o(), cwb.cl.o(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, cwb.cl.o(), cwb.cl.o(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, cwb.n.o(), cwb.n.o(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, cwb.n.o(), cwb.n.o(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, cwb.n.o(), cwb.n.o(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, cwb.n.o(), cwb.n.o(), false);
            this.a($$0, cwb.n.o(), 9, 5, 11, $$4);
            this.a($$0, cwb.n.o(), 8, 5, 11, $$4);
            this.a($$0, cwb.n.o(), 9, 5, 10, $$4);
            dip $$12 = cwb.dU.o().a(cyx.d, Boolean.valueOf(true)).a(cyx.b, Boolean.valueOf(true));
            dip $$13 = cwb.dU.o().a(cyx.a, Boolean.valueOf(true)).a(cyx.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, cwb.dU.o().a(cyx.a, Boolean.valueOf(true)).a(cyx.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, cwb.dU.o().a(cyx.c, Boolean.valueOf(true)).a(cyx.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, cwb.dU.o().a(cyx.a, Boolean.valueOf(true)).a(cyx.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, cwb.dU.o().a(cyx.c, Boolean.valueOf(true)).a(cyx.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, cwb.dU.o().a(cyx.a, Boolean.valueOf(true)).a(cyx.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            dip $$15 = cwb.cO.o().a(dae.b, ia.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            dip $$18 = cwb.dU.o().a(cyx.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            dip $$19 = cwb.dU.o().a(cyx.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            dip $$20 = $$13.a(cyx.d, Boolean.valueOf(true)).a(cyx.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.a(cyx.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.a(cyx.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.a(cyx.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.a(cyx.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            dip $$21 = cwb.cp.o();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, egc.w);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, egc.w);
         }
      }
   }

   static class f {
      public final Class<? extends ebf.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends ebf.p> $$0, int $$1, int $$2) {
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

   public static class g extends ebf.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, dyg $$1, ia $$2) {
         super(dzf.y, $$0, $$1);
         this.a($$2);
      }

      public g(sj $$0) {
         super(dzf.y, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(dze $$0, sj $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(dys $$0, dyt $$1, auf $$2) {
         if ($$0 != null) {
            ((ebf.m)$$0).b = this;
         }
      }

      public static ebf.g a(dyt $$0, int $$1, int $$2, int $$3, ia $$4, int $$5) {
         dyg $$6 = dyg.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new ebf.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(ctt $$0, ctr $$1, dkm $$2, auf $$3, dyg $$4, csf $$5, hv $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, ebf.k);
         this.a($$0, $$3, $$4, ebf.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, ebf.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, ebf.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, ebf.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, ebf.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, ebf.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, ebf.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, cwb.H.o(), cwb.H.o(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, cwb.H.o(), cwb.H.o(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, ebf.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, cwb.H.o(), cwb.H.o(), false);
         dip $$8 = cwb.eW.o().a(czz.a, Boolean.valueOf(true)).a(czz.c, Boolean.valueOf(true));
         dip $$9 = cwb.eW.o().a(czz.d, Boolean.valueOf(true)).a(czz.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         dip $$12 = cwb.fj.o().a(dds.b, ia.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, ebf.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, ebf.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, ebf.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         dip $$14 = cwb.fy.o().a(cyo.b, ia.c);
         dip $$15 = cwb.fy.o().a(cyo.b, ia.d);
         dip $$16 = cwb.fy.o().a(cyo.b, ia.f);
         dip $$17 = cwb.fy.o().a(cyo.b, ia.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.a(cyo.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.a(cyo.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.a(cyo.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.a(cyo.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.a(cyo.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.a(cyo.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.a(cyo.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.a(cyo.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.a(cyo.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.a(cyo.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.a(cyo.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.a(cyo.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            dip $$21 = cwb.fx.o();
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
            hv $$22 = this.b(5, 3, 6);
            if ($$4.b($$22)) {
               this.d = true;
               $$0.a($$22, cwb.ct.o(), 2);
               if ($$0.c_($$22) instanceof dhq $$24) {
                  $$24.a(blj.aJ, $$3);
               }
            }
         }
      }
   }

   public static class h extends ebf.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, auf $$1, dyg $$2, ia $$3) {
         super(dzf.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(sj $$0) {
         super(dzf.z, $$0);
      }

      @Override
      public void a(dys $$0, dyt $$1, auf $$2) {
         this.a((ebf.m)$$0, $$1, $$2, 1, 1);
      }

      public static ebf.h a(dyt $$0, auf $$1, int $$2, int $$3, int $$4, ia $$5, int $$6) {
         dyg $$7 = dyg.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new ebf.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(ctt $$0, ctr $$1, dkm $$2, auf $$3, dyg $$4, csf $$5, hv $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, ebf.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, ebf.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, ebf.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, ebf.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, ebf.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, cwb.eW.o().a(czz.a, Boolean.valueOf(true)).a(czz.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, cwb.eW.o().a(czz.a, Boolean.valueOf(true)).a(czz.c, Boolean.valueOf(true)).a(czz.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, cwb.eW.o().a(czz.a, Boolean.valueOf(true)).a(czz.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, cwb.eW.o().a(czz.d, Boolean.valueOf(true)).a(czz.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, cwb.eW.o().a(czz.d, Boolean.valueOf(true)).a(czz.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, cwb.eW.o().a(czz.d, Boolean.valueOf(true)).a(czz.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, cwb.eW.o().a(czz.a, Boolean.valueOf(true)).a(czz.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, cwb.eW.o().a(czz.a, Boolean.valueOf(true)).a(czz.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         dip $$8 = cwb.dy.o().a(cyf.b, ia.e);
         dip $$9 = cwb.dy.o().a(cyf.b, ia.e).a(cyf.f, djl.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends ebf.q {
      public i(int $$0, auf $$1, dyg $$2, ia $$3) {
         super(dzf.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(sj $$0) {
         super(dzf.A, $$0);
      }

      @Override
      public void a(dys $$0, dyt $$1, auf $$2) {
         ia $$3 = this.i();
         if ($$3 != ia.c && $$3 != ia.f) {
            this.b((ebf.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((ebf.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static ebf.i a(dyt $$0, auf $$1, int $$2, int $$3, int $$4, ia $$5, int $$6) {
         dyg $$7 = dyg.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new ebf.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(ctt $$0, ctr $$1, dkm $$2, auf $$3, dyg $$4, csf $$5, hv $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, ebf.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         ia $$7 = this.i();
         if ($$7 != ia.c && $$7 != ia.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends ebf.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, auf $$1, dyg $$2, ia $$3) {
         super(dzf.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(sj $$0) {
         super(dzf.B, $$0);
         this.d = $$0.h("Type");
      }

      @Override
      protected void a(dze $$0, sj $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(dys $$0, dyt $$1, auf $$2) {
         this.a((ebf.m)$$0, $$1, $$2, 4, 1);
         this.b((ebf.m)$$0, $$1, $$2, 1, 4);
         this.c((ebf.m)$$0, $$1, $$2, 1, 4);
      }

      public static ebf.j a(dyt $$0, auf $$1, int $$2, int $$3, int $$4, ia $$5, int $$6) {
         dyg $$7 = dyg.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new ebf.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(ctt $$0, ctr $$1, dkm $$2, auf $$3, dyg $$4, csf $$5, hv $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, ebf.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, cwb.eH.o(), 5, 1, 5, $$4);
               this.a($$0, cwb.eH.o(), 5, 2, 5, $$4);
               this.a($$0, cwb.eH.o(), 5, 3, 5, $$4);
               this.a($$0, cwb.cq.o().a(dez.g, ia.e), 4, 3, 5, $$4);
               this.a($$0, cwb.cq.o().a(dez.g, ia.f), 6, 3, 5, $$4);
               this.a($$0, cwb.cq.o().a(dez.g, ia.d), 5, 3, 4, $$4);
               this.a($$0, cwb.cq.o().a(dez.g, ia.c), 5, 3, 6, $$4);
               this.a($$0, cwb.jE.o(), 4, 1, 4, $$4);
               this.a($$0, cwb.jE.o(), 4, 1, 5, $$4);
               this.a($$0, cwb.jE.o(), 4, 1, 6, $$4);
               this.a($$0, cwb.jE.o(), 6, 1, 4, $$4);
               this.a($$0, cwb.jE.o(), 6, 1, 5, $$4);
               this.a($$0, cwb.jE.o(), 6, 1, 6, $$4);
               this.a($$0, cwb.jE.o(), 5, 1, 4, $$4);
               this.a($$0, cwb.jE.o(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, cwb.eH.o(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, cwb.eH.o(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, cwb.eH.o(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, cwb.eH.o(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, cwb.eH.o(), 5, 1, 5, $$4);
               this.a($$0, cwb.eH.o(), 5, 2, 5, $$4);
               this.a($$0, cwb.eH.o(), 5, 3, 5, $$4);
               this.a($$0, cwb.G.o(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, cwb.m.o(), 1, 3, $$8, $$4);
                  this.a($$0, cwb.m.o(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, cwb.m.o(), $$9, 3, 1, $$4);
                  this.a($$0, cwb.m.o(), $$9, 3, 9, $$4);
               }

               this.a($$0, cwb.m.o(), 5, 1, 4, $$4);
               this.a($$0, cwb.m.o(), 5, 1, 6, $$4);
               this.a($$0, cwb.m.o(), 5, 3, 4, $$4);
               this.a($$0, cwb.m.o(), 5, 3, 6, $$4);
               this.a($$0, cwb.m.o(), 4, 1, 5, $$4);
               this.a($$0, cwb.m.o(), 6, 1, 5, $$4);
               this.a($$0, cwb.m.o(), 4, 3, 5, $$4);
               this.a($$0, cwb.m.o(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, cwb.m.o(), 4, $$10, 4, $$4);
                  this.a($$0, cwb.m.o(), 6, $$10, 4, $$4);
                  this.a($$0, cwb.m.o(), 4, $$10, 6, $$4);
                  this.a($$0, cwb.m.o(), 6, $$10, 6, $$4);
               }

               this.a($$0, cwb.cq.o(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, cwb.n.o(), 2, 3, $$11, $$4);
                  this.a($$0, cwb.n.o(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, cwb.n.o(), 4, 3, $$11, $$4);
                     this.a($$0, cwb.n.o(), 5, 3, $$11, $$4);
                     this.a($$0, cwb.n.o(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, cwb.n.o(), 7, 3, $$11, $$4);
                  this.a($$0, cwb.n.o(), 8, 3, $$11, $$4);
               }

               dip $$12 = cwb.cO.o().a(dae.b, ia.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, egc.x);
         }
      }
   }

   static class k extends dys.a {
      @Override
      public void a(auf $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = cwb.eJ.o();
            } else if ($$5 < 0.5F) {
               this.a = cwb.eI.o();
            } else if ($$5 < 0.55F) {
               this.a = cwb.eP.o();
            } else {
               this.a = cwb.eH.o();
            }
         } else {
            this.a = cwb.nc.o();
         }
      }
   }

   public static class l extends ebf.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(dzf $$0, int $$1, int $$2, int $$3, ia $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = ebf.p.a.a;
      }

      public l(int $$0, auf $$1, dyg $$2, ia $$3) {
         super(dzf.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(dzf $$0, sj $$1) {
         super($$0, $$1);
         this.d = $$1.q("Source");
      }

      public l(sj $$0) {
         this(dzf.C, $$0);
      }

      @Override
      protected void a(dze $$0, sj $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(dys $$0, dyt $$1, auf $$2) {
         if (this.d) {
            ebf.i = ebf.c.class;
         }

         this.a((ebf.m)$$0, $$1, $$2, 1, 1);
      }

      public static ebf.l a(dyt $$0, auf $$1, int $$2, int $$3, int $$4, ia $$5, int $$6) {
         dyg $$7 = dyg.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new ebf.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(ctt $$0, ctr $$1, dkm $$2, auf $$3, dyg $$4, csf $$5, hv $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, ebf.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, ebf.p.a.a, 1, 1, 4);
         this.a($$0, cwb.eH.o(), 2, 6, 1, $$4);
         this.a($$0, cwb.eH.o(), 1, 5, 1, $$4);
         this.a($$0, cwb.jE.o(), 1, 6, 1, $$4);
         this.a($$0, cwb.eH.o(), 1, 5, 2, $$4);
         this.a($$0, cwb.eH.o(), 1, 4, 3, $$4);
         this.a($$0, cwb.jE.o(), 1, 5, 3, $$4);
         this.a($$0, cwb.eH.o(), 2, 4, 3, $$4);
         this.a($$0, cwb.eH.o(), 3, 3, 3, $$4);
         this.a($$0, cwb.jE.o(), 3, 4, 3, $$4);
         this.a($$0, cwb.eH.o(), 3, 3, 2, $$4);
         this.a($$0, cwb.eH.o(), 3, 2, 1, $$4);
         this.a($$0, cwb.jE.o(), 3, 3, 1, $$4);
         this.a($$0, cwb.eH.o(), 2, 2, 1, $$4);
         this.a($$0, cwb.eH.o(), 1, 1, 1, $$4);
         this.a($$0, cwb.jE.o(), 1, 2, 1, $$4);
         this.a($$0, cwb.eH.o(), 1, 1, 2, $$4);
         this.a($$0, cwb.jE.o(), 1, 1, 3, $$4);
      }
   }

   public static class m extends ebf.l {
      public ebf.f a;
      @Nullable
      public ebf.g b;
      public final List<dys> c = Lists.newArrayList();

      public m(auf $$0, int $$1, int $$2) {
         super(dzf.D, 0, $$1, $$2, a($$0));
      }

      public m(sj $$0) {
         super(dzf.D, $$0);
      }

      @Override
      public hv h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends ebf.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, auf $$1, dyg $$2, ia $$3) {
         super(dzf.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(sj $$0) {
         super(dzf.E, $$0);
         this.d = $$0.q("Left");
         this.i = $$0.q("Right");
      }

      @Override
      protected void a(dze $$0, sj $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(dys $$0, dyt $$1, auf $$2) {
         this.a((ebf.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((ebf.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((ebf.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static ebf.n a(dyt $$0, auf $$1, int $$2, int $$3, int $$4, ia $$5, int $$6) {
         dyg $$7 = dyg.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new ebf.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(ctt $$0, ctr $$1, dkm $$2, auf $$3, dyg $$4, csf $$5, hv $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, ebf.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, ebf.p.a.a, 1, 1, 6);
         dip $$7 = cwb.cq.o().a(dez.g, ia.f);
         dip $$8 = cwb.cq.o().a(dez.g, ia.e);
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

   public static class o extends ebf.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, auf $$1, dyg $$2, ia $$3) {
         super(dzf.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(sj $$0) {
         super(dzf.F, $$0);
      }

      @Override
      public void a(dys $$0, dyt $$1, auf $$2) {
         this.a((ebf.m)$$0, $$1, $$2, 1, 1);
      }

      public static ebf.o a(dyt $$0, auf $$1, int $$2, int $$3, int $$4, ia $$5, int $$6) {
         dyg $$7 = dyg.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new ebf.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(ctt $$0, ctr $$1, dkm $$2, auf $$3, dyg $$4, csf $$5, hv $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, ebf.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, ebf.p.a.a, 1, 1, 7);
         dip $$7 = cwb.cQ.o().a(dds.b, ia.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, cwb.eH.o(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, cwb.eH.o(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, cwb.eH.o(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends dys {
      protected ebf.p.a h = ebf.p.a.a;

      protected p(dzf $$0, int $$1, dyg $$2) {
         super($$0, $$1, $$2);
      }

      public p(dzf $$0, sj $$1) {
         super($$0, $$1);
         this.h = ebf.p.a.valueOf($$1.l("EntryDoor"));
      }

      @Override
      protected void a(dze $$0, sj $$1) {
         $$1.a("EntryDoor", this.h.name());
      }

      protected void a(ctt $$0, auf $$1, dyg $$2, ebf.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, cwb.eH.o(), $$4, $$5, $$6, $$2);
               this.a($$0, cwb.eH.o(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, cwb.eH.o(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, cwb.eH.o(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, cwb.eH.o(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, cwb.eH.o(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, cwb.eH.o(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, cwb.cN.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, cwb.cN.o().a(cyf.f, djl.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, cwb.nc.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, cwb.nc.o(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, cwb.eW.o().a(czz.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, cwb.eW.o().a(czz.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, cwb.eW.o().a(czz.b, Boolean.valueOf(true)).a(czz.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, cwb.eW.o().a(czz.b, Boolean.valueOf(true)).a(czz.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, cwb.eW.o().a(czz.b, Boolean.valueOf(true)).a(czz.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, cwb.eW.o().a(czz.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, cwb.eW.o().a(czz.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, cwb.eH.o(), $$4, $$5, $$6, $$2);
               this.a($$0, cwb.eH.o(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, cwb.eH.o(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, cwb.eH.o(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, cwb.eH.o(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, cwb.eH.o(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, cwb.eH.o(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, cwb.dy.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, cwb.dy.o().a(cyf.f, djl.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, cwb.dM.o().a(cwj.aE, ia.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, cwb.dM.o().a(cwj.aE, ia.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected ebf.p.a b(auf $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return ebf.p.a.a;
            case 2:
               return ebf.p.a.b;
            case 3:
               return ebf.p.a.c;
            case 4:
               return ebf.p.a.d;
         }
      }

      @Nullable
      protected dys a(ebf.m $$0, dyt $$1, auf $$2, int $$3, int $$4) {
         ia $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return ebf.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$5, this.g());
               case d:
                  return ebf.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$5, this.g());
               case e:
                  return ebf.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
               case f:
                  return ebf.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected dys b(ebf.m $$0, dyt $$1, auf $$2, int $$3, int $$4) {
         ia $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return ebf.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, ia.e, this.g());
               case d:
                  return ebf.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, ia.e, this.g());
               case e:
                  return ebf.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, ia.c, this.g());
               case f:
                  return ebf.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, ia.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected dys c(ebf.m $$0, dyt $$1, auf $$2, int $$3, int $$4) {
         ia $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return ebf.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, ia.f, this.g());
               case d:
                  return ebf.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, ia.f, this.g());
               case e:
                  return ebf.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, ia.d, this.g());
               case f:
                  return ebf.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, ia.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(dyg $$0) {
         return $$0 != null && $$0.i() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;
      }
   }

   public abstract static class q extends ebf.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(dzf $$0, int $$1, dyg $$2) {
         super($$0, $$1, $$2);
      }

      public q(dzf $$0, sj $$1) {
         super($$0, $$1);
      }
   }
}
