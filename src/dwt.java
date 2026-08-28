import java.util.Iterator;
import java.util.List;

public class dwt extends dtz {
   private static final int b = 2;
   private static final double c = 0.01;
   public static final double a = 0.51;
   private dwx d = djo.a.m();
   private jn e;
   private boolean f;
   private boolean g;
   private static final ThreadLocal<jn> h = ThreadLocal.withInitial(() -> null);
   private float i;
   private float j;
   private long k;
   private int l;

   public dwt(ji $$0, dwx $$1) {
      super(dub.l, $$0, $$1);
   }

   public dwt(ji $$0, dwx $$1, dwx $$2, jn $$3, boolean $$4, boolean $$5) {
      this($$0, $$1);
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   @Override
   public tq a(jt.a $$0) {
      return this.e($$0);
   }

   public boolean b() {
      return this.f;
   }

   public jn c() {
      return this.e;
   }

   public boolean d() {
      return this.g;
   }

   public float a(float $$0) {
      if ($$0 > 1.0F) {
         $$0 = 1.0F;
      }

      return ayz.h($$0, this.j, this.i);
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

   private dwx u() {
      return !this.b() && this.d() && this.d.b() instanceof dwq
         ? djo.bG.m().b(dwr.d, Boolean.valueOf(this.i > 0.25F)).b(dwr.c, this.d.a(djo.by) ? dxy.b : dxy.a).b(dwr.a, this.d.c(dwq.a))
         : this.d;
   }

   private static void a(dgi $$0, ji $$1, float $$2, dwt $$3) {
      jn $$4 = $$3.f();
      double $$5 = (double)($$2 - $$3.i);
      fbu $$6 = $$3.u().g($$0, $$1);
      if (!$$6.c()) {
         fav $$7 = a($$1, $$6.a(), $$3);
         List<buk> $$8 = $$0.a_(null, dws.a($$7, $$4, $$5).b($$7));
         if (!$$8.isEmpty()) {
            List<fav> $$9 = $$6.e();
            boolean $$10 = $$3.d.a(djo.it);
            Iterator var12 = $$8.iterator();

            while (true) {
               buk $$11;
               while (true) {
                  if (!var12.hasNext()) {
                     return;
                  }

                  $$11 = (buk)var12.next();
                  if ($$11.n_() != ete.d) {
                     if (!$$10) {
                        break;
                     }

                     if (!($$11 instanceof ard)) {
                        fba $$12 = $$11.dz();
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

               for (fav $$17 : $$9) {
                  fav $$18 = dws.a(a($$1, $$17, $$3), $$4, $$5);
                  fav $$19 = $$11.cR();
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

   private static void a(jn $$0, buk $$1, double $$2, jn $$3) {
      h.set($$0);
      $$1.a(bvk.c, new fba($$2 * (double)$$3.j(), $$2 * (double)$$3.k(), $$2 * (double)$$3.l()));
      $$1.aK();
      h.set(null);
   }

   private static void b(dgi $$0, ji $$1, float $$2, dwt $$3) {
      if ($$3.v()) {
         jn $$4 = $$3.f();
         if ($$4.o().d()) {
            double $$5 = $$3.d.g($$0, $$1).c(jn.a.b);
            fav $$6 = a($$1, new fav(0.0, $$5, 0.0, 1.0, 1.5000010000000001, 1.0), $$3);
            double $$7 = (double)($$2 - $$3.i);

            for (buk $$9 : $$0.a((buk)null, $$6, $$2x -> a($$6, $$2x, $$1))) {
               a($$4, $$9, $$7, $$4);
            }
         }
      }
   }

   private static boolean a(fav $$0, buk $$1, ji $$2) {
      return $$1.n_() == ete.a && $$1.aJ() && ($$1.d($$2) || $$1.dB() >= $$0.a && $$1.dB() <= $$0.d && $$1.dH() >= $$0.c && $$1.dH() <= $$0.f);
   }

   private boolean v() {
      return this.d.a(djo.pI);
   }

   public jn f() {
      return this.f ? this.e : this.e.g();
   }

   private static double a(fav $$0, jn $$1, fav $$2) {
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

   private static fav a(ji $$0, fav $$1, dwt $$2) {
      double $$3 = (double)$$2.e($$2.i);
      return $$1.d((double)$$0.u() + $$3 * (double)$$2.e.j(), (double)$$0.v() + $$3 * (double)$$2.e.k(), (double)$$0.w() + $$3 * (double)$$2.e.l());
   }

   private static void a(ji $$0, buk $$1, jn $$2, double $$3) {
      fav $$4 = $$1.cR();
      fav $$5 = fbr.b().a().a($$0);
      if ($$4.c($$5)) {
         jn $$6 = $$2.g();
         double $$7 = a($$5, $$6, $$4) + 0.01;
         double $$8 = a($$5, $$6, $$4.a($$5)) + 0.01;
         if (Math.abs($$7 - $$8) < 0.01) {
            $$7 = Math.min($$7, $$3) + 0.01;
            a($$2, $$1, $$7, $$6);
         }
      }
   }

   public dwx j() {
      return this.d;
   }

   public void k() {
      if (this.o != null && (this.j < 1.0F || this.o.C)) {
         this.i = 1.0F;
         this.j = this.i;
         this.o.o(this.p);
         this.av_();
         if (this.o.a_(this.p).a(djo.bX)) {
            dwx $$0;
            if (this.g) {
               $$0 = djo.a.m();
            } else {
               $$0 = djm.b(this.d, this.o, this.p);
            }

            this.o.a(this.p, $$0, 3);
            this.o.b(this.p, $$0.b(), eud.a(this.o, this.s(), null));
         }
      }
   }

   public jn s() {
      return this.f ? this.e : this.e.g();
   }

   public static void a(dgi $$0, ji $$1, dwx $$2, dwt $$3) {
      $$3.k = $$0.ad();
      $$3.j = $$3.i;
      if ($$3.j >= 1.0F) {
         if ($$0.C && $$3.l < 5) {
            $$3.l++;
         } else {
            $$0.o($$1);
            $$3.av_();
            if ($$0.a_($$1).a(djo.bX)) {
               dwx $$4 = djm.b($$3.d, $$0, $$1);
               if ($$4.l()) {
                  $$0.a($$1, $$3.d, 84);
                  djm.a($$3.d, $$4, $$0, $$1, 3);
               } else {
                  if ($$4.b(dxn.J) && $$4.c(dxn.J)) {
                     $$4 = $$4.b(dxn.J, Boolean.valueOf(false));
                  }

                  $$0.a($$1, $$4, 67);
                  $$0.b($$1, $$4.b(), eud.a($$0, $$3.s(), null));
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
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      js<djm> $$2 = (js<djm>)(this.o != null ? this.o.a(mc.f) : mb.e);
      this.d = uf.a($$2, $$0.p("blockState"));
      this.e = jn.a($$0.h("facing"));
      this.i = $$0.j("progress");
      this.j = this.i;
      this.f = $$0.q("extending");
      this.g = $$0.q("source");
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      $$0.a("blockState", uf.a(this.d));
      $$0.a("facing", this.e.d());
      $$0.a("progress", this.j);
      $$0.a("extending", this.f);
      $$0.a("source", this.g);
   }

   public fbu a(dfn $$0, ji $$1) {
      fbu $$2;
      if (!this.f && this.g && this.d.b() instanceof dwq) {
         $$2 = this.d.b(dwq.c, Boolean.valueOf(true)).g($$0, $$1);
      } else {
         $$2 = fbr.a();
      }

      jn $$4 = h.get();
      if ((double)this.i < 1.0 && $$4 == this.f()) {
         return $$2;
      } else {
         dwx $$5;
         if (this.d()) {
            $$5 = djo.bG.m().b(dwr.a, this.e).b(dwr.d, Boolean.valueOf(this.f != 1.0F - this.i < 0.25F));
         } else {
            $$5 = this.d;
         }

         float $$7 = this.e(this.i);
         double $$8 = (double)((float)this.e.j() * $$7);
         double $$9 = (double)((float)this.e.k() * $$7);
         double $$10 = (double)((float)this.e.l() * $$7);
         return fbr.a($$2, $$5.g($$0, $$1).a($$8, $$9, $$10));
      }
   }

   public long t() {
      return this.k;
   }

   @Override
   public void a(dgi $$0) {
      super.a($$0);
      if ($$0.a(mc.f).a(this.d.b().p().h()).isEmpty()) {
         this.d = djo.a.m();
      }
   }
}
