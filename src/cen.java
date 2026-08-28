import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public class cen extends cem {
   public static final float b = 0.5F;
   public static final float c = 10.0F;
   private static final ajp<Byte> bZ = ajt.a(cen.class, ajr.a);
   private static final int ca = 1;
   private static final cdt cb = cdt.b().a(4.0);
   public final bsc d = new bsc();
   public final bsc e = new bsc();
   @Nullable
   private ja cc;

   public cen(bsn<? extends cen> $$0, dcg $$1) {
      super($$0, $$1);
      if (!$$1.B) {
         this.w(true);
      }
   }

   @Override
   public boolean aX() {
      return !this.t() && (float)this.ai % 10.0F == 0.0F;
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(bZ, (byte)0);
   }

   @Override
   protected float fc() {
      return 0.1F;
   }

   @Override
   public float fd() {
      return super.fd() * 0.95F;
   }

   @Nullable
   @Override
   public avg v() {
      return this.t() && this.ah.a(4) != 0 ? null : avh.bF;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.bH;
   }

   @Override
   protected avg n_() {
      return avh.bG;
   }

   @Override
   public boolean bC() {
      return false;
   }

   @Override
   protected void E(bsh $$0) {
   }

   @Override
   protected void r() {
   }

   public static buj.a s() {
      return bte.A().a(buk.s, 6.0);
   }

   public boolean t() {
      return (this.ao.a(bZ) & 1) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.ao.a(bZ);
      if ($$0) {
         this.ao.a(bZ, (byte)($$1 | 1));
      } else {
         this.ao.a(bZ, (byte)($$1 & -2));
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.t()) {
         this.j(ewh.b);
         this.p(this.dw(), (double)ayg.a(this.dy()) + 1.0 - (double)this.dm(), this.dC());
      } else {
         this.j(this.du().d(1.0, 0.6, 1.0));
      }

      this.gj();
   }

   @Override
   protected void Z() {
      super.Z();
      ja $$0 = this.dr();
      ja $$1 = $$0.c();
      if (this.t()) {
         boolean $$2 = this.aY();
         if (this.dR().a_($$1).g(this.dR(), $$0)) {
            if (this.ah.a(200) == 0) {
               this.bb = (float)this.ah.a(360);
            }

            if (this.dR().a(cb, this) != null) {
               this.w(false);
               if (!$$2) {
                  this.dR().a(null, 1025, $$0, 0);
               }
            }
         } else {
            this.w(false);
            if (!$$2) {
               this.dR().a(null, 1025, $$0, 0);
            }
         }
      } else {
         if (this.cc != null && (!this.dR().u(this.cc) || this.cc.v() <= this.dR().I_())) {
            this.cc = null;
         }

         if (this.cc == null || this.ah.a(30) == 0 || this.cc.a(this.dp(), 2.0)) {
            this.cc = ja.a(
               this.dw() + (double)this.ah.a(7) - (double)this.ah.a(7),
               this.dy() + (double)this.ah.a(6) - 2.0,
               this.dC() + (double)this.ah.a(7) - (double)this.ah.a(7)
            );
         }

         double $$3 = (double)this.cc.u() + 0.5 - this.dw();
         double $$4 = (double)this.cc.v() + 0.1 - this.dy();
         double $$5 = (double)this.cc.w() + 0.5 - this.dC();
         ewh $$6 = this.du();
         ewh $$7 = $$6.b((Math.signum($$3) * 0.5 - $$6.c) * 0.1F, (Math.signum($$4) * 0.7F - $$6.d) * 0.1F, (Math.signum($$5) * 0.5 - $$6.e) * 0.1F);
         this.j($$7);
         float $$8 = (float)(ayg.d($$7.e, $$7.c) * 180.0F / (float)Math.PI) - 90.0F;
         float $$9 = ayg.g($$8 - this.dH());
         this.br = 0.5F;
         this.s(this.dH() + $$9);
         if (this.ah.a(100) == 0 && this.dR().a_($$1).g(this.dR(), $$1)) {
            this.w(true);
         }
      }
   }

   @Override
   protected bsh.c bd() {
      return bsh.c.c;
   }

   @Override
   protected void a(double $$0, boolean $$1, dsl $$2, ja $$3) {
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dR().B && this.t()) {
            this.w(false);
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.ao.a(bZ, $$0.f("BatFlags"));
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("BatFlags", this.ao.a(bZ));
   }

   public static boolean b(bsn<cen> $$0, dch $$1, btg $$2, ja $$3, ayo $$4) {
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

   private void gj() {
      if (this.t()) {
         this.d.a();
         this.e.b(this.ai);
      } else {
         this.e.a();
         this.d.b(this.ai);
      }
   }
}
