import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class civ extends cjn implements cjr {
   private static final int b = 20;
   private static final int c = 40;
   private final caw<civ> d = new caw<>(this, 1.0, 20, 15.0F);
   private final cag e = new cag(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         civ.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         civ.this.v(true);
      }
   };

   protected civ(bsj<? extends civ> $$0, dcd $$1) {
      super($$0, $$1);
      this.y();
   }

   @Override
   protected void z() {
      this.bU.a(2, new caz(this));
      this.bU.a(3, new bzp(this, 1.0));
      this.bU.a(3, new bzd<>(this, cfr.class, 6.0F, 1.0, 1.2));
      this.bU.a(5, new cbj(this, 1.0));
      this.bU.a(6, new cae(this, cmh.class, 8.0F));
      this.bU.a(6, new car(this));
      this.bV.a(1, new cbo(this));
      this.bV.a(2, new cbp<>(this, cmh.class, true));
      this.bV.a(3, new cbp<>(this, cfa.class, true));
      this.bV.a(3, new cbp<>(this, cfp.class, 10, true, false, cfp.ca));
   }

   public static buf.a s() {
      return cjn.gt().a(bug.v, 0.25);
   }

   @Override
   protected void b(ja $$0, dsh $$1) {
      this.a(this.u(), 0.15F, 1.0F);
   }

   abstract ave u();

   @Override
   public void n_() {
      boolean $$0 = this.gh();
      if ($$0) {
         cua $$1 = this.a(bsk.f);
         if (!$$1.e()) {
            if ($$1.l()) {
               $$1.b($$1.n() + this.ah.a(2));
               if ($$1.n() >= $$1.o()) {
                  this.e(bsk.f);
                  this.a(bsk.f, cua.l);
               }
            }

            $$0 = false;
         }

         if ($$0) {
            this.d(8.0F);
         }
      }

      super.n_();
   }

   @Override
   public void t() {
      super.t();
      if (this.dd() instanceof bth $$0) {
         this.aY = $$0.aY;
      }
   }

   @Override
   protected void a(aym $$0, bqb $$1) {
      super.a($$0, $$1);
      this.a(bsk.a, new cua(cud.ou));
   }

   @Nullable
   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      aym $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      this.y();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(bsk.f).e()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bsk.f, new cua($$4.i() < 0.1F ? dfh.ef : dfh.ee));
            this.bX[bsk.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void y() {
      if (this.dP() != null && !this.dP().B) {
         this.bU.a(this.e);
         this.bU.a(this.d);
         cua $$0 = this.b(cnb.a(this, cud.ou));
         if ($$0.a(cud.ou)) {
            int $$1 = this.gn();
            if (this.dP().al() != bqa.d) {
               $$1 = this.go();
            }

            this.d.c($$1);
            this.bU.a(4, this.d);
         } else {
            this.bU.a(4, this.e);
         }
      }
   }

   protected int gn() {
      return 20;
   }

   protected int go() {
      return 40;
   }

   @Override
   public void a(bsy $$0, float $$1) {
      cua $$2 = this.b(cnb.a(this, cud.ou));
      cua $$3 = this.g($$2);
      cmn $$4 = this.a($$3, $$1, $$2);
      double $$5 = $$0.du() - this.du();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dw();
      double $$7 = $$0.dA() - this.dA();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      $$4.c($$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - this.dP().al().a() * 4));
      this.a(avf.xn, 1.0F, 1.0F / (this.dS().i() * 0.4F + 0.8F));
      this.dP().b($$4);
   }

   protected cmn a(cua $$0, float $$1, @Nullable cua $$2) {
      return cnb.a(this, $$0, $$1, $$2);
   }

   @Override
   public boolean a(cut $$0) {
      return $$0 == cud.ou;
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.y();
   }

   @Override
   public void a(bsk $$0, cua $$1) {
      super.a($$0, $$1);
      if (!this.dP().B) {
         this.y();
      }
   }

   public boolean gp() {
      return this.co();
   }
}
