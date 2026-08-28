import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class coy extends cnt {
   private static final akh<Boolean> bK = akl.a(coy.class, akj.k);
   private static final akh<Boolean> bL = akl.a(coy.class, akj.k);
   private static final akh<Boolean> bM = akl.a(coy.class, akj.k);
   private static final akh<Optional<iu>> bN = akl.a(coy.class, akj.p);
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
   public final bvr bH = new bvr();
   public final bvr bI = new bvr();
   public final bvr bJ = new bvr();
   private int bW;
   private boolean bX;
   private int bY;
   private int bZ;

   public coy(bwj<? extends coy> $$0, dip $$1) {
      super($$0, $$1);
      this.by = new coy.c(this);
      this.bz = new coy.d(this);
      this.bA = new coy.b(this);
      cgi $$2 = (cgi)this.O();
      $$2.a(true);
      this.bx = 0;
   }

   public void h(iu $$0) {
      this.i($$0);
      this.a(ewm.q, 8.0F);
      this.a(ewm.f, 8.0F);
      this.a(ewm.i, 8.0F);
      this.a(ewm.o, 0.0F);
      this.a(ewm.n, 0.0F);
   }

   public boolean j() {
      return this.x() != null;
   }

   @Override
   protected cct I() {
      return new coy.a(this);
   }

   @Override
   protected bxz.b<coy> ec() {
      return coz.a();
   }

   @Override
   protected bxz<?> a(Dynamic<?> $$0) {
      return coz.b(this, this.ec().a($$0));
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bK, true);
      $$0.a(bL, false);
      $$0.a(bM, false);
      $$0.a(bN, Optional.empty());
   }

   public static bye.a m() {
      return cnt.gt().a(byf.s, 1.0).a(byf.v, 0.4F).a(byf.c, 3.0).a(byf.m, 32.0).a(byf.B, 1.0625);
   }

   public boolean n() {
      return this.al.a(bK);
   }

   @Override
   public boolean c(aro $$0, bwa $$1) {
      if (!($$1 instanceof bwz)) {
         return false;
      } else {
         this.bV = 15;
         this.dV().a(this, (byte)4);
         return super.c($$0, $$1);
      }
   }

   @Override
   public boolean a(aro $$0, bup $$1, float $$2) {
      iu $$3 = this.x();
      if ($$3 == null || $$1.a(axb.d)) {
         return super.a($$0, $$1, $$2);
      } else if (!this.a($$0, $$1) && this.bW <= 0 && !this.eG()) {
         cqs $$4 = this.j($$1);
         bwa $$5 = $$1.c();
         if (!($$5 instanceof bwz) && !($$5 instanceof crm) && $$4 == null) {
            return false;
         } else {
            this.bW = 8;
            this.dV().a(this, (byte)66);
            this.a(eeo.u);
            if (this.dV().c_($$3) instanceof dxd $$6 && $$6.b(this)) {
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

   public cqs j(bup $$0) {
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
   public bxz<coy> eb() {
      return (bxz<coy>)super.eb();
   }

   @Override
   protected void a(aro $$0) {
      bqj $$1 = bqi.a();
      $$1.a("creakingBrain");
      this.eb().a((aro)this.dV(), this);
      $$1.c();
      coz.a(this);
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
            this.a(eeo.u);
            if ($$1) {
               this.b(awl.gr);
            } else {
               this.W();
               this.b(awl.gq);
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
               if (this.dV().c_($$0) instanceof dxd $$1 && $$1.b(this)) {
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
      if (this.dV() instanceof aro $$0) {
         fdr $$1 = this.cR();
         fdw $$2 = $$1.f();
         double $$3 = $$1.b() * 0.3;
         double $$4 = $$1.c() * 0.3;
         double $$5 = $$1.d() * 0.3;
         $$0.a(new lp(lx.bi, dlw.u.m()), $$2.d, $$2.e, $$2.f, 100, $$3, $$4, $$5, 0.0);
         $$0.a(new lp(lx.bi, dlw.cB.m().b(dnp.c, eai.c)), $$2.d, $$2.e, $$2.f, 10, $$3, $$4, $$5, 0.0);
      }

      this.b(this.l_());
      this.a(bwa.e.b);
   }

   public void k(bup $$0) {
      this.j($$0);
      this.a($$0);
      this.b(awl.gu);
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
   protected boolean r(bwa $$0) {
      return !this.j() && super.r($$0);
   }

   @Override
   protected boolean bQ() {
      return !this.j() && super.bQ();
   }

   @Override
   protected void p(bwa $$0) {
      if (this.j()) {
         throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
      }
   }

   @Override
   public boolean n(boolean $$0) {
      return !this.j() && super.n($$0);
   }

   @Override
   protected cgj b(dip $$0) {
      return new coy.e(this, $$0);
   }

   public boolean t() {
      List<cqs> $$0 = this.bs.c(cgb.j).orElse(List.of());
      if ($$0.isEmpty()) {
         this.bZ = 0;
         return false;
      } else {
         fdr $$1 = this.cR();

         for (cqs $$2 : $$0) {
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
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.e("home_pos")) {
         this.h(um.a($$0, "home_pos").orElseThrow());
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      iu $$1 = this.x();
      if ($$1 != null) {
         $$0.a("home_pos", um.a($$1));
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
      this.b(awl.gn);
   }

   @Override
   protected awk u() {
      return this.gy() ? null : awl.gk;
   }

   @Override
   protected awk e(bup $$0) {
      return this.j() ? awl.gt : super.e($$0);
   }

   @Override
   protected awk l_() {
      return awl.go;
   }

   @Override
   protected void b(iu $$0, dzo $$1) {
      this.a(awl.gp, 0.15F, 1.0F);
   }

   @Nullable
   @Override
   public bwz f() {
      return this.Q();
   }

   @Override
   protected void ab() {
      super.ab();
      agk.a(this);
   }

   @Override
   public void p(double $$0, double $$1, double $$2) {
      if (this.n()) {
         super.p($$0, $$1, $$2);
      }
   }

   public boolean gw() {
      List<cqs> $$0 = this.bs.c(cgb.j).orElse(List.of());
      boolean $$1 = this.gy();
      if ($$0.isEmpty()) {
         if ($$1) {
            this.gx();
         }

         return true;
      } else {
         boolean $$2 = false;

         for (cqs $$3 : $$0) {
            if (this.c((bwz)$$3) && !this.s($$3)) {
               $$2 = true;
               if ((!$$1 || bwz.aH.test($$3))
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

   public void a(cqs $$0) {
      this.eb().a(cgb.p, $$0);
      this.a(eeo.u);
      this.b(awl.gl);
      this.w(true);
   }

   public void gx() {
      this.eb().b(cgb.p);
      this.a(eeo.u);
      this.b(awl.gm);
      this.w(false);
   }

   public void w(boolean $$0) {
      this.al.a(bL, $$0);
   }

   public boolean gy() {
      return this.al.a(bL);
   }

   @Override
   public float a(iu $$0, dis $$1) {
      return 0.0F;
   }

   class a extends cct {
      public a(final coy $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (coy.this.n()) {
            super.a();
         }
      }
   }

   class b extends ccw {
      public b(final coy $$0) {
         super($$0);
      }

      @Override
      public void b() {
         if (coy.this.n()) {
            super.b();
         } else {
            coy.this.s(false);
         }
      }
   }

   class c extends ccx {
      public c(final coy $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (coy.this.n()) {
            super.a();
         }
      }
   }

   class d extends ccy {
      public d(final coy $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (coy.this.n()) {
            super.a();
         }
      }
   }

   class e extends cgi {
      e(final coy $$0, final dip $$1) {
         super($$0, $$1);
      }

      @Override
      public void c() {
         if (coy.this.n()) {
            super.c();
         }
      }

      @Override
      protected ewl a(int $$0) {
         this.o = coy.this.new f();
         this.o.a(true);
         return new ewl(this.o, $$0);
      }
   }

   class f extends ewr {
      private static final int m = 1024;

      @Override
      public ewm a(ewo $$0, int $$1, int $$2, int $$3) {
         iu $$4 = coy.this.x();
         if ($$4 == null) {
            return super.a($$0, $$1, $$2, $$3);
         } else {
            double $$5 = $$4.j(new jz($$1, $$2, $$3));
            return $$5 > 1024.0 && $$5 >= $$4.j($$0.b()) ? ewm.a : super.a($$0, $$1, $$2, $$3);
         }
      }
   }
}
