import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cqo extends cpk {
   private static final aku<Boolean> bL = aky.a(cqo.class, akw.k);
   private static final aku<Boolean> bM = aky.a(cqo.class, akw.k);
   private static final aku<Boolean> bN = aky.a(cqo.class, akw.k);
   private static final aku<Optional<iw>> bO = aky.a(cqo.class, akw.p);
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
   public static final int e = 8;
   public static final int f = 45;
   private static final int bV = 4;
   private int bW;
   public final bwv bI = new bwv();
   public final bwv bJ = new bwv();
   public final bwv bK = new bwv();
   private int bX;
   private boolean bY;
   private int bZ;
   private int ca;

   public cqo(bxn<? extends cqo> $$0, dkj $$1) {
      super($$0, $$1);
      this.bB = new cqo.c(this);
      this.bC = new cqo.d(this);
      this.bD = new cqo.b(this);
      cho $$2 = (cho)this.O();
      $$2.a(true);
      this.bA = 0;
   }

   public void h(iw $$0) {
      this.i($$0);
      this.a(eyr.q, 8.0F);
      this.a(eyr.f, 8.0F);
      this.a(eyr.i, 8.0F);
      this.a(eyr.o, 0.0F);
      this.a(eyr.n, 0.0F);
   }

   public boolean j() {
      return this.x() != null;
   }

   @Override
   protected cdz I() {
      return new cqo.a(this);
   }

   @Override
   protected bzf.b<cqo> ed() {
      return cqp.a();
   }

   @Override
   protected bzf<?> a(Dynamic<?> $$0) {
      return cqp.b(this, this.ed().a($$0));
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(bL, true);
      $$0.a(bM, false);
      $$0.a(bN, false);
      $$0.a(bO, Optional.empty());
   }

   public static bzk.a m() {
      return cpk.gx().a(bzl.s, 1.0).a(bzl.v, 0.4F).a(bzl.c, 3.0).a(bzl.m, 32.0).a(bzl.B, 1.0625);
   }

   public boolean n() {
      return this.al.a(bL);
   }

   @Override
   public boolean c(asb $$0, bxe $$1) {
      if (!($$1 instanceof byf)) {
         return false;
      } else {
         this.bW = 15;
         this.dV().a(this, (byte)4);
         return super.c($$0, $$1);
      }
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      iw $$3 = this.x();
      if ($$3 == null || $$1.a(axo.d)) {
         return super.a($$0, $$1, $$2);
      } else if (!this.a($$0, $$1) && this.bX <= 0 && !this.eH()) {
         csi $$4 = this.i($$1);
         bxe $$5 = $$1.c();
         if (!($$5 instanceof byf) && !($$5 instanceof ctd) && $$4 == null) {
            return false;
         } else {
            this.bX = 8;
            this.dV().a(this, (byte)66);
            this.a(egq.u);
            if (this.dV().c_($$3) instanceof dze $$6 && $$6.b(this)) {
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

   public csi i(bvt $$0) {
      this.f($$0);
      return this.g($$0);
   }

   @Override
   public boolean bG() {
      return super.bG() && this.n();
   }

   @Override
   public void i(double $$0, double $$1, double $$2) {
      if (this.n()) {
         super.i($$0, $$1, $$2);
      }
   }

   @Override
   public bzf<cqo> ec() {
      return (bzf<cqo>)super.ec();
   }

   @Override
   protected void a(asb $$0) {
      brm $$1 = brl.a();
      $$1.a("creakingBrain");
      this.ec().a((asb)this.dV(), this);
      $$1.c();
      cqp.a(this);
   }

   @Override
   public void k_() {
      if (this.bX > 0) {
         this.bX--;
      }

      if (this.bW > 0) {
         this.bW--;
      }

      if (!this.dV().C) {
         boolean $$0 = this.al.a(bL);
         boolean $$1 = this.gA();
         if ($$1 != $$0) {
            this.a(egq.u);
            if ($$1) {
               this.b(awy.gt);
            } else {
               this.W();
               this.b(awy.gs);
            }
         }

         this.al.a(bL, $$1);
      }

      super.k_();
   }

   @Override
   public void h() {
      if (!this.dV().C) {
         iw $$0 = this.x();
         if ($$0 != null) {
            boolean var10000;
            label21: {
               if (this.dV().c_($$0) instanceof dze $$1 && $$1.b(this)) {
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
      if (this.dV().C) {
         this.gD();
         this.gz();
      }
   }

   @Override
   protected void en() {
      if (this.j() && this.gv()) {
         this.aP++;
         if (!this.dV().A_() && this.aP > 45 && !this.dQ()) {
            this.q();
         }
      } else {
         super.en();
      }
   }

   @Override
   protected void A(float $$0) {
      float $$1 = Math.min($$0 * 25.0F, 3.0F);
      this.aT.a($$1, 0.4F, 1.0F);
   }

   private void gD() {
      this.bI.a(this.bW > 0, this.af);
      this.bJ.a(this.bX > 0, this.af);
      this.bK.a(this.gv(), this.af);
   }

   @Override
   public void q() {
      if (this.dV() instanceof asb $$0) {
         ffx $$1 = this.cR();
         fgc $$2 = $$1.f();
         double $$3 = $$1.b() * 0.3;
         double $$4 = $$1.c() * 0.3;
         double $$5 = $$1.d() * 0.3;
         $$0.a(new lr(lz.bi, dnq.u.m()), $$2.d, $$2.e, $$2.f, 100, $$3, $$4, $$5, 0.0);
         $$0.a(new lr(lz.bi, dnq.cE.m().b(dpk.c, eck.c)), $$2.d, $$2.e, $$2.f, 10, $$3, $$4, $$5, 0.0);
      }

      this.b(this.l_());
      this.a(bxe.d.b);
   }

   public void j(bvt $$0) {
      this.i($$0);
      this.a($$0);
      this.b(awy.gw);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 66) {
         this.bX = 8;
         this.h(this.dW().p());
      } else if ($$0 == 4) {
         this.bW = 15;
         this.gn();
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean bh() {
      return this.j() || super.bh();
   }

   @Override
   protected boolean r(bxe $$0) {
      return !this.j() && super.r($$0);
   }

   @Override
   protected boolean bP() {
      return !this.j() && super.bP();
   }

   @Override
   protected void p(bxe $$0) {
      if (this.j()) {
         throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
      }
   }

   @Override
   public boolean n(boolean $$0) {
      return !this.j() && super.n($$0);
   }

   @Override
   protected chp b(dkj $$0) {
      return new cqo.e(this, $$0);
   }

   public boolean t() {
      List<csi> $$0 = this.bs.c(chh.j).orElse(List.of());
      if ($$0.isEmpty()) {
         this.ca = 0;
         return false;
      } else {
         ffx $$1 = this.cR();

         for (csi $$2 : $$0) {
            if ($$1.d($$2.bD())) {
               this.ca++;
               return this.ca > 4;
            }
         }

         this.ca = 0;
         return false;
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      $$0.<iw>a("home_pos", iw.a).ifPresent(this::h);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.b("home_pos", iw.a, this.x());
   }

   public void i(iw $$0) {
      this.al.a(bO, Optional.of($$0));
   }

   @Nullable
   public iw x() {
      return this.al.a(bO).orElse(null);
   }

   public void gu() {
      this.al.a(bN, true);
   }

   public boolean gv() {
      return this.al.a(bN);
   }

   public boolean gy() {
      return this.bY;
   }

   public void gz() {
      if (this.aP > this.bZ) {
         this.bZ = this.aP + this.dY().a(this.bY ? 2 : this.aP / 4, this.bY ? 8 : this.aP / 2);
         this.bY = !this.bY;
      }
   }

   @Override
   public void gn() {
      this.b(awy.gp);
   }

   @Override
   protected awx u() {
      return this.gC() ? null : awy.gm;
   }

   @Override
   protected awx e(bvt $$0) {
      return this.j() ? awy.gv : super.e($$0);
   }

   @Override
   protected awx l_() {
      return awy.gq;
   }

   @Override
   protected void b(iw $$0, ebq $$1) {
      this.a(awy.gr, 0.15F, 1.0F);
   }

   @Nullable
   @Override
   public byf f() {
      return this.Q();
   }

   @Override
   protected void ac() {
      super.ac();
      agx.a(this);
   }

   @Override
   public void p(double $$0, double $$1, double $$2) {
      if (this.n()) {
         super.p($$0, $$1, $$2);
      }
   }

   public boolean gA() {
      List<csi> $$0 = this.bs.c(chh.j).orElse(List.of());
      boolean $$1 = this.gC();
      if ($$0.isEmpty()) {
         if ($$1) {
            this.gB();
         }

         return true;
      } else {
         boolean $$2 = false;

         for (csi $$3 : $$0) {
            if (this.c((byf)$$3) && !this.s($$3)) {
               $$2 = true;
               if ((!$$1 || byf.aH.test($$3))
                  && this.a($$3, 0.5, false, true, new double[]{this.dE(), this.dC() + 0.5 * (double)this.el(), (this.dE() + this.dC()) / 2.0})) {
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
            this.gB();
         }

         return true;
      }
   }

   public void a(csi $$0) {
      this.ec().a(chh.p, $$0);
      this.a(egq.u);
      this.b(awy.gn);
      this.w(true);
   }

   public void gB() {
      this.ec().b(chh.p);
      this.a(egq.u);
      this.b(awy.go);
      this.w(false);
   }

   public void w(boolean $$0) {
      this.al.a(bM, $$0);
   }

   public boolean gC() {
      return this.al.a(bM);
   }

   @Override
   public float a(iw $$0, dkm $$1) {
      return 0.0F;
   }

   class a extends cdz {
      public a(final cqo $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cqo.this.n()) {
            super.a();
         }
      }
   }

   class b extends cec {
      public b(final cqo $$0) {
         super($$0);
      }

      @Override
      public void b() {
         if (cqo.this.n()) {
            super.b();
         } else {
            cqo.this.s(false);
         }
      }
   }

   class c extends ced {
      public c(final cqo $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cqo.this.n()) {
            super.a();
         }
      }
   }

   class d extends cee {
      public d(final cqo $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cqo.this.n()) {
            super.a();
         }
      }
   }

   class e extends cho {
      e(final cqo $$0, final dkj $$1) {
         super($$0, $$1);
      }

      @Override
      public void c() {
         if (cqo.this.n()) {
            super.c();
         }
      }

      @Override
      protected eyq a(int $$0) {
         this.o = cqo.this.new f();
         this.o.a(true);
         return new eyq(this.o, $$0);
      }
   }

   class f extends eyw {
      private static final int m = 1024;

      @Override
      public eyr a(eyt $$0, int $$1, int $$2, int $$3) {
         iw $$4 = cqo.this.x();
         if ($$4 == null) {
            return super.a($$0, $$1, $$2, $$3);
         } else {
            double $$5 = $$4.j(new kb($$1, $$2, $$3));
            return $$5 > 1024.0 && $$5 >= $$4.j($$0.b()) ? eyr.a : super.a($$0, $$1, $$2, $$3);
         }
      }
   }
}
