import java.util.EnumSet;
import javax.annotation.Nullable;

public class cje extends ckj implements cju {
   public static final float b = 0.03F;
   boolean cd;
   protected final ccp c;
   protected final ccm d;

   public cje(bsm<? extends cje> $$0, dcf $$1) {
      super($$0, $$1);
      this.bR = new cje.d(this);
      this.a(eoy.j, 0.0F);
      this.c = new ccp(this, $$1);
      this.d = new ccm(this, $$1);
   }

   public static bui.a s() {
      return ckj.gs().a(buj.B, 1.0);
   }

   @Override
   protected void u() {
      this.bU.a(1, new cje.c(this, 1.0));
      this.bU.a(2, new cje.f(this, 1.0, 40, 10.0F));
      this.bU.a(2, new cje.a(this, 1.0, false));
      this.bU.a(5, new cje.b(this, 1.0));
      this.bU.a(6, new cje.e(this, 1.0, this.dQ().z_()));
      this.bU.a(7, new caw(this, 1.0));
      this.bV.a(1, new cbr(this, cje.class).a(ckl.class));
      this.bV.a(2, new cbs<>(this, cmk.class, 10, true, false, this::j));
      this.bV.a(3, new cbs<>(this, cls.class, false));
      this.bV.a(3, new cbs<>(this, cfd.class, true));
      this.bV.a(3, new cbs<>(this, cgd.class, true, false));
      this.bV.a(5, new cbs<>(this, cfs.class, 10, true, false, cfs.ca));
   }

   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.a(bsn.b).e() && $$0.E_().i() < 0.03F) {
         this.a(bsn.b, new cuc(cuf.vU));
         this.f(bsn.b);
      }

      return $$3;
   }

   public static boolean a(bsm<cje> $$0, dcu $$1, btf $$2, ja $$3, ayo $$4) {
      if (!$$1.b_($$3.d()).a(awc.a) && !btf.a($$2)) {
         return false;
      } else {
         jj<ddf> $$5 = $$1.t($$3);
         boolean $$6 = $$1.al() != bqd.a && (btf.b($$2) || a($$1, $$3, $$4)) && (btf.a($$2) || $$1.b_($$3).a(awc.a));
         if ($$6 && btf.a($$2)) {
            return true;
         } else {
            return $$5.a(avv.ap) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         }
      }
   }

   private static boolean a(dcg $$0, ja $$1) {
      return $$1.v() < $$0.z_() - 5;
   }

   @Override
   protected boolean y() {
      return false;
   }

   @Override
   protected avg v() {
      return this.bf() ? avh.hE : avh.hD;
   }

   @Override
   protected avg d(bqz $$0) {
      return this.bf() ? avh.hI : avh.hH;
   }

   @Override
   protected avg o_() {
      return this.bf() ? avh.hG : avh.hF;
   }

   @Override
   protected avg go() {
      return avh.hK;
   }

   @Override
   protected avg aQ() {
      return avh.hL;
   }

   @Override
   protected cuc gp() {
      return cuc.l;
   }

   @Override
   protected void a(ayo $$0, bqe $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bsn.a, new cuc(cuf.vS));
         } else {
            this.a(bsn.a, new cuc(cuf.qV));
         }
      }
   }

   @Override
   protected boolean b(cuc $$0, cuc $$1) {
      if ($$1.a(cuf.vU)) {
         return false;
      } else if ($$1.a(cuf.vS)) {
         return $$0.a(cuf.vS) ? $$0.n() < $$1.n() : false;
      } else {
         return $$0.a(cuf.vS) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gq() {
      return false;
   }

   @Override
   public boolean a(dci $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable btb $$0) {
      return $$0 != null ? !this.dQ().R() || $$0.bf() : false;
   }

   @Override
   public boolean cD() {
      return !this.cd();
   }

   boolean gy() {
      if (this.cd) {
         return true;
      } else {
         btb $$0 = this.p();
         return $$0 != null && $$0.bf();
      }
   }

   @Override
   public void a(ewf $$0) {
      if (this.db() && this.bf() && this.gy()) {
         this.a(0.01F, $$0);
         this.a(btg.a, this.dt());
         this.i(this.dt().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   public void bl() {
      if (!this.dQ().B) {
         if (this.dc() && this.bf() && this.gy()) {
            this.bT = this.c;
            this.i(true);
         } else {
            this.bT = this.d;
            this.i(false);
         }
      }
   }

   @Override
   public boolean ce() {
      return this.cd();
   }

   protected boolean gr() {
      eov $$0 = this.K().j();
      if ($$0 != null) {
         ja $$1 = $$0.l();
         if ($$1 != null) {
            double $$2 = this.i((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            if ($$2 < 4.0) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void a(btb $$0, float $$1) {
      cnp $$2 = new cnp(this.dQ(), this, new cuc(cuf.vS));
      double $$3 = $$0.dv() - this.dv();
      double $$4 = $$0.e(0.3333333333333333) - $$2.dx();
      double $$5 = $$0.dB() - this.dB();
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      $$2.c($$3, $$4 + $$6 * 0.2F, $$5, 1.6F, (float)(14 - this.dQ().al().a() * 4));
      this.a(avh.hJ, 1.0F, 1.0F / (this.dT().i() * 0.4F + 0.8F));
      this.dQ().b($$2);
   }

   public void w(boolean $$0) {
      this.cd = $$0;
   }

   static class a extends cbo {
      private final cje b;

      public a(cje $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b.j(this.b.p());
      }

      @Override
      public boolean b() {
         return super.b() && this.b.j(this.b.p());
      }
   }

   static class b extends cam {
      private final cje g;

      public b(cje $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.g.dQ().R() && this.g.bf() && this.g.dx() >= (double)(this.g.dQ().z_() - 3);
      }

      @Override
      public boolean b() {
         return super.b();
      }

      @Override
      protected boolean a(dci $$0, ja $$1) {
         ja $$2 = $$1.c();
         return $$0.u($$2) && $$0.u($$2.c()) ? $$0.a_($$1).a($$0, $$1, this.g) : false;
      }

      @Override
      public void c() {
         this.g.w(false);
         this.g.bT = this.g.d;
         super.c();
      }

      @Override
      public void d() {
         super.d();
      }
   }

   static class c extends bzz {
      private final btk a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final dcf f;

      public c(btk $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dQ();
         this.a(EnumSet.of(bzz.a.a));
      }

      @Override
      public boolean a() {
         if (!this.f.R()) {
            return false;
         } else if (this.a.bf()) {
            return false;
         } else {
            ewf $$0 = this.h();
            if ($$0 == null) {
               return false;
            } else {
               this.b = $$0.c;
               this.c = $$0.d;
               this.d = $$0.e;
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return !this.a.K().l();
      }

      @Override
      public void c() {
         this.a.K().a(this.b, this.c, this.d, this.e);
      }

      @Nullable
      private ewf h() {
         ayo $$0 = this.a.dT();
         ja $$1 = this.a.dq();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            ja $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dfj.G)) {
               return ewf.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends bzc {
      private final cje l;

      public d(cje $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         btb $$0 = this.l.p();
         if (this.l.gy() && this.l.bf()) {
            if ($$0 != null && $$0.dx() > this.l.dx() || this.l.cd) {
               this.l.i(this.l.dt().b(0.0, 0.002, 0.0));
            }

            if (this.k != bzc.a.b || this.l.K().l()) {
               this.l.z(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dv();
            double $$2 = this.f - this.l.dx();
            double $$3 = this.g - this.l.dB();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(ayg.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.s(this.a(this.l.dG(), $$5, 90.0F));
            this.l.aY = this.l.dG();
            float $$6 = (float)(this.h * this.l.g(buj.v));
            float $$7 = ayg.i(0.125F, this.l.fk(), $$6);
            this.l.z($$7);
            this.l.i(this.l.dt().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aF()) {
               this.l.i(this.l.dt().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends bzz {
      private final cje a;
      private final double b;
      private final int c;
      private boolean d;

      public e(cje $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean a() {
         return !this.a.dQ().R() && this.a.bf() && this.a.dx() < (double)(this.c - 2);
      }

      @Override
      public boolean b() {
         return this.a() && !this.d;
      }

      @Override
      public void e() {
         if (this.a.dx() < (double)(this.c - 1) && (this.a.K().l() || this.a.gr())) {
            ewf $$0 = cdw.a(this.a, 4, 8, new ewf(this.a.dv(), (double)(this.c - 1), this.a.dB()), (float) (Math.PI / 2));
            if ($$0 == null) {
               this.d = true;
               return;
            }

            this.a.K().a($$0.c, $$0.d, $$0.e, this.b);
         }
      }

      @Override
      public void c() {
         this.a.w(true);
         this.d = false;
      }

      @Override
      public void d() {
         this.a.w(false);
      }
   }

   static class f extends cay {
      private final cje a;

      public f(cju $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (cje)$$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.a.eU().a(cuf.vS);
      }

      @Override
      public void c() {
         super.c();
         this.a.v(true);
         this.a.c(bqf.a);
      }

      @Override
      public void d() {
         super.d();
         this.a.fy();
         this.a.v(false);
      }
   }
}
