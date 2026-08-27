import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bwc extends bww {
   private static final afc<ht> d = aff.a(bwc.class, afe.n);
   private static final afc<Boolean> e = aff.a(bwc.class, afe.k);
   private static final afc<Integer> bT = aff.a(bwc.class, afe.b);
   static final buv bU = buv.b().a(10.0).d();
   public static final int b = 4800;
   private static final int bV = 2400;
   public static final Predicate<bzq> c = $$0 -> !$$0.y() && $$0.bv() && $$0.aX();

   public bwc(bjx<? extends bwc> $$0, cqz $$1) {
      super($$0, $$1);
      this.bL = new bqj(this, 85, 10, 0.02F, 0.1F, true);
      this.bK = new bqi(this, 10);
      this.s(true);
   }

   @Nullable
   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      this.j(this.cg());
      this.s(0.0F);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void b(int $$0) {
   }

   public void i(ht $$0) {
      this.an.b(d, $$0);
   }

   public ht s() {
      return this.an.b(d);
   }

   public boolean t() {
      return this.an.b(e);
   }

   public void w(boolean $$0) {
      this.an.b(e, $$0);
   }

   public int y() {
      return this.an.b(bT);
   }

   public void c(int $$0) {
      this.an.b(bT, $$0);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(d, ht.b);
      this.an.a(e, false);
      this.an.a(bT, 2400);
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.s().u());
      $$0.a("TreasurePosY", this.s().v());
      $$0.a("TreasurePosZ", this.s().w());
      $$0.a("GotFish", this.t());
      $$0.a("Moistness", this.y());
   }

   @Override
   public void a(rt $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.i(new ht($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("GotFish"));
      this.c($$0.h("Moistness"));
   }

   @Override
   protected void z() {
      this.bO.a(0, new bqp(this));
      this.bO.a(0, new bso(this));
      this.bO.a(1, new bwc.a(this));
      this.bO.a(2, new bwc.b(this, 4.0));
      this.bO.a(4, new bsc(this, 1.0, 10));
      this.bO.a(4, new brz(this));
      this.bO.a(5, new brm(this, ccx.class, 6.0F));
      this.bO.a(5, new bqu(this, 10));
      this.bO.a(6, new bro(this, 1.2F, true));
      this.bO.a(8, new bwc.c());
      this.bO.a(8, new bqz(this));
      this.bO.a(9, new bql<>(this, cah.class, 8.0F, 1.0, 1.0));
      this.bP.a(1, new bsw(this, cah.class).a());
   }

   public static blo.a ge() {
      return bkl.A().a(blp.l, 10.0).a(blp.m, 1.2F).a(blp.c, 3.0);
   }

   @Override
   protected bts b(cqz $$0) {
      return new btu(this, $$0);
   }

   @Override
   public boolean C(bjt $$0) {
      boolean $$1 = $$0.a(this.dM().b((bkj)this), (float)((int)this.b(blp.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(aqd.fT, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public int cg() {
      return 4800;
   }

   @Override
   protected int n(int $$0) {
      return this.cg();
   }

   @Override
   protected float b(bkv $$0, bju $$1) {
      return 0.3F;
   }

   @Override
   public int Y() {
      return 1;
   }

   @Override
   public int Z() {
      return 1;
   }

   @Override
   protected boolean o(bjt $$0) {
      return true;
   }

   @Override
   public boolean f(ckj $$0) {
      bjy $$1 = bkl.h($$0);
      return !this.c($$1).b() ? false : $$1 == bjy.a && super.f($$0);
   }

   @Override
   protected void b(bzq $$0) {
      if (this.c(bjy.a).b()) {
         ckj $$1 = $$0.q();
         if (this.j($$1)) {
            this.a($$0);
            this.a(bjy.a, $$1);
            this.e(bjy.a);
            this.a($$0, $$1.L());
            $$0.ak();
         }
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.fU()) {
         this.j(this.cg());
      } else {
         if (this.aZ()) {
            this.c(2400);
         } else {
            this.c(this.y() - 1);
            if (this.y() <= 0) {
               this.a(this.dM().r(), 1.0F);
            }

            if (this.aA()) {
               this.f(this.do().b((double)((this.ag.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.ag.i() * 2.0F - 1.0F) * 0.2F)));
               this.r(this.ag.i() * 360.0F);
               this.c(false);
               this.au = true;
            }
         }

         if (this.dL().B && this.aX() && this.do().g() > 0.03) {
            eif $$0 = this.f(0.0F);
            float $$1 = asy.b(this.dB() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = asy.a(this.dB() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ag.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dL()
                  .a(js.am, this.dq() - $$0.c * (double)$$3 + (double)$$1, this.ds() - $$0.d, this.dw() - $$0.e * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dL()
                  .a(js.am, this.dq() - $$0.c * (double)$$3 - (double)$$1, this.ds() - $$0.d, this.dw() - $$0.e * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(js.K);
      } else {
         super.b($$0);
      }
   }

   private void a(jq $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.ag.k() * 0.01;
         double $$3 = this.ag.k() * 0.01;
         double $$4 = this.ag.k() * 0.01;
         this.dL().a($$0, this.d(1.0), this.dt() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bib b(ccx $$0, bia $$1) {
      ckj $$2 = $$0.b($$1);
      if (!$$2.b() && $$2.a(ara.ao)) {
         if (!this.dL().B) {
            this.a(aqd.fV, 1.0F, 1.0F);
         }

         this.w(true);
         if (!$$0.fT().d) {
            $$2.h(1);
         }

         return bib.a(this.dL().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.fW;
   }

   @Nullable
   @Override
   protected aqc m_() {
      return aqd.fU;
   }

   @Nullable
   @Override
   protected aqc w() {
      return this.aX() ? aqd.fS : aqd.fR;
   }

   @Override
   protected aqc aM() {
      return aqd.fZ;
   }

   @Override
   protected aqc aL() {
      return aqd.ga;
   }

   protected boolean gf() {
      ht $$0 = this.L().h();
      return $$0 != null ? $$0.a(this.dj(), 12.0) : false;
   }

   @Override
   public void h(eif $$0) {
      if (this.cX() && this.aX()) {
         this.a(this.fe(), $$0);
         this.a(bkp.a, this.do());
         this.f(this.do().a(0.9));
         if (this.q() == null) {
            this.f(this.do().b(0.0, -0.005, 0.0));
         }
      } else {
         super.h($$0);
      }
   }

   @Override
   public boolean a(ccx $$0) {
      return true;
   }

   static class a extends bre {
      private final bwc a;
      private boolean b;

      a(bwc $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bre.a.a, bre.a.b));
      }

      @Override
      public boolean Q_() {
         return false;
      }

      @Override
      public boolean a() {
         return this.a.t() && this.a.ch() >= 100;
      }

      @Override
      public boolean b() {
         ht $$0 = this.a.s();
         return !ht.a((double)$$0.u(), this.a.ds(), (double)$$0.w()).a(this.a.dj(), 4.0) && !this.b && this.a.ch() >= 100;
      }

      @Override
      public void c() {
         if (this.a.dL() instanceof alq) {
            alq $$0 = (alq)this.a.dL();
            this.b = false;
            this.a.L().n();
            ht $$1 = this.a.dl();
            ht $$2 = $$0.a(ard.b, $$1, 50, false);
            if ($$2 != null) {
               this.a.i($$2);
               $$0.a(this.a, (byte)38);
            } else {
               this.b = true;
            }
         }
      }

      @Override
      public void d() {
         ht $$0 = this.a.s();
         if (ht.a((double)$$0.u(), this.a.ds(), (double)$$0.w()).a(this.a.dj(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void e() {
         cqz $$0 = this.a.dL();
         if (this.a.gf() || this.a.L().l()) {
            eif $$1 = eif.b(this.a.s());
            eif $$2 = buz.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = buz.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               ht $$3 = ht.a($$2);
               if (!$$0.b_($$3).a(aqx.a) || !$$0.a_($$3).a($$0, $$3, ebu.b)) {
                  $$2 = buz.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
               }
            }

            if ($$2 == null) {
               this.b = true;
               return;
            }

            this.a.G().a($$2.c, $$2.d, $$2.e, (float)(this.a.Z() + 20), (float)this.a.Y());
            this.a.L().a($$2.c, $$2.d, $$2.e, 1.3);
            if ($$0.z.a(this.a(80)) == 0) {
               $$0.a(this.a, (byte)38);
            }
         }
      }
   }

   static class b extends bre {
      private final bwc a;
      private final double b;
      @Nullable
      private ccx c;

      b(bwc $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(bre.a.a, bre.a.b));
      }

      @Override
      public boolean a() {
         this.c = this.a.dL().a(bwc.bU, this.a);
         return this.c == null ? false : this.c.bY() && this.a.q() != this.c;
      }

      @Override
      public boolean b() {
         return this.c != null && this.c.bY() && this.a.f(this.c) < 256.0;
      }

      @Override
      public void c() {
         this.c.b(new bjg(bji.D, 100), this.a);
      }

      @Override
      public void d() {
         this.c = null;
         this.a.L().n();
      }

      @Override
      public void e() {
         this.a.G().a(this.c, (float)(this.a.Z() + 20), (float)this.a.Y());
         if (this.a.f(this.c) < 6.25) {
            this.a.L().n();
         } else {
            this.a.L().a(this.c, this.b);
         }

         if (this.c.bY() && this.c.dL().z.a(6) == 0) {
            this.c.b(new bjg(bji.D, 100), this.a);
         }
      }
   }

   class c extends bre {
      private int b;

      @Override
      public boolean a() {
         if (this.b > bwc.this.ah) {
            return false;
         } else {
            List<bzq> $$0 = bwc.this.dL().a(bzq.class, bwc.this.cG().c(8.0, 8.0, 8.0), bwc.c);
            return !$$0.isEmpty() || !bwc.this.c(bjy.a).b();
         }
      }

      @Override
      public void c() {
         List<bzq> $$0 = bwc.this.dL().a(bzq.class, bwc.this.cG().c(8.0, 8.0, 8.0), bwc.c);
         if (!$$0.isEmpty()) {
            bwc.this.L().a($$0.get(0), 1.2F);
            bwc.this.a(aqd.fY, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void d() {
         ckj $$0 = bwc.this.c(bjy.a);
         if (!$$0.b()) {
            this.a($$0);
            bwc.this.a(bjy.a, ckj.b);
            this.b = bwc.this.ah + bwc.this.ag.a(100);
         }
      }

      @Override
      public void e() {
         List<bzq> $$0 = bwc.this.dL().a(bzq.class, bwc.this.cG().c(8.0, 8.0, 8.0), bwc.c);
         ckj $$1 = bwc.this.c(bjy.a);
         if (!$$1.b()) {
            this.a($$1);
            bwc.this.a(bjy.a, ckj.b);
         } else if (!$$0.isEmpty()) {
            bwc.this.L().a($$0.get(0), 1.2F);
         }
      }

      private void a(ckj $$0) {
         if (!$$0.b()) {
            double $$1 = bwc.this.du() - 0.3F;
            bzq $$2 = new bzq(bwc.this.dL(), bwc.this.dq(), $$1, bwc.this.dw(), $$0);
            $$2.b(40);
            $$2.a(bwc.this);
            float $$3 = 0.3F;
            float $$4 = bwc.this.ag.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * bwc.this.ag.i();
            $$2.o(
               (double)(0.3F * -asy.a(bwc.this.dB() * (float) (Math.PI / 180.0)) * asy.b(bwc.this.dD() * (float) (Math.PI / 180.0)) + asy.b($$4) * $$5),
               (double)(0.3F * asy.a(bwc.this.dD() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * asy.b(bwc.this.dB() * (float) (Math.PI / 180.0)) * asy.b(bwc.this.dD() * (float) (Math.PI / 180.0)) + asy.a($$4) * $$5)
            );
            bwc.this.dL().b($$2);
         }
      }
   }
}
