import java.util.Iterator;
import java.util.List;

public class eaz extends dyc {
   private static final int b = 2;
   private static final double c = 0.01;
   public static final double a = 0.51;
   private static final ebe d = dne.a.m();
   private static final float e = 0.0F;
   private static final boolean f = false;
   private static final boolean g = false;
   private ebe h = d;
   private jb i;
   private boolean j = false;
   private boolean k = false;
   private static final ThreadLocal<jb> l = ThreadLocal.withInitial(() -> null);
   private float m = 0.0F;
   private float q = 0.0F;
   private long r;
   private int s;

   public eaz(iv $$0, ebe $$1) {
      super(dye.l, $$0, $$1);
   }

   public eaz(iv $$0, ebe $$1, ebe $$2, jb $$3, boolean $$4, boolean $$5) {
      this($$0, $$1);
      this.h = $$2;
      this.i = $$3;
      this.j = $$4;
      this.k = $$5;
   }

   @Override
   public tz a(jh.a $$0) {
      return this.e($$0);
   }

   public boolean a() {
      return this.j;
   }

   public jb c() {
      return this.i;
   }

   public boolean d() {
      return this.k;
   }

   public float a(float $$0) {
      if ($$0 > 1.0F) {
         $$0 = 1.0F;
      }

      return azo.h($$0, this.q, this.m);
   }

   public float b(float $$0) {
      return (float)this.i.j() * this.e(this.a($$0));
   }

   public float c(float $$0) {
      return (float)this.i.k() * this.e(this.a($$0));
   }

   public float d(float $$0) {
      return (float)this.i.l() * this.e(this.a($$0));
   }

   private float e(float $$0) {
      return this.j ? $$0 - 1.0F : 1.0F - $$0;
   }

   private ebe u() {
      return !this.a() && this.d() && this.h.b() instanceof eaw
         ? dne.bJ.m().b(eax.d, Boolean.valueOf(this.m > 0.25F)).b(eax.c, this.h.a(dne.by) ? ecg.b : ecg.a).b(eax.a, this.h.c(eaw.a))
         : this.h;
   }

   private static void a(djx $$0, iv $$1, float $$2, eaz $$3) {
      jb $$4 = $$3.f();
      double $$5 = (double)($$2 - $$3.m);
      fgk $$6 = $$3.u().g($$0, $$1);
      if (!$$6.c()) {
         ffl $$7 = a($$1, $$6.a(), $$3);
         List<bwt> $$8 = $$0.a_(null, eay.a($$7, $$4, $$5).b($$7));
         if (!$$8.isEmpty()) {
            List<ffl> $$9 = $$6.e();
            boolean $$10 = $$3.h.a(dne.ix);
            Iterator var12 = $$8.iterator();

            while (true) {
               bwt $$11;
               while (true) {
                  if (!var12.hasNext()) {
                     return;
                  }

                  $$11 = (bwt)var12.next();
                  if ($$11.j_() != ext.d) {
                     if (!$$10) {
                        break;
                     }

                     if (!($$11 instanceof art)) {
                        ffq $$12 = $$11.dy();
                        double $$13 = $$12.d;
                        double $$14 = $$12.e;
                        double $$15 = $$12.f;
                        switch ($$4.o()) {
                           case a:
                              $$13 = (double)$$4.j();
                              break;
                           case b:
                              $$14 = (double)$$4.k();
                              break;
                           case c:
                              $$15 = (double)$$4.l();
                        }

                        $$11.n($$13, $$14, $$15);
                        break;
                     }
                  }
               }

               double $$16 = 0.0;

               for (ffl $$17 : $$9) {
                  ffl $$18 = eay.a(a($$1, $$17, $$3), $$4, $$5);
                  ffl $$19 = $$11.cR();
                  if ($$18.c($$19)) {
                     $$16 = Math.max($$16, a($$18, $$4, $$19));
                     if ($$16 >= $$5) {
                        break;
                     }
                  }
               }

               if (!($$16 <= 0.0)) {
                  $$16 = Math.min($$16, $$5) + 0.01;
                  a($$4, $$11, $$16, $$4);
                  if (!$$3.j && $$3.k) {
                     a($$1, $$11, $$4, $$5);
                  }
               }
            }
         }
      }
   }

   private static void a(jb $$0, bwt $$1, double $$2, jb $$3) {
      l.set($$0);
      $$1.a(bxy.c, new ffq($$2 * (double)$$3.j(), $$2 * (double)$$3.k(), $$2 * (double)$$3.l()));
      l.set(null);
   }

   private static void b(djx $$0, iv $$1, float $$2, eaz $$3) {
      if ($$3.v()) {
         jb $$4 = $$3.f();
         if ($$4.o().d()) {
            double $$5 = $$3.h.g($$0, $$1).c(jb.a.b);
            ffl $$6 = a($$1, new ffl(0.0, $$5, 0.0, 1.0, 1.5000010000000001, 1.0), $$3);
            double $$7 = (double)($$2 - $$3.m);

            for (bwt $$9 : $$0.a((bwt)null, $$6, $$2x -> a($$6, $$2x, $$1))) {
               a($$4, $$9, $$7, $$4);
            }
         }
      }
   }

   private static boolean a(ffl $$0, bwt $$1, iv $$2) {
      return $$1.j_() == ext.a && $$1.aH() && ($$1.d($$2) || $$1.dA() >= $$0.a && $$1.dA() <= $$0.d && $$1.dG() >= $$0.c && $$1.dG() <= $$0.f);
   }

   private boolean v() {
      return this.h.a(dne.pO);
   }

   public jb f() {
      return this.j ? this.i : this.i.g();
   }

   private static double a(ffl $$0, jb $$1, ffl $$2) {
      switch ($$1) {
         case f:
            return $$0.d - $$2.a;
         case e:
            return $$2.d - $$0.a;
         case b:
         default:
            return $$0.e - $$2.b;
         case a:
            return $$2.e - $$0.b;
         case d:
            return $$0.f - $$2.c;
         case c:
            return $$2.f - $$0.c;
      }
   }

   private static ffl a(iv $$0, ffl $$1, eaz $$2) {
      double $$3 = (double)$$2.e($$2.m);
      return $$1.d((double)$$0.u() + $$3 * (double)$$2.i.j(), (double)$$0.v() + $$3 * (double)$$2.i.k(), (double)$$0.w() + $$3 * (double)$$2.i.l());
   }

   private static void a(iv $$0, bwt $$1, jb $$2, double $$3) {
      ffl $$4 = $$1.cR();
      ffl $$5 = fgh.b().a().a($$0);
      if ($$4.c($$5)) {
         jb $$6 = $$2.g();
         double $$7 = a($$5, $$6, $$4) + 0.01;
         double $$8 = a($$5, $$6, $$4.a($$5)) + 0.01;
         if (Math.abs($$7 - $$8) < 0.01) {
            $$7 = Math.min($$7, $$3) + 0.01;
            a($$2, $$1, $$7, $$6);
         }
      }
   }

   public ebe j() {
      return this.h;
   }

   public void k() {
      if (this.n != null && (this.q < 1.0F || this.n.C)) {
         this.m = 1.0F;
         this.q = this.m;
         this.n.o(this.o);
         this.aw_();
         if (this.n.a_(this.o).a(dne.ca)) {
            ebe $$0;
            if (this.k) {
               $$0 = dne.a.m();
            } else {
               $$0 = dnc.b(this.h, this.n, this.o);
            }

            this.n.a(this.o, $$0, 3);
            this.n.b(this.o, $$0.b(), eys.a(this.n, this.s(), null));
         }
      }
   }

   @Override
   public void a(iv $$0, ebe $$1) {
      this.k();
   }

   public jb s() {
      return this.j ? this.i : this.i.g();
   }

   public static void a(djx $$0, iv $$1, ebe $$2, eaz $$3) {
      $$3.r = $$0.ae();
      $$3.q = $$3.m;
      if ($$3.q >= 1.0F) {
         if ($$0.C && $$3.s < 5) {
            $$3.s++;
         } else {
            $$0.o($$1);
            $$3.aw_();
            if ($$0.a_($$1).a(dne.ca)) {
               ebe $$4 = dnc.b($$3.h, $$0, $$1);
               if ($$4.l()) {
                  $$0.a($$1, $$3.h, 340);
                  dnc.a($$3.h, $$4, $$0, $$1, 3);
               } else {
                  if ($$4.b(ebu.I) && $$4.c(ebu.I)) {
                     $$4 = $$4.b(ebu.I, Boolean.valueOf(false));
                  }

                  $$0.a($$1, $$4, 67);
                  $$0.b($$1, $$4.b(), eys.a($$0, $$3.s(), null));
               }
            }
         }
      } else {
         float $$5 = $$3.m + 0.5F;
         a($$0, $$1, $$5, $$3);
         b($$0, $$1, $$5, $$3);
         $$3.m = $$5;
         if ($$3.m >= 1.0F) {
            $$3.m = 1.0F;
         }
      }
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      alg<uy> $$2 = $$1.a(un.a);
      this.h = $$0.<ebe>a("blockState", ebe.a, $$2).orElse(d);
      this.i = $$0.<jb>a("facing", jb.k).orElse(jb.a);
      this.m = $$0.b("progress", 0.0F);
      this.q = this.m;
      this.j = $$0.b("extending", false);
      this.k = $$0.b("source", false);
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      alg<uy> $$2 = $$1.a(un.a);
      $$0.a("blockState", ebe.a, $$2, this.h);
      $$0.a("facing", jb.k, this.i);
      $$0.a("progress", this.q);
      $$0.a("extending", this.j);
      $$0.a("source", this.k);
   }

   public fgk a(djb $$0, iv $$1) {
      fgk $$2;
      if (!this.j && this.k && this.h.b() instanceof eaw) {
         $$2 = this.h.b(eaw.c, Boolean.valueOf(true)).g($$0, $$1);
      } else {
         $$2 = fgh.a();
      }

      jb $$4 = l.get();
      if ((double)this.m < 1.0 && $$4 == this.f()) {
         return $$2;
      } else {
         ebe $$5;
         if (this.d()) {
            $$5 = dne.bJ.m().b(eax.a, this.i).b(eax.d, Boolean.valueOf(this.j != 1.0F - this.m < 0.25F));
         } else {
            $$5 = this.h;
         }

         float $$7 = this.e(this.m);
         double $$8 = (double)((float)this.i.j() * $$7);
         double $$9 = (double)((float)this.i.k() * $$7);
         double $$10 = (double)((float)this.i.l() * $$7);
         return fgh.a($$2, $$5.g($$0, $$1).a($$8, $$9, $$10));
      }
   }

   public long t() {
      return this.r;
   }

   @Override
   public void a(djx $$0) {
      super.a($$0);
      if ($$0.a(mh.i).a(this.h.b().p().h()).isEmpty()) {
         this.h = dne.a.m();
      }
   }
}
