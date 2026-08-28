import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfn extends cgh {
   private static final akk<iz> d = ako.a(cfn.class, akm.o);
   private static final akk<Boolean> e = ako.a(cfn.class, akm.k);
   private static final akk<Integer> bY = ako.a(cfn.class, akm.b);
   static final ceg bZ = ceg.b().a(10.0).d();
   public static final int b = 4800;
   private static final int ca = 2400;
   public static final Predicate<cjh> c = $$0 -> !$$0.y() && $$0.bD() && $$0.be();

   public cfn(bta<? extends cfn> $$0, dby $$1) {
      super($$0, $$1);
      this.bP = new bzs(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new bzr(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public bui a(dcn $$0, bqs $$1, btt $$2, @Nullable bui $$3) {
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
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(d, iz.c);
      $$0.a(e, false);
      $$0.a(bY, 2400);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.s().u());
      $$0.a("TreasurePosY", this.s().v());
      $$0.a("TreasurePosZ", this.s().w());
      $$0.a("GotFish", this.u());
      $$0.a("Moistness", this.y());
   }

   @Override
   public void a(us $$0) {
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
      this.bS.a(0, new bzy(this));
      this.bS.a(0, new cbx(this));
      this.bS.a(1, new cfn.a(this));
      this.bS.a(2, new cfn.b(this, 4.0));
      this.bS.a(4, new cbl(this, 1.0, 10));
      this.bS.a(4, new cbi(this));
      this.bS.a(5, new cav(this, cmx.class, 6.0F));
      this.bS.a(5, new cad(this, 10));
      this.bS.a(6, new cax(this, 1.2F, true));
      this.bS.a(8, new cfn.c());
      this.bS.a(8, new cai(this));
      this.bS.a(9, new bzu<>(this, cjz.class, 8.0F, 1.0, 1.0));
      this.bT.a(1, new ccf(this, cjz.class).a());
   }

   public static buw.a gq() {
      return btr.A().a(bux.q, 10.0).a(bux.r, 1.2F).a(bux.c, 3.0);
   }

   @Override
   protected cdb b(dby $$0) {
      return new cdd(this, $$0);
   }

   @Override
   public boolean C(bsu $$0) {
      boolean $$1 = $$0.a(this.dQ().b((btp)this), (float)((int)this.g(bux.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(awa.gX, 1.0F, 1.0F);
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
   protected boolean o(bsu $$0) {
      return true;
   }

   @Override
   public boolean f(cup $$0) {
      btb $$1 = btr.h($$0);
      return !this.a($$1).e() ? false : $$1 == btb.a && super.f($$0);
   }

   @Override
   protected void b(cjh $$0) {
      if (this.a(btb.a).e()) {
         cup $$1 = $$0.p();
         if (this.j($$1)) {
            this.a($$0);
            this.a(btb.a, $$1);
            this.f(btb.a);
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
            evr $$0 = this.f(0.0F);
            float $$1 = ayz.b(this.dF() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = ayz.a(this.dF() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ah.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dP()
                  .a(li.as, this.du() - $$0.c * (double)$$3 + (double)$$1, this.dw() - $$0.d, this.dA() - $$0.e * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dP()
                  .a(li.as, this.du() - $$0.c * (double)$$3 - (double)$$1, this.dw() - $$0.d, this.dA() - $$0.e * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(li.O);
      } else {
         super.b($$0);
      }
   }

   private void a(lg $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.ah.k() * 0.01;
         double $$3 = this.ah.k() * 0.01;
         double $$4 = this.ah.k() * 0.01;
         this.dP().a($$0, this.d(1.0), this.dx() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bqu b(cmx $$0, bqt $$1) {
      cup $$2 = $$0.b($$1);
      if (!$$2.e() && $$2.a(awy.aP)) {
         if (!this.dP().B) {
            this.a(awa.gZ, 1.0F, 1.0F);
         }

         this.w(true);
         $$2.a(1, $$0);
         return bqu.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected avz d(brn $$0) {
      return awa.ha;
   }

   @Nullable
   @Override
   protected avz o_() {
      return awa.gY;
   }

   @Nullable
   @Override
   protected avz v() {
      return this.be() ? awa.gW : awa.gV;
   }

   @Override
   protected avz aQ() {
      return awa.hd;
   }

   @Override
   protected avz aP() {
      return awa.he;
   }

   protected boolean gr() {
      iz $$0 = this.K().h();
      return $$0 != null ? $$0.a(this.dn(), 12.0) : false;
   }

   @Override
   public void a(evr $$0) {
      if (this.db() && this.be()) {
         this.a(this.fn(), $$0);
         this.a(btu.a, this.ds());
         this.h(this.ds().a(0.9));
         if (this.p() == null) {
            this.h(this.ds().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(cmx $$0) {
      return true;
   }

   static class a extends can {
      private final cfn a;
      private boolean b;

      a(cfn $$0) {
         this.a = $$0;
         this.a(EnumSet.of(can.a.a, can.a.b));
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
         if (this.a.dP() instanceof arf) {
            arf $$0 = (arf)this.a.dP();
            this.b = false;
            this.a.K().n();
            iz $$1 = this.a.dp();
            iz $$2 = $$0.a(axb.b, $$1, 50, false);
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
         dby $$0 = this.a.dP();
         if (this.a.gr() || this.a.K().l()) {
            evr $$1 = evr.b(this.a.s());
            evr $$2 = cek.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = cek.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               iz $$3 = iz.a($$2);
               if (!$$0.b_($$3).a(awv.a) || !$$0.a_($$3).a(eok.b)) {
                  $$2 = cek.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
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

   static class b extends can {
      private final cfn a;
      private final double b;
      @Nullable
      private cmx c;

      b(cfn $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(can.a.a, can.a.b));
      }

      @Override
      public boolean a() {
         this.c = this.a.dP().a(cfn.bZ, this.a);
         return this.c == null ? false : this.c.cc() && this.a.p() != this.c;
      }

      @Override
      public boolean b() {
         return this.c != null && this.c.cc() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void c() {
         this.c.b(new bsc(bse.D, 100), this.a);
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
            this.c.b(new bsc(bse.D, 100), this.a);
         }
      }
   }

   class c extends can {
      private int b;

      @Override
      public boolean a() {
         if (this.b > cfn.this.ai) {
            return false;
         } else {
            List<cjh> $$0 = cfn.this.dP().a(cjh.class, cfn.this.cK().c(8.0, 8.0, 8.0), cfn.c);
            return !$$0.isEmpty() || !cfn.this.a(btb.a).e();
         }
      }

      @Override
      public void c() {
         List<cjh> $$0 = cfn.this.dP().a(cjh.class, cfn.this.cK().c(8.0, 8.0, 8.0), cfn.c);
         if (!$$0.isEmpty()) {
            cfn.this.K().a($$0.get(0), 1.2F);
            cfn.this.a(awa.hc, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cup $$0 = cfn.this.a(btb.a);
         if (!$$0.e()) {
            this.a($$0);
            cfn.this.a(btb.a, cup.l);
            this.b = cfn.this.ai + cfn.this.ah.a(100);
         }
      }

      @Override
      public void e() {
         List<cjh> $$0 = cfn.this.dP().a(cjh.class, cfn.this.cK().c(8.0, 8.0, 8.0), cfn.c);
         cup $$1 = cfn.this.a(btb.a);
         if (!$$1.e()) {
            this.a($$1);
            cfn.this.a(btb.a, cup.l);
         } else if (!$$0.isEmpty()) {
            cfn.this.K().a($$0.get(0), 1.2F);
         }
      }

      private void a(cup $$0) {
         if (!$$0.e()) {
            double $$1 = cfn.this.dy() - 0.3F;
            cjh $$2 = new cjh(cfn.this.dP(), cfn.this.du(), $$1, cfn.this.dA(), $$0);
            $$2.b(40);
            $$2.b(cfn.this);
            float $$3 = 0.3F;
            float $$4 = cfn.this.ah.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * cfn.this.ah.i();
            $$2.o(
               (double)(0.3F * -ayz.a(cfn.this.dF() * (float) (Math.PI / 180.0)) * ayz.b(cfn.this.dH() * (float) (Math.PI / 180.0)) + ayz.b($$4) * $$5),
               (double)(0.3F * ayz.a(cfn.this.dH() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * ayz.b(cfn.this.dF() * (float) (Math.PI / 180.0)) * ayz.b(cfn.this.dH() * (float) (Math.PI / 180.0)) + ayz.a($$4) * $$5)
            );
            cfn.this.dP().b($$2);
         }
      }
   }
}
