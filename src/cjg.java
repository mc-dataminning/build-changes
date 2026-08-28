import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cjg extends cjy implements ckc {
   private static final int b = 20;
   private static final int c = 40;
   private final cbi<cjg> d = new cbi<>(this, 1.0, 20, 15.0F);
   private final cas e = new cas(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         cjg.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         cjg.this.v(true);
      }
   };

   protected cjg(bsv<? extends cjg> $$0, dbt $$1) {
      super($$0, $$1);
      this.y();
   }

   @Override
   protected void z() {
      this.bS.a(2, new cbl(this));
      this.bS.a(3, new cab(this, 1.0));
      this.bS.a(3, new bzp<>(this, cgd.class, 6.0F, 1.0, 1.2));
      this.bS.a(5, new cbv(this, 1.0));
      this.bS.a(6, new caq(this, cms.class, 8.0F));
      this.bS.a(6, new cbd(this));
      this.bT.a(1, new cca(this));
      this.bT.a(2, new ccb<>(this, cms.class, true));
      this.bT.a(3, new ccb<>(this, cfm.class, true));
      this.bT.a(3, new ccb<>(this, cgb.class, 10, true, false, cgb.bY));
   }

   public static bur.a s() {
      return cjy.gw().a(bus.r, 0.25);
   }

   @Override
   protected void b(iz $$0, drx $$1) {
      this.a(this.u(), 0.15F, 1.0F);
   }

   abstract avv u();

   @Override
   public void n_() {
      boolean $$0 = this.gk();
      if ($$0) {
         cuk $$1 = this.a(bsw.f);
         if (!$$1.e()) {
            if ($$1.l()) {
               $$1.b($$1.n() + this.ah.a(2));
               if ($$1.n() >= $$1.o()) {
                  this.e(bsw.f);
                  this.a(bsw.f, cuk.l);
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
      if (this.dd() instanceof btt $$0) {
         this.aY = $$0.aY;
      }
   }

   @Override
   protected void a(azc $$0, bqn $$1) {
      super.a($$0, $$1);
      this.a(bsw.a, new cuk(cun.ou));
   }

   @Nullable
   @Override
   public bud a(dci $$0, bqn $$1, bto $$2, @Nullable bud $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azc $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      this.y();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(bsw.f).e()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bsw.f, new cuk($$4.i() < 0.1F ? dew.ef : dew.ee));
            this.bV[bsw.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void y() {
      if (this.dP() != null && !this.dP().B) {
         this.bS.a(this.e);
         this.bS.a(this.d);
         cuk $$0 = this.b(cnm.a(this, cun.ou));
         if ($$0.a(cun.ou)) {
            int $$1 = this.gq();
            if (this.dP().al() != bqm.d) {
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
   public void a(btk $$0, float $$1) {
      cuk $$2 = this.g(this.b(cnm.a(this, cun.ou)));
      cmy $$3 = this.b($$2, $$1);
      double $$4 = $$0.du() - this.du();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dw();
      double $$6 = $$0.dA() - this.dA();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dP().al().a() * 4));
      this.a(avw.xk, 1.0F, 1.0F / (this.el().i() * 0.4F + 0.8F));
      this.dP().b($$3);
   }

   protected cmy b(cuk $$0, float $$1) {
      return cnm.a(this, $$0, $$1);
   }

   @Override
   public boolean a(cvd $$0) {
      return $$0 == cun.ou;
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.y();
   }

   @Override
   public void a(bsw $$0, cuk $$1) {
      super.a($$0, $$1);
      if (!this.dP().B) {
         this.y();
      }
   }

   public boolean gs() {
      return this.co();
   }
}
