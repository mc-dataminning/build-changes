import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chf extends cgw {
   private static final ajx<ji> cb = akb.a(chf.class, ajz.o);
   private static final ajx<Boolean> cc = akb.a(chf.class, ajz.k);
   private static final ajx<Integer> cd = akb.a(chf.class, ajz.b);
   static final cfx ce = cfx.b().a(10.0).d();
   public static final int bY = 4800;
   private static final int cf = 2400;
   public static final Predicate<clb> bZ = $$0 -> !$$0.v() && $$0.bL() && $$0.bj();
   public static final float ca = 0.65F;

   public chf(bur<? extends chf> $$0, dgi $$1) {
      super($$0, $$1);
      this.bP = new cbj(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new cbi(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public bvz a(dgz $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      this.j(this.cs());
      this.w(0.0F);
      bvz $$4 = Objects.requireNonNullElseGet($$3, () -> new bub.a(0.1F));
      return super.a($$0, $$1, $$2, $$4);
   }

   @Nullable
   public chf b(arc $$0, bub $$1) {
      return bur.I.a($$0, buq.e);
   }

   @Override
   public float ej() {
      return this.e_() ? 0.65F : 1.0F;
   }

   @Override
   protected void r(int $$0) {
   }

   public void h(ji $$0) {
      this.al.a(cb, $$0);
   }

   public ji p() {
      return this.al.a(cb);
   }

   public boolean t() {
      return this.al.a(cc);
   }

   public void x(boolean $$0) {
      this.al.a(cc, $$0);
   }

   public int x() {
      return this.al.a(cd);
   }

   public void s(int $$0) {
      this.al.a(cd, $$0);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(cb, ji.c);
      $$0.a(cc, false);
      $$0.a(cd, 2400);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.p().u());
      $$0.a("TreasurePosY", this.p().v());
      $$0.a("TreasurePosZ", this.p().w());
      $$0.a("GotFish", this.t());
      $$0.a("Moistness", this.x());
   }

   @Override
   public void a(tq $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.h(new ji($$1, $$2, $$3));
      super.a($$0);
      this.x($$0.q("GotFish"));
      this.s($$0.h("Moistness"));
   }

   @Override
   protected void B() {
      this.bS.a(0, new cbp(this));
      this.bS.a(0, new cdo(this));
      this.bS.a(1, new chf.a(this));
      this.bS.a(2, new chf.b(this, 4.0));
      this.bS.a(4, new cdc(this, 1.0, 10));
      this.bS.a(4, new ccz(this));
      this.bS.a(5, new ccm(this, cox.class, 6.0F));
      this.bS.a(5, new cbu(this, 10));
      this.bS.a(6, new cco(this, 1.2F, true));
      this.bS.a(8, new chf.c());
      this.bS.a(8, new cbz(this));
      this.bS.a(9, new cbl<>(this, clt.class, 8.0F, 1.0, 1.0));
      this.bT.a(1, new cdw(this, clt.class).a());
   }

   public static bwn.a gp() {
      return bvi.C().a(bwo.s, 10.0).a(bwo.v, 1.2F).a(bwo.c, 3.0);
   }

   @Override
   protected ces b(dgi $$0) {
      return new ceu(this, $$0);
   }

   @Override
   public void gg() {
      this.a(awa.hs, 1.0F, 1.0F);
   }

   @Override
   public boolean c(bvg $$0) {
      return !this.e_() && super.c($$0);
   }

   @Override
   public int cs() {
      return 4800;
   }

   @Override
   protected int m(int $$0) {
      return this.cs();
   }

   @Override
   public int aa() {
      return 1;
   }

   @Override
   public int ab() {
      return 1;
   }

   @Override
   protected boolean o(buk $$0) {
      return true;
   }

   @Override
   protected boolean f(bus $$0) {
      return $$0 == bus.a && this.fN();
   }

   @Override
   protected void a(arc $$0, clb $$1) {
      if (this.a(bus.a).f()) {
         cwp $$2 = $$1.l();
         if (this.g($$2)) {
            this.a($$1);
            this.a(bus.a, $$2);
            this.g(bus.a);
            this.a($$1, $$2.M());
            $$1.at();
         }
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.gc()) {
         this.j(this.cs());
      } else {
         if (this.bl()) {
            this.s(2400);
         } else {
            this.s(this.x() - 1);
            if (this.x() <= 0) {
               this.a(this.dX().t(), 1.0F);
            }

            if (this.aJ()) {
               this.h(this.dz().b((double)((this.ae.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.ae.i() * 2.0F - 1.0F) * 0.2F)));
               this.v(this.ae.i() * 360.0F);
               this.d(false);
               this.ar = true;
            }
         }

         if (this.dW().C && this.bj() && this.dz().h() > 0.03) {
            fba $$0 = this.g(0.0F);
            float $$1 = ayz.b(this.dM() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = ayz.a(this.dM() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ae.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dW()
                  .a(lt.au, this.dB() - $$0.d * (double)$$3 + (double)$$1, this.dD() - $$0.e, this.dH() - $$0.f * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dW()
                  .a(lt.au, this.dB() - $$0.d * (double)$$3 - (double)$$1, this.dD() - $$0.e, this.dH() - $$0.f * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(lt.P);
      } else {
         super.b($$0);
      }
   }

   private void a(lr $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.ae.k() * 0.01;
         double $$3 = this.ae.k() * 0.01;
         double $$4 = this.ae.k() * 0.01;
         this.dW().a($$0, this.d(1.0), this.dE() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bsj b(cox $$0, bsi $$1) {
      cwp $$2 = $$0.b($$1);
      if (!$$2.f() && $$2.a(awy.aT)) {
         if (!this.dW().C) {
            this.a(awa.hu, 1.0F, 1.0F);
         }

         if (this.e_()) {
            $$2.a(1, $$0);
            this.a(d_(-this.b), true);
         } else {
            this.x(true);
            $$2.a(1, $$0);
         }

         return bsj.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected avz e(bta $$0) {
      return awa.hv;
   }

   @Nullable
   @Override
   protected avz o_() {
      return awa.ht;
   }

   @Nullable
   @Override
   protected avz u() {
      return this.bj() ? awa.hr : awa.hq;
   }

   @Override
   protected avz aW() {
      return awa.hy;
   }

   @Override
   protected avz aV() {
      return awa.hz;
   }

   protected boolean gq() {
      ji $$0 = this.L().g();
      return $$0 != null ? $$0.a(this.du(), 12.0) : false;
   }

   @Override
   public void a_(fba $$0) {
      if (this.di() && this.bj()) {
         this.a(this.fp(), $$0);
         this.a(bvk.a, this.dz());
         this.h(this.dz().c(0.9));
         if (this.O_() == null) {
            this.h(this.dz().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public boolean y() {
      return true;
   }

   static class a extends cce {
      private final chf a;
      private boolean b;

      a(chf $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cce.a.a, cce.a.b));
      }

      @Override
      public boolean U_() {
         return false;
      }

      @Override
      public boolean b() {
         return this.a.t() && this.a.ct() >= 100;
      }

      @Override
      public boolean c() {
         ji $$0 = this.a.p();
         return !ji.a((double)$$0.u(), this.a.dD(), (double)$$0.w()).a(this.a.du(), 4.0) && !this.b && this.a.ct() >= 100;
      }

      @Override
      public void d() {
         if (this.a.dW() instanceof arc) {
            arc $$0 = (arc)this.a.dW();
            this.b = false;
            this.a.L().m();
            ji $$1 = this.a.dw();
            ji $$2 = $$0.a(axb.b, $$1, 50, false);
            if ($$2 != null) {
               this.a.h($$2);
               $$0.a(this.a, (byte)38);
            } else {
               this.b = true;
            }
         }
      }

      @Override
      public void e() {
         ji $$0 = this.a.p();
         if (ji.a((double)$$0.u(), this.a.dD(), (double)$$0.w()).a(this.a.du(), 4.0) || this.b) {
            this.a.x(false);
         }
      }

      @Override
      public void a() {
         dgi $$0 = this.a.dW();
         if (this.a.gq() || this.a.L().k()) {
            fba $$1 = fba.b(this.a.p());
            fba $$2 = cgb.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = cgb.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               ji $$3 = ji.a((kb)$$2);
               if (!$$0.b_($$3).a(awv.a) || !$$0.a_($$3).a(eto.b)) {
                  $$2 = cgb.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
               }
            }

            if ($$2 == null) {
               this.b = true;
               return;
            }

            this.a.H().a($$2.d, $$2.e, $$2.f, (float)(this.a.ab() + 20), (float)this.a.aa());
            this.a.L().a($$2.d, $$2.e, $$2.f, 1.3);
            if ($$0.A.a(this.a(80)) == 0) {
               $$0.a(this.a, (byte)38);
            }
         }
      }
   }

   static class b extends cce {
      private final chf a;
      private final double b;
      @Nullable
      private cox c;

      b(chf $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(cce.a.a, cce.a.b));
      }

      @Override
      public boolean b() {
         this.c = a(this.a).a(chf.ce, this.a);
         return this.c == null ? false : this.c.ck() && this.a.O_() != this.c;
      }

      @Override
      public boolean c() {
         return this.c != null && this.c.ck() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void d() {
         this.c.b(new btp(btr.D, 100), this.a);
      }

      @Override
      public void e() {
         this.c = null;
         this.a.L().m();
      }

      @Override
      public void a() {
         this.a.H().a(this.c, (float)(this.a.ab() + 20), (float)this.a.aa());
         if (this.a.g(this.c) < 6.25) {
            this.a.L().m();
         } else {
            this.a.L().a(this.c, this.b);
         }

         if (this.c.ck() && this.c.dW().A.a(6) == 0) {
            this.c.b(new btp(btr.D, 100), this.a);
         }
      }
   }

   class c extends cce {
      private int b;

      @Override
      public boolean b() {
         if (this.b > chf.this.af) {
            return false;
         } else {
            List<clb> $$0 = chf.this.dW().a(clb.class, chf.this.cR().c(8.0, 8.0, 8.0), chf.bZ);
            return !$$0.isEmpty() || !chf.this.a(bus.a).f();
         }
      }

      @Override
      public void d() {
         List<clb> $$0 = chf.this.dW().a(clb.class, chf.this.cR().c(8.0, 8.0, 8.0), chf.bZ);
         if (!$$0.isEmpty()) {
            chf.this.L().a($$0.get(0), 1.2F);
            chf.this.a(awa.hx, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cwp $$0 = chf.this.a(bus.a);
         if (!$$0.f()) {
            this.a($$0);
            chf.this.a(bus.a, cwp.j);
            this.b = chf.this.af + chf.this.ae.a(100);
         }
      }

      @Override
      public void a() {
         List<clb> $$0 = chf.this.dW().a(clb.class, chf.this.cR().c(8.0, 8.0, 8.0), chf.bZ);
         cwp $$1 = chf.this.a(bus.a);
         if (!$$1.f()) {
            this.a($$1);
            chf.this.a(bus.a, cwp.j);
         } else if (!$$0.isEmpty()) {
            chf.this.L().a($$0.get(0), 1.2F);
         }
      }

      private void a(cwp $$0) {
         if (!$$0.f()) {
            double $$1 = chf.this.dF() - 0.3F;
            clb $$2 = new clb(chf.this.dW(), chf.this.dB(), $$1, chf.this.dH(), $$0);
            $$2.b(40);
            $$2.b(chf.this);
            float $$3 = 0.3F;
            float $$4 = chf.this.ae.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * chf.this.ae.i();
            $$2.n(
               (double)(0.3F * -ayz.a(chf.this.dM() * (float) (Math.PI / 180.0)) * ayz.b(chf.this.dO() * (float) (Math.PI / 180.0)) + ayz.b($$4) * $$5),
               (double)(0.3F * ayz.a(chf.this.dO() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * ayz.b(chf.this.dM() * (float) (Math.PI / 180.0)) * ayz.b(chf.this.dO() * (float) (Math.PI / 180.0)) + ayz.a($$4) * $$5)
            );
            chf.this.dW().b($$2);
         }
      }
   }
}
