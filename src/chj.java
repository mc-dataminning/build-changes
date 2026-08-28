import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public class chj extends chi {
   public static final float a = 0.5F;
   public static final float b = 10.0F;
   private static final ajx<Byte> bE = akb.a(chj.class, ajz.a);
   private static final int bF = 1;
   private static final cgp bG = cgp.b().a(4.0);
   public final bur c = new bur();
   public final bur d = new bur();
   @Nullable
   private ji bH;

   public chj(bvi<? extends chj> $$0, dgz $$1) {
      super($$0, $$1);
      if (!$$1.C) {
         this.w(true);
      }
   }

   @Override
   public boolean ba() {
      return !this.m() && (float)this.af % 10.0F == 0.0F;
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bE, (byte)0);
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
   public avz u() {
      return this.m() && this.ae.a(4) != 0 ? null : awa.bF;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.bH;
   }

   @Override
   protected avz l_() {
      return awa.bG;
   }

   @Override
   public boolean bG() {
      return false;
   }

   @Override
   protected void D(bva $$0) {
   }

   @Override
   protected void o() {
   }

   public static bxf.a j() {
      return bwa.E().a(bxg.s, 6.0);
   }

   public boolean m() {
      return (this.al.a(bE) & 1) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.al.a(bE);
      if ($$0) {
         this.al.a(bE, (byte)($$1 | 1));
      } else {
         this.al.a(bE, (byte)($$1 & -2));
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.m()) {
         this.i(fbx.c);
         this.o(this.dz(), (double)ayz.a(this.dB()) + 1.0 - (double)this.dq(), this.dF());
      } else {
         this.i(this.dx().d(1.0, 0.6, 1.0));
      }

      this.q();
   }

   @Override
   protected void a(ard $$0) {
      super.a($$0);
      ji $$1 = this.du();
      ji $$2 = $$1.d();
      if (this.m()) {
         boolean $$3 = this.bb();
         if ($$0.a_($$2).d($$0, $$1)) {
            if (this.ae.a(200) == 0) {
               this.aX = (float)this.ae.a(360);
            }

            if ($$0.a(bG, this) != null) {
               this.w(false);
               if (!$$3) {
                  $$0.a(null, 1025, $$1, 0);
               }
            }
         } else {
            this.w(false);
            if (!$$3) {
               $$0.a(null, 1025, $$1, 0);
            }
         }
      } else {
         if (this.bH != null && (!$$0.u(this.bH) || this.bH.v() <= $$0.G_())) {
            this.bH = null;
         }

         if (this.bH == null || this.ae.a(30) == 0 || this.bH.a(this.ds(), 2.0)) {
            this.bH = ji.a(
               this.dz() + (double)this.ae.a(7) - (double)this.ae.a(7),
               this.dB() + (double)this.ae.a(6) - 2.0,
               this.dF() + (double)this.ae.a(7) - (double)this.ae.a(7)
            );
         }

         double $$4 = (double)this.bH.u() + 0.5 - this.dz();
         double $$5 = (double)this.bH.v() + 0.1 - this.dB();
         double $$6 = (double)this.bH.w() + 0.5 - this.dF();
         fbx $$7 = this.dx();
         fbx $$8 = $$7.b((Math.signum($$4) * 0.5 - $$7.d) * 0.1F, (Math.signum($$5) * 0.7F - $$7.e) * 0.1F, (Math.signum($$6) * 0.5 - $$7.f) * 0.1F);
         this.i($$8);
         float $$9 = (float)(ayz.d($$8.f, $$8.d) * 180.0F / (float)Math.PI) - 90.0F;
         float $$10 = ayz.h($$9 - this.dK());
         this.bi = 0.5F;
         this.w(this.dK() + $$10);
         if (this.ae.a(100) == 0 && $$0.a_($$2).d($$0, $$2)) {
            this.w(true);
         }
      }
   }

   @Override
   protected bva.c bg() {
      return bva.c.c;
   }

   @Override
   protected void a(double $$0, boolean $$1, dxq $$2, ji $$3) {
   }

   @Override
   public boolean g_() {
      return true;
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         if (this.m()) {
            this.w(false);
         }

         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.al.a(bE, $$0.f("BatFlags"));
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("BatFlags", this.al.a(bE));
   }

   public static boolean b(bvi<chj> $$0, dha $$1, bvh $$2, ji $$3, azh $$4) {
      if ($$3.v() >= $$1.a(edo.a.b, $$3).v()) {
         return false;
      } else {
         int $$5 = $$1.A($$3);
         int $$6 = 4;
         if (n()) {
            $$6 = 7;
         } else if ($$4.h()) {
            return false;
         }

         if ($$5 > $$4.a($$6)) {
            return false;
         } else {
            return !$$1.a_($$3.e()).a(awp.ck) ? false : a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   private static boolean n() {
      LocalDate $$0 = LocalDate.now();
      int $$1 = $$0.get(ChronoField.DAY_OF_MONTH);
      int $$2 = $$0.get(ChronoField.MONTH_OF_YEAR);
      return $$2 == 10 && $$1 >= 20 || $$2 == 11 && $$1 <= 3;
   }

   private void q() {
      if (this.m()) {
         this.c.a();
         this.d.b(this.af);
      } else {
         this.d.a();
         this.c.b(this.af);
      }
   }
}
