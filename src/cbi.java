import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cbi extends cbz implements ccd {
   private final btr<cbi> b = new btr<>(this, 1.0, 20, 15.0F);
   private final btb c = new btb(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         cbi.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         cbi.this.v(true);
      }
   };

   protected cbi(blj<? extends cbi> $$0, csy $$1) {
      super($$0, $$1);
      this.A();
   }

   @Override
   protected void B() {
      this.bO.a(2, new btu(this));
      this.bO.a(3, new bsk(this, 1.0));
      this.bO.a(3, new bry<>(this, byl.class, 6.0F, 1.0, 1.2));
      this.bO.a(5, new bue(this, 1.0));
      this.bO.a(6, new bsz(this, cer.class, 8.0F));
      this.bO.a(6, new btm(this));
      this.bP.a(1, new buj(this));
      this.bP.a(2, new buk<>(this, cer.class, true));
      this.bP.a(3, new buk<>(this, bxu.class, true));
      this.bP.a(3, new buk<>(this, byj.class, 10, true, false, byj.bU));
   }

   public static bna.a u() {
      return cbz.gk().a(bnb.m, 0.25);
   }

   @Override
   protected void b(hv $$0, dip $$1) {
      this.a(this.w(), 0.15F, 1.0F);
   }

   abstract arb w();

   @Override
   public bma eS() {
      return bma.b;
   }

   @Override
   public void d_() {
      boolean $$0 = this.fY();
      if ($$0) {
         cmh $$1 = this.c(blk.f);
         if (!$$1.b()) {
            if ($$1.i()) {
               $$1.b($$1.k() + this.ag.a(2));
               if ($$1.k() >= $$1.l()) {
                  this.d(blk.f);
                  this.a(blk.f, cmh.f);
               }
            }

            $$0 = false;
         }

         if ($$0) {
            this.g(8);
         }
      }

      super.d_();
   }

   @Override
   public void t() {
      super.t();
      if (this.da() instanceof bme $$0) {
         this.aU = $$0.aU;
      }
   }

   @Override
   protected void a(auf $$0, bjj $$1) {
      super.a($$0, $$1);
      this.a(blk.a, new cmh(cmk.or));
   }

   @Nullable
   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      auf $$5 = $$0.F_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      this.A();
      this.s($$5.i() < 0.55F * $$1.d());
      if (this.c(blk.f).b()) {
         LocalDate $$6 = LocalDate.now();
         int $$7 = $$6.get(ChronoField.DAY_OF_MONTH);
         int $$8 = $$6.get(ChronoField.MONTH_OF_YEAR);
         if ($$8 == 10 && $$7 == 31 && $$5.i() < 0.25F) {
            this.a(blk.f, new cmh($$5.i() < 0.1F ? cwb.ef : cwb.ee));
            this.bR[blk.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void A() {
      if (this.dM() != null && !this.dM().B) {
         this.bO.a(this.c);
         this.bO.a(this.b);
         cmh $$0 = this.b(cfk.a(this, cmk.or));
         if ($$0.a(cmk.or)) {
            int $$1 = 20;
            if (this.dM().aj() != bji.d) {
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
   public void a(blv $$0, float $$1) {
      cmh $$2 = this.g(this.b(cfk.a(this, cmk.or)));
      cex $$3 = this.b($$2, $$1);
      double $$4 = $$0.dr() - this.dr();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dt();
      double $$6 = $$0.dx() - this.dx();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dM().aj().a() * 4));
      this.a(arc.wq, 1.0F, 1.0F / (this.eg().i() * 0.4F + 0.8F));
      this.dM().b($$3);
   }

   protected cex b(cmh $$0, float $$1) {
      return cfk.a(this, $$0, $$1);
   }

   @Override
   public boolean a(cmx $$0) {
      return $$0 == cmk.or;
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.A();
   }

   @Override
   public void a(blk $$0, cmh $$1) {
      super.a($$0, $$1);
      if (!this.dM().B) {
         this.A();
      }
   }

   @Override
   protected float b(bmh $$0, blg $$1) {
      return 1.74F;
   }

   @Override
   protected float l(blf $$0) {
      return -0.7F;
   }

   public boolean ge() {
      return this.cl();
   }
}
