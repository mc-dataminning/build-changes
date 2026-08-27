import java.util.Iterator;
import java.util.List;

public class dpe extends dmo {
   private static final int b = 2;
   private static final double c = 0.01;
   public static final double a = 0.51;
   private dpi d = dcj.a.n();
   private ij e;
   private boolean f;
   private boolean g;
   private static final ThreadLocal<ij> h = ThreadLocal.withInitial(() -> null);
   private float i;
   private float j;
   private long k;
   private int l;

   public dpe(id $$0, dpi $$1) {
      super(dmq.k, $$0, $$1);
   }

   public dpe(id $$0, dpi $$1, dpi $$2, ij $$3, boolean $$4, boolean $$5) {
      this($$0, $$1);
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   @Override
   public to a(ip.a $$0) {
      return this.d($$0);
   }

   public boolean b() {
      return this.f;
   }

   public ij c() {
      return this.e;
   }

   public boolean d() {
      return this.g;
   }

   public float a(float $$0) {
      if ($$0 > 1.0F) {
         $$0 = 1.0F;
      }

      return axm.i($$0, this.j, this.i);
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

   private dpi t() {
      return !this.b() && this.d() && this.d.b() instanceof dpb
         ? dcj.bz.n().a(dpc.d, Boolean.valueOf(this.i > 0.25F)).a(dpc.c, this.d.a(dcj.br) ? dqk.b : dqk.a).a(dpc.a, this.d.c(dpb.a))
         : this.d;
   }

   private static void a(czg $$0, id $$1, float $$2, dpe $$3) {
      ij $$4 = $$3.f();
      double $$5 = (double)($$2 - $$3.i);
      etc $$6 = $$3.t().k($$0, $$1);
      if (!$$6.c()) {
         ese $$7 = a($$1, $$6.a(), $$3);
         List<bqa> $$8 = $$0.a_(null, dpd.a($$7, $$4, $$5).b($$7));
         if (!$$8.isEmpty()) {
            List<ese> $$9 = $$6.e();
            boolean $$10 = $$3.d.a(dcj.hV);
            Iterator var12 = $$8.iterator();

            while (true) {
               bqa $$11;
               while (true) {
                  if (!var12.hasNext()) {
                     return;
                  }

                  $$11 = (bqa)var12.next();
                  if ($$11.k_() != elg.d) {
                     if (!$$10) {
                        break;
                     }

                     if (!($$11 instanceof apv)) {
                        esj $$12 = $$11.dp();
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

               for (ese $$17 : $$9) {
                  ese $$18 = dpd.a(a($$1, $$17, $$3), $$4, $$5);
                  ese $$19 = $$11.cH();
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

   private static void a(ij $$0, bqa $$1, double $$2, ij $$3) {
      h.set($$0);
      $$1.a(bqy.c, new esj($$2 * (double)$$3.j(), $$2 * (double)$$3.k(), $$2 * (double)$$3.l()));
      h.set(null);
   }

   private static void b(czg $$0, id $$1, float $$2, dpe $$3) {
      if ($$3.u()) {
         ij $$4 = $$3.f();
         if ($$4.o().d()) {
            double $$5 = $$3.d.k($$0, $$1).c(ij.a.b);
            ese $$6 = a($$1, new ese(0.0, $$5, 0.0, 1.0, 1.5000010000000001, 1.0), $$3);
            double $$7 = (double)($$2 - $$3.i);

            for (bqa $$9 : $$0.a((bqa)null, $$6, $$2x -> a($$6, $$2x, $$1))) {
               a($$4, $$9, $$7, $$4);
            }
         }
      }
   }

   private static boolean a(ese $$0, bqa $$1, id $$2) {
      return $$1.k_() == elg.a && $$1.aC() && ($$1.d($$2) || $$1.dr() >= $$0.a && $$1.dr() <= $$0.d && $$1.dx() >= $$0.c && $$1.dx() <= $$0.f);
   }

   private boolean u() {
      return this.d.a(dcj.pg);
   }

   public ij f() {
      return this.f ? this.e : this.e.g();
   }

   private static double a(ese $$0, ij $$1, ese $$2) {
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

   private static ese a(id $$0, ese $$1, dpe $$2) {
      double $$3 = (double)$$2.e($$2.i);
      return $$1.d((double)$$0.u() + $$3 * (double)$$2.e.j(), (double)$$0.v() + $$3 * (double)$$2.e.k(), (double)$$0.w() + $$3 * (double)$$2.e.l());
   }

   private static void a(id $$0, bqa $$1, ij $$2, double $$3) {
      ese $$4 = $$1.cH();
      ese $$5 = esz.b().a().a($$0);
      if ($$4.c($$5)) {
         ij $$6 = $$2.g();
         double $$7 = a($$5, $$6, $$4) + 0.01;
         double $$8 = a($$5, $$6, $$4.a($$5)) + 0.01;
         if (Math.abs($$7 - $$8) < 0.01) {
            $$7 = Math.min($$7, $$3) + 0.01;
            a($$2, $$1, $$7, $$6);
         }
      }
   }

   public dpi j() {
      return this.d;
   }

   public void k() {
      if (this.o != null && (this.j < 1.0F || this.o.B)) {
         this.i = 1.0F;
         this.j = this.i;
         this.o.o(this.p);
         this.aw_();
         if (this.o.a_(this.p).a(dcj.bQ)) {
            dpi $$0;
            if (this.g) {
               $$0 = dcj.a.n();
            } else {
               $$0 = dch.b(this.d, this.o, this.p);
            }

            this.o.a(this.p, $$0, 3);
            this.o.a(this.p, $$0.b(), this.p);
         }
      }
   }

   public static void a(czg $$0, id $$1, dpi $$2, dpe $$3) {
      $$3.k = $$0.Y();
      $$3.j = $$3.i;
      if ($$3.j >= 1.0F) {
         if ($$0.B && $$3.l < 5) {
            $$3.l++;
         } else {
            $$0.o($$1);
            $$3.aw_();
            if ($$0.a_($$1).a(dcj.bQ)) {
               dpi $$4 = dch.b($$3.d, $$0, $$1);
               if ($$4.i()) {
                  $$0.a($$1, $$3.d, 84);
                  dch.a($$3.d, $$4, $$0, $$1, 3);
               } else {
                  if ($$4.b(dpy.C) && $$4.c(dpy.C)) {
                     $$4 = $$4.a(dpy.C, Boolean.valueOf(false));
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
   public void a(to $$0, ip.a $$1) {
      super.a($$0, $$1);
      io<dch> $$2 = (io<dch>)(this.o != null ? this.o.a(ku.f) : kt.e.p());
      this.d = ud.a($$2, $$0.p("blockState"));
      this.e = ij.a($$0.h("facing"));
      this.i = $$0.j("progress");
      this.j = this.i;
      this.f = $$0.q("extending");
      this.g = $$0.q("source");
   }

   @Override
   protected void b(to $$0, ip.a $$1) {
      super.b($$0, $$1);
      $$0.a("blockState", ud.a(this.d));
      $$0.a("facing", this.e.d());
      $$0.a("progress", this.j);
      $$0.a("extending", this.f);
      $$0.a("source", this.g);
   }

   public etc a(cym $$0, id $$1) {
      etc $$2;
      if (!this.f && this.g && this.d.b() instanceof dpb) {
         $$2 = this.d.a(dpb.c, Boolean.valueOf(true)).k($$0, $$1);
      } else {
         $$2 = esz.a();
      }

      ij $$4 = h.get();
      if ((double)this.i < 1.0 && $$4 == this.f()) {
         return $$2;
      } else {
         dpi $$5;
         if (this.d()) {
            $$5 = dcj.bz.n().a(dpc.a, this.e).a(dpc.d, Boolean.valueOf(this.f != 1.0F - this.i < 0.25F));
         } else {
            $$5 = this.d;
         }

         float $$7 = this.e(this.i);
         double $$8 = (double)((float)this.e.j() * $$7);
         double $$9 = (double)((float)this.e.k() * $$7);
         double $$10 = (double)((float)this.e.l() * $$7);
         return esz.a($$2, $$5.k($$0, $$1).a($$8, $$9, $$10));
      }
   }

   public long l() {
      return this.k;
   }

   @Override
   public void a(czg $$0) {
      super.a($$0);
      if ($$0.a(ku.f).a(this.d.b().r().h()).isEmpty()) {
         this.d = dcj.a.n();
      }
   }
}
