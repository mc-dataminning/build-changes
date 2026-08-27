import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class byk extends bzb implements bzf {
   private final bqu<byk> b = new bqu<>(this, 1.0, 20, 15.0F);
   private final bqe c = new bqe(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         byk.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         byk.this.v(true);
      }
   };

   protected byk(bim<? extends byk> $$0, cpm $$1) {
      super($$0, $$1);
      this.t();
   }

   @Override
   protected void w() {
      this.bO.a(2, new bqx(this));
      this.bO.a(3, new bpn(this, 1.0));
      this.bO.a(3, new bpb<>(this, bvn.class, 6.0F, 1.0, 1.2));
      this.bO.a(5, new brh(this, 1.0));
      this.bO.a(6, new bqc(this, cbn.class, 8.0F));
      this.bO.a(6, new bqp(this));
      this.bP.a(1, new brm(this));
      this.bP.a(2, new brn<>(this, cbn.class, true));
      this.bP.a(3, new brn<>(this, buw.class, true));
      this.bP.a(3, new brn<>(this, bvl.class, 10, true, false, bvl.bU));
   }

   public static bke.a p() {
      return bzb.gf().a(bkf.d, 0.25);
   }

   @Override
   protected void b(gu $$0, dfa $$1) {
      this.a(this.q(), 0.15F, 1.0F);
   }

   abstract aov q();

   @Override
   public bjd eQ() {
      return bjd.b;
   }

   @Override
   public void b_() {
      boolean $$0 = this.fT();
      if ($$0) {
         ciy $$1 = this.c(bin.f);
         if (!$$1.b()) {
            if ($$1.i()) {
               $$1.b($$1.k() + this.ag.a(2));
               if ($$1.k() >= $$1.l()) {
                  this.d(bin.f);
                  this.a(bin.f, ciy.b);
               }
            }

            $$0 = false;
         }

         if ($$0) {
            this.g(8);
         }
      }

      super.b_();
   }

   @Override
   public void by() {
      super.by();
      if (this.cZ() instanceof bjh $$0) {
         this.aU = $$0.aU;
      }
   }

   @Override
   protected void a(aru $$0, bgo $$1) {
      super.a($$0, $$1);
      this.a(bin.a, new ciy(cjb.nG));
   }

   @Nullable
   @Override
   public bjs a(cqb $$0, bgo $$1, bjc $$2, @Nullable bjs $$3, @Nullable qr $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      aru $$5 = $$0.y_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      this.t();
      this.s($$5.i() < 0.55F * $$1.d());
      if (this.c(bin.f).b()) {
         LocalDate $$6 = LocalDate.now();
         int $$7 = $$6.get(ChronoField.DAY_OF_MONTH);
         int $$8 = $$6.get(ChronoField.MONTH_OF_YEAR);
         if ($$8 == 10 && $$7 == 31 && $$5.i() < 0.25F) {
            this.a(bin.f, new ciy($$5.i() < 0.1F ? csn.eg : csn.ef));
            this.bR[bin.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void t() {
      if (this.dK() != null && !this.dK().B) {
         this.bO.a(this.c);
         this.bO.a(this.b);
         ciy $$0 = this.b(ccg.a(this, cjb.nG));
         if ($$0.a(cjb.nG)) {
            int $$1 = 20;
            if (this.dK().ai() != bgn.d) {
               $$1 = 40;
            }

            this.b.c($$1);
            this.bO.a(4, this.b);
         } else {
            this.bO.a(4, this.c);
         }
      }
   }

   @Override
   public void a(biy $$0, float $$1) {
      ciy $$2 = this.g(this.b(ccg.a(this, cjb.nG)));
      cbt $$3 = this.b($$2, $$1);
      double $$4 = $$0.dp() - this.dp();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dr();
      double $$6 = $$0.dv() - this.dv();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dK().ai().a() * 4));
      this.a(aow.vA, 1.0F, 1.0F / (this.ee().i() * 0.4F + 0.8F));
      this.dK().b($$3);
   }

   protected cbt b(ciy $$0, float $$1) {
      return ccg.a(this, $$0, $$1);
   }

   @Override
   public boolean a(cjo $$0) {
      return $$0 == cjb.nG;
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.t();
   }

   @Override
   public void a(bin $$0, ciy $$1) {
      super.a($$0, $$1);
      if (!this.dK().B) {
         this.t();
      }
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      return 1.74F;
   }

   @Override
   protected float l(bii $$0) {
      return -0.7F;
   }

   public boolean fZ() {
      return this.ck();
   }
}
