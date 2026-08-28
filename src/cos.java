import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cos extends cpk implements cpo {
   private static final int a = 20;
   private static final int b = 40;
   private final cgb<cos> c = new cgb<>(this, 1.0, 20, 15.0F);
   private final cfl d = new cfl(this, 1.2, false) {
      @Override
      public void e() {
         super.e();
         cos.this.v(false);
      }

      @Override
      public void d() {
         super.d();
         cos.this.v(true);
      }
   };

   protected cos(bxn<? extends cos> $$0, dkj $$1) {
      super($$0, $$1);
      this.u();
   }

   @Override
   protected void C() {
      this.bF.a(2, new cge(this));
      this.bF.a(3, new ceu(this, 1.0));
      this.bF.a(3, new cei<>(this, cmx.class, 6.0F, 1.0, 1.2));
      this.bF.a(5, new cgo(this, 1.0));
      this.bF.a(6, new cfj(this, csi.class, 8.0F));
      this.bF.a(6, new cfw(this));
      this.bG.a(1, new cgt(this));
      this.bG.a(2, new cgu<>(this, csi.class, true));
      this.bG.a(3, new cgu<>(this, ckl.class, true));
      this.bG.a(3, new cgu<>(this, clc.class, 10, true, false, clc.bI));
   }

   public static bzk.a m() {
      return cpk.gA().a(bzl.v, 0.25);
   }

   @Override
   protected void b(iw $$0, ebq $$1) {
      this.a(this.p(), 0.15F, 1.0F);
   }

   abstract awx p();

   @Override
   public void d_() {
      boolean $$0 = this.go();
      if ($$0) {
         dak $$1 = this.a(bxo.f);
         if (!$$1.f()) {
            if ($$1.m()) {
               dag $$2 = $$1.h();
               $$1.b($$1.o() + this.ae.a(2));
               if ($$1.o() >= $$1.p()) {
                  this.a($$2, bxo.f);
                  this.a(bxo.f, dak.l);
               }
            }

            $$0 = false;
         }

         if ($$0) {
            this.e(8.0F);
         }
      }

      super.d_();
   }

   @Override
   public void q() {
      super.q();
      if (this.dl() instanceof byn $$0) {
         this.aV = $$0.aV;
      }
   }

   @Override
   protected void a(bai $$0, bva $$1) {
      super.a($$0, $$1);
      this.a(bxo.a, new dak(dao.pj));
   }

   @Nullable
   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      bai $$4 = $$0.G_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      this.u();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(bxo.f).f()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bxo.f, new dak($$4.i() < 0.1F ? dnq.ew : dnq.ev));
            this.a(bxo.f, 0.0F);
         }
      }

      return $$3;
   }

   public void u() {
      if (this.dV() != null && !this.dV().C) {
         this.bF.a(this.d);
         this.bF.a(this.c);
         dak $$0 = this.b(ctf.a(this, dao.pj));
         if ($$0.a(dao.pj)) {
            int $$1 = this.gu();
            if (this.dV().an() != buz.d) {
               $$1 = this.gv();
            }

            this.c.c($$1);
            this.bF.a(4, this.c);
         } else {
            this.bF.a(4, this.d);
         }
      }
   }

   protected int gu() {
      return 20;
   }

   protected int gv() {
      return 40;
   }

   @Override
   public void a(byf $$0, float $$1) {
      dak $$2 = this.b(ctf.a(this, dao.pj));
      dak $$3 = this.d($$2);
      csq $$4 = this.a($$3, $$1, $$2);
      double $$5 = $$0.dA() - this.dA();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dC();
      double $$7 = $$0.dG() - this.dG();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dV() instanceof asb $$9) {
         ctd.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.an().a() * 4));
      }

      this.a(awy.yd, 1.0F, 1.0F / (this.dY().i() * 0.4F + 0.8F));
   }

   protected csq a(dak $$0, float $$1, @Nullable dak $$2) {
      return ctf.a(this, $$0, $$1, $$2);
   }

   @Override
   public boolean a(dbf $$0) {
      return $$0 == dao.pj;
   }

   @Override
   public ayc<dag> X() {
      return axv.bU;
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.u();
   }

   @Override
   public void a(bxo $$0, dak $$1, dak $$2) {
      super.a($$0, $$1, $$2);
      if (!this.dV().C) {
         this.u();
      }
   }

   public boolean gw() {
      return this.cw();
   }
}
