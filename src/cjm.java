import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cjm extends cke implements cki {
   private static final int b = 20;
   private static final int c = 40;
   private final cbo<cjm> d = new cbo<>(this, 1.0, 20, 15.0F);
   private final cay e = new cay(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         cjm.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         cjm.this.v(true);
      }
   };

   protected cjm(btb<? extends cjm> $$0, dbz $$1) {
      super($$0, $$1);
      this.y();
   }

   @Override
   protected void z() {
      this.bS.a(2, new cbr(this));
      this.bS.a(3, new cah(this, 1.0));
      this.bS.a(3, new bzv<>(this, cgj.class, 6.0F, 1.0, 1.2));
      this.bS.a(5, new ccb(this, 1.0));
      this.bS.a(6, new caw(this, cmy.class, 8.0F));
      this.bS.a(6, new cbj(this));
      this.bT.a(1, new ccg(this));
      this.bT.a(2, new cch<>(this, cmy.class, true));
      this.bT.a(3, new cch<>(this, cfs.class, true));
      this.bT.a(3, new cch<>(this, cgh.class, 10, true, false, cgh.bY));
   }

   public static bux.a s() {
      return cke.gw().a(buy.r, 0.25);
   }

   @Override
   protected void b(iz $$0, dsd $$1) {
      this.a(this.u(), 0.15F, 1.0F);
   }

   abstract avz u();

   @Override
   public void n_() {
      boolean $$0 = this.gk();
      if ($$0) {
         cuq $$1 = this.a(btc.f);
         if (!$$1.e()) {
            if ($$1.l()) {
               $$1.b($$1.n() + this.ah.a(2));
               if ($$1.n() >= $$1.o()) {
                  this.e(btc.f);
                  this.a(btc.f, cuq.l);
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
      if (this.dd() instanceof btz $$0) {
         this.aY = $$0.aY;
      }
   }

   @Override
   protected void a(azh $$0, bqt $$1) {
      super.a($$0, $$1);
      this.a(btc.a, new cuq(cut.ou));
   }

   @Nullable
   @Override
   public buj a(dco $$0, bqt $$1, btu $$2, @Nullable buj $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azh $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      this.y();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(btc.f).e()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(btc.f, new cuq($$4.i() < 0.1F ? dfc.ef : dfc.ee));
            this.bV[btc.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void y() {
      if (this.dP() != null && !this.dP().B) {
         this.bS.a(this.e);
         this.bS.a(this.d);
         cuq $$0 = this.b(cns.a(this, cut.ou));
         if ($$0.a(cut.ou)) {
            int $$1 = this.gq();
            if (this.dP().al() != bqs.d) {
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
   public void a(btq $$0, float $$1) {
      cuq $$2 = this.g(this.b(cns.a(this, cut.ou)));
      cne $$3 = this.b($$2, $$1);
      double $$4 = $$0.du() - this.du();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dw();
      double $$6 = $$0.dA() - this.dA();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dP().al().a() * 4));
      this.a(awa.xk, 1.0F, 1.0F / (this.el().i() * 0.4F + 0.8F));
      this.dP().b($$3);
   }

   protected cne b(cuq $$0, float $$1) {
      return cns.a(this, $$0, $$1);
   }

   @Override
   public boolean a(cvj $$0) {
      return $$0 == cut.ou;
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.y();
   }

   @Override
   public void a(btc $$0, cuq $$1) {
      super.a($$0, $$1);
      if (!this.dP().B) {
         this.y();
      }
   }

   public boolean gs() {
      return this.co();
   }
}
