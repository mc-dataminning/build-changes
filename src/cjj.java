import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cjj extends ckb implements ckf {
   private static final int b = 20;
   private static final int c = 40;
   private final cbl<cjj> d = new cbl<>(this, 1.0, 20, 15.0F);
   private final cav e = new cav(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         cjj.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         cjj.this.v(true);
      }
   };

   protected cjj(bsy<? extends cjj> $$0, dbw $$1) {
      super($$0, $$1);
      this.y();
   }

   @Override
   protected void z() {
      this.bS.a(2, new cbo(this));
      this.bS.a(3, new cae(this, 1.0));
      this.bS.a(3, new bzs<>(this, cgg.class, 6.0F, 1.0, 1.2));
      this.bS.a(5, new cby(this, 1.0));
      this.bS.a(6, new cat(this, cmv.class, 8.0F));
      this.bS.a(6, new cbg(this));
      this.bT.a(1, new ccd(this));
      this.bT.a(2, new cce<>(this, cmv.class, true));
      this.bT.a(3, new cce<>(this, cfp.class, true));
      this.bT.a(3, new cce<>(this, cge.class, 10, true, false, cge.bY));
   }

   public static buu.a s() {
      return ckb.gw().a(buv.r, 0.25);
   }

   @Override
   protected void b(iz $$0, dsa $$1) {
      this.a(this.u(), 0.15F, 1.0F);
   }

   abstract avy u();

   @Override
   public void n_() {
      boolean $$0 = this.gk();
      if ($$0) {
         cun $$1 = this.a(bsz.f);
         if (!$$1.e()) {
            if ($$1.l()) {
               $$1.b($$1.n() + this.ah.a(2));
               if ($$1.n() >= $$1.o()) {
                  this.e(bsz.f);
                  this.a(bsz.f, cun.l);
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
      if (this.dd() instanceof btw $$0) {
         this.aY = $$0.aY;
      }
   }

   @Override
   protected void a(azf $$0, bqq $$1) {
      super.a($$0, $$1);
      this.a(bsz.a, new cun(cuq.ou));
   }

   @Nullable
   @Override
   public bug a(dcl $$0, bqq $$1, btr $$2, @Nullable bug $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azf $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      this.y();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(bsz.f).e()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bsz.f, new cun($$4.i() < 0.1F ? dez.ef : dez.ee));
            this.bV[bsz.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void y() {
      if (this.dP() != null && !this.dP().B) {
         this.bS.a(this.e);
         this.bS.a(this.d);
         cun $$0 = this.b(cnp.a(this, cuq.ou));
         if ($$0.a(cuq.ou)) {
            int $$1 = this.gq();
            if (this.dP().al() != bqp.d) {
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
   public void a(btn $$0, float $$1) {
      cun $$2 = this.g(this.b(cnp.a(this, cuq.ou)));
      cnb $$3 = this.b($$2, $$1);
      double $$4 = $$0.du() - this.du();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dw();
      double $$6 = $$0.dA() - this.dA();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dP().al().a() * 4));
      this.a(avz.xk, 1.0F, 1.0F / (this.el().i() * 0.4F + 0.8F));
      this.dP().b($$3);
   }

   protected cnb b(cun $$0, float $$1) {
      return cnp.a(this, $$0, $$1);
   }

   @Override
   public boolean a(cvg $$0) {
      return $$0 == cuq.ou;
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.y();
   }

   @Override
   public void a(bsz $$0, cun $$1) {
      super.a($$0, $$1);
      if (!this.dP().B) {
         this.y();
      }
   }

   public boolean gs() {
      return this.co();
   }
}
