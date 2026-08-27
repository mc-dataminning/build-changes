import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cbs extends ccj implements ccn {
   private final bub<cbs> b = new bub<>(this, 1.0, 20, 15.0F);
   private final btl c = new btl(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         cbs.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         cbs.this.v(true);
      }
   };

   protected cbs(blt<? extends cbs> $$0, cti $$1) {
      super($$0, $$1);
      this.A();
   }

   @Override
   protected void B() {
      this.bO.a(2, new bue(this));
      this.bO.a(3, new bsu(this, 1.0));
      this.bO.a(3, new bsi<>(this, byv.class, 6.0F, 1.0, 1.2));
      this.bO.a(5, new buo(this, 1.0));
      this.bO.a(6, new btj(this, cfb.class, 8.0F));
      this.bO.a(6, new btw(this));
      this.bP.a(1, new but(this));
      this.bP.a(2, new buu<>(this, cfb.class, true));
      this.bP.a(3, new buu<>(this, bye.class, true));
      this.bP.a(3, new buu<>(this, byt.class, 10, true, false, byt.bU));
   }

   public static bnk.a u() {
      return ccj.gk().a(bnl.m, 0.25);
   }

   @Override
   protected void b(hx $$0, dja $$1) {
      this.a(this.w(), 0.15F, 1.0F);
   }

   abstract arl w();

   @Override
   public bmk eS() {
      return bmk.b;
   }

   @Override
   public void d_() {
      boolean $$0 = this.fY();
      if ($$0) {
         cmr $$1 = this.c(blu.f);
         if (!$$1.b()) {
            if ($$1.i()) {
               $$1.b($$1.k() + this.ag.a(2));
               if ($$1.k() >= $$1.l()) {
                  this.d(blu.f);
                  this.a(blu.f, cmr.f);
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
      if (this.da() instanceof bmo $$0) {
         this.aU = $$0.aU;
      }
   }

   @Override
   protected void a(aup $$0, bjt $$1) {
      super.a($$0, $$1);
      this.a(blu.a, new cmr(cmu.or));
   }

   @Nullable
   @Override
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      aup $$5 = $$0.F_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      this.A();
      this.s($$5.i() < 0.55F * $$1.d());
      if (this.c(blu.f).b()) {
         LocalDate $$6 = LocalDate.now();
         int $$7 = $$6.get(ChronoField.DAY_OF_MONTH);
         int $$8 = $$6.get(ChronoField.MONTH_OF_YEAR);
         if ($$8 == 10 && $$7 == 31 && $$5.i() < 0.25F) {
            this.a(blu.f, new cmr($$5.i() < 0.1F ? cwl.ef : cwl.ee));
            this.bR[blu.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void A() {
      if (this.dM() != null && !this.dM().B) {
         this.bO.a(this.c);
         this.bO.a(this.b);
         cmr $$0 = this.b(cfu.a(this, cmu.or));
         if ($$0.a(cmu.or)) {
            int $$1 = 20;
            if (this.dM().ak() != bjs.d) {
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
   public void a(bmf $$0, float $$1) {
      cmr $$2 = this.g(this.b(cfu.a(this, cmu.or)));
      cfh $$3 = this.b($$2, $$1);
      double $$4 = $$0.dr() - this.dr();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dt();
      double $$6 = $$0.dx() - this.dx();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dM().ak().a() * 4));
      this.a(arm.wq, 1.0F, 1.0F / (this.eg().i() * 0.4F + 0.8F));
      this.dM().b($$3);
   }

   protected cfh b(cmr $$0, float $$1) {
      return cfu.a(this, $$0, $$1);
   }

   @Override
   public boolean a(cnh $$0) {
      return $$0 == cmu.or;
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.A();
   }

   @Override
   public void a(blu $$0, cmr $$1) {
      super.a($$0, $$1);
      if (!this.dM().B) {
         this.A();
      }
   }

   @Override
   protected float b(bmr $$0, blq $$1) {
      return 1.74F;
   }

   @Override
   protected float l(blp $$0) {
      return -0.7F;
   }

   public boolean ge() {
      return this.cl();
   }
}
