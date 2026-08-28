import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public class cia extends chz {
   public static final float a = 0.5F;
   public static final float b = 10.0F;
   private static final akg<Byte> bD = akk.a(cia.class, aki.a);
   private static final int bE = 1;
   private static final chg bF = chg.b().a(4.0);
   public final bvj c = new bvj();
   public final bvj d = new bvj();
   @Nullable
   private jj bG;

   public cia(bwb<? extends cia> $$0, dhp $$1) {
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
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bD, (byte)0);
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
   public awj u() {
      return this.m() && this.ae.a(4) != 0 ? null : awk.bF;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.bH;
   }

   @Override
   protected awj l_() {
      return awk.bG;
   }

   @Override
   public boolean bH() {
      return false;
   }

   @Override
   protected void D(bvs $$0) {
   }

   @Override
   protected void o() {
   }

   public static bxw.a j() {
      return bwt.E().a(bxx.s, 6.0);
   }

   public boolean m() {
      return (this.al.a(bD) & 1) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.al.a(bD);
      if ($$0) {
         this.al.a(bD, (byte)($$1 | 1));
      } else {
         this.al.a(bD, (byte)($$1 & -2));
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.m()) {
         this.i(fcu.c);
         this.o(this.dA(), (double)azk.a(this.dC()) + 1.0 - (double)this.dr(), this.dG());
      } else {
         this.i(this.dy().d(1.0, 0.6, 1.0));
      }

      this.q();
   }

   @Override
   protected void a(arn $$0) {
      super.a($$0);
      jj $$1 = this.dv();
      jj $$2 = $$1.d();
      if (this.m()) {
         boolean $$3 = this.bb();
         if ($$0.a_($$2).d($$0, $$1)) {
            if (this.ae.a(200) == 0) {
               this.aW = (float)this.ae.a(360);
            }

            if ($$0.a(bF, this) != null) {
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
         if (this.bG != null && (!$$0.u(this.bG) || this.bG.v() <= $$0.G_())) {
            this.bG = null;
         }

         if (this.bG == null || this.ae.a(30) == 0 || this.bG.a(this.dt(), 2.0)) {
            this.bG = jj.a(
               this.dA() + (double)this.ae.a(7) - (double)this.ae.a(7),
               this.dC() + (double)this.ae.a(6) - 2.0,
               this.dG() + (double)this.ae.a(7) - (double)this.ae.a(7)
            );
         }

         double $$4 = (double)this.bG.u() + 0.5 - this.dA();
         double $$5 = (double)this.bG.v() + 0.1 - this.dC();
         double $$6 = (double)this.bG.w() + 0.5 - this.dG();
         fcu $$7 = this.dy();
         fcu $$8 = $$7.b((Math.signum($$4) * 0.5 - $$7.d) * 0.1F, (Math.signum($$5) * 0.7F - $$7.e) * 0.1F, (Math.signum($$6) * 0.5 - $$7.f) * 0.1F);
         this.i($$8);
         float $$9 = (float)(azk.d($$8.f, $$8.d) * 180.0F / (float)Math.PI) - 90.0F;
         float $$10 = azk.h($$9 - this.dL());
         this.bh = 0.5F;
         this.w(this.dL() + $$10);
         if (this.ae.a(100) == 0 && $$0.a_($$2).d($$0, $$2)) {
            this.w(true);
         }
      }
   }

   @Override
   protected bvs.d bg() {
      return bvs.d.c;
   }

   @Override
   protected void a(double $$0, boolean $$1, dym $$2, jj $$3) {
   }

   @Override
   public boolean g_() {
      return true;
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
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
   public void a(tw $$0) {
      super.a($$0);
      this.al.a(bD, $$0.f("BatFlags"));
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("BatFlags", this.al.a(bD));
   }

   public static boolean b(bwb<cia> $$0, dhq $$1, bwa $$2, jj $$3, azs $$4) {
      if ($$3.v() >= $$1.a(eel.a.b, $$3).v()) {
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
            return !$$1.a_($$3.e()).a(awz.ck) ? false : a($$0, $$1, $$2, $$3, $$4);
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
