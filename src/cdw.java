import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cdw extends cen implements cer {
   private final bwb<cdw> b = new bwb<>(this, 1.0, 20, 15.0F);
   private final bvl c = new bvl(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         cdw.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         cdw.this.v(true);
      }
   };

   protected cdw(bnu<? extends cdw> $$0, cvn $$1) {
      super($$0, $$1);
      this.A();
   }

   @Override
   protected void B() {
      this.bO.a(2, new bwe(this));
      this.bO.a(3, new buu(this, 1.0));
      this.bO.a(3, new bui<>(this, caw.class, 6.0F, 1.0, 1.2));
      this.bO.a(5, new bwo(this, 1.0));
      this.bO.a(6, new bvj(this, chh.class, 8.0F));
      this.bO.a(6, new bvw(this));
      this.bP.a(1, new bwt(this));
      this.bP.a(2, new bwu<>(this, chh.class, true));
      this.bP.a(3, new bwu<>(this, caf.class, true));
      this.bP.a(3, new bwu<>(this, cau.class, 10, true, false, cau.bU));
   }

   public static bpk.a u() {
      return cen.gm().a(bpl.o, 0.25);
   }

   @Override
   protected void b(hz $$0, dlf $$1) {
      this.a(this.w(), 0.15F, 1.0F);
   }

   abstract atj w();

   @Override
   public void d_() {
      boolean $$0 = this.ga();
      if ($$0) {
         coz $$1 = this.c(bnv.f);
         if (!$$1.b()) {
            if ($$1.i()) {
               $$1.b($$1.l() + this.af.a(2));
               if ($$1.l() >= $$1.m()) {
                  this.d(bnv.f);
                  this.a(bnv.f, coz.h);
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
      if (this.da() instanceof boo $$0) {
         this.aU = $$0.aU;
      }
   }

   @Override
   protected void a(awo $$0, bls $$1) {
      super.a($$0, $$1);
      this.a(bnv.a, new coz(cpc.ot));
   }

   @Nullable
   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      awo $$5 = $$0.F_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      this.A();
      this.s($$5.i() < 0.55F * $$1.d());
      if (this.c(bnv.f).b()) {
         LocalDate $$6 = LocalDate.now();
         int $$7 = $$6.get(ChronoField.DAY_OF_MONTH);
         int $$8 = $$6.get(ChronoField.MONTH_OF_YEAR);
         if ($$8 == 10 && $$7 == 31 && $$5.i() < 0.25F) {
            this.a(bnv.f, new coz($$5.i() < 0.1F ? cyq.ef : cyq.ee));
            this.bR[bnv.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void A() {
      if (this.dM() != null && !this.dM().B) {
         this.bO.a(this.c);
         this.bO.a(this.b);
         coz $$0 = this.b(cib.a(this, cpc.ot));
         if ($$0.a(cpc.ot)) {
            int $$1 = 20;
            if (this.dM().ak() != blr.d) {
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
   public void a(bog $$0, float $$1) {
      coz $$2 = this.g(this.b(cib.a(this, cpc.ot)));
      chn $$3 = this.b($$2, $$1);
      double $$4 = $$0.dr() - this.dr();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dt();
      double $$6 = $$0.dx() - this.dx();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dM().ak().a() * 4));
      this.a(atk.wF, 1.0F, 1.0F / (this.eh().i() * 0.4F + 0.8F));
      this.dM().b($$3);
   }

   protected chn b(coz $$0, float $$1) {
      return cib.a(this, $$0, $$1);
   }

   @Override
   public boolean a(cpp $$0) {
      return $$0 == cpc.ot;
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.A();
   }

   @Override
   public void a(bnv $$0, coz $$1) {
      super.a($$0, $$1);
      if (!this.dM().B) {
         this.A();
      }
   }

   public boolean gg() {
      return this.cl();
   }
}
