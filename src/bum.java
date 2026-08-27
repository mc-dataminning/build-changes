import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public class bum extends bul {
   public static final float b = 74.48451F;
   public static final int c = arx.f(2.4166098F);
   private static final aef<Byte> d = aei.a(bum.class, aeh.a);
   private static final int e = 1;
   private static final bts bS = bts.b().a(4.0);
   @Nullable
   private gw bT;

   public bum(biu<? extends bum> $$0, cpv $$1) {
      super($$0, $$1);
      if (!$$1.B) {
         this.w(true);
      }
   }

   @Override
   public boolean aR() {
      return !this.t() && this.ah % c == 0;
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(d, (byte)0);
   }

   @Override
   protected float eV() {
      return 0.1F;
   }

   @Override
   public float eW() {
      return super.eW() * 0.95F;
   }

   @Nullable
   @Override
   public apd w() {
      return this.t() && this.ag.a(4) != 0 ? null : ape.bq;
   }

   @Override
   protected apd d(bho $$0) {
      return ape.bs;
   }

   @Override
   protected apd l_() {
      return ape.br;
   }

   @Override
   public boolean bs() {
      return false;
   }

   @Override
   protected void D(biq $$0) {
   }

   @Override
   protected void fh() {
   }

   public static bkl.a s() {
      return bji.A().a(bkm.a, 6.0);
   }

   public boolean t() {
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
      if (this.t()) {
         this.f(ehn.b);
         this.p(this.dq(), (double)arx.a(this.ds()) + 1.0 - (double)this.dg(), this.dw());
      } else {
         this.f(this.do().d(1.0, 0.6, 1.0));
      }
   }

   @Override
   protected void X() {
      super.X();
      gw $$0 = this.dl();
      gw $$1 = $$0.c();
      if (this.t()) {
         boolean $$2 = this.aS();
         if (this.dL().a_($$1).g(this.dL(), $$0)) {
            if (this.ag.a(200) == 0) {
               this.aW = (float)this.ag.a(360);
            }

            if (this.dL().a(bS, this) != null) {
               this.w(false);
               if (!$$2) {
                  this.dL().a(null, 1025, $$0, 0);
               }
            }
         } else {
            this.w(false);
            if (!$$2) {
               this.dL().a(null, 1025, $$0, 0);
            }
         }
      } else {
         if (this.bT != null && (!this.dL().t(this.bT) || this.bT.v() <= this.dL().H_())) {
            this.bT = null;
         }

         if (this.bT == null || this.ag.a(30) == 0 || this.bT.a(this.dj(), 2.0)) {
            this.bT = gw.a(
               this.dq() + (double)this.ag.a(7) - (double)this.ag.a(7),
               this.ds() + (double)this.ag.a(6) - 2.0,
               this.dw() + (double)this.ag.a(7) - (double)this.ag.a(7)
            );
         }

         double $$3 = (double)this.bT.u() + 0.5 - this.dq();
         double $$4 = (double)this.bT.v() + 0.1 - this.ds();
         double $$5 = (double)this.bT.w() + 0.5 - this.dw();
         ehn $$6 = this.do();
         ehn $$7 = $$6.b((Math.signum($$3) * 0.5 - $$6.c) * 0.1F, (Math.signum($$4) * 0.7F - $$6.d) * 0.1F, (Math.signum($$5) * 0.5 - $$6.e) * 0.1F);
         this.f($$7);
         float $$8 = (float)(arx.d($$7.e, $$7.c) * 180.0F / (float)Math.PI) - 90.0F;
         float $$9 = arx.g($$8 - this.dB());
         this.bm = 0.5F;
         this.r(this.dB() + $$9);
         if (this.ag.a(100) == 0 && this.dL().a_($$1).g(this.dL(), $$1)) {
            this.w(true);
         }
      }
   }

   @Override
   protected biq.b aU() {
      return biq.b.c;
   }

   @Override
   protected void a(double $$0, boolean $$1, dfj $$2, gw $$3) {
   }

   @Override
   public boolean p_() {
      return true;
   }

   @Override
   public boolean a(bho $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dL().B && this.t()) {
            this.w(false);
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.an.b(d, $$0.f("BatFlags"));
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("BatFlags", this.an.b(d));
   }

   public static boolean b(biu<bum> $$0, cpw $$1, bjk $$2, gw $$3, asc $$4) {
      if ($$3.v() >= $$1.y_()) {
         return false;
      } else {
         int $$5 = $$1.z($$3);
         int $$6 = 4;
         if (y()) {
            $$6 = 7;
         } else if ($$4.h()) {
            return false;
         }

         return $$5 > $$4.a($$6) ? false : a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private static boolean y() {
      LocalDate $$0 = LocalDate.now();
      int $$1 = $$0.get(ChronoField.DAY_OF_MONTH);
      int $$2 = $$0.get(ChronoField.MONTH_OF_YEAR);
      return $$2 == 10 && $$1 >= 20 || $$2 == 11 && $$1 <= 3;
   }

   @Override
   protected float b(bjs $$0, bir $$1) {
      return $$1.b / 2.0F;
   }
}
