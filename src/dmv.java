import java.util.Iterator;
import java.util.List;

public class dmv extends dkg {
   private static final int b = 2;
   private static final double c = 0.01;
   public static final double a = 0.51;
   private dmz d = dac.a.o();
   private ih e;
   private boolean f;
   private boolean g;
   private static final ThreadLocal<ih> h = ThreadLocal.withInitial(() -> null);
   private float i;
   private float j;
   private long k;
   private int l;

   public dmv(ib $$0, dmz $$1) {
      super(dki.k, $$0, $$1);
   }

   public dmv(ib $$0, dmz $$1, dmz $$2, ih $$3, boolean $$4, boolean $$5) {
      this($$0, $$1);
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   @Override
   public ta a(in.a $$0) {
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

      return aww.i($$0, this.j, this.i);
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

   private dmz s() {
      return !this.b() && this.d() && this.d.b() instanceof dms
         ? dac.bz.o().a(dmt.d, Boolean.valueOf(this.i > 0.25F)).a(dmt.c, this.d.a(dac.br) ? dob.b : dob.a).a(dmt.a, this.d.c(dms.a))
         : this.d;
   }

   private static void a(cwz $$0, ib $$1, float $$2, dmv $$3) {
      ih $$4 = $$3.f();
      double $$5 = (double)($$2 - $$3.i);
      eqk $$6 = $$3.s().k($$0, $$1);
      if (!$$6.c()) {
         epm $$7 = a($$1, $$6.a(), $$3);
         List<bow> $$8 = $$0.a_(null, dmu.a($$7, $$4, $$5).b($$7));
         if (!$$8.isEmpty()) {
            List<epm> $$9 = $$6.e();
            boolean $$10 = $$3.d.a(dac.hV);
            Iterator var12 = $$8.iterator();

            while (true) {
               bow $$11;
               while (true) {
                  if (!var12.hasNext()) {
                     return;
                  }

                  $$11 = (bow)var12.next();
                  if ($$11.r_() != eis.d) {
                     if (!$$10) {
                        break;
                     }

                     if (!($$11 instanceof apg)) {
                        epr $$12 = $$11.dp();
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

               for (epm $$17 : $$9) {
                  epm $$18 = dmu.a(a($$1, $$17, $$3), $$4, $$5);
                  epm $$19 = $$11.cH();
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

   private static void a(ih $$0, bow $$1, double $$2, ih $$3) {
      h.set($$0);
      $$1.a(bpt.c, new epr($$2 * (double)$$3.j(), $$2 * (double)$$3.k(), $$2 * (double)$$3.l()));
      h.set(null);
   }

   private static void b(cwz $$0, ib $$1, float $$2, dmv $$3) {
      if ($$3.t()) {
         ih $$4 = $$3.f();
         if ($$4.o().d()) {
            double $$5 = $$3.d.k($$0, $$1).c(ih.a.b);
            epm $$6 = a($$1, new epm(0.0, $$5, 0.0, 1.0, 1.5000010000000001, 1.0), $$3);
            double $$7 = (double)($$2 - $$3.i);

            for (bow $$9 : $$0.a((bow)null, $$6, $$2x -> a($$6, $$2x, $$1))) {
               a($$4, $$9, $$7, $$4);
            }
         }
      }
   }

   private static boolean a(epm $$0, bow $$1, ib $$2) {
      return $$1.r_() == eis.a && $$1.aC() && ($$1.d($$2) || $$1.dr() >= $$0.a && $$1.dr() <= $$0.d && $$1.dx() >= $$0.c && $$1.dx() <= $$0.f);
   }

   private boolean t() {
      return this.d.a(dac.pg);
   }

   public ih f() {
      return this.f ? this.e : this.e.g();
   }

   private static double a(epm $$0, ih $$1, epm $$2) {
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

   private static epm a(ib $$0, epm $$1, dmv $$2) {
      double $$3 = (double)$$2.e($$2.i);
      return $$1.d((double)$$0.u() + $$3 * (double)$$2.e.j(), (double)$$0.v() + $$3 * (double)$$2.e.k(), (double)$$0.w() + $$3 * (double)$$2.e.l());
   }

   private static void a(ib $$0, bow $$1, ih $$2, double $$3) {
      epm $$4 = $$1.cH();
      epm $$5 = eqh.b().a().a($$0);
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

   public dmz j() {
      return this.d;
   }

   public void k() {
      if (this.o != null && (this.j < 1.0F || this.o.B)) {
         this.i = 1.0F;
         this.j = this.i;
         this.o.o(this.p);
         this.az_();
         if (this.o.a_(this.p).a(dac.bQ)) {
            dmz $$0;
            if (this.g) {
               $$0 = dac.a.o();
            } else {
               $$0 = daa.b(this.d, this.o, this.p);
            }

            this.o.a(this.p, $$0, 3);
            this.o.a(this.p, $$0.b(), this.p);
         }
      }
   }

   public static void a(cwz $$0, ib $$1, dmz $$2, dmv $$3) {
      $$3.k = $$0.X();
      $$3.j = $$3.i;
      if ($$3.j >= 1.0F) {
         if ($$0.B && $$3.l < 5) {
            $$3.l++;
         } else {
            $$0.o($$1);
            $$3.az_();
            if ($$0.a_($$1).a(dac.bQ)) {
               dmz $$4 = daa.b($$3.d, $$0, $$1);
               if ($$4.i()) {
                  $$0.a($$1, $$3.d, 84);
                  daa.a($$3.d, $$4, $$0, $$1, 3);
               } else {
                  if ($$4.b(dnp.C) && $$4.c(dnp.C)) {
                     $$4 = $$4.a(dnp.C, Boolean.valueOf(false));
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
   public void a(ta $$0, in.a $$1) {
      super.a($$0, $$1);
      im<daa> $$2 = (im<daa>)(this.o != null ? this.o.a(kj.f) : ki.e.p());
      this.d = tp.a($$2, $$0.p("blockState"));
      this.e = ih.a($$0.h("facing"));
      this.i = $$0.j("progress");
      this.j = this.i;
      this.f = $$0.q("extending");
      this.g = $$0.q("source");
   }

   @Override
   protected void b(ta $$0, in.a $$1) {
      super.b($$0, $$1);
      $$0.a("blockState", tp.a(this.d));
      $$0.a("facing", this.e.d());
      $$0.a("progress", this.j);
      $$0.a("extending", this.f);
      $$0.a("source", this.g);
   }

   public eqk a(cwf $$0, ib $$1) {
      eqk $$2;
      if (!this.f && this.g && this.d.b() instanceof dms) {
         $$2 = this.d.a(dms.c, Boolean.valueOf(true)).k($$0, $$1);
      } else {
         $$2 = eqh.a();
      }

      ih $$4 = h.get();
      if ((double)this.i < 1.0 && $$4 == this.f()) {
         return $$2;
      } else {
         dmz $$5;
         if (this.d()) {
            $$5 = dac.bz.o().a(dmt.a, this.e).a(dmt.d, Boolean.valueOf(this.f != 1.0F - this.i < 0.25F));
         } else {
            $$5 = this.d;
         }

         float $$7 = this.e(this.i);
         double $$8 = (double)((float)this.e.j() * $$7);
         double $$9 = (double)((float)this.e.k() * $$7);
         double $$10 = (double)((float)this.e.l() * $$7);
         return eqh.a($$2, $$5.k($$0, $$1).a($$8, $$9, $$10));
      }
   }

   public long l() {
      return this.k;
   }

   @Override
   public void a(cwz $$0) {
      super.a($$0);
      if ($$0.a(kj.f).a(this.d.b().r().h()).isEmpty()) {
         this.d = dac.a.o();
      }
   }
}
