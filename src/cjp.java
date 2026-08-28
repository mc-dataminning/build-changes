import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjp extends bys {
   public static final double bM = 0.6;
   public static final double bN = 0.8;
   public static final double bO = 1.33;
   private static final akn<jg<cjq>> bP = akr.a(cjp.class, akp.x);
   private static final akn<Boolean> bQ = akr.a(cjp.class, akp.k);
   private static final akn<Boolean> bR = akr.a(cjp.class, akp.k);
   private static final akn<Integer> bS = akr.a(cjp.class, akp.b);
   private static final alj<cjq> bT = cjr.b;
   private static final cyy bU = cyy.o;
   @Nullable
   private cjp.a<crz> bV;
   @Nullable
   private cga bW;
   private float bX;
   private float bY;
   private float bZ;
   private float ca;
   private boolean cb;
   private float cc;
   private float cd;

   public cjp(bxe<? extends cjp> $$0, djz $$1) {
      super($$0, $$1);
      this.gM();
   }

   @Override
   protected void D() {
      this.bW = new cjp.c(this, 0.6, $$0 -> $$0.a(axo.aj), true);
      this.bF.a(1, new cem(this));
      this.bF.a(1, new bys.a(1.5));
      this.bF.a(2, new cfx(this));
      this.bF.a(3, new cjp.b(this));
      this.bF.a(4, this.bW);
      this.bF.a(5, new cef(this, 1.1, 8));
      this.bF.a(6, new ceq(this, 1.0, 10.0F, 5.0F));
      this.bF.a(7, new ceg(this, 0.8));
      this.bF.a(8, new cey(this, 0.3F));
      this.bF.a(9, new cfi(this));
      this.bF.a(10, new cee(this, 0.8));
      this.bF.a(11, new cgf(this, 0.8, 1.0000001E-5F));
      this.bF.a(12, new cfa(this, crz.class, 10.0F));
      this.bG.a(1, new cgo<>(this, ckm.class, false, null));
      this.bG.a(1, new cgo<>(this, ckt.class, false, ckt.bI));
   }

   public jg<cjq> gG() {
      return this.al.a(bP);
   }

   private void j(jg<cjq> $$0) {
      this.al.a(bP, $$0);
   }

   @Nullable
   @Override
   public <T> T a(kk<? extends T> $$0) {
      if ($$0 == kl.aP) {
         return c((kk<T>)$$0, this.gG());
      } else {
         return $$0 == kl.aQ ? c((kk<T>)$$0, this.gI()) : super.a($$0);
      }
   }

   @Override
   protected void a(kg $$0) {
      this.a($$0, kl.aP);
      this.a($$0, kl.aQ);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kk<T> $$0, T $$1) {
      if ($$0 == kl.aP) {
         this.j(c(kl.aP, $$1));
         return true;
      } else if ($$0 == kl.aQ) {
         this.a(c(kl.aQ, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void z(boolean $$0) {
      this.al.a(bQ, $$0);
   }

   public boolean gH() {
      return this.al.a(bQ);
   }

   void A(boolean $$0) {
      this.al.a(bR, $$0);
   }

   boolean gN() {
      return this.al.a(bR);
   }

   public cyy gI() {
      return cyy.a(this.al.a(bS));
   }

   private void a(cyy $$0) {
      this.al.a(bS, $$0.a());
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(bP, cui.a(this.dX(), bT));
      $$0.a(bQ, false);
      $$0.a(bR, false);
      $$0.a(bS, bU.a());
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      cui.a($$0, this.gG());
      $$0.a("CollarColor", cyy.s, this.gI());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      cui.a($$0, this.dX(), mi.aH).ifPresent(this::j);
      this.a($$0.<cyy>a("CollarColor", cyy.s).orElse(bU));
   }

   @Override
   public void a(aru $$0) {
      if (this.L().b()) {
         double $$1 = this.L().c();
         if ($$1 == 0.6) {
            this.b(byi.f);
            this.h(false);
         } else if ($$1 == 1.33) {
            this.b(byi.a);
            this.h(true);
         } else {
            this.b(byi.a);
            this.h(false);
         }
      } else {
         this.b(byi.a);
         this.h(false);
      }
   }

   @Nullable
   @Override
   protected awq u() {
      if (this.q()) {
         if (this.gE()) {
            return awr.eb;
         } else {
            return this.ae.a(4) == 0 ? awr.ec : awr.dU;
         }
      } else {
         return awr.dV;
      }
   }

   @Override
   public int S() {
      return 120;
   }

   public void gJ() {
      this.b(awr.dY);
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.ea;
   }

   @Override
   protected awq l_() {
      return awr.dW;
   }

   public static bzb.a gK() {
      return cjm.gz().a(bzc.s, 10.0).a(bzc.v, 0.3F).a(bzc.c, 3.0);
   }

   @Override
   protected void gA() {
      this.a(awr.dX, 1.0F, 1.0F);
   }

   @Override
   public void h() {
      super.h();
      if (this.bW != null && this.bW.i() && !this.q() && this.af % 100 == 0) {
         this.a(awr.dZ, 1.0F, 1.0F);
      }

      this.gO();
   }

   private void gO() {
      if ((this.gH() || this.gN()) && this.af % 5 == 0) {
         this.a(awr.eb, 0.6F + 0.4F * (this.ae.i() - this.ae.i()), 1.0F);
      }

      this.gP();
      this.gQ();
      this.cb = false;
      if (this.gH()) {
         iw $$0 = this.dv();

         for (crz $$2 : this.dV().a(crz.class, new ffn($$0).c(2.0, 2.0, 2.0))) {
            if ($$2.fR()) {
               this.cb = true;
               break;
            }
         }
      }
   }

   public boolean gL() {
      return this.cb;
   }

   private void gP() {
      this.bY = this.bX;
      this.ca = this.bZ;
      if (this.gH()) {
         this.bX = Math.min(1.0F, this.bX + 0.15F);
         this.bZ = Math.min(1.0F, this.bZ + 0.08F);
      } else {
         this.bX = Math.max(0.0F, this.bX - 0.22F);
         this.bZ = Math.max(0.0F, this.bZ - 0.13F);
      }
   }

   private void gQ() {
      this.cd = this.cc;
      if (this.gN()) {
         this.cc = Math.min(1.0F, this.cc + 0.1F);
      } else {
         this.cc = Math.max(0.0F, this.cc - 0.13F);
      }
   }

   public float J(float $$0) {
      return azq.h($$0, this.bY, this.bX);
   }

   public float K(float $$0) {
      return azq.h($$0, this.ca, this.bZ);
   }

   public float L(float $$0) {
      return azq.h($$0, this.cd, this.cc);
   }

   @Nullable
   public cjp b(aru $$0, bwl $$1) {
      cjp $$2 = bxe.v.a($$0, bxd.e);
      if ($$2 != null && $$1 instanceof cjp $$3) {
         if (this.ae.h()) {
            $$2.j(this.gG());
         } else {
            $$2.j($$3.gG());
         }

         if (this.q()) {
            $$2.a(this.d());
            $$2.a(true, true);
            cyy $$4 = this.gI();
            cyy $$5 = $$3.gI();
            $$2.a(cyy.a($$0, $$4, $$5));
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cjm $$0) {
      if (!this.q()) {
         return false;
      } else {
         return !($$0 instanceof cjp $$1) ? false : $$1.q() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      cjr.a(this.ae, this.dX(), cuf.a($$0, this.dv())).ifPresent(this::j);
      return $$3;
   }

   @Override
   public but b(crz $$0, bus $$1) {
      daa $$2 = $$0.b($$1);
      czw $$3 = $$2.h();
      if (this.q()) {
         if (this.j($$0)) {
            if ($$3 instanceof cyz $$4) {
               cyy $$5 = $$4.a();
               if ($$5 != this.gI()) {
                  if (!this.dV().A_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.gc();
                  }

                  return but.a;
               }
            } else if (this.i($$2) && this.eG() < this.eU()) {
               if (!this.dV().A_()) {
                  this.a($$0, $$1, $$2);
                  cvp $$6 = $$2.a(kl.v);
                  this.c($$6 != null ? (float)$$6.a() : 1.0F);
                  this.gA();
               }

               return but.a;
            }

            but $$7 = super.b($$0, $$1);
            if (!$$7.a()) {
               this.y(!this.gu());
               return but.a;
            }

            return $$7;
         }
      } else if (this.i($$2)) {
         if (!this.dV().A_()) {
            this.a($$0, $$1, $$2);
            this.f($$0);
            this.gc();
            this.gA();
         }

         return but.a;
      }

      but $$8 = super.b($$0, $$1);
      if ($$8.a()) {
         this.gc();
      }

      return $$8;
   }

   @Override
   public boolean i(daa $$0) {
      return $$0.a(axo.aj);
   }

   @Override
   public boolean h(double $$0) {
      return !this.q() && this.af > 2400;
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      super.a($$0, $$1);
      this.gM();
   }

   protected void gM() {
      if (this.bV == null) {
         this.bV = new cjp.a<>(this, crz.class, 16.0F, 0.8, 1.33);
      }

      this.bF.a(this.bV);
      if (!this.q()) {
         this.bF.a(4, this.bV);
      }
   }

   private void f(crz $$0) {
      if (this.ae.a(3) == 0) {
         this.a($$0);
         this.y(true);
         this.dV().a(this, (byte)7);
      } else {
         this.dV().a(this, (byte)6);
      }
   }

   @Override
   public boolean cd() {
      return this.ch() || super.cd();
   }

   static class a<T extends bxw> extends cdz<T> {
      private final cjp i;

      public a(cjp $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bxc.e::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.i.q() && super.b();
      }

      @Override
      public boolean c() {
         return !this.i.q() && super.c();
      }
   }

   static class b extends ces {
      private final cjp a;
      @Nullable
      private crz b;
      @Nullable
      private iw c;
      private int d;

      public b(cjp $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (!this.a.q()) {
            return false;
         } else if (this.a.gu()) {
            return false;
         } else {
            bxw $$0 = this.a.e();
            if ($$0 instanceof crz $$1) {
               this.b = $$1;
               if (!$$0.fR()) {
                  return false;
               }

               if (this.a.g(this.b) > 100.0) {
                  return false;
               }

               iw $$2 = this.b.dv();
               ebg $$3 = this.a.dV().a_($$2);
               if ($$3.a(axg.T)) {
                  this.c = $$3.d(dmx.e).map($$1x -> $$2.a($$1x.g())).orElseGet(() -> new iw($$2));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (cjp $$1 : this.a.dV().a(cjp.class, new ffn(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gH() || $$1.gN())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean c() {
         return this.a.q() && !this.a.gu() && this.b != null && this.b.fR() && this.c != null && !this.h();
      }

      @Override
      public void d() {
         if (this.c != null) {
            this.a.x(false);
            this.a.O().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
         }
      }

      @Override
      public void e() {
         this.a.z(false);
         float $$0 = this.a.dV().f(1.0F);
         if (this.b.gp() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dV().G_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.A(false);
         this.a.O().m();
      }

      private void i() {
         azz $$0 = this.a.dY();
         iw.a $$1 = new iw.a();
         $$1.g(this.a.S_() ? this.a.C().dv() : this.a.dv());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dv());
         this.a
            .a(
               a(this.a),
               faf.aq,
               ($$1x, $$2) -> $$1x.b(
                     new coe(
                        $$1x,
                        (double)$$1.u() - (double)azq.a(this.a.aV * (float) (Math.PI / 180.0)),
                        (double)$$1.v(),
                        (double)$$1.w() + (double)azq.b(this.a.aV * (float) (Math.PI / 180.0)),
                        $$2
                     )
                  )
            );
      }

      @Override
      public void a() {
         if (this.b != null && this.c != null) {
            this.a.x(false);
            this.a.O().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
            if (this.a.g(this.b) < 2.5) {
               this.d++;
               if (this.d > this.a(16)) {
                  this.a.z(true);
                  this.a.A(false);
               } else {
                  this.a.a(this.b, 45.0F, 45.0F);
                  this.a.A(true);
               }
            } else {
               this.a.z(false);
            }
         }
      }
   }

   static class c extends cga {
      @Nullable
      private crz c;
      private final cjp d;

      public c(cjp $$0, double $$1, Predicate<daa> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      public void a() {
         super.a();
         if (this.c == null && this.a.dY().a(this.a(600)) == 0) {
            this.c = this.b;
         } else if (this.a.dY().a(this.a(500)) == 0) {
            this.c = null;
         }
      }

      @Override
      protected boolean h() {
         return this.c != null && this.c.equals(this.b) ? false : super.h();
      }

      @Override
      public boolean b() {
         return super.b() && !this.d.q();
      }
   }
}
