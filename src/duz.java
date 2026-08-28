import java.util.Iterator;
import java.util.List;

public class duz extends dsg {
   private static final int b = 2;
   private static final double c = 0.01;
   public static final double a = 0.51;
   private dvd d = dia.a.m();
   private jl e;
   private boolean f;
   private boolean g;
   private static final ThreadLocal<jl> h = ThreadLocal.withInitial(() -> null);
   private float i;
   private float j;
   private long k;
   private int l;

   public duz(jg $$0, dvd $$1) {
      super(dsi.k, $$0, $$1);
   }

   public duz(jg $$0, dvd $$1, dvd $$2, jl $$3, boolean $$4, boolean $$5) {
      this($$0, $$1);
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   @Override
   public uj a(jr.a $$0) {
      return this.e($$0);
   }

   public boolean b() {
      return this.f;
   }

   public jl c() {
      return this.e;
   }

   public boolean d() {
      return this.g;
   }

   public float a(float $$0) {
      if ($$0 > 1.0F) {
         $$0 = 1.0F;
      }

      return azj.h($$0, this.j, this.i);
   }

   public float b(float $$0) {
      return (float)this.e.j() * this.e(this.a($$0));
   }

   public float c(float $$0) {
      return (float)this.e.k() * this.e(this.a($$0));
   }

   public float d(float $$0) {
      return (float)this.e.l() * this.e(this.a($$0));
   }

   private float e(float $$0) {
      return this.f ? $$0 - 1.0F : 1.0F - $$0;
   }

   private dvd v() {
      return !this.b() && this.d() && this.d.b() instanceof duw
         ? dia.bz.m().b(dux.d, Boolean.valueOf(this.i > 0.25F)).b(dux.c, this.d.a(dia.br) ? dwf.b : dwf.a).b(dux.a, this.d.c(duw.a))
         : this.d;
   }

   private static void a(dev $$0, jg $$1, float $$2, duz $$3) {
      jl $$4 = $$3.f();
      double $$5 = (double)($$2 - $$3.i);
      fab $$6 = $$3.v().g($$0, $$1);
      if (!$$6.c()) {
         ezc $$7 = a($$1, $$6.a(), $$3);
         List<btz> $$8 = $$0.a_(null, duy.a($$7, $$4, $$5).b($$7));
         if (!$$8.isEmpty()) {
            List<ezc> $$9 = $$6.e();
            boolean $$10 = $$3.d.a(dia.hV);
            Iterator var12 = $$8.iterator();

            while (true) {
               btz $$11;
               while (true) {
                  if (!var12.hasNext()) {
                     return;
                  }

                  $$11 = (btz)var12.next();
                  if ($$11.k_() != erj.d) {
                     if (!$$10) {
                        break;
                     }

                     if (!($$11 instanceof arn)) {
                        ezh $$12 = $$11.dA();
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

               for (ezc $$17 : $$9) {
                  ezc $$18 = duy.a(a($$1, $$17, $$3), $$4, $$5);
                  ezc $$19 = $$11.cS();
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
                  if (!$$3.f && $$3.g) {
                     a($$1, $$11, $$4, $$5);
                  }
               }
            }
         }
      }
   }

   private static void a(jl $$0, btz $$1, double $$2, jl $$3) {
      h.set($$0);
      $$1.a(buz.c, new ezh($$2 * (double)$$3.j(), $$2 * (double)$$3.k(), $$2 * (double)$$3.l()));
      $$1.aK();
      h.set(null);
   }

   private static void b(dev $$0, jg $$1, float $$2, duz $$3) {
      if ($$3.w()) {
         jl $$4 = $$3.f();
         if ($$4.o().d()) {
            double $$5 = $$3.d.g($$0, $$1).c(jl.a.b);
            ezc $$6 = a($$1, new ezc(0.0, $$5, 0.0, 1.0, 1.5000010000000001, 1.0), $$3);
            double $$7 = (double)($$2 - $$3.i);

            for (btz $$9 : $$0.a((btz)null, $$6, $$2x -> a($$6, $$2x, $$1))) {
               a($$4, $$9, $$7, $$4);
            }
         }
      }
   }

   private static boolean a(ezc $$0, btz $$1, jg $$2) {
      return $$1.k_() == erj.a && $$1.aJ() && ($$1.d($$2) || $$1.dC() >= $$0.a && $$1.dC() <= $$0.d && $$1.dI() >= $$0.c && $$1.dI() <= $$0.f);
   }

   private boolean w() {
      return this.d.a(dia.pg);
   }

   public jl f() {
      return this.f ? this.e : this.e.g();
   }

   private static double a(ezc $$0, jl $$1, ezc $$2) {
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

   private static ezc a(jg $$0, ezc $$1, duz $$2) {
      double $$3 = (double)$$2.e($$2.i);
      return $$1.d((double)$$0.u() + $$3 * (double)$$2.e.j(), (double)$$0.v() + $$3 * (double)$$2.e.k(), (double)$$0.w() + $$3 * (double)$$2.e.l());
   }

   private static void a(jg $$0, btz $$1, jl $$2, double $$3) {
      ezc $$4 = $$1.cS();
      ezc $$5 = ezy.b().a().a($$0);
      if ($$4.c($$5)) {
         jl $$6 = $$2.g();
         double $$7 = a($$5, $$6, $$4) + 0.01;
         double $$8 = a($$5, $$6, $$4.a($$5)) + 0.01;
         if (Math.abs($$7 - $$8) < 0.01) {
            $$7 = Math.min($$7, $$3) + 0.01;
            a($$2, $$1, $$7, $$6);
         }
      }
   }

   public dvd j() {
      return this.d;
   }

   public void k() {
      if (this.o != null && (this.j < 1.0F || this.o.C)) {
         this.i = 1.0F;
         this.j = this.i;
         this.o.o(this.p);
         this.ax_();
         if (this.o.a_(this.p).a(dia.bQ)) {
            dvd $$0;
            if (this.g) {
               $$0 = dia.a.m();
            } else {
               $$0 = dhy.b(this.d, this.o, this.p);
            }

            this.o.a(this.p, $$0, 3);
            this.o.b(this.p, $$0.b(), esi.a(this.o, this.t(), null));
         }
      }
   }

   public jl t() {
      return this.f ? this.e : this.e.g();
   }

   public static void a(dev $$0, jg $$1, dvd $$2, duz $$3) {
      $$3.k = $$0.aa();
      $$3.j = $$3.i;
      if ($$3.j >= 1.0F) {
         if ($$0.C && $$3.l < 5) {
            $$3.l++;
         } else {
            $$0.o($$1);
            $$3.ax_();
            if ($$0.a_($$1).a(dia.bQ)) {
               dvd $$4 = dhy.b($$3.d, $$0, $$1);
               if ($$4.l()) {
                  $$0.a($$1, $$3.d, 84);
                  dhy.a($$3.d, $$4, $$0, $$1, 3);
               } else {
                  if ($$4.b(dvt.C) && $$4.c(dvt.C)) {
                     $$4 = $$4.b(dvt.C, Boolean.valueOf(false));
                  }

                  $$0.a($$1, $$4, 67);
                  $$0.b($$1, $$4.b(), esi.a($$0, $$3.t(), null));
               }
            }
         }
      } else {
         float $$5 = $$3.i + 0.5F;
         a($$0, $$1, $$5, $$3);
         b($$0, $$1, $$5, $$3);
         $$3.i = $$5;
         if ($$3.i >= 1.0F) {
            $$3.i = 1.0F;
         }
      }
   }

   @Override
   protected void a(uj $$0, jr.a $$1) {
      super.a($$0, $$1);
      jq<dhy> $$2 = (jq<dhy>)(this.o != null ? this.o.a(ly.f) : lx.e);
      this.d = uy.a($$2, $$0.p("blockState"));
      this.e = jl.a($$0.h("facing"));
      this.i = $$0.j("progress");
      this.j = this.i;
      this.f = $$0.q("extending");
      this.g = $$0.q("source");
   }

   @Override
   protected void b(uj $$0, jr.a $$1) {
      super.b($$0, $$1);
      $$0.a("blockState", uy.a(this.d));
      $$0.a("facing", this.e.d());
      $$0.a("progress", this.j);
      $$0.a("extending", this.f);
      $$0.a("source", this.g);
   }

   public fab a(dea $$0, jg $$1) {
      fab $$2;
      if (!this.f && this.g && this.d.b() instanceof duw) {
         $$2 = this.d.b(duw.c, Boolean.valueOf(true)).g($$0, $$1);
      } else {
         $$2 = ezy.a();
      }

      jl $$4 = h.get();
      if ((double)this.i < 1.0 && $$4 == this.f()) {
         return $$2;
      } else {
         dvd $$5;
         if (this.d()) {
            $$5 = dia.bz.m().b(dux.a, this.e).b(dux.d, Boolean.valueOf(this.f != 1.0F - this.i < 0.25F));
         } else {
            $$5 = this.d;
         }

         float $$7 = this.e(this.i);
         double $$8 = (double)((float)this.e.j() * $$7);
         double $$9 = (double)((float)this.e.k() * $$7);
         double $$10 = (double)((float)this.e.l() * $$7);
         return ezy.a($$2, $$5.g($$0, $$1).a($$8, $$9, $$10));
      }
   }

   public long u() {
      return this.k;
   }

   @Override
   public void a(dev $$0) {
      super.a($$0);
      if ($$0.a(ly.f).a(this.d.b().p().h()).isEmpty()) {
         this.d = dia.a.m();
      }
   }
}
