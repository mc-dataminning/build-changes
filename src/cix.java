import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cix extends bya {
   public static final double bK = 0.6;
   public static final double bL = 0.8;
   public static final double bM = 1.33;
   private static final akj<je<ciy>> bN = akn.a(cix.class, akl.x);
   private static final akj<Boolean> bO = akn.a(cix.class, akl.k);
   private static final akj<Boolean> bP = akn.a(cix.class, akl.k);
   private static final akj<Integer> bQ = akn.a(cix.class, akl.b);
   private static final alf<ciy> bR = ciz.b;
   @Nullable
   private cix.a<crc> bS;
   @Nullable
   private cfi bT;
   private float bU;
   private float bV;
   private float bW;
   private float bX;
   private boolean bY;
   private float bZ;
   private float ca;

   public cix(bwo<? extends cix> $$0, dja $$1) {
      super($$0, $$1);
      this.gJ();
   }

   @Override
   protected void D() {
      this.bT = new cix.c(this, 0.6, $$0 -> $$0.a(axk.ai), true);
      this.bD.a(1, new cdu(this));
      this.bD.a(1, new bya.a(1.5));
      this.bD.a(2, new cff(this));
      this.bD.a(3, new cix.b(this));
      this.bD.a(4, this.bT);
      this.bD.a(5, new cdn(this, 1.1, 8));
      this.bD.a(6, new cdy(this, 1.0, 10.0F, 5.0F));
      this.bD.a(7, new cdo(this, 0.8));
      this.bD.a(8, new ceg(this, 0.3F));
      this.bD.a(9, new ceq(this));
      this.bD.a(10, new cdm(this, 0.8));
      this.bD.a(11, new cfn(this, 0.8, 1.0000001E-5F));
      this.bD.a(12, new cei(this, crc.class, 10.0F));
      this.bE.a(1, new cfw<>(this, cju.class, false, null));
      this.bE.a(1, new cfw<>(this, ckc.class, false, ckc.bG));
   }

   public je<ciy> gD() {
      return this.al.a(bN);
   }

   private void j(je<ciy> $$0) {
      this.al.a(bN, $$0);
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      if ($$0 == kj.aO) {
         return c((ki<T>)$$0, this.gD());
      } else {
         return $$0 == kj.aP ? c((ki<T>)$$0, this.gF()) : super.a($$0);
      }
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.aO);
      this.a($$0, kj.aP);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.aO) {
         this.j(c(kj.aO, $$1));
         return true;
      } else if ($$0 == kj.aP) {
         this.a(c(kj.aP, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void z(boolean $$0) {
      this.al.a(bO, $$0);
   }

   public boolean gE() {
      return this.al.a(bO);
   }

   void A(boolean $$0) {
      this.al.a(bP, $$0);
   }

   boolean gK() {
      return this.al.a(bP);
   }

   public cyb gF() {
      return cyb.a(this.al.a(bQ));
   }

   private void a(cyb $$0) {
      this.al.a(bQ, $$0.a());
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bN, ctl.a(this.dX(), bR));
      $$0.a(bO, false);
      $$0.a(bP, false);
      $$0.a(bQ, cyb.o.a());
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      ctl.a($$0, this.gD());
      $$0.a("CollarColor", (byte)this.gF().a());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      ctl.a($$0, this.dX(), mg.aH).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cyb.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void a(arq $$0) {
      if (this.L().b()) {
         double $$1 = this.L().c();
         if ($$1 == 0.6) {
            this.b(bxq.f);
            this.h(false);
         } else if ($$1 == 1.33) {
            this.b(bxq.a);
            this.h(true);
         } else {
            this.b(bxq.a);
            this.h(false);
         }
      } else {
         this.b(bxq.a);
         this.h(false);
      }
   }

   @Nullable
   @Override
   protected awm u() {
      if (this.q()) {
         if (this.gB()) {
            return awn.eb;
         } else {
            return this.ae.a(4) == 0 ? awn.ec : awn.dU;
         }
      } else {
         return awn.dV;
      }
   }

   @Override
   public int S() {
      return 120;
   }

   public void gG() {
      this.b(awn.dY);
   }

   @Override
   protected awm e(buu $$0) {
      return awn.ea;
   }

   @Override
   protected awm l_() {
      return awn.dW;
   }

   public static byj.a gH() {
      return ciu.gw().a(byk.s, 10.0).a(byk.v, 0.3F).a(byk.c, 3.0);
   }

   @Override
   protected void gx() {
      this.a(awn.dX, 1.0F, 1.0F);
   }

   @Override
   public void h() {
      super.h();
      if (this.bT != null && this.bT.i() && !this.q() && this.af % 100 == 0) {
         this.a(awn.dZ, 1.0F, 1.0F);
      }

      this.gL();
   }

   private void gL() {
      if ((this.gE() || this.gK()) && this.af % 5 == 0) {
         this.a(awn.eb, 0.6F + 0.4F * (this.ae.i() - this.ae.i()), 1.0F);
      }

      this.gM();
      this.gN();
      this.bY = false;
      if (this.gE()) {
         iu $$0 = this.dv();

         for (crc $$2 : this.dV().a(crc.class, new fel($$0).c(2.0, 2.0, 2.0))) {
            if ($$2.fR()) {
               this.bY = true;
               break;
            }
         }
      }
   }

   public boolean gI() {
      return this.bY;
   }

   private void gM() {
      this.bV = this.bU;
      this.bX = this.bW;
      if (this.gE()) {
         this.bU = Math.min(1.0F, this.bU + 0.15F);
         this.bW = Math.min(1.0F, this.bW + 0.08F);
      } else {
         this.bU = Math.max(0.0F, this.bU - 0.22F);
         this.bW = Math.max(0.0F, this.bW - 0.13F);
      }
   }

   private void gN() {
      this.ca = this.bZ;
      if (this.gK()) {
         this.bZ = Math.min(1.0F, this.bZ + 0.1F);
      } else {
         this.bZ = Math.max(0.0F, this.bZ - 0.13F);
      }
   }

   public float J(float $$0) {
      return azm.h($$0, this.bV, this.bU);
   }

   public float K(float $$0) {
      return azm.h($$0, this.bX, this.bW);
   }

   public float L(float $$0) {
      return azm.h($$0, this.ca, this.bZ);
   }

   @Nullable
   public cix b(arq $$0, bvv $$1) {
      cix $$2 = bwo.u.a($$0, bwn.e);
      if ($$2 != null && $$1 instanceof cix $$3) {
         if (this.ae.h()) {
            $$2.j(this.gD());
         } else {
            $$2.j($$3.gD());
         }

         if (this.q()) {
            $$2.a(this.d());
            $$2.a(true, true);
            cyb $$4 = this.gF();
            cyb $$5 = $$3.gF();
            $$2.a(cyb.a($$0, $$4, $$5));
         }
      }

      return $$2;
   }

   @Override
   public boolean a(ciu $$0) {
      if (!this.q()) {
         return false;
      } else {
         return !($$0 instanceof cix $$1) ? false : $$1.q() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      ciz.a(this.ae, this.dX(), cti.a($$0, this.dv())).ifPresent(this::j);
      return $$3;
   }

   @Override
   public bud b(crc $$0, buc $$1) {
      czd $$2 = $$0.b($$1);
      cyz $$3 = $$2.h();
      if (this.q()) {
         if (this.j($$0)) {
            if ($$3 instanceof cyc $$4) {
               cyb $$5 = $$4.a();
               if ($$5 != this.gF()) {
                  if (!this.dV().w_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.fZ();
                  }

                  return bud.a;
               }
            } else if (this.i($$2) && this.eG() < this.eU()) {
               if (!this.dV().w_()) {
                  this.a($$0, $$1, $$2);
                  cus $$6 = $$2.a(kj.v);
                  this.c($$6 != null ? (float)$$6.a() : 1.0F);
                  this.gx();
               }

               return bud.a;
            }

            bud $$7 = super.b($$0, $$1);
            if (!$$7.a()) {
               this.y(!this.gr());
               return bud.a;
            }

            return $$7;
         }
      } else if (this.i($$2)) {
         if (!this.dV().w_()) {
            this.a($$0, $$1, $$2);
            this.f($$0);
            this.fZ();
            this.gx();
         }

         return bud.a;
      }

      bud $$8 = super.b($$0, $$1);
      if ($$8.a()) {
         this.fZ();
      }

      return $$8;
   }

   @Override
   public boolean i(czd $$0) {
      return $$0.a(axk.ai);
   }

   @Override
   public boolean h(double $$0) {
      return !this.q() && this.af > 2400;
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      super.a($$0, $$1);
      this.gJ();
   }

   protected void gJ() {
      if (this.bS == null) {
         this.bS = new cix.a<>(this, crc.class, 16.0F, 0.8, 1.33);
      }

      this.bD.a(this.bS);
      if (!this.q()) {
         this.bD.a(4, this.bS);
      }
   }

   private void f(crc $$0) {
      if (this.ae.a(3) == 0) {
         this.a($$0);
         this.y(true);
         this.dV().a(this, (byte)7);
      } else {
         this.dV().a(this, (byte)6);
      }
   }

   @Override
   public boolean ce() {
      return this.ci() || super.ce();
   }

   static class a<T extends bxe> extends cdh<T> {
      private final cix i;

      public a(cix $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bwm.e::test);
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

   static class b extends cea {
      private final cix a;
      @Nullable
      private crc b;
      @Nullable
      private iu c;
      private int d;

      public b(cix $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (!this.a.q()) {
            return false;
         } else if (this.a.gr()) {
            return false;
         } else {
            bxe $$0 = this.a.e();
            if ($$0 instanceof crc $$1) {
               this.b = $$1;
               if (!$$0.fR()) {
                  return false;
               }

               if (this.a.g(this.b) > 100.0) {
                  return false;
               }

               iu $$2 = this.b.dv();
               eah $$3 = this.a.dV().a_($$2);
               if ($$3.a(axc.T)) {
                  this.c = $$3.d(dly.e).map($$1x -> $$2.a($$1x.g())).orElseGet(() -> new iu($$2));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (cix $$1 : this.a.dV().a(cix.class, new fel(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gE() || $$1.gK())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean c() {
         return this.a.q() && !this.a.gr() && this.b != null && this.b.fR() && this.c != null && !this.h();
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
         if (this.b.gp() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dV().C_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.A(false);
         this.a.O().m();
      }

      private void i() {
         azv $$0 = this.a.dY();
         iu.a $$1 = new iu.a();
         $$1.g(this.a.O_() ? this.a.C().dv() : this.a.dv());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dv());
         this.a
            .a(
               a(this.a),
               ezd.aq,
               ($$1x, $$2) -> $$1x.b(
                     new cnh(
                        $$1x,
                        (double)$$1.u() - (double)azm.a(this.a.aV * (float) (Math.PI / 180.0)),
                        (double)$$1.v(),
                        (double)$$1.w() + (double)azm.b(this.a.aV * (float) (Math.PI / 180.0)),
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

   static class c extends cfi {
      @Nullable
      private crc c;
      private final cix d;

      public c(cix $$0, double $$1, Predicate<czd> $$2, boolean $$3) {
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
