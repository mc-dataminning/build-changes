import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cjl extends ckd implements ckh {
   private static final int b = 20;
   private static final int c = 40;
   private final cbm<cjl> d = new cbm<>(this, 1.0, 20, 15.0F);
   private final caw e = new caw(this, 1.2, false) {
      @Override
      public void e() {
         super.e();
         cjl.this.w(false);
      }

      @Override
      public void d() {
         super.d();
         cjl.this.w(true);
      }
   };

   protected cjl(bsx<? extends cjl> $$0, dcw $$1) {
      super($$0, $$1);
      this.x();
   }

   @Override
   protected void B() {
      this.bW.a(2, new cbp(this));
      this.bW.a(3, new caf(this, 1.0));
      this.bW.a(3, new bzt<>(this, cgh.class, 6.0F, 1.0, 1.2));
      this.bW.a(5, new cbz(this, 1.0));
      this.bW.a(6, new cau(this, cmx.class, 8.0F));
      this.bW.a(6, new cbh(this));
      this.bX.a(1, new cce(this));
      this.bX.a(2, new ccf<>(this, cmx.class, true));
      this.bX.a(3, new ccf<>(this, cfq.class, true));
      this.bX.a(3, new ccf<>(this, cgf.class, 10, true, false, cgf.cc));
   }

   public static buv.a s() {
      return ckd.gq().a(buw.v, 0.25);
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
      this.a(this.t(), 0.15F, 1.0F);
   }

   abstract avo t();

   @Override
   public void m_() {
      boolean $$0 = this.ge();
      if ($$0) {
         cuq $$1 = this.a(bsy.f);
         if (!$$1.e()) {
            if ($$1.l()) {
               cul $$2 = $$1.g();
               $$1.b($$1.n() + this.ah.a(2));
               if ($$1.n() >= $$1.o()) {
                  this.a($$2, bsy.f);
                  this.a(bsy.f, cuq.l);
               }
            }

            $$0 = false;
         }

         if ($$0) {
            this.d(8.0F);
         }
      }

      super.m_();
   }

   @Override
   public void u() {
      super.u();
      if (this.dd() instanceof btw $$0) {
         this.aY = $$0.aY;
      }
   }

   @Override
   protected void a(ayw $$0, bqp $$1) {
      super.a($$0, $$1);
      this.a(bsy.a, new cuq(cut.ov));
   }

   @Nullable
   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      ayw $$4 = $$0.E_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      this.x();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(bsy.f).e()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bsy.f, new cuq($$4.i() < 0.1F ? dga.ef : dga.ee));
            this.bZ[bsy.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void x() {
      if (this.dO() != null && !this.dO().B) {
         this.bW.a(this.e);
         this.bW.a(this.d);
         cuq $$0 = this.b(cnr.a(this, cut.ov));
         if ($$0.a(cut.ov)) {
            int $$1 = this.gk();
            if (this.dO().al() != bqo.d) {
               $$1 = this.gl();
            }

            this.d.c($$1);
            this.bW.a(4, this.d);
         } else {
            this.bW.a(4, this.e);
         }
      }
   }

   protected int gk() {
      return 20;
   }

   protected int gl() {
      return 40;
   }

   @Override
   public void a(btn $$0, float $$1) {
      cuq $$2 = this.b(cnr.a(this, cut.ov));
      cuq $$3 = this.g($$2);
      cnd $$4 = this.a($$3, $$1, $$2);
      double $$5 = $$0.dt() - this.dt();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dv();
      double $$7 = $$0.dz() - this.dz();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      $$4.c($$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - this.dO().al().a() * 4));
      this.a(avp.xn, 1.0F, 1.0F / (this.dR().i() * 0.4F + 0.8F));
      this.dO().b($$4);
   }

   protected cnd a(cuq $$0, float $$1, @Nullable cuq $$2) {
      return cnr.a(this, $$0, $$1, $$2);
   }

   @Override
   public boolean a(cvn $$0) {
      return $$0 == cut.ov;
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.x();
   }

   @Override
   public void a(bsy $$0, cuq $$1) {
      super.a($$0, $$1);
      if (!this.dO().B) {
         this.x();
      }
   }

   public boolean gm() {
      return this.cp();
   }
}
