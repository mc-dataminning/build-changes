import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chx extends cho {
   private static final ajx<ji> bI = akb.a(chx.class, ajz.o);
   private static final ajx<Boolean> bJ = akb.a(chx.class, ajz.k);
   private static final ajx<Integer> bK = akb.a(chx.class, ajz.b);
   static final cgp bL = cgp.b().a(10.0).d();
   public static final int bF = 4800;
   private static final int bM = 2400;
   public static final Predicate<clw> bG = $$0 -> !$$0.o() && $$0.bJ() && $$0.bj();
   public static final float bH = 0.65F;

   public chx(bvi<? extends chx> $$0, dgz $$1) {
      super($$0, $$1);
      this.bz = new ccb(this, 85, 10, 0.02F, 0.1F, true);
      this.by = new cca(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      this.j(this.cr());
      this.x(0.0F);
      bwr $$4 = Objects.requireNonNullElseGet($$3, () -> new buq.a(0.1F));
      return super.a($$0, $$1, $$2, $$4);
   }

   @Nullable
   public chx b(ard $$0, buq $$1) {
      return bvi.H.a($$0, bvh.e);
   }

   @Override
   public float ei() {
      return this.n_() ? 0.65F : 1.0F;
   }

   @Override
   protected void r(int $$0) {
   }

   public void i(ji $$0) {
      this.al.a(bI, $$0);
   }

   public ji q() {
      return this.al.a(bI);
   }

   public boolean t() {
      return this.al.a(bJ);
   }

   public void w(boolean $$0) {
      this.al.a(bJ, $$0);
   }

   public int x() {
      return this.al.a(bK);
   }

   public void s(int $$0) {
      this.al.a(bK, $$0);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bI, ji.c);
      $$0.a(bJ, false);
      $$0.a(bK, 2400);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.q().u());
      $$0.a("TreasurePosY", this.q().v());
      $$0.a("TreasurePosZ", this.q().w());
      $$0.a("GotFish", this.t());
      $$0.a("Moistness", this.x());
   }

   @Override
   public void a(tq $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.i(new ji($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("GotFish"));
      this.s($$0.h("Moistness"));
   }

   @Override
   protected void D() {
      this.bC.a(0, new cch(this));
      this.bC.a(0, new ceg(this));
      this.bC.a(1, new chx.a(this));
      this.bC.a(2, new chx.b(this, 4.0));
      this.bC.a(4, new cdu(this, 1.0, 10));
      this.bC.a(4, new cdr(this));
      this.bC.a(5, new cde(this, cpr.class, 6.0F));
      this.bC.a(5, new ccm(this, 10));
      this.bC.a(6, new cdg(this, 1.2F, true));
      this.bC.a(8, new chx.c());
      this.bC.a(8, new ccr(this));
      this.bC.a(9, new ccd<>(this, cmo.class, 8.0F, 1.0, 1.0));
      this.bD.a(1, new ceo(this, cmo.class).a());
   }

   public static bxf.a gs() {
      return bwa.E().a(bxg.s, 10.0).a(bxg.v, 1.2F).a(bxg.c, 3.0);
   }

   @Override
   protected cfk b(dgz $$0) {
      return new cfm(this, $$0);
   }

   @Override
   public void gl() {
      this.a(awa.hs, 1.0F, 1.0F);
   }

   @Override
   public boolean c(bvy $$0) {
      return !this.n_() && super.c($$0);
   }

   @Override
   public int cr() {
      return 4800;
   }

   @Override
   protected int m(int $$0) {
      return this.cr();
   }

   @Override
   public int ac() {
      return 1;
   }

   @Override
   public int ad() {
      return 1;
   }

   @Override
   protected boolean o(bva $$0) {
      return true;
   }

   @Override
   protected boolean f(bvj $$0) {
      return $$0 == bvj.a && this.fP();
   }

   @Override
   protected void a(ard $$0, clw $$1) {
      if (this.a(bvj.a).f()) {
         cxh $$2 = $$1.f();
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
      if (this.gh()) {
         this.j(this.cr());
      } else {
         if (this.bk()) {
            this.s(2400);
         } else {
            this.s(this.x() - 1);
            if (this.x() <= 0) {
               this.a(this.dV().t(), 1.0F);
            }

            if (this.aJ()) {
               this.i(this.dx().b((double)((this.ae.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.ae.i() * 2.0F - 1.0F) * 0.2F)));
               this.w(this.ae.i() * 360.0F);
               this.d(false);
               this.ar = true;
            }
         }

         if (this.dU().C && this.bj() && this.dx().h() > 0.03) {
            fbx $$0 = this.h(0.0F);
            float $$1 = ayz.b(this.dK() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = ayz.a(this.dK() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ae.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dU()
                  .a(lt.av, this.dz() - $$0.d * (double)$$3 + (double)$$1, this.dB() - $$0.e, this.dF() - $$0.f * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dU()
                  .a(lt.av, this.dz() - $$0.d * (double)$$3 - (double)$$1, this.dB() - $$0.e, this.dF() - $$0.f * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(lt.Q);
      } else {
         super.b($$0);
      }
   }

   private void a(lr $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.ae.k() * 0.01;
         double $$3 = this.ae.k() * 0.01;
         double $$4 = this.ae.k() * 0.01;
         this.dU().a($$0, this.d(1.0), this.dC() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bsy b(cpr $$0, bsx $$1) {
      cxh $$2 = $$0.b($$1);
      if (!$$2.f() && $$2.a(awy.aT)) {
         if (!this.dU().C) {
            this.a(awa.hu, 1.0F, 1.0F);
         }

         if (this.n_()) {
            $$2.a(1, $$0);
            this.a(d_(-this.b), true);
         } else {
            this.w(true);
            $$2.a(1, $$0);
         }

         return bsy.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected avz e(btp $$0) {
      return awa.hv;
   }

   @Nullable
   @Override
   protected avz l_() {
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

   protected boolean gt() {
      ji $$0 = this.O().g();
      return $$0 != null ? $$0.a(this.ds(), 12.0) : false;
   }

   @Override
   public void a_(fbx $$0) {
      if (this.bj()) {
         this.a(this.fq(), $$0);
         this.a(bwc.a, this.dx());
         this.i(this.dx().c(0.9));
         if (this.f() == null) {
            this.i(this.dx().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public boolean w() {
      return true;
   }

   static class a extends ccw {
      private final chx a;
      private boolean b;

      a(chx $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccw.a.a, ccw.a.b));
      }

      @Override
      public boolean P_() {
         return false;
      }

      @Override
      public boolean b() {
         return this.a.t() && this.a.cs() >= 100;
      }

      @Override
      public boolean c() {
         ji $$0 = this.a.q();
         return !ji.a((double)$$0.u(), this.a.dB(), (double)$$0.w()).a(this.a.ds(), 4.0) && !this.b && this.a.cs() >= 100;
      }

      @Override
      public void d() {
         if (this.a.dU() instanceof ard) {
            ard $$0 = (ard)this.a.dU();
            this.b = false;
            this.a.O().m();
            ji $$1 = this.a.du();
            ji $$2 = $$0.a(axb.b, $$1, 50, false);
            if ($$2 != null) {
               this.a.i($$2);
               $$0.a(this.a, (byte)38);
            } else {
               this.b = true;
            }
         }
      }

      @Override
      public void e() {
         ji $$0 = this.a.q();
         if (ji.a((double)$$0.u(), this.a.dB(), (double)$$0.w()).a(this.a.ds(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void a() {
         dgz $$0 = this.a.dU();
         if (this.a.gt() || this.a.O().k()) {
            fbx $$1 = fbx.b(this.a.q());
            fbx $$2 = cgt.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = cgt.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               ji $$3 = ji.a((kb)$$2);
               if (!$$0.b_($$3).a(awv.a) || !$$0.a_($$3).a(eul.b)) {
                  $$2 = cgt.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
               }
            }

            if ($$2 == null) {
               this.b = true;
               return;
            }

            this.a.J().a($$2.d, $$2.e, $$2.f, (float)(this.a.ad() + 20), (float)this.a.ac());
            this.a.O().a($$2.d, $$2.e, $$2.f, 1.3);
            if ($$0.A.a(this.a(80)) == 0) {
               $$0.a(this.a, (byte)38);
            }
         }
      }
   }

   static class b extends ccw {
      private final chx a;
      private final double b;
      @Nullable
      private cpr c;

      b(chx $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(ccw.a.a, ccw.a.b));
      }

      @Override
      public boolean b() {
         this.c = a(this.a).a(chx.bL, this.a);
         return this.c == null ? false : this.c.cj() && this.a.f() != this.c;
      }

      @Override
      public boolean c() {
         return this.c != null && this.c.cj() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void d() {
         this.c.b(new bue(bug.D, 100), this.a);
      }

      @Override
      public void e() {
         this.c = null;
         this.a.O().m();
      }

      @Override
      public void a() {
         this.a.J().a(this.c, (float)(this.a.ad() + 20), (float)this.a.ac());
         if (this.a.g(this.c) < 6.25) {
            this.a.O().m();
         } else {
            this.a.O().a(this.c, this.b);
         }

         if (this.c.cj() && this.c.dU().A.a(6) == 0) {
            this.c.b(new bue(bug.D, 100), this.a);
         }
      }
   }

   class c extends ccw {
      private int b;

      @Override
      public boolean b() {
         if (this.b > chx.this.af) {
            return false;
         } else {
            List<clw> $$0 = chx.this.dU().a(clw.class, chx.this.cQ().c(8.0, 8.0, 8.0), chx.bG);
            return !$$0.isEmpty() || !chx.this.a(bvj.a).f();
         }
      }

      @Override
      public void d() {
         List<clw> $$0 = chx.this.dU().a(clw.class, chx.this.cQ().c(8.0, 8.0, 8.0), chx.bG);
         if (!$$0.isEmpty()) {
            chx.this.O().a($$0.get(0), 1.2F);
            chx.this.a(awa.hx, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cxh $$0 = chx.this.a(bvj.a);
         if (!$$0.f()) {
            this.a($$0);
            chx.this.a(bvj.a, cxh.k);
            this.b = chx.this.af + chx.this.ae.a(100);
         }
      }

      @Override
      public void a() {
         List<clw> $$0 = chx.this.dU().a(clw.class, chx.this.cQ().c(8.0, 8.0, 8.0), chx.bG);
         cxh $$1 = chx.this.a(bvj.a);
         if (!$$1.f()) {
            this.a($$1);
            chx.this.a(bvj.a, cxh.k);
         } else if (!$$0.isEmpty()) {
            chx.this.O().a($$0.get(0), 1.2F);
         }
      }

      private void a(cxh $$0) {
         if (!$$0.f()) {
            double $$1 = chx.this.dD() - 0.3F;
            clw $$2 = new clw(chx.this.dU(), chx.this.dz(), $$1, chx.this.dF(), $$0);
            $$2.b(40);
            $$2.b(chx.this);
            float $$3 = 0.3F;
            float $$4 = chx.this.ae.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * chx.this.ae.i();
            $$2.n(
               (double)(0.3F * -ayz.a(chx.this.dK() * (float) (Math.PI / 180.0)) * ayz.b(chx.this.dM() * (float) (Math.PI / 180.0)) + ayz.b($$4) * $$5),
               (double)(0.3F * ayz.a(chx.this.dM() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * ayz.b(chx.this.dK() * (float) (Math.PI / 180.0)) * ayz.b(chx.this.dM() * (float) (Math.PI / 180.0)) + ayz.a($$4) * $$5)
            );
            chx.this.dU().b($$2);
         }
      }
   }
}
