import java.util.Iterator;
import java.util.List;

public class dhe extends dfd {
   private static final int b = 2;
   private static final double c = 0.01;
   public static final double a = 0.51;
   private dhi d = cvc.a.o();
   private hx e;
   private boolean f;
   private boolean g;
   private static final ThreadLocal<hx> h = ThreadLocal.withInitial(() -> null);
   private float i;
   private float j;
   private long k;
   private int l;

   public dhe(ht $$0, dhi $$1) {
      super(dff.k, $$0, $$1);
   }

   public dhe(ht $$0, dhi $$1, dhi $$2, hx $$3, boolean $$4, boolean $$5) {
      this($$0, $$1);
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   @Override
   public rz aw_() {
      return this.o();
   }

   public boolean c() {
      return this.f;
   }

   public hx d() {
      return this.e;
   }

   public boolean f() {
      return this.g;
   }

   public float a(float $$0) {
      if ($$0 > 1.0F) {
         $$0 = 1.0F;
      }

      return atm.i($$0, this.j, this.i);
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

   private dhi w() {
      return !this.c() && this.f() && this.d.b() instanceof dhb
         ? cvc.bz.o().a(dhc.d, Boolean.valueOf(this.i > 0.25F)).a(dhc.c, this.d.a(cvc.br) ? dik.b : dik.a).a(dhc.a, this.d.c(dhb.a))
         : this.d;
   }

   private static void a(csa $$0, ht $$1, float $$2, dhe $$3) {
      hx $$4 = $$3.g();
      double $$5 = (double)($$2 - $$3.i);
      ekn $$6 = $$3.w().k($$0, $$1);
      if (!$$6.c()) {
         ejp $$7 = a($$1, $$6.a(), $$3);
         List<bkq> $$8 = $$0.a_(null, dhd.a($$7, $$4, $$5).b($$7));
         if (!$$8.isEmpty()) {
            List<ejp> $$9 = $$6.e();
            boolean $$10 = $$3.d.a(cvc.hV);
            Iterator var12 = $$8.iterator();

            while (true) {
               bkq $$11;
               while (true) {
                  if (!var12.hasNext()) {
                     return;
                  }

                  $$11 = (bkq)var12.next();
                  if ($$11.r_() != ecx.d) {
                     if (!$$10) {
                        break;
                     }

                     if (!($$11 instanceof amf)) {
                        eju $$12 = $$11.dq();
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

               for (ejp $$17 : $$9) {
                  ejp $$18 = dhd.a(a($$1, $$17, $$3), $$4, $$5);
                  ejp $$19 = $$11.cH();
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

   private static void a(hx $$0, bkq $$1, double $$2, hx $$3) {
      h.set($$0);
      $$1.a(blm.c, new eju($$2 * (double)$$3.j(), $$2 * (double)$$3.k(), $$2 * (double)$$3.l()));
      h.set(null);
   }

   private static void b(csa $$0, ht $$1, float $$2, dhe $$3) {
      if ($$3.x()) {
         hx $$4 = $$3.g();
         if ($$4.o().d()) {
            double $$5 = $$3.d.k($$0, $$1).c(hx.a.b);
            ejp $$6 = a($$1, new ejp(0.0, $$5, 0.0, 1.0, 1.5000010000000001, 1.0), $$3);
            double $$7 = (double)($$2 - $$3.i);

            for (bkq $$9 : $$0.a((bkq)null, $$6, $$2x -> a($$6, $$2x, $$1))) {
               a($$4, $$9, $$7, $$4);
            }
         }
      }
   }

   private static boolean a(ejp $$0, bkq $$1, ht $$2) {
      return $$1.r_() == ecx.a && $$1.aC() && ($$1.d($$2) || $$1.ds() >= $$0.a && $$1.ds() <= $$0.d && $$1.dy() >= $$0.c && $$1.dy() <= $$0.f);
   }

   private boolean x() {
      return this.d.a(cvc.pg);
   }

   public hx g() {
      return this.f ? this.e : this.e.g();
   }

   private static double a(ejp $$0, hx $$1, ejp $$2) {
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

   private static ejp a(ht $$0, ejp $$1, dhe $$2) {
      double $$3 = (double)$$2.e($$2.i);
      return $$1.d((double)$$0.u() + $$3 * (double)$$2.e.j(), (double)$$0.v() + $$3 * (double)$$2.e.k(), (double)$$0.w() + $$3 * (double)$$2.e.l());
   }

   private static void a(ht $$0, bkq $$1, hx $$2, double $$3) {
      ejp $$4 = $$1.cH();
      ejp $$5 = ekk.b().a().a($$0);
      if ($$4.c($$5)) {
         hx $$6 = $$2.g();
         double $$7 = a($$5, $$6, $$4) + 0.01;
         double $$8 = a($$5, $$6, $$4.a($$5)) + 0.01;
         if (Math.abs($$7 - $$8) < 0.01) {
            $$7 = Math.min($$7, $$3) + 0.01;
            a($$2, $$1, $$7, $$6);
         }
      }
   }

   public dhi i() {
      return this.d;
   }

   public void j() {
      if (this.o != null && (this.j < 1.0F || this.o.B)) {
         this.i = 1.0F;
         this.j = this.i;
         this.o.n(this.p);
         this.ax_();
         if (this.o.a_(this.p).a(cvc.bQ)) {
            dhi $$0;
            if (this.g) {
               $$0 = cvc.a.o();
            } else {
               $$0 = cva.b(this.d, this.o, this.p);
            }

            this.o.a(this.p, $$0, 3);
            this.o.a(this.p, $$0.b(), this.p);
         }
      }
   }

   public static void a(csa $$0, ht $$1, dhi $$2, dhe $$3) {
      $$3.k = $$0.W();
      $$3.j = $$3.i;
      if ($$3.j >= 1.0F) {
         if ($$0.B && $$3.l < 5) {
            $$3.l++;
         } else {
            $$0.n($$1);
            $$3.ax_();
            if ($$0.a_($$1).a(cvc.bQ)) {
               dhi $$4 = cva.b($$3.d, $$0, $$1);
               if ($$4.i()) {
                  $$0.a($$1, $$3.d, 84);
                  cva.a($$3.d, $$4, $$0, $$1, 3);
               } else {
                  if ($$4.b(dhy.C) && $$4.c(dhy.C)) {
                     $$4 = $$4.a(dhy.C, Boolean.valueOf(false));
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
   public void a(rz $$0) {
      super.a($$0);
      ic<cva> $$1 = (ic<cva>)(this.o != null ? this.o.a(jz.e) : jy.f.p());
      this.d = so.a($$1, $$0.p("blockState"));
      this.e = hx.a($$0.h("facing"));
      this.i = $$0.j("progress");
      this.j = this.i;
      this.f = $$0.q("extending");
      this.g = $$0.q("source");
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      $$0.a("blockState", so.a(this.d));
      $$0.a("facing", this.e.d());
      $$0.a("progress", this.j);
      $$0.a("extending", this.f);
      $$0.a("source", this.g);
   }

   public ekn a(crg $$0, ht $$1) {
      ekn $$2;
      if (!this.f && this.g && this.d.b() instanceof dhb) {
         $$2 = this.d.a(dhb.c, Boolean.valueOf(true)).k($$0, $$1);
      } else {
         $$2 = ekk.a();
      }

      hx $$4 = h.get();
      if ((double)this.i < 1.0 && $$4 == this.g()) {
         return $$2;
      } else {
         dhi $$5;
         if (this.f()) {
            $$5 = cvc.bz.o().a(dhc.a, this.e).a(dhc.d, Boolean.valueOf(this.f != 1.0F - this.i < 0.25F));
         } else {
            $$5 = this.d;
         }

         float $$7 = this.e(this.i);
         double $$8 = (double)((float)this.e.j() * $$7);
         double $$9 = (double)((float)this.e.k() * $$7);
         double $$10 = (double)((float)this.e.l() * $$7);
         return ekk.a($$2, $$5.k($$0, $$1).a($$8, $$9, $$10));
      }
   }

   public long v() {
      return this.k;
   }

   @Override
   public void a(csa $$0) {
      super.a($$0);
      if ($$0.a(jz.e).a(this.d.b().r().g()).isEmpty()) {
         this.d = cvc.a.o();
      }
   }
}
