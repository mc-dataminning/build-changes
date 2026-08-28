import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class ery {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final ery.f[] g = new ery.f[]{
      new ery.f(ery.n.class, 40, 0),
      new ery.f(ery.h.class, 5, 5),
      new ery.f(ery.d.class, 20, 0),
      new ery.f(ery.i.class, 20, 0),
      new ery.f(ery.j.class, 10, 6),
      new ery.f(ery.o.class, 5, 5),
      new ery.f(ery.l.class, 5, 5),
      new ery.f(ery.c.class, 5, 4),
      new ery.f(ery.a.class, 5, 4),
      new ery.f(ery.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new ery.f(ery.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<ery.f> h;
   static Class<? extends ery.p> i;
   private static int j;
   static final ery.k k = new ery.k();

   public static void a() {
      h = Lists.newArrayList();

      for (ery.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (ery.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static ery.p a(Class<? extends ery.p> $$0, epl $$1, azs $$2, int $$3, int $$4, int $$5, @Nullable jo $$6, int $$7) {
      ery.p $$8 = null;
      if ($$0 == ery.n.class) {
         $$8 = ery.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ery.h.class) {
         $$8 = ery.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ery.d.class) {
         $$8 = ery.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ery.i.class) {
         $$8 = ery.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ery.j.class) {
         $$8 = ery.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ery.o.class) {
         $$8 = ery.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ery.l.class) {
         $$8 = ery.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ery.c.class) {
         $$8 = ery.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ery.a.class) {
         $$8 = ery.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ery.e.class) {
         $$8 = ery.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == ery.g.class) {
         $$8 = ery.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static ery.p a(ery.m $$0, epl $$1, azs $$2, int $$3, int $$4, int $$5, jo $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            ery.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (ery.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  ery.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         eoy $$13 = ery.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.i() > 1 ? new ery.b($$7, $$13, $$6) : null;
      }
   }

   static epk b(ery.m $$0, epl $$1, azs $$2, int $$3, int $$4, int $$5, @Nullable jo $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
         epk $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends ery.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, azs $$1, eoy $$2, jo $$3) {
         super(epx.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(tw $$0) {
         super(epx.t, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(epw $$0, tw $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(epk $$0, epl $$1, azs $$2) {
         this.a((ery.m)$$0, $$1, $$2, 1, 1);
      }

      public static ery.a a(epl $$0, azs $$1, int $$2, int $$3, int $$4, jo $$5, int $$6) {
         eoy $$7 = eoy.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new ery.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dio $$0, dil $$1, eak $$2, azs $$3, eoy $$4, dgw $$5, jj $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, ery.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, ery.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, dkw.eV.m(), dkw.eV.m(), false);
         this.a($$0, dkw.kj.m(), 3, 1, 1, $$4);
         this.a($$0, dkw.kj.m(), 3, 1, 5, $$4);
         this.a($$0, dkw.kj.m(), 3, 2, 2, $$4);
         this.a($$0, dkw.kj.m(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, dkw.kj.m(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, exh.x);
         }
      }
   }

   public static class b extends ery.p {
      private final int a;

      public b(int $$0, eoy $$1, jo $$2) {
         super(epx.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != jo.c && $$2 != jo.d ? $$1.d() : $$1.f();
      }

      public b(tw $$0) {
         super(epx.u, $$0);
         this.a = $$0.h("Steps");
      }

      @Override
      protected void a(epw $$0, tw $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static eoy a(epl $$0, azs $$1, int $$2, int $$3, int $$4, jo $$5) {
         int $$6 = 3;
         eoy $$7 = eoy.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         epk $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().i() == $$7.i()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = eoy.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return eoy.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(dio $$0, dil $$1, eak $$2, azs $$3, eoy $$4, dgw $$5, jj $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, dkw.eV.m(), 0, 0, $$7, $$4);
            this.a($$0, dkw.eV.m(), 1, 0, $$7, $$4);
            this.a($$0, dkw.eV.m(), 2, 0, $$7, $$4);
            this.a($$0, dkw.eV.m(), 3, 0, $$7, $$4);
            this.a($$0, dkw.eV.m(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, dkw.eV.m(), 0, $$8, $$7, $$4);
               this.a($$0, dkw.nE.m(), 1, $$8, $$7, $$4);
               this.a($$0, dkw.nE.m(), 2, $$8, $$7, $$4);
               this.a($$0, dkw.nE.m(), 3, $$8, $$7, $$4);
               this.a($$0, dkw.eV.m(), 4, $$8, $$7, $$4);
            }

            this.a($$0, dkw.eV.m(), 0, 4, $$7, $$4);
            this.a($$0, dkw.eV.m(), 1, 4, $$7, $$4);
            this.a($$0, dkw.eV.m(), 2, 4, $$7, $$4);
            this.a($$0, dkw.eV.m(), 3, 4, $$7, $$4);
            this.a($$0, dkw.eV.m(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends ery.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, azs $$1, eoy $$2, jo $$3) {
         super(epx.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(tw $$0) {
         super(epx.v, $$0);
         this.d = $$0.q("leftLow");
         this.i = $$0.q("leftHigh");
         this.j = $$0.q("rightLow");
         this.k = $$0.q("rightHigh");
      }

      @Override
      protected void a(epw $$0, tw $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(epk $$0, epl $$1, azs $$2) {
         int $$3 = 3;
         int $$4 = 5;
         jo $$5 = this.i();
         if ($$5 == jo.e || $$5 == jo.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((ery.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((ery.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((ery.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((ery.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((ery.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static ery.c a(epl $$0, azs $$1, int $$2, int $$3, int $$4, jo $$5, int $$6) {
         eoy $$7 = eoy.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new ery.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dio $$0, dil $$1, eak $$2, azs $$3, eoy $$4, dgw $$5, jj $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, ery.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, ery.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, ery.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, ery.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, ery.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, ery.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, dkw.kd.m(), dkw.kd.m(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, dkw.kd.m(), dkw.kd.m(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, ery.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, dkw.kd.m(), dkw.kd.m(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, dkw.kd.m(), dkw.kd.m(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, dkw.kd.m(), dkw.kd.m(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, dkw.kd.m(), dkw.kd.m(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, dkw.kd.m().b(dsd.b, dzu.c), dkw.kd.m().b(dsd.b, dzu.c), false);
         this.a($$0, dkw.cx.m().b(due.e, jo.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends ery.q {
      public d(int $$0, azs $$1, eoy $$2, jo $$3) {
         super(epx.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(tw $$0) {
         super(epx.w, $$0);
      }

      @Override
      public void a(epk $$0, epl $$1, azs $$2) {
         jo $$3 = this.i();
         if ($$3 != jo.c && $$3 != jo.f) {
            this.c((ery.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((ery.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static ery.d a(epl $$0, azs $$1, int $$2, int $$3, int $$4, jo $$5, int $$6) {
         eoy $$7 = eoy.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new ery.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dio $$0, dil $$1, eak $$2, azs $$3, eoy $$4, dgw $$5, jj $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, ery.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         jo $$7 = this.i();
         if ($$7 != jo.c && $$7 != jo.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends ery.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, azs $$1, eoy $$2, jo $$3) {
         super(epx.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.e() > 6;
      }

      public e(tw $$0) {
         super(epx.x, $$0);
         this.i = $$0.q("Tall");
      }

      @Override
      protected void a(epw $$0, tw $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static ery.e a(epl $$0, azs $$1, int $$2, int $$3, int $$4, jo $$5, int $$6) {
         eoy $$7 = eoy.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = eoy.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new ery.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(dio $$0, dil $$1, eak $$2, azs $$3, eoy $$4, dgw $$5, jj $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, ery.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, dkw.bz.m(), dkw.bz.m(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dkw.n.m(), dkw.n.m(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dkw.n.m(), dkw.n.m(), false);
               this.a($$0, dkw.cx.m().b(due.e, jo.f), 2, 3, $$10, $$4);
               this.a($$0, dkw.cx.m().b(due.e, jo.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dkw.n.m(), dkw.n.m(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dkw.n.m(), dkw.n.m(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dkw.cs.m(), dkw.cs.m(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dkw.cs.m(), dkw.cs.m(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dkw.cs.m(), dkw.cs.m(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dkw.cs.m(), dkw.cs.m(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, dkw.cs.m(), dkw.cs.m(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, dkw.cs.m(), dkw.cs.m(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, dkw.cs.m(), dkw.cs.m(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, dkw.n.m(), dkw.n.m(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, dkw.n.m(), dkw.n.m(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, dkw.n.m(), dkw.n.m(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, dkw.n.m(), dkw.n.m(), false);
            this.a($$0, dkw.n.m(), 9, 5, 11, $$4);
            this.a($$0, dkw.n.m(), 8, 5, 11, $$4);
            this.a($$0, dkw.n.m(), 9, 5, 10, $$4);
            dym $$12 = dkw.eh.m().b(dnt.d, Boolean.valueOf(true)).b(dnt.b, Boolean.valueOf(true));
            dym $$13 = dkw.eh.m().b(dnt.a, Boolean.valueOf(true)).b(dnt.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, dkw.eh.m().b(dnt.a, Boolean.valueOf(true)).b(dnt.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, dkw.eh.m().b(dnt.c, Boolean.valueOf(true)).b(dnt.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, dkw.eh.m().b(dnt.a, Boolean.valueOf(true)).b(dnt.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, dkw.eh.m().b(dnt.c, Boolean.valueOf(true)).b(dnt.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, dkw.eh.m().b(dnt.a, Boolean.valueOf(true)).b(dnt.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            dym $$15 = dkw.cX.m().b(dpd.b, jo.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            dym $$18 = dkw.eh.m().b(dnt.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            dym $$19 = dkw.eh.m().b(dnt.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            dym $$20 = $$13.b(dnt.d, Boolean.valueOf(true)).b(dnt.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.b(dnt.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.b(dnt.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.b(dnt.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.b(dnt.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            dym $$21 = dkw.cw.m();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, exh.v);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, exh.v);
         }
      }
   }

   static class f {
      public final Class<? extends ery.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends ery.p> $$0, int $$1, int $$2) {
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

   public static class g extends ery.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, eoy $$1, jo $$2) {
         super(epx.y, $$0, $$1);
         this.a($$2);
      }

      public g(tw $$0) {
         super(epx.y, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(epw $$0, tw $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(epk $$0, epl $$1, azs $$2) {
         if ($$0 != null) {
            ((ery.m)$$0).b = this;
         }
      }

      public static ery.g a(epl $$0, int $$1, int $$2, int $$3, jo $$4, int $$5) {
         eoy $$6 = eoy.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new ery.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dio $$0, dil $$1, eak $$2, azs $$3, eoy $$4, dgw $$5, jj $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, ery.k);
         this.a($$0, $$3, $$4, ery.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, ery.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, ery.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, ery.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, ery.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, ery.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, ery.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, dkw.K.m(), dkw.K.m(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, dkw.K.m(), dkw.K.m(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, ery.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, dkw.K.m(), dkw.K.m(), false);
         dym $$8 = dkw.fk.m().b(doy.a, Boolean.valueOf(true)).b(doy.c, Boolean.valueOf(true));
         dym $$9 = dkw.fk.m().b(doy.d, Boolean.valueOf(true)).b(doy.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         dym $$12 = dkw.fy.m().b(dsu.b, jo.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, ery.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, ery.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, ery.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         dym $$14 = dkw.fT.m().b(dnk.b, jo.c);
         dym $$15 = dkw.fT.m().b(dnk.b, jo.d);
         dym $$16 = dkw.fT.m().b(dnk.b, jo.f);
         dym $$17 = dkw.fT.m().b(dnk.b, jo.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.b(dnk.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.b(dnk.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.b(dnk.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.b(dnk.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.b(dnk.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.b(dnk.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.b(dnk.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.b(dnk.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.b(dnk.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.b(dnk.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.b(dnk.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.b(dnk.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            dym $$21 = dkw.fS.m();
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
            jj $$22 = this.b(5, 3, 6);
            if ($$4.b($$22)) {
               this.d = true;
               $$0.a($$22, dkw.cA.m(), 2);
               if ($$0.c_($$22) instanceof dxd $$24) {
                  $$24.a(bwb.bd, $$3);
               }
            }
         }
      }
   }

   public static class h extends ery.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, azs $$1, eoy $$2, jo $$3) {
         super(epx.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(tw $$0) {
         super(epx.z, $$0);
      }

      @Override
      public void a(epk $$0, epl $$1, azs $$2) {
         this.a((ery.m)$$0, $$1, $$2, 1, 1);
      }

      public static ery.h a(epl $$0, azs $$1, int $$2, int $$3, int $$4, jo $$5, int $$6) {
         eoy $$7 = eoy.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new ery.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dio $$0, dil $$1, eak $$2, azs $$3, eoy $$4, dgw $$5, jj $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, ery.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, ery.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, ery.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, ery.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, ery.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, dkw.fk.m().b(doy.a, Boolean.valueOf(true)).b(doy.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, dkw.fk.m().b(doy.a, Boolean.valueOf(true)).b(doy.c, Boolean.valueOf(true)).b(doy.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, dkw.fk.m().b(doy.a, Boolean.valueOf(true)).b(doy.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, dkw.fk.m().b(doy.d, Boolean.valueOf(true)).b(doy.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, dkw.fk.m().b(doy.d, Boolean.valueOf(true)).b(doy.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, dkw.fk.m().b(doy.d, Boolean.valueOf(true)).b(doy.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, dkw.fk.m().b(doy.a, Boolean.valueOf(true)).b(doy.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, dkw.fk.m().b(doy.a, Boolean.valueOf(true)).b(doy.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         dym $$8 = dkw.dK.m().b(dnb.b, jo.e);
         dym $$9 = dkw.dK.m().b(dnb.b, jo.e).b(dnb.c, dzi.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends ery.q {
      public i(int $$0, azs $$1, eoy $$2, jo $$3) {
         super(epx.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(tw $$0) {
         super(epx.A, $$0);
      }

      @Override
      public void a(epk $$0, epl $$1, azs $$2) {
         jo $$3 = this.i();
         if ($$3 != jo.c && $$3 != jo.f) {
            this.b((ery.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((ery.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static ery.i a(epl $$0, azs $$1, int $$2, int $$3, int $$4, jo $$5, int $$6) {
         eoy $$7 = eoy.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new ery.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dio $$0, dil $$1, eak $$2, azs $$3, eoy $$4, dgw $$5, jj $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, ery.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         jo $$7 = this.i();
         if ($$7 != jo.c && $$7 != jo.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends ery.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, azs $$1, eoy $$2, jo $$3) {
         super(epx.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(tw $$0) {
         super(epx.B, $$0);
         this.d = $$0.h("Type");
      }

      @Override
      protected void a(epw $$0, tw $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(epk $$0, epl $$1, azs $$2) {
         this.a((ery.m)$$0, $$1, $$2, 4, 1);
         this.b((ery.m)$$0, $$1, $$2, 1, 4);
         this.c((ery.m)$$0, $$1, $$2, 1, 4);
      }

      public static ery.j a(epl $$0, azs $$1, int $$2, int $$3, int $$4, jo $$5, int $$6) {
         eoy $$7 = eoy.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new ery.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dio $$0, dil $$1, eak $$2, azs $$3, eoy $$4, dgw $$5, jj $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, ery.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, dkw.eV.m(), 5, 1, 5, $$4);
               this.a($$0, dkw.eV.m(), 5, 2, 5, $$4);
               this.a($$0, dkw.eV.m(), 5, 3, 5, $$4);
               this.a($$0, dkw.cx.m().b(due.e, jo.e), 4, 3, 5, $$4);
               this.a($$0, dkw.cx.m().b(due.e, jo.f), 6, 3, 5, $$4);
               this.a($$0, dkw.cx.m().b(due.e, jo.d), 5, 3, 4, $$4);
               this.a($$0, dkw.cx.m().b(due.e, jo.c), 5, 3, 6, $$4);
               this.a($$0, dkw.kd.m(), 4, 1, 4, $$4);
               this.a($$0, dkw.kd.m(), 4, 1, 5, $$4);
               this.a($$0, dkw.kd.m(), 4, 1, 6, $$4);
               this.a($$0, dkw.kd.m(), 6, 1, 4, $$4);
               this.a($$0, dkw.kd.m(), 6, 1, 5, $$4);
               this.a($$0, dkw.kd.m(), 6, 1, 6, $$4);
               this.a($$0, dkw.kd.m(), 5, 1, 4, $$4);
               this.a($$0, dkw.kd.m(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, dkw.eV.m(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, dkw.eV.m(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, dkw.eV.m(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, dkw.eV.m(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, dkw.eV.m(), 5, 1, 5, $$4);
               this.a($$0, dkw.eV.m(), 5, 2, 5, $$4);
               this.a($$0, dkw.eV.m(), 5, 3, 5, $$4);
               this.a($$0, dkw.J.m(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, dkw.m.m(), 1, 3, $$8, $$4);
                  this.a($$0, dkw.m.m(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, dkw.m.m(), $$9, 3, 1, $$4);
                  this.a($$0, dkw.m.m(), $$9, 3, 9, $$4);
               }

               this.a($$0, dkw.m.m(), 5, 1, 4, $$4);
               this.a($$0, dkw.m.m(), 5, 1, 6, $$4);
               this.a($$0, dkw.m.m(), 5, 3, 4, $$4);
               this.a($$0, dkw.m.m(), 5, 3, 6, $$4);
               this.a($$0, dkw.m.m(), 4, 1, 5, $$4);
               this.a($$0, dkw.m.m(), 6, 1, 5, $$4);
               this.a($$0, dkw.m.m(), 4, 3, 5, $$4);
               this.a($$0, dkw.m.m(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, dkw.m.m(), 4, $$10, 4, $$4);
                  this.a($$0, dkw.m.m(), 6, $$10, 4, $$4);
                  this.a($$0, dkw.m.m(), 4, $$10, 6, $$4);
                  this.a($$0, dkw.m.m(), 6, $$10, 6, $$4);
               }

               this.a($$0, dkw.cx.m(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, dkw.n.m(), 2, 3, $$11, $$4);
                  this.a($$0, dkw.n.m(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, dkw.n.m(), 4, 3, $$11, $$4);
                     this.a($$0, dkw.n.m(), 5, 3, $$11, $$4);
                     this.a($$0, dkw.n.m(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, dkw.n.m(), 7, 3, $$11, $$4);
                  this.a($$0, dkw.n.m(), 8, 3, $$11, $$4);
               }

               dym $$12 = dkw.cX.m().b(dpd.b, jo.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, exh.w);
         }
      }
   }

   static class k extends epk.a {
      @Override
      public void a(azs $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = dkw.eX.m();
            } else if ($$5 < 0.5F) {
               this.a = dkw.eW.m();
            } else if ($$5 < 0.55F) {
               this.a = dkw.fd.m();
            } else {
               this.a = dkw.eV.m();
            }
         } else {
            this.a = dkw.nE.m();
         }
      }
   }

   public static class l extends ery.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(epx $$0, int $$1, int $$2, int $$3, jo $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = ery.p.a.a;
      }

      public l(int $$0, azs $$1, eoy $$2, jo $$3) {
         super(epx.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(epx $$0, tw $$1) {
         super($$0, $$1);
         this.d = $$1.q("Source");
      }

      public l(tw $$0) {
         this(epx.C, $$0);
      }

      @Override
      protected void a(epw $$0, tw $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(epk $$0, epl $$1, azs $$2) {
         if (this.d) {
            ery.i = ery.c.class;
         }

         this.a((ery.m)$$0, $$1, $$2, 1, 1);
      }

      public static ery.l a(epl $$0, azs $$1, int $$2, int $$3, int $$4, jo $$5, int $$6) {
         eoy $$7 = eoy.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new ery.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dio $$0, dil $$1, eak $$2, azs $$3, eoy $$4, dgw $$5, jj $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, ery.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, ery.p.a.a, 1, 1, 4);
         this.a($$0, dkw.eV.m(), 2, 6, 1, $$4);
         this.a($$0, dkw.eV.m(), 1, 5, 1, $$4);
         this.a($$0, dkw.kd.m(), 1, 6, 1, $$4);
         this.a($$0, dkw.eV.m(), 1, 5, 2, $$4);
         this.a($$0, dkw.eV.m(), 1, 4, 3, $$4);
         this.a($$0, dkw.kd.m(), 1, 5, 3, $$4);
         this.a($$0, dkw.eV.m(), 2, 4, 3, $$4);
         this.a($$0, dkw.eV.m(), 3, 3, 3, $$4);
         this.a($$0, dkw.kd.m(), 3, 4, 3, $$4);
         this.a($$0, dkw.eV.m(), 3, 3, 2, $$4);
         this.a($$0, dkw.eV.m(), 3, 2, 1, $$4);
         this.a($$0, dkw.kd.m(), 3, 3, 1, $$4);
         this.a($$0, dkw.eV.m(), 2, 2, 1, $$4);
         this.a($$0, dkw.eV.m(), 1, 1, 1, $$4);
         this.a($$0, dkw.kd.m(), 1, 2, 1, $$4);
         this.a($$0, dkw.eV.m(), 1, 1, 2, $$4);
         this.a($$0, dkw.kd.m(), 1, 1, 3, $$4);
      }
   }

   public static class m extends ery.l {
      public ery.f a;
      @Nullable
      public ery.g b;
      public final List<epk> c = Lists.newArrayList();

      public m(azs $$0, int $$1, int $$2) {
         super(epx.D, 0, $$1, $$2, a($$0));
      }

      public m(tw $$0) {
         super(epx.D, $$0);
      }

      @Override
      public jj h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends ery.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, azs $$1, eoy $$2, jo $$3) {
         super(epx.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(tw $$0) {
         super(epx.E, $$0);
         this.d = $$0.q("Left");
         this.i = $$0.q("Right");
      }

      @Override
      protected void a(epw $$0, tw $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(epk $$0, epl $$1, azs $$2) {
         this.a((ery.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((ery.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((ery.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static ery.n a(epl $$0, azs $$1, int $$2, int $$3, int $$4, jo $$5, int $$6) {
         eoy $$7 = eoy.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new ery.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dio $$0, dil $$1, eak $$2, azs $$3, eoy $$4, dgw $$5, jj $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, ery.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, ery.p.a.a, 1, 1, 6);
         dym $$7 = dkw.cx.m().b(due.e, jo.f);
         dym $$8 = dkw.cx.m().b(due.e, jo.e);
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

   public static class o extends ery.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, azs $$1, eoy $$2, jo $$3) {
         super(epx.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(tw $$0) {
         super(epx.F, $$0);
      }

      @Override
      public void a(epk $$0, epl $$1, azs $$2) {
         this.a((ery.m)$$0, $$1, $$2, 1, 1);
      }

      public static ery.o a(epl $$0, azs $$1, int $$2, int $$3, int $$4, jo $$5, int $$6) {
         eoy $$7 = eoy.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new ery.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dio $$0, dil $$1, eak $$2, azs $$3, eoy $$4, dgw $$5, jj $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, ery.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, ery.p.a.a, 1, 1, 7);
         dym $$7 = dkw.cZ.m().b(dsu.b, jo.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, dkw.eV.m(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dkw.eV.m(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dkw.eV.m(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends epk {
      protected ery.p.a h = ery.p.a.a;

      protected p(epx $$0, int $$1, eoy $$2) {
         super($$0, $$1, $$2);
      }

      public p(epx $$0, tw $$1) {
         super($$0, $$1);
         this.h = ery.p.a.valueOf($$1.l("EntryDoor"));
      }

      @Override
      protected void a(epw $$0, tw $$1) {
         $$1.a("EntryDoor", this.h.name());
      }

      protected void a(dio $$0, azs $$1, eoy $$2, ery.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, dkw.eV.m(), $$4, $$5, $$6, $$2);
               this.a($$0, dkw.eV.m(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dkw.eV.m(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dkw.eV.m(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dkw.eV.m(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dkw.eV.m(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dkw.eV.m(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dkw.cW.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dkw.cW.m().b(dnb.c, dzi.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, dkw.nE.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dkw.nE.m(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dkw.fk.m().b(doy.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, dkw.fk.m().b(doy.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dkw.fk.m().b(doy.b, Boolean.valueOf(true)).b(doy.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dkw.fk.m().b(doy.b, Boolean.valueOf(true)).b(doy.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dkw.fk.m().b(doy.b, Boolean.valueOf(true)).b(doy.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dkw.fk.m().b(doy.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dkw.fk.m().b(doy.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, dkw.eV.m(), $$4, $$5, $$6, $$2);
               this.a($$0, dkw.eV.m(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dkw.eV.m(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dkw.eV.m(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dkw.eV.m(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dkw.eV.m(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dkw.eV.m(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dkw.dK.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dkw.dK.m().b(dnb.c, dzi.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dkw.dZ.m().b(dlf.e, jo.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, dkw.dZ.m().b(dlf.e, jo.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected ery.p.a b(azs $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return ery.p.a.a;
            case 2:
               return ery.p.a.b;
            case 3:
               return ery.p.a.c;
            case 4:
               return ery.p.a.d;
         }
      }

      @Nullable
      protected epk a(ery.m $$0, epl $$1, azs $$2, int $$3, int $$4) {
         jo $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return ery.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$5, this.g());
               case d:
                  return ery.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$5, this.g());
               case e:
                  return ery.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
               case f:
                  return ery.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected epk b(ery.m $$0, epl $$1, azs $$2, int $$3, int $$4) {
         jo $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return ery.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jo.e, this.g());
               case d:
                  return ery.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jo.e, this.g());
               case e:
                  return ery.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jo.c, this.g());
               case f:
                  return ery.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jo.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected epk c(ery.m $$0, epl $$1, azs $$2, int $$3, int $$4) {
         jo $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return ery.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jo.f, this.g());
               case d:
                  return ery.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jo.f, this.g());
               case e:
                  return ery.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jo.d, this.g());
               case f:
                  return ery.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jo.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(eoy $$0) {
         return $$0 != null && $$0.i() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;
      }
   }

   public abstract static class q extends ery.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(epx $$0, int $$1, eoy $$2) {
         super($$0, $$1, $$2);
      }

      public q(epx $$0, tw $$1) {
         super($$0, $$1);
      }
   }
}
