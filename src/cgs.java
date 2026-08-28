import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public class cgs extends cgr {
   public static final float a = 0.5F;
   public static final float b = 10.0F;
   private static final akm<Byte> bX = akq.a(cgs.class, ako.a);
   private static final int bY = 1;
   private static final cfy bZ = cfy.b().a(4.0);
   public final bud c = new bud();
   public final bud d = new bud();
   @Nullable
   private jh ca;

   public cgs(bus<? extends cgs> $$0, dfm $$1) {
      super($$0, $$1);
      if (!$$1.C) {
         this.x(true);
      }
   }

   @Override
   public boolean ba() {
      return !this.q() && (float)this.af % 10.0F == 0.0F;
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(bX, (byte)0);
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
   public awm t() {
      return this.q() && this.ae.a(4) != 0 ? null : awn.bF;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.bH;
   }

   @Override
   protected awm n_() {
      return awn.bG;
   }

   @Override
   public boolean bI() {
      return false;
   }

   @Override
   protected void D(bul $$0) {
   }

   @Override
   protected void o() {
   }

   public static bwo.a n() {
      return bvj.C().a(bwp.s, 6.0);
   }

   public boolean q() {
      return (this.al.a(bX) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.al.a(bX);
      if ($$0) {
         this.al.a(bX, (byte)($$1 | 1));
      } else {
         this.al.a(bX, (byte)($$1 & -2));
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.q()) {
         this.h(ezy.c);
         this.o(this.dA(), (double)azm.a(this.dC()) + 1.0 - (double)this.dr(), this.dG());
      } else {
         this.h(this.dy().d(1.0, 0.6, 1.0));
      }

      this.gi();
   }

   @Override
   protected void a(arp $$0) {
      super.a($$0);
      jh $$1 = this.dv();
      jh $$2 = $$1.d();
      if (this.q()) {
         boolean $$3 = this.bb();
         if ($$0.a_($$2).d($$0, $$1)) {
            if (this.ae.a(200) == 0) {
               this.aY = (float)this.ae.a(360);
            }

            if ($$0.a(bZ, this) != null) {
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
         if (this.ca != null && (!$$0.u(this.ca) || this.ca.v() <= $$0.K_())) {
            this.ca = null;
         }

         if (this.ca == null || this.ae.a(30) == 0 || this.ca.a(this.dt(), 2.0)) {
            this.ca = jh.a(
               this.dA() + (double)this.ae.a(7) - (double)this.ae.a(7),
               this.dC() + (double)this.ae.a(6) - 2.0,
               this.dG() + (double)this.ae.a(7) - (double)this.ae.a(7)
            );
         }

         double $$4 = (double)this.ca.u() + 0.5 - this.dA();
         double $$5 = (double)this.ca.v() + 0.1 - this.dC();
         double $$6 = (double)this.ca.w() + 0.5 - this.dG();
         ezy $$7 = this.dy();
         ezy $$8 = $$7.b((Math.signum($$4) * 0.5 - $$7.d) * 0.1F, (Math.signum($$5) * 0.7F - $$7.e) * 0.1F, (Math.signum($$6) * 0.5 - $$7.f) * 0.1F);
         this.h($$8);
         float $$9 = (float)(azm.d($$8.f, $$8.d) * 180.0F / (float)Math.PI) - 90.0F;
         float $$10 = azm.h($$9 - this.dL());
         this.bp = 0.5F;
         this.v(this.dL() + $$10);
         if (this.ae.a(100) == 0 && $$0.a_($$2).d($$0, $$2)) {
            this.x(true);
         }
      }
   }

   @Override
   protected bul.b bg() {
      return bul.b.c;
   }

   @Override
   protected void a(double $$0, boolean $$1, dvv $$2, jh $$3) {
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean a(arp $$0, btb $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         if (this.q()) {
            this.x(false);
         }

         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.al.a(bX, $$0.f("BatFlags"));
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("BatFlags", this.al.a(bX));
   }

   public static boolean b(bus<cgs> $$0, dfn $$1, bur $$2, jh $$3, azu $$4) {
      if ($$3.v() >= $$1.a(ebq.a.b, $$3).v()) {
         return false;
      } else {
         int $$5 = $$1.A($$3);
         int $$6 = 4;
         if (v()) {
            $$6 = 7;
         } else if ($$4.h()) {
            return false;
         }

         if ($$5 > $$4.a($$6)) {
            return false;
         } else {
            return !$$1.a_($$3.e()).a(axc.ci) ? false : a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   private static boolean v() {
      LocalDate $$0 = LocalDate.now();
      int $$1 = $$0.get(ChronoField.DAY_OF_MONTH);
      int $$2 = $$0.get(ChronoField.MONTH_OF_YEAR);
      return $$2 == 10 && $$1 >= 20 || $$2 == 11 && $$1 <= 3;
   }

   private void gi() {
      if (this.q()) {
         this.c.a();
         this.d.b(this.af);
      } else {
         this.d.a();
         this.c.b(this.af);
      }
   }
}
