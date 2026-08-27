import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class ccf extends ccw implements cda {
   private final buk<ccf> b = new buk<>(this, 1.0, 20, 15.0F);
   private final btu c = new btu(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         ccf.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         ccf.this.v(true);
      }
   };

   protected ccf(bmc<? extends ccf> $$0, ctx $$1) {
      super($$0, $$1);
      this.A();
   }

   @Override
   protected void B() {
      this.bP.a(2, new bun(this));
      this.bP.a(3, new btd(this, 1.0));
      this.bP.a(3, new bsr<>(this, bzf.class, 6.0F, 1.0, 1.2));
      this.bP.a(5, new bux(this, 1.0));
      this.bP.a(6, new bts(this, cfq.class, 8.0F));
      this.bP.a(6, new buf(this));
      this.bQ.a(1, new bvc(this));
      this.bQ.a(2, new bvd<>(this, cfq.class, true));
      this.bQ.a(3, new bvd<>(this, byo.class, true));
      this.bQ.a(3, new bvd<>(this, bzd.class, 10, true, false, bzd.bV));
   }

   public static bnt.a u() {
      return ccw.gl().a(bnu.o, 0.25);
   }

   @Override
   protected void b(hx $$0, djp $$1) {
      this.a(this.w(), 0.15F, 1.0F);
   }

   abstract ars w();

   @Override
   public bmt eS() {
      return bmt.b;
   }

   @Override
   public void d_() {
      boolean $$0 = this.fZ();
      if ($$0) {
         cng $$1 = this.c(bmd.f);
         if (!$$1.b()) {
            if ($$1.i()) {
               $$1.b($$1.k() + this.ag.a(2));
               if ($$1.k() >= $$1.l()) {
                  this.d(bmd.f);
                  this.a(bmd.f, cng.f);
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
      if (this.da() instanceof bmx $$0) {
         this.aU = $$0.aU;
      }
   }

   @Override
   protected void a(auw $$0, bka $$1) {
      super.a($$0, $$1);
      this.a(bmd.a, new cng(cnj.ot));
   }

   @Nullable
   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      auw $$5 = $$0.F_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      this.A();
      this.s($$5.i() < 0.55F * $$1.d());
      if (this.c(bmd.f).b()) {
         LocalDate $$6 = LocalDate.now();
         int $$7 = $$6.get(ChronoField.DAY_OF_MONTH);
         int $$8 = $$6.get(ChronoField.MONTH_OF_YEAR);
         if ($$8 == 10 && $$7 == 31 && $$5.i() < 0.25F) {
            this.a(bmd.f, new cng($$5.i() < 0.1F ? cxa.ef : cxa.ee));
            this.bS[bmd.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void A() {
      if (this.dL() != null && !this.dL().B) {
         this.bP.a(this.c);
         this.bP.a(this.b);
         cng $$0 = this.b(cgj.a(this, cnj.ot));
         if ($$0.a(cnj.ot)) {
            int $$1 = 20;
            if (this.dL().ak() != bjz.d) {
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
   public void a(bmo $$0, float $$1) {
      cng $$2 = this.g(this.b(cgj.a(this, cnj.ot)));
      cfw $$3 = this.b($$2, $$1);
      double $$4 = $$0.dq() - this.dq();
      double $$5 = $$0.e(0.3333333333333333) - $$3.ds();
      double $$6 = $$0.dw() - this.dw();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dL().ak().a() * 4));
      this.a(art.wF, 1.0F, 1.0F / (this.eg().i() * 0.4F + 0.8F));
      this.dL().b($$3);
   }

   protected cfw b(cng $$0, float $$1) {
      return cgj.a(this, $$0, $$1);
   }

   @Override
   public boolean a(cnw $$0) {
      return $$0 == cnj.ot;
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.A();
   }

   @Override
   public void a(bmd $$0, cng $$1) {
      super.a($$0, $$1);
      if (!this.dL().B) {
         this.A();
      }
   }

   public boolean gf() {
      return this.cl();
   }
}
