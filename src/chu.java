import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chu extends cjd implements bta, cji {
   private static final ajy<Integer> b = akc.a(chu.class, aka.b);
   private static final ajy<Integer> c = akc.a(chu.class, aka.b);
   private static final ajy<Integer> d = akc.a(chu.class, aka.b);
   private static final List<ajy<Integer>> e = ImmutableList.of(b, c, d);
   private static final ajy<Integer> ch = akc.a(chu.class, aka.b);
   private static final int ci = 220;
   private final float[] cj = new float[2];
   private final float[] ck = new float[2];
   private final float[] cl = new float[2];
   private final float[] cm = new float[2];
   private final int[] cn = new int[2];
   private final int[] co = new int[2];
   private int cp;
   private final aqq cq = (aqq)new aqq(this.P_(), bpq.a.f, bpq.b.a).a(true);
   private static final Predicate<bso> cr = $$0 -> !$$0.ak().a(awh.y) && $$0.fQ();
   private static final cde cs = cde.a().a(20.0).a(cr);

   public chu(bsb<? extends chu> $$0, dca $$1) {
      super($$0, $$1);
      this.bY = new byl(this, 10, false);
      this.t(this.eZ());
      this.bW = 50;
   }

   @Override
   protected cbz b(dca $$0) {
      cbx $$1 = new cbx(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void y() {
      this.cb.a(0, new chu.a());
      this.cb.a(2, new cak(this, 1.0, 40, 20.0F));
      this.cb.a(5, new cax(this, 1.0));
      this.cb.a(6, new bzt(this, cly.class, 8.0F));
      this.cb.a(7, new cag(this));
      this.cc.a(1, new cbd(this));
      this.cc.a(2, new cbe<>(this, bso.class, 0, false, false, cr));
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(b, 0);
      $$0.a(c, 0);
      $$0.a(d, 0);
      $$0.a(ch, 0);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("Invul", this.x());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.u($$0.h("Invul"));
      if (this.ag()) {
         this.cq.a(this.P_());
      }
   }

   @Override
   public void b(@Nullable xe $$0) {
      super.b($$0);
      this.cq.a(this.P_());
   }

   @Override
   protected avn u() {
      return avo.CS;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.CV;
   }

   @Override
   protected avn n_() {
      return avo.CU;
   }

   @Override
   public void m_() {
      ewu $$0 = this.dx().d(1.0, 0.6, 1.0);
      if (!this.dU().C && this.v(0) > 0) {
         brv $$1 = this.dU().a(this.v(0));
         if ($$1 != null) {
            double $$2 = $$0.d;
            if (this.dB() < $$1.dB() || !this.a() && this.dB() < $$1.dB() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new ewu($$0.c, $$2, $$0.e);
            ewu $$3 = new ewu($$1.dz() - this.dz(), 0.0, $$1.dF() - this.dF());
            if ($$3.i() > 9.0) {
               ewu $$4 = $$3.d();
               $$0 = $$0.b($$4.c * 0.3 - $$0.c * 0.6, 0.0, $$4.e * 0.3 - $$0.e * 0.6);
            }
         }
      }

      this.g($$0);
      if ($$0.i() > 0.05) {
         this.r((float)aym.d($$0.e, $$0.c) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.m_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.cm[$$5] = this.ck[$$5];
         this.cl[$$5] = this.cj[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.v($$6 + 1);
         brv $$8 = null;
         if ($$7 > 0) {
            $$8 = this.dU().a($$7);
         }

         if ($$8 != null) {
            double $$9 = this.w($$6 + 1);
            double $$10 = this.x($$6 + 1);
            double $$11 = this.y($$6 + 1);
            double $$12 = $$8.dz() - $$9;
            double $$13 = $$8.dD() - $$10;
            double $$14 = $$8.dF() - $$11;
            double $$15 = Math.sqrt($$12 * $$12 + $$14 * $$14);
            float $$16 = (float)(aym.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(aym.d($$13, $$15) * 180.0F / (float)Math.PI));
            this.cj[$$6] = this.a(this.cj[$$6], $$17, 40.0F);
            this.ck[$$6] = this.a(this.ck[$$6], $$16, 10.0F);
         } else {
            this.ck[$$6] = this.a(this.ck[$$6], this.bj, 10.0F);
         }
      }

      boolean $$18 = this.a();

      for (int $$19 = 0; $$19 < 3; $$19++) {
         double $$20 = this.w($$19);
         double $$21 = this.x($$19);
         double $$22 = this.y($$19);
         float $$23 = 0.3F * this.em();
         this.dU().a(lb.ac, $$20 + this.al.k() * (double)$$23, $$21 + this.al.k() * (double)$$23, $$22 + this.al.k() * (double)$$23, 0.0, 0.0, 0.0);
         if ($$18 && this.dU().A.a(4) == 0) {
            this.dU()
               .a(
                  kt.a(lb.u, 0.7F, 0.7F, 0.5F),
                  $$20 + this.al.k() * (double)$$23,
                  $$21 + this.al.k() * (double)$$23,
                  $$22 + this.al.k() * (double)$$23,
                  0.0,
                  0.0,
                  0.0
               );
         }
      }

      if (this.x() > 0) {
         float $$24 = 3.3F * this.em();

         for (int $$25 = 0; $$25 < 3; $$25++) {
            this.dU()
               .a(kt.a(lb.u, 0.7F, 0.7F, 0.9F), this.dz() + this.al.k(), this.dB() + (double)(this.al.i() * $$24), this.dF() + this.al.k(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void Y() {
      if (this.x() > 0) {
         int $$0 = this.x() - 1;
         this.cq.a(1.0F - (float)$$0 / 220.0F);
         if ($$0 <= 0) {
            this.dU().a(this, this.dz(), this.dD(), this.dF(), 7.0F, false, dca.a.c);
            if (!this.ba()) {
               this.dU().b(1023, this.du(), 0);
            }
         }

         this.u($$0);
         if (this.am % 10 == 0) {
            this.c(10.0F);
         }
      } else {
         super.Y();

         for (int $$1 = 1; $$1 < 3; $$1++) {
            if (this.am >= this.cn[$$1 - 1]) {
               this.cn[$$1 - 1] = this.am + 10 + this.al.a(10);
               if ((this.dU().al() == bpx.c || this.dU().al() == bpx.d) && this.co[$$1 - 1]++ > 15) {
                  float $$2 = 10.0F;
                  float $$3 = 5.0F;
                  double $$4 = aym.a(this.al, this.dz() - 10.0, this.dz() + 10.0);
                  double $$5 = aym.a(this.al, this.dB() - 5.0, this.dB() + 5.0);
                  double $$6 = aym.a(this.al, this.dF() - 10.0, this.dF() + 10.0);
                  this.a($$1 + 1, $$4, $$5, $$6, true);
                  this.co[$$1 - 1] = 0;
               }

               int $$7 = this.v($$1);
               if ($$7 > 0) {
                  bso $$8 = (bso)this.dU().a($$7);
                  if ($$8 != null && this.c($$8) && !(this.g((brv)$$8) > 900.0) && this.E($$8)) {
                     this.a($$1 + 1, $$8);
                     this.cn[$$1 - 1] = this.am + 40 + this.al.a(20);
                     this.co[$$1 - 1] = 0;
                  } else {
                     this.a($$1, 0);
                  }
               } else {
                  List<bso> $$9 = this.dU().a(bso.class, cs, this, this.cP().c(20.0, 8.0, 20.0));
                  if (!$$9.isEmpty()) {
                     bso $$10 = $$9.get(this.al.a($$9.size()));
                     this.a($$1, $$10.al());
                  }
               }
            }
         }

         if (this.p() != null) {
            this.a(0, this.p().al());
         } else {
            this.a(0, 0);
         }

         if (this.cp > 0) {
            this.cp--;
            if (this.cp == 0 && this.dU().ab().b(dbw.c)) {
               boolean $$11 = false;
               int $$12 = aym.d(this.do() / 2.0F + 1.0F);
               int $$13 = aym.d(this.dp());

               for (ir $$14 : ir.b(this.dy() - $$12, this.dA(), this.dE() - $$12, this.dy() + $$12, this.dA() + $$13, this.dE() + $$12)) {
                  dtc $$15 = this.dU().a_($$14);
                  if (d($$15)) {
                     $$11 = this.dU().a($$14, true, this) || $$11;
                  }
               }

               if ($$11) {
                  this.dU().a(null, 1022, this.du(), 0);
               }
            }
         }

         if (this.am % 20 == 0) {
            this.c(1.0F);
         }

         this.cq.a(this.eI() / this.eZ());
      }
   }

   public static boolean d(dtc $$0) {
      return !$$0.i() && !$$0.a(awe.aF);
   }

   @Override
   public void r() {
      this.u(220);
      this.cq.a(0.0F);
      this.t(this.eZ() / 3.0F);
   }

   @Override
   public void a(dtc $$0, ewu $$1) {
   }

   @Override
   public void c(aqu $$0) {
      super.c($$0);
      this.cq.a($$0);
   }

   @Override
   public void d(aqu $$0) {
      super.d($$0);
      this.cq.b($$0);
   }

   private double w(int $$0) {
      if ($$0 <= 0) {
         return this.dz();
      } else {
         float $$1 = (this.bj + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = aym.b($$1);
         return this.dz() + (double)$$2 * 1.3 * (double)this.em();
      }
   }

   private double x(int $$0) {
      float $$1 = $$0 <= 0 ? 3.0F : 2.2F;
      return this.dB() + (double)($$1 * this.em());
   }

   private double y(int $$0) {
      if ($$0 <= 0) {
         return this.dF();
      } else {
         float $$1 = (this.bj + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = aym.a($$1);
         return this.dF() + (double)$$2 * 1.3 * (double)this.em();
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = aym.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, bso $$1) {
      this.a($$0, $$1.dz(), $$1.dB() + (double)$$1.cQ() * 0.5, $$1.dF(), $$0 == 0 && this.al.i() < 0.001F);
   }

   private void a(int $$0, double $$1, double $$2, double $$3, boolean $$4) {
      if (!this.ba()) {
         this.dU().a(null, 1024, this.du(), 0);
      }

      double $$5 = this.w($$0);
      double $$6 = this.x($$0);
      double $$7 = this.y($$0);
      double $$8 = $$1 - $$5;
      double $$9 = $$2 - $$6;
      double $$10 = $$3 - $$7;
      cnh $$11 = new cnh(this.dU(), this, $$8, $$9, $$10);
      $$11.c(this);
      if ($$4) {
         $$11.a(true);
      }

      $$11.p($$5, $$6, $$7);
      this.dU().b($$11);
   }

   @Override
   public void a(bso $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.a(awg.u) || $$0.d() instanceof chu) {
         return false;
      } else if (this.x() > 0 && !$$0.a(awg.e)) {
         return false;
      } else {
         if (this.a()) {
            brv $$2 = $$0.c();
            if ($$2 instanceof cme) {
               return false;
            }
         }

         brv $$3 = $$0.d();
         if ($$3 != null && $$3.ak().a(awh.y)) {
            return false;
         } else {
            if (this.cp <= 0) {
               this.cp = 20;
            }

            for (int $$4 = 0; $$4 < this.co.length; $$4++) {
               this.co[$$4] = this.co[$$4] + 3;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void a(bqt $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      cig $$3 = this.a(cuk.wd);
      if ($$3 != null) {
         $$3.A();
      }
   }

   @Override
   public void dG() {
      if (this.dU().al() == bpx.a && this.W()) {
         this.ao();
      } else {
         this.bq = 0;
      }
   }

   @Override
   public boolean b(brh $$0, @Nullable brv $$1) {
      return false;
   }

   public static btu.a t() {
      return cjd.gG().a(btv.q, 300.0).a(btv.r, 0.6F).a(btv.j, 0.6F).a(btv.k, 40.0).a(btv.a, 4.0);
   }

   public float b(int $$0) {
      return this.ck[$$0];
   }

   public float c(int $$0) {
      return this.cj[$$0];
   }

   public int x() {
      return this.as.a(ch);
   }

   public void u(int $$0) {
      this.as.a(ch, $$0);
   }

   public int v(int $$0) {
      return this.as.a(e.get($$0));
   }

   public void a(int $$0, int $$1) {
      this.as.a(e.get($$0), $$1);
   }

   @Override
   public boolean a() {
      return this.eI() <= this.eZ() / 2.0F;
   }

   @Override
   protected boolean o(brv $$0) {
      return false;
   }

   @Override
   public boolean cB() {
      return false;
   }

   @Override
   public boolean c(brh $$0) {
      return $$0.a(brj.t) ? false : super.c($$0);
   }

   class a extends bzl {
      public a() {
         this.a(EnumSet.of(bzl.a.a, bzl.a.c, bzl.a.b));
      }

      @Override
      public boolean a() {
         return chu.this.x() > 0;
      }
   }
}
