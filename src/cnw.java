import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cnw extends cms {
   private static final ajx<Boolean> bK = akb.a(cnw.class, ajz.k);
   private static final ajx<Boolean> bL = akb.a(cnw.class, ajz.k);
   private static final ajx<Boolean> bM = akb.a(cnw.class, ajz.k);
   private static final ajx<Optional<ji>> bN = akb.a(cnw.class, ajz.p);
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
   public final bur bH = new bur();
   public final bur bI = new bur();
   public final bur bJ = new bur();
   private int bW;
   private boolean bX;
   private int bY;
   private int bZ;

   public cnw(bvi<? extends cnw> $$0, dgz $$1) {
      super($$0, $$1);
      this.by = new cnw.c(this);
      this.bz = new cnw.d(this);
      this.bA = new cnw.b(this);
      cfj $$2 = (cfj)this.O();
      $$2.a(true);
      this.bx = 0;
   }

   public void i(ji $$0) {
      this.j($$0);
      this.a(eun.q, 8.0F);
      this.a(eun.f, 8.0F);
      this.a(eun.i, 8.0F);
      this.a(eun.o, 0.0F);
      this.a(eun.n, 0.0F);
   }

   public boolean j() {
      return this.x() != null;
   }

   @Override
   protected cbu I() {
      return new cnw.a(this);
   }

   @Override
   protected bxa.b<cnw> eb() {
      return cnx.a();
   }

   @Override
   protected bxa<?> a(Dynamic<?> $$0) {
      return cnx.d(this.eb().a($$0));
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bK, true);
      $$0.a(bL, false);
      $$0.a(bM, false);
      $$0.a(bN, Optional.empty());
   }

   public static bxf.a m() {
      return cms.gv().a(bxg.s, 1.0).a(bxg.v, 0.4F).a(bxg.c, 3.0).a(bxg.m, 32.0).a(bxg.B, 1.0625);
   }

   public boolean n() {
      return this.al.a(bK);
   }

   @Override
   public boolean c(ard $$0, bva $$1) {
      if (!($$1 instanceof bvy)) {
         return false;
      } else {
         this.bV = 15;
         this.dU().a(this, (byte)4);
         return super.c($$0, $$1);
      }
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      ji $$3 = this.x();
      if ($$3 == null || $$1.a(awr.d)) {
         return super.a($$0, $$1, $$2);
      } else if (!this.a($$0, $$1) && this.bW <= 0 && !this.eF()) {
         cpr $$4 = this.j($$1);
         bva $$5 = $$1.c();
         if (!($$5 instanceof bvy) && !($$5 instanceof cqk) && $$4 == null) {
            return false;
         } else {
            this.bW = 8;
            this.dU().a(this, (byte)66);
            this.a(ecp.u);
            if (this.dU().c_($$3) instanceof dvh $$6 && $$6.b(this)) {
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

   public cpr j(btp $$0) {
      this.f($$0);
      return this.g($$0);
   }

   @Override
   public boolean bG() {
      return super.bG() && this.n();
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (this.n()) {
         super.j($$0, $$1, $$2);
      }
   }

   @Override
   public bxa<cnw> ea() {
      return (bxa<cnw>)super.ea();
   }

   @Override
   protected void a(ard $$0) {
      bpj $$1 = bpi.a();
      $$1.a("creakingBrain");
      this.ea().a((ard)this.dU(), this);
      $$1.c();
      cnx.a(this);
   }

   @Override
   public void k_() {
      if (this.bW > 0) {
         this.bW--;
      }

      if (this.bV > 0) {
         this.bV--;
      }

      if (!this.dU().C) {
         boolean $$0 = this.al.a(bK);
         boolean $$1 = this.gy();
         if ($$1 != $$0) {
            this.a(ecp.u);
            if ($$1) {
               this.b(awa.gr);
            } else {
               this.W();
               this.b(awa.gq);
            }
         }

         this.al.a(bK, $$1);
      }

      super.k_();
   }

   @Override
   public void h() {
      if (!this.dU().C) {
         ji $$0 = this.x();
         if ($$0 != null) {
            boolean var10000;
            label21: {
               if (this.dU().c_($$0) instanceof dvh $$1 && $$1.b(this)) {
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
         this.gB();
         this.gx();
      }
   }

   @Override
   protected void el() {
      if (this.j() && this.gt()) {
         this.aP++;
         if (!this.dU().w_() && this.aP > 45 && !this.dP()) {
            this.q();
         }
      } else {
         super.el();
      }
   }

   @Override
   protected void B(float $$0) {
      float $$1 = Math.min($$0 * 25.0F, 3.0F);
      this.aT.a($$1, 0.4F, 1.0F);
   }

   private void gB() {
      this.bH.a(this.bV > 0, this.af);
      this.bI.a(this.bW > 0, this.af);
      this.bJ.a(this.gt(), this.af);
   }

   @Override
   public void q() {
      if (this.dU() instanceof ard $$0) {
         fbs $$1 = this.cQ();
         fbx $$2 = $$1.f();
         double $$3 = $$1.b() * 0.3;
         double $$4 = $$1.c() * 0.3;
         double $$5 = $$1.d() * 0.3;
         $$0.a(new ll(lt.bi, dkg.u.m()), $$2.d, $$2.e, $$2.f, 100, $$3, $$4, $$5, 0.0);
         $$0.a(new ll(lt.bi, dkg.cB.m().b(dlz.c, dyk.c)), $$2.d, $$2.e, $$2.f, 10, $$3, $$4, $$5, 0.0);
      }

      this.b(this.l_());
      this.a(bva.d.b);
   }

   public void k(btp $$0) {
      this.j($$0);
      this.a($$0);
      this.b(awa.gu);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 66) {
         this.bW = 8;
         this.h(this.dV().p());
      } else if ($$0 == 4) {
         this.bV = 15;
         this.gl();
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean bi() {
      return this.j() || super.bi();
   }

   @Override
   protected boolean r(bva $$0) {
      return !this.j() && super.r($$0);
   }

   @Override
   protected boolean bP() {
      return !this.j() && super.bP();
   }

   @Override
   protected void p(bva $$0) {
      if (this.j()) {
         throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
      }
   }

   @Override
   public boolean n(boolean $$0) {
      return !this.j() && super.n($$0);
   }

   @Override
   protected cfk b(dgz $$0) {
      return new cnw.e(this, $$0);
   }

   public boolean t() {
      List<cpr> $$0 = this.bs.c(cfc.j).orElse(List.of());
      if ($$0.isEmpty()) {
         this.bZ = 0;
         return false;
      } else {
         fbs $$1 = this.cQ();

         for (cpr $$2 : $$0) {
            if ($$1.d($$2.bD())) {
               this.bZ++;
               return this.bZ > 4;
            }
         }

         this.bZ = 0;
         return false;
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.e("home_pos")) {
         this.i(uf.a($$0, "home_pos").orElseThrow());
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      ji $$1 = this.x();
      if ($$1 != null) {
         $$0.a("home_pos", uf.a($$1));
      }
   }

   public void j(ji $$0) {
      this.al.a(bN, Optional.of($$0));
   }

   @Nullable
   public ji x() {
      return this.al.a(bN).orElse(null);
   }

   public void gs() {
      this.al.a(bM, true);
   }

   public boolean gt() {
      return this.al.a(bM);
   }

   public boolean gw() {
      return this.bX;
   }

   public void gx() {
      if (this.aP > this.bY) {
         this.bY = this.aP + this.dX().a(this.bX ? 2 : this.aP / 4, this.bX ? 8 : this.aP / 2);
         this.bX = !this.bX;
      }
   }

   @Override
   public void gl() {
      this.b(awa.gn);
   }

   @Override
   protected avz u() {
      return this.gA() ? null : awa.gk;
   }

   @Override
   protected avz e(btp $$0) {
      return this.j() ? awa.gt : super.e($$0);
   }

   @Override
   protected avz l_() {
      return awa.go;
   }

   @Override
   protected void b(ji $$0, dxq $$1) {
      this.a(awa.gp, 0.15F, 1.0F);
   }

   @Nullable
   @Override
   public bvy f() {
      return this.Q();
   }

   @Override
   protected void ab() {
      super.ab();
      agc.a(this);
   }

   @Override
   public void p(double $$0, double $$1, double $$2) {
      if (this.n()) {
         super.p($$0, $$1, $$2);
      }
   }

   public boolean gy() {
      List<cpr> $$0 = this.bs.c(cfc.j).orElse(List.of());
      boolean $$1 = this.gA();
      if ($$0.isEmpty()) {
         if ($$1) {
            this.gz();
         }

         return true;
      } else {
         boolean $$2 = false;

         for (cpr $$3 : $$0) {
            if (this.c((bvy)$$3) && !this.s($$3)) {
               $$2 = true;
               if ((!$$1 || bvy.aH.test($$3))
                  && this.a($$3, 0.5, false, true, new double[]{this.dD(), this.dB() + 0.5 * (double)this.ej(), (this.dD() + this.dB()) / 2.0})) {
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
            this.gz();
         }

         return true;
      }
   }

   public void a(cpr $$0) {
      this.ea().a(cfc.o, $$0);
      this.a(ecp.u);
      this.b(awa.gl);
      this.w(true);
   }

   public void gz() {
      this.ea().b(cfc.o);
      this.a(ecp.u);
      this.b(awa.gm);
      this.w(false);
   }

   public void w(boolean $$0) {
      this.al.a(bL, $$0);
   }

   public boolean gA() {
      return this.al.a(bL);
   }

   @Override
   public float a(ji $$0, dhc $$1) {
      return 0.0F;
   }

   class a extends cbu {
      public a(final cnw $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cnw.this.n()) {
            super.a();
         }
      }
   }

   class b extends cbx {
      public b(final cnw $$0) {
         super($$0);
      }

      @Override
      public void b() {
         if (cnw.this.n()) {
            super.b();
         } else {
            cnw.this.s(false);
         }
      }
   }

   class c extends cby {
      public c(final cnw $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cnw.this.n()) {
            super.a();
         }
      }
   }

   class d extends cbz {
      public d(final cnw $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cnw.this.n()) {
            super.a();
         }
      }
   }

   class e extends cfj {
      e(final cnw $$0, final dgz $$1) {
         super($$0, $$1);
      }

      @Override
      public void c() {
         if (cnw.this.n()) {
            super.c();
         }
      }

      @Override
      protected eum a(int $$0) {
         this.o = cnw.this.new f();
         this.o.a(true);
         return new eum(this.o, $$0);
      }
   }

   class f extends eus {
      private static final int m = 1024;

      @Override
      public eun a(eup $$0, int $$1, int $$2, int $$3) {
         ji $$4 = cnw.this.x();
         if ($$4 == null) {
            return super.a($$0, $$1, $$2, $$3);
         } else {
            double $$5 = $$4.j(new km($$1, $$2, $$3));
            return $$5 > 1024.0 && $$5 >= $$4.j($$0.b()) ? eun.a : super.a($$0, $$1, $$2, $$3);
         }
      }
   }
}
