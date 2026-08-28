import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ciw extends cke implements bud, cki {
   private static final akk<Integer> b = ako.a(ciw.class, akm.b);
   private static final akk<Integer> c = ako.a(ciw.class, akm.b);
   private static final akk<Integer> d = ako.a(ciw.class, akm.b);
   private static final List<akk<Integer>> e = ImmutableList.of(b, c, d);
   private static final akk<Integer> bY = ako.a(ciw.class, akm.b);
   private static final int bZ = 220;
   private final float[] ca = new float[2];
   private final float[] cb = new float[2];
   private final float[] cc = new float[2];
   private final float[] cd = new float[2];
   private final int[] ce = new int[2];
   private final int[] cf = new int[2];
   private int cg;
   private final arc ch = (arc)new arc(this.O_(), bql.a.f, bql.b.a).a(true);
   private static final Predicate<btq> ci = $$0 -> !$$0.ak().a(awt.y) && $$0.fH();
   private static final ceh cj = ceh.a().a(20.0).a(ci);

   public ciw(btb<? extends ciw> $$0, dbz $$1) {
      super($$0, $$1);
      this.bP = new bzo(this, 10, false);
      this.t(this.eR());
      this.bN = 50;
   }

   @Override
   protected cdc b(dbz $$0) {
      cda $$1 = new cda(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void z() {
      this.bS.a(0, new ciw.a());
      this.bS.a(2, new cbn(this, 1.0, 40, 20.0F));
      this.bS.a(5, new cca(this, 1.0));
      this.bS.a(6, new caw(this, cmy.class, 8.0F));
      this.bS.a(7, new cbj(this));
      this.bT.a(1, new ccg(this));
      this.bT.a(2, new cch<>(this, btq.class, 0, false, false, ci));
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(b, 0);
      $$0.a(c, 0);
      $$0.a(d, 0);
      $$0.a(bY, 0);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("Invul", this.y());
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.t($$0.h("Invul"));
      if (this.ag()) {
         this.ch.a(this.O_());
      }
   }

   @Override
   public void b(@Nullable xp $$0) {
      super.b($$0);
      this.ch.a(this.O_());
   }

   @Override
   protected avz v() {
      return awa.Cu;
   }

   @Override
   protected avz d(bro $$0) {
      return awa.Cx;
   }

   @Override
   protected avz o_() {
      return awa.Cw;
   }

   @Override
   public void n_() {
      evs $$0 = this.ds().d(1.0, 0.6, 1.0);
      if (!this.dP().B && this.u(0) > 0) {
         bsv $$1 = this.dP().a(this.u(0));
         if ($$1 != null) {
            double $$2 = $$0.d;
            if (this.dw() < $$1.dw() || !this.a() && this.dw() < $$1.dw() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new evs($$0.c, $$2, $$0.e);
            evs $$3 = new evs($$1.du() - this.du(), 0.0, $$1.dA() - this.dA());
            if ($$3.i() > 9.0) {
               evs $$4 = $$3.d();
               $$0 = $$0.b($$4.c * 0.3 - $$0.c * 0.6, 0.0, $$4.e * 0.3 - $$0.e * 0.6);
            }
         }
      }

      this.h($$0);
      if ($$0.i() > 0.05) {
         this.r((float)ayz.d($$0.e, $$0.c) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.n_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.cd[$$5] = this.cb[$$5];
         this.cc[$$5] = this.ca[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.u($$6 + 1);
         bsv $$8 = null;
         if ($$7 > 0) {
            $$8 = this.dP().a($$7);
         }

         if ($$8 != null) {
            double $$9 = this.v($$6 + 1);
            double $$10 = this.w($$6 + 1);
            double $$11 = this.x($$6 + 1);
            double $$12 = $$8.du() - $$9;
            double $$13 = $$8.dy() - $$10;
            double $$14 = $$8.dA() - $$11;
            double $$15 = Math.sqrt($$12 * $$12 + $$14 * $$14);
            float $$16 = (float)(ayz.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(ayz.d($$13, $$15) * 180.0F / (float)Math.PI));
            this.ca[$$6] = this.a(this.ca[$$6], $$17, 40.0F);
            this.cb[$$6] = this.a(this.cb[$$6], $$16, 10.0F);
         } else {
            this.cb[$$6] = this.a(this.cb[$$6], this.aY, 10.0F);
         }
      }

      boolean $$18 = this.a();

      for (int $$19 = 0; $$19 < 3; $$19++) {
         double $$20 = this.v($$19);
         double $$21 = this.w($$19);
         double $$22 = this.x($$19);
         float $$23 = 0.3F * this.ee();
         this.dP().a(li.ae, $$20 + this.ah.k() * (double)$$23, $$21 + this.ah.k() * (double)$$23, $$22 + this.ah.k() * (double)$$23, 0.0, 0.0, 0.0);
         if ($$18 && this.dP().z.a(4) == 0) {
            this.dP()
               .a(
                  lb.a(li.u, 0.7F, 0.7F, 0.5F),
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
         float $$24 = 3.3F * this.ee();

         for (int $$25 = 0; $$25 < 3; $$25++) {
            this.dP()
               .a(lb.a(li.u, 0.7F, 0.7F, 0.9F), this.du() + this.ah.k(), this.dw() + (double)(this.ah.i() * $$24), this.dA() + this.ah.k(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void Z() {
      if (this.y() > 0) {
         int $$0 = this.y() - 1;
         this.ch.a(1.0F - (float)$$0 / 220.0F);
         if ($$0 <= 0) {
            this.dP().a(this, this.du(), this.dy(), this.dA(), 7.0F, false, dbz.a.c);
            if (!this.aW()) {
               this.dP().b(1023, this.dp(), 0);
            }
         }

         this.t($$0);
         if (this.ai % 10 == 0) {
            this.c(10.0F);
         }
      } else {
         super.Z();

         for (int $$1 = 1; $$1 < 3; $$1++) {
            if (this.ai >= this.ce[$$1 - 1]) {
               this.ce[$$1 - 1] = this.ai + 10 + this.ah.a(10);
               if ((this.dP().al() == bqs.c || this.dP().al() == bqs.d) && this.cf[$$1 - 1]++ > 15) {
                  float $$2 = 10.0F;
                  float $$3 = 5.0F;
                  double $$4 = ayz.a(this.ah, this.du() - 10.0, this.du() + 10.0);
                  double $$5 = ayz.a(this.ah, this.dw() - 5.0, this.dw() + 5.0);
                  double $$6 = ayz.a(this.ah, this.dA() - 10.0, this.dA() + 10.0);
                  this.a($$1 + 1, $$4, $$5, $$6, true);
                  this.cf[$$1 - 1] = 0;
               }

               int $$7 = this.u($$1);
               if ($$7 > 0) {
                  btq $$8 = (btq)this.dP().a($$7);
                  if ($$8 != null && this.c($$8) && !(this.g((bsv)$$8) > 900.0) && this.E($$8)) {
                     this.a($$1 + 1, $$8);
                     this.ce[$$1 - 1] = this.ai + 40 + this.ah.a(20);
                     this.cf[$$1 - 1] = 0;
                  } else {
                     this.a($$1, 0);
                  }
               } else {
                  List<btq> $$9 = this.dP().a(btq.class, cj, this, this.cK().c(20.0, 8.0, 20.0));
                  if (!$$9.isEmpty()) {
                     btq $$10 = $$9.get(this.ah.a($$9.size()));
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

         if (this.cg > 0) {
            this.cg--;
            if (this.cg == 0 && this.dP().ab().b(dbv.c)) {
               boolean $$11 = false;
               int $$12 = ayz.d(this.dj() / 2.0F + 1.0F);
               int $$13 = ayz.d(this.dk());

               for (iz $$14 : iz.b(this.dt() - $$12, this.dv(), this.dz() - $$12, this.dt() + $$12, this.dv() + $$13, this.dz() + $$12)) {
                  dsd $$15 = this.dP().a_($$14);
                  if (d($$15)) {
                     $$11 = this.dP().a($$14, true, this) || $$11;
                  }
               }

               if ($$11) {
                  this.dP().a(null, 1022, this.dp(), 0);
               }
            }
         }

         if (this.ai % 20 == 0) {
            this.c(1.0F);
         }

         this.ch.a(this.eA() / this.eR());
      }
   }

   public static boolean d(dsd $$0) {
      return !$$0.i() && !$$0.a(awp.aE);
   }

   @Override
   public void s() {
      this.t(220);
      this.ch.a(0.0F);
      this.t(this.eR() / 3.0F);
   }

   @Override
   public void a(dsd $$0, evs $$1) {
   }

   @Override
   public void c(arg $$0) {
      super.c($$0);
      this.ch.a($$0);
   }

   @Override
   public void d(arg $$0) {
      super.d($$0);
      this.ch.b($$0);
   }

   private double v(int $$0) {
      if ($$0 <= 0) {
         return this.du();
      } else {
         float $$1 = (this.aY + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = ayz.b($$1);
         return this.du() + (double)$$2 * 1.3 * (double)this.ee();
      }
   }

   private double w(int $$0) {
      float $$1 = $$0 <= 0 ? 3.0F : 2.2F;
      return this.dw() + (double)($$1 * this.ee());
   }

   private double x(int $$0) {
      if ($$0 <= 0) {
         return this.dA();
      } else {
         float $$1 = (this.aY + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = ayz.a($$1);
         return this.dA() + (double)$$2 * 1.3 * (double)this.ee();
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = ayz.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, btq $$1) {
      this.a($$0, $$1.du(), $$1.dw() + (double)$$1.cL() * 0.5, $$1.dA(), $$0 == 0 && this.ah.i() < 0.001F);
   }

   private void a(int $$0, double $$1, double $$2, double $$3, boolean $$4) {
      if (!this.aW()) {
         this.dP().a(null, 1024, this.dp(), 0);
      }

      double $$5 = this.v($$0);
      double $$6 = this.w($$0);
      double $$7 = this.x($$0);
      double $$8 = $$1 - $$5;
      double $$9 = $$2 - $$6;
      double $$10 = $$3 - $$7;
      coe $$11 = new coe(this.dP(), this, $$8, $$9, $$10);
      $$11.c(this);
      if ($$4) {
         $$11.a(true);
      }

      $$11.p($$5, $$6, $$7);
      this.dP().b($$11);
   }

   @Override
   public void a(btq $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(bro $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.a(awr.u) || $$0.d() instanceof ciw) {
         return false;
      } else if (this.y() > 0 && !$$0.a(awr.e)) {
         return false;
      } else {
         if (this.a()) {
            bsv $$2 = $$0.c();
            if ($$2 instanceof cne || $$2 instanceof coi) {
               return false;
            }
         }

         bsv $$3 = $$0.d();
         if ($$3 != null && $$3.ak().a(awt.y)) {
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
   protected void a(bro $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      cji $$3 = this.a(cut.us);
      if ($$3 != null) {
         $$3.A();
      }
   }

   @Override
   public void dB() {
      if (this.dP().al() == bqs.a && this.X()) {
         this.ao();
      } else {
         this.bf = 0;
      }
   }

   @Override
   public boolean b(bsd $$0, @Nullable bsv $$1) {
      return false;
   }

   public static bux.a u() {
      return cke.gw().a(buy.q, 300.0).a(buy.r, 0.6F).a(buy.j, 0.6F).a(buy.k, 40.0).a(buy.a, 4.0);
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
      return this.eA() <= this.eR() / 2.0F;
   }

   @Override
   protected boolean o(bsv $$0) {
      return false;
   }

   @Override
   public boolean cw() {
      return false;
   }

   @Override
   public boolean c(bsd $$0) {
      return $$0.a(bsf.t) ? false : super.c($$0);
   }

   class a extends cao {
      public a() {
         this.a(EnumSet.of(cao.a.a, cao.a.c, cao.a.b));
      }

      @Override
      public boolean a() {
         return ciw.this.y() > 0;
      }
   }
}
