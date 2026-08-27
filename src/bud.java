import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public class bud extends buc {
   public static final float b = 74.48451F;
   public static final int c = aro.f(2.4166098F);
   private static final adx<Byte> d = aea.a(bud.class, adz.a);
   private static final int e = 1;
   private static final btj bS = btj.b().a(4.0);
   @Nullable
   private gv bT;

   public bud(bik<? extends bud> $$0, cpk $$1) {
      super($$0, $$1);
      if (!$$1.B) {
         this.w(true);
      }
   }

   @Override
   public boolean aR() {
      return !this.q() && this.ah % c == 0;
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(d, (byte)0);
   }

   @Override
   protected float eU() {
      return 0.1F;
   }

   @Override
   public float eV() {
      return super.eV() * 0.95F;
   }

   @Nullable
   @Override
   public aot r() {
      return this.q() && this.ag.a(4) != 0 ? null : aou.bq;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.bs;
   }

   @Override
   protected aot h_() {
      return aou.br;
   }

   @Override
   public boolean bs() {
      return false;
   }

   @Override
   protected void D(big $$0) {
   }

   @Override
   protected void fg() {
   }

   public static bkc.a p() {
      return biy.x().a(bkd.a, 6.0);
   }

   public boolean q() {
      return (this.an.b(d) & 1) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.an.b(d);
      if ($$0) {
         this.an.b(d, (byte)($$1 | 1));
      } else {
         this.an.b(d, (byte)($$1 & -2));
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.q()) {
         this.f(ehf.b);
         this.p(this.dp(), (double)aro.a(this.dr()) + 1.0 - (double)this.dg(), this.dv());
      } else {
         this.f(this.dn().d(1.0, 0.6, 1.0));
      }
   }

   @Override
   protected void V() {
      super.V();
      gv $$0 = this.dk();
      gv $$1 = $$0.c();
      if (this.q()) {
         boolean $$2 = this.aS();
         if (this.dK().a_($$1).g(this.dK(), $$0)) {
            if (this.ag.a(200) == 0) {
               this.aW = (float)this.ag.a(360);
            }

            if (this.dK().a(bS, this) != null) {
               this.w(false);
               if (!$$2) {
                  this.dK().a(null, 1025, $$0, 0);
               }
            }
         } else {
            this.w(false);
            if (!$$2) {
               this.dK().a(null, 1025, $$0, 0);
            }
         }
      } else {
         if (this.bT != null && (!this.dK().t(this.bT) || this.bT.v() <= this.dK().C_())) {
            this.bT = null;
         }

         if (this.bT == null || this.ag.a(30) == 0 || this.bT.a(this.di(), 2.0)) {
            this.bT = gv.a(
               this.dp() + (double)this.ag.a(7) - (double)this.ag.a(7),
               this.dr() + (double)this.ag.a(6) - 2.0,
               this.dv() + (double)this.ag.a(7) - (double)this.ag.a(7)
            );
         }

         double $$3 = (double)this.bT.u() + 0.5 - this.dp();
         double $$4 = (double)this.bT.v() + 0.1 - this.dr();
         double $$5 = (double)this.bT.w() + 0.5 - this.dv();
         ehf $$6 = this.dn();
         ehf $$7 = $$6.b((Math.signum($$3) * 0.5 - $$6.c) * 0.1F, (Math.signum($$4) * 0.7F - $$6.d) * 0.1F, (Math.signum($$5) * 0.5 - $$6.e) * 0.1F);
         this.f($$7);
         float $$8 = (float)(aro.d($$7.e, $$7.c) * 180.0F / (float)Math.PI) - 90.0F;
         float $$9 = aro.g($$8 - this.dA());
         this.bm = 0.5F;
         this.r(this.dA() + $$9);
         if (this.ag.a(100) == 0 && this.dK().a_($$1).g(this.dK(), $$1)) {
            this.w(true);
         }
      }
   }

   @Override
   protected big.b aU() {
      return big.b.c;
   }

   @Override
   protected void a(double $$0, boolean $$1, dey $$2, gv $$3) {
   }

   @Override
   public boolean d_() {
      return true;
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dK().B && this.q()) {
            this.w(false);
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.an.b(d, $$0.f("BatFlags"));
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("BatFlags", this.an.b(d));
   }

   public static boolean b(bik<bud> $$0, cpl $$1, bja $$2, gv $$3, art $$4) {
      if ($$3.v() >= $$1.t_()) {
         return false;
      } else {
         int $$5 = $$1.z($$3);
         int $$6 = 4;
         if (t()) {
            $$6 = 7;
         } else if ($$4.h()) {
            return false;
         }

         return $$5 > $$4.a($$6) ? false : a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private static boolean t() {
      LocalDate $$0 = LocalDate.now();
      int $$1 = $$0.get(ChronoField.DAY_OF_MONTH);
      int $$2 = $$0.get(ChronoField.MONTH_OF_YEAR);
      return $$2 == 10 && $$1 >= 20 || $$2 == 11 && $$1 <= 3;
   }

   @Override
   protected float b(bji $$0, bih $$1) {
      return $$1.b / 2.0F;
   }
}
