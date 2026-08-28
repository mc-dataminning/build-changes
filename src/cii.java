import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public class cii extends cih {
   public static final float a = 0.5F;
   public static final float b = 10.0F;
   private static final akh<Byte> bE = akl.a(cii.class, akj.a);
   private static final int bF = 1;
   private static final cho bG = cho.b().a(4.0);
   public final bvr c = new bvr();
   public final bvr d = new bvr();
   @Nullable
   private iu bH;

   public cii(bwj<? extends cii> $$0, dip $$1) {
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
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bE, (byte)0);
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
   public awk u() {
      return this.m() && this.ae.a(4) != 0 ? null : awl.bF;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.bH;
   }

   @Override
   protected awk l_() {
      return awl.bG;
   }

   @Override
   public boolean bH() {
      return false;
   }

   @Override
   protected void D(bwa $$0) {
   }

   @Override
   protected void o() {
   }

   public static bye.a j() {
      return bxb.E().a(byf.s, 6.0);
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
         this.i(fdw.c);
         this.o(this.dA(), (double)azk.a(this.dC()) + 1.0 - (double)this.dr(), this.dG());
      } else {
         this.i(this.dy().d(1.0, 0.6, 1.0));
      }

      this.q();
   }

   @Override
   protected void a(aro $$0) {
      super.a($$0);
      iu $$1 = this.dv();
      iu $$2 = $$1.d();
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
         if (this.bH != null && (!$$0.v(this.bH) || this.bH.v() <= $$0.G_())) {
            this.bH = null;
         }

         if (this.bH == null || this.ae.a(30) == 0 || this.bH.a(this.dt(), 2.0)) {
            this.bH = iu.a(
               this.dA() + (double)this.ae.a(7) - (double)this.ae.a(7),
               this.dC() + (double)this.ae.a(6) - 2.0,
               this.dG() + (double)this.ae.a(7) - (double)this.ae.a(7)
            );
         }

         double $$4 = (double)this.bH.u() + 0.5 - this.dA();
         double $$5 = (double)this.bH.v() + 0.1 - this.dC();
         double $$6 = (double)this.bH.w() + 0.5 - this.dG();
         fdw $$7 = this.dy();
         fdw $$8 = $$7.b((Math.signum($$4) * 0.5 - $$7.d) * 0.1F, (Math.signum($$5) * 0.7F - $$7.e) * 0.1F, (Math.signum($$6) * 0.5 - $$7.f) * 0.1F);
         this.i($$8);
         float $$9 = (float)(azk.d($$8.f, $$8.d) * 180.0F / (float)Math.PI) - 90.0F;
         float $$10 = azk.h($$9 - this.dL());
         this.bi = 0.5F;
         this.w(this.dL() + $$10);
         if (this.ae.a(100) == 0 && $$0.a_($$2).d($$0, $$2)) {
            this.w(true);
         }
      }
   }

   @Override
   protected bwa.d bg() {
      return bwa.d.c;
   }

   @Override
   protected void a(double $$0, boolean $$1, dzo $$2, iu $$3) {
   }

   @Override
   public boolean g_() {
      return true;
   }

   @Override
   public boolean a(aro $$0, bup $$1, float $$2) {
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
   public void a(tx $$0) {
      super.a($$0);
      this.al.a(bE, $$0.f("BatFlags"));
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("BatFlags", this.al.a(bE));
   }

   public static boolean b(bwj<cii> $$0, diq $$1, bwi $$2, iu $$3, azt $$4) {
      if ($$3.v() >= $$1.a(efn.a.b, $$3).v()) {
         return false;
      } else {
         int $$5 = $$1.B($$3);
         int $$6 = 4;
         if (n()) {
            $$6 = 7;
         } else if ($$4.h()) {
            return false;
         }

         if ($$5 > $$4.a($$6)) {
            return false;
         } else {
            return !$$1.a_($$3.e()).a(axa.ck) ? false : a($$0, $$1, $$2, $$3, $$4);
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
