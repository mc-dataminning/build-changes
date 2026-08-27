import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cfh extends cfy implements cgc {
   private final bxl<cfh> b = new bxl<>(this, 1.0, 20, 15.0F);
   private final bwv c = new bwv(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         cfh.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         cfh.this.v(true);
      }
   };

   protected cfh(bpc<? extends cfh> $$0, cwz $$1) {
      super($$0, $$1);
      this.y();
   }

   @Override
   protected void z() {
      this.bR.a(2, new bxo(this));
      this.bR.a(3, new bwe(this, 1.0));
      this.bR.a(3, new bvs<>(this, ccg.class, 6.0F, 1.0, 1.2));
      this.bR.a(5, new bxy(this, 1.0));
      this.bR.a(6, new bwt(this, cis.class, 8.0F));
      this.bR.a(6, new bxg(this));
      this.bS.a(1, new byd(this));
      this.bS.a(2, new bye<>(this, cis.class, true));
      this.bS.a(3, new bye<>(this, cbp.class, true));
      this.bS.a(3, new bye<>(this, cce.class, 10, true, false, cce.bY));
   }

   public static bqu.a r() {
      return cfy.gt().a(bqv.r, 0.25);
   }

   @Override
   protected void b(ib $$0, dmz $$1) {
      this.a(this.s(), 0.15F, 1.0F);
   }

   abstract atx s();

   @Override
   public void m_() {
      boolean $$0 = this.gh();
      if ($$0) {
         cqk $$1 = this.d(bpd.f);
         if (!$$1.b()) {
            if ($$1.i()) {
               $$1.b($$1.l() + this.ag.a(2));
               if ($$1.l() >= $$1.m()) {
                  this.e(bpd.f);
                  this.a(bpd.f, cqk.h);
               }
            }

            $$0 = false;
         }

         if ($$0) {
            this.g(8);
         }
      }

      super.m_();
   }

   @Override
   public void t() {
      super.t();
      if (this.da() instanceof bpw $$0) {
         this.aX = $$0.aX;
      }
   }

   @Override
   protected void a(axd $$0, bna $$1) {
      super.a($$0, $$1);
      this.a(bpd.a, new cqk(cqn.ot));
   }

   @Nullable
   @Override
   public bqg a(cxo $$0, bna $$1, bps $$2, @Nullable bqg $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      axd $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      this.y();
      this.s($$4.i() < 0.55F * $$1.d());
      if (this.d(bpd.f).b()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bpd.f, new cqk($$4.i() < 0.1F ? dac.ef : dac.ee));
            this.bU[bpd.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void y() {
      if (this.dM() != null && !this.dM().B) {
         this.bR.a(this.c);
         this.bR.a(this.b);
         cqk $$0 = this.b(cjm.a(this, cqn.ot));
         if ($$0.a(cqn.ot)) {
            int $$1 = 20;
            if (this.dM().aj() != bmz.d) {
               $$1 = 40;
            }

            this.b.c($$1);
            this.bR.a(4, this.b);
         } else {
            this.bR.a(4, this.c);
         }
      }
   }

   @Override
   public void a(bpo $$0, float $$1) {
      cqk $$2 = this.g(this.b(cjm.a(this, cqn.ot)));
      ciy $$3 = this.b($$2, $$1);
      double $$4 = $$0.dr() - this.dr();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dt();
      double $$6 = $$0.dx() - this.dx();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dM().aj().a() * 4));
      this.a(aty.wJ, 1.0F, 1.0F / (this.ei().i() * 0.4F + 0.8F));
      this.dM().b($$3);
   }

   protected ciy b(cqk $$0, float $$1) {
      return cjm.a(this, $$0, $$1);
   }

   @Override
   public boolean a(cra $$0) {
      return $$0 == cqn.ot;
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.y();
   }

   @Override
   public void a(bpd $$0, cqk $$1) {
      super.a($$0, $$1);
      if (!this.dM().B) {
         this.y();
      }
   }

   public boolean gn() {
      return this.cl();
   }
}
