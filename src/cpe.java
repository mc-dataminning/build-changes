import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cpe extends cnz {
   private static final akj<Boolean> bK = akn.a(cpe.class, akl.k);
   private static final akj<Boolean> bL = akn.a(cpe.class, akl.k);
   private static final akj<Boolean> bM = akn.a(cpe.class, akl.k);
   private static final akj<Optional<iu>> bN = akn.a(cpe.class, akl.p);
   private static final int bO = 15;
   private static final int bP = 1;
   private static final float bQ = 3.0F;
   private static final float bR = 32.0F;
   private static final float bS = 144.0F;
   public static final int a = 40;
   private static final float bT = 0.4F;
   public static final float b = 0.3F;
   public static final int c = 16545810;
   public static final int d = 6250335;
   public static final int bF = 8;
   public static final int bG = 45;
   private static final int bU = 4;
   private int bV;
   public final bvu bH = new bvu();
   public final bvu bI = new bvu();
   public final bvu bJ = new bvu();
   private int bW;
   private boolean bX;
   private int bY;
   private int bZ;

   public cpe(bwm<? extends cpe> $$0, div $$1) {
      super($$0, $$1);
      this.by = new cpe.c(this);
      this.bz = new cpe.d(this);
      this.bA = new cpe.b(this);
      cgl $$2 = (cgl)this.O();
      $$2.a(true);
      this.bx = 0;
   }

   public void h(iu $$0) {
      this.i($$0);
      this.a(ewx.q, 8.0F);
      this.a(ewx.f, 8.0F);
      this.a(ewx.i, 8.0F);
      this.a(ewx.o, 0.0F);
      this.a(ewx.n, 0.0F);
   }

   public boolean j() {
      return this.x() != null;
   }

   @Override
   protected ccw I() {
      return new cpe.a(this);
   }

   @Override
   protected byc.b<cpe> ec() {
      return cpf.a();
   }

   @Override
   protected byc<?> a(Dynamic<?> $$0) {
      return cpf.b(this, this.ec().a($$0));
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bK, true);
      $$0.a(bL, false);
      $$0.a(bM, false);
      $$0.a(bN, Optional.empty());
   }

   public static byh.a m() {
      return cnz.gt().a(byi.s, 1.0).a(byi.v, 0.4F).a(byi.c, 3.0).a(byi.m, 32.0).a(byi.B, 1.0625);
   }

   public boolean n() {
      return this.al.a(bK);
   }

   @Override
   public boolean c(arq $$0, bwd $$1) {
      if (!($$1 instanceof bxc)) {
         return false;
      } else {
         this.bV = 15;
         this.dV().a(this, (byte)4);
         return super.c($$0, $$1);
      }
   }

   @Override
   public boolean a(arq $$0, bus $$1, float $$2) {
      iu $$3 = this.x();
      if ($$3 == null || $$1.a(axd.d)) {
         return super.a($$0, $$1, $$2);
      } else if (!this.a($$0, $$1) && this.bW <= 0 && !this.eG()) {
         cqy $$4 = this.i($$1);
         bwd $$5 = $$1.c();
         if (!($$5 instanceof bxc) && !($$5 instanceof crs) && $$4 == null) {
            return false;
         } else {
            this.bW = 8;
            this.dV().a(this, (byte)66);
            this.a(eez.u);
            if (this.dV().c_($$3) instanceof dxn $$6 && $$6.b(this)) {
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

   public cqy i(bus $$0) {
      this.f($$0);
      return this.g($$0);
   }

   @Override
   public boolean bH() {
      return super.bH() && this.n();
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (this.n()) {
         super.j($$0, $$1, $$2);
      }
   }

   @Override
   public byc<cpe> eb() {
      return (byc<cpe>)super.eb();
   }

   @Override
   protected void a(arq $$0) {
      bqm $$1 = bql.a();
      $$1.a("creakingBrain");
      this.eb().a((arq)this.dV(), this);
      $$1.c();
      cpf.a(this);
   }

   @Override
   public void k_() {
      if (this.bW > 0) {
         this.bW--;
      }

      if (this.bV > 0) {
         this.bV--;
      }

      if (!this.dV().C) {
         boolean $$0 = this.al.a(bK);
         boolean $$1 = this.gw();
         if ($$1 != $$0) {
            this.a(eez.u);
            if ($$1) {
               this.b(awn.gr);
            } else {
               this.W();
               this.b(awn.gq);
            }
         }

         this.al.a(bK, $$1);
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
               if (this.dV().c_($$0) instanceof dxn $$1 && $$1.b(this)) {
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
         this.gz();
         this.gv();
      }
   }

   @Override
   protected void em() {
      if (this.j() && this.gr()) {
         this.aP++;
         if (!this.dV().w_() && this.aP > 45 && !this.dQ()) {
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

   private void gz() {
      this.bH.a(this.bV > 0, this.af);
      this.bI.a(this.bW > 0, this.af);
      this.bJ.a(this.gr(), this.af);
   }

   @Override
   public void q() {
      if (this.dV() instanceof arq $$0) {
         fed $$1 = this.cR();
         fei $$2 = $$1.f();
         double $$3 = $$1.b() * 0.3;
         double $$4 = $$1.c() * 0.3;
         double $$5 = $$1.d() * 0.3;
         $$0.a(new lp(lx.bi, dmc.u.m()), $$2.d, $$2.e, $$2.f, 100, $$3, $$4, $$5, 0.0);
         $$0.a(new lp(lx.bi, dmc.cC.m().b(dnv.c, eat.c)), $$2.d, $$2.e, $$2.f, 10, $$3, $$4, $$5, 0.0);
      }

      this.b(this.l_());
      this.a(bwd.e.b);
   }

   public void j(bus $$0) {
      this.i($$0);
      this.a($$0);
      this.b(awn.gu);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 66) {
         this.bW = 8;
         this.h(this.dW().p());
      } else if ($$0 == 4) {
         this.bV = 15;
         this.gj();
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean bi() {
      return this.j() || super.bi();
   }

   @Override
   protected boolean r(bwd $$0) {
      return !this.j() && super.r($$0);
   }

   @Override
   protected boolean bQ() {
      return !this.j() && super.bQ();
   }

   @Override
   protected void p(bwd $$0) {
      if (this.j()) {
         throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
      }
   }

   @Override
   public boolean n(boolean $$0) {
      return !this.j() && super.n($$0);
   }

   @Override
   protected cgm b(div $$0) {
      return new cpe.e(this, $$0);
   }

   public boolean t() {
      List<cqy> $$0 = this.bs.c(cge.j).orElse(List.of());
      if ($$0.isEmpty()) {
         this.bZ = 0;
         return false;
      } else {
         fed $$1 = this.cR();

         for (cqy $$2 : $$0) {
            if ($$1.d($$2.bE())) {
               this.bZ++;
               return this.bZ > 4;
            }
         }

         this.bZ = 0;
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
      this.al.a(bN, Optional.of($$0));
   }

   @Nullable
   public iu x() {
      return this.al.a(bN).orElse(null);
   }

   public void gq() {
      this.al.a(bM, true);
   }

   public boolean gr() {
      return this.al.a(bM);
   }

   public boolean gu() {
      return this.bX;
   }

   public void gv() {
      if (this.aP > this.bY) {
         this.bY = this.aP + this.dY().a(this.bX ? 2 : this.aP / 4, this.bX ? 8 : this.aP / 2);
         this.bX = !this.bX;
      }
   }

   @Override
   public void gj() {
      this.b(awn.gn);
   }

   @Override
   protected awm u() {
      return this.gy() ? null : awn.gk;
   }

   @Override
   protected awm e(bus $$0) {
      return this.j() ? awn.gt : super.e($$0);
   }

   @Override
   protected awm l_() {
      return awn.go;
   }

   @Override
   protected void b(iu $$0, dzz $$1) {
      this.a(awn.gp, 0.15F, 1.0F);
   }

   @Nullable
   @Override
   public bxc f() {
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

   public boolean gw() {
      List<cqy> $$0 = this.bs.c(cge.j).orElse(List.of());
      boolean $$1 = this.gy();
      if ($$0.isEmpty()) {
         if ($$1) {
            this.gx();
         }

         return true;
      } else {
         boolean $$2 = false;

         for (cqy $$3 : $$0) {
            if (this.c((bxc)$$3) && !this.s($$3)) {
               $$2 = true;
               if ((!$$1 || bxc.aH.test($$3))
                  && this.a($$3, 0.5, false, true, new double[]{this.dE(), this.dC() + 0.5 * (double)this.ek(), (this.dE() + this.dC()) / 2.0})) {
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
            this.gx();
         }

         return true;
      }
   }

   public void a(cqy $$0) {
      this.eb().a(cge.p, $$0);
      this.a(eez.u);
      this.b(awn.gl);
      this.w(true);
   }

   public void gx() {
      this.eb().b(cge.p);
      this.a(eez.u);
      this.b(awn.gm);
      this.w(false);
   }

   public void w(boolean $$0) {
      this.al.a(bL, $$0);
   }

   public boolean gy() {
      return this.al.a(bL);
   }

   @Override
   public float a(iu $$0, diy $$1) {
      return 0.0F;
   }

   class a extends ccw {
      public a(final cpe $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cpe.this.n()) {
            super.a();
         }
      }
   }

   class b extends ccz {
      public b(final cpe $$0) {
         super($$0);
      }

      @Override
      public void b() {
         if (cpe.this.n()) {
            super.b();
         } else {
            cpe.this.s(false);
         }
      }
   }

   class c extends cda {
      public c(final cpe $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cpe.this.n()) {
            super.a();
         }
      }
   }

   class d extends cdb {
      public d(final cpe $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cpe.this.n()) {
            super.a();
         }
      }
   }

   class e extends cgl {
      e(final cpe $$0, final div $$1) {
         super($$0, $$1);
      }

      @Override
      public void c() {
         if (cpe.this.n()) {
            super.c();
         }
      }

      @Override
      protected eww a(int $$0) {
         this.o = cpe.this.new f();
         this.o.a(true);
         return new eww(this.o, $$0);
      }
   }

   class f extends exc {
      private static final int m = 1024;

      @Override
      public ewx a(ewz $$0, int $$1, int $$2, int $$3) {
         iu $$4 = cpe.this.x();
         if ($$4 == null) {
            return super.a($$0, $$1, $$2, $$3);
         } else {
            double $$5 = $$4.j(new jz($$1, $$2, $$3));
            return $$5 > 1024.0 && $$5 >= $$4.j($$0.b()) ? ewx.a : super.a($$0, $$1, $$2, $$3);
         }
      }
   }
}
