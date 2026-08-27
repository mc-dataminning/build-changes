import javax.annotation.Nullable;
import org.joml.Vector3f;

public class buy extends buk {
   public static final double bT = 0.6;
   public static final double bU = 0.8;
   public static final double bW = 1.33;
   private static final cly bX = cly.a(cjb.ql, cjb.qm);
   private static final adz<Boolean> bY = aec.a(buy.class, aeb.k);
   @Nullable
   private buy.a<cbn> bZ;
   @Nullable
   private buy.b ca;

   public buy(bim<? extends buy> $$0, cpm $$1) {
      super($$0, $$1);
      this.q();
   }

   boolean t() {
      return this.an.b(bY);
   }

   private void w(boolean $$0) {
      this.an.b(bY, $$0);
      this.q();
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("Trusting", this.t());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.w($$0.q("Trusting"));
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bY, false);
   }

   @Override
   protected void w() {
      this.ca = new buy.b(this, 0.6, bX, true);
      this.bO.a(1, new bpo(this));
      this.bO.a(3, this.ca);
      this.bO.a(7, new bqa(this, 0.3F));
      this.bO.a(8, new bqk(this));
      this.bO.a(9, new bpg(this, 0.8));
      this.bO.a(10, new brh(this, 0.8, 1.0000001E-5F));
      this.bO.a(11, new bqc(this, cbn.class, 10.0F));
      this.bP.a(1, new brn<>(this, bup.class, false));
      this.bP.a(1, new brn<>(this, bvl.class, 10, false, false, bvl.bU));
   }

   @Override
   public void V() {
      if (this.E().b()) {
         double $$0 = this.E().c();
         if ($$0 == 0.6) {
            this.b(bjk.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bjk.a);
            this.g(true);
         } else {
            this.b(bjk.a);
            this.g(false);
         }
      } else {
         this.b(bjk.a);
         this.g(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.t() && this.ah > 2400;
   }

   public static bke.a p() {
      return bja.x().a(bkf.a, 10.0).a(bkf.d, 0.3F).a(bkf.f, 3.0);
   }

   @Nullable
   @Override
   protected aov r() {
      return aow.qG;
   }

   @Override
   public int L() {
      return 900;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.qF;
   }

   @Override
   protected aov h_() {
      return aow.qH;
   }

   private float fZ() {
      return (float)this.b(bkf.f);
   }

   @Override
   public boolean C(bii $$0) {
      return $$0.a(this.dL().b((biy)this), this.fZ());
   }

   @Override
   public bgq b(cbn $$0, bgp $$1) {
      ciy $$2 = $$0.b($$1);
      if ((this.ca == null || this.ca.i()) && !this.t() && this.m($$2) && $$0.f(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dK().B) {
            if (this.ag.a(3) == 0) {
               this.w(true);
               this.x(true);
               this.dK().a(this, (byte)41);
            } else {
               this.x(false);
               this.dK().a(this, (byte)40);
            }
         }

         return bgq.a(this.dK().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 41) {
         this.x(true);
      } else if ($$0 == 40) {
         this.x(false);
      } else {
         super.b($$0);
      }
   }

   private void x(boolean $$0) {
      it $$1 = iv.M;
      if (!$$0) {
         $$1 = iv.Z;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         double $$5 = this.ag.k() * 0.02;
         this.dK().a($$1, this.d(1.0), this.ds() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void q() {
      if (this.bZ == null) {
         this.bZ = new buy.a<>(this, cbn.class, 16.0F, 0.8, 1.33);
      }

      this.bO.a(this.bZ);
      if (!this.t()) {
         this.bO.a(4, this.bZ);
      }
   }

   @Nullable
   public buy b(akk $$0, bid $$1) {
      return bim.aq.a((cpm)$$0);
   }

   @Override
   public boolean m(ciy $$0) {
      return bX.a($$0);
   }

   public static boolean c(bim<buy> $$0, cpn $$1, bjc $$2, gu $$3, aru $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(cpp $$0) {
      if ($$0.f(this) && !$$0.d(this.cG())) {
         gu $$1 = this.dk();
         if ($$1.v() < $$0.t_()) {
            return false;
         }

         dfa $$2 = $$0.a_($$1.d());
         if ($$2.a(csn.i) || $$2.a(apl.O)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bjs a(cqb $$0, bgo $$1, bjc $$2, @Nullable bjs $$3, @Nullable qr $$4) {
      if ($$3 == null) {
         $$3 = new bid.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public ehe cI() {
      return new ehe(0.0, (double)(0.5F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Override
   public boolean bS() {
      return this.bW() || super.bS();
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   static class a<T extends biy> extends bpb<T> {
      private final buy i;

      public a(buy $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bil.e::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.i.t() && super.a();
      }

      @Override
      public boolean b() {
         return !this.i.t() && super.b();
      }
   }

   static class b extends brc {
      private final buy c;

      public b(buy $$0, double $$1, cly $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.t();
      }
   }
}
