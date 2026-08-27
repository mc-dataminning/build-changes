import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cgh extends cgz implements chd {
   private static final int b = 20;
   private static final int c = 40;
   private final byl<cgh> d = new byl<>(this, 1.0, 20, 15.0F);
   private final bxv e = new bxv(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         cgh.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         cgh.this.v(true);
      }
   };

   protected cgh(bqb<? extends cgh> $$0, cyx $$1) {
      super($$0, $$1);
      this.y();
   }

   @Override
   protected void z() {
      this.bR.a(2, new byo(this));
      this.bR.a(3, new bxe(this, 1.0));
      this.bR.a(3, new bws<>(this, cdg.class, 6.0F, 1.0, 1.2));
      this.bR.a(5, new byy(this, 1.0));
      this.bR.a(6, new bxt(this, cjt.class, 8.0F));
      this.bR.a(6, new byg(this));
      this.bS.a(1, new bzd(this));
      this.bS.a(2, new bze<>(this, cjt.class, true));
      this.bS.a(3, new bze<>(this, ccp.class, true));
      this.bS.a(3, new bze<>(this, cde.class, 10, true, false, cde.bY));
   }

   public static bru.a r() {
      return cgz.gt().a(brv.r, 0.25);
   }

   @Override
   protected void b(ib $$0, doz $$1) {
      this.a(this.u(), 0.15F, 1.0F);
   }

   abstract aul u();

   @Override
   public void n_() {
      boolean $$0 = this.gh();
      if ($$0) {
         crj $$1 = this.d(bqc.f);
         if (!$$1.d()) {
            if ($$1.k()) {
               $$1.b($$1.m() + this.ag.a(2));
               if ($$1.m() >= $$1.n()) {
                  this.e(bqc.f);
                  this.a(bqc.f, crj.i);
               }
            }

            $$0 = false;
         }

         if ($$0) {
            this.g(8);
         }
      }

      super.n_();
   }

   @Override
   public void t() {
      super.t();
      if (this.da() instanceof bqw $$0) {
         this.aX = $$0.aX;
      }
   }

   @Override
   protected void a(axr $$0, bny $$1) {
      super.a($$0, $$1);
      this.a(bqc.a, new crj(crm.ot));
   }

   @Nullable
   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      axr $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      this.y();
      this.s($$4.i() < 0.55F * $$1.d());
      if (this.d(bqc.f).d()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bqc.f, new crj($$4.i() < 0.1F ? dca.ef : dca.ee));
            this.bU[bqc.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void y() {
      if (this.dM() != null && !this.dM().B) {
         this.bR.a(this.e);
         this.bR.a(this.d);
         crj $$0 = this.b(ckn.a(this, crm.ot));
         if ($$0.a(crm.ot)) {
            int $$1 = this.gn();
            if (this.dM().ak() != bnx.d) {
               $$1 = this.go();
            }

            this.d.c($$1);
            this.bR.a(4, this.d);
         } else {
            this.bR.a(4, this.e);
         }
      }
   }

   protected int gn() {
      return 20;
   }

   protected int go() {
      return 40;
   }

   @Override
   public void a(bqo $$0, float $$1) {
      crj $$2 = this.g(this.b(ckn.a(this, crm.ot)));
      cjz $$3 = this.b($$2, $$1);
      double $$4 = $$0.dr() - this.dr();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dt();
      double $$6 = $$0.dx() - this.dx();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dM().ak().a() * 4));
      this.a(aum.wR, 1.0F, 1.0F / (this.ei().i() * 0.4F + 0.8F));
      this.dM().b($$3);
   }

   protected cjz b(crj $$0, float $$1) {
      return ckn.a(this, $$0, $$1);
   }

   @Override
   public boolean a(crz $$0) {
      return $$0 == crm.ot;
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.y();
   }

   @Override
   public void a(bqc $$0, crj $$1) {
      super.a($$0, $$1);
      if (!this.dM().B) {
         this.y();
      }
   }

   public boolean gp() {
      return this.cl();
   }
}
