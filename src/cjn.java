import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cjn extends ckf implements ckj {
   private static final int b = 20;
   private static final int c = 40;
   private final cbp<cjn> d = new cbp<>(this, 1.0, 20, 15.0F);
   private final caz e = new caz(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         cjn.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         cjn.this.v(true);
      }
   };

   protected cjn(btc<? extends cjn> $$0, dca $$1) {
      super($$0, $$1);
      this.y();
   }

   @Override
   protected void z() {
      this.bS.a(2, new cbs(this));
      this.bS.a(3, new cai(this, 1.0));
      this.bS.a(3, new bzw<>(this, cgk.class, 6.0F, 1.0, 1.2));
      this.bS.a(5, new ccc(this, 1.0));
      this.bS.a(6, new cax(this, cmz.class, 8.0F));
      this.bS.a(6, new cbk(this));
      this.bT.a(1, new cch(this));
      this.bT.a(2, new cci<>(this, cmz.class, true));
      this.bT.a(3, new cci<>(this, cft.class, true));
      this.bT.a(3, new cci<>(this, cgi.class, 10, true, false, cgi.bY));
   }

   public static buy.a s() {
      return ckf.gw().a(buz.r, 0.25);
   }

   @Override
   protected void b(iz $$0, dse $$1) {
      this.a(this.u(), 0.15F, 1.0F);
   }

   abstract avz u();

   @Override
   public void n_() {
      boolean $$0 = this.gk();
      if ($$0) {
         cur $$1 = this.a(btd.f);
         if (!$$1.e()) {
            if ($$1.l()) {
               $$1.b($$1.n() + this.ah.a(2));
               if ($$1.n() >= $$1.o()) {
                  this.e(btd.f);
                  this.a(btd.f, cur.l);
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
      if (this.dd() instanceof bua $$0) {
         this.aY = $$0.aY;
      }
   }

   @Override
   protected void a(azh $$0, bqu $$1) {
      super.a($$0, $$1);
      this.a(btd.a, new cur(cuu.ou));
   }

   @Nullable
   @Override
   public buk a(dcp $$0, bqu $$1, btv $$2, @Nullable buk $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azh $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      this.y();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(btd.f).e()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(btd.f, new cur($$4.i() < 0.1F ? dfd.ef : dfd.ee));
            this.bV[btd.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void y() {
      if (this.dP() != null && !this.dP().B) {
         this.bS.a(this.e);
         this.bS.a(this.d);
         cur $$0 = this.b(cnt.a(this, cuu.ou));
         if ($$0.a(cuu.ou)) {
            int $$1 = this.gq();
            if (this.dP().al() != bqt.d) {
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
   public void a(btr $$0, float $$1) {
      cur $$2 = this.g(this.b(cnt.a(this, cuu.ou)));
      cnf $$3 = this.b($$2, $$1);
      double $$4 = $$0.du() - this.du();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dw();
      double $$6 = $$0.dA() - this.dA();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dP().al().a() * 4));
      this.a(awa.xk, 1.0F, 1.0F / (this.el().i() * 0.4F + 0.8F));
      this.dP().b($$3);
   }

   protected cnf b(cur $$0, float $$1) {
      return cnt.a(this, $$0, $$1);
   }

   @Override
   public boolean a(cvk $$0) {
      return $$0 == cuu.ou;
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.y();
   }

   @Override
   public void a(btd $$0, cur $$1) {
      super.a($$0, $$1);
      if (!this.dP().B) {
         this.y();
      }
   }

   public boolean gs() {
      return this.co();
   }
}
