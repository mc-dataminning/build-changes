import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class eng {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final eng.f[] g = new eng.f[]{
      new eng.f(eng.n.class, 40, 0),
      new eng.f(eng.h.class, 5, 5),
      new eng.f(eng.d.class, 20, 0),
      new eng.f(eng.i.class, 20, 0),
      new eng.f(eng.j.class, 10, 6),
      new eng.f(eng.o.class, 5, 5),
      new eng.f(eng.l.class, 5, 5),
      new eng.f(eng.c.class, 5, 4),
      new eng.f(eng.a.class, 5, 4),
      new eng.f(eng.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new eng.f(eng.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<eng.f> h;
   static Class<? extends eng.p> i;
   private static int j;
   static final eng.k k = new eng.k();

   public static void a() {
      h = Lists.newArrayList();

      for (eng.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (eng.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static eng.p a(Class<? extends eng.p> $$0, ekt $$1, azk $$2, int $$3, int $$4, int $$5, @Nullable jj $$6, int $$7) {
      eng.p $$8 = null;
      if ($$0 == eng.n.class) {
         $$8 = eng.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eng.h.class) {
         $$8 = eng.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eng.d.class) {
         $$8 = eng.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eng.i.class) {
         $$8 = eng.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eng.j.class) {
         $$8 = eng.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eng.o.class) {
         $$8 = eng.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eng.l.class) {
         $$8 = eng.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eng.c.class) {
         $$8 = eng.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eng.a.class) {
         $$8 = eng.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eng.e.class) {
         $$8 = eng.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eng.g.class) {
         $$8 = eng.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static eng.p a(eng.m $$0, ekt $$1, azk $$2, int $$3, int $$4, int $$5, jj $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            eng.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (eng.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  eng.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         ekg $$13 = eng.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.i() > 1 ? new eng.b($$7, $$13, $$6) : null;
      }
   }

   static eks b(eng.m $$0, ekt $$1, azk $$2, int $$3, int $$4, int $$5, @Nullable jj $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
         eks $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends eng.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, azk $$1, ekg $$2, jj $$3) {
         super(elf.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(uf $$0) {
         super(elf.t, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(ele $$0, uf $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(eks $$0, ekt $$1, azk $$2) {
         this.a((eng.m)$$0, $$1, $$2, 1, 1);
      }

      public static eng.a a(ekt $$0, azk $$1, int $$2, int $$3, int $$4, jj $$5, int $$6) {
         ekg $$7 = ekg.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new eng.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dep $$0, den $$1, dvx $$2, azk $$3, ekg $$4, dcy $$5, je $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, eng.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, eng.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, dgx.eH.o(), dgx.eH.o(), false);
         this.a($$0, dgx.jK.o(), 3, 1, 1, $$4);
         this.a($$0, dgx.jK.o(), 3, 1, 5, $$4);
         this.a($$0, dgx.jK.o(), 3, 2, 2, $$4);
         this.a($$0, dgx.jK.o(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, dgx.jK.o(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, esp.y);
         }
      }
   }

   public static class b extends eng.p {
      private final int a;

      public b(int $$0, ekg $$1, jj $$2) {
         super(elf.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != jj.c && $$2 != jj.d ? $$1.d() : $$1.f();
      }

      public b(uf $$0) {
         super(elf.u, $$0);
         this.a = $$0.h("Steps");
      }

      @Override
      protected void a(ele $$0, uf $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static ekg a(ekt $$0, azk $$1, int $$2, int $$3, int $$4, jj $$5) {
         int $$6 = 3;
         ekg $$7 = ekg.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         eks $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().i() == $$7.i()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = ekg.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return ekg.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(dep $$0, den $$1, dvx $$2, azk $$3, ekg $$4, dcy $$5, je $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, dgx.eH.o(), 0, 0, $$7, $$4);
            this.a($$0, dgx.eH.o(), 1, 0, $$7, $$4);
            this.a($$0, dgx.eH.o(), 2, 0, $$7, $$4);
            this.a($$0, dgx.eH.o(), 3, 0, $$7, $$4);
            this.a($$0, dgx.eH.o(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, dgx.eH.o(), 0, $$8, $$7, $$4);
               this.a($$0, dgx.nc.o(), 1, $$8, $$7, $$4);
               this.a($$0, dgx.nc.o(), 2, $$8, $$7, $$4);
               this.a($$0, dgx.nc.o(), 3, $$8, $$7, $$4);
               this.a($$0, dgx.eH.o(), 4, $$8, $$7, $$4);
            }

            this.a($$0, dgx.eH.o(), 0, 4, $$7, $$4);
            this.a($$0, dgx.eH.o(), 1, 4, $$7, $$4);
            this.a($$0, dgx.eH.o(), 2, 4, $$7, $$4);
            this.a($$0, dgx.eH.o(), 3, 4, $$7, $$4);
            this.a($$0, dgx.eH.o(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends eng.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, azk $$1, ekg $$2, jj $$3) {
         super(elf.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(uf $$0) {
         super(elf.v, $$0);
         this.d = $$0.q("leftLow");
         this.i = $$0.q("leftHigh");
         this.j = $$0.q("rightLow");
         this.k = $$0.q("rightHigh");
      }

      @Override
      protected void a(ele $$0, uf $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(eks $$0, ekt $$1, azk $$2) {
         int $$3 = 3;
         int $$4 = 5;
         jj $$5 = this.i();
         if ($$5 == jj.e || $$5 == jj.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((eng.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((eng.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((eng.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((eng.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((eng.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static eng.c a(ekt $$0, azk $$1, int $$2, int $$3, int $$4, jj $$5, int $$6) {
         ekg $$7 = ekg.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eng.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dep $$0, den $$1, dvx $$2, azk $$3, ekg $$4, dcy $$5, je $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, eng.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, eng.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, eng.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, eng.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, eng.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, eng.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, dgx.jE.o(), dgx.jE.o(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, dgx.jE.o(), dgx.jE.o(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, eng.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, dgx.jE.o(), dgx.jE.o(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, dgx.jE.o(), dgx.jE.o(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, dgx.jE.o(), dgx.jE.o(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, dgx.jE.o(), dgx.jE.o(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, dgx.jE.o().b(dnz.b, dvi.c), dgx.jE.o().b(dnz.b, dvi.c), false);
         this.a($$0, dgx.cq.o().b(dpy.g, jj.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends eng.q {
      public d(int $$0, azk $$1, ekg $$2, jj $$3) {
         super(elf.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(uf $$0) {
         super(elf.w, $$0);
      }

      @Override
      public void a(eks $$0, ekt $$1, azk $$2) {
         jj $$3 = this.i();
         if ($$3 != jj.c && $$3 != jj.f) {
            this.c((eng.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((eng.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static eng.d a(ekt $$0, azk $$1, int $$2, int $$3, int $$4, jj $$5, int $$6) {
         ekg $$7 = ekg.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eng.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dep $$0, den $$1, dvx $$2, azk $$3, ekg $$4, dcy $$5, je $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, eng.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         jj $$7 = this.i();
         if ($$7 != jj.c && $$7 != jj.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends eng.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, azk $$1, ekg $$2, jj $$3) {
         super(elf.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.e() > 6;
      }

      public e(uf $$0) {
         super(elf.x, $$0);
         this.i = $$0.q("Tall");
      }

      @Override
      protected void a(ele $$0, uf $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static eng.e a(ekt $$0, azk $$1, int $$2, int $$3, int $$4, jj $$5, int $$6) {
         ekg $$7 = ekg.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = ekg.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new eng.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(dep $$0, den $$1, dvx $$2, azk $$3, ekg $$4, dcy $$5, je $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, eng.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, dgx.bs.o(), dgx.bs.o(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dgx.n.o(), dgx.n.o(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dgx.n.o(), dgx.n.o(), false);
               this.a($$0, dgx.cq.o().b(dpy.g, jj.f), 2, 3, $$10, $$4);
               this.a($$0, dgx.cq.o().b(dpy.g, jj.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dgx.n.o(), dgx.n.o(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dgx.n.o(), dgx.n.o(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dgx.cl.o(), dgx.cl.o(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dgx.cl.o(), dgx.cl.o(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dgx.cl.o(), dgx.cl.o(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dgx.cl.o(), dgx.cl.o(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, dgx.cl.o(), dgx.cl.o(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, dgx.cl.o(), dgx.cl.o(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, dgx.cl.o(), dgx.cl.o(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, dgx.n.o(), dgx.n.o(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, dgx.n.o(), dgx.n.o(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, dgx.n.o(), dgx.n.o(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, dgx.n.o(), dgx.n.o(), false);
            this.a($$0, dgx.n.o(), 9, 5, 11, $$4);
            this.a($$0, dgx.n.o(), 8, 5, 11, $$4);
            this.a($$0, dgx.n.o(), 9, 5, 10, $$4);
            dua $$12 = dgx.dU.o().b(djt.d, Boolean.valueOf(true)).b(djt.b, Boolean.valueOf(true));
            dua $$13 = dgx.dU.o().b(djt.a, Boolean.valueOf(true)).b(djt.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, dgx.dU.o().b(djt.a, Boolean.valueOf(true)).b(djt.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, dgx.dU.o().b(djt.c, Boolean.valueOf(true)).b(djt.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, dgx.dU.o().b(djt.a, Boolean.valueOf(true)).b(djt.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, dgx.dU.o().b(djt.c, Boolean.valueOf(true)).b(djt.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, dgx.dU.o().b(djt.a, Boolean.valueOf(true)).b(djt.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            dua $$15 = dgx.cO.o().b(dlb.b, jj.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            dua $$18 = dgx.dU.o().b(djt.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            dua $$19 = dgx.dU.o().b(djt.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            dua $$20 = $$13.b(djt.d, Boolean.valueOf(true)).b(djt.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.b(djt.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.b(djt.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.b(djt.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.b(djt.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            dua $$21 = dgx.cp.o();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, esp.w);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, esp.w);
         }
      }
   }

   static class f {
      public final Class<? extends eng.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends eng.p> $$0, int $$1, int $$2) {
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

   public static class g extends eng.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, ekg $$1, jj $$2) {
         super(elf.y, $$0, $$1);
         this.a($$2);
      }

      public g(uf $$0) {
         super(elf.y, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(ele $$0, uf $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(eks $$0, ekt $$1, azk $$2) {
         if ($$0 != null) {
            ((eng.m)$$0).b = this;
         }
      }

      public static eng.g a(ekt $$0, int $$1, int $$2, int $$3, jj $$4, int $$5) {
         ekg $$6 = ekg.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new eng.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dep $$0, den $$1, dvx $$2, azk $$3, ekg $$4, dcy $$5, je $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, eng.k);
         this.a($$0, $$3, $$4, eng.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, eng.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, eng.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, eng.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, eng.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, eng.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, eng.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, dgx.H.o(), dgx.H.o(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, dgx.H.o(), dgx.H.o(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, eng.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, dgx.H.o(), dgx.H.o(), false);
         dua $$8 = dgx.eW.o().b(dkw.a, Boolean.valueOf(true)).b(dkw.c, Boolean.valueOf(true));
         dua $$9 = dgx.eW.o().b(dkw.d, Boolean.valueOf(true)).b(dkw.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         dua $$12 = dgx.fj.o().b(doq.b, jj.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, eng.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, eng.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, eng.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         dua $$14 = dgx.fy.o().b(djk.b, jj.c);
         dua $$15 = dgx.fy.o().b(djk.b, jj.d);
         dua $$16 = dgx.fy.o().b(djk.b, jj.f);
         dua $$17 = dgx.fy.o().b(djk.b, jj.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.b(djk.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.b(djk.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.b(djk.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.b(djk.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.b(djk.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.b(djk.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.b(djk.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.b(djk.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.b(djk.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.b(djk.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.b(djk.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.b(djk.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            dua $$21 = dgx.fx.o();
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
               $$0.a($$22, dgx.ct.o(), 2);
               if ($$0.c_($$22) instanceof dsu $$24) {
                  $$24.a(btq.aM, $$3);
               }
            }
         }
      }
   }

   public static class h extends eng.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, azk $$1, ekg $$2, jj $$3) {
         super(elf.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(uf $$0) {
         super(elf.z, $$0);
      }

      @Override
      public void a(eks $$0, ekt $$1, azk $$2) {
         this.a((eng.m)$$0, $$1, $$2, 1, 1);
      }

      public static eng.h a(ekt $$0, azk $$1, int $$2, int $$3, int $$4, jj $$5, int $$6) {
         ekg $$7 = ekg.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eng.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dep $$0, den $$1, dvx $$2, azk $$3, ekg $$4, dcy $$5, je $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, eng.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, eng.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, eng.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, eng.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, eng.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, dgx.eW.o().b(dkw.a, Boolean.valueOf(true)).b(dkw.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, dgx.eW.o().b(dkw.a, Boolean.valueOf(true)).b(dkw.c, Boolean.valueOf(true)).b(dkw.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, dgx.eW.o().b(dkw.a, Boolean.valueOf(true)).b(dkw.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, dgx.eW.o().b(dkw.d, Boolean.valueOf(true)).b(dkw.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, dgx.eW.o().b(dkw.d, Boolean.valueOf(true)).b(dkw.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, dgx.eW.o().b(dkw.d, Boolean.valueOf(true)).b(dkw.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, dgx.eW.o().b(dkw.a, Boolean.valueOf(true)).b(dkw.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, dgx.eW.o().b(dkw.a, Boolean.valueOf(true)).b(dkw.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         dua $$8 = dgx.dy.o().b(djb.b, jj.e);
         dua $$9 = dgx.dy.o().b(djb.b, jj.e).b(djb.f, duw.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends eng.q {
      public i(int $$0, azk $$1, ekg $$2, jj $$3) {
         super(elf.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(uf $$0) {
         super(elf.A, $$0);
      }

      @Override
      public void a(eks $$0, ekt $$1, azk $$2) {
         jj $$3 = this.i();
         if ($$3 != jj.c && $$3 != jj.f) {
            this.b((eng.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((eng.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static eng.i a(ekt $$0, azk $$1, int $$2, int $$3, int $$4, jj $$5, int $$6) {
         ekg $$7 = ekg.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eng.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dep $$0, den $$1, dvx $$2, azk $$3, ekg $$4, dcy $$5, je $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, eng.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         jj $$7 = this.i();
         if ($$7 != jj.c && $$7 != jj.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends eng.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, azk $$1, ekg $$2, jj $$3) {
         super(elf.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(uf $$0) {
         super(elf.B, $$0);
         this.d = $$0.h("Type");
      }

      @Override
      protected void a(ele $$0, uf $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(eks $$0, ekt $$1, azk $$2) {
         this.a((eng.m)$$0, $$1, $$2, 4, 1);
         this.b((eng.m)$$0, $$1, $$2, 1, 4);
         this.c((eng.m)$$0, $$1, $$2, 1, 4);
      }

      public static eng.j a(ekt $$0, azk $$1, int $$2, int $$3, int $$4, jj $$5, int $$6) {
         ekg $$7 = ekg.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eng.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dep $$0, den $$1, dvx $$2, azk $$3, ekg $$4, dcy $$5, je $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, eng.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, dgx.eH.o(), 5, 1, 5, $$4);
               this.a($$0, dgx.eH.o(), 5, 2, 5, $$4);
               this.a($$0, dgx.eH.o(), 5, 3, 5, $$4);
               this.a($$0, dgx.cq.o().b(dpy.g, jj.e), 4, 3, 5, $$4);
               this.a($$0, dgx.cq.o().b(dpy.g, jj.f), 6, 3, 5, $$4);
               this.a($$0, dgx.cq.o().b(dpy.g, jj.d), 5, 3, 4, $$4);
               this.a($$0, dgx.cq.o().b(dpy.g, jj.c), 5, 3, 6, $$4);
               this.a($$0, dgx.jE.o(), 4, 1, 4, $$4);
               this.a($$0, dgx.jE.o(), 4, 1, 5, $$4);
               this.a($$0, dgx.jE.o(), 4, 1, 6, $$4);
               this.a($$0, dgx.jE.o(), 6, 1, 4, $$4);
               this.a($$0, dgx.jE.o(), 6, 1, 5, $$4);
               this.a($$0, dgx.jE.o(), 6, 1, 6, $$4);
               this.a($$0, dgx.jE.o(), 5, 1, 4, $$4);
               this.a($$0, dgx.jE.o(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, dgx.eH.o(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, dgx.eH.o(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, dgx.eH.o(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, dgx.eH.o(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, dgx.eH.o(), 5, 1, 5, $$4);
               this.a($$0, dgx.eH.o(), 5, 2, 5, $$4);
               this.a($$0, dgx.eH.o(), 5, 3, 5, $$4);
               this.a($$0, dgx.G.o(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, dgx.m.o(), 1, 3, $$8, $$4);
                  this.a($$0, dgx.m.o(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, dgx.m.o(), $$9, 3, 1, $$4);
                  this.a($$0, dgx.m.o(), $$9, 3, 9, $$4);
               }

               this.a($$0, dgx.m.o(), 5, 1, 4, $$4);
               this.a($$0, dgx.m.o(), 5, 1, 6, $$4);
               this.a($$0, dgx.m.o(), 5, 3, 4, $$4);
               this.a($$0, dgx.m.o(), 5, 3, 6, $$4);
               this.a($$0, dgx.m.o(), 4, 1, 5, $$4);
               this.a($$0, dgx.m.o(), 6, 1, 5, $$4);
               this.a($$0, dgx.m.o(), 4, 3, 5, $$4);
               this.a($$0, dgx.m.o(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, dgx.m.o(), 4, $$10, 4, $$4);
                  this.a($$0, dgx.m.o(), 6, $$10, 4, $$4);
                  this.a($$0, dgx.m.o(), 4, $$10, 6, $$4);
                  this.a($$0, dgx.m.o(), 6, $$10, 6, $$4);
               }

               this.a($$0, dgx.cq.o(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, dgx.n.o(), 2, 3, $$11, $$4);
                  this.a($$0, dgx.n.o(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, dgx.n.o(), 4, 3, $$11, $$4);
                     this.a($$0, dgx.n.o(), 5, 3, $$11, $$4);
                     this.a($$0, dgx.n.o(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, dgx.n.o(), 7, 3, $$11, $$4);
                  this.a($$0, dgx.n.o(), 8, 3, $$11, $$4);
               }

               dua $$12 = dgx.cO.o().b(dlb.b, jj.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, esp.x);
         }
      }
   }

   static class k extends eks.a {
      @Override
      public void a(azk $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = dgx.eJ.o();
            } else if ($$5 < 0.5F) {
               this.a = dgx.eI.o();
            } else if ($$5 < 0.55F) {
               this.a = dgx.eP.o();
            } else {
               this.a = dgx.eH.o();
            }
         } else {
            this.a = dgx.nc.o();
         }
      }
   }

   public static class l extends eng.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(elf $$0, int $$1, int $$2, int $$3, jj $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = eng.p.a.a;
      }

      public l(int $$0, azk $$1, ekg $$2, jj $$3) {
         super(elf.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(elf $$0, uf $$1) {
         super($$0, $$1);
         this.d = $$1.q("Source");
      }

      public l(uf $$0) {
         this(elf.C, $$0);
      }

      @Override
      protected void a(ele $$0, uf $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(eks $$0, ekt $$1, azk $$2) {
         if (this.d) {
            eng.i = eng.c.class;
         }

         this.a((eng.m)$$0, $$1, $$2, 1, 1);
      }

      public static eng.l a(ekt $$0, azk $$1, int $$2, int $$3, int $$4, jj $$5, int $$6) {
         ekg $$7 = ekg.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eng.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dep $$0, den $$1, dvx $$2, azk $$3, ekg $$4, dcy $$5, je $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, eng.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, eng.p.a.a, 1, 1, 4);
         this.a($$0, dgx.eH.o(), 2, 6, 1, $$4);
         this.a($$0, dgx.eH.o(), 1, 5, 1, $$4);
         this.a($$0, dgx.jE.o(), 1, 6, 1, $$4);
         this.a($$0, dgx.eH.o(), 1, 5, 2, $$4);
         this.a($$0, dgx.eH.o(), 1, 4, 3, $$4);
         this.a($$0, dgx.jE.o(), 1, 5, 3, $$4);
         this.a($$0, dgx.eH.o(), 2, 4, 3, $$4);
         this.a($$0, dgx.eH.o(), 3, 3, 3, $$4);
         this.a($$0, dgx.jE.o(), 3, 4, 3, $$4);
         this.a($$0, dgx.eH.o(), 3, 3, 2, $$4);
         this.a($$0, dgx.eH.o(), 3, 2, 1, $$4);
         this.a($$0, dgx.jE.o(), 3, 3, 1, $$4);
         this.a($$0, dgx.eH.o(), 2, 2, 1, $$4);
         this.a($$0, dgx.eH.o(), 1, 1, 1, $$4);
         this.a($$0, dgx.jE.o(), 1, 2, 1, $$4);
         this.a($$0, dgx.eH.o(), 1, 1, 2, $$4);
         this.a($$0, dgx.jE.o(), 1, 1, 3, $$4);
      }
   }

   public static class m extends eng.l {
      public eng.f a;
      @Nullable
      public eng.g b;
      public final List<eks> c = Lists.newArrayList();

      public m(azk $$0, int $$1, int $$2) {
         super(elf.D, 0, $$1, $$2, a($$0));
      }

      public m(uf $$0) {
         super(elf.D, $$0);
      }

      @Override
      public je h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends eng.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, azk $$1, ekg $$2, jj $$3) {
         super(elf.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(uf $$0) {
         super(elf.E, $$0);
         this.d = $$0.q("Left");
         this.i = $$0.q("Right");
      }

      @Override
      protected void a(ele $$0, uf $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(eks $$0, ekt $$1, azk $$2) {
         this.a((eng.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((eng.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((eng.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static eng.n a(ekt $$0, azk $$1, int $$2, int $$3, int $$4, jj $$5, int $$6) {
         ekg $$7 = ekg.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new eng.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dep $$0, den $$1, dvx $$2, azk $$3, ekg $$4, dcy $$5, je $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, eng.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, eng.p.a.a, 1, 1, 6);
         dua $$7 = dgx.cq.o().b(dpy.g, jj.f);
         dua $$8 = dgx.cq.o().b(dpy.g, jj.e);
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

   public static class o extends eng.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, azk $$1, ekg $$2, jj $$3) {
         super(elf.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(uf $$0) {
         super(elf.F, $$0);
      }

      @Override
      public void a(eks $$0, ekt $$1, azk $$2) {
         this.a((eng.m)$$0, $$1, $$2, 1, 1);
      }

      public static eng.o a(ekt $$0, azk $$1, int $$2, int $$3, int $$4, jj $$5, int $$6) {
         ekg $$7 = ekg.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new eng.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dep $$0, den $$1, dvx $$2, azk $$3, ekg $$4, dcy $$5, je $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, eng.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, eng.p.a.a, 1, 1, 7);
         dua $$7 = dgx.cQ.o().b(doq.b, jj.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, dgx.eH.o(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dgx.eH.o(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dgx.eH.o(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends eks {
      protected eng.p.a h = eng.p.a.a;

      protected p(elf $$0, int $$1, ekg $$2) {
         super($$0, $$1, $$2);
      }

      public p(elf $$0, uf $$1) {
         super($$0, $$1);
         this.h = eng.p.a.valueOf($$1.l("EntryDoor"));
      }

      @Override
      protected void a(ele $$0, uf $$1) {
         $$1.a("EntryDoor", this.h.name());
      }

      protected void a(dep $$0, azk $$1, ekg $$2, eng.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, dgx.eH.o(), $$4, $$5, $$6, $$2);
               this.a($$0, dgx.eH.o(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dgx.eH.o(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dgx.eH.o(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dgx.eH.o(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dgx.eH.o(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dgx.eH.o(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dgx.cN.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dgx.cN.o().b(djb.f, duw.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, dgx.nc.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dgx.nc.o(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dgx.eW.o().b(dkw.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, dgx.eW.o().b(dkw.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dgx.eW.o().b(dkw.b, Boolean.valueOf(true)).b(dkw.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dgx.eW.o().b(dkw.b, Boolean.valueOf(true)).b(dkw.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dgx.eW.o().b(dkw.b, Boolean.valueOf(true)).b(dkw.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dgx.eW.o().b(dkw.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dgx.eW.o().b(dkw.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, dgx.eH.o(), $$4, $$5, $$6, $$2);
               this.a($$0, dgx.eH.o(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dgx.eH.o(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dgx.eH.o(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dgx.eH.o(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dgx.eH.o(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dgx.eH.o(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dgx.dy.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dgx.dy.o().b(djb.f, duw.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dgx.dM.o().b(dhf.aE, jj.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, dgx.dM.o().b(dhf.aE, jj.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected eng.p.a b(azk $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return eng.p.a.a;
            case 2:
               return eng.p.a.b;
            case 3:
               return eng.p.a.c;
            case 4:
               return eng.p.a.d;
         }
      }

      @Nullable
      protected eks a(eng.m $$0, ekt $$1, azk $$2, int $$3, int $$4) {
         jj $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eng.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$5, this.g());
               case d:
                  return eng.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$5, this.g());
               case e:
                  return eng.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
               case f:
                  return eng.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected eks b(eng.m $$0, ekt $$1, azk $$2, int $$3, int $$4) {
         jj $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eng.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jj.e, this.g());
               case d:
                  return eng.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jj.e, this.g());
               case e:
                  return eng.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jj.c, this.g());
               case f:
                  return eng.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jj.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected eks c(eng.m $$0, ekt $$1, azk $$2, int $$3, int $$4) {
         jj $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eng.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jj.f, this.g());
               case d:
                  return eng.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jj.f, this.g());
               case e:
                  return eng.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jj.d, this.g());
               case f:
                  return eng.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jj.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(ekg $$0) {
         return $$0 != null && $$0.i() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;
      }
   }

   public abstract static class q extends eng.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(elf $$0, int $$1, ekg $$2) {
         super($$0, $$1, $$2);
      }

      public q(elf $$0, uf $$1) {
         super($$0, $$1);
      }
   }
}
