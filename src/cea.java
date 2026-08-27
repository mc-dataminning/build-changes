import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cea extends cer implements cev {
   private final bwf<cea> b = new bwf<>(this, 1.0, 20, 15.0F);
   private final bvp c = new bvp(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         cea.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         cea.this.v(true);
      }
   };

   protected cea(bnw<? extends cea> $$0, cvr $$1) {
      super($$0, $$1);
      this.A();
   }

   @Override
   protected void B() {
      this.bO.a(2, new bwi(this));
      this.bO.a(3, new buy(this, 1.0));
      this.bO.a(3, new bum<>(this, cba.class, 6.0F, 1.0, 1.2));
      this.bO.a(5, new bws(this, 1.0));
      this.bO.a(6, new bvn(this, chl.class, 8.0F));
      this.bO.a(6, new bwa(this));
      this.bP.a(1, new bwx(this));
      this.bP.a(2, new bwy<>(this, chl.class, true));
      this.bP.a(3, new bwy<>(this, caj.class, true));
      this.bP.a(3, new bwy<>(this, cay.class, 10, true, false, cay.bU));
   }

   public static bpo.a u() {
      return cer.gm().a(bpp.o, 0.25);
   }

   @Override
   protected void b(hz $$0, dlj $$1) {
      this.a(this.w(), 0.15F, 1.0F);
   }

   abstract atk w();

   @Override
   public void d_() {
      boolean $$0 = this.ga();
      if ($$0) {
         cpd $$1 = this.c(bnx.f);
         if (!$$1.b()) {
            if ($$1.i()) {
               $$1.b($$1.l() + this.af.a(2));
               if ($$1.l() >= $$1.m()) {
                  this.d(bnx.f);
                  this.a(bnx.f, cpd.h);
               }
            }

            $$0 = false;
         }

         if ($$0) {
            this.g(8);
         }
      }

      super.d_();
   }

   @Override
   public void t() {
      super.t();
      if (this.da() instanceof boq $$0) {
         this.aU = $$0.aU;
      }
   }

   @Override
   protected void a(awp $$0, blu $$1) {
      super.a($$0, $$1);
      this.a(bnx.a, new cpd(cpg.ot));
   }

   @Nullable
   @Override
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      awp $$5 = $$0.F_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      this.A();
      this.s($$5.i() < 0.55F * $$1.d());
      if (this.c(bnx.f).b()) {
         LocalDate $$6 = LocalDate.now();
         int $$7 = $$6.get(ChronoField.DAY_OF_MONTH);
         int $$8 = $$6.get(ChronoField.MONTH_OF_YEAR);
         if ($$8 == 10 && $$7 == 31 && $$5.i() < 0.25F) {
            this.a(bnx.f, new cpd($$5.i() < 0.1F ? cyu.ef : cyu.ee));
            this.bR[bnx.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void A() {
      if (this.dM() != null && !this.dM().B) {
         this.bO.a(this.c);
         this.bO.a(this.b);
         cpd $$0 = this.b(cif.a(this, cpg.ot));
         if ($$0.a(cpg.ot)) {
            int $$1 = 20;
            if (this.dM().aj() != blt.d) {
               $$1 = 40;
            }

            this.b.c($$1);
            this.bO.a(4, this.b);
         } else {
            this.bO.a(4, this.c);
         }
      }
   }

   @Override
   public void a(boi $$0, float $$1) {
      cpd $$2 = this.g(this.b(cif.a(this, cpg.ot)));
      chr $$3 = this.b($$2, $$1);
      double $$4 = $$0.dr() - this.dr();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dt();
      double $$6 = $$0.dx() - this.dx();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dM().aj().a() * 4));
      this.a(atl.wG, 1.0F, 1.0F / (this.eh().i() * 0.4F + 0.8F));
      this.dM().b($$3);
   }

   protected chr b(cpd $$0, float $$1) {
      return cif.a(this, $$0, $$1);
   }

   @Override
   public boolean a(cpt $$0) {
      return $$0 == cpg.ot;
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.A();
   }

   @Override
   public void a(bnx $$0, cpd $$1) {
      super.a($$0, $$1);
      if (!this.dM().B) {
         this.A();
      }
   }

   public boolean gg() {
      return this.cl();
   }
}
