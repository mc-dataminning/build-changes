import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public class cez extends cey {
   public static final float b = 0.5F;
   public static final float c = 10.0F;
   private static final ajw<Byte> cb = aka.a(cez.class, ajy.a);
   private static final int cc = 1;
   private static final cef cd = cef.b().a(4.0);
   public final bsm d = new bsm();
   public final bsm e = new bsm();
   @Nullable
   private jd ce;

   public cez(bsx<? extends cez> $$0, dcw $$1) {
      super($$0, $$1);
      if (!$$1.B) {
         this.x(true);
      }
   }

   @Override
   public boolean aW() {
      return !this.t() && (float)this.ai % 10.0F == 0.0F;
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(cb, (byte)0);
   }

   @Override
   protected float fa() {
      return 0.1F;
   }

   @Override
   public float fb() {
      return super.fb() * 0.95F;
   }

   @Nullable
   @Override
   public avo v() {
      return this.t() && this.ah.a(4) != 0 ? null : avp.bF;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.bH;
   }

   @Override
   protected avo n_() {
      return avp.bG;
   }

   @Override
   public boolean bB() {
      return false;
   }

   @Override
   protected void E(bsr $$0) {
   }

   @Override
   protected void r() {
   }

   public static buv.a s() {
      return btp.C().a(buw.s, 6.0);
   }

   public boolean t() {
      return (this.ao.a(cb) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.ao.a(cb);
      if ($$0) {
         this.ao.a(cb, (byte)($$1 | 1));
      } else {
         this.ao.a(cb, (byte)($$1 & -2));
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.t()) {
         this.i(exc.b);
         this.o(this.dt(), (double)ayo.a(this.dv()) + 1.0 - (double)this.dk(), this.dz());
      } else {
         this.i(this.dr().d(1.0, 0.6, 1.0));
      }

      this.gg();
   }

   @Override
   protected void ab() {
      super.ab();
      jd $$0 = this.do();
      jd $$1 = $$0.d();
      if (this.t()) {
         boolean $$2 = this.aX();
         if (this.dO().a_($$1).g(this.dO(), $$0)) {
            if (this.ah.a(200) == 0) {
               this.ba = (float)this.ah.a(360);
            }

            if (this.dO().a(cd, this) != null) {
               this.x(false);
               if (!$$2) {
                  this.dO().a(null, 1025, $$0, 0);
               }
            }
         } else {
            this.x(false);
            if (!$$2) {
               this.dO().a(null, 1025, $$0, 0);
            }
         }
      } else {
         if (this.ce != null && (!this.dO().u(this.ce) || this.ce.v() <= this.dO().I_())) {
            this.ce = null;
         }

         if (this.ce == null || this.ah.a(30) == 0 || this.ce.a(this.dm(), 2.0)) {
            this.ce = jd.a(
               this.dt() + (double)this.ah.a(7) - (double)this.ah.a(7),
               this.dv() + (double)this.ah.a(6) - 2.0,
               this.dz() + (double)this.ah.a(7) - (double)this.ah.a(7)
            );
         }

         double $$3 = (double)this.ce.u() + 0.5 - this.dt();
         double $$4 = (double)this.ce.v() + 0.1 - this.dv();
         double $$5 = (double)this.ce.w() + 0.5 - this.dz();
         exc $$6 = this.dr();
         exc $$7 = $$6.b((Math.signum($$3) * 0.5 - $$6.c) * 0.1F, (Math.signum($$4) * 0.7F - $$6.d) * 0.1F, (Math.signum($$5) * 0.5 - $$6.e) * 0.1F);
         this.i($$7);
         float $$8 = (float)(ayo.d($$7.e, $$7.c) * 180.0F / (float)Math.PI) - 90.0F;
         float $$9 = ayo.g($$8 - this.dE());
         this.bq = 0.5F;
         this.t(this.dE() + $$9);
         if (this.ah.a(100) == 0 && this.dO().a_($$1).g(this.dO(), $$1)) {
            this.x(true);
         }
      }
   }

   @Override
   protected bsr.b bc() {
      return bsr.b.c;
   }

   @Override
   protected void a(double $$0, boolean $$1, dtc $$2, jd $$3) {
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dO().B && this.t()) {
            this.x(false);
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.ao.a(cb, $$0.f("BatFlags"));
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("BatFlags", this.ao.a(cb));
   }

   public static boolean b(bsx<cez> $$0, dcx $$1, btr $$2, jd $$3, ayw $$4) {
      if ($$3.v() >= $$1.z_()) {
         return false;
      } else {
         int $$5 = $$1.A($$3);
         int $$6 = 4;
         if (x()) {
            $$6 = 7;
         } else if ($$4.h()) {
            return false;
         }

         return $$5 > $$4.a($$6) ? false : a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private static boolean x() {
      LocalDate $$0 = LocalDate.now();
      int $$1 = $$0.get(ChronoField.DAY_OF_MONTH);
      int $$2 = $$0.get(ChronoField.MONTH_OF_YEAR);
      return $$2 == 10 && $$1 >= 20 || $$2 == 11 && $$1 <= 3;
   }

   private void gg() {
      if (this.t()) {
         this.d.a();
         this.e.b(this.ai);
      } else {
         this.e.a();
         this.d.b(this.ai);
      }
   }
}
