import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public class cem extends cel {
   public static final float b = 0.5F;
   public static final float c = 10.0F;
   private static final ajp<Byte> bZ = ajt.a(cem.class, ajr.a);
   private static final int ca = 1;
   private static final cds cb = cds.b().a(4.0);
   public final bsb d = new bsb();
   public final bsb e = new bsb();
   @Nullable
   private ja cc;

   public cem(bsm<? extends cem> $$0, dcf $$1) {
      super($$0, $$1);
      if (!$$1.B) {
         this.w(true);
      }
   }

   @Override
   public boolean aW() {
      return !this.u() && (float)this.ai % 10.0F == 0.0F;
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(bZ, (byte)0);
   }

   @Override
   protected float fb() {
      return 0.1F;
   }

   @Override
   public float fc() {
      return super.fc() * 0.95F;
   }

   @Nullable
   @Override
   public avg v() {
      return this.u() && this.ah.a(4) != 0 ? null : avh.bF;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.bH;
   }

   @Override
   protected avg o_() {
      return avh.bG;
   }

   @Override
   public boolean bB() {
      return false;
   }

   @Override
   protected void E(bsg $$0) {
   }

   @Override
   protected void q() {
   }

   public static bui.a s() {
      return btd.A().a(buj.s, 6.0);
   }

   public boolean u() {
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
      if (this.u()) {
         this.i(ewf.b);
         this.p(this.dv(), (double)ayg.a(this.dx()) + 1.0 - (double)this.dl(), this.dB());
      } else {
         this.i(this.dt().d(1.0, 0.6, 1.0));
      }

      this.gk();
   }

   @Override
   protected void Z() {
      super.Z();
      ja $$0 = this.dq();
      ja $$1 = $$0.c();
      if (this.u()) {
         boolean $$2 = this.aX();
         if (this.dQ().a_($$1).g(this.dQ(), $$0)) {
            if (this.ah.a(200) == 0) {
               this.ba = (float)this.ah.a(360);
            }

            if (this.dQ().a(cb, this) != null) {
               this.w(false);
               if (!$$2) {
                  this.dQ().a(null, 1025, $$0, 0);
               }
            }
         } else {
            this.w(false);
            if (!$$2) {
               this.dQ().a(null, 1025, $$0, 0);
            }
         }
      } else {
         if (this.cc != null && (!this.dQ().u(this.cc) || this.cc.v() <= this.dQ().I_())) {
            this.cc = null;
         }

         if (this.cc == null || this.ah.a(30) == 0 || this.cc.a(this.do(), 2.0)) {
            this.cc = ja.a(
               this.dv() + (double)this.ah.a(7) - (double)this.ah.a(7),
               this.dx() + (double)this.ah.a(6) - 2.0,
               this.dB() + (double)this.ah.a(7) - (double)this.ah.a(7)
            );
         }

         double $$3 = (double)this.cc.u() + 0.5 - this.dv();
         double $$4 = (double)this.cc.v() + 0.1 - this.dx();
         double $$5 = (double)this.cc.w() + 0.5 - this.dB();
         ewf $$6 = this.dt();
         ewf $$7 = $$6.b((Math.signum($$3) * 0.5 - $$6.c) * 0.1F, (Math.signum($$4) * 0.7F - $$6.d) * 0.1F, (Math.signum($$5) * 0.5 - $$6.e) * 0.1F);
         this.i($$7);
         float $$8 = (float)(ayg.d($$7.e, $$7.c) * 180.0F / (float)Math.PI) - 90.0F;
         float $$9 = ayg.g($$8 - this.dG());
         this.bq = 0.5F;
         this.s(this.dG() + $$9);
         if (this.ah.a(100) == 0 && this.dQ().a_($$1).g(this.dQ(), $$1)) {
            this.w(true);
         }
      }
   }

   @Override
   protected bsg.b bc() {
      return bsg.b.c;
   }

   @Override
   protected void a(double $$0, boolean $$1, dsk $$2, ja $$3) {
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dQ().B && this.u()) {
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

   public static boolean b(bsm<cem> $$0, dcg $$1, btf $$2, ja $$3, ayo $$4) {
      if ($$3.v() >= $$1.z_()) {
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
      if (this.u()) {
         this.d.a();
         this.e.b(this.ai);
      } else {
         this.e.a();
         this.d.b(this.ai);
      }
   }
}
