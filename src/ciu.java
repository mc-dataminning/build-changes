import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ciu extends cig {
   public static final double bE = 0.6;
   public static final double bF = 0.8;
   public static final double bG = 1.33;
   private static final akg<Boolean> bI = akk.a(ciu.class, aki.k);
   @Nullable
   private ciu.a<cqi> bJ;
   @Nullable
   private ciu.b bK;

   public ciu(bwb<? extends ciu> $$0, dhp $$1) {
      super($$0, $$1);
      this.t();
   }

   boolean x() {
      return this.al.a(bI);
   }

   private void w(boolean $$0) {
      this.al.a(bI, $$0);
      this.t();
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("Trusting", this.x());
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.w($$0.q("Trusting"));
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bI, false);
   }

   @Override
   protected void D() {
      this.bK = new ciu.b(this, 0.6, $$0 -> $$0.a(axi.as), true);
      this.bB.a(1, new cdh(this));
      this.bB.a(3, this.bK);
      this.bB.a(7, new cdt(this, 0.3F));
      this.bB.a(8, new ced(this));
      this.bB.a(9, new ccz(this, 0.8));
      this.bB.a(10, new cfa(this, 0.8, 1.0000001E-5F));
      this.bB.a(11, new cdv(this, cqi.class, 10.0F));
      this.bC.a(1, new cfg<>(this, cil.class, false));
      this.bC.a(1, new cfg<>(this, cjk.class, 10, false, false, cjk.bE));
   }

   @Override
   public void a(arn $$0) {
      if (this.L().b()) {
         double $$1 = this.L().c();
         if ($$1 == 0.6) {
            this.b(bxd.f);
            this.h(false);
         } else if ($$1 == 1.33) {
            this.b(bxd.a);
            this.h(true);
         } else {
            this.b(bxd.a);
            this.h(false);
         }
      } else {
         this.b(bxd.a);
         this.h(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.x() && this.af > 2400;
   }

   public static bxw.a q() {
      return cig.gv().a(bxx.s, 10.0).a(bxx.v, 0.3F).a(bxx.c, 3.0);
   }

   @Nullable
   @Override
   protected awj u() {
      return awk.sX;
   }

   @Override
   public int S() {
      return 900;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.sW;
   }

   @Override
   protected awj l_() {
      return awk.sY;
   }

   @Override
   public btq b(cqi $$0, btp $$1) {
      cxy $$2 = $$0.b($$1);
      if ((this.bK == null || this.bK.i()) && !this.x() && this.k($$2) && $$0.g(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dV().C) {
            if (this.ae.a(3) == 0) {
               this.w(true);
               this.x(true);
               this.dV().a(this, (byte)41);
            } else {
               this.x(false);
               this.dV().a(this, (byte)40);
            }
         }

         return btq.a;
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
      lt $$1 = lv.S;
      if (!$$0) {
         $$1 = lv.ah;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ae.k() * 0.02;
         double $$4 = this.ae.k() * 0.02;
         double $$5 = this.ae.k() * 0.02;
         this.dV().a($$1, this.d(1.0), this.dD() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void t() {
      if (this.bJ == null) {
         this.bJ = new ciu.a<>(this, cqi.class, 16.0F, 0.8, 1.33);
      }

      this.bB.a(this.bJ);
      if (!this.x()) {
         this.bB.a(4, this.bJ);
      }
   }

   @Nullable
   public ciu b(arn $$0, bvi $$1) {
      return bwb.aI.a($$0, bwa.e);
   }

   @Override
   public boolean k(cxy $$0) {
      return $$0.a(axi.as);
   }

   public static boolean c(bwb<ciu> $$0, dhq $$1, bwa $$2, jj $$3, azs $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(dhs $$0) {
      if ($$0.f(this) && !$$0.d(this.cR())) {
         jj $$1 = this.dv();
         if ($$1.v() < $$0.P()) {
            return false;
         }

         dym $$2 = $$0.a_($$1.e());
         if ($$2.a(dkw.i) || $$2.a(awz.Q)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      if ($$3 == null) {
         $$3 = new bvi.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public fcu cT() {
      return new fcu(0.0, (double)(0.5F * this.cS()), (double)(this.dq() * 0.4F));
   }

   @Override
   public boolean ce() {
      return this.ci() || super.ce();
   }

   static class a<T extends bwr> extends ccu<T> {
      private final ciu i;

      public a(ciu $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bvz.e::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.i.x() && super.b();
      }

      @Override
      public boolean c() {
         return !this.i.x() && super.c();
      }
   }

   static class b extends cev {
      private final ciu c;

      public b(ciu $$0, double $$1, Predicate<cxy> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.x();
      }
   }
}
