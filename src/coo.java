import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class coo extends cnj {
   private static final akg<Boolean> bJ = akk.a(coo.class, aki.k);
   private static final akg<Boolean> bK = akk.a(coo.class, aki.k);
   private static final akg<Boolean> bL = akk.a(coo.class, aki.k);
   private static final akg<Optional<jj>> bM = akk.a(coo.class, aki.p);
   private static final int bN = 15;
   private static final int bO = 1;
   private static final float bP = 3.0F;
   private static final float bQ = 32.0F;
   private static final float bR = 144.0F;
   public static final int a = 40;
   private static final float bS = 0.4F;
   public static final float b = 0.3F;
   public static final int c = 16545810;
   public static final int d = 6250335;
   public static final int bE = 8;
   public static final int bF = 45;
   private static final int bT = 4;
   private int bU;
   public final bvj bG = new bvj();
   public final bvj bH = new bvj();
   public final bvj bI = new bvj();
   private int bV;
   private boolean bW;
   private int bX;
   private int bY;

   public coo(bwb<? extends coo> $$0, dhp $$1) {
      super($$0, $$1);
      this.bx = new coo.c(this);
      this.by = new coo.d(this);
      this.bz = new coo.b(this);
      cga $$2 = (cga)this.O();
      $$2.a(true);
      this.bw = 0;
   }

   public void i(jj $$0) {
      this.j($$0);
      this.a(evk.q, 8.0F);
      this.a(evk.f, 8.0F);
      this.a(evk.i, 8.0F);
      this.a(evk.o, 0.0F);
      this.a(evk.n, 0.0F);
   }

   public boolean j() {
      return this.x() != null;
   }

   @Override
   protected ccl I() {
      return new coo.a(this);
   }

   @Override
   protected bxr.b<coo> ec() {
      return cop.a();
   }

   @Override
   protected bxr<?> a(Dynamic<?> $$0) {
      return cop.b(this, this.ec().a($$0));
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bJ, true);
      $$0.a(bK, false);
      $$0.a(bL, false);
      $$0.a(bM, Optional.empty());
   }

   public static bxw.a m() {
      return cnj.gt().a(bxx.s, 1.0).a(bxx.v, 0.4F).a(bxx.c, 3.0).a(bxx.m, 32.0).a(bxx.B, 1.0625);
   }

   public boolean n() {
      return this.al.a(bJ);
   }

   @Override
   public boolean c(arn $$0, bvs $$1) {
      if (!($$1 instanceof bwr)) {
         return false;
      } else {
         this.bU = 15;
         this.dV().a(this, (byte)4);
         return super.c($$0, $$1);
      }
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
      jj $$3 = this.x();
      if ($$3 == null || $$1.a(axb.d)) {
         return super.a($$0, $$1, $$2);
      } else if (!this.a($$0, $$1) && this.bV <= 0 && !this.eG()) {
         cqi $$4 = this.j($$1);
         bvs $$5 = $$1.c();
         if (!($$5 instanceof bwr) && !($$5 instanceof crb) && $$4 == null) {
            return false;
         } else {
            this.bV = 8;
            this.dV().a(this, (byte)66);
            this.a(edm.u);
            if (this.dV().c_($$3) instanceof dwb $$6 && $$6.b(this)) {
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

   public cqi j(buh $$0) {
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
   public bxr<coo> eb() {
      return (bxr<coo>)super.eb();
   }

   @Override
   protected void a(arn $$0) {
      bqb $$1 = bqa.a();
      $$1.a("creakingBrain");
      this.eb().a((arn)this.dV(), this);
      $$1.c();
      cop.a(this);
   }

   @Override
   public void k_() {
      if (this.bV > 0) {
         this.bV--;
      }

      if (this.bU > 0) {
         this.bU--;
      }

      if (!this.dV().C) {
         boolean $$0 = this.al.a(bJ);
         boolean $$1 = this.gw();
         if ($$1 != $$0) {
            this.a(edm.u);
            if ($$1) {
               this.b(awk.gr);
            } else {
               this.W();
               this.b(awk.gq);
            }
         }

         this.al.a(bJ, $$1);
      }

      super.k_();
   }

   @Override
   public void h() {
      if (!this.dV().C) {
         jj $$0 = this.x();
         if ($$0 != null) {
            boolean var10000;
            label21: {
               if (this.dV().c_($$0) instanceof dwb $$1 && $$1.b(this)) {
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
         this.aO++;
         if (!this.dV().w_() && this.aO > 45 && !this.dQ()) {
            this.q();
         }
      } else {
         super.em();
      }
   }

   @Override
   protected void B(float $$0) {
      float $$1 = Math.min($$0 * 25.0F, 3.0F);
      this.aS.a($$1, 0.4F, 1.0F);
   }

   private void gz() {
      this.bG.a(this.bU > 0, this.af);
      this.bH.a(this.bV > 0, this.af);
      this.bI.a(this.gr(), this.af);
   }

   @Override
   public void q() {
      if (this.dV() instanceof arn $$0) {
         fcp $$1 = this.cR();
         fcu $$2 = $$1.f();
         double $$3 = $$1.b() * 0.3;
         double $$4 = $$1.c() * 0.3;
         double $$5 = $$1.d() * 0.3;
         $$0.a(new ln(lv.bi, dkw.u.m()), $$2.d, $$2.e, $$2.f, 100, $$3, $$4, $$5, 0.0);
         $$0.a(new ln(lv.bi, dkw.cB.m().b(dmp.c, dzg.c)), $$2.d, $$2.e, $$2.f, 10, $$3, $$4, $$5, 0.0);
      }

      this.b(this.l_());
      this.a(bvs.e.b);
   }

   public void k(buh $$0) {
      this.j($$0);
      this.a($$0);
      this.b(awk.gu);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 66) {
         this.bV = 8;
         this.h(this.dW().p());
      } else if ($$0 == 4) {
         this.bU = 15;
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
   protected boolean r(bvs $$0) {
      return !this.j() && super.r($$0);
   }

   @Override
   protected boolean bQ() {
      return !this.j() && super.bQ();
   }

   @Override
   protected void p(bvs $$0) {
      if (this.j()) {
         throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
      }
   }

   @Override
   public boolean n(boolean $$0) {
      return !this.j() && super.n($$0);
   }

   @Override
   protected cgb b(dhp $$0) {
      return new coo.e(this, $$0);
   }

   public boolean t() {
      List<cqi> $$0 = this.br.c(cft.j).orElse(List.of());
      if ($$0.isEmpty()) {
         this.bY = 0;
         return false;
      } else {
         fcp $$1 = this.cR();

         for (cqi $$2 : $$0) {
            if ($$1.d($$2.bE())) {
               this.bY++;
               return this.bY > 4;
            }
         }

         this.bY = 0;
         return false;
      }
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      if ($$0.e("home_pos")) {
         this.i(ul.a($$0, "home_pos").orElseThrow());
      }
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      jj $$1 = this.x();
      if ($$1 != null) {
         $$0.a("home_pos", ul.a($$1));
      }
   }

   public void j(jj $$0) {
      this.al.a(bM, Optional.of($$0));
   }

   @Nullable
   public jj x() {
      return this.al.a(bM).orElse(null);
   }

   public void gq() {
      this.al.a(bL, true);
   }

   public boolean gr() {
      return this.al.a(bL);
   }

   public boolean gu() {
      return this.bW;
   }

   public void gv() {
      if (this.aO > this.bX) {
         this.bX = this.aO + this.dY().a(this.bW ? 2 : this.aO / 4, this.bW ? 8 : this.aO / 2);
         this.bW = !this.bW;
      }
   }

   @Override
   public void gj() {
      this.b(awk.gn);
   }

   @Override
   protected awj u() {
      return this.gy() ? null : awk.gk;
   }

   @Override
   protected awj e(buh $$0) {
      return this.j() ? awk.gt : super.e($$0);
   }

   @Override
   protected awj l_() {
      return awk.go;
   }

   @Override
   protected void b(jj $$0, dym $$1) {
      this.a(awk.gp, 0.15F, 1.0F);
   }

   @Nullable
   @Override
   public bwr f() {
      return this.Q();
   }

   @Override
   protected void ab() {
      super.ab();
      agj.a(this);
   }

   @Override
   public void p(double $$0, double $$1, double $$2) {
      if (this.n()) {
         super.p($$0, $$1, $$2);
      }
   }

   public boolean gw() {
      List<cqi> $$0 = this.br.c(cft.j).orElse(List.of());
      boolean $$1 = this.gy();
      if ($$0.isEmpty()) {
         if ($$1) {
            this.gx();
         }

         return true;
      } else {
         boolean $$2 = false;

         for (cqi $$3 : $$0) {
            if (this.c((bwr)$$3) && !this.s($$3)) {
               $$2 = true;
               if ((!$$1 || bwr.aG.test($$3))
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

   public void a(cqi $$0) {
      this.eb().a(cft.p, $$0);
      this.a(edm.u);
      this.b(awk.gl);
      this.w(true);
   }

   public void gx() {
      this.eb().b(cft.p);
      this.a(edm.u);
      this.b(awk.gm);
      this.w(false);
   }

   public void w(boolean $$0) {
      this.al.a(bK, $$0);
   }

   public boolean gy() {
      return this.al.a(bK);
   }

   @Override
   public float a(jj $$0, dhs $$1) {
      return 0.0F;
   }

   class a extends ccl {
      public a(final coo $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (coo.this.n()) {
            super.a();
         }
      }
   }

   class b extends cco {
      public b(final coo $$0) {
         super($$0);
      }

      @Override
      public void b() {
         if (coo.this.n()) {
            super.b();
         } else {
            coo.this.s(false);
         }
      }
   }

   class c extends ccp {
      public c(final coo $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (coo.this.n()) {
            super.a();
         }
      }
   }

   class d extends ccq {
      public d(final coo $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (coo.this.n()) {
            super.a();
         }
      }
   }

   class e extends cga {
      e(final coo $$0, final dhp $$1) {
         super($$0, $$1);
      }

      @Override
      public void c() {
         if (coo.this.n()) {
            super.c();
         }
      }

      @Override
      protected evj a(int $$0) {
         this.o = coo.this.new f();
         this.o.a(true);
         return new evj(this.o, $$0);
      }
   }

   class f extends evp {
      private static final int m = 1024;

      @Override
      public evk a(evm $$0, int $$1, int $$2, int $$3) {
         jj $$4 = coo.this.x();
         if ($$4 == null) {
            return super.a($$0, $$1, $$2, $$3);
         } else {
            double $$5 = $$4.j(new kn($$1, $$2, $$3));
            return $$5 > 1024.0 && $$5 >= $$4.j($$0.b()) ? evk.a : super.a($$0, $$1, $$2, $$3);
         }
      }
   }
}
