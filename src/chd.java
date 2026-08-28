import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chd extends cgu {
   private static final ako<jh> cb = aks.a(chd.class, akq.o);
   private static final ako<Boolean> cc = aks.a(chd.class, akq.k);
   private static final ako<Integer> cd = aks.a(chd.class, akq.b);
   static final cfv ce = cfv.b().a(10.0).d();
   public static final int bY = 4800;
   private static final int cf = 2400;
   public static final Predicate<ckz> bZ = $$0 -> !$$0.w() && $$0.bN() && $$0.bl();
   public static final float ca = 0.65F;

   public chd(bup<? extends chd> $$0, dff $$1) {
      super($$0, $$1);
      this.bP = new cbh(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new cbg(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      this.j(this.cu());
      this.w(0.0F);
      bvx $$4 = Objects.requireNonNullElseGet($$3, () -> new btz.a(0.1F));
      return super.a($$0, $$1, $$2, $$4);
   }

   @Nullable
   public chd b(arq $$0, btz $$1) {
      return bup.y.a($$0, buo.e);
   }

   @Override
   public float el() {
      return this.p_() ? 0.65F : 1.0F;
   }

   @Override
   protected void s(int $$0) {
   }

   public void h(jh $$0) {
      this.am.a(cb, $$0);
   }

   public jh q() {
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
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(cb, jh.c);
      $$0.a(cc, false);
      $$0.a(cd, 2400);
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.q().u());
      $$0.a("TreasurePosY", this.q().v());
      $$0.a("TreasurePosZ", this.q().w());
      $$0.a("GotFish", this.t());
      $$0.a("Moistness", this.y());
   }

   @Override
   public void a(un $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.h(new jh($$1, $$2, $$3));
      super.a($$0);
      this.x($$0.q("GotFish"));
      this.t($$0.h("Moistness"));
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbn(this));
      this.bS.a(0, new cdm(this));
      this.bS.a(1, new chd.a(this));
      this.bS.a(2, new chd.b(this, 4.0));
      this.bS.a(4, new cda(this, 1.0, 10));
      this.bS.a(4, new ccx(this));
      this.bS.a(5, new cck(this, cor.class, 6.0F));
      this.bS.a(5, new cbs(this, 10));
      this.bS.a(6, new ccm(this, 1.2F, true));
      this.bS.a(8, new chd.c());
      this.bS.a(8, new cbx(this));
      this.bS.a(9, new cbj<>(this, clr.class, 8.0F, 1.0, 1.0));
      this.bT.a(1, new cdu(this, clr.class).a());
   }

   public static bwl.a gv() {
      return bvg.E().a(bwm.s, 10.0).a(bwm.v, 1.2F).a(bwm.c, 3.0);
   }

   @Override
   protected ceq b(dff $$0) {
      return new ces(this, $$0);
   }

   @Override
   public void gm() {
      this.a(awo.gY, 1.0F, 1.0F);
   }

   @Override
   public boolean c(bve $$0) {
      return !this.p_() && super.c($$0);
   }

   @Override
   public int cu() {
      return 4800;
   }

   @Override
   protected int n(int $$0) {
      return this.cu();
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
   protected boolean o(bui $$0) {
      return true;
   }

   @Override
   protected boolean f(buq $$0) {
      return $$0 == buq.a && this.fQ();
   }

   @Override
   protected void b(ckz $$0) {
      if (this.a(buq.a).f()) {
         cwf $$1 = $$0.m();
         if (this.h($$1)) {
            this.a($$0);
            this.a(buq.a, $$1);
            this.g(buq.a);
            this.a($$0, $$1.L());
            $$0.av();
         }
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.gi()) {
         this.j(this.cu());
      } else {
         if (this.bn()) {
            this.t(2400);
         } else {
            this.t(this.y() - 1);
            if (this.y() <= 0) {
               this.a(this.dZ().t(), 1.0F);
            }

            if (this.aL()) {
               this.h(this.dB().b((double)((this.af.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.af.i() * 2.0F - 1.0F) * 0.2F)));
               this.v(this.af.i() * 360.0F);
               this.d(false);
               this.as = true;
            }
         }

         if (this.dY().C && this.bl() && this.dB().h() > 0.03) {
            ezr $$0 = this.g(0.0F);
            float $$1 = azn.b(this.dO() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = azn.a(this.dO() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.af.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dY()
                  .a(ls.as, this.dD() - $$0.d * (double)$$3 + (double)$$1, this.dF() - $$0.e, this.dJ() - $$0.f * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dY()
                  .a(ls.as, this.dD() - $$0.d * (double)$$3 - (double)$$1, this.dF() - $$0.e, this.dJ() - $$0.f * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(ls.O);
      } else {
         super.b($$0);
      }
   }

   private void a(lq $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.af.k() * 0.01;
         double $$3 = this.af.k() * 0.01;
         double $$4 = this.af.k() * 0.01;
         this.dY().a($$0, this.d(1.0), this.dG() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bsh b(cor $$0, bsg $$1) {
      cwf $$2 = $$0.b($$1);
      if (!$$2.f() && $$2.a(axm.aU)) {
         if (!this.dY().C) {
            this.a(awo.ha, 1.0F, 1.0F);
         }

         if (this.p_()) {
            $$2.a(1, $$0);
            this.a(d_(-this.c), true);
         } else {
            this.x(true);
            $$2.a(1, $$0);
         }

         return bsh.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.hb;
   }

   @Nullable
   @Override
   protected awn o_() {
      return awo.gZ;
   }

   @Nullable
   @Override
   protected awn w() {
      return this.bl() ? awo.gX : awo.gW;
   }

   @Override
   protected awn aY() {
      return awo.he;
   }

   @Override
   protected awn aX() {
      return awo.hf;
   }

   protected boolean gw() {
      jh $$0 = this.P().i();
      return $$0 != null ? $$0.a(this.dw(), 12.0) : false;
   }

   @Override
   public void a_(ezr $$0) {
      if (this.dk() && this.bl()) {
         this.a(this.fs(), $$0);
         this.a(bvi.a, this.dB());
         this.h(this.dB().c(0.9));
         if (this.m() == null) {
            this.h(this.dB().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public boolean A() {
      return true;
   }

   static class a extends ccc {
      private final chd a;
      private boolean b;

      a(chd $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccc.a.a, ccc.a.b));
      }

      @Override
      public boolean U_() {
         return false;
      }

      @Override
      public boolean b() {
         return this.a.t() && this.a.cv() >= 100;
      }

      @Override
      public boolean c() {
         jh $$0 = this.a.q();
         return !jh.a((double)$$0.u(), this.a.dF(), (double)$$0.w()).a(this.a.dw(), 4.0) && !this.b && this.a.cv() >= 100;
      }

      @Override
      public void d() {
         if (this.a.dY() instanceof arq) {
            arq $$0 = (arq)this.a.dY();
            this.b = false;
            this.a.P().o();
            jh $$1 = this.a.dy();
            jh $$2 = $$0.a(axp.b, $$1, 50, false);
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
         jh $$0 = this.a.q();
         if (jh.a((double)$$0.u(), this.a.dF(), (double)$$0.w()).a(this.a.dw(), 4.0) || this.b) {
            this.a.x(false);
         }
      }

      @Override
      public void a() {
         dff $$0 = this.a.dY();
         if (this.a.gw() || this.a.P().m()) {
            ezr $$1 = ezr.b(this.a.q());
            ezr $$2 = cfz.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = cfz.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               jh $$3 = jh.a((ka)$$2);
               if (!$$0.b_($$3).a(axj.a) || !$$0.a_($$3).a(esd.b)) {
                  $$2 = cfz.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
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

   static class b extends ccc {
      private final chd a;
      private final double b;
      @Nullable
      private cor c;

      b(chd $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(ccc.a.a, ccc.a.b));
      }

      @Override
      public boolean b() {
         this.c = this.a.dY().a(chd.ce, this.a);
         return this.c == null ? false : this.c.cm() && this.a.m() != this.c;
      }

      @Override
      public boolean c() {
         return this.c != null && this.c.cm() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void d() {
         this.c.b(new btn(btp.D, 100), this.a);
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

         if (this.c.cm() && this.c.dY().A.a(6) == 0) {
            this.c.b(new btn(btp.D, 100), this.a);
         }
      }
   }

   class c extends ccc {
      private int b;

      @Override
      public boolean b() {
         if (this.b > chd.this.ag) {
            return false;
         } else {
            List<ckz> $$0 = chd.this.dY().a(ckz.class, chd.this.cT().c(8.0, 8.0, 8.0), chd.bZ);
            return !$$0.isEmpty() || !chd.this.a(buq.a).f();
         }
      }

      @Override
      public void d() {
         List<ckz> $$0 = chd.this.dY().a(ckz.class, chd.this.cT().c(8.0, 8.0, 8.0), chd.bZ);
         if (!$$0.isEmpty()) {
            chd.this.P().a($$0.get(0), 1.2F);
            chd.this.a(awo.hd, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cwf $$0 = chd.this.a(buq.a);
         if (!$$0.f()) {
            this.a($$0);
            chd.this.a(buq.a, cwf.k);
            this.b = chd.this.ag + chd.this.af.a(100);
         }
      }

      @Override
      public void a() {
         List<ckz> $$0 = chd.this.dY().a(ckz.class, chd.this.cT().c(8.0, 8.0, 8.0), chd.bZ);
         cwf $$1 = chd.this.a(buq.a);
         if (!$$1.f()) {
            this.a($$1);
            chd.this.a(buq.a, cwf.k);
         } else if (!$$0.isEmpty()) {
            chd.this.P().a($$0.get(0), 1.2F);
         }
      }

      private void a(cwf $$0) {
         if (!$$0.f()) {
            double $$1 = chd.this.dH() - 0.3F;
            ckz $$2 = new ckz(chd.this.dY(), chd.this.dD(), $$1, chd.this.dJ(), $$0);
            $$2.b(40);
            $$2.b(chd.this);
            float $$3 = 0.3F;
            float $$4 = chd.this.af.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * chd.this.af.i();
            $$2.n(
               (double)(0.3F * -azn.a(chd.this.dO() * (float) (Math.PI / 180.0)) * azn.b(chd.this.dQ() * (float) (Math.PI / 180.0)) + azn.b($$4) * $$5),
               (double)(0.3F * azn.a(chd.this.dQ() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * azn.b(chd.this.dO() * (float) (Math.PI / 180.0)) * azn.b(chd.this.dQ() * (float) (Math.PI / 180.0)) + azn.a($$4) * $$5)
            );
            chd.this.dY().b($$2);
         }
      }
   }
}
