import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public class cej extends cei {
   public static final float b = 0.5F;
   public static final float c = 10.0F;
   private static final ajp<Byte> bZ = ajt.a(cej.class, ajr.a);
   private static final int ca = 1;
   private static final cdp cb = cdp.b().a(4.0);
   public final bry d = new bry();
   public final bry e = new bry();
   @Nullable
   private ja cc;

   public cej(bsj<? extends cej> $$0, dcd $$1) {
      super($$0, $$1);
      if (!$$1.B) {
         this.w(true);
      }
   }

   @Override
   public boolean aV() {
      return !this.u() && (float)this.ai % 10.0F == 0.0F;
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(bZ, (byte)0);
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
   public ave v() {
      return this.u() && this.ah.a(4) != 0 ? null : avf.bF;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.bH;
   }

   @Override
   protected ave o_() {
      return avf.bG;
   }

   @Override
   public boolean bA() {
      return false;
   }

   @Override
   protected void E(bsd $$0) {
   }

   @Override
   protected void q() {
   }

   public static buf.a s() {
      return bta.A().a(bug.s, 6.0);
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
         this.h(evz.b);
         this.p(this.du(), (double)aye.a(this.dw()) + 1.0 - (double)this.dk(), this.dA());
      } else {
         this.h(this.ds().d(1.0, 0.6, 1.0));
      }

      this.gj();
   }

   @Override
   protected void Z() {
      super.Z();
      ja $$0 = this.dp();
      ja $$1 = $$0.c();
      if (this.u()) {
         boolean $$2 = this.aW();
         if (this.dP().a_($$1).g(this.dP(), $$0)) {
            if (this.ah.a(200) == 0) {
               this.ba = (float)this.ah.a(360);
            }

            if (this.dP().a(cb, this) != null) {
               this.w(false);
               if (!$$2) {
                  this.dP().a(null, 1025, $$0, 0);
               }
            }
         } else {
            this.w(false);
            if (!$$2) {
               this.dP().a(null, 1025, $$0, 0);
            }
         }
      } else {
         if (this.cc != null && (!this.dP().u(this.cc) || this.cc.v() <= this.dP().I_())) {
            this.cc = null;
         }

         if (this.cc == null || this.ah.a(30) == 0 || this.cc.a(this.dn(), 2.0)) {
            this.cc = ja.a(
               this.du() + (double)this.ah.a(7) - (double)this.ah.a(7),
               this.dw() + (double)this.ah.a(6) - 2.0,
               this.dA() + (double)this.ah.a(7) - (double)this.ah.a(7)
            );
         }

         double $$3 = (double)this.cc.u() + 0.5 - this.du();
         double $$4 = (double)this.cc.v() + 0.1 - this.dw();
         double $$5 = (double)this.cc.w() + 0.5 - this.dA();
         evz $$6 = this.ds();
         evz $$7 = $$6.b((Math.signum($$3) * 0.5 - $$6.c) * 0.1F, (Math.signum($$4) * 0.7F - $$6.d) * 0.1F, (Math.signum($$5) * 0.5 - $$6.e) * 0.1F);
         this.h($$7);
         float $$8 = (float)(aye.d($$7.e, $$7.c) * 180.0F / (float)Math.PI) - 90.0F;
         float $$9 = aye.g($$8 - this.dF());
         this.bq = 0.5F;
         this.s(this.dF() + $$9);
         if (this.ah.a(100) == 0 && this.dP().a_($$1).g(this.dP(), $$1)) {
            this.w(true);
         }
      }
   }

   @Override
   protected bsd.b bb() {
      return bsd.b.c;
   }

   @Override
   protected void a(double $$0, boolean $$1, dsh $$2, ja $$3) {
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dP().B && this.u()) {
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

   public static boolean b(bsj<cej> $$0, dce $$1, btc $$2, ja $$3, aym $$4) {
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

   private void gj() {
      if (this.u()) {
         this.d.a();
         this.e.b(this.ai);
      } else {
         this.e.a();
         this.d.b(this.ai);
      }
   }
}
