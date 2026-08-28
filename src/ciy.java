import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class ciy extends cjq implements cju {
   private static final int b = 20;
   private static final int c = 40;
   private final caz<ciy> d = new caz<>(this, 1.0, 20, 15.0F);
   private final caj e = new caj(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         ciy.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         ciy.this.v(true);
      }
   };

   protected ciy(bsm<? extends ciy> $$0, dcf $$1) {
      super($$0, $$1);
      this.y();
   }

   @Override
   protected void z() {
      this.bU.a(2, new cbc(this));
      this.bU.a(3, new bzs(this, 1.0));
      this.bU.a(3, new bzg<>(this, cfu.class, 6.0F, 1.0, 1.2));
      this.bU.a(5, new cbm(this, 1.0));
      this.bU.a(6, new cah(this, cmk.class, 8.0F));
      this.bU.a(6, new cau(this));
      this.bV.a(1, new cbr(this));
      this.bV.a(2, new cbs<>(this, cmk.class, true));
      this.bV.a(3, new cbs<>(this, cfd.class, true));
      this.bV.a(3, new cbs<>(this, cfs.class, 10, true, false, cfs.ca));
   }

   public static bui.a s() {
      return cjq.gu().a(buj.v, 0.25);
   }

   @Override
   protected void b(ja $$0, dsk $$1) {
      this.a(this.u(), 0.15F, 1.0F);
   }

   abstract avg u();

   @Override
   public void n_() {
      boolean $$0 = this.gi();
      if ($$0) {
         cuc $$1 = this.a(bsn.f);
         if (!$$1.e()) {
            if ($$1.l()) {
               $$1.b($$1.n() + this.ah.a(2));
               if ($$1.n() >= $$1.o()) {
                  this.e(bsn.f);
                  this.a(bsn.f, cuc.l);
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
      if (this.de() instanceof btk $$0) {
         this.aY = $$0.aY;
      }
   }

   @Override
   protected void a(ayo $$0, bqe $$1) {
      super.a($$0, $$1);
      this.a(bsn.a, new cuc(cuf.ov));
   }

   @Nullable
   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      ayo $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      this.y();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(bsn.f).e()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bsn.f, new cuc($$4.i() < 0.1F ? dfj.ef : dfj.ee));
            this.bX[bsn.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void y() {
      if (this.dQ() != null && !this.dQ().B) {
         this.bU.a(this.e);
         this.bU.a(this.d);
         cuc $$0 = this.b(cne.a(this, cuf.ov));
         if ($$0.a(cuf.ov)) {
            int $$1 = this.go();
            if (this.dQ().al() != bqd.d) {
               $$1 = this.gp();
            }

            this.d.c($$1);
            this.bU.a(4, this.d);
         } else {
            this.bU.a(4, this.e);
         }
      }
   }

   protected int go() {
      return 20;
   }

   protected int gp() {
      return 40;
   }

   @Override
   public void a(btb $$0, float $$1) {
      cuc $$2 = this.b(cne.a(this, cuf.ov));
      cuc $$3 = this.g($$2);
      cmq $$4 = this.a($$3, $$1, $$2);
      double $$5 = $$0.dv() - this.dv();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dx();
      double $$7 = $$0.dB() - this.dB();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      $$4.c($$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - this.dQ().al().a() * 4));
      this.a(avh.xn, 1.0F, 1.0F / (this.dT().i() * 0.4F + 0.8F));
      this.dQ().b($$4);
   }

   protected cmq a(cuc $$0, float $$1, @Nullable cuc $$2) {
      return cne.a(this, $$0, $$1, $$2);
   }

   @Override
   public boolean a(cuv $$0) {
      return $$0 == cuf.ov;
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.y();
   }

   @Override
   public void a(bsn $$0, cuc $$1) {
      super.a($$0, $$1);
      if (!this.dQ().B) {
         this.y();
      }
   }

   public boolean gq() {
      return this.cp();
   }
}
