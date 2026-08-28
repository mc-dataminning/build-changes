import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class clg extends cly implements cmc {
   private static final int a = 20;
   private static final int b = 40;
   private final cdf<clg> c = new cdf<>(this, 1.0, 20, 15.0F);
   private final ccp d = new ccp(this, 1.2, false) {
      @Override
      public void e() {
         super.e();
         clg.this.w(false);
      }

      @Override
      public void d() {
         super.d();
         clg.this.w(true);
      }
   };

   protected clg(bus<? extends clg> $$0, dfm $$1) {
      super($$0, $$1);
      this.v();
   }

   @Override
   protected void B() {
      this.bS.a(2, new cdi(this));
      this.bS.a(3, new cby(this, 1.0));
      this.bS.a(3, new cbm<>(this, cib.class, 6.0F, 1.0, 1.2));
      this.bS.a(5, new cds(this, 1.0));
      this.bS.a(6, new ccn(this, cou.class, 8.0F));
      this.bS.a(6, new cda(this));
      this.bT.a(1, new cdx(this));
      this.bT.a(2, new cdy<>(this, cou.class, true));
      this.bT.a(3, new cdy<>(this, chk.class, true));
      this.bT.a(3, new cdy<>(this, chz.class, 10, true, false, chz.bY));
   }

   public static bwo.a n() {
      return cly.gs().a(bwp.v, 0.25);
   }

   @Override
   protected void b(jh $$0, dvv $$1) {
      this.a(this.q(), 0.15F, 1.0F);
   }

   abstract awm q();

   @Override
   public void d_() {
      boolean $$0 = this.ge();
      if ($$0) {
         cwm $$1 = this.a(but.f);
         if (!$$1.f()) {
            if ($$1.m()) {
               cwi $$2 = $$1.h();
               $$1.b($$1.o() + this.ae.a(2));
               if ($$1.o() >= $$1.p()) {
                  this.a($$2, but.f);
                  this.a(but.f, cwm.k);
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
      if (this.dl() instanceof bvp $$0) {
         this.aW = $$0.aW;
      }
   }

   @Override
   protected void a(azu $$0, bsi $$1) {
      super.a($$0, $$1);
      this.a(but.a, new cwm(cwq.ow));
   }

   @Nullable
   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azu $$4 = $$0.G_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      this.v();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(but.f).f()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(but.f, new cwm($$4.i() < 0.1F ? dis.ef : dis.ee));
            this.bV[but.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void v() {
      if (this.dV() != null && !this.dV().C) {
         this.bS.a(this.d);
         this.bS.a(this.c);
         cwm $$0 = this.b(cpp.a(this, cwq.ow));
         if ($$0.a(cwq.ow)) {
            int $$1 = this.gm();
            if (this.dV().ak() != bsh.d) {
               $$1 = this.gn();
            }

            this.c.c($$1);
            this.bS.a(4, this.c);
         } else {
            this.bS.a(4, this.d);
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
   public void a(bvh $$0, float $$1) {
      cwm $$2 = this.b(cpp.a(this, cwq.ow));
      cwm $$3 = this.d($$2);
      cpb $$4 = this.a($$3, $$1, $$2);
      double $$5 = $$0.dA() - this.dA();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dC();
      double $$7 = $$0.dG() - this.dG();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dV() instanceof arp $$9) {
         cpn.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.ak().a() * 4));
      }

      this.a(awn.xm, 1.0F, 1.0F / (this.dY().i() * 0.4F + 0.8F));
   }

   protected cpb a(cwm $$0, float $$1, @Nullable cwm $$2) {
      return cpp.a(this, $$0, $$1, $$2);
   }

   @Override
   public boolean a(cxi $$0) {
      return $$0 == cwq.ow;
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.v();
   }

   @Override
   public void a(but $$0, cwm $$1) {
      super.a($$0, $$1);
      if (!this.dV().C) {
         this.v();
      }
   }

   public boolean go() {
      return this.cw();
   }
}
