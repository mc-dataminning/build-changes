import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chw extends chn {
   private static final aks<jh> cc = akw.a(chw.class, aku.o);
   private static final aks<Boolean> cd = akw.a(chw.class, aku.k);
   private static final aks<Integer> ce = akw.a(chw.class, aku.b);
   static final cgo cf = cgo.b().a(10.0).d();
   public static final int bZ = 4800;
   private static final int cg = 2400;
   public static final Predicate<cls> ca = $$0 -> !$$0.v() && $$0.bL() && $$0.bj();
   public static final float cb = 0.65F;

   public chw(bvi<? extends chw> $$0, dgz $$1) {
      super($$0, $$1);
      this.bQ = new cca(this, 85, 10, 0.02F, 0.1F, true);
      this.bP = new cbz(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      this.j(this.cs());
      this.w(0.0F);
      bwq $$4 = Objects.requireNonNullElseGet($$3, () -> new bus.a(0.1F));
      return super.a($$0, $$1, $$2, $$4);
   }

   @Nullable
   public chw b(arx $$0, bus $$1) {
      return bvi.I.a($$0, bvh.e);
   }

   @Override
   public float ej() {
      return this.e_() ? 0.65F : 1.0F;
   }

   @Override
   protected void r(int $$0) {
   }

   public void h(jh $$0) {
      this.al.a(cc, $$0);
   }

   public jh p() {
      return this.al.a(cc);
   }

   public boolean t() {
      return this.al.a(cd);
   }

   public void x(boolean $$0) {
      this.al.a(cd, $$0);
   }

   public int x() {
      return this.al.a(ce);
   }

   public void s(int $$0) {
      this.al.a(ce, $$0);
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(cc, jh.c);
      $$0.a(cd, false);
      $$0.a(ce, 2400);
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.p().u());
      $$0.a("TreasurePosY", this.p().v());
      $$0.a("TreasurePosZ", this.p().w());
      $$0.a("GotFish", this.t());
      $$0.a("Moistness", this.x());
   }

   @Override
   public void a(um $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.h(new jh($$1, $$2, $$3));
      super.a($$0);
      this.x($$0.q("GotFish"));
      this.s($$0.h("Moistness"));
   }

   @Override
   protected void B() {
      this.bT.a(0, new ccg(this));
      this.bT.a(0, new cef(this));
      this.bT.a(1, new chw.a(this));
      this.bT.a(2, new chw.b(this, 4.0));
      this.bT.a(4, new cdt(this, 1.0, 10));
      this.bT.a(4, new cdq(this));
      this.bT.a(5, new cdd(this, cpo.class, 6.0F));
      this.bT.a(5, new ccl(this, 10));
      this.bT.a(6, new cdf(this, 1.2F, true));
      this.bT.a(8, new chw.c());
      this.bT.a(8, new ccq(this));
      this.bT.a(9, new ccc<>(this, cmk.class, 8.0F, 1.0, 1.0));
      this.bU.a(1, new cen(this, cmk.class).a());
   }

   public static bxe.a go() {
      return bvz.C().a(bxf.s, 10.0).a(bxf.v, 1.2F).a(bxf.c, 3.0);
   }

   @Override
   protected cfj b(dgz $$0) {
      return new cfl(this, $$0);
   }

   @Override
   public void gf() {
      this.a(awv.hs, 1.0F, 1.0F);
   }

   @Override
   public boolean c(bvx $$0) {
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
   public int Z() {
      return 1;
   }

   @Override
   public int aa() {
      return 1;
   }

   @Override
   protected boolean o(bvb $$0) {
      return true;
   }

   @Override
   protected boolean f(bvj $$0) {
      return $$0 == bvj.a && this.fN();
   }

   @Override
   protected void a(arx $$0, cls $$1) {
      if (this.a(bvj.a).f()) {
         cxg $$2 = $$1.l();
         if (this.g($$2)) {
            this.a($$1);
            this.a(bvj.a, $$2);
            this.g(bvj.a);
            this.a($$1, $$2.M());
            $$1.at();
         }
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.gb()) {
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
            fbr $$0 = this.g(0.0F);
            float $$1 = azu.b(this.dM() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = azu.a(this.dM() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ae.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dW()
                  .a(ls.au, this.dB() - $$0.d * (double)$$3 + (double)$$1, this.dD() - $$0.e, this.dH() - $$0.f * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dW()
                  .a(ls.au, this.dB() - $$0.d * (double)$$3 - (double)$$1, this.dD() - $$0.e, this.dH() - $$0.f * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(ls.P);
      } else {
         super.b($$0);
      }
   }

   private void a(lq $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.ae.k() * 0.01;
         double $$3 = this.ae.k() * 0.01;
         double $$4 = this.ae.k() * 0.01;
         this.dW().a($$0, this.d(1.0), this.dE() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bta b(cpo $$0, bsz $$1) {
      cxg $$2 = $$0.b($$1);
      if (!$$2.f() && $$2.a(axt.aV)) {
         if (!this.dW().C) {
            this.a(awv.hu, 1.0F, 1.0F);
         }

         if (this.e_()) {
            $$2.a(1, $$0);
            this.a(d_(-this.b), true);
         } else {
            this.x(true);
            $$2.a(1, $$0);
         }

         return bta.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected awu e(btr $$0) {
      return awv.hv;
   }

   @Nullable
   @Override
   protected awu o_() {
      return awv.ht;
   }

   @Nullable
   @Override
   protected awu u() {
      return this.bj() ? awv.hr : awv.hq;
   }

   @Override
   protected awu aW() {
      return awv.hy;
   }

   @Override
   protected awu aV() {
      return awv.hz;
   }

   protected boolean gp() {
      jh $$0 = this.L().i();
      return $$0 != null ? $$0.a(this.du(), 12.0) : false;
   }

   @Override
   public void a_(fbr $$0) {
      if (this.di() && this.bj()) {
         this.a(this.fp(), $$0);
         this.a(bwb.a, this.dz());
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

   static class a extends ccv {
      private final chw a;
      private boolean b;

      a(chw $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccv.a.a, ccv.a.b));
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
         jh $$0 = this.a.p();
         return !jh.a((double)$$0.u(), this.a.dD(), (double)$$0.w()).a(this.a.du(), 4.0) && !this.b && this.a.ct() >= 100;
      }

      @Override
      public void d() {
         if (this.a.dW() instanceof arx) {
            arx $$0 = (arx)this.a.dW();
            this.b = false;
            this.a.L().o();
            jh $$1 = this.a.dw();
            jh $$2 = $$0.a(axw.b, $$1, 50, false);
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
         jh $$0 = this.a.p();
         if (jh.a((double)$$0.u(), this.a.dD(), (double)$$0.w()).a(this.a.du(), 4.0) || this.b) {
            this.a.x(false);
         }
      }

      @Override
      public void a() {
         dgz $$0 = this.a.dW();
         if (this.a.gp() || this.a.L().m()) {
            fbr $$1 = fbr.b(this.a.p());
            fbr $$2 = cgs.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = cgs.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               jh $$3 = jh.a((ka)$$2);
               if (!$$0.b_($$3).a(axq.a) || !$$0.a_($$3).a(euf.b)) {
                  $$2 = cgs.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
               }
            }

            if ($$2 == null) {
               this.b = true;
               return;
            }

            this.a.H().a($$2.d, $$2.e, $$2.f, (float)(this.a.aa() + 20), (float)this.a.Z());
            this.a.L().a($$2.d, $$2.e, $$2.f, 1.3);
            if ($$0.A.a(this.a(80)) == 0) {
               $$0.a(this.a, (byte)38);
            }
         }
      }
   }

   static class b extends ccv {
      private final chw a;
      private final double b;
      @Nullable
      private cpo c;

      b(chw $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(ccv.a.a, ccv.a.b));
      }

      @Override
      public boolean b() {
         this.c = a(this.a).a(chw.cf, this.a);
         return this.c == null ? false : this.c.ck() && this.a.O_() != this.c;
      }

      @Override
      public boolean c() {
         return this.c != null && this.c.ck() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void d() {
         this.c.b(new bug(bui.D, 100), this.a);
      }

      @Override
      public void e() {
         this.c = null;
         this.a.L().o();
      }

      @Override
      public void a() {
         this.a.H().a(this.c, (float)(this.a.aa() + 20), (float)this.a.Z());
         if (this.a.g(this.c) < 6.25) {
            this.a.L().o();
         } else {
            this.a.L().a(this.c, this.b);
         }

         if (this.c.ck() && this.c.dW().A.a(6) == 0) {
            this.c.b(new bug(bui.D, 100), this.a);
         }
      }
   }

   class c extends ccv {
      private int b;

      @Override
      public boolean b() {
         if (this.b > chw.this.af) {
            return false;
         } else {
            List<cls> $$0 = chw.this.dW().a(cls.class, chw.this.cR().c(8.0, 8.0, 8.0), chw.ca);
            return !$$0.isEmpty() || !chw.this.a(bvj.a).f();
         }
      }

      @Override
      public void d() {
         List<cls> $$0 = chw.this.dW().a(cls.class, chw.this.cR().c(8.0, 8.0, 8.0), chw.ca);
         if (!$$0.isEmpty()) {
            chw.this.L().a($$0.get(0), 1.2F);
            chw.this.a(awv.hx, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cxg $$0 = chw.this.a(bvj.a);
         if (!$$0.f()) {
            this.a($$0);
            chw.this.a(bvj.a, cxg.j);
            this.b = chw.this.af + chw.this.ae.a(100);
         }
      }

      @Override
      public void a() {
         List<cls> $$0 = chw.this.dW().a(cls.class, chw.this.cR().c(8.0, 8.0, 8.0), chw.ca);
         cxg $$1 = chw.this.a(bvj.a);
         if (!$$1.f()) {
            this.a($$1);
            chw.this.a(bvj.a, cxg.j);
         } else if (!$$0.isEmpty()) {
            chw.this.L().a($$0.get(0), 1.2F);
         }
      }

      private void a(cxg $$0) {
         if (!$$0.f()) {
            double $$1 = chw.this.dF() - 0.3F;
            cls $$2 = new cls(chw.this.dW(), chw.this.dB(), $$1, chw.this.dH(), $$0);
            $$2.b(40);
            $$2.b(chw.this);
            float $$3 = 0.3F;
            float $$4 = chw.this.ae.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * chw.this.ae.i();
            $$2.n(
               (double)(0.3F * -azu.a(chw.this.dM() * (float) (Math.PI / 180.0)) * azu.b(chw.this.dO() * (float) (Math.PI / 180.0)) + azu.b($$4) * $$5),
               (double)(0.3F * azu.a(chw.this.dO() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * azu.b(chw.this.dM() * (float) (Math.PI / 180.0)) * azu.b(chw.this.dO() * (float) (Math.PI / 180.0)) + azu.a($$4) * $$5)
            );
            chw.this.dW().b($$2);
         }
      }
   }
}
