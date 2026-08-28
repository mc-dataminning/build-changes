import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chg extends cgx {
   private static final akm<jh> cb = akq.a(chg.class, ako.o);
   private static final akm<Boolean> cc = akq.a(chg.class, ako.k);
   private static final akm<Integer> cd = akq.a(chg.class, ako.b);
   static final cfy ce = cfy.b().a(10.0).d();
   public static final int bY = 4800;
   private static final int cf = 2400;
   public static final Predicate<clc> bZ = $$0 -> !$$0.t() && $$0.bL() && $$0.bj();
   public static final float ca = 0.65F;

   public chg(bus<? extends chg> $$0, dfm $$1) {
      super($$0, $$1);
      this.bP = new cbk(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new cbj(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      this.j(this.cs());
      this.w(0.0F);
      bwa $$4 = Objects.requireNonNullElseGet($$3, () -> new buc.a(0.1F));
      return super.a($$0, $$1, $$2, $$4);
   }

   @Nullable
   public chg b(arp $$0, buc $$1) {
      return bus.G.a($$0, bur.e);
   }

   @Override
   public float ei() {
      return this.e_() ? 0.65F : 1.0F;
   }

   @Override
   protected void r(int $$0) {
   }

   public void h(jh $$0) {
      this.al.a(cb, $$0);
   }

   public jh n() {
      return this.al.a(cb);
   }

   public boolean q() {
      return this.al.a(cc);
   }

   public void x(boolean $$0) {
      this.al.a(cc, $$0);
   }

   public int v() {
      return this.al.a(cd);
   }

   public void s(int $$0) {
      this.al.a(cd, $$0);
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(cb, jh.c);
      $$0.a(cc, false);
      $$0.a(cd, 2400);
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.n().u());
      $$0.a("TreasurePosY", this.n().v());
      $$0.a("TreasurePosZ", this.n().w());
      $$0.a("GotFish", this.q());
      $$0.a("Moistness", this.v());
   }

   @Override
   public void a(ul $$0) {
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
      this.bS.a(0, new cbq(this));
      this.bS.a(0, new cdp(this));
      this.bS.a(1, new chg.a(this));
      this.bS.a(2, new chg.b(this, 4.0));
      this.bS.a(4, new cdd(this, 1.0, 10));
      this.bS.a(4, new cda(this));
      this.bS.a(5, new ccn(this, cou.class, 6.0F));
      this.bS.a(5, new cbv(this, 10));
      this.bS.a(6, new ccp(this, 1.2F, true));
      this.bS.a(8, new chg.c());
      this.bS.a(8, new cca(this));
      this.bS.a(9, new cbm<>(this, clu.class, 8.0F, 1.0, 1.0));
      this.bT.a(1, new cdx(this, clu.class).a());
   }

   public static bwo.a gm() {
      return bvj.C().a(bwp.s, 10.0).a(bwp.v, 1.2F).a(bwp.c, 3.0);
   }

   @Override
   protected cet b(dfm $$0) {
      return new cev(this, $$0);
   }

   @Override
   public void gd() {
      this.a(awn.gY, 1.0F, 1.0F);
   }

   @Override
   public boolean c(bvh $$0) {
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
   protected boolean o(bul $$0) {
      return true;
   }

   @Override
   protected boolean f(but $$0) {
      return $$0 == but.a && this.fL();
   }

   @Override
   protected void a(arp $$0, clc $$1) {
      if (this.a(but.a).f()) {
         cwm $$2 = $$1.j();
         if (this.g($$2)) {
            this.a($$1);
            this.a(but.a, $$2);
            this.g(but.a);
            this.a($$1, $$2.L());
            $$1.at();
         }
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.fZ()) {
         this.j(this.cs());
      } else {
         if (this.bl()) {
            this.s(2400);
         } else {
            this.s(this.v() - 1);
            if (this.v() <= 0) {
               this.a(this.dW().t(), 1.0F);
            }

            if (this.aJ()) {
               this.h(this.dy().b((double)((this.ae.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.ae.i() * 2.0F - 1.0F) * 0.2F)));
               this.v(this.ae.i() * 360.0F);
               this.d(false);
               this.ar = true;
            }
         }

         if (this.dV().C && this.bj() && this.dy().h() > 0.03) {
            ezy $$0 = this.g(0.0F);
            float $$1 = azm.b(this.dL() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = azm.a(this.dL() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ae.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dV()
                  .a(ls.as, this.dA() - $$0.d * (double)$$3 + (double)$$1, this.dC() - $$0.e, this.dG() - $$0.f * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dV()
                  .a(ls.as, this.dA() - $$0.d * (double)$$3 - (double)$$1, this.dC() - $$0.e, this.dG() - $$0.f * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
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
         double $$2 = this.ae.k() * 0.01;
         double $$3 = this.ae.k() * 0.01;
         double $$4 = this.ae.k() * 0.01;
         this.dV().a($$0, this.d(1.0), this.dD() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bsk b(cou $$0, bsj $$1) {
      cwm $$2 = $$0.b($$1);
      if (!$$2.f() && $$2.a(axl.aU)) {
         if (!this.dV().C) {
            this.a(awn.ha, 1.0F, 1.0F);
         }

         if (this.e_()) {
            $$2.a(1, $$0);
            this.a(d_(-this.b), true);
         } else {
            this.x(true);
            $$2.a(1, $$0);
         }

         return bsk.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected awm e(btb $$0) {
      return awn.hb;
   }

   @Nullable
   @Override
   protected awm n_() {
      return awn.gZ;
   }

   @Nullable
   @Override
   protected awm t() {
      return this.bj() ? awn.gX : awn.gW;
   }

   @Override
   protected awm aW() {
      return awn.he;
   }

   @Override
   protected awm aV() {
      return awn.hf;
   }

   protected boolean gn() {
      jh $$0 = this.L().i();
      return $$0 != null ? $$0.a(this.dt(), 12.0) : false;
   }

   @Override
   public void a_(ezy $$0) {
      if (this.di() && this.bj()) {
         this.a(this.fn(), $$0);
         this.a(bvl.a, this.dy());
         this.h(this.dy().c(0.9));
         if (this.aa_() == null) {
            this.h(this.dy().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public boolean y() {
      return true;
   }

   static class a extends ccf {
      private final chg a;
      private boolean b;

      a(chg $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccf.a.a, ccf.a.b));
      }

      @Override
      public boolean S_() {
         return false;
      }

      @Override
      public boolean b() {
         return this.a.q() && this.a.ct() >= 100;
      }

      @Override
      public boolean c() {
         jh $$0 = this.a.n();
         return !jh.a((double)$$0.u(), this.a.dC(), (double)$$0.w()).a(this.a.dt(), 4.0) && !this.b && this.a.ct() >= 100;
      }

      @Override
      public void d() {
         if (this.a.dV() instanceof arp) {
            arp $$0 = (arp)this.a.dV();
            this.b = false;
            this.a.L().o();
            jh $$1 = this.a.dv();
            jh $$2 = $$0.a(axo.b, $$1, 50, false);
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
         jh $$0 = this.a.n();
         if (jh.a((double)$$0.u(), this.a.dC(), (double)$$0.w()).a(this.a.dt(), 4.0) || this.b) {
            this.a.x(false);
         }
      }

      @Override
      public void a() {
         dfm $$0 = this.a.dV();
         if (this.a.gn() || this.a.L().m()) {
            ezy $$1 = ezy.b(this.a.n());
            ezy $$2 = cgc.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = cgc.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               jh $$3 = jh.a((ka)$$2);
               if (!$$0.b_($$3).a(axi.a) || !$$0.a_($$3).a(esk.b)) {
                  $$2 = cgc.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
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

   static class b extends ccf {
      private final chg a;
      private final double b;
      @Nullable
      private cou c;

      b(chg $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(ccf.a.a, ccf.a.b));
      }

      @Override
      public boolean b() {
         this.c = a(this.a).a(chg.ce, this.a);
         return this.c == null ? false : this.c.ck() && this.a.aa_() != this.c;
      }

      @Override
      public boolean c() {
         return this.c != null && this.c.ck() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void d() {
         this.c.b(new btq(bts.D, 100), this.a);
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

         if (this.c.ck() && this.c.dV().A.a(6) == 0) {
            this.c.b(new btq(bts.D, 100), this.a);
         }
      }
   }

   class c extends ccf {
      private int b;

      @Override
      public boolean b() {
         if (this.b > chg.this.af) {
            return false;
         } else {
            List<clc> $$0 = chg.this.dV().a(clc.class, chg.this.cR().c(8.0, 8.0, 8.0), chg.bZ);
            return !$$0.isEmpty() || !chg.this.a(but.a).f();
         }
      }

      @Override
      public void d() {
         List<clc> $$0 = chg.this.dV().a(clc.class, chg.this.cR().c(8.0, 8.0, 8.0), chg.bZ);
         if (!$$0.isEmpty()) {
            chg.this.L().a($$0.get(0), 1.2F);
            chg.this.a(awn.hd, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cwm $$0 = chg.this.a(but.a);
         if (!$$0.f()) {
            this.a($$0);
            chg.this.a(but.a, cwm.k);
            this.b = chg.this.af + chg.this.ae.a(100);
         }
      }

      @Override
      public void a() {
         List<clc> $$0 = chg.this.dV().a(clc.class, chg.this.cR().c(8.0, 8.0, 8.0), chg.bZ);
         cwm $$1 = chg.this.a(but.a);
         if (!$$1.f()) {
            this.a($$1);
            chg.this.a(but.a, cwm.k);
         } else if (!$$0.isEmpty()) {
            chg.this.L().a($$0.get(0), 1.2F);
         }
      }

      private void a(cwm $$0) {
         if (!$$0.f()) {
            double $$1 = chg.this.dE() - 0.3F;
            clc $$2 = new clc(chg.this.dV(), chg.this.dA(), $$1, chg.this.dG(), $$0);
            $$2.b(40);
            $$2.b(chg.this);
            float $$3 = 0.3F;
            float $$4 = chg.this.ae.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * chg.this.ae.i();
            $$2.n(
               (double)(0.3F * -azm.a(chg.this.dL() * (float) (Math.PI / 180.0)) * azm.b(chg.this.dN() * (float) (Math.PI / 180.0)) + azm.b($$4) * $$5),
               (double)(0.3F * azm.a(chg.this.dN() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * azm.b(chg.this.dL() * (float) (Math.PI / 180.0)) * azm.b(chg.this.dN() * (float) (Math.PI / 180.0)) + azm.a($$4) * $$5)
            );
            chg.this.dV().b($$2);
         }
      }
   }
}
