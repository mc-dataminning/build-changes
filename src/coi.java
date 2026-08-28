import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class coi extends cpb implements cpf {
   private static final int a = 20;
   private static final int b = 40;
   private final cfs<coi> c = new cfs<>(this, 1.0, 20, 15.0F);
   private final cfc d = new cfc(this, 1.2, false) {
      @Override
      public void e() {
         super.e();
         coi.this.v(false);
      }

      @Override
      public void d() {
         super.d();
         coi.this.v(true);
      }
   };

   protected coi(bxe<? extends coi> $$0, djz $$1) {
      super($$0, $$1);
      this.n();
   }

   @Override
   protected void D() {
      this.bF.a(2, new cfv(this));
      this.bF.a(3, new cel(this, 1.0));
      this.bF.a(3, new cdz<>(this, cmo.class, 6.0F, 1.0, 1.2));
      this.bF.a(5, new cgf(this, 1.0));
      this.bF.a(6, new cfa(this, crz.class, 8.0F));
      this.bF.a(6, new cfn(this));
      this.bG.a(1, new cgk(this));
      this.bG.a(2, new cgl<>(this, crz.class, true));
      this.bG.a(3, new cgl<>(this, ckc.class, true));
      this.bG.a(3, new cgl<>(this, ckt.class, 10, true, false, ckt.bI));
   }

   public static bzb.a j() {
      return cpb.gx().a(bzc.v, 0.25);
   }

   @Override
   protected void b(iw $$0, ebg $$1) {
      this.a(this.m(), 0.15F, 1.0F);
   }

   abstract awq m();

   @Override
   public void k_() {
      boolean $$0 = this.go();
      if ($$0) {
         daa $$1 = this.a(bxf.f);
         if (!$$1.f()) {
            if ($$1.m()) {
               czw $$2 = $$1.h();
               $$1.b($$1.o() + this.ae.a(2));
               if ($$1.o() >= $$1.p()) {
                  this.a($$2, bxf.f);
                  this.a(bxf.f, daa.k);
               }
            }

            $$0 = false;
         }

         if ($$0) {
            this.e(8.0F);
         }
      }

      super.k_();
   }

   @Override
   public void r() {
      super.r();
      if (this.dl() instanceof bye $$0) {
         this.aV = $$0.aV;
      }
   }

   @Override
   protected void a(azz $$0, bur $$1) {
      super.a($$0, $$1);
      this.a(bxf.a, new daa(dae.pj));
   }

   @Nullable
   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azz $$4 = $$0.G_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      this.n();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(bxf.f).f()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bxf.f, new daa($$4.i() < 0.1F ? dng.ew : dng.ev));
            this.a(bxf.f, 0.0F);
         }
      }

      return $$3;
   }

   public void n() {
      if (this.dV() != null && !this.dV().C) {
         this.bF.a(this.d);
         this.bF.a(this.c);
         daa $$0 = this.b(csw.a(this, dae.pj));
         if ($$0.a(dae.pj)) {
            int $$1 = this.q();
            if (this.dV().an() != buq.d) {
               $$1 = this.t();
            }

            this.c.c($$1);
            this.bF.a(4, this.c);
         } else {
            this.bF.a(4, this.d);
         }
      }
   }

   protected int q() {
      return 20;
   }

   protected int t() {
      return 40;
   }

   @Override
   public void a(bxw $$0, float $$1) {
      daa $$2 = this.b(csw.a(this, dae.pj));
      daa $$3 = this.d($$2);
      csh $$4 = this.a($$3, $$1, $$2);
      double $$5 = $$0.dA() - this.dA();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dC();
      double $$7 = $$0.dG() - this.dG();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dV() instanceof aru $$9) {
         csu.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.an().a() * 4));
      }

      this.a(awr.yd, 1.0F, 1.0F / (this.dY().i() * 0.4F + 0.8F));
   }

   protected csh a(daa $$0, float $$1, @Nullable daa $$2) {
      return csw.a(this, $$0, $$1, $$2);
   }

   @Override
   public boolean a(dav $$0) {
      return $$0 == dae.pj;
   }

   @Override
   public axv<czw> Y() {
      return axo.bU;
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.n();
   }

   @Override
   public void a(bxf $$0, daa $$1, daa $$2) {
      super.a($$0, $$1, $$2);
      if (!this.dV().C) {
         this.n();
      }
   }

   public boolean x() {
      return this.cw();
   }
}
