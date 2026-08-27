import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public class cah extends cag {
   public static final float b = 0.5F;
   public static final float c = 10.0F;
   private static final aii<Byte> bU = ail.a(cah.class, aik.a);
   private static final int bV = 1;
   private static final bzn bW = bzn.b().a(4.0);
   public final bob d = new bob();
   public final bob e = new bob();
   @Nullable
   private ib bX;

   public cah(bol<? extends cah> $$0, cwe $$1) {
      super($$0, $$1);
      if (!$$1.B) {
         this.w(true);
      }
   }

   @Override
   public boolean aT() {
      return !this.w() && (float)this.ag % 10.0F == 0.0F;
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bU, (byte)0);
   }

   @Override
   protected float eY() {
      return 0.1F;
   }

   @Override
   public float eZ() {
      return super.eZ() * 0.95F;
   }

   @Nullable
   @Override
   public ato y() {
      return this.w() && this.af.a(4) != 0 ? null : atp.bD;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.bF;
   }

   @Override
   protected ato n_() {
      return atp.bE;
   }

   @Override
   public boolean bu() {
      return false;
   }

   @Override
   protected void C(bof $$0) {
   }

   @Override
   protected void M_() {
   }

   public static bqd.a u() {
      return boz.C().a(bqe.n, 6.0);
   }

   public boolean w() {
      return (this.am.b(bU) & 1) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.am.b(bU);
      if ($$0) {
         this.am.b(bU, (byte)($$1 | 1));
      } else {
         this.am.b(bU, (byte)($$1 & -2));
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.w()) {
         this.g(eov.b);
         this.p(this.do(), (double)awm.a(this.dq()) + 1.0 - (double)this.de(), this.du());
      } else {
         this.g(this.dm().d(1.0, 0.6, 1.0));
      }

      this.gh();
   }

   @Override
   protected void aa() {
      super.aa();
      ib $$0 = this.dj();
      ib $$1 = $$0.c();
      if (this.w()) {
         boolean $$2 = this.aU();
         if (this.dJ().a_($$1).g(this.dJ(), $$0)) {
            if (this.af.a(200) == 0) {
               this.aX = (float)this.af.a(360);
            }

            if (this.dJ().a(bW, this) != null) {
               this.w(false);
               if (!$$2) {
                  this.dJ().a(null, 1025, $$0, 0);
               }
            }
         } else {
            this.w(false);
            if (!$$2) {
               this.dJ().a(null, 1025, $$0, 0);
            }
         }
      } else {
         if (this.bX != null && (!this.dJ().u(this.bX) || this.bX.v() <= this.dJ().J_())) {
            this.bX = null;
         }

         if (this.bX == null || this.af.a(30) == 0 || this.bX.a(this.dh(), 2.0)) {
            this.bX = ib.a(
               this.do() + (double)this.af.a(7) - (double)this.af.a(7),
               this.dq() + (double)this.af.a(6) - 2.0,
               this.du() + (double)this.af.a(7) - (double)this.af.a(7)
            );
         }

         double $$3 = (double)this.bX.u() + 0.5 - this.do();
         double $$4 = (double)this.bX.v() + 0.1 - this.dq();
         double $$5 = (double)this.bX.w() + 0.5 - this.du();
         eov $$6 = this.dm();
         eov $$7 = $$6.b((Math.signum($$3) * 0.5 - $$6.c) * 0.1F, (Math.signum($$4) * 0.7F - $$6.d) * 0.1F, (Math.signum($$5) * 0.5 - $$6.e) * 0.1F);
         this.g($$7);
         float $$8 = (float)(awm.d($$7.e, $$7.c) * 180.0F / (float)Math.PI) - 90.0F;
         float $$9 = awm.g($$8 - this.dz());
         this.bn = 0.5F;
         this.r(this.dz() + $$9);
         if (this.af.a(100) == 0 && this.dJ().a_($$1).g(this.dJ(), $$1)) {
            this.w(true);
         }
      }
   }

   @Override
   protected bof.b aW() {
      return bof.b.c;
   }

   @Override
   protected void a(double $$0, boolean $$1, dme $$2, ib $$3) {
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dJ().B && this.w()) {
            this.w(false);
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.am.b(bU, $$0.f("BatFlags"));
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("BatFlags", this.am.b(bU));
   }

   public static boolean b(bol<cah> $$0, cwf $$1, bpb $$2, ib $$3, awt $$4) {
      if ($$3.v() >= $$1.A_()) {
         return false;
      } else {
         int $$5 = $$1.A($$3);
         int $$6 = 4;
         if (A()) {
            $$6 = 7;
         } else if ($$4.h()) {
            return false;
         }

         return $$5 > $$4.a($$6) ? false : a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private static boolean A() {
      LocalDate $$0 = LocalDate.now();
      int $$1 = $$0.get(ChronoField.DAY_OF_MONTH);
      int $$2 = $$0.get(ChronoField.MONTH_OF_YEAR);
      return $$2 == 10 && $$1 >= 20 || $$2 == 11 && $$1 <= 3;
   }

   private void gh() {
      if (this.w()) {
         this.d.a();
         this.e.b(this.ag);
      } else {
         this.e.a();
         this.d.b(this.ag);
      }
   }
}
