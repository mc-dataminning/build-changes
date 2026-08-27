import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgj extends chr implements brq, chv {
   private static final ajk<Integer> b = ajo.a(cgj.class, ajm.b);
   private static final ajk<Integer> c = ajo.a(cgj.class, ajm.b);
   private static final ajk<Integer> d = ajo.a(cgj.class, ajm.b);
   private static final List<ajk<Integer>> e = ImmutableList.of(b, c, d);
   private static final ajk<Integer> bY = ajo.a(cgj.class, ajm.b);
   private static final int bZ = 220;
   private final float[] ca = new float[2];
   private final float[] cb = new float[2];
   private final float[] cc = new float[2];
   private final float[] cd = new float[2];
   private final int[] ce = new int[2];
   private final int[] cf = new int[2];
   private int cg;
   private final aqb ch = (aqb)new aqb(this.O_(), bog.a.f, bog.b.a).a(true);
   private static final Predicate<bre> ci = $$0 -> !$$0.ai().a(avr.y) && $$0.fF();
   private static final cbu cj = cbu.a().a(20.0).a(ci);

   public cgj(bqr<? extends cgj> $$0, czu $$1) {
      super($$0, $$1);
      this.bP = new bxb(this, 10, false);
      this.t(this.eP());
      this.bN = 50;
   }

   @Override
   protected cap b(czu $$0) {
      can $$1 = new can(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void z() {
      this.bS.a(0, new cgj.a());
      this.bS.a(2, new bza(this, 1.0, 40, 20.0F));
      this.bS.a(5, new bzn(this, 1.0));
      this.bS.a(6, new byj(this, ckl.class, 8.0F));
      this.bS.a(7, new byw(this));
      this.bT.a(1, new bzt(this));
      this.bT.a(2, new bzu<>(this, bre.class, 0, false, false, ci));
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(b, 0);
      $$0.a(c, 0);
      $$0.a(d, 0);
      $$0.a(bY, 0);
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("Invul", this.y());
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.t($$0.h("Invul"));
      if (this.ae()) {
         this.ch.a(this.O_());
      }
   }

   @Override
   public void b(@Nullable ws $$0) {
      super.b($$0);
      this.ch.a(this.O_());
   }

   @Override
   protected auy v() {
      return auz.Ci;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.Cl;
   }

   @Override
   protected auy o_() {
      return auz.Ck;
   }

   @Override
   public void n_() {
      etf $$0 = this.dq().d(1.0, 0.6, 1.0);
      if (!this.dN().B && this.u(0) > 0) {
         bql $$1 = this.dN().a(this.u(0));
         if ($$1 != null) {
            double $$2 = $$0.d;
            if (this.du() < $$1.du() || !this.a() && this.du() < $$1.du() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new etf($$0.c, $$2, $$0.e);
            etf $$3 = new etf($$1.ds() - this.ds(), 0.0, $$1.dy() - this.dy());
            if ($$3.i() > 9.0) {
               etf $$4 = $$3.d();
               $$0 = $$0.b($$4.c * 0.3 - $$0.c * 0.6, 0.0, $$4.e * 0.3 - $$0.e * 0.6);
            }
         }
      }

      this.g($$0);
      if ($$0.i() > 0.05) {
         this.r((float)axw.d($$0.e, $$0.c) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.n_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.cd[$$5] = this.cb[$$5];
         this.cc[$$5] = this.ca[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.u($$6 + 1);
         bql $$8 = null;
         if ($$7 > 0) {
            $$8 = this.dN().a($$7);
         }

         if ($$8 != null) {
            double $$9 = this.v($$6 + 1);
            double $$10 = this.w($$6 + 1);
            double $$11 = this.x($$6 + 1);
            double $$12 = $$8.ds() - $$9;
            double $$13 = $$8.dw() - $$10;
            double $$14 = $$8.dy() - $$11;
            double $$15 = Math.sqrt($$12 * $$12 + $$14 * $$14);
            float $$16 = (float)(axw.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(axw.d($$13, $$15) * 180.0F / (float)Math.PI));
            this.ca[$$6] = this.a(this.ca[$$6], $$17, 40.0F);
            this.cb[$$6] = this.a(this.cb[$$6], $$16, 10.0F);
         } else {
            this.cb[$$6] = this.a(this.cb[$$6], this.aZ, 10.0F);
         }
      }

      boolean $$18 = this.a();

      for (int $$19 = 0; $$19 < 3; $$19++) {
         double $$20 = this.v($$19);
         double $$21 = this.w($$19);
         double $$22 = this.x($$19);
         float $$23 = 0.3F * this.ec();
         this.dN().a(kw.ab, $$20 + this.ah.k() * (double)$$23, $$21 + this.ah.k() * (double)$$23, $$22 + this.ah.k() * (double)$$23, 0.0, 0.0, 0.0);
         if ($$18 && this.dN().z.a(4) == 0) {
            this.dN()
               .a(
                  ko.a(kw.u, 0.7F, 0.7F, 0.5F),
                  $$20 + this.ah.k() * (double)$$23,
                  $$21 + this.ah.k() * (double)$$23,
                  $$22 + this.ah.k() * (double)$$23,
                  0.0,
                  0.0,
                  0.0
               );
         }
      }

      if (this.y() > 0) {
         float $$24 = 3.3F * this.ec();

         for (int $$25 = 0; $$25 < 3; $$25++) {
            this.dN()
               .a(ko.a(kw.u, 0.7F, 0.7F, 0.9F), this.ds() + this.ah.k(), this.du() + (double)(this.ah.i() * $$24), this.dy() + this.ah.k(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void Y() {
      if (this.y() > 0) {
         int $$0 = this.y() - 1;
         this.ch.a(1.0F - (float)$$0 / 220.0F);
         if ($$0 <= 0) {
            this.dN().a(this, this.ds(), this.dw(), this.dy(), 7.0F, false, czu.a.c);
            if (!this.aU()) {
               this.dN().b(1023, this.dn(), 0);
            }
         }

         this.t($$0);
         if (this.ai % 10 == 0) {
            this.c(10.0F);
         }
      } else {
         super.Y();

         for (int $$1 = 1; $$1 < 3; $$1++) {
            if (this.ai >= this.ce[$$1 - 1]) {
               this.ce[$$1 - 1] = this.ai + 10 + this.ah.a(10);
               if ((this.dN().ak() == bon.c || this.dN().ak() == bon.d) && this.cf[$$1 - 1]++ > 15) {
                  float $$2 = 10.0F;
                  float $$3 = 5.0F;
                  double $$4 = axw.a(this.ah, this.ds() - 10.0, this.ds() + 10.0);
                  double $$5 = axw.a(this.ah, this.du() - 5.0, this.du() + 5.0);
                  double $$6 = axw.a(this.ah, this.dy() - 10.0, this.dy() + 10.0);
                  this.a($$1 + 1, $$4, $$5, $$6, true);
                  this.cf[$$1 - 1] = 0;
               }

               int $$7 = this.u($$1);
               if ($$7 > 0) {
                  bre $$8 = (bre)this.dN().a($$7);
                  if ($$8 != null && this.c($$8) && !(this.g((bql)$$8) > 900.0) && this.E($$8)) {
                     this.a($$1 + 1, $$8);
                     this.ce[$$1 - 1] = this.ai + 40 + this.ah.a(20);
                     this.cf[$$1 - 1] = 0;
                  } else {
                     this.a($$1, 0);
                  }
               } else {
                  List<bre> $$9 = this.dN().a(bre.class, cj, this, this.cI().c(20.0, 8.0, 20.0));
                  if (!$$9.isEmpty()) {
                     bre $$10 = $$9.get(this.ah.a($$9.size()));
                     this.a($$1, $$10.aj());
                  }
               }
            }
         }

         if (this.p() != null) {
            this.a(0, this.p().aj());
         } else {
            this.a(0, 0);
         }

         if (this.cg > 0) {
            this.cg--;
            if (this.cg == 0 && this.dN().aa().b(czq.c)) {
               boolean $$11 = false;
               int $$12 = axw.d(this.dh() / 2.0F + 1.0F);
               int $$13 = axw.d(this.di());

               for (im $$14 : im.b(this.dr() - $$12, this.dt(), this.dx() - $$12, this.dr() + $$12, this.dt() + $$13, this.dx() + $$12)) {
                  dpy $$15 = this.dN().a_($$14);
                  if (d($$15)) {
                     $$11 = this.dN().a($$14, true, this) || $$11;
                  }
               }

               if ($$11) {
                  this.dN().a(null, 1022, this.dn(), 0);
               }
            }
         }

         if (this.ai % 20 == 0) {
            this.c(1.0F);
         }

         this.ch.a(this.ey() / this.eP());
      }
   }

   public static boolean d(dpy $$0) {
      return !$$0.i() && !$$0.a(avo.aE);
   }

   @Override
   public void r() {
      this.t(220);
      this.ch.a(0.0F);
      this.t(this.eP() / 3.0F);
   }

   @Override
   public void a(dpy $$0, etf $$1) {
   }

   @Override
   public void c(aqf $$0) {
      super.c($$0);
      this.ch.a($$0);
   }

   @Override
   public void d(aqf $$0) {
      super.d($$0);
      this.ch.b($$0);
   }

   private double v(int $$0) {
      if ($$0 <= 0) {
         return this.ds();
      } else {
         float $$1 = (this.aZ + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = axw.b($$1);
         return this.ds() + (double)$$2 * 1.3 * (double)this.ec();
      }
   }

   private double w(int $$0) {
      float $$1 = $$0 <= 0 ? 3.0F : 2.2F;
      return this.du() + (double)($$1 * this.ec());
   }

   private double x(int $$0) {
      if ($$0 <= 0) {
         return this.dy();
      } else {
         float $$1 = (this.aZ + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = axw.a($$1);
         return this.dy() + (double)$$2 * 1.3 * (double)this.ec();
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = axw.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, bre $$1) {
      this.a($$0, $$1.ds(), $$1.du() + (double)$$1.cJ() * 0.5, $$1.dy(), $$0 == 0 && this.ah.i() < 0.001F);
   }

   private void a(int $$0, double $$1, double $$2, double $$3, boolean $$4) {
      if (!this.aU()) {
         this.dN().a(null, 1024, this.dn(), 0);
      }

      double $$5 = this.v($$0);
      double $$6 = this.w($$0);
      double $$7 = this.x($$0);
      double $$8 = $$1 - $$5;
      double $$9 = $$2 - $$6;
      double $$10 = $$3 - $$7;
      clr $$11 = new clr(this.dN(), this, $$8, $$9, $$10);
      $$11.c(this);
      if ($$4) {
         $$11.a(true);
      }

      $$11.p($$5, $$6, $$7);
      this.dN().b($$11);
   }

   @Override
   public void a(bre $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.a(avq.u) || $$0.d() instanceof cgj) {
         return false;
      } else if (this.y() > 0 && !$$0.a(avq.e)) {
         return false;
      } else {
         if (this.a()) {
            bql $$2 = $$0.c();
            if ($$2 instanceof ckr) {
               return false;
            }
         }

         bql $$3 = $$0.d();
         if ($$3 != null && $$3.ai().a(avr.y)) {
            return false;
         } else {
            if (this.cg <= 0) {
               this.cg = 20;
            }

            for (int $$4 = 0; $$4 < this.cf.length; $$4++) {
               this.cf[$$4] = this.cf[$$4] + 3;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void a(bpj $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      cgv $$3 = this.a(csg.us);
      if ($$3 != null) {
         $$3.A();
      }
   }

   @Override
   public void dz() {
      if (this.dN().ak() == bon.a && this.W()) {
         this.am();
      } else {
         this.bg = 0;
      }
   }

   @Override
   public boolean b(bpx $$0, @Nullable bql $$1) {
      return false;
   }

   public static bsk.a u() {
      return chr.gv().a(bsl.q, 300.0).a(bsl.r, 0.6F).a(bsl.j, 0.6F).a(bsl.k, 40.0).a(bsl.a, 4.0);
   }

   public float b(int $$0) {
      return this.cb[$$0];
   }

   public float c(int $$0) {
      return this.ca[$$0];
   }

   public int y() {
      return this.ao.a(bY);
   }

   public void t(int $$0) {
      this.ao.a(bY, $$0);
   }

   public int u(int $$0) {
      return this.ao.a(e.get($$0));
   }

   public void a(int $$0, int $$1) {
      this.ao.a(e.get($$0), $$1);
   }

   @Override
   public boolean a() {
      return this.ey() <= this.eP() / 2.0F;
   }

   @Override
   protected boolean o(bql $$0) {
      return false;
   }

   @Override
   public boolean cu() {
      return false;
   }

   @Override
   public boolean c(bpx $$0) {
      return $$0.a(bpz.t) ? false : super.c($$0);
   }

   class a extends byb {
      public a() {
         this.a(EnumSet.of(byb.a.a, byb.a.c, byb.a.b));
      }

      @Override
      public boolean a() {
         return cgj.this.y() > 0;
      }
   }
}
