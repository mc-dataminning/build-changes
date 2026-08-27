import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class dxj {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final dxj.f[] g = new dxj.f[]{
      new dxj.f(dxj.n.class, 40, 0),
      new dxj.f(dxj.h.class, 5, 5),
      new dxj.f(dxj.d.class, 20, 0),
      new dxj.f(dxj.i.class, 20, 0),
      new dxj.f(dxj.j.class, 10, 6),
      new dxj.f(dxj.o.class, 5, 5),
      new dxj.f(dxj.l.class, 5, 5),
      new dxj.f(dxj.c.class, 5, 4),
      new dxj.f(dxj.a.class, 5, 4),
      new dxj.f(dxj.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new dxj.f(dxj.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<dxj.f> h;
   static Class<? extends dxj.p> i;
   private static int j;
   static final dxj.k k = new dxj.k();

   public static void a() {
      h = Lists.newArrayList();

      for (dxj.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (dxj.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static dxj.p a(Class<? extends dxj.p> $$0, dve $$1, aru $$2, int $$3, int $$4, int $$5, @Nullable ha $$6, int $$7) {
      dxj.p $$8 = null;
      if ($$0 == dxj.n.class) {
         $$8 = dxj.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dxj.h.class) {
         $$8 = dxj.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dxj.d.class) {
         $$8 = dxj.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dxj.i.class) {
         $$8 = dxj.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dxj.j.class) {
         $$8 = dxj.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dxj.o.class) {
         $$8 = dxj.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dxj.l.class) {
         $$8 = dxj.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dxj.c.class) {
         $$8 = dxj.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dxj.a.class) {
         $$8 = dxj.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dxj.e.class) {
         $$8 = dxj.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dxj.g.class) {
         $$8 = dxj.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static dxj.p a(dxj.m $$0, dve $$1, aru $$2, int $$3, int $$4, int $$5, ha $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            dxj.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (dxj.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  dxj.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         dur $$13 = dxj.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.h() > 1 ? new dxj.b($$7, $$13, $$6) : null;
      }
   }

   static dvd b(dxj.m $$0, dve $$1, aru $$2, int $$3, int $$4, int $$5, @Nullable ha $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().g()) <= 112 && Math.abs($$5 - $$0.f().i()) <= 112) {
         dvd $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends dxj.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, aru $$1, dur $$2, ha $$3) {
         super(dvq.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(qr $$0) {
         super(dvq.t, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(dvp $$0, qr $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(dvd $$0, dve $$1, aru $$2) {
         this.a((dxj.m)$$0, $$1, $$2, 1, 1);
      }

      public static dxj.a a(dve $$0, aru $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
         dur $$7 = dur.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new dxj.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cqg $$0, cqe $$1, dgx $$2, aru $$3, dur $$4, cot $$5, gu $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, dxj.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, dxj.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, csn.eI.n(), csn.eI.n(), false);
         this.a($$0, csn.jK.n(), 3, 1, 1, $$4);
         this.a($$0, csn.jK.n(), 3, 1, 5, $$4);
         this.a($$0, csn.jK.n(), 3, 2, 2, $$4);
         this.a($$0, csn.jK.n(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, csn.jK.n(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, ecf.y);
         }
      }
   }

   public static class b extends dxj.p {
      private final int a;

      public b(int $$0, dur $$1, ha $$2) {
         super(dvq.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != ha.c && $$2 != ha.d ? $$1.c() : $$1.e();
      }

      public b(qr $$0) {
         super(dvq.u, $$0);
         this.a = $$0.h("Steps");
      }

      @Override
      protected void a(dvp $$0, qr $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static dur a(dve $$0, aru $$1, int $$2, int $$3, int $$4, ha $$5) {
         int $$6 = 3;
         dur $$7 = dur.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         dvd $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().h() == $$7.h()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = dur.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return dur.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(cqg $$0, cqe $$1, dgx $$2, aru $$3, dur $$4, cot $$5, gu $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, csn.eI.n(), 0, 0, $$7, $$4);
            this.a($$0, csn.eI.n(), 1, 0, $$7, $$4);
            this.a($$0, csn.eI.n(), 2, 0, $$7, $$4);
            this.a($$0, csn.eI.n(), 3, 0, $$7, $$4);
            this.a($$0, csn.eI.n(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, csn.eI.n(), 0, $$8, $$7, $$4);
               this.a($$0, csn.nc.n(), 1, $$8, $$7, $$4);
               this.a($$0, csn.nc.n(), 2, $$8, $$7, $$4);
               this.a($$0, csn.nc.n(), 3, $$8, $$7, $$4);
               this.a($$0, csn.eI.n(), 4, $$8, $$7, $$4);
            }

            this.a($$0, csn.eI.n(), 0, 4, $$7, $$4);
            this.a($$0, csn.eI.n(), 1, 4, $$7, $$4);
            this.a($$0, csn.eI.n(), 2, 4, $$7, $$4);
            this.a($$0, csn.eI.n(), 3, 4, $$7, $$4);
            this.a($$0, csn.eI.n(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends dxj.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, aru $$1, dur $$2, ha $$3) {
         super(dvq.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(qr $$0) {
         super(dvq.v, $$0);
         this.d = $$0.q("leftLow");
         this.i = $$0.q("leftHigh");
         this.j = $$0.q("rightLow");
         this.k = $$0.q("rightHigh");
      }

      @Override
      protected void a(dvp $$0, qr $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(dvd $$0, dve $$1, aru $$2) {
         int $$3 = 3;
         int $$4 = 5;
         ha $$5 = this.i();
         if ($$5 == ha.e || $$5 == ha.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((dxj.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((dxj.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((dxj.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((dxj.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((dxj.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static dxj.c a(dve $$0, aru $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
         dur $$7 = dur.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new dxj.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cqg $$0, cqe $$1, dgx $$2, aru $$3, dur $$4, cot $$5, gu $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, dxj.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, dxj.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, dxj.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, dxj.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, dxj.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, dxj.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, csn.jE.n(), csn.jE.n(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, csn.jE.n(), csn.jE.n(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, dxj.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, csn.jE.n(), csn.jE.n(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, csn.jE.n(), csn.jE.n(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, csn.jE.n(), csn.jE.n(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, csn.jE.n(), csn.jE.n(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, csn.jE.n().a(czp.a, dgi.c), csn.jE.n().a(czp.a, dgi.c), false);
         this.a($$0, csn.cq.n().a(dbm.a, ha.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends dxj.q {
      public d(int $$0, aru $$1, dur $$2, ha $$3) {
         super(dvq.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(qr $$0) {
         super(dvq.w, $$0);
      }

      @Override
      public void a(dvd $$0, dve $$1, aru $$2) {
         ha $$3 = this.i();
         if ($$3 != ha.c && $$3 != ha.f) {
            this.c((dxj.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((dxj.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static dxj.d a(dve $$0, aru $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
         dur $$7 = dur.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new dxj.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cqg $$0, cqe $$1, dgx $$2, aru $$3, dur $$4, cot $$5, gu $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, dxj.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         ha $$7 = this.i();
         if ($$7 != ha.c && $$7 != ha.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends dxj.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, aru $$1, dur $$2, ha $$3) {
         super(dvq.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.d() > 6;
      }

      public e(qr $$0) {
         super(dvq.x, $$0);
         this.i = $$0.q("Tall");
      }

      @Override
      protected void a(dvp $$0, qr $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static dxj.e a(dve $$0, aru $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
         dur $$7 = dur.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = dur.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new dxj.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(cqg $$0, cqe $$1, dgx $$2, aru $$3, dur $$4, cot $$5, gu $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, dxj.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, csn.bs.n(), csn.bs.n(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, csn.n.n(), csn.n.n(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, csn.n.n(), csn.n.n(), false);
               this.a($$0, csn.cq.n().a(dbm.a, ha.f), 2, 3, $$10, $$4);
               this.a($$0, csn.cq.n().a(dbm.a, ha.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, csn.n.n(), csn.n.n(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, csn.n.n(), csn.n.n(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, csn.cl.n(), csn.cl.n(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, csn.cl.n(), csn.cl.n(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, csn.cl.n(), csn.cl.n(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, csn.cl.n(), csn.cl.n(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, csn.cl.n(), csn.cl.n(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, csn.cl.n(), csn.cl.n(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, csn.cl.n(), csn.cl.n(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, csn.n.n(), csn.n.n(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, csn.n.n(), csn.n.n(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, csn.n.n(), csn.n.n(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, csn.n.n(), csn.n.n(), false);
            this.a($$0, csn.n.n(), 9, 5, 11, $$4);
            this.a($$0, csn.n.n(), 8, 5, 11, $$4);
            this.a($$0, csn.n.n(), 9, 5, 10, $$4);
            dfa $$12 = csn.dU.n().a(cvg.d, Boolean.valueOf(true)).a(cvg.b, Boolean.valueOf(true));
            dfa $$13 = csn.dU.n().a(cvg.a, Boolean.valueOf(true)).a(cvg.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, csn.dU.n().a(cvg.a, Boolean.valueOf(true)).a(cvg.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, csn.dU.n().a(cvg.c, Boolean.valueOf(true)).a(cvg.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, csn.dU.n().a(cvg.a, Boolean.valueOf(true)).a(cvg.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, csn.dU.n().a(cvg.c, Boolean.valueOf(true)).a(cvg.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, csn.dU.n().a(cvg.a, Boolean.valueOf(true)).a(cvg.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            dfa $$15 = csn.cO.n().a(cwp.a, ha.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            dfa $$18 = csn.dU.n().a(cvg.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            dfa $$19 = csn.dU.n().a(cvg.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            dfa $$20 = $$13.a(cvg.d, Boolean.valueOf(true)).a(cvg.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.a(cvg.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.a(cvg.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.a(cvg.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.a(cvg.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            dfa $$21 = csn.cp.n();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, ecf.w);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, ecf.w);
         }
      }
   }

   static class f {
      public final Class<? extends dxj.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends dxj.p> $$0, int $$1, int $$2) {
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

   public static class g extends dxj.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, dur $$1, ha $$2) {
         super(dvq.y, $$0, $$1);
         this.a($$2);
      }

      public g(qr $$0) {
         super(dvq.y, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(dvp $$0, qr $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(dvd $$0, dve $$1, aru $$2) {
         if ($$0 != null) {
            ((dxj.m)$$0).b = this;
         }
      }

      public static dxj.g a(dve $$0, int $$1, int $$2, int $$3, ha $$4, int $$5) {
         dur $$6 = dur.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new dxj.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(cqg $$0, cqe $$1, dgx $$2, aru $$3, dur $$4, cot $$5, gu $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, dxj.k);
         this.a($$0, $$3, $$4, dxj.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, dxj.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, dxj.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, dxj.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, dxj.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, dxj.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, dxj.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, csn.H.n(), csn.H.n(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, csn.H.n(), csn.H.n(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, dxj.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, csn.H.n(), csn.H.n(), false);
         dfa $$8 = csn.eX.n().a(cwk.a, Boolean.valueOf(true)).a(cwk.c, Boolean.valueOf(true));
         dfa $$9 = csn.eX.n().a(cwk.d, Boolean.valueOf(true)).a(cwk.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         dfa $$12 = csn.fj.n().a(dag.a, ha.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, dxj.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, dxj.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, dxj.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         dfa $$14 = csn.fy.n().a(cux.a, ha.c);
         dfa $$15 = csn.fy.n().a(cux.a, ha.d);
         dfa $$16 = csn.fy.n().a(cux.a, ha.f);
         dfa $$17 = csn.fy.n().a(cux.a, ha.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.a(cux.b, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.a(cux.b, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.a(cux.b, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.a(cux.b, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.a(cux.b, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.a(cux.b, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.a(cux.b, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.a(cux.b, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.a(cux.b, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.a(cux.b, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.a(cux.b, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.a(cux.b, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            dfa $$21 = csn.fx.n();
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
            gu $$22 = this.b(5, 3, 6);
            if ($$4.b($$22)) {
               this.d = true;
               $$0.a($$22, csn.ct.n(), 2);
               if ($$0.c_($$22) instanceof ddy $$24) {
                  $$24.a(bim.aI, $$3);
               }
            }
         }
      }
   }

   public static class h extends dxj.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, aru $$1, dur $$2, ha $$3) {
         super(dvq.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(qr $$0) {
         super(dvq.z, $$0);
      }

      @Override
      public void a(dvd $$0, dve $$1, aru $$2) {
         this.a((dxj.m)$$0, $$1, $$2, 1, 1);
      }

      public static dxj.h a(dve $$0, aru $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
         dur $$7 = dur.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new dxj.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cqg $$0, cqe $$1, dgx $$2, aru $$3, dur $$4, cot $$5, gu $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, dxj.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, dxj.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, dxj.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, dxj.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, dxj.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, csn.eX.n().a(cwk.a, Boolean.valueOf(true)).a(cwk.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, csn.eX.n().a(cwk.a, Boolean.valueOf(true)).a(cwk.c, Boolean.valueOf(true)).a(cwk.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, csn.eX.n().a(cwk.a, Boolean.valueOf(true)).a(cwk.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, csn.eX.n().a(cwk.d, Boolean.valueOf(true)).a(cwk.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, csn.eX.n().a(cwk.d, Boolean.valueOf(true)).a(cwk.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, csn.eX.n().a(cwk.d, Boolean.valueOf(true)).a(cwk.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, csn.eX.n().a(cwk.a, Boolean.valueOf(true)).a(cwk.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, csn.eX.n().a(cwk.a, Boolean.valueOf(true)).a(cwk.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         dfa $$8 = csn.dy.n().a(cuo.a, ha.e);
         dfa $$9 = csn.dy.n().a(cuo.a, ha.e).a(cuo.e, dfw.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends dxj.q {
      public i(int $$0, aru $$1, dur $$2, ha $$3) {
         super(dvq.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(qr $$0) {
         super(dvq.A, $$0);
      }

      @Override
      public void a(dvd $$0, dve $$1, aru $$2) {
         ha $$3 = this.i();
         if ($$3 != ha.c && $$3 != ha.f) {
            this.b((dxj.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((dxj.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static dxj.i a(dve $$0, aru $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
         dur $$7 = dur.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new dxj.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cqg $$0, cqe $$1, dgx $$2, aru $$3, dur $$4, cot $$5, gu $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, dxj.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         ha $$7 = this.i();
         if ($$7 != ha.c && $$7 != ha.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends dxj.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, aru $$1, dur $$2, ha $$3) {
         super(dvq.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(qr $$0) {
         super(dvq.B, $$0);
         this.d = $$0.h("Type");
      }

      @Override
      protected void a(dvp $$0, qr $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(dvd $$0, dve $$1, aru $$2) {
         this.a((dxj.m)$$0, $$1, $$2, 4, 1);
         this.b((dxj.m)$$0, $$1, $$2, 1, 4);
         this.c((dxj.m)$$0, $$1, $$2, 1, 4);
      }

      public static dxj.j a(dve $$0, aru $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
         dur $$7 = dur.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new dxj.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cqg $$0, cqe $$1, dgx $$2, aru $$3, dur $$4, cot $$5, gu $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, dxj.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, csn.eI.n(), 5, 1, 5, $$4);
               this.a($$0, csn.eI.n(), 5, 2, 5, $$4);
               this.a($$0, csn.eI.n(), 5, 3, 5, $$4);
               this.a($$0, csn.cq.n().a(dbm.a, ha.e), 4, 3, 5, $$4);
               this.a($$0, csn.cq.n().a(dbm.a, ha.f), 6, 3, 5, $$4);
               this.a($$0, csn.cq.n().a(dbm.a, ha.d), 5, 3, 4, $$4);
               this.a($$0, csn.cq.n().a(dbm.a, ha.c), 5, 3, 6, $$4);
               this.a($$0, csn.jE.n(), 4, 1, 4, $$4);
               this.a($$0, csn.jE.n(), 4, 1, 5, $$4);
               this.a($$0, csn.jE.n(), 4, 1, 6, $$4);
               this.a($$0, csn.jE.n(), 6, 1, 4, $$4);
               this.a($$0, csn.jE.n(), 6, 1, 5, $$4);
               this.a($$0, csn.jE.n(), 6, 1, 6, $$4);
               this.a($$0, csn.jE.n(), 5, 1, 4, $$4);
               this.a($$0, csn.jE.n(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, csn.eI.n(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, csn.eI.n(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, csn.eI.n(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, csn.eI.n(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, csn.eI.n(), 5, 1, 5, $$4);
               this.a($$0, csn.eI.n(), 5, 2, 5, $$4);
               this.a($$0, csn.eI.n(), 5, 3, 5, $$4);
               this.a($$0, csn.G.n(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, csn.m.n(), 1, 3, $$8, $$4);
                  this.a($$0, csn.m.n(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, csn.m.n(), $$9, 3, 1, $$4);
                  this.a($$0, csn.m.n(), $$9, 3, 9, $$4);
               }

               this.a($$0, csn.m.n(), 5, 1, 4, $$4);
               this.a($$0, csn.m.n(), 5, 1, 6, $$4);
               this.a($$0, csn.m.n(), 5, 3, 4, $$4);
               this.a($$0, csn.m.n(), 5, 3, 6, $$4);
               this.a($$0, csn.m.n(), 4, 1, 5, $$4);
               this.a($$0, csn.m.n(), 6, 1, 5, $$4);
               this.a($$0, csn.m.n(), 4, 3, 5, $$4);
               this.a($$0, csn.m.n(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, csn.m.n(), 4, $$10, 4, $$4);
                  this.a($$0, csn.m.n(), 6, $$10, 4, $$4);
                  this.a($$0, csn.m.n(), 4, $$10, 6, $$4);
                  this.a($$0, csn.m.n(), 6, $$10, 6, $$4);
               }

               this.a($$0, csn.cq.n(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, csn.n.n(), 2, 3, $$11, $$4);
                  this.a($$0, csn.n.n(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, csn.n.n(), 4, 3, $$11, $$4);
                     this.a($$0, csn.n.n(), 5, 3, $$11, $$4);
                     this.a($$0, csn.n.n(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, csn.n.n(), 7, 3, $$11, $$4);
                  this.a($$0, csn.n.n(), 8, 3, $$11, $$4);
               }

               dfa $$12 = csn.cO.n().a(cwp.a, ha.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, ecf.x);
         }
      }
   }

   static class k extends dvd.a {
      @Override
      public void a(aru $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = csn.eK.n();
            } else if ($$5 < 0.5F) {
               this.a = csn.eJ.n();
            } else if ($$5 < 0.55F) {
               this.a = csn.eQ.n();
            } else {
               this.a = csn.eI.n();
            }
         } else {
            this.a = csn.nc.n();
         }
      }
   }

   public static class l extends dxj.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(dvq $$0, int $$1, int $$2, int $$3, ha $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = dxj.p.a.a;
      }

      public l(int $$0, aru $$1, dur $$2, ha $$3) {
         super(dvq.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(dvq $$0, qr $$1) {
         super($$0, $$1);
         this.d = $$1.q("Source");
      }

      public l(qr $$0) {
         this(dvq.C, $$0);
      }

      @Override
      protected void a(dvp $$0, qr $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(dvd $$0, dve $$1, aru $$2) {
         if (this.d) {
            dxj.i = dxj.c.class;
         }

         this.a((dxj.m)$$0, $$1, $$2, 1, 1);
      }

      public static dxj.l a(dve $$0, aru $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
         dur $$7 = dur.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new dxj.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cqg $$0, cqe $$1, dgx $$2, aru $$3, dur $$4, cot $$5, gu $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, dxj.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, dxj.p.a.a, 1, 1, 4);
         this.a($$0, csn.eI.n(), 2, 6, 1, $$4);
         this.a($$0, csn.eI.n(), 1, 5, 1, $$4);
         this.a($$0, csn.jE.n(), 1, 6, 1, $$4);
         this.a($$0, csn.eI.n(), 1, 5, 2, $$4);
         this.a($$0, csn.eI.n(), 1, 4, 3, $$4);
         this.a($$0, csn.jE.n(), 1, 5, 3, $$4);
         this.a($$0, csn.eI.n(), 2, 4, 3, $$4);
         this.a($$0, csn.eI.n(), 3, 3, 3, $$4);
         this.a($$0, csn.jE.n(), 3, 4, 3, $$4);
         this.a($$0, csn.eI.n(), 3, 3, 2, $$4);
         this.a($$0, csn.eI.n(), 3, 2, 1, $$4);
         this.a($$0, csn.jE.n(), 3, 3, 1, $$4);
         this.a($$0, csn.eI.n(), 2, 2, 1, $$4);
         this.a($$0, csn.eI.n(), 1, 1, 1, $$4);
         this.a($$0, csn.jE.n(), 1, 2, 1, $$4);
         this.a($$0, csn.eI.n(), 1, 1, 2, $$4);
         this.a($$0, csn.jE.n(), 1, 1, 3, $$4);
      }
   }

   public static class m extends dxj.l {
      public dxj.f a;
      @Nullable
      public dxj.g b;
      public final List<dvd> c = Lists.newArrayList();

      public m(aru $$0, int $$1, int $$2) {
         super(dvq.D, 0, $$1, $$2, a($$0));
      }

      public m(qr $$0) {
         super(dvq.D, $$0);
      }

      @Override
      public gu h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends dxj.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, aru $$1, dur $$2, ha $$3) {
         super(dvq.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(qr $$0) {
         super(dvq.E, $$0);
         this.d = $$0.q("Left");
         this.i = $$0.q("Right");
      }

      @Override
      protected void a(dvp $$0, qr $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(dvd $$0, dve $$1, aru $$2) {
         this.a((dxj.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((dxj.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((dxj.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static dxj.n a(dve $$0, aru $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
         dur $$7 = dur.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new dxj.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cqg $$0, cqe $$1, dgx $$2, aru $$3, dur $$4, cot $$5, gu $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, dxj.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, dxj.p.a.a, 1, 1, 6);
         dfa $$7 = csn.cq.n().a(dbm.a, ha.f);
         dfa $$8 = csn.cq.n().a(dbm.a, ha.e);
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

   public static class o extends dxj.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, aru $$1, dur $$2, ha $$3) {
         super(dvq.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(qr $$0) {
         super(dvq.F, $$0);
      }

      @Override
      public void a(dvd $$0, dve $$1, aru $$2) {
         this.a((dxj.m)$$0, $$1, $$2, 1, 1);
      }

      public static dxj.o a(dve $$0, aru $$1, int $$2, int $$3, int $$4, ha $$5, int $$6) {
         dur $$7 = dur.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new dxj.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(cqg $$0, cqe $$1, dgx $$2, aru $$3, dur $$4, cot $$5, gu $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, dxj.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, dxj.p.a.a, 1, 1, 7);
         dfa $$7 = csn.cQ.n().a(dag.a, ha.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, csn.eI.n(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, csn.eI.n(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, csn.eI.n(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends dvd {
      protected dxj.p.a h = dxj.p.a.a;

      protected p(dvq $$0, int $$1, dur $$2) {
         super($$0, $$1, $$2);
      }

      public p(dvq $$0, qr $$1) {
         super($$0, $$1);
         this.h = dxj.p.a.valueOf($$1.l("EntryDoor"));
      }

      @Override
      protected void a(dvp $$0, qr $$1) {
         $$1.a("EntryDoor", this.h.name());
      }

      protected void a(cqg $$0, aru $$1, dur $$2, dxj.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, csn.eI.n(), $$4, $$5, $$6, $$2);
               this.a($$0, csn.eI.n(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, csn.eI.n(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, csn.eI.n(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, csn.eI.n(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, csn.eI.n(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, csn.eI.n(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, csn.cN.n(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, csn.cN.n().a(cuo.e, dfw.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, csn.nc.n(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, csn.nc.n(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, csn.eX.n().a(cwk.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, csn.eX.n().a(cwk.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, csn.eX.n().a(cwk.b, Boolean.valueOf(true)).a(cwk.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, csn.eX.n().a(cwk.b, Boolean.valueOf(true)).a(cwk.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, csn.eX.n().a(cwk.b, Boolean.valueOf(true)).a(cwk.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, csn.eX.n().a(cwk.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, csn.eX.n().a(cwk.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, csn.eI.n(), $$4, $$5, $$6, $$2);
               this.a($$0, csn.eI.n(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, csn.eI.n(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, csn.eI.n(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, csn.eI.n(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, csn.eI.n(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, csn.eI.n(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, csn.dy.n(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, csn.dy.n().a(cuo.e, dfw.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, csn.dM.n().a(csv.aC, ha.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, csn.dM.n().a(csv.aC, ha.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected dxj.p.a b(aru $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return dxj.p.a.a;
            case 2:
               return dxj.p.a.b;
            case 3:
               return dxj.p.a.c;
            case 4:
               return dxj.p.a.d;
         }
      }

      @Nullable
      protected dvd a(dxj.m $$0, dve $$1, aru $$2, int $$3, int $$4) {
         ha $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return dxj.b($$0, $$1, $$2, this.f.g() + $$3, this.f.h() + $$4, this.f.i() - 1, $$5, this.g());
               case d:
                  return dxj.b($$0, $$1, $$2, this.f.g() + $$3, this.f.h() + $$4, this.f.l() + 1, $$5, this.g());
               case e:
                  return dxj.b($$0, $$1, $$2, this.f.g() - 1, this.f.h() + $$4, this.f.i() + $$3, $$5, this.g());
               case f:
                  return dxj.b($$0, $$1, $$2, this.f.j() + 1, this.f.h() + $$4, this.f.i() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected dvd b(dxj.m $$0, dve $$1, aru $$2, int $$3, int $$4) {
         ha $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return dxj.b($$0, $$1, $$2, this.f.g() - 1, this.f.h() + $$3, this.f.i() + $$4, ha.e, this.g());
               case d:
                  return dxj.b($$0, $$1, $$2, this.f.g() - 1, this.f.h() + $$3, this.f.i() + $$4, ha.e, this.g());
               case e:
                  return dxj.b($$0, $$1, $$2, this.f.g() + $$4, this.f.h() + $$3, this.f.i() - 1, ha.c, this.g());
               case f:
                  return dxj.b($$0, $$1, $$2, this.f.g() + $$4, this.f.h() + $$3, this.f.i() - 1, ha.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected dvd c(dxj.m $$0, dve $$1, aru $$2, int $$3, int $$4) {
         ha $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return dxj.b($$0, $$1, $$2, this.f.j() + 1, this.f.h() + $$3, this.f.i() + $$4, ha.f, this.g());
               case d:
                  return dxj.b($$0, $$1, $$2, this.f.j() + 1, this.f.h() + $$3, this.f.i() + $$4, ha.f, this.g());
               case e:
                  return dxj.b($$0, $$1, $$2, this.f.g() + $$4, this.f.h() + $$3, this.f.l() + 1, ha.d, this.g());
               case f:
                  return dxj.b($$0, $$1, $$2, this.f.g() + $$4, this.f.h() + $$3, this.f.l() + 1, ha.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(dur $$0) {
         return $$0 != null && $$0.h() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;
      }
   }

   public abstract static class q extends dxj.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(dvq $$0, int $$1, dur $$2) {
         super($$0, $$1, $$2);
      }

      public q(dvq $$0, qr $$1) {
         super($$0, $$1);
      }
   }
}
