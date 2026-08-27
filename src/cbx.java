import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cbx extends cco implements ccs {
   private final bug<cbx> b = new bug<>(this, 1.0, 20, 15.0F);
   private final btq c = new btq(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         cbx.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         cbx.this.v(true);
      }
   };

   protected cbx(bly<? extends cbx> $$0, cto $$1) {
      super($$0, $$1);
      this.A();
   }

   @Override
   protected void B() {
      this.bO.a(2, new buj(this));
      this.bO.a(3, new bsz(this, 1.0));
      this.bO.a(3, new bsn<>(this, bza.class, 6.0F, 1.0, 1.2));
      this.bO.a(5, new but(this, 1.0));
      this.bO.a(6, new bto(this, cfh.class, 8.0F));
      this.bO.a(6, new bub(this));
      this.bP.a(1, new buy(this));
      this.bP.a(2, new buz<>(this, cfh.class, true));
      this.bP.a(3, new buz<>(this, byj.class, true));
      this.bP.a(3, new buz<>(this, byy.class, 10, true, false, byy.bU));
   }

   public static bnp.a u() {
      return cco.gk().a(bnq.m, 0.25);
   }

   @Override
   protected void b(hx $$0, djg $$1) {
      this.a(this.w(), 0.15F, 1.0F);
   }

   abstract arq w();

   @Override
   public bmp eS() {
      return bmp.b;
   }

   @Override
   public void d_() {
      boolean $$0 = this.fY();
      if ($$0) {
         cmx $$1 = this.c(blz.f);
         if (!$$1.b()) {
            if ($$1.i()) {
               $$1.b($$1.k() + this.ag.a(2));
               if ($$1.k() >= $$1.l()) {
                  this.d(blz.f);
                  this.a(blz.f, cmx.f);
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
      if (this.da() instanceof bmt $$0) {
         this.aU = $$0.aU;
      }
   }

   @Override
   protected void a(auu $$0, bjy $$1) {
      super.a($$0, $$1);
      this.a(blz.a, new cmx(cna.or));
   }

   @Nullable
   @Override
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      auu $$5 = $$0.F_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      this.A();
      this.s($$5.i() < 0.55F * $$1.d());
      if (this.c(blz.f).b()) {
         LocalDate $$6 = LocalDate.now();
         int $$7 = $$6.get(ChronoField.DAY_OF_MONTH);
         int $$8 = $$6.get(ChronoField.MONTH_OF_YEAR);
         if ($$8 == 10 && $$7 == 31 && $$5.i() < 0.25F) {
            this.a(blz.f, new cmx($$5.i() < 0.1F ? cwr.ef : cwr.ee));
            this.bR[blz.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void A() {
      if (this.dM() != null && !this.dM().B) {
         this.bO.a(this.c);
         this.bO.a(this.b);
         cmx $$0 = this.b(cga.a(this, cna.or));
         if ($$0.a(cna.or)) {
            int $$1 = 20;
            if (this.dM().ak() != bjx.d) {
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
   public void a(bmk $$0, float $$1) {
      cmx $$2 = this.g(this.b(cga.a(this, cna.or)));
      cfn $$3 = this.b($$2, $$1);
      double $$4 = $$0.dr() - this.dr();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dt();
      double $$6 = $$0.dx() - this.dx();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dM().ak().a() * 4));
      this.a(arr.wq, 1.0F, 1.0F / (this.eg().i() * 0.4F + 0.8F));
      this.dM().b($$3);
   }

   protected cfn b(cmx $$0, float $$1) {
      return cga.a(this, $$0, $$1);
   }

   @Override
   public boolean a(cnn $$0) {
      return $$0 == cna.or;
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.A();
   }

   @Override
   public void a(blz $$0, cmx $$1) {
      super.a($$0, $$1);
      if (!this.dM().B) {
         this.A();
      }
   }

   @Override
   protected float b(bmw $$0, blv $$1) {
      return 1.74F;
   }

   @Override
   protected float l(blu $$0) {
      return -0.7F;
   }

   public boolean ge() {
      return this.cl();
   }
}
