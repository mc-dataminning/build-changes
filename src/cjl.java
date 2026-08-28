import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cjl extends ckd implements ckh {
   private static final int b = 20;
   private static final int c = 40;
   private final cbn<cjl> d = new cbn<>(this, 1.0, 20, 15.0F);
   private final cax e = new cax(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         cjl.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         cjl.this.v(true);
      }
   };

   protected cjl(bta<? extends cjl> $$0, dby $$1) {
      super($$0, $$1);
      this.y();
   }

   @Override
   protected void z() {
      this.bS.a(2, new cbq(this));
      this.bS.a(3, new cag(this, 1.0));
      this.bS.a(3, new bzu<>(this, cgi.class, 6.0F, 1.0, 1.2));
      this.bS.a(5, new cca(this, 1.0));
      this.bS.a(6, new cav(this, cmx.class, 8.0F));
      this.bS.a(6, new cbi(this));
      this.bT.a(1, new ccf(this));
      this.bT.a(2, new ccg<>(this, cmx.class, true));
      this.bT.a(3, new ccg<>(this, cfr.class, true));
      this.bT.a(3, new ccg<>(this, cgg.class, 10, true, false, cgg.bY));
   }

   public static buw.a s() {
      return ckd.gw().a(bux.r, 0.25);
   }

   @Override
   protected void b(iz $$0, dsc $$1) {
      this.a(this.u(), 0.15F, 1.0F);
   }

   abstract avz u();

   @Override
   public void n_() {
      boolean $$0 = this.gk();
      if ($$0) {
         cup $$1 = this.a(btb.f);
         if (!$$1.e()) {
            if ($$1.l()) {
               $$1.b($$1.n() + this.ah.a(2));
               if ($$1.n() >= $$1.o()) {
                  this.e(btb.f);
                  this.a(btb.f, cup.l);
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
      if (this.dd() instanceof bty $$0) {
         this.aY = $$0.aY;
      }
   }

   @Override
   protected void a(azh $$0, bqs $$1) {
      super.a($$0, $$1);
      this.a(btb.a, new cup(cus.ou));
   }

   @Nullable
   @Override
   public bui a(dcn $$0, bqs $$1, btt $$2, @Nullable bui $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azh $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      this.y();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(btb.f).e()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(btb.f, new cup($$4.i() < 0.1F ? dfb.ef : dfb.ee));
            this.bV[btb.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void y() {
      if (this.dP() != null && !this.dP().B) {
         this.bS.a(this.e);
         this.bS.a(this.d);
         cup $$0 = this.b(cnr.a(this, cus.ou));
         if ($$0.a(cus.ou)) {
            int $$1 = this.gq();
            if (this.dP().al() != bqr.d) {
               $$1 = this.gr();
            }

            this.d.c($$1);
            this.bS.a(4, this.d);
         } else {
            this.bS.a(4, this.e);
         }
      }
   }

   protected int gq() {
      return 20;
   }

   protected int gr() {
      return 40;
   }

   @Override
   public void a(btp $$0, float $$1) {
      cup $$2 = this.g(this.b(cnr.a(this, cus.ou)));
      cnd $$3 = this.b($$2, $$1);
      double $$4 = $$0.du() - this.du();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dw();
      double $$6 = $$0.dA() - this.dA();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dP().al().a() * 4));
      this.a(awa.xk, 1.0F, 1.0F / (this.el().i() * 0.4F + 0.8F));
      this.dP().b($$3);
   }

   protected cnd b(cup $$0, float $$1) {
      return cnr.a(this, $$0, $$1);
   }

   @Override
   public boolean a(cvi $$0) {
      return $$0 == cus.ou;
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.y();
   }

   @Override
   public void a(btb $$0, cup $$1) {
      super.a($$0, $$1);
      if (!this.dP().B) {
         this.y();
      }
   }

   public boolean gs() {
      return this.co();
   }
}
