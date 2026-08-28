import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cic extends cho {
   public static final double bZ = 0.6;
   public static final double ca = 0.8;
   public static final double cb = 1.33;
   private static final aks<Boolean> cd = akw.a(cic.class, aku.k);
   @Nullable
   private cic.a<cpo> ce;
   @Nullable
   private cic.b cf;

   public cic(bvi<? extends cic> $$0, dgz $$1) {
      super($$0, $$1);
      this.t();
   }

   boolean x() {
      return this.al.a(cd);
   }

   private void x(boolean $$0) {
      this.al.a(cd, $$0);
      this.t();
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("Trusting", this.x());
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.x($$0.q("Trusting"));
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(cd, false);
   }

   @Override
   protected void B() {
      this.cf = new cic.b(this, 0.6, $$0 -> $$0.a(axt.au), true);
      this.bT.a(1, new ccp(this));
      this.bT.a(3, this.cf);
      this.bT.a(7, new cdb(this, 0.3F));
      this.bT.a(8, new cdl(this));
      this.bT.a(9, new cch(this, 0.8));
      this.bT.a(10, new cei(this, 0.8, 1.0000001E-5F));
      this.bT.a(11, new cdd(this, cpo.class, 10.0F));
      this.bU.a(1, new ceo<>(this, cht.class, false));
      this.bU.a(1, new ceo<>(this, cip.class, 10, false, false, cip.bZ));
   }

   @Override
   public void a(arx $$0) {
      if (this.I().b()) {
         double $$1 = this.I().c();
         if ($$1 == 0.6) {
            this.b(bwj.f);
            this.h(false);
         } else if ($$1 == 1.33) {
            this.b(bwj.a);
            this.h(true);
         } else {
            this.b(bwj.a);
            this.h(false);
         }
      } else {
         this.b(bwj.a);
         this.h(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.x() && this.af > 2400;
   }

   public static bxe.a p() {
      return cho.gt().a(bxf.s, 10.0).a(bxf.v, 0.3F).a(bxf.c, 3.0);
   }

   @Nullable
   @Override
   protected awu u() {
      return awv.sN;
   }

   @Override
   public int Q() {
      return 900;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.sM;
   }

   @Override
   protected awu o_() {
      return awv.sO;
   }

   @Override
   public bta b(cpo $$0, bsz $$1) {
      cxg $$2 = $$0.b($$1);
      if ((this.cf == null || this.cf.i()) && !this.x() && this.j($$2) && $$0.g(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dW().C) {
            if (this.ae.a(3) == 0) {
               this.x(true);
               this.y(true);
               this.dW().a(this, (byte)41);
            } else {
               this.y(false);
               this.dW().a(this, (byte)40);
            }
         }

         return bta.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 41) {
         this.y(true);
      } else if ($$0 == 40) {
         this.y(false);
      } else {
         super.b($$0);
      }
   }

   private void y(boolean $$0) {
      lq $$1 = ls.R;
      if (!$$0) {
         $$1 = ls.ag;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ae.k() * 0.02;
         double $$4 = this.ae.k() * 0.02;
         double $$5 = this.ae.k() * 0.02;
         this.dW().a($$1, this.d(1.0), this.dE() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void t() {
      if (this.ce == null) {
         this.ce = new cic.a<>(this, cpo.class, 16.0F, 0.8, 1.33);
      }

      this.bT.a(this.ce);
      if (!this.x()) {
         this.bT.a(4, this.ce);
      }
   }

   @Nullable
   public cic b(arx $$0, bus $$1) {
      return bvi.aJ.a($$0, bvh.e);
   }

   @Override
   public boolean j(cxg $$0) {
      return $$0.a(axt.au);
   }

   public static boolean c(bvi<cic> $$0, dha $$1, bvh $$2, jh $$3, bac $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(dhc $$0) {
      if ($$0.f(this) && !$$0.d(this.cR())) {
         jh $$1 = this.dw();
         if ($$1.v() < $$0.P()) {
            return false;
         }

         dxo $$2 = $$0.a_($$1.e());
         if ($$2.a(dkf.i) || $$2.a(axk.Q)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      if ($$3 == null) {
         $$3 = new bus.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public fbr cT() {
      return new fbr(0.0, (double)(0.5F * this.cS()), (double)(this.dr() * 0.4F));
   }

   @Override
   public boolean ce() {
      return this.ci() || super.ce();
   }

   static class a<T extends bvx> extends ccc<T> {
      private final cic i;

      public a(cic $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bvg.e::test);
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

   static class b extends ced {
      private final cic c;

      public b(cic $$0, double $$1, Predicate<cxg> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.x();
      }
   }
}
