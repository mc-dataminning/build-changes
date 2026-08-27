import java.util.Iterator;
import java.util.List;

public class dlb extends dit {
   private static final int b = 2;
   private static final double c = 0.01;
   public static final double a = 0.51;
   private dlf d = cyq.a.o();
   private ie e;
   private boolean f;
   private boolean g;
   private static final ThreadLocal<ie> h = ThreadLocal.withInitial(() -> null);
   private float i;
   private float j;
   private long k;
   private int l;

   public dlb(hz $$0, dlf $$1) {
      super(div.k, $$0, $$1);
   }

   public dlb(hz $$0, dlf $$1, dlf $$2, ie $$3, boolean $$4, boolean $$5) {
      this($$0, $$1);
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   @Override
   public sw aA_() {
      return this.q();
   }

   public boolean c() {
      return this.f;
   }

   public ie d() {
      return this.e;
   }

   public boolean f() {
      return this.g;
   }

   public float a(float $$0) {
      if ($$0 > 1.0F) {
         $$0 = 1.0F;
      }

      return awh.i($$0, this.j, this.i);
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

   private dlf w() {
      return !this.c() && this.f() && this.d.b() instanceof dky
         ? cyq.bz.o().a(dkz.d, Boolean.valueOf(this.i > 0.25F)).a(dkz.c, this.d.a(cyq.br) ? dmh.b : dmh.a).a(dkz.a, this.d.c(dky.a))
         : this.d;
   }

   private static void a(cvn $$0, hz $$1, float $$2, dlb $$3) {
      ie $$4 = $$3.g();
      double $$5 = (double)($$2 - $$3.i);
      eol $$6 = $$3.w().k($$0, $$1);
      if (!$$6.c()) {
         enn $$7 = a($$1, $$6.a(), $$3);
         List<bno> $$8 = $$0.a_(null, dla.a($$7, $$4, $$5).b($$7));
         if (!$$8.isEmpty()) {
            List<enn> $$9 = $$6.e();
            boolean $$10 = $$3.d.a(cyq.hV);
            Iterator var12 = $$8.iterator();

            while (true) {
               bno $$11;
               while (true) {
                  if (!var12.hasNext()) {
                     return;
                  }

                  $$11 = (bno)var12.next();
                  if ($$11.s_() != egu.d) {
                     if (!$$10) {
                        break;
                     }

                     if (!($$11 instanceof aow)) {
                        ens $$12 = $$11.dp();
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

               for (enn $$17 : $$9) {
                  enn $$18 = dla.a(a($$1, $$17, $$3), $$4, $$5);
                  enn $$19 = $$11.cH();
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

   private static void a(ie $$0, bno $$1, double $$2, ie $$3) {
      h.set($$0);
      $$1.a(bol.c, new ens($$2 * (double)$$3.j(), $$2 * (double)$$3.k(), $$2 * (double)$$3.l()));
      h.set(null);
   }

   private static void b(cvn $$0, hz $$1, float $$2, dlb $$3) {
      if ($$3.x()) {
         ie $$4 = $$3.g();
         if ($$4.o().d()) {
            double $$5 = $$3.d.k($$0, $$1).c(ie.a.b);
            enn $$6 = a($$1, new enn(0.0, $$5, 0.0, 1.0, 1.5000010000000001, 1.0), $$3);
            double $$7 = (double)($$2 - $$3.i);

            for (bno $$9 : $$0.a((bno)null, $$6, $$2x -> a($$6, $$2x, $$1))) {
               a($$4, $$9, $$7, $$4);
            }
         }
      }
   }

   private static boolean a(enn $$0, bno $$1, hz $$2) {
      return $$1.s_() == egu.a && $$1.aC() && ($$1.d($$2) || $$1.dr() >= $$0.a && $$1.dr() <= $$0.d && $$1.dx() >= $$0.c && $$1.dx() <= $$0.f);
   }

   private boolean x() {
      return this.d.a(cyq.pg);
   }

   public ie g() {
      return this.f ? this.e : this.e.g();
   }

   private static double a(enn $$0, ie $$1, enn $$2) {
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

   private static enn a(hz $$0, enn $$1, dlb $$2) {
      double $$3 = (double)$$2.e($$2.i);
      return $$1.d((double)$$0.u() + $$3 * (double)$$2.e.j(), (double)$$0.v() + $$3 * (double)$$2.e.k(), (double)$$0.w() + $$3 * (double)$$2.e.l());
   }

   private static void a(hz $$0, bno $$1, ie $$2, double $$3) {
      enn $$4 = $$1.cH();
      enn $$5 = eoi.b().a().a($$0);
      if ($$4.c($$5)) {
         ie $$6 = $$2.g();
         double $$7 = a($$5, $$6, $$4) + 0.01;
         double $$8 = a($$5, $$6, $$4.a($$5)) + 0.01;
         if (Math.abs($$7 - $$8) < 0.01) {
            $$7 = Math.min($$7, $$3) + 0.01;
            a($$2, $$1, $$7, $$6);
         }
      }
   }

   public dlf k() {
      return this.d;
   }

   public void l() {
      if (this.o != null && (this.j < 1.0F || this.o.B)) {
         this.i = 1.0F;
         this.j = this.i;
         this.o.o(this.p);
         this.aB_();
         if (this.o.a_(this.p).a(cyq.bQ)) {
            dlf $$0;
            if (this.g) {
               $$0 = cyq.a.o();
            } else {
               $$0 = cyo.b(this.d, this.o, this.p);
            }

            this.o.a(this.p, $$0, 3);
            this.o.a(this.p, $$0.b(), this.p);
         }
      }
   }

   public static void a(cvn $$0, hz $$1, dlf $$2, dlb $$3) {
      $$3.k = $$0.X();
      $$3.j = $$3.i;
      if ($$3.j >= 1.0F) {
         if ($$0.B && $$3.l < 5) {
            $$3.l++;
         } else {
            $$0.o($$1);
            $$3.aB_();
            if ($$0.a_($$1).a(cyq.bQ)) {
               dlf $$4 = cyo.b($$3.d, $$0, $$1);
               if ($$4.i()) {
                  $$0.a($$1, $$3.d, 84);
                  cyo.a($$3.d, $$4, $$0, $$1, 3);
               } else {
                  if ($$4.b(dlv.C) && $$4.c(dlv.C)) {
                     $$4 = $$4.a(dlv.C, Boolean.valueOf(false));
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
   public void a(sw $$0) {
      super.a($$0);
      ik<cyo> $$1 = (ik<cyo>)(this.o != null ? this.o.a(kg.f) : kf.e.p());
      this.d = tl.a($$1, $$0.p("blockState"));
      this.e = ie.a($$0.h("facing"));
      this.i = $$0.j("progress");
      this.j = this.i;
      this.f = $$0.q("extending");
      this.g = $$0.q("source");
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      $$0.a("blockState", tl.a(this.d));
      $$0.a("facing", this.e.d());
      $$0.a("progress", this.j);
      $$0.a("extending", this.f);
      $$0.a("source", this.g);
   }

   public eol a(cut $$0, hz $$1) {
      eol $$2;
      if (!this.f && this.g && this.d.b() instanceof dky) {
         $$2 = this.d.a(dky.c, Boolean.valueOf(true)).k($$0, $$1);
      } else {
         $$2 = eoi.a();
      }

      ie $$4 = h.get();
      if ((double)this.i < 1.0 && $$4 == this.g()) {
         return $$2;
      } else {
         dlf $$5;
         if (this.f()) {
            $$5 = cyq.bz.o().a(dkz.a, this.e).a(dkz.d, Boolean.valueOf(this.f != 1.0F - this.i < 0.25F));
         } else {
            $$5 = this.d;
         }

         float $$7 = this.e(this.i);
         double $$8 = (double)((float)this.e.j() * $$7);
         double $$9 = (double)((float)this.e.k() * $$7);
         double $$10 = (double)((float)this.e.l() * $$7);
         return eoi.a($$2, $$5.k($$0, $$1).a($$8, $$9, $$10));
      }
   }

   public long m() {
      return this.k;
   }

   @Override
   public void a(cvn $$0) {
      super.a($$0);
      if ($$0.a(kg.f).a(this.d.b().r().h()).isEmpty()) {
         this.d = cyq.a.o();
      }
   }
}
