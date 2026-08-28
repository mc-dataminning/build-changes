import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgl extends cgc {
   private static final akh<jf> cb = akl.a(cgl.class, akj.o);
   private static final akh<Boolean> cc = akl.a(cgl.class, akj.k);
   private static final akh<Integer> cd = akl.a(cgl.class, akj.b);
   static final cfd ce = cfd.b().a(10.0).d();
   public static final int bY = 4800;
   private static final int cf = 2400;
   public static final Predicate<ckh> bZ = $$0 -> !$$0.w() && $$0.bI() && $$0.bi();
   public static final float ca = 0.65F;

   public cgl(bty<? extends cgl> $$0, dej $$1) {
      super($$0, $$1);
      this.bP = new cap(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new cao(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      this.j(this.cp());
      this.w(0.0F);
      return super.a($$0, $$1, $$2, new btk.a(true, 0.1F));
   }

   @Nullable
   public cgl b(arj $$0, btk $$1) {
      return bty.y.a($$0, btx.e);
   }

   @Override
   public float ef() {
      return this.p_() ? 0.65F : 1.0F;
   }

   @Override
   protected void s(int $$0) {
   }

   public void h(jf $$0) {
      this.am.a(cb, $$0);
   }

   public jf q() {
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
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(cb, jf.c);
      $$0.a(cc, false);
      $$0.a(cd, 2400);
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.q().u());
      $$0.a("TreasurePosY", this.q().v());
      $$0.a("TreasurePosZ", this.q().w());
      $$0.a("GotFish", this.t());
      $$0.a("Moistness", this.y());
   }

   @Override
   public void a(ug $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.h(new jf($$1, $$2, $$3));
      super.a($$0);
      this.x($$0.q("GotFish"));
      this.t($$0.h("Moistness"));
   }

   @Override
   protected void D() {
      this.bS.a(0, new cav(this));
      this.bS.a(0, new ccu(this));
      this.bS.a(1, new cgl.a(this));
      this.bS.a(2, new cgl.b(this, 4.0));
      this.bS.a(4, new cci(this, 1.0, 10));
      this.bS.a(4, new ccf(this));
      this.bS.a(5, new cbs(this, cnx.class, 6.0F));
      this.bS.a(5, new cba(this, 10));
      this.bS.a(6, new cbu(this, 1.2F, true));
      this.bS.a(8, new cgl.c());
      this.bS.a(8, new cbf(this));
      this.bS.a(9, new car<>(this, ckz.class, 8.0F, 1.0, 1.0));
      this.bT.a(1, new cdc(this, ckz.class).a());
   }

   public static bvt.a go() {
      return bup.E().a(bvu.s, 10.0).a(bvu.v, 1.2F).a(bvu.c, 3.0);
   }

   @Override
   protected cdy b(dej $$0) {
      return new cea(this, $$0);
   }

   @Override
   public void gh() {
      this.a(awg.gY, 1.0F, 1.0F);
   }

   @Override
   public boolean c(bun $$0) {
      return !this.p_() && super.c($$0);
   }

   @Override
   public int cp() {
      return 4800;
   }

   @Override
   protected int n(int $$0) {
      return this.cp();
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
   protected boolean o(btr $$0) {
      return true;
   }

   @Override
   public boolean e(cvs $$0) {
      btz $$1 = this.g($$0);
      return !this.a($$1).f() ? false : $$1 == btz.a && super.e($$0);
   }

   @Override
   protected void b(ckh $$0) {
      if (this.a(btz.a).f()) {
         cvs $$1 = $$0.m();
         if (this.i($$1)) {
            this.a($$0);
            this.a(btz.a, $$1);
            this.f(btz.a);
            this.a($$0, $$1.K());
            $$0.as();
         }
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.gd()) {
         this.j(this.cp());
      } else {
         if (this.bk()) {
            this.t(2400);
         } else {
            this.t(this.y() - 1);
            if (this.y() <= 0) {
               this.a(this.dT().t(), 1.0F);
            }

            if (this.aH()) {
               this.h(this.dv().b((double)((this.af.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.af.i() * 2.0F - 1.0F) * 0.2F)));
               this.v(this.af.i() * 360.0F);
               this.d(false);
               this.as = true;
            }
         }

         if (this.dS().B && this.bi() && this.dv().h() > 0.03) {
            eyw $$0 = this.g(0.0F);
            float $$1 = azf.b(this.dI() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = azf.a(this.dI() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.af.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dS()
                  .a(lo.as, this.dx() - $$0.d * (double)$$3 + (double)$$1, this.dz() - $$0.e, this.dD() - $$0.f * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dS()
                  .a(lo.as, this.dx() - $$0.d * (double)$$3 - (double)$$1, this.dz() - $$0.e, this.dD() - $$0.f * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(lo.O);
      } else {
         super.b($$0);
      }
   }

   private void a(lm $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.af.k() * 0.01;
         double $$3 = this.af.k() * 0.01;
         double $$4 = this.af.k() * 0.01;
         this.dS().a($$0, this.d(1.0), this.dA() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected brs b(cnx $$0, brr $$1) {
      cvs $$2 = $$0.b($$1);
      if (!$$2.f() && $$2.a(axe.aP)) {
         if (!this.dS().B) {
            this.a(awg.ha, 1.0F, 1.0F);
         }

         this.x(true);
         $$2.a(1, $$0);
         return brs.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.hb;
   }

   @Nullable
   @Override
   protected awf o_() {
      return awg.gZ;
   }

   @Nullable
   @Override
   protected awf w() {
      return this.bi() ? awg.gX : awg.gW;
   }

   @Override
   protected awf aU() {
      return awg.he;
   }

   @Override
   protected awf aT() {
      return awg.hf;
   }

   protected boolean gp() {
      jf $$0 = this.P().i();
      return $$0 != null ? $$0.a(this.dq(), 12.0) : false;
   }

   @Override
   public void a_(eyw $$0) {
      if (this.de() && this.bi()) {
         this.a(this.fm(), $$0);
         this.a(bur.a, this.dv());
         this.h(this.dv().c(0.9));
         if (this.m() == null) {
            this.h(this.dv().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public boolean A() {
      return true;
   }

   static class a extends cbk {
      private final cgl a;
      private boolean b;

      a(cgl $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cbk.a.a, cbk.a.b));
      }

      @Override
      public boolean T_() {
         return false;
      }

      @Override
      public boolean b() {
         return this.a.t() && this.a.cq() >= 100;
      }

      @Override
      public boolean c() {
         jf $$0 = this.a.q();
         return !jf.a((double)$$0.u(), this.a.dz(), (double)$$0.w()).a(this.a.dq(), 4.0) && !this.b && this.a.cq() >= 100;
      }

      @Override
      public void d() {
         if (this.a.dS() instanceof arj) {
            arj $$0 = (arj)this.a.dS();
            this.b = false;
            this.a.P().o();
            jf $$1 = this.a.ds();
            jf $$2 = $$0.a(axh.b, $$1, 50, false);
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
         jf $$0 = this.a.q();
         if (jf.a((double)$$0.u(), this.a.dz(), (double)$$0.w()).a(this.a.dq(), 4.0) || this.b) {
            this.a.x(false);
         }
      }

      @Override
      public void a() {
         dej $$0 = this.a.dS();
         if (this.a.gp() || this.a.P().m()) {
            eyw $$1 = eyw.b(this.a.q());
            eyw $$2 = cfh.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = cfh.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               jf $$3 = jf.a((jy)$$2);
               if (!$$0.b_($$3).a(axb.a) || !$$0.a_($$3).a(eri.b)) {
                  $$2 = cfh.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
               }
            }

            if ($$2 == null) {
               this.b = true;
               return;
            }

            this.a.K().a($$2.d, $$2.e, $$2.f, (float)(this.a.ae() + 20), (float)this.a.ad());
            this.a.P().a($$2.d, $$2.e, $$2.f, 1.3);
            if ($$0.z.a(this.a(80)) == 0) {
               $$0.a(this.a, (byte)38);
            }
         }
      }
   }

   static class b extends cbk {
      private final cgl a;
      private final double b;
      @Nullable
      private cnx c;

      b(cgl $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(cbk.a.a, cbk.a.b));
      }

      @Override
      public boolean b() {
         this.c = this.a.dS().a(cgl.ce, this.a);
         return this.c == null ? false : this.c.ch() && this.a.m() != this.c;
      }

      @Override
      public boolean c() {
         return this.c != null && this.c.ch() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void d() {
         this.c.b(new bsy(bta.D, 100), this.a);
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

         if (this.c.ch() && this.c.dS().z.a(6) == 0) {
            this.c.b(new bsy(bta.D, 100), this.a);
         }
      }
   }

   class c extends cbk {
      private int b;

      @Override
      public boolean b() {
         if (this.b > cgl.this.ag) {
            return false;
         } else {
            List<ckh> $$0 = cgl.this.dS().a(ckh.class, cgl.this.cO().c(8.0, 8.0, 8.0), cgl.bZ);
            return !$$0.isEmpty() || !cgl.this.a(btz.a).f();
         }
      }

      @Override
      public void d() {
         List<ckh> $$0 = cgl.this.dS().a(ckh.class, cgl.this.cO().c(8.0, 8.0, 8.0), cgl.bZ);
         if (!$$0.isEmpty()) {
            cgl.this.P().a($$0.get(0), 1.2F);
            cgl.this.a(awg.hd, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cvs $$0 = cgl.this.a(btz.a);
         if (!$$0.f()) {
            this.a($$0);
            cgl.this.a(btz.a, cvs.k);
            this.b = cgl.this.ag + cgl.this.af.a(100);
         }
      }

      @Override
      public void a() {
         List<ckh> $$0 = cgl.this.dS().a(ckh.class, cgl.this.cO().c(8.0, 8.0, 8.0), cgl.bZ);
         cvs $$1 = cgl.this.a(btz.a);
         if (!$$1.f()) {
            this.a($$1);
            cgl.this.a(btz.a, cvs.k);
         } else if (!$$0.isEmpty()) {
            cgl.this.P().a($$0.get(0), 1.2F);
         }
      }

      private void a(cvs $$0) {
         if (!$$0.f()) {
            double $$1 = cgl.this.dB() - 0.3F;
            ckh $$2 = new ckh(cgl.this.dS(), cgl.this.dx(), $$1, cgl.this.dD(), $$0);
            $$2.b(40);
            $$2.b(cgl.this);
            float $$3 = 0.3F;
            float $$4 = cgl.this.af.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * cgl.this.af.i();
            $$2.n(
               (double)(0.3F * -azf.a(cgl.this.dI() * (float) (Math.PI / 180.0)) * azf.b(cgl.this.dK() * (float) (Math.PI / 180.0)) + azf.b($$4) * $$5),
               (double)(0.3F * azf.a(cgl.this.dK() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * azf.b(cgl.this.dI() * (float) (Math.PI / 180.0)) * azf.b(cgl.this.dK() * (float) (Math.PI / 180.0)) + azf.a($$4) * $$5)
            );
            cgl.this.dS().b($$2);
         }
      }
   }
}
