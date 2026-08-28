import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cnb extends cnt implements cnx {
   private static final int a = 20;
   private static final int b = 40;
   private final cev<cnb> c = new cev<>(this, 1.0, 20, 15.0F);
   private final cef d = new cef(this, 1.2, false) {
      @Override
      public void e() {
         super.e();
         cnb.this.v(false);
      }

      @Override
      public void d() {
         super.d();
         cnb.this.v(true);
      }
   };

   protected cnb(bwj<? extends cnb> $$0, dip $$1) {
      super($$0, $$1);
      this.n();
   }

   @Override
   protected void D() {
      this.bC.a(2, new cey(this));
      this.bC.a(3, new cdo(this, 1.0));
      this.bC.a(3, new cdc<>(this, cju.class, 6.0F, 1.0, 1.2));
      this.bC.a(5, new cfi(this, 1.0));
      this.bC.a(6, new ced(this, cqs.class, 8.0F));
      this.bC.a(6, new ceq(this));
      this.bD.a(1, new cfn(this));
      this.bD.a(2, new cfo<>(this, cqs.class, true));
      this.bD.a(3, new cfo<>(this, cja.class, true));
      this.bD.a(3, new cfo<>(this, cjs.class, 10, true, false, cjs.bF));
   }

   public static bye.a j() {
      return cnt.gt().a(byf.v, 0.25);
   }

   @Override
   protected void b(iu $$0, dzo $$1) {
      this.a(this.m(), 0.15F, 1.0F);
   }

   abstract awk m();

   @Override
   public void k_() {
      boolean $$0 = this.gk();
      if ($$0) {
         cys $$1 = this.a(bwk.f);
         if (!$$1.f()) {
            if ($$1.m()) {
               cyo $$2 = $$1.h();
               $$1.b($$1.o() + this.ae.a(2));
               if ($$1.o() >= $$1.p()) {
                  this.a($$2, bwk.f);
                  this.a(bwk.f, cys.k);
               }
            }

            $$0 = false;
         }

         if ($$0) {
            this.e(8.0F);
         }
      }

      super.k_();
   }

   @Override
   public void r() {
      super.r();
      if (this.dl() instanceof bxh $$0) {
         this.aV = $$0.aV;
      }
   }

   @Override
   protected void a(azt $$0, btw $$1) {
      super.a($$0, $$1);
      this.a(bwk.a, new cys(cyw.pe));
   }

   @Nullable
   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azt $$4 = $$0.C_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      this.n();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(bwk.f).f()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bwk.f, new cys($$4.i() < 0.1F ? dlw.es : dlw.er));
            this.a(bwk.f, 0.0F);
         }
      }

      return $$3;
   }

   public void n() {
      if (this.dV() != null && !this.dV().C) {
         this.bC.a(this.d);
         this.bC.a(this.c);
         cys $$0 = this.b(cro.a(this, cyw.pe));
         if ($$0.a(cyw.pe)) {
            int $$1 = this.q();
            if (this.dV().an() != btv.d) {
               $$1 = this.t();
            }

            this.c.c($$1);
            this.bC.a(4, this.c);
         } else {
            this.bC.a(4, this.d);
         }
      }
   }

   protected int q() {
      return 20;
   }

   protected int t() {
      return 40;
   }

   @Override
   public void a(bwz $$0, float $$1) {
      cys $$2 = this.b(cro.a(this, cyw.pe));
      cys $$3 = this.e($$2);
      cqz $$4 = this.a($$3, $$1, $$2);
      double $$5 = $$0.dA() - this.dA();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dC();
      double $$7 = $$0.dG() - this.dG();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dV() instanceof aro $$9) {
         crm.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.an().a() * 4));
      }

      this.a(awl.xX, 1.0F, 1.0F / (this.dY().i() * 0.4F + 0.8F));
   }

   protected cqz a(cys $$0, float $$1, @Nullable cys $$2) {
      return cro.a(this, $$0, $$1, $$2);
   }

   @Override
   public boolean a(czn $$0) {
      return $$0 == cyw.pe;
   }

   @Override
   public axp<cyo> Y() {
      return axi.bS;
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.n();
   }

   @Override
   public void a(bwk $$0, cys $$1) {
      super.a($$0, $$1);
      if (!this.dV().C) {
         this.n();
      }
   }

   public boolean x() {
      return this.cw();
   }
}
