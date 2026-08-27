import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cem extends cfg {
   private static final ajr<io> d = ajv.a(cem.class, ajt.o);
   private static final ajr<Boolean> e = ajv.a(cem.class, ajt.k);
   private static final ajr<Integer> bY = ajv.a(cem.class, ajt.b);
   static final cdf bZ = cdf.b().a(10.0).d();
   public static final int b = 4800;
   private static final int ca = 2400;
   public static final Predicate<cig> c = $$0 -> !$$0.y() && $$0.bD() && $$0.be();

   public cem(bsa<? extends cem> $$0, dax $$1) {
      super($$0, $$1);
      this.bP = new byr(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new byq(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      this.k(this.ck());
      this.s(0.0F);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(int $$0) {
   }

   public void i(io $$0) {
      this.ao.a(d, $$0);
   }

   public io s() {
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
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(d, io.c);
      $$0.a(e, false);
      $$0.a(bY, 2400);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.s().u());
      $$0.a("TreasurePosY", this.s().v());
      $$0.a("TreasurePosZ", this.s().w());
      $$0.a("GotFish", this.u());
      $$0.a("Moistness", this.y());
   }

   @Override
   public void a(ud $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.i(new io($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("GotFish"));
      this.c($$0.h("Moistness"));
   }

   @Override
   protected void z() {
      this.bS.a(0, new byx(this));
      this.bS.a(0, new caw(this));
      this.bS.a(1, new cem.a(this));
      this.bS.a(2, new cem.b(this, 4.0));
      this.bS.a(4, new cak(this, 1.0, 10));
      this.bS.a(4, new cah(this));
      this.bS.a(5, new bzu(this, clw.class, 6.0F));
      this.bS.a(5, new bzc(this, 10));
      this.bS.a(6, new bzw(this, 1.2F, true));
      this.bS.a(8, new cem.c());
      this.bS.a(8, new bzh(this));
      this.bS.a(9, new byt<>(this, ciy.class, 8.0F, 1.0, 1.0));
      this.bT.a(1, new cbe(this, ciy.class).a());
   }

   public static btv.a gp() {
      return bsq.A().a(btw.q, 10.0).a(btw.r, 1.2F).a(btw.c, 3.0);
   }

   @Override
   protected cca b(dax $$0) {
      return new ccc(this, $$0);
   }

   @Override
   public boolean C(bru $$0) {
      boolean $$1 = $$0.a(this.dQ().b((bso)this), (float)((int)this.g(btw.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(avh.gX, 1.0F, 1.0F);
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
   public int Z() {
      return 1;
   }

   @Override
   public int aa() {
      return 1;
   }

   @Override
   protected boolean o(bru $$0) {
      return true;
   }

   @Override
   public boolean f(cto $$0) {
      bsb $$1 = bsq.h($$0);
      return !this.a($$1).e() ? false : $$1 == bsb.a && super.f($$0);
   }

   @Override
   protected void b(cig $$0) {
      if (this.a(bsb.a).e()) {
         cto $$1 = $$0.p();
         if (this.j($$1)) {
            this.a($$0);
            this.a(bsb.a, $$1);
            this.f(bsb.a);
            this.a($$0, $$1.I());
            $$0.ao();
         }
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.gf()) {
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
               this.g(this.ds().b((double)((this.ah.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.ah.i() * 2.0F - 1.0F) * 0.2F)));
               this.r(this.ah.i() * 360.0F);
               this.d(false);
               this.av = true;
            }
         }

         if (this.dP().B && this.be() && this.ds().g() > 0.03) {
            euk $$0 = this.f(0.0F);
            float $$1 = ayd.b(this.dF() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = ayd.a(this.dF() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ah.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dP()
                  .a(ky.as, this.du() - $$0.c * (double)$$3 + (double)$$1, this.dw() - $$0.d, this.dA() - $$0.e * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dP()
                  .a(ky.as, this.du() - $$0.c * (double)$$3 - (double)$$1, this.dw() - $$0.d, this.dA() - $$0.e * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(ky.O);
      } else {
         super.b($$0);
      }
   }

   private void a(kw $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.ah.k() * 0.01;
         double $$3 = this.ah.k() * 0.01;
         double $$4 = this.ah.k() * 0.01;
         this.dP().a($$0, this.d(1.0), this.dx() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bpu b(clw $$0, bpt $$1) {
      cto $$2 = $$0.b($$1);
      if (!$$2.e() && $$2.a(awe.aP)) {
         if (!this.dP().B) {
            this.a(avh.gZ, 1.0F, 1.0F);
         }

         this.w(true);
         $$2.a(1, $$0);
         return bpu.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.ha;
   }

   @Nullable
   @Override
   protected avg o_() {
      return avh.gY;
   }

   @Nullable
   @Override
   protected avg v() {
      return this.be() ? avh.gW : avh.gV;
   }

   @Override
   protected avg aQ() {
      return avh.hd;
   }

   @Override
   protected avg aP() {
      return avh.he;
   }

   protected boolean gq() {
      io $$0 = this.K().h();
      return $$0 != null ? $$0.a(this.dn(), 12.0) : false;
   }

   @Override
   public void a(euk $$0) {
      if (this.db() && this.be()) {
         this.a(this.fn(), $$0);
         this.a(bst.a, this.ds());
         this.g(this.ds().a(0.9));
         if (this.p() == null) {
            this.g(this.ds().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(clw $$0) {
      return true;
   }

   static class a extends bzm {
      private final cem a;
      private boolean b;

      a(cem $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzm.a.a, bzm.a.b));
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
         io $$0 = this.a.s();
         return !io.a((double)$$0.u(), this.a.dw(), (double)$$0.w()).a(this.a.dn(), 4.0) && !this.b && this.a.cl() >= 100;
      }

      @Override
      public void c() {
         if (this.a.dP() instanceof aqm) {
            aqm $$0 = (aqm)this.a.dP();
            this.b = false;
            this.a.K().n();
            io $$1 = this.a.dp();
            io $$2 = $$0.a(awh.b, $$1, 50, false);
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
         io $$0 = this.a.s();
         if (io.a((double)$$0.u(), this.a.dw(), (double)$$0.w()).a(this.a.dn(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void e() {
         dax $$0 = this.a.dP();
         if (this.a.gq() || this.a.K().l()) {
            euk $$1 = euk.b(this.a.s());
            euk $$2 = cdj.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = cdj.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               io $$3 = io.a($$2);
               if (!$$0.b_($$3).a(awb.a) || !$$0.a_($$3).a(enj.b)) {
                  $$2 = cdj.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
               }
            }

            if ($$2 == null) {
               this.b = true;
               return;
            }

            this.a.G().a($$2.c, $$2.d, $$2.e, (float)(this.a.aa() + 20), (float)this.a.Z());
            this.a.K().a($$2.c, $$2.d, $$2.e, 1.3);
            if ($$0.z.a(this.a(80)) == 0) {
               $$0.a(this.a, (byte)38);
            }
         }
      }
   }

   static class b extends bzm {
      private final cem a;
      private final double b;
      @Nullable
      private clw c;

      b(cem $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(bzm.a.a, bzm.a.b));
      }

      @Override
      public boolean a() {
         this.c = this.a.dP().a(cem.bZ, this.a);
         return this.c == null ? false : this.c.cc() && this.a.p() != this.c;
      }

      @Override
      public boolean b() {
         return this.c != null && this.c.cc() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void c() {
         this.c.b(new brc(bre.D, 100), this.a);
      }

      @Override
      public void d() {
         this.c = null;
         this.a.K().n();
      }

      @Override
      public void e() {
         this.a.G().a(this.c, (float)(this.a.aa() + 20), (float)this.a.Z());
         if (this.a.g(this.c) < 6.25) {
            this.a.K().n();
         } else {
            this.a.K().a(this.c, this.b);
         }

         if (this.c.cc() && this.c.dP().z.a(6) == 0) {
            this.c.b(new brc(bre.D, 100), this.a);
         }
      }
   }

   class c extends bzm {
      private int b;

      @Override
      public boolean a() {
         if (this.b > cem.this.ai) {
            return false;
         } else {
            List<cig> $$0 = cem.this.dP().a(cig.class, cem.this.cK().c(8.0, 8.0, 8.0), cem.c);
            return !$$0.isEmpty() || !cem.this.a(bsb.a).e();
         }
      }

      @Override
      public void c() {
         List<cig> $$0 = cem.this.dP().a(cig.class, cem.this.cK().c(8.0, 8.0, 8.0), cem.c);
         if (!$$0.isEmpty()) {
            cem.this.K().a($$0.get(0), 1.2F);
            cem.this.a(avh.hc, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cto $$0 = cem.this.a(bsb.a);
         if (!$$0.e()) {
            this.a($$0);
            cem.this.a(bsb.a, cto.i);
            this.b = cem.this.ai + cem.this.ah.a(100);
         }
      }

      @Override
      public void e() {
         List<cig> $$0 = cem.this.dP().a(cig.class, cem.this.cK().c(8.0, 8.0, 8.0), cem.c);
         cto $$1 = cem.this.a(bsb.a);
         if (!$$1.e()) {
            this.a($$1);
            cem.this.a(bsb.a, cto.i);
         } else if (!$$0.isEmpty()) {
            cem.this.K().a($$0.get(0), 1.2F);
         }
      }

      private void a(cto $$0) {
         if (!$$0.e()) {
            double $$1 = cem.this.dy() - 0.3F;
            cig $$2 = new cig(cem.this.dP(), cem.this.du(), $$1, cem.this.dA(), $$0);
            $$2.b(40);
            $$2.b(cem.this);
            float $$3 = 0.3F;
            float $$4 = cem.this.ah.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * cem.this.ah.i();
            $$2.o(
               (double)(0.3F * -ayd.a(cem.this.dF() * (float) (Math.PI / 180.0)) * ayd.b(cem.this.dH() * (float) (Math.PI / 180.0)) + ayd.b($$4) * $$5),
               (double)(0.3F * ayd.a(cem.this.dH() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * ayd.b(cem.this.dF() * (float) (Math.PI / 180.0)) * ayd.b(cem.this.dH() * (float) (Math.PI / 180.0)) + ayd.a($$4) * $$5)
            );
            cem.this.dP().b($$2);
         }
      }
   }
}
