import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfi extends cgc {
   private static final akg<iz> d = akk.a(cfi.class, aki.o);
   private static final akg<Boolean> e = akk.a(cfi.class, aki.k);
   private static final akg<Integer> bY = akk.a(cfi.class, aki.b);
   static final ceb bZ = ceb.b().a(10.0).d();
   public static final int b = 4800;
   private static final int ca = 2400;
   public static final Predicate<cjc> c = $$0 -> !$$0.y() && $$0.bD() && $$0.be();

   public cfi(bsv<? extends cfi> $$0, dbt $$1) {
      super($$0, $$1);
      this.bP = new bzn(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new bzm(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public bud a(dci $$0, bqn $$1, bto $$2, @Nullable bud $$3) {
      this.k(this.ck());
      this.s(0.0F);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(int $$0) {
   }

   public void i(iz $$0) {
      this.ao.a(d, $$0);
   }

   public iz s() {
      return this.ao.a(d);
   }

   public boolean u() {
      return this.ao.a(e);
   }

   public void w(boolean $$0) {
      this.ao.a(e, $$0);
   }

   public int y() {
      return this.ao.a(bY);
   }

   public void c(int $$0) {
      this.ao.a(bY, $$0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(d, iz.c);
      $$0.a(e, false);
      $$0.a(bY, 2400);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.s().u());
      $$0.a("TreasurePosY", this.s().v());
      $$0.a("TreasurePosZ", this.s().w());
      $$0.a("GotFish", this.u());
      $$0.a("Moistness", this.y());
   }

   @Override
   public void a(ur $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.i(new iz($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("GotFish"));
      this.c($$0.h("Moistness"));
   }

   @Override
   protected void z() {
      this.bS.a(0, new bzt(this));
      this.bS.a(0, new cbs(this));
      this.bS.a(1, new cfi.a(this));
      this.bS.a(2, new cfi.b(this, 4.0));
      this.bS.a(4, new cbg(this, 1.0, 10));
      this.bS.a(4, new cbd(this));
      this.bS.a(5, new caq(this, cms.class, 6.0F));
      this.bS.a(5, new bzy(this, 10));
      this.bS.a(6, new cas(this, 1.2F, true));
      this.bS.a(8, new cfi.c());
      this.bS.a(8, new cad(this));
      this.bS.a(9, new bzp<>(this, cju.class, 8.0F, 1.0, 1.0));
      this.bT.a(1, new cca(this, cju.class).a());
   }

   public static bur.a gq() {
      return btm.A().a(bus.q, 10.0).a(bus.r, 1.2F).a(bus.c, 3.0);
   }

   @Override
   protected ccw b(dbt $$0) {
      return new ccy(this, $$0);
   }

   @Override
   public boolean C(bsp $$0) {
      boolean $$1 = $$0.a(this.dQ().b((btk)this), (float)((int)this.g(bus.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(avw.gX, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public int ck() {
      return 4800;
   }

   @Override
   protected int o(int $$0) {
      return this.ck();
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
   protected boolean o(bsp $$0) {
      return true;
   }

   @Override
   public boolean f(cuk $$0) {
      bsw $$1 = btm.h($$0);
      return !this.a($$1).e() ? false : $$1 == bsw.a && super.f($$0);
   }

   @Override
   protected void b(cjc $$0) {
      if (this.a(bsw.a).e()) {
         cuk $$1 = $$0.p();
         if (this.j($$1)) {
            this.a($$0);
            this.a(bsw.a, $$1);
            this.f(bsw.a);
            this.a($$0, $$1.I());
            $$0.ao();
         }
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.gg()) {
         this.k(this.ck());
      } else {
         if (this.bg()) {
            this.c(2400);
         } else {
            this.c(this.y() - 1);
            if (this.y() <= 0) {
               this.a(this.dQ().r(), 1.0F);
            }

            if (this.aE()) {
               this.h(this.ds().b((double)((this.ah.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.ah.i() * 2.0F - 1.0F) * 0.2F)));
               this.r(this.ah.i() * 360.0F);
               this.d(false);
               this.av = true;
            }
         }

         if (this.dP().B && this.be() && this.ds().g() > 0.03) {
            evm $$0 = this.f(0.0F);
            float $$1 = ayu.b(this.dF() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = ayu.a(this.dF() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ah.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dP()
                  .a(lj.as, this.du() - $$0.c * (double)$$3 + (double)$$1, this.dw() - $$0.d, this.dA() - $$0.e * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dP()
                  .a(lj.as, this.du() - $$0.c * (double)$$3 - (double)$$1, this.dw() - $$0.d, this.dA() - $$0.e * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(lj.O);
      } else {
         super.b($$0);
      }
   }

   private void a(lh $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.ah.k() * 0.01;
         double $$3 = this.ah.k() * 0.01;
         double $$4 = this.ah.k() * 0.01;
         this.dP().a($$0, this.d(1.0), this.dx() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bqp b(cms $$0, bqo $$1) {
      cuk $$2 = $$0.b($$1);
      if (!$$2.e() && $$2.a(awu.aP)) {
         if (!this.dP().B) {
            this.a(avw.gZ, 1.0F, 1.0F);
         }

         this.w(true);
         $$2.a(1, $$0);
         return bqp.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected avv d(bri $$0) {
      return avw.ha;
   }

   @Nullable
   @Override
   protected avv o_() {
      return avw.gY;
   }

   @Nullable
   @Override
   protected avv v() {
      return this.be() ? avw.gW : avw.gV;
   }

   @Override
   protected avv aQ() {
      return avw.hd;
   }

   @Override
   protected avv aP() {
      return avw.he;
   }

   protected boolean gr() {
      iz $$0 = this.K().h();
      return $$0 != null ? $$0.a(this.dn(), 12.0) : false;
   }

   @Override
   public void a(evm $$0) {
      if (this.db() && this.be()) {
         this.a(this.fn(), $$0);
         this.a(btp.a, this.ds());
         this.h(this.ds().a(0.9));
         if (this.p() == null) {
            this.h(this.ds().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(cms $$0) {
      return true;
   }

   static class a extends cai {
      private final cfi a;
      private boolean b;

      a(cfi $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cai.a.a, cai.a.b));
      }

      @Override
      public boolean Q_() {
         return false;
      }

      @Override
      public boolean a() {
         return this.a.u() && this.a.cl() >= 100;
      }

      @Override
      public boolean b() {
         iz $$0 = this.a.s();
         return !iz.a((double)$$0.u(), this.a.dw(), (double)$$0.w()).a(this.a.dn(), 4.0) && !this.b && this.a.cl() >= 100;
      }

      @Override
      public void c() {
         if (this.a.dP() instanceof arb) {
            arb $$0 = (arb)this.a.dP();
            this.b = false;
            this.a.K().n();
            iz $$1 = this.a.dp();
            iz $$2 = $$0.a(awx.b, $$1, 50, false);
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
         iz $$0 = this.a.s();
         if (iz.a((double)$$0.u(), this.a.dw(), (double)$$0.w()).a(this.a.dn(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void e() {
         dbt $$0 = this.a.dP();
         if (this.a.gr() || this.a.K().l()) {
            evm $$1 = evm.b(this.a.s());
            evm $$2 = cef.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = cef.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               iz $$3 = iz.a($$2);
               if (!$$0.b_($$3).a(awr.a) || !$$0.a_($$3).a(eof.b)) {
                  $$2 = cef.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
               }
            }

            if ($$2 == null) {
               this.b = true;
               return;
            }

            this.a.G().a($$2.c, $$2.d, $$2.e, (float)(this.a.ab() + 20), (float)this.a.aa());
            this.a.K().a($$2.c, $$2.d, $$2.e, 1.3);
            if ($$0.z.a(this.a(80)) == 0) {
               $$0.a(this.a, (byte)38);
            }
         }
      }
   }

   static class b extends cai {
      private final cfi a;
      private final double b;
      @Nullable
      private cms c;

      b(cfi $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(cai.a.a, cai.a.b));
      }

      @Override
      public boolean a() {
         this.c = this.a.dP().a(cfi.bZ, this.a);
         return this.c == null ? false : this.c.cc() && this.a.p() != this.c;
      }

      @Override
      public boolean b() {
         return this.c != null && this.c.cc() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void c() {
         this.c.b(new brx(brz.D, 100), this.a);
      }

      @Override
      public void d() {
         this.c = null;
         this.a.K().n();
      }

      @Override
      public void e() {
         this.a.G().a(this.c, (float)(this.a.ab() + 20), (float)this.a.aa());
         if (this.a.g(this.c) < 6.25) {
            this.a.K().n();
         } else {
            this.a.K().a(this.c, this.b);
         }

         if (this.c.cc() && this.c.dP().z.a(6) == 0) {
            this.c.b(new brx(brz.D, 100), this.a);
         }
      }
   }

   class c extends cai {
      private int b;

      @Override
      public boolean a() {
         if (this.b > cfi.this.ai) {
            return false;
         } else {
            List<cjc> $$0 = cfi.this.dP().a(cjc.class, cfi.this.cK().c(8.0, 8.0, 8.0), cfi.c);
            return !$$0.isEmpty() || !cfi.this.a(bsw.a).e();
         }
      }

      @Override
      public void c() {
         List<cjc> $$0 = cfi.this.dP().a(cjc.class, cfi.this.cK().c(8.0, 8.0, 8.0), cfi.c);
         if (!$$0.isEmpty()) {
            cfi.this.K().a($$0.get(0), 1.2F);
            cfi.this.a(avw.hc, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cuk $$0 = cfi.this.a(bsw.a);
         if (!$$0.e()) {
            this.a($$0);
            cfi.this.a(bsw.a, cuk.l);
            this.b = cfi.this.ai + cfi.this.ah.a(100);
         }
      }

      @Override
      public void e() {
         List<cjc> $$0 = cfi.this.dP().a(cjc.class, cfi.this.cK().c(8.0, 8.0, 8.0), cfi.c);
         cuk $$1 = cfi.this.a(bsw.a);
         if (!$$1.e()) {
            this.a($$1);
            cfi.this.a(bsw.a, cuk.l);
         } else if (!$$0.isEmpty()) {
            cfi.this.K().a($$0.get(0), 1.2F);
         }
      }

      private void a(cuk $$0) {
         if (!$$0.e()) {
            double $$1 = cfi.this.dy() - 0.3F;
            cjc $$2 = new cjc(cfi.this.dP(), cfi.this.du(), $$1, cfi.this.dA(), $$0);
            $$2.b(40);
            $$2.b(cfi.this);
            float $$3 = 0.3F;
            float $$4 = cfi.this.ah.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * cfi.this.ah.i();
            $$2.o(
               (double)(0.3F * -ayu.a(cfi.this.dF() * (float) (Math.PI / 180.0)) * ayu.b(cfi.this.dH() * (float) (Math.PI / 180.0)) + ayu.b($$4) * $$5),
               (double)(0.3F * ayu.a(cfi.this.dH() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * ayu.b(cfi.this.dF() * (float) (Math.PI / 180.0)) * ayu.b(cfi.this.dH() * (float) (Math.PI / 180.0)) + ayu.a($$4) * $$5)
            );
            cfi.this.dP().b($$2);
         }
      }
   }
}
