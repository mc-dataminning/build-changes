import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public class bxx extends bxw {
   public static final float b = 0.5F;
   public static final float c = 10.0F;
   private static final agn<Byte> bT = agq.a(bxx.class, agp.a);
   private static final int bU = 1;
   private static final bxd bV = bxd.b().a(4.0);
   public final bls d = new bls();
   public final bls e = new bls();
   @Nullable
   private hx bW;

   public bxx(bmc<? extends bxx> $$0, ctx $$1) {
      super($$0, $$1);
      if (!$$1.B) {
         this.w(true);
      }
   }

   @Override
   public boolean aT() {
      return !this.w() && (float)this.ah % 10.0F == 0.0F;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bT, (byte)0);
   }

   @Override
   protected float eW() {
      return 0.1F;
   }

   @Override
   public float eX() {
      return super.eX() * 0.95F;
   }

   @Nullable
   @Override
   public ars y() {
      return this.w() && this.ag.a(4) != 0 ? null : art.bC;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.bE;
   }

   @Override
   protected ars n_() {
      return art.bD;
   }

   @Override
   public boolean bu() {
      return false;
   }

   @Override
   protected void C(blw $$0) {
   }

   @Override
   protected void M_() {
   }

   public static bnt.a u() {
      return bmq.C().a(bnu.n, 6.0);
   }

   public boolean w() {
      return (this.an.b(bT) & 1) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.an.b(bT);
      if ($$0) {
         this.an.b(bT, (byte)($$1 | 1));
      } else {
         this.an.b(bT, (byte)($$1 & -2));
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.w()) {
         this.g(emc.b);
         this.p(this.dq(), (double)aup.a(this.ds()) + 1.0 - (double)this.dh(), this.dw());
      } else {
         this.g(this.do().d(1.0, 0.6, 1.0));
      }

      this.gb();
   }

   @Override
   protected void aa() {
      super.aa();
      hx $$0 = this.dl();
      hx $$1 = $$0.c();
      if (this.w()) {
         boolean $$2 = this.aU();
         if (this.dL().a_($$1).g(this.dL(), $$0)) {
            if (this.ag.a(200) == 0) {
               this.aW = (float)this.ag.a(360);
            }

            if (this.dL().a(bV, this) != null) {
               this.w(false);
               if (!$$2) {
                  this.dL().a(null, 1025, $$0, 0);
               }
            }
         } else {
            this.w(false);
            if (!$$2) {
               this.dL().a(null, 1025, $$0, 0);
            }
         }
      } else {
         if (this.bW != null && (!this.dL().u(this.bW) || this.bW.v() <= this.dL().J_())) {
            this.bW = null;
         }

         if (this.bW == null || this.ag.a(30) == 0 || this.bW.a(this.dj(), 2.0)) {
            this.bW = hx.a(
               this.dq() + (double)this.ag.a(7) - (double)this.ag.a(7),
               this.ds() + (double)this.ag.a(6) - 2.0,
               this.dw() + (double)this.ag.a(7) - (double)this.ag.a(7)
            );
         }

         double $$3 = (double)this.bW.u() + 0.5 - this.dq();
         double $$4 = (double)this.bW.v() + 0.1 - this.ds();
         double $$5 = (double)this.bW.w() + 0.5 - this.dw();
         emc $$6 = this.do();
         emc $$7 = $$6.b((Math.signum($$3) * 0.5 - $$6.c) * 0.1F, (Math.signum($$4) * 0.7F - $$6.d) * 0.1F, (Math.signum($$5) * 0.5 - $$6.e) * 0.1F);
         this.g($$7);
         float $$8 = (float)(aup.d($$7.e, $$7.c) * 180.0F / (float)Math.PI) - 90.0F;
         float $$9 = aup.g($$8 - this.dB());
         this.bm = 0.5F;
         this.r(this.dB() + $$9);
         if (this.ag.a(100) == 0 && this.dL().a_($$1).g(this.dL(), $$1)) {
            this.w(true);
         }
      }
   }

   @Override
   protected blw.b aW() {
      return blw.b.c;
   }

   @Override
   protected void a(double $$0, boolean $$1, djp $$2, hx $$3) {
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dL().B && this.w()) {
            this.w(false);
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.an.b(bT, $$0.f("BatFlags"));
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("BatFlags", this.an.b(bT));
   }

   public static boolean b(bmc<bxx> $$0, cty $$1, bms $$2, hx $$3, auw $$4) {
      if ($$3.v() >= $$1.A_()) {
         return false;
      } else {
         int $$5 = $$1.A($$3);
         int $$6 = 4;
         if (A()) {
            $$6 = 7;
         } else if ($$4.h()) {
            return false;
         }

         return $$5 > $$4.a($$6) ? false : a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private static boolean A() {
      LocalDate $$0 = LocalDate.now();
      int $$1 = $$0.get(ChronoField.DAY_OF_MONTH);
      int $$2 = $$0.get(ChronoField.MONTH_OF_YEAR);
      return $$2 == 10 && $$1 >= 20 || $$2 == 11 && $$1 <= 3;
   }

   private void gb() {
      if (this.w()) {
         this.d.a();
         this.e.b(this.ah);
      } else {
         this.e.a();
         this.d.b(this.ah);
      }
   }
}
