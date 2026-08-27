import java.util.Iterator;
import java.util.List;

public class dil extends dgd {
   private static final int b = 2;
   private static final double c = 0.01;
   public static final double a = 0.51;
   private dip d = cwb.a.o();
   private ia e;
   private boolean f;
   private boolean g;
   private static final ThreadLocal<ia> h = ThreadLocal.withInitial(() -> null);
   private float i;
   private float j;
   private long k;
   private int l;

   public dil(hv $$0, dip $$1) {
      super(dgf.k, $$0, $$1);
   }

   public dil(hv $$0, dip $$1, dip $$2, ia $$3, boolean $$4, boolean $$5) {
      this($$0, $$1);
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   @Override
   public sj ax_() {
      return this.q();
   }

   public boolean c() {
      return this.f;
   }

   public ia d() {
      return this.e;
   }

   public boolean f() {
      return this.g;
   }

   public float a(float $$0) {
      if ($$0 > 1.0F) {
         $$0 = 1.0F;
      }

      return aty.i($$0, this.j, this.i);
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

   private dip w() {
      return !this.c() && this.f() && this.d.b() instanceof dii
         ? cwb.bz.o().a(dij.d, Boolean.valueOf(this.i > 0.25F)).a(dij.c, this.d.a(cwb.br) ? djr.b : djr.a).a(dij.a, this.d.c(dii.a))
         : this.d;
   }

   private static void a(csy $$0, hv $$1, float $$2, dil $$3) {
      ia $$4 = $$3.g();
      double $$5 = (double)($$2 - $$3.i);
      elu $$6 = $$3.w().k($$0, $$1);
      if (!$$6.c()) {
         ekw $$7 = a($$1, $$6.a(), $$3);
         List<blf> $$8 = $$0.a_(null, dik.a($$7, $$4, $$5).b($$7));
         if (!$$8.isEmpty()) {
            List<ekw> $$9 = $$6.e();
            boolean $$10 = $$3.d.a(cwb.hV);
            Iterator var12 = $$8.iterator();

            while (true) {
               blf $$11;
               while (true) {
                  if (!var12.hasNext()) {
                     return;
                  }

                  $$11 = (blf)var12.next();
                  if ($$11.s_() != eee.d) {
                     if (!$$10) {
                        break;
                     }

                     if (!($$11 instanceof amq)) {
                        elb $$12 = $$11.dp();
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

               for (ekw $$17 : $$9) {
                  ekw $$18 = dik.a(a($$1, $$17, $$3), $$4, $$5);
                  ekw $$19 = $$11.cH();
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

   private static void a(ia $$0, blf $$1, double $$2, ia $$3) {
      h.set($$0);
      $$1.a(bmb.c, new elb($$2 * (double)$$3.j(), $$2 * (double)$$3.k(), $$2 * (double)$$3.l()));
      h.set(null);
   }

   private static void b(csy $$0, hv $$1, float $$2, dil $$3) {
      if ($$3.x()) {
         ia $$4 = $$3.g();
         if ($$4.o().d()) {
            double $$5 = $$3.d.k($$0, $$1).c(ia.a.b);
            ekw $$6 = a($$1, new ekw(0.0, $$5, 0.0, 1.0, 1.5000010000000001, 1.0), $$3);
            double $$7 = (double)($$2 - $$3.i);

            for (blf $$9 : $$0.a((blf)null, $$6, $$2x -> a($$6, $$2x, $$1))) {
               a($$4, $$9, $$7, $$4);
            }
         }
      }
   }

   private static boolean a(ekw $$0, blf $$1, hv $$2) {
      return $$1.s_() == eee.a && $$1.aC() && ($$1.d($$2) || $$1.dr() >= $$0.a && $$1.dr() <= $$0.d && $$1.dx() >= $$0.c && $$1.dx() <= $$0.f);
   }

   private boolean x() {
      return this.d.a(cwb.pg);
   }

   public ia g() {
      return this.f ? this.e : this.e.g();
   }

   private static double a(ekw $$0, ia $$1, ekw $$2) {
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

   private static ekw a(hv $$0, ekw $$1, dil $$2) {
      double $$3 = (double)$$2.e($$2.i);
      return $$1.d((double)$$0.u() + $$3 * (double)$$2.e.j(), (double)$$0.v() + $$3 * (double)$$2.e.k(), (double)$$0.w() + $$3 * (double)$$2.e.l());
   }

   private static void a(hv $$0, blf $$1, ia $$2, double $$3) {
      ekw $$4 = $$1.cH();
      ekw $$5 = elr.b().a().a($$0);
      if ($$4.c($$5)) {
         ia $$6 = $$2.g();
         double $$7 = a($$5, $$6, $$4) + 0.01;
         double $$8 = a($$5, $$6, $$4.a($$5)) + 0.01;
         if (Math.abs($$7 - $$8) < 0.01) {
            $$7 = Math.min($$7, $$3) + 0.01;
            a($$2, $$1, $$7, $$6);
         }
      }
   }

   public dip k() {
      return this.d;
   }

   public void l() {
      if (this.o != null && (this.j < 1.0F || this.o.B)) {
         this.i = 1.0F;
         this.j = this.i;
         this.o.n(this.p);
         this.ay_();
         if (this.o.a_(this.p).a(cwb.bQ)) {
            dip $$0;
            if (this.g) {
               $$0 = cwb.a.o();
            } else {
               $$0 = cvz.b(this.d, this.o, this.p);
            }

            this.o.a(this.p, $$0, 3);
            this.o.a(this.p, $$0.b(), this.p);
         }
      }
   }

   public static void a(csy $$0, hv $$1, dip $$2, dil $$3) {
      $$3.k = $$0.W();
      $$3.j = $$3.i;
      if ($$3.j >= 1.0F) {
         if ($$0.B && $$3.l < 5) {
            $$3.l++;
         } else {
            $$0.n($$1);
            $$3.ay_();
            if ($$0.a_($$1).a(cwb.bQ)) {
               dip $$4 = cvz.b($$3.d, $$0, $$1);
               if ($$4.i()) {
                  $$0.a($$1, $$3.d, 84);
                  cvz.a($$3.d, $$4, $$0, $$1, 3);
               } else {
                  if ($$4.b(djf.C) && $$4.c(djf.C)) {
                     $$4 = $$4.a(djf.C, Boolean.valueOf(false));
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
   public void a(sj $$0) {
      super.a($$0);
      ig<cvz> $$1 = (ig<cvz>)(this.o != null ? this.o.a(kc.f) : kb.e.p());
      this.d = sy.a($$1, $$0.p("blockState"));
      this.e = ia.a($$0.h("facing"));
      this.i = $$0.j("progress");
      this.j = this.i;
      this.f = $$0.q("extending");
      this.g = $$0.q("source");
   }

   @Override
   protected void b(sj $$0) {
      super.b($$0);
      $$0.a("blockState", sy.a(this.d));
      $$0.a("facing", this.e.d());
      $$0.a("progress", this.j);
      $$0.a("extending", this.f);
      $$0.a("source", this.g);
   }

   public elu a(cse $$0, hv $$1) {
      elu $$2;
      if (!this.f && this.g && this.d.b() instanceof dii) {
         $$2 = this.d.a(dii.c, Boolean.valueOf(true)).k($$0, $$1);
      } else {
         $$2 = elr.a();
      }

      ia $$4 = h.get();
      if ((double)this.i < 1.0 && $$4 == this.g()) {
         return $$2;
      } else {
         dip $$5;
         if (this.f()) {
            $$5 = cwb.bz.o().a(dij.a, this.e).a(dij.d, Boolean.valueOf(this.f != 1.0F - this.i < 0.25F));
         } else {
            $$5 = this.d;
         }

         float $$7 = this.e(this.i);
         double $$8 = (double)((float)this.e.j() * $$7);
         double $$9 = (double)((float)this.e.k() * $$7);
         double $$10 = (double)((float)this.e.l() * $$7);
         return elr.a($$2, $$5.k($$0, $$1).a($$8, $$9, $$10));
      }
   }

   public long m() {
      return this.k;
   }

   @Override
   public void a(csy $$0) {
      super.a($$0);
      if ($$0.a(kc.f).a(this.d.b().r().g()).isEmpty()) {
         this.d = cwb.a.o();
      }
   }
}
