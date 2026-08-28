import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public class cfx extends cfw {
   public static final float b = 0.5F;
   public static final float c = 10.0F;
   private static final akh<Byte> bX = akl.a(cfx.class, akj.a);
   private static final int bY = 1;
   private static final cfd bZ = cfd.b().a(4.0);
   public final btl d = new btl();
   public final btl e = new btl();
   @Nullable
   private jf ca;

   public cfx(bty<? extends cfx> $$0, dej $$1) {
      super($$0, $$1);
      if (!$$1.B) {
         this.x(true);
      }
   }

   @Override
   public boolean aZ() {
      return !this.t() && (float)this.ag % 10.0F == 0.0F;
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bX, (byte)0);
   }

   @Override
   protected float fd() {
      return 0.1F;
   }

   @Override
   public float fe() {
      return super.fe() * 0.95F;
   }

   @Nullable
   @Override
   public awf w() {
      return this.t() && this.af.a(4) != 0 ? null : awg.bF;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.bH;
   }

   @Override
   protected awf o_() {
      return awg.bG;
   }

   @Override
   public boolean bF() {
      return false;
   }

   @Override
   protected void F(btr $$0) {
   }

   @Override
   protected void r() {
   }

   public static bvt.a q() {
      return bup.E().a(bvu.s, 6.0);
   }

   public boolean t() {
      return (this.am.a(bX) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.am.a(bX);
      if ($$0) {
         this.am.a(bX, (byte)($$1 | 1));
      } else {
         this.am.a(bX, (byte)($$1 & -2));
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.t()) {
         this.h(eyw.c);
         this.o(this.dx(), (double)azf.a(this.dz()) + 1.0 - (double)this.do(), this.dD());
      } else {
         this.h(this.dv().d(1.0, 0.6, 1.0));
      }

      this.gk();
   }

   @Override
   protected void ac() {
      super.ac();
      jf $$0 = this.ds();
      jf $$1 = $$0.d();
      if (this.t()) {
         boolean $$2 = this.ba();
         if (this.dS().a_($$1).d(this.dS(), $$0)) {
            if (this.af.a(200) == 0) {
               this.aV = (float)this.af.a(360);
            }

            if (this.dS().a(bZ, this) != null) {
               this.x(false);
               if (!$$2) {
                  this.dS().a(null, 1025, $$0, 0);
               }
            }
         } else {
            this.x(false);
            if (!$$2) {
               this.dS().a(null, 1025, $$0, 0);
            }
         }
      } else {
         if (this.ca != null && (!this.dS().u(this.ca) || this.ca.v() <= this.dS().H_())) {
            this.ca = null;
         }

         if (this.ca == null || this.af.a(30) == 0 || this.ca.a(this.dq(), 2.0)) {
            this.ca = jf.a(
               this.dx() + (double)this.af.a(7) - (double)this.af.a(7),
               this.dz() + (double)this.af.a(6) - 2.0,
               this.dD() + (double)this.af.a(7) - (double)this.af.a(7)
            );
         }

         double $$3 = (double)this.ca.u() + 0.5 - this.dx();
         double $$4 = (double)this.ca.v() + 0.1 - this.dz();
         double $$5 = (double)this.ca.w() + 0.5 - this.dD();
         eyw $$6 = this.dv();
         eyw $$7 = $$6.b((Math.signum($$3) * 0.5 - $$6.d) * 0.1F, (Math.signum($$4) * 0.7F - $$6.e) * 0.1F, (Math.signum($$5) * 0.5 - $$6.f) * 0.1F);
         this.h($$7);
         float $$8 = (float)(azf.d($$7.f, $$7.d) * 180.0F / (float)Math.PI) - 90.0F;
         float $$9 = azf.h($$8 - this.dI());
         this.bm = 0.5F;
         this.v(this.dI() + $$9);
         if (this.af.a(100) == 0 && this.dS().a_($$1).d(this.dS(), $$1)) {
            this.x(true);
         }
      }
   }

   @Override
   protected btr.b bf() {
      return btr.b.c;
   }

   @Override
   protected void a(double $$0, boolean $$1, dus $$2, jf $$3) {
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dS().B && this.t()) {
            this.x(false);
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.am.a(bX, $$0.f("BatFlags"));
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("BatFlags", this.am.a(bX));
   }

   public static boolean b(bty<cfx> $$0, dek $$1, btx $$2, jf $$3, azn $$4) {
      if ($$3.v() >= $$1.a(eao.a.b, $$3).v()) {
         return false;
      } else {
         int $$5 = $$1.A($$3);
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

   private void gk() {
      if (this.t()) {
         this.d.a();
         this.e.b(this.ag);
      } else {
         this.e.a();
         this.d.b(this.ag);
      }
   }
}
