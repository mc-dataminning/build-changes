import java.util.Iterator;
import java.util.List;

public class deu extends dck {
   private static final int b = 2;
   private static final double c = 0.01;
   public static final double a = 0.51;
   private dey d = csl.a.n();
   private hb e;
   private boolean f;
   private boolean g;
   private static final ThreadLocal<hb> h = ThreadLocal.withInitial(() -> null);
   private float i;
   private float j;
   private long k;
   private int l;

   public deu(gv $$0, dey $$1) {
      super(dcm.k, $$0, $$1);
   }

   public deu(gv $$0, dey $$1, dey $$2, hb $$3, boolean $$4, boolean $$5) {
      this($$0, $$1);
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   @Override
   public qs ao_() {
      return this.o();
   }

   public boolean c() {
      return this.f;
   }

   public hb d() {
      return this.e;
   }

   public boolean f() {
      return this.g;
   }

   public float a(float $$0) {
      if ($$0 > 1.0F) {
         $$0 = 1.0F;
      }

      return aro.i($$0, this.j, this.i);
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

   private dey w() {
      return !this.c() && this.f() && this.d.b() instanceof der
         ? csl.bz.n().a(des.c, Boolean.valueOf(this.i > 0.25F)).a(des.b, this.d.a(csl.br) ? dga.b : dga.a).a(des.a, this.d.c(der.a))
         : this.d;
   }

   private static void a(cpk $$0, gv $$1, float $$2, deu $$3) {
      hb $$4 = $$3.g();
      double $$5 = (double)($$2 - $$3.i);
      ehy $$6 = $$3.w().k($$0, $$1);
      if (!$$6.c()) {
         eha $$7 = a($$1, $$6.a(), $$3);
         List<big> $$8 = $$0.a_(null, det.a($$7, $$4, $$5).b($$7));
         if (!$$8.isEmpty()) {
            List<eha> $$9 = $$6.e();
            boolean $$10 = $$3.d.a(csl.hV);
            Iterator var12 = $$8.iterator();

            while (true) {
               big $$11;
               while (true) {
                  if (!var12.hasNext()) {
                     return;
                  }

                  $$11 = (big)var12.next();
                  if ($$11.l_() != eag.d) {
                     if (!$$10) {
                        break;
                     }

                     if (!($$11 instanceof akj)) {
                        ehf $$12 = $$11.dn();
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

               for (eha $$17 : $$9) {
                  eha $$18 = det.a(a($$1, $$17, $$3), $$4, $$5);
                  eha $$19 = $$11.cG();
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

   private static void a(hb $$0, big $$1, double $$2, hb $$3) {
      h.set($$0);
      $$1.a(bjc.c, new ehf($$2 * (double)$$3.j(), $$2 * (double)$$3.k(), $$2 * (double)$$3.l()));
      h.set(null);
   }

   private static void b(cpk $$0, gv $$1, float $$2, deu $$3) {
      if ($$3.x()) {
         hb $$4 = $$3.g();
         if ($$4.o().d()) {
            double $$5 = $$3.d.k($$0, $$1).c(hb.a.b);
            eha $$6 = a($$1, new eha(0.0, $$5, 0.0, 1.0, 1.5000010000000001, 1.0), $$3);
            double $$7 = (double)($$2 - $$3.i);

            for (big $$9 : $$0.a((big)null, $$6, $$2x -> a($$6, $$2x, $$1))) {
               a($$4, $$9, $$7, $$4);
            }
         }
      }
   }

   private static boolean a(eha $$0, big $$1, gv $$2) {
      return $$1.l_() == eag.a && $$1.aA() && ($$1.d($$2) || $$1.dp() >= $$0.a && $$1.dp() <= $$0.d && $$1.dv() >= $$0.c && $$1.dv() <= $$0.f);
   }

   private boolean x() {
      return this.d.a(csl.pg);
   }

   public hb g() {
      return this.f ? this.e : this.e.g();
   }

   private static double a(eha $$0, hb $$1, eha $$2) {
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

   private static eha a(gv $$0, eha $$1, deu $$2) {
      double $$3 = (double)$$2.e($$2.i);
      return $$1.d((double)$$0.u() + $$3 * (double)$$2.e.j(), (double)$$0.v() + $$3 * (double)$$2.e.k(), (double)$$0.w() + $$3 * (double)$$2.e.l());
   }

   private static void a(gv $$0, big $$1, hb $$2, double $$3) {
      eha $$4 = $$1.cG();
      eha $$5 = ehv.b().a().a($$0);
      if ($$4.c($$5)) {
         hb $$6 = $$2.g();
         double $$7 = a($$5, $$6, $$4) + 0.01;
         double $$8 = a($$5, $$6, $$4.a($$5)) + 0.01;
         if (Math.abs($$7 - $$8) < 0.01) {
            $$7 = Math.min($$7, $$3) + 0.01;
            a($$2, $$1, $$7, $$6);
         }
      }
   }

   public dey i() {
      return this.d;
   }

   public void j() {
      if (this.o != null && (this.j < 1.0F || this.o.B)) {
         this.i = 1.0F;
         this.j = this.i;
         this.o.n(this.p);
         this.ap_();
         if (this.o.a_(this.p).a(csl.bQ)) {
            dey $$0;
            if (this.g) {
               $$0 = csl.a.n();
            } else {
               $$0 = csk.b(this.d, this.o, this.p);
            }

            this.o.a(this.p, $$0, 3);
            this.o.a(this.p, $$0.b(), this.p);
         }
      }
   }

   public static void a(cpk $$0, gv $$1, dey $$2, deu $$3) {
      $$3.k = $$0.V();
      $$3.j = $$3.i;
      if ($$3.j >= 1.0F) {
         if ($$0.B && $$3.l < 5) {
            $$3.l++;
         } else {
            $$0.n($$1);
            $$3.ap_();
            if ($$0.a_($$1).a(csl.bQ)) {
               dey $$4 = csk.b($$3.d, $$0, $$1);
               if ($$4.i()) {
                  $$0.a($$1, $$3.d, 84);
                  csk.a($$3.d, $$4, $$0, $$1, 3);
               } else {
                  if ($$4.b(dfo.C) && $$4.c(dfo.C)) {
                     $$4 = $$4.a(dfo.C, Boolean.valueOf(false));
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
   public void a(qs $$0) {
      super.a($$0);
      hg<csk> $$1 = (hg<csk>)(this.o != null ? this.o.a(jd.e) : jc.f.p());
      this.d = re.a($$1, $$0.p("blockState"));
      this.e = hb.a($$0.h("facing"));
      this.i = $$0.j("progress");
      this.j = this.i;
      this.f = $$0.q("extending");
      this.g = $$0.q("source");
   }

   @Override
   protected void b(qs $$0) {
      super.b($$0);
      $$0.a("blockState", re.a(this.d));
      $$0.a("facing", this.e.d());
      $$0.a("progress", this.j);
      $$0.a("extending", this.f);
      $$0.a("source", this.g);
   }

   public ehy a(coq $$0, gv $$1) {
      ehy $$2;
      if (!this.f && this.g && this.d.b() instanceof der) {
         $$2 = this.d.a(der.b, Boolean.valueOf(true)).k($$0, $$1);
      } else {
         $$2 = ehv.a();
      }

      hb $$4 = h.get();
      if ((double)this.i < 1.0 && $$4 == this.g()) {
         return $$2;
      } else {
         dey $$5;
         if (this.f()) {
            $$5 = csl.bz.n().a(des.a, this.e).a(des.c, Boolean.valueOf(this.f != 1.0F - this.i < 0.25F));
         } else {
            $$5 = this.d;
         }

         float $$7 = this.e(this.i);
         double $$8 = (double)((float)this.e.j() * $$7);
         double $$9 = (double)((float)this.e.k() * $$7);
         double $$10 = (double)((float)this.e.l() * $$7);
         return ehv.a($$2, $$5.k($$0, $$1).a($$8, $$9, $$10));
      }
   }

   public long v() {
      return this.k;
   }

   @Override
   public void a(cpk $$0) {
      super.a($$0);
      if ($$0.a(jd.e).a(this.d.b().q().g()).isEmpty()) {
         this.d = csl.a.n();
      }
   }
}
