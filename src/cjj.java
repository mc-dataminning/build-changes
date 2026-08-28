import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cjj extends ckb implements ckf {
   private static final int b = 20;
   private static final int c = 40;
   private final cbk<cjj> d = new cbk<>(this, 1.0, 20, 15.0F);
   private final cau e = new cau(this, 1.2, false) {
      @Override
      public void e() {
         super.e();
         cjj.this.v(false);
      }

      @Override
      public void d() {
         super.d();
         cjj.this.v(true);
      }
   };

   protected cjj(bsw<? extends cjj> $$0, dcu $$1) {
      super($$0, $$1);
      this.x();
   }

   @Override
   protected void z() {
      this.bU.a(2, new cbn(this));
      this.bU.a(3, new cad(this, 1.0));
      this.bU.a(3, new bzr<>(this, cgf.class, 6.0F, 1.0, 1.2));
      this.bU.a(5, new cbx(this, 1.0));
      this.bU.a(6, new cas(this, cmv.class, 8.0F));
      this.bU.a(6, new cbf(this));
      this.bV.a(1, new ccc(this));
      this.bV.a(2, new ccd<>(this, cmv.class, true));
      this.bV.a(3, new ccd<>(this, cfo.class, true));
      this.bV.a(3, new ccd<>(this, cgd.class, 10, true, false, cgd.ca));
   }

   public static but.a s() {
      return ckb.gs().a(buu.v, 0.25);
   }

   @Override
   protected void b(jd $$0, dta $$1) {
      this.a(this.t(), 0.15F, 1.0F);
   }

   abstract avn t();

   @Override
   public void m_() {
      boolean $$0 = this.gg();
      if ($$0) {
         cuo $$1 = this.a(bsx.f);
         if (!$$1.e()) {
            if ($$1.l()) {
               cuj $$2 = $$1.g();
               $$1.b($$1.n() + this.ah.a(2));
               if ($$1.n() >= $$1.o()) {
                  this.a($$2, bsx.f);
                  this.a(bsx.f, cuo.l);
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
      if (this.de() instanceof btu $$0) {
         this.aY = $$0.aY;
      }
   }

   @Override
   protected void a(ayv $$0, bqo $$1) {
      super.a($$0, $$1);
      this.a(bsx.a, new cuo(cur.ov));
   }

   @Nullable
   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      ayv $$4 = $$0.E_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      this.x();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(bsx.f).e()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bsx.f, new cuo($$4.i() < 0.1F ? dfy.ef : dfy.ee));
            this.bX[bsx.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void x() {
      if (this.dQ() != null && !this.dQ().B) {
         this.bU.a(this.e);
         this.bU.a(this.d);
         cuo $$0 = this.b(cnp.a(this, cur.ov));
         if ($$0.a(cur.ov)) {
            int $$1 = this.gm();
            if (this.dQ().al() != bqn.d) {
               $$1 = this.gn();
            }

            this.d.c($$1);
            this.bU.a(4, this.d);
         } else {
            this.bU.a(4, this.e);
         }
      }
   }

   protected int gm() {
      return 20;
   }

   protected int gn() {
      return 40;
   }

   @Override
   public void a(btl $$0, float $$1) {
      cuo $$2 = this.b(cnp.a(this, cur.ov));
      cuo $$3 = this.g($$2);
      cnb $$4 = this.a($$3, $$1, $$2);
      double $$5 = $$0.dv() - this.dv();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dx();
      double $$7 = $$0.dB() - this.dB();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      $$4.c($$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - this.dQ().al().a() * 4));
      this.a(avo.xn, 1.0F, 1.0F / (this.dT().i() * 0.4F + 0.8F));
      this.dQ().b($$4);
   }

   protected cnb a(cuo $$0, float $$1, @Nullable cuo $$2) {
      return cnp.a(this, $$0, $$1, $$2);
   }

   @Override
   public boolean a(cvl $$0) {
      return $$0 == cur.ov;
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.x();
   }

   @Override
   public void a(bsx $$0, cuo $$1) {
      super.a($$0, $$1);
      if (!this.dQ().B) {
         this.x();
      }
   }

   public boolean go() {
      return this.cp();
   }
}
