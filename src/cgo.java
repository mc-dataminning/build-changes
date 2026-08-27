import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cgo extends chg implements chk {
   private static final int b = 20;
   private static final int c = 40;
   private final byq<cgo> d = new byq<>(this, 1.0, 20, 15.0F);
   private final bya e = new bya(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         cgo.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         cgo.this.v(true);
      }
   };

   protected cgo(bqg<? extends cgo> $$0, czg $$1) {
      super($$0, $$1);
      this.y();
   }

   @Override
   protected void z() {
      this.bR.a(2, new byt(this));
      this.bR.a(3, new bxj(this, 1.0));
      this.bR.a(3, new bwx<>(this, cdl.class, 6.0F, 1.0, 1.2));
      this.bR.a(5, new bzd(this, 1.0));
      this.bR.a(6, new bxy(this, cka.class, 8.0F));
      this.bR.a(6, new byl(this));
      this.bS.a(1, new bzi(this));
      this.bS.a(2, new bzj<>(this, cka.class, true));
      this.bS.a(3, new bzj<>(this, ccu.class, true));
      this.bS.a(3, new bzj<>(this, cdj.class, 10, true, false, cdj.bY));
   }

   public static brz.a r() {
      return chg.gt().a(bsa.r, 0.25);
   }

   @Override
   protected void b(id $$0, dpi $$1) {
      this.a(this.u(), 0.15F, 1.0F);
   }

   abstract aun u();

   @Override
   public void n_() {
      boolean $$0 = this.gh();
      if ($$0) {
         crs $$1 = this.d(bqh.f);
         if (!$$1.d()) {
            if ($$1.k()) {
               $$1.b($$1.m() + this.ag.a(2));
               if ($$1.m() >= $$1.n()) {
                  this.e(bqh.f);
                  this.a(bqh.f, crs.i);
               }
            }

            $$0 = false;
         }

         if ($$0) {
            this.g(8);
         }
      }

      super.n_();
   }

   @Override
   public void t() {
      super.t();
      if (this.da() instanceof brb $$0) {
         this.aX = $$0.aX;
      }
   }

   @Override
   protected void a(axt $$0, bod $$1) {
      super.a($$0, $$1);
      this.a(bqh.a, new crs(crv.ot));
   }

   @Nullable
   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      axt $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      this.y();
      this.s($$4.i() < 0.55F * $$1.d());
      if (this.d(bqh.f).d()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bqh.f, new crs($$4.i() < 0.1F ? dcj.ef : dcj.ee));
            this.bU[bqh.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void y() {
      if (this.dM() != null && !this.dM().B) {
         this.bR.a(this.e);
         this.bR.a(this.d);
         crs $$0 = this.b(cku.a(this, crv.ot));
         if ($$0.a(crv.ot)) {
            int $$1 = this.gn();
            if (this.dM().ak() != boc.d) {
               $$1 = this.go();
            }

            this.d.c($$1);
            this.bR.a(4, this.d);
         } else {
            this.bR.a(4, this.e);
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
   public void a(bqt $$0, float $$1) {
      crs $$2 = this.g(this.b(cku.a(this, crv.ot)));
      ckg $$3 = this.b($$2, $$1);
      double $$4 = $$0.dr() - this.dr();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dt();
      double $$6 = $$0.dx() - this.dx();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dM().ak().a() * 4));
      this.a(auo.wR, 1.0F, 1.0F / (this.ei().i() * 0.4F + 0.8F));
      this.dM().b($$3);
   }

   protected ckg b(crs $$0, float $$1) {
      return cku.a(this, $$0, $$1);
   }

   @Override
   public boolean a(csi $$0) {
      return $$0 == crv.ot;
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.y();
   }

   @Override
   public void a(bqh $$0, crs $$1) {
      super.a($$0, $$1);
      if (!this.dM().B) {
         this.y();
      }
   }

   public boolean gp() {
      return this.cl();
   }
}
