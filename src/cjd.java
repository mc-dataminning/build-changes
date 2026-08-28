import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public class cjd extends cjc {
   public static final float a = 0.5F;
   public static final float b = 10.0F;
   private static final akl<Byte> e = akp.a(cjd.class, akn.a);
   private static final int f = 1;
   private static final cij bH = cij.b().a(4.0);
   private static final byte bI = 0;
   public final bwk c = new bwk();
   public final bwk d = new bwk();
   @Nullable
   private iv bJ;

   public cjd(bxc<? extends cjd> $$0, djx $$1) {
      super($$0, $$1);
      if (!$$1.C) {
         this.w(true);
      }
   }

   @Override
   public boolean aZ() {
      return !this.m() && (float)this.af % 10.0F == 0.0F;
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(e, (byte)0);
   }

   @Override
   protected float fe() {
      return 0.1F;
   }

   @Override
   public float ff() {
      return super.ff() * 0.95F;
   }

   @Nullable
   @Override
   public awo u() {
      return this.m() && this.ae.a(4) != 0 ? null : awp.bF;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.bH;
   }

   @Override
   protected awo l_() {
      return awp.bG;
   }

   @Override
   public boolean bG() {
      return false;
   }

   @Override
   protected void D(bwt $$0) {
   }

   @Override
   protected void o() {
   }

   public static byz.a j() {
      return bxw.E().a(bza.s, 6.0);
   }

   public boolean m() {
      return (this.al.a(e) & 1) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.al.a(e);
      if ($$0) {
         this.al.a(e, (byte)($$1 | 1));
      } else {
         this.al.a(e, (byte)($$1 & -2));
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.m()) {
         this.i(ffq.c);
         this.o(this.dA(), (double)azo.a(this.dC()) + 1.0 - (double)this.dr(), this.dG());
      } else {
         this.i(this.dy().d(1.0, 0.6, 1.0));
      }

      this.q();
   }

   @Override
   protected void a(ars $$0) {
      super.a($$0);
      iv $$1 = this.dv();
      iv $$2 = $$1.d();
      if (this.m()) {
         boolean $$3 = this.ba();
         if ($$0.a_($$2).d($$0, $$1)) {
            if (this.ae.a(200) == 0) {
               this.aX = (float)this.ae.a(360);
            }

            if ($$0.a(bH, this) != null) {
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
         if (this.bJ != null && (!$$0.v(this.bJ) || this.bJ.v() <= $$0.K_())) {
            this.bJ = null;
         }

         if (this.bJ == null || this.ae.a(30) == 0 || this.bJ.a(this.dt(), 2.0)) {
            this.bJ = iv.a(
               this.dA() + (double)this.ae.a(7) - (double)this.ae.a(7),
               this.dC() + (double)this.ae.a(6) - 2.0,
               this.dG() + (double)this.ae.a(7) - (double)this.ae.a(7)
            );
         }

         double $$4 = (double)this.bJ.u() + 0.5 - this.dA();
         double $$5 = (double)this.bJ.v() + 0.1 - this.dC();
         double $$6 = (double)this.bJ.w() + 0.5 - this.dG();
         ffq $$7 = this.dy();
         ffq $$8 = $$7.b((Math.signum($$4) * 0.5 - $$7.d) * 0.1F, (Math.signum($$5) * 0.7F - $$7.e) * 0.1F, (Math.signum($$6) * 0.5 - $$7.f) * 0.1F);
         this.i($$8);
         float $$9 = (float)(azo.d($$8.f, $$8.d) * 180.0F / (float)Math.PI) - 90.0F;
         float $$10 = azo.h($$9 - this.dL());
         this.bi = 0.5F;
         this.w(this.dL() + $$10);
         if (this.ae.a(100) == 0 && $$0.a_($$2).d($$0, $$2)) {
            this.w(true);
         }
      }
   }

   @Override
   protected bwt.c bf() {
      return bwt.c.c;
   }

   @Override
   protected void a(double $$0, boolean $$1, ebe $$2, iv $$3) {
   }

   @Override
   public boolean g_() {
      return true;
   }

   @Override
   public boolean a(ars $$0, bvi $$1, float $$2) {
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
   public void a(tz $$0) {
      super.a($$0);
      this.al.a(e, $$0.b("BatFlags", (byte)0));
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("BatFlags", this.al.a(e).byteValue());
   }

   public static boolean b(bxc<cjd> $$0, djy $$1, bxb $$2, iv $$3, azx $$4) {
      if ($$3.v() >= $$1.a(ehd.a.b, $$3).v()) {
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
            return !$$1.a_($$3.e()).a(axe.cl) ? false : a($$0, $$1, $$2, $$3, $$4);
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
