import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class byj extends bza implements bze {
   private final bqt<byj> b = new bqt<>(this, 1.0, 20, 15.0F);
   private final bqd c = new bqd(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         byj.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         byj.this.v(true);
      }
   };

   protected byj(bim<? extends byj> $$0, cpl $$1) {
      super($$0, $$1);
      this.t();
   }

   @Override
   protected void w() {
      this.bO.a(2, new bqw(this));
      this.bO.a(3, new bpm(this, 1.0));
      this.bO.a(3, new bpa<>(this, bvm.class, 6.0F, 1.0, 1.2));
      this.bO.a(5, new brg(this, 1.0));
      this.bO.a(6, new bqb(this, cbm.class, 8.0F));
      this.bO.a(6, new bqo(this));
      this.bP.a(1, new brl(this));
      this.bP.a(2, new brm<>(this, cbm.class, true));
      this.bP.a(3, new brm<>(this, buv.class, true));
      this.bP.a(3, new brm<>(this, bvk.class, 10, true, false, bvk.bU));
   }

   public static bkd.a p() {
      return bza.gg().a(bke.d, 0.25);
   }

   @Override
   protected void b(gu $$0, dez $$1) {
      this.a(this.q(), 0.15F, 1.0F);
   }

   abstract aov q();

   @Override
   public bjd eQ() {
      return bjd.b;
   }

   @Override
   public void b_() {
      boolean $$0 = this.fU();
      if ($$0) {
         cix $$1 = this.c(bin.f);
         if (!$$1.b()) {
            if ($$1.i()) {
               $$1.b($$1.k() + this.ag.a(2));
               if ($$1.k() >= $$1.l()) {
                  this.d(bin.f);
                  this.a(bin.f, cix.b);
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
      this.a(bin.a, new cix(cja.nG));
   }

   @Nullable
   @Override
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
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
            this.a(bin.f, new cix($$5.i() < 0.1F ? csm.eg : csm.ef));
            this.bR[bin.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void t() {
      if (this.dK() != null && !this.dK().B) {
         this.bO.a(this.c);
         this.bO.a(this.b);
         cix $$0 = this.b(ccf.a(this, cja.nG));
         if ($$0.a(cja.nG)) {
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
      cix $$2 = this.g(this.b(ccf.a(this, cja.nG)));
      cbs $$3 = this.b($$2, $$1);
      double $$4 = $$0.dp() - this.dp();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dr();
      double $$6 = $$0.dv() - this.dv();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dK().ai().a() * 4));
      this.a(aow.vA, 1.0F, 1.0F / (this.ee().i() * 0.4F + 0.8F));
      this.dK().b($$3);
   }

   protected cbs b(cix $$0, float $$1) {
      return ccf.a(this, $$0, $$1);
   }

   @Override
   public boolean a(cjn $$0) {
      return $$0 == cja.nG;
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.t();
   }

   @Override
   public void a(bin $$0, cix $$1) {
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

   public boolean ga() {
      return this.ck();
   }
}
