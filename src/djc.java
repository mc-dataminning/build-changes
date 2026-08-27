import java.util.Iterator;
import java.util.List;

public class djc extends dgu {
   private static final int b = 2;
   private static final double c = 0.01;
   public static final double a = 0.51;
   private djg d = cwr.a.o();
   private ic e;
   private boolean f;
   private boolean g;
   private static final ThreadLocal<ic> h = ThreadLocal.withInitial(() -> null);
   private float i;
   private float j;
   private long k;
   private int l;

   public djc(hx $$0, djg $$1) {
      super(dgw.k, $$0, $$1);
   }

   public djc(hx $$0, djg $$1, djg $$2, ic $$3, boolean $$4, boolean $$5) {
      this($$0, $$1);
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   @Override
   public sn ax_() {
      return this.q();
   }

   public boolean c() {
      return this.f;
   }

   public ic d() {
      return this.e;
   }

   public boolean f() {
      return this.g;
   }

   public float a(float $$0) {
      if ($$0 > 1.0F) {
         $$0 = 1.0F;
      }

      return aun.i($$0, this.j, this.i);
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

   private djg w() {
      return !this.c() && this.f() && this.d.b() instanceof diz
         ? cwr.bz.o().a(dja.d, Boolean.valueOf(this.i > 0.25F)).a(dja.c, this.d.a(cwr.br) ? dki.b : dki.a).a(dja.a, this.d.c(diz.a))
         : this.d;
   }

   private static void a(cto $$0, hx $$1, float $$2, djc $$3) {
      ic $$4 = $$3.g();
      double $$5 = (double)($$2 - $$3.i);
      eml $$6 = $$3.w().k($$0, $$1);
      if (!$$6.c()) {
         eln $$7 = a($$1, $$6.a(), $$3);
         List<blu> $$8 = $$0.a_(null, djb.a($$7, $$4, $$5).b($$7));
         if (!$$8.isEmpty()) {
            List<eln> $$9 = $$6.e();
            boolean $$10 = $$3.d.a(cwr.hV);
            Iterator var12 = $$8.iterator();

            while (true) {
               blu $$11;
               while (true) {
                  if (!var12.hasNext()) {
                     return;
                  }

                  $$11 = (blu)var12.next();
                  if ($$11.s_() != eev.d) {
                     if (!$$10) {
                        break;
                     }

                     if (!($$11 instanceof ane)) {
                        els $$12 = $$11.dp();
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

               for (eln $$17 : $$9) {
                  eln $$18 = djb.a(a($$1, $$17, $$3), $$4, $$5);
                  eln $$19 = $$11.cH();
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

   private static void a(ic $$0, blu $$1, double $$2, ic $$3) {
      h.set($$0);
      $$1.a(bmq.c, new els($$2 * (double)$$3.j(), $$2 * (double)$$3.k(), $$2 * (double)$$3.l()));
      h.set(null);
   }

   private static void b(cto $$0, hx $$1, float $$2, djc $$3) {
      if ($$3.x()) {
         ic $$4 = $$3.g();
         if ($$4.o().d()) {
            double $$5 = $$3.d.k($$0, $$1).c(ic.a.b);
            eln $$6 = a($$1, new eln(0.0, $$5, 0.0, 1.0, 1.5000010000000001, 1.0), $$3);
            double $$7 = (double)($$2 - $$3.i);

            for (blu $$9 : $$0.a((blu)null, $$6, $$2x -> a($$6, $$2x, $$1))) {
               a($$4, $$9, $$7, $$4);
            }
         }
      }
   }

   private static boolean a(eln $$0, blu $$1, hx $$2) {
      return $$1.s_() == eev.a && $$1.aC() && ($$1.d($$2) || $$1.dr() >= $$0.a && $$1.dr() <= $$0.d && $$1.dx() >= $$0.c && $$1.dx() <= $$0.f);
   }

   private boolean x() {
      return this.d.a(cwr.pg);
   }

   public ic g() {
      return this.f ? this.e : this.e.g();
   }

   private static double a(eln $$0, ic $$1, eln $$2) {
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

   private static eln a(hx $$0, eln $$1, djc $$2) {
      double $$3 = (double)$$2.e($$2.i);
      return $$1.d((double)$$0.u() + $$3 * (double)$$2.e.j(), (double)$$0.v() + $$3 * (double)$$2.e.k(), (double)$$0.w() + $$3 * (double)$$2.e.l());
   }

   private static void a(hx $$0, blu $$1, ic $$2, double $$3) {
      eln $$4 = $$1.cH();
      eln $$5 = emi.b().a().a($$0);
      if ($$4.c($$5)) {
         ic $$6 = $$2.g();
         double $$7 = a($$5, $$6, $$4) + 0.01;
         double $$8 = a($$5, $$6, $$4.a($$5)) + 0.01;
         if (Math.abs($$7 - $$8) < 0.01) {
            $$7 = Math.min($$7, $$3) + 0.01;
            a($$2, $$1, $$7, $$6);
         }
      }
   }

   public djg k() {
      return this.d;
   }

   public void l() {
      if (this.o != null && (this.j < 1.0F || this.o.B)) {
         this.i = 1.0F;
         this.j = this.i;
         this.o.o(this.p);
         this.ay_();
         if (this.o.a_(this.p).a(cwr.bQ)) {
            djg $$0;
            if (this.g) {
               $$0 = cwr.a.o();
            } else {
               $$0 = cwp.b(this.d, this.o, this.p);
            }

            this.o.a(this.p, $$0, 3);
            this.o.a(this.p, $$0.b(), this.p);
         }
      }
   }

   public static void a(cto $$0, hx $$1, djg $$2, djc $$3) {
      $$3.k = $$0.X();
      $$3.j = $$3.i;
      if ($$3.j >= 1.0F) {
         if ($$0.B && $$3.l < 5) {
            $$3.l++;
         } else {
            $$0.o($$1);
            $$3.ay_();
            if ($$0.a_($$1).a(cwr.bQ)) {
               djg $$4 = cwp.b($$3.d, $$0, $$1);
               if ($$4.i()) {
                  $$0.a($$1, $$3.d, 84);
                  cwp.a($$3.d, $$4, $$0, $$1, 3);
               } else {
                  if ($$4.b(djw.C) && $$4.c(djw.C)) {
                     $$4 = $$4.a(djw.C, Boolean.valueOf(false));
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
   public void a(sn $$0) {
      super.a($$0);
      ii<cwp> $$1 = (ii<cwp>)(this.o != null ? this.o.a(ke.f) : kd.e.p());
      this.d = tc.a($$1, $$0.p("blockState"));
      this.e = ic.a($$0.h("facing"));
      this.i = $$0.j("progress");
      this.j = this.i;
      this.f = $$0.q("extending");
      this.g = $$0.q("source");
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      $$0.a("blockState", tc.a(this.d));
      $$0.a("facing", this.e.d());
      $$0.a("progress", this.j);
      $$0.a("extending", this.f);
      $$0.a("source", this.g);
   }

   public eml a(csu $$0, hx $$1) {
      eml $$2;
      if (!this.f && this.g && this.d.b() instanceof diz) {
         $$2 = this.d.a(diz.c, Boolean.valueOf(true)).k($$0, $$1);
      } else {
         $$2 = emi.a();
      }

      ic $$4 = h.get();
      if ((double)this.i < 1.0 && $$4 == this.g()) {
         return $$2;
      } else {
         djg $$5;
         if (this.f()) {
            $$5 = cwr.bz.o().a(dja.a, this.e).a(dja.d, Boolean.valueOf(this.f != 1.0F - this.i < 0.25F));
         } else {
            $$5 = this.d;
         }

         float $$7 = this.e(this.i);
         double $$8 = (double)((float)this.e.j() * $$7);
         double $$9 = (double)((float)this.e.k() * $$7);
         double $$10 = (double)((float)this.e.l() * $$7);
         return emi.a($$2, $$5.k($$0, $$1).a($$8, $$9, $$10));
      }
   }

   public long m() {
      return this.k;
   }

   @Override
   public void a(cto $$0) {
      super.a($$0);
      if ($$0.a(ke.f).a(this.d.b().r().g()).isEmpty()) {
         this.d = cwr.a.o();
      }
   }
}
