import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public class brg extends brf {
   public static final float b = 74.48451F;
   public static final int c = apa.f(2.4166098F);
   private static final aby<Byte> d = acb.a(brg.class, aca.a);
   private static final int e = 1;
   private static final bqm bS = bqm.b().a(4.0);
   @Nullable
   private gu bT;

   public brg(bfn<? extends brg> $$0, cmm $$1) {
      super($$0, $$1);
      if (!$$1.B) {
         this.w(true);
      }
   }

   @Override
   public boolean aP() {
      return !this.r() && this.ag % c == 0;
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(d, (byte)0);
   }

   @Override
   protected float eR() {
      return 0.1F;
   }

   @Override
   public float eS() {
      return super.eS() * 0.95F;
   }

   @Nullable
   @Override
   public amg s() {
      return this.r() && this.af.a(4) != 0 ? null : amh.bq;
   }

   @Override
   protected amg d(ben $$0) {
      return amh.bs;
   }

   @Override
   protected amg g_() {
      return amh.br;
   }

   @Override
   public boolean bp() {
      return false;
   }

   @Override
   protected void A(bfj $$0) {
   }

   @Override
   protected void fd() {
   }

   public static bhf.a q() {
      return bgb.y().a(bhg.a, 6.0);
   }

   public boolean r() {
      return (this.am.b(d) & 1) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.am.b(d);
      if ($$0) {
         this.am.b(d, (byte)($$1 | 1));
      } else {
         this.am.b(d, (byte)($$1 & -2));
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.r()) {
         this.f(eei.b);
         this.p(this.dn(), (double)apa.a(this.dp()) + 1.0 - (double)this.de(), this.dt());
      } else {
         this.f(this.dl().d(1.0, 0.6, 1.0));
      }
   }

   @Override
   protected void W() {
      super.W();
      gu $$0 = this.di();
      gu $$1 = $$0.c();
      if (this.r()) {
         boolean $$2 = this.aQ();
         if (this.dI().a_($$1).g(this.dI(), $$0)) {
            if (this.af.a(200) == 0) {
               this.aX = (float)this.af.a(360);
            }

            if (this.dI().a(bS, this) != null) {
               this.w(false);
               if (!$$2) {
                  this.dI().a(null, 1025, $$0, 0);
               }
            }
         } else {
            this.w(false);
            if (!$$2) {
               this.dI().a(null, 1025, $$0, 0);
            }
         }
      } else {
         if (this.bT != null && (!this.dI().t(this.bT) || this.bT.v() <= this.dI().C_())) {
            this.bT = null;
         }

         if (this.bT == null || this.af.a(30) == 0 || this.bT.a(this.dg(), 2.0)) {
            this.bT = gu.a(
               this.dn() + (double)this.af.a(7) - (double)this.af.a(7),
               this.dp() + (double)this.af.a(6) - 2.0,
               this.dt() + (double)this.af.a(7) - (double)this.af.a(7)
            );
         }

         double $$3 = (double)this.bT.u() + 0.5 - this.dn();
         double $$4 = (double)this.bT.v() + 0.1 - this.dp();
         double $$5 = (double)this.bT.w() + 0.5 - this.dt();
         eei $$6 = this.dl();
         eei $$7 = $$6.b((Math.signum($$3) * 0.5 - $$6.c) * 0.1F, (Math.signum($$4) * 0.7F - $$6.d) * 0.1F, (Math.signum($$5) * 0.5 - $$6.e) * 0.1F);
         this.f($$7);
         float $$8 = (float)(apa.d($$7.e, $$7.c) * 180.0F / (float)Math.PI) - 90.0F;
         float $$9 = apa.g($$8 - this.dy());
         this.bn = 0.5F;
         this.a_(this.dy() + $$9);
         if (this.af.a(100) == 0 && this.dI().a_($$1).g(this.dI(), $$1)) {
            this.w(true);
         }
      }
   }

   @Override
   protected bfj.b aS() {
      return bfj.b.c;
   }

   @Override
   protected void a(double $$0, boolean $$1, dcb $$2, gu $$3) {
   }

   @Override
   public boolean c_() {
      return true;
   }

   @Override
   public boolean a(ben $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dI().B && this.r()) {
            this.w(false);
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.am.b(d, $$0.f("BatFlags"));
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("BatFlags", this.am.b(d));
   }

   public static boolean b(bfn<brg> $$0, cmn $$1, bgd $$2, gu $$3, apf $$4) {
      if ($$3.v() >= $$1.t_()) {
         return false;
      } else {
         int $$5 = $$1.z($$3);
         int $$6 = 4;
         if (w()) {
            $$6 = 7;
         } else if ($$4.h()) {
            return false;
         }

         return $$5 > $$4.a($$6) ? false : a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private static boolean w() {
      LocalDate $$0 = LocalDate.now();
      int $$1 = $$0.get(ChronoField.DAY_OF_MONTH);
      int $$2 = $$0.get(ChronoField.MONTH_OF_YEAR);
      return $$2 == 10 && $$1 >= 20 || $$2 == 11 && $$1 <= 3;
   }

   @Override
   protected float b(bgl $$0, bfk $$1) {
      return $$1.b / 2.0F;
   }
}
