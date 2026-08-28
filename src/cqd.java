import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cqd extends coz {
   private static final akl<Boolean> bL = akp.a(cqd.class, akn.k);
   private static final akl<Boolean> bM = akp.a(cqd.class, akn.k);
   private static final akl<Boolean> bN = akp.a(cqd.class, akn.k);
   private static final akl<Optional<iv>> bO = akp.a(cqd.class, akn.p);
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
   public final bwk bI = new bwk();
   public final bwk bJ = new bwk();
   public final bwk bK = new bwk();
   private int bX;
   private boolean bY;
   private int bZ;
   private int ca;

   public cqd(bxc<? extends cqd> $$0, djx $$1) {
      super($$0, $$1);
      this.bB = new cqd.c(this);
      this.bC = new cqd.d(this);
      this.bD = new cqd.b(this);
      chd $$2 = (chd)this.O();
      $$2.a(true);
      this.bA = 0;
   }

   public void h(iv $$0) {
      this.i($$0);
      this.a(eyf.q, 8.0F);
      this.a(eyf.f, 8.0F);
      this.a(eyf.i, 8.0F);
      this.a(eyf.o, 0.0F);
      this.a(eyf.n, 0.0F);
   }

   public boolean j() {
      return this.x() != null;
   }

   @Override
   protected cdo I() {
      return new cqd.a(this);
   }

   @Override
   protected byu.b<cqd> ed() {
      return cqe.a();
   }

   @Override
   protected byu<?> a(Dynamic<?> $$0) {
      return cqe.b(this, this.ed().a($$0));
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bL, true);
      $$0.a(bM, false);
      $$0.a(bN, false);
      $$0.a(bO, Optional.empty());
   }

   public static byz.a m() {
      return coz.gx().a(bza.s, 1.0).a(bza.v, 0.4F).a(bza.c, 3.0).a(bza.m, 32.0).a(bza.B, 1.0625);
   }

   public boolean n() {
      return this.al.a(bL);
   }

   @Override
   public boolean c(ars $$0, bwt $$1) {
      if (!($$1 instanceof bxu)) {
         return false;
      } else {
         this.bW = 15;
         this.dV().a(this, (byte)4);
         return super.c($$0, $$1);
      }
   }

   @Override
   public boolean a(ars $$0, bvi $$1, float $$2) {
      iv $$3 = this.x();
      if ($$3 == null || $$1.a(axf.d)) {
         return super.a($$0, $$1, $$2);
      } else if (!this.a($$0, $$1) && this.bX <= 0 && !this.eH()) {
         crx $$4 = this.i($$1);
         bwt $$5 = $$1.c();
         if (!($$5 instanceof bxu) && !($$5 instanceof css) && $$4 == null) {
            return false;
         } else {
            this.bX = 8;
            this.dV().a(this, (byte)66);
            this.a(ege.u);
            if (this.dV().c_($$3) instanceof dys $$6 && $$6.b(this)) {
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

   public crx i(bvi $$0) {
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
   public byu<cqd> ec() {
      return (byu<cqd>)super.ec();
   }

   @Override
   protected void a(ars $$0) {
      brb $$1 = bra.a();
      $$1.a("creakingBrain");
      this.ec().a((ars)this.dV(), this);
      $$1.c();
      cqe.a(this);
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
            this.a(ege.u);
            if ($$1) {
               this.b(awp.gt);
            } else {
               this.W();
               this.b(awp.gs);
            }
         }

         this.al.a(bL, $$1);
      }

      super.k_();
   }

   @Override
   public void h() {
      if (!this.dV().C) {
         iv $$0 = this.x();
         if ($$0 != null) {
            boolean var10000;
            label21: {
               if (this.dV().c_($$0) instanceof dys $$1 && $$1.b(this)) {
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
      if (this.dV() instanceof ars $$0) {
         ffl $$1 = this.cR();
         ffq $$2 = $$1.f();
         double $$3 = $$1.b() * 0.3;
         double $$4 = $$1.c() * 0.3;
         double $$5 = $$1.d() * 0.3;
         $$0.a(new lq(ly.bi, dne.u.m()), $$2.d, $$2.e, $$2.f, 100, $$3, $$4, $$5, 0.0);
         $$0.a(new lq(ly.bi, dne.cE.m().b(doy.c, eby.c)), $$2.d, $$2.e, $$2.f, 10, $$3, $$4, $$5, 0.0);
      }

      this.b(this.l_());
      this.a(bwt.d.b);
   }

   public void j(bvi $$0) {
      this.i($$0);
      this.a($$0);
      this.b(awp.gw);
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
   protected boolean r(bwt $$0) {
      return !this.j() && super.r($$0);
   }

   @Override
   protected boolean bP() {
      return !this.j() && super.bP();
   }

   @Override
   protected void p(bwt $$0) {
      if (this.j()) {
         throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
      }
   }

   @Override
   public boolean n(boolean $$0) {
      return !this.j() && super.n($$0);
   }

   @Override
   protected che b(djx $$0) {
      return new cqd.e(this, $$0);
   }

   public boolean t() {
      List<crx> $$0 = this.bs.c(cgw.j).orElse(List.of());
      if ($$0.isEmpty()) {
         this.ca = 0;
         return false;
      } else {
         ffl $$1 = this.cR();

         for (crx $$2 : $$0) {
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
      this.b(awp.gp);
   }

   @Override
   protected awo u() {
      return this.gC() ? null : awp.gm;
   }

   @Override
   protected awo e(bvi $$0) {
      return this.j() ? awp.gv : super.e($$0);
   }

   @Override
   protected awo l_() {
      return awp.gq;
   }

   @Override
   protected void b(iv $$0, ebe $$1) {
      this.a(awp.gr, 0.15F, 1.0F);
   }

   @Nullable
   @Override
   public bxu f() {
      return this.Q();
   }

   @Override
   protected void ac() {
      super.ac();
      ago.a(this);
   }

   @Override
   public void p(double $$0, double $$1, double $$2) {
      if (this.n()) {
         super.p($$0, $$1, $$2);
      }
   }

   public boolean gA() {
      List<crx> $$0 = this.bs.c(cgw.j).orElse(List.of());
      boolean $$1 = this.gC();
      if ($$0.isEmpty()) {
         if ($$1) {
            this.gB();
         }

         return true;
      } else {
         boolean $$2 = false;

         for (crx $$3 : $$0) {
            if (this.c((bxu)$$3) && !this.s($$3)) {
               $$2 = true;
               if ((!$$1 || bxu.aH.test($$3))
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

   public void a(crx $$0) {
      this.ec().a(cgw.p, $$0);
      this.a(ege.u);
      this.b(awp.gn);
      this.w(true);
   }

   public void gB() {
      this.ec().b(cgw.p);
      this.a(ege.u);
      this.b(awp.go);
      this.w(false);
   }

   public void w(boolean $$0) {
      this.al.a(bM, $$0);
   }

   public boolean gC() {
      return this.al.a(bM);
   }

   @Override
   public float a(iv $$0, dka $$1) {
      return 0.0F;
   }

   class a extends cdo {
      public a(final cqd $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cqd.this.n()) {
            super.a();
         }
      }
   }

   class b extends cdr {
      public b(final cqd $$0) {
         super($$0);
      }

      @Override
      public void b() {
         if (cqd.this.n()) {
            super.b();
         } else {
            cqd.this.s(false);
         }
      }
   }

   class c extends cds {
      public c(final cqd $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cqd.this.n()) {
            super.a();
         }
      }
   }

   class d extends cdt {
      public d(final cqd $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cqd.this.n()) {
            super.a();
         }
      }
   }

   class e extends chd {
      e(final cqd $$0, final djx $$1) {
         super($$0, $$1);
      }

      @Override
      public void c() {
         if (cqd.this.n()) {
            super.c();
         }
      }

      @Override
      protected eye a(int $$0) {
         this.o = cqd.this.new f();
         this.o.a(true);
         return new eye(this.o, $$0);
      }
   }

   class f extends eyk {
      private static final int m = 1024;

      @Override
      public eyf a(eyh $$0, int $$1, int $$2, int $$3) {
         iv $$4 = cqd.this.x();
         if ($$4 == null) {
            return super.a($$0, $$1, $$2, $$3);
         } else {
            double $$5 = $$4.j(new ka($$1, $$2, $$3));
            return $$5 > 1024.0 && $$5 >= $$4.j($$0.b()) ? eyf.a : super.a($$0, $$1, $$2, $$3);
         }
      }
   }
}
