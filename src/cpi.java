import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cpi extends cod {
   private static final akj<Boolean> bL = akn.a(cpi.class, akl.k);
   private static final akj<Boolean> bM = akn.a(cpi.class, akl.k);
   private static final akj<Boolean> bN = akn.a(cpi.class, akl.k);
   private static final akj<Optional<iu>> bO = akn.a(cpi.class, akl.p);
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
   public final bvw bI = new bvw();
   public final bvw bJ = new bvw();
   public final bvw bK = new bvw();
   private int bX;
   private boolean bY;
   private int bZ;
   private int ca;

   public cpi(bwo<? extends cpi> $$0, dja $$1) {
      super($$0, $$1);
      this.bz = new cpi.c(this);
      this.bA = new cpi.d(this);
      this.bB = new cpi.b(this);
      cgn $$2 = (cgn)this.O();
      $$2.a(true);
      this.by = 0;
   }

   public void h(iu $$0) {
      this.i($$0);
      this.a(exf.q, 8.0F);
      this.a(exf.f, 8.0F);
      this.a(exf.i, 8.0F);
      this.a(exf.o, 0.0F);
      this.a(exf.n, 0.0F);
   }

   public boolean j() {
      return this.x() != null;
   }

   @Override
   protected ccy I() {
      return new cpi.a(this);
   }

   @Override
   protected bye.b<cpi> ed() {
      return cpj.a();
   }

   @Override
   protected bye<?> a(Dynamic<?> $$0) {
      return cpj.b(this, this.ed().a($$0));
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bL, true);
      $$0.a(bM, false);
      $$0.a(bN, false);
      $$0.a(bO, Optional.empty());
   }

   public static byj.a m() {
      return cod.gu().a(byk.s, 1.0).a(byk.v, 0.4F).a(byk.c, 3.0).a(byk.m, 32.0).a(byk.B, 1.0625);
   }

   public boolean n() {
      return this.al.a(bL);
   }

   @Override
   public boolean c(arq $$0, bwf $$1) {
      if (!($$1 instanceof bxe)) {
         return false;
      } else {
         this.bW = 15;
         this.dV().a(this, (byte)4);
         return super.c($$0, $$1);
      }
   }

   @Override
   public boolean a(arq $$0, buu $$1, float $$2) {
      iu $$3 = this.x();
      if ($$3 == null || $$1.a(axd.d)) {
         return super.a($$0, $$1, $$2);
      } else if (!this.a($$0, $$1) && this.bX <= 0 && !this.eH()) {
         crc $$4 = this.i($$1);
         bwf $$5 = $$1.c();
         if (!($$5 instanceof bxe) && !($$5 instanceof crx) && $$4 == null) {
            return false;
         } else {
            this.bX = 8;
            this.dV().a(this, (byte)66);
            this.a(efh.u);
            if (this.dV().c_($$3) instanceof dxv $$6 && $$6.b(this)) {
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

   public crc i(buu $$0) {
      this.f($$0);
      return this.g($$0);
   }

   @Override
   public boolean bH() {
      return super.bH() && this.n();
   }

   @Override
   public void i(double $$0, double $$1, double $$2) {
      if (this.n()) {
         super.i($$0, $$1, $$2);
      }
   }

   @Override
   public bye<cpi> ec() {
      return (bye<cpi>)super.ec();
   }

   @Override
   protected void a(arq $$0) {
      bqo $$1 = bqn.a();
      $$1.a("creakingBrain");
      this.ec().a((arq)this.dV(), this);
      $$1.c();
      cpj.a(this);
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
         boolean $$1 = this.gx();
         if ($$1 != $$0) {
            this.a(efh.u);
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
      if (!this.dV().C) {
         iu $$0 = this.x();
         if ($$0 != null) {
            boolean var10000;
            label21: {
               if (this.dV().c_($$0) instanceof dxv $$1 && $$1.b(this)) {
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
         this.gA();
         this.gw();
      }
   }

   @Override
   protected void en() {
      if (this.j() && this.gs()) {
         this.aP++;
         if (!this.dV().w_() && this.aP > 45 && !this.dQ()) {
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

   private void gA() {
      this.bI.a(this.bW > 0, this.af);
      this.bJ.a(this.bX > 0, this.af);
      this.bK.a(this.gs(), this.af);
   }

   @Override
   public void q() {
      if (this.dV() instanceof arq $$0) {
         fel $$1 = this.cR();
         feq $$2 = $$1.f();
         double $$3 = $$1.b() * 0.3;
         double $$4 = $$1.c() * 0.3;
         double $$5 = $$1.d() * 0.3;
         $$0.a(new lp(lx.bi, dmh.u.m()), $$2.d, $$2.e, $$2.f, 100, $$3, $$4, $$5, 0.0);
         $$0.a(new lp(lx.bi, dmh.cE.m().b(dob.c, ebb.c)), $$2.d, $$2.e, $$2.f, 10, $$3, $$4, $$5, 0.0);
      }

      this.b(this.l_());
      this.a(bwf.e.b);
   }

   public void j(buu $$0) {
      this.i($$0);
      this.a($$0);
      this.b(awn.gw);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 66) {
         this.bX = 8;
         this.h(this.dW().p());
      } else if ($$0 == 4) {
         this.bW = 15;
         this.gk();
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean bi() {
      return this.j() || super.bi();
   }

   @Override
   protected boolean r(bwf $$0) {
      return !this.j() && super.r($$0);
   }

   @Override
   protected boolean bQ() {
      return !this.j() && super.bQ();
   }

   @Override
   protected void p(bwf $$0) {
      if (this.j()) {
         throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
      }
   }

   @Override
   public boolean n(boolean $$0) {
      return !this.j() && super.n($$0);
   }

   @Override
   protected cgo b(dja $$0) {
      return new cpi.e(this, $$0);
   }

   public boolean t() {
      List<crc> $$0 = this.bs.c(cgg.j).orElse(List.of());
      if ($$0.isEmpty()) {
         this.ca = 0;
         return false;
      } else {
         fel $$1 = this.cR();

         for (crc $$2 : $$0) {
            if ($$1.d($$2.bE())) {
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
      if ($$0.e("home_pos")) {
         this.h(uo.a($$0, "home_pos").orElseThrow());
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      iu $$1 = this.x();
      if ($$1 != null) {
         $$0.a("home_pos", uo.a($$1));
      }
   }

   public void i(iu $$0) {
      this.al.a(bO, Optional.of($$0));
   }

   @Nullable
   public iu x() {
      return this.al.a(bO).orElse(null);
   }

   public void gr() {
      this.al.a(bN, true);
   }

   public boolean gs() {
      return this.al.a(bN);
   }

   public boolean gv() {
      return this.bY;
   }

   public void gw() {
      if (this.aP > this.bZ) {
         this.bZ = this.aP + this.dY().a(this.bY ? 2 : this.aP / 4, this.bY ? 8 : this.aP / 2);
         this.bY = !this.bY;
      }
   }

   @Override
   public void gk() {
      this.b(awn.gp);
   }

   @Override
   protected awm u() {
      return this.gz() ? null : awn.gm;
   }

   @Override
   protected awm e(buu $$0) {
      return this.j() ? awn.gv : super.e($$0);
   }

   @Override
   protected awm l_() {
      return awn.gq;
   }

   @Override
   protected void b(iu $$0, eah $$1) {
      this.a(awn.gr, 0.15F, 1.0F);
   }

   @Nullable
   @Override
   public bxe f() {
      return this.Q();
   }

   @Override
   protected void ab() {
      super.ab();
      agm.a(this);
   }

   @Override
   public void p(double $$0, double $$1, double $$2) {
      if (this.n()) {
         super.p($$0, $$1, $$2);
      }
   }

   public boolean gx() {
      List<crc> $$0 = this.bs.c(cgg.j).orElse(List.of());
      boolean $$1 = this.gz();
      if ($$0.isEmpty()) {
         if ($$1) {
            this.gy();
         }

         return true;
      } else {
         boolean $$2 = false;

         for (crc $$3 : $$0) {
            if (this.c((bxe)$$3) && !this.s($$3)) {
               $$2 = true;
               if ((!$$1 || bxe.aH.test($$3))
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
            this.gy();
         }

         return true;
      }
   }

   public void a(crc $$0) {
      this.ec().a(cgg.p, $$0);
      this.a(efh.u);
      this.b(awn.gn);
      this.w(true);
   }

   public void gy() {
      this.ec().b(cgg.p);
      this.a(efh.u);
      this.b(awn.go);
      this.w(false);
   }

   public void w(boolean $$0) {
      this.al.a(bM, $$0);
   }

   public boolean gz() {
      return this.al.a(bM);
   }

   @Override
   public float a(iu $$0, djd $$1) {
      return 0.0F;
   }

   class a extends ccy {
      public a(final cpi $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cpi.this.n()) {
            super.a();
         }
      }
   }

   class b extends cdb {
      public b(final cpi $$0) {
         super($$0);
      }

      @Override
      public void b() {
         if (cpi.this.n()) {
            super.b();
         } else {
            cpi.this.s(false);
         }
      }
   }

   class c extends cdc {
      public c(final cpi $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cpi.this.n()) {
            super.a();
         }
      }
   }

   class d extends cdd {
      public d(final cpi $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cpi.this.n()) {
            super.a();
         }
      }
   }

   class e extends cgn {
      e(final cpi $$0, final dja $$1) {
         super($$0, $$1);
      }

      @Override
      public void c() {
         if (cpi.this.n()) {
            super.c();
         }
      }

      @Override
      protected exe a(int $$0) {
         this.o = cpi.this.new f();
         this.o.a(true);
         return new exe(this.o, $$0);
      }
   }

   class f extends exk {
      private static final int m = 1024;

      @Override
      public exf a(exh $$0, int $$1, int $$2, int $$3) {
         iu $$4 = cpi.this.x();
         if ($$4 == null) {
            return super.a($$0, $$1, $$2, $$3);
         } else {
            double $$5 = $$4.j(new jz($$1, $$2, $$3));
            return $$5 > 1024.0 && $$5 >= $$4.j($$0.b()) ? exf.a : super.a($$0, $$1, $$2, $$3);
         }
      }
   }
}
