import java.util.Iterator;
import java.util.List;

public class dxj extends dup {
   private static final int b = 2;
   private static final double c = 0.01;
   public static final double a = 0.51;
   private dxn d = dkg.a.m();
   private jm e;
   private boolean f;
   private boolean g;
   private static final ThreadLocal<jm> h = ThreadLocal.withInitial(() -> null);
   private float i;
   private float j;
   private long k;
   private int l;

   public dxj(jh $$0, dxn $$1) {
      super(dur.l, $$0, $$1);
   }

   public dxj(jh $$0, dxn $$1, dxn $$2, jm $$3, boolean $$4, boolean $$5) {
      this($$0, $$1);
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   @Override
   public ux a(js.a $$0) {
      return this.e($$0);
   }

   public boolean b() {
      return this.f;
   }

   public jm c() {
      return this.e;
   }

   public boolean d() {
      return this.g;
   }

   public float a(float $$0) {
      if ($$0 > 1.0F) {
         $$0 = 1.0F;
      }

      return bae.h($$0, this.j, this.i);
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

   private dxn v() {
      return !this.b() && this.d() && this.d.b() instanceof dxg
         ? dkg.bG.m().b(dxh.d, Boolean.valueOf(this.i > 0.25F)).b(dxh.c, this.d.a(dkg.by) ? dyo.b : dyo.a).b(dxh.a, this.d.c(dxg.a))
         : this.d;
   }

   private static void a(dha $$0, jh $$1, float $$2, dxj $$3) {
      jm $$4 = $$3.f();
      double $$5 = (double)($$2 - $$3.i);
      fcm $$6 = $$3.v().g($$0, $$1);
      if (!$$6.c()) {
         fbn $$7 = a($$1, $$6.a(), $$3);
         List<bvf> $$8 = $$0.a_(null, dxi.a($$7, $$4, $$5).b($$7));
         if (!$$8.isEmpty()) {
            List<fbn> $$9 = $$6.e();
            boolean $$10 = $$3.d.a(dkg.im);
            Iterator var12 = $$8.iterator();

            while (true) {
               bvf $$11;
               while (true) {
                  if (!var12.hasNext()) {
                     return;
                  }

                  $$11 = (bvf)var12.next();
                  if ($$11.n_() != etu.d) {
                     if (!$$10) {
                        break;
                     }

                     if (!($$11 instanceof asi)) {
                        fbs $$12 = $$11.dy();
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

               for (fbn $$17 : $$9) {
                  fbn $$18 = dxi.a(a($$1, $$17, $$3), $$4, $$5);
                  fbn $$19 = $$11.cR();
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

   private static void a(jm $$0, bvf $$1, double $$2, jm $$3) {
      h.set($$0);
      $$1.a(bwf.c, new fbs($$2 * (double)$$3.j(), $$2 * (double)$$3.k(), $$2 * (double)$$3.l()));
      $$1.aK();
      h.set(null);
   }

   private static void b(dha $$0, jh $$1, float $$2, dxj $$3) {
      if ($$3.w()) {
         jm $$4 = $$3.f();
         if ($$4.o().d()) {
            double $$5 = $$3.d.g($$0, $$1).c(jm.a.b);
            fbn $$6 = a($$1, new fbn(0.0, $$5, 0.0, 1.0, 1.5000010000000001, 1.0), $$3);
            double $$7 = (double)($$2 - $$3.i);

            for (bvf $$9 : $$0.a((bvf)null, $$6, $$2x -> a($$6, $$2x, $$1))) {
               a($$4, $$9, $$7, $$4);
            }
         }
      }
   }

   private static boolean a(fbn $$0, bvf $$1, jh $$2) {
      return $$1.n_() == etu.a && $$1.aJ() && ($$1.d($$2) || $$1.dA() >= $$0.a && $$1.dA() <= $$0.d && $$1.dG() >= $$0.c && $$1.dG() <= $$0.f);
   }

   private boolean w() {
      return this.d.a(dkg.pB);
   }

   public jm f() {
      return this.f ? this.e : this.e.g();
   }

   private static double a(fbn $$0, jm $$1, fbn $$2) {
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

   private static fbn a(jh $$0, fbn $$1, dxj $$2) {
      double $$3 = (double)$$2.e($$2.i);
      return $$1.d((double)$$0.u() + $$3 * (double)$$2.e.j(), (double)$$0.v() + $$3 * (double)$$2.e.k(), (double)$$0.w() + $$3 * (double)$$2.e.l());
   }

   private static void a(jh $$0, bvf $$1, jm $$2, double $$3) {
      fbn $$4 = $$1.cR();
      fbn $$5 = fcj.b().a().a($$0);
      if ($$4.c($$5)) {
         jm $$6 = $$2.g();
         double $$7 = a($$5, $$6, $$4) + 0.01;
         double $$8 = a($$5, $$6, $$4.a($$5)) + 0.01;
         if (Math.abs($$7 - $$8) < 0.01) {
            $$7 = Math.min($$7, $$3) + 0.01;
            a($$2, $$1, $$7, $$6);
         }
      }
   }

   public dxn j() {
      return this.d;
   }

   public void k() {
      if (this.o != null && (this.j < 1.0F || this.o.C)) {
         this.i = 1.0F;
         this.j = this.i;
         this.o.o(this.p);
         this.aw_();
         if (this.o.a_(this.p).a(dkg.bX)) {
            dxn $$0;
            if (this.g) {
               $$0 = dkg.a.m();
            } else {
               $$0 = dke.b(this.d, this.o, this.p);
            }

            this.o.a(this.p, $$0, 3);
            this.o.b(this.p, $$0.b(), eut.a(this.o, this.t(), null));
         }
      }
   }

   public jm t() {
      return this.f ? this.e : this.e.g();
   }

   public static void a(dha $$0, jh $$1, dxn $$2, dxj $$3) {
      $$3.k = $$0.ac();
      $$3.j = $$3.i;
      if ($$3.j >= 1.0F) {
         if ($$0.C && $$3.l < 5) {
            $$3.l++;
         } else {
            $$0.o($$1);
            $$3.aw_();
            if ($$0.a_($$1).a(dkg.bX)) {
               dxn $$4 = dke.b($$3.d, $$0, $$1);
               if ($$4.l()) {
                  $$0.a($$1, $$3.d, 84);
                  dke.a($$3.d, $$4, $$0, $$1, 3);
               } else {
                  if ($$4.b(dyd.D) && $$4.c(dyd.D)) {
                     $$4 = $$4.b(dyd.D, Boolean.valueOf(false));
                  }

                  $$0.a($$1, $$4, 67);
                  $$0.b($$1, $$4.b(), eut.a($$0, $$3.t(), null));
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
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      jr<dke> $$2 = (jr<dke>)(this.o != null ? this.o.a(mb.f) : ma.e);
      this.d = vm.a($$2, $$0.p("blockState"));
      this.e = jm.a($$0.h("facing"));
      this.i = $$0.j("progress");
      this.j = this.i;
      this.f = $$0.q("extending");
      this.g = $$0.q("source");
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("blockState", vm.a(this.d));
      $$0.a("facing", this.e.d());
      $$0.a("progress", this.j);
      $$0.a("extending", this.f);
      $$0.a("source", this.g);
   }

   public fcm a(dgf $$0, jh $$1) {
      fcm $$2;
      if (!this.f && this.g && this.d.b() instanceof dxg) {
         $$2 = this.d.b(dxg.c, Boolean.valueOf(true)).g($$0, $$1);
      } else {
         $$2 = fcj.a();
      }

      jm $$4 = h.get();
      if ((double)this.i < 1.0 && $$4 == this.f()) {
         return $$2;
      } else {
         dxn $$5;
         if (this.d()) {
            $$5 = dkg.bG.m().b(dxh.a, this.e).b(dxh.d, Boolean.valueOf(this.f != 1.0F - this.i < 0.25F));
         } else {
            $$5 = this.d;
         }

         float $$7 = this.e(this.i);
         double $$8 = (double)((float)this.e.j() * $$7);
         double $$9 = (double)((float)this.e.k() * $$7);
         double $$10 = (double)((float)this.e.l() * $$7);
         return fcj.a($$2, $$5.g($$0, $$1).a($$8, $$9, $$10));
      }
   }

   public long u() {
      return this.k;
   }

   @Override
   public void a(dha $$0) {
      super.a($$0);
      if ($$0.a(mb.f).a(this.d.b().p().h()).isEmpty()) {
         this.d = dkg.a.m();
      }
   }
}
