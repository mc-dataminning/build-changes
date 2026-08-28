import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cjk extends ckc implements ckg {
   private static final int b = 20;
   private static final int c = 40;
   private final cbm<cjk> d = new cbm<>(this, 1.0, 20, 15.0F);
   private final caw e = new caw(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         cjk.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         cjk.this.v(true);
      }
   };

   protected cjk(bsz<? extends cjk> $$0, dbx $$1) {
      super($$0, $$1);
      this.y();
   }

   @Override
   protected void z() {
      this.bS.a(2, new cbp(this));
      this.bS.a(3, new caf(this, 1.0));
      this.bS.a(3, new bzt<>(this, cgh.class, 6.0F, 1.0, 1.2));
      this.bS.a(5, new cbz(this, 1.0));
      this.bS.a(6, new cau(this, cmw.class, 8.0F));
      this.bS.a(6, new cbh(this));
      this.bT.a(1, new cce(this));
      this.bT.a(2, new ccf<>(this, cmw.class, true));
      this.bT.a(3, new ccf<>(this, cfq.class, true));
      this.bT.a(3, new ccf<>(this, cgf.class, 10, true, false, cgf.bY));
   }

   public static buv.a s() {
      return ckc.gw().a(buw.r, 0.25);
   }

   @Override
   protected void b(iz $$0, dsb $$1) {
      this.a(this.u(), 0.15F, 1.0F);
   }

   abstract avy u();

   @Override
   public void n_() {
      boolean $$0 = this.gk();
      if ($$0) {
         cuo $$1 = this.a(bta.f);
         if (!$$1.e()) {
            if ($$1.l()) {
               $$1.b($$1.n() + this.ah.a(2));
               if ($$1.n() >= $$1.o()) {
                  this.e(bta.f);
                  this.a(bta.f, cuo.l);
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
      if (this.dd() instanceof btx $$0) {
         this.aY = $$0.aY;
      }
   }

   @Override
   protected void a(azg $$0, bqr $$1) {
      super.a($$0, $$1);
      this.a(bta.a, new cuo(cur.ou));
   }

   @Nullable
   @Override
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azg $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      this.y();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(bta.f).e()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bta.f, new cuo($$4.i() < 0.1F ? dfa.ef : dfa.ee));
            this.bV[bta.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void y() {
      if (this.dP() != null && !this.dP().B) {
         this.bS.a(this.e);
         this.bS.a(this.d);
         cuo $$0 = this.b(cnq.a(this, cur.ou));
         if ($$0.a(cur.ou)) {
            int $$1 = this.gq();
            if (this.dP().al() != bqq.d) {
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
   public void a(bto $$0, float $$1) {
      cuo $$2 = this.g(this.b(cnq.a(this, cur.ou)));
      cnc $$3 = this.b($$2, $$1);
      double $$4 = $$0.du() - this.du();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dw();
      double $$6 = $$0.dA() - this.dA();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dP().al().a() * 4));
      this.a(avz.xk, 1.0F, 1.0F / (this.el().i() * 0.4F + 0.8F));
      this.dP().b($$3);
   }

   protected cnc b(cuo $$0, float $$1) {
      return cnq.a(this, $$0, $$1);
   }

   @Override
   public boolean a(cvh $$0) {
      return $$0 == cur.ou;
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.y();
   }

   @Override
   public void a(bta $$0, cuo $$1) {
      super.a($$0, $$1);
      if (!this.dP().B) {
         this.y();
      }
   }

   public boolean gs() {
      return this.co();
   }
}
