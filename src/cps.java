import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cps extends coo {
   private static final akj<Boolean> bL = akn.a(cps.class, akl.k);
   private static final akj<Boolean> bM = akn.a(cps.class, akl.k);
   private static final akj<Boolean> bN = akn.a(cps.class, akl.k);
   private static final akj<Optional<iv>> bO = akn.a(cps.class, akl.p);
   private static final int bP = 15;
   private static final int bQ = 1;
   private static final float bR = 3.0F;
   private static final float bS = 32.0F;
   private static final float bT = 144.0F;
   public static final int a = 40;
   private static final float bU = 0.4F;
   public static final float b = 0.3F;
   public static final int c = 16545810;
   public static final int d = 6250335;
   public static final int bG = 8;
   public static final int bH = 45;
   private static final int bV = 4;
   private int bW;
   public final bvz bI = new bvz();
   public final bvz bJ = new bvz();
   public final bvz bK = new bvz();
   private int bX;
   private boolean bY;
   private int bZ;
   private int ca;

   public cps(bwr<? extends cps> $$0, djm $$1) {
      super($$0, $$1);
      this.bz = new cps.c(this);
      this.bA = new cps.d(this);
      this.bB = new cps.b(this);
      cgs $$2 = (cgs)this.O();
      $$2.a(true);
      this.by = 0;
   }

   public void h(iv $$0) {
      this.i($$0);
      this.a(exr.q, 8.0F);
      this.a(exr.f, 8.0F);
      this.a(exr.i, 8.0F);
      this.a(exr.o, 0.0F);
      this.a(exr.n, 0.0F);
   }

   public boolean j() {
      return this.x() != null;
   }

   @Override
   protected cdd I() {
      return new cps.a(this);
   }

   @Override
   protected byj.b<cps> ec() {
      return cpt.a();
   }

   @Override
   protected byj<?> a(Dynamic<?> $$0) {
      return cpt.b(this, this.ec().a($$0));
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bL, true);
      $$0.a(bM, false);
      $$0.a(bN, false);
      $$0.a(bO, Optional.empty());
   }

   public static byo.a m() {
      return coo.gw().a(byp.s, 1.0).a(byp.v, 0.4F).a(byp.c, 3.0).a(byp.m, 32.0).a(byp.B, 1.0625);
   }

   public boolean n() {
      return this.al.a(bL);
   }

   @Override
   public boolean c(arq $$0, bwi $$1) {
      if (!($$1 instanceof bxj)) {
         return false;
      } else {
         this.bW = 15;
         this.dU().a(this, (byte)4);
         return super.c($$0, $$1);
      }
   }

   @Override
   public boolean a(arq $$0, bux $$1, float $$2) {
      iv $$3 = this.x();
      if ($$3 == null || $$1.a(axd.d)) {
         return super.a($$0, $$1, $$2);
      } else if (!this.a($$0, $$1) && this.bX <= 0 && !this.eG()) {
         crm $$4 = this.i($$1);
         bwi $$5 = $$1.c();
         if (!($$5 instanceof bxj) && !($$5 instanceof csh) && $$4 == null) {
            return false;
         } else {
            this.bX = 8;
            this.dU().a(this, (byte)66);
            this.a(eft.u);
            if (this.dU().c_($$3) instanceof dyh $$6 && $$6.b(this)) {
               if ($$4 != null) {
                  $$6.c();
               }

               this.h($$1);
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public crm i(bux $$0) {
      this.f($$0);
      return this.g($$0);
   }

   @Override
   public boolean bF() {
      return super.bF() && this.n();
   }

   @Override
   public void i(double $$0, double $$1, double $$2) {
      if (this.n()) {
         super.i($$0, $$1, $$2);
      }
   }

   @Override
   public byj<cps> eb() {
      return (byj<cps>)super.eb();
   }

   @Override
   protected void a(arq $$0) {
      bqq $$1 = bqp.a();
      $$1.a("creakingBrain");
      this.eb().a((arq)this.dU(), this);
      $$1.c();
      cpt.a(this);
   }

   @Override
   public void k_() {
      if (this.bX > 0) {
         this.bX--;
      }

      if (this.bW > 0) {
         this.bW--;
      }

      if (!this.dU().C) {
         boolean $$0 = this.al.a(bL);
         boolean $$1 = this.gz();
         if ($$1 != $$0) {
            this.a(eft.u);
            if ($$1) {
               this.b(awn.gt);
            } else {
               this.W();
               this.b(awn.gs);
            }
         }

         this.al.a(bL, $$1);
      }

      super.k_();
   }

   @Override
   public void h() {
      if (!this.dU().C) {
         iv $$0 = this.x();
         if ($$0 != null) {
            boolean var10000;
            label21: {
               if (this.dU().c_($$0) instanceof dyh $$1 && $$1.b(this)) {
                  var10000 = true;
                  break label21;
               }

               var10000 = false;
            }

            boolean $$2 = var10000;
            if (!$$2) {
               this.d(0.0F);
            }
         }
      }

      super.h();
      if (this.dU().C) {
         this.gC();
         this.gy();
      }
   }

   @Override
   protected void em() {
      if (this.j() && this.gu()) {
         this.aP++;
         if (!this.dU().w_() && this.aP > 45 && !this.dP()) {
            this.q();
         }
      } else {
         super.em();
      }
   }

   @Override
   protected void A(float $$0) {
      float $$1 = Math.min($$0 * 25.0F, 3.0F);
      this.aT.a($$1, 0.4F, 1.0F);
   }

   private void gC() {
      this.bI.a(this.bW > 0, this.af);
      this.bJ.a(this.bX > 0, this.af);
      this.bK.a(this.gu(), this.af);
   }

   @Override
   public void q() {
      if (this.dU() instanceof arq $$0) {
         fex $$1 = this.cQ();
         ffc $$2 = $$1.f();
         double $$3 = $$1.b() * 0.3;
         double $$4 = $$1.c() * 0.3;
         double $$5 = $$1.d() * 0.3;
         $$0.a(new lq(ly.bi, dmt.u.m()), $$2.d, $$2.e, $$2.f, 100, $$3, $$4, $$5, 0.0);
         $$0.a(new lq(ly.bi, dmt.cE.m().b(don.c, ebn.c)), $$2.d, $$2.e, $$2.f, 10, $$3, $$4, $$5, 0.0);
      }

      this.b(this.l_());
      this.a(bwi.d.b);
   }

   public void j(bux $$0) {
      this.i($$0);
      this.a($$0);
      this.b(awn.gw);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 66) {
         this.bX = 8;
         this.h(this.dV().p());
      } else if ($$0 == 4) {
         this.bW = 15;
         this.gm();
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean bg() {
      return this.j() || super.bg();
   }

   @Override
   protected boolean r(bwi $$0) {
      return !this.j() && super.r($$0);
   }

   @Override
   protected boolean bO() {
      return !this.j() && super.bO();
   }

   @Override
   protected void p(bwi $$0) {
      if (this.j()) {
         throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
      }
   }

   @Override
   public boolean n(boolean $$0) {
      return !this.j() && super.n($$0);
   }

   @Override
   protected cgt b(djm $$0) {
      return new cps.e(this, $$0);
   }

   public boolean t() {
      List<crm> $$0 = this.bs.c(cgl.j).orElse(List.of());
      if ($$0.isEmpty()) {
         this.ca = 0;
         return false;
      } else {
         fex $$1 = this.cQ();

         for (crm $$2 : $$0) {
            if ($$1.d($$2.bC())) {
               this.ca++;
               return this.ca > 4;
            }
         }

         this.ca = 0;
         return false;
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      $$0.<iv>a("home_pos", iv.a).ifPresent(this::h);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.b("home_pos", iv.a, this.x());
   }

   public void i(iv $$0) {
      this.al.a(bO, Optional.of($$0));
   }

   @Nullable
   public iv x() {
      return this.al.a(bO).orElse(null);
   }

   public void gt() {
      this.al.a(bN, true);
   }

   public boolean gu() {
      return this.al.a(bN);
   }

   public boolean gx() {
      return this.bY;
   }

   public void gy() {
      if (this.aP > this.bZ) {
         this.bZ = this.aP + this.dX().a(this.bY ? 2 : this.aP / 4, this.bY ? 8 : this.aP / 2);
         this.bY = !this.bY;
      }
   }

   @Override
   public void gm() {
      this.b(awn.gp);
   }

   @Override
   protected awm u() {
      return this.gB() ? null : awn.gm;
   }

   @Override
   protected awm e(bux $$0) {
      return this.j() ? awn.gv : super.e($$0);
   }

   @Override
   protected awm l_() {
      return awn.gq;
   }

   @Override
   protected void b(iv $$0, eat $$1) {
      this.a(awn.gr, 0.15F, 1.0F);
   }

   @Nullable
   @Override
   public bxj f() {
      return this.Q();
   }

   @Override
   protected void ac() {
      super.ac();
      agm.a(this);
   }

   @Override
   public void p(double $$0, double $$1, double $$2) {
      if (this.n()) {
         super.p($$0, $$1, $$2);
      }
   }

   public boolean gz() {
      List<crm> $$0 = this.bs.c(cgl.j).orElse(List.of());
      boolean $$1 = this.gB();
      if ($$0.isEmpty()) {
         if ($$1) {
            this.gA();
         }

         return true;
      } else {
         boolean $$2 = false;

         for (crm $$3 : $$0) {
            if (this.c((bxj)$$3) && !this.s($$3)) {
               $$2 = true;
               if ((!$$1 || bxj.aH.test($$3))
                  && this.a($$3, 0.5, false, true, new double[]{this.dD(), this.dB() + 0.5 * (double)this.ek(), (this.dD() + this.dB()) / 2.0})) {
                  if ($$1) {
                     return false;
                  }

                  if ($$3.g(this) < 144.0) {
                     this.a($$3);
                     return false;
                  }
               }
            }
         }

         if (!$$2 && $$1) {
            this.gA();
         }

         return true;
      }
   }

   public void a(crm $$0) {
      this.eb().a(cgl.p, $$0);
      this.a(eft.u);
      this.b(awn.gn);
      this.w(true);
   }

   public void gA() {
      this.eb().b(cgl.p);
      this.a(eft.u);
      this.b(awn.go);
      this.w(false);
   }

   public void w(boolean $$0) {
      this.al.a(bM, $$0);
   }

   public boolean gB() {
      return this.al.a(bM);
   }

   @Override
   public float a(iv $$0, djp $$1) {
      return 0.0F;
   }

   class a extends cdd {
      public a(final cps $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cps.this.n()) {
            super.a();
         }
      }
   }

   class b extends cdg {
      public b(final cps $$0) {
         super($$0);
      }

      @Override
      public void b() {
         if (cps.this.n()) {
            super.b();
         } else {
            cps.this.s(false);
         }
      }
   }

   class c extends cdh {
      public c(final cps $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cps.this.n()) {
            super.a();
         }
      }
   }

   class d extends cdi {
      public d(final cps $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cps.this.n()) {
            super.a();
         }
      }
   }

   class e extends cgs {
      e(final cps $$0, final djm $$1) {
         super($$0, $$1);
      }

      @Override
      public void c() {
         if (cps.this.n()) {
            super.c();
         }
      }

      @Override
      protected exq a(int $$0) {
         this.o = cps.this.new f();
         this.o.a(true);
         return new exq(this.o, $$0);
      }
   }

   class f extends exw {
      private static final int m = 1024;

      @Override
      public exr a(ext $$0, int $$1, int $$2, int $$3) {
         iv $$4 = cps.this.x();
         if ($$4 == null) {
            return super.a($$0, $$1, $$2, $$3);
         } else {
            double $$5 = $$4.j(new ka($$1, $$2, $$3));
            return $$5 > 1024.0 && $$5 >= $$4.j($$0.b()) ? exr.a : super.a($$0, $$1, $$2, $$3);
         }
      }
   }
}
