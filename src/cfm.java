import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfm extends cgg {
   private static final akj<iz> d = akn.a(cfm.class, akl.o);
   private static final akj<Boolean> e = akn.a(cfm.class, akl.k);
   private static final akj<Integer> bY = akn.a(cfm.class, akl.b);
   static final cef bZ = cef.b().a(10.0).d();
   public static final int b = 4800;
   private static final int ca = 2400;
   public static final Predicate<cjg> c = $$0 -> !$$0.y() && $$0.bD() && $$0.be();

   public cfm(bsz<? extends cfm> $$0, dbx $$1) {
      super($$0, $$1);
      this.bP = new bzr(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new bzq(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
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
   protected void a(akn.a $$0) {
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
      this.bS.a(0, new bzx(this));
      this.bS.a(0, new cbw(this));
      this.bS.a(1, new cfm.a(this));
      this.bS.a(2, new cfm.b(this, 4.0));
      this.bS.a(4, new cbk(this, 1.0, 10));
      this.bS.a(4, new cbh(this));
      this.bS.a(5, new cau(this, cmw.class, 6.0F));
      this.bS.a(5, new cac(this, 10));
      this.bS.a(6, new caw(this, 1.2F, true));
      this.bS.a(8, new cfm.c());
      this.bS.a(8, new cah(this));
      this.bS.a(9, new bzt<>(this, cjy.class, 8.0F, 1.0, 1.0));
      this.bT.a(1, new cce(this, cjy.class).a());
   }

   public static buv.a gq() {
      return btq.A().a(buw.q, 10.0).a(buw.r, 1.2F).a(buw.c, 3.0);
   }

   @Override
   protected cda b(dbx $$0) {
      return new cdc(this, $$0);
   }

   @Override
   public boolean C(bst $$0) {
      boolean $$1 = $$0.a(this.dQ().b((bto)this), (float)((int)this.g(buw.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(avz.gX, 1.0F, 1.0F);
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
   protected boolean o(bst $$0) {
      return true;
   }

   @Override
   public boolean f(cuo $$0) {
      bta $$1 = btq.h($$0);
      return !this.a($$1).e() ? false : $$1 == bta.a && super.f($$0);
   }

   @Override
   protected void b(cjg $$0) {
      if (this.a(bta.a).e()) {
         cuo $$1 = $$0.p();
         if (this.j($$1)) {
            this.a($$0);
            this.a(bta.a, $$1);
            this.f(bta.a);
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
            evq $$0 = this.f(0.0F);
            float $$1 = ayy.b(this.dF() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = ayy.a(this.dF() * (float) (Math.PI / 180.0)) * 0.3F;
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
   protected bqt b(cmw $$0, bqs $$1) {
      cuo $$2 = $$0.b($$1);
      if (!$$2.e() && $$2.a(awx.aP)) {
         if (!this.dP().B) {
            this.a(avz.gZ, 1.0F, 1.0F);
         }

         this.w(true);
         $$2.a(1, $$0);
         return bqt.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected avy d(brm $$0) {
      return avz.ha;
   }

   @Nullable
   @Override
   protected avy o_() {
      return avz.gY;
   }

   @Nullable
   @Override
   protected avy v() {
      return this.be() ? avz.gW : avz.gV;
   }

   @Override
   protected avy aQ() {
      return avz.hd;
   }

   @Override
   protected avy aP() {
      return avz.he;
   }

   protected boolean gr() {
      iz $$0 = this.K().h();
      return $$0 != null ? $$0.a(this.dn(), 12.0) : false;
   }

   @Override
   public void a(evq $$0) {
      if (this.db() && this.be()) {
         this.a(this.fn(), $$0);
         this.a(btt.a, this.ds());
         this.h(this.ds().a(0.9));
         if (this.p() == null) {
            this.h(this.ds().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(cmw $$0) {
      return true;
   }

   static class a extends cam {
      private final cfm a;
      private boolean b;

      a(cfm $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cam.a.a, cam.a.b));
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
         if (this.a.dP() instanceof are) {
            are $$0 = (are)this.a.dP();
            this.b = false;
            this.a.K().n();
            iz $$1 = this.a.dp();
            iz $$2 = $$0.a(axa.b, $$1, 50, false);
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
         dbx $$0 = this.a.dP();
         if (this.a.gr() || this.a.K().l()) {
            evq $$1 = evq.b(this.a.s());
            evq $$2 = cej.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = cej.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               iz $$3 = iz.a($$2);
               if (!$$0.b_($$3).a(awu.a) || !$$0.a_($$3).a(eoj.b)) {
                  $$2 = cej.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
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

   static class b extends cam {
      private final cfm a;
      private final double b;
      @Nullable
      private cmw c;

      b(cfm $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(cam.a.a, cam.a.b));
      }

      @Override
      public boolean a() {
         this.c = this.a.dP().a(cfm.bZ, this.a);
         return this.c == null ? false : this.c.cc() && this.a.p() != this.c;
      }

      @Override
      public boolean b() {
         return this.c != null && this.c.cc() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void c() {
         this.c.b(new bsb(bsd.D, 100), this.a);
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
            this.c.b(new bsb(bsd.D, 100), this.a);
         }
      }
   }

   class c extends cam {
      private int b;

      @Override
      public boolean a() {
         if (this.b > cfm.this.ai) {
            return false;
         } else {
            List<cjg> $$0 = cfm.this.dP().a(cjg.class, cfm.this.cK().c(8.0, 8.0, 8.0), cfm.c);
            return !$$0.isEmpty() || !cfm.this.a(bta.a).e();
         }
      }

      @Override
      public void c() {
         List<cjg> $$0 = cfm.this.dP().a(cjg.class, cfm.this.cK().c(8.0, 8.0, 8.0), cfm.c);
         if (!$$0.isEmpty()) {
            cfm.this.K().a($$0.get(0), 1.2F);
            cfm.this.a(avz.hc, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cuo $$0 = cfm.this.a(bta.a);
         if (!$$0.e()) {
            this.a($$0);
            cfm.this.a(bta.a, cuo.l);
            this.b = cfm.this.ai + cfm.this.ah.a(100);
         }
      }

      @Override
      public void e() {
         List<cjg> $$0 = cfm.this.dP().a(cjg.class, cfm.this.cK().c(8.0, 8.0, 8.0), cfm.c);
         cuo $$1 = cfm.this.a(bta.a);
         if (!$$1.e()) {
            this.a($$1);
            cfm.this.a(bta.a, cuo.l);
         } else if (!$$0.isEmpty()) {
            cfm.this.K().a($$0.get(0), 1.2F);
         }
      }

      private void a(cuo $$0) {
         if (!$$0.e()) {
            double $$1 = cfm.this.dy() - 0.3F;
            cjg $$2 = new cjg(cfm.this.dP(), cfm.this.du(), $$1, cfm.this.dA(), $$0);
            $$2.b(40);
            $$2.b(cfm.this);
            float $$3 = 0.3F;
            float $$4 = cfm.this.ah.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * cfm.this.ah.i();
            $$2.o(
               (double)(0.3F * -ayy.a(cfm.this.dF() * (float) (Math.PI / 180.0)) * ayy.b(cfm.this.dH() * (float) (Math.PI / 180.0)) + ayy.b($$4) * $$5),
               (double)(0.3F * ayy.a(cfm.this.dH() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * ayy.b(cfm.this.dF() * (float) (Math.PI / 180.0)) * ayy.b(cfm.this.dH() * (float) (Math.PI / 180.0)) + ayy.a($$4) * $$5)
            );
            cfm.this.dP().b($$2);
         }
      }
   }
}
