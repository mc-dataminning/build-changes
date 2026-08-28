import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cnb extends clx {
   private static final ajy<Boolean> cd = akc.a(cnb.class, aka.k);
   private static final ajy<Boolean> ce = akc.a(cnb.class, aka.k);
   private static final ajy<Boolean> cf = akc.a(cnb.class, aka.k);
   private static final ajy<Optional<ji>> cg = akc.a(cnb.class, aka.p);
   private static final int ch = 15;
   private static final int ci = 1;
   private static final float cj = 3.0F;
   private static final float ck = 32.0F;
   private static final float cl = 144.0F;
   public static final int a = 40;
   private static final float cm = 0.4F;
   public static final float b = 0.3F;
   public static final int c = 16545810;
   public static final int d = 6250335;
   public static final int bY = 8;
   public static final int bZ = 45;
   private static final int cn = 4;
   private int co;
   public final buc ca = new buc();
   public final buc cb = new buc();
   public final buc cc = new buc();
   private int cp;
   private boolean cq;
   private int cr;
   private int cs;

   public cnb(bur<? extends cnb> $$0, dgh $$1) {
      super($$0, $$1);
      this.bO = new cnb.c(this);
      this.bP = new cnb.d(this);
      this.bQ = new cnb.b(this);
      cer $$2 = (cer)this.P();
      $$2.a(true);
      this.bN = 0;
   }

   public void h(ji $$0) {
      this.i($$0);
      this.a(etp.q, 8.0F);
      this.a(etp.f, 8.0F);
      this.a(etp.i, 8.0F);
      this.a(etp.o, 0.0F);
      this.a(etp.n, 0.0F);
   }

   public boolean m() {
      return this.gt() != null;
   }

   @Override
   protected cbc J() {
      return new cnb.a(this);
   }

   @Override
   protected bwi.b<cnb> ec() {
      return cnc.a();
   }

   @Override
   protected bwi<?> a(Dynamic<?> $$0) {
      return cnc.d(this.ec().a($$0));
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(cd, true);
      $$0.a(ce, false);
      $$0.a(cf, false);
      $$0.a(cg, Optional.empty());
   }

   public static bwn.a p() {
      return clx.gx().a(bwo.s, 1.0).a(bwo.v, 0.4F).a(bwo.c, 3.0).a(bwo.m, 32.0).a(bwo.B, 1.0625);
   }

   public boolean t() {
      return this.al.a(cd);
   }

   @Override
   public boolean c(ard $$0, buk $$1) {
      if (!($$1 instanceof bvg)) {
         return false;
      } else {
         this.co = 15;
         this.dV().a(this, (byte)4);
         return super.c($$0, $$1);
      }
   }

   @Override
   public boolean a(ard $$0, bta $$1, float $$2) {
      ji $$3 = this.gt();
      if ($$3 == null || $$1.a(awr.d)) {
         return super.a($$0, $$1, $$2);
      } else if (!this.a($$0, $$1) && this.cp <= 0 && !this.eE()) {
         cow $$4 = this.j($$1);
         buk $$5 = $$1.c();
         if (!($$5 instanceof bvg) && !($$5 instanceof cpp) && $$4 == null) {
            return false;
         } else {
            this.cp = 8;
            this.dV().a(this, (byte)66);
            if (this.dV().c_($$3) instanceof dun $$6 && $$6.b(this)) {
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

   public cow j(bta $$0) {
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
   public bwi<cnb> eb() {
      return (bwi<cnb>)super.eb();
   }

   @Override
   protected void a(ard $$0) {
      bos $$1 = bor.a();
      $$1.a("creakingBrain");
      this.eb().a((ard)this.dV(), this);
      $$1.c();
      cnc.a(this);
   }

   @Override
   public void d_() {
      if (this.cp > 0) {
         this.cp--;
      }

      if (this.co > 0) {
         this.co--;
      }

      if (!this.dV().C) {
         boolean $$0 = this.al.a(cd);
         boolean $$1 = this.gA();
         if ($$1 != $$0) {
            this.a(ebs.u);
            if ($$1) {
               this.b(awa.gr);
            } else {
               this.X();
               this.b(awa.gq);
            }
         }

         this.al.a(cd, $$1);
      }

      super.d_();
   }

   @Override
   public void h() {
      if (!this.dV().C) {
         ji $$0 = this.gt();
         if ($$0 != null) {
            boolean var10000;
            label21: {
               if (this.dV().c_($$0) instanceof dun $$1 && $$1.b(this)) {
                  var10000 = true;
                  break label21;
               }

               var10000 = false;
            }

            boolean $$2 = var10000;
            if (!$$2) {
               this.x(0.0F);
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
   protected void el() {
      if (this.m() && this.gv()) {
         this.aP++;
         if (!this.dV().B_() && this.aP > 45 && !this.dQ()) {
            this.x();
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

   private void gD() {
      this.ca.a(this.co > 0, this.af);
      this.cb.a(this.cp > 0, this.af);
      this.cc.a(this.gv(), this.af);
   }

   public void x() {
      if (this.dV() instanceof ard $$0) {
         fau $$1 = this.cR();
         faz $$2 = $$1.f();
         double $$3 = $$1.b() * 0.3;
         double $$4 = $$1.c() * 0.3;
         double $$5 = $$1.d() * 0.3;
         $$0.a(new ll(lt.bh, djn.u.m()), $$2.d, $$2.e, $$2.f, 100, $$3, $$4, $$5, 0.0);
         $$0.a(new ll(lt.bh, djn.cB.m().b(dlg.c, Boolean.valueOf(true))), $$2.d, $$2.e, $$2.f, 10, $$3, $$4, $$5, 0.0);
      }

      this.b(this.o_());
      this.a(buk.d.b);
   }

   public void k(bta $$0) {
      this.j($$0);
      this.a($$0);
      this.b(awa.gu);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 66) {
         this.cp = 8;
         this.h(this.dW().p());
      } else if ($$0 == 4) {
         this.co = 15;
         this.gj();
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean bi() {
      return this.m() || super.bi();
   }

   @Override
   public boolean eL() {
      return !this.m() && super.eL();
   }

   @Override
   protected boolean r(buk $$0) {
      return !this.m() && super.r($$0);
   }

   @Override
   protected boolean bR() {
      return !this.m() && super.bR();
   }

   @Override
   protected void p(buk $$0) {
      if (this.m()) {
         throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
      }
   }

   @Override
   public boolean o(boolean $$0) {
      return !this.m() && super.o($$0);
   }

   @Override
   protected ces b(dgh $$0) {
      return new cnb.e(this, $$0);
   }

   public boolean gs() {
      List<cow> $$0 = this.bE.c(cek.j).orElse(List.of());
      if ($$0.isEmpty()) {
         this.cs = 0;
         return false;
      } else {
         fau $$1 = this.cR();

         for (cow $$2 : $$0) {
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
      ji $$1 = this.gt();
      if ($$1 != null) {
         $$0.a("home_pos", uf.a($$1));
      }
   }

   public void i(ji $$0) {
      this.al.a(cg, Optional.of($$0));
   }

   @Nullable
   public ji gt() {
      return this.al.a(cg).orElse(null);
   }

   public void gu() {
      this.al.a(cf, true);
   }

   public boolean gv() {
      return this.al.a(cf);
   }

   public boolean gy() {
      return this.cq;
   }

   public void gz() {
      if (this.aP > this.cr) {
         this.cr = this.aP + this.dY().a(this.cq ? 2 : this.aP / 4, this.cq ? 8 : this.aP / 2);
         this.cq = !this.cq;
      }
   }

   @Override
   public void gj() {
      this.b(awa.gn);
   }

   @Override
   protected avz u() {
      return this.gC() ? null : awa.gk;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.gt;
   }

   @Override
   protected avz o_() {
      return awa.go;
   }

   @Override
   protected void b(ji $$0, dww $$1) {
      this.a(awa.gp, 0.15F, 1.0F);
   }

   @Nullable
   @Override
   public bvg O_() {
      return this.R();
   }

   @Override
   protected void ac() {
      super.ac();
      agd.a(this);
   }

   @Override
   public void p(double $$0, double $$1, double $$2) {
      if (this.t()) {
         super.p($$0, $$1, $$2);
      }
   }

   public boolean gA() {
      List<cow> $$0 = this.bE.c(cek.j).orElse(List.of());
      boolean $$1 = this.gC();
      if ($$0.isEmpty()) {
         if ($$1) {
            this.gB();
         }

         return true;
      } else {
         boolean $$2 = false;

         for (cow $$3 : $$0) {
            if (this.c((bvg)$$3) && !this.s($$3)) {
               $$2 = true;
               if ((!$$1 || bvg.aH.test($$3))
                  && this.a($$3, 0.5, false, true, new double[]{this.dE(), this.dC() + 0.5 * (double)this.ej(), (this.dE() + this.dC()) / 2.0})) {
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

   public void a(cow $$0) {
      this.eb().a(cek.o, $$0);
      this.a(ebs.u);
      this.b(awa.gl);
      this.x(true);
   }

   public void gB() {
      this.eb().b(cek.o);
      this.a(ebs.u);
      this.b(awa.gm);
      this.x(false);
   }

   public void x(boolean $$0) {
      this.al.a(ce, $$0);
   }

   public boolean gC() {
      return this.al.a(ce);
   }

   @Override
   public float a(ji $$0, dgk $$1) {
      return 0.0F;
   }

   class a extends cbc {
      public a(final cnb $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cnb.this.t()) {
            super.a();
         }
      }
   }

   class b extends cbf {
      public b(final cnb $$0) {
         super($$0);
      }

      @Override
      public void b() {
         if (cnb.this.t()) {
            super.b();
         } else {
            cnb.this.t(false);
         }
      }
   }

   class c extends cbg {
      public c(final cnb $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cnb.this.t()) {
            super.a();
         }
      }
   }

   class d extends cbh {
      public d(final cnb $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cnb.this.t()) {
            super.a();
         }
      }
   }

   class e extends cer {
      e(final cnb $$0, final dgh $$1) {
         super($$0, $$1);
      }

      @Override
      public void c() {
         if (cnb.this.t()) {
            super.c();
         }
      }

      @Override
      protected eto a(int $$0) {
         this.o = cnb.this.new f();
         this.o.a(true);
         return new eto(this.o, $$0);
      }
   }

   class f extends etu {
      private static final int m = 1024;

      @Override
      public etp a(etr $$0, int $$1, int $$2, int $$3) {
         ji $$4 = cnb.this.gt();
         if ($$4 == null) {
            return super.a($$0, $$1, $$2, $$3);
         } else {
            double $$5 = $$4.j(new km($$1, $$2, $$3));
            return $$5 > 1024.0 && $$5 >= $$4.j($$0.b()) ? etp.a : super.a($$0, $$1, $$2, $$3);
         }
      }
   }
}
