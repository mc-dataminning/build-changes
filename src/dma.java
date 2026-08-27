import java.util.Iterator;
import java.util.List;

public class dma extends djl {
   private static final int b = 2;
   private static final double c = 0.01;
   public static final double a = 0.51;
   private dme d = czh.a.o();
   private ih e;
   private boolean f;
   private boolean g;
   private static final ThreadLocal<ih> h = ThreadLocal.withInitial(() -> null);
   private float i;
   private float j;
   private long k;
   private int l;

   public dma(ib $$0, dme $$1) {
      super(djn.k, $$0, $$1);
   }

   public dma(ib $$0, dme $$1, dme $$2, ih $$3, boolean $$4, boolean $$5) {
      this($$0, $$1);
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   @Override
   public sy a(in.a $$0) {
      return this.d($$0);
   }

   public boolean b() {
      return this.f;
   }

   public ih c() {
      return this.e;
   }

   public boolean d() {
      return this.g;
   }

   public float a(float $$0) {
      if ($$0 > 1.0F) {
         $$0 = 1.0F;
      }

      return awm.i($$0, this.j, this.i);
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

   private dme s() {
      return !this.b() && this.d() && this.d.b() instanceof dlx
         ? czh.bz.o().a(dly.d, Boolean.valueOf(this.i > 0.25F)).a(dly.c, this.d.a(czh.br) ? dng.b : dng.a).a(dly.a, this.d.c(dlx.a))
         : this.d;
   }

   private static void a(cwe $$0, ib $$1, float $$2, dma $$3) {
      ih $$4 = $$3.f();
      double $$5 = (double)($$2 - $$3.i);
      epo $$6 = $$3.s().k($$0, $$1);
      if (!$$6.c()) {
         eoq $$7 = a($$1, $$6.a(), $$3);
         List<bof> $$8 = $$0.a_(null, dlz.a($$7, $$4, $$5).b($$7));
         if (!$$8.isEmpty()) {
            List<eoq> $$9 = $$6.e();
            boolean $$10 = $$3.d.a(czh.hV);
            Iterator var12 = $$8.iterator();

            while (true) {
               bof $$11;
               while (true) {
                  if (!var12.hasNext()) {
                     return;
                  }

                  $$11 = (bof)var12.next();
                  if ($$11.s_() != ehw.d) {
                     if (!$$10) {
                        break;
                     }

                     if (!($$11 instanceof apb)) {
                        eov $$12 = $$11.dm();
                        double $$13 = $$12.c;
                        double $$14 = $$12.d;
                        double $$15 = $$12.e;
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

                        $$11.o($$13, $$14, $$15);
                        break;
                     }
                  }
               }

               double $$16 = 0.0;

               for (eoq $$17 : $$9) {
                  eoq $$18 = dlz.a(a($$1, $$17, $$3), $$4, $$5);
                  eoq $$19 = $$11.cE();
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

   private static void a(ih $$0, bof $$1, double $$2, ih $$3) {
      h.set($$0);
      $$1.a(bpc.c, new eov($$2 * (double)$$3.j(), $$2 * (double)$$3.k(), $$2 * (double)$$3.l()));
      h.set(null);
   }

   private static void b(cwe $$0, ib $$1, float $$2, dma $$3) {
      if ($$3.t()) {
         ih $$4 = $$3.f();
         if ($$4.o().d()) {
            double $$5 = $$3.d.k($$0, $$1).c(ih.a.b);
            eoq $$6 = a($$1, new eoq(0.0, $$5, 0.0, 1.0, 1.5000010000000001, 1.0), $$3);
            double $$7 = (double)($$2 - $$3.i);

            for (bof $$9 : $$0.a((bof)null, $$6, $$2x -> a($$6, $$2x, $$1))) {
               a($$4, $$9, $$7, $$4);
            }
         }
      }
   }

   private static boolean a(eoq $$0, bof $$1, ib $$2) {
      return $$1.s_() == ehw.a && $$1.aC() && ($$1.d($$2) || $$1.do() >= $$0.a && $$1.do() <= $$0.d && $$1.du() >= $$0.c && $$1.du() <= $$0.f);
   }

   private boolean t() {
      return this.d.a(czh.pg);
   }

   public ih f() {
      return this.f ? this.e : this.e.g();
   }

   private static double a(eoq $$0, ih $$1, eoq $$2) {
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

   private static eoq a(ib $$0, eoq $$1, dma $$2) {
      double $$3 = (double)$$2.e($$2.i);
      return $$1.d((double)$$0.u() + $$3 * (double)$$2.e.j(), (double)$$0.v() + $$3 * (double)$$2.e.k(), (double)$$0.w() + $$3 * (double)$$2.e.l());
   }

   private static void a(ib $$0, bof $$1, ih $$2, double $$3) {
      eoq $$4 = $$1.cE();
      eoq $$5 = epl.b().a().a($$0);
      if ($$4.c($$5)) {
         ih $$6 = $$2.g();
         double $$7 = a($$5, $$6, $$4) + 0.01;
         double $$8 = a($$5, $$6, $$4.a($$5)) + 0.01;
         if (Math.abs($$7 - $$8) < 0.01) {
            $$7 = Math.min($$7, $$3) + 0.01;
            a($$2, $$1, $$7, $$6);
         }
      }
   }

   public dme j() {
      return this.d;
   }

   public void k() {
      if (this.o != null && (this.j < 1.0F || this.o.B)) {
         this.i = 1.0F;
         this.j = this.i;
         this.o.o(this.p);
         this.aA_();
         if (this.o.a_(this.p).a(czh.bQ)) {
            dme $$0;
            if (this.g) {
               $$0 = czh.a.o();
            } else {
               $$0 = czf.b(this.d, this.o, this.p);
            }

            this.o.a(this.p, $$0, 3);
            this.o.a(this.p, $$0.b(), this.p);
         }
      }
   }

   public static void a(cwe $$0, ib $$1, dme $$2, dma $$3) {
      $$3.k = $$0.X();
      $$3.j = $$3.i;
      if ($$3.j >= 1.0F) {
         if ($$0.B && $$3.l < 5) {
            $$3.l++;
         } else {
            $$0.o($$1);
            $$3.aA_();
            if ($$0.a_($$1).a(czh.bQ)) {
               dme $$4 = czf.b($$3.d, $$0, $$1);
               if ($$4.i()) {
                  $$0.a($$1, $$3.d, 84);
                  czf.a($$3.d, $$4, $$0, $$1, 3);
               } else {
                  if ($$4.b(dmu.C) && $$4.c(dmu.C)) {
                     $$4 = $$4.a(dmu.C, Boolean.valueOf(false));
                  }

                  $$0.a($$1, $$4, 67);
                  $$0.a($$1, $$4.b(), $$1);
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
   public void a(sy $$0, in.a $$1) {
      super.a($$0, $$1);
      im<czf> $$2 = (im<czf>)(this.o != null ? this.o.a(ki.f) : kh.e.p());
      this.d = tn.a($$2, $$0.p("blockState"));
      this.e = ih.a($$0.h("facing"));
      this.i = $$0.j("progress");
      this.j = this.i;
      this.f = $$0.q("extending");
      this.g = $$0.q("source");
   }

   @Override
   protected void b(sy $$0, in.a $$1) {
      super.b($$0, $$1);
      $$0.a("blockState", tn.a(this.d));
      $$0.a("facing", this.e.d());
      $$0.a("progress", this.j);
      $$0.a("extending", this.f);
      $$0.a("source", this.g);
   }

   public epo a(cvk $$0, ib $$1) {
      epo $$2;
      if (!this.f && this.g && this.d.b() instanceof dlx) {
         $$2 = this.d.a(dlx.c, Boolean.valueOf(true)).k($$0, $$1);
      } else {
         $$2 = epl.a();
      }

      ih $$4 = h.get();
      if ((double)this.i < 1.0 && $$4 == this.f()) {
         return $$2;
      } else {
         dme $$5;
         if (this.d()) {
            $$5 = czh.bz.o().a(dly.a, this.e).a(dly.d, Boolean.valueOf(this.f != 1.0F - this.i < 0.25F));
         } else {
            $$5 = this.d;
         }

         float $$7 = this.e(this.i);
         double $$8 = (double)((float)this.e.j() * $$7);
         double $$9 = (double)((float)this.e.k() * $$7);
         double $$10 = (double)((float)this.e.l() * $$7);
         return epl.a($$2, $$5.k($$0, $$1).a($$8, $$9, $$10));
      }
   }

   public long l() {
      return this.k;
   }

   @Override
   public void a(cwe $$0) {
      super.a($$0);
      if ($$0.a(ki.f).a(this.d.b().r().h()).isEmpty()) {
         this.d = czh.a.o();
      }
   }
}
