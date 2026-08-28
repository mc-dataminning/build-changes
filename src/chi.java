import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public class chi extends chh {
   public static final float a = 0.5F;
   public static final float b = 10.0F;
   private static final aks<Byte> bY = akw.a(chi.class, aku.a);
   private static final int bZ = 1;
   private static final cgo ca = cgo.b().a(4.0);
   public final but c = new but();
   public final but d = new but();
   @Nullable
   private jh cb;

   public chi(bvi<? extends chi> $$0, dgz $$1) {
      super($$0, $$1);
      if (!$$1.C) {
         this.x(true);
      }
   }

   @Override
   public boolean ba() {
      return !this.p() && (float)this.af % 10.0F == 0.0F;
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(bY, (byte)0);
   }

   @Override
   protected float fg() {
      return 0.1F;
   }

   @Override
   public float fh() {
      return super.fh() * 0.95F;
   }

   @Nullable
   @Override
   public awu u() {
      return this.p() && this.ae.a(4) != 0 ? null : awv.bF;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.bH;
   }

   @Override
   protected awu o_() {
      return awv.bG;
   }

   @Override
   public boolean bI() {
      return false;
   }

   @Override
   protected void D(bvb $$0) {
   }

   @Override
   protected void o() {
   }

   public static bxe.a m() {
      return bvz.C().a(bxf.s, 6.0);
   }

   public boolean p() {
      return (this.al.a(bY) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.al.a(bY);
      if ($$0) {
         this.al.a(bY, (byte)($$1 | 1));
      } else {
         this.al.a(bY, (byte)($$1 & -2));
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.p()) {
         this.h(fbr.c);
         this.o(this.dB(), (double)azu.a(this.dD()) + 1.0 - (double)this.ds(), this.dH());
      } else {
         this.h(this.dz().d(1.0, 0.6, 1.0));
      }

      this.x();
   }

   @Override
   protected void a(arx $$0) {
      super.a($$0);
      jh $$1 = this.dw();
      jh $$2 = $$1.d();
      if (this.p()) {
         boolean $$3 = this.bb();
         if ($$0.a_($$2).d($$0, $$1)) {
            if (this.ae.a(200) == 0) {
               this.aZ = (float)this.ae.a(360);
            }

            if ($$0.a(ca, this) != null) {
               this.x(false);
               if (!$$3) {
                  $$0.a(null, 1025, $$1, 0);
               }
            }
         } else {
            this.x(false);
            if (!$$3) {
               $$0.a(null, 1025, $$1, 0);
            }
         }
      } else {
         if (this.cb != null && (!$$0.u(this.cb) || this.cb.v() <= $$0.L_())) {
            this.cb = null;
         }

         if (this.cb == null || this.ae.a(30) == 0 || this.cb.a(this.du(), 2.0)) {
            this.cb = jh.a(
               this.dB() + (double)this.ae.a(7) - (double)this.ae.a(7),
               this.dD() + (double)this.ae.a(6) - 2.0,
               this.dH() + (double)this.ae.a(7) - (double)this.ae.a(7)
            );
         }

         double $$4 = (double)this.cb.u() + 0.5 - this.dB();
         double $$5 = (double)this.cb.v() + 0.1 - this.dD();
         double $$6 = (double)this.cb.w() + 0.5 - this.dH();
         fbr $$7 = this.dz();
         fbr $$8 = $$7.b((Math.signum($$4) * 0.5 - $$7.d) * 0.1F, (Math.signum($$5) * 0.7F - $$7.e) * 0.1F, (Math.signum($$6) * 0.5 - $$7.f) * 0.1F);
         this.h($$8);
         float $$9 = (float)(azu.d($$8.f, $$8.d) * 180.0F / (float)Math.PI) - 90.0F;
         float $$10 = azu.h($$9 - this.dM());
         this.bq = 0.5F;
         this.v(this.dM() + $$10);
         if (this.ae.a(100) == 0 && $$0.a_($$2).d($$0, $$2)) {
            this.x(true);
         }
      }
   }

   @Override
   protected bvb.c bg() {
      return bvb.c.c;
   }

   @Override
   protected void a(double $$0, boolean $$1, dxo $$2, jh $$3) {
   }

   @Override
   public boolean s_() {
      return true;
   }

   @Override
   public boolean a(arx $$0, btr $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         if (this.p()) {
            this.x(false);
         }

         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.al.a(bY, $$0.f("BatFlags"));
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("BatFlags", this.al.a(bY));
   }

   public static boolean b(bvi<chi> $$0, dha $$1, bvh $$2, jh $$3, bac $$4) {
      if ($$3.v() >= $$1.a(edj.a.b, $$3).v()) {
         return false;
      } else {
         int $$5 = $$1.A($$3);
         int $$6 = 4;
         if (t()) {
            $$6 = 7;
         } else if ($$4.h()) {
            return false;
         }

         if ($$5 > $$4.a($$6)) {
            return false;
         } else {
            return !$$1.a_($$3.e()).a(axk.cj) ? false : a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   private static boolean t() {
      LocalDate $$0 = LocalDate.now();
      int $$1 = $$0.get(ChronoField.DAY_OF_MONTH);
      int $$2 = $$0.get(ChronoField.MONTH_OF_YEAR);
      return $$2 == 10 && $$1 >= 20 || $$2 == 11 && $$1 <= 3;
   }

   private void x() {
      if (this.p()) {
         this.c.a();
         this.d.b(this.af);
      } else {
         this.d.a();
         this.c.b(this.af);
      }
   }
}
