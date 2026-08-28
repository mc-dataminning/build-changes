import com.mojang.serialization.Dynamic;
import java.util.List;
import javax.annotation.Nullable;

public class cna extends clw {
   private static final ajx<Boolean> cd = akb.a(cna.class, ajz.k);
   private static final ajx<Boolean> ce = akb.a(cna.class, ajz.k);
   private static final ajx<Boolean> cf = akb.a(cna.class, ajz.k);
   private static final int cg = 15;
   private static final int ch = 1;
   private static final float ci = 3.0F;
   private static final float cj = 32.0F;
   private static final float ck = 144.0F;
   public static final int a = 40;
   private static final float cl = 0.4F;
   public static final float b = 0.3F;
   public static final int c = 16545810;
   public static final int d = 6250335;
   public static final int bY = 8;
   public static final int bZ = 45;
   private static final int cm = 4;
   private int cn;
   public final bub ca = new bub();
   public final bub cb = new bub();
   public final bub cc = new bub();
   private int co;
   private boolean cp;
   private int cq;
   @Nullable
   ji cr;
   private int cs;

   public cna(buq<? extends cna> $$0, dgg $$1) {
      super($$0, $$1);
      this.bO = new cna.c(this);
      this.bP = new cna.d(this);
      this.bQ = new cna.b(this);
      ceq $$2 = (ceq)this.L();
      $$2.a(true);
      this.bN = 0;
   }

   public void h(ji $$0) {
      this.cr = $$0;
      this.a(eto.q, 8.0F);
      this.a(eto.f, 8.0F);
      this.a(eto.i, 8.0F);
      this.a(eto.o, 0.0F);
      this.a(eto.n, 0.0F);
   }

   public boolean m() {
      return this.cr != null;
   }

   @Override
   protected cbb G() {
      return new cna.a(this);
   }

   @Override
   protected bwh.b<cna> ed() {
      return cnb.a();
   }

   @Override
   protected bwh<?> a(Dynamic<?> $$0) {
      return cnb.d(this.ed().a($$0));
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(cd, true);
      $$0.a(ce, false);
      $$0.a(cf, false);
   }

   public static bwm.a p() {
      return clw.gu().a(bwn.s, 1.0).a(bwn.v, 0.4F).a(bwn.c, 3.0).a(bwn.m, 32.0).a(bwn.B, 1.0625);
   }

   public boolean t() {
      return this.al.a(cd);
   }

   @Override
   public boolean c(arc $$0, buj $$1) {
      if (!($$1 instanceof bvf)) {
         return false;
      } else {
         this.cn = 15;
         this.dW().a(this, (byte)4);
         return super.c($$0, $$1);
      }
   }

   @Override
   public boolean a(arc $$0, bsz $$1, float $$2) {
      if (this.cr == null || $$1.a(awq.d)) {
         return super.a($$0, $$1, $$2);
      } else if (!this.a($$0, $$1) && this.co <= 0 && !this.eF()) {
         cov $$3 = this.j($$1);
         buj $$4 = $$1.c();
         if (!($$4 instanceof bvf) && !($$4 instanceof cpo) && $$3 == null) {
            return false;
         } else {
            this.co = 8;
            this.dW().a(this, (byte)66);
            if (this.dW().c_(this.cr) instanceof dum $$5 && $$5.a(this)) {
               if ($$3 != null) {
                  $$5.c();
               }

               this.h($$1);
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public cov j(bsz $$0) {
      this.f($$0);
      return this.g($$0);
   }

   @Override
   public boolean bI() {
      return super.bI() && this.t();
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (this.t()) {
         super.j($$0, $$1, $$2);
      }
   }

   @Override
   public bwh<cna> ec() {
      return (bwh<cna>)super.ec();
   }

   @Override
   protected void a(arc $$0) {
      bor $$1 = boq.a();
      $$1.a("creakingBrain");
      this.ec().a((arc)this.dW(), this);
      $$1.c();
      cnb.a(this);
   }

   @Override
   public void d_() {
      if (this.co > 0) {
         this.co--;
      }

      if (this.cn > 0) {
         this.cn--;
      }

      if (!this.dW().C) {
         boolean $$0 = this.al.a(cd);
         boolean $$1 = this.gw();
         if ($$1 != $$0) {
            this.a(ebr.u);
            if ($$1) {
               this.b(avz.gr);
            } else {
               this.U();
               this.b(avz.gq);
            }
         }

         this.al.a(cd, $$1);
      }

      super.d_();
   }

   @Override
   public void h() {
      if (!this.dW().C && this.cr != null) {
         boolean var10000;
         label21: {
            if (this.dW().c_(this.cr) instanceof dum $$0 && $$0.a(this)) {
               var10000 = true;
               break label21;
            }

            var10000 = false;
         }

         boolean $$1 = var10000;
         if (!$$1) {
            this.x(0.0F);
         }
      }

      super.h();
      if (this.dW().C) {
         this.gz();
         this.gv();
      }
   }

   @Override
   protected void em() {
      if (this.m() && this.gr()) {
         this.aP++;
         if (!this.dW().B_() && this.aP > 45 && !this.dR()) {
            this.x();
         }
      } else {
         super.em();
      }
   }

   @Override
   protected void B(float $$0) {
      float $$1 = Math.min($$0 * 25.0F, 3.0F);
      this.aT.a($$1, 0.4F, 1.0F);
   }

   private void gz() {
      this.ca.a(this.cn > 0, this.af);
      this.cb.a(this.co > 0, this.af);
      this.cc.a(this.gr(), this.af);
   }

   public void x() {
      if (this.dW() instanceof arc $$0) {
         fat $$1 = this.cR();
         fay $$2 = $$1.f();
         double $$3 = $$1.b() * 0.3;
         double $$4 = $$1.c() * 0.3;
         double $$5 = $$1.d() * 0.3;
         $$0.a(new ll(lt.bh, djm.u.m()), $$2.d, $$2.e, $$2.f, 100, $$3, $$4, $$5, 0.0);
         $$0.a(new ll(lt.bh, djm.cB.m().b(dlf.c, Boolean.valueOf(true))), $$2.d, $$2.e, $$2.f, 10, $$3, $$4, $$5, 0.0);
      }

      this.b(this.o_());
      this.a(buj.d.b);
   }

   public void k(bsz $$0) {
      this.j($$0);
      this.a($$0);
      this.b(avz.gu);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 66) {
         this.co = 8;
         this.h(this.dX().p());
      } else if ($$0 == 4) {
         this.cn = 15;
         this.gg();
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean bi() {
      return this.m() || super.bi();
   }

   @Override
   protected boolean r(buj $$0) {
      return !this.m() && super.r($$0);
   }

   @Override
   protected boolean bR() {
      return !this.m() && super.bR();
   }

   @Override
   protected void p(buj $$0) {
      if (this.m()) {
         throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
      }
   }

   @Override
   public boolean o(boolean $$0) {
      return !this.m() && super.o($$0);
   }

   @Override
   protected cer b(dgg $$0) {
      return new cna.e(this, $$0);
   }

   public boolean gp() {
      List<cov> $$0 = this.bE.c(cej.j).orElse(List.of());
      if ($$0.isEmpty()) {
         this.cs = 0;
         return false;
      } else {
         fat $$1 = this.cR();

         for (cov $$2 : $$0) {
            if ($$1.d($$2.bF())) {
               this.cs++;
               return this.cs > 4;
            }
         }

         this.cs = 0;
         return false;
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.e("home_pos")) {
         this.h(uf.a($$0, "home_pos").orElseThrow());
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      if (this.cr != null) {
         $$0.a("home_pos", uf.a(this.cr));
      }
   }

   public void gq() {
      this.al.a(cf, true);
   }

   public boolean gr() {
      return this.al.a(cf);
   }

   public boolean gs() {
      return this.cp;
   }

   public void gv() {
      if (this.aP > this.cq) {
         this.cq = this.aP + this.dZ().a(this.cp ? 2 : this.aP / 4, this.cp ? 8 : this.aP / 2);
         this.cp = !this.cp;
      }
   }

   @Override
   public void gg() {
      this.b(avz.gn);
   }

   @Override
   protected avy u() {
      return this.gy() ? null : avz.gk;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.gt;
   }

   @Override
   protected avy o_() {
      return avz.go;
   }

   @Override
   protected void b(ji $$0, dwv $$1) {
      this.a(avz.gp, 0.15F, 1.0F);
   }

   @Nullable
   @Override
   public bvf O_() {
      return this.O();
   }

   @Override
   protected void Z() {
      super.Z();
      agc.a(this);
   }

   @Override
   public void p(double $$0, double $$1, double $$2) {
      if (this.t()) {
         super.p($$0, $$1, $$2);
      }
   }

   public boolean gw() {
      List<cov> $$0 = this.bE.c(cej.j).orElse(List.of());
      boolean $$1 = this.gy();
      if ($$0.isEmpty()) {
         if ($$1) {
            this.gx();
         }

         return true;
      } else {
         boolean $$2 = false;

         for (cov $$3 : $$0) {
            if (this.c((bvf)$$3) && !this.s($$3)) {
               $$2 = true;
               if ((!$$1 || bvf.aH.test($$3))
                  && this.a($$3, 0.5, false, true, new double[]{this.dF(), this.dD() + 0.5 * (double)this.ek(), (this.dF() + this.dD()) / 2.0})) {
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

   public void a(cov $$0) {
      this.ec().a(cej.o, $$0);
      this.a(ebr.u);
      this.b(avz.gl);
      this.x(true);
   }

   public void gx() {
      this.ec().b(cej.o);
      this.a(ebr.u);
      this.b(avz.gm);
      this.x(false);
   }

   public void x(boolean $$0) {
      this.al.a(ce, $$0);
   }

   public boolean gy() {
      return this.al.a(ce);
   }

   @Override
   public float a(ji $$0, dgj $$1) {
      return 0.0F;
   }

   class a extends cbb {
      public a(final cna $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cna.this.t()) {
            super.a();
         }
      }
   }

   class b extends cbe {
      public b(final cna $$0) {
         super($$0);
      }

      @Override
      public void b() {
         if (cna.this.t()) {
            super.b();
         } else {
            cna.this.t(false);
         }
      }
   }

   class c extends cbf {
      public c(final cna $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cna.this.t()) {
            super.a();
         }
      }
   }

   class d extends cbg {
      public d(final cna $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cna.this.t()) {
            super.a();
         }
      }
   }

   class e extends ceq {
      e(final cna $$0, final dgg $$1) {
         super($$0, $$1);
      }

      @Override
      public void c() {
         if (cna.this.t()) {
            super.c();
         }
      }

      @Override
      protected etn a(int $$0) {
         this.o = cna.this.new f();
         this.o.a(true);
         return new etn(this.o, $$0);
      }
   }

   class f extends ett {
      private static final int m = 1024;

      @Override
      public eto a(etq $$0, int $$1, int $$2, int $$3) {
         ji $$4 = cna.this.cr;
         if ($$4 == null) {
            return super.a($$0, $$1, $$2, $$3);
         } else {
            double $$5 = $$4.j(new km($$1, $$2, $$3));
            return $$5 > 1024.0 && $$5 >= $$4.j($$0.b()) ? eto.a : super.a($$0, $$1, $$2, $$3);
         }
      }
   }
}
