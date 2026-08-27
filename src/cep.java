import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cep extends cfg implements cfk {
   private final bwu<cep> b = new bwu<>(this, 1.0, 20, 15.0F);
   private final bwe c = new bwe(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         cep.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         cep.this.v(true);
      }
   };

   protected cep(bol<? extends cep> $$0, cwe $$1) {
      super($$0, $$1);
      this.A();
   }

   @Override
   protected void B() {
      this.bP.a(2, new bwx(this));
      this.bP.a(3, new bvn(this, 1.0));
      this.bP.a(3, new bvb<>(this, cbp.class, 6.0F, 1.0, 1.2));
      this.bP.a(5, new bxh(this, 1.0));
      this.bP.a(6, new bwc(this, cia.class, 8.0F));
      this.bP.a(6, new bwp(this));
      this.bQ.a(1, new bxm(this));
      this.bQ.a(2, new bxn<>(this, cia.class, true));
      this.bQ.a(3, new bxn<>(this, cay.class, true));
      this.bQ.a(3, new bxn<>(this, cbn.class, 10, true, false, cbn.bW));
   }

   public static bqd.a u() {
      return cfg.gr().a(bqe.o, 0.25);
   }

   @Override
   protected void b(ib $$0, dme $$1) {
      this.a(this.w(), 0.15F, 1.0F);
   }

   abstract ato w();

   @Override
   public void d_() {
      boolean $$0 = this.gf();
      if ($$0) {
         cpq $$1 = this.c(bom.f);
         if (!$$1.b()) {
            if ($$1.i()) {
               $$1.b($$1.l() + this.af.a(2));
               if ($$1.l() >= $$1.m()) {
                  this.d(bom.f);
                  this.a(bom.f, cpq.h);
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
      if (this.cX() instanceof bpf $$0) {
         this.aV = $$0.aV;
      }
   }

   @Override
   protected void a(awt $$0, bmj $$1) {
      super.a($$0, $$1);
      this.a(bom.a, new cpq(cpt.ot));
   }

   @Nullable
   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      awt $$4 = $$0.F_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      this.A();
      this.s($$4.i() < 0.55F * $$1.d());
      if (this.c(bom.f).b()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bom.f, new cpq($$4.i() < 0.1F ? czh.ef : czh.ee));
            this.bS[bom.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void A() {
      if (this.dJ() != null && !this.dJ().B) {
         this.bP.a(this.c);
         this.bP.a(this.b);
         cpq $$0 = this.b(ciu.a(this, cpt.ot));
         if ($$0.a(cpt.ot)) {
            int $$1 = 20;
            if (this.dJ().aj() != bmi.d) {
               $$1 = 40;
            }

            this.b.c($$1);
            this.bP.a(4, this.b);
         } else {
            this.bP.a(4, this.c);
         }
      }
   }

   @Override
   public void a(box $$0, float $$1) {
      cpq $$2 = this.g(this.b(ciu.a(this, cpt.ot)));
      cig $$3 = this.b($$2, $$1);
      double $$4 = $$0.do() - this.do();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dq();
      double $$6 = $$0.du() - this.du();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dJ().aj().a() * 4));
      this.a(atp.wG, 1.0F, 1.0F / (this.ef().i() * 0.4F + 0.8F));
      this.dJ().b($$3);
   }

   protected cig b(cpq $$0, float $$1) {
      return ciu.a(this, $$0, $$1);
   }

   @Override
   public boolean a(cqg $$0) {
      return $$0 == cpt.ot;
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.A();
   }

   @Override
   public void a(bom $$0, cpq $$1) {
      super.a($$0, $$1);
      if (!this.dJ().B) {
         this.A();
      }
   }

   public boolean gl() {
      return this.ci();
   }
}
