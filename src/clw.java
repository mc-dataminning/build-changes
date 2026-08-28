import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class clw extends cmo implements cms {
   private static final int a = 20;
   private static final int b = 40;
   private final cdv<clw> c = new cdv<>(this, 1.0, 20, 15.0F);
   private final cdf d = new cdf(this, 1.2, false) {
      @Override
      public void e() {
         super.e();
         clw.this.w(false);
      }

      @Override
      public void d() {
         super.d();
         clw.this.w(true);
      }
   };

   protected clw(bvi<? extends clw> $$0, dgz $$1) {
      super($$0, $$1);
      this.t();
   }

   @Override
   protected void B() {
      this.bT.a(2, new cdy(this));
      this.bT.a(3, new cco(this, 1.0));
      this.bT.a(3, new ccc<>(this, cir.class, 6.0F, 1.0, 1.2));
      this.bT.a(5, new cei(this, 1.0));
      this.bT.a(6, new cdd(this, cpo.class, 8.0F));
      this.bT.a(6, new cdq(this));
      this.bU.a(1, new cen(this));
      this.bU.a(2, new ceo<>(this, cpo.class, true));
      this.bU.a(3, new ceo<>(this, cia.class, true));
      this.bU.a(3, new ceo<>(this, cip.class, 10, true, false, cip.bZ));
   }

   public static bxe.a m() {
      return cmo.gt().a(bxf.v, 0.25);
   }

   @Override
   protected void b(jh $$0, dxo $$1) {
      this.a(this.p(), 0.15F, 1.0F);
   }

   abstract awu p();

   @Override
   public void d_() {
      boolean $$0 = this.gg();
      if ($$0) {
         cxg $$1 = this.a(bvj.f);
         if (!$$1.f()) {
            if ($$1.m()) {
               cxc $$2 = $$1.h();
               $$1.b($$1.o() + this.ae.a(2));
               if ($$1.o() >= $$1.p()) {
                  this.a($$2, bvj.f);
                  this.a(bvj.f, cxg.j);
               }
            }

            $$0 = false;
         }

         if ($$0) {
            this.d(8.0F);
         }
      }

      super.d_();
   }

   @Override
   public void r() {
      super.r();
      if (this.dm() instanceof bwf $$0) {
         this.aX = $$0.aX;
      }
   }

   @Override
   protected void a(bac $$0, bsy $$1) {
      super.a($$0, $$1);
      this.a(bvj.a, new cxg(cxk.pa));
   }

   @Nullable
   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      bac $$4 = $$0.H_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      this.t();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(bvj.f).f()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bvj.f, new cxg($$4.i() < 0.1F ? dkf.es : dkf.er));
            this.bW[bvj.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void t() {
      if (this.dW() != null && !this.dW().C) {
         this.bT.a(this.d);
         this.bT.a(this.c);
         cxg $$0 = this.b(cqj.a(this, cxk.pa));
         if ($$0.a(cxk.pa)) {
            int $$1 = this.x();
            if (this.dW().am() != bsx.d) {
               $$1 = this.go();
            }

            this.c.c($$1);
            this.bT.a(4, this.c);
         } else {
            this.bT.a(4, this.d);
         }
      }
   }

   protected int x() {
      return 20;
   }

   protected int go() {
      return 40;
   }

   @Override
   public void a(bvx $$0, float $$1) {
      cxg $$2 = this.b(cqj.a(this, cxk.pa));
      cxg $$3 = this.d($$2);
      cpv $$4 = this.a($$3, $$1, $$2);
      double $$5 = $$0.dB() - this.dB();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dD();
      double $$7 = $$0.dH() - this.dH();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dW() instanceof arx $$9) {
         cqh.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.am().a() * 4));
      }

      this.a(awv.xN, 1.0F, 1.0F / (this.dZ().i() * 0.4F + 0.8F));
   }

   protected cpv a(cxg $$0, float $$1, @Nullable cxg $$2) {
      return cqj.a(this, $$0, $$1, $$2);
   }

   @Override
   public boolean a(cyc $$0) {
      return $$0 == cxk.pa;
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.t();
   }

   @Override
   public void a(bvj $$0, cxg $$1) {
      super.a($$0, $$1);
      if (!this.dW().C) {
         this.t();
      }
   }

   public boolean gp() {
      return this.cw();
   }
}
