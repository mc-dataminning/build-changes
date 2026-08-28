import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgu extends cgl {
   private static final akk<jg> cb = ako.a(cgu.class, akm.o);
   private static final akk<Boolean> cc = ako.a(cgu.class, akm.k);
   private static final akk<Integer> cd = ako.a(cgu.class, akm.b);
   static final cfm ce = cfm.b().a(10.0).d();
   public static final int bY = 4800;
   private static final int cf = 2400;
   public static final Predicate<ckq> bZ = $$0 -> !$$0.w() && $$0.bM() && $$0.bk();
   public static final float ca = 0.65F;

   public cgu(bug<? extends cgu> $$0, dev $$1) {
      super($$0, $$1);
      this.bP = new cay(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new cax(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      this.j(this.ct());
      this.w(0.0F);
      bvo $$4 = Objects.requireNonNullElseGet($$3, () -> new btq.a(0.1F));
      return super.a($$0, $$1, $$2, $$4);
   }

   @Nullable
   public cgu b(arm $$0, btq $$1) {
      return bug.y.a($$0, buf.e);
   }

   @Override
   public float ek() {
      return this.p_() ? 0.65F : 1.0F;
   }

   @Override
   protected void s(int $$0) {
   }

   public void h(jg $$0) {
      this.am.a(cb, $$0);
   }

   public jg q() {
      return this.am.a(cb);
   }

   public boolean t() {
      return this.am.a(cc);
   }

   public void x(boolean $$0) {
      this.am.a(cc, $$0);
   }

   public int y() {
      return this.am.a(cd);
   }

   public void t(int $$0) {
      this.am.a(cd, $$0);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(cb, jg.c);
      $$0.a(cc, false);
      $$0.a(cd, 2400);
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.q().u());
      $$0.a("TreasurePosY", this.q().v());
      $$0.a("TreasurePosZ", this.q().w());
      $$0.a("GotFish", this.t());
      $$0.a("Moistness", this.y());
   }

   @Override
   public void a(uj $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.h(new jg($$1, $$2, $$3));
      super.a($$0);
      this.x($$0.q("GotFish"));
      this.t($$0.h("Moistness"));
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbe(this));
      this.bS.a(0, new cdd(this));
      this.bS.a(1, new cgu.a(this));
      this.bS.a(2, new cgu.b(this, 4.0));
      this.bS.a(4, new ccr(this, 1.0, 10));
      this.bS.a(4, new cco(this));
      this.bS.a(5, new ccb(this, coh.class, 6.0F));
      this.bS.a(5, new cbj(this, 10));
      this.bS.a(6, new ccd(this, 1.2F, true));
      this.bS.a(8, new cgu.c());
      this.bS.a(8, new cbo(this));
      this.bS.a(9, new cba<>(this, cli.class, 8.0F, 1.0, 1.0));
      this.bT.a(1, new cdl(this, cli.class).a());
   }

   public static bwc.a gv() {
      return bux.E().a(bwd.s, 10.0).a(bwd.v, 1.2F).a(bwd.c, 3.0);
   }

   @Override
   protected ceh b(dev $$0) {
      return new cej(this, $$0);
   }

   @Override
   public void gm() {
      this.a(awk.gY, 1.0F, 1.0F);
   }

   @Override
   public boolean c(buv $$0) {
      return !this.p_() && super.c($$0);
   }

   @Override
   public int ct() {
      return 4800;
   }

   @Override
   protected int n(int $$0) {
      return this.ct();
   }

   @Override
   public int ad() {
      return 1;
   }

   @Override
   public int ae() {
      return 1;
   }

   @Override
   protected boolean o(btz $$0) {
      return true;
   }

   @Override
   protected boolean f(buh $$0) {
      return $$0 == buh.a && this.fP();
   }

   @Override
   protected void b(ckq $$0) {
      if (this.a(buh.a).f()) {
         cvx $$1 = $$0.m();
         if (this.h($$1)) {
            this.a($$0);
            this.a(buh.a, $$1);
            this.g(buh.a);
            this.a($$0, $$1.L());
            $$0.au();
         }
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.gi()) {
         this.j(this.ct());
      } else {
         if (this.bm()) {
            this.t(2400);
         } else {
            this.t(this.y() - 1);
            if (this.y() <= 0) {
               this.a(this.dY().t(), 1.0F);
            }

            if (this.aJ()) {
               this.h(this.dA().b((double)((this.af.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.af.i() * 2.0F - 1.0F) * 0.2F)));
               this.v(this.af.i() * 360.0F);
               this.d(false);
               this.as = true;
            }
         }

         if (this.dX().C && this.bk() && this.dA().h() > 0.03) {
            ezh $$0 = this.g(0.0F);
            float $$1 = azj.b(this.dN() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = azj.a(this.dN() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.af.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dX()
                  .a(lq.as, this.dC() - $$0.d * (double)$$3 + (double)$$1, this.dE() - $$0.e, this.dI() - $$0.f * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dX()
                  .a(lq.as, this.dC() - $$0.d * (double)$$3 - (double)$$1, this.dE() - $$0.e, this.dI() - $$0.f * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(lq.O);
      } else {
         super.b($$0);
      }
   }

   private void a(lo $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.af.k() * 0.01;
         double $$3 = this.af.k() * 0.01;
         double $$4 = this.af.k() * 0.01;
         this.dX().a($$0, this.d(1.0), this.dF() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bry b(coh $$0, brx $$1) {
      cvx $$2 = $$0.b($$1);
      if (!$$2.f() && $$2.a(axi.aQ)) {
         if (!this.dX().C) {
            this.a(awk.ha, 1.0F, 1.0F);
         }

         if (this.p_()) {
            $$2.a(1, $$0);
            this.a(d_(-this.c), true);
         } else {
            this.x(true);
            $$2.a(1, $$0);
         }

         return bry.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.hb;
   }

   @Nullable
   @Override
   protected awj o_() {
      return awk.gZ;
   }

   @Nullable
   @Override
   protected awj w() {
      return this.bk() ? awk.gX : awk.gW;
   }

   @Override
   protected awj aW() {
      return awk.he;
   }

   @Override
   protected awj aV() {
      return awk.hf;
   }

   protected boolean gw() {
      jg $$0 = this.P().i();
      return $$0 != null ? $$0.a(this.dv(), 12.0) : false;
   }

   @Override
   public void a_(ezh $$0) {
      if (this.dj() && this.bk()) {
         this.a(this.fr(), $$0);
         this.a(buz.a, this.dA());
         this.h(this.dA().c(0.9));
         if (this.m() == null) {
            this.h(this.dA().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public boolean A() {
      return true;
   }

   static class a extends cbt {
      private final cgu a;
      private boolean b;

      a(cgu $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cbt.a.a, cbt.a.b));
      }

      @Override
      public boolean U_() {
         return false;
      }

      @Override
      public boolean b() {
         return this.a.t() && this.a.cu() >= 100;
      }

      @Override
      public boolean c() {
         jg $$0 = this.a.q();
         return !jg.a((double)$$0.u(), this.a.dE(), (double)$$0.w()).a(this.a.dv(), 4.0) && !this.b && this.a.cu() >= 100;
      }

      @Override
      public void d() {
         if (this.a.dX() instanceof arm) {
            arm $$0 = (arm)this.a.dX();
            this.b = false;
            this.a.P().o();
            jg $$1 = this.a.dx();
            jg $$2 = $$0.a(axl.b, $$1, 50, false);
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
         jg $$0 = this.a.q();
         if (jg.a((double)$$0.u(), this.a.dE(), (double)$$0.w()).a(this.a.dv(), 4.0) || this.b) {
            this.a.x(false);
         }
      }

      @Override
      public void a() {
         dev $$0 = this.a.dX();
         if (this.a.gw() || this.a.P().m()) {
            ezh $$1 = ezh.b(this.a.q());
            ezh $$2 = cfq.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = cfq.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               jg $$3 = jg.a((jz)$$2);
               if (!$$0.b_($$3).a(axf.a) || !$$0.a_($$3).a(ert.b)) {
                  $$2 = cfq.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
               }
            }

            if ($$2 == null) {
               this.b = true;
               return;
            }

            this.a.K().a($$2.d, $$2.e, $$2.f, (float)(this.a.ae() + 20), (float)this.a.ad());
            this.a.P().a($$2.d, $$2.e, $$2.f, 1.3);
            if ($$0.A.a(this.a(80)) == 0) {
               $$0.a(this.a, (byte)38);
            }
         }
      }
   }

   static class b extends cbt {
      private final cgu a;
      private final double b;
      @Nullable
      private coh c;

      b(cgu $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(cbt.a.a, cbt.a.b));
      }

      @Override
      public boolean b() {
         this.c = this.a.dX().a(cgu.ce, this.a);
         return this.c == null ? false : this.c.cl() && this.a.m() != this.c;
      }

      @Override
      public boolean c() {
         return this.c != null && this.c.cl() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void d() {
         this.c.b(new bte(btg.D, 100), this.a);
      }

      @Override
      public void e() {
         this.c = null;
         this.a.P().o();
      }

      @Override
      public void a() {
         this.a.K().a(this.c, (float)(this.a.ae() + 20), (float)this.a.ad());
         if (this.a.g(this.c) < 6.25) {
            this.a.P().o();
         } else {
            this.a.P().a(this.c, this.b);
         }

         if (this.c.cl() && this.c.dX().A.a(6) == 0) {
            this.c.b(new bte(btg.D, 100), this.a);
         }
      }
   }

   class c extends cbt {
      private int b;

      @Override
      public boolean b() {
         if (this.b > cgu.this.ag) {
            return false;
         } else {
            List<ckq> $$0 = cgu.this.dX().a(ckq.class, cgu.this.cS().c(8.0, 8.0, 8.0), cgu.bZ);
            return !$$0.isEmpty() || !cgu.this.a(buh.a).f();
         }
      }

      @Override
      public void d() {
         List<ckq> $$0 = cgu.this.dX().a(ckq.class, cgu.this.cS().c(8.0, 8.0, 8.0), cgu.bZ);
         if (!$$0.isEmpty()) {
            cgu.this.P().a($$0.get(0), 1.2F);
            cgu.this.a(awk.hd, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cvx $$0 = cgu.this.a(buh.a);
         if (!$$0.f()) {
            this.a($$0);
            cgu.this.a(buh.a, cvx.k);
            this.b = cgu.this.ag + cgu.this.af.a(100);
         }
      }

      @Override
      public void a() {
         List<ckq> $$0 = cgu.this.dX().a(ckq.class, cgu.this.cS().c(8.0, 8.0, 8.0), cgu.bZ);
         cvx $$1 = cgu.this.a(buh.a);
         if (!$$1.f()) {
            this.a($$1);
            cgu.this.a(buh.a, cvx.k);
         } else if (!$$0.isEmpty()) {
            cgu.this.P().a($$0.get(0), 1.2F);
         }
      }

      private void a(cvx $$0) {
         if (!$$0.f()) {
            double $$1 = cgu.this.dG() - 0.3F;
            ckq $$2 = new ckq(cgu.this.dX(), cgu.this.dC(), $$1, cgu.this.dI(), $$0);
            $$2.b(40);
            $$2.b(cgu.this);
            float $$3 = 0.3F;
            float $$4 = cgu.this.af.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * cgu.this.af.i();
            $$2.n(
               (double)(0.3F * -azj.a(cgu.this.dN() * (float) (Math.PI / 180.0)) * azj.b(cgu.this.dP() * (float) (Math.PI / 180.0)) + azj.b($$4) * $$5),
               (double)(0.3F * azj.a(cgu.this.dP() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * azj.b(cgu.this.dN() * (float) (Math.PI / 180.0)) * azj.b(cgu.this.dP() * (float) (Math.PI / 180.0)) + azj.a($$4) * $$5)
            );
            cgu.this.dX().b($$2);
         }
      }
   }
}
