import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdb extends cdv {
   private static final ajk<im> d = ajo.a(cdb.class, ajm.o);
   private static final ajk<Boolean> e = ajo.a(cdb.class, ajm.k);
   private static final ajk<Integer> bY = ajo.a(cdb.class, ajm.b);
   static final cbu bZ = cbu.b().a(10.0).d();
   public static final int b = 4800;
   private static final int ca = 2400;
   public static final Predicate<cgv> c = $$0 -> !$$0.y() && $$0.bB() && $$0.bc();

   public cdb(bqr<? extends cdb> $$0, czu $$1) {
      super($$0, $$1);
      this.bP = new bxg(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new bxf(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      this.k(this.ci());
      this.s(0.0F);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(int $$0) {
   }

   public void i(im $$0) {
      this.ao.a(d, $$0);
   }

   public im r() {
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
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(d, im.c);
      $$0.a(e, false);
      $$0.a(bY, 2400);
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.r().u());
      $$0.a("TreasurePosY", this.r().v());
      $$0.a("TreasurePosZ", this.r().w());
      $$0.a("GotFish", this.u());
      $$0.a("Moistness", this.y());
   }

   @Override
   public void a(ty $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.i(new im($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("GotFish"));
      this.c($$0.h("Moistness"));
   }

   @Override
   protected void z() {
      this.bS.a(0, new bxm(this));
      this.bS.a(0, new bzl(this));
      this.bS.a(1, new cdb.a(this));
      this.bS.a(2, new cdb.b(this, 4.0));
      this.bS.a(4, new byz(this, 1.0, 10));
      this.bS.a(4, new byw(this));
      this.bS.a(5, new byj(this, ckl.class, 6.0F));
      this.bS.a(5, new bxr(this, 10));
      this.bS.a(6, new byl(this, 1.2F, true));
      this.bS.a(8, new cdb.c());
      this.bS.a(8, new bxw(this));
      this.bS.a(9, new bxi<>(this, chn.class, 8.0F, 1.0, 1.0));
      this.bT.a(1, new bzt(this, chn.class).a());
   }

   public static bsk.a gp() {
      return brg.A().a(bsl.q, 10.0).a(bsl.r, 1.2F).a(bsl.c, 3.0);
   }

   @Override
   protected cap b(czu $$0) {
      return new car(this, $$0);
   }

   @Override
   public boolean C(bql $$0) {
      boolean $$1 = $$0.a(this.dO().b((bre)this), (float)((int)this.g(bsl.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(auz.gS, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public int ci() {
      return 4800;
   }

   @Override
   protected int o(int $$0) {
      return this.ci();
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
   protected boolean o(bql $$0) {
      return true;
   }

   @Override
   public boolean f(csd $$0) {
      bqs $$1 = brg.h($$0);
      return !this.d($$1).d() ? false : $$1 == bqs.a && super.f($$0);
   }

   @Override
   protected void b(cgv $$0) {
      if (this.d(bqs.a).d()) {
         csd $$1 = $$0.p();
         if (this.j($$1)) {
            this.a($$0);
            this.a(bqs.a, $$1);
            this.f(bqs.a);
            this.a($$0, $$1.G());
            $$0.am();
         }
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.gf()) {
         this.k(this.ci());
      } else {
         if (this.be()) {
            this.c(2400);
         } else {
            this.c(this.y() - 1);
            if (this.y() <= 0) {
               this.a(this.dO().r(), 1.0F);
            }

            if (this.aC()) {
               this.g(this.dq().b((double)((this.ah.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.ah.i() * 2.0F - 1.0F) * 0.2F)));
               this.r(this.ah.i() * 360.0F);
               this.d(false);
               this.av = true;
            }
         }

         if (this.dN().B && this.bc() && this.dq().g() > 0.03) {
            etf $$0 = this.f(0.0F);
            float $$1 = axw.b(this.dD() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = axw.a(this.dD() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ah.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dN()
                  .a(kw.ap, this.ds() - $$0.c * (double)$$3 + (double)$$1, this.du() - $$0.d, this.dy() - $$0.e * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dN()
                  .a(kw.ap, this.ds() - $$0.c * (double)$$3 - (double)$$1, this.du() - $$0.d, this.dy() - $$0.e * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(kw.M);
      } else {
         super.b($$0);
      }
   }

   private void a(ku $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.ah.k() * 0.01;
         double $$3 = this.ah.k() * 0.01;
         double $$4 = this.ah.k() * 0.01;
         this.dN().a($$0, this.d(1.0), this.dv() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected boq b(ckl $$0, bop $$1) {
      csd $$2 = $$0.b($$1);
      if (!$$2.d() && $$2.a(avw.ao)) {
         if (!this.dN().B) {
            this.a(auz.gU, 1.0F, 1.0F);
         }

         this.w(true);
         $$2.a(1, $$0);
         return boq.a(this.dN().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.gV;
   }

   @Nullable
   @Override
   protected auy o_() {
      return auz.gT;
   }

   @Nullable
   @Override
   protected auy v() {
      return this.bc() ? auz.gR : auz.gQ;
   }

   @Override
   protected auy aO() {
      return auz.gY;
   }

   @Override
   protected auy aN() {
      return auz.gZ;
   }

   protected boolean gq() {
      im $$0 = this.K().h();
      return $$0 != null ? $$0.a(this.dl(), 12.0) : false;
   }

   @Override
   public void a(etf $$0) {
      if (this.cZ() && this.bc()) {
         this.a(this.fl(), $$0);
         this.a(brj.a, this.dq());
         this.g(this.dq().a(0.9));
         if (this.p() == null) {
            this.g(this.dq().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(ckl $$0) {
      return true;
   }

   static class a extends byb {
      private final cdb a;
      private boolean b;

      a(cdb $$0) {
         this.a = $$0;
         this.a(EnumSet.of(byb.a.a, byb.a.b));
      }

      @Override
      public boolean Q_() {
         return false;
      }

      @Override
      public boolean a() {
         return this.a.u() && this.a.cj() >= 100;
      }

      @Override
      public boolean b() {
         im $$0 = this.a.r();
         return !im.a((double)$$0.u(), this.a.du(), (double)$$0.w()).a(this.a.dl(), 4.0) && !this.b && this.a.cj() >= 100;
      }

      @Override
      public void c() {
         if (this.a.dN() instanceof aqe) {
            aqe $$0 = (aqe)this.a.dN();
            this.b = false;
            this.a.K().n();
            im $$1 = this.a.dn();
            im $$2 = $$0.a(avz.b, $$1, 50, false);
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
         im $$0 = this.a.r();
         if (im.a((double)$$0.u(), this.a.du(), (double)$$0.w()).a(this.a.dl(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void e() {
         czu $$0 = this.a.dN();
         if (this.a.gq() || this.a.K().l()) {
            etf $$1 = etf.b(this.a.r());
            etf $$2 = cby.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = cby.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               im $$3 = im.a($$2);
               if (!$$0.b_($$3).a(avt.a) || !$$0.a_($$3).a(emg.b)) {
                  $$2 = cby.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
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

   static class b extends byb {
      private final cdb a;
      private final double b;
      @Nullable
      private ckl c;

      b(cdb $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(byb.a.a, byb.a.b));
      }

      @Override
      public boolean a() {
         this.c = this.a.dN().a(cdb.bZ, this.a);
         return this.c == null ? false : this.c.ca() && this.a.p() != this.c;
      }

      @Override
      public boolean b() {
         return this.c != null && this.c.ca() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void c() {
         this.c.b(new bpx(bpz.D, 100), this.a);
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

         if (this.c.ca() && this.c.dN().z.a(6) == 0) {
            this.c.b(new bpx(bpz.D, 100), this.a);
         }
      }
   }

   class c extends byb {
      private int b;

      @Override
      public boolean a() {
         if (this.b > cdb.this.ai) {
            return false;
         } else {
            List<cgv> $$0 = cdb.this.dN().a(cgv.class, cdb.this.cI().c(8.0, 8.0, 8.0), cdb.c);
            return !$$0.isEmpty() || !cdb.this.d(bqs.a).d();
         }
      }

      @Override
      public void c() {
         List<cgv> $$0 = cdb.this.dN().a(cgv.class, cdb.this.cI().c(8.0, 8.0, 8.0), cdb.c);
         if (!$$0.isEmpty()) {
            cdb.this.K().a($$0.get(0), 1.2F);
            cdb.this.a(auz.gX, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void d() {
         csd $$0 = cdb.this.d(bqs.a);
         if (!$$0.d()) {
            this.a($$0);
            cdb.this.a(bqs.a, csd.i);
            this.b = cdb.this.ai + cdb.this.ah.a(100);
         }
      }

      @Override
      public void e() {
         List<cgv> $$0 = cdb.this.dN().a(cgv.class, cdb.this.cI().c(8.0, 8.0, 8.0), cdb.c);
         csd $$1 = cdb.this.d(bqs.a);
         if (!$$1.d()) {
            this.a($$1);
            cdb.this.a(bqs.a, csd.i);
         } else if (!$$0.isEmpty()) {
            cdb.this.K().a($$0.get(0), 1.2F);
         }
      }

      private void a(csd $$0) {
         if (!$$0.d()) {
            double $$1 = cdb.this.dw() - 0.3F;
            cgv $$2 = new cgv(cdb.this.dN(), cdb.this.ds(), $$1, cdb.this.dy(), $$0);
            $$2.b(40);
            $$2.b(cdb.this);
            float $$3 = 0.3F;
            float $$4 = cdb.this.ah.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * cdb.this.ah.i();
            $$2.o(
               (double)(0.3F * -axw.a(cdb.this.dD() * (float) (Math.PI / 180.0)) * axw.b(cdb.this.dF() * (float) (Math.PI / 180.0)) + axw.b($$4) * $$5),
               (double)(0.3F * axw.a(cdb.this.dF() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * axw.b(cdb.this.dD() * (float) (Math.PI / 180.0)) * axw.b(cdb.this.dF() * (float) (Math.PI / 180.0)) + axw.a($$4) * $$5)
            );
            cdb.this.dN().b($$2);
         }
      }
   }
}
